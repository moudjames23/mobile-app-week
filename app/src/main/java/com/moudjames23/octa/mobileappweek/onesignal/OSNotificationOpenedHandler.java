package com.moudjames23.octa.mobileappweek.onesignal;

import android.app.Application;
import android.content.Intent;
import android.util.Log;


import com.onesignal.OSNotificationOpenResult;
import com.onesignal.OneSignal;

import org.json.JSONObject;

public class OSNotificationOpenedHandler implements OneSignal.NotificationOpenedHandler{

    private Application application;

    public OSNotificationOpenedHandler(Application application) {
        this.application = application;
    }

    public final String TAG = "MyOnesignal";

    @Override
    public void notificationOpened(OSNotificationOpenResult result) {
        Log.d(TAG, "notificationOpened: ");

        JSONObject data = result.notification.payload.additionalData;


    }
}
