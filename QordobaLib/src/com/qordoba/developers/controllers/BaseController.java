/*
 * QordobaLib
 *
 *   by Qordoba BETA v2.0 on 02/25/2016
 */
package com.qordoba.developers.controllers;

import com.qordoba.developers.http.client.HttpClient;
import com.qordoba.developers.http.client.UnirestClient;

public abstract class BaseController {
    /**
     * Protected variable to keep reference of client instance
     */
    protected HttpClient clientInstance = null;

    /**
     * Initialize with the default http client
     */
    public BaseController() {
        clientInstance = UnirestClient.getSharedInstance();
    }

    /**
     * Initialize the base controller using the given http client
     *
     * @param _client The given http client
     */
    public BaseController(HttpClient _client) {
        clientInstance = _client;
    }
}
