package com.billog.support.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.widget.ListView;

import com.billog.support.R;
import com.billog.support.listview.DonationListView;
import com.billog.support.listview.DonationListViewAdapter;

/**
 * Created by jeonggeunsoo on 2017. 7. 4..
 */

public class IndexActivity extends BaseActivity {

    @Override
    public int getLayoutId() {
        return R.layout.activity_index;
    }

    @Override
    public void setupViews() {

    }

    @Override
    public void init() {
        ListView listview ;
        DonationListViewAdapter adapter;

        // Adapter 생성
        adapter = new DonationListViewAdapter() ;

        // 리스트뷰 참조 및 Adapter달기
        listview = (ListView) findViewById(R.id.donationListView);
        listview.setAdapter(adapter);

        // 첫 번째 아이템 추가.
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.btn_contour),
                "좋은 이웃이 모이면 무슨 일이 생길까요?", "기부관련 기사의 내용이 간단하게 소개되어집니다. 기부관련 기사의 내용이 간단하게 소개되어집니다. 기부관련 기사의 내용이 간단하게 소개되어집니다.") ;
        // 두 번째 아이템 추가.
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.btn_login),
                "좋은 이웃이 모이면 무슨 일이 생길까요?", "기부관련 기사의 내용이 간단하게 소개되어집니다. 기부관련 기사의 내용이 간단하게 소개되어집니다. 기부관련 기사의 내용이 간단하게 소개되어집니다.") ;

    }
}
