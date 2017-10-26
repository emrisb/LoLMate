package com.isbsoft.lolmate;

/**
 * Created by emre on 10/25/2017.
 */

public class BaseRequest {
    private final String requestURL;

    protected BaseRequest(String requestURL) {
        this.requestURL = requestURL;
    }

    String getRequestURL() {
        return this.requestURL;
    }
}
