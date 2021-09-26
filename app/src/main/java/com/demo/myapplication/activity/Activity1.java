package com.demo.myapplication.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.demo.myapplication.R;
import com.demo.myapplication.fragment.Fragment_A;
import com.demo.myapplication.fragment.Fragment_B;
import com.demo.myapplication.fragment.Fragment_C;
import com.demo.myapplication.fragment.Fragment_D;
import com.gsls.gt.GT;

//不继承GT注解基类也是可以的，只需要 GT.build(this);//绑定当前Activity 即可，写在 onCreate 方法中
@GT.Annotations.GT_AnnotationActivity(R.layout.activity_1)
public class Activity1 extends GT.GT_Activity.AnnotationActivity {

    //通过注解获取组件，也可以使用findViewById 效果相同
    @GT.Annotations.GT_View(R.id.tv_log)
    private TextView tv_log;

    //构建 Fragment 管理器 并指定首页加载的数据
    @GT.GT_Fragment.Build(setClass = Fragment_A.class, setLayoutMain = R.id.fl_main, setStartMode = GT.GT_Fragment.MODE_HOME)
    private GT.GT_Fragment gt_fragment;

    @Override
    protected void initView(Bundle savedInstanceState) {
        super.initView(savedInstanceState);
        //其他业务逻辑

//        gt_fragment.switchingMode(GT.GT_Fragment.DIALOG);//切换模式设置 Dialog,Fragment 切换时不调用生命周期
    }

    //单击按钮切换页面
    @GT.Annotations.GT_Click({R.id.btn_a, R.id.btn_b, R.id.btn_c, R.id.btn_d})
    public void onClickView(View view) {
        switch (view.getId()) {
            case R.id.btn_a:
                startFragmentHome(Fragment_A.class);
                tv_log.setText("跳转A页面");
                break;
            case R.id.btn_b:
                startFragmentHome(Fragment_B.class);
                tv_log.setText("跳转B页面");
                break;
            case R.id.btn_c:
                startFragmentHome(Fragment_C.class);
                tv_log.setText("跳转C页面");
                break;
            case R.id.btn_d:
                startFragmentHome(Fragment_D.class);
                tv_log.setText("跳转D页面");
                break;
        }
    }

}