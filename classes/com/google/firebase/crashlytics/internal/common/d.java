// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.crashlytics.internal.common;

import android.content.Intent;
import com.google.firebase.crashlytics.internal.f;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.content.Context;

class d
{
    static final int c = 1;
    static final int d = 2;
    static final int e = 3;
    private final Float a;
    private final boolean b;
    
    private d(final Float a, final boolean b) {
        this.b = b;
        this.a = a;
    }
    
    public static d a(final Context context) {
        final Float n = null;
        final boolean b = false;
        boolean f;
        final boolean b2 = f = false;
        Float d;
        try {
            f = b2;
            final IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
            f = b2;
            final Intent registerReceiver = context.registerReceiver((BroadcastReceiver)null, intentFilter);
            d = n;
            f = b;
            if (registerReceiver != null) {
                f = b2;
                f = f(registerReceiver);
                d = d(registerReceiver);
                f = f;
            }
        }
        catch (IllegalStateException ex) {
            com.google.firebase.crashlytics.internal.f.f().e("An error occurred getting battery state.", ex);
            d = n;
        }
        return new d(d, f);
    }
    
    private static Float d(final Intent intent) {
        final int intExtra = intent.getIntExtra("level", -1);
        final int intExtra2 = intent.getIntExtra("scale", -1);
        if (intExtra != -1 && intExtra2 != -1) {
            return intExtra / (float)intExtra2;
        }
        return null;
    }
    
    private static boolean f(final Intent intent) {
        final int intExtra = intent.getIntExtra("status", -1);
        boolean b = false;
        if (intExtra == -1) {
            return false;
        }
        if (intExtra == 2 || intExtra == 5) {
            b = true;
        }
        return b;
    }
    
    public Float b() {
        return this.a;
    }
    
    public int c() {
        if (this.b) {
            final Float a = this.a;
            if (a != null) {
                if (a < 0.99) {
                    return 2;
                }
                return 3;
            }
        }
        return 1;
    }
    
    boolean e() {
        return this.b;
    }
}
