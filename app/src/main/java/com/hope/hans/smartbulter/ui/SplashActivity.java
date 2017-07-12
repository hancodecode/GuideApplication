package com.hope.hans.smartbulter.ui;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import com.hope.hans.smartbulter.MainActivity;
import com.hope.hans.smartbulter.R;
import com.hope.hans.smartbulter.utils.L;
import com.hope.hans.smartbulter.utils.ShareUtils;
import com.hope.hans.smartbulter.utils.StaticClass;
import com.hope.hans.smartbulter.utils.UtilTools;

import java.awt.font.TextAttribute;

/**
 * 项目名: MyApplication
 * 包名:  com.hope.hans.smartbulter.ui
 * 文件名: SplashActivity
 * 创建时间: 17-7-11 下午1:56
 * 描述:   开始引导页
 */


/*
    1.延时2000ms
    2.判断程序是否第一次运行
    3.自定义字体
    4.Activity全屏主题
 */

public class SplashActivity extends AppCompatActivity {

    private TextView tv_splash;
    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            L.i("handleMessage");
            switch (msg.what) {
                case StaticClass.HANDLER_SPLASH:
                    if (isFirst()) {
                        startActivity(new Intent(SplashActivity.this, GuideActivity.class));
                    } else {
                        startActivity(new Intent(SplashActivity.this, GuideActivity.class));
                    }
                    finish();
                    break;
            }
        }
    };


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        L.i("SplashActivity");
        initView();

    }


    private void initView() {
        L.i("initView");
        //延时2000ms
        handler.sendEmptyMessageDelayed(StaticClass.HANDLER_SPLASH, 2000);

        tv_splash = (TextView) findViewById(R.id.tv_splash);
        //设置字体
        UtilTools.setFont(this,tv_splash);
    }


    //判断程序是否第一次运行
    private boolean isFirst() {
        L.i("isFirst");
        boolean isFirst = ShareUtils.getBoolean(this, StaticClass.SHARE_IS_FIRST, true);
        if (isFirst){
            ShareUtils.putBoolean(this,StaticClass.SHARE_IS_FIRST,false);
            return true;
        }else {
            return false;
        }
    }
}
