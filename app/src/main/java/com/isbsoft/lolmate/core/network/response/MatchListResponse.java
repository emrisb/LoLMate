package com.isbsoft.lolmate.core.network.response;

import com.google.gson.annotations.SerializedName;
import com.isbsoft.lolmate.core.network.endpoints.match.dto.MatchList;

/**
 * Created by emre on 10/23/2017.
 */

public class MatchListResponse extends BaseResponse {
    @SerializedName("top_data")
    private MatchList data;

    public MatchList getData() {
        return data;
    }

    public void setData(MatchList data) {
        this.data = data;
    }
}
