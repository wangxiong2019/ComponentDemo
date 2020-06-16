package com.wzmt.commonlib;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import android.widget.Toast;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * 创建 by hero
 * 时间 2020/6/14
 * 类名
 */
public class BaseApplication extends Application {


    @Override
    public void onCreate() {
        super.onCreate();
        boolean isDebug = isApkInDebug(this);
        Log.e("BaseApplication", "isDebug=" + isDebug);
        Toast.makeText(this,"isDebug=" + isDebug,Toast.LENGTH_SHORT).show();
        if (isDebug) {
            ARouter.openLog();
            ARouter.openDebug();
        }
        ARouter.init(this);
    }

    /**
     * 判断当前应用是否是debug状态
     */

    public static boolean isApkInDebug(Context context) {
        try {
            ApplicationInfo info = context.getApplicationInfo();
            return (info.flags & ApplicationInfo.FLAG_DEBUGGABLE) != 0;
        } catch (Exception e) {
            return false;
        }
    }


}
