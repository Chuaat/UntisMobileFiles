// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.stats;

import android.annotation.SuppressLint;
import android.util.Log;
import com.google.android.gms.common.stats.d;
import android.content.Intent;
import android.content.Context;
import com.google.android.gms.common.internal.b0;
import androidx.legacy.content.a;

@b0
@f2.a
public abstract class b extends a
{
    private static String J = "GCoreWakefulBroadcastReceiver";
    
    @SuppressLint({ "UnwrappedWakefulBroadcastReceiver" })
    @f2.a
    public static boolean d(final Context context, final Intent intent) {
        if (intent == null) {
            return false;
        }
        if (context != null) {
            d.a().f(context, intent);
        }
        else {
            final String j = b.J;
            final String value = String.valueOf(intent.toUri(0));
            String concat;
            if (value.length() != 0) {
                concat = "context shouldn't be null. intent: ".concat(value);
            }
            else {
                concat = new String("context shouldn't be null. intent: ");
            }
            Log.w(j, concat);
        }
        return a.b(intent);
    }
}
