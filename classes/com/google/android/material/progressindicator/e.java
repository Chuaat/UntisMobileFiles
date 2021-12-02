// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.progressindicator;

import androidx.annotation.b1;
import s2.a;
import android.graphics.drawable.Drawable;
import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import androidx.annotation.j0;
import androidx.interpolator.view.animation.b;
import android.util.Property;
import android.animation.ObjectAnimator;

final class e extends k<ObjectAnimator>
{
    private static final int l = 4;
    private static final int m = 5400;
    private static final int n = 667;
    private static final int o = 667;
    private static final int p = 333;
    private static final int q = 333;
    private static final int[] r;
    private static final int[] s;
    private static final int[] t;
    private static final int u = -20;
    private static final int v = 250;
    private static final int w = 1520;
    private static final Property<e, Float> x;
    private static final Property<e, Float> y;
    private ObjectAnimator d;
    private ObjectAnimator e;
    private final b f;
    private final c g;
    private int h;
    private float i;
    private float j;
    androidx.vectordrawable.graphics.drawable.b.a k;
    
    static {
        r = new int[] { 0, 1350, 2700, 4050 };
        s = new int[] { 667, 2017, 3367, 4717 };
        t = new int[] { 1000, 2350, 3700, 5050 };
        x = new Property<e, Float>(Float.class, "animationFraction") {
            public Float a(final e e) {
                return e.o();
            }
            
            public void b(final e e, final Float n) {
                e.t(n);
            }
        };
        y = new Property<e, Float>(Float.class, "completeEndFraction") {
            public Float a(final e e) {
                return e.p();
            }
            
            public void b(final e e, final Float n) {
                e.u(n);
            }
        };
    }
    
    public e(@j0 final g g) {
        super(1);
        this.h = 0;
        this.k = null;
        this.g = g;
        this.f = new b();
    }
    
    private float o() {
        return this.i;
    }
    
    private float p() {
        return this.j;
    }
    
    private void q() {
        if (this.d == null) {
            (this.d = ObjectAnimator.ofFloat((Object)this, (Property)com.google.android.material.progressindicator.e.x, new float[] { 0.0f, 1.0f })).setDuration(5400L);
            this.d.setInterpolator((TimeInterpolator)null);
            this.d.setRepeatCount(-1);
            this.d.addListener((Animator$AnimatorListener)new AnimatorListenerAdapter() {
                public void onAnimationRepeat(final Animator animator) {
                    super.onAnimationRepeat(animator);
                    final e a = com.google.android.material.progressindicator.e.this;
                    a.h = (a.h + 4) % com.google.android.material.progressindicator.e.this.g.c.length;
                }
            });
        }
        if (this.e == null) {
            (this.e = ObjectAnimator.ofFloat((Object)this, (Property)com.google.android.material.progressindicator.e.y, new float[] { 0.0f, 1.0f })).setDuration(333L);
            this.e.setInterpolator((TimeInterpolator)this.f);
            this.e.addListener((Animator$AnimatorListener)new AnimatorListenerAdapter() {
                public void onAnimationEnd(final Animator animator) {
                    super.onAnimationEnd(animator);
                    com.google.android.material.progressindicator.e.this.a();
                    final e a = com.google.android.material.progressindicator.e.this;
                    a.k.b(a.a);
                }
            });
        }
    }
    
    private void r(int i) {
        for (int j = 0; j < 4; ++j) {
            final float b = this.b(i, com.google.android.material.progressindicator.e.t[j], 333);
            if (b >= 0.0f && b <= 1.0f) {
                i = this.h;
                final int[] c = this.g.c;
                final int n = (j + i) % c.length;
                final int length = c.length;
                i = s2.a.a(c[n], super.a.getAlpha());
                super.c[0] = com.google.android.material.animation.c.b().a(this.f.getInterpolation(b), i, s2.a.a(this.g.c[(n + 1) % length], super.a.getAlpha()));
                break;
            }
        }
    }
    
    private void u(final float j) {
        this.j = j;
    }
    
    private void v(final int n) {
        final float[] b = super.b;
        final float i = this.i;
        b[0] = i * 1520.0f - 20.0f;
        b[1] = i * 1520.0f;
        for (int j = 0; j < 4; ++j) {
            final float b2 = this.b(n, com.google.android.material.progressindicator.e.r[j], 667);
            final float[] b3 = super.b;
            b3[1] += this.f.getInterpolation(b2) * 250.0f;
            final float b4 = this.b(n, com.google.android.material.progressindicator.e.s[j], 667);
            final float[] b5 = super.b;
            b5[0] += this.f.getInterpolation(b4) * 250.0f;
        }
        final float[] b6 = super.b;
        b6[0] += (b6[1] - b6[0]) * this.j;
        b6[0] /= 360.0f;
        b6[1] /= 360.0f;
    }
    
    @Override
    void a() {
        final ObjectAnimator d = this.d;
        if (d != null) {
            d.cancel();
        }
    }
    
    @Override
    public void c() {
        this.s();
    }
    
    @Override
    public void d(@j0 final androidx.vectordrawable.graphics.drawable.b.a k) {
        this.k = k;
    }
    
    @Override
    void f() {
        if (this.e.isRunning()) {
            return;
        }
        if (super.a.isVisible()) {
            this.e.start();
        }
        else {
            this.a();
        }
    }
    
    @Override
    void g() {
        this.q();
        this.s();
        this.d.start();
    }
    
    @Override
    public void h() {
        this.k = null;
    }
    
    @b1
    void s() {
        this.h = 0;
        super.c[0] = s2.a.a(this.g.c[0], super.a.getAlpha());
        this.j = 0.0f;
    }
    
    @b1
    void t(final float i) {
        this.i = i;
        final int n = (int)(i * 5400.0f);
        this.v(n);
        this.r(n);
        super.a.invalidateSelf();
    }
}
