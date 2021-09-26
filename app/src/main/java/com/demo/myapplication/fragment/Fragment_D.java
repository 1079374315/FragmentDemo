package com.demo.myapplication.fragment;

import android.os.Bundle;
import android.view.View;

import com.demo.myapplication.R;
import com.gsls.gt.GT;

@GT.Annotations.GT_AnnotationFragment(R.layout.d_fragment)
public class Fragment_D extends GT.GT_Fragment.AnnotationFragment {

    @Override
    protected void initView(View view, Bundle savedInstanceState) {
        super.initView(view, savedInstanceState);
        //组件初始化

        GT.log(getClass().getSimpleName());

        view.findViewById(R.id.btn_back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();//退出当前Fragment页面
            }
        });

    }

    @Override
    protected void loadData() {
        super.loadData();
        //业务逻辑
    }
}
