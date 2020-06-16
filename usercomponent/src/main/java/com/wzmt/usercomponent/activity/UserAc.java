package com.wzmt.usercomponent.activity;

import android.content.Intent;
import android.view.KeyEvent;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.wzmt.commonlib.BaseActivity;
import com.wzmt.commonlib.RouteUtils;
import com.wzmt.usercomponent.R;

/**
 * 创建 by hero
 * 时间 2020/6/15
 * 类名
 */

@Route(path = RouteUtils.UserAc)
public class UserAc extends BaseActivity {

    TextView tv_click;

    @Autowired
    String name;//接收上个页面传过来的值
    @Autowired
    int age;

    @Override
    public int getLayout() {
        return R.layout.usercomponent_activity_user;
    }

    @Override
    public void initView() {


        tv_click = findViewById(R.id.tv_click);
        String Str = "";
//        String name = getIntent().getStringExtra("name");
//        int age = getIntent().getIntExtra("age", 0);


        Str = "传过来的值：\n" + "name:" + name + "\t\t" + "age:" + age;
        tv_click.setText(Str);
    }

    //按返回键
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK
                && event.getAction() == KeyEvent.ACTION_DOWN) {
            intent = new Intent();
            intent.putExtra("name", "1234");
            setResult(RESULT_OK, intent);
            finish();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}
