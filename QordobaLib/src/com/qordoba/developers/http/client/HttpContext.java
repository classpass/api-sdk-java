/*
 * QordobaLib
 *
 *   by Qordoba BETA v2.0 on 02/25/2016
 */
package com.qordoba.developers.http.client;

import com.qordoba.developers.http.request.HttpRequest;
import com.qordoba.developers.http.response.HttpResponse;

public class HttpContext {
    private HttpRequest _request;
    private HttpResponse _response;

    public HttpContext(HttpRequest request, HttpResponse response) {
        _request = request;
        _response = response;
    }

    /**
     * GETTER for the Http Request
     * @return HttpRequest request
     */
    public HttpRequest getRequest() {
        return _request;
    }

    /**
     * GETTER for the Http Response
     * @return HttpResponse response
     */
    public HttpResponse getRespone() {
        return _response;
    }
}