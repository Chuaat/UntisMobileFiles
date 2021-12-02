// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.manager;

import android.util.Log;
import androidx.annotation.j0;
import android.content.Context;

public class f implements d
{
    private static final String a = "ConnectivityMonitor";
    private static final String b = "android.permission.ACCESS_NETWORK_STATE";
    
    @j0
    @Override
    public c a(@j0 final Context context, @j0 final c.a a) {
        final boolean b = androidx.core.content.d.a(context, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            String s;
            if (b) {
                s = "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor";
            }
            else {
                s = "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor";
            }
            Log.d("ConnectivityMonitor", s);
        }
        c c;
        if (b) {
            c = new e(context, a);
        }
        else {
            c = new j();
        }
        return c;
    }
}
