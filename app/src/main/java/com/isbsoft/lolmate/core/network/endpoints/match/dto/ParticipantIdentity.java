package com.isbsoft.lolmate.core.network.endpoints.match.dto;

import com.google.gson.annotations.SerializedName;

/**
 * Created by emre on 10/28/2017.
 */

public class ParticipantIdentity {

    @SerializedName("player")
    private Player player;
    @SerializedName("participantId")
    private Integer participantId;

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Integer getParticipantId() {
        return participantId;
    }

    public void setParticipantId(Integer participantId) {
        this.participantId = participantId;
    }
}
