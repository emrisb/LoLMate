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
    private ArrayList<Match> matches;

    public MatchListVM() {
    }

    protected MatchListVM(Parcel in) {
        matches = in.readArrayList(null);
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
        parcel.writeList(matches);
    }
}
