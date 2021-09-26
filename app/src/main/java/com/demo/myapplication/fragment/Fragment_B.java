package com.demo.myapplication.fragment;

import android.os.Bundle;
import android.view.View;

import com.demo.myapplication.R;
import com.gsls.gt.GT;

@GT.Annotations.GT_AnnotationFragment(R.layout.b_fragment)
public class Fragment_B extends GT.GT_Fragment.AnnotationFragment {

    public static Fragment_B newInstance(Bundle bundle) {
        Fragment_B fragment = new Fragment_B();
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    protected void initView(View view, Bundle savedInstanceState) {
        super.initView(view, savedInstanceState);
        //组件初始化
        GT.log(getClass().getSimpleName());

        view.findViewById(R.id.tv_start).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startFragment(Fragment_C.class);//启动Fragment页面
            }
        });

        view.findViewById(R.id.btn_back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();//退出当前Fragment页面
            }
        });



    }

}
