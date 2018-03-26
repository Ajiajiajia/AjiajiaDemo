package com.example.heaijia.ajiajia.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.heaijia.ajiajia.R;
import com.example.heaijia.ajiajia.activity.duanmodel.android.AndroidActivity;
import com.example.heaijia.ajiajia.activity.duanmodel.houduan.BEActivity;
import com.example.heaijia.ajiajia.activity.duanmodel.qiandaun.FEActivity;
import com.example.heaijia.ajiajia.activity.duanmodel.ui.UIActivity;
import com.example.heaijia.ajiajia.base.Activity.BaseFragment;
import com.example.heaijia.ajiajia.widget.FlipperPage;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * @author heaijia
 * @since 2018/3/23 下午9:28
 * email 549044363@qq.com
 */

public class HomeFragment extends BaseFragment implements FlipperPage.OnBannerClick {

    @BindView(R.id.flipper_header)
    FlipperPage mFlipper;

    @BindView(R.id.txt_qianduan)
    TextView txtQianduan;
    @BindView(R.id.txt_houduan)
    TextView txtHouduan;
    @BindView(R.id.txt_android)
    TextView txtAndroid;
    @BindView(R.id.txt_UI)
    TextView txtUI;
    Unbinder unbinder1;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_home;
    }

    @Override
    protected void initVariable() {

    }

    @Override
    protected void initView() {
        initBanner();
    }

    @Override
    protected void loadData() {

    }

    /**
     * 获取图片资源
     */
    private ImageView getImageView(int res) {
        ImageView imageView = new ImageView(getContext());


        imageView.setBackgroundResource(res);
        return imageView;
    }

    /**
     * ViewFlipper--初始化图片资源
     */
    private void initBanner() {
        mFlipper.addView(getImageView(R.drawable.home_banner2));
        mFlipper.addView(getImageView(R.drawable.home_banner3));
        mFlipper.addView(getImageView(R.drawable.home_banner4));
        mFlipper.setOnBannerClick(this);
        mFlipper.startFlipping();
    }


    @Override
    public void onBannerClick(int position) {

    }

    @OnClick(R.id.txt_qianduan)
    public void onQianduanClicked(){
        Intent feActivity=new Intent(getActivity(), FEActivity.class);
        startActivity(feActivity);
    }

    @OnClick(R.id.txt_houduan)
    public void onHouduanClicked(){
        Intent beActivity=new Intent(getActivity(), BEActivity.class);
        startActivity(beActivity);
    }

    @OnClick(R.id.txt_android)
    public void onAndroidClicked(){
        Intent androidActivity=new Intent(getActivity(), AndroidActivity.class);
        startActivity(androidActivity);
    }

    @OnClick(R.id.txt_UI)
    public void onUIClicked(){
        Intent uiActivity=new Intent(getActivity(), UIActivity.class);
        startActivity(uiActivity);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO: inflate a fragment view
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        unbinder1 = ButterKnife.bind(this, rootView);
        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder1.unbind();
    }





}
