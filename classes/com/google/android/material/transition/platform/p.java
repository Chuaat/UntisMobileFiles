// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.transition.platform;

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
public final class p extends r<e>
{
    private static final float J = 0.92f;
    @f
    private static final int K;
    @f
    private static final int L;
    
    static {
        K = a.c.pa;
        L = a.c.za;
    }
    
    public p() {
        super(r(), s());
    }
    
    private static e r() {
        return new e();
    }
    
    private static w s() {
        final s s = new s();
        s.o(false);
        s.l(0.92f);
        return s;
    }
    
    @f
    @Override
    int g(final boolean b) {
        return p.K;
    }
    
    @f
    @Override
    int i(final boolean b) {
        return p.L;
    }
}
