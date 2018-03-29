package com.example.heaijia.ajiajia.activity.duanmodel.android;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;
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

    @BindView(R.id.checkBox2)
    CheckBox checkBox2;
    @BindView(R.id.checkBox3)
    CheckBox checkBox3;
    @BindView(R.id.checkBox)
    CheckBox checkBox;
    @BindView(R.id.radiobutton)
    RadioButton radiobutton;
    @BindView(R.id.img_test_tmd)
    ImageView imgTestTmd;
    @BindView(R.id.progressBar)
    ProgressBar progressBar;
    @BindView(R.id.seekBar)
    SeekBar seekBar;
    @BindView(R.id.ratingBar)
    RatingBar ratingBar;


    @OnClick(R.id.dialog_test)
    public void onViewClicked() {

        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(AndroidActivity.this);
        dialogBuilder.setTitle("啊啊啊啊啊");
        dialogBuilder.setCancelable(true);
        dialogBuilder.setMessage("呀呀呀呀呀");
        dialogBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(AndroidActivity.this, "你成功了", Toast.LENGTH_SHORT).show();
            }
        });
        dialogBuilder.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(AndroidActivity.this, "其实你还是算成功了", Toast.LENGTH_SHORT).show();
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


        //设置某一个checkBox被选中
        checkBox.setChecked(true);


        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /**
                 * 检测是否被选中
                 */
                if (checkBox.isChecked()) {
                    Toast.makeText(AndroidActivity.this, "选中的为" + checkBox.getText().toString(), Toast.LENGTH_SHORT).show();
                }
            }
        });


        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            /**
             *开始点击、中间滑动、结束都能够监听到
             */


            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

//                imgTestTmd.setImageAlpha(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
//                imgTestTmd.setImageAlpha(progressBar);

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                Toast.makeText(AndroidActivity.this,ratingBar.getNumStars(),Toast.LENGTH_SHORT).show();
            }
        });




    }


}
