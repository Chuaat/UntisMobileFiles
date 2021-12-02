// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.transformation;

import androidx.annotation.j0;
import androidx.annotation.i;
import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import androidx.annotation.k0;
import android.animation.AnimatorSet;

@Deprecated
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior
{
    @k0
    private AnimatorSet e;
    
    public ExpandableTransformationBehavior() {
    }
    
    public ExpandableTransformationBehavior(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    @androidx.annotation.i
    @Override
    protected boolean K(final View view, final View view2, final boolean b, final boolean b2) {
        final AnimatorSet e = this.e;
        final boolean b3 = e != null;
        if (b3) {
            e.cancel();
        }
        (this.e = this.M(view, view2, b, b3)).addListener((Animator$AnimatorListener)new AnimatorListenerAdapter() {
            public void onAnimationEnd(final Animator animator) {
                ExpandableTransformationBehavior.this.e = null;
            }
        });
        this.e.start();
        if (!b2) {
            this.e.end();
        }
        return true;
    }
    
    @j0
    protected abstract AnimatorSet M(final View p0, final View p1, final boolean p2, final boolean p3);
}
