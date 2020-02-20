// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * The RecommendedElasticPoolMetric model.
 */
@Fluent
public final class RecommendedElasticPoolMetricInner {
    /*
     * The time of metric (ISO8601 format).
     */
    @JsonProperty(value = "dateTime")
    private OffsetDateTime dateTime;

    /*
     * Gets or sets the DTUs (Database Transaction Units). See
     * https://azure.microsoft.com/documentation/articles/sql-database-what-is-a-dtu/
     */
    @JsonProperty(value = "dtu")
    private Double dtu;

    /*
     * Gets or sets size in gigabytes.
     */
    @JsonProperty(value = "sizeGB")
    private Double sizeGB;

    /**
     * Get the dateTime property: The time of metric (ISO8601 format).
     * 
     * @return the dateTime value.
     */
    public OffsetDateTime getDateTime() {
        return this.dateTime;
    }

    /**
     * Set the dateTime property: The time of metric (ISO8601 format).
     * 
     * @param dateTime the dateTime value to set.
     * @return the RecommendedElasticPoolMetricInner object itself.
     */
    public RecommendedElasticPoolMetricInner setDateTime(OffsetDateTime dateTime) {
        this.dateTime = dateTime;
        return this;
    }

    /**
     * Get the dtu property: Gets or sets the DTUs (Database Transaction
     * Units). See
     * https://azure.microsoft.com/documentation/articles/sql-database-what-is-a-dtu/.
     * 
     * @return the dtu value.
     */
    public Double getDtu() {
        return this.dtu;
    }

    /**
     * Set the dtu property: Gets or sets the DTUs (Database Transaction
     * Units). See
     * https://azure.microsoft.com/documentation/articles/sql-database-what-is-a-dtu/.
     * 
     * @param dtu the dtu value to set.
     * @return the RecommendedElasticPoolMetricInner object itself.
     */
    public RecommendedElasticPoolMetricInner setDtu(Double dtu) {
        this.dtu = dtu;
        return this;
    }

    /**
     * Get the sizeGB property: Gets or sets size in gigabytes.
     * 
     * @return the sizeGB value.
     */
    public Double getSizeGB() {
        return this.sizeGB;
    }

    /**
     * Set the sizeGB property: Gets or sets size in gigabytes.
     * 
     * @param sizeGB the sizeGB value to set.
     * @return the RecommendedElasticPoolMetricInner object itself.
     */
    public RecommendedElasticPoolMetricInner setSizeGB(Double sizeGB) {
        this.sizeGB = sizeGB;
        return this;
    }
}
