package com.hope.hans.smartbulter.ui;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import com.hope.hans.smartbulter.R;

/**
 * 项目名: MyApplication
 * 包名:  com.hope.hans.smartbulter.ui
 * 文件名: BaseActivity
 * 创建时间: 17-7-7 下午2:44
 * 描述:   Activity的基类
 */


/**
 *
 */
public class BaseActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.home:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
