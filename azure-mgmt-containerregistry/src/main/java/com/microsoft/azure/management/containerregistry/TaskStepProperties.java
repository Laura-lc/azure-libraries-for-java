/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Base properties for any task step.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("TaskStepProperties")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Docker", value = DockerTaskStep.class),
    @JsonSubTypes.Type(name = "FileTask", value = FileTaskStep.class),
    @JsonSubTypes.Type(name = "EncodedTask", value = EncodedTaskStep.class)
})
public class TaskStepProperties {
    /**
     * List of base image dependencies for a step.
     */
    @JsonProperty(value = "baseImageDependencies", access = JsonProperty.Access.WRITE_ONLY)
    private List<BaseImageDependency> baseImageDependencies;

    /**
     * The URL(absolute or relative) of the source context for the task step.
     */
    @JsonProperty(value = "contextPath")
    private String contextPath;

    /**
     * Get list of base image dependencies for a step.
     *
     * @return the baseImageDependencies value
     */
    public List<BaseImageDependency> baseImageDependencies() {
        return this.baseImageDependencies;
    }

    /**
     * Get the URL(absolute or relative) of the source context for the task step.
     *
     * @return the contextPath value
     */
    public String contextPath() {
        return this.contextPath;
    }

    /**
     * Set the URL(absolute or relative) of the source context for the task step.
     *
     * @param contextPath the contextPath value to set
     * @return the TaskStepProperties object itself.
     */
    public TaskStepProperties withContextPath(String contextPath) {
        this.contextPath = contextPath;
        return this;
    }

}
