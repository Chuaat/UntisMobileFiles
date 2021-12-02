// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.navigation;

import android.os.Parcel;
import android.os.Parcelable$ClassLoaderCreator;
import android.os.Parcelable$Creator;
import androidx.annotation.p;
import androidx.core.content.d;
import androidx.annotation.s;
import androidx.annotation.y;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View$MeasureSpec;
import com.google.android.material.shape.k;
import androidx.annotation.e0;
import android.view.Menu;
import androidx.annotation.q;
import androidx.annotation.t0;
import androidx.core.view.x0;
import android.app.Activity;
import android.graphics.Color;
import android.os.Build$VERSION;
import com.google.android.material.internal.b;
import android.graphics.drawable.InsetDrawable;
import com.google.android.material.resources.c;
import android.widget.FrameLayout;
import android.util.TypedValue;
import androidx.appcompat.widget.u0;
import android.view.ViewGroup;
import android.view.MenuItem;
import androidx.appcompat.view.menu.g;
import android.graphics.drawable.Drawable;
import android.content.res.ColorStateList;
import com.google.android.material.shape.j;
import com.google.android.material.shape.o;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import com.google.android.material.internal.t;
import androidx.annotation.k0;
import android.util.AttributeSet;
import android.content.Context;
import o2.a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.MenuInflater;
import com.google.android.material.internal.i;
import androidx.annotation.j0;
import com.google.android.material.internal.h;
import com.google.android.material.internal.n;

public class NavigationView extends n
{
    private static final int[] S;
    private static final int[] T;
    private static final int U;
    private static final int V = 1;
    @j0
    private final h L;
    private final i M;
    c N;
    private final int O;
    private final int[] P;
    private MenuInflater Q;
    private ViewTreeObserver$OnGlobalLayoutListener R;
    
    static {
        S = new int[] { 16842912 };
        T = new int[] { -16842910 };
        U = a.n.xa;
    }
    
    public NavigationView(@j0 final Context context) {
        this(context, null);
    }
    
    public NavigationView(@j0 final Context context, @k0 final AttributeSet set) {
        this(context, set, a.c.Pa);
    }
    
    public NavigationView(@j0 final Context context, @k0 final AttributeSet set, int n) {
        final int u = NavigationView.U;
        super(com.google.android.material.theme.overlay.a.c(context, set, n, u), set, n);
        final i m = new i();
        this.M = m;
        this.P = new int[2];
        final Context context2 = this.getContext();
        final h l = new h(context2);
        this.L = l;
        final u0 k = t.k(context2, set, a.o.Mn, n, u, new int[0]);
        final int nn = a.o.Nn;
        if (k.C(nn)) {
            androidx.core.view.j0.G1((View)this, k.h(nn));
        }
        if (this.getBackground() == null || this.getBackground() instanceof ColorDrawable) {
            final o i = o.e(context2, set, n, u).m();
            final Drawable background = this.getBackground();
            final j j = new j(i);
            if (background instanceof ColorDrawable) {
                j.n0(ColorStateList.valueOf(((ColorDrawable)background).getColor()));
            }
            j.Y(context2);
            androidx.core.view.j0.G1((View)this, j);
        }
        n = a.o.Qn;
        if (k.C(n)) {
            this.setElevation((float)k.g(n, 0));
        }
        this.setFitsSystemWindows(k.a(a.o.On, false));
        this.O = k.g(a.o.Pn, 0);
        n = a.o.Wn;
        ColorStateList list;
        if (k.C(n)) {
            list = k.d(n);
        }
        else {
            list = this.e(16842808);
        }
        n = a.o.fo;
        boolean b;
        if (k.C(n)) {
            n = k.u(n, 0);
            b = true;
        }
        else {
            n = 0;
            b = false;
        }
        final int vn = a.o.Vn;
        if (k.C(vn)) {
            this.setItemIconSize(k.g(vn, 0));
        }
        ColorStateList d = null;
        final int go = a.o.go;
        if (k.C(go)) {
            d = k.d(go);
        }
        ColorStateList e = d;
        if (!b && (e = d) == null) {
            e = this.e(16842806);
        }
        final Drawable h = k.h(a.o.Sn);
        Drawable f;
        if ((f = h) == null) {
            f = h;
            if (this.h(k)) {
                f = this.f(k);
            }
        }
        final int tn = a.o.Tn;
        if (k.C(tn)) {
            m.F(k.g(tn, 0));
        }
        final int g = k.g(a.o.Un, 0);
        this.setItemMaxLines(k.o(a.o.Xn, 1));
        l.X((g.a)new g.a() {
            @Override
            public boolean a(final g g, final MenuItem menuItem) {
                final c n = NavigationView.this.N;
                return n != null && n.a(menuItem);
            }
            
            @Override
            public void b(final g g) {
            }
        });
        m.D(1);
        m.j(context2, l);
        m.I(list);
        m.M(this.getOverScrollMode());
        if (b) {
            m.K(n);
        }
        m.L(e);
        m.E(f);
        m.G(g);
        l.b(m);
        this.addView((View)m.n((ViewGroup)this));
        n = a.o.ho;
        if (k.C(n)) {
            this.j(k.u(n, 0));
        }
        n = a.o.Rn;
        if (k.C(n)) {
            this.i(k.u(n, 0));
        }
        k.I();
        this.l();
    }
    
    @k0
    private ColorStateList e(int defaultColor) {
        final TypedValue typedValue = new TypedValue();
        if (!this.getContext().getTheme().resolveAttribute(defaultColor, typedValue, true)) {
            return null;
        }
        final ColorStateList c = androidx.appcompat.content.res.a.c(this.getContext(), typedValue.resourceId);
        if (!this.getContext().getTheme().resolveAttribute(c.a.c.H0, typedValue, true)) {
            return null;
        }
        final int data = typedValue.data;
        defaultColor = c.getDefaultColor();
        final int[] t = NavigationView.T;
        return new ColorStateList(new int[][] { t, NavigationView.S, FrameLayout.EMPTY_STATE_SET }, new int[] { c.getColorForState(t, defaultColor), data, defaultColor });
    }
    
    @j0
    private final Drawable f(@j0 final u0 u0) {
        final j j = new j(o.b(this.getContext(), u0.u(a.o.Yn, 0), u0.u(a.o.Zn, 0)).m());
        j.n0(com.google.android.material.resources.c.b(this.getContext(), u0, a.o.ao));
        return (Drawable)new InsetDrawable((Drawable)j, u0.g(a.o.do, 0), u0.g(a.o.eo, 0), u0.g(a.o.co, 0), u0.g(a.o.bo, 0));
    }
    
    private MenuInflater getMenuInflater() {
        if (this.Q == null) {
            this.Q = new androidx.appcompat.view.g(this.getContext());
        }
        return this.Q;
    }
    
    private boolean h(@j0 final u0 u0) {
        return u0.C(a.o.Yn) || u0.C(a.o.Zn);
    }
    
    private void l() {
        this.R = (ViewTreeObserver$OnGlobalLayoutListener)new ViewTreeObserver$OnGlobalLayoutListener() {
            public void onGlobalLayout() {
                final NavigationView g = NavigationView.this;
                g.getLocationOnScreen(g.P);
                final int[] b = NavigationView.this.P;
                final boolean b2 = true;
                final boolean drawTopInsetForeground = b[1] == 0;
                NavigationView.this.M.B(drawTopInsetForeground);
                NavigationView.this.setDrawTopInsetForeground(drawTopInsetForeground);
                final Activity a = com.google.android.material.internal.b.a(NavigationView.this.getContext());
                if (a != null && Build$VERSION.SDK_INT >= 21) {
                    final boolean b3 = a.findViewById(16908290).getHeight() == NavigationView.this.getHeight();
                    final boolean b4 = Color.alpha(a.getWindow().getNavigationBarColor()) != 0;
                    NavigationView.this.setDrawBottomInsetForeground(b3 && b4 && b2);
                }
            }
        };
        this.getViewTreeObserver().addOnGlobalLayoutListener(this.R);
    }
    
    @t0({ t0.a.H })
    @Override
    protected void a(@j0 final x0 x0) {
        this.M.l(x0);
    }
    
    public void d(@j0 final View view) {
        this.M.c(view);
    }
    
    public View g(final int n) {
        return this.M.r(n);
    }
    
    @k0
    public MenuItem getCheckedItem() {
        return (MenuItem)this.M.p();
    }
    
    public int getHeaderCount() {
        return this.M.q();
    }
    
    @k0
    public Drawable getItemBackground() {
        return this.M.s();
    }
    
    @q
    public int getItemHorizontalPadding() {
        return this.M.t();
    }
    
    @q
    public int getItemIconPadding() {
        return this.M.u();
    }
    
    @k0
    public ColorStateList getItemIconTintList() {
        return this.M.x();
    }
    
    public int getItemMaxLines() {
        return this.M.v();
    }
    
    @k0
    public ColorStateList getItemTextColor() {
        return this.M.w();
    }
    
    @j0
    public Menu getMenu() {
        return (Menu)this.L;
    }
    
    public View i(@e0 final int n) {
        return this.M.y(n);
    }
    
    public void j(final int n) {
        this.M.N(true);
        this.getMenuInflater().inflate(n, (Menu)this.L);
        this.M.N(false);
        this.M.e(false);
    }
    
    public void k(@j0 final View view) {
        this.M.A(view);
    }
    
    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        k.e((View)this);
    }
    
    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (Build$VERSION.SDK_INT < 16) {
            this.getViewTreeObserver().removeGlobalOnLayoutListener(this.R);
        }
        else {
            this.getViewTreeObserver().removeOnGlobalLayoutListener(this.R);
        }
    }
    
    protected void onMeasure(int n, final int n2) {
        final int mode = View$MeasureSpec.getMode(n);
        Label_0047: {
            if (mode != Integer.MIN_VALUE) {
                if (mode != 0) {
                    break Label_0047;
                }
                n = this.O;
            }
            else {
                n = Math.min(View$MeasureSpec.getSize(n), this.O);
            }
            n = View$MeasureSpec.makeMeasureSpec(n, 1073741824);
        }
        super.onMeasure(n, n2);
    }
    
    protected void onRestoreInstanceState(final Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        final d d = (d)parcelable;
        super.onRestoreInstanceState(d.a());
        this.L.U(d.I);
    }
    
    protected Parcelable onSaveInstanceState() {
        final d d = new d(super.onSaveInstanceState());
        final Bundle i = new Bundle();
        d.I = i;
        this.L.W(i);
        return (Parcelable)d;
    }
    
    public void setCheckedItem(@y final int n) {
        final MenuItem item = this.L.findItem(n);
        if (item != null) {
            this.M.C((androidx.appcompat.view.menu.j)item);
        }
    }
    
    public void setCheckedItem(@j0 MenuItem item) {
        item = this.L.findItem(item.getItemId());
        if (item != null) {
            this.M.C((androidx.appcompat.view.menu.j)item);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }
    
    public void setElevation(final float elevation) {
        if (Build$VERSION.SDK_INT >= 21) {
            super.setElevation(elevation);
        }
        k.d((View)this, elevation);
    }
    
    public void setItemBackground(@k0 final Drawable drawable) {
        this.M.E(drawable);
    }
    
    public void setItemBackgroundResource(@s final int n) {
        this.setItemBackground(androidx.core.content.d.i(this.getContext(), n));
    }
    
    public void setItemHorizontalPadding(@q final int n) {
        this.M.F(n);
    }
    
    public void setItemHorizontalPaddingResource(@p final int n) {
        this.M.F(this.getResources().getDimensionPixelSize(n));
    }
    
    public void setItemIconPadding(@q final int n) {
        this.M.G(n);
    }
    
    public void setItemIconPaddingResource(final int n) {
        this.M.G(this.getResources().getDimensionPixelSize(n));
    }
    
    public void setItemIconSize(@q final int n) {
        this.M.H(n);
    }
    
    public void setItemIconTintList(@k0 final ColorStateList list) {
        this.M.I(list);
    }
    
    public void setItemMaxLines(final int n) {
        this.M.J(n);
    }
    
    public void setItemTextAppearance(@androidx.annotation.x0 final int n) {
        this.M.K(n);
    }
    
    public void setItemTextColor(@k0 final ColorStateList list) {
        this.M.L(list);
    }
    
    public void setNavigationItemSelectedListener(@k0 final c n) {
        this.N = n;
    }
    
    public void setOverScrollMode(final int overScrollMode) {
        super.setOverScrollMode(overScrollMode);
        final i m = this.M;
        if (m != null) {
            m.M(overScrollMode);
        }
    }
    
    public interface c
    {
        boolean a(@j0 final MenuItem p0);
    }
    
    public static class d extends a
    {
        public static final Parcelable$Creator<d> CREATOR;
        @k0
        public Bundle I;
        
        static {
            CREATOR = (Parcelable$Creator)new Parcelable$ClassLoaderCreator<d>() {
                @k0
                public d a(@j0 final Parcel parcel) {
                    return new d(parcel, null);
                }
                
                @j0
                public d b(@j0 final Parcel parcel, final ClassLoader classLoader) {
                    return new d(parcel, classLoader);
                }
                
                @j0
                public d[] c(final int n) {
                    return new d[n];
                }
            };
        }
        
        public d(@j0 final Parcel parcel, @k0 final ClassLoader classLoader) {
            super(parcel, classLoader);
            this.I = parcel.readBundle(classLoader);
        }
        
        public d(final Parcelable parcelable) {
            super(parcelable);
        }
        
        @Override
        public void writeToParcel(@j0 final Parcel parcel, final int n) {
            super.writeToParcel(parcel, n);
            parcel.writeBundle(this.I);
        }
    }
}
