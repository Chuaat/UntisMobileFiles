// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.appbar;

import android.content.res.TypedArray;
import android.content.Context;
import android.animation.AnimatorInflater;
import com.google.android.material.internal.t;
import android.util.AttributeSet;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import o2.a;
import android.view.ViewOutlineProvider;
import androidx.annotation.j0;
import android.view.View;
import androidx.annotation.p0;

@p0(21)
class f
{
    private static final int[] a;
    
    static {
        a = new int[] { 16843848 };
    }
    
    static void a(@j0 final View view) {
        view.setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }
    
    static void b(@j0 final View view, final float n) {
        final int integer = view.getResources().getInteger(o2.a.i.c);
        final StateListAnimator stateListAnimator = new StateListAnimator();
        final int ed = o2.a.c.ed;
        final int n2 = -o2.a.c.fd;
        final ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object)view, "elevation", new float[] { 0.0f });
        final long n3 = integer;
        stateListAnimator.addState(new int[] { 16842766, ed, n2 }, (Animator)ofFloat.setDuration(n3));
        stateListAnimator.addState(new int[] { 16842766 }, (Animator)ObjectAnimator.ofFloat((Object)view, "elevation", new float[] { n }).setDuration(n3));
        stateListAnimator.addState(new int[0], (Animator)ObjectAnimator.ofFloat((Object)view, "elevation", new float[] { 0.0f }).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }
    
    static void c(@j0 final View view, AttributeSet j, final int n, final int n2) {
        final Context context = view.getContext();
        j = (AttributeSet)t.j(context, j, f.a, n, n2, new int[0]);
        try {
            if (((TypedArray)j).hasValue(0)) {
                view.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, ((TypedArray)j).getResourceId(0, 0)));
            }
        }
        finally {
            ((TypedArray)j).recycle();
        }
    }
}
