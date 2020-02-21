// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ImportRequest model.
 */
@Fluent
public final class ImportRequest extends ExportRequest {
    /*
     * The name of the database to import.
     */
    @JsonProperty(value = "databaseName", required = true)
    private String databaseName;

    /*
     * The edition for the database being created.
     * 
     * The list of SKUs may vary by region and support offer. To determine the
     * SKUs (including the SKU name, tier/edition, family, and capacity) that
     * are available to your subscription in an Azure region, use the
     * `Capabilities_ListByLocation` REST API or one of the following commands:
     * 
     * ```azurecli
     * az sql db list-editions -l <location> -o table
     * ````
     * 
     * ```powershell
     * Get-AzSqlServerServiceObjective -Location <location>
     * ````
     * 
     */
    @JsonProperty(value = "edition", required = true)
    private DatabaseEdition edition;

    /*
     * The name of the service objective to assign to the database.
     */
    @JsonProperty(value = "serviceObjectiveName", required = true)
    private ServiceObjectiveName serviceObjectiveName;

    /*
     * The maximum size for the newly imported database.
     */
    @JsonProperty(value = "maxSizeBytes", required = true)
    private String maxSizeBytes;

    /**
     * Get the databaseName property: The name of the database to import.
     * 
     * @return the databaseName value.
     */
    public String databaseName() {
        return this.databaseName;
    }

    /**
     * Set the databaseName property: The name of the database to import.
     * 
     * @param databaseName the databaseName value to set.
     * @return the ImportRequest object itself.
     */
    public ImportRequest withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * Get the edition property: The edition for the database being created.
     * 
     * The list of SKUs may vary by region and support offer. To determine the
     * SKUs (including the SKU name, tier/edition, family, and capacity) that
     * are available to your subscription in an Azure region, use the
     * `Capabilities_ListByLocation` REST API or one of the following commands:
     * 
     * ```azurecli
     * az sql db list-editions -l &lt;location&gt; -o table
     * ````
     * 
     * ```powershell
     * Get-AzSqlServerServiceObjective -Location &lt;location&gt;
     * ````.
     * 
     * @return the edition value.
     */
    public DatabaseEdition edition() {
        return this.edition;
    }

    /**
     * Set the edition property: The edition for the database being created.
     * 
     * The list of SKUs may vary by region and support offer. To determine the
     * SKUs (including the SKU name, tier/edition, family, and capacity) that
     * are available to your subscription in an Azure region, use the
     * `Capabilities_ListByLocation` REST API or one of the following commands:
     * 
     * ```azurecli
     * az sql db list-editions -l &lt;location&gt; -o table
     * ````
     * 
     * ```powershell
     * Get-AzSqlServerServiceObjective -Location &lt;location&gt;
     * ````.
     * 
     * @param edition the edition value to set.
     * @return the ImportRequest object itself.
     */
    public ImportRequest withEdition(DatabaseEdition edition) {
        this.edition = edition;
        return this;
    }

    /**
     * Get the serviceObjectiveName property: The name of the service objective
     * to assign to the database.
     * 
     * @return the serviceObjectiveName value.
     */
    public ServiceObjectiveName serviceObjectiveName() {
        return this.serviceObjectiveName;
    }

    /**
     * Set the serviceObjectiveName property: The name of the service objective
     * to assign to the database.
     * 
     * @param serviceObjectiveName the serviceObjectiveName value to set.
     * @return the ImportRequest object itself.
     */
    public ImportRequest withServiceObjectiveName(ServiceObjectiveName serviceObjectiveName) {
        this.serviceObjectiveName = serviceObjectiveName;
        return this;
    }

    /**
     * Get the maxSizeBytes property: The maximum size for the newly imported
     * database.
     * 
     * @return the maxSizeBytes value.
     */
    public String maxSizeBytes() {
        return this.maxSizeBytes;
    }

    /**
     * Set the maxSizeBytes property: The maximum size for the newly imported
     * database.
     * 
     * @param maxSizeBytes the maxSizeBytes value to set.
     * @return the ImportRequest object itself.
     */
    public ImportRequest withMaxSizeBytes(String maxSizeBytes) {
        this.maxSizeBytes = maxSizeBytes;
        return this;
    }
}
