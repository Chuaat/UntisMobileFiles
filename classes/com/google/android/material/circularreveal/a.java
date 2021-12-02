// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.circularreveal;

import android.animation.AnimatorListenerAdapter;
import android.animation.Animator$AnimatorListener;
import android.animation.AnimatorSet;
import android.view.ViewAnimationUtils;
import android.view.View;
import android.os.Build$VERSION;
import android.animation.TypeEvaluator;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.animation.Animator;
import androidx.annotation.j0;

public final class a
{
    private a() {
    }
    
    @j0
    public static Animator a(@j0 final g g, final float n, final float n2, final float n3) {
        final ObjectAnimator ofObject = ObjectAnimator.ofObject((Object)g, (Property)g.c.a, (TypeEvaluator)g.b.b, (Object[])new g.e[] { new g.e(n, n2, n3) });
        if (Build$VERSION.SDK_INT < 21) {
            return (Animator)ofObject;
        }
        final g.e revealInfo = g.getRevealInfo();
        if (revealInfo != null) {
            final Animator circularReveal = ViewAnimationUtils.createCircularReveal((View)g, (int)n, (int)n2, revealInfo.c, n3);
            final AnimatorSet set = new AnimatorSet();
            set.playTogether(new Animator[] { (Animator)ofObject, circularReveal });
            return (Animator)set;
        }
        throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
    }
    
    @j0
    public static Animator b(final g g, final float n, final float n2, final float n3, final float n4) {
        final ObjectAnimator ofObject = ObjectAnimator.ofObject((Object)g, (Property)g.c.a, (TypeEvaluator)g.b.b, (Object[])new g.e[] { new g.e(n, n2, n3), new g.e(n, n2, n4) });
        if (Build$VERSION.SDK_INT >= 21) {
            final Animator circularReveal = ViewAnimationUtils.createCircularReveal((View)g, (int)n, (int)n2, n3, n4);
            final AnimatorSet set = new AnimatorSet();
            set.playTogether(new Animator[] { (Animator)ofObject, circularReveal });
            return (Animator)set;
        }
        return (Animator)ofObject;
    }
    
    @j0
    public static Animator$AnimatorListener c(@j0 final g g) {
        return (Animator$AnimatorListener)new AnimatorListenerAdapter() {
            public void onAnimationEnd(final Animator animator) {
                g.b();
            }
            
            public void onAnimationStart(final Animator animator) {
                g.a();
            }
        };
    }
}
