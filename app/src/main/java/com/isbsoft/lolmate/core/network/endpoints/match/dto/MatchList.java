package com.isbsoft.lolmate.core.network.endpoints.match.dto;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by emre on 10/20/2017.
 */

public class MatchList {

    @SerializedName("matches")
    private List<MatchReference> matches = null;
    @SerializedName("endIndex")
    private Integer endIndex;
    @SerializedName("startIndex")
    private Integer startIndex;
    @SerializedName("totalGames")
    private Integer totalGames;

    public List<MatchReference> getMatches() {
        return matches;
    }

    public void setMatches(List<MatchReference> matches) {
        this.matches = matches;
    }

    public Integer getEndIndex() {
        return endIndex;
    }

    public void setEndIndex(Integer endIndex) {
        this.endIndex = endIndex;
    }

    public Integer getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }

    public Integer getTotalGames() {
        return totalGames;
    }

    public void setTotalGames(Integer totalGames) {
        this.totalGames = totalGames;
    }
}
