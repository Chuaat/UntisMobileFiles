// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.progressindicator;

import androidx.annotation.b1;
import java.util.Arrays;
import androidx.annotation.k0;
import s2.a;
import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import androidx.annotation.j0;
import androidx.interpolator.view.animation.b;
import android.util.Property;
import android.animation.ObjectAnimator;

final class n extends k<ObjectAnimator>
{
    private static final int j = 667;
    private static final int k = 333;
    private static final Property<n, Float> l;
    private ObjectAnimator d;
    private b e;
    private final c f;
    private int g;
    private boolean h;
    private float i;
    
    static {
        l = new Property<n, Float>(Float.class, "animationFraction") {
            public Float a(final n n) {
                return n.n();
            }
            
            public void b(final n n, final Float n2) {
                n.r(n2);
            }
        };
    }
    
    public n(@j0 final q f) {
        super(3);
        this.g = 1;
        this.f = f;
        this.e = new b();
    }
    
    private float n() {
        return this.i;
    }
    
    private void o() {
        if (this.d == null) {
            (this.d = ObjectAnimator.ofFloat((Object)this, (Property)n.l, new float[] { 0.0f, 1.0f })).setDuration(333L);
            this.d.setInterpolator((TimeInterpolator)null);
            this.d.setRepeatCount(-1);
            this.d.addListener((Animator$AnimatorListener)new AnimatorListenerAdapter() {
                public void onAnimationRepeat(final Animator animator) {
                    super.onAnimationRepeat(animator);
                    final n a = n.this;
                    a.g = (a.g + 1) % n.this.f.c.length;
                    n.this.h = true;
                }
            });
        }
    }
    
    private void p() {
        if (this.h && super.b[3] < 1.0f) {
            final int[] c = super.c;
            c[2] = c[1];
            c[1] = c[0];
            c[0] = s2.a.a(this.f.c[this.g], super.a.getAlpha());
            this.h = false;
        }
    }
    
    private void s(final int n) {
        super.b[0] = 0.0f;
        final float b = this.b(n, 0, 667);
        final float[] b2 = super.b;
        b2[1] = (b2[2] = this.e.getInterpolation(b));
        final float[] b3 = super.b;
        b3[3] = (b3[4] = this.e.getInterpolation(b + 0.49925038f));
        super.b[5] = 1.0f;
    }
    
    public void a() {
        final ObjectAnimator d = this.d;
        if (d != null) {
            d.cancel();
        }
    }
    
    @Override
    public void c() {
        this.q();
    }
    
    @Override
    public void d(@k0 final androidx.vectordrawable.graphics.drawable.b.a a) {
    }
    
    public void f() {
    }
    
    public void g() {
        this.o();
        this.q();
        this.d.start();
    }
    
    @Override
    public void h() {
    }
    
    @b1
    void q() {
        this.h = true;
        this.g = 1;
        Arrays.fill(super.c, s2.a.a(this.f.c[0], super.a.getAlpha()));
    }
    
    @b1
    void r(final float i) {
        this.i = i;
        this.s((int)(i * 333.0f));
        this.p();
        super.a.invalidateSelf();
    }
}
