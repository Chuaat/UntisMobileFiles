// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.progressindicator;

import android.os.Build$VERSION;
import androidx.annotation.k0;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Canvas;
import androidx.vectordrawable.graphics.drawable.b;
import androidx.annotation.j0;
import android.content.Context;
import android.animation.ObjectAnimator;

public final class l<S extends c> extends i
{
    private j<S> X;
    private k<ObjectAnimator> Y;
    
    l(@j0 final Context context, @j0 final c c, @j0 final j<S> j, @j0 final k<ObjectAnimator> k) {
        super(context, c);
        this.C(j);
        this.B(k);
    }
    
    @j0
    public static l<g> x(@j0 final Context context, @j0 final g g) {
        return new l<g>(context, g, new d(g), new e(g));
    }
    
    @j0
    public static l<q> y(@j0 final Context context, @j0 final q q) {
        final m m = new m(q);
        k<ObjectAnimator> k;
        if (q.g == 0) {
            k = new n(q);
        }
        else {
            k = new o(context, q);
        }
        return new l<q>(context, q, (j<c>)m, k);
    }
    
    @j0
    j<S> A() {
        return this.X;
    }
    
    void B(@j0 final k<ObjectAnimator> y) {
        (this.Y = y).e(this);
    }
    
    void C(@j0 final j<S> x) {
        (this.X = x).f(this);
    }
    
    public void draw(@j0 final Canvas canvas) {
        final Rect rect = new Rect();
        if (!this.getBounds().isEmpty() && this.isVisible()) {
            if (canvas.getClipBounds(rect)) {
                canvas.save();
                this.X.g(canvas, this.j());
                this.X.c(canvas, super.S);
                int n = 0;
                while (true) {
                    final k<ObjectAnimator> y = this.Y;
                    final int[] c = y.c;
                    if (n >= c.length) {
                        break;
                    }
                    final j<S> x = this.X;
                    final Paint s = super.S;
                    final float[] b = y.b;
                    final int n2 = n * 2;
                    x.b(canvas, s, b[n2], b[n2 + 1], c[n]);
                    ++n;
                }
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
    
    @Override
    boolean w(final boolean b, final boolean b2, final boolean b3) {
        final boolean w = super.w(b, b2, b3);
        if (!this.isRunning()) {
            this.Y.a();
        }
        final float a = super.I.a(super.G.getContentResolver());
        if (b && (b3 || (Build$VERSION.SDK_INT <= 21 && a > 0.0f))) {
            this.Y.g();
        }
        return w;
    }
    
    @j0
    k<ObjectAnimator> z() {
        return this.Y;
    }
}
