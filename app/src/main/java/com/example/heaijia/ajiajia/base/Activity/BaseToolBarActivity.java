package com.example.heaijia.ajiajia.base.Activity;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.ActionBar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toolbar;

import com.example.heaijia.ajiajia.R;

import butterknife.Unbinder;
import io.reactivex.annotations.Nullable;

/**
 * @author heaijia
 * @since 2018/3/26 下午8:22
 * email 549044363@qq.com
 */

public abstract class BaseToolBarActivity extends BaseActivity{
    private android.support.v7.widget.Toolbar mToolBar;
    Unbinder unbinder;

    @Override
    protected void onCreate(@android.support.annotation.Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getToolbarView());
        initActivity();
    }




    /**
     * 获取带toolbar的基类页面View
     *
     * @return View
     */
    private View getToolbarView() {
        LayoutInflater inflater = getLayoutInflater();
        RelativeLayout viewRoot = (RelativeLayout) inflater.inflate(R.layout.view_toolbar_base, null);
        FrameLayout viewContainer = viewRoot.findViewById(R.id.view_container);
        viewContainer.addView(inflater.inflate(getLayoutId(), null));
        initToolbar(viewRoot);
        return viewRoot;
    }

    /**
     * 初始化设置toolbar.
     *
     * @param root 页面rootView
     */
    private void initToolbar(View root) {
        mToolBar = root.findViewById(R.id.toolbar);
        mToolBar.setTitle(getString(R.string.empty));

        //在NoActionBar主题下，用ToolBar代替ActionBar
        setSupportActionBar(mToolBar);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            //设置左上角的图标可以点击
            actionBar.setHomeButtonEnabled(true);
            //显示左上角的返回图标
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }


    /**
     * 响应菜单项的点击事件
     * @param item
     * @return
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackBtnOnclick();
                // TODO: 18/1/17  菜单点击事件的注释
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


    /**
     * 获取当前页面toolbar
     *
     * @return toolbar
     */
    protected android.support.v7.widget.Toolbar getToolBar() {
        return mToolBar;
    }


    /**
     * 设置activity 页面标题
     *
     * @param charSequence 页面标题
     */
    protected void setActivityTitle(CharSequence charSequence) {
        if (mToolBar != null) {

            TextView view = mToolBar.findViewById(R.id.txt_toolbar_title);
            view.setText(charSequence);

        }
    }


    /**
     * 自定义右上角图标
     * @param resId
     */
    protected void setToolBarMenu(int resId) {
        if(mToolBar != null) {
            ImageView imageView = mToolBar.findViewById(R.id.img_toolbar_right_top);
            imageView.setImageResource(resId);
        }
    }

    /**
     * Toolbar返回按钮的监听事件
     */
    protected void onBackBtnOnclick() {
        this.finish();
    }

}
