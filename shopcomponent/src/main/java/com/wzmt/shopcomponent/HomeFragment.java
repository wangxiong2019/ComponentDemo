package com.wzmt.shopcomponent;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.wzmt.commonlib.RouteUtils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

/**
 * 创建 by hero
 * 时间 2020/6/15
 * 类名
 */
@Route(path = RouteUtils.ShopFragment)
public class HomeFragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.shopcomponent_fragment_home, container, false);
        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    Activity mActivity;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        mActivity = getActivity();
        init();
    }

    private void init() {
        TextView tv_click = mActivity.findViewById(R.id.tv_click);
        tv_click.setText("进入user模块主页");
        tv_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ARouter.getInstance().build(RouteUtils.UserMainAc).navigation();

//                Intent intent = new Intent(mActivity, MainA.class);
//                startActivity(intent);
            }
        });
    }
}
