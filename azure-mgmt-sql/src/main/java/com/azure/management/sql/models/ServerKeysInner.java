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
 * ServerKeys.
 */
public final class ServerKeysInner {
    /**
     * The proxy service used to perform REST calls.
     */
    private ServerKeysService service;

    /**
     * The service client containing this operation class.
     */
    private SqlManagementClientImpl client;

    /**
     * Initializes an instance of ServerKeysInner.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    public ServerKeysInner(SqlManagementClientImpl client) {
        this.service = RestProxy.create(ServerKeysService.class, client.getHttpPipeline());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * SqlManagementClientServerKeys to be used by the proxy service to perform
     * REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SqlManagementClientServerKeys")
    private interface ServerKeysService {
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/keys")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ServerKeyListResultInner>> listByServer(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/keys/{keyName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ServerKeyInner>> get(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("keyName") String keyName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/keys/{keyName}")
        @ExpectedResponses({200, 201, 202})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdate(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("keyName") String keyName, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json") ServerKeyInner parameters, @QueryParam("api-version") String apiVersion);

        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/keys/{keyName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> delete(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("keyName") String keyName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/keys/{keyName}")
        @ExpectedResponses({200, 201, 202})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ServerKeyInner>> beginCreateOrUpdate(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("keyName") String keyName, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json") ServerKeyInner parameters, @QueryParam("api-version") String apiVersion);

        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/keys/{keyName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<Response<Void>> beginDelete(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("keyName") String keyName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ServerKeyListResultInner>> listByServerNext(@PathParam(value = "nextLink", encoded = true) String nextLink);
    }

    /**
     * Gets a list of server keys.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<ServerKeyInner>> listByServerSinglePageAsync(String resourceGroupName, String serverName) {
        final String apiVersion = "2015-05-01-preview";
        return service.listByServer(this.client.getHost(), resourceGroupName, serverName, this.client.getSubscriptionId(), apiVersion).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }

    /**
     * Gets a list of server keys.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<ServerKeyInner> listByServerAsync(String resourceGroupName, String serverName) {
        return new PagedFlux<>(
            () -> listByServerSinglePageAsync(resourceGroupName, serverName),
            nextLink -> listByServerNextSinglePageAsync(nextLink));
    }

    /**
     * Gets a list of server keys.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ServerKeyInner> listByServer(String resourceGroupName, String serverName) {
        return new PagedIterable<>(listByServerAsync(resourceGroupName, serverName));
    }

    /**
     * Gets a server key.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param keyName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<ServerKeyInner>> getWithResponseAsync(String resourceGroupName, String serverName, String keyName) {
        final String apiVersion = "2015-05-01-preview";
        return service.get(this.client.getHost(), resourceGroupName, serverName, keyName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Gets a server key.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param keyName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ServerKeyInner> getAsync(String resourceGroupName, String serverName, String keyName) {
        return getWithResponseAsync(resourceGroupName, serverName, keyName)
            .flatMap((SimpleResponse<ServerKeyInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Gets a server key.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param keyName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ServerKeyInner get(String resourceGroupName, String serverName, String keyName) {
        return getAsync(resourceGroupName, serverName, keyName).block();
    }

    /**
     * Creates or updates a server key.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param keyName 
     * @param parameters A server key.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(String resourceGroupName, String serverName, String keyName, ServerKeyInner parameters) {
        final String apiVersion = "2015-05-01-preview";
        return service.createOrUpdate(this.client.getHost(), resourceGroupName, serverName, keyName, this.client.getSubscriptionId(), parameters, apiVersion);
    }

    /**
     * Creates or updates a server key.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param keyName 
     * @param parameters A server key.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ServerKeyInner> createOrUpdateAsync(String resourceGroupName, String serverName, String keyName, ServerKeyInner parameters) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> response = createOrUpdateWithResponseAsync(resourceGroupName, serverName, keyName, parameters);
        return client.<ServerKeyInner, ServerKeyInner>getLroResultAsync(response, client.getHttpPipeline(), ServerKeyInner.class, ServerKeyInner.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Creates or updates a server key.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param keyName 
     * @param parameters A server key.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ServerKeyInner createOrUpdate(String resourceGroupName, String serverName, String keyName, ServerKeyInner parameters) {
        return createOrUpdateAsync(resourceGroupName, serverName, keyName, parameters).block();
    }

    /**
     * Deletes the server key with the given name.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param keyName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> deleteWithResponseAsync(String resourceGroupName, String serverName, String keyName) {
        final String apiVersion = "2015-05-01-preview";
        return service.delete(this.client.getHost(), resourceGroupName, serverName, keyName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Deletes the server key with the given name.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param keyName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String resourceGroupName, String serverName, String keyName) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> response = deleteWithResponseAsync(resourceGroupName, serverName, keyName);
        return client.<Void, Void>getLroResultAsync(response, client.getHttpPipeline(), Void.class, Void.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Deletes the server key with the given name.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param keyName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String serverName, String keyName) {
        deleteAsync(resourceGroupName, serverName, keyName).block();
    }

    /**
     * Creates or updates a server key.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param keyName 
     * @param parameters A server key.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<ServerKeyInner>> beginCreateOrUpdateWithResponseAsync(String resourceGroupName, String serverName, String keyName, ServerKeyInner parameters) {
        final String apiVersion = "2015-05-01-preview";
        return service.beginCreateOrUpdate(this.client.getHost(), resourceGroupName, serverName, keyName, this.client.getSubscriptionId(), parameters, apiVersion);
    }

    /**
     * Creates or updates a server key.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param keyName 
     * @param parameters A server key.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ServerKeyInner> beginCreateOrUpdateAsync(String resourceGroupName, String serverName, String keyName, ServerKeyInner parameters) {
        return beginCreateOrUpdateWithResponseAsync(resourceGroupName, serverName, keyName, parameters)
            .flatMap((SimpleResponse<ServerKeyInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Creates or updates a server key.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param keyName 
     * @param parameters A server key.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ServerKeyInner beginCreateOrUpdate(String resourceGroupName, String serverName, String keyName, ServerKeyInner parameters) {
        return beginCreateOrUpdateAsync(resourceGroupName, serverName, keyName, parameters).block();
    }

    /**
     * Deletes the server key with the given name.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param keyName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> beginDeleteWithResponseAsync(String resourceGroupName, String serverName, String keyName) {
        final String apiVersion = "2015-05-01-preview";
        return service.beginDelete(this.client.getHost(), resourceGroupName, serverName, keyName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Deletes the server key with the given name.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param keyName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> beginDeleteAsync(String resourceGroupName, String serverName, String keyName) {
        return beginDeleteWithResponseAsync(resourceGroupName, serverName, keyName)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Deletes the server key with the given name.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param keyName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDelete(String resourceGroupName, String serverName, String keyName) {
        beginDeleteAsync(resourceGroupName, serverName, keyName).block();
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
    public Mono<PagedResponse<ServerKeyInner>> listByServerNextSinglePageAsync(String nextLink) {
        return service.listByServerNext(nextLink).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }
}
