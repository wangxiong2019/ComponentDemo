package com.wzmt.componentdemo;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.wzmt.commonlib.BaseActivity;
import com.wzmt.commonlib.RouteUtils;


public class MainActivity extends BaseActivity {


    TextView tv_user;


    @Override
    public int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    public void initView() {
        tv_user = findViewById(R.id.tv_user);
    }

    public void toUserAc(View view) {

        //传参数  带返回值
        ARouter.getInstance().build(RouteUtils.UserAc)
                .withString("name", "老王")
                .withInt("age", 18)
                .withBoolean("boy", true)
                .navigation(this, 1);
    }

    public void toShopMainAc(View view){
        //不带返回值
        ARouter.getInstance().build(RouteUtils.ShopMainAc).navigation();
    }
    public void toMyInfoAc(View view) {

        ARouter.getInstance().build(RouteUtils.MyInfoAc, RouteUtils.needLogin).navigation();


//        ARouter.getInstance().build(RouteUtils.MyInfoAc, RouteUtils.needLogin).navigation(mContext, new NavCallback() {
//            @Override
//            public void onFound(Postcard postcard) {
//                super.onFound(postcard);
//                //路由目标被发现时调用
//                Log.e("huangxiaoguo", "发现了");
//            }
//
//            @Override
//            public void onLost(Postcard postcard) {
//                super.onLost(postcard);
//                //路由被丢失时调用
//                Log.e("huangxiaoguo", "丢失了");
//            }
//
//            @Override
//            public void onArrival(Postcard postcard) {
//                //路由到达之后调用
//                Log.e("huangxiaoguo", "到达了");
//            }
//
//            @Override
//            public void onInterrupt(Postcard postcard) {
//                super.onInterrupt(postcard);
//                //路由被拦截时调用
//                Log.e("huangxiaoguo", "拦截了");
//            }
//        });
    }

    public void toFarg(View view) {
        Intent intent = new Intent(mContext, FragmentAc.class);
        startActivity(intent);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        // TODO Auto-generated method stub
        if (resultCode == RESULT_OK) {
            switch (requestCode) {
                case 1:
                    String name = data.getStringExtra("name");
                    tv_user.setText(name + "");
                    break;
            }
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

}
