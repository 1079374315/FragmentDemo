package com.demo.myapplication.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.demo.myapplication.R;
import com.gsls.gt.GT;

@GT.Annotations.GT_AnnotationFragment(R.layout.a_fragment)
public class Fragment_A extends GT.GT_Fragment.AnnotationFragment {

    @Override
    protected void initView(View view, Bundle savedInstanceState) {
        super.initView(view, savedInstanceState);
        //组件初始化

        GT.log(getClass().getSimpleName());

        view.findViewById(R.id.tv_start).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //启动Fragment页面
                Bundle bundle = new Bundle();
                bundle.putString("name","小明");
                startFragment(Fragment_B.newInstance(bundle)); //传递数据的写法
//                startFragment(Fragment_B.class);//不传递数据的写法
            }
        });

        view.findViewById(R.id.btn_back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.finish();
            }
        });

    }

    @Override
    protected boolean onBackPressed() {
        GT.toast("监听按下返回键");
        return true;
    }
}
