// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.transition.platform;

import android.graphics.ColorFilter;
import androidx.core.util.n;
import android.graphics.Rect;
import android.graphics.Region$Op;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Paint$Style;
import android.content.res.ColorStateList;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.graphics.PathMeasure;
import android.graphics.Path;
import android.graphics.Paint;
import androidx.annotation.t;
import androidx.annotation.t0;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;
import android.util.Log;
import android.graphics.drawable.Drawable;
import com.google.android.material.internal.b0;
import android.transition.Transition$TransitionListener;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.animation.Animator;
import android.view.ViewGroup;
import com.google.android.material.shape.s;
import android.transition.TransitionValues;
import android.transition.PathMotion;
import android.transition.ArcMotion;
import android.graphics.RectF;
import androidx.annotation.x0;
import android.content.res.TypedArray;
import o2.a;
import androidx.annotation.j0;
import android.content.Context;
import android.os.Build$VERSION;
import com.google.android.material.shape.o;
import androidx.annotation.k0;
import android.view.View;
import androidx.annotation.y;
import androidx.annotation.p0;
import android.transition.Transition;

@p0(21)
public final class l extends Transition
{
    public static final int f0 = 0;
    public static final int g0 = 1;
    public static final int h0 = 2;
    public static final int i0 = 0;
    public static final int j0 = 1;
    public static final int k0 = 2;
    public static final int l0 = 3;
    public static final int m0 = 0;
    public static final int n0 = 1;
    public static final int o0 = 2;
    private static final String p0;
    private static final String q0 = "materialContainerTransition:bounds";
    private static final String r0 = "materialContainerTransition:shapeAppearance";
    private static final String[] s0;
    private static final f t0;
    private static final f u0;
    private static final f v0;
    private static final f w0;
    private static final float x0 = -1.0f;
    private boolean G;
    private boolean H;
    private boolean I;
    private boolean J;
    @y
    private int K;
    @y
    private int L;
    @y
    private int M;
    @androidx.annotation.l
    private int N;
    @androidx.annotation.l
    private int O;
    @androidx.annotation.l
    private int P;
    @androidx.annotation.l
    private int Q;
    private int R;
    private int S;
    private int T;
    @k0
    private View U;
    @k0
    private View V;
    @k0
    private o W;
    @k0
    private o X;
    @k0
    private e Y;
    @k0
    private e Z;
    @k0
    private e a0;
    @k0
    private e b0;
    private boolean c0;
    private float d0;
    private float e0;
    
    static {
        p0 = l.class.getSimpleName();
        s0 = new String[] { "materialContainerTransition:bounds", "materialContainerTransition:shapeAppearance" };
        t0 = new f(new e(0.0f, 0.25f), new e(0.0f, 1.0f), new e(0.0f, 1.0f), new e(0.0f, 0.75f));
        u0 = new f(new e(0.6f, 0.9f), new e(0.0f, 1.0f), new e(0.0f, 0.9f), new e(0.3f, 0.9f));
        v0 = new f(new e(0.1f, 0.4f), new e(0.1f, 1.0f), new e(0.1f, 1.0f), new e(0.1f, 0.9f));
        w0 = new f(new e(0.6f, 0.9f), new e(0.0f, 0.9f), new e(0.0f, 0.9f), new e(0.2f, 0.9f));
    }
    
    public l() {
        boolean c0 = false;
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = false;
        this.K = 16908290;
        this.L = -1;
        this.M = -1;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.Q = 1375731712;
        this.R = 0;
        this.S = 0;
        this.T = 0;
        if (Build$VERSION.SDK_INT >= 28) {
            c0 = true;
        }
        this.c0 = c0;
        this.d0 = -1.0f;
        this.e0 = -1.0f;
    }
    
    public l(@j0 final Context context, final boolean b) {
        boolean c0 = false;
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = false;
        this.K = 16908290;
        this.L = -1;
        this.M = -1;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.Q = 1375731712;
        this.R = 0;
        this.S = 0;
        this.T = 0;
        if (Build$VERSION.SDK_INT >= 28) {
            c0 = true;
        }
        this.c0 = c0;
        this.d0 = -1.0f;
        this.e0 = -1.0f;
        this.P(context, b);
        this.J = true;
    }
    
    private f F(final boolean b, f f, final f f2) {
        if (!b) {
            f = f2;
        }
        return new f((e)v.d(this.Y, f.a), (e)v.d(this.Z, f.b), (e)v.d(this.a0, f.c), (e)v.d(this.b0, f.d));
    }
    
    @x0
    private static int I(final Context context) {
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[] { a.c.Nf });
        final int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }
    
    private boolean N(@j0 final RectF rectF, @j0 final RectF rectF2) {
        final int r = this.R;
        boolean b = false;
        if (r == 0) {
            if (v.a(rectF2) > v.a(rectF)) {
                b = true;
            }
            return b;
        }
        if (r == 1) {
            return true;
        }
        if (r == 2) {
            return false;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Invalid transition direction: ");
        sb.append(this.R);
        throw new IllegalArgumentException(sb.toString());
    }
    
    private void P(final Context context, final boolean b) {
        v.u(this, context, a.c.za, com.google.android.material.animation.a.b);
        int n;
        if (b) {
            n = a.c.pa;
        }
        else {
            n = a.c.sa;
        }
        v.t(this, context, n);
        if (!this.I) {
            v.v(this, context, a.c.Ba);
        }
    }
    
    private f b(final boolean b) {
        final PathMotion pathMotion = this.getPathMotion();
        f f;
        f f2;
        if (!(pathMotion instanceof ArcMotion) && !(pathMotion instanceof k)) {
            f = l.t0;
            f2 = l.u0;
        }
        else {
            f = l.v0;
            f2 = l.w0;
        }
        return this.F(b, f, f2);
    }
    
    private static RectF c(final View view, @k0 final View view2, final float n, final float n2) {
        if (view2 != null) {
            final RectF i = v.i(view2);
            i.offset(n, n2);
            return i;
        }
        return new RectF(0.0f, 0.0f, (float)view.getWidth(), (float)view.getHeight());
    }
    
    private static o d(@j0 final View view, @j0 final RectF rectF, @k0 final o o) {
        return v.b(y(view, o), rectF);
    }
    
    private static void f(@j0 final TransitionValues transitionValues, @k0 View view, @y int d3, @k0 final o o) {
        Label_0073: {
            if (d3 != -1) {
                view = v.f(transitionValues.view, d3);
            }
            else if (view == null) {
                view = transitionValues.view;
                d3 = a.h.d3;
                if (!(view.getTag(d3) instanceof View)) {
                    break Label_0073;
                }
                view = (View)transitionValues.view.getTag(d3);
                transitionValues.view.setTag(d3, (Object)null);
            }
            transitionValues.view = view;
        }
        final View view2 = transitionValues.view;
        if (androidx.core.view.j0.T0(view2) || view2.getWidth() != 0 || view2.getHeight() != 0) {
            RectF rectF;
            if (view2.getParent() == null) {
                rectF = v.j(view2);
            }
            else {
                rectF = v.i(view2);
            }
            transitionValues.values.put("materialContainerTransition:bounds", rectF);
            transitionValues.values.put("materialContainerTransition:shapeAppearance", d(view2, rectF, o));
        }
    }
    
    private static float j(float p2, final View view) {
        if (p2 == -1.0f) {
            p2 = androidx.core.view.j0.P(view);
        }
        return p2;
    }
    
    private static o y(@j0 final View view, @k0 final o o) {
        if (o != null) {
            return o;
        }
        final int d3 = a.h.d3;
        if (view.getTag(d3) instanceof o) {
            return (o)view.getTag(d3);
        }
        final Context context = view.getContext();
        final int i = I(context);
        if (i != -1) {
            return o.b(context, i, 0).m();
        }
        if (view instanceof s) {
            return ((s)view).getShapeAppearanceModel();
        }
        return o.a().m();
    }
    
    @androidx.annotation.l
    public int A() {
        return this.O;
    }
    
    public float B() {
        return this.d0;
    }
    
    @k0
    public o C() {
        return this.W;
    }
    
    @k0
    public View D() {
        return this.U;
    }
    
    @y
    public int E() {
        return this.L;
    }
    
    public int H() {
        return this.R;
    }
    
    public boolean J() {
        return this.G;
    }
    
    public boolean L() {
        return this.c0;
    }
    
    public boolean O() {
        return this.H;
    }
    
    public void Q(@androidx.annotation.l final int p) {
        this.N = p;
        this.O = p;
        this.P = p;
    }
    
    public void R(@androidx.annotation.l final int n) {
        this.N = n;
    }
    
    public void S(final boolean g) {
        this.G = g;
    }
    
    public void T(@y final int k) {
        this.K = k;
    }
    
    public void U(final boolean c0) {
        this.c0 = c0;
    }
    
    public void V(@androidx.annotation.l final int p) {
        this.P = p;
    }
    
    public void W(final float e0) {
        this.e0 = e0;
    }
    
    public void X(@k0 final o x) {
        this.X = x;
    }
    
    public void Y(@k0 final View v) {
        this.V = v;
    }
    
    public void Z(@y final int m) {
        this.M = m;
    }
    
    public void a0(final int s) {
        this.S = s;
    }
    
    public void b0(@k0 final e y) {
        this.Y = y;
    }
    
    public void c0(final int t) {
        this.T = t;
    }
    
    public void captureEndValues(@j0 final TransitionValues transitionValues) {
        f(transitionValues, this.V, this.M, this.X);
    }
    
    public void captureStartValues(@j0 final TransitionValues transitionValues) {
        f(transitionValues, this.U, this.L, this.W);
    }
    
    @k0
    public Animator createAnimator(@j0 final ViewGroup viewGroup, @k0 final TransitionValues transitionValues, @k0 final TransitionValues transitionValues2) {
        if (transitionValues != null && transitionValues2 != null) {
            final RectF rectF = transitionValues.values.get("materialContainerTransition:bounds");
            final o o = transitionValues.values.get("materialContainerTransition:shapeAppearance");
            String s;
            String s2;
            if (rectF != null && o != null) {
                final RectF rectF2 = transitionValues2.values.get("materialContainerTransition:bounds");
                final o o2 = transitionValues2.values.get("materialContainerTransition:shapeAppearance");
                if (rectF2 != null && o2 != null) {
                    final View view = transitionValues.view;
                    final View view2 = transitionValues2.view;
                    View view3;
                    if (view2.getParent() != null) {
                        view3 = view2;
                    }
                    else {
                        view3 = view;
                    }
                    View e;
                    View view4;
                    if (this.K == view3.getId()) {
                        e = (View)view3.getParent();
                        view4 = view3;
                    }
                    else {
                        e = v.e(view3, this.K);
                        view4 = null;
                    }
                    final RectF i = v.i(e);
                    final float n = -i.left;
                    final float n2 = -i.top;
                    final RectF c = c(e, view4, n, n2);
                    rectF.offset(n, n2);
                    rectF2.offset(n, n2);
                    final boolean n3 = this.N(rectF, rectF2);
                    if (!this.J) {
                        this.P(view3.getContext(), n3);
                    }
                    final h h = new h(this.getPathMotion(), view, rectF, o, j(this.d0, view), view2, rectF2, o2, j(this.e0, view2), this.N, this.O, this.P, this.Q, n3, this.c0, b.a(this.S, n3), com.google.android.material.transition.platform.g.a(this.T, n3, rectF, rectF2), this.b(n3), this.G);
                    h.setBounds(Math.round(c.left), Math.round(c.top), Math.round(c.right), Math.round(c.bottom));
                    final ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[] { 0.0f, 1.0f });
                    ofFloat.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new ValueAnimator$AnimatorUpdateListener() {
                        public void onAnimationUpdate(final ValueAnimator valueAnimator) {
                            h.o(valueAnimator.getAnimatedFraction());
                        }
                    });
                    this.addListener((Transition$TransitionListener)new u() {
                        @Override
                        public void onTransitionEnd(@j0 final Transition transition) {
                            l.this.removeListener((Transition$TransitionListener)this);
                            if (l.this.H) {
                                return;
                            }
                            view.setAlpha(1.0f);
                            view2.setAlpha(1.0f);
                            com.google.android.material.internal.b0.h(e).b(h);
                        }
                        
                        @Override
                        public void onTransitionStart(@j0 final Transition transition) {
                            com.google.android.material.internal.b0.h(e).a(h);
                            view.setAlpha(0.0f);
                            view2.setAlpha(0.0f);
                        }
                    });
                    return (Animator)ofFloat;
                }
                s = l.p0;
                s2 = "Skipping due to null end bounds. Ensure end view is laid out and measured.";
            }
            else {
                s = l.p0;
                s2 = "Skipping due to null start bounds. Ensure start view is laid out and measured.";
            }
            Log.w(s, s2);
            return null;
        }
        return null;
    }
    
    public void d0(final boolean h) {
        this.H = h;
    }
    
    public void e0(@k0 final e a0) {
        this.a0 = a0;
    }
    
    public void f0(@k0 final e z) {
        this.Z = z;
    }
    
    @androidx.annotation.l
    public int g() {
        return this.N;
    }
    
    public void g0(@androidx.annotation.l final int q) {
        this.Q = q;
    }
    
    @k0
    public String[] getTransitionProperties() {
        return l.s0;
    }
    
    public void h0(@k0 final e b0) {
        this.b0 = b0;
    }
    
    @y
    public int i() {
        return this.K;
    }
    
    public void i0(@androidx.annotation.l final int o) {
        this.O = o;
    }
    
    public void j0(final float d0) {
        this.d0 = d0;
    }
    
    public void k0(@k0 final o w) {
        this.W = w;
    }
    
    @androidx.annotation.l
    public int l() {
        return this.P;
    }
    
    public void l0(@k0 final View u) {
        this.U = u;
    }
    
    public float m() {
        return this.e0;
    }
    
    public void m0(@y final int l) {
        this.L = l;
    }
    
    @k0
    public o n() {
        return this.X;
    }
    
    public void n0(final int r) {
        this.R = r;
    }
    
    @k0
    public View q() {
        return this.V;
    }
    
    @y
    public int r() {
        return this.M;
    }
    
    public int s() {
        return this.S;
    }
    
    public void setPathMotion(@k0 final PathMotion pathMotion) {
        super.setPathMotion(pathMotion);
        this.I = true;
    }
    
    @k0
    public e t() {
        return this.Y;
    }
    
    public int u() {
        return this.T;
    }
    
    @k0
    public e v() {
        return this.a0;
    }
    
    @k0
    public e w() {
        return this.Z;
    }
    
    @androidx.annotation.l
    public int x() {
        return this.Q;
    }
    
    @k0
    public e z() {
        return this.b0;
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @t0({ androidx.annotation.t0.a.H })
    public @interface c {
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @t0({ androidx.annotation.t0.a.H })
    public @interface d {
    }
    
    public static class e
    {
        @t(from = 0.0, to = 1.0)
        private final float a;
        @t(from = 0.0, to = 1.0)
        private final float b;
        
        public e(@t(from = 0.0, to = 1.0) final float a, @t(from = 0.0, to = 1.0) final float b) {
            this.a = a;
            this.b = b;
        }
        
        @t(from = 0.0, to = 1.0)
        public float c() {
            return this.b;
        }
        
        @t(from = 0.0, to = 1.0)
        public float d() {
            return this.a;
        }
    }
    
    private static class f
    {
        @j0
        private final e a;
        @j0
        private final e b;
        @j0
        private final e c;
        @j0
        private final e d;
        
        private f(@j0 final e a, @j0 final e b, @j0 final e c, @j0 final e d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @t0({ androidx.annotation.t0.a.H })
    public @interface g {
    }
    
    private static final class h extends Drawable
    {
        private static final int M = 754974720;
        private static final int N = -7829368;
        private static final float O = 0.3f;
        private static final float P = 1.5f;
        private final f A;
        private final com.google.android.material.transition.platform.a B;
        private final com.google.android.material.transition.platform.f C;
        private final boolean D;
        private final Paint E;
        private final Path F;
        private com.google.android.material.transition.platform.c G;
        private com.google.android.material.transition.platform.h H;
        private RectF I;
        private float J;
        private float K;
        private float L;
        private final View a;
        private final RectF b;
        private final o c;
        private final float d;
        private final View e;
        private final RectF f;
        private final o g;
        private final float h;
        private final Paint i;
        private final Paint j;
        private final Paint k;
        private final Paint l;
        private final Paint m;
        private final j n;
        private final PathMeasure o;
        private final float p;
        private final float[] q;
        private final boolean r;
        private final float s;
        private final float t;
        private final boolean u;
        private final com.google.android.material.shape.j v;
        private final RectF w;
        private final RectF x;
        private final RectF y;
        private final RectF z;
        
        private h(final PathMotion pathMotion, final View a, final RectF b, final o c, final float d, final View e, final RectF f, final o g, final float h, @androidx.annotation.l final int color, @androidx.annotation.l final int color2, @androidx.annotation.l final int color3, final int n, final boolean r, final boolean u, final com.google.android.material.transition.platform.a b2, final com.google.android.material.transition.platform.f c2, final f a2, final boolean d2) {
            final Paint i = new Paint();
            this.i = i;
            final Paint j = new Paint();
            this.j = j;
            final Paint k = new Paint();
            this.k = k;
            this.l = new Paint();
            final Paint m = new Paint();
            this.m = m;
            this.n = new j();
            final float[] q = new float[2];
            this.q = q;
            final com.google.android.material.shape.j v = new com.google.android.material.shape.j();
            this.v = v;
            final Paint e2 = new Paint();
            this.E = e2;
            this.F = new Path();
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
            this.g = g;
            this.h = h;
            this.r = r;
            this.u = u;
            this.B = b2;
            this.C = c2;
            this.A = a2;
            this.D = d2;
            final WindowManager windowManager = (WindowManager)a.getContext().getSystemService("window");
            final DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            this.s = (float)displayMetrics.widthPixels;
            this.t = (float)displayMetrics.heightPixels;
            i.setColor(color);
            j.setColor(color2);
            k.setColor(color3);
            v.n0(ColorStateList.valueOf(0));
            v.w0(2);
            v.t0(false);
            v.u0(-7829368);
            final RectF w = new RectF(b);
            this.w = w;
            this.x = new RectF(w);
            final RectF y = new RectF(w);
            this.y = y;
            this.z = new RectF(y);
            final PointF l = m(b);
            final PointF m2 = m(f);
            final PathMeasure o = new PathMeasure(pathMotion.getPath(l.x, l.y, m2.x, m2.y), false);
            this.o = o;
            this.p = o.getLength();
            q[0] = b.centerX();
            q[1] = b.top;
            m.setStyle(Paint$Style.FILL);
            m.setShader(com.google.android.material.transition.platform.v.c(n));
            e2.setStyle(Paint$Style.STROKE);
            e2.setStrokeWidth(10.0f);
            this.p(0.0f);
        }
        
        private static float d(final RectF rectF, final float n) {
            return (rectF.centerX() / (n / 2.0f) - 1.0f) * 0.3f;
        }
        
        private static float e(final RectF rectF, final float n) {
            return rectF.centerY() / n * 1.5f;
        }
        
        private void f(final Canvas canvas, final RectF rectF, final Path path, @androidx.annotation.l final int color) {
            final PointF m = m(rectF);
            if (this.L == 0.0f) {
                path.reset();
                path.moveTo(m.x, m.y);
            }
            else {
                path.lineTo(m.x, m.y);
                this.E.setColor(color);
                canvas.drawPath(path, this.E);
            }
        }
        
        private void g(final Canvas canvas, final RectF rectF, @androidx.annotation.l final int color) {
            this.E.setColor(color);
            canvas.drawRect(rectF, this.E);
        }
        
        private void h(final Canvas canvas) {
            canvas.save();
            canvas.clipPath(this.n.d(), Region$Op.DIFFERENCE);
            if (Build$VERSION.SDK_INT > 28) {
                this.j(canvas);
            }
            else {
                this.i(canvas);
            }
            canvas.restore();
        }
        
        private void i(final Canvas canvas) {
            final com.google.android.material.shape.j v = this.v;
            final RectF i = this.I;
            v.setBounds((int)i.left, (int)i.top, (int)i.right, (int)i.bottom);
            this.v.m0(this.J);
            this.v.A0((int)this.K);
            this.v.setShapeAppearanceModel(this.n.c());
            this.v.draw(canvas);
        }
        
        private void j(final Canvas canvas) {
            final o c = this.n.c();
            if (c.u(this.I)) {
                final float a = c.r().a(this.I);
                canvas.drawRoundRect(this.I, a, a, this.l);
            }
            else {
                canvas.drawPath(this.n.d(), this.l);
            }
        }
        
        private void k(final Canvas canvas) {
            this.n(canvas, this.k);
            final Rect bounds = this.getBounds();
            final RectF y = this.y;
            com.google.android.material.transition.platform.v.A(canvas, bounds, y.left, y.top, this.H.b, this.G.b, (v.c)new v.c() {
                @Override
                public void a(final Canvas canvas) {
                    com.google.android.material.transition.platform.l.h.this.e.draw(canvas);
                }
            });
        }
        
        private void l(final Canvas canvas) {
            this.n(canvas, this.j);
            final Rect bounds = this.getBounds();
            final RectF w = this.w;
            com.google.android.material.transition.platform.v.A(canvas, bounds, w.left, w.top, this.H.a, this.G.a, (v.c)new v.c() {
                @Override
                public void a(final Canvas canvas) {
                    com.google.android.material.transition.platform.l.h.this.a.draw(canvas);
                }
            });
        }
        
        private static PointF m(final RectF rectF) {
            return new PointF(rectF.centerX(), rectF.top);
        }
        
        private void n(final Canvas canvas, final Paint paint) {
            if (paint.getColor() != 0 && paint.getAlpha() > 0) {
                canvas.drawRect(this.getBounds(), paint);
            }
        }
        
        private void o(final float n) {
            if (this.L != n) {
                this.p(n);
            }
        }
        
        private void p(final float l) {
            this.L = l;
            final Paint m = this.m;
            float n;
            if (this.r) {
                n = com.google.android.material.transition.platform.v.n(0.0f, 255.0f, l);
            }
            else {
                n = com.google.android.material.transition.platform.v.n(255.0f, 0.0f, l);
            }
            m.setAlpha((int)n);
            this.o.getPosTan(this.p * l, this.q, (float[])null);
            final float[] q = this.q;
            final float n2 = q[0];
            final float n3 = q[1];
            final float n4 = fcmpl(l, 1.0f);
            while (true) {
                Label_0107: {
                    if (n4 > 0) {
                        break Label_0107;
                    }
                    final float n5 = n2;
                    final float n6 = n3;
                    if (l < 0.0f) {
                        break Label_0107;
                    }
                    final com.google.android.material.transition.platform.h a = this.C.a(l, androidx.core.util.n.g(this.A.b.a), androidx.core.util.n.g(this.A.b.b), this.b.width(), this.b.height(), this.f.width(), this.f.height());
                    this.H = a;
                    final RectF w = this.w;
                    final float c = a.c;
                    w.set(n5 - c / 2.0f, n6, c / 2.0f + n5, a.d + n6);
                    final RectF y = this.y;
                    final com.google.android.material.transition.platform.h h = this.H;
                    final float e = h.e;
                    y.set(n5 - e / 2.0f, n6, n5 + e / 2.0f, h.f + n6);
                    this.x.set(this.w);
                    this.z.set(this.y);
                    final float floatValue = androidx.core.util.n.g(this.A.c.a);
                    final float floatValue2 = androidx.core.util.n.g(this.A.c.b);
                    final boolean b = this.C.b(this.H);
                    RectF rectF;
                    if (b) {
                        rectF = this.x;
                    }
                    else {
                        rectF = this.z;
                    }
                    float o = com.google.android.material.transition.platform.v.o(0.0f, 1.0f, floatValue, floatValue2, l);
                    if (!b) {
                        o = 1.0f - o;
                    }
                    this.C.c(rectF, o, this.H);
                    this.I = new RectF(Math.min(this.x.left, this.z.left), Math.min(this.x.top, this.z.top), Math.max(this.x.right, this.z.right), Math.max(this.x.bottom, this.z.bottom));
                    this.n.b(l, this.c, this.g, this.w, this.x, this.z, this.A.d);
                    this.J = com.google.android.material.transition.platform.v.n(this.d, this.h, l);
                    final float d = d(this.I, this.s);
                    final float e2 = e(this.I, this.t);
                    final float j = this.J;
                    final float n7 = (float)(int)(d * j);
                    final float k = (float)(int)(e2 * j);
                    this.K = k;
                    this.l.setShadowLayer(j, n7, k, 754974720);
                    this.G = this.B.a(l, androidx.core.util.n.g(this.A.a.a), androidx.core.util.n.g(this.A.a.b), 0.35f);
                    if (this.j.getColor() != 0) {
                        this.j.setAlpha(this.G.a);
                    }
                    if (this.k.getColor() != 0) {
                        this.k.setAlpha(this.G.b);
                    }
                    this.invalidateSelf();
                    return;
                }
                float n8;
                float n9;
                if (n4 > 0) {
                    n8 = 0.99f;
                    n9 = (l - 1.0f) / 0.00999999f;
                }
                else {
                    n8 = 0.01f;
                    n9 = l / 0.01f * -1.0f;
                }
                this.o.getPosTan(this.p * n8, q, (float[])null);
                final float[] q2 = this.q;
                final float n10 = q2[0];
                final float n11 = q2[1];
                final float n12 = n2 + (n2 - n10) * n9;
                final float n13 = n3 + (n3 - n11) * n9;
                final float n5 = n12;
                final float n6 = n13;
                continue;
            }
        }
        
        public void draw(@j0 final Canvas canvas) {
            if (this.m.getAlpha() > 0) {
                canvas.drawRect(this.getBounds(), this.m);
            }
            int save;
            if (this.D) {
                save = canvas.save();
            }
            else {
                save = -1;
            }
            if (this.u && this.J > 0.0f) {
                this.h(canvas);
            }
            this.n.a(canvas);
            this.n(canvas, this.i);
            if (this.G.c) {
                this.l(canvas);
                this.k(canvas);
            }
            else {
                this.k(canvas);
                this.l(canvas);
            }
            if (this.D) {
                canvas.restoreToCount(save);
                this.f(canvas, this.w, this.F, -65281);
                this.g(canvas, this.x, -256);
                this.g(canvas, this.w, -16711936);
                this.g(canvas, this.z, -16711681);
                this.g(canvas, this.y, -16776961);
            }
        }
        
        public int getOpacity() {
            return -3;
        }
        
        public void setAlpha(final int n) {
            throw new UnsupportedOperationException("Setting alpha on is not supported");
        }
        
        public void setColorFilter(@k0 final ColorFilter colorFilter) {
            throw new UnsupportedOperationException("Setting a color filter is not supported");
        }
    }
}
