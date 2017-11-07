package com.isbsoft.lolmate.core.network.endpoints.match.dto;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by emre on 10/28/2017.
 */

public class TeamStats {

    @SerializedName("firstDragon")
    private Boolean firstDragon;
    @SerializedName("bans")
    private List<TeamBans> bans = null;
    @SerializedName("firstInhibitor")
    private Boolean firstInhibitor;
    @SerializedName("win")
    private String win;
    @SerializedName("firstRiftHerald")
    private Boolean firstRiftHerald;
    @SerializedName("firstBaron")
    private Boolean firstBaron;
    @SerializedName("baronKills")
    private Integer baronKills;
    @SerializedName("riftHeraldKills")
    private Integer riftHeraldKills;
    @SerializedName("firstBlood")
    private Boolean firstBlood;
    @SerializedName("teamId")
    private Integer teamId;
    @SerializedName("firstTower")
    private Boolean firstTower;
    @SerializedName("vilemawKills")
    private Integer vilemawKills;
    @SerializedName("inhibitorKills")
    private Integer inhibitorKills;
    @SerializedName("towerKills")
    private Integer towerKills;
    @SerializedName("dominionVictoryScore")
    private Integer dominionVictoryScore;
    @SerializedName("dragonKills")
    private Integer dragonKills;

    public Boolean getFirstDragon() {
        return firstDragon;
    }

    public void setFirstDragon(Boolean firstDragon) {
        this.firstDragon = firstDragon;
    }

    public List<TeamBans> getBans() {
        return bans;
    }

    public void setBans(List<TeamBans> bans) {
        this.bans = bans;
    }

    public Boolean getFirstInhibitor() {
        return firstInhibitor;
    }

    public void setFirstInhibitor(Boolean firstInhibitor) {
        this.firstInhibitor = firstInhibitor;
    }

    public String getWin() {
        return win;
    }

    public void setWin(String win) {
        this.win = win;
    }

    public Boolean getFirstRiftHerald() {
        return firstRiftHerald;
    }

    public void setFirstRiftHerald(Boolean firstRiftHerald) {
        this.firstRiftHerald = firstRiftHerald;
    }

    public Boolean getFirstBaron() {
        return firstBaron;
    }

    public void setFirstBaron(Boolean firstBaron) {
        this.firstBaron = firstBaron;
    }

    public Integer getBaronKills() {
        return baronKills;
    }

    public void setBaronKills(Integer baronKills) {
        this.baronKills = baronKills;
    }

    public Integer getRiftHeraldKills() {
        return riftHeraldKills;
    }

    public void setRiftHeraldKills(Integer riftHeraldKills) {
        this.riftHeraldKills = riftHeraldKills;
    }

    public Boolean getFirstBlood() {
        return firstBlood;
    }

    public void setFirstBlood(Boolean firstBlood) {
        this.firstBlood = firstBlood;
    }

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public Boolean getFirstTower() {
        return firstTower;
    }

    public void setFirstTower(Boolean firstTower) {
        this.firstTower = firstTower;
    }

    public Integer getVilemawKills() {
        return vilemawKills;
    }

    public void setVilemawKills(Integer vilemawKills) {
        this.vilemawKills = vilemawKills;
    }

    public Integer getInhibitorKills() {
        return inhibitorKills;
    }

    public void setInhibitorKills(Integer inhibitorKills) {
        this.inhibitorKills = inhibitorKills;
    }

    public Integer getTowerKills() {
        return towerKills;
    }

    public void setTowerKills(Integer towerKills) {
        this.towerKills = towerKills;
    }

    public Integer getDominionVictoryScore() {
        return dominionVictoryScore;
    }

    public void setDominionVictoryScore(Integer dominionVictoryScore) {
        this.dominionVictoryScore = dominionVictoryScore;
    }

    public Integer getDragonKills() {
        return dragonKills;
    }

    public void setDragonKills(Integer dragonKills) {
        this.dragonKills = dragonKills;
    }
}
