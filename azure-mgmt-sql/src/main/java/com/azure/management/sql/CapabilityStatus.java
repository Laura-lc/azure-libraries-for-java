// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for CapabilityStatus.
 */
public enum CapabilityStatus {
    /**
     * Enum value Visible.
     */
    VISIBLE("Visible"),

    /**
     * Enum value Available.
     */
    AVAILABLE("Available"),

    /**
     * Enum value Default.
     */
    DEFAULT("Default"),

    /**
     * Enum value Disabled.
     */
    DISABLED("Disabled");

    /**
     * The actual serialized value for a CapabilityStatus instance.
     */
    private final String value;

    CapabilityStatus(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a CapabilityStatus instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed CapabilityStatus object, or null if unable to parse.
     */
    @JsonCreator
    public static CapabilityStatus fromString(String value) {
        CapabilityStatus[] items = CapabilityStatus.values();
        for (CapabilityStatus item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
