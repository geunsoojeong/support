package com.billog.support.activity;

import android.support.v4.content.ContextCompat;
import android.widget.ListView;

import com.billog.support.R;
import com.billog.support.listview.DonationCompleteListViewAdapter;

/**
 * Created by jeonggeunsoo on 2017. 7. 4..
 */

public class DonationCompleteActivity extends BaseActivity {

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
        DonationCompleteListViewAdapter adapter;

        // Adapter 생성
        adapter = new DonationCompleteListViewAdapter() ;

        // 리스트뷰 참조 및 Adapter달기
        listview = (ListView) findViewById(R.id.donationListView);
        listview.setAdapter(adapter);

        // 첫 번째 아이템 추가.
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.qrcode_icon_06),
                "좋은 이웃이 모이면 무슨 일이 생길까요?", "기부관련 기사의 내용이 간단하게 소개되어집니다. 기부관련 기사의 내용이 간단하게 소개되어집니다. 기부관련 기사의 내용이 간단하게 소개되어집니다.") ;
        // 두 번째 아이템 추가.
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.qrcode_icon_07),
                "기부처 타이틀", "기부관련 기사의 내용이 간단하게 소개되어집니다. 기부관련 기사의 내용이 간단하게 소개되어집니다. 기부관련 기사의 내용이 간단하게 소개되어집니다.") ;

    }
}
