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
 * Defines values for AutomaticTuningOptionModeActual.
 */
public enum AutomaticTuningOptionModeActual {
    /** Enum value Off. */
    OFF("Off"),

    /** Enum value On. */
    ON("On");

    /** The actual serialized value for a AutomaticTuningOptionModeActual instance. */
    private String value;

    AutomaticTuningOptionModeActual(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a AutomaticTuningOptionModeActual instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed AutomaticTuningOptionModeActual object, or null if unable to parse.
     */
    @JsonCreator
    public static AutomaticTuningOptionModeActual fromString(String value) {
        AutomaticTuningOptionModeActual[] items = AutomaticTuningOptionModeActual.values();
        for (AutomaticTuningOptionModeActual item : items) {
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
