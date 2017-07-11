package com.hope.hans.smartbulter.utils;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;

/**
 * 项目名: MyApplication
 * 包名:  com.hope.hans.smartbulter.utils
 * 文件名: UtilTools
 * 创建时间: 17-7-7 下午3:06
 * 描述:   工具的统一类
 */
public class UtilTools {
    public static void setFont(Context mContext, TextView textView){
        Typeface fontface = Typeface.createFromAsset(mContext.getAssets(),"fonts/FONT.TTF");
        textView.setTypeface(fontface);
    }
}
