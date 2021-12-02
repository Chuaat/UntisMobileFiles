// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.stats;

import android.text.TextUtils;
import android.os.Process;
import android.os.PowerManager$WakeLock;
import android.content.Intent;
import androidx.annotation.RecentlyNonNull;
import android.content.Context;
import f2.a;

@Deprecated
@a
public class c
{
    @RecentlyNonNull
    @a
    public static String a(@RecentlyNonNull final Context context, @RecentlyNonNull final Intent intent) {
        return String.valueOf((long)System.identityHashCode(intent) | (long)System.identityHashCode(context) << 32);
    }
    
    @RecentlyNonNull
    @a
    public static String b(@RecentlyNonNull final PowerManager$WakeLock powerManager$WakeLock, @RecentlyNonNull final String s) {
        final String value = String.valueOf(String.valueOf((long)Process.myPid() << 32 | (long)System.identityHashCode(powerManager$WakeLock)));
        String obj = s;
        if (TextUtils.isEmpty((CharSequence)s)) {
            obj = "";
        }
        final String value2 = String.valueOf(obj);
        if (value2.length() != 0) {
            return value.concat(value2);
        }
        return new String(value);
    }
}
