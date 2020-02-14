// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.management.sql.ServerKeyType;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The EncryptionProtector model.
 */
@JsonFlatten
@Fluent
public class EncryptionProtectorInner extends ProxyResource {
    /*
     * Kind of encryption protector. This is metadata used for the Azure portal
     * experience.
     */
    @JsonProperty(value = "kind", access = JsonProperty.Access.WRITE_ONLY)
    private String kind;

    /*
     * Resource location.
     */
    @JsonProperty(value = "location", access = JsonProperty.Access.WRITE_ONLY)
    private String location;

    /*
     * Subregion of the encryption protector.
     */
    @JsonProperty(value = "properties.subregion", access = JsonProperty.Access.WRITE_ONLY)
    private String subregion;

    /*
     * The name of the server key.
     */
    @JsonProperty(value = "properties.serverKeyName")
    private String serverKeyName;

    /*
     * The key type like 'ServiceManaged', 'AzureKeyVault'.
     */
    @JsonProperty(value = "properties.serverKeyType")
    private ServerKeyType serverKeyType;

    /*
     * The URI of the server key.
     */
    @JsonProperty(value = "properties.uri", access = JsonProperty.Access.WRITE_ONLY)
    private String uri;

    /*
     * Thumbprint of the server key.
     */
    @JsonProperty(value = "properties.thumbprint", access = JsonProperty.Access.WRITE_ONLY)
    private String thumbprint;

    /**
     * Get the kind property: Kind of encryption protector. This is metadata
     * used for the Azure portal experience.
     * 
     * @return the kind value.
     */
    public String getKind() {
        return this.kind;
    }

    /**
     * Get the location property: Resource location.
     * 
     * @return the location value.
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * Get the subregion property: Subregion of the encryption protector.
     * 
     * @return the subregion value.
     */
    public String getSubregion() {
        return this.subregion;
    }

    /**
     * Get the serverKeyName property: The name of the server key.
     * 
     * @return the serverKeyName value.
     */
    public String getServerKeyName() {
        return this.serverKeyName;
    }

    /**
     * Set the serverKeyName property: The name of the server key.
     * 
     * @param serverKeyName the serverKeyName value to set.
     * @return the EncryptionProtectorInner object itself.
     */
    public EncryptionProtectorInner setServerKeyName(String serverKeyName) {
        this.serverKeyName = serverKeyName;
        return this;
    }

    /**
     * Get the serverKeyType property: The key type like 'ServiceManaged',
     * 'AzureKeyVault'.
     * 
     * @return the serverKeyType value.
     */
    public ServerKeyType getServerKeyType() {
        return this.serverKeyType;
    }

    /**
     * Set the serverKeyType property: The key type like 'ServiceManaged',
     * 'AzureKeyVault'.
     * 
     * @param serverKeyType the serverKeyType value to set.
     * @return the EncryptionProtectorInner object itself.
     */
    public EncryptionProtectorInner setServerKeyType(ServerKeyType serverKeyType) {
        this.serverKeyType = serverKeyType;
        return this;
    }

    /**
     * Get the uri property: The URI of the server key.
     * 
     * @return the uri value.
     */
    public String getUri() {
        return this.uri;
    }

    /**
     * Get the thumbprint property: Thumbprint of the server key.
     * 
     * @return the thumbprint value.
     */
    public String getThumbprint() {
        return this.thumbprint;
    }
}
