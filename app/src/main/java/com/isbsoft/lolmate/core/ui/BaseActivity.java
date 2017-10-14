package com.isbsoft.lolmate.core.ui;

import android.support.v7.app.AppCompatActivity;

import com.isbsoft.lolmate.core.network.VolleyManager;
import com.isbsoft.lolmate.core.network.interfaces.OnResponse;
import com.isbsoft.lolmate.core.network.response.BaseResponse;

/**
 * Created by emre on 10/6/2017.
 */

public class BaseActivity extends AppCompatActivity {

    public VolleyManager volleyManager = null;

    public void sendRequest(String url, OnResponse onResponse, Class<? extends BaseResponse> responseClass) {
        volleyManager = new VolleyManager();
        volleyManager.sendRequest(url, onResponse, responseClass);
    }

}
