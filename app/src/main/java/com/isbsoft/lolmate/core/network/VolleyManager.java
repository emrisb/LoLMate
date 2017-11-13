package com.isbsoft.lolmate.core.network;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.isbsoft.lolmate.app.AppController;
import com.isbsoft.lolmate.core.network.interfaces.OnResponse;
import com.isbsoft.lolmate.core.network.response.BaseResponse;

/**
 * Created by emre on 10/6/2017.
 */

public class VolleyManager implements Response.ErrorListener, Response.Listener<String> {

    private OnResponse onResponse = null;
    private Class<? extends BaseResponse> responseClass = null;
    private GsonBuilder gsonBuilder;

    public void sendRequest(String url, OnResponse onResponse, Class<? extends BaseResponse> responseClass) {
        this.onResponse = onResponse;
        this.responseClass = responseClass;
        gsonBuilder = new GsonBuilder();

        StringRequest stringRequest = new StringRequest(url, this, this);

        AppController.getInstance().addToRequestQueue(stringRequest, responseClass.getSimpleName());

    }

    @Override
    public void onErrorResponse(VolleyError error) {
        onResponse.onErrorResponse(error, responseClass);
    }

    @Override
    public void onResponse(String response) {

        Gson gson = gsonBuilder.create();
        response = "{\"top_data\":" + response + "}";
        //Logger.json(response);
        /*if (!response.startsWith("{")) {
            response = "{\"top_data\":" + response + "}"; //json datasi array ise objecte convert etmek icin
        }*/

        //Log.d("Response: ", response);
        BaseResponse baseResponse = gson.fromJson(response, responseClass);
        onResponse.onSuccessResponse(baseResponse);
    }
}
