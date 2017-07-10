package com.hope.hans.smartbulter;


import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.util.Log;
import android.view.View;
import com.hope.hans.smartbulter.fragment.BulterFragment;
import com.hope.hans.smartbulter.fragment.GirlFragment;
import com.hope.hans.smartbulter.fragment.UserFragment;
import com.hope.hans.smartbulter.fragment.WechatFragment;
import com.hope.hans.smartbulter.ui.SettingActivity;
import com.hope.hans.smartbulter.utils.L;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    //TableLayout
    private TabLayout mTabLayout;
    //ViewPager
    private ViewPager mViewPager;
    //Title
    private List<String> mTitle;
    //Fragment
    private List<Fragment> mFragment;
    //悬浮窗
    private FloatingActionButton fab_setting;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //去掉阴影
        getSupportActionBar().setElevation(0);


        initData();
        initView();
    }


    //初始化data
    private void initData() {
        mTitle = new ArrayList<>();
        mTitle.add(getString(R.string.tabname_one));
        mTitle.add(getString(R.string.tabname_two));
        mTitle.add(getString(R.string.tabname_three));
        mTitle.add(getString(R.string.tabname_four));


        mFragment = new ArrayList<>();
        mFragment.add(new BulterFragment());
        mFragment.add(new GirlFragment());
        mFragment.add(new UserFragment());
        mFragment.add(new WechatFragment());

    }

    //初始化view
    private void initView() {
        fab_setting = (FloatingActionButton) findViewById(R.id.fab_setting);
        fab_setting.setOnClickListener(this);
        //默认隐藏
        fab_setting.setVisibility(View.GONE);


        mTabLayout = (TabLayout) findViewById(R.id.mTabLayout);
        mViewPager = (ViewPager) findViewById(R.id.mViewPager);

        //预加载
        mViewPager.setOffscreenPageLimit(mFragment.size());

        //viewpager的滑动监听
        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                L.i("position : "+position);
                L.d("position : "+position);
                L.w("position : "+position);
                L.e("position : "+position);

                if (position == 0) {
                    fab_setting.setVisibility(View.GONE);
                } else {
                    fab_setting.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });


        //设置适配器
        mViewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            //选中的Item
            @Override
            public Fragment getItem(int position) {
                return mFragment.get(position);
            }

            @Override
            public int getCount() {
                return mFragment.size();
            }

            //设置标题

            @Override
            public CharSequence getPageTitle(int position) {
                return mTitle.get(position);
            }
        });

        mTabLayout.setupWithViewPager(mViewPager);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.fab_setting:
                startActivity(new Intent(this, SettingActivity.class));
                break;
        }
    }
}
