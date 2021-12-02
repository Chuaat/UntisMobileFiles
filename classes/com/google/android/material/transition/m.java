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

public final class m extends q<r>
{
    private static final float N0 = 0.85f;
    private final boolean M0;
    
    public m(final boolean m0) {
        super(d1(m0), e1());
        this.M0 = m0;
    }
    
    private static r d1(final boolean b) {
        final r r = new r(b);
        r.m(0.85f);
        r.l(0.85f);
        return r;
    }
    
    private static v e1() {
        return new com.google.android.material.transition.d();
    }
    
    public boolean f1() {
        return this.M0;
    }
}
