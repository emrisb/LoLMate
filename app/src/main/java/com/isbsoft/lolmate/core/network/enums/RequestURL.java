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
            return "RGAPI-178ac424-f346-4c64-8145-dadd28c78363";
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
            return "http://ddragon.leagueoflegends.com/cdn/7.22.1/img/champion/";
        }
    },

    AllChampions {
        @Override
        public String toString() {
            return "https://tr1.api.riotgames.com/lol/static-data/v3/champions?locale=en_US&tags=image&dataById=true&api_key=" + ApiKey;
        }
    }

}
