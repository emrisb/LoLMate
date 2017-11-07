package com.isbsoft.lolmate.core.network.response;

import com.google.gson.annotations.SerializedName;
import com.isbsoft.lolmate.core.network.endpoints.match.dto.Match;

/**
 * Created by emre on 10/28/2017.
 */

public class MatchResponse extends BaseResponse {

    @SerializedName("top_data")
    private Match data;

    public Match getData() {
        return data;
    }

    public void setData(Match data) {
        this.data = data;
    }
}
