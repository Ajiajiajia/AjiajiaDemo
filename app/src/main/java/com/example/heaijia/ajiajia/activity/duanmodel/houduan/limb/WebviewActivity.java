package com.example.heaijia.ajiajia.activity.duanmodel.houduan.limb;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import com.example.heaijia.ajiajia.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * @author heaijia
 * @since 2018/4/24 下午2:05
 * email 549044363@qq.com
 */

public class WebviewActivity extends AppCompatActivity {
    @BindView(R.id.title)
    TextView mtitle;
    @BindView(R.id.text_beginLoading)
    TextView mtextBeginLoading;
    @BindView(R.id.text_Loading)
    TextView mtextLoading;
    @BindView(R.id.text_endLoading)
    TextView mtextEndLoading;

    @BindView(R.id.webView1)
    WebView mwebView;

    WebSettings mwebSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);
        ButterKnife.bind(this);

        //声明WebSettings子类
        mwebSettings=mwebView.getSettings();

//        加载apk包中的html页面
//        mwebView.loadUrl("file:///android_asset/hello.html");

//        加载手机本地SD卡的html页面
//        mwebView.loadUrl("content://com.android.htmlfileprovider/sdcard/baidu.html");

//        直接加载一个网页

//        mwebView.setWebViewClient(new WebViewClient());
        mwebView.loadUrl("https://www.baidu.com");

//        mwebView.setWebViewClient(new WebViewClient(){
//            @Override
//            public boolean shouldOverrideUrlLoading(WebView view, String url) {
//                view.loadUrl(url);
//                return true;
//            }
//        });

        mwebView.setWebChromeClient(new WebChromeClient(){

            //获取网站标题
            @Override
            public void onReceivedTitle(WebView view, String title) {
                System.out.println("标题在这里");
                mtitle.setText(title);
            }

            //获取加载进度
            @Override
            public void onProgressChanged(WebView view, int newProgress) {
                if (newProgress < 100) {
                    String progress = newProgress + "%";
                    mtextLoading.setText(progress);
                } else if (newProgress == 100) {
                    String progress = newProgress + "%";
                    mtextLoading.setText(progress);
                }
            }
        });


        //设置WebViewClient类
        mwebView.setWebViewClient(new WebViewClient() {
            //设置加载前的函数
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                System.out.println("BeginLoading");
                mtextBeginLoading.setText("BeginLoading");

            }

            //设置结束加载函数
            @Override
            public void onPageFinished(WebView view, String url) {
                mtextEndLoading.setText("EndLoading");

            }
        });

    }

    //点击返回上一页面而不是退出浏览器
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK && mwebView.canGoBack()) {
            mwebView.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    //销毁Webview
    @Override
    protected void onDestroy() {
        if (mwebView != null) {
            mwebView.loadDataWithBaseURL(null, "", "text/html", "utf-8", null);
            mwebView.clearHistory();

            ((ViewGroup) mwebView.getParent()).removeView(mwebView);
            mwebView.destroy();
            mwebView = null;
        }
        super.onDestroy();
    }







    @OnClick(R.id.webView1)
    public void onViewClicked() {
    }
}
