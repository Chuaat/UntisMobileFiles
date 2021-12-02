// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.transition;

import androidx.annotation.k0;
import androidx.annotation.j0;
import android.view.ViewGroup;
import android.animation.Animator$AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.animation.Animator;
import androidx.annotation.t;
import android.view.View;

public final class e implements v
{
    static final float b = 0.35f;
    private float a;
    
    public e() {
        this.a = 0.35f;
    }
    
    private static Animator c(final View view, final float n, final float n2, @t(from = 0.0, to = 1.0) final float n3, @t(from = 0.0, to = 1.0) final float n4, final float n5) {
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[] { 0.0f, 1.0f });
        ofFloat.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new ValueAnimator$AnimatorUpdateListener() {
            public void onAnimationUpdate(final ValueAnimator valueAnimator) {
                view.setAlpha(u.o(n, n2, n3, n4, (float)valueAnimator.getAnimatedValue()));
            }
        });
        ofFloat.addListener((Animator$AnimatorListener)new AnimatorListenerAdapter() {
            public void onAnimationEnd(final Animator animator) {
                view.setAlpha(n5);
            }
        });
        return (Animator)ofFloat;
    }
    
    @k0
    @Override
    public Animator a(@j0 final ViewGroup viewGroup, @j0 final View view) {
        float alpha;
        if (view.getAlpha() == 0.0f) {
            alpha = 1.0f;
        }
        else {
            alpha = view.getAlpha();
        }
        return c(view, 0.0f, alpha, this.a, 1.0f, alpha);
    }
    
    @k0
    @Override
    public Animator b(@j0 final ViewGroup viewGroup, @j0 final View view) {
        float alpha;
        if (view.getAlpha() == 0.0f) {
            alpha = 1.0f;
        }
        else {
            alpha = view.getAlpha();
        }
        return c(view, alpha, 0.0f, 0.0f, this.a, alpha);
    }
    
    public float d() {
        return this.a;
    }
    
    public void e(@t(from = 0.0, to = 1.0) final float a) {
        this.a = a;
    }
}
