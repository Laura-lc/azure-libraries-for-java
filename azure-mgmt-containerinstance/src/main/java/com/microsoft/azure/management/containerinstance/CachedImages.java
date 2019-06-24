/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerinstance;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The cached image and OS type.
 */
public class CachedImages {
    /**
     * The resource Id of the cached image.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * The OS type of the cached image.
     */
    @JsonProperty(value = "osType", required = true)
    private String osType;

    /**
     * The cached image name.
     */
    @JsonProperty(value = "image", required = true)
    private String image;

    /**
     * Get the resource Id of the cached image.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the resource Id of the cached image.
     *
     * @param id the id value to set
     * @return the CachedImages object itself.
     */
    public CachedImages withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the OS type of the cached image.
     *
     * @return the osType value
     */
    public String osType() {
        return this.osType;
    }

    /**
     * Set the OS type of the cached image.
     *
     * @param osType the osType value to set
     * @return the CachedImages object itself.
     */
    public CachedImages withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    /**
     * Get the cached image name.
     *
     * @return the image value
     */
    public String image() {
        return this.image;
    }

    /**
     * Set the cached image name.
     *
     * @param image the image value to set
     * @return the CachedImages object itself.
     */
    public CachedImages withImage(String image) {
        this.image = image;
        return this;
    }

}