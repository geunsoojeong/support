package com.billog.support.common;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by jeonggeunsoo on 2017. 7. 17..
 */

public class AppSettings {
    private static final String SHARED_PREFERENCE_NAME = "SmartDoorAppSettings";
    private static final String KEY_IS_AGREEMENT = "is_agree";

    /**
     * 동의 여부 반환
     * @param context 컨텍스트
     * @return 동의 여부
     */
    public static boolean isAgreement(Context context) {
        SharedPreferences preferences = context.getSharedPreferences(SHARED_PREFERENCE_NAME, Activity.MODE_PRIVATE);
        return preferences.getBoolean(KEY_IS_AGREEMENT, false);
    }
}
