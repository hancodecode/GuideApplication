package com.hope.hans.smartbulter.entity;

import cn.bmob.v3.Bmob;
import cn.bmob.v3.BmobUser;

/**
 * 项目名: MyApplication
 * 包名:  com.hope.hans.smartbulter.entity
 * 文件名: MyUser
 * 创建时间: 17-7-29 下午2:25
 * 描述:   用户属性
 */
public class MyUser extends BmobUser {

    private int age;
    private boolean sex;
    private String desc;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
