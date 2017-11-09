package com.isbsoft.lolmate.viewmodel;

import android.os.Parcel;
import android.os.Parcelable;

import com.isbsoft.lolmate.core.network.endpoints.match.dto.Match;

import java.util.ArrayList;

/**
 * Created by emre on 11/3/2017.
 */

public class MatchListVM implements Parcelable {

    public static final Creator<MatchListVM> CREATOR = new Creator<MatchListVM>() {
        @Override
        public MatchListVM createFromParcel(Parcel in) {
            return new MatchListVM(in);
        }

        @Override
        public MatchListVM[] newArray(int size) {
            return new MatchListVM[size];
        }
    };
    private Match match;
    private ArrayList<Match> matches;

    protected MatchListVM(Parcel parcel) {
        match = (Match) parcel.readSerializable();
        matches = parcel.readArrayList(null);
    }

    public MatchListVM() {
    }

    public Match getMatch() {
        return match;
    }

    public void setMatch(Match match) {
        this.match = match;
    }

    public ArrayList<Match> getMatches() {
        return matches;
    }

    public void setMatches(ArrayList<Match> matches) {
        this.matches = matches;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(match);
        parcel.writeList(matches);
    }
}
