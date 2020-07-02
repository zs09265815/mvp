package com.example.mymvp.base;

import android.app.Application;
import android.content.Context;

public class BaseApplication extends Application {
public static BaseApplication baseApplication;

    public static Context getApplication() {
        return baseApplication;

    }

    public static Context getInstance() {
        return baseApplication;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        baseApplication=this;
    }
}
