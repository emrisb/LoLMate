package com.isbsoft.lolmate.core.network.endpoints.champion.dto;

import android.support.annotation.NonNull;

/**
 * Created by emre on 11/11/2017.
 */

public class Champion implements Comparable<Champion> {

    Integer id;
    String imageName;

    public Champion() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    @Override
    public int compareTo(@NonNull Champion champion) {
        return imageName.compareTo(champion.imageName);
    }
}
