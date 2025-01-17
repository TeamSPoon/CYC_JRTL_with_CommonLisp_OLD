/* For LarKC */
package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import static org.logicmoo.system.Startup.addSubLFile;

import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

import org.armedbear.lisp.ABCLStatic;
import org.armedbear.lisp.Keyword;
import org.armedbear.lisp.Lisp;
import org.armedbear.lisp.LispObject;
import org.armedbear.lisp.Main;
import org.logicmoo.system.JVMImpl;
import org.logicmoo.system.Startup;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLEnvironment;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.SubLException;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLOperator;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLDigestInputTextStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLInputTextStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLStreamFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.format;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.util.IsolatedClassLoader;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLPatcher;

public class Eval extends ABCLStatic implements SubLFile {

	public static SubLObject constantp(SubLObject object, SubLObject env) {
		if (object.isSymbol()) {
			SubLSymbol symbol = object.toSymbol();
			if (symbol.isConstantSymbol())
				return CommonSymbols.T;
			return SubLNil.NIL;
		} else {
			if (!object.isCons())
				return CommonSymbols.T;
			return SubLNil.NIL;
		}
	}

	public static SubLObject eval(final String str) {
		if (!SubLThread.currentThreadIsSubL()) { //
			return callInSubLProcess(new RetSubLObject() {
				@Override
				public SubLObject callForSubLObject() {
					return evalInCurrentThread(str);
				}
			});
		}
		return evalInCurrentThread(str);
	}

	public static interface RetSubLObject {
		public SubLObject callForSubLObject();
	}

	private static SubLObject callInSubLProcess(RetSubLObject callit) {
		final RetSubLObject callit0 = callit;
		final ArrayList<SubLObject> result = new ArrayList<SubLObject>(1);
		final ArrayList<SubLException> resultException = new ArrayList<SubLException>(1);
		final CountDownLatch cdl = new CountDownLatch(1);
		SubLObjectFactory.makeProcess(SubLObjectFactory.makeString("Eval Process"), new Runnable() {
			@Override
			public void run() {
				Throwable ex = null;
				boolean isEmpty = true;
				try {
					synchronized (result) {
						result.add(callit0.callForSubLObject());
						isEmpty = false;
					}
				} catch (Throwable t) {
					ex = t;
				} finally {
					if (isEmpty)
						synchronized (resultException) {
							if (ex != null) {
								if (ex instanceof SubLException)
									resultException.add((SubLException) ex);
								else
									resultException.add(SubLObjectFactory.makeException(ex.getMessage(), ex));
							} else
								resultException.add(SubLObjectFactory.makeException("Internal error: unable to find expected exception."));
						}
					cdl.countDown();
				}
			}
		});
		try {
			cdl.await();
		} catch (InterruptedException ie) {
			SubLThread.currentThread().interrupt();
			return CommonSymbols.ERROR_KEYWORD;
		}
		synchronized (resultException) {
			if (!resultException.isEmpty()) {
				SubLException e = resultException.get(0);
				e.fillInStackTrace();
				throw e;
			}
		}
		synchronized (result) {
			if (result.isEmpty())
				throw new RuntimeException("Internal error: no result found from worker thread.");
			return result.get(0);
		}
	}

	public static SubLObject evalInCurrentThread(final String str) {
		final SubLObject from_string = reader.read_from_string(SubLObjectFactory.makeString(str), //
				CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED, //
				CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED);
		return eval(from_string);
	}

	public static SubLObject eval_as_sublisp(SubLObject form) {
		boolean wasSubLisp = Main.isSubLisp();
		try {
			Main.setSubLisp(true);
			return form.eval(SubLEnvironment.currentEnvironment());
		} catch (Throwable e) {
			throw JVMImpl.doThrow(e);
		} finally {
			Main.setSubLisp(wasSubLisp);

		}

	}

	public static SubLObject eval(SubLObject form) {
		boolean wasSubLisp = Main.isSubLisp();
		if (wasSubLisp)
			return form.eval(SubLEnvironment.currentEnvironment());
		return Lisp.eval((LispObject) form);
	}

	public static SubLObject function_information(SubLObject function, SubLObject environment) {
		return Errors.unimplementedMethod("function-information");
	}

	public static SubLObject get_initial_continuation() {
		return CommonSymbols.UNPROVIDED;
	}

	public static SubLObject initialize_subl_interface_file(SubLObject className) {
		String stringTyped = className.getStringValue();
		try {
			SubLFiles.initialize(stringTyped);
			return CommonSymbols.RET_NIL;
		} catch (Exception e) {
			return SubLNil.NIL;
		}
	}

	public static SubLObject load(final SubLObject filename) {
		return subl_preserve_pkg(true, true, () -> load_sublisp(filename));
	}

	public static SubLObject load_sublisp(SubLObject filename) {
		boolean success = false;
		SubLObject stream = SubLNil.NIL;
		SubLObject form;
		try {
			String theFilename = filename.getStringValue();
			SubLInputTextStream fileStream = (SubLInputTextStream) (stream = SubLStreamFactory.makeFileStream(theFilename, CommonSymbols.INPUT_KEYWORD, Keyword.TEXT_KEYWORD_CHARACTER, SubLNil.NIL, CommonSymbols.ERROR_KEYWORD, SubLNil.NIL).toInputTextStream());
			SubLDigestInputTextStream digestStream = null;
			int verbose = 1;
			try {
				digestStream = (SubLDigestInputTextStream) (stream = new SubLDigestInputTextStream(fileStream, MessageDigest.getInstance("SHA-1")));
			} catch (NoSuchAlgorithmException ex) {
				//verbose++;
			}
			System.out.println(";;; loading " + theFilename + " ... ");

			boolean done = false;
			SubLObject lastForm = SubLNil.NIL;
			SubLObject lastRetVal = SubLNil.NIL;
			SubLObject currentForm = SubLNil.NIL;
			int formCouunt = 0;
			while (!done) {
				Values.resetMultipleValues();
				SubLObject pos = streams_high.file_position(stream, CommonSymbols.UNPROVIDED);
				form = reader.read_ignoring_errors(digestStream, SubLNil.NIL, Eval.EOF_KEYWORD);

				formCouunt++;
				if (verbose > 0) {

					org.armedbear.lisp.Package p = SubLPackage.getCurrentPackage();
					String s = "null";
					if (p != null)
						s = p.getName();
					System.err.format(";;; %s(%d): %s%n", s, formCouunt, String.valueOf(form));
				}
				{
					SubLObject error = SubLProcess.nthMultipleValue(CommonSymbols.ONE_INTEGER);
					Values.resetMultipleValues();
					if (error == CommonSymbols.ERROR_KEYWORD) {
						if (form != Eval.EOF_KEYWORD) { //
							if (verbose >= 0) {
								System.err.println(";; lastForm=" + lastForm);
								System.err.println(";; lastRetVal=" + lastRetVal);
								System.err.println(";; currentForm=" + currentForm);
							}
							Errors.error(Eval.LOAD_ERROR_STRING_1, streams_high.file_position(stream, CommonSymbols.UNPROVIDED), //
									filename);
						}

						else
							success = true;
						done = true;
						break;
					}
				}

				try {
					currentForm = form;
					lastRetVal = eval(form);
					if (verbose > 0) {
						System.err.format(";;; Result(%d)  <==== %s%n", formCouunt, String.valueOf(lastRetVal));
					}
					lastForm = form;
				} catch (Exception xcpt) {
					SubLObject args = SubLObjectFactory.makeList(new SubLObject[] { form, filename, pos });
					SubLObject msg = format.really_format(SubLNil.NIL, Eval.EVAL_ERROR_STRING, args);
					Errors.error(msg.toStr(), xcpt);
				} catch (Throwable xcpt) {
					SubLObject args = SubLObjectFactory.makeList(new SubLObject[] { form, filename, pos });
					SubLObject msg = format.really_format(SubLNil.NIL, Eval.EVAL_ERROR_STRING, args);
					Errors.error(msg.toStr(), xcpt);
				}

			}
			System.out.print(";;; ... " + theFilename + " loaded");
			if (digestStream != null) {
				System.out.print("; SHA-1: ");
				String digest = digestStream.getDigest();
				System.out.print(digest);
			}
			System.out.println();
			System.out.flush();
		} finally {
			if (stream.isStream())
				streams_high.close(stream, CommonSymbols.UNPROVIDED);
		}
		if (success)
			return CommonSymbols.T;
		Errors.error(Eval.LOAD_ERROR_STRING_2, filename);
		return SubLNil.NIL;
	}

	public static SubLObject load_external_code(SubLObject path) {
		String stringTyped = path.getStringValue();
		try {
			Eval.isolatedClassLoader.addCode(null, stringTyped, true);
			return CommonSymbols.T;
		} catch (Exception e) {
			Errors.error("Error loading jar!class: " + stringTyped, e);
			return SubLNil.NIL;
		}
	}

	public static SubLObject loadSubLPatch(SubLObject jarOrClassFilePath, SubLObject patcherFileName) {
		if (patcherFileName == CommonSymbols.UNPROVIDED)
			Errors.unimplementedMethod("loadSubLPatch: Loading a patch without patcher file name.");
		load_external_code(jarOrClassFilePath);
		try {
			Class patcherClass = Class.forName(patcherFileName.getStringValue());
			SubLPatcher patcher = (SubLPatcher) patcherClass.getConstructor(new Class[0]).newInstance(new Object[0]);
			patcher.doPatch();
		} catch (Exception e) {
			Errors.error("Unable to load patch: jarOrClassFilePath" + e);
		}
		return SubLNil.NIL;
	}

	public static SubLObject macroexpand(SubLObject form, SubLObject env) {
		if (env == CommonSymbols.UNPROVIDED)
			env = SubLEnvironment.currentEnvironment();
		int i = -1;
		SubLObject expandedForm = form;
		SubLObject expanded_p = SubLNil.NIL;
		do {
			Values.resetMultipleValues();
			expandedForm = macroexpand_1(expandedForm, env);
			expanded_p = SubLProcess.nthMultipleValue(CommonSymbols.ONE_INTEGER);
			Values.resetMultipleValues();
			++i;
		} while (expanded_p != SubLNil.NIL);
		expanded_p = i == 0 ? SubLNil.NIL : CommonSymbols.T;
		Values.resetMultipleValues();
		return Values.values(expandedForm, expanded_p);
	}

	public static SubLObject macroexpand_1(SubLObject form, SubLObject env) {
		if (env == CommonSymbols.UNPROVIDED)
			env = SubLEnvironment.currentEnvironment();
		if (form.isCons()) {
			SubLObject operatorSymbol = form.first();
			if (operatorSymbol.isSymbol()) {
				SubLOperator operator = operatorSymbol.toSymbol().getFunction();
				if (operator.isMacroOperator()) {
					SubLFunction macroExpander = operator.toMacro().getMacroExpander();
					SubLObject expandedForm = macroExpander.apply(form.toCons(), env.toEnv());
					return Values.values(expandedForm, CommonSymbols.T);
				}
			}
		}
		return Values.values(form, SubLNil.NIL);
	}

	public static File openFileForReading(String filename) {
		File file = new File(filename);
		if (!file.exists())
			Errors.error("File doesn't exist: " + filename);
		if (file.isDirectory())
			Errors.error("Expected file but got directory: " + filename);
		if (!file.canRead())
			Errors.error("File is unreadable: " + filename);
		return file;
	}

	public static SubLObject patchSubLFile(SubLObject fullClassName) {
		initialize_subl_interface_file(fullClassName);
		return SubLNil.NIL;
	}

	public static SubLObject set_initial_continuation(SubLObject continuation) {
		return continuation;
	}

	public static SubLObject variable_information(SubLObject variable, SubLObject environment) {
		return Errors.unimplementedMethod("variable-information");
	}

	final public static SubLFile me;
	public static SubLSymbol $star$;
	public static SubLSymbol $star_star$;
	public static SubLSymbol $star_star_star$;
	public static SubLSymbol $evaluator_method$;
	final private static SubLSymbol EOF_KEYWORD;
	final private static SubLString LOAD_ERROR_STRING_1;
	final private static SubLString LOAD_ERROR_STRING_2;
	final private static SubLString EVAL_ERROR_STRING;
	final public static String FILE_DIGEST_ALGORITHM = "SHA-1";
	final public static IsolatedClassLoader isolatedClassLoader = IsolatedClassLoader.theIsolatedClassLoader;
	static {
		me = new Eval();
		EOF_KEYWORD = SubLObjectFactory.makeKeyword("EOF");
		LOAD_ERROR_STRING_1 = SubLObjectFactory.makeString("Read error occured at position ~S of file ~S");
		LOAD_ERROR_STRING_2 = SubLObjectFactory.makeString("Could not load file ~S.");
		EVAL_ERROR_STRING = SubLObjectFactory.makeString("Could not evaluate form~%  ~S~%after ~A:~A");
	}

	@Override
	public void declareFunctions() {
		SubLFiles.declareFunction(Eval.me, "constantp", "CONSTANTP", 1, 1, false);
		SubLFiles.declareFunction(Eval.me, "eval", "EVAL", 1, 0, false);
		SubLFiles.declareFunction(Eval.me, "macroexpand_1", "MACROEXPAND-1", 1, 1, false);
		SubLFiles.declareFunction(Eval.me, "load", "LOAD", 1, 0, false);
		SubLFiles.declareFunction(Eval.me, "function_information", "FUNCTION-INFORMATION", 1, 1, false);
		SubLFiles.declareFunction(Eval.me, "macroexpand", "MACROEXPAND", 1, 1, false);
		SubLFiles.declareFunction(Eval.me, "variable_information", "VARIABLE-INFORMATION", 1, 1, false);
		SubLFiles.declareFunction(Eval.me, "get_initial_continuation", "%GET-INITIAL-CONTINUATION", 0, 0, false);
		SubLFiles.declareFunction(Eval.me, "set_initial_continuation", "%SET-INITIAL-CONTINUATION", 1, 0, false);
		SubLFiles.declareFunction(Eval.me, "get_initial_continuation", "GET-INITIAL-CONTINUATION", 0, 0, false);
		SubLFiles.declareFunction(Eval.me, "set_initial_continuation", "SET-INITIAL-CONTINUATION", 1, 0, false);
		SubLFiles.declareFunction(Eval.me, "initialize_subl_interface_file", "INITIALIZE-SUBL-INTERFACE-FILE", 1, 0, false);
		SubLFiles.declareFunction(Eval.me, "load_external_code", "LOAD-EXTERNAL-CODE", 1, 0, false);
		SubLFiles.declareFunction(Eval.me, "patchSubLFile", "PATCH-SUBL-FILE", 1, 0, false);
		SubLFiles.declareFunction(Eval.me, "loadSubLPatch", "LOAD-SUBL-PATCH", 1, 1, false);
	}

	@Override
	public void initializeVariables() {
		Eval.$star$ = SubLFiles.defvar(Eval.me, "*", SubLNil.NIL);
		Eval.$star_star$ = SubLFiles.defvar(Eval.me, "**", SubLNil.NIL);
		Eval.$star_star_star$ = SubLFiles.defvar(Eval.me, "***", SubLNil.NIL);
		Eval.$evaluator_method$ = SubLFiles.defvar(Eval.me, "*%EVALUATOR-METHOD*", SubLNil.NIL);
	}

	@Override
	public void runTopLevelForms() {
	}

	public Eval() {
		addSubLFile(this);
	}
}
