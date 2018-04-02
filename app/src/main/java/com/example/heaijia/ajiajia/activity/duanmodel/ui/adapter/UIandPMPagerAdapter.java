package com.example.heaijia.ajiajia.activity.duanmodel.ui.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.heaijia.ajiajia.activity.duanmodel.ui.fragment.PMFragment;
import com.example.heaijia.ajiajia.activity.duanmodel.ui.fragment.UIFragment;

/**
 * @author heaijia
 * @since 2018/3/27 下午3:01
 * email 549044363@qq.com
 */

public class UIandPMPagerAdapter extends FragmentPagerAdapter {

    private String[] mTitles={"UI","PM"};
    private PMFragment mpmFragment;
    private UIFragment muiFragment;
    private Fragment currentfragment;

    public UIandPMPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                if(muiFragment==null){
                    muiFragment=new UIFragment();
                }
                currentfragment=muiFragment;
                break;
            case 1:
                if(mpmFragment==null){
                    mpmFragment=new PMFragment();
                }
                currentfragment=mpmFragment;
                break;
            default:
                break;
        }
        return currentfragment;
    }

    @Override
    public String getPageTitle(int position){
        return mTitles[position];
    }

    @Override
    public int getCount() {
        return 2;
    }
}
