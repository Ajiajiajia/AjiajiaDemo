package com.example.heaijia.ajiajia.activity.MIneActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.heaijia.ajiajia.R;
import com.example.heaijia.ajiajia.base.Activity.BaseActivity;

/**
 * @author heaijia
 * @since 2018/4/8 下午10:00
 * email 549044363@qq.com
 */

public class BroadcastActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broadcast);
    }

    // 广播自定义意图
    public void broadcastIntent(View view){
        Intent intent = new Intent();
        intent.setAction("cn.programmer.CUSTOM_INTENT");
        sendBroadcast(intent);
    }
}
