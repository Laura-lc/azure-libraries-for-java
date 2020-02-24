/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.azure.management.graphrbac;

import com.azure.management.ApplicationTokenCredential;
import com.azure.management.RestClient;
import com.azure.management.graphrbac.implementation.GraphRbacManager;
import com.azure.management.resources.core.AzureTestCredential;
import com.azure.management.resources.core.TestBase;
import com.azure.management.resources.implementation.ResourceManager;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * The base for storage manager tests.
 */
public abstract class GraphRbacManagementTest extends TestBase {
    protected static GraphRbacManager graphRbacManager;
    protected static ResourceManager resourceManager;

    @Override
    protected void initializeClients(RestClient restClient, String defaultSubscription, String domain) {
        RestClient graphRestClient;
        if (isPlaybackMode()) {
            ApplicationTokenCredential credentials = new AzureTestCredential(playbackUri.replace("http", "https"), ZERO_TENANT, true);
            graphRestClient = restClient.newBuilder().withCredential(credentials).clone().buildClient();
        } else {
            graphRestClient = restClient;
        }
        graphRbacManager = GraphRbacManager.authenticate(graphRestClient, domain);
        resourceManager = ResourceManager.authenticate(restClient).withSubscription(defaultSubscription);
    }

    @Override
    protected void cleanUpResources() {
    }

    protected byte[] readAllBytes(InputStream inputStream) throws IOException {
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        int readValue;
        byte[] data = new byte[0xFFFF];
        while ((readValue = inputStream.read(data, 0, data.length)) != -1) {
            buffer.write(data, 0, readValue);
        }
        return buffer.toByteArray();
    }
}
