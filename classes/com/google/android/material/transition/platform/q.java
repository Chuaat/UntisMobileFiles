// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.transition.platform;

import androidx.annotation.t0;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;
import android.animation.Animator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.k0;
import androidx.annotation.j0;
import o2.a;
import androidx.annotation.f;
import androidx.annotation.p0;

@p0(21)
public final class q extends r<w>
{
    public static final int L = 0;
    public static final int M = 1;
    public static final int N = 2;
    @f
    private static final int O;
    @f
    private static final int P;
    private final int J;
    private final boolean K;
    
    static {
        O = o2.a.c.pa;
        P = o2.a.c.za;
    }
    
    public q(final int j, final boolean k) {
        super(r(j, k), s());
        this.J = j;
        this.K = k;
    }
    
    private static w r(int i, final boolean b) {
        if (i == 0) {
            if (b) {
                i = 8388613;
            }
            else {
                i = 8388611;
            }
            return new t(i);
        }
        if (i == 1) {
            if (b) {
                i = 80;
            }
            else {
                i = 48;
            }
            return new t(i);
        }
        if (i == 2) {
            return new s(b);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Invalid axis: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
    
    private static w s() {
        return new e();
    }
    
    @f
    @Override
    int g(final boolean b) {
        return q.O;
    }
    
    @f
    @Override
    int i(final boolean b) {
        return q.P;
    }
    
    public int t() {
        return this.J;
    }
    
    public boolean u() {
        return this.K;
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @t0({ t0.a.H })
    public @interface a {
    }
}
