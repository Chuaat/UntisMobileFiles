// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.widget;

import android.os.Parcel;
import android.os.Parcelable$ClassLoaderCreator;
import android.os.Parcelable$Creator;
import androidx.appcompat.view.menu.o;
import android.view.ViewParent;
import androidx.annotation.h0;
import androidx.annotation.l;
import android.text.TextUtils$TruncateAt;
import android.view.ContextThemeWrapper;
import androidx.annotation.s;
import androidx.annotation.w0;
import android.os.Build$VERSION;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.Menu;
import android.view.View$OnClickListener;
import androidx.appcompat.view.menu.j;
import androidx.annotation.x0;
import androidx.annotation.t0;
import android.text.Layout;
import android.view.MenuInflater;
import android.view.ViewGroup$LayoutParams;
import androidx.core.view.i;
import java.util.List;
import android.view.View$MeasureSpec;
import android.view.ViewGroup$MarginLayoutParams;
import android.text.TextUtils;
import android.view.MenuItem;
import c.a;
import androidx.annotation.k0;
import android.util.AttributeSet;
import androidx.annotation.j0;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.n;
import java.util.ArrayList;
import android.content.res.ColorStateList;
import android.content.Context;
import android.view.View;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.ImageButton;
import android.widget.TextView;
import android.view.ViewGroup;

public class Toolbar extends ViewGroup
{
    private static final String y0 = "Toolbar";
    private ActionMenuView G;
    private TextView H;
    private TextView I;
    private ImageButton J;
    private ImageView K;
    private Drawable L;
    private CharSequence M;
    ImageButton N;
    View O;
    private Context P;
    private int Q;
    private int R;
    private int S;
    int T;
    private int U;
    private int V;
    private int W;
    private int a0;
    private int b0;
    private l0 c0;
    private int d0;
    private int e0;
    private int f0;
    private CharSequence g0;
    private CharSequence h0;
    private ColorStateList i0;
    private ColorStateList j0;
    private boolean k0;
    private boolean l0;
    private final ArrayList<View> m0;
    private final ArrayList<View> n0;
    private final int[] o0;
    f p0;
    private final ActionMenuView.e q0;
    private v0 r0;
    private c s0;
    private d t0;
    private n.a u0;
    private androidx.appcompat.view.menu.g.a v0;
    private boolean w0;
    private final Runnable x0;
    
    public Toolbar(@j0 final Context context) {
        this(context, null);
    }
    
    public Toolbar(@j0 final Context context, @k0 final AttributeSet set) {
        this(context, set, a.c.b4);
    }
    
    public Toolbar(@j0 final Context context, @k0 final AttributeSet set, int n) {
        super(context, set, n);
        this.f0 = 8388627;
        this.m0 = new ArrayList<View>();
        this.n0 = new ArrayList<View>();
        this.o0 = new int[2];
        this.q0 = new ActionMenuView.e() {
            @Override
            public boolean onMenuItemClick(final MenuItem menuItem) {
                final f p = Toolbar.this.p0;
                return p != null && p.onMenuItemClick(menuItem);
            }
        };
        this.x0 = new Runnable() {
            @Override
            public void run() {
                Toolbar.this.R();
            }
        };
        final Context context2 = this.getContext();
        final int[] q7 = a.n.q7;
        final u0 g = androidx.appcompat.widget.u0.G(context2, set, q7, n, 0);
        androidx.core.view.j0.x1((View)this, context, q7, set, g.B(), n, 0);
        this.R = g.u(a.n.T7, 0);
        this.S = g.u(a.n.K7, 0);
        this.f0 = g.p(a.n.r7, this.f0);
        this.T = g.p(a.n.t7, 48);
        final int f = g.f(a.n.N7, 0);
        final int s7 = a.n.S7;
        n = f;
        if (g.C(s7)) {
            n = g.f(s7, f);
        }
        this.b0 = n;
        this.a0 = n;
        this.W = n;
        this.V = n;
        n = g.f(a.n.Q7, -1);
        if (n >= 0) {
            this.V = n;
        }
        n = g.f(a.n.P7, -1);
        if (n >= 0) {
            this.W = n;
        }
        n = g.f(a.n.R7, -1);
        if (n >= 0) {
            this.a0 = n;
        }
        n = g.f(a.n.O7, -1);
        if (n >= 0) {
            this.b0 = n;
        }
        this.U = g.g(a.n.E7, -1);
        final int f2 = g.f(a.n.A7, Integer.MIN_VALUE);
        final int f3 = g.f(a.n.w7, Integer.MIN_VALUE);
        final int g2 = g.g(a.n.y7, 0);
        n = g.g(a.n.z7, 0);
        this.h();
        this.c0.e(g2, n);
        if (f2 != Integer.MIN_VALUE || f3 != Integer.MIN_VALUE) {
            this.c0.g(f2, f3);
        }
        this.d0 = g.f(a.n.B7, Integer.MIN_VALUE);
        this.e0 = g.f(a.n.x7, Integer.MIN_VALUE);
        this.L = g.h(a.n.v7);
        this.M = g.x(a.n.u7);
        final CharSequence x = g.x(a.n.M7);
        if (!TextUtils.isEmpty(x)) {
            this.setTitle(x);
        }
        final CharSequence x2 = g.x(a.n.J7);
        if (!TextUtils.isEmpty(x2)) {
            this.setSubtitle(x2);
        }
        this.P = this.getContext();
        this.setPopupTheme(g.u(a.n.I7, 0));
        final Drawable h = g.h(a.n.H7);
        if (h != null) {
            this.setNavigationIcon(h);
        }
        final CharSequence x3 = g.x(a.n.G7);
        if (!TextUtils.isEmpty(x3)) {
            this.setNavigationContentDescription(x3);
        }
        final Drawable h2 = g.h(a.n.C7);
        if (h2 != null) {
            this.setLogo(h2);
        }
        final CharSequence x4 = g.x(a.n.D7);
        if (!TextUtils.isEmpty(x4)) {
            this.setLogoDescription(x4);
        }
        n = a.n.U7;
        if (g.C(n)) {
            this.setTitleTextColor(g.d(n));
        }
        n = a.n.L7;
        if (g.C(n)) {
            this.setSubtitleTextColor(g.d(n));
        }
        n = a.n.F7;
        if (g.C(n)) {
            this.x(g.u(n, 0));
        }
        g.I();
    }
    
    private int C(final View view, int n, final int[] array, int q) {
        final e e = (e)view.getLayoutParams();
        final int b = e.leftMargin - array[0];
        n += Math.max(0, b);
        array[0] = Math.max(0, -b);
        q = this.q(view, q);
        final int measuredWidth = view.getMeasuredWidth();
        view.layout(n, q, n + measuredWidth, view.getMeasuredHeight() + q);
        return n + (measuredWidth + e.rightMargin);
    }
    
    private int D(final View view, int n, final int[] array, int measuredWidth) {
        final e e = (e)view.getLayoutParams();
        final int b = e.rightMargin - array[1];
        n -= Math.max(0, b);
        array[1] = Math.max(0, -b);
        final int q = this.q(view, measuredWidth);
        measuredWidth = view.getMeasuredWidth();
        view.layout(n - measuredWidth, q, n, view.getMeasuredHeight() + q);
        return n - (measuredWidth + e.leftMargin);
    }
    
    private int E(final View view, final int n, final int n2, final int n3, final int n4, final int[] array) {
        final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)view.getLayoutParams();
        final int b = viewGroup$MarginLayoutParams.leftMargin - array[0];
        final int b2 = viewGroup$MarginLayoutParams.rightMargin - array[1];
        final int n5 = Math.max(0, b) + Math.max(0, b2);
        array[0] = Math.max(0, -b);
        array[1] = Math.max(0, -b2);
        view.measure(ViewGroup.getChildMeasureSpec(n, this.getPaddingLeft() + this.getPaddingRight() + n5 + n2, viewGroup$MarginLayoutParams.width), ViewGroup.getChildMeasureSpec(n3, this.getPaddingTop() + this.getPaddingBottom() + viewGroup$MarginLayoutParams.topMargin + viewGroup$MarginLayoutParams.bottomMargin + n4, viewGroup$MarginLayoutParams.height));
        return view.getMeasuredWidth() + n5;
    }
    
    private void F(final View view, int n, int childMeasureSpec, int mode, final int n2, final int b) {
        final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)view.getLayoutParams();
        final int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(n, this.getPaddingLeft() + this.getPaddingRight() + viewGroup$MarginLayoutParams.leftMargin + viewGroup$MarginLayoutParams.rightMargin + childMeasureSpec, viewGroup$MarginLayoutParams.width);
        childMeasureSpec = ViewGroup.getChildMeasureSpec(mode, this.getPaddingTop() + this.getPaddingBottom() + viewGroup$MarginLayoutParams.topMargin + viewGroup$MarginLayoutParams.bottomMargin + n2, viewGroup$MarginLayoutParams.height);
        mode = View$MeasureSpec.getMode(childMeasureSpec);
        n = childMeasureSpec;
        if (mode != 1073741824) {
            n = childMeasureSpec;
            if (b >= 0) {
                n = b;
                if (mode != 0) {
                    n = Math.min(View$MeasureSpec.getSize(childMeasureSpec), b);
                }
                n = View$MeasureSpec.makeMeasureSpec(n, 1073741824);
            }
        }
        view.measure(childMeasureSpec2, n);
    }
    
    private void G() {
        this.removeCallbacks(this.x0);
        this.post(this.x0);
    }
    
    private boolean P() {
        if (!this.w0) {
            return false;
        }
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = this.getChildAt(i);
            if (this.Q(child) && child.getMeasuredWidth() > 0 && child.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }
    
    private boolean Q(final View view) {
        return view != null && view.getParent() == this && view.getVisibility() != 8;
    }
    
    private void b(final List<View> list, int i) {
        final int x = androidx.core.view.j0.X((View)this);
        final int n = 0;
        final boolean b = x == 1;
        final int childCount = this.getChildCount();
        final int d = i.d(i, androidx.core.view.j0.X((View)this));
        list.clear();
        i = n;
        if (b) {
            View child;
            e e;
            for (i = childCount - 1; i >= 0; --i) {
                child = this.getChildAt(i);
                e = (e)child.getLayoutParams();
                if (e.b == 0 && this.Q(child) && this.p(e.a) == d) {
                    list.add(child);
                }
            }
        }
        else {
            while (i < childCount) {
                final View child2 = this.getChildAt(i);
                final e e2 = (e)child2.getLayoutParams();
                if (e2.b == 0 && this.Q(child2) && this.p(e2.a) == d) {
                    list.add(child2);
                }
                ++i;
            }
        }
    }
    
    private void c(final View e, final boolean b) {
        final ViewGroup$LayoutParams layoutParams = e.getLayoutParams();
        e layoutParams2;
        if (layoutParams == null) {
            layoutParams2 = this.m();
        }
        else if (!this.checkLayoutParams(layoutParams)) {
            layoutParams2 = this.o(layoutParams);
        }
        else {
            layoutParams2 = (e)layoutParams;
        }
        layoutParams2.b = 1;
        if (b && this.O != null) {
            e.setLayoutParams((ViewGroup$LayoutParams)layoutParams2);
            this.n0.add(e);
        }
        else {
            this.addView(e, (ViewGroup$LayoutParams)layoutParams2);
        }
    }
    
    private MenuInflater getMenuInflater() {
        return new androidx.appcompat.view.g(this.getContext());
    }
    
    private void h() {
        if (this.c0 == null) {
            this.c0 = new l0();
        }
    }
    
    private void i() {
        if (this.K == null) {
            this.K = new AppCompatImageView(this.getContext());
        }
    }
    
    private void j() {
        this.k();
        if (this.G.R() == null) {
            final androidx.appcompat.view.menu.g g = (androidx.appcompat.view.menu.g)this.G.getMenu();
            if (this.t0 == null) {
                this.t0 = new d();
            }
            this.G.setExpandedActionViewsExclusive(true);
            g.c(this.t0, this.P);
        }
    }
    
    private void k() {
        if (this.G == null) {
            (this.G = new ActionMenuView(this.getContext())).setPopupTheme(this.Q);
            this.G.setOnMenuItemClickListener(this.q0);
            this.G.S(this.u0, this.v0);
            final e m = this.m();
            m.a = (0x800005 | (this.T & 0x70));
            this.G.setLayoutParams((ViewGroup$LayoutParams)m);
            this.c((View)this.G, false);
        }
    }
    
    private void l() {
        if (this.J == null) {
            this.J = new AppCompatImageButton(this.getContext(), null, a.c.a4);
            final e m = this.m();
            m.a = (0x800003 | (this.T & 0x70));
            this.J.setLayoutParams((ViewGroup$LayoutParams)m);
        }
    }
    
    private int p(int n) {
        final int x = androidx.core.view.j0.X((View)this);
        final int n2 = i.d(n, x) & 0x7;
        if (n2 != 1) {
            n = 3;
            if (n2 != 3 && n2 != 5) {
                if (x == 1) {
                    n = 5;
                }
                return n;
            }
        }
        return n2;
    }
    
    private int q(final View view, int n) {
        final e e = (e)view.getLayoutParams();
        final int measuredHeight = view.getMeasuredHeight();
        if (n > 0) {
            n = (measuredHeight - n) / 2;
        }
        else {
            n = 0;
        }
        final int r = this.r(e.a);
        if (r == 48) {
            return this.getPaddingTop() - n;
        }
        if (r != 80) {
            final int paddingTop = this.getPaddingTop();
            final int paddingBottom = this.getPaddingBottom();
            final int height = this.getHeight();
            final int n2 = (height - paddingTop - paddingBottom - measuredHeight) / 2;
            n = e.topMargin;
            if (n2 >= n) {
                final int n3 = height - paddingBottom - measuredHeight - n2 - paddingTop;
                final int bottomMargin = e.bottomMargin;
                n = n2;
                if (n3 < bottomMargin) {
                    n = Math.max(0, n2 - (bottomMargin - n3));
                }
            }
            return paddingTop + n;
        }
        return this.getHeight() - this.getPaddingBottom() - measuredHeight - e.bottomMargin - n;
    }
    
    private int r(int n) {
        final int n2 = n &= 0x70;
        if (n2 != 16 && (n = n2) != 48 && (n = n2) != 80) {
            n = (this.f0 & 0x70);
        }
        return n;
    }
    
    private int s(final View view) {
        final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)view.getLayoutParams();
        return androidx.core.view.n.c(viewGroup$MarginLayoutParams) + androidx.core.view.n.b(viewGroup$MarginLayoutParams);
    }
    
    private int t(final View view) {
        final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)view.getLayoutParams();
        return viewGroup$MarginLayoutParams.topMargin + viewGroup$MarginLayoutParams.bottomMargin;
    }
    
    private int u(final List<View> list, final int[] array) {
        int max = array[0];
        int max2 = array[1];
        final int size = list.size();
        int i = 0;
        int n = 0;
        while (i < size) {
            final View view = list.get(i);
            final e e = (e)view.getLayoutParams();
            final int b = e.leftMargin - max;
            final int b2 = e.rightMargin - max2;
            final int max3 = Math.max(0, b);
            final int max4 = Math.max(0, b2);
            max = Math.max(0, -b);
            max2 = Math.max(0, -b2);
            n += max3 + view.getMeasuredWidth() + max4;
            ++i;
        }
        return n;
    }
    
    private boolean y(final View o) {
        return o.getParent() == this || this.n0.contains(o);
    }
    
    public boolean A() {
        final ActionMenuView g = this.G;
        return g != null && g.N();
    }
    
    @t0({ androidx.annotation.t0.a.I })
    public boolean B() {
        final TextView h = this.H;
        if (h == null) {
            return false;
        }
        final Layout layout = h.getLayout();
        if (layout == null) {
            return false;
        }
        for (int lineCount = layout.getLineCount(), i = 0; i < lineCount; ++i) {
            if (layout.getEllipsisCount(i) > 0) {
                return true;
            }
        }
        return false;
    }
    
    void H() {
        for (int i = this.getChildCount() - 1; i >= 0; --i) {
            final View child = this.getChildAt(i);
            if (((e)child.getLayoutParams()).b != 2 && child != this.G) {
                this.removeViewAt(i);
                this.n0.add(child);
            }
        }
    }
    
    public void I(final int n, final int n2) {
        this.h();
        this.c0.e(n, n2);
    }
    
    public void J(final int n, final int n2) {
        this.h();
        this.c0.g(n, n2);
    }
    
    @t0({ androidx.annotation.t0.a.G })
    public void K(final androidx.appcompat.view.menu.g g, final c c) {
        if (g == null && this.G == null) {
            return;
        }
        this.k();
        final androidx.appcompat.view.menu.g r = this.G.R();
        if (r == g) {
            return;
        }
        if (r != null) {
            r.S(this.s0);
            r.S(this.t0);
        }
        if (this.t0 == null) {
            this.t0 = new d();
        }
        c.L(true);
        if (g != null) {
            g.c(c, this.P);
            g.c(this.t0, this.P);
        }
        else {
            c.j(this.P, null);
            this.t0.j(this.P, null);
            c.e(true);
            this.t0.e(true);
        }
        this.G.setPopupTheme(this.Q);
        this.G.setPresenter(c);
        this.s0 = c;
    }
    
    @t0({ androidx.annotation.t0.a.I })
    public void L(final n.a u0, final androidx.appcompat.view.menu.g.a v0) {
        this.u0 = u0;
        this.v0 = v0;
        final ActionMenuView g = this.G;
        if (g != null) {
            g.S(u0, v0);
        }
    }
    
    public void M(final Context context, @x0 final int s) {
        this.S = s;
        final TextView i = this.I;
        if (i != null) {
            i.setTextAppearance(context, s);
        }
    }
    
    public void N(final int v, final int a0, final int w, final int b0) {
        this.V = v;
        this.a0 = a0;
        this.W = w;
        this.b0 = b0;
        this.requestLayout();
    }
    
    public void O(final Context context, @x0 final int r) {
        this.R = r;
        final TextView h = this.H;
        if (h != null) {
            h.setTextAppearance(context, r);
        }
    }
    
    public boolean R() {
        final ActionMenuView g = this.G;
        return g != null && g.T();
    }
    
    void a() {
        for (int i = this.n0.size() - 1; i >= 0; --i) {
            this.addView((View)this.n0.get(i));
        }
        this.n0.clear();
    }
    
    protected boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return super.checkLayoutParams(viewGroup$LayoutParams) && viewGroup$LayoutParams instanceof e;
    }
    
    @t0({ androidx.annotation.t0.a.I })
    public boolean d() {
        if (this.getVisibility() == 0) {
            final ActionMenuView g = this.G;
            if (g != null && g.O()) {
                return true;
            }
        }
        return false;
    }
    
    public void e() {
        final d t0 = this.t0;
        j h;
        if (t0 == null) {
            h = null;
        }
        else {
            h = t0.H;
        }
        if (h != null) {
            h.collapseActionView();
        }
    }
    
    public void f() {
        final ActionMenuView g = this.G;
        if (g != null) {
            g.F();
        }
    }
    
    void g() {
        if (this.N == null) {
            (this.N = new AppCompatImageButton(this.getContext(), null, a.c.a4)).setImageDrawable(this.L);
            this.N.setContentDescription(this.M);
            final e m = this.m();
            m.a = (0x800003 | (this.T & 0x70));
            m.b = 2;
            this.N.setLayoutParams((ViewGroup$LayoutParams)m);
            this.N.setOnClickListener((View$OnClickListener)new View$OnClickListener() {
                public void onClick(final View view) {
                    Toolbar.this.e();
                }
            });
        }
    }
    
    @k0
    public CharSequence getCollapseContentDescription() {
        final ImageButton n = this.N;
        CharSequence contentDescription;
        if (n != null) {
            contentDescription = n.getContentDescription();
        }
        else {
            contentDescription = null;
        }
        return contentDescription;
    }
    
    @k0
    public Drawable getCollapseIcon() {
        final ImageButton n = this.N;
        Drawable drawable;
        if (n != null) {
            drawable = n.getDrawable();
        }
        else {
            drawable = null;
        }
        return drawable;
    }
    
    public int getContentInsetEnd() {
        final l0 c0 = this.c0;
        int a;
        if (c0 != null) {
            a = c0.a();
        }
        else {
            a = 0;
        }
        return a;
    }
    
    public int getContentInsetEndWithActions() {
        int n = this.e0;
        if (n == Integer.MIN_VALUE) {
            n = this.getContentInsetEnd();
        }
        return n;
    }
    
    public int getContentInsetLeft() {
        final l0 c0 = this.c0;
        int b;
        if (c0 != null) {
            b = c0.b();
        }
        else {
            b = 0;
        }
        return b;
    }
    
    public int getContentInsetRight() {
        final l0 c0 = this.c0;
        int c2;
        if (c0 != null) {
            c2 = c0.c();
        }
        else {
            c2 = 0;
        }
        return c2;
    }
    
    public int getContentInsetStart() {
        final l0 c0 = this.c0;
        int d;
        if (c0 != null) {
            d = c0.d();
        }
        else {
            d = 0;
        }
        return d;
    }
    
    public int getContentInsetStartWithNavigation() {
        int n = this.d0;
        if (n == Integer.MIN_VALUE) {
            n = this.getContentInsetStart();
        }
        return n;
    }
    
    public int getCurrentContentInsetEnd() {
        final ActionMenuView g = this.G;
        boolean b = false;
        Label_0032: {
            if (g != null) {
                final androidx.appcompat.view.menu.g r = g.R();
                if (r != null && r.hasVisibleItems()) {
                    b = true;
                    break Label_0032;
                }
            }
            b = false;
        }
        int n;
        if (b) {
            n = Math.max(this.getContentInsetEnd(), Math.max(this.e0, 0));
        }
        else {
            n = this.getContentInsetEnd();
        }
        return n;
    }
    
    public int getCurrentContentInsetLeft() {
        int n;
        if (androidx.core.view.j0.X((View)this) == 1) {
            n = this.getCurrentContentInsetEnd();
        }
        else {
            n = this.getCurrentContentInsetStart();
        }
        return n;
    }
    
    public int getCurrentContentInsetRight() {
        int n;
        if (androidx.core.view.j0.X((View)this) == 1) {
            n = this.getCurrentContentInsetStart();
        }
        else {
            n = this.getCurrentContentInsetEnd();
        }
        return n;
    }
    
    public int getCurrentContentInsetStart() {
        int n;
        if (this.getNavigationIcon() != null) {
            n = Math.max(this.getContentInsetStart(), Math.max(this.d0, 0));
        }
        else {
            n = this.getContentInsetStart();
        }
        return n;
    }
    
    public Drawable getLogo() {
        final ImageView k = this.K;
        Drawable drawable;
        if (k != null) {
            drawable = k.getDrawable();
        }
        else {
            drawable = null;
        }
        return drawable;
    }
    
    public CharSequence getLogoDescription() {
        final ImageView k = this.K;
        CharSequence contentDescription;
        if (k != null) {
            contentDescription = k.getContentDescription();
        }
        else {
            contentDescription = null;
        }
        return contentDescription;
    }
    
    public Menu getMenu() {
        this.j();
        return this.G.getMenu();
    }
    
    @k0
    public CharSequence getNavigationContentDescription() {
        final ImageButton j = this.J;
        CharSequence contentDescription;
        if (j != null) {
            contentDescription = j.getContentDescription();
        }
        else {
            contentDescription = null;
        }
        return contentDescription;
    }
    
    @k0
    public Drawable getNavigationIcon() {
        final ImageButton j = this.J;
        Drawable drawable;
        if (j != null) {
            drawable = j.getDrawable();
        }
        else {
            drawable = null;
        }
        return drawable;
    }
    
    c getOuterActionMenuPresenter() {
        return this.s0;
    }
    
    @k0
    public Drawable getOverflowIcon() {
        this.j();
        return this.G.getOverflowIcon();
    }
    
    Context getPopupContext() {
        return this.P;
    }
    
    public int getPopupTheme() {
        return this.Q;
    }
    
    public CharSequence getSubtitle() {
        return this.h0;
    }
    
    @k0
    @t0({ androidx.annotation.t0.a.K })
    final TextView getSubtitleTextView() {
        return this.I;
    }
    
    public CharSequence getTitle() {
        return this.g0;
    }
    
    public int getTitleMarginBottom() {
        return this.b0;
    }
    
    public int getTitleMarginEnd() {
        return this.W;
    }
    
    public int getTitleMarginStart() {
        return this.V;
    }
    
    public int getTitleMarginTop() {
        return this.a0;
    }
    
    @k0
    @t0({ androidx.annotation.t0.a.K })
    final TextView getTitleTextView() {
        return this.H;
    }
    
    @t0({ androidx.annotation.t0.a.I })
    public a0 getWrapper() {
        if (this.r0 == null) {
            this.r0 = new v0(this, true);
        }
        return this.r0;
    }
    
    protected e m() {
        return new e(-2, -2);
    }
    
    public e n(final AttributeSet set) {
        return new e(this.getContext(), set);
    }
    
    protected e o(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        if (viewGroup$LayoutParams instanceof e) {
            return new e((e)viewGroup$LayoutParams);
        }
        if (viewGroup$LayoutParams instanceof androidx.appcompat.app.a.b) {
            return new e((androidx.appcompat.app.a.b)viewGroup$LayoutParams);
        }
        if (viewGroup$LayoutParams instanceof ViewGroup$MarginLayoutParams) {
            return new e((ViewGroup$MarginLayoutParams)viewGroup$LayoutParams);
        }
        return new e(viewGroup$LayoutParams);
    }
    
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.removeCallbacks(this.x0);
    }
    
    public boolean onHoverEvent(final MotionEvent motionEvent) {
        final int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.l0 = false;
        }
        if (!this.l0) {
            final boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.l0 = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.l0 = false;
        }
        return true;
    }
    
    protected void onLayout(final boolean b, int n, int i, int a, int min) {
        final boolean b2 = androidx.core.view.j0.X((View)this) == 1;
        final int width = this.getWidth();
        final int height = this.getHeight();
        final int paddingLeft = this.getPaddingLeft();
        final int paddingRight = this.getPaddingRight();
        final int paddingTop = this.getPaddingTop();
        final int paddingBottom = this.getPaddingBottom();
        final int n2 = width - paddingRight;
        final int[] o0 = this.o0;
        o0[o0[1] = 0] = 0;
        n = androidx.core.view.j0.c0((View)this);
        if (n >= 0) {
            min = Math.min(n, min - i);
        }
        else {
            min = 0;
        }
        int d = 0;
        Label_0169: {
            if (this.Q((View)this.J)) {
                final ImageButton j = this.J;
                if (b2) {
                    d = this.D((View)j, n2, o0, min);
                    a = paddingLeft;
                    break Label_0169;
                }
                a = this.C((View)j, paddingLeft, o0, min);
            }
            else {
                a = paddingLeft;
            }
            d = n2;
        }
        n = a;
        i = d;
        if (this.Q((View)this.N)) {
            final ImageButton n3 = this.N;
            if (b2) {
                i = this.D((View)n3, d, o0, min);
                n = a;
            }
            else {
                n = this.C((View)n3, a, o0, min);
                i = d;
            }
        }
        int c = n;
        a = i;
        if (this.Q((View)this.G)) {
            final ActionMenuView g = this.G;
            if (b2) {
                c = this.C((View)g, n, o0, min);
                a = i;
            }
            else {
                a = this.D((View)g, i, o0, min);
                c = n;
            }
        }
        i = this.getCurrentContentInsetLeft();
        n = this.getCurrentContentInsetRight();
        o0[0] = Math.max(0, i - c);
        o0[1] = Math.max(0, n - (n2 - a));
        i = Math.max(c, i);
        a = Math.min(a, n2 - n);
        n = i;
        int d2 = a;
        if (this.Q(this.O)) {
            final View o2 = this.O;
            if (b2) {
                d2 = this.D(o2, a, o0, min);
                n = i;
            }
            else {
                n = this.C(o2, i, o0, min);
                d2 = a;
            }
        }
        a = n;
        i = d2;
        if (this.Q((View)this.K)) {
            final ImageView k = this.K;
            if (b2) {
                i = this.D((View)k, d2, o0, min);
                a = n;
            }
            else {
                a = this.C((View)k, n, o0, min);
                i = d2;
            }
        }
        final boolean q = this.Q((View)this.H);
        final boolean q2 = this.Q((View)this.I);
        if (q) {
            final e e = (e)this.H.getLayoutParams();
            n = e.topMargin + this.H.getMeasuredHeight() + e.bottomMargin + 0;
        }
        else {
            n = 0;
        }
        if (q2) {
            final e e2 = (e)this.I.getLayoutParams();
            n += e2.topMargin + this.I.getMeasuredHeight() + e2.bottomMargin;
        }
        Label_1319: {
            if (!q && !q2) {
                n = a;
            }
            else {
                TextView textView;
                if (q) {
                    textView = this.H;
                }
                else {
                    textView = this.I;
                }
                TextView textView2;
                if (q2) {
                    textView2 = this.I;
                }
                else {
                    textView2 = this.H;
                }
                final e e3 = (e)((View)textView).getLayoutParams();
                final e e4 = (e)((View)textView2).getLayoutParams();
                final boolean b3 = (q && this.H.getMeasuredWidth() > 0) || (q2 && this.I.getMeasuredWidth() > 0);
                final int n4 = this.f0 & 0x70;
                if (n4 != 48) {
                    if (n4 != 80) {
                        final int n5 = (height - paddingTop - paddingBottom - n) / 2;
                        final int topMargin = e3.topMargin;
                        final int a2 = this.a0;
                        if (n5 < topMargin + a2) {
                            n = topMargin + a2;
                        }
                        else {
                            final int n6 = height - paddingBottom - n - n5 - paddingTop;
                            final int bottomMargin = e3.bottomMargin;
                            final int b4 = this.b0;
                            n = n5;
                            if (n6 < bottomMargin + b4) {
                                n = Math.max(0, n5 - (e4.bottomMargin + b4 - n6));
                            }
                        }
                        n += paddingTop;
                    }
                    else {
                        n = height - paddingBottom - e4.bottomMargin - this.b0 - n;
                    }
                }
                else {
                    n = this.getPaddingTop() + e3.topMargin + this.a0;
                }
                if (b2) {
                    int v;
                    if (b3) {
                        v = this.V;
                    }
                    else {
                        v = 0;
                    }
                    final int b5 = v - o0[1];
                    i -= Math.max(0, b5);
                    o0[1] = Math.max(0, -b5);
                    int n9;
                    if (q) {
                        final e e5 = (e)this.H.getLayoutParams();
                        final int n7 = i - this.H.getMeasuredWidth();
                        final int n8 = this.H.getMeasuredHeight() + n;
                        this.H.layout(n7, n, i, n8);
                        n = n7 - this.W;
                        n9 = n8 + e5.bottomMargin;
                    }
                    else {
                        final int n10 = i;
                        n9 = n;
                        n = n10;
                    }
                    int b6;
                    if (q2) {
                        final int n11 = n9 + ((e)this.I.getLayoutParams()).topMargin;
                        this.I.layout(i - this.I.getMeasuredWidth(), n11, i, this.I.getMeasuredHeight() + n11);
                        b6 = i - this.W;
                    }
                    else {
                        b6 = i;
                    }
                    if (b3) {
                        i = Math.min(n, b6);
                    }
                    n = a;
                }
                else {
                    int v2;
                    if (b3) {
                        v2 = this.V;
                    }
                    else {
                        v2 = 0;
                    }
                    final int b7 = v2 - o0[0];
                    a += Math.max(0, b7);
                    o0[0] = Math.max(0, -b7);
                    int a3;
                    if (q) {
                        final e e6 = (e)this.H.getLayoutParams();
                        final int n12 = this.H.getMeasuredWidth() + a;
                        final int n13 = this.H.getMeasuredHeight() + n;
                        this.H.layout(a, n, n12, n13);
                        a3 = n12 + this.W;
                        n = n13 + e6.bottomMargin;
                    }
                    else {
                        a3 = a;
                    }
                    int b8;
                    if (q2) {
                        final int n14 = n + ((e)this.I.getLayoutParams()).topMargin;
                        n = this.I.getMeasuredWidth() + a;
                        this.I.layout(a, n14, n, this.I.getMeasuredHeight() + n14);
                        b8 = n + this.W;
                    }
                    else {
                        b8 = a;
                    }
                    n = a;
                    a = i;
                    if (b3) {
                        n = Math.max(a3, b8);
                        a = i;
                    }
                    break Label_1319;
                }
            }
            a = i;
        }
        final int n15 = paddingLeft;
        final int n16 = 0;
        this.b(this.m0, 3);
        int size;
        for (size = this.m0.size(), i = 0; i < size; ++i) {
            n = this.C(this.m0.get(i), n, o0, min);
        }
        this.b(this.m0, 5);
        int size2;
        for (size2 = this.m0.size(), i = 0; i < size2; ++i) {
            a = this.D(this.m0.get(i), a, o0, min);
        }
        this.b(this.m0, 1);
        final int u = this.u(this.m0, o0);
        i = n15 + (width - n15 - paddingRight) / 2 - u / 2;
        final int n17 = u + i;
        if (i >= n) {
            if (n17 > a) {
                n = i - (n17 - a);
            }
            else {
                n = i;
            }
        }
        for (a = this.m0.size(), i = n16; i < a; ++i) {
            n = this.C(this.m0.get(i), n, o0, min);
        }
        this.m0.clear();
    }
    
    protected void onMeasure(int resolveSizeAndState, final int n) {
        final int[] o0 = this.o0;
        final int b = a1.b((View)this) ? 1 : 0;
        final int n2 = 0;
        int n3;
        int max;
        int combineMeasuredStates;
        if (this.Q((View)this.J)) {
            this.F((View)this.J, resolveSizeAndState, 0, n, 0, this.U);
            n3 = this.J.getMeasuredWidth() + this.s((View)this.J);
            max = Math.max(0, this.J.getMeasuredHeight() + this.t((View)this.J));
            combineMeasuredStates = View.combineMeasuredStates(0, this.J.getMeasuredState());
        }
        else {
            n3 = 0;
            max = 0;
            combineMeasuredStates = 0;
        }
        int b2 = n3;
        int n4 = max;
        int n5 = combineMeasuredStates;
        if (this.Q((View)this.N)) {
            this.F((View)this.N, resolveSizeAndState, 0, n, 0, this.U);
            b2 = this.N.getMeasuredWidth() + this.s((View)this.N);
            n4 = Math.max(max, this.N.getMeasuredHeight() + this.t((View)this.N));
            n5 = View.combineMeasuredStates(combineMeasuredStates, this.N.getMeasuredState());
        }
        final int currentContentInsetStart = this.getCurrentContentInsetStart();
        final int n6 = 0 + Math.max(currentContentInsetStart, b2);
        o0[b] = Math.max(0, currentContentInsetStart - b2);
        int b3;
        if (this.Q((View)this.G)) {
            this.F((View)this.G, resolveSizeAndState, n6, n, 0, this.U);
            b3 = this.G.getMeasuredWidth() + this.s((View)this.G);
            n4 = Math.max(n4, this.G.getMeasuredHeight() + this.t((View)this.G));
            n5 = View.combineMeasuredStates(n5, this.G.getMeasuredState());
        }
        else {
            b3 = 0;
        }
        final int currentContentInsetEnd = this.getCurrentContentInsetEnd();
        final int n7 = n6 + Math.max(currentContentInsetEnd, b3);
        o0[b ^ 0x1] = Math.max(0, currentContentInsetEnd - b3);
        int max2 = n4;
        int combineMeasuredStates2 = n5;
        int n8 = n7;
        if (this.Q(this.O)) {
            n8 = n7 + this.E(this.O, resolveSizeAndState, n7, n, 0, o0);
            max2 = Math.max(n4, this.O.getMeasuredHeight() + this.t(this.O));
            combineMeasuredStates2 = View.combineMeasuredStates(n5, this.O.getMeasuredState());
        }
        int max3 = max2;
        int combineMeasuredStates3 = combineMeasuredStates2;
        int n9 = n8;
        if (this.Q((View)this.K)) {
            n9 = n8 + this.E((View)this.K, resolveSizeAndState, n8, n, 0, o0);
            max3 = Math.max(max2, this.K.getMeasuredHeight() + this.t((View)this.K));
            combineMeasuredStates3 = View.combineMeasuredStates(combineMeasuredStates2, this.K.getMeasuredState());
        }
        final int childCount = this.getChildCount();
        final int n10 = 0;
        int n11 = n9;
        int n12 = combineMeasuredStates3;
        int n13 = max3;
        int max4;
        int combineMeasuredStates4;
        int n14;
        for (int i = n10; i < childCount; ++i, n13 = max4, n12 = combineMeasuredStates4, n11 = n14) {
            final View child = this.getChildAt(i);
            max4 = n13;
            combineMeasuredStates4 = n12;
            n14 = n11;
            if (((e)child.getLayoutParams()).b == 0) {
                if (!this.Q(child)) {
                    max4 = n13;
                    combineMeasuredStates4 = n12;
                    n14 = n11;
                }
                else {
                    n14 = n11 + this.E(child, resolveSizeAndState, n11, n, 0, o0);
                    max4 = Math.max(n13, child.getMeasuredHeight() + this.t(child));
                    combineMeasuredStates4 = View.combineMeasuredStates(n12, child.getMeasuredState());
                }
            }
        }
        final int n15 = this.a0 + this.b0;
        final int n16 = this.V + this.W;
        int b4;
        int max5;
        if (this.Q((View)this.H)) {
            this.E((View)this.H, resolveSizeAndState, n11 + n16, n, n15, o0);
            final int measuredWidth = this.H.getMeasuredWidth();
            final int s = this.s((View)this.H);
            final int measuredHeight = this.H.getMeasuredHeight();
            final int t = this.t((View)this.H);
            n12 = View.combineMeasuredStates(n12, this.H.getMeasuredState());
            b4 = measuredHeight + t;
            max5 = measuredWidth + s;
        }
        else {
            max5 = 0;
            b4 = 0;
        }
        if (this.Q((View)this.I)) {
            max5 = Math.max(max5, this.E((View)this.I, resolveSizeAndState, n11 + n16, n, b4 + n15, o0));
            b4 += this.I.getMeasuredHeight() + this.t((View)this.I);
            n12 = View.combineMeasuredStates(n12, this.I.getMeasuredState());
        }
        final int max6 = Math.max(n13, b4);
        final int paddingLeft = this.getPaddingLeft();
        final int paddingRight = this.getPaddingRight();
        final int paddingTop = this.getPaddingTop();
        final int paddingBottom = this.getPaddingBottom();
        final int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(n11 + max5 + (paddingLeft + paddingRight), this.getSuggestedMinimumWidth()), resolveSizeAndState, 0xFF000000 & n12);
        resolveSizeAndState = View.resolveSizeAndState(Math.max(max6 + (paddingTop + paddingBottom), this.getSuggestedMinimumHeight()), n, n12 << 16);
        if (this.P()) {
            resolveSizeAndState = n2;
        }
        this.setMeasuredDimension(resolveSizeAndState2, resolveSizeAndState);
    }
    
    protected void onRestoreInstanceState(final Parcelable parcelable) {
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        final g g = (g)parcelable;
        super.onRestoreInstanceState(g.a());
        final ActionMenuView g2 = this.G;
        Object r;
        if (g2 != null) {
            r = g2.R();
        }
        else {
            r = null;
        }
        final int i = g.I;
        if (i != 0 && this.t0 != null && r != null) {
            final MenuItem item = ((Menu)r).findItem(i);
            if (item != null) {
                item.expandActionView();
            }
        }
        if (g.J) {
            this.G();
        }
    }
    
    public void onRtlPropertiesChanged(final int n) {
        if (Build$VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(n);
        }
        this.h();
        final l0 c0 = this.c0;
        boolean b = true;
        if (n != 1) {
            b = false;
        }
        c0.f(b);
    }
    
    protected Parcelable onSaveInstanceState() {
        final g g = new g(super.onSaveInstanceState());
        final d t0 = this.t0;
        if (t0 != null) {
            final j h = t0.H;
            if (h != null) {
                g.I = h.getItemId();
            }
        }
        g.J = this.A();
        return (Parcelable)g;
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        final int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.k0 = false;
        }
        if (!this.k0) {
            final boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.k0 = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.k0 = false;
        }
        return true;
    }
    
    public void setCollapseContentDescription(@w0 final int n) {
        CharSequence text;
        if (n != 0) {
            text = this.getContext().getText(n);
        }
        else {
            text = null;
        }
        this.setCollapseContentDescription(text);
    }
    
    public void setCollapseContentDescription(@k0 final CharSequence contentDescription) {
        if (!TextUtils.isEmpty(contentDescription)) {
            this.g();
        }
        final ImageButton n = this.N;
        if (n != null) {
            n.setContentDescription(contentDescription);
        }
    }
    
    public void setCollapseIcon(@s final int n) {
        this.setCollapseIcon(androidx.appcompat.content.res.a.d(this.getContext(), n));
    }
    
    public void setCollapseIcon(@k0 final Drawable imageDrawable) {
        if (imageDrawable != null) {
            this.g();
            this.N.setImageDrawable(imageDrawable);
        }
        else {
            final ImageButton n = this.N;
            if (n != null) {
                n.setImageDrawable(this.L);
            }
        }
    }
    
    @t0({ androidx.annotation.t0.a.I })
    public void setCollapsible(final boolean w0) {
        this.w0 = w0;
        this.requestLayout();
    }
    
    public void setContentInsetEndWithActions(final int n) {
        int e0 = n;
        if (n < 0) {
            e0 = Integer.MIN_VALUE;
        }
        if (e0 != this.e0) {
            this.e0 = e0;
            if (this.getNavigationIcon() != null) {
                this.requestLayout();
            }
        }
    }
    
    public void setContentInsetStartWithNavigation(final int n) {
        int d0 = n;
        if (n < 0) {
            d0 = Integer.MIN_VALUE;
        }
        if (d0 != this.d0) {
            this.d0 = d0;
            if (this.getNavigationIcon() != null) {
                this.requestLayout();
            }
        }
    }
    
    public void setLogo(@s final int n) {
        this.setLogo(androidx.appcompat.content.res.a.d(this.getContext(), n));
    }
    
    public void setLogo(final Drawable imageDrawable) {
        if (imageDrawable != null) {
            this.i();
            if (!this.y((View)this.K)) {
                this.c((View)this.K, true);
            }
        }
        else {
            final ImageView k = this.K;
            if (k != null && this.y((View)k)) {
                this.removeView((View)this.K);
                this.n0.remove(this.K);
            }
        }
        final ImageView i = this.K;
        if (i != null) {
            i.setImageDrawable(imageDrawable);
        }
    }
    
    public void setLogoDescription(@w0 final int n) {
        this.setLogoDescription(this.getContext().getText(n));
    }
    
    public void setLogoDescription(final CharSequence contentDescription) {
        if (!TextUtils.isEmpty(contentDescription)) {
            this.i();
        }
        final ImageView k = this.K;
        if (k != null) {
            k.setContentDescription(contentDescription);
        }
    }
    
    public void setNavigationContentDescription(@w0 final int n) {
        CharSequence text;
        if (n != 0) {
            text = this.getContext().getText(n);
        }
        else {
            text = null;
        }
        this.setNavigationContentDescription(text);
    }
    
    public void setNavigationContentDescription(@k0 final CharSequence contentDescription) {
        if (!TextUtils.isEmpty(contentDescription)) {
            this.l();
        }
        final ImageButton j = this.J;
        if (j != null) {
            j.setContentDescription(contentDescription);
        }
    }
    
    public void setNavigationIcon(@s final int n) {
        this.setNavigationIcon(androidx.appcompat.content.res.a.d(this.getContext(), n));
    }
    
    public void setNavigationIcon(@k0 final Drawable imageDrawable) {
        if (imageDrawable != null) {
            this.l();
            if (!this.y((View)this.J)) {
                this.c((View)this.J, true);
            }
        }
        else {
            final ImageButton j = this.J;
            if (j != null && this.y((View)j)) {
                this.removeView((View)this.J);
                this.n0.remove(this.J);
            }
        }
        final ImageButton i = this.J;
        if (i != null) {
            i.setImageDrawable(imageDrawable);
        }
    }
    
    public void setNavigationOnClickListener(final View$OnClickListener onClickListener) {
        this.l();
        this.J.setOnClickListener(onClickListener);
    }
    
    public void setOnMenuItemClickListener(final f p) {
        this.p0 = p;
    }
    
    public void setOverflowIcon(@k0 final Drawable overflowIcon) {
        this.j();
        this.G.setOverflowIcon(overflowIcon);
    }
    
    public void setPopupTheme(@x0 final int q) {
        if (this.Q != q) {
            if ((this.Q = q) == 0) {
                this.P = this.getContext();
            }
            else {
                this.P = (Context)new ContextThemeWrapper(this.getContext(), q);
            }
        }
    }
    
    public void setSubtitle(@w0 final int n) {
        this.setSubtitle(this.getContext().getText(n));
    }
    
    public void setSubtitle(final CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.I == null) {
                final Context context = this.getContext();
                (this.I = new AppCompatTextView(context)).setSingleLine();
                this.I.setEllipsize(TextUtils$TruncateAt.END);
                final int s = this.S;
                if (s != 0) {
                    this.I.setTextAppearance(context, s);
                }
                final ColorStateList j0 = this.j0;
                if (j0 != null) {
                    this.I.setTextColor(j0);
                }
            }
            if (!this.y((View)this.I)) {
                this.c((View)this.I, true);
            }
        }
        else {
            final TextView i = this.I;
            if (i != null && this.y((View)i)) {
                this.removeView((View)this.I);
                this.n0.remove(this.I);
            }
        }
        final TextView k = this.I;
        if (k != null) {
            k.setText(charSequence);
        }
        this.h0 = charSequence;
    }
    
    public void setSubtitleTextColor(@l final int n) {
        this.setSubtitleTextColor(ColorStateList.valueOf(n));
    }
    
    public void setSubtitleTextColor(@j0 final ColorStateList list) {
        this.j0 = list;
        final TextView i = this.I;
        if (i != null) {
            i.setTextColor(list);
        }
    }
    
    public void setTitle(@w0 final int n) {
        this.setTitle(this.getContext().getText(n));
    }
    
    public void setTitle(final CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.H == null) {
                final Context context = this.getContext();
                (this.H = new AppCompatTextView(context)).setSingleLine();
                this.H.setEllipsize(TextUtils$TruncateAt.END);
                final int r = this.R;
                if (r != 0) {
                    this.H.setTextAppearance(context, r);
                }
                final ColorStateList i0 = this.i0;
                if (i0 != null) {
                    this.H.setTextColor(i0);
                }
            }
            if (!this.y((View)this.H)) {
                this.c((View)this.H, true);
            }
        }
        else {
            final TextView h = this.H;
            if (h != null && this.y((View)h)) {
                this.removeView((View)this.H);
                this.n0.remove(this.H);
            }
        }
        final TextView h2 = this.H;
        if (h2 != null) {
            h2.setText(charSequence);
        }
        this.g0 = charSequence;
    }
    
    public void setTitleMarginBottom(final int b0) {
        this.b0 = b0;
        this.requestLayout();
    }
    
    public void setTitleMarginEnd(final int w) {
        this.W = w;
        this.requestLayout();
    }
    
    public void setTitleMarginStart(final int v) {
        this.V = v;
        this.requestLayout();
    }
    
    public void setTitleMarginTop(final int a0) {
        this.a0 = a0;
        this.requestLayout();
    }
    
    public void setTitleTextColor(@l final int n) {
        this.setTitleTextColor(ColorStateList.valueOf(n));
    }
    
    public void setTitleTextColor(@j0 final ColorStateList list) {
        this.i0 = list;
        final TextView h = this.H;
        if (h != null) {
            h.setTextColor(list);
        }
    }
    
    public boolean v() {
        final d t0 = this.t0;
        return t0 != null && t0.H != null;
    }
    
    public boolean w() {
        final ActionMenuView g = this.G;
        return g != null && g.L();
    }
    
    public void x(@h0 final int n) {
        this.getMenuInflater().inflate(n, this.getMenu());
    }
    
    @t0({ androidx.annotation.t0.a.I })
    public boolean z() {
        final ActionMenuView g = this.G;
        return g != null && g.M();
    }
    
    private class d implements n
    {
        androidx.appcompat.view.menu.g G;
        j H;
        
        d() {
        }
        
        @Override
        public int b() {
            return 0;
        }
        
        @Override
        public void d(final androidx.appcompat.view.menu.g g, final boolean b) {
        }
        
        @Override
        public void e(final boolean b) {
            if (this.H != null) {
                final androidx.appcompat.view.menu.g g = this.G;
                int n = 0;
                if (g != null) {
                    final int size = g.size();
                    int n2 = 0;
                    while (true) {
                        n = n;
                        if (n2 >= size) {
                            break;
                        }
                        if (this.G.getItem(n2) == this.H) {
                            n = 1;
                            break;
                        }
                        ++n2;
                    }
                }
                if (n == 0) {
                    this.g(this.G, this.H);
                }
            }
        }
        
        @Override
        public boolean f() {
            return false;
        }
        
        @Override
        public boolean g(final androidx.appcompat.view.menu.g g, final j j) {
            final View o = Toolbar.this.O;
            if (o instanceof androidx.appcompat.view.c) {
                ((androidx.appcompat.view.c)o).h();
            }
            final Toolbar i = Toolbar.this;
            i.removeView(i.O);
            final Toolbar k = Toolbar.this;
            k.removeView((View)k.N);
            final Toolbar l = Toolbar.this;
            l.O = null;
            l.a();
            this.H = null;
            Toolbar.this.requestLayout();
            j.t(false);
            return true;
        }
        
        @Override
        public boolean h(final androidx.appcompat.view.menu.g g, final j h) {
            Toolbar.this.g();
            final ViewParent parent = Toolbar.this.N.getParent();
            final Toolbar i = Toolbar.this;
            if (parent != i) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup)parent).removeView((View)i.N);
                }
                final Toolbar j = Toolbar.this;
                j.addView((View)j.N);
            }
            Toolbar.this.O = h.getActionView();
            this.H = h;
            final ViewParent parent2 = Toolbar.this.O.getParent();
            final Toolbar k = Toolbar.this;
            if (parent2 != k) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup)parent2).removeView(k.O);
                }
                final e m = Toolbar.this.m();
                final Toolbar l = Toolbar.this;
                m.a = (0x800003 | (l.T & 0x70));
                m.b = 2;
                l.O.setLayoutParams((ViewGroup$LayoutParams)m);
                final Toolbar i2 = Toolbar.this;
                i2.addView(i2.O);
            }
            Toolbar.this.H();
            Toolbar.this.requestLayout();
            h.t(true);
            final View o = Toolbar.this.O;
            if (o instanceof androidx.appcompat.view.c) {
                ((androidx.appcompat.view.c)o).c();
            }
            return true;
        }
        
        @Override
        public void i(final a a) {
        }
        
        @Override
        public void j(final Context context, final androidx.appcompat.view.menu.g g) {
            final androidx.appcompat.view.menu.g g2 = this.G;
            if (g2 != null) {
                final j h = this.H;
                if (h != null) {
                    g2.g(h);
                }
            }
            this.G = g;
        }
        
        @Override
        public void k(final Parcelable parcelable) {
        }
        
        @Override
        public boolean m(final androidx.appcompat.view.menu.s s) {
            return false;
        }
        
        @Override
        public o n(final ViewGroup viewGroup) {
            return null;
        }
        
        @Override
        public Parcelable o() {
            return null;
        }
    }
    
    public static class e extends b
    {
        static final int c = 0;
        static final int d = 1;
        static final int e = 2;
        int b;
        
        public e(final int n) {
            this(-2, -1, n);
        }
        
        public e(final int n, final int n2) {
            super(n, n2);
            this.b = 0;
            super.a = 8388627;
        }
        
        public e(final int n, final int n2, final int a) {
            super(n, n2);
            this.b = 0;
            super.a = a;
        }
        
        public e(@j0 final Context context, final AttributeSet set) {
            super(context, set);
            this.b = 0;
        }
        
        public e(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
            super(viewGroup$LayoutParams);
            this.b = 0;
        }
        
        public e(final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams) {
            super((ViewGroup$LayoutParams)viewGroup$MarginLayoutParams);
            this.b = 0;
            this.a(viewGroup$MarginLayoutParams);
        }
        
        public e(final b b) {
            super(b);
            this.b = 0;
        }
        
        public e(final e e) {
            super((b)e);
            this.b = 0;
            this.b = e.b;
        }
        
        void a(final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams) {
            super.leftMargin = viewGroup$MarginLayoutParams.leftMargin;
            super.topMargin = viewGroup$MarginLayoutParams.topMargin;
            super.rightMargin = viewGroup$MarginLayoutParams.rightMargin;
            super.bottomMargin = viewGroup$MarginLayoutParams.bottomMargin;
        }
    }
    
    public interface f
    {
        boolean onMenuItemClick(final MenuItem p0);
    }
    
    public static class g extends a
    {
        public static final Parcelable$Creator<g> CREATOR;
        int I;
        boolean J;
        
        static {
            CREATOR = (Parcelable$Creator)new Parcelable$ClassLoaderCreator<g>() {
                public g a(final Parcel parcel) {
                    return new g(parcel, null);
                }
                
                public g b(final Parcel parcel, final ClassLoader classLoader) {
                    return new g(parcel, classLoader);
                }
                
                public g[] c(final int n) {
                    return new g[n];
                }
            };
        }
        
        public g(final Parcel parcel) {
            this(parcel, null);
        }
        
        public g(final Parcel parcel, final ClassLoader classLoader) {
            super(parcel, classLoader);
            this.I = parcel.readInt();
            this.J = (parcel.readInt() != 0);
        }
        
        public g(final Parcelable parcelable) {
            super(parcelable);
        }
        
        @Override
        public void writeToParcel(final Parcel parcel, final int n) {
            super.writeToParcel(parcel, n);
            parcel.writeInt(this.I);
            parcel.writeInt((int)(this.J ? 1 : 0));
        }
    }
}
