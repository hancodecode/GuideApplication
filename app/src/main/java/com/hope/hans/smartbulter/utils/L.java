package com.hope.hans.smartbulter.utils;

import android.util.Log;

/**
 * 项目名: MyApplication
 * 包名:  com.hope.hans.smartbulter.utils
 * 文件名: L
 * 创建时间: 17-7-10 下午3:45
 * 描述:   Log的封装
 */
public class L {
    //开关
    public static final boolean DEBUG = true;
    //TAG
    public static final String TAG = "hans";

    //四个等级 DIWE
    public static void d(String text){
        if (DEBUG){
            Log.d(TAG,text);
        }

    }
    public static void i(String text){
        if (DEBUG){
            Log.i(TAG,text);
        }

    }
    public static void w(String text){
        if (DEBUG){
            Log.w(TAG,text);
        }

    }
    public static void e(String text){
        if (DEBUG){
            Log.e(TAG,text);
        }

    }
}
