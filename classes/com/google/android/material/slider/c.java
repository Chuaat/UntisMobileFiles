// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.slider;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.view.View$BaseSavedState;
import androidx.core.view.accessibility.d;
import android.os.Bundle;
import androidx.annotation.n;
import com.google.android.material.shape.o;
import androidx.annotation.p;
import android.os.Parcelable;
import android.view.View$MeasureSpec;
import androidx.annotation.q;
import android.widget.SeekBar;
import androidx.annotation.b1;
import android.util.Log;
import java.math.MathContext;
import java.math.BigDecimal;
import com.google.android.material.internal.a0;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import java.util.Collection;
import java.util.Collections;
import android.graphics.drawable.RippleDrawable;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.graphics.Region$Op;
import android.os.Build$VERSION;
import android.graphics.Canvas;
import android.content.res.Resources;
import android.view.ViewParent;
import android.view.ViewGroup;
import androidx.annotation.l;
import android.animation.Animator$AnimatorListener;
import java.util.Iterator;
import android.graphics.drawable.Drawable;
import com.google.android.material.internal.b0;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewConfiguration;
import android.content.res.TypedArray;
import com.google.android.material.internal.t;
import android.graphics.Xfermode;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Paint$Cap;
import android.graphics.Paint$Style;
import androidx.annotation.k0;
import android.util.AttributeSet;
import android.content.Context;
import java.util.ArrayList;
import android.view.MotionEvent;
import android.animation.ValueAnimator;
import java.util.List;
import android.view.accessibility.AccessibilityManager;
import android.graphics.Paint;
import com.google.android.material.shape.j;
import androidx.annotation.j0;
import android.content.res.ColorStateList;
import android.view.View;

abstract class c<S extends c<S, L, T>, L extends a<S>, T extends b<S>> extends View
{
    private static final String I0;
    private static final String J0 = "Slider value(%s) must be greater or equal to valueFrom(%s), and lower or equal to valueTo(%s)";
    private static final String K0 = "Value(%s) must be equal to valueFrom(%s) plus a multiple of stepSize(%s) when using stepSize(%s)";
    private static final String L0 = "valueFrom(%s) must be smaller than valueTo(%s)";
    private static final String M0 = "valueTo(%s) must be greater than valueFrom(%s)";
    private static final String N0 = "The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range";
    private static final String O0 = "Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the  value correctly.";
    private static final int P0 = 200;
    private static final int Q0 = 63;
    private static final double R0 = 1.0E-4;
    static final int S0;
    static final int T0 = 1;
    static final int U0 = 0;
    private static final long V0 = 83L;
    private static final long W0 = 117L;
    @j0
    private ColorStateList A0;
    @j0
    private ColorStateList B0;
    @j0
    private ColorStateList C0;
    @j0
    private ColorStateList D0;
    @j0
    private ColorStateList E0;
    @j0
    private final j F0;
    @j0
    private final Paint G;
    private float G0;
    @j0
    private final Paint H;
    private int H0;
    @j0
    private final Paint I;
    @j0
    private final Paint J;
    @j0
    private final Paint K;
    @j0
    private final Paint L;
    @j0
    private final e M;
    private final AccessibilityManager N;
    private d O;
    @j0
    private final g P;
    @j0
    private final List<com.google.android.material.tooltip.a> Q;
    @j0
    private final List<L> R;
    @j0
    private final List<T> S;
    private boolean T;
    private ValueAnimator U;
    private ValueAnimator V;
    private final int W;
    private int a0;
    private int b0;
    private int c0;
    private int d0;
    private int e0;
    private int f0;
    private int g0;
    private int h0;
    private int i0;
    private int j0;
    private float k0;
    private MotionEvent l0;
    private com.google.android.material.slider.e m0;
    private boolean n0;
    private float o0;
    private float p0;
    private ArrayList<Float> q0;
    private int r0;
    private int s0;
    private float t0;
    private float[] u0;
    private boolean v0;
    private int w0;
    private boolean x0;
    private boolean y0;
    private boolean z0;
    
    static {
        I0 = c.class.getSimpleName();
        S0 = o2.a.n.mc;
    }
    
    public c(@j0 final Context context) {
        this(context, null);
    }
    
    public c(@j0 final Context context, @k0 final AttributeSet set) {
        this(context, set, o2.a.c.Jc);
    }
    
    public c(@j0 final Context context, @k0 final AttributeSet set, final int n) {
        super(com.google.android.material.theme.overlay.a.c(context, set, n, c.S0), set, n);
        this.Q = new ArrayList<com.google.android.material.tooltip.a>();
        this.R = new ArrayList<L>();
        this.S = new ArrayList<T>();
        this.T = false;
        this.n0 = false;
        this.q0 = new ArrayList<Float>();
        this.r0 = -1;
        this.s0 = -1;
        this.t0 = 0.0f;
        this.v0 = true;
        this.y0 = false;
        final j f0 = new j();
        this.F0 = f0;
        this.H0 = 0;
        final Context context2 = this.getContext();
        final Paint g = new Paint();
        (this.G = g).setStyle(Paint$Style.STROKE);
        g.setStrokeCap(Paint$Cap.ROUND);
        final Paint h = new Paint();
        (this.H = h).setStyle(Paint$Style.STROKE);
        h.setStrokeCap(Paint$Cap.ROUND);
        final Paint i = new Paint(1);
        (this.I = i).setStyle(Paint$Style.FILL);
        i.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff$Mode.CLEAR));
        (this.J = new Paint(1)).setStyle(Paint$Style.FILL);
        final Paint k = new Paint();
        (this.K = k).setStyle(Paint$Style.STROKE);
        k.setStrokeCap(Paint$Cap.ROUND);
        final Paint l = new Paint();
        (this.L = l).setStyle(Paint$Style.STROKE);
        l.setStrokeCap(Paint$Cap.ROUND);
        this.M(context2.getResources());
        this.P = (g)new g() {
            @Override
            public com.google.android.material.tooltip.a a() {
                final TypedArray j = t.j(com.google.android.material.slider.c.this.getContext(), set, o2.a.o.hq, n, com.google.android.material.slider.c.S0, new int[0]);
                final com.google.android.material.tooltip.a a = X(com.google.android.material.slider.c.this.getContext(), j);
                j.recycle();
                return a;
            }
        };
        this.a0(context2, set, n);
        this.setFocusable(true);
        this.setClickable(true);
        f0.w0(2);
        this.W = ViewConfiguration.get(context2).getScaledTouchSlop();
        androidx.core.view.j0.z1(this, this.M = new e(this));
        this.N = (AccessibilityManager)this.getContext().getSystemService("accessibility");
    }
    
    private void A() {
        if (this.T) {
            this.T = false;
            final ValueAnimator q = this.q(false);
            this.V = q;
            this.U = null;
            q.addListener((Animator$AnimatorListener)new AnimatorListenerAdapter() {
                public void onAnimationEnd(final Animator animator) {
                    super.onAnimationEnd(animator);
                    final Iterator<com.google.android.material.tooltip.a> iterator = c.this.Q.iterator();
                    while (iterator.hasNext()) {
                        com.google.android.material.internal.b0.g(c.this).b(iterator.next());
                    }
                }
            });
            this.V.start();
        }
    }
    
    private void B(final int n) {
        if (n != 1) {
            if (n != 2) {
                if (n != 17) {
                    if (n == 66) {
                        this.S(Integer.MIN_VALUE);
                    }
                }
                else {
                    this.S(Integer.MAX_VALUE);
                }
            }
            else {
                this.R(Integer.MIN_VALUE);
            }
        }
        else {
            this.R(Integer.MAX_VALUE);
        }
    }
    
    private String D(final float f) {
        if (this.H()) {
            return this.m0.a(f);
        }
        String format;
        if ((int)f == f) {
            format = "%.0f";
        }
        else {
            format = "%.2f";
        }
        return String.format(format, f);
    }
    
    private static float E(final ValueAnimator valueAnimator, final float n) {
        float floatValue = n;
        if (valueAnimator != null) {
            floatValue = n;
            if (valueAnimator.isRunning()) {
                floatValue = (float)valueAnimator.getAnimatedValue();
                valueAnimator.cancel();
            }
        }
        return floatValue;
    }
    
    private float F(int index, final float n) {
        final float t0 = this.t0;
        float minSeparation = 0.0f;
        if (t0 == 0.0f) {
            minSeparation = this.getMinSeparation();
        }
        float t2 = minSeparation;
        if (this.H0 == 0) {
            t2 = this.t(minSeparation);
        }
        float n2 = t2;
        if (this.K()) {
            n2 = -t2;
        }
        final int index2 = index + 1;
        float p2;
        if (index2 >= this.q0.size()) {
            p2 = this.p0;
        }
        else {
            p2 = this.q0.get(index2) - n2;
        }
        float o0;
        if (--index < 0) {
            o0 = this.o0;
        }
        else {
            o0 = this.q0.get(index) + n2;
        }
        return q.a.b(n, o0, p2);
    }
    
    @l
    private int G(@j0 final ColorStateList list) {
        return list.getColorForState(this.getDrawableState(), list.getDefaultColor());
    }
    
    private void I() {
        this.G.setStrokeWidth((float)this.e0);
        this.H.setStrokeWidth((float)this.e0);
        this.K.setStrokeWidth(this.e0 / 2.0f);
        this.L.setStrokeWidth(this.e0 / 2.0f);
    }
    
    private boolean J() {
        ViewParent viewParent = this.getParent();
        while (true) {
            final boolean b = viewParent instanceof ViewGroup;
            boolean b2 = false;
            if (!b) {
                return false;
            }
            final ViewGroup viewGroup = (ViewGroup)viewParent;
            if (viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) {
                b2 = true;
            }
            if (b2 && viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            viewParent = viewParent.getParent();
        }
    }
    
    private void M(@j0 final Resources resources) {
        this.c0 = resources.getDimensionPixelSize(o2.a.f.W5);
        final int dimensionPixelOffset = resources.getDimensionPixelOffset(o2.a.f.U5);
        this.a0 = dimensionPixelOffset;
        this.f0 = dimensionPixelOffset;
        this.b0 = resources.getDimensionPixelSize(o2.a.f.S5);
        this.g0 = resources.getDimensionPixelOffset(o2.a.f.V5);
        this.j0 = resources.getDimensionPixelSize(o2.a.f.O5);
    }
    
    private void N() {
        if (this.t0 <= 0.0f) {
            return;
        }
        this.n0();
        final int min = Math.min((int)((this.p0 - this.o0) / this.t0 + 1.0f), this.w0 / (this.e0 * 2) + 1);
        final float[] u0 = this.u0;
        if (u0 == null || u0.length != min * 2) {
            this.u0 = new float[min * 2];
        }
        final float n = this.w0 / (float)(min - 1);
        for (int i = 0; i < min * 2; i += 2) {
            final float[] u2 = this.u0;
            u2[i] = this.f0 + i / 2 * n;
            u2[i + 1] = (float)this.n();
        }
    }
    
    private void O(@j0 final Canvas canvas, int n, final int n2) {
        if (this.f0()) {
            n = (int)(this.f0 + this.T(this.q0.get(this.s0)) * n);
            if (Build$VERSION.SDK_INT < 28) {
                final int i0 = this.i0;
                canvas.clipRect((float)(n - i0), (float)(n2 - i0), (float)(n + i0), (float)(i0 + n2), Region$Op.UNION);
            }
            canvas.drawCircle((float)n, (float)n2, (float)this.i0, this.J);
        }
    }
    
    private void P(@j0 final Canvas canvas) {
        if (this.v0) {
            if (this.t0 > 0.0f) {
                final float[] activeRange = this.getActiveRange();
                final int z = Z(this.u0, activeRange[0]);
                final int z2 = Z(this.u0, activeRange[1]);
                final float[] u0 = this.u0;
                final int n = z * 2;
                canvas.drawPoints(u0, 0, n, this.K);
                final float[] u2 = this.u0;
                final int n2 = z2 * 2;
                canvas.drawPoints(u2, n, n2 - n, this.L);
                final float[] u3 = this.u0;
                canvas.drawPoints(u3, n2, u3.length - n2, this.K);
            }
        }
    }
    
    private void Q() {
        this.f0 = this.a0 + Math.max(this.h0 - this.b0, 0);
        if (androidx.core.view.j0.T0(this)) {
            this.m0(this.getWidth());
        }
    }
    
    private boolean R(int n) {
        final int s0 = this.s0;
        n = (int)q.a.d(s0 + (long)n, 0L, this.q0.size() - 1);
        this.s0 = n;
        if (n == s0) {
            return false;
        }
        if (this.r0 != -1) {
            this.r0 = n;
        }
        this.l0();
        this.postInvalidate();
        return true;
    }
    
    private boolean S(final int n) {
        int n2 = n;
        if (this.K()) {
            if (n == Integer.MIN_VALUE) {
                n2 = Integer.MAX_VALUE;
            }
            else {
                n2 = -n;
            }
        }
        return this.R(n2);
    }
    
    private float T(float n) {
        final float o0 = this.o0;
        n = (n - o0) / (this.p0 - o0);
        if (this.K()) {
            return 1.0f - n;
        }
        return n;
    }
    
    private Boolean U(final int n, @j0 final KeyEvent keyEvent) {
        if (n != 61) {
            Label_0098: {
                if (n != 66) {
                    if (n != 81) {
                        if (n == 69) {
                            this.R(-1);
                            return Boolean.TRUE;
                        }
                        if (n != 70) {
                            switch (n) {
                                default: {
                                    return null;
                                }
                                case 22: {
                                    this.S(1);
                                    return Boolean.TRUE;
                                }
                                case 21: {
                                    this.S(-1);
                                    return Boolean.TRUE;
                                }
                                case 23: {
                                    break Label_0098;
                                }
                            }
                        }
                    }
                    this.R(1);
                    return Boolean.TRUE;
                }
            }
            this.r0 = this.s0;
            this.postInvalidate();
            return Boolean.TRUE;
        }
        if (keyEvent.hasNoModifiers()) {
            return this.R(1);
        }
        if (keyEvent.isShiftPressed()) {
            return this.R(-1);
        }
        return Boolean.FALSE;
    }
    
    private void V() {
        final Iterator<T> iterator = this.S.iterator();
        while (iterator.hasNext()) {
            iterator.next().a((S)this);
        }
    }
    
    private void W() {
        final Iterator<T> iterator = this.S.iterator();
        while (iterator.hasNext()) {
            iterator.next().b((S)this);
        }
    }
    
    @j0
    private static com.google.android.material.tooltip.a X(@j0 final Context context, @j0 final TypedArray typedArray) {
        return com.google.android.material.tooltip.a.U0(context, null, 0, typedArray.getResourceId(o2.a.o.qq, o2.a.n.Rc));
    }
    
    private static int Z(final float[] array, final float n) {
        return Math.round(n * (array.length / 2 - 1));
    }
    
    private void a0(final Context context, final AttributeSet set, int n) {
        final TypedArray j = t.j(context, set, o2.a.o.hq, n, c.S0, new int[0]);
        this.o0 = j.getFloat(o2.a.o.lq, 0.0f);
        this.p0 = j.getFloat(o2.a.o.mq, 1.0f);
        this.setValues(this.o0);
        this.t0 = j.getFloat(o2.a.o.kq, 0.0f);
        n = o2.a.o.Aq;
        final boolean hasValue = j.hasValue(n);
        int cq;
        if (hasValue) {
            cq = n;
        }
        else {
            cq = o2.a.o.Cq;
        }
        if (!hasValue) {
            n = o2.a.o.Bq;
        }
        ColorStateList trackInactiveTintList = com.google.android.material.resources.c.a(context, j, cq);
        if (trackInactiveTintList == null) {
            trackInactiveTintList = androidx.appcompat.content.res.a.c(context, o2.a.e.r1);
        }
        this.setTrackInactiveTintList(trackInactiveTintList);
        ColorStateList trackActiveTintList = com.google.android.material.resources.c.a(context, j, n);
        if (trackActiveTintList == null) {
            trackActiveTintList = androidx.appcompat.content.res.a.c(context, o2.a.e.o1);
        }
        this.setTrackActiveTintList(trackActiveTintList);
        this.F0.n0(com.google.android.material.resources.c.a(context, j, o2.a.o.rq));
        n = o2.a.o.uq;
        if (j.hasValue(n)) {
            this.setThumbStrokeColor(com.google.android.material.resources.c.a(context, j, n));
        }
        this.setThumbStrokeWidth(j.getDimension(o2.a.o.vq, 0.0f));
        ColorStateList haloTintList = com.google.android.material.resources.c.a(context, j, o2.a.o.nq);
        if (haloTintList == null) {
            haloTintList = androidx.appcompat.content.res.a.c(context, o2.a.e.p1);
        }
        this.setHaloTintList(haloTintList);
        this.v0 = j.getBoolean(o2.a.o.zq, true);
        n = o2.a.o.wq;
        final boolean hasValue2 = j.hasValue(n);
        int yq;
        if (hasValue2) {
            yq = n;
        }
        else {
            yq = o2.a.o.yq;
        }
        if (!hasValue2) {
            n = o2.a.o.xq;
        }
        ColorStateList tickInactiveTintList = com.google.android.material.resources.c.a(context, j, yq);
        if (tickInactiveTintList == null) {
            tickInactiveTintList = androidx.appcompat.content.res.a.c(context, o2.a.e.q1);
        }
        this.setTickInactiveTintList(tickInactiveTintList);
        final ColorStateList a = com.google.android.material.resources.c.a(context, j, n);
        ColorStateList c;
        if (a != null) {
            c = a;
        }
        else {
            c = androidx.appcompat.content.res.a.c(context, o2.a.e.n1);
        }
        this.setTickActiveTintList(c);
        this.setThumbRadius(j.getDimensionPixelSize(o2.a.o.tq, 0));
        this.setHaloRadius(j.getDimensionPixelSize(o2.a.o.oq, 0));
        this.setThumbElevation(j.getDimension(o2.a.o.sq, 0.0f));
        this.setTrackHeight(j.getDimensionPixelSize(o2.a.o.Dq, 0));
        this.d0 = j.getInt(o2.a.o.pq, 0);
        if (!j.getBoolean(o2.a.o.iq, true)) {
            this.setEnabled(false);
        }
        j.recycle();
    }
    
    private void d0(final int n) {
        final d o = this.O;
        if (o == null) {
            this.O = new d();
        }
        else {
            this.removeCallbacks((Runnable)o);
        }
        this.O.a(n);
        this.postDelayed((Runnable)this.O, 200L);
    }
    
    private void e0(final com.google.android.material.tooltip.a a, final float n) {
        a.l1(this.D(n));
        final int n2 = this.f0 + (int)(this.T(n) * this.w0) - a.getIntrinsicWidth() / 2;
        final int n3 = this.n() - (this.j0 + this.h0);
        a.setBounds(n2, n3 - a.getIntrinsicHeight(), a.getIntrinsicWidth() + n2, n3);
        final Rect bounds = new Rect(a.getBounds());
        com.google.android.material.internal.c.c(com.google.android.material.internal.b0.f(this), this, bounds);
        a.setBounds(bounds);
        com.google.android.material.internal.b0.g(this).a(a);
    }
    
    private boolean f0() {
        return this.x0 || Build$VERSION.SDK_INT < 21 || !(this.getBackground() instanceof RippleDrawable);
    }
    
    private boolean g0(final float n) {
        return this.i0(this.r0, n);
    }
    
    private float[] getActiveRange() {
        final float floatValue = Collections.max((Collection<? extends Float>)this.getValues());
        float n = Collections.min((Collection<? extends Float>)this.getValues());
        if (this.q0.size() == 1) {
            n = this.o0;
        }
        final float t = this.T(n);
        final float t2 = this.T(floatValue);
        float[] array;
        if (this.K()) {
            array = new float[] { t2, t };
        }
        else {
            array = new float[] { t, t2 };
        }
        return array;
    }
    
    private float getValueOfTouchPosition() {
        double h0 = this.h0(this.G0);
        if (this.K()) {
            h0 = 1.0 - h0;
        }
        final float p0 = this.p0;
        final float o0 = this.o0;
        return (float)(h0 * (p0 - o0) + o0);
    }
    
    private float getValueOfTouchPositionAbsolute() {
        float g0 = this.G0;
        if (this.K()) {
            g0 = 1.0f - g0;
        }
        final float p0 = this.p0;
        final float o0 = this.o0;
        return g0 * (p0 - o0) + o0;
    }
    
    private double h0(final float n) {
        final float t0 = this.t0;
        if (t0 > 0.0f) {
            final int n2 = (int)((this.p0 - this.o0) / t0);
            return Math.round(n * n2) / (double)n2;
        }
        return n;
    }
    
    private boolean i0(final int s0, float f) {
        if (Math.abs(f - this.q0.get(s0)) < 1.0E-4) {
            return false;
        }
        f = this.F(s0, f);
        this.q0.set(s0, f);
        this.u(this.s0 = s0);
        return true;
    }
    
    private void j(final com.google.android.material.tooltip.a a) {
        a.j1((View)com.google.android.material.internal.b0.f(this));
    }
    
    private boolean j0() {
        return this.g0(this.getValueOfTouchPosition());
    }
    
    private Float k(final int n) {
        float n2;
        if (this.y0) {
            n2 = this.m(20);
        }
        else {
            n2 = this.l();
        }
        if (n == 21) {
            if (!this.K()) {
                n2 = -n2;
            }
            return n2;
        }
        if (n == 22) {
            float f = n2;
            if (this.K()) {
                f = -n2;
            }
            return f;
        }
        if (n == 69) {
            return -n2;
        }
        if (n != 70 && n != 81) {
            return null;
        }
        return n2;
    }
    
    private float l() {
        float t0;
        if ((t0 = this.t0) == 0.0f) {
            t0 = 1.0f;
        }
        return t0;
    }
    
    private void l0() {
        if (!this.f0() && this.getMeasuredWidth() > 0) {
            final Drawable background = this.getBackground();
            if (background instanceof RippleDrawable) {
                final int n = (int)(this.T(this.q0.get(this.s0)) * this.w0 + this.f0);
                final int n2 = this.n();
                final int i0 = this.i0;
                androidx.core.graphics.drawable.c.l(background, n - i0, n2 - i0, n + i0, n2 + i0);
            }
        }
    }
    
    private float m(final int n) {
        final float l = this.l();
        final float n2 = (this.p0 - this.o0) / l;
        final float n3 = (float)n;
        if (n2 <= n3) {
            return l;
        }
        return Math.round(n2 / n3) * l;
    }
    
    private void m0(final int n) {
        this.w0 = Math.max(n - this.f0 * 2, 0);
        this.N();
    }
    
    private int n() {
        final int g0 = this.g0;
        final int d0 = this.d0;
        int intrinsicHeight = 0;
        if (d0 == 1) {
            intrinsicHeight = this.Q.get(0).getIntrinsicHeight();
        }
        return g0 + intrinsicHeight;
    }
    
    private void n0() {
        if (this.z0) {
            this.p0();
            this.q0();
            this.o0();
            this.r0();
            this.u0();
            this.z0 = false;
        }
    }
    
    private void o0() {
        if (this.t0 > 0.0f && !this.s0(this.p0)) {
            throw new IllegalStateException(String.format("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", Float.toString(this.t0), Float.toString(this.o0), Float.toString(this.p0)));
        }
    }
    
    private void p0() {
        if (this.o0 < this.p0) {
            return;
        }
        throw new IllegalStateException(String.format("valueFrom(%s) must be smaller than valueTo(%s)", Float.toString(this.o0), Float.toString(this.p0)));
    }
    
    private ValueAnimator q(final boolean b) {
        final float n = 0.0f;
        float n2;
        if (b) {
            n2 = 0.0f;
        }
        else {
            n2 = 1.0f;
        }
        ValueAnimator valueAnimator;
        if (b) {
            valueAnimator = this.V;
        }
        else {
            valueAnimator = this.U;
        }
        final float e = E(valueAnimator, n2);
        float n3 = n;
        if (b) {
            n3 = 1.0f;
        }
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[] { e, n3 });
        long duration;
        if (b) {
            duration = 83L;
        }
        else {
            duration = 117L;
        }
        ofFloat.setDuration(duration);
        TimeInterpolator interpolator;
        if (b) {
            interpolator = com.google.android.material.animation.a.e;
        }
        else {
            interpolator = com.google.android.material.animation.a.c;
        }
        ofFloat.setInterpolator(interpolator);
        ofFloat.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new ValueAnimator$AnimatorUpdateListener() {
            public void onAnimationUpdate(final ValueAnimator valueAnimator) {
                final float floatValue = (float)valueAnimator.getAnimatedValue();
                final Iterator<com.google.android.material.tooltip.a> iterator = (Iterator<com.google.android.material.tooltip.a>)c.this.Q.iterator();
                while (iterator.hasNext()) {
                    iterator.next().k1(floatValue);
                }
                androidx.core.view.j0.l1(c.this);
            }
        });
        return ofFloat;
    }
    
    private void q0() {
        if (this.p0 > this.o0) {
            return;
        }
        throw new IllegalStateException(String.format("valueTo(%s) must be greater than valueFrom(%s)", Float.toString(this.p0), Float.toString(this.o0)));
    }
    
    private void r() {
        if (this.Q.size() > this.q0.size()) {
            final List<com.google.android.material.tooltip.a> subList = this.Q.subList(this.q0.size(), this.Q.size());
            for (final com.google.android.material.tooltip.a a : subList) {
                if (androidx.core.view.j0.N0(this)) {
                    this.s(a);
                }
            }
            subList.clear();
        }
        while (this.Q.size() < this.q0.size()) {
            final com.google.android.material.tooltip.a a2 = this.P.a();
            this.Q.add(a2);
            if (androidx.core.view.j0.N0(this)) {
                this.j(a2);
            }
        }
        final int size = this.Q.size();
        int n = 1;
        if (size == 1) {
            n = 0;
        }
        final Iterator<com.google.android.material.tooltip.a> iterator2 = this.Q.iterator();
        while (iterator2.hasNext()) {
            iterator2.next().H0((float)n);
        }
    }
    
    private void r0() {
        for (final Float n : this.q0) {
            if (n < this.o0 || n > this.p0) {
                throw new IllegalStateException(String.format("Slider value(%s) must be greater or equal to valueFrom(%s), and lower or equal to valueTo(%s)", Float.toString(n), Float.toString(this.o0), Float.toString(this.p0)));
            }
            if (this.t0 <= 0.0f) {
                continue;
            }
            if (this.s0(n)) {
                continue;
            }
            throw new IllegalStateException(String.format("Value(%s) must be equal to valueFrom(%s) plus a multiple of stepSize(%s) when using stepSize(%s)", Float.toString(n), Float.toString(this.o0), Float.toString(this.t0), Float.toString(this.t0)));
        }
    }
    
    private void s(final com.google.android.material.tooltip.a a) {
        final a0 g = com.google.android.material.internal.b0.g(this);
        if (g != null) {
            g.b(a);
            a.W0((View)com.google.android.material.internal.b0.f(this));
        }
    }
    
    private boolean s0(final float f) {
        final double doubleValue = new BigDecimal(Float.toString(f)).subtract(new BigDecimal(Float.toString(this.o0))).divide(new BigDecimal(Float.toString(this.t0)), MathContext.DECIMAL64).doubleValue();
        return Math.abs(Math.round(doubleValue) - doubleValue) < 1.0E-4;
    }
    
    private void setValuesInternal(@j0 final ArrayList<Float> q0) {
        if (q0.isEmpty()) {
            throw new IllegalArgumentException("At least one value must be set");
        }
        Collections.sort((List<Comparable>)q0);
        if (this.q0.size() == q0.size() && this.q0.equals(q0)) {
            return;
        }
        this.q0 = q0;
        this.z0 = true;
        this.s0 = 0;
        this.l0();
        this.r();
        this.v();
        this.postInvalidate();
    }
    
    private float t(float o0) {
        if (o0 == 0.0f) {
            return 0.0f;
        }
        final float n = (o0 - this.f0) / this.w0;
        o0 = this.o0;
        return n * (o0 - this.p0) + o0;
    }
    
    private float t0(final float n) {
        return this.T(n) * this.w0 + this.f0;
    }
    
    private void u(final int index) {
        final Iterator<L> iterator = this.R.iterator();
        while (iterator.hasNext()) {
            iterator.next().a((S)this, this.q0.get(index), true);
        }
        final AccessibilityManager n = this.N;
        if (n != null && n.isEnabled()) {
            this.d0(index);
        }
    }
    
    private void u0() {
        final float t0 = this.t0;
        if (t0 == 0.0f) {
            return;
        }
        if ((int)t0 != t0) {
            Log.w(c.I0, String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the  value correctly.", "stepSize", t0));
        }
        final float o0 = this.o0;
        if ((int)o0 != o0) {
            Log.w(c.I0, String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the  value correctly.", "valueFrom", o0));
        }
        final float p0 = this.p0;
        if ((int)p0 != p0) {
            Log.w(c.I0, String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the  value correctly.", "valueTo", p0));
        }
    }
    
    private void v() {
        for (final a<S> a : this.R) {
            final Iterator<Float> iterator2 = this.q0.iterator();
            while (iterator2.hasNext()) {
                a.a((S)this, iterator2.next(), false);
            }
        }
    }
    
    private void w(@j0 final Canvas canvas, final int n, final int n2) {
        final float[] activeRange = this.getActiveRange();
        final int f0 = this.f0;
        final float n3 = (float)f0;
        final float n4 = activeRange[1];
        final float n5 = (float)n;
        final float n6 = (float)f0;
        final float n7 = activeRange[0];
        final float n8 = (float)n2;
        canvas.drawLine(n6 + n7 * n5, n8, n3 + n4 * n5, n8, this.H);
    }
    
    private void x(@j0 final Canvas canvas, int f0, final int n) {
        final float[] activeRange = this.getActiveRange();
        final int f2 = this.f0;
        final float n2 = (float)f2;
        final float n3 = activeRange[1];
        final float n4 = (float)f0;
        final float n5 = n2 + n3 * n4;
        if (n5 < f2 + f0) {
            final float n6 = (float)n;
            canvas.drawLine(n5, n6, (float)(f2 + f0), n6, this.G);
        }
        f0 = this.f0;
        final float n7 = f0 + activeRange[0] * n4;
        if (n7 > f0) {
            final float n8 = (float)f0;
            final float n9 = (float)n;
            canvas.drawLine(n8, n9, n7, n9, this.G);
        }
    }
    
    private void y(@j0 final Canvas canvas, final int n, final int n2) {
        if (!this.isEnabled()) {
            final Iterator<Float> iterator = this.q0.iterator();
            while (iterator.hasNext()) {
                canvas.drawCircle(this.f0 + this.T(iterator.next()) * n, (float)n2, (float)this.h0, this.I);
            }
        }
        for (final Float n3 : this.q0) {
            canvas.save();
            final int f0 = this.f0;
            final int n4 = (int)(this.T(n3) * n);
            final int h0 = this.h0;
            canvas.translate((float)(f0 + n4 - h0), (float)(n2 - h0));
            this.F0.draw(canvas);
            canvas.restore();
        }
    }
    
    private void z() {
        if (this.d0 == 2) {
            return;
        }
        if (!this.T) {
            this.T = true;
            final ValueAnimator q = this.q(true);
            this.U = q;
            this.V = null;
            q.start();
        }
        final Iterator<com.google.android.material.tooltip.a> iterator = this.Q.iterator();
        for (int index = 0; index < this.q0.size() && iterator.hasNext(); ++index) {
            if (index != this.s0) {
                this.e0(iterator.next(), this.q0.get(index));
            }
        }
        if (iterator.hasNext()) {
            this.e0(iterator.next(), this.q0.get(this.s0));
            return;
        }
        throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", this.Q.size(), this.q0.size()));
    }
    
    @b1
    void C(final boolean x0) {
        this.x0 = x0;
    }
    
    public boolean H() {
        return this.m0 != null;
    }
    
    final boolean K() {
        final int x = androidx.core.view.j0.X(this);
        boolean b = true;
        if (x != 1) {
            b = false;
        }
        return b;
    }
    
    public boolean L() {
        return this.v0;
    }
    
    protected boolean Y() {
        final int r0 = this.r0;
        boolean b = true;
        if (r0 != -1) {
            return true;
        }
        final float valueOfTouchPositionAbsolute = this.getValueOfTouchPositionAbsolute();
        final float t0 = this.t0(valueOfTouchPositionAbsolute);
        this.r0 = 0;
        float abs = Math.abs(this.q0.get(0) - valueOfTouchPositionAbsolute);
        float n;
        for (int i = 1; i < this.q0.size(); ++i, abs = n) {
            final float abs2 = Math.abs(this.q0.get(i) - valueOfTouchPositionAbsolute);
            final float t2 = this.t0(this.q0.get(i));
            if (Float.compare(abs2, abs) > 1) {
                break;
            }
            final boolean b2 = this.K() ? (t2 - t0 > 0.0f) : (t2 - t0 < 0.0f);
            if (Float.compare(abs2, abs) >= 0) {
                n = abs;
                if (Float.compare(abs2, abs) != 0) {
                    continue;
                }
                if (Math.abs(t2 - t0) < this.W) {
                    this.r0 = -1;
                    return false;
                }
                n = abs;
                if (!b2) {
                    continue;
                }
            }
            this.r0 = i;
            n = abs2;
        }
        if (this.r0 == -1) {
            b = false;
        }
        return b;
    }
    
    public void b0(@j0 final L l) {
        this.R.remove(l);
    }
    
    public void c0(@j0 final T t) {
        this.S.remove(t);
    }
    
    public boolean dispatchHoverEvent(@j0 final MotionEvent motionEvent) {
        return this.M.v(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }
    
    public boolean dispatchKeyEvent(@j0 final KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }
    
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.G.setColor(this.G(this.E0));
        this.H.setColor(this.G(this.D0));
        this.K.setColor(this.G(this.C0));
        this.L.setColor(this.G(this.B0));
        for (final com.google.android.material.tooltip.a a : this.Q) {
            if (a.isStateful()) {
                a.setState(this.getDrawableState());
            }
        }
        if (this.F0.isStateful()) {
            this.F0.setState(this.getDrawableState());
        }
        this.J.setColor(this.G(this.A0));
        this.J.setAlpha(63);
    }
    
    @j0
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }
    
    @b1
    final int getAccessibilityFocusedVirtualViewId() {
        return this.M.x();
    }
    
    public int getActiveThumbIndex() {
        return this.r0;
    }
    
    public int getFocusedThumbIndex() {
        return this.s0;
    }
    
    @q
    public int getHaloRadius() {
        return this.i0;
    }
    
    @j0
    public ColorStateList getHaloTintList() {
        return this.A0;
    }
    
    public int getLabelBehavior() {
        return this.d0;
    }
    
    protected float getMinSeparation() {
        return 0.0f;
    }
    
    public float getStepSize() {
        return this.t0;
    }
    
    public float getThumbElevation() {
        return this.F0.x();
    }
    
    @q
    public int getThumbRadius() {
        return this.h0;
    }
    
    public ColorStateList getThumbStrokeColor() {
        return this.F0.M();
    }
    
    public float getThumbStrokeWidth() {
        return this.F0.P();
    }
    
    @j0
    public ColorStateList getThumbTintList() {
        return this.F0.y();
    }
    
    @j0
    public ColorStateList getTickActiveTintList() {
        return this.B0;
    }
    
    @j0
    public ColorStateList getTickInactiveTintList() {
        return this.C0;
    }
    
    @j0
    public ColorStateList getTickTintList() {
        if (this.C0.equals(this.B0)) {
            return this.B0;
        }
        throw new IllegalStateException("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
    }
    
    @j0
    public ColorStateList getTrackActiveTintList() {
        return this.D0;
    }
    
    @q
    public int getTrackHeight() {
        return this.e0;
    }
    
    @j0
    public ColorStateList getTrackInactiveTintList() {
        return this.E0;
    }
    
    @q
    public int getTrackSidePadding() {
        return this.f0;
    }
    
    @j0
    public ColorStateList getTrackTintList() {
        if (this.E0.equals(this.D0)) {
            return this.D0;
        }
        throw new IllegalStateException("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
    }
    
    @q
    public int getTrackWidth() {
        return this.w0;
    }
    
    public float getValueFrom() {
        return this.o0;
    }
    
    public float getValueTo() {
        return this.p0;
    }
    
    @j0
    List<Float> getValues() {
        return new ArrayList<Float>(this.q0);
    }
    
    public void h(@k0 final L l) {
        this.R.add(l);
    }
    
    public void i(@j0 final T t) {
        this.S.add(t);
    }
    
    void k0(int h0, final Rect rect) {
        final int n = this.f0 + (int)(this.T(this.getValues().get(h0)) * this.w0);
        final int n2 = this.n();
        h0 = this.h0;
        rect.set(n - h0, n2 - h0, n + h0, n2 + h0);
    }
    
    public void o() {
        this.R.clear();
    }
    
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        final Iterator<com.google.android.material.tooltip.a> iterator = this.Q.iterator();
        while (iterator.hasNext()) {
            this.j(iterator.next());
        }
    }
    
    protected void onDetachedFromWindow() {
        final d o = this.O;
        if (o != null) {
            this.removeCallbacks((Runnable)o);
        }
        this.T = false;
        final Iterator<com.google.android.material.tooltip.a> iterator = this.Q.iterator();
        while (iterator.hasNext()) {
            this.s(iterator.next());
        }
        super.onDetachedFromWindow();
    }
    
    protected void onDraw(@j0 final Canvas canvas) {
        if (this.z0) {
            this.n0();
            this.N();
        }
        super.onDraw(canvas);
        final int n = this.n();
        this.x(canvas, this.w0, n);
        if (Collections.max((Collection<? extends Float>)this.getValues()) > this.o0) {
            this.w(canvas, this.w0, n);
        }
        this.P(canvas);
        if ((this.n0 || this.isFocused()) && this.isEnabled()) {
            this.O(canvas, this.w0, n);
            if (this.r0 != -1) {
                this.z();
            }
        }
        this.y(canvas, this.w0, n);
    }
    
    protected void onFocusChanged(final boolean b, final int n, @k0 final Rect rect) {
        super.onFocusChanged(b, n, rect);
        if (!b) {
            this.r0 = -1;
            this.A();
            this.M.o(this.s0);
        }
        else {
            this.B(n);
            this.M.X(this.s0);
        }
    }
    
    public boolean onKeyDown(final int n, @j0 final KeyEvent keyEvent) {
        if (!this.isEnabled()) {
            return super.onKeyDown(n, keyEvent);
        }
        if (this.q0.size() == 1) {
            this.r0 = 0;
        }
        if (this.r0 == -1) {
            final Boolean u = this.U(n, keyEvent);
            boolean b;
            if (u != null) {
                b = u;
            }
            else {
                b = super.onKeyDown(n, keyEvent);
            }
            return b;
        }
        this.y0 |= keyEvent.isLongPress();
        final Float k = this.k(n);
        if (k != null) {
            if (this.g0(this.q0.get(this.r0) + k)) {
                this.l0();
                this.postInvalidate();
            }
            return true;
        }
        if (n != 23) {
            if (n != 61) {
                if (n != 66) {
                    return super.onKeyDown(n, keyEvent);
                }
            }
            else {
                if (keyEvent.hasNoModifiers()) {
                    return this.R(1);
                }
                return keyEvent.isShiftPressed() && this.R(-1);
            }
        }
        this.r0 = -1;
        this.A();
        this.postInvalidate();
        return true;
    }
    
    public boolean onKeyUp(final int n, @j0 final KeyEvent keyEvent) {
        this.y0 = false;
        return super.onKeyUp(n, keyEvent);
    }
    
    protected void onMeasure(final int n, int intrinsicHeight) {
        final int c0 = this.c0;
        final int d0 = this.d0;
        intrinsicHeight = 0;
        if (d0 == 1) {
            intrinsicHeight = this.Q.get(0).getIntrinsicHeight();
        }
        super.onMeasure(n, View$MeasureSpec.makeMeasureSpec(c0 + intrinsicHeight, 1073741824));
    }
    
    protected void onRestoreInstanceState(final Parcelable parcelable) {
        final f f = (f)parcelable;
        super.onRestoreInstanceState(f.getSuperState());
        this.o0 = f.G;
        this.p0 = f.H;
        this.setValuesInternal(f.I);
        this.t0 = f.J;
        if (f.K) {
            this.requestFocus();
        }
        this.v();
    }
    
    protected Parcelable onSaveInstanceState() {
        final f f = new f(super.onSaveInstanceState());
        f.G = this.o0;
        f.H = this.p0;
        f.I = new ArrayList<Float>(this.q0);
        f.J = this.t0;
        f.K = this.hasFocus();
        return (Parcelable)f;
    }
    
    protected void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        this.m0(n);
        this.l0();
    }
    
    public boolean onTouchEvent(@j0 final MotionEvent motionEvent) {
        if (!this.isEnabled()) {
            return false;
        }
        final float x = motionEvent.getX();
        final float n = (x - this.f0) / this.w0;
        this.G0 = n;
        final float max = Math.max(0.0f, n);
        this.G0 = max;
        this.G0 = Math.min(1.0f, max);
        final int actionMasked = motionEvent.getActionMasked();
        Label_0332: {
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        break Label_0332;
                    }
                    if (!this.n0) {
                        if (this.J() && Math.abs(x - this.k0) < this.W) {
                            return false;
                        }
                        this.getParent().requestDisallowInterceptTouchEvent(true);
                        this.V();
                    }
                    if (!this.Y()) {
                        break Label_0332;
                    }
                    this.n0 = true;
                    this.j0();
                    this.l0();
                }
                else {
                    this.n0 = false;
                    final MotionEvent l0 = this.l0;
                    if (l0 != null && l0.getActionMasked() == 0 && Math.abs(this.l0.getX() - motionEvent.getX()) <= this.W && Math.abs(this.l0.getY() - motionEvent.getY()) <= this.W && this.Y()) {
                        this.V();
                    }
                    if (this.r0 != -1) {
                        this.j0();
                        this.r0 = -1;
                        this.W();
                    }
                    this.A();
                }
                this.invalidate();
            }
            else {
                this.k0 = x;
                if (!this.J()) {
                    this.getParent().requestDisallowInterceptTouchEvent(true);
                    if (this.Y()) {
                        this.requestFocus();
                        this.n0 = true;
                        this.j0();
                        this.l0();
                        this.invalidate();
                        this.V();
                    }
                }
            }
        }
        this.setPressed(this.n0);
        this.l0 = MotionEvent.obtain(motionEvent);
        return true;
    }
    
    public void p() {
        this.S.clear();
    }
    
    protected void setActiveThumbIndex(final int r0) {
        this.r0 = r0;
    }
    
    public void setEnabled(final boolean enabled) {
        super.setEnabled(enabled);
        int n;
        if (enabled) {
            n = 0;
        }
        else {
            n = 2;
        }
        this.setLayerType(n, (Paint)null);
    }
    
    public void setFocusedThumbIndex(final int s0) {
        if (s0 >= 0 && s0 < this.q0.size()) {
            this.s0 = s0;
            this.M.X(s0);
            this.postInvalidate();
            return;
        }
        throw new IllegalArgumentException("index out of range");
    }
    
    public void setHaloRadius(@androidx.annotation.b0(from = 0L) @q final int i0) {
        if (i0 == this.i0) {
            return;
        }
        this.i0 = i0;
        final Drawable background = this.getBackground();
        if (!this.f0() && background instanceof RippleDrawable) {
            t2.a.b((RippleDrawable)background, this.i0);
            return;
        }
        this.postInvalidate();
    }
    
    public void setHaloRadiusResource(@p final int n) {
        this.setHaloRadius(this.getResources().getDimensionPixelSize(n));
    }
    
    public void setHaloTintList(@j0 final ColorStateList list) {
        if (list.equals(this.A0)) {
            return;
        }
        this.A0 = list;
        final Drawable background = this.getBackground();
        if (!this.f0() && background instanceof RippleDrawable) {
            ((RippleDrawable)background).setColor(list);
            return;
        }
        this.J.setColor(this.G(list));
        this.J.setAlpha(63);
        this.invalidate();
    }
    
    public void setLabelBehavior(final int d0) {
        if (this.d0 != d0) {
            this.d0 = d0;
            this.requestLayout();
        }
    }
    
    public void setLabelFormatter(@k0 final com.google.android.material.slider.e m0) {
        this.m0 = m0;
    }
    
    protected void setSeparationUnit(final int h0) {
        this.H0 = h0;
    }
    
    public void setStepSize(final float n) {
        if (n >= 0.0f) {
            if (this.t0 != n) {
                this.t0 = n;
                this.z0 = true;
                this.postInvalidate();
            }
            return;
        }
        throw new IllegalArgumentException(String.format("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", Float.toString(n), Float.toString(this.o0), Float.toString(this.p0)));
    }
    
    public void setThumbElevation(final float n) {
        this.F0.m0(n);
    }
    
    public void setThumbElevationResource(@p final int n) {
        this.setThumbElevation(this.getResources().getDimension(n));
    }
    
    public void setThumbRadius(@androidx.annotation.b0(from = 0L) @q int h0) {
        if (h0 == this.h0) {
            return;
        }
        this.h0 = h0;
        this.Q();
        this.F0.setShapeAppearanceModel(o.a().q(0, (float)this.h0).m());
        final j f0 = this.F0;
        h0 = this.h0;
        f0.setBounds(0, 0, h0 * 2, h0 * 2);
        this.postInvalidate();
    }
    
    public void setThumbRadiusResource(@p final int n) {
        this.setThumbRadius(this.getResources().getDimensionPixelSize(n));
    }
    
    public void setThumbStrokeColor(@k0 final ColorStateList list) {
        this.F0.E0(list);
        this.postInvalidate();
    }
    
    public void setThumbStrokeColorResource(@n final int n) {
        if (n != 0) {
            this.setThumbStrokeColor(androidx.appcompat.content.res.a.c(this.getContext(), n));
        }
    }
    
    public void setThumbStrokeWidth(final float n) {
        this.F0.H0(n);
        this.postInvalidate();
    }
    
    public void setThumbStrokeWidthResource(@p final int n) {
        if (n != 0) {
            this.setThumbStrokeWidth(this.getResources().getDimension(n));
        }
    }
    
    public void setThumbTintList(@j0 final ColorStateList list) {
        if (list.equals(this.F0.y())) {
            return;
        }
        this.F0.n0(list);
        this.invalidate();
    }
    
    public void setTickActiveTintList(@j0 final ColorStateList b0) {
        if (b0.equals(this.B0)) {
            return;
        }
        this.B0 = b0;
        this.L.setColor(this.G(b0));
        this.invalidate();
    }
    
    public void setTickInactiveTintList(@j0 final ColorStateList c0) {
        if (c0.equals(this.C0)) {
            return;
        }
        this.C0 = c0;
        this.K.setColor(this.G(c0));
        this.invalidate();
    }
    
    public void setTickTintList(@j0 final ColorStateList list) {
        this.setTickInactiveTintList(list);
        this.setTickActiveTintList(list);
    }
    
    public void setTickVisible(final boolean v0) {
        if (this.v0 != v0) {
            this.v0 = v0;
            this.postInvalidate();
        }
    }
    
    public void setTrackActiveTintList(@j0 final ColorStateList d0) {
        if (d0.equals(this.D0)) {
            return;
        }
        this.D0 = d0;
        this.H.setColor(this.G(d0));
        this.invalidate();
    }
    
    public void setTrackHeight(@androidx.annotation.b0(from = 0L) @q final int e0) {
        if (this.e0 != e0) {
            this.e0 = e0;
            this.I();
            this.postInvalidate();
        }
    }
    
    public void setTrackInactiveTintList(@j0 final ColorStateList e0) {
        if (e0.equals(this.E0)) {
            return;
        }
        this.E0 = e0;
        this.G.setColor(this.G(e0));
        this.invalidate();
    }
    
    public void setTrackTintList(@j0 final ColorStateList list) {
        this.setTrackInactiveTintList(list);
        this.setTrackActiveTintList(list);
    }
    
    public void setValueFrom(final float o0) {
        this.o0 = o0;
        this.z0 = true;
        this.postInvalidate();
    }
    
    public void setValueTo(final float p) {
        this.p0 = p;
        this.z0 = true;
        this.postInvalidate();
    }
    
    void setValues(@j0 final List<Float> c) {
        this.setValuesInternal(new ArrayList<Float>(c));
    }
    
    void setValues(@j0 final Float... elements) {
        final ArrayList<Float> list = (ArrayList<Float>)new ArrayList<Object>();
        Collections.addAll(list, elements);
        this.setValuesInternal(list);
    }
    
    private class d implements Runnable
    {
        int G;
        
        private d() {
            this.G = -1;
        }
        
        void a(final int g) {
            this.G = g;
        }
        
        @Override
        public void run() {
            c.this.M.Y(this.G, 4);
        }
    }
    
    private static class e extends a
    {
        private final c<?, ?, ?> t;
        Rect u;
        
        e(final c<?, ?, ?> t) {
            super(t);
            this.u = new Rect();
            this.t = t;
        }
        
        @j0
        private String a0(int n) {
            Context context;
            if (n == this.t.getValues().size() - 1) {
                context = this.t.getContext();
                n = o2.a.m.b0;
            }
            else {
                if (n != 0) {
                    return "";
                }
                context = this.t.getContext();
                n = o2.a.m.c0;
            }
            return context.getString(n);
        }
        
        @Override
        protected int C(final float n, final float n2) {
            for (int i = 0; i < this.t.getValues().size(); ++i) {
                this.t.k0(i, this.u);
                if (this.u.contains((int)n, (int)n2)) {
                    return i;
                }
            }
            return -1;
        }
        
        @Override
        protected void D(final List<Integer> list) {
            for (int i = 0; i < this.t.getValues().size(); ++i) {
                list.add(i);
            }
        }
        
        @Override
        protected boolean N(final int n, final int n2, final Bundle bundle) {
            if (!this.t.isEnabled()) {
                return false;
            }
            Label_0071: {
                if (n2 != 4096 && n2 != 8192) {
                    if (n2 != 16908349) {
                        return false;
                    }
                    if (bundle != null) {
                        if (bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                            if (((c<c, com.google.android.material.slider.a, b>)this.t).i0(n, bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"))) {
                                break Label_0071;
                            }
                        }
                    }
                    return false;
                }
                else {
                    float g;
                    final float n3 = g = ((c<c, com.google.android.material.slider.a, b>)this.t).m(20);
                    if (n2 == 8192) {
                        g = -n3;
                    }
                    float n4 = g;
                    if (this.t.K()) {
                        n4 = -g;
                    }
                    if (!((c<c, com.google.android.material.slider.a, b>)this.t).i0(n, q.a.b(this.t.getValues().get(n) + n4, this.t.getValueFrom(), this.t.getValueTo()))) {
                        return false;
                    }
                }
            }
            ((c<c, com.google.android.material.slider.a, b>)this.t).l0();
            this.t.postInvalidate();
            this.G(n);
            return true;
        }
        
        @Override
        protected void R(final int n, final androidx.core.view.accessibility.d d) {
            d.b(androidx.core.view.accessibility.d.a.M);
            final List<Float> values = this.t.getValues();
            final float floatValue = values.get(n);
            final float value = this.t.getValueFrom();
            final float valueTo = this.t.getValueTo();
            if (this.t.isEnabled()) {
                if (floatValue > value) {
                    d.a(8192);
                }
                if (floatValue < valueTo) {
                    d.a(4096);
                }
            }
            d.A1(d.d.e(1, value, valueTo, floatValue));
            d.U0(SeekBar.class.getName());
            final StringBuilder sb = new StringBuilder();
            if (this.t.getContentDescription() != null) {
                sb.append(this.t.getContentDescription());
                sb.append(",");
            }
            if (values.size() > 1) {
                sb.append(this.a0(n));
                sb.append(((c<c, com.google.android.material.slider.a, b>)this.t).D(floatValue));
            }
            d.Y0(sb.toString());
            this.t.k0(n, this.u);
            d.P0(this.u);
        }
    }
    
    static class f extends View$BaseSavedState
    {
        public static final Parcelable$Creator<f> CREATOR;
        float G;
        float H;
        ArrayList<Float> I;
        float J;
        boolean K;
        
        static {
            CREATOR = (Parcelable$Creator)new Parcelable$Creator<f>() {
                @j0
                public f a(@j0 final Parcel parcel) {
                    return new f(parcel);
                }
                
                @j0
                public f[] b(final int n) {
                    return new f[n];
                }
            };
        }
        
        private f(@j0 final Parcel parcel) {
            super(parcel);
            this.G = parcel.readFloat();
            this.H = parcel.readFloat();
            parcel.readList((List)(this.I = new ArrayList<Float>()), Float.class.getClassLoader());
            this.J = parcel.readFloat();
            this.K = parcel.createBooleanArray()[0];
        }
        
        f(final Parcelable parcelable) {
            super(parcelable);
        }
        
        public void writeToParcel(@j0 final Parcel parcel, final int n) {
            super.writeToParcel(parcel, n);
            parcel.writeFloat(this.G);
            parcel.writeFloat(this.H);
            parcel.writeList((List)this.I);
            parcel.writeFloat(this.J);
            parcel.writeBooleanArray(new boolean[] { this.K });
        }
    }
    
    private interface g
    {
        com.google.android.material.tooltip.a a();
    }
}
