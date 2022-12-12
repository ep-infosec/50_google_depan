/*
 * Copyright 2008 The Depan Project Authors
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

package com.google.devtools.depan.filesystem.eclipse;

import com.google.devtools.depan.graph_doc.eclipse.ui.wizards.AbstractAnalysisPage;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Composite;

import java.io.File;

/**
 * The "New" wizard page allows setting the container for the new file as well
 * as the file name. The page will only accept file name without the extension
 * OR with the extension that matches the expected one (dgi).
 */

public class NewFileSystemPage extends AbstractAnalysisPage {

  public static final String PAGE_LABEL = "New File System Analysis";

  private NewFileSystemOptionPart fileSystemOptions;

  public NewFileSystemPage(ISelection selection) {
    super(selection, PAGE_LABEL,
        "This wizard creates a new dependency graph"
        + " from an analysis of a file system tree.",
        createFilename("Tree"));
  }

  @Override
  protected void createOptionsParts(Composite container) {
    fileSystemOptions = new NewFileSystemOptionPart(this);
    addOptionPart(container, fileSystemOptions);
  }

  public String getPathText() {
    return fileSystemOptions.getPathText();
  }

  public File getPathFile() {
    return fileSystemOptions.getPathFile();
  }

  public String getTreePrefix() {
    return fileSystemOptions.getTreePrefix();
  }
}
