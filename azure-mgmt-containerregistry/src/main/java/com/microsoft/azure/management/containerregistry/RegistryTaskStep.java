/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.containerregistry;

import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Fluent;

import java.util.List;

/**
 * An immutable client-side representation of an Azure RegistryTaskStep registry task.
 */
@Fluent()
@Beta(Beta.SinceVersion.V1_17_0)
public interface RegistryTaskStep {
    /**
     * @return the base image dependencies of this RegistryTaskStep
     */
    List<BaseImageDependency> baseImageDependencies();

    /**
     * @return the context path of this RegistryTaskStep
     */
    String contextPath();
}
