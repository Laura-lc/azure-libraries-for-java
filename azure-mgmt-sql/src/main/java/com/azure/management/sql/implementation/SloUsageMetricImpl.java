/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.azure.management.sql.implementation;

import com.azure.management.sql.SloUsageMetricInterface;
import com.microsoft.azure.management.apigeneration.LangDefinition;
import com.azure.management.resources.fluentcore.model.implementation.WrapperImpl;
import com.azure.management.sql.ServiceObjectiveName;
import com.azure.management.sql.SloUsageMetric;

import java.util.UUID;

/**
 * Implementation for Azure SQL Database's SloUsageMetric.
 */
@LangDefinition
class SloUsageMetricImpl
        extends WrapperImpl<SloUsageMetric>
        implements SloUsageMetricInterface {

    protected SloUsageMetricImpl(SloUsageMetric innerObject) {
        super(innerObject);
    }

    @Override
    public ServiceObjectiveName serviceLevelObjective() {
        return this.inner().serviceLevelObjective();
    }

    @Override
    public UUID serviceLevelObjectiveId() {
        return this.inner().serviceLevelObjectiveId();
    }

    @Override
    public double inRangeTimeRatio() {
        return this.inner().inRangeTimeRatio();
    }
}
