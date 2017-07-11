package com.hope.hans.smartbulter.ui;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import com.hope.hans.smartbulter.R;
import com.hope.hans.smartbulter.utils.L;

/**
 * 项目名: MyApplication
 * 包名:  com.hope.hans.smartbulter.ui
 * 文件名: GuideActivity
 * 创建时间: 17-7-11 下午2:30
 * 描述:   引导页
 */
public class GuideActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);
        L.i("GuideActivity");
    }
}
