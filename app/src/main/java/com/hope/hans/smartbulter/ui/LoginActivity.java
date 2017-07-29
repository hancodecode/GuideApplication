package com.hope.hans.smartbulter.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import com.hope.hans.smartbulter.R;

/**
 * 项目名: MyApplication
 * 包名:  com.hope.hans.smartbulter.ui
 * 文件名: LoginActivity
 * 创建时间: 17-7-28 下午4:15
 * 描述:   TODO
 */
public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    //注册按钮
    private Button btn_registered;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        initView();
    }

    private void initView() {
        btn_registered = (Button) findViewById(R.id.btn_registered);
        btn_registered.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_registered:
                startActivity(new Intent(this,RegisteredActivity.class));
                break;
        }

    }
}
