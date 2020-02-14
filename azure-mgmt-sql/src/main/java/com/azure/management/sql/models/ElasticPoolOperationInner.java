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
import java.time.OffsetDateTime;

/**
 * The ElasticPoolOperation model.
 */
@JsonFlatten
@Immutable
public class ElasticPoolOperationInner extends ProxyResource {
    /*
     * The name of the elastic pool the operation is being performed on.
     */
    @JsonProperty(value = "properties.elasticPoolName", access = JsonProperty.Access.WRITE_ONLY)
    private String elasticPoolName;

    /*
     * The name of operation.
     */
    @JsonProperty(value = "properties.operation", access = JsonProperty.Access.WRITE_ONLY)
    private String operation;

    /*
     * The friendly name of operation.
     */
    @JsonProperty(value = "properties.operationFriendlyName", access = JsonProperty.Access.WRITE_ONLY)
    private String operationFriendlyName;

    /*
     * The percentage of the operation completed.
     */
    @JsonProperty(value = "properties.percentComplete", access = JsonProperty.Access.WRITE_ONLY)
    private Integer percentComplete;

    /*
     * The name of the server.
     */
    @JsonProperty(value = "properties.serverName", access = JsonProperty.Access.WRITE_ONLY)
    private String serverName;

    /*
     * The operation start time.
     */
    @JsonProperty(value = "properties.startTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime startTime;

    /*
     * The operation state.
     */
    @JsonProperty(value = "properties.state", access = JsonProperty.Access.WRITE_ONLY)
    private String state;

    /*
     * The operation error code.
     */
    @JsonProperty(value = "properties.errorCode", access = JsonProperty.Access.WRITE_ONLY)
    private Integer errorCode;

    /*
     * The operation error description.
     */
    @JsonProperty(value = "properties.errorDescription", access = JsonProperty.Access.WRITE_ONLY)
    private String errorDescription;

    /*
     * The operation error severity.
     */
    @JsonProperty(value = "properties.errorSeverity", access = JsonProperty.Access.WRITE_ONLY)
    private Integer errorSeverity;

    /*
     * Whether or not the error is a user error.
     */
    @JsonProperty(value = "properties.isUserError", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isUserError;

    /*
     * The estimated completion time of the operation.
     */
    @JsonProperty(value = "properties.estimatedCompletionTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime estimatedCompletionTime;

    /*
     * The operation description.
     */
    @JsonProperty(value = "properties.description", access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /*
     * Whether the operation can be cancelled.
     */
    @JsonProperty(value = "properties.isCancellable", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isCancellable;

    /**
     * Get the elasticPoolName property: The name of the elastic pool the
     * operation is being performed on.
     * 
     * @return the elasticPoolName value.
     */
    public String getElasticPoolName() {
        return this.elasticPoolName;
    }

    /**
     * Get the operation property: The name of operation.
     * 
     * @return the operation value.
     */
    public String getOperation() {
        return this.operation;
    }

    /**
     * Get the operationFriendlyName property: The friendly name of operation.
     * 
     * @return the operationFriendlyName value.
     */
    public String getOperationFriendlyName() {
        return this.operationFriendlyName;
    }

    /**
     * Get the percentComplete property: The percentage of the operation
     * completed.
     * 
     * @return the percentComplete value.
     */
    public Integer getPercentComplete() {
        return this.percentComplete;
    }

    /**
     * Get the serverName property: The name of the server.
     * 
     * @return the serverName value.
     */
    public String getServerName() {
        return this.serverName;
    }

    /**
     * Get the startTime property: The operation start time.
     * 
     * @return the startTime value.
     */
    public OffsetDateTime getStartTime() {
        return this.startTime;
    }

    /**
     * Get the state property: The operation state.
     * 
     * @return the state value.
     */
    public String getState() {
        return this.state;
    }

    /**
     * Get the errorCode property: The operation error code.
     * 
     * @return the errorCode value.
     */
    public Integer getErrorCode() {
        return this.errorCode;
    }

    /**
     * Get the errorDescription property: The operation error description.
     * 
     * @return the errorDescription value.
     */
    public String getErrorDescription() {
        return this.errorDescription;
    }

    /**
     * Get the errorSeverity property: The operation error severity.
     * 
     * @return the errorSeverity value.
     */
    public Integer getErrorSeverity() {
        return this.errorSeverity;
    }

    /**
     * Get the isUserError property: Whether or not the error is a user error.
     * 
     * @return the isUserError value.
     */
    public Boolean isUserError() {
        return this.isUserError;
    }

    /**
     * Get the estimatedCompletionTime property: The estimated completion time
     * of the operation.
     * 
     * @return the estimatedCompletionTime value.
     */
    public OffsetDateTime getEstimatedCompletionTime() {
        return this.estimatedCompletionTime;
    }

    /**
     * Get the description property: The operation description.
     * 
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Get the isCancellable property: Whether the operation can be cancelled.
     * 
     * @return the isCancellable value.
     */
    public Boolean isCancellable() {
        return this.isCancellable;
    }
}
