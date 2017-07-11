package com.hope.hans.smartbulter.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * 项目名: MyApplication
 * 包名:  com.hope.hans.smartbulter.utils
 * 文件名: ShareUtils
 * 创建时间: 17-7-11 上午11:12
 * 描述:   TODO
 */
public class ShareUtils {

    public static final String NAME = "config";

    public static void putString(Context mContext,String key,String values){
        SharedPreferences sp = mContext.getSharedPreferences(NAME,Context.MODE_PRIVATE);
        sp.edit().putString(key,values).commit();
    }

    public static String getString(Context mContext,String key,String defValues) {
        SharedPreferences sp = mContext.getSharedPreferences(NAME,Context.MODE_PRIVATE);
        return  sp.getString(key,defValues);
    }

    public static void putInt(Context mContext,String key,int values){
        SharedPreferences sp = mContext.getSharedPreferences(NAME,Context.MODE_PRIVATE);
        sp.edit().putInt(key,values).commit();
    }

    public static int getInt(Context mContext,String key,int defValues) {
        SharedPreferences sp = mContext.getSharedPreferences(NAME,Context.MODE_PRIVATE);
        return  sp.getInt(key,defValues);
    }


    public static void putBoolean(Context mContext,String key,boolean values){
        SharedPreferences sp = mContext.getSharedPreferences(NAME,Context.MODE_PRIVATE);
        sp.edit().putBoolean(key,values).commit();
    }

    public static boolean getBoolean(Context mContext,String key,boolean defValues) {
        SharedPreferences sp = mContext.getSharedPreferences(NAME,Context.MODE_PRIVATE);
        return  sp.getBoolean(key,defValues);
    }

    //删除单个
    public static void deleShare(Context mContext,String key){
        SharedPreferences sp = mContext.getSharedPreferences(NAME,Context.MODE_PRIVATE);
        sp.edit().remove(key).commit();
    }

    //删除全部
    public static void deleAll(Context mContext){
        SharedPreferences sp = mContext.getSharedPreferences(NAME,Context.MODE_PRIVATE);
        sp.edit().clear().commit();
    }

}
