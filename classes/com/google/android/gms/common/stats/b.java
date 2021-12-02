// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.stats;

import androidx.annotation.RecentlyNonNull;
import android.content.ComponentName;
import f2.a;

@a
public final class b
{
    private static final ComponentName a;
    private static int b = 0;
    private static int c = 0;
    private static int d = 0;
    private static int e = 0;
    private static int f = 0;
    private static int g = 0;
    private static int h = 0;
    @Deprecated
    @RecentlyNonNull
    @a
    public static final String i = "WAKE_LOCK_KEY";
    private static int j;
    
    static {
        a = new ComponentName("com.google.android.gms", "com.google.android.gms.common.stats.GmsCoreStatsService");
        com.google.android.gms.common.stats.b.b = 0;
        com.google.android.gms.common.stats.b.c = 1;
        com.google.android.gms.common.stats.b.d = 2;
        com.google.android.gms.common.stats.b.e = 4;
        com.google.android.gms.common.stats.b.f = 8;
        com.google.android.gms.common.stats.b.g = 16;
        com.google.android.gms.common.stats.b.h = 32;
        com.google.android.gms.common.stats.b.j = 1;
    }
    
    private b() {
    }
}
