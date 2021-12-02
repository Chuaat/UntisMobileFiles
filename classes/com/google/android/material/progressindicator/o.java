// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.progressindicator;

import androidx.annotation.b1;
import java.util.Arrays;
import android.animation.Animator$AnimatorListener;
import android.graphics.drawable.Drawable;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import androidx.vectordrawable.graphics.drawable.d;
import o2.a;
import androidx.annotation.j0;
import android.content.Context;
import androidx.vectordrawable.graphics.drawable.b;
import android.view.animation.Interpolator;
import android.util.Property;
import android.animation.ObjectAnimator;

final class o extends k<ObjectAnimator>
{
    private static final int l = 1800;
    private static final int[] m;
    private static final int[] n;
    private static final Property<o, Float> o;
    private ObjectAnimator d;
    private final Interpolator[] e;
    private final c f;
    private int g;
    private boolean h;
    private float i;
    private boolean j;
    b.a k;
    
    static {
        m = new int[] { 533, 567, 850, 750 };
        n = new int[] { 1267, 1000, 333, 0 };
        o = new Property<o, Float>(Float.class, "animationFraction") {
            public Float a(final o o) {
                return o.q();
            }
            
            public void b(final o o, final Float n) {
                o.u(n);
            }
        };
    }
    
    public o(@j0 final Context context, @j0 final q f) {
        super(2);
        this.g = 0;
        this.k = null;
        this.f = f;
        this.e = new Interpolator[] { androidx.vectordrawable.graphics.drawable.d.b(context, o2.a.b.d), androidx.vectordrawable.graphics.drawable.d.b(context, o2.a.b.e), androidx.vectordrawable.graphics.drawable.d.b(context, o2.a.b.f), androidx.vectordrawable.graphics.drawable.d.b(context, o2.a.b.g) };
    }
    
    private float q() {
        return this.i;
    }
    
    private void r() {
        if (this.d == null) {
            (this.d = ObjectAnimator.ofFloat((Object)this, (Property)com.google.android.material.progressindicator.o.o, new float[] { 0.0f, 1.0f })).setDuration(1800L);
            this.d.setInterpolator((TimeInterpolator)null);
            this.d.setRepeatCount(-1);
            this.d.addListener((Animator$AnimatorListener)new AnimatorListenerAdapter() {
                public void onAnimationEnd(final Animator animator) {
                    super.onAnimationEnd(animator);
                    if (com.google.android.material.progressindicator.o.this.j) {
                        com.google.android.material.progressindicator.o.this.d.setRepeatCount(-1);
                        final o a = com.google.android.material.progressindicator.o.this;
                        a.k.b(a.a);
                        com.google.android.material.progressindicator.o.this.j = false;
                    }
                }
                
                public void onAnimationRepeat(final Animator animator) {
                    super.onAnimationRepeat(animator);
                    final o a = com.google.android.material.progressindicator.o.this;
                    a.g = (a.g + 1) % com.google.android.material.progressindicator.o.this.f.c.length;
                    com.google.android.material.progressindicator.o.this.h = true;
                }
            });
        }
    }
    
    private void s() {
        if (this.h) {
            Arrays.fill(super.c, s2.a.a(this.f.c[this.g], super.a.getAlpha()));
            this.h = false;
        }
    }
    
    private void v(final int n) {
        for (int i = 0; i < 4; ++i) {
            super.b[i] = Math.max(0.0f, Math.min(1.0f, this.e[i].getInterpolation(this.b(n, com.google.android.material.progressindicator.o.n[i], com.google.android.material.progressindicator.o.m[i]))));
        }
    }
    
    public void a() {
        final ObjectAnimator d = this.d;
        if (d != null) {
            d.cancel();
        }
    }
    
    @Override
    public void c() {
        this.t();
    }
    
    @Override
    public void d(@j0 final b.a k) {
        this.k = k;
    }
    
    public void f() {
        if (super.a.isVisible()) {
            this.j = true;
            this.d.setRepeatCount(0);
        }
        else {
            this.a();
        }
    }
    
    public void g() {
        this.r();
        this.t();
        this.d.start();
    }
    
    @Override
    public void h() {
        this.k = null;
    }
    
    @b1
    void t() {
        this.g = 0;
        final int a = s2.a.a(this.f.c[0], super.a.getAlpha());
        final int[] c = super.c;
        c[1] = (c[0] = a);
    }
    
    @b1
    void u(final float i) {
        this.i = i;
        this.v((int)(i * 1800.0f));
        this.s();
        super.a.invalidateSelf();
    }
}
