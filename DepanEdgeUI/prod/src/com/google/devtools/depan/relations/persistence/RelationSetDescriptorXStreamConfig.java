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

package com.google.devtools.depan.relations.persistence;

import com.google.devtools.depan.persistence.plugins.XStreamConfig;
import com.google.devtools.depan.relations.models.RelationSetDescriptor;

import com.thoughtworks.xstream.XStream;

import org.osgi.framework.Bundle;

import java.util.Collection;
import java.util.Collections;

/**
 * Prepare an {@link XStream} for serializing an {@link RelationSetDescriptor}.
 * 
 * @author <a href="leeca@pnambic.com">Lee Carver</a>
 */
public class RelationSetDescriptorXStreamConfig implements XStreamConfig {

  public static final String RELATION_SET_DESCRIPTOR_INFO_TAG = "rel-set-info";

  @Override
  public void config(XStream xstream) {
    xstream.setMode(XStream.NO_REFERENCES);
    xstream.alias(RELATION_SET_DESCRIPTOR_INFO_TAG, RelationSetDescriptor.class);
  }

  @Override
  public Collection<? extends Bundle> getDocumentBundles() {
    // Bundle for document module is provided by
    // contribution to XStreamConfigRegistry.
    return Collections.emptyList();
  }
}
