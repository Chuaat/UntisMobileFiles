// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.appbar;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;
import androidx.annotation.b0;
import androidx.core.content.d;
import androidx.annotation.s;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable$Callback;
import android.content.res.ColorStateList;
import androidx.annotation.l;
import androidx.core.util.i;
import android.view.View$MeasureSpec;
import androidx.annotation.t0;
import androidx.annotation.p0;
import android.graphics.Typeface;
import android.widget.FrameLayout$LayoutParams;
import android.graphics.Region$Op;
import android.graphics.Canvas;
import com.google.android.material.internal.c;
import android.os.Build$VERSION;
import androidx.appcompat.widget.Toolbar;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewParent;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.text.TextUtils;
import android.content.res.TypedArray;
import androidx.core.view.a0;
import com.google.android.material.internal.t;
import android.util.AttributeSet;
import android.content.Context;
import androidx.core.view.x0;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import androidx.annotation.j0;
import android.graphics.Rect;
import android.view.View;
import androidx.annotation.k0;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public class a extends FrameLayout
{
    private static final int m0;
    private static final int n0 = 600;
    public static final int o0 = 0;
    public static final int p0 = 1;
    private boolean G;
    private int H;
    @k0
    private ViewGroup I;
    @k0
    private View J;
    private View K;
    private int L;
    private int M;
    private int N;
    private int O;
    private final Rect P;
    @j0
    final com.google.android.material.internal.a Q;
    @j0
    final u2.a R;
    private boolean S;
    private boolean T;
    @k0
    private Drawable U;
    @k0
    Drawable V;
    private int W;
    private boolean a0;
    private ValueAnimator b0;
    private long c0;
    private int d0;
    private AppBarLayout.e e0;
    int f0;
    private int g0;
    @k0
    x0 h0;
    private int i0;
    private boolean j0;
    private int k0;
    private boolean l0;
    
    static {
        m0 = o2.a.n.va;
    }
    
    public a(@j0 final Context context) {
        this(context, null);
    }
    
    public a(@j0 final Context context, @k0 final AttributeSet set) {
        this(context, set, o2.a.c.u2);
    }
    
    public a(@j0 final Context context, @k0 final AttributeSet set, int n) {
        final int m0 = a.m0;
        super(com.google.android.material.theme.overlay.a.c(context, set, n, m0), set, n);
        this.G = true;
        this.P = new Rect();
        this.d0 = -1;
        this.i0 = 0;
        this.k0 = 0;
        final Context context2 = this.getContext();
        final com.google.android.material.internal.a q = new com.google.android.material.internal.a((View)this);
        (this.Q = q).G0(com.google.android.material.animation.a.e);
        q.D0(false);
        this.R = new u2.a(context2);
        final TypedArray j = t.j(context2, set, o2.a.o.t6, n, m0, new int[0]);
        q.q0(j.getInt(o2.a.o.x6, 8388691));
        q.g0(j.getInt(o2.a.o.u6, 8388627));
        n = j.getDimensionPixelSize(o2.a.o.y6, 0);
        this.O = n;
        this.N = n;
        this.M = n;
        this.L = n;
        n = o2.a.o.B6;
        if (j.hasValue(n)) {
            this.L = j.getDimensionPixelSize(n, 0);
        }
        n = o2.a.o.A6;
        if (j.hasValue(n)) {
            this.N = j.getDimensionPixelSize(n, 0);
        }
        n = o2.a.o.C6;
        if (j.hasValue(n)) {
            this.M = j.getDimensionPixelSize(n, 0);
        }
        n = o2.a.o.z6;
        if (j.hasValue(n)) {
            this.O = j.getDimensionPixelSize(n, 0);
        }
        this.S = j.getBoolean(o2.a.o.M6, true);
        this.setTitle(j.getText(o2.a.o.K6));
        q.n0(o2.a.n.U5);
        q.d0(c.a.m.m3);
        n = o2.a.o.D6;
        if (j.hasValue(n)) {
            q.n0(j.getResourceId(n, 0));
        }
        n = o2.a.o.v6;
        if (j.hasValue(n)) {
            q.d0(j.getResourceId(n, 0));
        }
        this.d0 = j.getDimensionPixelSize(o2.a.o.I6, -1);
        n = o2.a.o.G6;
        if (j.hasValue(n)) {
            q.B0(j.getInt(n, 1));
        }
        this.c0 = j.getInt(o2.a.o.H6, 600);
        this.setContentScrim(j.getDrawable(o2.a.o.w6));
        this.setStatusBarScrim(j.getDrawable(o2.a.o.J6));
        this.setTitleCollapseMode(j.getInt(o2.a.o.L6, 0));
        this.H = j.getResourceId(o2.a.o.N6, -1);
        this.j0 = j.getBoolean(o2.a.o.F6, false);
        this.l0 = j.getBoolean(o2.a.o.E6, false);
        j.recycle();
        this.setWillNotDraw(false);
        androidx.core.view.j0.Y1((View)this, new a0() {
            @Override
            public x0 a(final View view, @j0 final x0 x0) {
                return com.google.android.material.appbar.a.this.r(x0);
            }
        });
    }
    
    private void A(final int n, final int n2, final int n3, final int n4, final boolean b) {
        if (this.S) {
            final View k = this.K;
            if (k != null) {
                final boolean n5 = androidx.core.view.j0.N0(k);
                final boolean b2 = false;
                final boolean t = n5 && this.K.getVisibility() == 0;
                this.T = t;
                if (t || b) {
                    boolean b3 = b2;
                    if (androidx.core.view.j0.X((View)this) == 1) {
                        b3 = true;
                    }
                    this.u(b3);
                    final com.google.android.material.internal.a q = this.Q;
                    int n6;
                    if (b3) {
                        n6 = this.N;
                    }
                    else {
                        n6 = this.L;
                    }
                    final int top = this.P.top;
                    final int m = this.M;
                    int n7;
                    if (b3) {
                        n7 = this.L;
                    }
                    else {
                        n7 = this.N;
                    }
                    q.l0(n6, top + m, n3 - n - n7, n4 - n2 - this.O);
                    this.Q.Z(b);
                }
            }
        }
    }
    
    private void B() {
        if (this.I != null && this.S && TextUtils.isEmpty(this.Q.N())) {
            this.setTitle(i((View)this.I));
        }
    }
    
    private void a(final int n) {
        this.c();
        final ValueAnimator b0 = this.b0;
        if (b0 == null) {
            (this.b0 = new ValueAnimator()).setDuration(this.c0);
            final ValueAnimator b2 = this.b0;
            TimeInterpolator interpolator;
            if (n > this.W) {
                interpolator = com.google.android.material.animation.a.c;
            }
            else {
                interpolator = com.google.android.material.animation.a.d;
            }
            b2.setInterpolator(interpolator);
            this.b0.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new ValueAnimator$AnimatorUpdateListener() {
                public void onAnimationUpdate(@j0 final ValueAnimator valueAnimator) {
                    com.google.android.material.appbar.a.this.setScrimAlpha((int)valueAnimator.getAnimatedValue());
                }
            });
        }
        else if (b0.isRunning()) {
            this.b0.cancel();
        }
        this.b0.setIntValues(new int[] { this.W, n });
        this.b0.start();
    }
    
    private void b(final AppBarLayout appBarLayout) {
        if (this.n()) {
            appBarLayout.setLiftOnScroll(false);
        }
    }
    
    private void c() {
        if (!this.G) {
            return;
        }
        final ViewGroup viewGroup = null;
        this.I = null;
        this.J = null;
        final int h = this.H;
        if (h != -1) {
            final ViewGroup i = (ViewGroup)this.findViewById(h);
            if ((this.I = i) != null) {
                this.J = this.d((View)i);
            }
        }
        if (this.I == null) {
            final int childCount = this.getChildCount();
            int n = 0;
            ViewGroup j;
            while (true) {
                j = viewGroup;
                if (n >= childCount) {
                    break;
                }
                final View child = this.getChildAt(n);
                if (p(child)) {
                    j = (ViewGroup)child;
                    break;
                }
                ++n;
            }
            this.I = j;
        }
        this.y();
        this.G = false;
    }
    
    @j0
    private View d(@j0 final View view) {
        final ViewParent parent = view.getParent();
        View view2 = view;
        for (Object parent2 = parent; parent2 != this && parent2 != null; parent2 = ((ViewParent)parent2).getParent()) {
            if (parent2 instanceof View) {
                view2 = (View)parent2;
            }
        }
        return view2;
    }
    
    private static int g(@j0 final View view) {
        final ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
            final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)layoutParams;
            return view.getMeasuredHeight() + viewGroup$MarginLayoutParams.topMargin + viewGroup$MarginLayoutParams.bottomMargin;
        }
        return view.getMeasuredHeight();
    }
    
    private static CharSequence i(final View view) {
        if (view instanceof Toolbar) {
            return ((Toolbar)view).getTitle();
        }
        if (Build$VERSION.SDK_INT >= 21 && view instanceof android.widget.Toolbar) {
            return ((android.widget.Toolbar)view).getTitle();
        }
        return null;
    }
    
    @j0
    static com.google.android.material.appbar.e j(@j0 final View view) {
        final int s5 = o2.a.h.S5;
        com.google.android.material.appbar.e e;
        if ((e = (com.google.android.material.appbar.e)view.getTag(s5)) == null) {
            e = new com.google.android.material.appbar.e(view);
            view.setTag(s5, (Object)e);
        }
        return e;
    }
    
    private boolean n() {
        final int g0 = this.g0;
        boolean b = true;
        if (g0 != 1) {
            b = false;
        }
        return b;
    }
    
    private static boolean p(final View view) {
        return view instanceof Toolbar || (Build$VERSION.SDK_INT >= 21 && view instanceof android.widget.Toolbar);
    }
    
    private boolean q(final View view) {
        final View j = this.J;
        boolean b = true;
        if (j != null && j != this) {
            if (view == j) {
                return b;
            }
        }
        else if (view == this.I) {
            return b;
        }
        b = false;
        return b;
    }
    
    private void u(final boolean b) {
        Object o = this.J;
        if (o == null) {
            o = this.I;
        }
        final int h = this.h((View)o);
        com.google.android.material.internal.c.a((ViewGroup)this, this.K, this.P);
        final ViewGroup i = this.I;
        final boolean b2 = i instanceof Toolbar;
        int n = 0;
        int n2;
        int n3;
        int n4;
        if (b2) {
            final Toolbar toolbar = (Toolbar)i;
            n = toolbar.getTitleMarginStart();
            n2 = toolbar.getTitleMarginEnd();
            n3 = toolbar.getTitleMarginTop();
            n4 = toolbar.getTitleMarginBottom();
        }
        else if (Build$VERSION.SDK_INT >= 24 && i instanceof android.widget.Toolbar) {
            final android.widget.Toolbar toolbar2 = (android.widget.Toolbar)i;
            n = toolbar2.getTitleMarginStart();
            n2 = toolbar2.getTitleMarginEnd();
            n3 = toolbar2.getTitleMarginTop();
            n4 = toolbar2.getTitleMarginBottom();
        }
        else {
            n4 = 0;
            n2 = 0;
            n3 = 0;
        }
        final com.google.android.material.internal.a q = this.Q;
        final Rect p = this.P;
        final int left = p.left;
        int n5;
        if (b) {
            n5 = n2;
        }
        else {
            n5 = n;
        }
        final int top = p.top;
        final int right = p.right;
        if (!b) {
            n = n2;
        }
        q.b0(left + n5, top + h + n3, right - n, p.bottom + h - n4);
    }
    
    private void v() {
        this.setContentDescription(this.getTitle());
    }
    
    private void w(@j0 final Drawable drawable, final int n, final int n2) {
        this.x(drawable, (View)this.I, n, n2);
    }
    
    private void x(@j0 final Drawable drawable, @k0 final View view, final int n, final int n2) {
        int bottom = n2;
        if (this.n()) {
            bottom = n2;
            if (view != null) {
                bottom = n2;
                if (this.S) {
                    bottom = view.getBottom();
                }
            }
        }
        drawable.setBounds(0, 0, n, bottom);
    }
    
    private void y() {
        if (!this.S) {
            final View k = this.K;
            if (k != null) {
                final ViewParent parent = k.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup)parent).removeView(this.K);
                }
            }
        }
        if (this.S && this.I != null) {
            if (this.K == null) {
                this.K = new View(this.getContext());
            }
            if (this.K.getParent() == null) {
                this.I.addView(this.K, -1, -1);
            }
        }
    }
    
    protected boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return viewGroup$LayoutParams instanceof c;
    }
    
    public void draw(@j0 final Canvas canvas) {
        super.draw(canvas);
        this.c();
        if (this.I == null) {
            final Drawable u = this.U;
            if (u != null && this.W > 0) {
                u.mutate().setAlpha(this.W);
                this.U.draw(canvas);
            }
        }
        if (this.S && this.T) {
            if (this.I != null && this.U != null && this.W > 0 && this.n() && this.Q.G() < this.Q.H()) {
                final int save = canvas.save();
                canvas.clipRect(this.U.getBounds(), Region$Op.DIFFERENCE);
                this.Q.m(canvas);
                canvas.restoreToCount(save);
            }
            else {
                this.Q.m(canvas);
            }
        }
        if (this.V != null && this.W > 0) {
            final x0 h0 = this.h0;
            int r;
            if (h0 != null) {
                r = h0.r();
            }
            else {
                r = 0;
            }
            if (r > 0) {
                this.V.setBounds(0, -this.f0, this.getWidth(), r - this.f0);
                this.V.mutate().setAlpha(this.W);
                this.V.draw(canvas);
            }
        }
    }
    
    protected boolean drawChild(final Canvas canvas, final View view, final long n) {
        final Drawable u = this.U;
        final boolean b = true;
        boolean b2;
        if (u != null && this.W > 0 && this.q(view)) {
            this.x(this.U, view, this.getWidth(), this.getHeight());
            this.U.mutate().setAlpha(this.W);
            this.U.draw(canvas);
            b2 = true;
        }
        else {
            b2 = false;
        }
        boolean b3 = b;
        if (!super.drawChild(canvas, view, n)) {
            b3 = (b2 && b);
        }
        return b3;
    }
    
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        final int[] drawableState = this.getDrawableState();
        final Drawable v = this.V;
        int n2;
        final int n = n2 = 0;
        if (v != null) {
            n2 = n;
            if (v.isStateful()) {
                n2 = ((false | v.setState(drawableState)) ? 1 : 0);
            }
        }
        final Drawable u = this.U;
        int n3 = n2;
        if (u != null) {
            n3 = n2;
            if (u.isStateful()) {
                n3 = (n2 | (u.setState(drawableState) ? 1 : 0));
            }
        }
        final com.google.android.material.internal.a q = this.Q;
        int n4 = n3;
        if (q != null) {
            n4 = (n3 | (q.E0(drawableState) ? 1 : 0));
        }
        if (n4 != 0) {
            this.invalidate();
        }
    }
    
    protected c e() {
        return new c(-1, -1);
    }
    
    protected FrameLayout$LayoutParams f(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return new c(viewGroup$LayoutParams);
    }
    
    public FrameLayout$LayoutParams generateLayoutParams(final AttributeSet set) {
        return new c(this.getContext(), set);
    }
    
    public int getCollapsedTitleGravity() {
        return this.Q.r();
    }
    
    @j0
    public Typeface getCollapsedTitleTypeface() {
        return this.Q.w();
    }
    
    @k0
    public Drawable getContentScrim() {
        return this.U;
    }
    
    public int getExpandedTitleGravity() {
        return this.Q.C();
    }
    
    public int getExpandedTitleMarginBottom() {
        return this.O;
    }
    
    public int getExpandedTitleMarginEnd() {
        return this.N;
    }
    
    public int getExpandedTitleMarginStart() {
        return this.L;
    }
    
    public int getExpandedTitleMarginTop() {
        return this.M;
    }
    
    @j0
    public Typeface getExpandedTitleTypeface() {
        return this.Q.F();
    }
    
    @p0(23)
    @t0({ t0.a.H })
    public int getHyphenationFrequency() {
        return this.Q.I();
    }
    
    @t0({ t0.a.H })
    public int getLineCount() {
        return this.Q.J();
    }
    
    @p0(23)
    @t0({ t0.a.H })
    public float getLineSpacingAdd() {
        return this.Q.K();
    }
    
    @p0(23)
    @t0({ t0.a.H })
    public float getLineSpacingMultiplier() {
        return this.Q.L();
    }
    
    @t0({ t0.a.H })
    public int getMaxLines() {
        return this.Q.M();
    }
    
    int getScrimAlpha() {
        return this.W;
    }
    
    public long getScrimAnimationDuration() {
        return this.c0;
    }
    
    public int getScrimVisibleHeightTrigger() {
        final int d0 = this.d0;
        if (d0 >= 0) {
            return d0 + this.i0 + this.k0;
        }
        final x0 h0 = this.h0;
        int r;
        if (h0 != null) {
            r = h0.r();
        }
        else {
            r = 0;
        }
        final int c0 = androidx.core.view.j0.c0((View)this);
        if (c0 > 0) {
            return Math.min(c0 * 2 + r, this.getHeight());
        }
        return this.getHeight() / 3;
    }
    
    @k0
    public Drawable getStatusBarScrim() {
        return this.V;
    }
    
    @k0
    public CharSequence getTitle() {
        CharSequence n;
        if (this.S) {
            n = this.Q.N();
        }
        else {
            n = null;
        }
        return n;
    }
    
    public int getTitleCollapseMode() {
        return this.g0;
    }
    
    final int h(@j0 final View view) {
        return this.getHeight() - j(view).c() - view.getHeight() - ((c)view.getLayoutParams()).bottomMargin;
    }
    
    @t0({ t0.a.H })
    public boolean k() {
        return this.l0;
    }
    
    @t0({ t0.a.H })
    public boolean l() {
        return this.j0;
    }
    
    @t0({ t0.a.H })
    public boolean m() {
        return this.Q.T();
    }
    
    public boolean o() {
        return this.S;
    }
    
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        final ViewParent parent = this.getParent();
        if (parent instanceof AppBarLayout) {
            final AppBarLayout appBarLayout = (AppBarLayout)parent;
            this.b(appBarLayout);
            androidx.core.view.j0.M1((View)this, androidx.core.view.j0.S((View)appBarLayout));
            if (this.e0 == null) {
                this.e0 = new d();
            }
            appBarLayout.b(this.e0);
            androidx.core.view.j0.t1((View)this);
        }
    }
    
    protected void onDetachedFromWindow() {
        final ViewParent parent = this.getParent();
        final AppBarLayout.e e0 = this.e0;
        if (e0 != null && parent instanceof AppBarLayout) {
            ((AppBarLayout)parent).q(e0);
        }
        super.onDetachedFromWindow();
    }
    
    protected void onLayout(final boolean b, int i, int childCount, final int n, final int n2) {
        super.onLayout(b, i, childCount, n, n2);
        final x0 h0 = this.h0;
        final int n3 = 0;
        if (h0 != null) {
            final int r = h0.r();
            for (int childCount2 = this.getChildCount(), j = 0; j < childCount2; ++j) {
                final View child = this.getChildAt(j);
                if (!androidx.core.view.j0.S(child) && child.getTop() < r) {
                    androidx.core.view.j0.d1(child, r);
                }
            }
        }
        for (int childCount3 = this.getChildCount(), k = 0; k < childCount3; ++k) {
            j(this.getChildAt(k)).h();
        }
        this.A(i, childCount, n, n2, false);
        this.B();
        this.z();
        for (childCount = this.getChildCount(), i = n3; i < childCount; ++i) {
            j(this.getChildAt(i)).a();
        }
    }
    
    protected void onMeasure(int minimumHeight, int i0) {
        this.c();
        super.onMeasure(minimumHeight, i0);
        final int mode = View$MeasureSpec.getMode(i0);
        final x0 h0 = this.h0;
        if (h0 != null) {
            i0 = h0.r();
        }
        else {
            i0 = 0;
        }
        if ((mode == 0 || this.j0) && i0 > 0) {
            this.i0 = i0;
            super.onMeasure(minimumHeight, View$MeasureSpec.makeMeasureSpec(this.getMeasuredHeight() + i0, 1073741824));
        }
        if (this.l0 && this.Q.M() > 1) {
            this.B();
            this.A(0, 0, this.getMeasuredWidth(), this.getMeasuredHeight(), true);
            i0 = this.Q.J();
            if (i0 > 1) {
                this.k0 = Math.round(this.Q.B()) * (i0 - 1);
                super.onMeasure(minimumHeight, View$MeasureSpec.makeMeasureSpec(this.getMeasuredHeight() + this.k0, 1073741824));
            }
        }
        final ViewGroup j = this.I;
        if (j != null) {
            final View k = this.J;
            if (k != null && k != this) {
                minimumHeight = g(k);
            }
            else {
                minimumHeight = g((View)j);
            }
            this.setMinimumHeight(minimumHeight);
        }
    }
    
    protected void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        super.onSizeChanged(n, n2, n3, n4);
        final Drawable u = this.U;
        if (u != null) {
            this.w(u, n, n2);
        }
    }
    
    x0 r(@j0 final x0 x0) {
        x0 h0;
        if (androidx.core.view.j0.S((View)this)) {
            h0 = x0;
        }
        else {
            h0 = null;
        }
        if (!i.a(this.h0, h0)) {
            this.h0 = h0;
            this.requestLayout();
        }
        return x0.c();
    }
    
    public void s(final int l, final int m, final int n, final int o) {
        this.L = l;
        this.M = m;
        this.N = n;
        this.O = o;
        this.requestLayout();
    }
    
    public void setCollapsedTitleGravity(final int n) {
        this.Q.g0(n);
    }
    
    public void setCollapsedTitleTextAppearance(@androidx.annotation.x0 final int n) {
        this.Q.d0(n);
    }
    
    public void setCollapsedTitleTextColor(@l final int n) {
        this.setCollapsedTitleTextColor(ColorStateList.valueOf(n));
    }
    
    public void setCollapsedTitleTextColor(@j0 final ColorStateList list) {
        this.Q.f0(list);
    }
    
    public void setCollapsedTitleTypeface(@k0 final Typeface typeface) {
        this.Q.i0(typeface);
    }
    
    public void setContentScrim(@k0 final Drawable drawable) {
        final Drawable u = this.U;
        if (u != drawable) {
            Drawable mutate = null;
            if (u != null) {
                u.setCallback((Drawable$Callback)null);
            }
            if (drawable != null) {
                mutate = drawable.mutate();
            }
            if ((this.U = mutate) != null) {
                this.w(mutate, this.getWidth(), this.getHeight());
                this.U.setCallback((Drawable$Callback)this);
                this.U.setAlpha(this.W);
            }
            androidx.core.view.j0.l1((View)this);
        }
    }
    
    public void setContentScrimColor(@l final int n) {
        this.setContentScrim((Drawable)new ColorDrawable(n));
    }
    
    public void setContentScrimResource(@s final int n) {
        this.setContentScrim(androidx.core.content.d.i(this.getContext(), n));
    }
    
    public void setExpandedTitleColor(@l final int n) {
        this.setExpandedTitleTextColor(ColorStateList.valueOf(n));
    }
    
    public void setExpandedTitleGravity(final int n) {
        this.Q.q0(n);
    }
    
    public void setExpandedTitleMarginBottom(final int o) {
        this.O = o;
        this.requestLayout();
    }
    
    public void setExpandedTitleMarginEnd(final int n) {
        this.N = n;
        this.requestLayout();
    }
    
    public void setExpandedTitleMarginStart(final int l) {
        this.L = l;
        this.requestLayout();
    }
    
    public void setExpandedTitleMarginTop(final int m) {
        this.M = m;
        this.requestLayout();
    }
    
    public void setExpandedTitleTextAppearance(@androidx.annotation.x0 final int n) {
        this.Q.n0(n);
    }
    
    public void setExpandedTitleTextColor(@j0 final ColorStateList list) {
        this.Q.p0(list);
    }
    
    public void setExpandedTitleTypeface(@k0 final Typeface typeface) {
        this.Q.s0(typeface);
    }
    
    @t0({ t0.a.H })
    public void setExtraMultilineHeightEnabled(final boolean l0) {
        this.l0 = l0;
    }
    
    @t0({ t0.a.H })
    public void setForceApplySystemWindowInsetTop(final boolean j0) {
        this.j0 = j0;
    }
    
    @p0(23)
    @t0({ t0.a.H })
    public void setHyphenationFrequency(final int n) {
        this.Q.x0(n);
    }
    
    @p0(23)
    @t0({ t0.a.H })
    public void setLineSpacingAdd(final float n) {
        this.Q.z0(n);
    }
    
    @p0(23)
    @t0({ t0.a.H })
    public void setLineSpacingMultiplier(@androidx.annotation.t(from = 0.0) final float n) {
        this.Q.A0(n);
    }
    
    @t0({ t0.a.H })
    public void setMaxLines(final int n) {
        this.Q.B0(n);
    }
    
    @t0({ t0.a.H })
    public void setRtlTextDirectionHeuristicsEnabled(final boolean b) {
        this.Q.D0(b);
    }
    
    void setScrimAlpha(final int w) {
        if (w != this.W) {
            if (this.U != null) {
                final ViewGroup i = this.I;
                if (i != null) {
                    androidx.core.view.j0.l1((View)i);
                }
            }
            this.W = w;
            androidx.core.view.j0.l1((View)this);
        }
    }
    
    public void setScrimAnimationDuration(@b0(from = 0L) final long c0) {
        this.c0 = c0;
    }
    
    public void setScrimVisibleHeightTrigger(@b0(from = 0L) final int d0) {
        if (this.d0 != d0) {
            this.d0 = d0;
            this.z();
        }
    }
    
    public void setScrimsShown(final boolean b) {
        this.t(b, androidx.core.view.j0.T0((View)this) && !this.isInEditMode());
    }
    
    public void setStatusBarScrim(@k0 Drawable v) {
        final Drawable v2 = this.V;
        if (v2 != v) {
            Drawable mutate = null;
            if (v2 != null) {
                v2.setCallback((Drawable$Callback)null);
            }
            if (v != null) {
                mutate = v.mutate();
            }
            if ((this.V = mutate) != null) {
                if (mutate.isStateful()) {
                    this.V.setState(this.getDrawableState());
                }
                androidx.core.graphics.drawable.c.m(this.V, androidx.core.view.j0.X((View)this));
                v = this.V;
                v.setVisible(this.getVisibility() == 0, false);
                this.V.setCallback((Drawable$Callback)this);
                this.V.setAlpha(this.W);
            }
            androidx.core.view.j0.l1((View)this);
        }
    }
    
    public void setStatusBarScrimColor(@l final int n) {
        this.setStatusBarScrim((Drawable)new ColorDrawable(n));
    }
    
    public void setStatusBarScrimResource(@s final int n) {
        this.setStatusBarScrim(androidx.core.content.d.i(this.getContext(), n));
    }
    
    public void setTitle(@k0 final CharSequence charSequence) {
        this.Q.F0(charSequence);
        this.v();
    }
    
    public void setTitleCollapseMode(final int g0) {
        this.g0 = g0;
        final boolean n = this.n();
        this.Q.v0(n);
        final ViewParent parent = this.getParent();
        if (parent instanceof AppBarLayout) {
            this.b((AppBarLayout)parent);
        }
        if (n && this.U == null) {
            this.setContentScrimColor(this.R.g(this.getResources().getDimension(o2.a.f.O0)));
        }
    }
    
    public void setTitleEnabled(final boolean s) {
        if (s != this.S) {
            this.S = s;
            this.v();
            this.y();
            this.requestLayout();
        }
    }
    
    public void setVisibility(final int visibility) {
        super.setVisibility(visibility);
        final boolean b = visibility == 0;
        final Drawable v = this.V;
        if (v != null && v.isVisible() != b) {
            this.V.setVisible(b, false);
        }
        final Drawable u = this.U;
        if (u != null && u.isVisible() != b) {
            this.U.setVisible(b, false);
        }
    }
    
    public void t(final boolean a0, final boolean b) {
        if (this.a0 != a0) {
            int scrimAlpha = 255;
            if (b) {
                if (!a0) {
                    scrimAlpha = 0;
                }
                this.a(scrimAlpha);
            }
            else {
                if (!a0) {
                    scrimAlpha = 0;
                }
                this.setScrimAlpha(scrimAlpha);
            }
            this.a0 = a0;
        }
    }
    
    protected boolean verifyDrawable(@j0 final Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.U || drawable == this.V;
    }
    
    final void z() {
        if (this.U != null || this.V != null) {
            this.setScrimsShown(this.getHeight() + this.f0 < this.getScrimVisibleHeightTrigger());
        }
    }
    
    public static class c extends FrameLayout$LayoutParams
    {
        private static final float c = 0.5f;
        public static final int d = 0;
        public static final int e = 1;
        public static final int f = 2;
        int a;
        float b;
        
        public c(final int n, final int n2) {
            super(n, n2);
            this.a = 0;
            this.b = 0.5f;
        }
        
        public c(final int n, final int n2, final int n3) {
            super(n, n2, n3);
            this.a = 0;
            this.b = 0.5f;
        }
        
        public c(final Context context, final AttributeSet set) {
            super(context, set);
            this.a = 0;
            this.b = 0.5f;
            final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, o2.a.o.O6);
            this.a = obtainStyledAttributes.getInt(o2.a.o.P6, 0);
            this.d(obtainStyledAttributes.getFloat(o2.a.o.Q6, 0.5f));
            obtainStyledAttributes.recycle();
        }
        
        public c(@j0 final ViewGroup$LayoutParams viewGroup$LayoutParams) {
            super(viewGroup$LayoutParams);
            this.a = 0;
            this.b = 0.5f;
        }
        
        public c(@j0 final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams) {
            super(viewGroup$MarginLayoutParams);
            this.a = 0;
            this.b = 0.5f;
        }
        
        @p0(19)
        public c(@j0 final FrameLayout$LayoutParams frameLayout$LayoutParams) {
            super(frameLayout$LayoutParams);
            this.a = 0;
            this.b = 0.5f;
        }
        
        public int a() {
            return this.a;
        }
        
        public float b() {
            return this.b;
        }
        
        public void c(final int a) {
            this.a = a;
        }
        
        public void d(final float b) {
            this.b = b;
        }
    }
    
    private class d implements AppBarLayout.e
    {
        d() {
        }
        
        @Override
        public void a(final AppBarLayout appBarLayout, final int n) {
            final a a = com.google.android.material.appbar.a.this;
            a.f0 = n;
            final x0 h0 = a.h0;
            int r;
            if (h0 != null) {
                r = h0.r();
            }
            else {
                r = 0;
            }
            for (int childCount = com.google.android.material.appbar.a.this.getChildCount(), i = 0; i < childCount; ++i) {
                final View child = com.google.android.material.appbar.a.this.getChildAt(i);
                final c c = (c)child.getLayoutParams();
                final e j = com.google.android.material.appbar.a.j(child);
                final int a2 = c.a;
                int n2;
                if (a2 != 1) {
                    if (a2 != 2) {
                        continue;
                    }
                    n2 = Math.round(-n * c.b);
                }
                else {
                    n2 = q.a.c(-n, 0, com.google.android.material.appbar.a.this.h(child));
                }
                j.k(n2);
            }
            com.google.android.material.appbar.a.this.z();
            final a a3 = com.google.android.material.appbar.a.this;
            if (a3.V != null && r > 0) {
                androidx.core.view.j0.l1((View)a3);
            }
            final int height = com.google.android.material.appbar.a.this.getHeight();
            final int n3 = height - androidx.core.view.j0.c0((View)com.google.android.material.appbar.a.this) - r;
            final int scrimVisibleHeightTrigger = com.google.android.material.appbar.a.this.getScrimVisibleHeightTrigger();
            final a q = com.google.android.material.appbar.a.this.Q;
            final float n4 = (float)(height - scrimVisibleHeightTrigger);
            final float n5 = (float)n3;
            q.w0(Math.min(1.0f, n4 / n5));
            final a a4 = com.google.android.material.appbar.a.this;
            a4.Q.k0(a4.f0 + n3);
            com.google.android.material.appbar.a.this.Q.u0(Math.abs(n) / n5);
        }
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @t0({ t0.a.H })
    public @interface e {
    }
}
