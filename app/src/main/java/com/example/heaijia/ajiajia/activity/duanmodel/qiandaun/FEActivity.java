package com.example.heaijia.ajiajia.activity.duanmodel.qiandaun;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.widget.CalendarView;
import android.widget.TextView;
import android.widget.TimePicker;

import com.example.heaijia.ajiajia.R;
import com.example.heaijia.ajiajia.base.Activity.BaseNoBarActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @author heaijia
 * @since 2018/3/25 下午8:26
 * email 549044363@qq.com
 */

public class FEActivity extends BaseNoBarActivity {

    @BindView(R.id.timePicker)
    TimePicker mtimePicker;
    @BindView(R.id.txt_showtime)
    TextView mtxtShowtime;
    @BindView(R.id.calendarView)
    CalendarView mcalendarView;
    @BindView(R.id.txt_showdate)
    TextView mtxtShowdate;
    @BindView(R.id.txt_introduce)
    TextView mtxtIntroduce;


    @Override
    protected int getLayoutId() {
        return R.layout.activity_fe;
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

    @SuppressLint("ResourceType")
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);

        String h_time = String.valueOf(mtimePicker.getHour());
        String m_time = String.valueOf(mtimePicker.getMinute());
        mtxtShowtime.setText(h_time + m_time);
        mtimePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                mtxtShowtime.setText(hourOfDay + "," + minute);
            }
        });

        mcalendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                mtxtShowdate.setText(year + "年" + month + "月" + dayOfMonth + "日");
            }
        });

        mtxtIntroduce.setText(R.string.introduce);
        mtxtIntroduce.setTextColor(R.color.introduce_color);

    }
}
