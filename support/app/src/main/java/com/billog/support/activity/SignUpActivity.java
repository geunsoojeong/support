package com.billog.support.activity;

import android.widget.ImageView;
import com.billog.support.R;
/**
 * Created by jeonggeunsoo on 2017. 7. 4..
 */

public class SignUpActivity extends BaseActivity {
    private ImageView mIvTitle;

    @Override
    public int getLayoutId() { return R.layout.activity_signup; }

    @Override
    public void setupViews() {
        mIvTitle = (ImageView)findViewById(R.id.iv_title);
    }

    @Override
    public void init() {
        mIvTitle.setImageResource(R.drawable.signup);
    }
}
