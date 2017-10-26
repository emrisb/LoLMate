package com.isbsoft.lolmate;

import com.isbsoft.lolmate.core.network.enums.RequestURL;
import com.isbsoft.lolmate.core.network.interfaces.OnResponse;
import com.isbsoft.lolmate.core.network.response.MatchListResponse;
import com.isbsoft.lolmate.core.ui.BaseActivity;

/**
 * Created by emre on 10/6/2017.
 */

public class SendRequest {

    public void sendMatchListRequest(BaseActivity baseActivity, int accountId, OnResponse onResponse) {

        String url = RequestURL.BaseURL.toString()
                + "match/v3/matchlists/by-account/"
                + accountId
                + "/recent"
                + "?api_key="
                + "RGAPI-79a232f6-b69e-46c5-948e-765610fd0739";

        baseActivity.sendRequest(url, onResponse, MatchListResponse.class);
    }

}
