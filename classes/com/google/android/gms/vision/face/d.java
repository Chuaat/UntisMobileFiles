// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.vision.face;

import androidx.annotation.RecentlyNonNull;
import android.graphics.PointF;

public final class d
{
    public static final int c = 0;
    public static final int d = 1;
    public static final int e = 2;
    public static final int f = 3;
    public static final int g = 4;
    public static final int h = 5;
    public static final int i = 6;
    public static final int j = 7;
    public static final int k = 8;
    public static final int l = 9;
    public static final int m = 10;
    public static final int n = 11;
    private final PointF a;
    private final int b;
    
    public d(@RecentlyNonNull final PointF a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    @RecentlyNonNull
    public final PointF a() {
        return this.a;
    }
    
    public final int b() {
        return this.b;
    }
}
