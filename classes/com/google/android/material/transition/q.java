// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.transition;

import androidx.annotation.f;
import com.google.android.material.animation.a;
import android.animation.TimeInterpolator;
import androidx.transition.n0;
import androidx.transition.g0;
import android.content.Context;
import java.util.Iterator;
import com.google.android.material.animation.b;
import android.animation.AnimatorSet;
import androidx.annotation.j0;
import android.view.View;
import android.view.ViewGroup;
import android.animation.Animator;
import java.util.ArrayList;
import java.util.List;
import androidx.annotation.k0;
import androidx.transition.f1;

abstract class q<P extends v> extends f1
{
    private final P J0;
    @k0
    private v K0;
    private final List<v> L0;
    
    protected q(final P j0, @k0 final v k0) {
        this.L0 = new ArrayList<v>();
        this.J0 = j0;
        this.K0 = k0;
    }
    
    private static void S0(final List<Animator> list, @k0 final v v, final ViewGroup viewGroup, final View view, final boolean b) {
        if (v == null) {
            return;
        }
        Animator animator;
        if (b) {
            animator = v.a(viewGroup, view);
        }
        else {
            animator = v.b(viewGroup, view);
        }
        if (animator != null) {
            list.add(animator);
        }
    }
    
    private Animator U0(@j0 final ViewGroup viewGroup, @j0 final View view, final boolean b) {
        final AnimatorSet set = new AnimatorSet();
        final ArrayList<Animator> list = new ArrayList<Animator>();
        S0(list, this.J0, viewGroup, view, b);
        S0(list, this.K0, viewGroup, view, b);
        final Iterator<v> iterator = this.L0.iterator();
        while (iterator.hasNext()) {
            S0(list, iterator.next(), viewGroup, view, b);
        }
        this.a1(viewGroup.getContext(), b);
        b.a(set, list);
        return (Animator)set;
    }
    
    private void a1(@j0 final Context context, final boolean b) {
        u.t(this, context, this.W0(b));
        u.u(this, context, this.X0(b), this.V0(b));
    }
    
    @Override
    public Animator M0(final ViewGroup viewGroup, final View view, final n0 n0, final n0 n2) {
        return this.U0(viewGroup, view, true);
    }
    
    @Override
    public Animator O0(final ViewGroup viewGroup, final View view, final n0 n0, final n0 n2) {
        return this.U0(viewGroup, view, false);
    }
    
    public void R0(@j0 final v v) {
        this.L0.add(v);
    }
    
    public void T0() {
        this.L0.clear();
    }
    
    @j0
    TimeInterpolator V0(final boolean b) {
        return a.b;
    }
    
    @androidx.annotation.f
    int W0(final boolean b) {
        return 0;
    }
    
    @androidx.annotation.f
    int X0(final boolean b) {
        return 0;
    }
    
    @j0
    public P Y0() {
        return this.J0;
    }
    
    @k0
    public v Z0() {
        return this.K0;
    }
    
    public boolean b1(@j0 final v v) {
        return this.L0.remove(v);
    }
    
    public void c1(@k0 final v k0) {
        this.K0 = k0;
    }
}
