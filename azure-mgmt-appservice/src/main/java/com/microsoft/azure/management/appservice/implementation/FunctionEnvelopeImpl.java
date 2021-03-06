/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.appservice.implementation;

import com.microsoft.azure.management.apigeneration.LangDefinition;
import com.microsoft.azure.management.appservice.FunctionEnvelope;
import com.microsoft.azure.management.resources.fluentcore.model.implementation.WrapperImpl;

import java.util.Map;

/**
 * Implementation for {@link FunctionEnvelope}.
 */
@LangDefinition(ContainerName = "/Microsoft.Azure.Management.AppService.Fluent")
public class FunctionEnvelopeImpl extends
        WrapperImpl<FunctionEnvelopeInner> implements FunctionEnvelope {

    FunctionEnvelopeImpl(FunctionEnvelopeInner innerModel) {
        super(innerModel);
    }

    @Override
    public String functionAppId() {
        return this.inner().functionAppId();
    }

    @Override
    public String scriptRootPathHref() {
        return this.inner().scriptRootPathHref();
    }

    @Override
    public String scriptHref() {
        return this.inner().scriptHref();
    }

    @Override
    public String configHref() {
        return this.inner().configHref();
    }

    @Override
    public String secretsFileHref() {
        return this.inner().secretsFileHref();
    }

    @Override
    public String href() {
        return this.inner().href();
    }

    @Override
    public Object config() {
        return this.inner().config();
    }

    @Override
    public Map<String, String> files() {
        return this.inner().files();
    }

    @Override
    public String testData() {
        return this.inner().testData();
    }
}
