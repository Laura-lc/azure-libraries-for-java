// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;

/**
 * The SloUsageMetric model.
 */
@Immutable
public final class SloUsageMetric {
    /*
     * The name of the service objective to assign to the database.
     */
    @JsonProperty(value = "serviceLevelObjective", access = JsonProperty.Access.WRITE_ONLY)
    private ServiceObjectiveName serviceLevelObjective;

    /*
     * The serviceLevelObjectiveId for SLO usage metric.
     */
    @JsonProperty(value = "serviceLevelObjectiveId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID serviceLevelObjectiveId;

    /*
     * Gets or sets inRangeTimeRatio for SLO usage metric.
     */
    @JsonProperty(value = "inRangeTimeRatio", access = JsonProperty.Access.WRITE_ONLY)
    private Double inRangeTimeRatio;

    /**
     * Get the serviceLevelObjective property: The name of the service
     * objective to assign to the database.
     * 
     * @return the serviceLevelObjective value.
     */
    public ServiceObjectiveName getServiceLevelObjective() {
        return this.serviceLevelObjective;
    }

    /**
     * Get the serviceLevelObjectiveId property: The serviceLevelObjectiveId
     * for SLO usage metric.
     * 
     * @return the serviceLevelObjectiveId value.
     */
    public UUID getServiceLevelObjectiveId() {
        return this.serviceLevelObjectiveId;
    }

    /**
     * Get the inRangeTimeRatio property: Gets or sets inRangeTimeRatio for SLO
     * usage metric.
     * 
     * @return the inRangeTimeRatio value.
     */
    public Double getInRangeTimeRatio() {
        return this.inRangeTimeRatio;
    }
}
