// 
// Decompiled by Procyon v0.5.36
// 

package androidx.viewpager2.widget;

import android.os.Parcel;
import android.os.Parcelable$ClassLoaderCreator;
import android.os.Parcelable$Creator;
import android.view.View$BaseSavedState;
import android.view.MotionEvent;
import androidx.annotation.t0;
import androidx.annotation.b0;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;
import android.view.accessibility.AccessibilityEvent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.n0;
import android.annotation.SuppressLint;
import android.util.SparseArray;
import android.content.res.TypedArray;
import android.os.Build$VERSION;
import k1.a;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import androidx.annotation.p0;
import androidx.annotation.k0;
import android.util.AttributeSet;
import androidx.annotation.j0;
import android.content.Context;
import androidx.recyclerview.widget.a0;
import android.os.Parcelable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.graphics.Rect;
import android.view.ViewGroup;

public final class ViewPager2 extends ViewGroup
{
    public static final int d0 = 0;
    public static final int e0 = 1;
    public static final int f0 = 0;
    public static final int g0 = 1;
    public static final int h0 = 2;
    public static final int i0 = -1;
    static boolean j0 = true;
    private final Rect G;
    private final Rect H;
    private b I;
    int J;
    boolean K;
    private RecyclerView.j L;
    private LinearLayoutManager M;
    private int N;
    private Parcelable O;
    RecyclerView P;
    private a0 Q;
    androidx.viewpager2.widget.g R;
    private b S;
    private d T;
    private androidx.viewpager2.widget.f U;
    private RecyclerView.m V;
    private boolean W;
    private boolean a0;
    private int b0;
    e c0;
    
    public ViewPager2(@j0 final Context context) {
        super(context);
        this.G = new Rect();
        this.H = new Rect();
        this.I = new b(3);
        this.K = false;
        this.L = new g() {
            @Override
            public void a() {
                final ViewPager2 a = ViewPager2.this;
                a.K = true;
                a.R.n();
            }
        };
        this.N = -1;
        this.V = null;
        this.W = false;
        this.a0 = true;
        this.b0 = -1;
        this.h(context, null);
    }
    
    public ViewPager2(@j0 final Context context, @k0 final AttributeSet set) {
        super(context, set);
        this.G = new Rect();
        this.H = new Rect();
        this.I = new b(3);
        this.K = false;
        this.L = new g() {
            @Override
            public void a() {
                final ViewPager2 a = ViewPager2.this;
                a.K = true;
                a.R.n();
            }
        };
        this.N = -1;
        this.V = null;
        this.W = false;
        this.a0 = true;
        this.b0 = -1;
        this.h(context, set);
    }
    
    public ViewPager2(@j0 final Context context, @k0 final AttributeSet set, final int n) {
        super(context, set, n);
        this.G = new Rect();
        this.H = new Rect();
        this.I = new b(3);
        this.K = false;
        this.L = new g() {
            @Override
            public void a() {
                final ViewPager2 a = ViewPager2.this;
                a.K = true;
                a.R.n();
            }
        };
        this.N = -1;
        this.V = null;
        this.W = false;
        this.a0 = true;
        this.b0 = -1;
        this.h(context, set);
    }
    
    @p0(21)
    public ViewPager2(@j0 final Context context, @k0 final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
        this.G = new Rect();
        this.H = new Rect();
        this.I = new b(3);
        this.K = false;
        this.L = new g() {
            @Override
            public void a() {
                final ViewPager2 a = ViewPager2.this;
                a.K = true;
                a.R.n();
            }
        };
        this.N = -1;
        this.V = null;
        this.W = false;
        this.a0 = true;
        this.b0 = -1;
        this.h(context, set);
    }
    
    private RecyclerView.r e() {
        return new RecyclerView.r() {
            @Override
            public void b(@j0 final View view) {
            }
            
            @Override
            public void d(@j0 final View view) {
                final RecyclerView.q q = (RecyclerView.q)view.getLayoutParams();
                if (q.width == -1 && q.height == -1) {
                    return;
                }
                throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
            }
        };
    }
    
    private void h(final Context context, final AttributeSet set) {
        e c0;
        if (ViewPager2.j0) {
            c0 = new l();
        }
        else {
            c0 = new f();
        }
        this.c0 = c0;
        (this.P = new o(context)).setId(androidx.core.view.j0.B());
        this.P.setDescendantFocusability(131072);
        final h h = new h(context);
        this.M = h;
        this.P.setLayoutManager((RecyclerView.p)h);
        this.P.setScrollingTouchSlop(1);
        this.u(context, set);
        this.P.setLayoutParams(new ViewGroup$LayoutParams(-1, -1));
        this.P.p(this.e());
        final androidx.viewpager2.widget.g r = new androidx.viewpager2.widget.g(this);
        this.R = r;
        this.T = new d(this, r, this.P);
        (this.Q = new n()).b(this.P);
        this.P.r((RecyclerView.u)this.R);
        final b s = new b(3);
        this.S = s;
        this.R.r(s);
        final j j = new j() {
            @Override
            public void a(final int n) {
                if (n == 0) {
                    ViewPager2.this.y();
                }
            }
            
            @Override
            public void c(final int j) {
                final ViewPager2 a = ViewPager2.this;
                if (a.J != j) {
                    a.J = j;
                    a.c0.q();
                }
            }
        };
        final j i = new j() {
            @Override
            public void c(final int n) {
                ViewPager2.this.clearFocus();
                if (ViewPager2.this.hasFocus()) {
                    ViewPager2.this.P.requestFocus(2);
                }
            }
        };
        this.S.d(j);
        this.S.d(i);
        this.c0.h(this.S, this.P);
        this.S.d(this.I);
        final androidx.viewpager2.widget.f u = new androidx.viewpager2.widget.f(this.M);
        this.U = u;
        this.S.d(u);
        final RecyclerView p2 = this.P;
        this.attachViewToParent((View)p2, 0, p2.getLayoutParams());
    }
    
    private void m(@k0 final RecyclerView.h<?> h) {
        if (h != null) {
            h.registerAdapterDataObserver(this.L);
        }
    }
    
    private void r() {
        if (this.N == -1) {
            return;
        }
        final RecyclerView.h adapter = this.getAdapter();
        if (adapter == null) {
            return;
        }
        final Parcelable o = this.O;
        if (o != null) {
            if (adapter instanceof androidx.viewpager2.adapter.b) {
                ((androidx.viewpager2.adapter.b)adapter).c(o);
            }
            this.O = null;
        }
        final int max = Math.max(0, Math.min(this.N, adapter.getItemCount() - 1));
        this.J = max;
        this.N = -1;
        this.P.G1(max);
        this.c0.m();
    }
    
    private void u(final Context context, final AttributeSet set) {
        final int[] a0 = a.j.a0;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, a0);
        if (Build$VERSION.SDK_INT >= 29) {
            this.saveAttributeDataForStyleable(context, a0, set, obtainStyledAttributes, 0, 0);
        }
        try {
            this.setOrientation(obtainStyledAttributes.getInt(a.j.b0, 0));
        }
        finally {
            obtainStyledAttributes.recycle();
        }
    }
    
    private void w(@k0 final RecyclerView.h<?> h) {
        if (h != null) {
            h.unregisterAdapterDataObserver(this.L);
        }
    }
    
    public void a(@j0 final RecyclerView.o o) {
        this.P.n(o);
    }
    
    public void b(@j0 final RecyclerView.o o, final int n) {
        this.P.o(o, n);
    }
    
    public boolean c() {
        return this.T.b();
    }
    
    public boolean canScrollHorizontally(final int n) {
        return this.P.canScrollHorizontally(n);
    }
    
    public boolean canScrollVertically(final int n) {
        return this.P.canScrollVertically(n);
    }
    
    public boolean d() {
        return this.T.d();
    }
    
    protected void dispatchRestoreInstanceState(final SparseArray<Parcelable> sparseArray) {
        final Parcelable parcelable = (Parcelable)sparseArray.get(this.getId());
        if (parcelable instanceof p) {
            final int g = ((p)parcelable).G;
            sparseArray.put(this.P.getId(), sparseArray.get(g));
            sparseArray.remove(g);
        }
        super.dispatchRestoreInstanceState((SparseArray)sparseArray);
        this.r();
    }
    
    public boolean f(@SuppressLint({ "SupportAnnotationUsage" }) @n0 final float n) {
        return this.T.e(n);
    }
    
    @j0
    public RecyclerView.o g(final int n) {
        return this.P.A0(n);
    }
    
    @p0(23)
    public CharSequence getAccessibilityClassName() {
        if (this.c0.a()) {
            return this.c0.g();
        }
        return super.getAccessibilityClassName();
    }
    
    @k0
    public RecyclerView.h getAdapter() {
        return this.P.getAdapter();
    }
    
    public int getCurrentItem() {
        return this.J;
    }
    
    public int getItemDecorationCount() {
        return this.P.getItemDecorationCount();
    }
    
    public int getOffscreenPageLimit() {
        return this.b0;
    }
    
    public int getOrientation() {
        return this.M.M2();
    }
    
    int getPageSize() {
        final RecyclerView p = this.P;
        int n;
        int n2;
        if (this.getOrientation() == 0) {
            n = p.getWidth() - p.getPaddingLeft();
            n2 = p.getPaddingRight();
        }
        else {
            n = p.getHeight() - p.getPaddingTop();
            n2 = p.getPaddingBottom();
        }
        return n - n2;
    }
    
    public int getScrollState() {
        return this.R.h();
    }
    
    public void i() {
        this.P.K0();
    }
    
    public boolean j() {
        return this.T.f();
    }
    
    boolean k() {
        final int i0 = ((RecyclerView.p)this.M).i0();
        boolean b = true;
        if (i0 != 1) {
            b = false;
        }
        return b;
    }
    
    public boolean l() {
        return this.a0;
    }
    
    public void n(@j0 final j j) {
        this.I.d(j);
    }
    
    public void o(@j0 final RecyclerView.o o) {
        this.P.s1(o);
    }
    
    public void onInitializeAccessibilityNodeInfo(final AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.c0.i(accessibilityNodeInfo);
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        final int measuredWidth = this.P.getMeasuredWidth();
        final int measuredHeight = this.P.getMeasuredHeight();
        this.G.left = this.getPaddingLeft();
        this.G.right = n3 - n - this.getPaddingRight();
        this.G.top = this.getPaddingTop();
        this.G.bottom = n4 - n2 - this.getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.G, this.H);
        final RecyclerView p5 = this.P;
        final Rect h = this.H;
        p5.layout(h.left, h.top, h.right, h.bottom);
        if (this.K) {
            this.y();
        }
    }
    
    protected void onMeasure(final int n, final int n2) {
        this.measureChild((View)this.P, n, n2);
        final int measuredWidth = this.P.getMeasuredWidth();
        final int measuredHeight = this.P.getMeasuredHeight();
        final int measuredState = this.P.getMeasuredState();
        this.setMeasuredDimension(ViewGroup.resolveSizeAndState(Math.max(measuredWidth + (this.getPaddingLeft() + this.getPaddingRight()), this.getSuggestedMinimumWidth()), n, measuredState), ViewGroup.resolveSizeAndState(Math.max(measuredHeight + (this.getPaddingTop() + this.getPaddingBottom()), this.getSuggestedMinimumHeight()), n2, measuredState << 16));
    }
    
    protected void onRestoreInstanceState(final Parcelable parcelable) {
        if (!(parcelable instanceof p)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        final p p = (p)parcelable;
        super.onRestoreInstanceState(p.getSuperState());
        this.N = p.H;
        this.O = p.I;
    }
    
    @k0
    protected Parcelable onSaveInstanceState() {
        final p p = new p(super.onSaveInstanceState());
        p.G = this.P.getId();
        int h;
        if ((h = this.N) == -1) {
            h = this.J;
        }
        p.H = h;
        Parcelable i = this.O;
        if (i == null) {
            final RecyclerView.h adapter = this.P.getAdapter();
            if (!(adapter instanceof androidx.viewpager2.adapter.b)) {
                return (Parcelable)p;
            }
            i = ((androidx.viewpager2.adapter.b)adapter).a();
        }
        p.I = i;
        return (Parcelable)p;
    }
    
    public void onViewAdded(final View view) {
        final StringBuilder sb = new StringBuilder();
        sb.append(ViewPager2.class.getSimpleName());
        sb.append(" does not support direct child views");
        throw new IllegalStateException(sb.toString());
    }
    
    public void p(final int n) {
        this.P.t1(n);
    }
    
    @p0(16)
    public boolean performAccessibilityAction(final int n, final Bundle bundle) {
        if (this.c0.c(n, bundle)) {
            return this.c0.l(n, bundle);
        }
        return super.performAccessibilityAction(n, bundle);
    }
    
    public void q() {
        if (this.U.d() == null) {
            return;
        }
        final double g = this.R.g();
        final int n = (int)g;
        final float n2 = (float)(g - n);
        this.U.b(n, n2, Math.round(this.getPageSize() * n2));
    }
    
    public void s(final int n, final boolean b) {
        if (!this.j()) {
            this.t(n, b);
            return;
        }
        throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
    }
    
    public void setAdapter(@k0 final RecyclerView.h adapter) {
        final RecyclerView.h adapter2 = this.P.getAdapter();
        this.c0.f(adapter2);
        this.w(adapter2);
        this.P.setAdapter(adapter);
        this.J = 0;
        this.r();
        this.c0.e(adapter);
        this.m(adapter);
    }
    
    public void setCurrentItem(final int n) {
        this.s(n, true);
    }
    
    @p0(17)
    public void setLayoutDirection(final int layoutDirection) {
        super.setLayoutDirection(layoutDirection);
        this.c0.p();
    }
    
    public void setOffscreenPageLimit(final int b0) {
        if (b0 < 1 && b0 != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.b0 = b0;
        this.P.requestLayout();
    }
    
    public void setOrientation(final int n) {
        this.M.f3(n);
        this.c0.r();
    }
    
    public void setPageTransformer(@k0 final m m) {
        final boolean w = this.W;
        if (m != null) {
            if (!w) {
                this.V = this.P.getItemAnimator();
                this.W = true;
            }
            this.P.setItemAnimator(null);
        }
        else if (w) {
            this.P.setItemAnimator(this.V);
            this.V = null;
            this.W = false;
        }
        if (m == this.U.d()) {
            return;
        }
        this.U.e(m);
        this.q();
    }
    
    public void setUserInputEnabled(final boolean a0) {
        this.a0 = a0;
        this.c0.s();
    }
    
    void t(int j, final boolean b) {
        final RecyclerView.h adapter = this.getAdapter();
        if (adapter == null) {
            if (this.N != -1) {
                this.N = Math.max(j, 0);
            }
            return;
        }
        if (adapter.getItemCount() <= 0) {
            return;
        }
        final int min = Math.min(Math.max(j, 0), adapter.getItemCount() - 1);
        if (min == this.J && this.R.k()) {
            return;
        }
        j = this.J;
        if (min == j && b) {
            return;
        }
        double g = j;
        this.J = min;
        this.c0.q();
        if (!this.R.k()) {
            g = this.R.g();
        }
        this.R.p(min, b);
        if (!b) {
            this.P.G1(min);
            return;
        }
        final double n = min;
        if (Math.abs(n - g) > 3.0) {
            final RecyclerView p2 = this.P;
            if (n > g) {
                j = min - 3;
            }
            else {
                j = min + 3;
            }
            p2.G1(j);
            final RecyclerView p3 = this.P;
            p3.post((Runnable)new r(min, p3));
        }
        else {
            this.P.O1(min);
        }
    }
    
    void v() {
        final View h = this.Q.h(this.M);
        if (h == null) {
            return;
        }
        final int[] c = this.Q.c(this.M, h);
        if (c[0] != 0 || c[1] != 0) {
            this.P.K1(c[0], c[1]);
        }
    }
    
    public void x(@j0 final j j) {
        this.I.e(j);
    }
    
    void y() {
        final a0 q = this.Q;
        if (q == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        final View h = q.h(this.M);
        if (h == null) {
            return;
        }
        final int s0 = ((RecyclerView.p)this.M).s0(h);
        if (s0 != this.J && this.getScrollState() == 0) {
            this.S.c(s0);
        }
        this.K = false;
    }
    
    private abstract class e
    {
        boolean a() {
            return false;
        }
        
        boolean b(final int n) {
            return false;
        }
        
        boolean c(final int n, final Bundle bundle) {
            return false;
        }
        
        boolean d() {
            return false;
        }
        
        void e(@k0 final RecyclerView.h<?> h) {
        }
        
        void f(@k0 final RecyclerView.h<?> h) {
        }
        
        String g() {
            throw new IllegalStateException("Not implemented.");
        }
        
        void h(@j0 final b b, @j0 final RecyclerView recyclerView) {
        }
        
        void i(final AccessibilityNodeInfo accessibilityNodeInfo) {
        }
        
        void j(@j0 final androidx.core.view.accessibility.d d) {
        }
        
        boolean k(final int n) {
            throw new IllegalStateException("Not implemented.");
        }
        
        boolean l(final int n, final Bundle bundle) {
            throw new IllegalStateException("Not implemented.");
        }
        
        void m() {
        }
        
        CharSequence n() {
            throw new IllegalStateException("Not implemented.");
        }
        
        void o(@j0 final AccessibilityEvent accessibilityEvent) {
        }
        
        void p() {
        }
        
        void q() {
        }
        
        void r() {
        }
        
        void s() {
        }
    }
    
    class f extends e
    {
        public boolean b(final int n) {
            return (n == 8192 || n == 4096) && !ViewPager2.this.l();
        }
        
        public boolean d() {
            return true;
        }
        
        public void j(@j0 final androidx.core.view.accessibility.d d) {
            if (!ViewPager2.this.l()) {
                d.J0(androidx.core.view.accessibility.d.a.s);
                d.J0(androidx.core.view.accessibility.d.a.r);
                d.D1(false);
            }
        }
        
        public boolean k(final int n) {
            if (this.b(n)) {
                return false;
            }
            throw new IllegalStateException();
        }
        
        public CharSequence n() {
            if (this.d()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }
    }
    
    private abstract static class g extends RecyclerView.j
    {
        @Override
        public abstract void a();
        
        @Override
        public final void b(final int n, final int n2) {
            this.a();
        }
        
        @Override
        public final void c(final int n, final int n2, @k0 final Object o) {
            this.a();
        }
        
        @Override
        public final void d(final int n, final int n2) {
            this.a();
        }
        
        @Override
        public final void e(final int n, final int n2, final int n3) {
            this.a();
        }
        
        @Override
        public final void f(final int n, final int n2) {
            this.a();
        }
    }
    
    private class h extends LinearLayoutManager
    {
        h(final Context context) {
            super(context);
        }
        
        @Override
        public boolean M1(@j0 final RecyclerView recyclerView, @j0 final View view, @j0 final Rect rect, final boolean b, final boolean b2) {
            return false;
        }
        
        @Override
        public void e1(@j0 final x x, @j0 final d0 d0, @j0 final androidx.core.view.accessibility.d d2) {
            super.e1(x, d0, d2);
            ViewPager2.this.c0.j(d2);
        }
        
        @Override
        protected void k2(@j0 final d0 d0, @j0 final int[] array) {
            final int offscreenPageLimit = ViewPager2.this.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.k2(d0, array);
                return;
            }
            array[1] = (array[0] = ViewPager2.this.getPageSize() * offscreenPageLimit);
        }
        
        @Override
        public boolean y1(@j0 final x x, @j0 final d0 d0, final int n, @k0 final Bundle bundle) {
            if (ViewPager2.this.c0.b(n)) {
                return ViewPager2.this.c0.k(n);
            }
            return super.y1(x, d0, n, bundle);
        }
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @b0(from = 1L)
    @t0({ t0.a.I })
    public @interface i {
    }
    
    public abstract static class j
    {
        public void a(final int n) {
        }
        
        public void b(final int n, final float n2, @n0 final int n3) {
        }
        
        public void c(final int n) {
        }
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @t0({ t0.a.I })
    public @interface k {
    }
    
    class l extends e
    {
        private final androidx.core.view.accessibility.g b;
        private final androidx.core.view.accessibility.g c;
        private RecyclerView.j d;
        
        l() {
            this.b = new androidx.core.view.accessibility.g() {
                @Override
                public boolean a(@j0 final View view, @k0 final a a) {
                    l.this.v(((ViewPager2)view).getCurrentItem() + 1);
                    return true;
                }
            };
            this.c = new androidx.core.view.accessibility.g() {
                @Override
                public boolean a(@j0 final View view, @k0 final a a) {
                    l.this.v(((ViewPager2)view).getCurrentItem() - 1);
                    return true;
                }
            };
        }
        
        private void t(final AccessibilityNodeInfo accessibilityNodeInfo) {
            int itemCount = 0;
            int itemCount2 = 0;
            Label_0055: {
                if (ViewPager2.this.getAdapter() != null) {
                    if (ViewPager2.this.getOrientation() != 1) {
                        itemCount = ViewPager2.this.getAdapter().getItemCount();
                        itemCount2 = 0;
                        break Label_0055;
                    }
                    itemCount2 = ViewPager2.this.getAdapter().getItemCount();
                }
                else {
                    itemCount2 = 0;
                }
                itemCount = 0;
            }
            androidx.core.view.accessibility.d.V1(accessibilityNodeInfo).W0(androidx.core.view.accessibility.d.b.f(itemCount2, itemCount, false, 0));
        }
        
        private void u(final AccessibilityNodeInfo accessibilityNodeInfo) {
            final RecyclerView.h adapter = ViewPager2.this.getAdapter();
            if (adapter == null) {
                return;
            }
            final int itemCount = adapter.getItemCount();
            if (itemCount != 0) {
                if (ViewPager2.this.l()) {
                    if (ViewPager2.this.J > 0) {
                        accessibilityNodeInfo.addAction(8192);
                    }
                    if (ViewPager2.this.J < itemCount - 1) {
                        accessibilityNodeInfo.addAction(4096);
                    }
                    accessibilityNodeInfo.setScrollable(true);
                }
            }
        }
        
        public boolean a() {
            return true;
        }
        
        public boolean c(final int n, final Bundle bundle) {
            return n == 8192 || n == 4096;
        }
        
        public void e(@k0 final RecyclerView.h<?> h) {
            this.w();
            if (h != null) {
                h.registerAdapterDataObserver(this.d);
            }
        }
        
        public void f(@k0 final RecyclerView.h<?> h) {
            if (h != null) {
                h.unregisterAdapterDataObserver(this.d);
            }
        }
        
        public String g() {
            if (this.a()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }
        
        public void h(@j0 final b b, @j0 final RecyclerView recyclerView) {
            androidx.core.view.j0.P1((View)recyclerView, 2);
            this.d = new g() {
                @Override
                public void a() {
                    ViewPager2.l.this.w();
                }
            };
            if (androidx.core.view.j0.T((View)ViewPager2.this) == 0) {
                androidx.core.view.j0.P1((View)ViewPager2.this, 1);
            }
        }
        
        public void i(final AccessibilityNodeInfo accessibilityNodeInfo) {
            this.t(accessibilityNodeInfo);
            if (Build$VERSION.SDK_INT >= 16) {
                this.u(accessibilityNodeInfo);
            }
        }
        
        public boolean l(int n, final Bundle bundle) {
            if (this.c(n, bundle)) {
                if (n == 8192) {
                    n = ViewPager2.this.getCurrentItem() - 1;
                }
                else {
                    n = ViewPager2.this.getCurrentItem() + 1;
                }
                this.v(n);
                return true;
            }
            throw new IllegalStateException();
        }
        
        public void m() {
            this.w();
        }
        
        public void o(@j0 final AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.setSource((View)ViewPager2.this);
            accessibilityEvent.setClassName((CharSequence)this.g());
        }
        
        public void p() {
            this.w();
        }
        
        public void q() {
            this.w();
        }
        
        public void r() {
            this.w();
        }
        
        public void s() {
            this.w();
            if (Build$VERSION.SDK_INT < 21) {
                ViewPager2.this.sendAccessibilityEvent(2048);
            }
        }
        
        void v(final int n) {
            if (ViewPager2.this.l()) {
                ViewPager2.this.t(n, true);
            }
        }
        
        void w() {
            final ViewPager2 e = ViewPager2.this;
            int n = 16908360;
            androidx.core.view.j0.p1((View)e, 16908360);
            androidx.core.view.j0.p1((View)e, 16908361);
            androidx.core.view.j0.p1((View)e, 16908358);
            androidx.core.view.j0.p1((View)e, 16908359);
            if (ViewPager2.this.getAdapter() == null) {
                return;
            }
            final int itemCount = ViewPager2.this.getAdapter().getItemCount();
            if (itemCount == 0) {
                return;
            }
            if (!ViewPager2.this.l()) {
                return;
            }
            if (ViewPager2.this.getOrientation() == 0) {
                final boolean k = ViewPager2.this.k();
                int n2;
                if (k) {
                    n2 = 16908360;
                }
                else {
                    n2 = 16908361;
                }
                if (k) {
                    n = 16908361;
                }
                if (ViewPager2.this.J < itemCount - 1) {
                    androidx.core.view.j0.s1((View)e, new androidx.core.view.accessibility.d.a(n2, null), null, this.b);
                }
                if (ViewPager2.this.J > 0) {
                    androidx.core.view.j0.s1((View)e, new androidx.core.view.accessibility.d.a(n, null), null, this.c);
                }
            }
            else {
                if (ViewPager2.this.J < itemCount - 1) {
                    androidx.core.view.j0.s1((View)e, new androidx.core.view.accessibility.d.a(16908359, null), null, this.b);
                }
                if (ViewPager2.this.J > 0) {
                    androidx.core.view.j0.s1((View)e, new androidx.core.view.accessibility.d.a(16908358, null), null, this.c);
                }
            }
        }
    }
    
    public interface m
    {
        void a(@j0 final View p0, final float p1);
    }
    
    private class n extends a0
    {
        n() {
        }
        
        @k0
        @Override
        public View h(final RecyclerView.p p) {
            View h;
            if (ViewPager2.this.j()) {
                h = null;
            }
            else {
                h = super.h(p);
            }
            return h;
        }
    }
    
    private class o extends RecyclerView
    {
        o(final Context context) {
            super(context);
        }
        
        @p0(23)
        @Override
        public CharSequence getAccessibilityClassName() {
            if (ViewPager2.this.c0.d()) {
                return ViewPager2.this.c0.n();
            }
            return super.getAccessibilityClassName();
        }
        
        public void onInitializeAccessibilityEvent(@j0 final AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(ViewPager2.this.J);
            accessibilityEvent.setToIndex(ViewPager2.this.J);
            ViewPager2.this.c0.o(accessibilityEvent);
        }
        
        @Override
        public boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
            return ViewPager2.this.l() && super.onInterceptTouchEvent(motionEvent);
        }
        
        @SuppressLint({ "ClickableViewAccessibility" })
        @Override
        public boolean onTouchEvent(final MotionEvent motionEvent) {
            return ViewPager2.this.l() && super.onTouchEvent(motionEvent);
        }
    }
    
    static class p extends View$BaseSavedState
    {
        public static final Parcelable$Creator<p> CREATOR;
        int G;
        int H;
        Parcelable I;
        
        static {
            CREATOR = (Parcelable$Creator)new Parcelable$ClassLoaderCreator<p>() {
                public p a(final Parcel parcel) {
                    return this.b(parcel, null);
                }
                
                public p b(final Parcel parcel, final ClassLoader classLoader) {
                    p p2;
                    if (Build$VERSION.SDK_INT >= 24) {
                        p2 = new p(parcel, classLoader);
                    }
                    else {
                        p2 = new p(parcel);
                    }
                    return p2;
                }
                
                public p[] c(final int n) {
                    return new p[n];
                }
            };
        }
        
        p(final Parcel parcel) {
            super(parcel);
            this.a(parcel, null);
        }
        
        @p0(24)
        p(final Parcel parcel, final ClassLoader classLoader) {
            super(parcel, classLoader);
            this.a(parcel, classLoader);
        }
        
        p(final Parcelable parcelable) {
            super(parcelable);
        }
        
        private void a(final Parcel parcel, final ClassLoader classLoader) {
            this.G = parcel.readInt();
            this.H = parcel.readInt();
            this.I = parcel.readParcelable(classLoader);
        }
        
        public void writeToParcel(final Parcel parcel, final int n) {
            super.writeToParcel(parcel, n);
            parcel.writeInt(this.G);
            parcel.writeInt(this.H);
            parcel.writeParcelable(this.I, n);
        }
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @t0({ t0.a.I })
    public @interface q {
    }
    
    private static class r implements Runnable
    {
        private final int G;
        private final RecyclerView H;
        
        r(final int g, final RecyclerView h) {
            this.G = g;
            this.H = h;
        }
        
        @Override
        public void run() {
            this.H.O1(this.G);
        }
    }
}
