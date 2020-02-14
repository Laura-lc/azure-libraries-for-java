// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ServerDnsAlias model.
 */
@JsonFlatten
@Immutable
public class ServerDnsAliasInner extends ProxyResource {
    /*
     * The fully qualified DNS record for alias
     */
    @JsonProperty(value = "properties.azureDnsRecord", access = JsonProperty.Access.WRITE_ONLY)
    private String azureDnsRecord;

    /**
     * Get the azureDnsRecord property: The fully qualified DNS record for
     * alias.
     * 
     * @return the azureDnsRecord value.
     */
    public String getAzureDnsRecord() {
        return this.azureDnsRecord;
    }
}
