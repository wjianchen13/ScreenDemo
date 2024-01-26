package com.example.screendemo;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

public class Utils {

    public static void log(String str) {
        System.out.println("==========================> " + str);
    }

    /**
     * 获得屏幕高度
     *
     * @param context
     * @return
     */
    public static int getScreenWidth(Context context) {
        if (context == null)
            return 0;

        Resources resources = context.getResources();
        if (resources == null)
            return 0;

        DisplayMetrics metrics = resources.getDisplayMetrics();
        if (metrics == null)
            return 0;

        return metrics.widthPixels;
    }

    /**
     * 计算屏幕有的dp宽度
     * 使用displayMetrics.widthPixels / density 一般是360dp 有些手机390dp甚至410dp
     * @param context
     * @return
     */
    public static String getDisplayMetrics(Context context) {
        if(context != null) {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            String info = "density: " + displayMetrics.density + "  densityDpi: " + displayMetrics.densityDpi + "  widthPixels: " + displayMetrics.widthPixels + "  heightPixels: " + displayMetrics.heightPixels;
            log(info);
            return info;
        }
        return "null";
    }


}
