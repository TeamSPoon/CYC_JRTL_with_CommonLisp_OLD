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

import com.cyc.cycjava.cycl.sbhl.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.fort_types_interface;
//dm import com.cyc.cycjava_1.cycl.kb_accessors;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_link_methods;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_module_utilities;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_module_vars;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_search_implied_relations;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_search_methods;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_search_vars;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_search_what_mts;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class negation_predicate extends SubLTranslatedFile {

  //// Constructor

  private negation_predicate() {}
  public static final SubLFile me = new negation_predicate();
  public static final String myName = "com.cyc.cycjava_1.cycl.negation_predicate";

  //// Definitions

  /** all of the negation-predicates of PRED */
  @SubL(source = "cycl/negation-predicate.lisp", position = 2933) 
  public static final SubLObject all_negation_predicates(SubLObject pred, SubLObject mt, SubLObject tv) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((tv == UNPROVIDED)) {
      tv = NIL;
    }
    return sbhl_search_implied_relations.sbhl_all_implied_disjoins(sbhl_module_vars.get_sbhl_module($const0$negationPreds), pred, mt, tv);
  }

  /** most-general negation predicates of <pred> */
  @SubL(source = "cycl/negation-predicate.lisp", position = 4169) 
  public static final SubLObject max_all_negation_predicates(SubLObject pred, SubLObject mt, SubLObject tv) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((tv == UNPROVIDED)) {
      tv = NIL;
    }
    return sbhl_search_implied_relations.sbhl_implied_max_disjoins(sbhl_module_vars.get_sbhl_module($const0$negationPreds), pred, mt, tv);
  }

  @SubL(source = "cycl/negation-predicate.lisp", position = 4549) 
  public static final SubLObject max_negation_preds(SubLObject pred, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    return max_all_negation_predicates(pred, mt, UNPROVIDED);
  }

  /** most-general negation inverses of <pred> */
  @SubL(source = "cycl/negation-predicate.lisp", position = 4768) 
  public static final SubLObject max_all_negation_inverses(SubLObject pred, SubLObject mt, SubLObject tv) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((tv == UNPROVIDED)) {
      tv = NIL;
    }
    return sbhl_search_implied_relations.sbhl_implied_max_disjoins(sbhl_module_vars.get_sbhl_module($const1$negationInverse), pred, mt, tv);
  }

  @SubL(source = "cycl/negation-predicate.lisp", position = 4962) 
  public static final SubLObject max_negation_inverses(SubLObject pred, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    return max_all_negation_inverses(pred, mt, UNPROVIDED);
  }

  /** Modifier. Adds sbhl links with @see sbhl-after-adding. */
  @SubL(source = "cycl/negation-predicate.lisp", position = 17748) 
  public static final SubLObject negation_inverse_after_adding(SubLObject source, SubLObject assertion) {
    sbhl_link_methods.sbhl_after_adding(source, assertion, sbhl_module_vars.get_sbhl_module($const1$negationInverse));
    return NIL;
  }

  /** Modifier. Adds sbhl links with @see negation-inverse-after-adding. */
  @SubL(source = "cycl/negation-predicate.lisp", position = 17966) 
  public static final SubLObject add_negation_inverse(SubLObject source, SubLObject assertion) {
    negation_inverse_after_adding(source, assertion);
    return NIL;
  }

  /** Modifier. Removes sbhl links with @see sbhl-after-removing. */
  @SubL(source = "cycl/negation-predicate.lisp", position = 18486) 
  public static final SubLObject negation_inverse_after_removing(SubLObject source, SubLObject assertion) {
    sbhl_link_methods.sbhl_after_removing(source, assertion, sbhl_module_vars.get_sbhl_module($const1$negationInverse));
    return NIL;
  }

  /** Modifier. Removes sbhl links with @see sbhl-after-removing. */
  @SubL(source = "cycl/negation-predicate.lisp", position = 18715) 
  public static final SubLObject remove_negation_inverse(SubLObject source, SubLObject assertion) {
    negation_inverse_after_removing(source, assertion);
    return NIL;
  }

  public static final SubLObject declare_negation_predicate_file() {
    //declareFunction("local_negation_predicates", "LOCAL-NEGATION-PREDICATES", 1, 2, false);
    //declareFunction("local_negation_inverses", "LOCAL-NEGATION-INVERSES", 1, 2, false);
    //declareFunction("local_max_negation_predicates", "LOCAL-MAX-NEGATION-PREDICATES", 1, 2, false);
    //declareFunction("local_max_negation_inverses", "LOCAL-MAX-NEGATION-INVERSES", 1, 2, false);
    //declareFunction("local_not_negation_predicates", "LOCAL-NOT-NEGATION-PREDICATES", 1, 2, false);
    //declareFunction("local_not_negation_inverses", "LOCAL-NOT-NEGATION-INVERSES", 1, 2, false);
    //declareFunction("local_min_not_negation_predicates", "LOCAL-MIN-NOT-NEGATION-PREDICATES", 1, 2, false);
    //declareFunction("local_min_not_negation_inverses", "LOCAL-MIN-NOT-NEGATION-INVERSES", 1, 2, false);
    declareFunction("all_negation_predicates", "ALL-NEGATION-PREDICATES", 1, 2, false);
    //declareMacro("do_all_negation_predicates", "DO-ALL-NEGATION-PREDICATES");
    //declareFunction("all_negation_preds", "ALL-NEGATION-PREDS", 1, 1, false);
    //declareFunction("all_negation_inverses", "ALL-NEGATION-INVERSES", 1, 2, false);
    //declareFunction("all_not_negation_predicates", "ALL-NOT-NEGATION-PREDICATES", 1, 2, false);
    //declareFunction("all_not_negation_preds", "ALL-NOT-NEGATION-PREDS", 1, 1, false);
    //declareFunction("all_not_negation_inverses", "ALL-NOT-NEGATION-INVERSES", 1, 2, false);
    declareFunction("max_all_negation_predicates", "MAX-ALL-NEGATION-PREDICATES", 1, 2, false);
    //declareFunction("negation_preds", "NEGATION-PREDS", 1, 1, false);
    declareFunction("max_negation_preds", "MAX-NEGATION-PREDS", 1, 1, false);
    //declareFunction("max_negation_predicates", "MAX-NEGATION-PREDICATES", 1, 1, false);
    declareFunction("max_all_negation_inverses", "MAX-ALL-NEGATION-INVERSES", 1, 2, false);
    declareFunction("max_negation_inverses", "MAX-NEGATION-INVERSES", 1, 1, false);
    //declareFunction("min_all_not_negation_predicates", "MIN-ALL-NOT-NEGATION-PREDICATES", 1, 2, false);
    //declareFunction("min_implied_not_negation_predicates", "MIN-IMPLIED-NOT-NEGATION-PREDICATES", 1, 2, false);
    //declareFunction("min_all_asserted_not_negation_predicates", "MIN-ALL-ASSERTED-NOT-NEGATION-PREDICATES", 1, 2, false);
    //declareFunction("not_negation_preds", "NOT-NEGATION-PREDS", 1, 1, false);
    //declareFunction("min_not_negation_preds", "MIN-NOT-NEGATION-PREDS", 1, 1, false);
    //declareFunction("min_not_negation_predicates", "MIN-NOT-NEGATION-PREDICATES", 1, 1, false);
    //declareFunction("min_all_not_negation_inverses", "MIN-ALL-NOT-NEGATION-INVERSES", 1, 2, false);
    //declareFunction("min_implied_not_negation_inverses", "MIN-IMPLIED-NOT-NEGATION-INVERSES", 1, 2, false);
    //declareFunction("min_all_asserted_not_negation_inverses", "MIN-ALL-ASSERTED-NOT-NEGATION-INVERSES", 1, 2, false);
    //declareFunction("min_not_negation_inverses", "MIN-NOT-NEGATION-INVERSES", 1, 1, false);
    //declareFunction("negation_predicateP", "NEGATION-PREDICATE?", 2, 2, false);
    //declareFunction("negation_predP", "NEGATION-PRED?", 2, 1, false);
    //declareFunction("negation_inverseP", "NEGATION-INVERSE?", 2, 2, false);
    //declareFunction("not_negation_predP", "NOT-NEGATION-PRED?", 2, 1, false);
    //declareFunction("not_negation_predicateP", "NOT-NEGATION-PREDICATE?", 2, 2, false);
    //declareFunction("not_negation_inverseP", "NOT-NEGATION-INVERSE?", 2, 2, false);
    //declareFunction("some_negation_pred_or_inverseP", "SOME-NEGATION-PRED-OR-INVERSE?", 1, 2, false);
    //declareFunction("some_negation_pred_or_inverse", "SOME-NEGATION-PRED-OR-INVERSE", 1, 2, false);
    //declareFunction("basis_for_not_negation_predP", "BASIS-FOR-NOT-NEGATION-PRED?", 2, 1, false);
    //declareFunction("basis_for_not_negation_inverseP", "BASIS-FOR-NOT-NEGATION-INVERSE?", 2, 1, false);
    //declareFunction("why_negation_predP", "WHY-NEGATION-PRED?", 2, 3, false);
    //declareFunction("why_negation_inverseP", "WHY-NEGATION-INVERSE?", 2, 3, false);
    //declareFunction("max_floor_mts_of_negation_predicate_paths", "MAX-FLOOR-MTS-OF-NEGATION-PREDICATE-PATHS", 2, 1, false);
    //declareFunction("max_floor_mts_of_negation_pred_paths", "MAX-FLOOR-MTS-OF-NEGATION-PRED-PATHS", 2, 0, false);
    //declareFunction("min_mts_of_negation_predicate_paths", "MIN-MTS-OF-NEGATION-PREDICATE-PATHS", 2, 1, false);
    //declareFunction("min_mts_of_negation_pred_paths", "MIN-MTS-OF-NEGATION-PRED-PATHS", 2, 0, false);
    //declareFunction("max_floor_mts_of_not_negation_predicate_paths", "MAX-FLOOR-MTS-OF-NOT-NEGATION-PREDICATE-PATHS", 2, 1, false);
    //declareFunction("min_mts_of_not_negation_predicate_paths", "MIN-MTS-OF-NOT-NEGATION-PREDICATE-PATHS", 2, 1, false);
    //declareFunction("max_floor_mts_of_negation_inverse_paths", "MAX-FLOOR-MTS-OF-NEGATION-INVERSE-PATHS", 2, 1, false);
    //declareFunction("min_mts_of_negation_inverse_paths", "MIN-MTS-OF-NEGATION-INVERSE-PATHS", 2, 1, false);
    //declareFunction("max_floor_mts_of_not_negation_inverse_paths", "MAX-FLOOR-MTS-OF-NOT-NEGATION-INVERSE-PATHS", 2, 1, false);
    //declareFunction("min_mts_of_not_negation_inverse_paths", "MIN-MTS-OF-NOT-NEGATION-INVERSE-PATHS", 2, 1, false);
    //declareFunction("negation_predicate_mts", "NEGATION-PREDICATE-MTS", 1, 0, false);
    //declareFunction("asserted_negation_preds", "ASSERTED-NEGATION-PREDS", 1, 1, false);
    //declareFunction("asserted_not_negation_preds", "ASSERTED-NOT-NEGATION-PREDS", 1, 1, false);
    //declareFunction("supported_negation_preds", "SUPPORTED-NEGATION-PREDS", 1, 1, false);
    //declareFunction("supported_not_negation_preds", "SUPPORTED-NOT-NEGATION-PREDS", 1, 1, false);
    //declareFunction("negation_inverse_mts", "NEGATION-INVERSE-MTS", 1, 0, false);
    //declareFunction("asserted_negation_inverses", "ASSERTED-NEGATION-INVERSES", 1, 1, false);
    //declareFunction("asserted_not_negation_inverses", "ASSERTED-NOT-NEGATION-INVERSES", 1, 1, false);
    //declareFunction("supported_negation_inverses", "SUPPORTED-NEGATION-INVERSES", 1, 1, false);
    //declareFunction("supported_not_negation_inverses", "SUPPORTED-NOT-NEGATION-INVERSES", 1, 1, false);
    //declareFunction("negation_predicate_after_adding", "NEGATION-PREDICATE-AFTER-ADDING", 2, 0, false);
    declareFunction("negation_inverse_after_adding", "NEGATION-INVERSE-AFTER-ADDING", 2, 0, false);
    declareFunction("add_negation_inverse", "ADD-NEGATION-INVERSE", 2, 0, false);
    //declareFunction("negation_predicate_after_removing", "NEGATION-PREDICATE-AFTER-REMOVING", 2, 0, false);
    declareFunction("negation_inverse_after_removing", "NEGATION-INVERSE-AFTER-REMOVING", 2, 0, false);
    declareFunction("remove_negation_inverse", "REMOVE-NEGATION-INVERSE", 2, 0, false);
    //declareFunction("clear_negation_predicate_graph", "CLEAR-NEGATION-PREDICATE-GRAPH", 0, 0, false);
    //declareFunction("clear_negation_inverse_graph", "CLEAR-NEGATION-INVERSE-GRAPH", 0, 0, false);
    //declareFunction("clear_node_negation_predicate_links", "CLEAR-NODE-NEGATION-PREDICATE-LINKS", 1, 0, false);
    //declareFunction("clear_node_negation_inverse_links", "CLEAR-NODE-NEGATION-INVERSE-LINKS", 1, 0, false);
    //declareFunction("reset_negation_predicate_links", "RESET-NEGATION-PREDICATE-LINKS", 1, 0, false);
    //declareFunction("reset_negation_inverse_links", "RESET-NEGATION-INVERSE-LINKS", 1, 0, false);
    //declareFunction("reset_negation_predicate_links_in_mt", "RESET-NEGATION-PREDICATE-LINKS-IN-MT", 2, 0, false);
    //declareFunction("reset_negation_inverse_links_in_mt", "RESET-NEGATION-INVERSE-LINKS-IN-MT", 2, 0, false);
    //declareFunction("reset_negation_predicate_graph", "RESET-NEGATION-PREDICATE-GRAPH", 0, 1, false);
    //declareFunction("reset_negation_inverse_graph", "RESET-NEGATION-INVERSE-GRAPH", 0, 1, false);
    return NIL;
  }

  public static final SubLObject init_negation_predicate_file() {
    return NIL;
  }

  public static final SubLObject setup_negation_predicate_file() {
        utilities_macros.register_kb_function($sym10$NEGATION_PREDICATE_AFTER_ADDING);
    utilities_macros.register_kb_function($sym11$NEGATION_INVERSE_AFTER_ADDING);
    utilities_macros.register_kb_function($sym12$ADD_NEGATION_INVERSE);
    utilities_macros.register_kb_function($sym13$NEGATION_PREDICATE_AFTER_REMOVING);
    utilities_macros.register_kb_function($sym14$NEGATION_INVERSE_AFTER_REMOVING);
    utilities_macros.register_kb_function($sym15$REMOVE_NEGATION_INVERSE);
    return NIL;
  }

  //// Internal Constants

  public static final SubLObject $const0$negationPreds = constant_handles.reader_make_constant_shell(makeString("negationPreds"));
  public static final SubLObject $const1$negationInverse = constant_handles.reader_make_constant_shell(makeString("negationInverse"));
  public static final SubLList $list2 = list(list(makeSymbol("NEGATION-PRED"), makeSymbol("PRED"), makeSymbol("&KEY"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list3 = list(makeKeyword("MT"), makeKeyword("TV"), makeKeyword("DONE"));
  public static final SubLSymbol $kw4$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw5$MT = makeKeyword("MT");
  public static final SubLSymbol $kw6$TV = makeKeyword("TV");
  public static final SubLSymbol $kw7$DONE = makeKeyword("DONE");
  public static final SubLSymbol $sym8$DO_LIST = makeSymbol("DO-LIST");
  public static final SubLSymbol $sym9$ALL_NEGATION_PREDICATES = makeSymbol("ALL-NEGATION-PREDICATES");
  public static final SubLSymbol $sym10$NEGATION_PREDICATE_AFTER_ADDING = makeSymbol("NEGATION-PREDICATE-AFTER-ADDING");
  public static final SubLSymbol $sym11$NEGATION_INVERSE_AFTER_ADDING = makeSymbol("NEGATION-INVERSE-AFTER-ADDING");
  public static final SubLSymbol $sym12$ADD_NEGATION_INVERSE = makeSymbol("ADD-NEGATION-INVERSE");
  public static final SubLSymbol $sym13$NEGATION_PREDICATE_AFTER_REMOVING = makeSymbol("NEGATION-PREDICATE-AFTER-REMOVING");
  public static final SubLSymbol $sym14$NEGATION_INVERSE_AFTER_REMOVING = makeSymbol("NEGATION-INVERSE-AFTER-REMOVING");
  public static final SubLSymbol $sym15$REMOVE_NEGATION_INVERSE = makeSymbol("REMOVE-NEGATION-INVERSE");

  //// Initializers

  public void declareFunctions() {
    declare_negation_predicate_file();
  }

  public void initializeVariables() {
    init_negation_predicate_file();
  }

  public void runTopLevelForms() {
    setup_negation_predicate_file();
  }

}
