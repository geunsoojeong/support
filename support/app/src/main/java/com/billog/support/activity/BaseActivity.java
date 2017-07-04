package com.billog.support.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created by jeonggeunsoo on 2017. 7. 4..
 */

public abstract class BaseActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
    }

    /**
     * 레이아웃 아이디 반환
     *
     * @return 레이아웃 아이디
     */
    public abstract int getLayoutId();


}
