// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for JobExecutionLifecycle.
 */
public final class JobExecutionLifecycle extends ExpandableStringEnum<JobExecutionLifecycle> {
    /**
     * Static value Created for JobExecutionLifecycle.
     */
    public static final JobExecutionLifecycle CREATED = fromString("Created");

    /**
     * Static value InProgress for JobExecutionLifecycle.
     */
    public static final JobExecutionLifecycle IN_PROGRESS = fromString("InProgress");

    /**
     * Static value WaitingForChildJobExecutions for JobExecutionLifecycle.
     */
    public static final JobExecutionLifecycle WAITING_FOR_CHILD_JOB_EXECUTIONS = fromString("WaitingForChildJobExecutions");

    /**
     * Static value WaitingForRetry for JobExecutionLifecycle.
     */
    public static final JobExecutionLifecycle WAITING_FOR_RETRY = fromString("WaitingForRetry");

    /**
     * Static value Succeeded for JobExecutionLifecycle.
     */
    public static final JobExecutionLifecycle SUCCEEDED = fromString("Succeeded");

    /**
     * Static value SucceededWithSkipped for JobExecutionLifecycle.
     */
    public static final JobExecutionLifecycle SUCCEEDED_WITH_SKIPPED = fromString("SucceededWithSkipped");

    /**
     * Static value Failed for JobExecutionLifecycle.
     */
    public static final JobExecutionLifecycle FAILED = fromString("Failed");

    /**
     * Static value TimedOut for JobExecutionLifecycle.
     */
    public static final JobExecutionLifecycle TIMED_OUT = fromString("TimedOut");

    /**
     * Static value Canceled for JobExecutionLifecycle.
     */
    public static final JobExecutionLifecycle CANCELED = fromString("Canceled");

    /**
     * Static value Skipped for JobExecutionLifecycle.
     */
    public static final JobExecutionLifecycle SKIPPED = fromString("Skipped");

    /**
     * Creates or finds a JobExecutionLifecycle from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding JobExecutionLifecycle.
     */
    @JsonCreator
    public static JobExecutionLifecycle fromString(String name) {
        return fromString(name, JobExecutionLifecycle.class);
    }

    /**
     * @return known JobExecutionLifecycle values.
     */
    public static Collection<JobExecutionLifecycle> values() {
        return values(JobExecutionLifecycle.class);
    }
}
