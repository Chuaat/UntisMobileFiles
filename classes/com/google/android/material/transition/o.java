// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.transition;

import androidx.annotation.k0;
import androidx.annotation.j0;
import android.animation.Animator;
import androidx.transition.n0;
import android.view.View;
import android.view.ViewGroup;
import o2.a;
import androidx.annotation.f;

public final class o extends q<com.google.android.material.transition.e>
{
    private static final float M0 = 0.92f;
    @androidx.annotation.f
    private static final int N0;
    @androidx.annotation.f
    private static final int O0;
    
    static {
        N0 = a.c.pa;
        O0 = a.c.za;
    }
    
    public o() {
        super(d1(), e1());
    }
    
    private static com.google.android.material.transition.e d1() {
        return new com.google.android.material.transition.e();
    }
    
    private static v e1() {
        final r r = new r();
        r.o(false);
        r.l(0.92f);
        return r;
    }
    
    @androidx.annotation.f
    @Override
    int W0(final boolean b) {
        return o.N0;
    }
    
    @androidx.annotation.f
    @Override
    int X0(final boolean b) {
        return o.O0;
    }
}
