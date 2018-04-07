package com.wxy.xiaoxiao.bean;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Administrator on 2017/12/22.
 */

public class AreaBean implements Parcelable{
    private String name;
    private String type;
    private String url;

    public AreaBean(String name, String type,String url) {
        this.name = name;
        this.type = type;
        this.url=url;
    }


    protected AreaBean(Parcel in) {
        name = in.readString();
        type = in.readString();
        url = in.readString();
    }

    public static final Creator<AreaBean> CREATOR = new Creator<AreaBean>() {
        @Override
        public AreaBean createFromParcel(Parcel in) {
            return new AreaBean(in);
        }

        @Override
        public AreaBean[] newArray(int size) {
            return new AreaBean[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(type);
        parcel.writeString(url);
    }
}
