package com.example.a17630.context;

import android.app.Application;
import android.content.Context;

/**
 * Created by 17630 on 2019/4/25.
 */

public class MyApplication extends Application {
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();

        context=getApplicationContext();
    }
    public static Context getContext(){
        return context;
    }
}
