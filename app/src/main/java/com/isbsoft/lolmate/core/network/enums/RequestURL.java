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

}
