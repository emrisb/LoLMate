package com.isbsoft.lolmate.core.network.response;

import com.google.gson.annotations.SerializedName;
import com.isbsoft.lolmate.core.network.endpoints.summoner.dto.Summoner;

/**
 * Created by emre on 10/6/2017.
 */

public class SummonerResponse extends BaseResponse {

    @SerializedName("top_data")
    private Summoner data;

    public Summoner getSummoner() {
        return data;
    }

    public void setSummoner(Summoner summoner) {
        this.data = summoner;
    }
}
