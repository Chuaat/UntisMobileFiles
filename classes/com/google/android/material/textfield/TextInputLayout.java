// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.textfield;

import android.os.Parcel;
import android.os.Parcelable$ClassLoaderCreator;
import android.os.Parcelable$Creator;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;
import androidx.annotation.s;
import androidx.annotation.w0;
import androidx.annotation.p;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import androidx.annotation.x0;
import androidx.annotation.n0;
import android.os.Parcelable;
import android.annotation.TargetApi;
import android.view.ViewStructure;
import androidx.annotation.t0;
import android.graphics.ColorFilter;
import androidx.annotation.b1;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import java.util.Arrays;
import android.widget.LinearLayout$LayoutParams;
import androidx.core.widget.r;
import android.graphics.drawable.ColorDrawable;
import android.graphics.Canvas;
import java.util.Iterator;
import android.text.TextUtils;
import android.content.res.Resources;
import androidx.appcompat.widget.u0;
import android.animation.TimeInterpolator;
import android.os.Build$VERSION;
import androidx.appcompat.widget.AppCompatTextView;
import android.view.View$OnClickListener;
import com.google.android.material.internal.b0;
import androidx.core.view.n;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import androidx.core.content.d;
import com.google.android.material.resources.c;
import com.google.android.material.internal.t;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Rect;
import android.animation.ValueAnimator;
import com.google.android.material.shape.o;
import com.google.android.material.internal.a;
import com.google.android.material.shape.j;
import androidx.annotation.l;
import android.widget.TextView;
import android.util.SparseArray;
import java.util.LinkedHashSet;
import android.widget.EditText;
import android.view.View$OnLongClickListener;
import androidx.annotation.k0;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import androidx.annotation.j0;
import com.google.android.material.internal.CheckableImageButton;
import android.graphics.Typeface;
import android.graphics.RectF;
import android.widget.LinearLayout;

public class TextInputLayout extends LinearLayout
{
    public static final int A1 = -1;
    public static final int B1 = 0;
    public static final int C1 = 1;
    public static final int D1 = 2;
    public static final int E1 = 3;
    private static final int s1;
    private static final int t1 = 167;
    private static final int u1 = -1;
    private static final int v1 = -1;
    private static final String w1 = "TextInputLayout";
    public static final int x1 = 0;
    public static final int y1 = 1;
    public static final int z1 = 2;
    private final RectF A0;
    private Typeface B0;
    @j0
    private final CheckableImageButton C0;
    private ColorStateList D0;
    private boolean E0;
    private PorterDuff$Mode F0;
    @j0
    private final FrameLayout G;
    private boolean G0;
    @j0
    private final LinearLayout H;
    @k0
    private Drawable H0;
    @j0
    private final LinearLayout I;
    private int I0;
    @j0
    private final FrameLayout J;
    private View$OnLongClickListener J0;
    EditText K;
    private final LinkedHashSet<h> K0;
    private CharSequence L;
    private int L0;
    private int M;
    private final SparseArray<com.google.android.material.textfield.e> M0;
    private int N;
    @j0
    private final CheckableImageButton N0;
    private final com.google.android.material.textfield.f O;
    private final LinkedHashSet<i> O0;
    boolean P;
    private ColorStateList P0;
    private int Q;
    private boolean Q0;
    private boolean R;
    private PorterDuff$Mode R0;
    @k0
    private TextView S;
    private boolean S0;
    private int T;
    @k0
    private Drawable T0;
    private int U;
    private int U0;
    private CharSequence V;
    private Drawable V0;
    private boolean W;
    private View$OnLongClickListener W0;
    private View$OnLongClickListener X0;
    @j0
    private final CheckableImageButton Y0;
    private ColorStateList Z0;
    private TextView a0;
    private ColorStateList a1;
    @k0
    private ColorStateList b0;
    private ColorStateList b1;
    private int c0;
    @l
    private int c1;
    @k0
    private ColorStateList d0;
    @l
    private int d1;
    @k0
    private ColorStateList e0;
    @l
    private int e1;
    @k0
    private CharSequence f0;
    private ColorStateList f1;
    @j0
    private final TextView g0;
    @l
    private int g1;
    @k0
    private CharSequence h0;
    @l
    private int h1;
    @j0
    private final TextView i0;
    @l
    private int i1;
    private boolean j0;
    @l
    private int j1;
    private CharSequence k0;
    @l
    private int k1;
    private boolean l0;
    private boolean l1;
    @k0
    private com.google.android.material.shape.j m0;
    final a m1;
    @k0
    private com.google.android.material.shape.j n0;
    private boolean n1;
    @j0
    private o o0;
    private boolean o1;
    private final int p0;
    private ValueAnimator p1;
    private int q0;
    private boolean q1;
    private int r0;
    private boolean r1;
    private int s0;
    private int t0;
    private int u0;
    private int v0;
    @l
    private int w0;
    @l
    private int x0;
    private final Rect y0;
    private final Rect z0;
    
    static {
        s1 = o2.a.n.Ca;
    }
    
    public TextInputLayout(@j0 final Context context) {
        this(context, null);
    }
    
    public TextInputLayout(@j0 final Context context, @k0 final AttributeSet set) {
        this(context, set, o2.a.c.Ge);
    }
    
    public TextInputLayout(@j0 final Context context, @k0 final AttributeSet set, int n) {
        final int s1 = TextInputLayout.s1;
        super(com.google.android.material.theme.overlay.a.c(context, set, n, s1), set, n);
        this.M = -1;
        this.N = -1;
        this.O = new com.google.android.material.textfield.f(this);
        this.y0 = new Rect();
        this.z0 = new Rect();
        this.A0 = new RectF();
        this.K0 = new LinkedHashSet<h>();
        this.L0 = 0;
        final SparseArray m0 = new SparseArray();
        this.M0 = (SparseArray<com.google.android.material.textfield.e>)m0;
        this.O0 = new LinkedHashSet<i>();
        final a m2 = new a((View)this);
        this.m1 = m2;
        final Context context2 = this.getContext();
        this.setOrientation(1);
        this.setWillNotDraw(false);
        this.setAddStatesFromChildren(true);
        final FrameLayout g = new FrameLayout(context2);
        (this.G = g).setAddStatesFromChildren(true);
        this.addView((View)g);
        final LinearLayout h = new LinearLayout(context2);
        (this.H = h).setOrientation(0);
        h.setLayoutParams((ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-2, -1, 8388611));
        g.addView((View)h);
        final LinearLayout i = new LinearLayout(context2);
        (this.I = i).setOrientation(0);
        i.setLayoutParams((ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-2, -1, 8388613));
        g.addView((View)i);
        final FrameLayout j = new FrameLayout(context2);
        (this.J = j).setLayoutParams((ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-2, -1));
        final TimeInterpolator a = com.google.android.material.animation.a.a;
        m2.G0(a);
        m2.C0(a);
        m2.g0(8388659);
        final int[] as = o2.a.o.As;
        final int vs = o2.a.o.Vs;
        final int ts = o2.a.o.Ts;
        final int it = o2.a.o.it;
        final int nt = o2.a.o.nt;
        final int rt = o2.a.o.rt;
        final u0 k = t.k(context2, set, as, n, s1, vs, ts, it, nt, rt);
        this.j0 = k.a(o2.a.o.qt, true);
        this.setHint(k.x(o2.a.o.Fs));
        this.o1 = k.a(o2.a.o.pt, true);
        this.n1 = k.a(o2.a.o.kt, true);
        final int es = o2.a.o.Es;
        if (k.C(es)) {
            this.setMinWidth(k.g(es, -1));
        }
        final int ds = o2.a.o.Ds;
        if (k.C(ds)) {
            this.setMaxWidth(k.g(ds, -1));
        }
        this.o0 = o.e(context2, set, n, s1).m();
        this.p0 = context2.getResources().getDimensionPixelOffset(o2.a.f.g6);
        this.s0 = k.f(o2.a.o.Is, 0);
        this.u0 = k.g(o2.a.o.Ps, context2.getResources().getDimensionPixelSize(o2.a.f.h6));
        this.v0 = k.g(o2.a.o.Qs, context2.getResources().getDimensionPixelSize(o2.a.f.i6));
        this.t0 = this.u0;
        final float e = k.e(o2.a.o.Ms, -1.0f);
        final float e2 = k.e(o2.a.o.Ls, -1.0f);
        final float e3 = k.e(o2.a.o.Js, -1.0f);
        final float e4 = k.e(o2.a.o.Ks, -1.0f);
        final o.b v = this.o0.v();
        if (e >= 0.0f) {
            v.K(e);
        }
        if (e2 >= 0.0f) {
            v.P(e2);
        }
        if (e3 >= 0.0f) {
            v.C(e3);
        }
        if (e4 >= 0.0f) {
            v.x(e4);
        }
        this.o0 = v.m();
        final ColorStateList b = c.b(context2, k, o2.a.o.Gs);
        if (b != null) {
            n = b.getDefaultColor();
            this.g1 = n;
            this.x0 = n;
            if (b.isStateful()) {
                this.h1 = b.getColorForState(new int[] { -16842910 }, -1);
                this.i1 = b.getColorForState(new int[] { 16842908, 16842910 }, -1);
                n = b.getColorForState(new int[] { 16843623, 16842910 }, -1);
            }
            else {
                this.i1 = this.g1;
                final ColorStateList c = androidx.appcompat.content.res.a.c(context2, o2.a.e.V1);
                this.h1 = c.getColorForState(new int[] { -16842910 }, -1);
                n = c.getColorForState(new int[] { 16843623 }, -1);
            }
            this.j1 = n;
        }
        else {
            this.x0 = 0;
            this.g1 = 0;
            this.h1 = 0;
            this.i1 = 0;
            this.j1 = 0;
        }
        n = o2.a.o.Cs;
        if (k.C(n)) {
            final ColorStateList d = k.d(n);
            this.b1 = d;
            this.a1 = d;
        }
        n = o2.a.o.Ns;
        final ColorStateList b2 = c.b(context2, k, n);
        this.e1 = k.c(n, 0);
        this.c1 = d.f(context2, o2.a.e.s2);
        this.k1 = d.f(context2, o2.a.e.t2);
        this.d1 = d.f(context2, o2.a.e.w2);
        if (b2 != null) {
            this.setBoxStrokeColorStateList(b2);
        }
        n = o2.a.o.Os;
        if (k.C(n)) {
            this.setBoxStrokeErrorColor(c.b(context2, k, n));
        }
        if (k.u(rt, -1) != -1) {
            this.setHintTextAppearance(k.u(rt, 0));
        }
        n = k.u(it, 0);
        final CharSequence x = k.x(o2.a.o.dt);
        final boolean a2 = k.a(o2.a.o.et, false);
        final LayoutInflater from = LayoutInflater.from(this.getContext());
        final int q = o2.a.k.Q;
        final CheckableImageButton y0 = (CheckableImageButton)from.inflate(q, (ViewGroup)i, false);
        (this.Y0 = y0).setId(o2.a.h.t5);
        y0.setVisibility(8);
        if (c.g(context2)) {
            n.h((ViewGroup$MarginLayoutParams)y0.getLayoutParams(), 0);
        }
        final int ft = o2.a.o.ft;
        if (k.C(ft)) {
            this.setErrorIconDrawable(k.h(ft));
        }
        final int gt = o2.a.o.gt;
        if (k.C(gt)) {
            this.setErrorIconTintList(c.b(context2, k, gt));
        }
        final int ht = o2.a.o.ht;
        if (k.C(ht)) {
            this.setErrorIconTintMode(com.google.android.material.internal.b0.k(k.o(ht, -1), null));
        }
        y0.setContentDescription(this.getResources().getText(o2.a.m.J));
        androidx.core.view.j0.P1((View)y0, 2);
        y0.setClickable(false);
        y0.setPressable(false);
        y0.setFocusable(false);
        final int u = k.u(nt, 0);
        final boolean a3 = k.a(o2.a.o.mt, false);
        final CharSequence x2 = k.x(o2.a.o.lt);
        final int u2 = k.u(o2.a.o.zt, 0);
        final CharSequence x3 = k.x(o2.a.o.yt);
        final int u3 = k.u(o2.a.o.Ct, 0);
        final CharSequence x4 = k.x(o2.a.o.Bt);
        final int u4 = k.u(o2.a.o.Mt, 0);
        final CharSequence x5 = k.x(o2.a.o.Lt);
        final boolean a4 = k.a(o2.a.o.Rs, false);
        this.setCounterMaxLength(k.o(o2.a.o.Ss, -1));
        this.U = k.u(vs, 0);
        this.T = k.u(ts, 0);
        final CheckableImageButton c2 = (CheckableImageButton)LayoutInflater.from(this.getContext()).inflate(o2.a.k.R, (ViewGroup)h, false);
        (this.C0 = c2).setVisibility(8);
        if (c.g(context2)) {
            n.g((ViewGroup$MarginLayoutParams)c2.getLayoutParams(), 0);
        }
        this.setStartIconOnClickListener(null);
        this.setStartIconOnLongClickListener(null);
        final int it2 = o2.a.o.It;
        if (k.C(it2)) {
            this.setStartIconDrawable(k.h(it2));
            final int ht2 = o2.a.o.Ht;
            if (k.C(ht2)) {
                this.setStartIconContentDescription(k.x(ht2));
            }
            this.setStartIconCheckable(k.a(o2.a.o.Gt, true));
        }
        final int jt = o2.a.o.Jt;
        if (k.C(jt)) {
            this.setStartIconTintList(c.b(context2, k, jt));
        }
        final int kt = o2.a.o.Kt;
        if (k.C(kt)) {
            this.setStartIconTintMode(com.google.android.material.internal.b0.k(k.o(kt, -1), null));
        }
        this.setBoxBackgroundMode(k.o(o2.a.o.Hs, 0));
        final CheckableImageButton n2 = (CheckableImageButton)LayoutInflater.from(this.getContext()).inflate(q, (ViewGroup)j, false);
        j.addView((View)(this.N0 = n2));
        n2.setVisibility(8);
        if (c.g(context2)) {
            n.h((ViewGroup$MarginLayoutParams)n2.getLayoutParams(), 0);
        }
        m0.append(-1, (Object)new b(this));
        m0.append(0, (Object)new com.google.android.material.textfield.h(this));
        m0.append(1, (Object)new com.google.android.material.textfield.i(this));
        m0.append(2, (Object)new com.google.android.material.textfield.a(this));
        m0.append(3, (Object)new com.google.android.material.textfield.d(this));
        final int at = o2.a.o.at;
        if (k.C(at)) {
            this.setEndIconMode(k.o(at, 0));
            final int zs = o2.a.o.Zs;
            if (k.C(zs)) {
                this.setEndIconDrawable(k.h(zs));
            }
            final int ys = o2.a.o.Ys;
            if (k.C(ys)) {
                this.setEndIconContentDescription(k.x(ys));
            }
            this.setEndIconCheckable(k.a(o2.a.o.Xs, true));
        }
        else {
            final int vt = o2.a.o.vt;
            if (k.C(vt)) {
                this.setEndIconMode(k.a(vt, false) ? 1 : 0);
                this.setEndIconDrawable(k.h(o2.a.o.ut));
                this.setEndIconContentDescription(k.x(o2.a.o.tt));
                final int wt = o2.a.o.wt;
                if (k.C(wt)) {
                    this.setEndIconTintList(c.b(context2, k, wt));
                }
                final int xt = o2.a.o.xt;
                if (k.C(xt)) {
                    this.setEndIconTintMode(com.google.android.material.internal.b0.k(k.o(xt, -1), null));
                }
            }
        }
        if (!k.C(o2.a.o.vt)) {
            final int bt = o2.a.o.bt;
            if (k.C(bt)) {
                this.setEndIconTintList(c.b(context2, k, bt));
            }
            final int ct = o2.a.o.ct;
            if (k.C(ct)) {
                this.setEndIconTintMode(com.google.android.material.internal.b0.k(k.o(ct, -1), null));
            }
        }
        final AppCompatTextView g2 = new AppCompatTextView(context2);
        (this.g0 = g2).setId(o2.a.h.z5);
        g2.setLayoutParams((ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-2, -2));
        androidx.core.view.j0.B1((View)g2, 1);
        h.addView((View)c2);
        h.addView((View)g2);
        final AppCompatTextView i2 = new AppCompatTextView(context2);
        (this.i0 = i2).setId(o2.a.h.A5);
        i2.setLayoutParams((ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-2, -2, 80));
        androidx.core.view.j0.B1((View)i2, 1);
        i.addView((View)i2);
        i.addView((View)y0);
        i.addView((View)j);
        this.setHelperTextEnabled(a3);
        this.setHelperText(x2);
        this.setHelperTextTextAppearance(u);
        this.setErrorEnabled(a2);
        this.setErrorTextAppearance(n);
        this.setErrorContentDescription(x);
        this.setCounterTextAppearance(this.U);
        this.setCounterOverflowTextAppearance(this.T);
        this.setPlaceholderText(x3);
        this.setPlaceholderTextAppearance(u2);
        this.setPrefixText(x4);
        this.setPrefixTextAppearance(u3);
        this.setSuffixText(x5);
        this.setSuffixTextAppearance(u4);
        n = o2.a.o.jt;
        if (k.C(n)) {
            this.setErrorTextColor(k.d(n));
        }
        n = o2.a.o.ot;
        if (k.C(n)) {
            this.setHelperTextColor(k.d(n));
        }
        n = o2.a.o.st;
        if (k.C(n)) {
            this.setHintTextColor(k.d(n));
        }
        n = o2.a.o.Ws;
        if (k.C(n)) {
            this.setCounterTextColor(k.d(n));
        }
        n = o2.a.o.Us;
        if (k.C(n)) {
            this.setCounterOverflowTextColor(k.d(n));
        }
        n = o2.a.o.At;
        if (k.C(n)) {
            this.setPlaceholderTextColor(k.d(n));
        }
        n = o2.a.o.Dt;
        if (k.C(n)) {
            this.setPrefixTextColor(k.d(n));
        }
        n = o2.a.o.Nt;
        if (k.C(n)) {
            this.setSuffixTextColor(k.d(n));
        }
        this.setCounterEnabled(a4);
        this.setEnabled(k.a(o2.a.o.Bs, true));
        k.I();
        androidx.core.view.j0.P1((View)this, 2);
        if (Build$VERSION.SDK_INT >= 26) {
            androidx.core.view.j0.Q1((View)this, 1);
        }
    }
    
    private void A() {
        if (this.C()) {
            ((com.google.android.material.textfield.c)this.m0).R0();
        }
    }
    
    private void A0(final boolean b) {
        if (b && this.getEndIconDrawable() != null) {
            final Drawable mutate = androidx.core.graphics.drawable.c.r(this.getEndIconDrawable()).mutate();
            androidx.core.graphics.drawable.c.n(mutate, this.O.p());
            this.N0.setImageDrawable(mutate);
        }
        else {
            this.m();
        }
    }
    
    private void B(final boolean b) {
        final ValueAnimator p = this.p1;
        if (p != null && p.isRunning()) {
            this.p1.cancel();
        }
        if (b && this.o1) {
            this.i(1.0f);
        }
        else {
            this.m1.u0(1.0f);
        }
        this.l1 = false;
        if (this.C()) {
            this.f0();
        }
        this.P0();
        this.S0();
        this.V0();
    }
    
    private void B0() {
        if (this.r0 == 1) {
            Resources resources;
            int n;
            if (c.h(this.getContext())) {
                resources = this.getResources();
                n = o2.a.f.u2;
            }
            else {
                if (!c.g(this.getContext())) {
                    return;
                }
                resources = this.getResources();
                n = o2.a.f.t2;
            }
            this.s0 = resources.getDimensionPixelSize(n);
        }
    }
    
    private boolean C() {
        return this.j0 && !TextUtils.isEmpty(this.k0) && this.m0 instanceof com.google.android.material.textfield.c;
    }
    
    private void C0(@j0 final Rect rect) {
        final com.google.android.material.shape.j n0 = this.n0;
        if (n0 != null) {
            final int bottom = rect.bottom;
            n0.setBounds(rect.left, bottom - this.v0, rect.right, bottom);
        }
    }
    
    private void D0() {
        if (this.S != null) {
            final EditText k = this.K;
            int length;
            if (k == null) {
                length = 0;
            }
            else {
                length = k.getText().length();
            }
            this.E0(length);
        }
    }
    
    private void E() {
        final Iterator<h> iterator = this.K0.iterator();
        while (iterator.hasNext()) {
            iterator.next().a(this);
        }
    }
    
    private void F(final int n) {
        final Iterator<i> iterator = this.O0.iterator();
        while (iterator.hasNext()) {
            iterator.next().a(this, n);
        }
    }
    
    private static void F0(@j0 final Context context, @j0 final TextView textView, final int i, final int j, final boolean b) {
        int n;
        if (b) {
            n = o2.a.m.F;
        }
        else {
            n = o2.a.m.E;
        }
        textView.setContentDescription((CharSequence)context.getString(n, new Object[] { i, j }));
    }
    
    private void G(final Canvas canvas) {
        final com.google.android.material.shape.j n0 = this.n0;
        if (n0 != null) {
            final Rect bounds = n0.getBounds();
            bounds.top = bounds.bottom - this.t0;
            this.n0.draw(canvas);
        }
    }
    
    private void G0() {
        final TextView s = this.S;
        if (s != null) {
            int n;
            if (this.R) {
                n = this.T;
            }
            else {
                n = this.U;
            }
            this.v0(s, n);
            if (!this.R) {
                final ColorStateList d0 = this.d0;
                if (d0 != null) {
                    this.S.setTextColor(d0);
                }
            }
            if (this.R) {
                final ColorStateList e0 = this.e0;
                if (e0 != null) {
                    this.S.setTextColor(e0);
                }
            }
        }
    }
    
    private void H(@j0 final Canvas canvas) {
        if (this.j0) {
            this.m1.m(canvas);
        }
    }
    
    private void H0() {
        if (this.C() && !this.l1 && this.q0 != this.t0) {
            this.A();
            this.f0();
        }
    }
    
    private void I(final boolean b) {
        final ValueAnimator p = this.p1;
        if (p != null && p.isRunning()) {
            this.p1.cancel();
        }
        if (b && this.o1) {
            this.i(0.0f);
        }
        else {
            this.m1.u0(0.0f);
        }
        if (this.C() && ((com.google.android.material.textfield.c)this.m0).O0()) {
            this.A();
        }
        this.l1 = true;
        this.M();
        this.S0();
        this.V0();
    }
    
    private boolean I0() {
        if (this.K == null) {
            return false;
        }
        final boolean x0 = this.x0();
        final boolean b = true;
        final boolean b2 = true;
        boolean b3 = false;
        Label_0186: {
            Label_0184: {
                if (x0) {
                    final int i0 = this.H.getMeasuredWidth() - this.K.getPaddingLeft();
                    if (this.H0 == null || this.I0 != i0) {
                        (this.H0 = (Drawable)new ColorDrawable()).setBounds(0, 0, this.I0 = i0, 1);
                    }
                    final Drawable[] h = r.h((TextView)this.K);
                    final Drawable drawable = h[0];
                    final Drawable h2 = this.H0;
                    if (drawable == h2) {
                        break Label_0184;
                    }
                    r.w((TextView)this.K, h2, h[1], h[2], h[3]);
                }
                else {
                    if (this.H0 == null) {
                        break Label_0184;
                    }
                    final Drawable[] h3 = r.h((TextView)this.K);
                    r.w((TextView)this.K, null, h3[1], h3[2], h3[3]);
                    this.H0 = null;
                }
                b3 = true;
                break Label_0186;
            }
            b3 = false;
        }
        if (this.w0()) {
            final int n = this.i0.getMeasuredWidth() - this.K.getPaddingRight();
            final CheckableImageButton endIconToUpdateDummyDrawable = this.getEndIconToUpdateDummyDrawable();
            int n2 = n;
            if (endIconToUpdateDummyDrawable != null) {
                n2 = n + ((View)endIconToUpdateDummyDrawable).getMeasuredWidth() + androidx.core.view.n.c((ViewGroup$MarginLayoutParams)((View)endIconToUpdateDummyDrawable).getLayoutParams());
            }
            final Drawable[] h4 = r.h((TextView)this.K);
            final Drawable t0 = this.T0;
            if (t0 != null && this.U0 != n2) {
                t0.setBounds(0, 0, this.U0 = n2, 1);
                r.w((TextView)this.K, h4[0], h4[1], this.T0, h4[3]);
                b3 = b;
            }
            else {
                if (t0 == null) {
                    (this.T0 = (Drawable)new ColorDrawable()).setBounds(0, 0, this.U0 = n2, 1);
                }
                final Drawable drawable2 = h4[2];
                final Drawable t2 = this.T0;
                if (drawable2 != t2) {
                    this.V0 = h4[2];
                    r.w((TextView)this.K, h4[0], h4[1], t2, h4[3]);
                    b3 = b;
                }
            }
        }
        else {
            final boolean b4 = b3;
            if (this.T0 == null) {
                return b4;
            }
            final Drawable[] h5 = r.h((TextView)this.K);
            if (h5[2] == this.T0) {
                r.w((TextView)this.K, h5[0], h5[1], this.V0, h5[3]);
                b3 = b2;
            }
            this.T0 = null;
        }
        return b3;
    }
    
    private int J(int n, final boolean b) {
        final int n2 = n += this.K.getCompoundPaddingLeft();
        if (this.f0 != null) {
            n = n2;
            if (!b) {
                n = n2 - this.g0.getMeasuredWidth() + this.g0.getPaddingLeft();
            }
        }
        return n;
    }
    
    private int K(int n, final boolean b) {
        final int n2 = n -= this.K.getCompoundPaddingRight();
        if (this.f0 != null) {
            n = n2;
            if (b) {
                n = n2 + (this.g0.getMeasuredWidth() - this.g0.getPaddingRight());
            }
        }
        return n;
    }
    
    private boolean K0() {
        if (this.K == null) {
            return false;
        }
        final int max = Math.max(this.I.getMeasuredHeight(), this.H.getMeasuredHeight());
        if (this.K.getMeasuredHeight() < max) {
            this.K.setMinimumHeight(max);
            return true;
        }
        return false;
    }
    
    private boolean L() {
        return this.L0 != 0;
    }
    
    private void L0() {
        if (this.r0 != 1) {
            final LinearLayout$LayoutParams linearLayout$LayoutParams = (LinearLayout$LayoutParams)this.G.getLayoutParams();
            final int v = this.v();
            if (v != linearLayout$LayoutParams.topMargin) {
                linearLayout$LayoutParams.topMargin = v;
                this.G.requestLayout();
            }
        }
    }
    
    private void M() {
        final TextView a0 = this.a0;
        if (a0 != null && this.W) {
            a0.setText((CharSequence)null);
            this.a0.setVisibility(4);
        }
    }
    
    private void N0(final boolean b, final boolean b2) {
        final boolean enabled = this.isEnabled();
        final EditText k = this.K;
        final boolean b3 = k != null && !TextUtils.isEmpty((CharSequence)k.getText());
        final EditText i = this.K;
        final boolean b4 = i != null && i.hasFocus();
        final boolean l = this.O.l();
        final ColorStateList a1 = this.a1;
        if (a1 != null) {
            this.m1.f0(a1);
            this.m1.p0(this.a1);
        }
        Label_0267: {
            if (!enabled) {
                final ColorStateList a2 = this.a1;
                int n;
                if (a2 != null) {
                    n = a2.getColorForState(new int[] { -16842910 }, this.k1);
                }
                else {
                    n = this.k1;
                }
                this.m1.f0(ColorStateList.valueOf(n));
                this.m1.p0(ColorStateList.valueOf(n));
            }
            else if (l) {
                this.m1.f0(this.O.q());
            }
            else {
                while (true) {
                    Label_0242: {
                        if (!this.R) {
                            break Label_0242;
                        }
                        final TextView s = this.S;
                        if (s == null) {
                            break Label_0242;
                        }
                        final a a3 = this.m1;
                        final ColorStateList list = s.getTextColors();
                        a3.f0(list);
                        break Label_0267;
                    }
                    if (b4) {
                        final ColorStateList list = this.b1;
                        if (list != null) {
                            final a a3 = this.m1;
                            continue;
                        }
                    }
                    break;
                }
            }
        }
        if (!b3 && this.n1 && (!this.isEnabled() || !b4)) {
            if (b2 || !this.l1) {
                this.I(b);
            }
        }
        else if (b2 || this.l1) {
            this.B(b);
        }
    }
    
    private void O0() {
        if (this.a0 != null) {
            final EditText k = this.K;
            if (k != null) {
                this.a0.setGravity(k.getGravity());
                this.a0.setPadding(this.K.getCompoundPaddingLeft(), this.K.getCompoundPaddingTop(), this.K.getCompoundPaddingRight(), this.K.getCompoundPaddingBottom());
            }
        }
    }
    
    private void P0() {
        final EditText k = this.K;
        int length;
        if (k == null) {
            length = 0;
        }
        else {
            length = k.getText().length();
        }
        this.Q0(length);
    }
    
    private void Q0(final int n) {
        if (n == 0 && !this.l1) {
            this.z0();
        }
        else {
            this.M();
        }
    }
    
    private boolean R() {
        return this.Y0.getVisibility() == 0;
    }
    
    private void R0() {
        if (this.K == null) {
            return;
        }
        int j0;
        if (this.c0()) {
            j0 = 0;
        }
        else {
            j0 = androidx.core.view.j0.j0((View)this.K);
        }
        androidx.core.view.j0.b2((View)this.g0, j0, this.K.getCompoundPaddingTop(), this.getContext().getResources().getDimensionPixelSize(o2.a.f.y2), this.K.getCompoundPaddingBottom());
    }
    
    private void S0() {
        final TextView g0 = this.g0;
        int visibility;
        if (this.f0 != null && !this.X()) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        g0.setVisibility(visibility);
        this.I0();
    }
    
    private void T0(final boolean b, final boolean b2) {
        final int defaultColor = this.f1.getDefaultColor();
        final int colorForState = this.f1.getColorForState(new int[] { 16843623, 16842910 }, defaultColor);
        final int colorForState2 = this.f1.getColorForState(new int[] { 16843518, 16842910 }, defaultColor);
        if (b) {
            this.w0 = colorForState2;
        }
        else if (b2) {
            this.w0 = colorForState;
        }
        else {
            this.w0 = defaultColor;
        }
    }
    
    private void U0() {
        if (this.K == null) {
            return;
        }
        int i0;
        if (!this.P() && !this.R()) {
            i0 = androidx.core.view.j0.i0((View)this.K);
        }
        else {
            i0 = 0;
        }
        androidx.core.view.j0.b2((View)this.i0, this.getContext().getResources().getDimensionPixelSize(o2.a.f.y2), this.K.getPaddingTop(), i0, this.K.getPaddingBottom());
    }
    
    private void V0() {
        final int visibility = this.i0.getVisibility();
        final CharSequence h0 = this.h0;
        int visibility2 = 0;
        final boolean b = h0 != null && !this.X();
        final TextView i0 = this.i0;
        if (!b) {
            visibility2 = 8;
        }
        i0.setVisibility(visibility2);
        if (visibility != this.i0.getVisibility()) {
            this.getEndIconDelegate().c(b);
        }
        this.I0();
    }
    
    private boolean a0() {
        final int r0 = this.r0;
        final boolean b = true;
        if (r0 == 1) {
            boolean b2 = b;
            if (Build$VERSION.SDK_INT < 16) {
                return b2;
            }
            if (this.K.getMinLines() <= 1) {
                b2 = b;
                return b2;
            }
        }
        return false;
    }
    
    private int[] d0(final CheckableImageButton checkableImageButton) {
        final int[] drawableState = this.getDrawableState();
        final int[] drawableState2 = checkableImageButton.getDrawableState();
        final int length = drawableState.length;
        final int[] copy = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, copy, length, drawableState2.length);
        return copy;
    }
    
    private void e0() {
        this.p();
        this.r0();
        this.W0();
        this.B0();
        this.h();
        if (this.r0 != 0) {
            this.L0();
        }
    }
    
    private void f0() {
        if (!this.C()) {
            return;
        }
        final RectF a0 = this.A0;
        this.m1.p(a0, this.K.getWidth(), this.K.getGravity());
        this.l(a0);
        final int t0 = this.t0;
        this.q0 = t0;
        a0.top = 0.0f;
        a0.bottom = (float)t0;
        a0.offset((float)(-this.getPaddingLeft()), 0.0f);
        ((com.google.android.material.textfield.c)this.m0).U0(a0);
    }
    
    private void g() {
        final TextView a0 = this.a0;
        if (a0 != null) {
            this.G.addView((View)a0);
            this.a0.setVisibility(0);
        }
    }
    
    private com.google.android.material.textfield.e getEndIconDelegate() {
        com.google.android.material.textfield.e e = (com.google.android.material.textfield.e)this.M0.get(this.L0);
        if (e == null) {
            e = (com.google.android.material.textfield.e)this.M0.get(0);
        }
        return e;
    }
    
    @k0
    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.Y0.getVisibility() == 0) {
            return this.Y0;
        }
        if (this.L() && this.P()) {
            return this.N0;
        }
        return null;
    }
    
    private void h() {
        if (this.K != null) {
            if (this.r0 == 1) {
                EditText editText;
                int n;
                int n2;
                int n3;
                Resources resources;
                int n4;
                if (c.h(this.getContext())) {
                    editText = this.K;
                    n = androidx.core.view.j0.j0((View)editText);
                    n2 = this.getResources().getDimensionPixelSize(o2.a.f.s2);
                    n3 = androidx.core.view.j0.i0((View)this.K);
                    resources = this.getResources();
                    n4 = o2.a.f.r2;
                }
                else {
                    if (!c.g(this.getContext())) {
                        return;
                    }
                    editText = this.K;
                    n = androidx.core.view.j0.j0((View)editText);
                    n2 = this.getResources().getDimensionPixelSize(o2.a.f.q2);
                    n3 = androidx.core.view.j0.i0((View)this.K);
                    resources = this.getResources();
                    n4 = o2.a.f.p2;
                }
                androidx.core.view.j0.b2((View)editText, n, n2, n3, resources.getDimensionPixelSize(n4));
            }
        }
    }
    
    private static void h0(@j0 final ViewGroup viewGroup, final boolean enabled) {
        for (int childCount = viewGroup.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = viewGroup.getChildAt(i);
            child.setEnabled(enabled);
            if (child instanceof ViewGroup) {
                h0((ViewGroup)child, enabled);
            }
        }
    }
    
    private void j() {
        final com.google.android.material.shape.j m0 = this.m0;
        if (m0 == null) {
            return;
        }
        m0.setShapeAppearanceModel(this.o0);
        if (this.w()) {
            this.m0.C0((float)this.t0, this.w0);
        }
        final int q = this.q();
        this.x0 = q;
        this.m0.n0(ColorStateList.valueOf(q));
        if (this.L0 == 3) {
            this.K.getBackground().invalidateSelf();
        }
        this.k();
        this.invalidate();
    }
    
    private void k() {
        if (this.n0 == null) {
            return;
        }
        if (this.x()) {
            this.n0.n0(ColorStateList.valueOf(this.w0));
        }
        this.invalidate();
    }
    
    private void k0(final CheckableImageButton checkableImageButton, final ColorStateList list) {
        final Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() != null && list != null) {
            if (list.isStateful()) {
                final int colorForState = list.getColorForState(this.d0(checkableImageButton), list.getDefaultColor());
                final Drawable mutate = androidx.core.graphics.drawable.c.r(drawable).mutate();
                androidx.core.graphics.drawable.c.o(mutate, ColorStateList.valueOf(colorForState));
                checkableImageButton.setImageDrawable(mutate);
            }
        }
    }
    
    private void l(@j0 final RectF rectF) {
        final float left = rectF.left;
        final int p = this.p0;
        rectF.left = left - p;
        rectF.right += p;
    }
    
    private void m() {
        this.n(this.N0, this.Q0, this.P0, this.S0, this.R0);
    }
    
    private void n(@j0 final CheckableImageButton checkableImageButton, final boolean b, final ColorStateList list, final boolean b2, final PorterDuff$Mode porterDuff$Mode) {
        Drawable drawable2;
        final Drawable drawable = drawable2 = checkableImageButton.getDrawable();
        Label_0068: {
            if (drawable != null) {
                if (!b) {
                    drawable2 = drawable;
                    if (!b2) {
                        break Label_0068;
                    }
                }
                final Drawable mutate = androidx.core.graphics.drawable.c.r(drawable).mutate();
                if (b) {
                    androidx.core.graphics.drawable.c.o(mutate, list);
                }
                drawable2 = mutate;
                if (b2) {
                    androidx.core.graphics.drawable.c.p(mutate, porterDuff$Mode);
                    drawable2 = mutate;
                }
            }
        }
        if (checkableImageButton.getDrawable() != drawable2) {
            checkableImageButton.setImageDrawable(drawable2);
        }
    }
    
    private void o() {
        this.n(this.C0, this.E0, this.D0, this.G0, this.F0);
    }
    
    private void o0() {
        final TextView a0 = this.a0;
        if (a0 != null) {
            a0.setVisibility(8);
        }
    }
    
    private void p() {
        final int r0 = this.r0;
        if (r0 != 0) {
            if (r0 == 1) {
                this.m0 = new com.google.android.material.shape.j(this.o0);
                this.n0 = new com.google.android.material.shape.j();
                return;
            }
            if (r0 != 2) {
                final StringBuilder sb = new StringBuilder();
                sb.append(this.r0);
                sb.append(" is illegal; only @BoxBackgroundMode constants are supported.");
                throw new IllegalArgumentException(sb.toString());
            }
            com.google.android.material.shape.j m0;
            if (this.j0 && !(this.m0 instanceof com.google.android.material.textfield.c)) {
                m0 = new com.google.android.material.textfield.c(this.o0);
            }
            else {
                m0 = new com.google.android.material.shape.j(this.o0);
            }
            this.m0 = m0;
        }
        else {
            this.m0 = null;
        }
        this.n0 = null;
    }
    
    private int q() {
        int n = this.x0;
        if (this.r0 == 1) {
            n = s2.a.g(s2.a.e((View)this, o2.a.c.P2, 0), this.x0);
        }
        return n;
    }
    
    @j0
    private Rect r(@j0 final Rect rect) {
        if (this.K != null) {
            final Rect z0 = this.z0;
            final boolean b = androidx.core.view.j0.X((View)this) == 1;
            z0.bottom = rect.bottom;
            final int r0 = this.r0;
            int k = 0;
            Label_0089: {
                int paddingTop;
                if (r0 != 1) {
                    if (r0 == 2) {
                        z0.left = rect.left + this.K.getPaddingLeft();
                        z0.top = rect.top - this.v();
                        k = rect.right - this.K.getPaddingRight();
                        break Label_0089;
                    }
                    z0.left = this.J(rect.left, b);
                    paddingTop = this.getPaddingTop();
                }
                else {
                    z0.left = this.J(rect.left, b);
                    paddingTop = rect.top + this.s0;
                }
                z0.top = paddingTop;
                k = this.K(rect.right, b);
            }
            z0.right = k;
            return z0;
        }
        throw new IllegalStateException();
    }
    
    private void r0() {
        if (this.y0()) {
            androidx.core.view.j0.G1((View)this.K, this.m0);
        }
    }
    
    private int s(@j0 final Rect rect, @j0 final Rect rect2, final float n) {
        if (this.a0()) {
            return (int)(rect2.top + n);
        }
        return rect.bottom - this.K.getCompoundPaddingBottom();
    }
    
    private static void s0(@j0 final CheckableImageButton checkableImageButton, @k0 final View$OnLongClickListener view$OnLongClickListener) {
        final boolean j0 = androidx.core.view.j0.J0((View)checkableImageButton);
        boolean focusable = false;
        int n = 1;
        final boolean longClickable = view$OnLongClickListener != null;
        if (j0 || longClickable) {
            focusable = true;
        }
        checkableImageButton.setFocusable(focusable);
        checkableImageButton.setClickable(j0);
        checkableImageButton.setPressable(j0);
        checkableImageButton.setLongClickable(longClickable);
        if (!focusable) {
            n = 2;
        }
        androidx.core.view.j0.P1((View)checkableImageButton, n);
    }
    
    private void setEditText(final EditText k) {
        if (this.K == null) {
            if (this.L0 != 3 && !(k instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.K = k;
            this.setMinWidth(this.M);
            this.setMaxWidth(this.N);
            this.e0();
            this.setTextInputAccessibilityDelegate(new e(this));
            this.m1.H0(this.K.getTypeface());
            this.m1.r0(this.K.getTextSize());
            final int gravity = this.K.getGravity();
            this.m1.g0((gravity & 0xFFFFFF8F) | 0x30);
            this.m1.q0(gravity);
            this.K.addTextChangedListener((TextWatcher)new TextWatcher() {
                public void afterTextChanged(@j0 final Editable editable) {
                    final TextInputLayout g = TextInputLayout.this;
                    g.M0(g.r1 ^ true);
                    final TextInputLayout g2 = TextInputLayout.this;
                    if (g2.P) {
                        g2.E0(editable.length());
                    }
                    if (TextInputLayout.this.W) {
                        TextInputLayout.this.Q0(editable.length());
                    }
                }
                
                public void beforeTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
                }
                
                public void onTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
                }
            });
            if (this.a1 == null) {
                this.a1 = this.K.getHintTextColors();
            }
            if (this.j0) {
                if (TextUtils.isEmpty(this.k0)) {
                    this.setHint(this.L = this.K.getHint());
                    this.K.setHint((CharSequence)null);
                }
                this.l0 = true;
            }
            if (this.S != null) {
                this.E0(this.K.getText().length());
            }
            this.J0();
            this.O.e();
            this.H.bringToFront();
            this.I.bringToFront();
            this.J.bringToFront();
            this.Y0.bringToFront();
            this.E();
            this.R0();
            this.U0();
            if (!this.isEnabled()) {
                k.setEnabled(false);
            }
            this.N0(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }
    
    private void setErrorIconVisible(final boolean b) {
        final CheckableImageButton y0 = this.Y0;
        final int n = 0;
        int visibility;
        if (b) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        y0.setVisibility(visibility);
        final FrameLayout j = this.J;
        int visibility2 = n;
        if (b) {
            visibility2 = 8;
        }
        j.setVisibility(visibility2);
        this.U0();
        if (!this.L()) {
            this.I0();
        }
    }
    
    private void setHintInternal(final CharSequence k0) {
        if (!TextUtils.equals(k0, this.k0)) {
            this.k0 = k0;
            this.m1.F0(k0);
            if (!this.l1) {
                this.f0();
            }
        }
    }
    
    private void setPlaceholderTextEnabled(final boolean w) {
        if (this.W == w) {
            return;
        }
        if (w) {
            (this.a0 = new AppCompatTextView(this.getContext())).setId(o2.a.h.y5);
            androidx.core.view.j0.B1((View)this.a0, 1);
            this.setPlaceholderTextAppearance(this.c0);
            this.setPlaceholderTextColor(this.b0);
            this.g();
        }
        else {
            this.o0();
            this.a0 = null;
        }
        this.W = w;
    }
    
    private int t(@j0 final Rect rect, final float n) {
        if (this.a0()) {
            return (int)(rect.centerY() - n / 2.0f);
        }
        return rect.top + this.K.getCompoundPaddingTop();
    }
    
    private static void t0(@j0 final CheckableImageButton checkableImageButton, @k0 final View$OnClickListener onClickListener, @k0 final View$OnLongClickListener view$OnLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        s0(checkableImageButton, view$OnLongClickListener);
    }
    
    @j0
    private Rect u(@j0 final Rect rect) {
        if (this.K != null) {
            final Rect z0 = this.z0;
            final float d = this.m1.D();
            z0.left = rect.left + this.K.getCompoundPaddingLeft();
            z0.top = this.t(rect, d);
            z0.right = rect.right - this.K.getCompoundPaddingRight();
            z0.bottom = this.s(rect, z0, d);
            return z0;
        }
        throw new IllegalStateException();
    }
    
    private static void u0(@j0 final CheckableImageButton checkableImageButton, @k0 final View$OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        s0(checkableImageButton, onLongClickListener);
    }
    
    private int v() {
        if (!this.j0) {
            return 0;
        }
        final int r0 = this.r0;
        float s;
        if (r0 != 0 && r0 != 1) {
            if (r0 != 2) {
                return 0;
            }
            s = this.m1.s() / 2.0f;
        }
        else {
            s = this.m1.s();
        }
        return (int)s;
    }
    
    private boolean w() {
        return this.r0 == 2 && this.x();
    }
    
    private boolean w0() {
        return (this.Y0.getVisibility() == 0 || (this.L() && this.P()) || this.h0 != null) && this.I.getMeasuredWidth() > 0;
    }
    
    private boolean x() {
        return this.t0 > -1 && this.w0 != 0;
    }
    
    private boolean x0() {
        return (this.getStartIconDrawable() != null || this.f0 != null) && this.H.getMeasuredWidth() > 0;
    }
    
    private boolean y0() {
        final EditText k = this.K;
        return k != null && this.m0 != null && k.getBackground() == null && this.r0 != 0;
    }
    
    private void z0() {
        final TextView a0 = this.a0;
        if (a0 != null && this.W) {
            a0.setText(this.V);
            this.a0.setVisibility(0);
            this.a0.bringToFront();
        }
    }
    
    @b1
    boolean D() {
        return this.C() && ((com.google.android.material.textfield.c)this.m0).O0();
    }
    
    void E0(final int n) {
        final boolean r = this.R;
        final int q = this.Q;
        if (q == -1) {
            this.S.setText((CharSequence)String.valueOf(n));
            this.S.setContentDescription((CharSequence)null);
            this.R = false;
        }
        else {
            this.R = (n > q);
            F0(this.getContext(), this.S, n, this.Q, this.R);
            if (r != this.R) {
                this.G0();
            }
            this.S.setText((CharSequence)androidx.core.text.a.c().q(this.getContext().getString(o2.a.m.G, new Object[] { n, this.Q })));
        }
        if (this.K != null && r != this.R) {
            this.M0(false);
            this.W0();
            this.J0();
        }
    }
    
    void J0() {
        final EditText k = this.K;
        if (k != null) {
            if (this.r0 == 0) {
                final Drawable background = k.getBackground();
                if (background == null) {
                    return;
                }
                Drawable mutate = background;
                if (androidx.appcompat.widget.b0.a(background)) {
                    mutate = background.mutate();
                }
                int n = 0;
                Label_0061: {
                    if (!this.O.l()) {
                        if (this.R) {
                            final TextView s = this.S;
                            if (s != null) {
                                n = s.getCurrentTextColor();
                                break Label_0061;
                            }
                        }
                        androidx.core.graphics.drawable.c.c(mutate);
                        this.K.refreshDrawableState();
                        return;
                    }
                    n = this.O.p();
                }
                mutate.setColorFilter((ColorFilter)androidx.appcompat.widget.j.e(n, PorterDuff$Mode.SRC_IN));
            }
        }
    }
    
    void M0(final boolean b) {
        this.N0(b, false);
    }
    
    public boolean N() {
        return this.P;
    }
    
    public boolean O() {
        return this.N0.a();
    }
    
    public boolean P() {
        return this.J.getVisibility() == 0 && this.N0.getVisibility() == 0;
    }
    
    public boolean Q() {
        return this.O.C();
    }
    
    public boolean S() {
        return this.n1;
    }
    
    @b1
    final boolean T() {
        return this.O.v();
    }
    
    public boolean U() {
        return this.O.D();
    }
    
    public boolean V() {
        return this.o1;
    }
    
    public boolean W() {
        return this.j0;
    }
    
    void W0() {
        if (this.m0 != null) {
            if (this.r0 != 0) {
                final boolean focused = this.isFocused();
                final boolean b = false;
                boolean b2 = false;
                Label_0054: {
                    if (!focused) {
                        final EditText k = this.K;
                        if (k == null || !k.hasFocus()) {
                            b2 = false;
                            break Label_0054;
                        }
                    }
                    b2 = true;
                }
                boolean b3 = false;
                Label_0089: {
                    if (!this.isHovered()) {
                        final EditText i = this.K;
                        if (i == null || !i.isHovered()) {
                            b3 = false;
                            break Label_0089;
                        }
                    }
                    b3 = true;
                }
                Label_0221: {
                    int w0 = 0;
                    Label_0102: {
                        if (this.isEnabled()) {
                            Label_0128: {
                                if (this.O.l()) {
                                    if (this.f1 == null) {
                                        w0 = this.O.p();
                                        break Label_0102;
                                    }
                                }
                                else {
                                    if (this.R) {
                                        final TextView s = this.S;
                                        if (s != null) {
                                            if (this.f1 != null) {
                                                break Label_0128;
                                            }
                                            w0 = s.getCurrentTextColor();
                                            break Label_0102;
                                        }
                                    }
                                    if (b2) {
                                        w0 = this.e1;
                                        break Label_0102;
                                    }
                                    if (b3) {
                                        w0 = this.d1;
                                        break Label_0102;
                                    }
                                    w0 = this.c1;
                                    break Label_0102;
                                }
                            }
                            this.T0(b2, b3);
                            break Label_0221;
                        }
                        w0 = this.k1;
                    }
                    this.w0 = w0;
                }
                boolean errorIconVisible = b;
                if (this.getErrorIconDrawable() != null) {
                    errorIconVisible = b;
                    if (this.O.C()) {
                        errorIconVisible = b;
                        if (this.O.l()) {
                            errorIconVisible = true;
                        }
                    }
                }
                this.setErrorIconVisible(errorIconVisible);
                this.j0();
                this.l0();
                this.i0();
                if (this.getEndIconDelegate().d()) {
                    this.A0(this.O.l());
                }
                int t0;
                if (b2 && this.isEnabled()) {
                    t0 = this.v0;
                }
                else {
                    t0 = this.u0;
                }
                this.t0 = t0;
                if (this.r0 == 2) {
                    this.H0();
                }
                if (this.r0 == 1) {
                    int x0;
                    if (!this.isEnabled()) {
                        x0 = this.h1;
                    }
                    else if (b3 && !b2) {
                        x0 = this.j1;
                    }
                    else if (b2) {
                        x0 = this.i1;
                    }
                    else {
                        x0 = this.g1;
                    }
                    this.x0 = x0;
                }
                this.j();
            }
        }
    }
    
    @b1
    final boolean X() {
        return this.l1;
    }
    
    @Deprecated
    public boolean Y() {
        final int l0 = this.L0;
        boolean b = true;
        if (l0 != 1) {
            b = false;
        }
        return b;
    }
    
    @t0({ androidx.annotation.t0.a.H })
    public boolean Z() {
        return this.l0;
    }
    
    public void addView(@j0 final View view, final int n, @j0 final ViewGroup$LayoutParams layoutParams) {
        if (view instanceof EditText) {
            final FrameLayout$LayoutParams frameLayout$LayoutParams = new FrameLayout$LayoutParams(layoutParams);
            frameLayout$LayoutParams.gravity = ((frameLayout$LayoutParams.gravity & 0xFFFFFF8F) | 0x10);
            this.G.addView(view, (ViewGroup$LayoutParams)frameLayout$LayoutParams);
            this.G.setLayoutParams(layoutParams);
            this.L0();
            this.setEditText((EditText)view);
        }
        else {
            super.addView(view, n, layoutParams);
        }
    }
    
    public boolean b0() {
        return this.C0.a();
    }
    
    public boolean c0() {
        return this.C0.getVisibility() == 0;
    }
    
    @TargetApi(26)
    public void dispatchProvideAutofillStructure(@j0 final ViewStructure viewStructure, final int n) {
        final EditText k = this.K;
        if (k == null) {
            super.dispatchProvideAutofillStructure(viewStructure, n);
            return;
        }
        final CharSequence l = this.L;
        int i = 0;
        if (l != null) {
            final boolean l2 = this.l0;
            this.l0 = false;
            final CharSequence hint = k.getHint();
            this.K.setHint(this.L);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, n);
                return;
            }
            finally {
                this.K.setHint(hint);
                this.l0 = l2;
            }
        }
        viewStructure.setAutofillId(this.getAutofillId());
        this.onProvideAutofillStructure(viewStructure, n);
        this.onProvideAutofillVirtualStructure(viewStructure, n);
        viewStructure.setChildCount(this.G.getChildCount());
        while (i < this.G.getChildCount()) {
            final View child = this.G.getChildAt(i);
            final ViewStructure child2 = viewStructure.newChild(i);
            child.dispatchProvideAutofillStructure(child2, n);
            if (child == this.K) {
                child2.setHint(this.getHint());
            }
            ++i;
        }
    }
    
    protected void dispatchRestoreInstanceState(@j0 final SparseArray<Parcelable> sparseArray) {
        this.r1 = true;
        super.dispatchRestoreInstanceState((SparseArray)sparseArray);
        this.r1 = false;
    }
    
    public void draw(@j0 final Canvas canvas) {
        super.draw(canvas);
        this.H(canvas);
        this.G(canvas);
    }
    
    protected void drawableStateChanged() {
        if (this.q1) {
            return;
        }
        boolean b = true;
        this.q1 = true;
        super.drawableStateChanged();
        final int[] drawableState = this.getDrawableState();
        final a m1 = this.m1;
        final boolean b2 = m1 != null && (m1.E0(drawableState) | false);
        if (this.K != null) {
            if (!androidx.core.view.j0.T0((View)this) || !this.isEnabled()) {
                b = false;
            }
            this.M0(b);
        }
        this.J0();
        this.W0();
        if (b2) {
            this.invalidate();
        }
        this.q1 = false;
    }
    
    public void e(@j0 final h e) {
        this.K0.add(e);
        if (this.K != null) {
            e.a(this);
        }
    }
    
    public void f(@j0 final i e) {
        this.O0.add(e);
    }
    
    @Deprecated
    public void g0(final boolean b) {
        if (this.L0 == 1) {
            this.N0.performClick();
            if (b) {
                this.N0.jumpDrawablesToCurrentState();
            }
        }
    }
    
    public int getBaseline() {
        final EditText k = this.K;
        if (k != null) {
            return k.getBaseline() + this.getPaddingTop() + this.v();
        }
        return super.getBaseline();
    }
    
    @j0
    com.google.android.material.shape.j getBoxBackground() {
        final int r0 = this.r0;
        if (r0 != 1 && r0 != 2) {
            throw new IllegalStateException();
        }
        return this.m0;
    }
    
    public int getBoxBackgroundColor() {
        return this.x0;
    }
    
    public int getBoxBackgroundMode() {
        return this.r0;
    }
    
    public float getBoxCornerRadiusBottomEnd() {
        return this.m0.t();
    }
    
    public float getBoxCornerRadiusBottomStart() {
        return this.m0.u();
    }
    
    public float getBoxCornerRadiusTopEnd() {
        return this.m0.S();
    }
    
    public float getBoxCornerRadiusTopStart() {
        return this.m0.R();
    }
    
    public int getBoxStrokeColor() {
        return this.e1;
    }
    
    @k0
    public ColorStateList getBoxStrokeErrorColor() {
        return this.f1;
    }
    
    public int getBoxStrokeWidth() {
        return this.u0;
    }
    
    public int getBoxStrokeWidthFocused() {
        return this.v0;
    }
    
    public int getCounterMaxLength() {
        return this.Q;
    }
    
    @k0
    CharSequence getCounterOverflowDescription() {
        if (this.P && this.R) {
            final TextView s = this.S;
            if (s != null) {
                return s.getContentDescription();
            }
        }
        return null;
    }
    
    @k0
    public ColorStateList getCounterOverflowTextColor() {
        return this.d0;
    }
    
    @k0
    public ColorStateList getCounterTextColor() {
        return this.d0;
    }
    
    @k0
    public ColorStateList getDefaultHintTextColor() {
        return this.a1;
    }
    
    @k0
    public EditText getEditText() {
        return this.K;
    }
    
    @k0
    public CharSequence getEndIconContentDescription() {
        return this.N0.getContentDescription();
    }
    
    @k0
    public Drawable getEndIconDrawable() {
        return this.N0.getDrawable();
    }
    
    public int getEndIconMode() {
        return this.L0;
    }
    
    @j0
    CheckableImageButton getEndIconView() {
        return this.N0;
    }
    
    @k0
    public CharSequence getError() {
        CharSequence o;
        if (this.O.C()) {
            o = this.O.o();
        }
        else {
            o = null;
        }
        return o;
    }
    
    @k0
    public CharSequence getErrorContentDescription() {
        return this.O.n();
    }
    
    @l
    public int getErrorCurrentTextColors() {
        return this.O.p();
    }
    
    @k0
    public Drawable getErrorIconDrawable() {
        return this.Y0.getDrawable();
    }
    
    @b1
    final int getErrorTextCurrentColor() {
        return this.O.p();
    }
    
    @k0
    public CharSequence getHelperText() {
        CharSequence r;
        if (this.O.D()) {
            r = this.O.r();
        }
        else {
            r = null;
        }
        return r;
    }
    
    @l
    public int getHelperTextCurrentTextColor() {
        return this.O.t();
    }
    
    @k0
    public CharSequence getHint() {
        CharSequence k0;
        if (this.j0) {
            k0 = this.k0;
        }
        else {
            k0 = null;
        }
        return k0;
    }
    
    @b1
    final float getHintCollapsedTextHeight() {
        return this.m1.s();
    }
    
    @b1
    final int getHintCurrentCollapsedTextColor() {
        return this.m1.x();
    }
    
    @k0
    public ColorStateList getHintTextColor() {
        return this.b1;
    }
    
    @n0
    public int getMaxWidth() {
        return this.N;
    }
    
    @n0
    public int getMinWidth() {
        return this.M;
    }
    
    @Deprecated
    @k0
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.N0.getContentDescription();
    }
    
    @Deprecated
    @k0
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.N0.getDrawable();
    }
    
    @k0
    public CharSequence getPlaceholderText() {
        CharSequence v;
        if (this.W) {
            v = this.V;
        }
        else {
            v = null;
        }
        return v;
    }
    
    @x0
    public int getPlaceholderTextAppearance() {
        return this.c0;
    }
    
    @k0
    public ColorStateList getPlaceholderTextColor() {
        return this.b0;
    }
    
    @k0
    public CharSequence getPrefixText() {
        return this.f0;
    }
    
    @k0
    public ColorStateList getPrefixTextColor() {
        return this.g0.getTextColors();
    }
    
    @j0
    public TextView getPrefixTextView() {
        return this.g0;
    }
    
    @k0
    public CharSequence getStartIconContentDescription() {
        return this.C0.getContentDescription();
    }
    
    @k0
    public Drawable getStartIconDrawable() {
        return this.C0.getDrawable();
    }
    
    @k0
    public CharSequence getSuffixText() {
        return this.h0;
    }
    
    @k0
    public ColorStateList getSuffixTextColor() {
        return this.i0.getTextColors();
    }
    
    @j0
    public TextView getSuffixTextView() {
        return this.i0;
    }
    
    @k0
    public Typeface getTypeface() {
        return this.B0;
    }
    
    @b1
    void i(final float n) {
        if (this.m1.G() == n) {
            return;
        }
        if (this.p1 == null) {
            (this.p1 = new ValueAnimator()).setInterpolator(com.google.android.material.animation.a.b);
            this.p1.setDuration(167L);
            this.p1.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new ValueAnimator$AnimatorUpdateListener() {
                public void onAnimationUpdate(@j0 final ValueAnimator valueAnimator) {
                    TextInputLayout.this.m1.u0((float)valueAnimator.getAnimatedValue());
                }
            });
        }
        this.p1.setFloatValues(new float[] { this.m1.G(), n });
        this.p1.start();
    }
    
    public void i0() {
        this.k0(this.N0, this.P0);
    }
    
    public void j0() {
        this.k0(this.Y0, this.Z0);
    }
    
    public void l0() {
        this.k0(this.C0, this.D0);
    }
    
    public void m0(@j0 final h o) {
        this.K0.remove(o);
    }
    
    public void n0(@j0 final i o) {
        this.O0.remove(o);
    }
    
    protected void onLayout(final boolean b, int gravity, final int n, final int n2, final int n3) {
        super.onLayout(b, gravity, n, n2, n3);
        final EditText k = this.K;
        if (k != null) {
            final Rect y0 = this.y0;
            com.google.android.material.internal.c.a((ViewGroup)this, (View)k, y0);
            this.C0(y0);
            if (this.j0) {
                this.m1.r0(this.K.getTextSize());
                gravity = this.K.getGravity();
                this.m1.g0((gravity & 0xFFFFFF8F) | 0x30);
                this.m1.q0(gravity);
                this.m1.c0(this.r(y0));
                this.m1.m0(this.u(y0));
                this.m1.Y();
                if (this.C() && !this.l1) {
                    this.f0();
                }
            }
        }
    }
    
    protected void onMeasure(final int n, final int n2) {
        super.onMeasure(n, n2);
        final boolean k0 = this.K0();
        final boolean i0 = this.I0();
        if (k0 || i0) {
            this.K.post((Runnable)new Runnable() {
                @Override
                public void run() {
                    TextInputLayout.this.K.requestLayout();
                }
            });
        }
        this.O0();
        this.R0();
        this.U0();
    }
    
    protected void onRestoreInstanceState(@k0 final Parcelable parcelable) {
        if (!(parcelable instanceof j)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        final j j = (j)parcelable;
        super.onRestoreInstanceState(j.a());
        this.setError(j.I);
        if (j.J) {
            this.N0.post((Runnable)new Runnable() {
                @Override
                public void run() {
                    TextInputLayout.this.N0.performClick();
                    TextInputLayout.this.N0.jumpDrawablesToCurrentState();
                }
            });
        }
        this.setHint(j.K);
        this.setHelperText(j.L);
        this.setPlaceholderText(j.M);
        this.requestLayout();
    }
    
    @k0
    public Parcelable onSaveInstanceState() {
        final j j = new j(super.onSaveInstanceState());
        if (this.O.l()) {
            j.I = this.getError();
        }
        j.J = (this.L() && this.N0.isChecked());
        j.K = this.getHint();
        j.L = this.getHelperText();
        j.M = this.getPlaceholderText();
        return (Parcelable)j;
    }
    
    public void p0(final float n, final float n2, final float n3, final float n4) {
        final com.google.android.material.shape.j m0 = this.m0;
        if (m0 == null || m0.R() != n || this.m0.S() != n2 || this.m0.u() != n4 || this.m0.t() != n3) {
            this.o0 = this.o0.v().K(n).P(n2).C(n4).x(n3).m();
            this.j();
        }
    }
    
    public void q0(@p final int n, @p final int n2, @p final int n3, @p final int n4) {
        this.p0(this.getContext().getResources().getDimension(n), this.getContext().getResources().getDimension(n2), this.getContext().getResources().getDimension(n4), this.getContext().getResources().getDimension(n3));
    }
    
    public void setBoxBackgroundColor(@l final int n) {
        if (this.x0 != n) {
            this.x0 = n;
            this.g1 = n;
            this.i1 = n;
            this.j1 = n;
            this.j();
        }
    }
    
    public void setBoxBackgroundColorResource(@androidx.annotation.n final int n) {
        this.setBoxBackgroundColor(d.f(this.getContext(), n));
    }
    
    public void setBoxBackgroundColorStateList(@j0 final ColorStateList list) {
        final int defaultColor = list.getDefaultColor();
        this.g1 = defaultColor;
        this.x0 = defaultColor;
        this.h1 = list.getColorForState(new int[] { -16842910 }, -1);
        this.i1 = list.getColorForState(new int[] { 16842908, 16842910 }, -1);
        this.j1 = list.getColorForState(new int[] { 16843623, 16842910 }, -1);
        this.j();
    }
    
    public void setBoxBackgroundMode(final int r0) {
        if (r0 == this.r0) {
            return;
        }
        this.r0 = r0;
        if (this.K != null) {
            this.e0();
        }
    }
    
    public void setBoxStrokeColor(@l final int e1) {
        if (this.e1 != e1) {
            this.e1 = e1;
            this.W0();
        }
    }
    
    public void setBoxStrokeColorStateList(@j0 final ColorStateList list) {
        Label_0105: {
            int e1;
            if (list.isStateful()) {
                this.c1 = list.getDefaultColor();
                this.k1 = list.getColorForState(new int[] { -16842910 }, -1);
                this.d1 = list.getColorForState(new int[] { 16843623, 16842910 }, -1);
                e1 = list.getColorForState(new int[] { 16842908, 16842910 }, -1);
            }
            else {
                if (this.e1 == list.getDefaultColor()) {
                    break Label_0105;
                }
                e1 = list.getDefaultColor();
            }
            this.e1 = e1;
        }
        this.W0();
    }
    
    public void setBoxStrokeErrorColor(@k0 final ColorStateList f1) {
        if (this.f1 != f1) {
            this.f1 = f1;
            this.W0();
        }
    }
    
    public void setBoxStrokeWidth(final int u0) {
        this.u0 = u0;
        this.W0();
    }
    
    public void setBoxStrokeWidthFocused(final int v0) {
        this.v0 = v0;
        this.W0();
    }
    
    public void setBoxStrokeWidthFocusedResource(@p final int n) {
        this.setBoxStrokeWidthFocused(this.getResources().getDimensionPixelSize(n));
    }
    
    public void setBoxStrokeWidthResource(@p final int n) {
        this.setBoxStrokeWidth(this.getResources().getDimensionPixelSize(n));
    }
    
    public void setCounterEnabled(final boolean p) {
        if (this.P != p) {
            if (p) {
                (this.S = new AppCompatTextView(this.getContext())).setId(o2.a.h.v5);
                final Typeface b0 = this.B0;
                if (b0 != null) {
                    this.S.setTypeface(b0);
                }
                this.S.setMaxLines(1);
                this.O.d(this.S, 2);
                n.h((ViewGroup$MarginLayoutParams)this.S.getLayoutParams(), this.getResources().getDimensionPixelOffset(o2.a.f.j6));
                this.G0();
                this.D0();
            }
            else {
                this.O.E(this.S, 2);
                this.S = null;
            }
            this.P = p;
        }
    }
    
    public void setCounterMaxLength(int q) {
        if (this.Q != q) {
            if (q <= 0) {
                q = -1;
            }
            this.Q = q;
            if (this.P) {
                this.D0();
            }
        }
    }
    
    public void setCounterOverflowTextAppearance(final int t) {
        if (this.T != t) {
            this.T = t;
            this.G0();
        }
    }
    
    public void setCounterOverflowTextColor(@k0 final ColorStateList e0) {
        if (this.e0 != e0) {
            this.e0 = e0;
            this.G0();
        }
    }
    
    public void setCounterTextAppearance(final int u) {
        if (this.U != u) {
            this.U = u;
            this.G0();
        }
    }
    
    public void setCounterTextColor(@k0 final ColorStateList d0) {
        if (this.d0 != d0) {
            this.d0 = d0;
            this.G0();
        }
    }
    
    public void setDefaultHintTextColor(@k0 final ColorStateList list) {
        this.a1 = list;
        this.b1 = list;
        if (this.K != null) {
            this.M0(false);
        }
    }
    
    public void setEnabled(final boolean enabled) {
        h0((ViewGroup)this, enabled);
        super.setEnabled(enabled);
    }
    
    public void setEndIconActivated(final boolean activated) {
        this.N0.setActivated(activated);
    }
    
    public void setEndIconCheckable(final boolean checkable) {
        this.N0.setCheckable(checkable);
    }
    
    public void setEndIconContentDescription(@w0 final int n) {
        CharSequence text;
        if (n != 0) {
            text = this.getResources().getText(n);
        }
        else {
            text = null;
        }
        this.setEndIconContentDescription(text);
    }
    
    public void setEndIconContentDescription(@k0 final CharSequence contentDescription) {
        if (this.getEndIconContentDescription() != contentDescription) {
            this.N0.setContentDescription(contentDescription);
        }
    }
    
    public void setEndIconDrawable(@s final int n) {
        Drawable d;
        if (n != 0) {
            d = androidx.appcompat.content.res.a.d(this.getContext(), n);
        }
        else {
            d = null;
        }
        this.setEndIconDrawable(d);
    }
    
    public void setEndIconDrawable(@k0 final Drawable imageDrawable) {
        this.N0.setImageDrawable(imageDrawable);
        this.i0();
    }
    
    public void setEndIconMode(final int n) {
        final int l0 = this.L0;
        this.L0 = n;
        this.F(l0);
        this.setEndIconVisible(n != 0);
        if (this.getEndIconDelegate().b(this.r0)) {
            this.getEndIconDelegate().a();
            this.m();
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("The current box background mode ");
        sb.append(this.r0);
        sb.append(" is not supported by the end icon mode ");
        sb.append(n);
        throw new IllegalStateException(sb.toString());
    }
    
    public void setEndIconOnClickListener(@k0 final View$OnClickListener view$OnClickListener) {
        t0(this.N0, view$OnClickListener, this.W0);
    }
    
    public void setEndIconOnLongClickListener(@k0 final View$OnLongClickListener w0) {
        this.W0 = w0;
        u0(this.N0, w0);
    }
    
    public void setEndIconTintList(@k0 final ColorStateList p) {
        if (this.P0 != p) {
            this.P0 = p;
            this.Q0 = true;
            this.m();
        }
    }
    
    public void setEndIconTintMode(@k0 final PorterDuff$Mode r0) {
        if (this.R0 != r0) {
            this.R0 = r0;
            this.S0 = true;
            this.m();
        }
    }
    
    public void setEndIconVisible(final boolean b) {
        if (this.P() != b) {
            final CheckableImageButton n0 = this.N0;
            int visibility;
            if (b) {
                visibility = 0;
            }
            else {
                visibility = 8;
            }
            n0.setVisibility(visibility);
            this.U0();
            this.I0();
        }
    }
    
    public void setError(@k0 final CharSequence charSequence) {
        if (!this.O.C()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            this.setErrorEnabled(true);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.O.R(charSequence);
        }
        else {
            this.O.x();
        }
    }
    
    public void setErrorContentDescription(@k0 final CharSequence charSequence) {
        this.O.G(charSequence);
    }
    
    public void setErrorEnabled(final boolean b) {
        this.O.H(b);
    }
    
    public void setErrorIconDrawable(@s final int n) {
        Drawable d;
        if (n != 0) {
            d = androidx.appcompat.content.res.a.d(this.getContext(), n);
        }
        else {
            d = null;
        }
        this.setErrorIconDrawable(d);
        this.j0();
    }
    
    public void setErrorIconDrawable(@k0 final Drawable imageDrawable) {
        this.Y0.setImageDrawable(imageDrawable);
        this.setErrorIconVisible(imageDrawable != null && this.O.C());
    }
    
    public void setErrorIconOnClickListener(@k0 final View$OnClickListener view$OnClickListener) {
        t0(this.Y0, view$OnClickListener, this.X0);
    }
    
    public void setErrorIconOnLongClickListener(@k0 final View$OnLongClickListener x0) {
        this.X0 = x0;
        u0(this.Y0, x0);
    }
    
    public void setErrorIconTintList(@k0 final ColorStateList z0) {
        this.Z0 = z0;
        Drawable imageDrawable;
        final Drawable drawable = imageDrawable = this.Y0.getDrawable();
        if (drawable != null) {
            imageDrawable = androidx.core.graphics.drawable.c.r(drawable).mutate();
            androidx.core.graphics.drawable.c.o(imageDrawable, z0);
        }
        if (this.Y0.getDrawable() != imageDrawable) {
            this.Y0.setImageDrawable(imageDrawable);
        }
    }
    
    public void setErrorIconTintMode(@k0 final PorterDuff$Mode porterDuff$Mode) {
        Drawable imageDrawable;
        final Drawable drawable = imageDrawable = this.Y0.getDrawable();
        if (drawable != null) {
            imageDrawable = androidx.core.graphics.drawable.c.r(drawable).mutate();
            androidx.core.graphics.drawable.c.p(imageDrawable, porterDuff$Mode);
        }
        if (this.Y0.getDrawable() != imageDrawable) {
            this.Y0.setImageDrawable(imageDrawable);
        }
    }
    
    public void setErrorTextAppearance(@x0 final int n) {
        this.O.I(n);
    }
    
    public void setErrorTextColor(@k0 final ColorStateList list) {
        this.O.J(list);
    }
    
    public void setExpandedHintEnabled(final boolean n1) {
        if (this.n1 != n1) {
            this.n1 = n1;
            this.M0(false);
        }
    }
    
    public void setHelperText(@k0 final CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (this.U()) {
                this.setHelperTextEnabled(false);
            }
        }
        else {
            if (!this.U()) {
                this.setHelperTextEnabled(true);
            }
            this.O.S(charSequence);
        }
    }
    
    public void setHelperTextColor(@k0 final ColorStateList list) {
        this.O.M(list);
    }
    
    public void setHelperTextEnabled(final boolean b) {
        this.O.L(b);
    }
    
    public void setHelperTextTextAppearance(@x0 final int n) {
        this.O.K(n);
    }
    
    public void setHint(@w0 final int n) {
        CharSequence text;
        if (n != 0) {
            text = this.getResources().getText(n);
        }
        else {
            text = null;
        }
        this.setHint(text);
    }
    
    public void setHint(@k0 final CharSequence hintInternal) {
        if (this.j0) {
            this.setHintInternal(hintInternal);
            this.sendAccessibilityEvent(2048);
        }
    }
    
    public void setHintAnimationEnabled(final boolean o1) {
        this.o1 = o1;
    }
    
    public void setHintEnabled(final boolean j0) {
        if (j0 != this.j0) {
            if (!(this.j0 = j0)) {
                this.l0 = false;
                if (!TextUtils.isEmpty(this.k0) && TextUtils.isEmpty(this.K.getHint())) {
                    this.K.setHint(this.k0);
                }
                this.setHintInternal(null);
            }
            else {
                final CharSequence hint = this.K.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.k0)) {
                        this.setHint(hint);
                    }
                    this.K.setHint((CharSequence)null);
                }
                this.l0 = true;
            }
            if (this.K != null) {
                this.L0();
            }
        }
    }
    
    public void setHintTextAppearance(@x0 final int n) {
        this.m1.d0(n);
        this.b1 = this.m1.q();
        if (this.K != null) {
            this.M0(false);
            this.L0();
        }
    }
    
    public void setHintTextColor(@k0 final ColorStateList b1) {
        if (this.b1 != b1) {
            if (this.a1 == null) {
                this.m1.f0(b1);
            }
            this.b1 = b1;
            if (this.K != null) {
                this.M0(false);
            }
        }
    }
    
    public void setMaxWidth(@n0 final int n) {
        this.N = n;
        final EditText k = this.K;
        if (k != null && n != -1) {
            k.setMaxWidth(n);
        }
    }
    
    public void setMaxWidthResource(@p final int n) {
        this.setMaxWidth(this.getContext().getResources().getDimensionPixelSize(n));
    }
    
    public void setMinWidth(@n0 final int n) {
        this.M = n;
        final EditText k = this.K;
        if (k != null && n != -1) {
            k.setMinWidth(n);
        }
    }
    
    public void setMinWidthResource(@p final int n) {
        this.setMinWidth(this.getContext().getResources().getDimensionPixelSize(n));
    }
    
    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(@w0 final int n) {
        CharSequence text;
        if (n != 0) {
            text = this.getResources().getText(n);
        }
        else {
            text = null;
        }
        this.setPasswordVisibilityToggleContentDescription(text);
    }
    
    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(@k0 final CharSequence contentDescription) {
        this.N0.setContentDescription(contentDescription);
    }
    
    @Deprecated
    public void setPasswordVisibilityToggleDrawable(@s final int n) {
        Drawable d;
        if (n != 0) {
            d = androidx.appcompat.content.res.a.d(this.getContext(), n);
        }
        else {
            d = null;
        }
        this.setPasswordVisibilityToggleDrawable(d);
    }
    
    @Deprecated
    public void setPasswordVisibilityToggleDrawable(@k0 final Drawable imageDrawable) {
        this.N0.setImageDrawable(imageDrawable);
    }
    
    @Deprecated
    public void setPasswordVisibilityToggleEnabled(final boolean b) {
        if (b && this.L0 != 1) {
            this.setEndIconMode(1);
        }
        else if (!b) {
            this.setEndIconMode(0);
        }
    }
    
    @Deprecated
    public void setPasswordVisibilityToggleTintList(@k0 final ColorStateList p) {
        this.P0 = p;
        this.Q0 = true;
        this.m();
    }
    
    @Deprecated
    public void setPasswordVisibilityToggleTintMode(@k0 final PorterDuff$Mode r0) {
        this.R0 = r0;
        this.S0 = true;
        this.m();
    }
    
    public void setPlaceholderText(@k0 final CharSequence v) {
        if (this.W && TextUtils.isEmpty(v)) {
            this.setPlaceholderTextEnabled(false);
        }
        else {
            if (!this.W) {
                this.setPlaceholderTextEnabled(true);
            }
            this.V = v;
        }
        this.P0();
    }
    
    public void setPlaceholderTextAppearance(@x0 final int c0) {
        this.c0 = c0;
        final TextView a0 = this.a0;
        if (a0 != null) {
            r.E(a0, c0);
        }
    }
    
    public void setPlaceholderTextColor(@k0 final ColorStateList list) {
        if (this.b0 != list) {
            this.b0 = list;
            final TextView a0 = this.a0;
            if (a0 != null && list != null) {
                a0.setTextColor(list);
            }
        }
    }
    
    public void setPrefixText(@k0 final CharSequence text) {
        CharSequence f0;
        if (TextUtils.isEmpty(text)) {
            f0 = null;
        }
        else {
            f0 = text;
        }
        this.f0 = f0;
        this.g0.setText(text);
        this.S0();
    }
    
    public void setPrefixTextAppearance(@x0 final int n) {
        r.E(this.g0, n);
    }
    
    public void setPrefixTextColor(@j0 final ColorStateList textColor) {
        this.g0.setTextColor(textColor);
    }
    
    public void setStartIconCheckable(final boolean checkable) {
        this.C0.setCheckable(checkable);
    }
    
    public void setStartIconContentDescription(@w0 final int n) {
        CharSequence text;
        if (n != 0) {
            text = this.getResources().getText(n);
        }
        else {
            text = null;
        }
        this.setStartIconContentDescription(text);
    }
    
    public void setStartIconContentDescription(@k0 final CharSequence contentDescription) {
        if (this.getStartIconContentDescription() != contentDescription) {
            this.C0.setContentDescription(contentDescription);
        }
    }
    
    public void setStartIconDrawable(@s final int n) {
        Drawable d;
        if (n != 0) {
            d = androidx.appcompat.content.res.a.d(this.getContext(), n);
        }
        else {
            d = null;
        }
        this.setStartIconDrawable(d);
    }
    
    public void setStartIconDrawable(@k0 final Drawable imageDrawable) {
        this.C0.setImageDrawable(imageDrawable);
        if (imageDrawable != null) {
            this.setStartIconVisible(true);
            this.l0();
        }
        else {
            this.setStartIconVisible(false);
            this.setStartIconOnClickListener(null);
            this.setStartIconOnLongClickListener(null);
            this.setStartIconContentDescription(null);
        }
    }
    
    public void setStartIconOnClickListener(@k0 final View$OnClickListener view$OnClickListener) {
        t0(this.C0, view$OnClickListener, this.J0);
    }
    
    public void setStartIconOnLongClickListener(@k0 final View$OnLongClickListener j0) {
        this.J0 = j0;
        u0(this.C0, j0);
    }
    
    public void setStartIconTintList(@k0 final ColorStateList d0) {
        if (this.D0 != d0) {
            this.D0 = d0;
            this.E0 = true;
            this.o();
        }
    }
    
    public void setStartIconTintMode(@k0 final PorterDuff$Mode f0) {
        if (this.F0 != f0) {
            this.F0 = f0;
            this.G0 = true;
            this.o();
        }
    }
    
    public void setStartIconVisible(final boolean b) {
        if (this.c0() != b) {
            final CheckableImageButton c0 = this.C0;
            int visibility;
            if (b) {
                visibility = 0;
            }
            else {
                visibility = 8;
            }
            c0.setVisibility(visibility);
            this.R0();
            this.I0();
        }
    }
    
    public void setSuffixText(@k0 final CharSequence text) {
        CharSequence h0;
        if (TextUtils.isEmpty(text)) {
            h0 = null;
        }
        else {
            h0 = text;
        }
        this.h0 = h0;
        this.i0.setText(text);
        this.V0();
    }
    
    public void setSuffixTextAppearance(@x0 final int n) {
        r.E(this.i0, n);
    }
    
    public void setSuffixTextColor(@j0 final ColorStateList textColor) {
        this.i0.setTextColor(textColor);
    }
    
    public void setTextInputAccessibilityDelegate(@k0 final e e) {
        final EditText k = this.K;
        if (k != null) {
            androidx.core.view.j0.z1((View)k, e);
        }
    }
    
    public void setTypeface(@k0 final Typeface typeface) {
        if (typeface != this.B0) {
            this.B0 = typeface;
            this.m1.H0(typeface);
            this.O.O(typeface);
            final TextView s = this.S;
            if (s != null) {
                s.setTypeface(typeface);
            }
        }
    }
    
    void v0(@j0 final TextView textView, @x0 int defaultColor) {
        final int n = 1;
        Label_0044: {
            try {
                r.E(textView, defaultColor);
                if (Build$VERSION.SDK_INT >= 23) {
                    defaultColor = textView.getTextColors().getDefaultColor();
                    if (defaultColor == -65281) {
                        defaultColor = n;
                        break Label_0044;
                    }
                }
                defaultColor = 0;
            }
            catch (Exception ex) {
                defaultColor = n;
            }
        }
        if (defaultColor != 0) {
            r.E(textView, o2.a.n.X4);
            textView.setTextColor(d.f(this.getContext(), o2.a.e.w0));
        }
    }
    
    public void y() {
        this.K0.clear();
    }
    
    public void z() {
        this.O0.clear();
    }
    
    public static class e extends androidx.core.view.a
    {
        private final TextInputLayout d;
        
        public e(@j0 final TextInputLayout d) {
            this.d = d;
        }
        
        @Override
        public void g(@j0 final View view, @j0 final androidx.core.view.accessibility.d d) {
            super.g(view, d);
            final EditText editText = this.d.getEditText();
            Object text;
            if (editText != null) {
                text = editText.getText();
            }
            else {
                text = null;
            }
            final CharSequence hint = this.d.getHint();
            final CharSequence error = this.d.getError();
            CharSequence obj = this.d.getPlaceholderText();
            int counterMaxLength = this.d.getCounterMaxLength();
            final CharSequence counterOverflowDescription = this.d.getCounterOverflowDescription();
            final boolean b = TextUtils.isEmpty((CharSequence)text) ^ true;
            final boolean empty = TextUtils.isEmpty(hint);
            final boolean x = this.d.X();
            final boolean b2 = TextUtils.isEmpty(error) ^ true;
            final boolean b3 = b2 || !TextUtils.isEmpty(counterOverflowDescription);
            String string;
            if (empty ^ true) {
                string = hint.toString();
            }
            else {
                string = "";
            }
            Label_0243: {
                if (b) {
                    d.J1((CharSequence)text);
                }
                else {
                    if (!TextUtils.isEmpty((CharSequence)string)) {
                        d.J1(string);
                        if (!(x ^ true) || obj == null) {
                            break Label_0243;
                        }
                        final StringBuilder sb = new StringBuilder();
                        sb.append(string);
                        sb.append(", ");
                        sb.append((Object)obj);
                        obj = sb.toString();
                    }
                    else if (obj == null) {
                        break Label_0243;
                    }
                    d.J1(obj);
                }
            }
            if (!TextUtils.isEmpty((CharSequence)string)) {
                if (Build$VERSION.SDK_INT >= 26) {
                    d.j1(string);
                }
                else {
                    String string2 = string;
                    if (b) {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append(text);
                        sb2.append(", ");
                        sb2.append(string);
                        string2 = sb2.toString();
                    }
                    d.J1(string2);
                }
                d.F1(b ^ true);
            }
            if (text == null || ((CharSequence)text).length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            d.s1(counterMaxLength);
            if (b3) {
                CharSequence charSequence;
                if (b2) {
                    charSequence = error;
                }
                else {
                    charSequence = counterOverflowDescription;
                }
                d.f1(charSequence);
            }
            if (Build$VERSION.SDK_INT >= 17 && editText != null) {
                editText.setLabelFor(o2.a.h.x5);
            }
        }
    }
    
    @Retention(RetentionPolicy.SOURCE)
    public @interface f {
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @t0({ t0.a.H })
    public @interface g {
    }
    
    public interface h
    {
        void a(@j0 final TextInputLayout p0);
    }
    
    public interface i
    {
        void a(@j0 final TextInputLayout p0, final int p1);
    }
    
    static class j extends a
    {
        public static final Parcelable$Creator<j> CREATOR;
        @k0
        CharSequence I;
        boolean J;
        @k0
        CharSequence K;
        @k0
        CharSequence L;
        @k0
        CharSequence M;
        
        static {
            CREATOR = (Parcelable$Creator)new Parcelable$ClassLoaderCreator<j>() {
                @k0
                public j a(@j0 final Parcel parcel) {
                    return new j(parcel, null);
                }
                
                @j0
                public j b(@j0 final Parcel parcel, final ClassLoader classLoader) {
                    return new j(parcel, classLoader);
                }
                
                @j0
                public j[] c(final int n) {
                    return new j[n];
                }
            };
        }
        
        j(@j0 final Parcel parcel, final ClassLoader classLoader) {
            super(parcel, classLoader);
            this.I = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            final int int1 = parcel.readInt();
            boolean j = true;
            if (int1 != 1) {
                j = false;
            }
            this.J = j;
            this.K = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.L = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.M = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        }
        
        j(final Parcelable parcelable) {
            super(parcelable);
        }
        
        @j0
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("TextInputLayout.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" error=");
            sb.append((Object)this.I);
            sb.append(" hint=");
            sb.append((Object)this.K);
            sb.append(" helperText=");
            sb.append((Object)this.L);
            sb.append(" placeholderText=");
            sb.append((Object)this.M);
            sb.append("}");
            return sb.toString();
        }
        
        @Override
        public void writeToParcel(@j0 final Parcel parcel, final int n) {
            super.writeToParcel(parcel, n);
            TextUtils.writeToParcel(this.I, parcel, n);
            parcel.writeInt((int)(this.J ? 1 : 0));
            TextUtils.writeToParcel(this.K, parcel, n);
            TextUtils.writeToParcel(this.L, parcel, n);
            TextUtils.writeToParcel(this.M, parcel, n);
        }
    }
}
