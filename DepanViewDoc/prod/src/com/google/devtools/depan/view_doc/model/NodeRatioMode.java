/*
 * Copyright 2017 The Depan Project Authors
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

package com.google.devtools.depan.view_doc.model;

/**
 * Marker interface for node rations.
 * 
 * Use to lookup node sizes during rendering.  ViewDoc extensions can
 * implement this interface and register the type to implement alternate
 * rations schemes.
 * 
 * @author Lee Carver
 */
public interface NodeRatioMode {

  public static final float DEFAULT = 1.0f;

  /**
   * Human sensible label for this size mode.  Should be unique.
   */
  String getLabel();

  public static class Labeled implements NodeRatioMode {
    private final String label;

    public Labeled(String label) {
      this.label = label;
    }

    @Override
    public String getLabel() {
      return label;
    }
  }
}
