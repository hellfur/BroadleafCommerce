/*
 * Copyright 2008-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.broadleafcommerce.openadmin.server.dao.provider.metadata.request;

import org.broadleafcommerce.openadmin.client.dto.FieldMetadata;
import org.broadleafcommerce.openadmin.server.dao.DynamicEntityDao;

import java.util.Map;

/**
 * Contains the requested entity, metadata and support classes.
 *
 * @author Jeff Fischer
 */
public class OverrideViaAnnotationRequest {

    private final Class<?> requestedEntity;
    private final Map<String, FieldMetadata> requestedMetadata;
    private final Boolean parentExcluded;
    private final DynamicEntityDao dynamicEntityDao;
    private final String prefix;

    public OverrideViaAnnotationRequest(Class<?> requestedEntity, Map<String, FieldMetadata> requestedMetadata, Boolean parentExcluded, DynamicEntityDao dynamicEntityDao, String prefix) {
        this.requestedEntity = requestedEntity;
        this.requestedMetadata = requestedMetadata;
        this.parentExcluded = parentExcluded;
        this.dynamicEntityDao = dynamicEntityDao;
        this.prefix = prefix;
    }

    public Class<?> getRequestedEntity() {
        return requestedEntity;
    }

    public Map<String, FieldMetadata> getRequestedMetadata() {
        return requestedMetadata;
    }

    public Boolean getParentExcluded() {
        return parentExcluded;
    }

    public DynamicEntityDao getDynamicEntityDao() {
        return dynamicEntityDao;
    }

    public String getPrefix() {
        return prefix;
    }
}