package com.example.heaijia.ajiajia.activity.duanmodel.houduan.limb;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.heaijia.ajiajia.R;

/**
 * @author heaijia
 * @since 2018/4/23 下午9:37
 * email 549044363@qq.com
 */

public class LyParamsActivity extends Activity {

    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layoutparams);

        initViews();
    }

    /**
     * @方法描述：
     * @author lizhenya
     */
    private void initViews() {
        img = (ImageView) findViewById(R.id.img);

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                img.getLayoutParams());
        /**
         * 高度和宽度是从ViewGroup.MarginLayoutParams继承而来，ViewGroup.MarginLayoutParams的高度和宽度又是
         * 从ViewGroup.Params继承而来，是基本的属性.
         */
        params.height = ViewGroup.LayoutParams.MATCH_PARENT;
        params.width = ViewGroup.LayoutParams.MATCH_PARENT;
        /**
         * margin属性是从ViewGroup.MarginLayoutParams继承而来。
         */
        params.setMargins(50, 300, 50, 400);



        //LinearLayout.LayoutParams自身的属性
        params.gravity =  Gravity.CENTER;
        params.weight =  (float) 1.0;

        img.setLayoutParams(params);
    }
}