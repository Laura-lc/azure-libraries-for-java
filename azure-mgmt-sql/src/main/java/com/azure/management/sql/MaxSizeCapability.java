/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.azure.management.sql;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The maximum size limits for a database.
 */
public class MaxSizeCapability {
    /**
     * The maximum size of the database (see 'unit' for the units).
     */
    @JsonProperty(value = "limit", access = JsonProperty.Access.WRITE_ONLY)
    private long limit;

    /**
     * The units that the limit is expressed in. Possible values include:
     * 'Megabytes', 'Gigabytes', 'Terabytes', 'Petabytes'.
     */
    @JsonProperty(value = "unit", access = JsonProperty.Access.WRITE_ONLY)
    private MaxSizeUnits unit;

    /**
     * The status of the maximum size capability. Possible values include:
     * 'Visible', 'Available', 'Default', 'Disabled'.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private CapabilityStatus status;

    /**
     * Get the maximum size of the database (see 'unit' for the units).
     *
     * @return the limit value
     */
    public long limit() {
        return this.limit;
    }

    /**
     * Get the units that the limit is expressed in. Possible values include: 'Megabytes', 'Gigabytes', 'Terabytes', 'Petabytes'.
     *
     * @return the unit value
     */
    public MaxSizeUnits unit() {
        return this.unit;
    }

    /**
     * Get the status of the maximum size capability. Possible values include: 'Visible', 'Available', 'Default', 'Disabled'.
     *
     * @return the status value
     */
    public CapabilityStatus status() {
        return this.status;
    }

}
