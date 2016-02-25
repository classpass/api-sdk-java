/*
 * QordobaLib
 *
 *   by Qordoba BETA v2.0 on 02/25/2016
 */
package com.qordoba.developers.http.client;

import com.qordoba.developers.http.client.HttpContext;

/**
 * Callback class for handling API calls with a templated response type T
 */
public interface APICallBack<T> {
    /**
     * On Completed callback for API calls
     * @param context   The context of the API request
     * @param response  The response received from the API Call
     */
    public void onSuccess(HttpContext context, T response);

    /**
     * On Completed callback for API calls
     * @param context   The context of the API request
     * @param error Any error detected during the API Call and/or deserialization
     */
    public void onFailure(HttpContext context, Throwable error);
}