package com.example.heaijia.ajiajia.fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.heaijia.ajiajia.R;
import com.example.heaijia.ajiajia.activity.MIneActivity.BroadcastActivity;
import com.example.heaijia.ajiajia.base.Activity.BaseFragment;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * @author heaijia
 * @since 2018/3/23 下午9:28
 * email 549044363@qq.com
 */

public class MineFragment extends BaseFragment {


    Unbinder unbinder;
    @BindView(R.id.btn_goto_baidu)
    Button btnGotoBaidu;
    @BindView(R.id.btn_goto_message)
    Button btnGotoPhone;
    @BindView(R.id.spinnerActivity)
    Button spinnerActivity;
    @BindView(R.id.btn_Broadcast)
    Button btnBroadcast;
    @BindView(R.id.btn_fragment)
    Button btnFragment;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_mine;
    }

    @Override
    protected void initVariable() {

    }

    @Override
    protected void initView() {

    }

    @Override
    protected void loadData() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO: inflate a fragment view
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        unbinder = ButterKnife.bind(this, rootView);

        /**
         * 想让Fragment中的onCreateOptionsMenu生效
         */
        setHasOptionsMenu(true);


        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @OnClick(R.id.btn_goto_baidu)
    public void onBtnGotoBaiduClicked() {

        Intent openBaidu = new Intent();
        openBaidu.setAction(Intent.ACTION_VIEW);
        Uri baiduAdress = Uri.parse("https://www.baidu.com/");
        openBaidu.setData(baiduAdress);
        startActivity(openBaidu);


    }

    @OnClick(R.id.btn_goto_message)
    public void onBtnGotoPhoneClicked() {

        Toast.makeText(getActivity(), "此功能暂时无法使用", Toast.LENGTH_SHORT).show();

//        Intent openMessage=new Intent();
//        openMessage.setAction(Intent.ACTION_SEND);
//        openMessage.setData(Uri.parse("tel:13784196977"));
//        openMessage.putExtra("sms_body","这是一条来自于何艾葭的短信");
//        startActivity(openMessage);
    }


    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {

        inflater.inflate(R.menu.menu_corner, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

//
//    @OnClick(R.id.spinnerActivity)
//    public void onViewClicked() {
//        Intent recActivity = new Intent(getActivity(), RecActivity.class);
//        startActivity(recActivity);
//    }


    @OnClick(R.id.btn_Broadcast)
    public void onBroadcastClicked() {
        Intent broadcastActivity = new Intent(getActivity(), BroadcastActivity.class);
        startActivity(broadcastActivity);
    }

    @OnClick(R.id.btn_fragment)
    public void onFragmentClicked() {


    }
}
