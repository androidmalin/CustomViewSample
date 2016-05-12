package com.example.customview01.application;

import android.app.Application;

import com.orhanobut.logger.Logger;

/**
 * 类描述:
 * 创建人:malin.myemail@163.com
 * 创建时间:2016 16-4-19 21:28
 * 备注:{@link }
 * 修改人:
 * 修改时间:
 * 修改备注:
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Logger.init("MaLinView");
    }
}
