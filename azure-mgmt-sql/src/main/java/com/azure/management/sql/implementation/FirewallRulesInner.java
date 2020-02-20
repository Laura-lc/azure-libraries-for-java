/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.azure.management.sql.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.HTTP;
import retrofit2.http.Path;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in FirewallRules.
 */
public class FirewallRulesInner {
    /** The Retrofit service to perform REST calls. */
    private FirewallRulesService service;
    /** The service client containing this operation class. */
    private SqlManagementClientImpl client;

    /**
     * Initializes an instance of FirewallRulesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public FirewallRulesInner(Retrofit retrofit, SqlManagementClientImpl client) {
        this.service = retrofit.create(FirewallRulesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for FirewallRules to be
     * used by Retrofit to perform actually REST calls.
     */
    interface FirewallRulesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.sql.FirewallRules createOrUpdate" })
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/firewallRules/{firewallRuleName}")
        Observable<Response<ResponseBody>> createOrUpdate(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("serverName") String serverName, @Path("firewallRuleName") String firewallRuleName, @Query("api-version") String apiVersion, @Body FirewallRuleInner parameters, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.sql.FirewallRules delete" })
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/firewallRules/{firewallRuleName}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> delete(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("serverName") String serverName, @Path("firewallRuleName") String firewallRuleName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.sql.FirewallRules get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/firewallRules/{firewallRuleName}")
        Observable<Response<ResponseBody>> get(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("serverName") String serverName, @Path("firewallRuleName") String firewallRuleName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.sql.FirewallRules listByServer" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/firewallRules")
        Observable<Response<ResponseBody>> listByServer(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("serverName") String serverName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Creates or updates a firewall rule.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param firewallRuleName The name of the firewall rule.
     * @param parameters The required parameters for creating or updating a firewall rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the FirewallRuleInner object if successful.
     */
    public FirewallRuleInner createOrUpdate(String resourceGroupName, String serverName, String firewallRuleName, FirewallRuleInner parameters) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, serverName, firewallRuleName, parameters).toBlocking().single().body();
    }

    /**
     * Creates or updates a firewall rule.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param firewallRuleName The name of the firewall rule.
     * @param parameters The required parameters for creating or updating a firewall rule.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<FirewallRuleInner> createOrUpdateAsync(String resourceGroupName, String serverName, String firewallRuleName, FirewallRuleInner parameters, final ServiceCallback<FirewallRuleInner> serviceCallback) {
        return ServiceFuture.fromResponse(createOrUpdateWithServiceResponseAsync(resourceGroupName, serverName, firewallRuleName, parameters), serviceCallback);
    }

    /**
     * Creates or updates a firewall rule.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param firewallRuleName The name of the firewall rule.
     * @param parameters The required parameters for creating or updating a firewall rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the FirewallRuleInner object
     */
    public Observable<FirewallRuleInner> createOrUpdateAsync(String resourceGroupName, String serverName, String firewallRuleName, FirewallRuleInner parameters) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, serverName, firewallRuleName, parameters).map(new Func1<ServiceResponse<FirewallRuleInner>, FirewallRuleInner>() {
            @Override
            public FirewallRuleInner call(ServiceResponse<FirewallRuleInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Creates or updates a firewall rule.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param firewallRuleName The name of the firewall rule.
     * @param parameters The required parameters for creating or updating a firewall rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the FirewallRuleInner object
     */
    public Observable<ServiceResponse<FirewallRuleInner>> createOrUpdateWithServiceResponseAsync(String resourceGroupName, String serverName, String firewallRuleName, FirewallRuleInner parameters) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverName == null) {
            throw new IllegalArgumentException("Parameter serverName is required and cannot be null.");
        }
        if (firewallRuleName == null) {
            throw new IllegalArgumentException("Parameter firewallRuleName is required and cannot be null.");
        }
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        Validator.validate(parameters);
        final String apiVersion = "2014-04-01";
        return service.createOrUpdate(this.client.subscriptionId(), resourceGroupName, serverName, firewallRuleName, apiVersion, parameters, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<FirewallRuleInner>>>() {
                @Override
                public Observable<ServiceResponse<FirewallRuleInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<FirewallRuleInner> clientResponse = createOrUpdateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<FirewallRuleInner> createOrUpdateDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<FirewallRuleInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<FirewallRuleInner>() { }.getType())
                .register(201, new TypeToken<FirewallRuleInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Deletes a firewall rule.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param firewallRuleName The name of the firewall rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void delete(String resourceGroupName, String serverName, String firewallRuleName) {
        deleteWithServiceResponseAsync(resourceGroupName, serverName, firewallRuleName).toBlocking().single().body();
    }

    /**
     * Deletes a firewall rule.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param firewallRuleName The name of the firewall rule.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> deleteAsync(String resourceGroupName, String serverName, String firewallRuleName, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(resourceGroupName, serverName, firewallRuleName), serviceCallback);
    }

    /**
     * Deletes a firewall rule.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param firewallRuleName The name of the firewall rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> deleteAsync(String resourceGroupName, String serverName, String firewallRuleName) {
        return deleteWithServiceResponseAsync(resourceGroupName, serverName, firewallRuleName).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Deletes a firewall rule.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param firewallRuleName The name of the firewall rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(String resourceGroupName, String serverName, String firewallRuleName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverName == null) {
            throw new IllegalArgumentException("Parameter serverName is required and cannot be null.");
        }
        if (firewallRuleName == null) {
            throw new IllegalArgumentException("Parameter firewallRuleName is required and cannot be null.");
        }
        final String apiVersion = "2014-04-01";
        return service.delete(this.client.subscriptionId(), resourceGroupName, serverName, firewallRuleName, apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = deleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> deleteDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .register(204, new TypeToken<Void>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets a firewall rule.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param firewallRuleName The name of the firewall rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the FirewallRuleInner object if successful.
     */
    public FirewallRuleInner get(String resourceGroupName, String serverName, String firewallRuleName) {
        return getWithServiceResponseAsync(resourceGroupName, serverName, firewallRuleName).toBlocking().single().body();
    }

    /**
     * Gets a firewall rule.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param firewallRuleName The name of the firewall rule.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<FirewallRuleInner> getAsync(String resourceGroupName, String serverName, String firewallRuleName, final ServiceCallback<FirewallRuleInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, serverName, firewallRuleName), serviceCallback);
    }

    /**
     * Gets a firewall rule.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param firewallRuleName The name of the firewall rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the FirewallRuleInner object
     */
    public Observable<FirewallRuleInner> getAsync(String resourceGroupName, String serverName, String firewallRuleName) {
        return getWithServiceResponseAsync(resourceGroupName, serverName, firewallRuleName).map(new Func1<ServiceResponse<FirewallRuleInner>, FirewallRuleInner>() {
            @Override
            public FirewallRuleInner call(ServiceResponse<FirewallRuleInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets a firewall rule.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param firewallRuleName The name of the firewall rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the FirewallRuleInner object
     */
    public Observable<ServiceResponse<FirewallRuleInner>> getWithServiceResponseAsync(String resourceGroupName, String serverName, String firewallRuleName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverName == null) {
            throw new IllegalArgumentException("Parameter serverName is required and cannot be null.");
        }
        if (firewallRuleName == null) {
            throw new IllegalArgumentException("Parameter firewallRuleName is required and cannot be null.");
        }
        final String apiVersion = "2014-04-01";
        return service.get(this.client.subscriptionId(), resourceGroupName, serverName, firewallRuleName, apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<FirewallRuleInner>>>() {
                @Override
                public Observable<ServiceResponse<FirewallRuleInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<FirewallRuleInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<FirewallRuleInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<FirewallRuleInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<FirewallRuleInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Returns a list of firewall rules.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;FirewallRuleInner&gt; object if successful.
     */
    public List<FirewallRuleInner> listByServer(String resourceGroupName, String serverName) {
        return listByServerWithServiceResponseAsync(resourceGroupName, serverName).toBlocking().single().body();
    }

    /**
     * Returns a list of firewall rules.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<FirewallRuleInner>> listByServerAsync(String resourceGroupName, String serverName, final ServiceCallback<List<FirewallRuleInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listByServerWithServiceResponseAsync(resourceGroupName, serverName), serviceCallback);
    }

    /**
     * Returns a list of firewall rules.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;FirewallRuleInner&gt; object
     */
    public Observable<List<FirewallRuleInner>> listByServerAsync(String resourceGroupName, String serverName) {
        return listByServerWithServiceResponseAsync(resourceGroupName, serverName).map(new Func1<ServiceResponse<List<FirewallRuleInner>>, List<FirewallRuleInner>>() {
            @Override
            public List<FirewallRuleInner> call(ServiceResponse<List<FirewallRuleInner>> response) {
                return response.body();
            }
        });
    }

    /**
     * Returns a list of firewall rules.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;FirewallRuleInner&gt; object
     */
    public Observable<ServiceResponse<List<FirewallRuleInner>>> listByServerWithServiceResponseAsync(String resourceGroupName, String serverName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverName == null) {
            throw new IllegalArgumentException("Parameter serverName is required and cannot be null.");
        }
        final String apiVersion = "2014-04-01";
        return service.listByServer(this.client.subscriptionId(), resourceGroupName, serverName, apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<FirewallRuleInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<FirewallRuleInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<FirewallRuleInner>> result = listByServerDelegate(response);
                        List<FirewallRuleInner> items = null;
                        if (result.body() != null) {
                            items = result.body().items();
                        }
                        ServiceResponse<List<FirewallRuleInner>> clientResponse = new ServiceResponse<List<FirewallRuleInner>>(items, result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<FirewallRuleInner>> listByServerDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<FirewallRuleInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<FirewallRuleInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
