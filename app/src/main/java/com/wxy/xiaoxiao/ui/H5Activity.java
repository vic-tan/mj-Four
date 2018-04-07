package com.wxy.xiaoxiao.ui;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.wxy.xiaoxiao.BuildConfig;
import com.wxy.xiaoxiao.R;
import com.wxy.xiaoxiao.base.BaseActivity;
import com.wxy.xiaoxiao.bean.AreaBean;
import com.wxy.xiaoxiao.utils.AllActivitiesHolder;
import com.wxy.xiaoxiao.utils.TitleBar;

/**
 * Created by Administrator on 2017/12/22.
 */

public class H5Activity extends BaseActivity {
    TitleBar titleBar;
    WebView web;
    AreaBean areaBean;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        titleBar=findViewById(R.id.tv_title);
        areaBean=getIntent().getParcelableExtra(BuildConfig.FLAVOR);
        titleBar.setTitle(areaBean.getName());
        web=findViewById(R.id.web);
        setWebviewSetting(web.getSettings(),getApplicationContext().getCacheDir().getAbsolutePath());
        web.loadUrl(areaBean.getUrl());
        web.setWebViewClient(new WebViewClient());
        titleBar.setRightButtonEnable(false);
        titleBar.setEvents(new TitleBar.AddClickEvents() {
            @Override
            public void clickLeftButton() {
                AllActivitiesHolder.removeAct(H5Activity.this);
            }

            @Override
            public void clickRightButton() {
            }
        });
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_h5;
    }
    /**
     * 设置h5的样式
     */
    public static void setWebviewSetting(WebSettings setting, String appCachePath) {
        setting.setTextZoom(100);
        setting.setJavaScriptEnabled(true);
        setting.setRenderPriority(WebSettings.RenderPriority.HIGH);
        //mWebView.getSettings().setCacheMode(WebSettings.LOAD_DEFAULT);  //设置 缓存模式
        setting.setCacheMode(WebSettings.LOAD_NO_CACHE);  //设置 缓存模式
        // 开启 DOM storage API 功能
        setting.setDomStorageEnabled(true);
        //开启 database storage API 功能
        setting.setDatabaseEnabled(true);
        //设置数据库缓存路径
        setting.setDatabasePath(appCachePath);
        //设置  Application Caches 缓存目录
        setting.setAppCachePath(appCachePath);
        //开启 Application Caches 功能
        setting.setAppCacheEnabled(true);
        //设置可以访问文件
        setting.setAllowFileAccess(true);
        //设置支持缩放
        setting.setBuiltInZoomControls(false);
        setting.setUseWideViewPort(true);
        setting.setLoadWithOverviewMode(true);
    }
}
