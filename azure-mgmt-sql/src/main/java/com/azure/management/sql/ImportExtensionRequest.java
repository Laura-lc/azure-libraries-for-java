/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.azure.management.sql;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Import database parameters.
 */
@JsonFlatten
public class ImportExtensionRequest {
    /**
     * The name of the extension.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The type of the extension.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * The type of the storage key to use. Possible values include:
     * 'StorageAccessKey', 'SharedAccessKey'.
     */
    @JsonProperty(value = "properties.storageKeyType", required = true)
    private StorageKeyType storageKeyType;

    /**
     * The storage key to use.  If storage key type is SharedAccessKey, it must
     * be preceded with a "?.".
     */
    @JsonProperty(value = "properties.storageKey", required = true)
    private String storageKey;

    /**
     * The storage uri to use.
     */
    @JsonProperty(value = "properties.storageUri", required = true)
    private String storageUri;

    /**
     * The name of the SQL administrator.
     */
    @JsonProperty(value = "properties.administratorLogin", required = true)
    private String administratorLogin;

    /**
     * The password of the SQL administrator.
     */
    @JsonProperty(value = "properties.administratorLoginPassword", required = true)
    private String administratorLoginPassword;

    /**
     * The authentication type. Possible values include: 'SQL', 'ADPassword'.
     */
    @JsonProperty(value = "properties.authenticationType")
    private AuthenticationType authenticationType;

    /**
     * The type of import operation being performed. This is always Import.
     */
    @JsonProperty(value = "properties.operationMode", required = true)
    private String operationMode;

    /**
     * Creates an instance of ImportExtensionRequest class.
     */
    public ImportExtensionRequest() {
        operationMode = "Import";
    }

    /**
     * Get the name of the extension.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the extension.
     *
     * @param name the name value to set
     * @return the ImportExtensionRequest object itself.
     */
    public ImportExtensionRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type of the extension.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type of the extension.
     *
     * @param type the type value to set
     * @return the ImportExtensionRequest object itself.
     */
    public ImportExtensionRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the type of the storage key to use. Possible values include: 'StorageAccessKey', 'SharedAccessKey'.
     *
     * @return the storageKeyType value
     */
    public StorageKeyType storageKeyType() {
        return this.storageKeyType;
    }

    /**
     * Set the type of the storage key to use. Possible values include: 'StorageAccessKey', 'SharedAccessKey'.
     *
     * @param storageKeyType the storageKeyType value to set
     * @return the ImportExtensionRequest object itself.
     */
    public ImportExtensionRequest withStorageKeyType(StorageKeyType storageKeyType) {
        this.storageKeyType = storageKeyType;
        return this;
    }

    /**
     * Get the storage key to use.  If storage key type is SharedAccessKey, it must be preceded with a "?.".
     *
     * @return the storageKey value
     */
    public String storageKey() {
        return this.storageKey;
    }

    /**
     * Set the storage key to use.  If storage key type is SharedAccessKey, it must be preceded with a "?.".
     *
     * @param storageKey the storageKey value to set
     * @return the ImportExtensionRequest object itself.
     */
    public ImportExtensionRequest withStorageKey(String storageKey) {
        this.storageKey = storageKey;
        return this;
    }

    /**
     * Get the storage uri to use.
     *
     * @return the storageUri value
     */
    public String storageUri() {
        return this.storageUri;
    }

    /**
     * Set the storage uri to use.
     *
     * @param storageUri the storageUri value to set
     * @return the ImportExtensionRequest object itself.
     */
    public ImportExtensionRequest withStorageUri(String storageUri) {
        this.storageUri = storageUri;
        return this;
    }

    /**
     * Get the name of the SQL administrator.
     *
     * @return the administratorLogin value
     */
    public String administratorLogin() {
        return this.administratorLogin;
    }

    /**
     * Set the name of the SQL administrator.
     *
     * @param administratorLogin the administratorLogin value to set
     * @return the ImportExtensionRequest object itself.
     */
    public ImportExtensionRequest withAdministratorLogin(String administratorLogin) {
        this.administratorLogin = administratorLogin;
        return this;
    }

    /**
     * Get the password of the SQL administrator.
     *
     * @return the administratorLoginPassword value
     */
    public String administratorLoginPassword() {
        return this.administratorLoginPassword;
    }

    /**
     * Set the password of the SQL administrator.
     *
     * @param administratorLoginPassword the administratorLoginPassword value to set
     * @return the ImportExtensionRequest object itself.
     */
    public ImportExtensionRequest withAdministratorLoginPassword(String administratorLoginPassword) {
        this.administratorLoginPassword = administratorLoginPassword;
        return this;
    }

    /**
     * Get the authentication type. Possible values include: 'SQL', 'ADPassword'.
     *
     * @return the authenticationType value
     */
    public AuthenticationType authenticationType() {
        return this.authenticationType;
    }

    /**
     * Set the authentication type. Possible values include: 'SQL', 'ADPassword'.
     *
     * @param authenticationType the authenticationType value to set
     * @return the ImportExtensionRequest object itself.
     */
    public ImportExtensionRequest withAuthenticationType(AuthenticationType authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Get the type of import operation being performed. This is always Import.
     *
     * @return the operationMode value
     */
    public String operationMode() {
        return this.operationMode;
    }

    /**
     * Set the type of import operation being performed. This is always Import.
     *
     * @param operationMode the operationMode value to set
     * @return the ImportExtensionRequest object itself.
     */
    public ImportExtensionRequest withOperationMode(String operationMode) {
        this.operationMode = operationMode;
        return this;
    }

}
