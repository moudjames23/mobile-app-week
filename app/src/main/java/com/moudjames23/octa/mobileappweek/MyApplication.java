package com.moudjames23.octa.mobileappweek;

import android.app.Application;

import com.moudjames23.octa.mobileappweek.onesignal.OSNotificationOpenedHandler;
import com.moudjames23.octa.mobileappweek.onesignal.OSNotificationReceivedHandler;
import com.onesignal.OneSignal;

public class MyApplication extends Application {



    @Override
    public void onCreate() {
        super.onCreate();

        // Enable verbose OneSignal logging to debug issues if needed.
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);

        // OneSignal Initialization
        OneSignal.startInit(this)
                .setNotificationReceivedHandler(new OSNotificationReceivedHandler())
                .setNotificationOpenedHandler(new OSNotificationOpenedHandler(this))
                .inFocusDisplaying(OneSignal.OSInFocusDisplayOption.Notification)
                .unsubscribeWhenNotificationsAreDisabled(true)
                .init();
    }
}
