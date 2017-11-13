package com.isbsoft.lolmate.ui;

import android.content.Intent;
import android.os.Bundle;

import com.isbsoft.lolmate.R;
import com.isbsoft.lolmate.core.ui.BaseActivity;
import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;


public class SplashScreenActivity extends BaseActivity {

    private final static String TAG = SplashScreenActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Logger.addLogAdapter(new AndroidLogAdapter());


        startActivity(new Intent(getApplicationContext(), LoginActivity.class));
        finish();
    }


}
