package com.isbsoft.lolmate.core.network.endpoints.champion.dto;

import com.google.gson.annotations.SerializedName;

/**
 * Created by emre on 10/23/2017.
 */

public class DataDTO {

    @SerializedName("title")
    private String title;

    @SerializedName("id")
    private Integer id;

    @SerializedName("key")
    private String key;

    @SerializedName("name")
    private String name;

    @SerializedName("image")
    private ImageDTO image;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
