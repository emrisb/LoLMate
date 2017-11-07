package com.isbsoft.lolmate.core.network.endpoints.match.dto;

import com.google.gson.annotations.SerializedName;

/**
 * Created by emre on 10/20/2017.
 */

public class MatchReference {

    @SerializedName("lane")
    private String lane;
    @SerializedName("gameId")
    private Long gameId;
    @SerializedName("champion")
    private Integer champion;
    @SerializedName("platformId")
    private String platformId;
    @SerializedName("timestamp")
    private Long timestamp;
    @SerializedName("queue")
    private Integer queue;
    @SerializedName("role")
    private String role;
    @SerializedName("season")
    private Integer season;

    public String getLane() {
        return lane;
    }

    public void setLane(String lane) {
        this.lane = lane;
    }

    public Long getGameId() {
        return gameId;
    }

    public void setGameId(Long gameId) {
        this.gameId = gameId;
    }

    public Integer getChampion() {
        return champion;
    }

    public void setChampion(Integer champion) {
        this.champion = champion;
    }

    public String getPlatformId() {
        return platformId;
    }

    public void setPlatformId(String platformId) {
        this.platformId = platformId;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getQueue() {
        return queue;
    }

    public void setQueue(Integer queue) {
        this.queue = queue;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getSeason() {
        return season;
    }

    public void setSeason(Integer season) {
        this.season = season;
    }
}
