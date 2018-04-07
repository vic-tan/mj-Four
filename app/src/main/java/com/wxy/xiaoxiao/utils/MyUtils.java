package com.wxy.xiaoxiao.utils;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.wxy.xiaoxiao.R;

/**
 * Created by Administrator on 2017/12/21.
 */

public class MyUtils {


    /**
     * 得到自定义的progressDialog
     *
     * @return
     */
    public static Dialog createLoadingDialog(Context context, String msg) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.loading_dialog, null);// 得到加载view
        // main.xml中的ImageView
        ImageView spaceshipImage = (ImageView) v.findViewById(R.id.img);
        TextView tipTextView = (TextView) v.findViewById(R.id.tipTextView);// 提示文字
        // 加载动画
        Animation hyperspaceJumpAnimation = AnimationUtils.loadAnimation(
                context, R.anim.loading_animation);
        // 使用ImageView显示动画
        spaceshipImage.startAnimation(hyperspaceJumpAnimation);
        if (!TextUtils.isEmpty(msg))
            tipTextView.setText(msg);// 设置加载信息

        Dialog loadingDialog = new Dialog(context, R.style.loading_dialog);// 创建自定义样式dialog
        //        loadingDialog.getWindow().setLayout(parentWidth,parentHeight);
        loadingDialog.setCancelable(false);// 不可以用“返回键”取消
        loadingDialog.setContentView(v, new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT));// 设置布局
        return loadingDialog;

    }
    public static void openActivity(Context res, Class des){
        Intent intent = new Intent(res,des);
        res.startActivity(intent);
    }

    public static void openActivity(Context res, Class des, Bundle bundle){
        Intent intent = new Intent(res,des);
        intent.putExtras(bundle);
        res.startActivity(intent);
    }
}
