package com.wzmt.usercomponent.activity.needlogin;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.wzmt.commonlib.BaseActivity;
import com.wzmt.commonlib.RouteUtils;
import com.wzmt.usercomponent.R;

/**
 * 创建 by hero
 * 时间 2020/6/15
 * 类名
 */
@Route(path = RouteUtils.MyInfoAc, group = RouteUtils.needLogin)
public class MyInfoAc extends BaseActivity {
    @Override
    public int getLayout() {
        return R.layout.usercomponent_activity_user;
    }

    @Override
    public void initView() {

    }
}
