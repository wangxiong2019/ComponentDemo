package com.wzmt.shopcomponent;

import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.wzmt.commonlib.BaseActivity;
import com.wzmt.commonlib.RouteUtils;

/**
 * 创建 by hero
 * 时间 2020/6/15
 * 类名
 */
@Route(path = RouteUtils.LoginAc)
public class LoginAc extends BaseActivity {

    @Autowired
    String path;

    @Override
    public int getLayout() {
        return R.layout.shopcomponent_ac_login;
    }

    @Override
    public void initView() {
        Toast.makeText(mContext,"path:"+path,Toast.LENGTH_SHORT).show();
    }
}
