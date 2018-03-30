package com.example.heaijia.ajiajia;

import android.app.Application;
import android.os.Build;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;

/**
 * @author heaijia
 * @since 2018/3/30 下午10:24
 * email 549044363@qq.com
 */

public class AjDemoApplication extends Application
{

    private static AjDemoApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;


    }
}
