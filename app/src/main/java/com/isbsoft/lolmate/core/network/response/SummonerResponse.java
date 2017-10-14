package com.isbsoft.lolmate.core.network.response;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 * Created by emre on 10/6/2017.
 */

public class SummonerResponse extends BaseResponse implements Parcelable {

    public static final Creator<SummonerResponse> CREATOR = new Creator<SummonerResponse>() {
        @Override
        public SummonerResponse createFromParcel(Parcel source) {
            return new SummonerResponse(source);
        }

        @Override
        public SummonerResponse[] newArray(int size) {
            return new SummonerResponse[size];
        }
    };
    @SerializedName("id")
    private int id;
    @SerializedName("accountId")
    private int accountID;
    @SerializedName("name")
    private String name;
    @SerializedName("profileIconId")
    private int profileIconID;
    @SerializedName("revisionDate")
    private long revisionDate;
    @SerializedName("summonerLevel")
    private int summonerLevel;

    public SummonerResponse() {
    }

    protected SummonerResponse(Parcel in) {
        this.id = in.readInt();
        this.accountID = in.readInt();
        this.name = in.readString();
        this.profileIconID = in.readInt();
        this.revisionDate = in.readLong();
        this.summonerLevel = in.readInt();
    }

    public int getId() {
        return id;
    }

    public int getAccountID() {
        return accountID;
    }

    public String getName() {
        return name;
    }

    public int getProfileIconID() {
        return profileIconID;
    }

    public long getRevisionDate() {
        return revisionDate;
    }

    public int getSummonerLevel() {
        return summonerLevel;
    }

    @Override
    public String toString() {
        return "SummonerResponse{" +
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
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.id);
        dest.writeInt(this.accountID);
        dest.writeString(this.name);
        dest.writeInt(this.profileIconID);
        dest.writeLong(this.revisionDate);
        dest.writeInt(this.summonerLevel);
    }
}
