package com.isbsoft.lolmate.core.network.endpoints.champion.dto;

import com.google.gson.annotations.SerializedName;

/**
 * Created by emre on 10/22/2017.
 */

public class ImageDTO {

    @SerializedName("full")
    private String full;

    @SerializedName("group")
    private String group;

    @SerializedName("sprite")
    private String sprite;

    @SerializedName("h")
    private Integer h;

    @SerializedName("w")
    private Integer w;

    @SerializedName("y")
    private Integer y;

    @SerializedName("x")
    private Integer x;

    public String getFull() {
        return full;
    }

    public void setFull(String full) {
        this.full = full;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getSprite() {
        return sprite;
    }

    public void setSprite(String sprite) {
        this.sprite = sprite;
    }

    public Integer getH() {
        return h;
    }

    public void setH(Integer h) {
        this.h = h;
    }

    public Integer getW() {
        return w;
    }

    public void setW(Integer w) {
        this.w = w;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }
}
