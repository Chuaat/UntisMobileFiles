// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.appbar;

import androidx.annotation.t0;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;
import android.view.animation.AnimationUtils;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable$ClassLoaderCreator;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import android.view.animation.Interpolator;
import android.widget.ScrollView;
import android.widget.ListView;
import androidx.core.view.u;
import androidx.core.view.accessibility.g;
import androidx.core.view.accessibility.d;
import androidx.annotation.s;
import androidx.annotation.l;
import androidx.core.graphics.drawable.c;
import android.graphics.drawable.Drawable$Callback;
import androidx.annotation.p0;
import android.view.View$MeasureSpec;
import com.google.android.material.shape.k;
import androidx.core.util.i;
import androidx.annotation.b1;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.graphics.Canvas;
import android.view.ViewGroup$LayoutParams;
import java.util.ArrayList;
import android.view.ViewGroup;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.content.res.TypedArray;
import androidx.core.view.a0;
import android.content.res.ColorStateList;
import com.google.android.material.shape.j;
import android.graphics.drawable.ColorDrawable;
import com.google.android.material.internal.t;
import android.os.Build$VERSION;
import android.util.AttributeSet;
import androidx.annotation.j0;
import android.content.Context;
import o2.a;
import android.graphics.drawable.Drawable;
import android.animation.ValueAnimator;
import android.view.View;
import java.lang.ref.WeakReference;
import androidx.annotation.y;
import java.util.List;
import androidx.annotation.k0;
import androidx.core.view.x0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.widget.LinearLayout;

public class AppBarLayout extends LinearLayout implements b
{
    static final int a0 = 0;
    static final int b0 = 1;
    static final int c0 = 2;
    static final int d0 = 4;
    static final int e0 = 8;
    private static final int f0;
    private static final int g0 = -1;
    private int G;
    private int H;
    private int I;
    private int J;
    private boolean K;
    private int L;
    @k0
    private x0 M;
    private List<c> N;
    private boolean O;
    private boolean P;
    private boolean Q;
    private boolean R;
    @androidx.annotation.y
    private int S;
    @k0
    private WeakReference<View> T;
    @k0
    private ValueAnimator U;
    private int[] V;
    @k0
    private Drawable W;
    
    static {
        f0 = a.n.sa;
    }
    
    public AppBarLayout(@j0 final Context context) {
        this(context, null);
    }
    
    public AppBarLayout(@j0 final Context context, @k0 final AttributeSet set) {
        this(context, set, o2.a.c.S);
    }
    
    public AppBarLayout(@j0 Context context, @k0 final AttributeSet set, int n) {
        final int f0 = AppBarLayout.f0;
        super(com.google.android.material.theme.overlay.a.c(context, set, n, f0), set, n);
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.L = 0;
        context = this.getContext();
        this.setOrientation(1);
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 21) {
            com.google.android.material.appbar.f.a((View)this);
            com.google.android.material.appbar.f.c((View)this, set, n, f0);
        }
        final TypedArray j = t.j(context, set, a.o.r0, n, f0, new int[0]);
        androidx.core.view.j0.G1((View)this, j.getDrawable(a.o.s0));
        if (this.getBackground() instanceof ColorDrawable) {
            final ColorDrawable colorDrawable = (ColorDrawable)this.getBackground();
            final com.google.android.material.shape.j i = new com.google.android.material.shape.j();
            i.n0(ColorStateList.valueOf(colorDrawable.getColor()));
            i.Y(context);
            androidx.core.view.j0.G1((View)this, i);
        }
        n = a.o.w0;
        if (j.hasValue(n)) {
            this.t(j.getBoolean(n, false), false, false);
        }
        if (sdk_INT >= 21) {
            n = a.o.v0;
            if (j.hasValue(n)) {
                com.google.android.material.appbar.f.b((View)this, (float)j.getDimensionPixelSize(n, 0));
            }
        }
        if (sdk_INT >= 26) {
            n = a.o.u0;
            if (j.hasValue(n)) {
                this.setKeyboardNavigationCluster(j.getBoolean(n, false));
            }
            n = a.o.t0;
            if (j.hasValue(n)) {
                this.setTouchscreenBlocksFocus(j.getBoolean(n, false));
            }
        }
        this.R = j.getBoolean(a.o.x0, false);
        this.S = j.getResourceId(a.o.y0, -1);
        this.setStatusBarForeground(j.getDrawable(a.o.z0));
        j.recycle();
        androidx.core.view.j0.Y1((View)this, new a0() {
            @Override
            public x0 a(final View view, final x0 x0) {
                return AppBarLayout.this.o(x0);
            }
        });
    }
    
    private boolean A() {
        final int childCount = this.getChildCount();
        boolean b2;
        final boolean b = b2 = false;
        if (childCount > 0) {
            final View child = this.getChildAt(0);
            b2 = b;
            if (child.getVisibility() != 8) {
                b2 = b;
                if (!androidx.core.view.j0.S(child)) {
                    b2 = true;
                }
            }
        }
        return b2;
    }
    
    private void B(@j0 final com.google.android.material.shape.j j, final boolean b) {
        float dimension = this.getResources().getDimension(o2.a.f.O0);
        float n;
        if (b) {
            n = 0.0f;
        }
        else {
            n = dimension;
        }
        if (!b) {
            dimension = 0.0f;
        }
        final ValueAnimator u = this.U;
        if (u != null) {
            u.cancel();
        }
        (this.U = ValueAnimator.ofFloat(new float[] { n, dimension })).setDuration((long)this.getResources().getInteger(o2.a.i.c));
        this.U.setInterpolator(com.google.android.material.animation.a.a);
        this.U.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new ValueAnimator$AnimatorUpdateListener() {
            public void onAnimationUpdate(@j0 final ValueAnimator valueAnimator) {
                j.m0((float)valueAnimator.getAnimatedValue());
            }
        });
        this.U.start();
    }
    
    private void C() {
        this.setWillNotDraw(this.y() ^ true);
    }
    
    private void c() {
        final WeakReference<View> t = this.T;
        if (t != null) {
            t.clear();
        }
        this.T = null;
    }
    
    @k0
    private View d(@k0 View viewById) {
        final WeakReference<View> t = this.T;
        final View view = null;
        if (t == null) {
            final int s = this.S;
            if (s != -1) {
                if (viewById != null) {
                    viewById = viewById.findViewById(s);
                }
                else {
                    viewById = null;
                }
                View viewById2 = viewById;
                if (viewById == null) {
                    viewById2 = viewById;
                    if (this.getParent() instanceof ViewGroup) {
                        viewById2 = ((ViewGroup)this.getParent()).findViewById(this.S);
                    }
                }
                if (viewById2 != null) {
                    this.T = new WeakReference<View>(viewById2);
                }
            }
        }
        final WeakReference<View> t2 = this.T;
        viewById = view;
        if (t2 != null) {
            viewById = (View)t2.get();
        }
        return viewById;
    }
    
    private boolean i() {
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            if (((d)this.getChildAt(i).getLayoutParams()).c()) {
                return true;
            }
        }
        return false;
    }
    
    private void k() {
        this.H = -1;
        this.I = -1;
        this.J = -1;
    }
    
    private void t(final boolean b, final boolean b2, final boolean b3) {
        int n;
        if (b) {
            n = 1;
        }
        else {
            n = 2;
        }
        int n2 = 0;
        int n3;
        if (b2) {
            n3 = 4;
        }
        else {
            n3 = 0;
        }
        if (b3) {
            n2 = 8;
        }
        this.L = (n | n3 | n2);
        this.requestLayout();
    }
    
    private boolean v(final boolean p) {
        if (this.P != p) {
            this.P = p;
            this.refreshDrawableState();
            return true;
        }
        return false;
    }
    
    private boolean y() {
        return this.W != null && this.getTopInset() > 0;
    }
    
    public void a(@k0 final c c) {
        if (this.N == null) {
            this.N = new ArrayList<c>();
        }
        if (c != null && !this.N.contains(c)) {
            this.N.add(c);
        }
    }
    
    public void b(final e e) {
        this.a((c)e);
    }
    
    protected boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return viewGroup$LayoutParams instanceof d;
    }
    
    public void draw(@j0 final Canvas canvas) {
        super.draw(canvas);
        if (this.y()) {
            final int save = canvas.save();
            canvas.translate(0.0f, (float)(-this.G));
            this.W.draw(canvas);
            canvas.restoreToCount(save);
        }
    }
    
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        final int[] drawableState = this.getDrawableState();
        final Drawable w = this.W;
        if (w != null && w.isStateful() && w.setState(drawableState)) {
            this.invalidateDrawable(w);
        }
    }
    
    protected d e() {
        return new d(-1, -2);
    }
    
    public d f(final AttributeSet set) {
        return new d(this.getContext(), set);
    }
    
    protected d g(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        if (Build$VERSION.SDK_INT >= 19 && viewGroup$LayoutParams instanceof LinearLayout$LayoutParams) {
            return new d((LinearLayout$LayoutParams)viewGroup$LayoutParams);
        }
        if (viewGroup$LayoutParams instanceof ViewGroup$MarginLayoutParams) {
            return new d((ViewGroup$MarginLayoutParams)viewGroup$LayoutParams);
        }
        return new d(viewGroup$LayoutParams);
    }
    
    @j0
    public CoordinatorLayout.c<AppBarLayout> getBehavior() {
        return new Behavior();
    }
    
    int getDownNestedPreScrollRange() {
        final int i = this.I;
        if (i != -1) {
            return i;
        }
        int j = this.getChildCount() - 1;
        int b = 0;
        while (j >= 0) {
            final View child = this.getChildAt(j);
            final d d = (d)child.getLayoutParams();
            final int measuredHeight = child.getMeasuredHeight();
            final int a = d.a;
            int n2;
            if ((a & 0x5) == 0x5) {
                final int n = d.topMargin + d.bottomMargin;
                int a2 = 0;
                Label_0120: {
                    int c0;
                    if ((a & 0x8) != 0x0) {
                        c0 = androidx.core.view.j0.c0(child);
                    }
                    else {
                        if ((a & 0x2) == 0x0) {
                            a2 = n + measuredHeight;
                            break Label_0120;
                        }
                        c0 = measuredHeight - androidx.core.view.j0.c0(child);
                    }
                    a2 = n + c0;
                }
                int min = a2;
                if (j == 0) {
                    min = a2;
                    if (androidx.core.view.j0.S(child)) {
                        min = Math.min(a2, measuredHeight - this.getTopInset());
                    }
                }
                n2 = b + min;
            }
            else if ((n2 = b) > 0) {
                break;
            }
            --j;
            b = n2;
        }
        return this.I = Math.max(0, b);
    }
    
    int getDownNestedScrollRange() {
        final int j = this.J;
        if (j != -1) {
            return j;
        }
        final int childCount = this.getChildCount();
        int n = 0;
        int n2 = 0;
        int b;
        while (true) {
            b = n2;
            if (n >= childCount) {
                break;
            }
            final View child = this.getChildAt(n);
            final d d = (d)child.getLayoutParams();
            final int measuredHeight = child.getMeasuredHeight();
            final int topMargin = d.topMargin;
            final int bottomMargin = d.bottomMargin;
            final int a = d.a;
            b = n2;
            if ((a & 0x1) == 0x0) {
                break;
            }
            n2 += measuredHeight + (topMargin + bottomMargin);
            if ((a & 0x2) != 0x0) {
                b = n2 - androidx.core.view.j0.c0(child);
                break;
            }
            ++n;
        }
        return this.J = Math.max(0, b);
    }
    
    @androidx.annotation.y
    public int getLiftOnScrollTargetViewId() {
        return this.S;
    }
    
    public final int getMinimumHeightForVisibleOverlappingContent() {
        final int topInset = this.getTopInset();
        int n = androidx.core.view.j0.c0((View)this);
        if (n == 0) {
            final int childCount = this.getChildCount();
            if (childCount >= 1) {
                n = androidx.core.view.j0.c0(this.getChildAt(childCount - 1));
            }
            else {
                n = 0;
            }
            if (n == 0) {
                return this.getHeight() / 3;
            }
        }
        return n * 2 + topInset;
    }
    
    int getPendingAction() {
        return this.L;
    }
    
    @k0
    public Drawable getStatusBarForeground() {
        return this.W;
    }
    
    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }
    
    @b1
    final int getTopInset() {
        final x0 m = this.M;
        int r;
        if (m != null) {
            r = m.r();
        }
        else {
            r = 0;
        }
        return r;
    }
    
    public final int getTotalScrollRange() {
        final int h = this.H;
        if (h != -1) {
            return h;
        }
        final int childCount = this.getChildCount();
        int n = 0;
        int n2 = 0;
        int b;
        while (true) {
            b = n2;
            if (n >= childCount) {
                break;
            }
            final View child = this.getChildAt(n);
            final d d = (d)child.getLayoutParams();
            final int measuredHeight = child.getMeasuredHeight();
            final int a = d.a;
            b = n2;
            if ((a & 0x1) == 0x0) {
                break;
            }
            final int n3 = n2 += measuredHeight + d.topMargin + d.bottomMargin;
            if (n == 0) {
                n2 = n3;
                if (androidx.core.view.j0.S(child)) {
                    n2 = n3 - this.getTopInset();
                }
            }
            if ((a & 0x2) != 0x0) {
                b = n2 - androidx.core.view.j0.c0(child);
                break;
            }
            ++n;
        }
        return this.H = Math.max(0, b);
    }
    
    int getUpNestedPreScrollRange() {
        return this.getTotalScrollRange();
    }
    
    boolean h() {
        return this.K;
    }
    
    boolean j() {
        return this.getTotalScrollRange() != 0;
    }
    
    public boolean l() {
        return this.R;
    }
    
    public boolean m() {
        return this.Q;
    }
    
    void n(final int g) {
        this.G = g;
        if (!this.willNotDraw()) {
            androidx.core.view.j0.l1((View)this);
        }
        final List<c> n = this.N;
        if (n != null) {
            for (int i = 0; i < n.size(); ++i) {
                final c<AppBarLayout> c = this.N.get(i);
                if (c != null) {
                    c.a(this, g);
                }
            }
        }
    }
    
    x0 o(final x0 x0) {
        x0 m;
        if (androidx.core.view.j0.S((View)this)) {
            m = x0;
        }
        else {
            m = null;
        }
        if (!androidx.core.util.i.a(this.M, m)) {
            this.M = m;
            this.C();
            this.requestLayout();
        }
        return x0;
    }
    
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        k.e((View)this);
    }
    
    protected int[] onCreateDrawableState(int n) {
        if (this.V == null) {
            this.V = new int[4];
        }
        final int[] v = this.V;
        final int[] onCreateDrawableState = super.onCreateDrawableState(n + v.length);
        final boolean p = this.P;
        n = o2.a.c.ed;
        if (!p) {
            n = -n;
        }
        v[0] = n;
        if (p && this.Q) {
            n = o2.a.c.fd;
        }
        else {
            n = -o2.a.c.fd;
        }
        v[1] = n;
        n = o2.a.c.cd;
        if (!p) {
            n = -n;
        }
        v[2] = n;
        if (p && this.Q) {
            n = o2.a.c.bd;
        }
        else {
            n = -o2.a.c.bd;
        }
        v[3] = n;
        return LinearLayout.mergeDrawableStates(onCreateDrawableState, v);
    }
    
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c();
    }
    
    protected void onLayout(final boolean b, int i, int n, final int n2, final int n3) {
        super.onLayout(b, i, n, n2, n3);
        final boolean s = androidx.core.view.j0.S((View)this);
        final boolean b2 = true;
        if (s && this.A()) {
            n = this.getTopInset();
            for (i = this.getChildCount() - 1; i >= 0; --i) {
                androidx.core.view.j0.d1(this.getChildAt(i), n);
            }
        }
        this.k();
        this.K = false;
        for (n = this.getChildCount(), i = 0; i < n; ++i) {
            if (((d)this.getChildAt(i).getLayoutParams()).b() != null) {
                this.K = true;
                break;
            }
        }
        final Drawable w = this.W;
        if (w != null) {
            w.setBounds(0, 0, this.getWidth(), this.getTopInset());
        }
        if (!this.O) {
            boolean b3 = b2;
            if (!this.R) {
                b3 = (this.i() && b2);
            }
            this.v(b3);
        }
    }
    
    protected void onMeasure(int n, final int n2) {
        super.onMeasure(n, n2);
        final int mode = View$MeasureSpec.getMode(n2);
        if (mode != 1073741824 && androidx.core.view.j0.S((View)this) && this.A()) {
            n = this.getMeasuredHeight();
            if (mode != Integer.MIN_VALUE) {
                if (mode == 0) {
                    n += this.getTopInset();
                }
            }
            else {
                n = q.a.c(this.getMeasuredHeight() + this.getTopInset(), 0, View$MeasureSpec.getSize(n2));
            }
            this.setMeasuredDimension(this.getMeasuredWidth(), n);
        }
        this.k();
    }
    
    public void p(@k0 final c c) {
        final List<c> n = this.N;
        if (n != null && c != null) {
            n.remove(c);
        }
    }
    
    public void q(final e e) {
        this.p((c)e);
    }
    
    void r() {
        this.L = 0;
    }
    
    public void s(final boolean b, final boolean b2) {
        this.t(b, b2, true);
    }
    
    @p0(21)
    public void setElevation(final float elevation) {
        super.setElevation(elevation);
        k.d((View)this, elevation);
    }
    
    public void setExpanded(final boolean b) {
        this.s(b, androidx.core.view.j0.T0((View)this));
    }
    
    public void setLiftOnScroll(final boolean r) {
        this.R = r;
    }
    
    public void setLiftOnScrollTargetViewId(@androidx.annotation.y final int s) {
        this.S = s;
        this.c();
    }
    
    public void setOrientation(final int orientation) {
        if (orientation == 1) {
            super.setOrientation(orientation);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }
    
    public void setStatusBarForeground(@k0 Drawable w) {
        final Drawable w2 = this.W;
        if (w2 != w) {
            Drawable mutate = null;
            if (w2 != null) {
                w2.setCallback((Drawable$Callback)null);
            }
            if (w != null) {
                mutate = w.mutate();
            }
            if ((this.W = mutate) != null) {
                if (mutate.isStateful()) {
                    this.W.setState(this.getDrawableState());
                }
                androidx.core.graphics.drawable.c.m(this.W, androidx.core.view.j0.X((View)this));
                w = this.W;
                w.setVisible(this.getVisibility() == 0, false);
                this.W.setCallback((Drawable$Callback)this);
            }
            this.C();
            androidx.core.view.j0.l1((View)this);
        }
    }
    
    public void setStatusBarForegroundColor(@l final int n) {
        this.setStatusBarForeground((Drawable)new ColorDrawable(n));
    }
    
    public void setStatusBarForegroundResource(@s final int n) {
        this.setStatusBarForeground(androidx.appcompat.content.res.a.d(this.getContext(), n));
    }
    
    @Deprecated
    public void setTargetElevation(final float n) {
        if (Build$VERSION.SDK_INT >= 21) {
            com.google.android.material.appbar.f.b((View)this, n);
        }
    }
    
    public void setVisibility(final int visibility) {
        super.setVisibility(visibility);
        final boolean b = visibility == 0;
        final Drawable w = this.W;
        if (w != null) {
            w.setVisible(b, false);
        }
    }
    
    public boolean u(final boolean b) {
        this.O = true;
        return this.v(b);
    }
    
    protected boolean verifyDrawable(@j0 final Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.W;
    }
    
    public boolean w(final boolean b) {
        return this.x(b);
    }
    
    boolean x(final boolean q) {
        if (this.Q != q) {
            this.Q = q;
            this.refreshDrawableState();
            if (this.R && this.getBackground() instanceof com.google.android.material.shape.j) {
                this.B((com.google.android.material.shape.j)this.getBackground(), q);
            }
            return true;
        }
        return false;
    }
    
    boolean z(@k0 View view) {
        final View d = this.d(view);
        if (d != null) {
            view = d;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }
    
    protected static class BaseBehavior<T extends AppBarLayout> extends b<T>
    {
        private static final int t = 600;
        private static final int u = -1;
        private int l;
        private int m;
        private ValueAnimator n;
        private int o;
        private boolean p;
        private float q;
        @k0
        private WeakReference<View> r;
        private d s;
        
        public BaseBehavior() {
            this.o = -1;
        }
        
        public BaseBehavior(final Context context, final AttributeSet set) {
            super(context, set);
            this.o = -1;
        }
        
        private void A0(final CoordinatorLayout coordinatorLayout, @j0 final T t) {
            final int u = this.U();
            final int j0 = this.j0(t, u);
            if (j0 >= 0) {
                final View child = t.getChildAt(j0);
                final AppBarLayout.d d = (AppBarLayout.d)child.getLayoutParams();
                final int a = d.a();
                if ((a & 0x11) == 0x11) {
                    final int n = -child.getTop();
                    int n3;
                    final int n2 = n3 = -child.getBottom();
                    if (j0 == t.getChildCount() - 1) {
                        n3 = n2 + t.getTopInset();
                    }
                    int n4;
                    int n5;
                    if (g0(a, 2)) {
                        n4 = n3 + androidx.core.view.j0.c0(child);
                        n5 = n;
                    }
                    else {
                        n5 = n;
                        n4 = n3;
                        if (g0(a, 5)) {
                            n4 = androidx.core.view.j0.c0(child) + n3;
                            if (u < n4) {
                                n5 = n4;
                                n4 = n3;
                            }
                            else {
                                n5 = n;
                            }
                        }
                    }
                    int n6 = n5;
                    int n7 = n4;
                    if (g0(a, 32)) {
                        n6 = n5 + d.topMargin;
                        n7 = n4 - d.bottomMargin;
                    }
                    int n8 = n6;
                    if (u < (n7 + n6) / 2) {
                        n8 = n7;
                    }
                    this.c0(coordinatorLayout, t, q.a.c(n8, -t.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }
        
        private void B0(final CoordinatorLayout coordinatorLayout, @j0 final T t) {
            androidx.core.view.j0.p1((View)coordinatorLayout, androidx.core.view.accessibility.d.a.r.b());
            androidx.core.view.j0.p1((View)coordinatorLayout, androidx.core.view.accessibility.d.a.s.b());
            final View h0 = this.h0(coordinatorLayout);
            if (h0 != null) {
                if (t.getTotalScrollRange() != 0) {
                    if (!(((g)h0.getLayoutParams()).f() instanceof ScrollingViewBehavior)) {
                        return;
                    }
                    this.a0(coordinatorLayout, t, h0);
                }
            }
        }
        
        private void C0(@j0 final CoordinatorLayout coordinatorLayout, @j0 final T t, final int n, final int n2, final boolean b) {
            final View i0 = i0(t, n);
            if (i0 != null) {
                final int a = ((AppBarLayout.d)i0.getLayoutParams()).a();
                boolean z;
                final boolean b2 = z = false;
                Label_0123: {
                    if ((a & 0x1) != 0x0) {
                        final int c0 = androidx.core.view.j0.c0(i0);
                        if (n2 > 0 && (a & 0xC) != 0x0) {
                            z = b2;
                            if (-n < i0.getBottom() - c0 - t.getTopInset()) {
                                break Label_0123;
                            }
                        }
                        else {
                            z = b2;
                            if ((a & 0x2) == 0x0) {
                                break Label_0123;
                            }
                            z = b2;
                            if (-n < i0.getBottom() - c0 - t.getTopInset()) {
                                break Label_0123;
                            }
                        }
                        z = true;
                    }
                }
                if (t.l()) {
                    z = t.z(this.h0(coordinatorLayout));
                }
                final boolean x = t.x(z);
                if (b || (x && this.z0(coordinatorLayout, t))) {
                    t.jumpDrawablesToCurrentState();
                }
            }
        }
        
        private void a0(final CoordinatorLayout coordinatorLayout, @j0 final T t, @j0 final View view) {
            if (this.U() != -t.getTotalScrollRange() && view.canScrollVertically(1)) {
                this.b0(coordinatorLayout, t, androidx.core.view.accessibility.d.a.r, false);
            }
            if (this.U() != 0) {
                if (view.canScrollVertically(-1)) {
                    final int n = -t.getDownNestedPreScrollRange();
                    if (n != 0) {
                        androidx.core.view.j0.s1((View)coordinatorLayout, androidx.core.view.accessibility.d.a.s, null, new androidx.core.view.accessibility.g() {
                            @Override
                            public boolean a(@j0 final View view, @k0 final a a) {
                                BaseBehavior.this.r0(coordinatorLayout, t, view, 0, n, new int[] { 0, 0 }, 1);
                                return true;
                            }
                        });
                    }
                }
                else {
                    this.b0(coordinatorLayout, t, androidx.core.view.accessibility.d.a.s, true);
                }
            }
        }
        
        private void b0(final CoordinatorLayout coordinatorLayout, @j0 final T t, @j0 final androidx.core.view.accessibility.d.a a, final boolean b) {
            androidx.core.view.j0.s1((View)coordinatorLayout, a, null, new androidx.core.view.accessibility.g() {
                @Override
                public boolean a(@j0 final View view, @k0 final a a) {
                    t.setExpanded(b);
                    return true;
                }
            });
        }
        
        private void c0(final CoordinatorLayout coordinatorLayout, @j0 final T t, final int n, float abs) {
            final int abs2 = Math.abs(this.U() - n);
            abs = Math.abs(abs);
            int n2;
            if (abs > 0.0f) {
                n2 = Math.round(abs2 / abs * 1000.0f) * 3;
            }
            else {
                n2 = (int)((abs2 / (float)t.getHeight() + 1.0f) * 150.0f);
            }
            this.d0(coordinatorLayout, t, n, n2);
        }
        
        private void d0(final CoordinatorLayout coordinatorLayout, final T t, final int n, final int a) {
            final int u = this.U();
            if (u == n) {
                final ValueAnimator n2 = this.n;
                if (n2 != null && n2.isRunning()) {
                    this.n.cancel();
                }
                return;
            }
            final ValueAnimator n3 = this.n;
            if (n3 == null) {
                (this.n = new ValueAnimator()).setInterpolator(com.google.android.material.animation.a.e);
                this.n.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new ValueAnimator$AnimatorUpdateListener() {
                    public void onAnimationUpdate(@j0 final ValueAnimator valueAnimator) {
                        BaseBehavior.this.X(coordinatorLayout, t, (int)valueAnimator.getAnimatedValue());
                    }
                });
            }
            else {
                n3.cancel();
            }
            this.n.setDuration((long)Math.min(a, 600));
            this.n.setIntValues(new int[] { u, n });
            this.n.start();
        }
        
        private boolean f0(@j0 final CoordinatorLayout coordinatorLayout, @j0 final T t, @j0 final View view) {
            return t.j() && coordinatorLayout.getHeight() - view.getHeight() <= t.getHeight();
        }
        
        private static boolean g0(final int n, final int n2) {
            return (n & n2) == n2;
        }
        
        @k0
        private View h0(@j0 final CoordinatorLayout coordinatorLayout) {
            for (int childCount = coordinatorLayout.getChildCount(), i = 0; i < childCount; ++i) {
                final View child = coordinatorLayout.getChildAt(i);
                if (child instanceof u || child instanceof ListView || child instanceof ScrollView) {
                    return child;
                }
            }
            return null;
        }
        
        @k0
        private static View i0(@j0 final AppBarLayout appBarLayout, int i) {
            final int abs = Math.abs(i);
            int childCount;
            View child;
            for (childCount = appBarLayout.getChildCount(), i = 0; i < childCount; ++i) {
                child = appBarLayout.getChildAt(i);
                if (abs >= child.getTop() && abs <= child.getBottom()) {
                    return child;
                }
            }
            return null;
        }
        
        private int j0(@j0 final T t, final int n) {
            for (int childCount = t.getChildCount(), i = 0; i < childCount; ++i) {
                final View child = t.getChildAt(i);
                final int top = child.getTop();
                final int bottom = child.getBottom();
                final AppBarLayout.d d = (AppBarLayout.d)child.getLayoutParams();
                int n2 = top;
                int n3 = bottom;
                if (g0(d.a(), 32)) {
                    n2 = top - d.topMargin;
                    n3 = bottom + d.bottomMargin;
                }
                final int n4 = -n;
                if (n2 <= n4 && n3 >= n4) {
                    return i;
                }
            }
            return -1;
        }
        
        private int m0(@j0 final T t, final int n) {
            final int abs = Math.abs(n);
            final int childCount = t.getChildCount();
            final int n2 = 0;
            int i = 0;
            while (i < childCount) {
                final View child = t.getChildAt(i);
                final AppBarLayout.d d = (AppBarLayout.d)child.getLayoutParams();
                final Interpolator b = d.b();
                if (abs >= child.getTop() && abs <= child.getBottom()) {
                    if (b == null) {
                        break;
                    }
                    final int a = d.a();
                    int n3 = n2;
                    if ((a & 0x1) != 0x0) {
                        final int n4 = n3 = 0 + (child.getHeight() + d.topMargin + d.bottomMargin);
                        if ((a & 0x2) != 0x0) {
                            n3 = n4 - androidx.core.view.j0.c0(child);
                        }
                    }
                    int n5 = n3;
                    if (androidx.core.view.j0.S(child)) {
                        n5 = n3 - t.getTopInset();
                    }
                    if (n5 > 0) {
                        final int top = child.getTop();
                        final float n6 = (float)n5;
                        return Integer.signum(n) * (child.getTop() + Math.round(n6 * b.getInterpolation((abs - top) / n6)));
                    }
                    break;
                }
                else {
                    ++i;
                }
            }
            return n;
        }
        
        private boolean z0(@j0 final CoordinatorLayout coordinatorLayout, @j0 final T t) {
            final List<View> x = coordinatorLayout.x((View)t);
            final int size = x.size();
            boolean b = false;
            for (int i = 0; i < size; ++i) {
                final CoordinatorLayout.c f = ((g)x.get(i).getLayoutParams()).f();
                if (f instanceof ScrollingViewBehavior) {
                    if (((ScrollingViewBehavior)f).S() != 0) {
                        b = true;
                    }
                    return b;
                }
            }
            return false;
        }
        
        @Override
        int U() {
            return this.H() + this.l;
        }
        
        boolean e0(final T t) {
            final d s = this.s;
            if (s != null) {
                return s.a(t);
            }
            final WeakReference<View> r = this.r;
            boolean b = true;
            if (r != null) {
                final View view = r.get();
                b = (view != null && view.isShown() && !view.canScrollVertically(-1) && b);
            }
            return b;
        }
        
        int k0(@j0 final T t) {
            return -t.getDownNestedScrollRange();
        }
        
        int l0(@j0 final T t) {
            return t.getTotalScrollRange();
        }
        
        @b1
        boolean n0() {
            final ValueAnimator n = this.n;
            return n != null && n.isRunning();
        }
        
        void o0(@j0 final CoordinatorLayout coordinatorLayout, @j0 final T t) {
            this.A0(coordinatorLayout, t);
            if (t.l()) {
                t.x(t.z(this.h0(coordinatorLayout)));
            }
        }
        
        public boolean p0(@j0 final CoordinatorLayout coordinatorLayout, @j0 final T t, int n) {
            final boolean m = super.m(coordinatorLayout, t, n);
            final int pendingAction = t.getPendingAction();
            n = this.o;
            if (n >= 0 && (pendingAction & 0x8) == 0x0) {
                final View child = t.getChildAt(n);
                final int n2 = -child.getBottom();
                if (this.p) {
                    n = androidx.core.view.j0.c0(child) + t.getTopInset();
                }
                else {
                    n = Math.round(child.getHeight() * this.q);
                }
                this.X(coordinatorLayout, t, n2 + n);
            }
            else if (pendingAction != 0) {
                if ((pendingAction & 0x4) != 0x0) {
                    n = 1;
                }
                else {
                    n = 0;
                }
                if ((pendingAction & 0x2) != 0x0) {
                    final int n3 = -t.getUpNestedPreScrollRange();
                    if (n != 0) {
                        this.c0(coordinatorLayout, t, n3, 0.0f);
                    }
                    else {
                        this.X(coordinatorLayout, t, n3);
                    }
                }
                else if ((pendingAction & 0x1) != 0x0) {
                    if (n != 0) {
                        this.c0(coordinatorLayout, t, 0, 0.0f);
                    }
                    else {
                        this.X(coordinatorLayout, t, 0);
                    }
                }
            }
            t.r();
            this.o = -1;
            this.N(q.a.c(this.H(), -t.getTotalScrollRange(), 0));
            this.C0(coordinatorLayout, t, this.H(), 0, true);
            t.n(this.H());
            this.B0(coordinatorLayout, t);
            return m;
        }
        
        public boolean q0(@j0 final CoordinatorLayout coordinatorLayout, @j0 final T t, final int n, final int n2, final int n3, final int n4) {
            if (((g)t.getLayoutParams()).height == -2) {
                coordinatorLayout.O((View)t, n, n2, View$MeasureSpec.makeMeasureSpec(0, 0), n4);
                return true;
            }
            return super.n(coordinatorLayout, t, n, n2, n3, n4);
        }
        
        public void r0(final CoordinatorLayout coordinatorLayout, @j0 final T t, final View view, int n, final int n2, final int[] array, int n3) {
            if (n2 != 0) {
                if (n2 < 0) {
                    n3 = -t.getTotalScrollRange();
                    final int downNestedPreScrollRange = t.getDownNestedPreScrollRange();
                    n = n3;
                    n3 += downNestedPreScrollRange;
                }
                else {
                    n = -t.getUpNestedPreScrollRange();
                    n3 = 0;
                }
                if (n != n3) {
                    array[1] = this.W(coordinatorLayout, t, n2, n, n3);
                }
            }
            if (t.l()) {
                t.x(t.z(view));
            }
        }
        
        public void s0(final CoordinatorLayout coordinatorLayout, @j0 final T t, final View view, final int n, final int n2, final int n3, final int n4, final int n5, final int[] array) {
            if (n4 < 0) {
                array[1] = this.W(coordinatorLayout, t, n4, -t.getDownNestedScrollRange(), 0);
            }
            if (n4 == 0) {
                this.B0(coordinatorLayout, t);
            }
        }
        
        public void t0(@j0 final CoordinatorLayout coordinatorLayout, @j0 final T t, final Parcelable parcelable) {
            if (parcelable instanceof e) {
                final e e = (e)parcelable;
                super.y(coordinatorLayout, t, e.a());
                this.o = e.I;
                this.q = e.J;
                this.p = e.K;
            }
            else {
                super.y(coordinatorLayout, t, parcelable);
                this.o = -1;
            }
        }
        
        public Parcelable u0(@j0 final CoordinatorLayout coordinatorLayout, @j0 final T t) {
            final Parcelable z = super.z(coordinatorLayout, t);
            final int h = this.H();
            final int childCount = t.getChildCount();
            boolean k = false;
            for (int i = 0; i < childCount; ++i) {
                final View child = t.getChildAt(i);
                final int n = child.getBottom() + h;
                if (child.getTop() + h <= 0 && n >= 0) {
                    final e e = new e(z);
                    e.I = i;
                    if (n == androidx.core.view.j0.c0(child) + t.getTopInset()) {
                        k = true;
                    }
                    e.K = k;
                    e.J = n / (float)child.getHeight();
                    return (Parcelable)e;
                }
            }
            return z;
        }
        
        public boolean v0(@j0 final CoordinatorLayout coordinatorLayout, @j0 final T t, @j0 final View view, final View view2, final int n, final int m) {
            final boolean b = (n & 0x2) != 0x0 && (t.l() || this.f0(coordinatorLayout, t, view));
            if (b) {
                final ValueAnimator n2 = this.n;
                if (n2 != null) {
                    n2.cancel();
                }
            }
            this.r = null;
            this.m = m;
            return b;
        }
        
        public void w0(final CoordinatorLayout coordinatorLayout, @j0 final T t, final View referent, final int n) {
            if (this.m == 0 || n == 1) {
                this.A0(coordinatorLayout, t);
                if (t.l()) {
                    t.x(t.z(referent));
                }
            }
            this.r = new WeakReference<View>(referent);
        }
        
        public void x0(@k0 final d s) {
            this.s = s;
        }
        
        int y0(@j0 final CoordinatorLayout coordinatorLayout, @j0 final T t, int m0, int c, int n) {
            final int u = this.U();
            final int n2 = 0;
            if (c != 0 && u >= c && u <= n) {
                c = q.a.c(m0, c, n);
                m0 = n2;
                if (u != c) {
                    if (t.h()) {
                        m0 = this.m0(t, c);
                    }
                    else {
                        m0 = c;
                    }
                    final boolean n3 = this.N(m0);
                    n = u - c;
                    this.l = c - m0;
                    if (!n3 && t.h()) {
                        coordinatorLayout.j((View)t);
                    }
                    t.n(this.H());
                    if (c < u) {
                        m0 = -1;
                    }
                    else {
                        m0 = 1;
                    }
                    this.C0(coordinatorLayout, t, c, m0, false);
                    m0 = n;
                }
            }
            else {
                this.l = 0;
                m0 = n2;
            }
            this.B0(coordinatorLayout, t);
            return m0;
        }
        
        public abstract static class d<T extends AppBarLayout>
        {
            public abstract boolean a(@j0 final T p0);
        }
        
        protected static class e extends androidx.customview.view.a
        {
            public static final Parcelable$Creator<e> CREATOR;
            int I;
            float J;
            boolean K;
            
            static {
                CREATOR = (Parcelable$Creator)new Parcelable$ClassLoaderCreator<e>() {
                    @k0
                    public e a(@j0 final Parcel parcel) {
                        return new e(parcel, null);
                    }
                    
                    @j0
                    public e b(@j0 final Parcel parcel, final ClassLoader classLoader) {
                        return new e(parcel, classLoader);
                    }
                    
                    @j0
                    public e[] c(final int n) {
                        return new e[n];
                    }
                };
            }
            
            public e(@j0 final Parcel parcel, final ClassLoader classLoader) {
                super(parcel, classLoader);
                this.I = parcel.readInt();
                this.J = parcel.readFloat();
                this.K = (parcel.readByte() != 0);
            }
            
            public e(final Parcelable parcelable) {
                super(parcelable);
            }
            
            @Override
            public void writeToParcel(@j0 final Parcel parcel, final int n) {
                super.writeToParcel(parcel, n);
                parcel.writeInt(this.I);
                parcel.writeFloat(this.J);
                parcel.writeByte((byte)(byte)(this.K ? 1 : 0));
            }
        }
    }
    
    public static class Behavior extends BaseBehavior<AppBarLayout>
    {
        public Behavior() {
        }
        
        public Behavior(final Context context, final AttributeSet set) {
            super(context, set);
        }
        
        public abstract static class a extends BaseBehavior.d<AppBarLayout>
        {
        }
    }
    
    public static class ScrollingViewBehavior extends c
    {
        public ScrollingViewBehavior() {
        }
        
        public ScrollingViewBehavior(final Context context, final AttributeSet set) {
            super(context, set);
            final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, a.o.qp);
            this.W(obtainStyledAttributes.getDimensionPixelSize(a.o.rp, 0));
            obtainStyledAttributes.recycle();
        }
        
        private static int Z(@j0 final AppBarLayout appBarLayout) {
            final CoordinatorLayout.c f = ((g)appBarLayout.getLayoutParams()).f();
            if (f instanceof BaseBehavior) {
                return ((BaseBehavior)f).U();
            }
            return 0;
        }
        
        private void a0(@j0 final View view, @j0 final View view2) {
            final CoordinatorLayout.c f = ((g)view2.getLayoutParams()).f();
            if (f instanceof BaseBehavior) {
                androidx.core.view.j0.d1(view, view2.getBottom() - view.getTop() + ((BaseBehavior<AppBarLayout>)f).l + this.U() - this.Q(view2));
            }
        }
        
        private void b0(final View view, final View view2) {
            if (view2 instanceof AppBarLayout) {
                final AppBarLayout appBarLayout = (AppBarLayout)view2;
                if (appBarLayout.l()) {
                    appBarLayout.x(appBarLayout.z(view));
                }
            }
        }
        
        @Override
        float R(final View view) {
            if (view instanceof AppBarLayout) {
                final AppBarLayout appBarLayout = (AppBarLayout)view;
                final int totalScrollRange = appBarLayout.getTotalScrollRange();
                final int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                final int z = Z(appBarLayout);
                if (downNestedPreScrollRange != 0 && totalScrollRange + z <= downNestedPreScrollRange) {
                    return 0.0f;
                }
                final int n = totalScrollRange - downNestedPreScrollRange;
                if (n != 0) {
                    return z / (float)n + 1.0f;
                }
            }
            return 0.0f;
        }
        
        @Override
        int T(final View view) {
            if (view instanceof AppBarLayout) {
                return ((AppBarLayout)view).getTotalScrollRange();
            }
            return super.T(view);
        }
        
        @k0
        AppBarLayout Y(@j0 final List<View> list) {
            for (int size = list.size(), i = 0; i < size; ++i) {
                final View view = list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout)view;
                }
            }
            return null;
        }
        
        @Override
        public boolean f(final CoordinatorLayout coordinatorLayout, final View view, final View view2) {
            return view2 instanceof AppBarLayout;
        }
        
        @Override
        public boolean i(@j0 final CoordinatorLayout coordinatorLayout, @j0 final View view, @j0 final View view2) {
            this.a0(view, view2);
            this.b0(view, view2);
            return false;
        }
        
        @Override
        public void j(@j0 final CoordinatorLayout coordinatorLayout, @j0 final View view, @j0 final View view2) {
            if (view2 instanceof AppBarLayout) {
                androidx.core.view.j0.p1((View)coordinatorLayout, d.a.r.b());
                androidx.core.view.j0.p1((View)coordinatorLayout, d.a.s.b());
            }
        }
        
        @Override
        public boolean x(@j0 final CoordinatorLayout coordinatorLayout, @j0 final View view, @j0 final Rect rect, final boolean b) {
            final AppBarLayout y = this.Y(coordinatorLayout.w(view));
            if (y != null) {
                rect.offset(view.getLeft(), view.getTop());
                final Rect d = super.d;
                d.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!d.contains(rect)) {
                    y.s(false, b ^ true);
                    return true;
                }
            }
            return false;
        }
    }
    
    public interface c<T extends AppBarLayout>
    {
        void a(final T p0, final int p1);
    }
    
    public static class d extends LinearLayout$LayoutParams
    {
        public static final int c = 0;
        public static final int d = 1;
        public static final int e = 2;
        public static final int f = 4;
        public static final int g = 8;
        public static final int h = 16;
        public static final int i = 32;
        static final int j = 5;
        static final int k = 17;
        static final int l = 10;
        int a;
        Interpolator b;
        
        public d(final int n, final int n2) {
            super(n, n2);
            this.a = 1;
        }
        
        public d(final int n, final int n2, final float n3) {
            super(n, n2, n3);
            this.a = 1;
        }
        
        public d(final Context context, final AttributeSet set) {
            super(context, set);
            this.a = 1;
            final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, o2.a.o.F0);
            this.a = obtainStyledAttributes.getInt(o2.a.o.G0, 0);
            final int h0 = o2.a.o.H0;
            if (obtainStyledAttributes.hasValue(h0)) {
                this.b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(h0, 0));
            }
            obtainStyledAttributes.recycle();
        }
        
        public d(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
            super(viewGroup$LayoutParams);
            this.a = 1;
        }
        
        public d(final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams) {
            super(viewGroup$MarginLayoutParams);
            this.a = 1;
        }
        
        @p0(19)
        public d(final LinearLayout$LayoutParams linearLayout$LayoutParams) {
            super(linearLayout$LayoutParams);
            this.a = 1;
        }
        
        @p0(19)
        public d(@j0 final d d) {
            super((LinearLayout$LayoutParams)d);
            this.a = 1;
            this.a = d.a;
            this.b = d.b;
        }
        
        public int a() {
            return this.a;
        }
        
        public Interpolator b() {
            return this.b;
        }
        
        boolean c() {
            final int a = this.a;
            boolean b = true;
            if ((a & 0x1) != 0x1 || (a & 0xA) == 0x0) {
                b = false;
            }
            return b;
        }
        
        public void d(final int a) {
            this.a = a;
        }
        
        public void e(final Interpolator b) {
            this.b = b;
        }
        
        @Retention(RetentionPolicy.SOURCE)
        @t0({ t0.a.H })
        public @interface a {
        }
    }
    
    public interface e extends c<AppBarLayout>
    {
        void a(final AppBarLayout p0, final int p1);
    }
}
