// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.progressindicator;

import androidx.annotation.k0;
import android.graphics.ColorFilter;
import s2.a;
import android.graphics.Rect;
import android.graphics.Canvas;
import androidx.vectordrawable.graphics.drawable.b;
import androidx.annotation.j0;
import android.content.Context;
import androidx.dynamicanimation.animation.g;
import androidx.dynamicanimation.animation.d;

public final class h<S extends c> extends i
{
    private static final int c0 = 10000;
    private static final float d0 = 50.0f;
    private static final d<h> e0;
    private j<S> X;
    private final androidx.dynamicanimation.animation.h Y;
    private final g Z;
    private float a0;
    private boolean b0;
    
    static {
        e0 = new d<h>("indicatorLevel") {
            public float d(final h h) {
                return h.C() * 10000.0f;
            }
            
            public void e(final h h, final float n) {
                h.E(n / 10000.0f);
            }
        };
    }
    
    h(@j0 final Context context, @j0 final c c, @j0 final j<S> j) {
        super(context, c);
        this.b0 = false;
        this.D(j);
        final androidx.dynamicanimation.animation.h y = new androidx.dynamicanimation.animation.h();
        (this.Y = y).g(1.0f);
        y.i(50.0f);
        (this.Z = new g((K)this, (d<K>)h.e0)).D(y);
        this.p(1.0f);
    }
    
    @j0
    public static h<q> A(@j0 final Context context, @j0 final q q) {
        return new h<q>(context, q, new m(q));
    }
    
    private float C() {
        return this.a0;
    }
    
    private void E(final float a0) {
        this.a0 = a0;
        this.invalidateSelf();
    }
    
    @j0
    public static h<com.google.android.material.progressindicator.g> z(@j0 final Context context, @j0 final com.google.android.material.progressindicator.g g) {
        return new h<com.google.android.material.progressindicator.g>(context, g, new com.google.android.material.progressindicator.d(g));
    }
    
    @j0
    j<S> B() {
        return this.X;
    }
    
    void D(@j0 final j<S> x) {
        (this.X = x).f(this);
    }
    
    void F(final float n) {
        this.setLevel((int)(n * 10000.0f));
    }
    
    public void draw(@j0 final Canvas canvas) {
        final Rect rect = new Rect();
        if (!this.getBounds().isEmpty() && this.isVisible()) {
            if (canvas.getClipBounds(rect)) {
                canvas.save();
                this.X.g(canvas, this.j());
                this.X.c(canvas, super.S);
                this.X.b(canvas, super.S, 0.0f, this.C(), s2.a.a(super.H.c[0], this.getAlpha()));
                canvas.restore();
            }
        }
    }
    
    public int getIntrinsicHeight() {
        return this.X.d();
    }
    
    public int getIntrinsicWidth() {
        return this.X.e();
    }
    
    public void jumpToCurrentState() {
        this.Z.d();
        this.E(this.getLevel() / 10000.0f);
    }
    
    protected boolean onLevelChange(final int n) {
        if (this.b0) {
            this.Z.d();
            this.E(n / 10000.0f);
        }
        else {
            this.Z.t(this.C() * 10000.0f);
            this.Z.z((float)n);
        }
        return true;
    }
    
    @Override
    boolean w(final boolean b, final boolean b2, final boolean b3) {
        final boolean w = super.w(b, b2, b3);
        final float a = super.I.a(super.G.getContentResolver());
        if (a == 0.0f) {
            this.b0 = true;
        }
        else {
            this.b0 = false;
            this.Y.i(50.0f / a);
        }
        return w;
    }
}
