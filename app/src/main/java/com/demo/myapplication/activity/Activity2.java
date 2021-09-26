package com.demo.myapplication.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.demo.myapplication.R;
import com.demo.myapplication.fragment.Fragment_A;
import com.gsls.gt.GT;

public class Activity2 extends AppCompatActivity {

    //构建 Fragment 管理器
    @GT.GT_Fragment.Build(setClass = Fragment_A.class, setLayoutMain = R.id.fl_main2)
    private GT.GT_Fragment gt_fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        GT.build(this);//绑定当前 Activity

    }
}