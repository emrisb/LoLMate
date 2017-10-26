package com.isbsoft.lolmate.core.network.endpoints.champion.dto;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

/**
 * Created by emre on 10/23/2017.
 */

public class ChampionDTO {

    @SerializedName("type")
    private String type;

    @SerializedName("version")
    private String version;

    @SerializedName("data")
    private Map<String, DataDTO> data;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Map<String, DataDTO> getData() {
        return data;
    }

    public void setData(Map<String, DataDTO> data) {
        this.data = data;
    }
}
