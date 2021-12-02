// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.internal;

import android.util.StateSet;
import androidx.annotation.j0;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.Animator$AnimatorListener;
import android.animation.ValueAnimator;
import androidx.annotation.k0;
import java.util.ArrayList;
import androidx.annotation.t0;

@t0({ t0.a.H })
public final class o
{
    private final ArrayList<b> a;
    @k0
    private b b;
    @k0
    ValueAnimator c;
    private final Animator$AnimatorListener d;
    
    public o() {
        this.a = new ArrayList<b>();
        this.b = null;
        this.c = null;
        this.d = (Animator$AnimatorListener)new AnimatorListenerAdapter() {
            public void onAnimationEnd(final Animator animator) {
                final o a = o.this;
                if (a.c == animator) {
                    a.c = null;
                }
            }
        };
    }
    
    private void b() {
        final ValueAnimator c = this.c;
        if (c != null) {
            c.cancel();
            this.c = null;
        }
    }
    
    private void e(@j0 final b b) {
        (this.c = b.b).start();
    }
    
    public void a(final int[] array, final ValueAnimator valueAnimator) {
        final b e = new b(array, valueAnimator);
        valueAnimator.addListener(this.d);
        this.a.add(e);
    }
    
    public void c() {
        final ValueAnimator c = this.c;
        if (c != null) {
            c.end();
            this.c = null;
        }
    }
    
    public void d(final int[] array) {
        final int size = this.a.size();
        int i = 0;
        while (true) {
            while (i < size) {
                final b b = this.a.get(i);
                if (StateSet.stateSetMatches(b.a, array)) {
                    final b b2 = b;
                    final b b3 = this.b;
                    if (b2 == b3) {
                        return;
                    }
                    if (b3 != null) {
                        this.b();
                    }
                    if ((this.b = b2) != null) {
                        this.e(b2);
                    }
                    return;
                }
                else {
                    ++i;
                }
            }
            final b b2 = null;
            continue;
        }
    }
    
    static class b
    {
        final int[] a;
        final ValueAnimator b;
        
        b(final int[] a, final ValueAnimator b) {
            this.a = a;
            this.b = b;
        }
    }
}
