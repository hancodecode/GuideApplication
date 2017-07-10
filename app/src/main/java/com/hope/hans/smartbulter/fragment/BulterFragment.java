package com.hope.hans.smartbulter.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.hope.hans.smartbulter.R;



/**
 * 项目名: MyApplication
 * 包名:  com.hope.hans.smartbulter.fragment
 * 文件名: BulterFragment
 * 创建时间: 17-7-10 上午11:22
 * 描述:   TODO
 */
public class BulterFragment extends android.support.v4.app.Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_butler,null);
        return view;
    }
}
