// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql.models;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.management.CloudException;
import com.azure.core.util.polling.AsyncPollResponse;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * WorkloadGroups.
 */
public final class WorkloadGroupsInner {
    /**
     * The proxy service used to perform REST calls.
     */
    private WorkloadGroupsService service;

    /**
     * The service client containing this operation class.
     */
    private SqlManagementClientImpl client;

    /**
     * Initializes an instance of WorkloadGroupsInner.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    public WorkloadGroupsInner(SqlManagementClientImpl client) {
        this.service = RestProxy.create(WorkloadGroupsService.class, client.getHttpPipeline());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * SqlManagementClientWorkloadGroups to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SqlManagementClientWorkloadGroups")
    private interface WorkloadGroupsService {
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/databases/{databaseName}/workloadGroups/{workloadGroupName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<WorkloadGroupInner>> get(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("databaseName") String databaseName, @PathParam("workloadGroupName") String workloadGroupName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/databases/{databaseName}/workloadGroups/{workloadGroupName}")
        @ExpectedResponses({200, 201, 202})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdate(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("databaseName") String databaseName, @PathParam("workloadGroupName") String workloadGroupName, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json") WorkloadGroupInner parameters, @QueryParam("api-version") String apiVersion);

        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/databases/{databaseName}/workloadGroups/{workloadGroupName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> delete(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("databaseName") String databaseName, @PathParam("workloadGroupName") String workloadGroupName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/databases/{databaseName}/workloadGroups")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<WorkloadGroupListResultInner>> listByDatabase(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("databaseName") String databaseName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/databases/{databaseName}/workloadGroups/{workloadGroupName}")
        @ExpectedResponses({200, 201, 202})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<WorkloadGroupInner>> beginCreateOrUpdate(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("databaseName") String databaseName, @PathParam("workloadGroupName") String workloadGroupName, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json") WorkloadGroupInner parameters, @QueryParam("api-version") String apiVersion);

        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/databases/{databaseName}/workloadGroups/{workloadGroupName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<Response<Void>> beginDelete(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("databaseName") String databaseName, @PathParam("workloadGroupName") String workloadGroupName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<WorkloadGroupListResultInner>> listByDatabaseNext(@PathParam(value = "nextLink", encoded = true) String nextLink);
    }

    /**
     * Gets a workload group.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param databaseName 
     * @param workloadGroupName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<WorkloadGroupInner>> getWithResponseAsync(String resourceGroupName, String serverName, String databaseName, String workloadGroupName) {
        final String apiVersion = "2019-06-01-preview";
        return service.get(this.client.getHost(), resourceGroupName, serverName, databaseName, workloadGroupName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Gets a workload group.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param databaseName 
     * @param workloadGroupName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<WorkloadGroupInner> getAsync(String resourceGroupName, String serverName, String databaseName, String workloadGroupName) {
        return getWithResponseAsync(resourceGroupName, serverName, databaseName, workloadGroupName)
            .flatMap((SimpleResponse<WorkloadGroupInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Gets a workload group.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param databaseName 
     * @param workloadGroupName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public WorkloadGroupInner get(String resourceGroupName, String serverName, String databaseName, String workloadGroupName) {
        return getAsync(resourceGroupName, serverName, databaseName, workloadGroupName).block();
    }

    /**
     * Creates or updates a workload group.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param databaseName 
     * @param workloadGroupName 
     * @param parameters Workload group operations for a data warehouse.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(String resourceGroupName, String serverName, String databaseName, String workloadGroupName, WorkloadGroupInner parameters) {
        final String apiVersion = "2019-06-01-preview";
        return service.createOrUpdate(this.client.getHost(), resourceGroupName, serverName, databaseName, workloadGroupName, this.client.getSubscriptionId(), parameters, apiVersion);
    }

    /**
     * Creates or updates a workload group.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param databaseName 
     * @param workloadGroupName 
     * @param parameters Workload group operations for a data warehouse.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<WorkloadGroupInner> createOrUpdateAsync(String resourceGroupName, String serverName, String databaseName, String workloadGroupName, WorkloadGroupInner parameters) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> response = createOrUpdateWithResponseAsync(resourceGroupName, serverName, databaseName, workloadGroupName, parameters);
        return client.<WorkloadGroupInner, WorkloadGroupInner>getLroResultAsync(response, client.getHttpPipeline(), WorkloadGroupInner.class, WorkloadGroupInner.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Creates or updates a workload group.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param databaseName 
     * @param workloadGroupName 
     * @param parameters Workload group operations for a data warehouse.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public WorkloadGroupInner createOrUpdate(String resourceGroupName, String serverName, String databaseName, String workloadGroupName, WorkloadGroupInner parameters) {
        return createOrUpdateAsync(resourceGroupName, serverName, databaseName, workloadGroupName, parameters).block();
    }

    /**
     * Deletes a workload group.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param databaseName 
     * @param workloadGroupName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> deleteWithResponseAsync(String resourceGroupName, String serverName, String databaseName, String workloadGroupName) {
        final String apiVersion = "2019-06-01-preview";
        return service.delete(this.client.getHost(), resourceGroupName, serverName, databaseName, workloadGroupName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Deletes a workload group.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param databaseName 
     * @param workloadGroupName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String resourceGroupName, String serverName, String databaseName, String workloadGroupName) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> response = deleteWithResponseAsync(resourceGroupName, serverName, databaseName, workloadGroupName);
        return client.<Void, Void>getLroResultAsync(response, client.getHttpPipeline(), Void.class, Void.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Deletes a workload group.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param databaseName 
     * @param workloadGroupName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String serverName, String databaseName, String workloadGroupName) {
        deleteAsync(resourceGroupName, serverName, databaseName, workloadGroupName).block();
    }

    /**
     * Gets the list of workload groups.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param databaseName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<WorkloadGroupInner>> listByDatabaseSinglePageAsync(String resourceGroupName, String serverName, String databaseName) {
        final String apiVersion = "2019-06-01-preview";
        return service.listByDatabase(this.client.getHost(), resourceGroupName, serverName, databaseName, this.client.getSubscriptionId(), apiVersion).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().getValue(),
            res.getValue().getNextLink(),
            null));
    }

    /**
     * Gets the list of workload groups.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param databaseName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<WorkloadGroupInner> listByDatabaseAsync(String resourceGroupName, String serverName, String databaseName) {
        return new PagedFlux<>(
            () -> listByDatabaseSinglePageAsync(resourceGroupName, serverName, databaseName),
            nextLink -> listByDatabaseNextSinglePageAsync(nextLink));
    }

    /**
     * Gets the list of workload groups.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param databaseName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<WorkloadGroupInner> listByDatabase(String resourceGroupName, String serverName, String databaseName) {
        return new PagedIterable<>(listByDatabaseAsync(resourceGroupName, serverName, databaseName));
    }

    /**
     * Creates or updates a workload group.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param databaseName 
     * @param workloadGroupName 
     * @param parameters Workload group operations for a data warehouse.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<WorkloadGroupInner>> beginCreateOrUpdateWithResponseAsync(String resourceGroupName, String serverName, String databaseName, String workloadGroupName, WorkloadGroupInner parameters) {
        final String apiVersion = "2019-06-01-preview";
        return service.beginCreateOrUpdate(this.client.getHost(), resourceGroupName, serverName, databaseName, workloadGroupName, this.client.getSubscriptionId(), parameters, apiVersion);
    }

    /**
     * Creates or updates a workload group.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param databaseName 
     * @param workloadGroupName 
     * @param parameters Workload group operations for a data warehouse.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<WorkloadGroupInner> beginCreateOrUpdateAsync(String resourceGroupName, String serverName, String databaseName, String workloadGroupName, WorkloadGroupInner parameters) {
        return beginCreateOrUpdateWithResponseAsync(resourceGroupName, serverName, databaseName, workloadGroupName, parameters)
            .flatMap((SimpleResponse<WorkloadGroupInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Creates or updates a workload group.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param databaseName 
     * @param workloadGroupName 
     * @param parameters Workload group operations for a data warehouse.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public WorkloadGroupInner beginCreateOrUpdate(String resourceGroupName, String serverName, String databaseName, String workloadGroupName, WorkloadGroupInner parameters) {
        return beginCreateOrUpdateAsync(resourceGroupName, serverName, databaseName, workloadGroupName, parameters).block();
    }

    /**
     * Deletes a workload group.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param databaseName 
     * @param workloadGroupName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> beginDeleteWithResponseAsync(String resourceGroupName, String serverName, String databaseName, String workloadGroupName) {
        final String apiVersion = "2019-06-01-preview";
        return service.beginDelete(this.client.getHost(), resourceGroupName, serverName, databaseName, workloadGroupName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Deletes a workload group.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param databaseName 
     * @param workloadGroupName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> beginDeleteAsync(String resourceGroupName, String serverName, String databaseName, String workloadGroupName) {
        return beginDeleteWithResponseAsync(resourceGroupName, serverName, databaseName, workloadGroupName)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Deletes a workload group.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param databaseName 
     * @param workloadGroupName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDelete(String resourceGroupName, String serverName, String databaseName, String workloadGroupName) {
        beginDeleteAsync(resourceGroupName, serverName, databaseName, workloadGroupName).block();
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink null
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<WorkloadGroupInner>> listByDatabaseNextSinglePageAsync(String nextLink) {
        return service.listByDatabaseNext(nextLink).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().getValue(),
            res.getValue().getNextLink(),
            null));
    }
}
