package com.isbsoft.lolmate.core.network.enums;

/**
 * Created by emre on 10/6/2017.
 */

public enum RequestURL {

    // TODO: buraya bak hata olabilir.

    BaseURL {
        @Override
        public String toString() {
            return "https://tr1.api.riotgames.com/lol/";
        }
    },

    LoginURL {
        @Override
        public String toString() {
            return "https://tr1.api.riotgames.com/lol/summoner/v3/summoners/by-name/";
        }
    },

    MatchListURL {
        @Override
        public String toString() {
            return "https://tr1.api.riotgames.com/lol/match/v3/matchlists/by-account/";
        }
    },

    ApiKey {
        @Override
        public String toString() {
            return "RGAPI-751a555d-b007-4c20-9d59-29754c3cd9d7";
        }
    },

    MatchDetailURL {
        @Override
        public String toString() {
            return "https://tr1.api.riotgames.com/lol/match/v3/matches/";
        }
    },

    ItemsURL {
        @Override
        public String toString() {
            return "http://ddragon.leagueoflegends.com/cdn/6.24.1/img/item/";
        }
    },

    ChampionURL {
        @Override
        public String toString() {
            return "http://ddragon.leagueoflegends.com/cdn/6.24.1/img/champion/";
        }
    }

}
