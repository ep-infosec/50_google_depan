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

package com.google.devtools.depan.graph_doc.eclipse.ui.widgets;

import com.google.devtools.depan.graph_doc.eclipse.ui.plugins.FromGraphDocContributor;
import com.google.devtools.depan.graph_doc.eclipse.ui.plugins.FromGraphDocRegistry;
import com.google.devtools.depan.platform.eclipse.ui.widgets.MapChoiceControl;

import org.eclipse.swt.widgets.Composite;

import java.util.Map;

/**
 * @author <a href="leeca@pnambic.com">Lee Carver</a>
 */
public class FromGraphDocListControl
    extends MapChoiceControl<FromGraphDocContributor> {

  public FromGraphDocListControl(Composite parent) {
    super(parent);

    Map<String, FromGraphDocContributor> froms =
        FromGraphDocRegistry.getRegistryContributionMap();
    setInput(getBestFrom(froms), froms);
  }

  public void selectFrom(FromGraphDocContributor choice) {
    Map<String, FromGraphDocContributor> froms =
        FromGraphDocRegistry.getRegistryContributionMap();
    setSelection(buildSelection(choice, froms));
  }

  private static FromGraphDocContributor getBestFrom(
      Map<String, FromGraphDocContributor> contribs) {
    if (contribs.isEmpty()) {
      return null;
    }
    return contribs.values().iterator().next();
  }

  @Override
  protected FromGraphDocContributor coerceResult(Object obj) {
    return (FromGraphDocContributor) obj;
  }
}
