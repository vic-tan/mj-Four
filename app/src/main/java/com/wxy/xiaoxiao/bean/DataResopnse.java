package com.wxy.xiaoxiao.bean;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Administrator on 2017/12/25.
 */

public class DataResopnse implements Parcelable {
    private String title;
    private String des;
    private int zoushi;
    private int kxiantu;
    private int kaijiang;
    private String jiang;

    public DataResopnse(String title, String des, int zoushi, int kxiantu, int kaijiang) {
        this.title = title;
        this.des = des;
        this.zoushi = zoushi;
        this.kxiantu = kxiantu;
        this.kaijiang = kaijiang;
    }
    public DataResopnse(String title, String des, int zoushi, int kxiantu, String jiang) {
        this.title = title;
        this.des = des;
        this.zoushi = zoushi;
        this.kxiantu = kxiantu;
        this.jiang = jiang;
    }

    protected DataResopnse(Parcel in) {
        title = in.readString();
        des = in.readString();
        zoushi = in.readInt();
        kxiantu = in.readInt();
        kaijiang = in.readInt();
        jiang = in.readString();
    }

    public static final Creator<DataResopnse> CREATOR = new Creator<DataResopnse>() {
        @Override
        public DataResopnse createFromParcel(Parcel in) {
            return new DataResopnse(in);
        }

        @Override
        public DataResopnse[] newArray(int size) {
            return new DataResopnse[size];
        }
    };

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public int getZoushi() {
        return zoushi;
    }

    public void setZoushi(int zoushi) {
        this.zoushi = zoushi;
    }

    public int getKxiantu() {
        return kxiantu;
    }

    public void setKxiantu(int kxiantu) {
        this.kxiantu = kxiantu;
    }

    public int getKaijiang() {
        return kaijiang;
    }

    public void setKaijiang(int kaijiang) {
        this.kaijiang = kaijiang;
    }

    public String getJiang() {
        return jiang;
    }

    public void setJiang(String jiang) {
        this.jiang = jiang;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(title);
        parcel.writeString(des);
        parcel.writeInt(zoushi);
        parcel.writeInt(kxiantu);
        parcel.writeInt(kaijiang);
        parcel.writeString(jiang);
    }
}
