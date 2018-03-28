package com.example.heaijia.ajiajia.activity.duanmodel.ui;

import android.view.View;
import android.widget.Toast;

import com.example.heaijia.ajiajia.R;
import com.example.heaijia.ajiajia.base.Activity.BaseNoBarActivity;
import com.example.heaijia.ajiajia.base.Activity.BaseToolBarActivity;

/**
 * @author heaijia
 * @since 2018/3/25 下午8:28
 * email 549044363@qq.com
 */

public class UIActivity extends BaseToolBarActivity{


    @Override
    protected int getLayoutId() {
        return R.layout.activity_ui;
    }

    @Override
    protected void initVariable() {

    }

    @Override
    protected void initView() {
        initToolBar();

    }

    @Override
    protected void loadData() {

    }

    private void initToolBar(){
        setToolbarTitle("UI and PM");
        setToolBarRightTop(R.drawable.ic_search);
        getToolBar().findViewById(R.id.img_toolbar_right_top).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(UIActivity.this,"搜索按钮事件，敬请期待",Toast.LENGTH_SHORT);
            }
        });
    }



}
