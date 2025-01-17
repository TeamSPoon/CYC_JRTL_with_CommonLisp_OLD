/*
 * Copyright 2007 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.gwt.user.client.impl;

import com.google.gwt.user.client.History;

/**
 * Native implementation associated with
 * {@link com.google.gwt.user.client.History}.
 */
public abstract class HistoryImpl {

  protected static void onHistoryChanged(String historyToken) {
    History.onHistoryChanged(historyToken);
  }

  public native String getToken() /*-{
    return $wnd.__gwt_historyToken;
  }-*/;

  public abstract boolean init();

  public abstract void newItem(String historyToken);

  protected native void setToken(String token) /*-{
    $wnd.__gwt_historyToken = token;
  }-*/;
}
