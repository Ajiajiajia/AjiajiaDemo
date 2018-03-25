package com.example.heaijia.ajiajia.utils;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import com.example.heaijia.ajiajia.base.Activity.BaseActivity;

/**
 * @author heaijia
 * @since 2018/3/23 下午10:26
 * email 549044363@qq.com
 */

public class FragmentUtil {

    /**
     * 添加Fragment
     */
    public static void addFragment(BaseActivity context, int viewId, Fragment fragment, @Nullable String tag) {
        context.getSupportFragmentManager()
                .beginTransaction()
                .add(viewId, fragment, tag)
                .commit();

    }

    /**
     * 替换Fragment
     */
    public static void replaceFragment(BaseActivity context, int viewId, Fragment fragment, @Nullable String tag) {
        context.getSupportFragmentManager()
                .beginTransaction()
                .replace(viewId, fragment, tag)
                .commit();
    }

    /**
     * 隐藏Fragment
     */
    public static void hideFragment(BaseActivity context, Fragment fragment) {
        context.getSupportFragmentManager()
                .beginTransaction()
                .hide(fragment)
                .commit();
    }

    /**
     * 展示Fragment
     */
    public static void showFragment(BaseActivity context, Fragment fragment) {
        context.getSupportFragmentManager()
                .beginTransaction()
                .show(fragment)
                .commit();
    }

}
