package com.isbsoft.lolmate.core.network.endpoints.summoner.dto;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by emre on 10/23/2017.
 */

public class Summoner implements Serializable {

    @SerializedName("id")
    private int id;
    @SerializedName("accountId")
    private int accountID;
    @SerializedName("name")
    private String name;
    @SerializedName("profileIconId")
    private int profileIconID;
    @SerializedName("revisionDate")
    private long revisionDate;
    @SerializedName("summonerLevel")
    private int summonerLevel;

    public int getId() {
        return id;
    }

    public int getAccountID() {
        return accountID;
    }

    public String getName() {
        return name;
    }

    public int getProfileIconID() {
        return profileIconID;
    }

    public long getRevisionDate() {
        return revisionDate;
    }

    public int getSummonerLevel() {
        return summonerLevel;
    }

    @Override
    public String toString() {
        return "SummonerResponse{" +
                "id=" + id +
                ", accountID=" + accountID +
                ", name='" + name + '\'' +
                ", profileIconID=" + profileIconID +
                ", revisionDate=" + revisionDate +
                ", summonerLevel=" + summonerLevel +
                '}';
    }
}
