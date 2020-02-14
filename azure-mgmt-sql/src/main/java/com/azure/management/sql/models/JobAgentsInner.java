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
import com.azure.management.sql.JobAgentUpdate;
import java.nio.ByteBuffer;
import java.util.Map;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * JobAgents.
 */
public final class JobAgentsInner {
    /**
     * The proxy service used to perform REST calls.
     */
    private JobAgentsService service;

    /**
     * The service client containing this operation class.
     */
    private SqlManagementClientImpl client;

    /**
     * Initializes an instance of JobAgentsInner.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    public JobAgentsInner(SqlManagementClientImpl client) {
        this.service = RestProxy.create(JobAgentsService.class, client.getHttpPipeline());
        this.client = client;
    }

    /**
     * The interface defining all the services for SqlManagementClientJobAgents
     * to be used by the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SqlManagementClientJobAgents")
    private interface JobAgentsService {
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/jobAgents")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<JobAgentListResultInner>> listByServer(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/jobAgents/{jobAgentName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<JobAgentInner>> get(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("jobAgentName") String jobAgentName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/jobAgents/{jobAgentName}")
        @ExpectedResponses({200, 201, 202})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdate(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("jobAgentName") String jobAgentName, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json") JobAgentInner parameters, @QueryParam("api-version") String apiVersion);

        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/jobAgents/{jobAgentName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> delete(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("jobAgentName") String jobAgentName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Patch("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/jobAgents/{jobAgentName}")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> update(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("jobAgentName") String jobAgentName, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json") JobAgentUpdate parameters, @QueryParam("api-version") String apiVersion);

        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/jobAgents/{jobAgentName}")
        @ExpectedResponses({200, 201, 202})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<JobAgentInner>> beginCreateOrUpdate(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("jobAgentName") String jobAgentName, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json") JobAgentInner parameters, @QueryParam("api-version") String apiVersion);

        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/jobAgents/{jobAgentName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<Response<Void>> beginDelete(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("jobAgentName") String jobAgentName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Patch("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/jobAgents/{jobAgentName}")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<JobAgentInner>> beginUpdate(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("jobAgentName") String jobAgentName, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json") JobAgentUpdate parameters, @QueryParam("api-version") String apiVersion);

        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<JobAgentListResultInner>> listByServerNext(@PathParam(value = "nextLink", encoded = true) String nextLink);
    }

    /**
     * Gets a list of job agents in a server.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<JobAgentInner>> listByServerSinglePageAsync(String resourceGroupName, String serverName) {
        final String apiVersion = "2017-03-01-preview";
        return service.listByServer(this.client.getHost(), resourceGroupName, serverName, this.client.getSubscriptionId(), apiVersion).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().getValue(),
            res.getValue().getNextLink(),
            null));
    }

    /**
     * Gets a list of job agents in a server.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<JobAgentInner> listByServerAsync(String resourceGroupName, String serverName) {
        return new PagedFlux<>(
            () -> listByServerSinglePageAsync(resourceGroupName, serverName),
            nextLink -> listByServerNextSinglePageAsync(nextLink));
    }

    /**
     * Gets a list of job agents in a server.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<JobAgentInner> listByServer(String resourceGroupName, String serverName) {
        return new PagedIterable<>(listByServerAsync(resourceGroupName, serverName));
    }

    /**
     * Gets a job agent.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param jobAgentName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<JobAgentInner>> getWithResponseAsync(String resourceGroupName, String serverName, String jobAgentName) {
        final String apiVersion = "2017-03-01-preview";
        return service.get(this.client.getHost(), resourceGroupName, serverName, jobAgentName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Gets a job agent.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param jobAgentName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<JobAgentInner> getAsync(String resourceGroupName, String serverName, String jobAgentName) {
        return getWithResponseAsync(resourceGroupName, serverName, jobAgentName)
            .flatMap((SimpleResponse<JobAgentInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Gets a job agent.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param jobAgentName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public JobAgentInner get(String resourceGroupName, String serverName, String jobAgentName) {
        return getAsync(resourceGroupName, serverName, jobAgentName).block();
    }

    /**
     * Creates or updates a job agent.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param jobAgentName 
     * @param parameters An Azure SQL job agent.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(String resourceGroupName, String serverName, String jobAgentName, JobAgentInner parameters) {
        final String apiVersion = "2017-03-01-preview";
        return service.createOrUpdate(this.client.getHost(), resourceGroupName, serverName, jobAgentName, this.client.getSubscriptionId(), parameters, apiVersion);
    }

    /**
     * Creates or updates a job agent.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param jobAgentName 
     * @param parameters An Azure SQL job agent.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<JobAgentInner> createOrUpdateAsync(String resourceGroupName, String serverName, String jobAgentName, JobAgentInner parameters) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> response = createOrUpdateWithResponseAsync(resourceGroupName, serverName, jobAgentName, parameters);
        return client.<JobAgentInner, JobAgentInner>getLroResultAsync(response, client.getHttpPipeline(), JobAgentInner.class, JobAgentInner.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Creates or updates a job agent.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param jobAgentName 
     * @param parameters An Azure SQL job agent.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public JobAgentInner createOrUpdate(String resourceGroupName, String serverName, String jobAgentName, JobAgentInner parameters) {
        return createOrUpdateAsync(resourceGroupName, serverName, jobAgentName, parameters).block();
    }

    /**
     * Deletes a job agent.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param jobAgentName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> deleteWithResponseAsync(String resourceGroupName, String serverName, String jobAgentName) {
        final String apiVersion = "2017-03-01-preview";
        return service.delete(this.client.getHost(), resourceGroupName, serverName, jobAgentName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Deletes a job agent.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param jobAgentName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String resourceGroupName, String serverName, String jobAgentName) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> response = deleteWithResponseAsync(resourceGroupName, serverName, jobAgentName);
        return client.<Void, Void>getLroResultAsync(response, client.getHttpPipeline(), Void.class, Void.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Deletes a job agent.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param jobAgentName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String serverName, String jobAgentName) {
        deleteAsync(resourceGroupName, serverName, jobAgentName).block();
    }

    /**
     * Updates a job agent.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param jobAgentName 
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> updateWithResponseAsync(String resourceGroupName, String serverName, String jobAgentName, Map<String, String> tags) {
        final String apiVersion = "2017-03-01-preview";
        JobAgentUpdate parameters = new JobAgentUpdate();
        parameters.setTags(tags);
        return service.update(this.client.getHost(), resourceGroupName, serverName, jobAgentName, this.client.getSubscriptionId(), parameters, apiVersion);
    }

    /**
     * Updates a job agent.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param jobAgentName 
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<JobAgentInner> updateAsync(String resourceGroupName, String serverName, String jobAgentName, Map<String, String> tags) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> response = updateWithResponseAsync(resourceGroupName, serverName, jobAgentName, tags);
        return client.<JobAgentInner, JobAgentInner>getLroResultAsync(response, client.getHttpPipeline(), JobAgentInner.class, JobAgentInner.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Updates a job agent.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param jobAgentName 
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public JobAgentInner update(String resourceGroupName, String serverName, String jobAgentName, Map<String, String> tags) {
        return updateAsync(resourceGroupName, serverName, jobAgentName, tags).block();
    }

    /**
     * Creates or updates a job agent.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param jobAgentName 
     * @param parameters An Azure SQL job agent.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<JobAgentInner>> beginCreateOrUpdateWithResponseAsync(String resourceGroupName, String serverName, String jobAgentName, JobAgentInner parameters) {
        final String apiVersion = "2017-03-01-preview";
        return service.beginCreateOrUpdate(this.client.getHost(), resourceGroupName, serverName, jobAgentName, this.client.getSubscriptionId(), parameters, apiVersion);
    }

    /**
     * Creates or updates a job agent.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param jobAgentName 
     * @param parameters An Azure SQL job agent.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<JobAgentInner> beginCreateOrUpdateAsync(String resourceGroupName, String serverName, String jobAgentName, JobAgentInner parameters) {
        return beginCreateOrUpdateWithResponseAsync(resourceGroupName, serverName, jobAgentName, parameters)
            .flatMap((SimpleResponse<JobAgentInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Creates or updates a job agent.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param jobAgentName 
     * @param parameters An Azure SQL job agent.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public JobAgentInner beginCreateOrUpdate(String resourceGroupName, String serverName, String jobAgentName, JobAgentInner parameters) {
        return beginCreateOrUpdateAsync(resourceGroupName, serverName, jobAgentName, parameters).block();
    }

    /**
     * Deletes a job agent.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param jobAgentName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> beginDeleteWithResponseAsync(String resourceGroupName, String serverName, String jobAgentName) {
        final String apiVersion = "2017-03-01-preview";
        return service.beginDelete(this.client.getHost(), resourceGroupName, serverName, jobAgentName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Deletes a job agent.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param jobAgentName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> beginDeleteAsync(String resourceGroupName, String serverName, String jobAgentName) {
        return beginDeleteWithResponseAsync(resourceGroupName, serverName, jobAgentName)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Deletes a job agent.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param jobAgentName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDelete(String resourceGroupName, String serverName, String jobAgentName) {
        beginDeleteAsync(resourceGroupName, serverName, jobAgentName).block();
    }

    /**
     * Updates a job agent.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param jobAgentName 
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<JobAgentInner>> beginUpdateWithResponseAsync(String resourceGroupName, String serverName, String jobAgentName, Map<String, String> tags) {
        final String apiVersion = "2017-03-01-preview";
        JobAgentUpdate parameters = new JobAgentUpdate();
        parameters.setTags(tags);
        return service.beginUpdate(this.client.getHost(), resourceGroupName, serverName, jobAgentName, this.client.getSubscriptionId(), parameters, apiVersion);
    }

    /**
     * Updates a job agent.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param jobAgentName 
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<JobAgentInner> beginUpdateAsync(String resourceGroupName, String serverName, String jobAgentName, Map<String, String> tags) {
        return beginUpdateWithResponseAsync(resourceGroupName, serverName, jobAgentName, tags)
            .flatMap((SimpleResponse<JobAgentInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Updates a job agent.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param jobAgentName 
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public JobAgentInner beginUpdate(String resourceGroupName, String serverName, String jobAgentName, Map<String, String> tags) {
        return beginUpdateAsync(resourceGroupName, serverName, jobAgentName, tags).block();
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
    public Mono<PagedResponse<JobAgentInner>> listByServerNextSinglePageAsync(String nextLink) {
        return service.listByServerNext(nextLink).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().getValue(),
            res.getValue().getNextLink(),
            null));
    }
}
