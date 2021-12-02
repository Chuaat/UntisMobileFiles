// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.transition;

import androidx.annotation.t0;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;
import androidx.annotation.k0;
import android.view.ViewGroup;
import androidx.core.view.j0;
import o2.a;
import android.content.Context;
import android.animation.Animator$AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.Animator;
import android.view.View;
import androidx.annotation.n0;

public final class s implements v
{
    private static final int c = -1;
    private int a;
    @n0
    private int b;
    
    public s(final int a) {
        this.b = -1;
        this.a = a;
    }
    
    private static Animator c(final View view, final View view2, final int i, @n0 final int n) {
        final float translationX = view2.getTranslationX();
        final float translationY = view2.getTranslationY();
        if (i == 3) {
            return e(view2, n + translationX, translationX, translationX);
        }
        if (i == 5) {
            return e(view2, translationX - n, translationX, translationX);
        }
        if (i == 48) {
            return f(view2, translationY - n, translationY, translationY);
        }
        if (i == 80) {
            return f(view2, n + translationY, translationY, translationY);
        }
        if (i == 8388611) {
            float n2;
            if (j(view)) {
                n2 = n + translationX;
            }
            else {
                n2 = translationX - n;
            }
            return e(view2, n2, translationX, translationX);
        }
        if (i == 8388613) {
            float n3;
            if (j(view)) {
                n3 = translationX - n;
            }
            else {
                n3 = n + translationX;
            }
            return e(view2, n3, translationX, translationX);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Invalid slide direction: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
    
    private static Animator d(final View view, final View view2, final int i, @n0 final int n) {
        final float translationX = view2.getTranslationX();
        final float translationY = view2.getTranslationY();
        if (i == 3) {
            return e(view2, translationX, translationX - n, translationX);
        }
        if (i == 5) {
            return e(view2, translationX, n + translationX, translationX);
        }
        if (i == 48) {
            return f(view2, translationY, n + translationY, translationY);
        }
        if (i == 80) {
            return f(view2, translationY, translationY - n, translationY);
        }
        if (i == 8388611) {
            float n2;
            if (j(view)) {
                n2 = translationX - n;
            }
            else {
                n2 = n + translationX;
            }
            return e(view2, translationX, n2, translationX);
        }
        if (i == 8388613) {
            float n3;
            if (j(view)) {
                n3 = n + translationX;
            }
            else {
                n3 = translationX - n;
            }
            return e(view2, translationX, n3, translationX);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Invalid slide direction: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
    
    private static Animator e(final View view, final float n, final float n2, final float n3) {
        final ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder((Object)view, new PropertyValuesHolder[] { PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[] { n, n2 }) });
        ofPropertyValuesHolder.addListener((Animator$AnimatorListener)new AnimatorListenerAdapter() {
            public void onAnimationEnd(final Animator animator) {
                view.setTranslationX(n3);
            }
        });
        return (Animator)ofPropertyValuesHolder;
    }
    
    private static Animator f(final View view, final float n, final float n2, final float n3) {
        final ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder((Object)view, new PropertyValuesHolder[] { PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[] { n, n2 }) });
        ofPropertyValuesHolder.addListener((Animator$AnimatorListener)new AnimatorListenerAdapter() {
            public void onAnimationEnd(final Animator animator) {
                view.setTranslationY(n3);
            }
        });
        return (Animator)ofPropertyValuesHolder;
    }
    
    private int h(final Context context) {
        final int b = this.b;
        if (b != -1) {
            return b;
        }
        return context.getResources().getDimensionPixelSize(o2.a.f.t6);
    }
    
    private static boolean j(final View view) {
        final int x = j0.X(view);
        boolean b = true;
        if (x != 1) {
            b = false;
        }
        return b;
    }
    
    @k0
    @Override
    public Animator a(@androidx.annotation.j0 final ViewGroup viewGroup, @androidx.annotation.j0 final View view) {
        return c((View)viewGroup, view, this.a, this.h(view.getContext()));
    }
    
    @k0
    @Override
    public Animator b(@androidx.annotation.j0 final ViewGroup viewGroup, @androidx.annotation.j0 final View view) {
        return d((View)viewGroup, view, this.a, this.h(view.getContext()));
    }
    
    @n0
    public int g() {
        return this.b;
    }
    
    public int i() {
        return this.a;
    }
    
    public void k(@n0 final int b) {
        if (b >= 0) {
            this.b = b;
            return;
        }
        throw new IllegalArgumentException("Slide distance must be positive. If attempting to reverse the direction of the slide, use setSlideEdge(int) instead.");
    }
    
    public void l(final int a) {
        this.a = a;
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @t0({ t0.a.H })
    public @interface c {
    }
}
