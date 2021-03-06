package com.example.heaijia.ajiajia.activity.duanmodel.houduan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.heaijia.ajiajia.R;
import com.example.heaijia.ajiajia.activity.duanmodel.houduan.limb.DirectUrlActivity;
import com.example.heaijia.ajiajia.activity.duanmodel.houduan.limb.LyParamsActivity;
import com.example.heaijia.ajiajia.activity.duanmodel.houduan.limb.WebviewActivity;
import com.example.heaijia.ajiajia.base.Activity.BaseNoBarActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * @author heaijia
 * @since 2018/3/25 下午8:27
 * email 549044363@qq.com
 */

public class BEActivity extends BaseNoBarActivity {
    @BindView(R.id.btn_layoutParams)
    Button btnLayoutParams;
    @BindView(R.id.btn_webview)
    Button btnWebview;
    @BindView(R.id.btn_ie_webview)
    Button btnIeWebview;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_be;
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
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_layoutParams)
    public void onViewClicked() {


        Intent layoutParamsActivity = new Intent(this, LyParamsActivity.class);
        startActivity(layoutParamsActivity);
    }

    @OnClick({R.id.btn_webview, R.id.btn_ie_webview})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_webview:
                Intent webviewActivity=new Intent(this, WebviewActivity.class);
                startActivity(webviewActivity);
                break;
            case R.id.btn_ie_webview:
                Intent directurlactivity=new Intent(this, DirectUrlActivity.class);
                startActivity(directurlactivity);
                break;
        }
    }
}
