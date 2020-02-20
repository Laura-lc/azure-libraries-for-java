// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for ManagementOperationState.
 */
public final class ManagementOperationState extends ExpandableStringEnum<ManagementOperationState> {
    /**
     * Static value Pending for ManagementOperationState.
     */
    public static final ManagementOperationState PENDING = fromString("Pending");

    /**
     * Static value InProgress for ManagementOperationState.
     */
    public static final ManagementOperationState IN_PROGRESS = fromString("InProgress");

    /**
     * Static value Succeeded for ManagementOperationState.
     */
    public static final ManagementOperationState SUCCEEDED = fromString("Succeeded");

    /**
     * Static value Failed for ManagementOperationState.
     */
    public static final ManagementOperationState FAILED = fromString("Failed");

    /**
     * Static value CancelInProgress for ManagementOperationState.
     */
    public static final ManagementOperationState CANCEL_IN_PROGRESS = fromString("CancelInProgress");

    /**
     * Static value Cancelled for ManagementOperationState.
     */
    public static final ManagementOperationState CANCELLED = fromString("Cancelled");

    /**
     * Creates or finds a ManagementOperationState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ManagementOperationState.
     */
    @JsonCreator
    public static ManagementOperationState fromString(String name) {
        return fromString(name, ManagementOperationState.class);
    }

    /**
     * @return known ManagementOperationState values.
     */
    public static Collection<ManagementOperationState> values() {
        return values(ManagementOperationState.class);
    }
}
