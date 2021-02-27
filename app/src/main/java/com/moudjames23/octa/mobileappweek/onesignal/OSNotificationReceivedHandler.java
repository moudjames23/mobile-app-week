package com.moudjames23.octa.mobileappweek.onesignal;

import android.util.Log;

import com.onesignal.OSNotification;
import com.onesignal.OneSignal;

import org.json.JSONObject;

public class OSNotificationReceivedHandler implements OneSignal.NotificationReceivedHandler {
    public final String TAG = "MyOnesignal";
    @Override
    public void notificationReceived(OSNotification notification) {
        Log.d(TAG, "notificationReceived: ");

        JSONObject data = notification.payload.additionalData;

        String title = notification.payload.title;
        String body = notification.payload.body;

        Log.d(TAG, "notificationReceived: title " +title);
        Log.d(TAG, "notificationReceived: body " +body);

    }
}
