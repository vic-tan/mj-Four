package com.wxy.xiaoxiao.ui;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.wxy.xiaoxiao.BuildConfig;
import com.wxy.xiaoxiao.R;
import com.wxy.xiaoxiao.base.BaseActivity;
import com.wxy.xiaoxiao.bean.DataResopnse;
import com.wxy.xiaoxiao.utils.AllActivitiesHolder;
import com.wxy.xiaoxiao.utils.TitleBar;

/**
 * Created by Administrator on 2017/12/22.
 */

public class SSQActivity extends BaseActivity implements TabLayout.OnTabSelectedListener {
    TextView tv_des,tv_msg;
    TabLayout tab_ssq;
    ImageView iv_ssq;
    TitleBar tvTitle;
    String[] title = new String[]{"号码走势", "K线图", "设奖"};
    DataResopnse resopnse;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        resopnse=getIntent().getParcelableExtra(BuildConfig.FLAVOR);
        tv_des=findViewById(R.id.tv_des);
        tab_ssq=findViewById(R.id.tab_ssq);
        iv_ssq=findViewById(R.id.iv_ssq);
        tv_msg=findViewById(R.id.tv_msg);
        tvTitle=findViewById(R.id.tv_title);
        for (String s : title) {
            tab_ssq.addTab(tab_ssq.newTab().setText(s));
        }

        tab_ssq.setTabMode(TabLayout.MODE_FIXED);
        tab_ssq.setOnTabSelectedListener(this);
        iv_ssq.setImageResource(R.mipmap.ssq_zs);

        tvTitle.setTitle(resopnse.getTitle());
        tv_des.setText(resopnse.getDes());
        tvTitle.setRightButtonEnable(false);
        tvTitle.setEvents(new TitleBar.AddClickEvents() {
            @Override
            public void clickLeftButton() {
                AllActivitiesHolder.removeAct(SSQActivity.this);
            }

            @Override
            public void clickRightButton() {
            }
        });
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_ssq;
    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        if (tab.getPosition()==0){
            iv_ssq.setImageResource(resopnse.getZoushi());
            iv_ssq.setVisibility(View.VISIBLE);
            tv_msg.setVisibility(View.GONE);
        }else if (tab.getPosition()==1){
            iv_ssq.setImageResource(resopnse.getKxiantu());
            iv_ssq.setVisibility(View.VISIBLE);
            tv_msg.setVisibility(View.GONE);
        }else if (tab.getPosition()==2){
            if (TextUtils.isEmpty(resopnse.getJiang())){
                iv_ssq.setVisibility(View.VISIBLE);
                tv_msg.setVisibility(View.GONE);
                iv_ssq.setImageResource(resopnse.getKaijiang());

            }else {
                tv_msg.setVisibility(View.VISIBLE);
                iv_ssq.setVisibility(View.GONE);
                tv_msg.setText(resopnse.getJiang());
            }

        }

    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }
}
