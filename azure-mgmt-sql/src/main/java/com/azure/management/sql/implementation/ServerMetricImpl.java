/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */
package com.azure.management.sql.implementation;

import com.azure.management.sql.ServerMetric;
import com.microsoft.azure.management.apigeneration.LangDefinition;
import com.azure.management.resources.fluentcore.model.implementation.WrapperImpl;
import org.joda.time.DateTime;

/**
 * Implementation for DatabaseMetric interface.
 */
@LangDefinition
class ServerMetricImpl
    extends WrapperImpl<ServerUsageInner>
    implements ServerMetric {

    protected ServerMetricImpl(ServerUsageInner innerObject) {
        super(innerObject);
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String resourceName() {
        return this.inner().resourceName();
    }

    @Override
    public String displayName() {
        return this.inner().displayName();
    }

    @Override
    public double currentValue() {
        return this.inner().currentValue();
    }

    @Override
    public double limit() {
        return this.inner().limit();
    }

    @Override
    public String unit() {
        return this.inner().unit();
    }

    @Override
    public DateTime nextResetTime() {
        return this.inner().nextResetTime();
    }
}
