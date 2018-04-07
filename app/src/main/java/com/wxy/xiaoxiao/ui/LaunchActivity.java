package com.wxy.xiaoxiao.ui;


import android.os.Bundle;
import android.view.WindowManager;

import com.wxy.xiaoxiao.R;
import com.wxy.xiaoxiao.base.BaseActivity;


public class LaunchActivity extends BaseActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //取消状态栏
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        toGetData();

    }
    /**
     * 请求判断跳转
     */
    private void toGetData() {
//        RequestParams params = new RequestParams(BuildConfig.url);
//        params.addBodyParameter("appid", BuildConfig.appid);
//        params.addBodyParameter("type","android");
//        x.http().get(params, new Callback.CommonCallback<String>() {
//
//            @Override
//            public void onSuccess(String result) {
//                try {
//                    JSONObject jsonObject=new JSONObject(result);
//                    if (jsonObject.getInt("rt_code")==200){
//                        String base64Data = jsonObject.getString("data");
//                        String realData= Base64.decode(base64Data);
//                        JSONObject jsonObject1=new JSONObject(realData);
//
//                        int flag = jsonObject1.getInt("show_url");
//                        if (flag == 1) {
//                            Bundle bundle=new Bundle();
//                            bundle.putString(BuildConfig.FLAVOR,jsonObject1.getString("url"));
//                            MyUtils.openActivity(LaunchActivity.this, WebMainActivity.class,bundle);
//                            finish();
//                        } else {
//                            MyUtils.openActivity(LaunchActivity.this, MainActivity.class);
//                            finish();
//                        }
//
//                    }else {
//                        MyUtils.openActivity(LaunchActivity.this,MainActivity.class);
//                        finish();
//                    }
//                } catch (JSONException e) {
//                    e.printStackTrace();
//                    MyUtils.openActivity(LaunchActivity.this,MainActivity.class);
//                    finish();
//                }
//            }
//
//            @Override
//            public void onError(Throwable ex, boolean isOnCallback) {
//                MyUtils.openActivity(LaunchActivity.this,MainActivity.class);
//            }
//
//            @Override
//            public void onCancelled(CancelledException cex) {
//
//            }
//
//            @Override
//            public void onFinished() {
//
//            }
//        });
    }
    @Override
    protected int getLayoutId() {
        return R.layout.activity_launch;
    }
}