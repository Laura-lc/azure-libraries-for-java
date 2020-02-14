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
 * ElasticPoolDatabaseActivities.
 */
public final class ElasticPoolDatabaseActivitiesInner {
    /**
     * The proxy service used to perform REST calls.
     */
    private ElasticPoolDatabaseActivitiesService service;

    /**
     * The service client containing this operation class.
     */
    private SqlManagementClientImpl client;

    /**
     * Initializes an instance of ElasticPoolDatabaseActivitiesInner.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    public ElasticPoolDatabaseActivitiesInner(SqlManagementClientImpl client) {
        this.service = RestProxy.create(ElasticPoolDatabaseActivitiesService.class, client.getHttpPipeline());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * SqlManagementClientElasticPoolDatabaseActivities to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SqlManagementClientElasticPoolDatabaseActivities")
    private interface ElasticPoolDatabaseActivitiesService {
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/elasticPools/{elasticPoolName}/elasticPoolDatabaseActivity")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ElasticPoolDatabaseActivityListResultInner>> listByElasticPool(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("elasticPoolName") String elasticPoolName, @QueryParam("api-version") String apiVersion);
    }

    /**
     * Returns activity on databases inside of an elastic pool.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param elasticPoolName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<ElasticPoolDatabaseActivityInner>> listByElasticPoolSinglePageAsync(String resourceGroupName, String serverName, String elasticPoolName) {
        final String apiVersion = "2014-04-01";
        return service.listByElasticPool(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, serverName, elasticPoolName, apiVersion).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().getValue(),
            null,
            null));
    }

    /**
     * Returns activity on databases inside of an elastic pool.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param elasticPoolName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<ElasticPoolDatabaseActivityInner> listByElasticPoolAsync(String resourceGroupName, String serverName, String elasticPoolName) {
        return new PagedFlux<>(
            () -> listByElasticPoolSinglePageAsync(resourceGroupName, serverName, elasticPoolName));
    }

    /**
     * Returns activity on databases inside of an elastic pool.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param elasticPoolName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ElasticPoolDatabaseActivityInner> listByElasticPool(String resourceGroupName, String serverName, String elasticPoolName) {
        return new PagedIterable<>(listByElasticPoolAsync(resourceGroupName, serverName, elasticPoolName));
    }
}
