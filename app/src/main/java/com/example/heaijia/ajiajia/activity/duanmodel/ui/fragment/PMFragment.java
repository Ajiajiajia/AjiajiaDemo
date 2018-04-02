package com.example.heaijia.ajiajia.activity.duanmodel.ui.fragment;

import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.heaijia.ajiajia.R;
import com.example.heaijia.ajiajia.base.Activity.BaseFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * @author heaijia
 * @since 2018/3/27 下午3:00
 * email 549044363@qq.com
 */

public class PMFragment extends BaseFragment {

    @BindView(R.id.rec_pm_list)
    RecyclerView recPmList;
    @BindView(R.id.swipe_refresh_layout_pm)
    SwipeRefreshLayout swipeRefreshLayoutPm;
    Unbinder unbinder;

    private List<BaseFragment> mUIList;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_pm_model;
    }


    @Override
    protected void initVariable() {
        mUIList=new ArrayList<>();
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
        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
