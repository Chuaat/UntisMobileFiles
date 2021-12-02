// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.tabs;

import androidx.core.widget.r;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.FrameLayout;
import android.text.Layout;
import android.view.View$OnLayoutChangeListener;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import androidx.annotation.e0;
import androidx.annotation.w0;
import android.graphics.Rect;
import android.os.Build$VERSION;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.LinearLayout;
import androidx.annotation.t0;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;
import androidx.annotation.n;
import androidx.annotation.l;
import androidx.annotation.s;
import android.animation.Animator$AnimatorListener;
import androidx.annotation.h;
import androidx.annotation.p0;
import android.view.View$MeasureSpec;
import androidx.core.view.accessibility.d;
import android.view.accessibility.AccessibilityNodeInfo;
import android.graphics.Canvas;
import android.view.ViewParent;
import com.google.android.material.shape.k;
import java.util.Iterator;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.util.Log;
import android.text.TextUtils;
import android.widget.LinearLayout$LayoutParams;
import android.content.res.Resources;
import android.content.res.TypedArray;
import com.google.android.material.internal.b0;
import com.google.android.material.resources.c;
import com.google.android.material.shape.j;
import android.graphics.drawable.ColorDrawable;
import com.google.android.material.internal.t;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.widget.FrameLayout$LayoutParams;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.content.Context;
import android.database.DataSetObserver;
import androidx.viewpager.widget.a;
import android.animation.ValueAnimator;
import android.graphics.PorterDuff$Mode;
import android.graphics.drawable.Drawable;
import android.content.res.ColorStateList;
import androidx.annotation.j0;
import androidx.annotation.k0;
import java.util.ArrayList;
import androidx.core.util.m;
import androidx.annotation.q;
import androidx.viewpager.widget.ViewPager;
import android.widget.HorizontalScrollView;

@ViewPager.e
public class TabLayout extends HorizontalScrollView
{
    @q(unit = 0)
    private static final int A0 = 72;
    @q(unit = 0)
    static final int B0 = 8;
    @q(unit = 0)
    private static final int C0 = 48;
    @q(unit = 0)
    private static final int D0 = 56;
    @q(unit = 0)
    static final int E0 = 16;
    private static final int F0 = -1;
    private static final int G0 = 300;
    private static final androidx.core.util.m.a<i> H0;
    private static final String I0 = "TabLayout";
    public static final int J0 = 0;
    public static final int K0 = 1;
    public static final int L0 = 2;
    public static final int M0 = 0;
    public static final int N0 = 1;
    public static final int O0 = 0;
    public static final int P0 = 1;
    public static final int Q0 = 2;
    public static final int R0 = 0;
    public static final int S0 = 1;
    public static final int T0 = 2;
    public static final int U0 = 3;
    public static final int V0 = 0;
    public static final int W0 = 1;
    private static final int z0;
    private final ArrayList<i> G;
    @k0
    private i H;
    @j0
    final h I;
    int J;
    int K;
    int L;
    int M;
    int N;
    ColorStateList O;
    ColorStateList P;
    ColorStateList Q;
    @j0
    Drawable R;
    private int S;
    PorterDuff$Mode T;
    float U;
    float V;
    final int W;
    int a0;
    private final int b0;
    private final int c0;
    private final int d0;
    private int e0;
    int f0;
    int g0;
    int h0;
    int i0;
    boolean j0;
    boolean k0;
    int l0;
    boolean m0;
    private com.google.android.material.tabs.b n0;
    @k0
    private c o0;
    private final ArrayList<c> p0;
    @k0
    private c q0;
    private ValueAnimator r0;
    @k0
    ViewPager s0;
    @k0
    private a t0;
    private DataSetObserver u0;
    private m v0;
    private b w0;
    private boolean x0;
    private final androidx.core.util.m.a<n> y0;
    
    static {
        z0 = o2.a.n.Aa;
        H0 = new androidx.core.util.m.c<i>(16);
    }
    
    public TabLayout(@j0 final Context context) {
        this(context, null);
    }
    
    public TabLayout(@j0 final Context context, @k0 final AttributeSet set) {
        this(context, set, o2.a.c.Xd);
    }
    
    public TabLayout(@j0 Context context, @k0 final AttributeSet set, int n) {
        final int z0 = TabLayout.z0;
        super(com.google.android.material.theme.overlay.a.c(context, set, n, z0), set, n);
        this.G = new ArrayList<i>();
        this.R = (Drawable)new GradientDrawable();
        this.S = 0;
        this.a0 = Integer.MAX_VALUE;
        this.p0 = new ArrayList<c>();
        this.y0 = new androidx.core.util.m.b<n>(12);
        context = this.getContext();
        this.setHorizontalScrollBarEnabled(false);
        final h i = new h(context);
        super.addView((View)(this.I = i), 0, (ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-2, -1));
        final int[] gr = o2.a.o.Gr;
        final int es = o2.a.o.es;
        final TypedArray j = t.j(context, set, gr, n, z0, es);
        if (this.getBackground() instanceof ColorDrawable) {
            final ColorDrawable colorDrawable = (ColorDrawable)this.getBackground();
            final com.google.android.material.shape.j k = new com.google.android.material.shape.j();
            k.n0(ColorStateList.valueOf(colorDrawable.getColor()));
            k.Y(context);
            k.m0(androidx.core.view.j0.P((View)this));
            androidx.core.view.j0.G1((View)this, k);
        }
        this.setSelectedTabIndicator(com.google.android.material.resources.c.d(context, j, o2.a.o.Mr));
        this.setSelectedTabIndicatorColor(j.getColor(o2.a.o.Pr, 0));
        i.g(j.getDimensionPixelSize(o2.a.o.Sr, -1));
        this.setSelectedTabIndicatorGravity(j.getInt(o2.a.o.Rr, 0));
        this.setTabIndicatorFullWidth(j.getBoolean(o2.a.o.Qr, true));
        this.setTabIndicatorAnimationMode(j.getInt(o2.a.o.Or, 0));
        n = j.getDimensionPixelSize(o2.a.o.Xr, 0);
        this.M = n;
        this.L = n;
        this.K = n;
        this.J = n;
        this.J = j.getDimensionPixelSize(o2.a.o.as, n);
        this.K = j.getDimensionPixelSize(o2.a.o.bs, this.K);
        this.L = j.getDimensionPixelSize(o2.a.o.Zr, this.L);
        this.M = j.getDimensionPixelSize(o2.a.o.Yr, this.M);
        n = j.getResourceId(es, o2.a.n.e6);
        this.N = n;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(n, c.a.n.Z6);
        try {
            this.U = (float)obtainStyledAttributes.getDimensionPixelSize(c.a.n.a7, 0);
            this.O = com.google.android.material.resources.c.a(context, obtainStyledAttributes, c.a.n.d7);
            obtainStyledAttributes.recycle();
            n = o2.a.o.fs;
            if (j.hasValue(n)) {
                this.O = com.google.android.material.resources.c.a(context, j, n);
            }
            n = o2.a.o.ds;
            if (j.hasValue(n)) {
                n = j.getColor(n, 0);
                this.O = r(this.O.getDefaultColor(), n);
            }
            this.P = com.google.android.material.resources.c.a(context, j, o2.a.o.Kr);
            this.T = com.google.android.material.internal.b0.k(j.getInt(o2.a.o.Lr, -1), null);
            this.Q = com.google.android.material.resources.c.a(context, j, o2.a.o.cs);
            this.g0 = j.getInt(o2.a.o.Nr, 300);
            this.b0 = j.getDimensionPixelSize(o2.a.o.Vr, -1);
            this.c0 = j.getDimensionPixelSize(o2.a.o.Ur, -1);
            this.W = j.getResourceId(o2.a.o.Hr, 0);
            this.e0 = j.getDimensionPixelSize(o2.a.o.Ir, 0);
            this.i0 = j.getInt(o2.a.o.Wr, 1);
            this.f0 = j.getInt(o2.a.o.Jr, 0);
            this.j0 = j.getBoolean(o2.a.o.Tr, false);
            this.m0 = j.getBoolean(o2.a.o.gs, false);
            j.recycle();
            final Resources resources = this.getResources();
            this.V = (float)resources.getDimensionPixelSize(o2.a.f.H1);
            this.d0 = resources.getDimensionPixelSize(o2.a.f.F1);
            this.n();
        }
        finally {
            obtainStyledAttributes.recycle();
        }
    }
    
    private void L(final int n) {
        final n n2 = (n)this.I.getChildAt(n);
        this.I.removeViewAt(n);
        if (n2 != null) {
            n2.s();
            this.y0.a(n2);
        }
        this.requestLayout();
    }
    
    private void T(@k0 final ViewPager s0, final boolean b, final boolean x0) {
        final ViewPager s2 = this.s0;
        if (s2 != null) {
            final m v0 = this.v0;
            if (v0 != null) {
                s2.removeOnPageChangeListener((ViewPager.j)v0);
            }
            final b w0 = this.w0;
            if (w0 != null) {
                this.s0.removeOnAdapterChangeListener((ViewPager.i)w0);
            }
        }
        final c q0 = this.q0;
        if (q0 != null) {
            this.H(q0);
            this.q0 = null;
        }
        if (s0 != null) {
            this.s0 = s0;
            if (this.v0 == null) {
                this.v0 = new m(this);
            }
            this.v0.a();
            s0.addOnPageChangeListener((ViewPager.j)this.v0);
            this.c(this.q0 = (c)new o(s0));
            final a adapter = s0.getAdapter();
            if (adapter != null) {
                this.O(adapter, b);
            }
            if (this.w0 == null) {
                this.w0 = new b();
            }
            this.w0.b(b);
            s0.addOnAdapterChangeListener((ViewPager.i)this.w0);
            this.P(s0.getCurrentItem(), 0.0f, true);
        }
        else {
            this.s0 = null;
            this.O(null, false);
        }
        this.x0 = x0;
    }
    
    private void U() {
        for (int size = this.G.size(), i = 0; i < size; ++i) {
            this.G.get(i).E();
        }
    }
    
    private void V(@j0 final LinearLayout$LayoutParams linearLayout$LayoutParams) {
        float weight;
        if (this.i0 == 1 && this.f0 == 0) {
            linearLayout$LayoutParams.width = 0;
            weight = 1.0f;
        }
        else {
            linearLayout$LayoutParams.width = -2;
            weight = 0.0f;
        }
        linearLayout$LayoutParams.weight = weight;
    }
    
    @q(unit = 0)
    private int getDefaultHeight() {
        final int size = this.G.size();
        final int n = 0;
        int index = 0;
        int n2;
        while (true) {
            n2 = n;
            if (index >= size) {
                break;
            }
            final i i = this.G.get(index);
            if (i != null && i.h() != null && !TextUtils.isEmpty(i.n())) {
                n2 = 1;
                break;
            }
            ++index;
        }
        int n3;
        if (n2 != 0 && !this.j0) {
            n3 = 72;
        }
        else {
            n3 = 48;
        }
        return n3;
    }
    
    private int getTabMinWidth() {
        final int b0 = this.b0;
        if (b0 != -1) {
            return b0;
        }
        final int i0 = this.i0;
        int d0;
        if (i0 != 0 && i0 != 2) {
            d0 = 0;
        }
        else {
            d0 = this.d0;
        }
        return d0;
    }
    
    private int getTabScrollRange() {
        return Math.max(0, this.I.getWidth() - this.getWidth() - this.getPaddingLeft() - this.getPaddingRight());
    }
    
    private void i(@j0 final TabItem tabItem) {
        final i d = this.D();
        final CharSequence g = tabItem.G;
        if (g != null) {
            d.D(g);
        }
        final Drawable h = tabItem.H;
        if (h != null) {
            d.x(h);
        }
        final int i = tabItem.I;
        if (i != 0) {
            d.u(i);
        }
        if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
            d.t(tabItem.getContentDescription());
        }
        this.e(d);
    }
    
    private void j(@j0 final i i) {
        final n j = i.i;
        j.setSelected(false);
        j.setActivated(false);
        this.I.addView((View)j, i.k(), (ViewGroup$LayoutParams)this.s());
    }
    
    private void k(final View view) {
        if (view instanceof TabItem) {
            this.i((TabItem)view);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }
    
    private void l(final int n) {
        if (n == -1) {
            return;
        }
        if (this.getWindowToken() != null && androidx.core.view.j0.T0((View)this) && !this.I.c()) {
            final int scrollX = this.getScrollX();
            final int o = this.o(n, 0.0f);
            if (scrollX != o) {
                this.y();
                this.r0.setIntValues(new int[] { scrollX, o });
                this.r0.start();
            }
            this.I.b(n, this.g0);
            return;
        }
        this.P(n, 0.0f, true);
    }
    
    private void m(int gravity) {
        h h = null;
        Label_0047: {
            if (gravity != 0) {
                final int n = 1;
                if (gravity == 1) {
                    h = this.I;
                    gravity = n;
                    break Label_0047;
                }
                if (gravity != 2) {
                    return;
                }
            }
            else {
                Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
            }
            h = this.I;
            gravity = 8388611;
        }
        h.setGravity(gravity);
    }
    
    private void n() {
        final int i0 = this.i0;
        int max;
        if (i0 != 0 && i0 != 2) {
            max = 0;
        }
        else {
            max = Math.max(0, this.e0 - this.J);
        }
        androidx.core.view.j0.b2((View)this.I, max, 0, 0, 0);
        final int i2 = this.i0;
        if (i2 != 0) {
            if (i2 == 1 || i2 == 2) {
                if (this.f0 == 2) {
                    Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
                }
                this.I.setGravity(1);
            }
        }
        else {
            this.m(this.f0);
        }
        this.W(true);
    }
    
    private int o(int width, final float n) {
        final int i0 = this.i0;
        int width2 = 0;
        if (i0 != 0 && i0 != 2) {
            return 0;
        }
        final View child = this.I.getChildAt(width);
        View child2;
        if (++width < this.I.getChildCount()) {
            child2 = this.I.getChildAt(width);
        }
        else {
            child2 = null;
        }
        if (child != null) {
            width = child.getWidth();
        }
        else {
            width = 0;
        }
        if (child2 != null) {
            width2 = child2.getWidth();
        }
        final int n2 = child.getLeft() + width / 2 - this.getWidth() / 2;
        width = (int)((width + width2) * 0.5f * n);
        if (androidx.core.view.j0.X((View)this) == 0) {
            width += n2;
        }
        else {
            width = n2 - width;
        }
        return width;
    }
    
    private void q(@j0 final i element, int n) {
        element.z(n);
        this.G.add(n, element);
        while (++n < this.G.size()) {
            this.G.get(n).z(n);
        }
    }
    
    @j0
    private static ColorStateList r(final int n, final int n2) {
        return new ColorStateList(new int[][] { HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET }, new int[] { n2, n });
    }
    
    @j0
    private LinearLayout$LayoutParams s() {
        final LinearLayout$LayoutParams linearLayout$LayoutParams = new LinearLayout$LayoutParams(-2, -1);
        this.V(linearLayout$LayoutParams);
        return linearLayout$LayoutParams;
    }
    
    private void setSelectedTabView(final int n) {
        final int childCount = this.I.getChildCount();
        if (n < childCount) {
            for (int i = 0; i < childCount; ++i) {
                final View child = this.I.getChildAt(i);
                final boolean b = true;
                child.setSelected(i == n);
                child.setActivated(i == n && b);
            }
        }
    }
    
    @j0
    private n u(@j0 final i tab) {
        final androidx.core.util.m.a<n> y0 = this.y0;
        n n;
        if (y0 != null) {
            n = y0.b();
        }
        else {
            n = null;
        }
        n n2 = n;
        if (n == null) {
            n2 = new n(this.getContext());
        }
        n2.setTab(tab);
        n2.setFocusable(true);
        n2.setMinimumWidth(this.getTabMinWidth());
        CharSequence contentDescription;
        if (TextUtils.isEmpty(tab.d)) {
            contentDescription = tab.c;
        }
        else {
            contentDescription = tab.d;
        }
        n2.setContentDescription(contentDescription);
        return n2;
    }
    
    private void v(@j0 final i i) {
        for (int j = this.p0.size() - 1; j >= 0; --j) {
            ((c<i>)this.p0.get(j)).g(i);
        }
    }
    
    private void w(@j0 final i i) {
        for (int j = this.p0.size() - 1; j >= 0; --j) {
            ((c<i>)this.p0.get(j)).i(i);
        }
    }
    
    private void x(@j0 final i i) {
        for (int j = this.p0.size() - 1; j >= 0; --j) {
            ((c<i>)this.p0.get(j)).p(i);
        }
    }
    
    private void y() {
        if (this.r0 == null) {
            (this.r0 = new ValueAnimator()).setInterpolator(com.google.android.material.animation.a.b);
            this.r0.setDuration((long)this.g0);
            this.r0.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new ValueAnimator$AnimatorUpdateListener() {
                public void onAnimationUpdate(@j0 final ValueAnimator valueAnimator) {
                    TabLayout.this.scrollTo((int)valueAnimator.getAnimatedValue(), 0);
                }
            });
        }
    }
    
    public boolean A() {
        return this.m0;
    }
    
    public boolean B() {
        return this.j0;
    }
    
    public boolean C() {
        return this.k0;
    }
    
    @j0
    public i D() {
        final i t = this.t();
        t.h = this;
        t.i = this.u(t);
        if (t.j != -1) {
            t.i.setId(t.j);
        }
        return t;
    }
    
    void E() {
        this.G();
        final a t0 = this.t0;
        if (t0 != null) {
            final int count = t0.getCount();
            for (int i = 0; i < count; ++i) {
                this.h(this.D().D(this.t0.getPageTitle(i)), false);
            }
            final ViewPager s0 = this.s0;
            if (s0 != null && count > 0) {
                final int currentItem = s0.getCurrentItem();
                if (currentItem != this.getSelectedTabPosition() && currentItem < this.getTabCount()) {
                    this.M(this.z(currentItem));
                }
            }
        }
    }
    
    protected boolean F(final i i) {
        return TabLayout.H0.a(i);
    }
    
    public void G() {
        for (int i = this.I.getChildCount() - 1; i >= 0; --i) {
            this.L(i);
        }
        final Iterator<i> iterator = this.G.iterator();
        while (iterator.hasNext()) {
            final i j = iterator.next();
            iterator.remove();
            j.q();
            this.F(j);
        }
        this.H = null;
    }
    
    @Deprecated
    public void H(@k0 final c o) {
        this.p0.remove(o);
    }
    
    public void I(@j0 final f f) {
        this.H((c)f);
    }
    
    public void J(@j0 final i i) {
        if (i.h == this) {
            this.K(i.k());
            return;
        }
        throw new IllegalArgumentException("Tab does not belong to this TabLayout.");
    }
    
    public void K(final int index) {
        final i h = this.H;
        int k;
        if (h != null) {
            k = h.k();
        }
        else {
            k = 0;
        }
        this.L(index);
        final i i = this.G.remove(index);
        if (i != null) {
            i.q();
            this.F(i);
        }
        for (int size = this.G.size(), j = index; j < size; ++j) {
            this.G.get(j).z(j);
        }
        if (k == index) {
            i l;
            if (this.G.isEmpty()) {
                l = null;
            }
            else {
                l = this.G.get(Math.max(0, index - 1));
            }
            this.M(l);
        }
    }
    
    public void M(@k0 final i i) {
        this.N(i, true);
    }
    
    public void N(@k0 final i h, final boolean b) {
        final i h2 = this.H;
        if (h2 == h) {
            if (h2 != null) {
                this.v(h);
                this.l(h.k());
            }
        }
        else {
            int k;
            if (h != null) {
                k = h.k();
            }
            else {
                k = -1;
            }
            if (b) {
                if ((h2 == null || h2.k() == -1) && k != -1) {
                    this.P(k, 0.0f, true);
                }
                else {
                    this.l(k);
                }
                if (k != -1) {
                    this.setSelectedTabView(k);
                }
            }
            this.H = h;
            if (h2 != null) {
                this.x(h2);
            }
            if (h != null) {
                this.w(h);
            }
        }
    }
    
    void O(@k0 final a t0, final boolean b) {
        final a t2 = this.t0;
        if (t2 != null) {
            final DataSetObserver u0 = this.u0;
            if (u0 != null) {
                t2.unregisterDataSetObserver(u0);
            }
        }
        this.t0 = t0;
        if (b && t0 != null) {
            if (this.u0 == null) {
                this.u0 = new g();
            }
            t0.registerDataSetObserver(this.u0);
        }
        this.E();
    }
    
    public void P(final int n, final float n2, final boolean b) {
        this.Q(n, n2, b, true);
    }
    
    public void Q(final int n, final float n2, final boolean b, final boolean b2) {
        final int round = Math.round(n + n2);
        if (round >= 0) {
            if (round < this.I.getChildCount()) {
                if (b2) {
                    this.I.f(n, n2);
                }
                final ValueAnimator r0 = this.r0;
                if (r0 != null && r0.isRunning()) {
                    this.r0.cancel();
                }
                this.scrollTo(this.o(n, n2), 0);
                if (b) {
                    this.setSelectedTabView(round);
                }
            }
        }
    }
    
    public void R(final int n, final int n2) {
        this.setTabTextColors(r(n, n2));
    }
    
    public void S(@k0 final ViewPager viewPager, final boolean b) {
        this.T(viewPager, b, false);
    }
    
    void W(final boolean b) {
        for (int i = 0; i < this.I.getChildCount(); ++i) {
            final View child = this.I.getChildAt(i);
            child.setMinimumWidth(this.getTabMinWidth());
            this.V((LinearLayout$LayoutParams)child.getLayoutParams());
            if (b) {
                child.requestLayout();
            }
        }
    }
    
    public void addView(final View view) {
        this.k(view);
    }
    
    public void addView(final View view, final int n) {
        this.k(view);
    }
    
    public void addView(final View view, final int n, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.k(view);
    }
    
    public void addView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.k(view);
    }
    
    @Deprecated
    public void c(@k0 final c c) {
        if (!this.p0.contains(c)) {
            this.p0.add(c);
        }
    }
    
    public void d(@j0 final f f) {
        this.c((c)f);
    }
    
    public void e(@j0 final i i) {
        this.h(i, this.G.isEmpty());
    }
    
    public void f(@j0 final i i, final int n) {
        this.g(i, n, this.G.isEmpty());
    }
    
    public void g(@j0 final i i, final int n, final boolean b) {
        if (i.h == this) {
            this.q(i, n);
            this.j(i);
            if (b) {
                i.r();
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }
    
    public FrameLayout$LayoutParams generateLayoutParams(final AttributeSet set) {
        return this.generateDefaultLayoutParams();
    }
    
    public int getSelectedTabPosition() {
        final i h = this.H;
        int k;
        if (h != null) {
            k = h.k();
        }
        else {
            k = -1;
        }
        return k;
    }
    
    public int getTabCount() {
        return this.G.size();
    }
    
    public int getTabGravity() {
        return this.f0;
    }
    
    @k0
    public ColorStateList getTabIconTint() {
        return this.P;
    }
    
    public int getTabIndicatorAnimationMode() {
        return this.l0;
    }
    
    public int getTabIndicatorGravity() {
        return this.h0;
    }
    
    int getTabMaxWidth() {
        return this.a0;
    }
    
    public int getTabMode() {
        return this.i0;
    }
    
    @k0
    public ColorStateList getTabRippleColor() {
        return this.Q;
    }
    
    @j0
    public Drawable getTabSelectedIndicator() {
        return this.R;
    }
    
    @k0
    public ColorStateList getTabTextColors() {
        return this.O;
    }
    
    public void h(@j0 final i i, final boolean b) {
        this.g(i, this.G.size(), b);
    }
    
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.google.android.material.shape.k.e((View)this);
        if (this.s0 == null) {
            final ViewParent parent = this.getParent();
            if (parent instanceof ViewPager) {
                this.T((ViewPager)parent, true, true);
            }
        }
    }
    
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.x0) {
            this.setupWithViewPager(null);
            this.x0 = false;
        }
    }
    
    protected void onDraw(@j0 final Canvas canvas) {
        for (int i = 0; i < this.I.getChildCount(); ++i) {
            final View child = this.I.getChildAt(i);
            if (child instanceof n) {
                ((n)child).m(canvas);
            }
        }
        super.onDraw(canvas);
    }
    
    public void onInitializeAccessibilityNodeInfo(@j0 final AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        androidx.core.view.accessibility.d.V1(accessibilityNodeInfo).W0(androidx.core.view.accessibility.d.b.f(1, this.getTabCount(), false, 1));
    }
    
    protected void onMeasure(int n, int c0) {
        final int round = Math.round(com.google.android.material.internal.b0.e(this.getContext(), this.getDefaultHeight()));
        final int mode = View$MeasureSpec.getMode(c0);
        final int n2 = 0;
        int measureSpec;
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                measureSpec = c0;
            }
            else {
                measureSpec = View$MeasureSpec.makeMeasureSpec(round + this.getPaddingTop() + this.getPaddingBottom(), 1073741824);
            }
        }
        else {
            measureSpec = c0;
            if (this.getChildCount() == 1) {
                measureSpec = c0;
                if (View$MeasureSpec.getSize(c0) >= round) {
                    this.getChildAt(0).setMinimumHeight(round);
                    measureSpec = c0;
                }
            }
        }
        final int size = View$MeasureSpec.getSize(n);
        if (View$MeasureSpec.getMode(n) != 0) {
            c0 = this.c0;
            if (c0 <= 0) {
                c0 = (int)(size - com.google.android.material.internal.b0.e(this.getContext(), 56));
            }
            this.a0 = c0;
        }
        super.onMeasure(n, measureSpec);
        if (this.getChildCount() == 1) {
            final View child = this.getChildAt(0);
            n = this.i0;
            Label_0227: {
                while (true) {
                    Label_0209: {
                        if (n == 0) {
                            break Label_0209;
                        }
                        if (n != 1) {
                            if (n != 2) {
                                n = n2;
                                break Label_0227;
                            }
                            break Label_0209;
                        }
                        else {
                            n = n2;
                            if (child.getMeasuredWidth() == this.getMeasuredWidth()) {
                                break Label_0227;
                            }
                        }
                        n = 1;
                        break Label_0227;
                    }
                    n = n2;
                    if (child.getMeasuredWidth() < this.getMeasuredWidth()) {
                        continue;
                    }
                    break;
                }
            }
            if (n != 0) {
                n = HorizontalScrollView.getChildMeasureSpec(measureSpec, this.getPaddingTop() + this.getPaddingBottom(), child.getLayoutParams().height);
                child.measure(View$MeasureSpec.makeMeasureSpec(this.getMeasuredWidth(), 1073741824), n);
            }
        }
    }
    
    public void p() {
        this.p0.clear();
    }
    
    @p0(21)
    public void setElevation(final float elevation) {
        super.setElevation(elevation);
        com.google.android.material.shape.k.d((View)this, elevation);
    }
    
    public void setInlineLabel(final boolean j0) {
        if (this.j0 != j0) {
            this.j0 = j0;
            for (int i = 0; i < this.I.getChildCount(); ++i) {
                final View child = this.I.getChildAt(i);
                if (child instanceof n) {
                    ((n)child).z();
                }
            }
            this.n();
        }
    }
    
    public void setInlineLabelResource(@androidx.annotation.h final int n) {
        this.setInlineLabel(this.getResources().getBoolean(n));
    }
    
    @Deprecated
    public void setOnTabSelectedListener(@k0 final c o0) {
        final c o2 = this.o0;
        if (o2 != null) {
            this.H(o2);
        }
        if ((this.o0 = o0) != null) {
            this.c(o0);
        }
    }
    
    @Deprecated
    public void setOnTabSelectedListener(@k0 final f onTabSelectedListener) {
        this.setOnTabSelectedListener((c)onTabSelectedListener);
    }
    
    void setScrollAnimatorListener(final Animator$AnimatorListener animator$AnimatorListener) {
        this.y();
        this.r0.addListener(animator$AnimatorListener);
    }
    
    public void setSelectedTabIndicator(@s final int n) {
        Drawable d;
        if (n != 0) {
            d = androidx.appcompat.content.res.a.d(this.getContext(), n);
        }
        else {
            d = null;
        }
        this.setSelectedTabIndicator(d);
    }
    
    public void setSelectedTabIndicator(@k0 Drawable r) {
        if (this.R != r) {
            if (r == null) {
                r = (Drawable)new GradientDrawable();
            }
            this.R = r;
        }
    }
    
    public void setSelectedTabIndicatorColor(@androidx.annotation.l final int s) {
        this.S = s;
    }
    
    public void setSelectedTabIndicatorGravity(final int h0) {
        if (this.h0 != h0) {
            this.h0 = h0;
            androidx.core.view.j0.l1((View)this.I);
        }
    }
    
    @Deprecated
    public void setSelectedTabIndicatorHeight(final int n) {
        this.I.g(n);
    }
    
    public void setTabGravity(final int f0) {
        if (this.f0 != f0) {
            this.f0 = f0;
            this.n();
        }
    }
    
    public void setTabIconTint(@k0 final ColorStateList p) {
        if (this.P != p) {
            this.P = p;
            this.U();
        }
    }
    
    public void setTabIconTintResource(@androidx.annotation.n final int n) {
        this.setTabIconTint(androidx.appcompat.content.res.a.c(this.getContext(), n));
    }
    
    public void setTabIndicatorAnimationMode(final int n) {
        this.l0 = n;
        com.google.android.material.tabs.b n2;
        if (n != 0) {
            if (n != 1) {
                final StringBuilder sb = new StringBuilder();
                sb.append(n);
                sb.append(" is not a valid TabIndicatorAnimationMode");
                throw new IllegalArgumentException(sb.toString());
            }
            n2 = new com.google.android.material.tabs.a();
        }
        else {
            n2 = new com.google.android.material.tabs.b();
        }
        this.n0 = n2;
    }
    
    public void setTabIndicatorFullWidth(final boolean k0) {
        this.k0 = k0;
        androidx.core.view.j0.l1((View)this.I);
    }
    
    public void setTabMode(final int i0) {
        if (i0 != this.i0) {
            this.i0 = i0;
            this.n();
        }
    }
    
    public void setTabRippleColor(@k0 final ColorStateList q) {
        if (this.Q != q) {
            this.Q = q;
            for (int i = 0; i < this.I.getChildCount(); ++i) {
                final View child = this.I.getChildAt(i);
                if (child instanceof n) {
                    ((n)child).y(this.getContext());
                }
            }
        }
    }
    
    public void setTabRippleColorResource(@androidx.annotation.n final int n) {
        this.setTabRippleColor(androidx.appcompat.content.res.a.c(this.getContext(), n));
    }
    
    public void setTabTextColors(@k0 final ColorStateList o) {
        if (this.O != o) {
            this.O = o;
            this.U();
        }
    }
    
    @Deprecated
    public void setTabsFromPagerAdapter(@k0 final a a) {
        this.O(a, false);
    }
    
    public void setUnboundedRipple(final boolean m0) {
        if (this.m0 != m0) {
            this.m0 = m0;
            for (int i = 0; i < this.I.getChildCount(); ++i) {
                final View child = this.I.getChildAt(i);
                if (child instanceof n) {
                    ((n)child).y(this.getContext());
                }
            }
        }
    }
    
    public void setUnboundedRippleResource(@androidx.annotation.h final int n) {
        this.setUnboundedRipple(this.getResources().getBoolean(n));
    }
    
    public void setupWithViewPager(@k0 final ViewPager viewPager) {
        this.S(viewPager, true);
    }
    
    public boolean shouldDelayChildPressedState() {
        return this.getTabScrollRange() > 0;
    }
    
    protected i t() {
        i i;
        if ((i = TabLayout.H0.b()) == null) {
            i = new i();
        }
        return i;
    }
    
    @k0
    public i z(final int index) {
        i i;
        if (index >= 0 && index < this.getTabCount()) {
            i = this.G.get(index);
        }
        else {
            i = null;
        }
        return i;
    }
    
    private class b implements ViewPager.i
    {
        private boolean G;
        
        b() {
        }
        
        @Override
        public void a(@j0 final ViewPager viewPager, @k0 final a a, @k0 final a a2) {
            final TabLayout h = TabLayout.this;
            if (h.s0 == viewPager) {
                h.O(a2, this.G);
            }
        }
        
        void b(final boolean g) {
            this.G = g;
        }
    }
    
    @Deprecated
    public interface c<T extends i>
    {
        void g(final T p0);
        
        void i(final T p0);
        
        void p(final T p0);
    }
    
    public @interface d {
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @t0({ t0.a.H })
    public @interface e {
    }
    
    public interface f extends c<i>
    {
    }
    
    private class g extends DataSetObserver
    {
        g() {
        }
        
        public void onChanged() {
            TabLayout.this.E();
        }
        
        public void onInvalidated() {
            TabLayout.this.E();
        }
    }
    
    class h extends LinearLayout
    {
        ValueAnimator G;
        int H;
        float I;
        private int J;
        
        h(final Context context) {
            super(context);
            this.H = -1;
            this.J = -1;
            this.setWillNotDraw(false);
        }
        
        private void e() {
            final View child = this.getChildAt(this.H);
            final com.google.android.material.tabs.b a = TabLayout.this.n0;
            final TabLayout k = TabLayout.this;
            a.d(k, child, k.R);
        }
        
        private void h(final View view, final View view2, final float n) {
            if (view != null && view.getWidth() > 0) {
                final com.google.android.material.tabs.b a = TabLayout.this.n0;
                final TabLayout k = TabLayout.this;
                a.c(k, view, view2, n, k.R);
            }
            else {
                final Drawable r = TabLayout.this.R;
                r.setBounds(-1, r.getBounds().top, -1, TabLayout.this.R.getBounds().bottom);
            }
            androidx.core.view.j0.l1((View)this);
        }
        
        private void i(final boolean b, final int n, final int n2) {
            final View child = this.getChildAt(this.H);
            final View child2 = this.getChildAt(n);
            if (child2 == null) {
                this.e();
                return;
            }
            final ValueAnimator$AnimatorUpdateListener valueAnimator$AnimatorUpdateListener = (ValueAnimator$AnimatorUpdateListener)new ValueAnimator$AnimatorUpdateListener() {
                public void onAnimationUpdate(@j0 final ValueAnimator valueAnimator) {
                    h.this.h(child, child2, valueAnimator.getAnimatedFraction());
                }
            };
            if (b) {
                final ValueAnimator g = new ValueAnimator();
                (this.G = g).setInterpolator(com.google.android.material.animation.a.b);
                g.setDuration((long)n2);
                g.setFloatValues(new float[] { 0.0f, 1.0f });
                g.addUpdateListener((ValueAnimator$AnimatorUpdateListener)valueAnimator$AnimatorUpdateListener);
                g.addListener((Animator$AnimatorListener)new AnimatorListenerAdapter() {
                    public void onAnimationEnd(final Animator animator) {
                        h.this.H = n;
                    }
                    
                    public void onAnimationStart(final Animator animator) {
                        h.this.H = n;
                    }
                });
                g.start();
            }
            else {
                this.G.removeAllUpdateListeners();
                this.G.addUpdateListener((ValueAnimator$AnimatorUpdateListener)valueAnimator$AnimatorUpdateListener);
            }
        }
        
        void b(final int n, final int n2) {
            final ValueAnimator g = this.G;
            if (g != null && g.isRunning()) {
                this.G.cancel();
            }
            this.i(true, n, n2);
        }
        
        boolean c() {
            for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
                if (this.getChildAt(i).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }
        
        float d() {
            return this.H + this.I;
        }
        
        public void draw(@j0 final Canvas canvas) {
            int n;
            if ((n = TabLayout.this.R.getBounds().height()) < 0) {
                n = TabLayout.this.R.getIntrinsicHeight();
            }
            final int h0 = TabLayout.this.h0;
            final int n2 = 0;
            final int n3 = 0;
            int n4 = 0;
            Label_0116: {
                if (h0 != 0) {
                    if (h0 == 1) {
                        n4 = (this.getHeight() - n) / 2;
                        n = (this.getHeight() + n) / 2;
                        break Label_0116;
                    }
                    n4 = n2;
                    if (h0 == 2) {
                        break Label_0116;
                    }
                    n4 = n3;
                    if (h0 != 3) {
                        n = 0;
                        n4 = n2;
                        break Label_0116;
                    }
                }
                else {
                    n4 = this.getHeight() - n;
                }
                n = this.getHeight();
            }
            if (TabLayout.this.R.getBounds().width() > 0) {
                final Rect bounds = TabLayout.this.R.getBounds();
                TabLayout.this.R.setBounds(bounds.left, n4, bounds.right, n);
                final TabLayout k = TabLayout.this;
                Drawable drawable2;
                final Drawable drawable = drawable2 = k.R;
                if (k.S != 0) {
                    drawable2 = androidx.core.graphics.drawable.c.r(drawable);
                    if (Build$VERSION.SDK_INT == 21) {
                        drawable2.setColorFilter(TabLayout.this.S, PorterDuff$Mode.SRC_IN);
                    }
                    else {
                        androidx.core.graphics.drawable.c.n(drawable2, TabLayout.this.S);
                    }
                }
                drawable2.draw(canvas);
            }
            super.draw(canvas);
        }
        
        void f(final int h, final float i) {
            final ValueAnimator g = this.G;
            if (g != null && g.isRunning()) {
                this.G.cancel();
            }
            this.H = h;
            this.I = i;
            this.h(this.getChildAt(h), this.getChildAt(this.H + 1), this.I);
        }
        
        void g(final int n) {
            final Rect bounds = TabLayout.this.R.getBounds();
            TabLayout.this.R.setBounds(bounds.left, 0, bounds.right, n);
            this.requestLayout();
        }
        
        protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
            super.onLayout(b, n, n2, n3, n4);
            final ValueAnimator g = this.G;
            if (g != null && g.isRunning()) {
                this.i(false, this.H, -1);
            }
            else {
                this.e();
            }
        }
        
        protected void onMeasure(final int n, final int n2) {
            super.onMeasure(n, n2);
            if (View$MeasureSpec.getMode(n) != 1073741824) {
                return;
            }
            final TabLayout k = TabLayout.this;
            final int f0 = k.f0;
            final int n3 = 1;
            if (f0 == 1 || k.i0 == 2) {
                final int childCount = this.getChildCount();
                final int n4 = 0;
                int i = 0;
                int n5 = 0;
                while (i < childCount) {
                    final View child = this.getChildAt(i);
                    int max = n5;
                    if (child.getVisibility() == 0) {
                        max = Math.max(n5, child.getMeasuredWidth());
                    }
                    ++i;
                    n5 = max;
                }
                if (n5 <= 0) {
                    return;
                }
                int n6;
                if (n5 * childCount <= this.getMeasuredWidth() - (int)com.google.android.material.internal.b0.e(this.getContext(), 16) * 2) {
                    n6 = 0;
                    for (int j = n4; j < childCount; ++j) {
                        final LinearLayout$LayoutParams linearLayout$LayoutParams = (LinearLayout$LayoutParams)this.getChildAt(j).getLayoutParams();
                        if (linearLayout$LayoutParams.width != n5 || linearLayout$LayoutParams.weight != 0.0f) {
                            linearLayout$LayoutParams.width = n5;
                            linearLayout$LayoutParams.weight = 0.0f;
                            n6 = 1;
                        }
                    }
                }
                else {
                    final TabLayout l = TabLayout.this;
                    l.f0 = 0;
                    l.W(false);
                    n6 = n3;
                }
                if (n6 != 0) {
                    super.onMeasure(n, n2);
                }
            }
        }
        
        public void onRtlPropertiesChanged(final int j) {
            super.onRtlPropertiesChanged(j);
            if (Build$VERSION.SDK_INT < 23 && this.J != j) {
                this.requestLayout();
                this.J = j;
            }
        }
    }
    
    public static class i
    {
        public static final int k = -1;
        @k0
        private Object a;
        @k0
        private Drawable b;
        @k0
        private CharSequence c;
        @k0
        private CharSequence d;
        private int e;
        @k0
        private View f;
        @d
        private int g;
        @k0
        public TabLayout h;
        @j0
        public n i;
        private int j;
        
        public i() {
            this.e = -1;
            this.g = 1;
            this.j = -1;
        }
        
        @j0
        public i A(@d final int g) {
            this.g = g;
            final TabLayout h = this.h;
            if (h.f0 == 1 || h.i0 == 2) {
                h.W(true);
            }
            this.E();
            if (com.google.android.material.badge.b.a && this.i.o() && this.i.K.isVisible()) {
                this.i.invalidate();
            }
            return this;
        }
        
        @j0
        public i B(@k0 final Object a) {
            this.a = a;
            return this;
        }
        
        @j0
        public i C(@w0 final int n) {
            final TabLayout h = this.h;
            if (h != null) {
                return this.D(h.getResources().getText(n));
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
        
        @j0
        public i D(@k0 final CharSequence charSequence) {
            if (TextUtils.isEmpty(this.d) && !TextUtils.isEmpty(charSequence)) {
                this.i.setContentDescription(charSequence);
            }
            this.c = charSequence;
            this.E();
            return this;
        }
        
        void E() {
            final n i = this.i;
            if (i != null) {
                i.x();
            }
        }
        
        @k0
        public com.google.android.material.badge.a e() {
            return this.i.getBadge();
        }
        
        @k0
        public CharSequence f() {
            final n i = this.i;
            CharSequence contentDescription;
            if (i == null) {
                contentDescription = null;
            }
            else {
                contentDescription = i.getContentDescription();
            }
            return contentDescription;
        }
        
        @k0
        public View g() {
            return this.f;
        }
        
        @k0
        public Drawable h() {
            return this.b;
        }
        
        public int i() {
            return this.j;
        }
        
        @j0
        public com.google.android.material.badge.a j() {
            return this.i.getOrCreateBadge();
        }
        
        public int k() {
            return this.e;
        }
        
        @d
        public int l() {
            return this.g;
        }
        
        @k0
        public Object m() {
            return this.a;
        }
        
        @k0
        public CharSequence n() {
            return this.c;
        }
        
        public boolean o() {
            final TabLayout h = this.h;
            if (h != null) {
                return h.getSelectedTabPosition() == this.e;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
        
        public void p() {
            this.i.r();
        }
        
        void q() {
            this.h = null;
            this.i = null;
            this.a = null;
            this.b = null;
            this.j = -1;
            this.c = null;
            this.d = null;
            this.e = -1;
            this.f = null;
        }
        
        public void r() {
            final TabLayout h = this.h;
            if (h != null) {
                h.M(this);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
        
        @j0
        public i s(@w0 final int n) {
            final TabLayout h = this.h;
            if (h != null) {
                return this.t(h.getResources().getText(n));
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
        
        @j0
        public i t(@k0 final CharSequence d) {
            this.d = d;
            this.E();
            return this;
        }
        
        @j0
        public i u(@e0 final int n) {
            return this.v(LayoutInflater.from(this.i.getContext()).inflate(n, (ViewGroup)this.i, false));
        }
        
        @j0
        public i v(@k0 final View f) {
            this.f = f;
            this.E();
            return this;
        }
        
        @j0
        public i w(@s final int n) {
            final TabLayout h = this.h;
            if (h != null) {
                return this.x(androidx.appcompat.content.res.a.d(h.getContext(), n));
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
        
        @j0
        public i x(@k0 final Drawable b) {
            this.b = b;
            final TabLayout h = this.h;
            if (h.f0 == 1 || h.i0 == 2) {
                h.W(true);
            }
            this.E();
            if (com.google.android.material.badge.b.a && this.i.o() && this.i.K.isVisible()) {
                this.i.invalidate();
            }
            return this;
        }
        
        @j0
        public i y(final int n) {
            this.j = n;
            final n i = this.i;
            if (i != null) {
                i.setId(n);
            }
            return this;
        }
        
        void z(final int e) {
            this.e = e;
        }
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @t0({ t0.a.H })
    public @interface j {
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @t0({ t0.a.H })
    public @interface k {
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @t0({ t0.a.H })
    public @interface l {
    }
    
    public static class m implements ViewPager.j
    {
        @j0
        private final WeakReference<TabLayout> G;
        private int H;
        private int I;
        
        public m(final TabLayout referent) {
            this.G = new WeakReference<TabLayout>(referent);
        }
        
        void a() {
            this.I = 0;
            this.H = 0;
        }
        
        @Override
        public void b(final int n, final float n2, int i) {
            final TabLayout tabLayout = this.G.get();
            if (tabLayout != null) {
                i = this.I;
                boolean b = false;
                final boolean b2 = i != 2 || this.H == 1;
                if (i != 2 || this.H != 0) {
                    b = true;
                }
                tabLayout.Q(n, n2, b2, b);
            }
        }
        
        @Override
        public void k(final int i) {
            this.H = this.I;
            this.I = i;
        }
        
        @Override
        public void l(final int n) {
            final TabLayout tabLayout = this.G.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != n && n < tabLayout.getTabCount()) {
                final int i = this.I;
                tabLayout.N(tabLayout.z(n), i == 0 || (i == 2 && this.H == 0));
            }
        }
    }
    
    public final class n extends LinearLayout
    {
        private i G;
        private TextView H;
        private ImageView I;
        @k0
        private View J;
        @k0
        private com.google.android.material.badge.a K;
        @k0
        private View L;
        @k0
        private TextView M;
        @k0
        private ImageView N;
        @k0
        private Drawable O;
        private int P;
        
        public n(final Context context) {
            super(context);
            this.P = 2;
            this.y(context);
            androidx.core.view.j0.b2((View)this, TabLayout.this.J, TabLayout.this.K, TabLayout.this.L, TabLayout.this.M);
            this.setGravity(17);
            this.setOrientation((int)((TabLayout.this.j0 ^ true) ? 1 : 0));
            this.setClickable(true);
            androidx.core.view.j0.e2((View)this, androidx.core.view.e0.c(this.getContext(), 1002));
        }
        
        private void A(@k0 final TextView textView, @k0 final ImageView imageView) {
            final i g = this.G;
            final CharSequence charSequence = null;
            Drawable mutate;
            if (g != null && g.h() != null) {
                mutate = androidx.core.graphics.drawable.c.r(this.G.h()).mutate();
            }
            else {
                mutate = null;
            }
            final i g2 = this.G;
            CharSequence n;
            if (g2 != null) {
                n = g2.n();
            }
            else {
                n = null;
            }
            if (imageView != null) {
                if (mutate != null) {
                    imageView.setImageDrawable(mutate);
                    imageView.setVisibility(0);
                    this.setVisibility(0);
                }
                else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable((Drawable)null);
                }
            }
            final boolean b = TextUtils.isEmpty(n) ^ true;
            if (textView != null) {
                if (b) {
                    textView.setText(n);
                    if (this.G.g == 1) {
                        textView.setVisibility(0);
                    }
                    else {
                        textView.setVisibility(8);
                    }
                    this.setVisibility(0);
                }
                else {
                    textView.setVisibility(8);
                    textView.setText((CharSequence)null);
                }
            }
            Label_0268: {
                if (imageView != null) {
                    final ViewGroup$MarginLayoutParams layoutParams = (ViewGroup$MarginLayoutParams)imageView.getLayoutParams();
                    int bottomMargin;
                    if (b && imageView.getVisibility() == 0) {
                        bottomMargin = (int)com.google.android.material.internal.b0.e(this.getContext(), 8);
                    }
                    else {
                        bottomMargin = 0;
                    }
                    if (TabLayout.this.j0) {
                        if (bottomMargin == androidx.core.view.n.b(layoutParams)) {
                            break Label_0268;
                        }
                        androidx.core.view.n.g(layoutParams, bottomMargin);
                        layoutParams.bottomMargin = 0;
                    }
                    else {
                        if (bottomMargin == layoutParams.bottomMargin) {
                            break Label_0268;
                        }
                        layoutParams.bottomMargin = bottomMargin;
                        androidx.core.view.n.g(layoutParams, 0);
                    }
                    imageView.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
                    imageView.requestLayout();
                }
            }
            final i g3 = this.G;
            CharSequence c = charSequence;
            if (g3 != null) {
                c = g3.d;
            }
            final int sdk_INT = Build$VERSION.SDK_INT;
            if (sdk_INT < 21 || sdk_INT > 23) {
                if (b) {
                    c = n;
                }
                androidx.appcompat.widget.w0.a((View)this, c);
            }
        }
        
        @k0
        private com.google.android.material.badge.a getBadge() {
            return this.K;
        }
        
        @j0
        private com.google.android.material.badge.a getOrCreateBadge() {
            if (this.K == null) {
                this.K = com.google.android.material.badge.a.d(this.getContext());
            }
            this.v();
            final com.google.android.material.badge.a k = this.K;
            if (k != null) {
                return k;
            }
            throw new IllegalStateException("Unable to create badge");
        }
        
        private void i(@k0 final View view) {
            if (view == null) {
                return;
            }
            view.addOnLayoutChangeListener((View$OnLayoutChangeListener)new View$OnLayoutChangeListener() {
                public void onLayoutChange(final View view, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
                    if (view.getVisibility() == 0) {
                        TabLayout.n.this.w(view);
                    }
                }
            });
        }
        
        private float j(@j0 final Layout layout, final int n, final float n2) {
            return layout.getLineWidth(n) * (n2 / layout.getPaint().getTextSize());
        }
        
        private void k(final boolean b) {
            this.setClipChildren(b);
            this.setClipToPadding(b);
            final ViewGroup viewGroup = (ViewGroup)this.getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(b);
                viewGroup.setClipToPadding(b);
            }
        }
        
        @j0
        private FrameLayout l() {
            final FrameLayout frameLayout = new FrameLayout(this.getContext());
            frameLayout.setLayoutParams((ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-2, -2));
            return frameLayout;
        }
        
        private void m(@j0 final Canvas canvas) {
            final Drawable o = this.O;
            if (o != null) {
                o.setBounds(this.getLeft(), this.getTop(), this.getRight(), this.getBottom());
                this.O.draw(canvas);
            }
        }
        
        @k0
        private FrameLayout n(@j0 final View view) {
            final ImageView i = this.I;
            FrameLayout frameLayout = null;
            if (view != i && view != this.H) {
                return null;
            }
            if (com.google.android.material.badge.b.a) {
                frameLayout = (FrameLayout)view.getParent();
            }
            return frameLayout;
        }
        
        private boolean o() {
            return this.K != null;
        }
        
        private void p() {
            Object l;
            if (com.google.android.material.badge.b.a) {
                l = this.l();
                this.addView((View)l, 0);
            }
            else {
                l = this;
            }
            ((ViewGroup)l).addView((View)(this.I = (ImageView)LayoutInflater.from(this.getContext()).inflate(o2.a.k.H, (ViewGroup)l, false)), 0);
        }
        
        private void q() {
            Object l;
            if (com.google.android.material.badge.b.a) {
                l = this.l();
                this.addView((View)l);
            }
            else {
                l = this;
            }
            ((ViewGroup)l).addView((View)(this.H = (TextView)LayoutInflater.from(this.getContext()).inflate(o2.a.k.I, (ViewGroup)l, false)));
        }
        
        private void r() {
            if (this.J != null) {
                this.u();
            }
            this.K = null;
        }
        
        private void t(@k0 final View j) {
            if (!this.o()) {
                return;
            }
            if (j != null) {
                this.k(false);
                com.google.android.material.badge.b.b(this.K, j, this.n(j));
                this.J = j;
            }
        }
        
        private void u() {
            if (!this.o()) {
                return;
            }
            this.k(true);
            final View j = this.J;
            if (j != null) {
                com.google.android.material.badge.b.g(this.K, j);
                this.J = null;
            }
        }
        
        private void v() {
            if (!this.o()) {
                return;
            }
            if (this.L == null) {
            Label_0071_Outer:
                while (true) {
                    while (true) {
                        Label_0087: {
                            if (this.I == null) {
                                break Label_0087;
                            }
                            final i g = this.G;
                            if (g == null || g.h() == null) {
                                break Label_0087;
                            }
                            final Object o;
                            if (this.J == (o = this.I)) {
                                break Label_0079;
                            }
                            this.u();
                            final Object o2 = this.I;
                            this.t((View)o2);
                            return;
                            this.w((View)o);
                            return;
                        }
                        if (this.H != null) {
                            final i g2 = this.G;
                            if (g2 != null && g2.l() == 1) {
                                final Object o;
                                if (this.J != (o = this.H)) {
                                    this.u();
                                    final Object o2 = this.H;
                                    continue;
                                }
                                continue Label_0071_Outer;
                            }
                        }
                        break;
                    }
                    break;
                }
            }
            this.u();
        }
        
        private void w(@j0 final View view) {
            if (this.o() && view == this.J) {
                com.google.android.material.badge.b.j(this.K, view, this.n(view));
            }
        }
        
        private void y(final Context context) {
            final int w = TabLayout.this.W;
            final Drawable drawable = null;
            if (w != 0) {
                final Drawable d = androidx.appcompat.content.res.a.d(context, w);
                this.O = d;
                if (d != null && d.isStateful()) {
                    this.O.setState(this.getDrawableState());
                }
            }
            else {
                this.O = null;
            }
            final GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(0);
            Object o = gradientDrawable;
            if (TabLayout.this.Q != null) {
                final GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setCornerRadius(1.0E-5f);
                gradientDrawable2.setColor(-1);
                final ColorStateList a = com.google.android.material.ripple.b.a(TabLayout.this.Q);
                if (Build$VERSION.SDK_INT >= 21) {
                    final boolean m0 = TabLayout.this.m0;
                    Object o2 = gradientDrawable;
                    if (m0) {
                        o2 = null;
                    }
                    Drawable drawable2;
                    if (m0) {
                        drawable2 = drawable;
                    }
                    else {
                        drawable2 = (Drawable)gradientDrawable2;
                    }
                    o = new RippleDrawable(a, (Drawable)o2, drawable2);
                }
                else {
                    final Drawable r = androidx.core.graphics.drawable.c.r((Drawable)gradientDrawable2);
                    androidx.core.graphics.drawable.c.o(r, a);
                    o = new LayerDrawable(new Drawable[] { (Drawable)gradientDrawable, r });
                }
            }
            androidx.core.view.j0.G1((View)this, (Drawable)o);
            TabLayout.this.invalidate();
        }
        
        protected void drawableStateChanged() {
            super.drawableStateChanged();
            final int[] drawableState = this.getDrawableState();
            final Drawable o = this.O;
            int n = 0;
            if (o != null) {
                n = n;
                if (o.isStateful()) {
                    n = ((false | this.O.setState(drawableState)) ? 1 : 0);
                }
            }
            if (n != 0) {
                this.invalidate();
                TabLayout.this.invalidate();
            }
        }
        
        int getContentHeight() {
            final TextView h = this.H;
            int i = 0;
            final ImageView j = this.I;
            final View l = this.L;
            int a = 0;
            int a2 = 0;
            int n = 0;
            while (i < 3) {
                final View view = (new View[] { (View)h, (View)j, l })[i];
                int n2 = a;
                int n3 = a2;
                int n4 = n;
                if (view != null) {
                    n2 = a;
                    n3 = a2;
                    n4 = n;
                    if (view.getVisibility() == 0) {
                        int n5;
                        if (n != 0) {
                            n5 = Math.min(a2, view.getTop());
                        }
                        else {
                            n5 = view.getTop();
                        }
                        int n6;
                        if (n != 0) {
                            n6 = Math.max(a, view.getBottom());
                        }
                        else {
                            n6 = view.getBottom();
                        }
                        n4 = 1;
                        n3 = n5;
                        n2 = n6;
                    }
                }
                ++i;
                a = n2;
                a2 = n3;
                n = n4;
            }
            return a - a2;
        }
        
        int getContentWidth() {
            final TextView h = this.H;
            int i = 0;
            final ImageView j = this.I;
            final View l = this.L;
            int a = 0;
            int a2 = 0;
            int n = 0;
            while (i < 3) {
                final View view = (new View[] { (View)h, (View)j, l })[i];
                int n2 = a;
                int n3 = a2;
                int n4 = n;
                if (view != null) {
                    n2 = a;
                    n3 = a2;
                    n4 = n;
                    if (view.getVisibility() == 0) {
                        if (n != 0) {
                            n3 = Math.min(a2, view.getLeft());
                        }
                        else {
                            n3 = view.getLeft();
                        }
                        int n5;
                        if (n != 0) {
                            n5 = Math.max(a, view.getRight());
                        }
                        else {
                            n5 = view.getRight();
                        }
                        n4 = 1;
                        n2 = n5;
                    }
                }
                ++i;
                a = n2;
                a2 = n3;
                n = n4;
            }
            return a - a2;
        }
        
        @k0
        public i getTab() {
            return this.G;
        }
        
        public void onInitializeAccessibilityNodeInfo(@j0 final AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            final com.google.android.material.badge.a k = this.K;
            if (k != null && k.isVisible()) {
                final CharSequence contentDescription = this.getContentDescription();
                final StringBuilder sb = new StringBuilder();
                sb.append((Object)contentDescription);
                sb.append(", ");
                sb.append((Object)this.K.o());
                accessibilityNodeInfo.setContentDescription((CharSequence)sb.toString());
            }
            final androidx.core.view.accessibility.d v1 = androidx.core.view.accessibility.d.V1(accessibilityNodeInfo);
            v1.X0(androidx.core.view.accessibility.d.c.h(0, 1, this.G.k(), 1, false, this.isSelected()));
            if (this.isSelected()) {
                v1.V0(false);
                v1.J0(androidx.core.view.accessibility.d.a.j);
            }
            v1.B1(this.getResources().getString(o2.a.m.P));
        }
        
        public void onMeasure(int maxLines, final int n) {
            final int size = View$MeasureSpec.getSize(maxLines);
            final int mode = View$MeasureSpec.getMode(maxLines);
            final int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            int measureSpec = maxLines;
            Label_0057: {
                if (tabMaxWidth > 0) {
                    if (mode != 0) {
                        measureSpec = maxLines;
                        if (size <= tabMaxWidth) {
                            break Label_0057;
                        }
                    }
                    measureSpec = View$MeasureSpec.makeMeasureSpec(TabLayout.this.a0, Integer.MIN_VALUE);
                }
            }
            super.onMeasure(measureSpec, n);
            if (this.H != null) {
                final float u = TabLayout.this.U;
                final int p2 = this.P;
                final ImageView i = this.I;
                final boolean b = true;
                float v;
                if (i != null && i.getVisibility() == 0) {
                    maxLines = 1;
                    v = u;
                }
                else {
                    final TextView h = this.H;
                    v = u;
                    maxLines = p2;
                    if (h != null) {
                        v = u;
                        maxLines = p2;
                        if (h.getLineCount() > 1) {
                            v = TabLayout.this.V;
                            maxLines = p2;
                        }
                    }
                }
                final float textSize = this.H.getTextSize();
                final int lineCount = this.H.getLineCount();
                final int k = r.k(this.H);
                final float n2 = fcmpl(v, textSize);
                if (n2 != 0 || (k >= 0 && maxLines != k)) {
                    int n3 = b ? 1 : 0;
                    Label_0284: {
                        if (TabLayout.this.i0 == 1) {
                            n3 = (b ? 1 : 0);
                            if (n2 > 0) {
                                n3 = (b ? 1 : 0);
                                if (lineCount == 1) {
                                    final Layout layout = this.H.getLayout();
                                    if (layout != null) {
                                        n3 = (b ? 1 : 0);
                                        if (this.j(layout, 0, v) <= this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight()) {
                                            break Label_0284;
                                        }
                                    }
                                    n3 = 0;
                                }
                            }
                        }
                    }
                    if (n3 != 0) {
                        this.H.setTextSize(0, v);
                        this.H.setMaxLines(maxLines);
                        super.onMeasure(measureSpec, n);
                    }
                }
            }
        }
        
        public boolean performClick() {
            boolean performClick = super.performClick();
            if (this.G != null) {
                if (!performClick) {
                    this.playSoundEffect(0);
                }
                this.G.r();
                performClick = true;
            }
            return performClick;
        }
        
        void s() {
            this.setTab(null);
            this.setSelected(false);
        }
        
        public void setSelected(final boolean b) {
            final boolean b2 = this.isSelected() != b;
            super.setSelected(b);
            if (b2 && b && Build$VERSION.SDK_INT < 16) {
                this.sendAccessibilityEvent(4);
            }
            final TextView h = this.H;
            if (h != null) {
                h.setSelected(b);
            }
            final ImageView i = this.I;
            if (i != null) {
                i.setSelected(b);
            }
            final View l = this.L;
            if (l != null) {
                l.setSelected(b);
            }
        }
        
        void setTab(@k0 final i g) {
            if (g != this.G) {
                this.G = g;
                this.x();
            }
        }
        
        final void x() {
            final i g = this.G;
            final Drawable drawable = null;
            View g2;
            if (g != null) {
                g2 = g.g();
            }
            else {
                g2 = null;
            }
            if (g2 != null) {
                final ViewParent parent = g2.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup)parent).removeView(g2);
                    }
                    this.addView(g2);
                }
                this.L = g2;
                final TextView h = this.H;
                if (h != null) {
                    h.setVisibility(8);
                }
                final ImageView i = this.I;
                if (i != null) {
                    i.setVisibility(8);
                    this.I.setImageDrawable((Drawable)null);
                }
                final TextView m = (TextView)g2.findViewById(16908308);
                if ((this.M = m) != null) {
                    this.P = r.k(m);
                }
                this.N = (ImageView)g2.findViewById(16908294);
            }
            else {
                final View l = this.L;
                if (l != null) {
                    this.removeView(l);
                    this.L = null;
                }
                this.M = null;
                this.N = null;
            }
            if (this.L == null) {
                if (this.I == null) {
                    this.p();
                }
                Drawable mutate = drawable;
                if (g != null) {
                    mutate = drawable;
                    if (g.h() != null) {
                        mutate = androidx.core.graphics.drawable.c.r(g.h()).mutate();
                    }
                }
                if (mutate != null) {
                    androidx.core.graphics.drawable.c.o(mutate, TabLayout.this.P);
                    final PorterDuff$Mode t = TabLayout.this.T;
                    if (t != null) {
                        androidx.core.graphics.drawable.c.p(mutate, t);
                    }
                }
                if (this.H == null) {
                    this.q();
                    this.P = r.k(this.H);
                }
                r.E(this.H, TabLayout.this.N);
                final ColorStateList o = TabLayout.this.O;
                if (o != null) {
                    this.H.setTextColor(o);
                }
                this.A(this.H, this.I);
                this.v();
                this.i((View)this.I);
                this.i((View)this.H);
            }
            else {
                final TextView j = this.M;
                if (j != null || this.N != null) {
                    this.A(j, this.N);
                }
            }
            if (g != null && !TextUtils.isEmpty(g.d)) {
                this.setContentDescription(g.d);
            }
            this.setSelected(g != null && g.o());
        }
        
        final void z() {
            this.setOrientation((int)((TabLayout.this.j0 ^ true) ? 1 : 0));
            TextView textView = this.M;
            ImageView imageView;
            if (textView == null && this.N == null) {
                textView = this.H;
                imageView = this.I;
            }
            else {
                imageView = this.N;
            }
            this.A(textView, imageView);
        }
    }
    
    public static class o implements f
    {
        private final ViewPager G;
        
        public o(final ViewPager g) {
            this.G = g;
        }
        
        @Override
        public void g(final i i) {
        }
        
        @Override
        public void i(@j0 final i i) {
            this.G.setCurrentItem(i.k());
        }
        
        @Override
        public void p(final i i) {
        }
    }
}
