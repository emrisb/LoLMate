package com.isbsoft.lolmate.core.network.endpoints.match.dto;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by emre on 10/28/2017.
 */

public class Player implements Serializable {
    @SerializedName("currentPlatformId")
    private String currentPlatformId;
    @SerializedName("summonerName")
    private String summonerName;
    @SerializedName("matchHistoryUri")
    private String matchHistoryUri;
    @SerializedName("platformId")
    private String platformId;
    @SerializedName("currentAccountId")
    private Long currentAccountId;
    @SerializedName("profileIcon")
    private Integer profileIcon;
    @SerializedName("summonerId")
    private Long summonerId;
    @SerializedName("accountId")
    private Long accountId;

    public String getCurrentPlatformId() {
        return currentPlatformId;
    }

    public void setCurrentPlatformId(String currentPlatformId) {
        this.currentPlatformId = currentPlatformId;
    }

    public String getSummonerName() {
        return summonerName;
    }

    public void setSummonerName(String summonerName) {
        this.summonerName = summonerName;
    }

    public String getMatchHistoryUri() {
        return matchHistoryUri;
    }

    public void setMatchHistoryUri(String matchHistoryUri) {
        this.matchHistoryUri = matchHistoryUri;
    }

    public String getPlatformId() {
        return platformId;
    }

    public void setPlatformId(String platformId) {
        this.platformId = platformId;
    }

    public Long getCurrentAccountId() {
        return currentAccountId;
    }

    public void setCurrentAccountId(Long currentAccountId) {
        this.currentAccountId = currentAccountId;
    }

    public Integer getProfileIcon() {
        return profileIcon;
    }

    public void setProfileIcon(Integer profileIcon) {
        this.profileIcon = profileIcon;
    }

    public Long getSummonerId() {
        return summonerId;
    }

    public void setSummonerId(Long summonerId) {
        this.summonerId = summonerId;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }
}
