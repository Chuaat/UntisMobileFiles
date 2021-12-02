// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.transition;

import androidx.annotation.k0;
import android.animation.TimeInterpolator;
import androidx.annotation.j0;
import android.animation.Animator;
import androidx.transition.n0;
import android.view.View;
import android.view.ViewGroup;
import o2.a;
import androidx.annotation.f;

public final class n extends q<com.google.android.material.transition.d>
{
    private static final float M0 = 0.8f;
    private static final float N0 = 0.3f;
    @androidx.annotation.f
    private static final int O0;
    @androidx.annotation.f
    private static final int P0;
    @androidx.annotation.f
    private static final int Q0;
    
    static {
        O0 = a.c.ua;
        P0 = a.c.ta;
        Q0 = a.c.ya;
    }
    
    public n() {
        super(d1(), e1());
    }
    
    private static com.google.android.material.transition.d d1() {
        final com.google.android.material.transition.d d = new com.google.android.material.transition.d();
        d.e(0.3f);
        return d;
    }
    
    private static v e1() {
        final r r = new r();
        r.o(false);
        r.l(0.8f);
        return r;
    }
    
    @j0
    @Override
    TimeInterpolator V0(final boolean b) {
        return com.google.android.material.animation.a.a;
    }
    
    @androidx.annotation.f
    @Override
    int W0(final boolean b) {
        int n;
        if (b) {
            n = com.google.android.material.transition.n.O0;
        }
        else {
            n = com.google.android.material.transition.n.P0;
        }
        return n;
    }
    
    @androidx.annotation.f
    @Override
    int X0(final boolean b) {
        return n.Q0;
    }
}
