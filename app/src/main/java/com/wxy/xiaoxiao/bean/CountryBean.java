package com.wxy.xiaoxiao.bean;

/**
 * Created by Administrator on 2017/12/21.
 */

public class CountryBean {
    private int icon;
    private String name;
    private String title;
    private String url;

    public CountryBean(int icon, String name, String title, String url) {
        this.icon = icon;
        this.name = name;
        this.title = title;
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }
}
