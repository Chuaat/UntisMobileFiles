// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.transition;

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
import androidx.annotation.t0;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;
import android.util.Log;
import android.graphics.drawable.Drawable;
import com.google.android.material.internal.b0;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.animation.Animator;
import android.view.ViewGroup;
import androidx.annotation.x0;
import android.content.res.TypedArray;
import com.google.android.material.shape.s;
import o2.a;
import androidx.transition.n0;
import android.graphics.RectF;
import androidx.transition.w;
import androidx.transition.b;
import androidx.annotation.j0;
import android.content.Context;
import android.os.Build$VERSION;
import com.google.android.material.shape.o;
import androidx.annotation.k0;
import android.view.View;
import androidx.annotation.y;
import androidx.transition.g0;

public final class l extends g0
{
    public static final int b1 = 0;
    public static final int c1 = 1;
    public static final int d1 = 2;
    public static final int e1 = 0;
    public static final int f1 = 1;
    public static final int g1 = 2;
    public static final int h1 = 3;
    public static final int i1 = 0;
    public static final int j1 = 1;
    public static final int k1 = 2;
    private static final String l1;
    private static final String m1 = "materialContainerTransition:bounds";
    private static final String n1 = "materialContainerTransition:shapeAppearance";
    private static final String[] o1;
    private static final f p1;
    private static final f q1;
    private static final f r1;
    private static final f s1;
    private static final float t1 = -1.0f;
    private boolean C0;
    private boolean D0;
    private boolean E0;
    private boolean F0;
    @y
    private int G0;
    @y
    private int H0;
    @y
    private int I0;
    @androidx.annotation.l
    private int J0;
    @androidx.annotation.l
    private int K0;
    @androidx.annotation.l
    private int L0;
    @androidx.annotation.l
    private int M0;
    private int N0;
    private int O0;
    private int P0;
    @k0
    private View Q0;
    @k0
    private View R0;
    @k0
    private o S0;
    @k0
    private o T0;
    @k0
    private e U0;
    @k0
    private e V0;
    @k0
    private e W0;
    @k0
    private e X0;
    private boolean Y0;
    private float Z0;
    private float a1;
    
    static {
        l1 = l.class.getSimpleName();
        o1 = new String[] { "materialContainerTransition:bounds", "materialContainerTransition:shapeAppearance" };
        p1 = new f(new e(0.0f, 0.25f), new e(0.0f, 1.0f), new e(0.0f, 1.0f), new e(0.0f, 0.75f));
        q1 = new f(new e(0.6f, 0.9f), new e(0.0f, 1.0f), new e(0.0f, 0.9f), new e(0.3f, 0.9f));
        r1 = new f(new e(0.1f, 0.4f), new e(0.1f, 1.0f), new e(0.1f, 1.0f), new e(0.1f, 0.9f));
        s1 = new f(new e(0.6f, 0.9f), new e(0.0f, 0.9f), new e(0.0f, 0.9f), new e(0.2f, 0.9f));
    }
    
    public l() {
        boolean y0 = false;
        this.C0 = false;
        this.D0 = false;
        this.E0 = false;
        this.F0 = false;
        this.G0 = 16908290;
        this.H0 = -1;
        this.I0 = -1;
        this.J0 = 0;
        this.K0 = 0;
        this.L0 = 0;
        this.M0 = 1375731712;
        this.N0 = 0;
        this.O0 = 0;
        this.P0 = 0;
        if (Build$VERSION.SDK_INT >= 28) {
            y0 = true;
        }
        this.Y0 = y0;
        this.Z0 = -1.0f;
        this.a1 = -1.0f;
    }
    
    public l(@j0 final Context context, final boolean b) {
        boolean y0 = false;
        this.C0 = false;
        this.D0 = false;
        this.E0 = false;
        this.F0 = false;
        this.G0 = 16908290;
        this.H0 = -1;
        this.I0 = -1;
        this.J0 = 0;
        this.K0 = 0;
        this.L0 = 0;
        this.M0 = 1375731712;
        this.N0 = 0;
        this.O0 = 0;
        this.P0 = 0;
        if (Build$VERSION.SDK_INT >= 28) {
            y0 = true;
        }
        this.Y0 = y0;
        this.Z0 = -1.0f;
        this.a1 = -1.0f;
        this.r1(context, b);
        this.F0 = true;
    }
    
    private f J0(final boolean b) {
        final w t = this.T();
        f f;
        f f2;
        if (!(t instanceof b) && !(t instanceof k)) {
            f = l.p1;
            f2 = l.q1;
        }
        else {
            f = l.r1;
            f2 = l.s1;
        }
        return this.j1(b, f, f2);
    }
    
    private static RectF K0(final View view, @k0 final View view2, final float n, final float n2) {
        if (view2 != null) {
            final RectF i = u.i(view2);
            i.offset(n, n2);
            return i;
        }
        return new RectF(0.0f, 0.0f, (float)view.getWidth(), (float)view.getHeight());
    }
    
    private static o L0(@j0 final View view, @j0 final RectF rectF, @k0 final o o) {
        return u.b(b1(view, o), rectF);
    }
    
    private static void M0(@j0 final n0 n0, @k0 View b, @y int d3, @k0 final o o) {
        Label_0073: {
            if (d3 != -1) {
                b = u.f(n0.b, d3);
            }
            else if (b == null) {
                b = n0.b;
                d3 = a.h.d3;
                if (!(b.getTag(d3) instanceof View)) {
                    break Label_0073;
                }
                b = (View)n0.b.getTag(d3);
                n0.b.setTag(d3, (Object)null);
            }
            n0.b = b;
        }
        final View b2 = n0.b;
        if (androidx.core.view.j0.T0(b2) || b2.getWidth() != 0 || b2.getHeight() != 0) {
            RectF rectF;
            if (b2.getParent() == null) {
                rectF = u.j(b2);
            }
            else {
                rectF = u.i(b2);
            }
            n0.a.put("materialContainerTransition:bounds", rectF);
            n0.a.put("materialContainerTransition:shapeAppearance", L0(b2, rectF, o));
        }
    }
    
    private static float P0(float p2, final View view) {
        if (p2 == -1.0f) {
            p2 = androidx.core.view.j0.P(view);
        }
        return p2;
    }
    
    private static o b1(@j0 final View view, @k0 final o o) {
        if (o != null) {
            return o;
        }
        final int d3 = a.h.d3;
        if (view.getTag(d3) instanceof o) {
            return (o)view.getTag(d3);
        }
        final Context context = view.getContext();
        final int l1 = l1(context);
        if (l1 != -1) {
            return o.b(context, l1, 0).m();
        }
        if (view instanceof s) {
            return ((s)view).getShapeAppearanceModel();
        }
        return o.a().m();
    }
    
    private f j1(final boolean b, f f, final f f2) {
        if (!b) {
            f = f2;
        }
        return new f((e)u.d(this.U0, f.a), (e)u.d(this.V0, f.b), (e)u.d(this.W0, f.c), (e)u.d(this.X0, f.d));
    }
    
    @x0
    private static int l1(final Context context) {
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[] { a.c.Nf });
        final int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }
    
    private boolean o1(@j0 final RectF rectF, @j0 final RectF rectF2) {
        final int n0 = this.N0;
        boolean b = false;
        if (n0 == 0) {
            if (u.a(rectF2) > u.a(rectF)) {
                b = true;
            }
            return b;
        }
        if (n0 == 1) {
            return true;
        }
        if (n0 == 2) {
            return false;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Invalid transition direction: ");
        sb.append(this.N0);
        throw new IllegalArgumentException(sb.toString());
    }
    
    private void r1(final Context context, final boolean b) {
        u.u(this, context, a.c.za, com.google.android.material.animation.a.b);
        int n;
        if (b) {
            n = a.c.pa;
        }
        else {
            n = a.c.sa;
        }
        u.t(this, context, n);
        if (!this.E0) {
            u.v(this, context, a.c.Ba);
        }
    }
    
    public void A1(@k0 final View r0) {
        this.R0 = r0;
    }
    
    public void B1(@y final int i0) {
        this.I0 = i0;
    }
    
    @Override
    public void C0(@k0 final w w) {
        super.C0(w);
        this.E0 = true;
    }
    
    public void C1(final int o0) {
        this.O0 = o0;
    }
    
    public void D1(@k0 final e u0) {
        this.U0 = u0;
    }
    
    public void E1(final int p) {
        this.P0 = p;
    }
    
    public void F1(final boolean d0) {
        this.D0 = d0;
    }
    
    public void G1(@k0 final e w0) {
        this.W0 = w0;
    }
    
    public void H1(@k0 final e v0) {
        this.V0 = v0;
    }
    
    public void I1(@androidx.annotation.l final int m0) {
        this.M0 = m0;
    }
    
    public void J1(@k0 final e x0) {
        this.X0 = x0;
    }
    
    public void K1(@androidx.annotation.l final int k0) {
        this.K0 = k0;
    }
    
    public void L1(final float z0) {
        this.Z0 = z0;
    }
    
    public void M1(@k0 final o s0) {
        this.S0 = s0;
    }
    
    @androidx.annotation.l
    public int N0() {
        return this.J0;
    }
    
    public void N1(@k0 final View q0) {
        this.Q0 = q0;
    }
    
    @y
    public int O0() {
        return this.G0;
    }
    
    public void O1(@y final int h0) {
        this.H0 = h0;
    }
    
    public void P1(final int n0) {
        this.N0 = n0;
    }
    
    @androidx.annotation.l
    public int Q0() {
        return this.L0;
    }
    
    public float R0() {
        return this.a1;
    }
    
    @k0
    public o S0() {
        return this.T0;
    }
    
    @k0
    public View T0() {
        return this.R0;
    }
    
    @y
    public int U0() {
        return this.I0;
    }
    
    public int V0() {
        return this.O0;
    }
    
    @k0
    public e W0() {
        return this.U0;
    }
    
    public int X0() {
        return this.P0;
    }
    
    @k0
    public e Y0() {
        return this.W0;
    }
    
    @k0
    public e Z0() {
        return this.V0;
    }
    
    @androidx.annotation.l
    public int a1() {
        return this.M0;
    }
    
    @k0
    @Override
    public String[] b0() {
        return l.o1;
    }
    
    @k0
    public e c1() {
        return this.X0;
    }
    
    @androidx.annotation.l
    public int d1() {
        return this.K0;
    }
    
    public float e1() {
        return this.Z0;
    }
    
    @k0
    public o f1() {
        return this.S0;
    }
    
    @k0
    public View h1() {
        return this.Q0;
    }
    
    @y
    public int i1() {
        return this.H0;
    }
    
    public int k1() {
        return this.N0;
    }
    
    @Override
    public void m(@j0 final n0 n0) {
        M0(n0, this.R0, this.I0, this.T0);
    }
    
    public boolean m1() {
        return this.C0;
    }
    
    public boolean n1() {
        return this.Y0;
    }
    
    public boolean p1() {
        return this.D0;
    }
    
    @Override
    public void r(@j0 final n0 n0) {
        M0(n0, this.Q0, this.H0, this.S0);
    }
    
    public void s1(@androidx.annotation.l final int l0) {
        this.J0 = l0;
        this.K0 = l0;
        this.L0 = l0;
    }
    
    public void t1(@androidx.annotation.l final int j0) {
        this.J0 = j0;
    }
    
    public void u1(final boolean c0) {
        this.C0 = c0;
    }
    
    @k0
    @Override
    public Animator v(@j0 final ViewGroup viewGroup, @k0 final n0 n0, @k0 final n0 n2) {
        if (n0 != null && n2 != null) {
            final RectF rectF = n0.a.get("materialContainerTransition:bounds");
            final o o = n0.a.get("materialContainerTransition:shapeAppearance");
            String s;
            String s2;
            if (rectF != null && o != null) {
                final RectF rectF2 = n2.a.get("materialContainerTransition:bounds");
                final o o2 = n2.a.get("materialContainerTransition:shapeAppearance");
                if (rectF2 != null && o2 != null) {
                    final View b = n0.b;
                    final View b2 = n2.b;
                    View view;
                    if (b2.getParent() != null) {
                        view = b2;
                    }
                    else {
                        view = b;
                    }
                    View e;
                    View view2;
                    if (this.G0 == view.getId()) {
                        e = (View)view.getParent();
                        view2 = view;
                    }
                    else {
                        e = u.e(view, this.G0);
                        view2 = null;
                    }
                    final RectF i = u.i(e);
                    final float n3 = -i.left;
                    final float n4 = -i.top;
                    final RectF k0 = K0(e, view2, n3, n4);
                    rectF.offset(n3, n4);
                    rectF2.offset(n3, n4);
                    final boolean o3 = this.o1(rectF, rectF2);
                    if (!this.F0) {
                        this.r1(view.getContext(), o3);
                    }
                    final h h = new h(this.T(), b, rectF, o, P0(this.Z0, b), b2, rectF2, o2, P0(this.a1, b2), this.J0, this.K0, this.L0, this.M0, o3, this.Y0, com.google.android.material.transition.b.a(this.O0, o3), com.google.android.material.transition.g.a(this.P0, o3, rectF, rectF2), this.J0(o3), this.C0);
                    h.setBounds(Math.round(k0.left), Math.round(k0.top), Math.round(k0.right), Math.round(k0.bottom));
                    final ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[] { 0.0f, 1.0f });
                    ofFloat.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new ValueAnimator$AnimatorUpdateListener() {
                        public void onAnimationUpdate(final ValueAnimator valueAnimator) {
                            h.o(valueAnimator.getAnimatedFraction());
                        }
                    });
                    this.a((g0.h)new t() {
                        @Override
                        public void a(@j0 final g0 g0) {
                            com.google.android.material.internal.b0.h(e).a(h);
                            b.setAlpha(0.0f);
                            b2.setAlpha(0.0f);
                        }
                        
                        @Override
                        public void c(@j0 final g0 g0) {
                            l.this.p0((g0.h)this);
                            if (l.this.D0) {
                                return;
                            }
                            b.setAlpha(1.0f);
                            b2.setAlpha(1.0f);
                            com.google.android.material.internal.b0.h(e).b(h);
                        }
                    });
                    return (Animator)ofFloat;
                }
                s = l.l1;
                s2 = "Skipping due to null end bounds. Ensure end view is laid out and measured.";
            }
            else {
                s = l.l1;
                s2 = "Skipping due to null start bounds. Ensure start view is laid out and measured.";
            }
            Log.w(s, s2);
            return null;
        }
        return null;
    }
    
    public void v1(@y final int g0) {
        this.G0 = g0;
    }
    
    public void w1(final boolean y0) {
        this.Y0 = y0;
    }
    
    public void x1(@androidx.annotation.l final int l0) {
        this.L0 = l0;
    }
    
    public void y1(final float a1) {
        this.a1 = a1;
    }
    
    public void z1(@k0 final o t0) {
        this.T0 = t0;
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
        @androidx.annotation.t(from = 0.0, to = 1.0)
        private final float a;
        @androidx.annotation.t(from = 0.0, to = 1.0)
        private final float b;
        
        public e(@androidx.annotation.t(from = 0.0, to = 1.0) final float a, @androidx.annotation.t(from = 0.0, to = 1.0) final float b) {
            this.a = a;
            this.b = b;
        }
        
        @androidx.annotation.t(from = 0.0, to = 1.0)
        public float c() {
            return this.b;
        }
        
        @androidx.annotation.t(from = 0.0, to = 1.0)
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
        private final com.google.android.material.transition.a B;
        private final com.google.android.material.transition.f C;
        private final boolean D;
        private final Paint E;
        private final Path F;
        private com.google.android.material.transition.c G;
        private com.google.android.material.transition.h H;
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
        
        private h(final w w, final View a, final RectF b, final o c, final float d, final View e, final RectF f, final o g, final float h, @androidx.annotation.l final int color, @androidx.annotation.l final int color2, @androidx.annotation.l final int color3, final int n, final boolean r, final boolean u, final com.google.android.material.transition.a b2, final com.google.android.material.transition.f c2, final f a2, final boolean d2) {
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
            final RectF w2 = new RectF(b);
            this.w = w2;
            this.x = new RectF(w2);
            final RectF y = new RectF(w2);
            this.y = y;
            this.z = new RectF(y);
            final PointF l = m(b);
            final PointF m2 = m(f);
            final PathMeasure o = new PathMeasure(w.a(l.x, l.y, m2.x, m2.y), false);
            this.o = o;
            this.p = o.getLength();
            q[0] = b.centerX();
            q[1] = b.top;
            m.setStyle(Paint$Style.FILL);
            m.setShader(u.c(n));
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
            com.google.android.material.transition.u.A(canvas, bounds, y.left, y.top, this.H.b, this.G.b, (u.c)new u.c() {
                @Override
                public void a(final Canvas canvas) {
                    com.google.android.material.transition.l.h.this.e.draw(canvas);
                }
            });
        }
        
        private void l(final Canvas canvas) {
            this.n(canvas, this.j);
            final Rect bounds = this.getBounds();
            final RectF w = this.w;
            com.google.android.material.transition.u.A(canvas, bounds, w.left, w.top, this.H.a, this.G.a, (u.c)new u.c() {
                @Override
                public void a(final Canvas canvas) {
                    com.google.android.material.transition.l.h.this.a.draw(canvas);
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
                n = com.google.android.material.transition.u.n(0.0f, 255.0f, l);
            }
            else {
                n = com.google.android.material.transition.u.n(255.0f, 0.0f, l);
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
                    final com.google.android.material.transition.h a = this.C.a(l, androidx.core.util.n.g(this.A.b.a), androidx.core.util.n.g(this.A.b.b), this.b.width(), this.b.height(), this.f.width(), this.f.height());
                    this.H = a;
                    final RectF w = this.w;
                    final float c = a.c;
                    w.set(n5 - c / 2.0f, n6, c / 2.0f + n5, a.d + n6);
                    final RectF y = this.y;
                    final com.google.android.material.transition.h h = this.H;
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
                    float o = com.google.android.material.transition.u.o(0.0f, 1.0f, floatValue, floatValue2, l);
                    if (!b) {
                        o = 1.0f - o;
                    }
                    this.C.c(rectF, o, this.H);
                    this.I = new RectF(Math.min(this.x.left, this.z.left), Math.min(this.x.top, this.z.top), Math.max(this.x.right, this.z.right), Math.max(this.x.bottom, this.z.bottom));
                    this.n.b(l, this.c, this.g, this.w, this.x, this.z, this.A.d);
                    this.J = com.google.android.material.transition.u.n(this.d, this.h, l);
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
