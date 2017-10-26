package com.isbsoft.lolmate.core.network.endpoints.match.dto;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Created by emre on 10/23/2017.
 */

public class MatchEntity {
    private boolean winner;
    private long matchId, matchCreation, matchDuration;
    private int champId, kills, deaths, assists, gold, cs, champLevel;
    private LinkedHashMap<String, Integer> stats = new LinkedHashMap<>();
    private Integer[] items = new Integer[7];
    private String sum1, sum2, champName, typeMatch;
    private List<Integer> teamWinner = new ArrayList<>();
    private List<Integer> teamLoser = new ArrayList<>();

}
