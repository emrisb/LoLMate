package com.isbsoft.lolmate.core.network.endpoints.match.dto;

import com.google.gson.annotations.SerializedName;

/**
 * Created by emre on 10/28/2017.
 */

public class TeamBans {
    @SerializedName("pickTurn")
    private Integer pickTurn;
    @SerializedName("championId")
    private Integer championId;
}
