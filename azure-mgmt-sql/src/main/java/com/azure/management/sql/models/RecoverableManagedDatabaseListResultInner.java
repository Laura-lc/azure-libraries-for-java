// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The RecoverableManagedDatabaseListResult model.
 */
@Immutable
public final class RecoverableManagedDatabaseListResultInner {
    /*
     * Array of results.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<RecoverableManagedDatabaseInner> value;

    /*
     * Link to retrieve next page of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: Array of results.
     * 
     * @return the value value.
     */
    public List<RecoverableManagedDatabaseInner> getValue() {
        return this.value;
    }

    /**
     * Get the nextLink property: Link to retrieve next page of results.
     * 
     * @return the nextLink value.
     */
    public String getNextLink() {
        return this.nextLink;
    }
}
