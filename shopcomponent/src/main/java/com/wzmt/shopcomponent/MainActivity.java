package com.wzmt.shopcomponent;

import android.view.View;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.wzmt.commonlib.BaseActivity;
import com.wzmt.commonlib.RouteUtils;

/**
 * 创建 by hero
 * 时间 2020/6/15
 * 类名
 */
@Route(path = RouteUtils.ShopMainAc)
public class MainActivity extends BaseActivity {

    TextView tv_main;



    @Override
    public int getLayout() {
        return R.layout.shopcomponent_activity_main;
    }

    @Override
    public void initView() {
        tv_main = findViewById(R.id.tv_main2);
        tv_main.setText("返回app主页");
        tv_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ARouter.getInstance().build(RouteUtils.HostMainAc).navigation();

            }
        });
    }

}
