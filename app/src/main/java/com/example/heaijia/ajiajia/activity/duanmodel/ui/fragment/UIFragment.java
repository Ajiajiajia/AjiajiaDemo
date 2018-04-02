package com.example.heaijia.ajiajia.activity.duanmodel.ui.fragment;

import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.heaijia.ajiajia.R;
import com.example.heaijia.ajiajia.base.Activity.BaseFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * @author heaijia
 * @since 2018/3/27 下午3:00
 * email 549044363@qq.com
 */

public class UIFragment extends BaseFragment {

    private List mDatas;

    @BindView(R.id.ui_fragment_model)
    TextView uiFragmentModel;
    @BindView(R.id.rec_ui_list)
    RecyclerView  mrecyclerView;
    @BindView(R.id.swipe_refresh_layout_ui)
    SwipeRefreshLayout mswipeRefreshLayoutUi;
    Unbinder unbinder;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_ui_model;
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

        initData();

        return rootView;

    }

    private void initData() {
        mDatas = new ArrayList<>();
        for(int i=0 ;i< 100;i++){
            mDatas.add("第"+i+"个item");
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
