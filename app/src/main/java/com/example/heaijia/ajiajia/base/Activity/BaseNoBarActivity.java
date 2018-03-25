package com.example.heaijia.ajiajia.base.Activity;

import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * @author heaijia
 * @since 2018/3/23 下午9:17
 * email 549044363@qq.com
 */
public abstract class BaseNoBarActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        initActivity();
    }
}
