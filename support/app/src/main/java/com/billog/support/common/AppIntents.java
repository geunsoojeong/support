package com.billog.support.common;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.billog.support.activity.MainActivity;

/**
 * Created by jeonggeunsoo on 2017. 7. 17..
 */

public class AppIntents {

    /**
     * 메인화면 이동
     * @param context 컨텍스트
     */
    public static void moveToMain(Context context) {
        Intent intent = new Intent(context, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
        context.startActivity(intent);
    }

    /**
     * 화면 이동
     * @param curAct 현재 화면
     * @param destAct 이동할 화면
     */
    public static void moveToActivity(Activity curAct, Class<?> destAct) {
        Intent intent = new Intent(curAct, destAct);
        curAct.startActivity(intent);
    }

    /**
     * 화면 이동
     * @param curAct 현재 화면
     * @param destAct 이동 화면
     * @param isFinish 현재 화면 종료
     */
    public static void moveToActivity(Activity curAct, Class<?> destAct, boolean isFinish) {
        moveToActivity(curAct, destAct);

        if(isFinish) {
            curAct.finish();
        }
    }
}
