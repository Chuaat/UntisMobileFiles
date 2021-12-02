// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.messaging;

import android.content.ComponentName;
import androidx.annotation.b1;
import androidx.annotation.j0;
import android.content.Intent;
import android.content.Context;
import java.util.concurrent.TimeUnit;
import d6.a;
import com.google.android.gms.stats.d;

final class e1
{
    private static final long a;
    private static final Object b;
    @a("WakeLockHolder.syncObject")
    private static d c;
    
    static {
        a = TimeUnit.MINUTES.toMillis(1L);
        b = new Object();
    }
    
    @a("WakeLockHolder.syncObject")
    private static void a(final Context context) {
        if (e1.c == null) {
            (e1.c = new d(context, 1, "wake:com.google.firebase.iid.WakeLockHolder")).d(true);
        }
    }
    
    static void b(@j0 final Intent intent) {
        synchronized (e1.b) {
            if (e1.c != null && c(intent)) {
                d(intent, false);
                e1.c.c();
            }
        }
    }
    
    @b1
    static boolean c(@j0 final Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }
    
    private static void d(@j0 final Intent intent, final boolean b) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", b);
    }
    
    static ComponentName e(@j0 final Context context, @j0 final Intent intent) {
        synchronized (e1.b) {
            a(context);
            final boolean c = c(intent);
            d(intent, true);
            final ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            if (!c) {
                e1.c.a(e1.a);
            }
            return startService;
        }
    }
}
