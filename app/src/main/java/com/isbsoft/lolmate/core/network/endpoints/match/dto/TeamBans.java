package com.isbsoft.lolmate.core.network.endpoints.match.dto;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by emre on 10/28/2017.
 */

public class TeamBans implements Serializable {
    @SerializedName("pickTurn")
    private Integer pickTurn;
    @SerializedName("championId")
    private Integer championId;
}
