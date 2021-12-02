// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.transition.platform;

import android.transition.TransitionValues;
import androidx.annotation.f;
import com.google.android.material.animation.a;
import android.animation.TimeInterpolator;
import android.transition.Transition;
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
import androidx.annotation.p0;
import android.transition.Visibility;

@p0(21)
abstract class r<P extends w> extends Visibility
{
    private final P G;
    @k0
    private w H;
    private final List<w> I;
    
    protected r(final P g, @k0 final w h) {
        this.I = new ArrayList<w>();
        this.G = g;
        this.H = h;
    }
    
    private static void b(final List<Animator> list, @k0 final w w, final ViewGroup viewGroup, final View view, final boolean b) {
        if (w == null) {
            return;
        }
        Animator animator;
        if (b) {
            animator = w.a(viewGroup, view);
        }
        else {
            animator = w.b(viewGroup, view);
        }
        if (animator != null) {
            list.add(animator);
        }
    }
    
    private Animator d(@j0 final ViewGroup viewGroup, @j0 final View view, final boolean b) {
        final AnimatorSet set = new AnimatorSet();
        final ArrayList<Animator> list = new ArrayList<Animator>();
        b(list, this.G, viewGroup, view, b);
        b(list, this.H, viewGroup, view, b);
        final Iterator<w> iterator = this.I.iterator();
        while (iterator.hasNext()) {
            b(list, iterator.next(), viewGroup, view, b);
        }
        this.m(viewGroup.getContext(), b);
        b.a(set, list);
        return (Animator)set;
    }
    
    private void m(@j0 final Context context, final boolean b) {
        v.t((Transition)this, context, this.g(b));
        v.u((Transition)this, context, this.i(b), this.f(b));
    }
    
    public void a(@j0 final w w) {
        this.I.add(w);
    }
    
    public void c() {
        this.I.clear();
    }
    
    @j0
    TimeInterpolator f(final boolean b) {
        return a.b;
    }
    
    @f
    int g(final boolean b) {
        return 0;
    }
    
    @f
    int i(final boolean b) {
        return 0;
    }
    
    @j0
    public P j() {
        return this.G;
    }
    
    @k0
    public w l() {
        return this.H;
    }
    
    public boolean n(@j0 final w w) {
        return this.I.remove(w);
    }
    
    public Animator onAppear(final ViewGroup viewGroup, final View view, final TransitionValues transitionValues, final TransitionValues transitionValues2) {
        return this.d(viewGroup, view, true);
    }
    
    public Animator onDisappear(final ViewGroup viewGroup, final View view, final TransitionValues transitionValues, final TransitionValues transitionValues2) {
        return this.d(viewGroup, view, false);
    }
    
    public void q(@k0 final w h) {
        this.H = h;
    }
}
