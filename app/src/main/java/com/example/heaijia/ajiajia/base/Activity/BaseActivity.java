package com.example.heaijia.ajiajia.base.Activity;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.AttributeSet;
import android.view.View;

import com.example.heaijia.ajiajia.utils.Utility;

import butterknife.ButterKnife;

/**
 * @author heaijia
 * @since 2018/3/23 下午9:18
 * email 549044363@qq.com
 */

public abstract class

BaseActivity extends AppCompatActivity {


    /**
     * 进度窗
     * @param savedInstanceState
     */
    protected ProgressDialog progressDialog;

    /**
     * 取消ProgressDialog
     */
    protected void disMissProgressDialog(){
        if(!isDestroyed()&&progressDialog.isShowing()){
            Utility.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    progressDialog.dismiss();
                }
            });
        }
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //禁止APP横屏
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }


    @Override
    public View onCreateView(View parent, String name, Context context, AttributeSet attrs) {
        return super.onCreateView(parent, name, context, attrs);
    }

    /**
     * 初始化活动操作
     */
    protected void initActivity() {
        ButterKnife.bind(this);
        initVariable();
        initView();
        loadData();
    }

    /**
     * 获取LayoutId.
     *
     * @return LayoutId 布局文件Id
     */
    @LayoutRes
    protected abstract int getLayoutId();

    /**
     * 初始化变量.
     */
    protected abstract void initVariable();

    /**
     * 初始化View的状态，挂载各种监听事件.
     */
    protected abstract void initView();

    /**
     * 初始化加载页面数据.
     */
    protected abstract void loadData();

}
