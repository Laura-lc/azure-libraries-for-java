// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * The RecoverableDatabase model.
 */
@JsonFlatten
@Immutable
public class RecoverableDatabaseInner extends ProxyResource {
    /*
     * The edition of the database
     */
    @JsonProperty(value = "properties.edition", access = JsonProperty.Access.WRITE_ONLY)
    private String edition;

    /*
     * The service level objective name of the database
     */
    @JsonProperty(value = "properties.serviceLevelObjective", access = JsonProperty.Access.WRITE_ONLY)
    private String serviceLevelObjective;

    /*
     * The elastic pool name of the database
     */
    @JsonProperty(value = "properties.elasticPoolName", access = JsonProperty.Access.WRITE_ONLY)
    private String elasticPoolName;

    /*
     * The last available backup date of the database (ISO8601 format)
     */
    @JsonProperty(value = "properties.lastAvailableBackupDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastAvailableBackupDate;

    /**
     * Get the edition property: The edition of the database.
     * 
     * @return the edition value.
     */
    public String edition() {
        return this.edition;
    }

    /**
     * Get the serviceLevelObjective property: The service level objective name
     * of the database.
     * 
     * @return the serviceLevelObjective value.
     */
    public String serviceLevelObjective() {
        return this.serviceLevelObjective;
    }

    /**
     * Get the elasticPoolName property: The elastic pool name of the database.
     * 
     * @return the elasticPoolName value.
     */
    public String elasticPoolName() {
        return this.elasticPoolName;
    }

    /**
     * Get the lastAvailableBackupDate property: The last available backup date
     * of the database (ISO8601 format).
     * 
     * @return the lastAvailableBackupDate value.
     */
    public OffsetDateTime lastAvailableBackupDate() {
        return this.lastAvailableBackupDate;
    }
}
