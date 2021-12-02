// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.navigation;

import android.os.Parcel;
import android.os.Parcelable$ClassLoaderCreator;
import android.os.Parcelable$Creator;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import androidx.annotation.p;
import android.os.Build$VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.material.shape.k;
import android.view.View$OnTouchListener;
import androidx.annotation.y;
import androidx.appcompat.view.menu.o;
import android.view.Menu;
import androidx.annotation.q;
import androidx.annotation.s;
import androidx.annotation.t0;
import com.google.android.material.shape.j;
import com.google.android.material.internal.b0;
import androidx.appcompat.widget.u0;
import android.view.MenuItem;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.graphics.drawable.ColorDrawable;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.n;
import com.google.android.material.internal.t;
import com.google.android.material.theme.overlay.a;
import androidx.annotation.x0;
import androidx.annotation.f;
import android.util.AttributeSet;
import android.content.Context;
import android.view.MenuInflater;
import androidx.annotation.k0;
import android.content.res.ColorStateList;
import androidx.annotation.j0;
import android.widget.FrameLayout;

public abstract class e extends FrameLayout
{
    public static final int N = -1;
    public static final int O = 0;
    public static final int P = 1;
    public static final int Q = 2;
    private static final int R = 1;
    @j0
    private final b G;
    @j0
    private final com.google.android.material.navigation.c H;
    @j0
    private final com.google.android.material.navigation.d I;
    @k0
    private ColorStateList J;
    private MenuInflater K;
    private e L;
    private d M;
    
    public e(@j0 final Context context, @k0 final AttributeSet set, @androidx.annotation.f int itemBackgroundRes, @x0 final int n) {
        super(a.c(context, set, itemBackgroundRes, n), set, itemBackgroundRes);
        final com.google.android.material.navigation.d d = new com.google.android.material.navigation.d();
        this.I = d;
        final Context context2 = this.getContext();
        final int[] xn = o2.a.o.xn;
        final int fn = o2.a.o.Fn;
        final int en = o2.a.o.En;
        final u0 k = t.k(context2, set, xn, itemBackgroundRes, n, fn, en);
        final b g = new b(context2, this.getClass(), this.getMaxItemCount());
        this.G = g;
        final com.google.android.material.navigation.c e = this.e(context2);
        d.c(this.H = e);
        d.a(1);
        e.setPresenter(d);
        g.b(d);
        d.j(this.getContext(), g);
        itemBackgroundRes = o2.a.o.Cn;
        ColorStateList iconTintList;
        if (k.C(itemBackgroundRes)) {
            iconTintList = k.d(itemBackgroundRes);
        }
        else {
            iconTintList = e.d(16842808);
        }
        e.setIconTintList(iconTintList);
        this.setItemIconSize(k.g(o2.a.o.Bn, this.getResources().getDimensionPixelSize(o2.a.f.f5)));
        if (k.C(fn)) {
            this.setItemTextAppearanceInactive(k.u(fn, 0));
        }
        if (k.C(en)) {
            this.setItemTextAppearanceActive(k.u(en, 0));
        }
        itemBackgroundRes = o2.a.o.Gn;
        if (k.C(itemBackgroundRes)) {
            this.setItemTextColor(k.d(itemBackgroundRes));
        }
        if (this.getBackground() == null || this.getBackground() instanceof ColorDrawable) {
            androidx.core.view.j0.G1((View)this, this.d(context2));
        }
        itemBackgroundRes = o2.a.o.zn;
        if (k.C(itemBackgroundRes)) {
            this.setElevation((float)k.g(itemBackgroundRes, 0));
        }
        androidx.core.graphics.drawable.c.o(this.getBackground().mutate(), com.google.android.material.resources.c.b(context2, k, o2.a.o.yn));
        this.setLabelVisibilityMode(k.p(o2.a.o.Hn, -1));
        itemBackgroundRes = k.u(o2.a.o.An, 0);
        if (itemBackgroundRes != 0) {
            e.setItemBackgroundRes(itemBackgroundRes);
        }
        else {
            this.setItemRippleColor(com.google.android.material.resources.c.b(context2, k, o2.a.o.Dn));
        }
        itemBackgroundRes = o2.a.o.In;
        if (k.C(itemBackgroundRes)) {
            this.h(k.u(itemBackgroundRes, 0));
        }
        k.I();
        this.addView((View)e);
        g.X((g.a)new g.a() {
            @Override
            public boolean a(final g g, @j0 final MenuItem menuItem) {
                final d a = e.this.M;
                boolean b = true;
                if (a != null && menuItem.getItemId() == e.this.getSelectedItemId()) {
                    e.this.M.a(menuItem);
                    return true;
                }
                if (e.this.L == null || e.this.L.a(menuItem)) {
                    b = false;
                }
                return b;
            }
            
            @Override
            public void b(final g g) {
            }
        });
        this.c();
    }
    
    private void c() {
        b0.d((View)this, (b0.e)new b0.e() {
            @j0
            @Override
            public androidx.core.view.x0 a(final View view, @j0 final androidx.core.view.x0 x0, @j0 final b0.f f) {
                f.d += x0.o();
                final int x2 = androidx.core.view.j0.X(view);
                boolean b = true;
                if (x2 != 1) {
                    b = false;
                }
                final int p3 = x0.p();
                int q = x0.q();
                final int a = f.a;
                int n;
                if (b) {
                    n = q;
                }
                else {
                    n = p3;
                }
                f.a = a + n;
                final int c = f.c;
                if (b) {
                    q = p3;
                }
                f.c = c + q;
                f.a(view);
                return x0;
            }
        });
    }
    
    @j0
    private j d(final Context context) {
        final j j = new j();
        final Drawable background = this.getBackground();
        if (background instanceof ColorDrawable) {
            j.n0(ColorStateList.valueOf(((ColorDrawable)background).getColor()));
        }
        j.Y(context);
        return j;
    }
    
    private MenuInflater getMenuInflater() {
        if (this.K == null) {
            this.K = new androidx.appcompat.view.g(this.getContext());
        }
        return this.K;
    }
    
    @j0
    @t0({ t0.a.H })
    protected abstract com.google.android.material.navigation.c e(@j0 final Context p0);
    
    @k0
    public com.google.android.material.badge.a f(final int n) {
        return this.H.h(n);
    }
    
    @j0
    public com.google.android.material.badge.a g(final int n) {
        return this.H.i(n);
    }
    
    @k0
    public Drawable getItemBackground() {
        return this.H.getItemBackground();
    }
    
    @Deprecated
    @s
    public int getItemBackgroundResource() {
        return this.H.getItemBackgroundRes();
    }
    
    @q
    public int getItemIconSize() {
        return this.H.getItemIconSize();
    }
    
    @k0
    public ColorStateList getItemIconTintList() {
        return this.H.getIconTintList();
    }
    
    @k0
    public ColorStateList getItemRippleColor() {
        return this.J;
    }
    
    @x0
    public int getItemTextAppearanceActive() {
        return this.H.getItemTextAppearanceActive();
    }
    
    @x0
    public int getItemTextAppearanceInactive() {
        return this.H.getItemTextAppearanceInactive();
    }
    
    @k0
    public ColorStateList getItemTextColor() {
        return this.H.getItemTextColor();
    }
    
    public int getLabelVisibilityMode() {
        return this.H.getLabelVisibilityMode();
    }
    
    public abstract int getMaxItemCount();
    
    @j0
    public Menu getMenu() {
        return (Menu)this.G;
    }
    
    @j0
    @t0({ t0.a.H })
    public o getMenuView() {
        return this.H;
    }
    
    @j0
    protected com.google.android.material.navigation.d getPresenter() {
        return this.I;
    }
    
    @y
    public int getSelectedItemId() {
        return this.H.getSelectedItemId();
    }
    
    public void h(final int n) {
        this.I.l(true);
        this.getMenuInflater().inflate(n, (Menu)this.G);
        this.I.l(false);
        this.I.e(true);
    }
    
    public void i(final int n) {
        this.H.l(n);
    }
    
    public void j(final int n, @k0 final View$OnTouchListener view$OnTouchListener) {
        this.H.n(n, view$OnTouchListener);
    }
    
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        k.e((View)this);
    }
    
    protected void onRestoreInstanceState(@k0 final Parcelable parcelable) {
        if (!(parcelable instanceof f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        final f f = (f)parcelable;
        super.onRestoreInstanceState(f.a());
        this.G.U(f.I);
    }
    
    @j0
    protected Parcelable onSaveInstanceState() {
        final f f = new f(super.onSaveInstanceState());
        final Bundle i = new Bundle();
        f.I = i;
        this.G.W(i);
        return (Parcelable)f;
    }
    
    public void setElevation(final float elevation) {
        if (Build$VERSION.SDK_INT >= 21) {
            super.setElevation(elevation);
        }
        k.d((View)this, elevation);
    }
    
    public void setItemBackground(@k0 final Drawable itemBackground) {
        this.H.setItemBackground(itemBackground);
        this.J = null;
    }
    
    public void setItemBackgroundResource(@s final int itemBackgroundRes) {
        this.H.setItemBackgroundRes(itemBackgroundRes);
        this.J = null;
    }
    
    public void setItemIconSize(@q final int itemIconSize) {
        this.H.setItemIconSize(itemIconSize);
    }
    
    public void setItemIconSizeRes(@p final int n) {
        this.setItemIconSize(this.getResources().getDimensionPixelSize(n));
    }
    
    public void setItemIconTintList(@k0 final ColorStateList iconTintList) {
        this.H.setIconTintList(iconTintList);
    }
    
    public void setItemRippleColor(@k0 ColorStateList a) {
        if (this.J == a) {
            if (a == null && this.H.getItemBackground() != null) {
                this.H.setItemBackground(null);
            }
            return;
        }
        if ((this.J = a) == null) {
            this.H.setItemBackground(null);
        }
        else {
            a = com.google.android.material.ripple.b.a(a);
            if (Build$VERSION.SDK_INT >= 21) {
                this.H.setItemBackground((Drawable)new RippleDrawable(a, (Drawable)null, (Drawable)null));
            }
            else {
                final GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadius(1.0E-5f);
                final Drawable r = androidx.core.graphics.drawable.c.r((Drawable)gradientDrawable);
                androidx.core.graphics.drawable.c.o(r, a);
                this.H.setItemBackground(r);
            }
        }
    }
    
    public void setItemTextAppearanceActive(@x0 final int itemTextAppearanceActive) {
        this.H.setItemTextAppearanceActive(itemTextAppearanceActive);
    }
    
    public void setItemTextAppearanceInactive(@x0 final int itemTextAppearanceInactive) {
        this.H.setItemTextAppearanceInactive(itemTextAppearanceInactive);
    }
    
    public void setItemTextColor(@k0 final ColorStateList itemTextColor) {
        this.H.setItemTextColor(itemTextColor);
    }
    
    public void setLabelVisibilityMode(final int labelVisibilityMode) {
        if (this.H.getLabelVisibilityMode() != labelVisibilityMode) {
            this.H.setLabelVisibilityMode(labelVisibilityMode);
            this.I.e(false);
        }
    }
    
    public void setOnItemReselectedListener(@k0 final d m) {
        this.M = m;
    }
    
    public void setOnItemSelectedListener(@k0 final e l) {
        this.L = l;
    }
    
    public void setSelectedItemId(@y final int n) {
        final MenuItem item = this.G.findItem(n);
        if (item != null && !this.G.P(item, this.I, 0)) {
            item.setChecked(true);
        }
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @t0({ t0.a.H })
    public @interface c {
    }
    
    public interface d
    {
        void a(@j0 final MenuItem p0);
    }
    
    public interface e
    {
        boolean a(@j0 final MenuItem p0);
    }
    
    static class f extends a
    {
        public static final Parcelable$Creator<f> CREATOR;
        @k0
        Bundle I;
        
        static {
            CREATOR = (Parcelable$Creator)new Parcelable$ClassLoaderCreator<f>() {
                @k0
                public f a(@j0 final Parcel parcel) {
                    return new f(parcel, null);
                }
                
                @j0
                public f b(@j0 final Parcel parcel, final ClassLoader classLoader) {
                    return new f(parcel, classLoader);
                }
                
                @j0
                public f[] c(final int n) {
                    return new f[n];
                }
            };
        }
        
        public f(@j0 final Parcel parcel, final ClassLoader classLoader) {
            super(parcel, classLoader);
            ClassLoader classLoader2 = classLoader;
            if (classLoader == null) {
                classLoader2 = this.getClass().getClassLoader();
            }
            this.b(parcel, classLoader2);
        }
        
        public f(final Parcelable parcelable) {
            super(parcelable);
        }
        
        private void b(@j0 final Parcel parcel, final ClassLoader classLoader) {
            this.I = parcel.readBundle(classLoader);
        }
        
        @Override
        public void writeToParcel(@j0 final Parcel parcel, final int n) {
            super.writeToParcel(parcel, n);
            parcel.writeBundle(this.I);
        }
    }
}
