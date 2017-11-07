package com.isbsoft.lolmate.core.network.endpoints.match.dto;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

/**
 * Created by emre on 10/28/2017.
 */

public class ParticipantTimeline {

    @SerializedName("lane")
    private String lane;
    @SerializedName("participantId")
    private Integer participantId;
    @SerializedName("csDiffPerMinDeltas")
    private Map<String, Double> csDiffPerMinDeltas;
    @SerializedName("goldPerMinDeltas")
    private Map<String, Double> goldPerMinDeltas;
    @SerializedName("xpDiffPerMinDeltas")
    private Map<String, Double> xpDiffPerMinDeltas;
    @SerializedName("creepsPerMinDeltas")
    private Map<String, Double> creepsPerMinDeltas;
    @SerializedName("xpPerMinDeltas")
    private Map<String, Double> xpPerMinDeltas;
    @SerializedName("role")
    private String role;
    @SerializedName("damageTakenDiffPerMinDeltas")
    private Map<String, Double> damageTakenDiffPerMinDeltas;
    @SerializedName("damageTakenPerMinDeltas")
    private Map<String, Double> damageTakenPerMinDeltas;
}
