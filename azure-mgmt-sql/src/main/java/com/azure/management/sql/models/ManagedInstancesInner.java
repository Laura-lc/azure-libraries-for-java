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
import com.azure.core.annotation.Patch;
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
import com.azure.management.resources.fluentcore.collection.InnerSupportsDelete;
import com.azure.management.resources.fluentcore.collection.InnerSupportsGet;
import com.azure.management.resources.fluentcore.collection.InnerSupportsListing;
import com.azure.management.sql.ManagedInstanceUpdate;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * ManagedInstances.
 */
public final class ManagedInstancesInner implements InnerSupportsGet<ManagedInstanceInner>, InnerSupportsListing<ManagedInstanceInner>, InnerSupportsDelete<Void> {
    /**
     * The proxy service used to perform REST calls.
     */
    private ManagedInstancesService service;

    /**
     * The service client containing this operation class.
     */
    private SqlManagementClientImpl client;

    /**
     * Initializes an instance of ManagedInstancesInner.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    public ManagedInstancesInner(SqlManagementClientImpl client) {
        this.service = RestProxy.create(ManagedInstancesService.class, client.getHttpPipeline());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * SqlManagementClientManagedInstances to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SqlManagementClientManagedInstances")
    private interface ManagedInstancesService {
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/instancePools/{instancePoolName}/managedInstances")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ManagedInstanceListResultInner>> listByInstancePool(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("instancePoolName") String instancePoolName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/managedInstances")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ManagedInstanceListResultInner>> listByResourceGroup(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/managedInstances/{managedInstanceName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ManagedInstanceInner>> getByResourceGroup(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("managedInstanceName") String managedInstanceName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/managedInstances/{managedInstanceName}")
        @ExpectedResponses({200, 201, 202})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdate(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("managedInstanceName") String managedInstanceName, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json") ManagedInstanceInner parameters, @QueryParam("api-version") String apiVersion);

        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/managedInstances/{managedInstanceName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> delete(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("managedInstanceName") String managedInstanceName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Patch("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/managedInstances/{managedInstanceName}")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> update(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("managedInstanceName") String managedInstanceName, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json") ManagedInstanceUpdate parameters, @QueryParam("api-version") String apiVersion);

        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.Sql/managedInstances")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ManagedInstanceListResultInner>> list(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/managedInstances/{managedInstanceName}")
        @ExpectedResponses({200, 201, 202})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ManagedInstanceInner>> beginCreateOrUpdate(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("managedInstanceName") String managedInstanceName, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json") ManagedInstanceInner parameters, @QueryParam("api-version") String apiVersion);

        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/managedInstances/{managedInstanceName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<Response<Void>> beginDelete(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("managedInstanceName") String managedInstanceName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Patch("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/managedInstances/{managedInstanceName}")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ManagedInstanceInner>> beginUpdate(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("managedInstanceName") String managedInstanceName, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json") ManagedInstanceUpdate parameters, @QueryParam("api-version") String apiVersion);

        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ManagedInstanceListResultInner>> listByInstancePoolNext(@PathParam(value = "nextLink", encoded = true) String nextLink);

        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ManagedInstanceListResultInner>> listByResourceGroupNext(@PathParam(value = "nextLink", encoded = true) String nextLink);

        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ManagedInstanceListResultInner>> listNext(@PathParam(value = "nextLink", encoded = true) String nextLink);
    }

    /**
     * Gets a list of all managed instances in an instance pool.
     * 
     * @param resourceGroupName 
     * @param instancePoolName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<ManagedInstanceInner>> listByInstancePoolSinglePageAsync(String resourceGroupName, String instancePoolName) {
        final String apiVersion = "2018-06-01-preview";
        return service.listByInstancePool(this.client.getHost(), resourceGroupName, instancePoolName, this.client.getSubscriptionId(), apiVersion).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().getValue(),
            res.getValue().getNextLink(),
            null));
    }

    /**
     * Gets a list of all managed instances in an instance pool.
     * 
     * @param resourceGroupName 
     * @param instancePoolName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<ManagedInstanceInner> listByInstancePoolAsync(String resourceGroupName, String instancePoolName) {
        return new PagedFlux<>(
            () -> listByInstancePoolSinglePageAsync(resourceGroupName, instancePoolName),
            nextLink -> listByInstancePoolNextSinglePageAsync(nextLink));
    }

    /**
     * Gets a list of all managed instances in an instance pool.
     * 
     * @param resourceGroupName 
     * @param instancePoolName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ManagedInstanceInner> listByInstancePool(String resourceGroupName, String instancePoolName) {
        return new PagedIterable<>(listByInstancePoolAsync(resourceGroupName, instancePoolName));
    }

    /**
     * Gets a list of managed instances in a resource group.
     * 
     * @param resourceGroupName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<ManagedInstanceInner>> listByResourceGroupSinglePageAsync(String resourceGroupName) {
        final String apiVersion = "2018-06-01-preview";
        return service.listByResourceGroup(this.client.getHost(), resourceGroupName, this.client.getSubscriptionId(), apiVersion).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().getValue(),
            res.getValue().getNextLink(),
            null));
    }

    /**
     * Gets a list of managed instances in a resource group.
     * 
     * @param resourceGroupName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<ManagedInstanceInner> listByResourceGroupAsync(String resourceGroupName) {
        return new PagedFlux<>(
            () -> listByResourceGroupSinglePageAsync(resourceGroupName),
            nextLink -> listByResourceGroupNextSinglePageAsync(nextLink));
    }

    /**
     * Gets a list of managed instances in a resource group.
     * 
     * @param resourceGroupName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ManagedInstanceInner> listByResourceGroup(String resourceGroupName) {
        return new PagedIterable<>(listByResourceGroupAsync(resourceGroupName));
    }

    /**
     * Gets a managed instance.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<ManagedInstanceInner>> getByResourceGroupWithResponseAsync(String resourceGroupName, String managedInstanceName) {
        final String apiVersion = "2018-06-01-preview";
        return service.getByResourceGroup(this.client.getHost(), resourceGroupName, managedInstanceName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Gets a managed instance.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ManagedInstanceInner> getByResourceGroupAsync(String resourceGroupName, String managedInstanceName) {
        return getByResourceGroupWithResponseAsync(resourceGroupName, managedInstanceName)
            .flatMap((SimpleResponse<ManagedInstanceInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Gets a managed instance.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ManagedInstanceInner getByResourceGroup(String resourceGroupName, String managedInstanceName) {
        return getByResourceGroupAsync(resourceGroupName, managedInstanceName).block();
    }

    /**
     * Creates or updates a managed instance.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @param parameters An Azure SQL managed instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(String resourceGroupName, String managedInstanceName, ManagedInstanceInner parameters) {
        final String apiVersion = "2018-06-01-preview";
        return service.createOrUpdate(this.client.getHost(), resourceGroupName, managedInstanceName, this.client.getSubscriptionId(), parameters, apiVersion);
    }

    /**
     * Creates or updates a managed instance.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @param parameters An Azure SQL managed instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ManagedInstanceInner> createOrUpdateAsync(String resourceGroupName, String managedInstanceName, ManagedInstanceInner parameters) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> response = createOrUpdateWithResponseAsync(resourceGroupName, managedInstanceName, parameters);
        return client.<ManagedInstanceInner, ManagedInstanceInner>getLroResultAsync(response, client.getHttpPipeline(), ManagedInstanceInner.class, ManagedInstanceInner.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Creates or updates a managed instance.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @param parameters An Azure SQL managed instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ManagedInstanceInner createOrUpdate(String resourceGroupName, String managedInstanceName, ManagedInstanceInner parameters) {
        return createOrUpdateAsync(resourceGroupName, managedInstanceName, parameters).block();
    }

    /**
     * Deletes a managed instance.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> deleteWithResponseAsync(String resourceGroupName, String managedInstanceName) {
        final String apiVersion = "2018-06-01-preview";
        return service.delete(this.client.getHost(), resourceGroupName, managedInstanceName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Deletes a managed instance.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String resourceGroupName, String managedInstanceName) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> response = deleteWithResponseAsync(resourceGroupName, managedInstanceName);
        return client.<Void, Void>getLroResultAsync(response, client.getHttpPipeline(), Void.class, Void.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Deletes a managed instance.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String managedInstanceName) {
        deleteAsync(resourceGroupName, managedInstanceName).block();
    }

    /**
     * Updates a managed instance.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @param parameters An update request for an Azure SQL Database managed instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> updateWithResponseAsync(String resourceGroupName, String managedInstanceName, ManagedInstanceUpdate parameters) {
        final String apiVersion = "2018-06-01-preview";
        return service.update(this.client.getHost(), resourceGroupName, managedInstanceName, this.client.getSubscriptionId(), parameters, apiVersion);
    }

    /**
     * Updates a managed instance.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @param parameters An update request for an Azure SQL Database managed instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ManagedInstanceInner> updateAsync(String resourceGroupName, String managedInstanceName, ManagedInstanceUpdate parameters) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> response = updateWithResponseAsync(resourceGroupName, managedInstanceName, parameters);
        return client.<ManagedInstanceInner, ManagedInstanceInner>getLroResultAsync(response, client.getHttpPipeline(), ManagedInstanceInner.class, ManagedInstanceInner.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Updates a managed instance.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @param parameters An update request for an Azure SQL Database managed instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ManagedInstanceInner update(String resourceGroupName, String managedInstanceName, ManagedInstanceUpdate parameters) {
        return updateAsync(resourceGroupName, managedInstanceName, parameters).block();
    }

    /**
     * Gets a list of all managed instances in the subscription.
     * 
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<ManagedInstanceInner>> listSinglePageAsync() {
        final String apiVersion = "2018-06-01-preview";
        return service.list(this.client.getHost(), this.client.getSubscriptionId(), apiVersion).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().getValue(),
            res.getValue().getNextLink(),
            null));
    }

    /**
     * Gets a list of all managed instances in the subscription.
     * 
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<ManagedInstanceInner> listAsync() {
        return new PagedFlux<>(
            () -> listSinglePageAsync(),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Gets a list of all managed instances in the subscription.
     * 
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ManagedInstanceInner> list() {
        return new PagedIterable<>(listAsync());
    }

    /**
     * Creates or updates a managed instance.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @param parameters An Azure SQL managed instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<ManagedInstanceInner>> beginCreateOrUpdateWithResponseAsync(String resourceGroupName, String managedInstanceName, ManagedInstanceInner parameters) {
        final String apiVersion = "2018-06-01-preview";
        return service.beginCreateOrUpdate(this.client.getHost(), resourceGroupName, managedInstanceName, this.client.getSubscriptionId(), parameters, apiVersion);
    }

    /**
     * Creates or updates a managed instance.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @param parameters An Azure SQL managed instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ManagedInstanceInner> beginCreateOrUpdateAsync(String resourceGroupName, String managedInstanceName, ManagedInstanceInner parameters) {
        return beginCreateOrUpdateWithResponseAsync(resourceGroupName, managedInstanceName, parameters)
            .flatMap((SimpleResponse<ManagedInstanceInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Creates or updates a managed instance.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @param parameters An Azure SQL managed instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ManagedInstanceInner beginCreateOrUpdate(String resourceGroupName, String managedInstanceName, ManagedInstanceInner parameters) {
        return beginCreateOrUpdateAsync(resourceGroupName, managedInstanceName, parameters).block();
    }

    /**
     * Deletes a managed instance.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> beginDeleteWithResponseAsync(String resourceGroupName, String managedInstanceName) {
        final String apiVersion = "2018-06-01-preview";
        return service.beginDelete(this.client.getHost(), resourceGroupName, managedInstanceName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Deletes a managed instance.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> beginDeleteAsync(String resourceGroupName, String managedInstanceName) {
        return beginDeleteWithResponseAsync(resourceGroupName, managedInstanceName)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Deletes a managed instance.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDelete(String resourceGroupName, String managedInstanceName) {
        beginDeleteAsync(resourceGroupName, managedInstanceName).block();
    }

    /**
     * Updates a managed instance.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @param parameters An update request for an Azure SQL Database managed instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<ManagedInstanceInner>> beginUpdateWithResponseAsync(String resourceGroupName, String managedInstanceName, ManagedInstanceUpdate parameters) {
        final String apiVersion = "2018-06-01-preview";
        return service.beginUpdate(this.client.getHost(), resourceGroupName, managedInstanceName, this.client.getSubscriptionId(), parameters, apiVersion);
    }

    /**
     * Updates a managed instance.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @param parameters An update request for an Azure SQL Database managed instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ManagedInstanceInner> beginUpdateAsync(String resourceGroupName, String managedInstanceName, ManagedInstanceUpdate parameters) {
        return beginUpdateWithResponseAsync(resourceGroupName, managedInstanceName, parameters)
            .flatMap((SimpleResponse<ManagedInstanceInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Updates a managed instance.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @param parameters An update request for an Azure SQL Database managed instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ManagedInstanceInner beginUpdate(String resourceGroupName, String managedInstanceName, ManagedInstanceUpdate parameters) {
        return beginUpdateAsync(resourceGroupName, managedInstanceName, parameters).block();
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
    public Mono<PagedResponse<ManagedInstanceInner>> listByInstancePoolNextSinglePageAsync(String nextLink) {
        return service.listByInstancePoolNext(nextLink).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().getValue(),
            res.getValue().getNextLink(),
            null));
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
    public Mono<PagedResponse<ManagedInstanceInner>> listByResourceGroupNextSinglePageAsync(String nextLink) {
        return service.listByResourceGroupNext(nextLink).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().getValue(),
            res.getValue().getNextLink(),
            null));
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
    public Mono<PagedResponse<ManagedInstanceInner>> listNextSinglePageAsync(String nextLink) {
        return service.listNext(nextLink).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().getValue(),
            res.getValue().getNextLink(),
            null));
    }
}
