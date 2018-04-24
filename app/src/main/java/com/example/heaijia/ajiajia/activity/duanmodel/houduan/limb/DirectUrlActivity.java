package com.example.heaijia.ajiajia.activity.duanmodel.houduan.limb;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import com.example.heaijia.ajiajia.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * @author heaijia
 * @since 2018/4/24 下午2:33
 * email 549044363@qq.com
 */

public class DirectUrlActivity extends Activity {
    @BindView(R.id.btn_open_url)
    Button mbtnOpenUrl;
    @BindView(R.id.btn_webview_url)
    Button btnWebviewUrl;
    @BindView(R.id.webview_show)
    WebView mwebviewShow;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_directurl);
        ButterKnife.bind(this);


    }

    @OnClick(R.id.btn_open_url)
    public void onUrlViewClicked() {

        Intent openBaidu = new Intent();
          openBaidu.setAction(Intent.ACTION_VIEW);
        Uri baiduAdress = Uri.parse("https://www.baidu.com/");
        openBaidu.setData(baiduAdress);
        startActivity(openBaidu);

    }

    @OnClick(R.id.btn_webview_url)
    public void onWebUrlViewClicked() {

        mwebviewShow.setWebViewClient(new WebViewClient());

//        mwebviewShow.setWebChromeClient(new WebChromeClient());
        mwebviewShow.loadUrl("https://www.baidu.com/");

    }
}
