// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The RecommendedElasticPoolListResult model.
 */
@Fluent
public final class RecommendedElasticPoolListResultInner {
    /*
     * The list of recommended elastic pools hosted in the server.
     */
    @JsonProperty(value = "value", required = true)
    private List<RecommendedElasticPoolInner> value;

    /**
     * Get the value property: The list of recommended elastic pools hosted in
     * the server.
     * 
     * @return the value value.
     */
    public List<RecommendedElasticPoolInner> getValue() {
        return this.value;
    }

    /**
     * Set the value property: The list of recommended elastic pools hosted in
     * the server.
     * 
     * @param value the value value to set.
     * @return the RecommendedElasticPoolListResultInner object itself.
     */
    public RecommendedElasticPoolListResultInner setValue(List<RecommendedElasticPoolInner> value) {
        this.value = value;
        return this;
    }
}
