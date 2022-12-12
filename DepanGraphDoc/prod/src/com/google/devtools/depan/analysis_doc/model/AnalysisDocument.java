/*
 * Copyright 2016 The Depan Project Authors
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

package com.google.devtools.depan.analysis_doc.model;

import com.google.devtools.depan.graph_doc.model.DependencyModel;
import com.google.devtools.depan.resources.InfoDocument;

/**
 * Document type for analysis objects that are tied to a set of relation and
 * node contributions.
 *
 * @author <a href="leeca@pnambic.com">Lee Carver</a>
 */
public class AnalysisDocument<T> extends InfoDocument<T> {

  public static final String MATCHER_KEY = "matcher";

  private ModelMatcher matcher;

  public AnalysisDocument(String name, ModelMatcher matcher, T info) {
    super(name, info);
    this.matcher = matcher;
  }

  public ModelMatcher getMatcher() {
    return matcher;
  }

  public boolean forModel(DependencyModel model) {
    return matcher.forModel(model);
  }

  @Override
  public Object getObject(String key) {
    if (MATCHER_KEY.equals(key)) {
      return getMatcher();
    }
    return super.getObject(key);
  }

  @Override
  protected boolean isWritable(String key) {
    if (MATCHER_KEY.equals(key)) {
      return false;
    }
    return super.isWritable(key);
  }
}
