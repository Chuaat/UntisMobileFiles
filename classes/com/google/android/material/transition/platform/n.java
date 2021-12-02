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
import androidx.annotation.p0;

@p0(21)
public final class n extends r<s>
{
    private static final float K = 0.85f;
    private final boolean J;
    
    public n(final boolean j) {
        super(r(j), s());
        this.J = j;
    }
    
    private static s r(final boolean b) {
        final s s = new s(b);
        s.m(0.85f);
        s.l(0.85f);
        return s;
    }
    
    private static w s() {
        return new d();
    }
    
    public boolean t() {
        return this.J;
    }
}
