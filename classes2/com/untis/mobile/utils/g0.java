// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils;

import android.net.NetworkInfo;
import android.util.Log;
import android.net.ConnectivityManager;
import androidx.annotation.k0;
import android.content.Context;

public class g0
{
    public static boolean a(@k0 final Context context) {
        if (context == null) {
            return false;
        }
        try {
            final ConnectivityManager connectivityManager = (ConnectivityManager)context.getSystemService("connectivity");
            if (connectivityManager != null) {
                final NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting()) {
                    return true;
                }
            }
        }
        catch (Exception ex) {
            Log.e("untis_log", "could not determinate network connectivity", (Throwable)ex);
        }
        return false;
    }
}
