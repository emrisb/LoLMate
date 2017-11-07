package com.isbsoft.lolmate.core.network.endpoints.match.dto;

import com.google.gson.annotations.SerializedName;

/**
 * Created by emre on 10/28/2017.
 */

public class ParticipantStats {

    @SerializedName("item1")
    private Integer item1;
    @SerializedName("totalPlayerScore")
    private Integer totalPlayerScore;
    @SerializedName("visionScore")
    private Long visionScore;
    @SerializedName("unrealKills")
    private Integer unrealKills;
    @SerializedName("win")
    private Boolean win;
    @SerializedName("objectivePlayerScore")
    private Integer objectivePlayerScore;
    @SerializedName("largestCriticalStrike")
    private Integer largestCriticalStrike;
    @SerializedName("totalDamageDealt")
    private Long totalDamageDealt;
    @SerializedName("magicDamageDealtToChampions")
    private Long magicDamageDealtToChampions;
    @SerializedName("largestMultiKill")
    private Integer largestMultiKill;
    @SerializedName("largestKillingSpree")
    private Integer largestKillingSpree;
    @SerializedName("quadraKills")
    private Integer quadraKills;
    @SerializedName("totalTimeCrowdControlDealt")
    private Integer totalTimeCrowdControlDealt;
    @SerializedName("magicalDamageTaken")
    private Long magicalDamageTaken;
    @SerializedName("longestTimeSpentLiving")
    private Integer longestTimeSpentLiving;
    @SerializedName("neutralMinionsKilledEnemyJungle")
    private Integer neutralMinionsKilledEnemyJungle;
    @SerializedName("firstTowerAssist")
    private Boolean firstTowerAssist;
    @SerializedName("neutralMinionsKilledTeamJungle")
    private Integer neutralMinionsKilledTeamJungle;
    @SerializedName("goldEarned")
    private Integer goldEarned;
    @SerializedName("item2")
    private Integer item2;
    @SerializedName("item3")
    private Integer item3;
    @SerializedName("item0")
    private Integer item0;
    @SerializedName("deaths")
    private Integer deaths;
    @SerializedName("item6")
    private Integer item6;
    @SerializedName("wardsPlaced")
    private Integer wardsPlaced;
    @SerializedName("item4")
    private Integer item4;
    @SerializedName("item5")
    private Integer item5;
    @SerializedName("turretKills")
    private Integer turretKills;
    @SerializedName("playerScore0")
    private Integer playerScore0;
    @SerializedName("tripleKills")
    private Integer tripleKills;
    @SerializedName("damageSelfMitigated")
    private Long damageSelfMitigated;
    @SerializedName("goldSpent")
    private Integer goldSpent;
    @SerializedName("playerScore3")
    private Integer playerScore3;
    @SerializedName("playerScore9")
    private Integer playerScore9;
    @SerializedName("playerScore8")
    private Integer playerScore8;
    @SerializedName("playerScore2")
    private Integer playerScore2;
    @SerializedName("magicDamageDealt")
    private Long magicDamageDealt;
    @SerializedName("kills")
    private Integer kills;
    @SerializedName("playerScore1")
    private Integer playerScore1;
    @SerializedName("doubleKills")
    private Integer doubleKills;
    @SerializedName("firstInhibitorKill")
    private Boolean firstInhibitorKill;
    @SerializedName("trueDamageTaken")
    private Long trueDamageTaken;
    @SerializedName("playerScore5")
    private Integer playerScore5;
    @SerializedName("playerScore4")
    private Integer playerScore4;
    @SerializedName("firstBloodAssist")
    private Boolean firstBloodAssist;
    @SerializedName("playerScore6")
    private Integer playerScore6;
    @SerializedName("firstBloodKill")
    private Boolean firstBloodKill;
    @SerializedName("assists")
    private Integer assists;
    @SerializedName("totalScoreRank")
    private Integer totalScoreRank;
    @SerializedName("neutralMinionsKilled")
    private Integer neutralMinionsKilled;
    @SerializedName("combatPlayerScore")
    private Integer combatPlayerScore;
    @SerializedName("visionWardsBoughtInGame")
    private Integer visionWardsBoughtInGame;
    @SerializedName("damageDealtToTurrets")
    private Long damageDealtToTurrets;
    @SerializedName("physicalDamageDealtToChampions")
    private Long physicalDamageDealtToChampions;
    @SerializedName("pentaKills")
    private Integer pentaKills;
    @SerializedName("trueDamageDealt")
    private Long trueDamageDealt;
    @SerializedName("trueDamageDealtToChampions")
    private Long trueDamageDealtToChampions;
    @SerializedName("champLevel")
    private Integer champLevel;
    @SerializedName("participantId")
    private Integer participantId;
    @SerializedName("firstInhibitorAssist")
    private Boolean firstInhibitorAssist;
    @SerializedName("playerScore7")
    private Integer playerScore7;
    @SerializedName("wardsKilled")
    private Integer wardsKilled;
    @SerializedName("firstTowerKill")
    private Boolean firstTowerKill;
    @SerializedName("totalHeal")
    private Long totalHeal;
    @SerializedName("totalMinionsKilled")
    private Integer totalMinionsKilled;
    @SerializedName("physicalDamageDealt")
    private Long physicalDamageDealt;
    @SerializedName("damageDealtToObjectives")
    private Long damageDealtToObjectives;
    @SerializedName("sightWardsBoughtInGame")
    private Integer sightWardsBoughtInGame;
    @SerializedName("totalDamageDealtToChampions")
    private Long totalDamageDealtToChampions;
    @SerializedName("totalUnitsHealed")
    private Integer totalUnitsHealed;
    @SerializedName("inhibitorKills")
    private Integer inhibitorKills;
    @SerializedName("totalDamageTaken")
    private Long totalDamageTaken;
    @SerializedName("killingSprees")
    private Integer killingSprees;
    @SerializedName("timeCCingOthers")
    private Long timeCCingOthers;
    @SerializedName("physicalDamageTaken")
    private Long physicalDamageTaken;

    public Integer getItem1() {
        return item1;
    }

    public void setItem1(Integer item1) {
        this.item1 = item1;
    }

    public Integer getTotalPlayerScore() {
        return totalPlayerScore;
    }

    public void setTotalPlayerScore(Integer totalPlayerScore) {
        this.totalPlayerScore = totalPlayerScore;
    }

    public Long getVisionScore() {
        return visionScore;
    }

    public void setVisionScore(Long visionScore) {
        this.visionScore = visionScore;
    }

    public Integer getUnrealKills() {
        return unrealKills;
    }

    public void setUnrealKills(Integer unrealKills) {
        this.unrealKills = unrealKills;
    }

    public Boolean getWin() {
        return win;
    }

    public void setWin(Boolean win) {
        this.win = win;
    }

    public Integer getObjectivePlayerScore() {
        return objectivePlayerScore;
    }

    public void setObjectivePlayerScore(Integer objectivePlayerScore) {
        this.objectivePlayerScore = objectivePlayerScore;
    }

    public Integer getLargestCriticalStrike() {
        return largestCriticalStrike;
    }

    public void setLargestCriticalStrike(Integer largestCriticalStrike) {
        this.largestCriticalStrike = largestCriticalStrike;
    }

    public Long getTotalDamageDealt() {
        return totalDamageDealt;
    }

    public void setTotalDamageDealt(Long totalDamageDealt) {
        this.totalDamageDealt = totalDamageDealt;
    }

    public Long getMagicDamageDealtToChampions() {
        return magicDamageDealtToChampions;
    }

    public void setMagicDamageDealtToChampions(Long magicDamageDealtToChampions) {
        this.magicDamageDealtToChampions = magicDamageDealtToChampions;
    }

    public Integer getLargestMultiKill() {
        return largestMultiKill;
    }

    public void setLargestMultiKill(Integer largestMultiKill) {
        this.largestMultiKill = largestMultiKill;
    }

    public Integer getLargestKillingSpree() {
        return largestKillingSpree;
    }

    public void setLargestKillingSpree(Integer largestKillingSpree) {
        this.largestKillingSpree = largestKillingSpree;
    }

    public Integer getQuadraKills() {
        return quadraKills;
    }

    public void setQuadraKills(Integer quadraKills) {
        this.quadraKills = quadraKills;
    }

    public Integer getTotalTimeCrowdControlDealt() {
        return totalTimeCrowdControlDealt;
    }

    public void setTotalTimeCrowdControlDealt(Integer totalTimeCrowdControlDealt) {
        this.totalTimeCrowdControlDealt = totalTimeCrowdControlDealt;
    }

    public Long getMagicalDamageTaken() {
        return magicalDamageTaken;
    }

    public void setMagicalDamageTaken(Long magicalDamageTaken) {
        this.magicalDamageTaken = magicalDamageTaken;
    }

    public Integer getLongestTimeSpentLiving() {
        return longestTimeSpentLiving;
    }

    public void setLongestTimeSpentLiving(Integer longestTimeSpentLiving) {
        this.longestTimeSpentLiving = longestTimeSpentLiving;
    }

    public Integer getNeutralMinionsKilledEnemyJungle() {
        return neutralMinionsKilledEnemyJungle;
    }

    public void setNeutralMinionsKilledEnemyJungle(Integer neutralMinionsKilledEnemyJungle) {
        this.neutralMinionsKilledEnemyJungle = neutralMinionsKilledEnemyJungle;
    }

    public Boolean getFirstTowerAssist() {
        return firstTowerAssist;
    }

    public void setFirstTowerAssist(Boolean firstTowerAssist) {
        this.firstTowerAssist = firstTowerAssist;
    }

    public Integer getNeutralMinionsKilledTeamJungle() {
        return neutralMinionsKilledTeamJungle;
    }

    public void setNeutralMinionsKilledTeamJungle(Integer neutralMinionsKilledTeamJungle) {
        this.neutralMinionsKilledTeamJungle = neutralMinionsKilledTeamJungle;
    }

    public Integer getGoldEarned() {
        return goldEarned;
    }

    public void setGoldEarned(Integer goldEarned) {
        this.goldEarned = goldEarned;
    }

    public Integer getItem2() {
        return item2;
    }

    public void setItem2(Integer item2) {
        this.item2 = item2;
    }

    public Integer getItem3() {
        return item3;
    }

    public void setItem3(Integer item3) {
        this.item3 = item3;
    }

    public Integer getItem0() {
        return item0;
    }

    public void setItem0(Integer item0) {
        this.item0 = item0;
    }

    public Integer getDeaths() {
        return deaths;
    }

    public void setDeaths(Integer deaths) {
        this.deaths = deaths;
    }

    public Integer getItem6() {
        return item6;
    }

    public void setItem6(Integer item6) {
        this.item6 = item6;
    }

    public Integer getWardsPlaced() {
        return wardsPlaced;
    }

    public void setWardsPlaced(Integer wardsPlaced) {
        this.wardsPlaced = wardsPlaced;
    }

    public Integer getItem4() {
        return item4;
    }

    public void setItem4(Integer item4) {
        this.item4 = item4;
    }

    public Integer getItem5() {
        return item5;
    }

    public void setItem5(Integer item5) {
        this.item5 = item5;
    }

    public Integer getTurretKills() {
        return turretKills;
    }

    public void setTurretKills(Integer turretKills) {
        this.turretKills = turretKills;
    }

    public Integer getPlayerScore0() {
        return playerScore0;
    }

    public void setPlayerScore0(Integer playerScore0) {
        this.playerScore0 = playerScore0;
    }

    public Integer getTripleKills() {
        return tripleKills;
    }

    public void setTripleKills(Integer tripleKills) {
        this.tripleKills = tripleKills;
    }

    public Long getDamageSelfMitigated() {
        return damageSelfMitigated;
    }

    public void setDamageSelfMitigated(Long damageSelfMitigated) {
        this.damageSelfMitigated = damageSelfMitigated;
    }

    public Integer getGoldSpent() {
        return goldSpent;
    }

    public void setGoldSpent(Integer goldSpent) {
        this.goldSpent = goldSpent;
    }

    public Integer getPlayerScore3() {
        return playerScore3;
    }

    public void setPlayerScore3(Integer playerScore3) {
        this.playerScore3 = playerScore3;
    }

    public Integer getPlayerScore9() {
        return playerScore9;
    }

    public void setPlayerScore9(Integer playerScore9) {
        this.playerScore9 = playerScore9;
    }

    public Integer getPlayerScore8() {
        return playerScore8;
    }

    public void setPlayerScore8(Integer playerScore8) {
        this.playerScore8 = playerScore8;
    }

    public Integer getPlayerScore2() {
        return playerScore2;
    }

    public void setPlayerScore2(Integer playerScore2) {
        this.playerScore2 = playerScore2;
    }

    public Long getMagicDamageDealt() {
        return magicDamageDealt;
    }

    public void setMagicDamageDealt(Long magicDamageDealt) {
        this.magicDamageDealt = magicDamageDealt;
    }

    public Integer getKills() {
        return kills;
    }

    public void setKills(Integer kills) {
        this.kills = kills;
    }

    public Integer getPlayerScore1() {
        return playerScore1;
    }

    public void setPlayerScore1(Integer playerScore1) {
        this.playerScore1 = playerScore1;
    }

    public Integer getDoubleKills() {
        return doubleKills;
    }

    public void setDoubleKills(Integer doubleKills) {
        this.doubleKills = doubleKills;
    }

    public Boolean getFirstInhibitorKill() {
        return firstInhibitorKill;
    }

    public void setFirstInhibitorKill(Boolean firstInhibitorKill) {
        this.firstInhibitorKill = firstInhibitorKill;
    }

    public Long getTrueDamageTaken() {
        return trueDamageTaken;
    }

    public void setTrueDamageTaken(Long trueDamageTaken) {
        this.trueDamageTaken = trueDamageTaken;
    }

    public Integer getPlayerScore5() {
        return playerScore5;
    }

    public void setPlayerScore5(Integer playerScore5) {
        this.playerScore5 = playerScore5;
    }

    public Integer getPlayerScore4() {
        return playerScore4;
    }

    public void setPlayerScore4(Integer playerScore4) {
        this.playerScore4 = playerScore4;
    }

    public Boolean getFirstBloodAssist() {
        return firstBloodAssist;
    }

    public void setFirstBloodAssist(Boolean firstBloodAssist) {
        this.firstBloodAssist = firstBloodAssist;
    }

    public Integer getPlayerScore6() {
        return playerScore6;
    }

    public void setPlayerScore6(Integer playerScore6) {
        this.playerScore6 = playerScore6;
    }

    public Boolean getFirstBloodKill() {
        return firstBloodKill;
    }

    public void setFirstBloodKill(Boolean firstBloodKill) {
        this.firstBloodKill = firstBloodKill;
    }

    public Integer getAssists() {
        return assists;
    }

    public void setAssists(Integer assists) {
        this.assists = assists;
    }

    public Integer getTotalScoreRank() {
        return totalScoreRank;
    }

    public void setTotalScoreRank(Integer totalScoreRank) {
        this.totalScoreRank = totalScoreRank;
    }

    public Integer getNeutralMinionsKilled() {
        return neutralMinionsKilled;
    }

    public void setNeutralMinionsKilled(Integer neutralMinionsKilled) {
        this.neutralMinionsKilled = neutralMinionsKilled;
    }

    public Integer getCombatPlayerScore() {
        return combatPlayerScore;
    }

    public void setCombatPlayerScore(Integer combatPlayerScore) {
        this.combatPlayerScore = combatPlayerScore;
    }

    public Integer getVisionWardsBoughtInGame() {
        return visionWardsBoughtInGame;
    }

    public void setVisionWardsBoughtInGame(Integer visionWardsBoughtInGame) {
        this.visionWardsBoughtInGame = visionWardsBoughtInGame;
    }

    public Long getDamageDealtToTurrets() {
        return damageDealtToTurrets;
    }

    public void setDamageDealtToTurrets(Long damageDealtToTurrets) {
        this.damageDealtToTurrets = damageDealtToTurrets;
    }

    public Long getPhysicalDamageDealtToChampions() {
        return physicalDamageDealtToChampions;
    }

    public void setPhysicalDamageDealtToChampions(Long physicalDamageDealtToChampions) {
        this.physicalDamageDealtToChampions = physicalDamageDealtToChampions;
    }

    public Integer getPentaKills() {
        return pentaKills;
    }

    public void setPentaKills(Integer pentaKills) {
        this.pentaKills = pentaKills;
    }

    public Long getTrueDamageDealt() {
        return trueDamageDealt;
    }

    public void setTrueDamageDealt(Long trueDamageDealt) {
        this.trueDamageDealt = trueDamageDealt;
    }

    public Long getTrueDamageDealtToChampions() {
        return trueDamageDealtToChampions;
    }

    public void setTrueDamageDealtToChampions(Long trueDamageDealtToChampions) {
        this.trueDamageDealtToChampions = trueDamageDealtToChampions;
    }

    public Integer getChampLevel() {
        return champLevel;
    }

    public void setChampLevel(Integer champLevel) {
        this.champLevel = champLevel;
    }

    public Integer getParticipantId() {
        return participantId;
    }

    public void setParticipantId(Integer participantId) {
        this.participantId = participantId;
    }

    public Boolean getFirstInhibitorAssist() {
        return firstInhibitorAssist;
    }

    public void setFirstInhibitorAssist(Boolean firstInhibitorAssist) {
        this.firstInhibitorAssist = firstInhibitorAssist;
    }

    public Integer getPlayerScore7() {
        return playerScore7;
    }

    public void setPlayerScore7(Integer playerScore7) {
        this.playerScore7 = playerScore7;
    }

    public Integer getWardsKilled() {
        return wardsKilled;
    }

    public void setWardsKilled(Integer wardsKilled) {
        this.wardsKilled = wardsKilled;
    }

    public Boolean getFirstTowerKill() {
        return firstTowerKill;
    }

    public void setFirstTowerKill(Boolean firstTowerKill) {
        this.firstTowerKill = firstTowerKill;
    }

    public Long getTotalHeal() {
        return totalHeal;
    }

    public void setTotalHeal(Long totalHeal) {
        this.totalHeal = totalHeal;
    }

    public Integer getTotalMinionsKilled() {
        return totalMinionsKilled;
    }

    public void setTotalMinionsKilled(Integer totalMinionsKilled) {
        this.totalMinionsKilled = totalMinionsKilled;
    }

    public Long getPhysicalDamageDealt() {
        return physicalDamageDealt;
    }

    public void setPhysicalDamageDealt(Long physicalDamageDealt) {
        this.physicalDamageDealt = physicalDamageDealt;
    }

    public Long getDamageDealtToObjectives() {
        return damageDealtToObjectives;
    }

    public void setDamageDealtToObjectives(Long damageDealtToObjectives) {
        this.damageDealtToObjectives = damageDealtToObjectives;
    }

    public Integer getSightWardsBoughtInGame() {
        return sightWardsBoughtInGame;
    }

    public void setSightWardsBoughtInGame(Integer sightWardsBoughtInGame) {
        this.sightWardsBoughtInGame = sightWardsBoughtInGame;
    }

    public Long getTotalDamageDealtToChampions() {
        return totalDamageDealtToChampions;
    }

    public void setTotalDamageDealtToChampions(Long totalDamageDealtToChampions) {
        this.totalDamageDealtToChampions = totalDamageDealtToChampions;
    }

    public Integer getTotalUnitsHealed() {
        return totalUnitsHealed;
    }

    public void setTotalUnitsHealed(Integer totalUnitsHealed) {
        this.totalUnitsHealed = totalUnitsHealed;
    }

    public Integer getInhibitorKills() {
        return inhibitorKills;
    }

    public void setInhibitorKills(Integer inhibitorKills) {
        this.inhibitorKills = inhibitorKills;
    }

    public Long getTotalDamageTaken() {
        return totalDamageTaken;
    }

    public void setTotalDamageTaken(Long totalDamageTaken) {
        this.totalDamageTaken = totalDamageTaken;
    }

    public Integer getKillingSprees() {
        return killingSprees;
    }

    public void setKillingSprees(Integer killingSprees) {
        this.killingSprees = killingSprees;
    }

    public Long getTimeCCingOthers() {
        return timeCCingOthers;
    }

    public void setTimeCCingOthers(Long timeCCingOthers) {
        this.timeCCingOthers = timeCCingOthers;
    }

    public Long getPhysicalDamageTaken() {
        return physicalDamageTaken;
    }

    public void setPhysicalDamageTaken(Long physicalDamageTaken) {
        this.physicalDamageTaken = physicalDamageTaken;
    }
}
