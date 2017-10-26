package com.isbsoft.lolmate.core.network.response;

import com.google.gson.annotations.SerializedName;
import com.isbsoft.lolmate.core.network.endpoints.match.dto.MatchStatDTO;

/**
 * Created by emre on 10/23/2017.
 */

public class MatchListResponse extends BaseResponse {
    @SerializedName("top_data")
    private MatchStatDTO data;

    public MatchStatDTO getData() {
        return data;
    }

    public void setData(MatchStatDTO data) {
        this.data = data;
    }
}
