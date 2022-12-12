/*
 * Copyright 2007 The Depan Project Authors
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.devtools.depan.java.eclipse.preferences;

import com.google.devtools.depan.java.eclipse.JavaActivator;

/**
 * An namespace class for Java graph element color preferences IDs.
 *
 * @author ycoppel@google.com (Yohann Coppel)
 */
public final class ColorPreferencesIds {

  private ColorPreferencesIds() {
    // Prevent instantiation.
  }

  public static final String COLORS_PREFIX =
      JavaActivator.JAVA_PREF_PREFIX + "color_";

  public static final String COLOR_TYPE = COLORS_PREFIX + "type";
  public static final String COLOR_METHOD = COLORS_PREFIX + "method";
  public static final String COLOR_FIELD = COLORS_PREFIX + "field";
  public static final String COLOR_INTERFACE = COLORS_PREFIX + "interface";
  public static final String COLOR_PACKAGE = COLORS_PREFIX + "package";
  public static final String COLOR_SOURCE = COLORS_PREFIX + "source";
  public static final String COLOR_DIRECTORY = COLORS_PREFIX + "directory";
}
