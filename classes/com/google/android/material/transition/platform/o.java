// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.k0;
import android.animation.TimeInterpolator;
import androidx.annotation.j0;
import o2.a;
import androidx.annotation.f;
import androidx.annotation.p0;

@p0(21)
public final class o extends r<d>
{
    private static final float J = 0.8f;
    private static final float K = 0.3f;
    @f
    private static final int L;
    @f
    private static final int M;
    @f
    private static final int N;
    
    static {
        L = a.c.ua;
        M = a.c.ta;
        N = a.c.ya;
    }
    
    public o() {
        super(r(), s());
    }
    
    private static d r() {
        final d d = new d();
        d.e(0.3f);
        return d;
    }
    
    private static w s() {
        final s s = new s();
        s.o(false);
        s.l(0.8f);
        return s;
    }
    
    @j0
    @Override
    TimeInterpolator f(final boolean b) {
        return com.google.android.material.animation.a.a;
    }
    
    @f
    @Override
    int g(final boolean b) {
        int n;
        if (b) {
            n = o.L;
        }
        else {
            n = o.M;
        }
        return n;
    }
    
    @f
    @Override
    int i(final boolean b) {
        return o.N;
    }
}
