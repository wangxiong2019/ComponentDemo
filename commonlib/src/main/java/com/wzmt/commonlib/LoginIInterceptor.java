package com.wzmt.commonlib;

import android.content.Context;
import android.util.Log;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Interceptor;
import com.alibaba.android.arouter.facade.callback.InterceptorCallback;
import com.alibaba.android.arouter.facade.template.IInterceptor;
import com.alibaba.android.arouter.launcher.ARouter;

/**
 * 创建 by hero
 * 时间 2020/6/15
 * 类名 拦截器
 */

/**
 * Created by Administrator on 2017/12/6 0006.
 * 添加拦截器的时候，建议clean再打包运行，不然会出现，无效的情况
 * <p>
 * 切记一个项目里面priority的值保证唯一，不然会出毛病
 */
@Interceptor(priority = 1, name = "重新分组进行拦截")
public class LoginIInterceptor implements IInterceptor {
    @Override
    public void process(Postcard postcard, InterceptorCallback callback) {
        if (postcard.getGroup().equals(RouteUtils.needLogin)) {

            if(RouteUtils.isLogin){
                callback.onContinue(postcard);
            }else {
                callback.onInterrupt(null);
                ARouter.getInstance().build(RouteUtils.LoginAc)
                        .withString("path", postcard.getPath()).navigation();
            }

        } else {
            postcard.withString("extra", "我是在拦截器中附加的参数");
            callback.onContinue(postcard);
        }
    }

    @Override
    public void init(Context context) {

    }
}
