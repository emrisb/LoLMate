package com.isbsoft.lolmate.core.network.interfaces;

import com.isbsoft.lolmate.core.network.endpoints.champion.dto.Champion;

import java.util.List;

/**
 * Created by emre on 11/11/2017.
 */

public interface AllChampionsCallBack {

    void onSuccess(List<Champion> championList);

    void onFailure(String message);
}
