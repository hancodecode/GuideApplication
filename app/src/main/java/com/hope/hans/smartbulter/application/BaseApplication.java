package com.hope.hans.smartbulter.application;

import android.app.Application;
import com.hope.hans.smartbulter.utils.StaticClass;
import com.tencent.bugly.crashreport.CrashReport;

/**
 * Created by zhanghan on 17-7-7.
 */
public class BaseApplication extends Application {

    //创建
    @Override
    public void onCreate() {
        super.onCreate();
        //初始化Bugly
        CrashReport.initCrashReport(getApplicationContext(), StaticClass.BUGLY_APP_ID, true);
    }
}
