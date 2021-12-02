// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.widget;

import android.content.Context;
import c.a;
import androidx.annotation.k0;
import android.util.AttributeSet;
import android.os.Build$VERSION;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import androidx.annotation.j0;
import android.view.View;

class f
{
    @j0
    private final View a;
    private final j b;
    private int c;
    private s0 d;
    private s0 e;
    private s0 f;
    
    f(@j0 final View a) {
        this.c = -1;
        this.a = a;
        this.b = j.b();
    }
    
    private boolean a(@j0 final Drawable drawable) {
        if (this.f == null) {
            this.f = new s0();
        }
        final s0 f = this.f;
        f.a();
        final ColorStateList l = androidx.core.view.j0.L(this.a);
        if (l != null) {
            f.d = true;
            f.a = l;
        }
        final PorterDuff$Mode m = androidx.core.view.j0.M(this.a);
        if (m != null) {
            f.c = true;
            f.b = m;
        }
        if (!f.d && !f.c) {
            return false;
        }
        j.j(drawable, f, this.a.getDrawableState());
        return true;
    }
    
    private boolean k() {
        final int sdk_INT = Build$VERSION.SDK_INT;
        boolean b = true;
        if (sdk_INT > 21) {
            if (this.d == null) {
                b = false;
            }
            return b;
        }
        return sdk_INT == 21;
    }
    
    void b() {
        final Drawable background = this.a.getBackground();
        if (background != null) {
            if (this.k() && this.a(background)) {
                return;
            }
            final s0 e = this.e;
            if (e != null) {
                j.j(background, e, this.a.getDrawableState());
            }
            else {
                final s0 d = this.d;
                if (d != null) {
                    j.j(background, d, this.a.getDrawableState());
                }
            }
        }
    }
    
    ColorStateList c() {
        final s0 e = this.e;
        ColorStateList a;
        if (e != null) {
            a = e.a;
        }
        else {
            a = null;
        }
        return a;
    }
    
    PorterDuff$Mode d() {
        final s0 e = this.e;
        PorterDuff$Mode b;
        if (e != null) {
            b = e.b;
        }
        else {
            b = null;
        }
        return b;
    }
    
    void e(@k0 final AttributeSet set, int n) {
        final Context context = this.a.getContext();
        final int[] b8 = c.a.n.b8;
        final u0 g = u0.G(context, set, b8, n, 0);
        final View a = this.a;
        androidx.core.view.j0.x1(a, a.getContext(), b8, set, g.B(), n, 0);
        try {
            n = c.a.n.c8;
            if (g.C(n)) {
                this.c = g.u(n, -1);
                final ColorStateList f = this.b.f(this.a.getContext(), this.c);
                if (f != null) {
                    this.h(f);
                }
            }
            n = c.a.n.d8;
            if (g.C(n)) {
                androidx.core.view.j0.H1(this.a, g.d(n));
            }
            n = c.a.n.e8;
            if (g.C(n)) {
                androidx.core.view.j0.I1(this.a, b0.e(g.o(n, -1), null));
            }
        }
        finally {
            g.I();
        }
    }
    
    void f(final Drawable drawable) {
        this.c = -1;
        this.h(null);
        this.b();
    }
    
    void g(final int c) {
        this.c = c;
        final j b = this.b;
        ColorStateList f;
        if (b != null) {
            f = b.f(this.a.getContext(), c);
        }
        else {
            f = null;
        }
        this.h(f);
        this.b();
    }
    
    void h(final ColorStateList a) {
        if (a != null) {
            if (this.d == null) {
                this.d = new s0();
            }
            final s0 d = this.d;
            d.a = a;
            d.d = true;
        }
        else {
            this.d = null;
        }
        this.b();
    }
    
    void i(final ColorStateList a) {
        if (this.e == null) {
            this.e = new s0();
        }
        final s0 e = this.e;
        e.a = a;
        e.d = true;
        this.b();
    }
    
    void j(final PorterDuff$Mode b) {
        if (this.e == null) {
            this.e = new s0();
        }
        final s0 e = this.e;
        e.b = b;
        e.c = true;
        this.b();
    }
}
