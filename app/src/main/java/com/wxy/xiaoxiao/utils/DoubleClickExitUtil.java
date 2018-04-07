package com.wxy.xiaoxiao.utils;

import android.widget.Toast;

import com.wxy.xiaoxiao.MyApplication;

import java.util.Date;


public class DoubleClickExitUtil {

    private static long lastBackPressedTime = 0;
    private static final int LIMIT_DURATION = 1500 ;

    public static void tryExit(){
        long currentBackPressedTime = new Date().getTime();
        if (currentBackPressedTime - lastBackPressedTime < LIMIT_DURATION) {
            lastBackPressedTime = 0;
            AllActivitiesHolder.finishAllAct();
            //杀死进程，如果不这么做，下一次启动会出现StackOverFlowError错误
            System.exit(0);
        } else {
            Toast.makeText(MyApplication.getContext(), "再次点击退出", LIMIT_DURATION).show();
            lastBackPressedTime = currentBackPressedTime;
        }
    };

}
