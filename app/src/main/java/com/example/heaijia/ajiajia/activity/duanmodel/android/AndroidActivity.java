package com.example.heaijia.ajiajia.activity.duanmodel.android;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.widget.Button;
import android.widget.Toast;

import com.example.heaijia.ajiajia.R;
import com.example.heaijia.ajiajia.base.Activity.BaseNoBarActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * @author heaijia
 * @since 2018/3/25 下午8:27
 * email 549044363@qq.com
 */

public class AndroidActivity extends BaseNoBarActivity {
    @BindView(R.id.dialog_test)
    Button dialogTest;



    @OnClick(R.id.dialog_test)
    public void onViewClicked() {

        AlertDialog.Builder dialogBuilder=new AlertDialog.Builder(AndroidActivity.this);
        dialogBuilder.setTitle("啊啊啊啊啊");
        dialogBuilder.setCancelable(true);
        dialogBuilder.setMessage("呀呀呀呀呀");
        dialogBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(AndroidActivity.this,"你成功了",Toast.LENGTH_SHORT).show();
            }
        });
        dialogBuilder.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(AndroidActivity.this,"其实你还是算成功了",Toast.LENGTH_SHORT).show();
            }
        });
        dialogBuilder.show();
    }


    @Override
    protected int getLayoutId() {
        return R.layout.activity_android;
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

}
