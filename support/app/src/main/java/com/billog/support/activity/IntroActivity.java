package com.billog.support.activity;

import android.os.Handler;
import android.os.Message;

import com.billog.support.common.AppIntents;
import com.billog.support.common.Constants;
import com.billog.support.R;

/**
 * Created by jeonggeunsoo on 2017. 7. 4..
 */

public class IntroActivity extends BaseActivity implements Handler.Callback {

    @Override
    public int getLayoutId() {
        return R.layout.activity_intro;
    }

    @Override
    public void setupViews() {

    }

    @Override
    public void init() {
        Handler handler = new Handler(this);

        handler.sendEmptyMessageDelayed(0, Constants.INTRO_DELAY_TIME);
    }

    @Override
    public boolean handleMessage(Message msg) {
        AppIntents.moveToActivity(this, SignInActivity.class);
        finish();

        return false;
    }
}
