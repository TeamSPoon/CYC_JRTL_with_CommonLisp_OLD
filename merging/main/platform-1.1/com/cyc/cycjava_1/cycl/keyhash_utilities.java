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

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.hash_table_utilities;
//dm import com.cyc.cycjava_1.cycl.keyhash;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macros;

public  final class keyhash_utilities extends SubLTranslatedFile {

  //// Constructor

  private keyhash_utilities() {}
  public static final SubLFile me = new keyhash_utilities();
  public static final String myName = "com.cyc.cycjava_1.cycl.keyhash_utilities";

  //// Definitions

  @SubL(source = "cycl/keyhash-utilities.lisp", position = 759) 
  public static final SubLObject keyhash_element_list(SubLObject v_keyhash) {
    {
      SubLObject result = NIL;
      SubLObject vector_var = keyhash.do_keyhash_nodes(v_keyhash);
      SubLObject backwardP_var = NIL;
      SubLObject length = Sequences.length(vector_var);
      SubLObject v_iteration = NIL;
      for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
        {
          SubLObject element_num = ((NIL != backwardP_var) ? ((SubLObject) Numbers.subtract(length, v_iteration, ONE_INTEGER)) : v_iteration);
          SubLObject key = Vectors.aref(vector_var, element_num);
          if ((NIL != keyhash.do_keyhash_valid_key_p(key))) {
            result = cons(key, result);
          }
        }
      }
      return Sequences.nreverse(result);
    }
  }

  /** Convert the list representation into a keyhash
   representation by hashing all the values into the table.
   @return keyhash */
  @SubL(source = "cycl/keyhash-utilities.lisp", position = 957) 
  public static final SubLObject keyhash_list_elements(SubLObject list, SubLObject testfn, SubLObject size) {
    if ((testfn == UNPROVIDED)) {
      testfn = NIL;
    }
    if ((size == UNPROVIDED)) {
      size = Sequences.length(list);
    }
    {
      SubLObject v_keyhash = keyhash.new_keyhash(size, testfn);
      SubLObject cdolist_list_var = list;
      SubLObject elem = NIL;
      for (elem = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), elem = cdolist_list_var.first()) {
        keyhash.setkeyhash(elem, v_keyhash);
      }
      return v_keyhash;
    }
  }

  /** Like rehash for keyhashes */
  @SubL(source = "cycl/keyhash-utilities.lisp", position = 1294) 
  public static final SubLObject keyhash_rebuild(SubLObject v_keyhash) {
    {
      SubLObject element_list = keyhash_element_list(v_keyhash);
      keyhash.clrkeyhash(v_keyhash);
      {
        SubLObject cdolist_list_var = element_list;
        SubLObject elem = NIL;
        for (elem = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), elem = cdolist_list_var.first()) {
          keyhash.setkeyhash(elem, v_keyhash);
        }
      }
    }
    return v_keyhash;
  }

  @SubL(source = "cycl/keyhash-utilities.lisp", position = 1531) 
  private static SubLSymbol $intersection_table$ = null;

  /** controls thread access to the hash-intersection keyhash */
  @SubL(source = "cycl/keyhash-utilities.lisp", position = 1666) 
  private static SubLSymbol $intersection_table_lock$ = null;

  /** @note this implementation sometimes uses #'equal even when something else is specified.  @todo fix it. */
  @SubL(source = "cycl/keyhash-utilities.lisp", position = 1815) 
  public static final SubLObject fast_intersection(SubLObject list_1, SubLObject list_2, SubLObject test, SubLObject key, SubLObject v_keyhash) {
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQUAL);
    }
    if ((key == UNPROVIDED)) {
      key = Symbols.symbol_function(IDENTITY);
    }
    if ((v_keyhash == UNPROVIDED)) {
      v_keyhash = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(test, $sym2$FUNCTION_SPEC_P);
      if ((NIL != list_utilities.lengthLE(list_1, list_utilities.$magic_hashing_cutoff$.getDynamicValue(thread), UNPROVIDED))) {
        return conses_high.intersection(list_1, list_2, test, key);
      } else if ((NIL != list_utilities.lengthLE(list_2, list_utilities.$magic_hashing_cutoff$.getDynamicValue(thread), UNPROVIDED))) {
        return conses_high.intersection(list_1, list_2, test, key);
      } else if ((NIL != v_keyhash)) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10994");
      } else if ((NIL != Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8901"))) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10995");
      } else {
        return conses_high.intersection(list_1, list_2, test, key);
      }
    }
  }

  public static final SubLObject declare_keyhash_utilities_file() {
    declareFunction("keyhash_element_list", "KEYHASH-ELEMENT-LIST", 1, 0, false);
    declareFunction("keyhash_list_elements", "KEYHASH-LIST-ELEMENTS", 1, 2, false);
    declareFunction("keyhash_rebuild", "KEYHASH-REBUILD", 1, 0, false);
    declareFunction("fast_intersection", "FAST-INTERSECTION", 2, 3, false);
    //declareFunction("intersect_forts", "INTERSECT-FORTS", 2, 0, false);
    //declareFunction("hash_intersection", "HASH-INTERSECTION", 2, 2, false);
    //declareFunction("hash_intersection_int", "HASH-INTERSECTION-INT", 2, 2, false);
    //declareFunction("fast_intersectP", "FAST-INTERSECT?", 2, 3, false);
    //declareFunction("hash_intersectP", "HASH-INTERSECT?", 2, 2, false);
    //declareFunction("hash_intersect_intP", "HASH-INTERSECT-INT?", 2, 2, false);
    return NIL;
  }

  public static final SubLObject init_keyhash_utilities_file() {
    $intersection_table$ = defparameter("*INTERSECTION-TABLE*", keyhash.new_keyhash($int0$500, Symbols.symbol_function(EQUAL)));
    $intersection_table_lock$ = defparameter("*INTERSECTION-TABLE-LOCK*", Locks.make_lock($str1$Intersection_table_Lock));
    return NIL;
  }

  public static final SubLObject setup_keyhash_utilities_file() {
        return NIL;
  }

  //// Internal Constants

  public static final SubLInteger $int0$500 = makeInteger(500);
  public static final SubLString $str1$Intersection_table_Lock = makeString("Intersection table Lock");
  public static final SubLSymbol $sym2$FUNCTION_SPEC_P = makeSymbol("FUNCTION-SPEC-P");
  public static final SubLSymbol $sym3$LISTP = makeSymbol("LISTP");
  public static final SubLSymbol $sym4$KEYHASH_P = makeSymbol("KEYHASH-P");

  //// Initializers

  public void declareFunctions() {
    declare_keyhash_utilities_file();
  }

  public void initializeVariables() {
    init_keyhash_utilities_file();
  }

  public void runTopLevelForms() {
    setup_keyhash_utilities_file();
  }

}
