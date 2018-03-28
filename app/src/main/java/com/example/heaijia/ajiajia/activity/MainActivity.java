package com.example.heaijia.ajiajia.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.heaijia.ajiajia.R;
import com.example.heaijia.ajiajia.activity.duanmodel.ui.UIActivity;
import com.example.heaijia.ajiajia.base.Activity.BaseNoBarActivity;
import com.example.heaijia.ajiajia.fragment.HomeFragment;
import com.example.heaijia.ajiajia.fragment.MessageFragment;
import com.example.heaijia.ajiajia.fragment.MineFragment;
import com.example.heaijia.ajiajia.utils.FragmentUtil;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseNoBarActivity {


    @BindView(R.id.txt_tab_menu)
    TextView mtxtTabMenu;
    @BindView(R.id.txt_tab_message)
    TextView mtxtTabMessage;
    @BindView(R.id.txt_tab_mine)
    TextView mtxtTabMine;

//        @Override
//        protected void onCreate(Bundle savedInstanceState) {
//            super.onCreate(savedInstanceState);
//            setContentView(R.layout.activity_main);
//        }

    private HomeFragment mHomeFragment;
    private MessageFragment mMessageFragment;
    private MineFragment mMineFragment;


    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initVariable() {

    }

    @Override
    protected void initView() {

        onLyMenuHomeClicked();

    }

    @Override
    protected void loadData() {

    }

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        // TODO: add setContentView(...) invocation
//        ButterKnife.bind(this);
//    }

    @OnClick(R.id.ly_menu_home)
    public void onLyMenuHomeClicked() {
        changeHomeMenuStatus();
        hideAllFragment();
        if(mHomeFragment==null){
            mHomeFragment=new HomeFragment();
            FragmentUtil.addFragment(this,R.id.frame_content,mHomeFragment,null);
        }
        else{
            FragmentUtil.showFragment(this,mHomeFragment);
        }

    }

    @OnClick(R.id.ly_menu_message)
    public void onLyMenuMessageClicked() {
        changeMessageMenuStatus();
        hideAllFragment();
        if(mMessageFragment==null){
            mMessageFragment=new MessageFragment();
            FragmentUtil.addFragment(this,R.id.frame_content,mMessageFragment,null);
        }
        else{
            FragmentUtil.showFragment(this,mMessageFragment);
        }

    }

    @OnClick(R.id.ly_menu_mine)
    public void onLyMenuMineClicked() {
        changeMineMenuStatus();
        hideAllFragment();
        if(mMineFragment==null){
            mMineFragment=new MineFragment();
            FragmentUtil.addFragment(this,R.id.frame_content,mMineFragment,null);
        }
        else{
            FragmentUtil.showFragment(this,mMineFragment);
        }

    }

    /**
     * 隐藏所有的fragment
     */
    private void hideAllFragment() {
        if (mHomeFragment != null) {
            FragmentUtil.hideFragment(this, mHomeFragment);
        }
        if (mMessageFragment != null) {
            FragmentUtil.hideFragment(this, mMessageFragment);
        }
        if (mMineFragment != null) {
            FragmentUtil.hideFragment(this, mMineFragment);
        }
    }

    /**
     * 清空底部按钮文字的全部选中状态
     */
    private void clearChiceStatus() {
        mtxtTabMenu.setSelected(false);
        mtxtTabMessage.setSelected(false);
        mtxtTabMine.setSelected(false);

    }

    /**
     * 点击主页按钮，文字会变蓝状态
     */
    private void changeHomeMenuStatus() {
        clearChiceStatus();
        mtxtTabMenu.setSelected(true);
    }

    /**
     * 点击message按钮，文字发生变化
     */
    private void changeMessageMenuStatus(){
        clearChiceStatus();
        mtxtTabMessage.setSelected(true);
    }

    /**
     * 点击mine按钮，文字颜色发生变化
     */
    private void changeMineMenuStatus(){
        clearChiceStatus();
        mtxtTabMine.setSelected(true);
    }

}
