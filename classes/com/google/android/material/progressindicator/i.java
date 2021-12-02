// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.progressindicator;

import android.os.Build$VERSION;
import androidx.annotation.k0;
import android.graphics.ColorFilter;
import androidx.annotation.b1;
import androidx.annotation.t;
import java.util.ArrayList;
import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import java.util.Iterator;
import androidx.annotation.j0;
import android.graphics.Paint;
import java.util.List;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.Property;
import androidx.vectordrawable.graphics.drawable.b;
import android.graphics.drawable.Drawable;

abstract class i extends Drawable implements b
{
    private static final boolean U = false;
    private static final int V = 500;
    private static final Property<i, Float> W;
    final Context G;
    final c H;
    com.google.android.material.progressindicator.a I;
    private ValueAnimator J;
    private ValueAnimator K;
    private boolean L;
    private boolean M;
    private float N;
    private List<a> O;
    private a P;
    private boolean Q;
    private float R;
    final Paint S;
    private int T;
    
    static {
        W = new Property<i, Float>(Float.class, "growFraction") {
            public Float a(final i i) {
                return i.j();
            }
            
            public void b(final i i, final Float n) {
                i.p(n);
            }
        };
    }
    
    i(@j0 final Context g, @j0 final c h) {
        this.S = new Paint();
        this.G = g;
        this.H = h;
        this.I = new com.google.android.material.progressindicator.a();
        this.setAlpha(255);
    }
    
    static /* synthetic */ boolean e(final i i, final boolean b, final boolean b2) {
        return i.setVisible(b, b2);
    }
    
    private void g() {
        final a p = this.P;
        if (p != null) {
            p.b(this);
        }
        final List<a> o = this.O;
        if (o != null && !this.Q) {
            final Iterator<a> iterator = o.iterator();
            while (iterator.hasNext()) {
                iterator.next().b(this);
            }
        }
    }
    
    private void h() {
        final a p = this.P;
        if (p != null) {
            p.c(this);
        }
        final List<a> o = this.O;
        if (o != null && !this.Q) {
            final Iterator<a> iterator = o.iterator();
            while (iterator.hasNext()) {
                iterator.next().c(this);
            }
        }
    }
    
    private void i(@j0 final ValueAnimator... array) {
        final boolean q = this.Q;
        this.Q = true;
        for (int length = array.length, i = 0; i < length; ++i) {
            array[i].end();
        }
        this.Q = q;
    }
    
    private void o() {
        if (this.J == null) {
            (this.J = (ValueAnimator)ObjectAnimator.ofFloat((Object)this, (Property)i.W, new float[] { 0.0f, 1.0f })).setDuration(500L);
            this.J.setInterpolator(com.google.android.material.animation.a.b);
            this.u(this.J);
        }
        if (this.K == null) {
            (this.K = (ValueAnimator)ObjectAnimator.ofFloat((Object)this, (Property)i.W, new float[] { 1.0f, 0.0f })).setDuration(500L);
            this.K.setInterpolator(com.google.android.material.animation.a.b);
            this.q(this.K);
        }
    }
    
    private void q(@j0 final ValueAnimator k) {
        final ValueAnimator i = this.K;
        if (i != null && i.isRunning()) {
            throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
        }
        (this.K = k).addListener((Animator$AnimatorListener)new AnimatorListenerAdapter() {
            public void onAnimationEnd(final Animator animator) {
                super.onAnimationEnd(animator);
                i.e(i.this, false, false);
                i.this.g();
            }
        });
    }
    
    private void u(@j0 final ValueAnimator j) {
        final ValueAnimator i = this.J;
        if (i != null && i.isRunning()) {
            throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
        }
        (this.J = j).addListener((Animator$AnimatorListener)new AnimatorListenerAdapter() {
            public void onAnimationStart(final Animator animator) {
                super.onAnimationStart(animator);
                i.this.h();
            }
        });
    }
    
    public void b(@j0 final a a) {
        if (this.O == null) {
            this.O = new ArrayList<a>();
        }
        if (!this.O.contains(a)) {
            this.O.add(a);
        }
    }
    
    public void c() {
        this.O.clear();
        this.O = null;
    }
    
    public boolean d(@j0 final a a) {
        final List<a> o = this.O;
        if (o != null && o.contains(a)) {
            this.O.remove(a);
            if (this.O.isEmpty()) {
                this.O = null;
            }
            return true;
        }
        return false;
    }
    
    public int getAlpha() {
        return this.T;
    }
    
    public int getOpacity() {
        return -3;
    }
    
    public boolean isRunning() {
        return this.n() || this.m();
    }
    
    float j() {
        if (!this.H.b() && !this.H.a()) {
            return 1.0f;
        }
        if (!this.M && !this.L) {
            return this.R;
        }
        return this.N;
    }
    
    @j0
    ValueAnimator k() {
        return this.K;
    }
    
    public boolean l() {
        return this.v(false, false, false);
    }
    
    public boolean m() {
        final ValueAnimator k = this.K;
        return (k != null && k.isRunning()) || this.M;
    }
    
    public boolean n() {
        final ValueAnimator j = this.J;
        return (j != null && j.isRunning()) || this.L;
    }
    
    void p(@t(from = 0.0, to = 1.0) final float r) {
        if (this.R != r) {
            this.R = r;
            this.invalidateSelf();
        }
    }
    
    void r(@j0 final a p) {
        this.P = p;
    }
    
    @b1
    void s(final boolean m, @t(from = 0.0, to = 1.0) final float n) {
        this.M = m;
        this.N = n;
    }
    
    public void setAlpha(final int t) {
        this.T = t;
        this.invalidateSelf();
    }
    
    public void setColorFilter(@k0 final ColorFilter colorFilter) {
        this.S.setColorFilter(colorFilter);
        this.invalidateSelf();
    }
    
    public boolean setVisible(final boolean b, final boolean b2) {
        return this.v(b, b2, true);
    }
    
    public void start() {
        this.w(true, true, false);
    }
    
    public void stop() {
        this.w(false, true, false);
    }
    
    @b1
    void t(final boolean l, @t(from = 0.0, to = 1.0) final float n) {
        this.L = l;
        this.N = n;
    }
    
    public boolean v(final boolean b, final boolean b2, final boolean b3) {
        final float a = this.I.a(this.G.getContentResolver());
        return this.w(b, b2, b3 && a > 0.0f);
    }
    
    boolean w(final boolean b, final boolean b2, final boolean b3) {
        this.o();
        if (!this.isVisible() && !b) {
            return false;
        }
        ValueAnimator valueAnimator;
        if (b) {
            valueAnimator = this.J;
        }
        else {
            valueAnimator = this.K;
        }
        if (!b3) {
            if (valueAnimator.isRunning()) {
                valueAnimator.end();
            }
            else {
                this.i(valueAnimator);
            }
            return super.setVisible(b, false);
        }
        if (b3 && valueAnimator.isRunning()) {
            return false;
        }
        final boolean b4 = !b || super.setVisible(b, false);
        boolean b5;
        if (b) {
            b5 = this.H.b();
        }
        else {
            b5 = this.H.a();
        }
        if (!b5) {
            this.i(valueAnimator);
            return b4;
        }
        if (!b2 && Build$VERSION.SDK_INT >= 19 && valueAnimator.isPaused()) {
            valueAnimator.resume();
        }
        else {
            valueAnimator.start();
        }
        return b4;
    }
}
