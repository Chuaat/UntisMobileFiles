// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.transition;

import androidx.annotation.t0;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;
import androidx.annotation.k0;
import androidx.annotation.j0;
import android.animation.Animator;
import androidx.transition.n0;
import android.view.View;
import android.view.ViewGroup;
import o2.a;
import androidx.annotation.f;

public final class p extends q<v>
{
    public static final int O0 = 0;
    public static final int P0 = 1;
    public static final int Q0 = 2;
    @androidx.annotation.f
    private static final int R0;
    @androidx.annotation.f
    private static final int S0;
    private final int M0;
    private final boolean N0;
    
    static {
        R0 = o2.a.c.pa;
        S0 = o2.a.c.za;
    }
    
    public p(final int m0, final boolean n0) {
        super(d1(m0, n0), e1());
        this.M0 = m0;
        this.N0 = n0;
    }
    
    private static v d1(int i, final boolean b) {
        if (i == 0) {
            if (b) {
                i = 8388613;
            }
            else {
                i = 8388611;
            }
            return new s(i);
        }
        if (i == 1) {
            if (b) {
                i = 80;
            }
            else {
                i = 48;
            }
            return new s(i);
        }
        if (i == 2) {
            return new r(b);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Invalid axis: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
    
    private static v e1() {
        return new com.google.android.material.transition.e();
    }
    
    @androidx.annotation.f
    @Override
    int W0(final boolean b) {
        return p.R0;
    }
    
    @androidx.annotation.f
    @Override
    int X0(final boolean b) {
        return p.S0;
    }
    
    public int f1() {
        return this.M0;
    }
    
    public boolean h1() {
        return this.N0;
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @t0({ androidx.annotation.t0.a.H })
    public @interface a {
    }
}
