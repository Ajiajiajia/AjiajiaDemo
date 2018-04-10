package com.example.heaijia.ajiajia.activity.MIneActivity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.widget.Button;

import com.example.heaijia.ajiajia.R;
import com.example.heaijia.ajiajia.base.Activity.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * @author heaijia
 * @since 2018/4/9 下午2:26
 * email 549044363@qq.com
 */

public class FragActivity extends BaseActivity {




    @Override
    protected int getLayoutId() {
        return R.layout.activity_frag;
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


//    private void replaceFragment(Fragment fragment) {
//        FragmentManager fragmentManager = getFragmentManager();
//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//        fragmentTransaction.replace(R.id.right_Second_fragment, fragment);
//        fragmentTransaction.commit();
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }
//
//    @OnClick(R.id.btn_what)
//    public void onViewClicked() {
//        replaceFragment(new RightFragment());
//    }
}
