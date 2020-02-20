/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.azure.management.sql;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for DataMaskingRuleState.
 */
public enum DataMaskingRuleState {
    /** Enum value Disabled. */
    DISABLED("Disabled"),

    /** Enum value Enabled. */
    ENABLED("Enabled");

    /** The actual serialized value for a DataMaskingRuleState instance. */
    private String value;

    DataMaskingRuleState(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a DataMaskingRuleState instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed DataMaskingRuleState object, or null if unable to parse.
     */
    @JsonCreator
    public static DataMaskingRuleState fromString(String value) {
        DataMaskingRuleState[] items = DataMaskingRuleState.values();
        for (DataMaskingRuleState item : items) {
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
