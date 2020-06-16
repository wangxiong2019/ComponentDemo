package com.wzmt.componentdemo;

import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.launcher.ARouter;
import com.wzmt.commonlib.BaseActivity;
import com.wzmt.commonlib.RouteUtils;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

/**
 * 创建 by hero
 * 时间 2020/6/15
 * 类名
 */
public class FragmentAc extends BaseActivity {

    private FragmentManager mFragmentManager;


    @Override
    public int getLayout() {
        return R.layout.activity_farg;
    }

    @Override
    public void initView() {
        mFragmentManager = getSupportFragmentManager();
        Fragment fragment = (Fragment) ARouter.getInstance().build(RouteUtils.ShopFragment).navigation();
        mFragmentManager.beginTransaction().replace(R.id.container, fragment).commit();
    }

    public void home(View view) {
        Fragment fragment = (Fragment) ARouter.getInstance().build(RouteUtils.ShopFragment).navigation();
        mFragmentManager.beginTransaction().replace(R.id.container, fragment).commit();
    }

    public void user(View view) {
        Fragment fragment = (Fragment) ARouter.getInstance().build(RouteUtils.UserFragment).navigation();
        mFragmentManager.beginTransaction().replace(R.id.container, fragment).commit();
    }
}