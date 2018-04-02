package com.example.heaijia.ajiajia.activity.duanmodel.ui;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Toast;

import com.example.heaijia.ajiajia.R;
import com.example.heaijia.ajiajia.activity.duanmodel.ui.adapter.UIandPMPagerAdapter;
import com.example.heaijia.ajiajia.base.Activity.BaseToolBarActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @author heaijia
 * @since 2018/3/25 下午8:28
 * email 549044363@qq.com
 */

public class UIActivity extends BaseToolBarActivity {


    @BindView(R.id.tl_ui_and_pm)
    TabLayout mTabLayout;
    @BindView(R.id.wp_ui_and_pm)
    ViewPager mViewPager;
    @BindView(R.id.btn_add_article)
    FloatingActionButton btnAddArticle;

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
        initViewPager();

    }

    @Override
    protected void loadData() {

    }

    private void initToolBar() {
        setToolbarTitle("UI and PM");
        setToolBarRightTop(R.drawable.ic_search);
        getToolBar().findViewById(R.id.img_toolbar_right_top).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(UIActivity.this, "搜索按钮事件，敬请期待", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initViewPager() {

        UIandPMPagerAdapter muIandPMPagerAdapter = new UIandPMPagerAdapter(getSupportFragmentManager());

        mViewPager.setAdapter(muIandPMPagerAdapter);

        mTabLayout.setupWithViewPager(mViewPager);



    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }
}
