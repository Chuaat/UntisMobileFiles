// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.behavior;

import android.view.ViewGroup$MarginLayoutParams;
import com.google.android.material.animation.a;
import androidx.annotation.q;
import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import androidx.annotation.j0;
import android.util.AttributeSet;
import android.content.Context;
import androidx.annotation.k0;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.view.View;

public class HideBottomViewOnScrollBehavior<V extends View> extends c<V>
{
    protected static final int e = 225;
    protected static final int f = 175;
    private static final int g = 1;
    private static final int h = 2;
    private int a;
    private int b;
    private int c;
    @k0
    private ViewPropertyAnimator d;
    
    public HideBottomViewOnScrollBehavior() {
        this.a = 0;
        this.b = 2;
        this.c = 0;
    }
    
    public HideBottomViewOnScrollBehavior(final Context context, final AttributeSet set) {
        super(context, set);
        this.a = 0;
        this.b = 2;
        this.c = 0;
    }
    
    private void H(@j0 final V v, final int n, final long duration, final TimeInterpolator interpolator) {
        this.d = v.animate().translationY((float)n).setInterpolator(interpolator).setDuration(duration).setListener((Animator$AnimatorListener)new AnimatorListenerAdapter() {
            public void onAnimationEnd(final Animator animator) {
                HideBottomViewOnScrollBehavior.this.d = null;
            }
        });
    }
    
    @Override
    public boolean B(@j0 final CoordinatorLayout coordinatorLayout, @j0 final V v, @j0 final View view, @j0 final View view2, final int n, final int n2) {
        return n == 2;
    }
    
    public void I(@j0 final V v, @q final int c) {
        this.c = c;
        if (this.b == 1) {
            v.setTranslationY((float)(this.a + c));
        }
    }
    
    public void J(@j0 final V v) {
        if (this.b == 1) {
            return;
        }
        final ViewPropertyAnimator d = this.d;
        if (d != null) {
            d.cancel();
            v.clearAnimation();
        }
        this.b = 1;
        this.H(v, this.a + this.c, 175L, com.google.android.material.animation.a.c);
    }
    
    public void K(@j0 final V v) {
        if (this.b == 2) {
            return;
        }
        final ViewPropertyAnimator d = this.d;
        if (d != null) {
            d.cancel();
            v.clearAnimation();
        }
        this.b = 2;
        this.H(v, 0, 225L, com.google.android.material.animation.a.d);
    }
    
    @Override
    public boolean m(@j0 final CoordinatorLayout coordinatorLayout, @j0 final V v, final int n) {
        this.a = v.getMeasuredHeight() + ((ViewGroup$MarginLayoutParams)v.getLayoutParams()).bottomMargin;
        return super.m(coordinatorLayout, v, n);
    }
    
    @Override
    public void u(final CoordinatorLayout coordinatorLayout, @j0 final V v, @j0 final View view, final int n, final int n2, final int n3, final int n4, final int n5, @j0 final int[] array) {
        if (n2 > 0) {
            this.J(v);
        }
        else if (n2 < 0) {
            this.K(v);
        }
    }
}
