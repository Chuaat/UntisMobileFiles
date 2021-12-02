// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import androidx.annotation.q;
import java.util.Iterator;
import androidx.annotation.t;
import android.util.Pair;
import android.graphics.Canvas;
import android.content.res.Resources;
import android.content.res.TypedArray;
import androidx.core.view.j0;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import o2.a;
import androidx.annotation.k0;
import android.util.AttributeSet;
import android.content.Context;
import androidx.annotation.n0;
import android.graphics.RectF;
import android.graphics.Paint;
import java.util.List;
import android.animation.ValueAnimator;
import android.view.View;

class ClockHandView extends View
{
    private static final int a0 = 200;
    private ValueAnimator G;
    private boolean H;
    private float I;
    private float J;
    private boolean K;
    private int L;
    private final List<d> M;
    private final int N;
    private final float O;
    private final Paint P;
    private final RectF Q;
    @n0
    private final int R;
    private float S;
    private boolean T;
    private c U;
    private double V;
    private int W;
    
    public ClockHandView(final Context context) {
        this(context, null);
    }
    
    public ClockHandView(final Context context, @k0 final AttributeSet set) {
        this(context, set, a.c.N9);
    }
    
    public ClockHandView(final Context context, @k0 final AttributeSet set, int color) {
        super(context, set, color);
        this.M = new ArrayList<d>();
        final Paint p3 = new Paint();
        this.P = p3;
        this.Q = new RectF();
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, a.o.p6, color, a.n.Ic);
        this.W = obtainStyledAttributes.getDimensionPixelSize(a.o.r6, 0);
        this.N = obtainStyledAttributes.getDimensionPixelSize(a.o.s6, 0);
        final Resources resources = this.getResources();
        this.R = resources.getDimensionPixelSize(a.f.d2);
        this.O = (float)resources.getDimensionPixelSize(a.f.b2);
        color = obtainStyledAttributes.getColor(a.o.q6, 0);
        p3.setAntiAlias(true);
        p3.setColor(color);
        this.l(0.0f);
        this.L = ViewConfiguration.get(context).getScaledTouchSlop();
        j0.P1(this, 2);
        obtainStyledAttributes.recycle();
    }
    
    private void c(final Canvas canvas) {
        final int n = this.getHeight() / 2;
        final int n2 = this.getWidth() / 2;
        final float n3 = (float)n2;
        final float n4 = (float)this.W;
        final float n5 = (float)Math.cos(this.V);
        final float n6 = (float)n;
        final float n7 = (float)this.W;
        final float n8 = (float)Math.sin(this.V);
        this.P.setStrokeWidth(0.0f);
        canvas.drawCircle(n4 * n5 + n3, n7 * n8 + n6, (float)this.N, this.P);
        final double sin = Math.sin(this.V);
        final double cos = Math.cos(this.V);
        final double n9 = (float)(this.W - this.N);
        final float n10 = (float)(n2 + (int)(cos * n9));
        final float n11 = (float)(n + (int)(n9 * sin));
        this.P.setStrokeWidth((float)this.R);
        canvas.drawLine(n3, n6, n10, n11, this.P);
        canvas.drawCircle(n3, n6, this.O, this.P);
    }
    
    private int e(final float n, final float n2) {
        int n4;
        final int n3 = n4 = (int)Math.toDegrees(Math.atan2(n2 - this.getHeight() / 2, n - this.getWidth() / 2)) + 90;
        if (n3 < 0) {
            n4 = n3 + 360;
        }
        return n4;
    }
    
    private Pair<Float, Float> h(final float n) {
        float f;
        final float n2 = f = this.f();
        float f2 = n;
        if (Math.abs(n2 - n) > 180.0f) {
            float n3 = n;
            if (n2 > 180.0f) {
                n3 = n;
                if (n < 180.0f) {
                    n3 = n + 360.0f;
                }
            }
            f = n2;
            f2 = n3;
            if (n2 < 180.0f) {
                f = n2;
                f2 = n3;
                if (n3 > 180.0f) {
                    f = n2 + 360.0f;
                    f2 = n3;
                }
            }
        }
        return (Pair<Float, Float>)new Pair((Object)f, (Object)f2);
    }
    
    private boolean i(float f, float n, final boolean b, final boolean b2, final boolean b3) {
        final int e = this.e(f, n);
        f = this.f();
        n = (float)e;
        final boolean b4 = false;
        final boolean b5 = f != n;
        if (b2 && b5) {
            return true;
        }
        if (!b5 && !b) {
            return false;
        }
        boolean b6 = b4;
        if (b3) {
            b6 = b4;
            if (this.H) {
                b6 = true;
            }
        }
        this.m(n, b6);
        return true;
    }
    
    private void n(@t(from = 0.0, to = 360.0) float n, final boolean b) {
        final float s = n % 360.0f;
        this.S = s;
        this.V = Math.toRadians(s - 90.0f);
        final int n2 = this.getHeight() / 2;
        final float n3 = this.getWidth() / 2 + this.W * (float)Math.cos(this.V);
        n = n2 + this.W * (float)Math.sin(this.V);
        final RectF q = this.Q;
        final int n4 = this.N;
        q.set(n3 - n4, n - n4, n3 + n4, n + n4);
        final Iterator<d> iterator = this.M.iterator();
        while (iterator.hasNext()) {
            iterator.next().d(s, b);
        }
        this.invalidate();
    }
    
    public void b(final d d) {
        this.M.add(d);
    }
    
    public RectF d() {
        return this.Q;
    }
    
    @t(from = 0.0, to = 360.0)
    public float f() {
        return this.S;
    }
    
    public int g() {
        return this.N;
    }
    
    public void j(final boolean h) {
        this.H = h;
    }
    
    public void k(@q final int w) {
        this.W = w;
        this.invalidate();
    }
    
    public void l(@t(from = 0.0, to = 360.0) final float n) {
        this.m(n, false);
    }
    
    public void m(@t(from = 0.0, to = 360.0) final float n, final boolean b) {
        final ValueAnimator g = this.G;
        if (g != null) {
            g.cancel();
        }
        if (!b) {
            this.n(n, false);
            return;
        }
        final Pair<Float, Float> h = this.h(n);
        (this.G = ValueAnimator.ofFloat(new float[] { (float)h.first, (float)h.second })).setDuration(200L);
        this.G.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new ValueAnimator$AnimatorUpdateListener() {
            public void onAnimationUpdate(final ValueAnimator valueAnimator) {
                ClockHandView.this.n((float)valueAnimator.getAnimatedValue(), true);
            }
        });
        this.G.addListener((Animator$AnimatorListener)new AnimatorListenerAdapter() {
            public void onAnimationCancel(final Animator animator) {
                animator.end();
            }
        });
        this.G.start();
    }
    
    public void o(final c u) {
        this.U = u;
    }
    
    protected void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        this.c(canvas);
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        this.l(this.f());
    }
    
    @SuppressLint({ "ClickableViewAccessibility" })
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        final int actionMasked = motionEvent.getActionMasked();
        final float x = motionEvent.getX();
        final float y = motionEvent.getY();
        boolean b;
        boolean t;
        boolean b2;
        if (actionMasked != 0) {
            if (actionMasked != 1 && actionMasked != 2) {
                b = false;
                t = false;
            }
            else {
                final int n = (int)(x - this.I);
                final int n2 = (int)(y - this.J);
                this.K = (n * n + n2 * n2 > this.L);
                t = this.T;
                b = (actionMasked == 1);
            }
            b2 = false;
        }
        else {
            this.I = x;
            this.J = y;
            this.K = true;
            this.T = false;
            b = false;
            t = false;
            b2 = true;
        }
        final boolean t2 = this.i(x, y, t, b2, b) | this.T;
        this.T = t2;
        if (t2 && b) {
            final c u = this.U;
            if (u != null) {
                u.e((float)this.e(x, y), this.K);
            }
        }
        return true;
    }
    
    public interface c
    {
        void e(@t(from = 0.0, to = 360.0) final float p0, final boolean p1);
    }
    
    public interface d
    {
        void d(@t(from = 0.0, to = 360.0) final float p0, final boolean p1);
    }
}
