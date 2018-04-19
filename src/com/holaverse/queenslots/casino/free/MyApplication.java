package com.holaverse.queenslots.casino.free;

import com.avidly.ads.AvidlyAdsSdk;

import android.app.Application;

/**
 * Created by Holaverse on 2017/3/30.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        AvidlyAdsSdk.setDebuggable(true);
    }
}
