// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.transition;

import androidx.annotation.k0;
import androidx.annotation.j0;
import android.view.ViewGroup;
import android.animation.Animator$AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.Animator;
import android.view.View;

public final class r implements v
{
    private float a;
    private float b;
    private float c;
    private float d;
    private boolean e;
    private boolean f;
    
    public r() {
        this(true);
    }
    
    public r(final boolean e) {
        this.a = 1.0f;
        this.b = 1.1f;
        this.c = 0.8f;
        this.d = 1.0f;
        this.f = true;
        this.e = e;
    }
    
    private static Animator c(final View view, final float n, final float n2) {
        final float scaleX = view.getScaleX();
        final float scaleY = view.getScaleY();
        final ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder((Object)view, new PropertyValuesHolder[] { PropertyValuesHolder.ofFloat(View.SCALE_X, new float[] { scaleX * n, scaleX * n2 }), PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[] { n * scaleY, n2 * scaleY }) });
        ofPropertyValuesHolder.addListener((Animator$AnimatorListener)new AnimatorListenerAdapter() {
            public void onAnimationEnd(final Animator animator) {
                view.setScaleX(scaleX);
                view.setScaleY(scaleY);
            }
        });
        return (Animator)ofPropertyValuesHolder;
    }
    
    @k0
    @Override
    public Animator a(@j0 final ViewGroup viewGroup, @j0 final View view) {
        float n;
        float n2;
        if (this.e) {
            n = this.c;
            n2 = this.d;
        }
        else {
            n = this.b;
            n2 = this.a;
        }
        return c(view, n, n2);
    }
    
    @k0
    @Override
    public Animator b(@j0 final ViewGroup viewGroup, @j0 final View view) {
        if (!this.f) {
            return null;
        }
        float n;
        float n2;
        if (this.e) {
            n = this.a;
            n2 = this.b;
        }
        else {
            n = this.d;
            n2 = this.c;
        }
        return c(view, n, n2);
    }
    
    public float d() {
        return this.d;
    }
    
    public float e() {
        return this.c;
    }
    
    public float f() {
        return this.b;
    }
    
    public float g() {
        return this.a;
    }
    
    public boolean h() {
        return this.e;
    }
    
    public boolean i() {
        return this.f;
    }
    
    public void j(final boolean e) {
        this.e = e;
    }
    
    public void k(final float d) {
        this.d = d;
    }
    
    public void l(final float c) {
        this.c = c;
    }
    
    public void m(final float b) {
        this.b = b;
    }
    
    public void n(final float a) {
        this.a = a;
    }
    
    public void o(final boolean f) {
        this.f = f;
    }
}
