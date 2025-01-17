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

import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.cache;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.id_index;
//dm import com.cyc.cycjava_1.cycl.kb_hl_supports;
//dm import com.cyc.cycjava_1.cycl.kb_object_manager;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;

public  final class kb_hl_support_manager extends SubLTranslatedFile {

  //// Constructor

  private kb_hl_support_manager() {}
  public static final SubLFile me = new kb_hl_support_manager();
  public static final String myName = "com.cyc.cycjava_1.cycl.kb_hl_support_manager";

  //// Definitions

  /** The KB object manager for kb-hl-supports */
  @SubL(source = "cycl/kb-hl-support-manager.lisp", position = 855) 
  private static SubLSymbol $kb_hl_support_content_manager$ = null;

  /** A wild guess */
  @SubL(source = "cycl/kb-hl-support-manager.lisp", position = 1062) 
  private static SubLSymbol $kb_hl_support_lru_size_percentage$ = null;

  @SubL(source = "cycl/kb-hl-support-manager.lisp", position = 1176) 
  public static final SubLObject setup_kb_hl_support_content_table(SubLObject size, SubLObject exactP) {
    $kb_hl_support_content_manager$.setGlobalValue(kb_object_manager.new_kb_object_manager($str2$kb_hl_support, size, $kb_hl_support_lru_size_percentage$.getGlobalValue(), $sym3$LOAD_KB_HL_SUPPORT_DEF_FROM_CACHE, exactP));
    return T;
  }

  @SubL(source = "cycl/kb-hl-support-manager.lisp", position = 1632) 
  public static final SubLObject clear_kb_hl_support_content_table() {
    return kb_object_manager.clear_kb_object_content_table($kb_hl_support_content_manager$.getGlobalValue());
  }

  /** Return the number of kb-hl-supports whose content is cached in memory. */
  @SubL(source = "cycl/kb-hl-support-manager.lisp", position = 2355) 
  public static final SubLObject cached_kb_hl_support_count() {
    return kb_object_manager.cached_kb_object_count($kb_hl_support_content_manager$.getGlobalValue());
  }

  @SubL(source = "cycl/kb-hl-support-manager.lisp", position = 2844) 
  public static final SubLObject lookup_kb_hl_support_content(SubLObject id) {
    return kb_object_manager.lookup_kb_object_content($kb_hl_support_content_manager$.getGlobalValue(), id);
  }

  /** Note that ID will be used as the id for KB-HL-SUPPORT-CONTENT. */
  @SubL(source = "cycl/kb-hl-support-manager.lisp", position = 2968) 
  public static final SubLObject register_kb_hl_support_content(SubLObject id, SubLObject kb_hl_support_content) {
    return kb_object_manager.register_kb_object_content($kb_hl_support_content_manager$.getGlobalValue(), id, kb_hl_support_content);
  }

  /** Note that ID is not in use as an KB-HL-SUPPORT-CONTENT id */
  @SubL(source = "cycl/kb-hl-support-manager.lisp", position = 3231) 
  public static final SubLObject deregister_kb_hl_support_content(SubLObject id) {
    return kb_object_manager.deregister_kb_object_content($kb_hl_support_content_manager$.getGlobalValue(), id);
  }

  @SubL(source = "cycl/kb-hl-support-manager.lisp", position = 3425) 
  public static final SubLObject mark_kb_hl_support_content_as_muted(SubLObject id) {
    return kb_object_manager.mark_kb_object_content_as_muted($kb_hl_support_content_manager$.getGlobalValue(), id);
  }

  @SubL(source = "cycl/kb-hl-support-manager.lisp", position = 4451) 
  public static final SubLObject swap_out_all_pristine_kb_hl_supports() {
    return kb_object_manager.swap_out_all_pristine_kb_objects_int($kb_hl_support_content_manager$.getGlobalValue());
  }

  @SubL(source = "cycl/kb-hl-support-manager.lisp", position = 4590) 
  public static final SubLObject initialize_kb_hl_support_hl_store_cache() {
    return kb_object_manager.initialize_kb_object_hl_store_cache($kb_hl_support_content_manager$.getGlobalValue(), $str2$kb_hl_support, $str4$kb_hl_support_index);
  }

  @SubL(source = "cycl/kb-hl-support-manager.lisp", position = 5218) 
  private static SubLSymbol $kb_hl_support_contents_from_ids$ = null;

  public static final SubLObject declare_kb_hl_support_manager_file() {
    declareFunction("setup_kb_hl_support_content_table", "SETUP-KB-HL-SUPPORT-CONTENT-TABLE", 2, 0, false);
    declareFunction("optimize_kb_hl_support_content_table", "OPTIMIZE-KB-HL-SUPPORT-CONTENT-TABLE", 1, 0, false);
    declareFunction("clear_kb_hl_support_content_table", "CLEAR-KB-HL-SUPPORT-CONTENT-TABLE", 0, 0, false);
    declareFunction("maintain_kb_hl_support_usage_counts", "MAINTAIN-KB-HL-SUPPORT-USAGE-COUNTS", 0, 0, false);
    declareFunction("dont_maintain_kb_hl_support_usage_counts", "DONT-MAINTAIN-KB-HL-SUPPORT-USAGE-COUNTS", 0, 0, false);
    declareFunction("kb_hl_support_usage_counts_enabled_p", "KB-HL-SUPPORT-USAGE-COUNTS-ENABLED-P", 0, 0, false);
    declareFunction("cached_kb_hl_support_count", "CACHED-KB-HL-SUPPORT-COUNT", 0, 0, false);
    declareFunction("kb_hl_support_content_completely_cachedP", "KB-HL-SUPPORT-CONTENT-COMPLETELY-CACHED?", 0, 0, false);
    declareFunction("kb_hl_support_content_cached_p", "KB-HL-SUPPORT-CONTENT-CACHED-P", 1, 0, false);
    declareFunction("lookup_kb_hl_support_content", "LOOKUP-KB-HL-SUPPORT-CONTENT", 1, 0, false);
    declareFunction("register_kb_hl_support_content", "REGISTER-KB-HL-SUPPORT-CONTENT", 2, 0, false);
    declareFunction("deregister_kb_hl_support_content", "DEREGISTER-KB-HL-SUPPORT-CONTENT", 1, 0, false);
    declareFunction("mark_kb_hl_support_content_as_muted", "MARK-KB-HL-SUPPORT-CONTENT-AS-MUTED", 1, 0, false);
    declareFunction("meter_kb_hl_support_content_swap_time", "METER-KB-HL-SUPPORT-CONTENT-SWAP-TIME", 0, 0, false);
    declareFunction("dont_meter_kb_hl_support_content_swap_time", "DONT-METER-KB-HL-SUPPORT-CONTENT-SWAP-TIME", 0, 0, false);
    declareFunction("clear_kb_hl_support_content_swap_time", "CLEAR-KB-HL-SUPPORT-CONTENT-SWAP-TIME", 0, 0, false);
    declareFunction("current_kb_hl_support_content_swap_time", "CURRENT-KB-HL-SUPPORT-CONTENT-SWAP-TIME", 0, 0, false);
    declareFunction("swap_out_all_pristine_kb_hl_supports", "SWAP-OUT-ALL-PRISTINE-KB-HL-SUPPORTS", 0, 0, false);
    declareFunction("initialize_kb_hl_support_hl_store_cache", "INITIALIZE-KB-HL-SUPPORT-HL-STORE-CACHE", 0, 0, false);
    declareFunction("verify_kb_hl_support_content_table_int", "VERIFY-KB-HL-SUPPORT-CONTENT-TABLE-INT", 1, 1, false);
    declareFunction("possibly_initialize_kb_hl_support_manager_from_legacy_world", "POSSIBLY-INITIALIZE-KB-HL-SUPPORT-MANAGER-FROM-LEGACY-WORLD", 0, 0, false);
    return NIL;
  }

  public static final SubLObject init_kb_hl_support_manager_file() {
    $kb_hl_support_content_manager$ = deflexical("*KB-HL-SUPPORT-CONTENT-MANAGER*", maybeDefault( $sym0$_KB_HL_SUPPORT_CONTENT_MANAGER_, $kb_hl_support_content_manager$, ()-> ($kw1$UNINITIALIZED)));
    $kb_hl_support_lru_size_percentage$ = deflexical("*KB-HL-SUPPORT-LRU-SIZE-PERCENTAGE*", FIVE_INTEGER);
    $kb_hl_support_contents_from_ids$ = deflexical("*KB-HL-SUPPORT-CONTENTS-FROM-IDS*", maybeDefault( $sym5$_KB_HL_SUPPORT_CONTENTS_FROM_IDS_, $kb_hl_support_contents_from_ids$, NIL));
    return NIL;
  }

  public static final SubLObject setup_kb_hl_support_manager_file() {
        subl_macro_promotions.declare_defglobal($sym0$_KB_HL_SUPPORT_CONTENT_MANAGER_);
    subl_macro_promotions.declare_defglobal($sym5$_KB_HL_SUPPORT_CONTENTS_FROM_IDS_);
    access_macros.define_obsolete_register($sym6$POSSIBLY_INITIALIZE_KB_HL_SUPPORT_MANAGER_FROM_LEGACY_WORLD, NIL);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$_KB_HL_SUPPORT_CONTENT_MANAGER_ = makeSymbol("*KB-HL-SUPPORT-CONTENT-MANAGER*");
  public static final SubLSymbol $kw1$UNINITIALIZED = makeKeyword("UNINITIALIZED");
  public static final SubLString $str2$kb_hl_support = makeString("kb-hl-support");
  public static final SubLSymbol $sym3$LOAD_KB_HL_SUPPORT_DEF_FROM_CACHE = makeSymbol("LOAD-KB-HL-SUPPORT-DEF-FROM-CACHE");
  public static final SubLString $str4$kb_hl_support_index = makeString("kb-hl-support-index");
  public static final SubLSymbol $sym5$_KB_HL_SUPPORT_CONTENTS_FROM_IDS_ = makeSymbol("*KB-HL-SUPPORT-CONTENTS-FROM-IDS*");
  public static final SubLSymbol $sym6$POSSIBLY_INITIALIZE_KB_HL_SUPPORT_MANAGER_FROM_LEGACY_WORLD = makeSymbol("POSSIBLY-INITIALIZE-KB-HL-SUPPORT-MANAGER-FROM-LEGACY-WORLD");
  public static final SubLInteger $int7$100 = makeInteger(100);

  //// Initializers

  public void declareFunctions() {
    declare_kb_hl_support_manager_file();
  }

  public void initializeVariables() {
    init_kb_hl_support_manager_file();
  }

  public void runTopLevelForms() {
    setup_kb_hl_support_manager_file();
  }

}
