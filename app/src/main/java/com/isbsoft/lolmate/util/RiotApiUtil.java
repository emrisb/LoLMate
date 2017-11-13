package com.isbsoft.lolmate.util;

import android.content.Context;

import com.isbsoft.lolmate.core.network.endpoints.champion.dto.Champion;
import com.isbsoft.lolmate.core.network.interfaces.AllChampionsCallBack;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;

/**
 * Created by emre on 10/28/2017.
 */

public class RiotApiUtil {

    public static String requireValidSummonerName(String summonerName) throws IllegalArgumentException {
        // TODO This is only filtering out empty Strings right now. Need proper validity check
        if (summonerName.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid summoner name \"" + summonerName + "\"");
        }
        return summonerName;
    }

    public static String convertDate(long creation) {
        Date date = new Date(creation);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT+1"));
        String formattedDate = sdf.format(date);
        return formattedDate;
    }

    public static String convertDuration(long duration) {
        double diffTime = duration / 60f;
        String formattedDuration;

        if (diffTime < 60) {
            double minute = diffTime;
            int minuteInt = (int) minute;
            String finalMinute = String.valueOf(minuteInt);
            if (minuteInt < 10) {
                finalMinute = "0" + minuteInt;
            }
            double second = minute - Math.floor(minute);
            second = Math.round(second * 60f);
            int secondInt = (int) second;
            String finalSecond = String.valueOf(secondInt);
            if (secondInt < 10) {
                finalSecond = "0" + secondInt;
            }
            formattedDuration = finalMinute + "m" + " " + finalSecond + "s";

        } else {
            double hour = diffTime / 60f;
            int hourInt = (int) hour;
            double minute = diffTime - (hourInt * 60f);
            int minuteInt = (int) minute;
            String finalMinute = String.valueOf(minuteInt);
            if (minuteInt < 10) {
                finalMinute = "0" + minuteInt;
            }
            double second = minute - Math.floor(minute);
            second = Math.round(second * 60f);
            int secondInt = (int) second;
            String finalSecond = String.valueOf(secondInt);
            if (secondInt < 10) {
                finalSecond = "0" + secondInt;
            }
            formattedDuration = String.valueOf(hourInt) + "h" + " " + finalMinute + "m" + " " + finalSecond + "s";
        }
        return formattedDuration;
    }

    public static String convertTimeAgo(long creation) {
        String formattedDuration;
        long currentTime = System.currentTimeMillis();
        double diffTime = (currentTime - creation) / 60000f;

        if (diffTime < 60) {
            double minute = diffTime;
            int minuteInt = (int) minute;
            String finalMinute = String.valueOf(minuteInt);
            if (minuteInt < 10) {
                finalMinute = "0" + minuteInt;
            }
            double second = minute - Math.floor(minute);
            second = Math.round(second * 60f);
            int secondInt = (int) second;
            String finalSecond = String.valueOf(secondInt);
            if (secondInt < 10) {
                finalSecond = "0" + secondInt;
            }
            //formattedDuration = finalMinute + "m" + " " + finalSecond + "s" + " ago";
            formattedDuration = finalMinute + "m" + " ago";

        } else {
            double hour = diffTime / 60f;
            int hourInt = (int) hour;
            double minute = diffTime - (hourInt * 60f);
            int minuteInt = (int) minute;
            String finalMinute = String.valueOf(minuteInt);
            if (minuteInt < 10) {
                finalMinute = "0" + minuteInt;
            }
            double second = minute - Math.floor(minute);
            second = Math.round(second * 60f);
            int secondInt = (int) second;
            String finalSecond = String.valueOf(secondInt);
            if (secondInt < 10) {
                finalSecond = "0" + secondInt;
            }
            //formattedDuration = String.valueOf(hourInt) + "h" + " " + finalMinute + "m" + " " + finalSecond + "s";
            formattedDuration = String.valueOf(hourInt) + "h" + " " + finalMinute + "m" + " ago";
        }
        return formattedDuration;


    }

    public static String getJsonFile(Context context, String filename) {

        String json = null;

        try {
            InputStream is = context.getAssets().open(filename);
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

        return json;
    }

    public static String getChampionName(int champId, Context context) throws JSONException {

        String json = getJsonFile(context, "champion.json");

        JSONObject champ = new JSONObject(json);
        JSONObject data = champ.getJSONObject("data");
        JSONObject champInfo = null;
        if (data.has(String.valueOf(champId))) {
            champInfo = data.getJSONObject(String.valueOf(champId));
        }
        String champName = "Default";
        if (champInfo != null) {
            JSONObject image = champInfo.getJSONObject("image");
            champName = image.getString("full");
        }

        return champName;
    }

    public void getAllChampions(Context context, AllChampionsCallBack allChampionsCallBack) {
        List<Champion> championList = new ArrayList<>();
        String json = getJsonFile(context, "champion.json");
        String championName;
        JSONObject championObj;

        try {
            championObj = new JSONObject(json);
            JSONObject data = championObj.getJSONObject("data");

            Iterator<String> keys = data.keys();
            while (keys.hasNext()) {
                String key = keys.next();
                JSONObject data1 = data.getJSONObject(key);
                JSONObject image = data1.getJSONObject("image");
                String championImage = image.getString("full");
                Champion champion = new Champion();
                champion.setId(Integer.valueOf(key));
                champion.setImageName(championImage);
                championList.add(champion);
            }
            allChampionsCallBack.onSuccess(championList);
        } catch (JSONException e) {
            allChampionsCallBack.onFailure(e.getMessage());
            e.printStackTrace();
        }
    }
}


