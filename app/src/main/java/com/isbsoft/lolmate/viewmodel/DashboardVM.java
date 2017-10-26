package com.isbsoft.lolmate.viewmodel;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by emre on 10/8/2017.
 */

public class DashboardVM implements Parcelable {


    public static final Creator<DashboardVM> CREATOR = new Creator<DashboardVM>() {
        @Override
        public DashboardVM createFromParcel(Parcel in) {
            return new DashboardVM(in);
        }

        @Override
        public DashboardVM[] newArray(int size) {
            return new DashboardVM[size];
        }
    };
    private int id;
    private int accountID;
    private String name;
    private int profileIconID;
    private long revisionDate;
    private int summonerLevel;

    public DashboardVM() {

    }

    protected DashboardVM(Parcel in) {
        id = in.readInt();
        accountID = in.readInt();
        name = in.readString();
        profileIconID = in.readInt();
        revisionDate = in.readLong();
        summonerLevel = in.readInt();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProfileIconID() {
        return profileIconID;
    }

    public void setProfileIconID(int profileIconID) {
        this.profileIconID = profileIconID;
    }

    public long getRevisionDate() {
        return revisionDate;
    }

    // parcelable

    public void setRevisionDate(long revisionDate) {
        this.revisionDate = revisionDate;
    }

    public int getSummonerLevel() {
        return summonerLevel;
    }

    public void setSummonerLevel(int summonerLevel) {
        this.summonerLevel = summonerLevel;
    }

    @Override
    public String toString() {
        return "DashboardVM{" +
                "id=" + id +
                ", accountID=" + accountID +
                ", name='" + name + '\'' +
                ", profileIconID=" + profileIconID +
                ", revisionDate=" + revisionDate +
                ", summonerLevel=" + summonerLevel +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(id);
        parcel.writeInt(accountID);
        parcel.writeString(name);
        parcel.writeInt(profileIconID);
        parcel.writeLong(revisionDate);
        parcel.writeInt(summonerLevel);
    }
}
