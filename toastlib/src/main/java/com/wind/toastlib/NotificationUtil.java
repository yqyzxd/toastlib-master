package com.wind.toastlib;

import android.content.Context;
import android.support.v4.app.NotificationManagerCompat;

/**
 * Created by wind on 2018/3/28.
 */

public class NotificationUtil {

    /**
     * 用来判断是否开启通知权限
     * @param context
     * */
    public static boolean isNotificationEnabled(Context context){

        NotificationManagerCompat notification = NotificationManagerCompat.from(context);
        boolean isEnabled = notification.areNotificationsEnabled();
        return isEnabled;

    }
}
