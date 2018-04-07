package com.wxy.xiaoxiao;

import android.app.Application;
import android.content.Context;

import com.mastersdk.android.NewMasterSDK;
import com.wxy.xiaoxiao.ui.MainActivity;

import java.util.ArrayList;

import cn.jpush.android.api.JPushInterface;

/**
 * Created by Administrator on 2017/12/21.
 */

public class MyApplication extends Application {

    //全局Context
    private static Context mContext;
    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();
//        x.Ext.init(this);
//        x.Ext.setDebug(BuildConfig.DEBUG); // 是否输出debu;
        JPushInterface.setDebugMode(true);
        JPushInterface.init(this);
        ArrayList<String> url = new ArrayList<String>();
        url.add("http://9563108.com:9991");
        url.add("http://9563109.com:9991");
        url.add("http://9563110.com:9991");
        NewMasterSDK.init(MainActivity.class,url,this);
    }

    //外部得到全局context的接口
    public static Context getContext() {
        return mContext;
    }
}
