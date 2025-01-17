/* For LarKC */
package com.cyc.tool.subl.jrtl.nativeCode.type.stream;

import java.io.File;
import java.io.FileDescriptor;

import org.armedbear.lisp.Keyword;
import org.armedbear.lisp.Symbol;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class SubLSynonymStream extends AbstractRandomAccessSubLStream {
	public SubLSynonymStream(SubLSymbol streamSymbol) {
		super(Keyword.TEXT_KEYWORD_CHARACTER, getDirection(streamSymbol), Keyword.ERROR_KEYWORD, Keyword.ERROR_KEYWORD);
		this.streamSymbol = (Symbol) streamSymbol;
	}

	/**
	 * @param streamSymbol
	 * @return
	 */
	public static SubLSymbol getDirection(SubLSymbol streamSymbol) {
		if (streamSymbol == null)
			return null;
		SubLObject o = streamSymbol.getValue();
		if (o == null)
			return null;
		SubLStream s = o.getStream(true);
		if (s == null) {
			return Keyword.UNDERFLOW;
		}
		SubLSymbol d = s.getDirection();
		return d.toSymbol();
	}

	private SubLSymbol streamSymbol;

	@Override
	public SubLSymbol getDirection() {
		return getStreamTrue().getDirection();
	}

	@Override
	public SubLSymbol getElementType() {
		final SubLStream stream = getStreamTrue();
		return stream.getElementType().toSymbol();
	}

	@Override
	public FileDescriptor getFD() {
		return getStreamTrue().getFD();
	}

	@Override
	public File getFile() {
		return getStreamTrue().getFile();
	}

	@Override
	public long getFilePointer() {
		return getStreamTrue().getFilePointer();
	}

	@Override
	public String getNewline() {
		return getStreamTrue().getNewline();
	}

	/**
	 * @return
	 */
	public SubLStream getStreamTrue() {
		return getStream(true).toLispObject();
	}

	@Override
	public SubLStream getStream(boolean followSynonymStream) {
		if (!followSynonymStream)
			return this;
		try {
			SubLStream result;
			for (result = streamSymbol.getValue().getStream(true); //
					result instanceof SubLSynonymStream; //
					result = ((SubLSynonymStream) result).getStreamSymbol().getValue().getStream(true)) {
			}
			return result;
		} catch (Exception e) {
			return this;
		}
	}

	@Override
	public SubLSymbol getStreamSymbol() {
		return streamSymbol;
	}

	@Override
	public SubLSymbol ifExists() {
		return getStreamTrue().ifExists();
	}

	@Override
	public SubLSymbol ifNotExists() {
		return getStreamTrue().ifNotExists();
	}

	@Override
	public boolean isInteractive() {
		return getStreamTrue().isInteractive();
	}

	@Override
	public boolean isRandomAccess() {
		return getStreamTrue().isRandomAccess();
	}

	/** throws exception if isRandomAccess() returns false */
	@Override
	public long file_length() {
		return getStreamTrue().file_length();
	}

	/** throws exception if isRandomAccess() returns false */
	@Override
	public void seek(long pos) {
		getStreamTrue().seek(pos);
	}

	@Override
	public void setIsInteractive(boolean newValue) {
		getStreamTrue().setIsInteractive(newValue);
	}

	/*
	 * public synchronized void close() { getStream(true).close(); }
	 *
	 * public boolean isClosed() { return getStream(true).isClosed(); }
	 */

	/** throws exception if isRandomAccess() returns false */
	@Override
	public void setLength(long newLength) {
		getStreamTrue().setLength(newLength);
	}

	@Override
	public void setNewline(String newline) {
		getStreamTrue().setNewline(newline);
	}

	/** Method created to avoid casting */
	@Override
	public SubLInputBinaryStream toInputBinaryStream() {
		return getStreamTrue().toInputBinaryStream();
	}

	/** Method created to avoid casting */
	@Override
	public SubLInputStream toInputStream() {
		return getStreamTrue().toInputStream();
	}

	/** Method created to avoid casting */
	@Override
	public SubLInputTextStream toInputTextStream() {
		return getStreamTrue().toInputTextStream();
	}

	/** Method created to avoid casting */
	@Override
	public SubLOutputBinaryStream toOutputBinaryStream() {
		return getStreamTrue().toOutputBinaryStream();
	}

	/** Method created to avoid casting */
	@Override
	public SubLOutputStream toOutputStream() {
		return getStreamTrue().toOutputStream();
	}

	@Override
	public SubLOutputTextStream toOutputTextStream() {
		return getStreamTrue().toOutputTextStream();
	}

	/* (non-Javadoc)
	 * @see com.cyc.tool.subl.jrtl.nativeCode.type.stream.AbstractRandomAccessSubLStream#print(char)
	 */
	@Override
	public void print(char c) {
		toOutputTextStream().write(c);
		// TODO Auto-generated method stub

	}

	@Override
	public int read() {
		return readWithTimeOut(streamTimeOut);
	}

	//@Override
	public int readChar() {
		return readCharWithTimeOut(streamTimeOut);
	}
}
