// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.button;

import com.google.android.material.internal.b0;
import android.content.res.TypedArray;
import com.google.android.material.shape.s;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.ripple.b;
import androidx.core.graphics.drawable.c;
import android.graphics.drawable.InsetDrawable;
import com.google.android.material.shape.j;
import android.view.View;
import androidx.annotation.q;
import android.os.Build$VERSION;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.Drawable;
import android.content.res.ColorStateList;
import androidx.annotation.k0;
import android.graphics.PorterDuff$Mode;
import androidx.annotation.j0;
import com.google.android.material.shape.o;
import androidx.annotation.t0;

@t0({ t0.a.H })
class a
{
    private static final boolean t;
    private final MaterialButton a;
    @j0
    private o b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    @k0
    private PorterDuff$Mode i;
    @k0
    private ColorStateList j;
    @k0
    private ColorStateList k;
    @k0
    private ColorStateList l;
    @k0
    private Drawable m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private LayerDrawable r;
    private int s;
    
    static {
        t = (Build$VERSION.SDK_INT >= 21);
    }
    
    a(final MaterialButton a, @j0 final o b) {
        this.n = false;
        this.o = false;
        this.p = false;
        this.a = a;
        this.b = b;
    }
    
    private void E(@q final int e, @q final int f) {
        final int j0 = androidx.core.view.j0.j0((View)this.a);
        final int paddingTop = this.a.getPaddingTop();
        final int i0 = androidx.core.view.j0.i0((View)this.a);
        final int paddingBottom = this.a.getPaddingBottom();
        final int e2 = this.e;
        final int f2 = this.f;
        this.f = f;
        this.e = e;
        if (!this.o) {
            this.F();
        }
        androidx.core.view.j0.b2((View)this.a, j0, paddingTop + e - e2, i0, paddingBottom + f - f2);
    }
    
    private void F() {
        this.a.setInternalBackground(this.a());
        final j f = this.f();
        if (f != null) {
            f.m0((float)this.s);
        }
    }
    
    private void G(@j0 final o shapeAppearanceModel) {
        if (this.f() != null) {
            this.f().setShapeAppearanceModel(shapeAppearanceModel);
        }
        if (this.n() != null) {
            this.n().setShapeAppearanceModel(shapeAppearanceModel);
        }
        if (this.e() != null) {
            this.e().setShapeAppearanceModel(shapeAppearanceModel);
        }
    }
    
    private void I() {
        final j f = this.f();
        final j n = this.n();
        if (f != null) {
            f.D0((float)this.h, this.k);
            if (n != null) {
                final float n2 = (float)this.h;
                int d;
                if (this.n) {
                    d = s2.a.d((View)this.a, o2.a.c.P2);
                }
                else {
                    d = 0;
                }
                n.C0(n2, d);
            }
        }
    }
    
    @j0
    private InsetDrawable J(final Drawable drawable) {
        return new InsetDrawable(drawable, this.c, this.e, this.d, this.f);
    }
    
    private Drawable a() {
        final j j = new j(this.b);
        j.Y(this.a.getContext());
        androidx.core.graphics.drawable.c.o(j, this.j);
        final PorterDuff$Mode i = this.i;
        if (i != null) {
            androidx.core.graphics.drawable.c.p(j, i);
        }
        j.D0((float)this.h, this.k);
        final j k = new j(this.b);
        k.setTint(0);
        final float n = (float)this.h;
        int d;
        if (this.n) {
            d = s2.a.d((View)this.a, o2.a.c.P2);
        }
        else {
            d = 0;
        }
        k.C0(n, d);
        if (com.google.android.material.button.a.t) {
            androidx.core.graphics.drawable.c.n(this.m = new j(this.b), -1);
            return (Drawable)(this.r = (LayerDrawable)new RippleDrawable(com.google.android.material.ripple.b.d(this.l), (Drawable)this.J((Drawable)new LayerDrawable(new Drawable[] { k, j })), this.m));
        }
        androidx.core.graphics.drawable.c.o(this.m = new com.google.android.material.ripple.a(this.b), com.google.android.material.ripple.b.d(this.l));
        final LayerDrawable r = new LayerDrawable(new Drawable[] { k, j, this.m });
        this.r = r;
        return (Drawable)this.J((Drawable)r);
    }
    
    @k0
    private j g(final boolean b) {
        final LayerDrawable r = this.r;
        if (r != null && r.getNumberOfLayers() > 0) {
            LayerDrawable r2;
            if (com.google.android.material.button.a.t) {
                r2 = (LayerDrawable)((InsetDrawable)this.r.getDrawable(0)).getDrawable();
            }
            else {
                r2 = this.r;
            }
            return (j)r2.getDrawable((int)((b ^ true) ? 1 : 0));
        }
        return null;
    }
    
    @k0
    private j n() {
        return this.g(true);
    }
    
    void A(@k0 final ColorStateList k) {
        if (this.k != k) {
            this.k = k;
            this.I();
        }
    }
    
    void B(final int h) {
        if (this.h != h) {
            this.h = h;
            this.I();
        }
    }
    
    void C(@k0 final ColorStateList j) {
        if (this.j != j) {
            this.j = j;
            if (this.f() != null) {
                androidx.core.graphics.drawable.c.o(this.f(), this.j);
            }
        }
    }
    
    void D(@k0 final PorterDuff$Mode i) {
        if (this.i != i) {
            this.i = i;
            if (this.f() != null && this.i != null) {
                androidx.core.graphics.drawable.c.p(this.f(), this.i);
            }
        }
    }
    
    void H(final int n, final int n2) {
        final Drawable m = this.m;
        if (m != null) {
            m.setBounds(this.c, this.e, n2 - this.d, n - this.f);
        }
    }
    
    int b() {
        return this.g;
    }
    
    public int c() {
        return this.f;
    }
    
    public int d() {
        return this.e;
    }
    
    @k0
    public s e() {
        final LayerDrawable r = this.r;
        if (r != null && r.getNumberOfLayers() > 1) {
            Drawable drawable;
            if (this.r.getNumberOfLayers() > 2) {
                drawable = this.r.getDrawable(2);
            }
            else {
                drawable = this.r.getDrawable(1);
            }
            return (s)drawable;
        }
        return null;
    }
    
    @k0
    j f() {
        return this.g(false);
    }
    
    @k0
    ColorStateList h() {
        return this.l;
    }
    
    @j0
    o i() {
        return this.b;
    }
    
    @k0
    ColorStateList j() {
        return this.k;
    }
    
    int k() {
        return this.h;
    }
    
    ColorStateList l() {
        return this.j;
    }
    
    PorterDuff$Mode m() {
        return this.i;
    }
    
    boolean o() {
        return this.o;
    }
    
    boolean p() {
        return this.q;
    }
    
    void q(@j0 final TypedArray typedArray) {
        this.c = typedArray.getDimensionPixelOffset(o2.a.o.uk, 0);
        this.d = typedArray.getDimensionPixelOffset(o2.a.o.vk, 0);
        this.e = typedArray.getDimensionPixelOffset(o2.a.o.wk, 0);
        this.f = typedArray.getDimensionPixelOffset(o2.a.o.xk, 0);
        final int bk = o2.a.o.Bk;
        if (typedArray.hasValue(bk)) {
            final int dimensionPixelSize = typedArray.getDimensionPixelSize(bk, -1);
            this.g = dimensionPixelSize;
            this.y(this.b.w((float)dimensionPixelSize));
            this.p = true;
        }
        this.h = typedArray.getDimensionPixelSize(o2.a.o.Nk, 0);
        this.i = b0.k(typedArray.getInt(o2.a.o.Ak, -1), PorterDuff$Mode.SRC_IN);
        this.j = com.google.android.material.resources.c.a(this.a.getContext(), typedArray, o2.a.o.zk);
        this.k = com.google.android.material.resources.c.a(this.a.getContext(), typedArray, o2.a.o.Mk);
        this.l = com.google.android.material.resources.c.a(this.a.getContext(), typedArray, o2.a.o.Jk);
        this.q = typedArray.getBoolean(o2.a.o.yk, false);
        this.s = typedArray.getDimensionPixelSize(o2.a.o.Ck, 0);
        final int j0 = androidx.core.view.j0.j0((View)this.a);
        final int paddingTop = this.a.getPaddingTop();
        final int i0 = androidx.core.view.j0.i0((View)this.a);
        final int paddingBottom = this.a.getPaddingBottom();
        if (typedArray.hasValue(o2.a.o.tk)) {
            this.s();
        }
        else {
            this.F();
        }
        androidx.core.view.j0.b2((View)this.a, j0 + this.c, paddingTop + this.e, i0 + this.d, paddingBottom + this.f);
    }
    
    void r(final int tint) {
        if (this.f() != null) {
            this.f().setTint(tint);
        }
    }
    
    void s() {
        this.o = true;
        this.a.setSupportBackgroundTintList(this.j);
        this.a.setSupportBackgroundTintMode(this.i);
    }
    
    void t(final boolean q) {
        this.q = q;
    }
    
    void u(final int g) {
        if (!this.p || this.g != g) {
            this.g = g;
            this.p = true;
            this.y(this.b.w((float)g));
        }
    }
    
    public void v(@q final int n) {
        this.E(this.e, n);
    }
    
    public void w(@q final int n) {
        this.E(n, this.f);
    }
    
    void x(@k0 final ColorStateList l) {
        if (this.l != l) {
            this.l = l;
            final boolean t = com.google.android.material.button.a.t;
            if (t && this.a.getBackground() instanceof RippleDrawable) {
                ((RippleDrawable)this.a.getBackground()).setColor(com.google.android.material.ripple.b.d(l));
            }
            else if (!t && this.a.getBackground() instanceof com.google.android.material.ripple.a) {
                ((com.google.android.material.ripple.a)this.a.getBackground()).setTintList(com.google.android.material.ripple.b.d(l));
            }
        }
    }
    
    void y(@j0 final o b) {
        this.G(this.b = b);
    }
    
    void z(final boolean n) {
        this.n = n;
        this.I();
    }
}
