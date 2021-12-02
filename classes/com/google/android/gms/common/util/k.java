// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.util;

import android.os.SystemClock;
import androidx.annotation.RecentlyNonNull;
import f2.a;

@a
public class k implements g
{
    private static final k a;
    
    static {
        a = new k();
    }
    
    private k() {
    }
    
    @RecentlyNonNull
    @a
    public static g e() {
        return k.a;
    }
    
    @RecentlyNonNull
    @Override
    public long a() {
        return System.currentTimeMillis();
    }
    
    @RecentlyNonNull
    @Override
    public long b() {
        return System.nanoTime();
    }
    
    @RecentlyNonNull
    @Override
    public long c() {
        return SystemClock.currentThreadTimeMillis();
    }
    
    @RecentlyNonNull
    @Override
    public long d() {
        return SystemClock.elapsedRealtime();
    }
}
