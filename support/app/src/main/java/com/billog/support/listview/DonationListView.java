package com.billog.support.listview;

import android.graphics.drawable.Drawable;

/**
 * Created by hoon on 2017-07-16.
 */

public class DonationListView {
    private Drawable imgDnt ;
    private String titleStr ;
    private String descStr ;

    public void setimgDnt(Drawable icon) {
        imgDnt = icon ;
    }
    public void setTitle(String title) {
        titleStr = title ;
    }
    public void setDesc(String desc) {
        descStr = desc ;
    }

    public Drawable getimgDnt() {
        return this.imgDnt ;
    }
    public String getTitle() {
        return this.titleStr ;
    }
    public String getDesc() {
        return this.descStr ;
    }

}
