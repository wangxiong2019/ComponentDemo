package com.wzmt.usercomponent.activity;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.wzmt.commonlib.BaseActivity;
import com.wzmt.commonlib.RouteUtils;
import com.wzmt.usercomponent.R;

/**
 * 创建 by hero
 * 时间 2020/6/15
 * 类名
 */
@Route(path = RouteUtils.UserMainAc)
public class MainActivity extends BaseActivity {

    TextView tv_main;


    @Override
    public int getLayout() {
        return R.layout.usercomponent_activity_main;
    }

    @Override
    public void initView() {
        tv_main = mActivity.findViewById(R.id.tv_main);
        tv_main.setText("返回host app主页");
        tv_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "对不起，暂时无法返回host主页", Toast.LENGTH_SHORT).show();
            }
        });
    }

}
