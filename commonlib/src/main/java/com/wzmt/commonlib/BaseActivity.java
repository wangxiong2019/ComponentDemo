package com.wzmt.commonlib;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.alibaba.android.arouter.launcher.ARouter;

import androidx.appcompat.app.AppCompatActivity;

/**
 * 创建 by hero
 * 时间 2020/6/15
 * 类名
 */
public abstract class BaseActivity extends AppCompatActivity {
    public String TAG = "";

    public Activity mActivity;
    public Context mContext;

    public Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());
        mActivity = this;
        mContext = this;
        TAG = getLocalClassName();

        //初始化接收上个页面传过来的值
        ARouter.getInstance().inject(this);

        initView();


    }

    public abstract int getLayout();

    public abstract void initView();
}
