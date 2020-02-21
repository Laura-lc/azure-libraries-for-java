// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql.models;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.management.CloudException;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * RecoverableDatabases.
 */
public final class RecoverableDatabasesInner {
    /**
     * The proxy service used to perform REST calls.
     */
    private RecoverableDatabasesService service;

    /**
     * The service client containing this operation class.
     */
    private SqlManagementClientImpl client;

    /**
     * Initializes an instance of RecoverableDatabasesInner.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    public RecoverableDatabasesInner(SqlManagementClientImpl client) {
        this.service = RestProxy.create(RecoverableDatabasesService.class, client.getHttpPipeline());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * SqlManagementClientRecoverableDatabases to be used by the proxy service
     * to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SqlManagementClientRecoverableDatabases")
    private interface RecoverableDatabasesService {
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/recoverableDatabases/{databaseName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<RecoverableDatabaseInner>> get(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("databaseName") String databaseName, @QueryParam("api-version") String apiVersion);

        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/recoverableDatabases")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<RecoverableDatabaseListResultInner>> listByServer(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @QueryParam("api-version") String apiVersion);
    }

    /**
     * Gets a recoverable database, which is a resource representing a database's geo backup.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param databaseName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<RecoverableDatabaseInner>> getWithResponseAsync(String resourceGroupName, String serverName, String databaseName) {
        final String apiVersion = "2014-04-01";
        return service.get(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, serverName, databaseName, apiVersion);
    }

    /**
     * Gets a recoverable database, which is a resource representing a database's geo backup.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param databaseName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RecoverableDatabaseInner> getAsync(String resourceGroupName, String serverName, String databaseName) {
        return getWithResponseAsync(resourceGroupName, serverName, databaseName)
            .flatMap((SimpleResponse<RecoverableDatabaseInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Gets a recoverable database, which is a resource representing a database's geo backup.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param databaseName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public RecoverableDatabaseInner get(String resourceGroupName, String serverName, String databaseName) {
        return getAsync(resourceGroupName, serverName, databaseName).block();
    }

    /**
     * Gets a list of recoverable databases.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<RecoverableDatabaseInner>> listByServerSinglePageAsync(String resourceGroupName, String serverName) {
        final String apiVersion = "2014-04-01";
        return service.listByServer(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, serverName, apiVersion).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            null,
            null));
    }

    /**
     * Gets a list of recoverable databases.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<RecoverableDatabaseInner> listByServerAsync(String resourceGroupName, String serverName) {
        return new PagedFlux<>(
            () -> listByServerSinglePageAsync(resourceGroupName, serverName));
    }

    /**
     * Gets a list of recoverable databases.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<RecoverableDatabaseInner> listByServer(String resourceGroupName, String serverName) {
        return new PagedIterable<>(listByServerAsync(resourceGroupName, serverName));
    }
}
