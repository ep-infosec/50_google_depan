/*
 * Copyright 2015 The Depan Project Authors
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

package com.google.devtools.depan.model;

import com.google.devtools.depan.graph.api.Relation;
import com.google.devtools.depan.graph.basic.AbstractEdgeMatcher;

/**
 * @author <a href="mailto:leeca@pnambic.com">Lee Carver</a>
 */
public class GraphEdgeMatcher extends AbstractEdgeMatcher<String> {

  @Override
  public boolean relationForward(Relation relation) {
    return false;
  }

  @Override
  public boolean relationReverse(Relation relation) {
    return false;
  }
}
