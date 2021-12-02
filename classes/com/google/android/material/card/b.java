// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.card;

import androidx.annotation.l;
import androidx.annotation.p0;
import androidx.annotation.t;
import android.view.View;
import com.google.android.material.resources.c;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.shape.f;
import com.google.android.material.shape.n;
import com.google.android.material.shape.e;
import android.graphics.drawable.InsetDrawable;
import android.os.Build$VERSION;
import android.content.res.TypedArray;
import androidx.annotation.x0;
import android.util.AttributeSet;
import android.graphics.drawable.LayerDrawable;
import com.google.android.material.shape.o;
import android.content.res.ColorStateList;
import androidx.annotation.k0;
import android.graphics.drawable.Drawable;
import androidx.annotation.q;
import com.google.android.material.shape.j;
import android.graphics.Rect;
import androidx.annotation.j0;
import androidx.annotation.t0;

@t0({ t0.a.H })
class b
{
    private static final int[] t;
    private static final int u = -1;
    private static final double v;
    private static final float w = 1.5f;
    private static final int x = 2;
    @j0
    private final a a;
    @j0
    private final Rect b;
    @j0
    private final j c;
    @j0
    private final j d;
    @q
    private int e;
    @q
    private int f;
    @q
    private int g;
    @k0
    private Drawable h;
    @k0
    private Drawable i;
    @k0
    private ColorStateList j;
    @k0
    private ColorStateList k;
    @k0
    private o l;
    @k0
    private ColorStateList m;
    @k0
    private Drawable n;
    @k0
    private LayerDrawable o;
    @k0
    private j p;
    @k0
    private j q;
    private boolean r;
    private boolean s;
    
    static {
        t = new int[] { 16842912 };
        v = Math.cos(Math.toRadians(45.0));
    }
    
    public b(@j0 final a a, final AttributeSet set, int z4, @x0 final int n) {
        this.b = new Rect();
        this.r = false;
        this.a = a;
        final j c = new j(a.getContext(), set, z4, n);
        (this.c = c).Y(a.getContext());
        c.u0(-12303292);
        final o.b v = c.getShapeAppearanceModel().v();
        final TypedArray obtainStyledAttributes = a.getContext().obtainStyledAttributes(set, o2.a.o.V4, z4, o2.a.n.u3);
        z4 = o2.a.o.Z4;
        if (obtainStyledAttributes.hasValue(z4)) {
            v.o(obtainStyledAttributes.getDimension(z4, 0.0f));
        }
        this.d = new j();
        this.R(v.m());
        obtainStyledAttributes.recycle();
    }
    
    @j0
    private Drawable B(final Drawable drawable) {
        int n;
        int n2;
        if (Build$VERSION.SDK_INT >= 21 && !this.a.getUseCompatPadding()) {
            n = 0;
            n2 = 0;
        }
        else {
            n2 = (int)Math.ceil(this.d());
            n = (int)Math.ceil(this.c());
        }
        return (Drawable)new InsetDrawable(drawable, n, n2, n, n2) {
            public int getMinimumHeight() {
                return -1;
            }
            
            public int getMinimumWidth() {
                return -1;
            }
            
            public boolean getPadding(final Rect rect) {
                return false;
            }
        };
    }
    
    private boolean V() {
        return this.a.getPreventCornerOverlap() && !this.e();
    }
    
    private boolean W() {
        return this.a.getPreventCornerOverlap() && this.e() && this.a.getUseCompatPadding();
    }
    
    private float a() {
        return Math.max(Math.max(this.b(this.l.q(), this.c.R()), this.b(this.l.s(), this.c.S())), Math.max(this.b(this.l.k(), this.c.u()), this.b(this.l.i(), this.c.t())));
    }
    
    private void a0(final Drawable drawable) {
        if (Build$VERSION.SDK_INT >= 23 && this.a.getForeground() instanceof InsetDrawable) {
            ((InsetDrawable)this.a.getForeground()).setDrawable(drawable);
        }
        else {
            this.a.setForeground(this.B(drawable));
        }
    }
    
    private float b(final e e, final float n) {
        if (e instanceof n) {
            return (float)((1.0 - com.google.android.material.card.b.v) * n);
        }
        if (e instanceof f) {
            return n / 2.0f;
        }
        return 0.0f;
    }
    
    private float c() {
        final float maxCardElevation = this.a.getMaxCardElevation();
        float a;
        if (this.W()) {
            a = this.a();
        }
        else {
            a = 0.0f;
        }
        return maxCardElevation + a;
    }
    
    private void c0() {
        if (com.google.android.material.ripple.b.a) {
            final Drawable n = this.n;
            if (n != null) {
                ((RippleDrawable)n).setColor(this.j);
                return;
            }
        }
        final j p = this.p;
        if (p != null) {
            p.n0(this.j);
        }
    }
    
    private float d() {
        final float maxCardElevation = this.a.getMaxCardElevation();
        float a;
        if (this.W()) {
            a = this.a();
        }
        else {
            a = 0.0f;
        }
        return maxCardElevation * 1.5f + a;
    }
    
    private boolean e() {
        return Build$VERSION.SDK_INT >= 21 && this.c.d0();
    }
    
    @j0
    private Drawable f() {
        final StateListDrawable stateListDrawable = new StateListDrawable();
        final Drawable i = this.i;
        if (i != null) {
            stateListDrawable.addState(com.google.android.material.card.b.t, i);
        }
        return (Drawable)stateListDrawable;
    }
    
    @j0
    private Drawable g() {
        final StateListDrawable stateListDrawable = new StateListDrawable();
        (this.p = this.i()).n0(this.j);
        stateListDrawable.addState(new int[] { 16842919 }, (Drawable)this.p);
        return (Drawable)stateListDrawable;
    }
    
    @j0
    private Drawable h() {
        if (com.google.android.material.ripple.b.a) {
            this.q = this.i();
            return (Drawable)new RippleDrawable(this.j, (Drawable)null, (Drawable)this.q);
        }
        return this.g();
    }
    
    @j0
    private j i() {
        return new j(this.l);
    }
    
    @j0
    private Drawable r() {
        if (this.n == null) {
            this.n = this.h();
        }
        if (this.o == null) {
            (this.o = new LayerDrawable(new Drawable[] { this.n, this.d, this.f() })).setId(2, o2.a.h.a3);
        }
        return (Drawable)this.o;
    }
    
    private float t() {
        if (this.a.getPreventCornerOverlap() && (Build$VERSION.SDK_INT < 21 || this.a.getUseCompatPadding())) {
            return (float)((1.0 - com.google.android.material.card.b.v) * this.a.getCardViewRadius());
        }
        return 0.0f;
    }
    
    @j0
    Rect A() {
        return this.b;
    }
    
    boolean C() {
        return this.r;
    }
    
    boolean D() {
        return this.s;
    }
    
    void E(@j0 final TypedArray typedArray) {
        final ColorStateList a = com.google.android.material.resources.c.a(this.a.getContext(), typedArray, o2.a.o.zl);
        this.m = a;
        if (a == null) {
            this.m = ColorStateList.valueOf(-1);
        }
        this.g = typedArray.getDimensionPixelSize(o2.a.o.Al, 0);
        final boolean boolean1 = typedArray.getBoolean(o2.a.o.pl, false);
        this.s = boolean1;
        this.a.setLongClickable(boolean1);
        this.k = com.google.android.material.resources.c.a(this.a.getContext(), typedArray, o2.a.o.ul);
        this.K(com.google.android.material.resources.c.d(this.a.getContext(), typedArray, o2.a.o.rl));
        this.M(typedArray.getDimensionPixelSize(o2.a.o.tl, 0));
        this.L(typedArray.getDimensionPixelSize(o2.a.o.sl, 0));
        if ((this.j = com.google.android.material.resources.c.a(this.a.getContext(), typedArray, o2.a.o.vl)) == null) {
            this.j = ColorStateList.valueOf(s2.a.d((View)this.a, o2.a.c.A2));
        }
        this.I(com.google.android.material.resources.c.a(this.a.getContext(), typedArray, o2.a.o.ql));
        this.c0();
        this.Z();
        this.d0();
        this.a.setBackgroundInternal(this.B(this.c));
        Drawable h;
        if (this.a.isClickable()) {
            h = this.r();
        }
        else {
            h = this.d;
        }
        this.h = h;
        this.a.setForeground(this.B(h));
    }
    
    void F(int n, int n2) {
        if (this.o != null) {
            final int e = this.e;
            final int f = this.f;
            final int n3 = n - e - f;
            final int n4 = n2 - e - f;
            if (Build$VERSION.SDK_INT < 21) {
                n = 1;
            }
            else {
                n = 0;
            }
            Label_0096: {
                if (n == 0) {
                    n = n3;
                    n2 = n4;
                    if (!this.a.getUseCompatPadding()) {
                        break Label_0096;
                    }
                }
                n2 = n4 - (int)Math.ceil(this.d() * 2.0f);
                n = n3 - (int)Math.ceil(this.c() * 2.0f);
            }
            int e2 = this.e;
            int n5;
            if (androidx.core.view.j0.X((View)this.a) == 1) {
                n5 = e2;
                e2 = n;
            }
            else {
                n5 = n;
            }
            this.o.setLayerInset(2, n5, this.e, e2, n2);
        }
    }
    
    void G(final boolean r) {
        this.r = r;
    }
    
    void H(final ColorStateList list) {
        this.c.n0(list);
    }
    
    void I(@k0 final ColorStateList list) {
        final j d = this.d;
        ColorStateList value = list;
        if (list == null) {
            value = ColorStateList.valueOf(0);
        }
        d.n0(value);
    }
    
    void J(final boolean s) {
        this.s = s;
    }
    
    void K(@k0 Drawable drawable) {
        this.i = drawable;
        if (drawable != null) {
            drawable = androidx.core.graphics.drawable.c.r(drawable.mutate());
            androidx.core.graphics.drawable.c.o(this.i = drawable, this.k);
        }
        if (this.o != null) {
            drawable = this.f();
            this.o.setDrawableByLayerId(o2.a.h.a3, drawable);
        }
    }
    
    void L(@q final int e) {
        this.e = e;
    }
    
    void M(@q final int f) {
        this.f = f;
    }
    
    void N(@k0 final ColorStateList k) {
        this.k = k;
        final Drawable i = this.i;
        if (i != null) {
            androidx.core.graphics.drawable.c.o(i, k);
        }
    }
    
    void O(final float n) {
        this.R(this.l.w(n));
        this.h.invalidateSelf();
        if (this.W() || this.V()) {
            this.Y();
        }
        if (this.W()) {
            this.b0();
        }
    }
    
    void P(@t(from = 0.0, to = 1.0) final float n) {
        this.c.o0(n);
        final j d = this.d;
        if (d != null) {
            d.o0(n);
        }
        final j q = this.q;
        if (q != null) {
            q.o0(n);
        }
    }
    
    void Q(@k0 final ColorStateList j) {
        this.j = j;
        this.c0();
    }
    
    void R(@j0 final o shapeAppearanceModel) {
        this.l = shapeAppearanceModel;
        this.c.setShapeAppearanceModel(shapeAppearanceModel);
        final j c = this.c;
        c.t0(c.d0() ^ true);
        final j d = this.d;
        if (d != null) {
            d.setShapeAppearanceModel(shapeAppearanceModel);
        }
        final j q = this.q;
        if (q != null) {
            q.setShapeAppearanceModel(shapeAppearanceModel);
        }
        final j p = this.p;
        if (p != null) {
            p.setShapeAppearanceModel(shapeAppearanceModel);
        }
    }
    
    void S(final ColorStateList m) {
        if (this.m == m) {
            return;
        }
        this.m = m;
        this.d0();
    }
    
    void T(@q final int g) {
        if (g == this.g) {
            return;
        }
        this.g = g;
        this.d0();
    }
    
    void U(final int n, final int n2, final int n3, final int n4) {
        this.b.set(n, n2, n3, n4);
        this.Y();
    }
    
    void X() {
        final Drawable h = this.h;
        Drawable h2;
        if (this.a.isClickable()) {
            h2 = this.r();
        }
        else {
            h2 = this.d;
        }
        this.h = h2;
        if (h != h2) {
            this.a0(h2);
        }
    }
    
    void Y() {
        float a;
        if (this.V() || this.W()) {
            a = this.a();
        }
        else {
            a = 0.0f;
        }
        final int n = (int)(a - this.t());
        final a a2 = this.a;
        final Rect b = this.b;
        a2.m(b.left + n, b.top + n, b.right + n, b.bottom + n);
    }
    
    void Z() {
        this.c.m0(this.a.getCardElevation());
    }
    
    void b0() {
        if (!this.C()) {
            this.a.setBackgroundInternal(this.B(this.c));
        }
        this.a.setForeground(this.B(this.h));
    }
    
    void d0() {
        this.d.D0((float)this.g, this.m);
    }
    
    @p0(api = 23)
    void j() {
        final Drawable n = this.n;
        if (n != null) {
            final Rect bounds = n.getBounds();
            final int bottom = bounds.bottom;
            this.n.setBounds(bounds.left, bounds.top, bounds.right, bottom - 1);
            this.n.setBounds(bounds.left, bounds.top, bounds.right, bottom);
        }
    }
    
    @j0
    j k() {
        return this.c;
    }
    
    ColorStateList l() {
        return this.c.y();
    }
    
    ColorStateList m() {
        return this.d.y();
    }
    
    @k0
    Drawable n() {
        return this.i;
    }
    
    @q
    int o() {
        return this.e;
    }
    
    @q
    int p() {
        return this.f;
    }
    
    @k0
    ColorStateList q() {
        return this.k;
    }
    
    float s() {
        return this.c.R();
    }
    
    @t(from = 0.0, to = 1.0)
    float u() {
        return this.c.z();
    }
    
    @k0
    ColorStateList v() {
        return this.j;
    }
    
    o w() {
        return this.l;
    }
    
    @l
    int x() {
        final ColorStateList m = this.m;
        int defaultColor;
        if (m == null) {
            defaultColor = -1;
        }
        else {
            defaultColor = m.getDefaultColor();
        }
        return defaultColor;
    }
    
    @k0
    ColorStateList y() {
        return this.m;
    }
    
    @q
    int z() {
        return this.g;
    }
}
