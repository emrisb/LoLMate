package com.isbsoft.lolmate;

import com.isbsoft.lolmate.core.network.enums.RequestURL;
import com.isbsoft.lolmate.core.network.interfaces.OnResponse;
import com.isbsoft.lolmate.core.network.response.SummonerResponse;
import com.isbsoft.lolmate.core.ui.BaseActivity;

/**
 * Created by emre on 10/6/2017.
 */

public class SendRequest {

    public void sendLoginRequest(BaseActivity baseActivity, String summonerName, OnResponse onResponse) {

        String url = RequestURL.BaseURL.toString()
                + summonerName
                + "?api_key="
                + "RGAPI-2bee5def-ea2f-4204-b2dd-b7730070de43";

        baseActivity.sendRequest(url, onResponse, SummonerResponse.class);
    }

}
