/***
 *   Copyright (c) 1995-2009 Cycorp Inc.
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *   
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 *  Substantial portions of this code were developed by the Cyc project
 *  and by Cycorp Inc, whose contribution is gratefully acknowledged.
*/

package com.cyc.cycjava_1.cycl;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.constant_handles;

public  final class meta_macros extends SubLTranslatedFile {

  //// Constructor

  private meta_macros() {}
  public static final SubLFile me = new meta_macros();
  public static final String myName = "com.cyc.cycjava_1.cycl.meta_macros";

  //// Definitions

  /** Declare that forms with OPERATOR should be indented as if PATTERN were its pattern. */
  @SubL(source = "cycl/meta-macros.lisp", position = 1459) 
  public static final SubLObject declare_indention_pattern(SubLObject operator, SubLObject pattern) {
    checkType(operator, $sym4$SYMBOLP);
    checkType(pattern, $sym5$LISTP);
    return NIL;
  }

  public static final SubLObject declare_meta_macros_file() {
    declareMacro("with_temp_vars", "WITH-TEMP-VARS");
    declareFunction("make_temp_var", "MAKE-TEMP-VAR", 1, 0, false);
    declareFunction("declare_indention_pattern", "DECLARE-INDENTION-PATTERN", 2, 0, false);
    return NIL;
  }

  public static final SubLObject init_meta_macros_file() {
    return NIL;
  }

  public static final SubLObject setup_meta_macros_file() {
        return NIL;
  }

  //// Internal Constants

  public static final SubLList $list0 = list(makeSymbol("VARS"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym1$QUOTE = makeSymbol("QUOTE");
  public static final SubLSymbol $sym2$CLET = makeSymbol("CLET");
  public static final SubLString $str3$TEMP = makeString("TEMP");
  public static final SubLSymbol $sym4$SYMBOLP = makeSymbol("SYMBOLP");
  public static final SubLSymbol $sym5$LISTP = makeSymbol("LISTP");

  //// Initializers

  public void declareFunctions() {
    declare_meta_macros_file();
  }

  public void initializeVariables() {
    init_meta_macros_file();
  }

  public void runTopLevelForms() {
    setup_meta_macros_file();
  }

}
