// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.animation;

import androidx.annotation.t;
import android.view.animation.DecelerateInterpolator;
import androidx.interpolator.view.animation.c;
import androidx.interpolator.view.animation.b;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import androidx.annotation.t0;

@t0({ t0.a.H })
public class a
{
    public static final TimeInterpolator a;
    public static final TimeInterpolator b;
    public static final TimeInterpolator c;
    public static final TimeInterpolator d;
    public static final TimeInterpolator e;
    
    static {
        a = (TimeInterpolator)new LinearInterpolator();
        b = (TimeInterpolator)new b();
        c = (TimeInterpolator)new androidx.interpolator.view.animation.a();
        d = (TimeInterpolator)new c();
        e = (TimeInterpolator)new DecelerateInterpolator();
    }
    
    public static float a(final float n, final float n2, final float n3) {
        return n + n3 * (n2 - n);
    }
    
    public static float b(final float n, final float n2, @t(from = 0.0, to = 1.0) final float n3, @t(from = 0.0, to = 1.0) final float n4, @t(from = 0.0, to = 1.0) final float n5) {
        if (n5 < n3) {
            return n;
        }
        if (n5 > n4) {
            return n2;
        }
        return a(n, n2, (n5 - n3) / (n4 - n3));
    }
    
    public static int c(final int n, final int n2, final float n3) {
        return n + Math.round(n3 * (n2 - n));
    }
}
