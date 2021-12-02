// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.transformation;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.animation.b;
import java.util.ArrayList;
import android.animation.AnimatorSet;
import android.view.MotionEvent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.animation.ObjectAnimator;
import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import java.util.List;
import androidx.annotation.j0;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import com.google.android.material.animation.i;

@Deprecated
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior
{
    public static final long h = 75L;
    public static final long i = 150L;
    public static final long j = 0L;
    public static final long k = 150L;
    private final com.google.android.material.animation.i f;
    private final com.google.android.material.animation.i g;
    
    public FabTransformationScrimBehavior() {
        this.f = new com.google.android.material.animation.i(75L, 150L);
        this.g = new com.google.android.material.animation.i(0L, 150L);
    }
    
    public FabTransformationScrimBehavior(final Context context, final AttributeSet set) {
        super(context, set);
        this.f = new com.google.android.material.animation.i(75L, 150L);
        this.g = new com.google.android.material.animation.i(0L, 150L);
    }
    
    private void N(@j0 final View view, final boolean b, final boolean b2, @j0 final List<Animator> list, final List<Animator$AnimatorListener> list2) {
        com.google.android.material.animation.i i;
        if (b) {
            i = this.f;
        }
        else {
            i = this.g;
        }
        ObjectAnimator objectAnimator;
        if (b) {
            if (!b2) {
                view.setAlpha(0.0f);
            }
            objectAnimator = ObjectAnimator.ofFloat((Object)view, View.ALPHA, new float[] { 1.0f });
        }
        else {
            objectAnimator = ObjectAnimator.ofFloat((Object)view, View.ALPHA, new float[] { 0.0f });
        }
        i.a((Animator)objectAnimator);
        list.add((Animator)objectAnimator);
    }
    
    @Override
    public boolean E(@j0 final CoordinatorLayout coordinatorLayout, @j0 final View view, @j0 final MotionEvent motionEvent) {
        return super.E(coordinatorLayout, view, motionEvent);
    }
    
    @j0
    @Override
    protected AnimatorSet M(@j0 final View view, @j0 final View view2, final boolean b, final boolean b2) {
        final ArrayList<Animator> list = new ArrayList<Animator>();
        this.N(view2, b, b2, list, new ArrayList<Animator$AnimatorListener>());
        final AnimatorSet set = new AnimatorSet();
        b.a(set, list);
        set.addListener((Animator$AnimatorListener)new AnimatorListenerAdapter() {
            public void onAnimationEnd(final Animator animator) {
                if (!b) {
                    view2.setVisibility(4);
                }
            }
            
            public void onAnimationStart(final Animator animator) {
                if (b) {
                    view2.setVisibility(0);
                }
            }
        });
        return set;
    }
    
    @Override
    public boolean f(final CoordinatorLayout coordinatorLayout, final View view, final View view2) {
        return view2 instanceof FloatingActionButton;
    }
}
