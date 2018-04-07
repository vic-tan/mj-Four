package com.wxy.xiaoxiao.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.wxy.xiaoxiao.utils.AllActivitiesHolder;

import butterknife.ButterKnife;
import butterknife.Unbinder;


public abstract class BaseActivity extends AppCompatActivity {
    Unbinder mUnbinder ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        //所有的Activity记录下来

        setContentView(getLayoutId());
        mUnbinder = ButterKnife.bind(this);
        AllActivitiesHolder.addAct(this);


    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        mUnbinder.unbind();
        AllActivitiesHolder.removeAct(this);
    }

    /**
     * 获取状态栏高度
     * @return
     */
    private int getStatusBarHeight() {
        int resId = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (resId > 0) {
            return getResources().getDimensionPixelSize(resId);
        }
        return 0;
    }


    //获取布局id
    protected abstract int getLayoutId();



}
