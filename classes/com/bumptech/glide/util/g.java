// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.util;

import android.annotation.TargetApi;
import android.os.SystemClock;
import android.os.Build$VERSION;

public final class g
{
    private static final double a;
    
    static {
        final int sdk_INT = Build$VERSION.SDK_INT;
        double a2 = 1.0;
        if (sdk_INT >= 17) {
            a2 = 1.0 / Math.pow(10.0, 6.0);
        }
        a = a2;
    }
    
    private g() {
    }
    
    public static double a(final long n) {
        return (b() - n) * g.a;
    }
    
    @TargetApi(17)
    public static long b() {
        if (Build$VERSION.SDK_INT >= 17) {
            return SystemClock.elapsedRealtimeNanos();
        }
        return SystemClock.uptimeMillis();
    }
}
