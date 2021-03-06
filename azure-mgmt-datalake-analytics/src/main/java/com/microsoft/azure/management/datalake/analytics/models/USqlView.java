/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datalake.analytics.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A Data Lake Analytics catalog U-SQL view item.
 */
public class USqlView extends CatalogItem {
    /**
     * the name of the database.
     */
    @JsonProperty(value = "databaseName")
    private String databaseName;

    /**
     * the name of the schema associated with this view and database.
     */
    @JsonProperty(value = "schemaName")
    private String schemaName;

    /**
     * the name of the view.
     */
    @JsonProperty(value = "viewName")
    private String name;

    /**
     * the defined query of the view.
     */
    @JsonProperty(value = "definition")
    private String definition;

    /**
     * Get the name of the database.
     *
     * @return the databaseName value
     */
    public String databaseName() {
        return this.databaseName;
    }

    /**
     * Set the name of the database.
     *
     * @param databaseName the databaseName value to set
     * @return the USqlView object itself.
     */
    public USqlView withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * Get the name of the schema associated with this view and database.
     *
     * @return the schemaName value
     */
    public String schemaName() {
        return this.schemaName;
    }

    /**
     * Set the name of the schema associated with this view and database.
     *
     * @param schemaName the schemaName value to set
     * @return the USqlView object itself.
     */
    public USqlView withSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }

    /**
     * Get the name of the view.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the view.
     *
     * @param name the name value to set
     * @return the USqlView object itself.
     */
    public USqlView withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the defined query of the view.
     *
     * @return the definition value
     */
    public String definition() {
        return this.definition;
    }

    /**
     * Set the defined query of the view.
     *
     * @param definition the definition value to set
     * @return the USqlView object itself.
     */
    public USqlView withDefinition(String definition) {
        this.definition = definition;
        return this;
    }

}
