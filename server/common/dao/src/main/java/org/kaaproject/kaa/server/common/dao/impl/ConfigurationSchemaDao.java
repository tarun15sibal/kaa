/*
 * Copyright 2014-2016 CyberVision, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.kaaproject.kaa.server.common.dao.impl;

import java.util.List;

/**
 * The interface Configuration schema dao.
 * @param <T>  the type parameter
 */
public interface ConfigurationSchemaDao<T> extends SqlDao<T> {

    /**
     * Find configuration schemas by application id.
     *
     * @param applicationId the application id
     * @return the list of configuration schemas
     */
    List<T> findByApplicationId(String applicationId);

    /**
     * Find latest configuration schema by application id.
     *
     * @param applicationId the application id
     * @return the configuration schema
     */
    T findLatestByApplicationId(String applicationId);

    /**
     * Gets latest configuration schema by application id.
     *
     * @param applicationId the application id
     * @param version the version of configuration schema
     * @return the latest configuration schema
     */
    T findByAppIdAndVersion(String applicationId, int version);

    /**
     * Find schemas without active/inactive configurations
     *
     * @param applicationId the application id
     * @param usedSchemaIds The list of schemas with active/inactive configurations
     * @return The list of vacant configuration schemas
     */
    List<T> findVacantSchemas(String applicationId, List<String> usedSchemaIds);
}
