// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Name model.
 */
@Fluent
public final class Name {
    /*
     * Usage name value
     */
    @JsonProperty(value = "value")
    private String value;

    /*
     * Usage name localized value.
     */
    @JsonProperty(value = "localizedValue")
    private String localizedValue;

    /**
     * Get the value property: Usage name value.
     * 
     * @return the value value.
     */
    public String getValue() {
        return this.value;
    }

    /**
     * Set the value property: Usage name value.
     * 
     * @param value the value value to set.
     * @return the Name object itself.
     */
    public Name setValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get the localizedValue property: Usage name localized value.
     * 
     * @return the localizedValue value.
     */
    public String getLocalizedValue() {
        return this.localizedValue;
    }

    /**
     * Set the localizedValue property: Usage name localized value.
     * 
     * @param localizedValue the localizedValue value to set.
     * @return the Name object itself.
     */
    public Name setLocalizedValue(String localizedValue) {
        this.localizedValue = localizedValue;
        return this;
    }
}
