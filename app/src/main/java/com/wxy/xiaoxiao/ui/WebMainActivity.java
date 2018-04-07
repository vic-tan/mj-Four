package com.wxy.xiaoxiao.ui;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.DownloadListener;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


import com.wxy.xiaoxiao.BuildConfig;
import com.wxy.xiaoxiao.R;
import com.wxy.xiaoxiao.base.BaseActivity;
import com.wxy.xiaoxiao.utils.DoubleClickExitUtil;

import butterknife.BindView;

public class WebMainActivity extends BaseActivity {

    @BindView(R.id.wv_webmain_showurl)
    WebView mWvWebmainShowurl;
    String loadUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loadUrl=getIntent().getStringExtra(BuildConfig.FLAVOR);
        // 获取到UserAgentString 并修改
        mWvWebmainShowurl=findViewById(R.id.wv_webmain_showurl);
        setWebviewSetting(mWvWebmainShowurl.getSettings(),getApplicationContext().getCacheDir().getAbsolutePath());
        mWvWebmainShowurl.setDownloadListener(new MyWebViewDownLoadListener());
        mWvWebmainShowurl.setWebViewClient(new WebViewClient());
        mWvWebmainShowurl.loadUrl(loadUrl);
    }

    private class MyWebViewDownLoadListener implements DownloadListener {

        @Override
        public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype,
                                    long contentLength) {

            Uri uri = Uri.parse(url);
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        }
    }

    @Override
    public void onBackPressed() {
        DoubleClickExitUtil.tryExit();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_web_main;
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
