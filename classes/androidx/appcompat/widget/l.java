// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.widget;

import android.content.Context;
import android.view.View;
import c.a;
import android.util.AttributeSet;
import android.graphics.drawable.RippleDrawable;
import android.os.Build$VERSION;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import androidx.core.widget.k;
import android.graphics.drawable.Drawable;
import androidx.annotation.j0;
import android.widget.ImageView;
import androidx.annotation.t0;

@t0({ t0.a.I })
public class l
{
    @j0
    private final ImageView a;
    private s0 b;
    private s0 c;
    private s0 d;
    
    public l(@j0 final ImageView a) {
        this.a = a;
    }
    
    private boolean a(@j0 final Drawable drawable) {
        if (this.d == null) {
            this.d = new s0();
        }
        final s0 d = this.d;
        d.a();
        final ColorStateList a = k.a(this.a);
        if (a != null) {
            d.d = true;
            d.a = a;
        }
        final PorterDuff$Mode b = k.b(this.a);
        if (b != null) {
            d.c = true;
            d.b = b;
        }
        if (!d.d && !d.c) {
            return false;
        }
        j.j(drawable, d, this.a.getDrawableState());
        return true;
    }
    
    private boolean k() {
        final int sdk_INT = Build$VERSION.SDK_INT;
        boolean b = true;
        if (sdk_INT > 21) {
            if (this.b == null) {
                b = false;
            }
            return b;
        }
        return sdk_INT == 21;
    }
    
    void b() {
        final Drawable drawable = this.a.getDrawable();
        if (drawable != null) {
            b0.b(drawable);
        }
        if (drawable != null) {
            if (this.k() && this.a(drawable)) {
                return;
            }
            final s0 c = this.c;
            if (c != null) {
                j.j(drawable, c, this.a.getDrawableState());
            }
            else {
                final s0 b = this.b;
                if (b != null) {
                    j.j(drawable, b, this.a.getDrawableState());
                }
            }
        }
    }
    
    ColorStateList c() {
        final s0 c = this.c;
        ColorStateList a;
        if (c != null) {
            a = c.a;
        }
        else {
            a = null;
        }
        return a;
    }
    
    PorterDuff$Mode d() {
        final s0 c = this.c;
        PorterDuff$Mode b;
        if (c != null) {
            b = c.b;
        }
        else {
            b = null;
        }
        return b;
    }
    
    boolean e() {
        final Drawable background = this.a.getBackground();
        return Build$VERSION.SDK_INT < 21 || !(background instanceof RippleDrawable);
    }
    
    public void f(final AttributeSet set, int n) {
        final Context context = this.a.getContext();
        final int[] r0 = c.a.n.r0;
        final u0 g = u0.G(context, set, r0, n, 0);
        final ImageView a = this.a;
        androidx.core.view.j0.x1((View)a, a.getContext(), r0, set, g.B(), n, 0);
        try {
            Drawable drawable2;
            final Drawable drawable = drawable2 = this.a.getDrawable();
            if (drawable == null) {
                n = g.u(c.a.n.t0, -1);
                drawable2 = drawable;
                if (n != -1) {
                    final Drawable d = androidx.appcompat.content.res.a.d(this.a.getContext(), n);
                    if ((drawable2 = d) != null) {
                        this.a.setImageDrawable(d);
                        drawable2 = d;
                    }
                }
            }
            if (drawable2 != null) {
                b0.b(drawable2);
            }
            n = c.a.n.u0;
            if (g.C(n)) {
                k.c(this.a, g.d(n));
            }
            n = c.a.n.v0;
            if (g.C(n)) {
                k.d(this.a, b0.e(g.o(n, -1), null));
            }
        }
        finally {
            g.I();
        }
    }
    
    public void g(final int n) {
        if (n != 0) {
            final Drawable d = androidx.appcompat.content.res.a.d(this.a.getContext(), n);
            if (d != null) {
                b0.b(d);
            }
            this.a.setImageDrawable(d);
        }
        else {
            this.a.setImageDrawable((Drawable)null);
        }
        this.b();
    }
    
    void h(final ColorStateList a) {
        if (a != null) {
            if (this.b == null) {
                this.b = new s0();
            }
            final s0 b = this.b;
            b.a = a;
            b.d = true;
        }
        else {
            this.b = null;
        }
        this.b();
    }
    
    void i(final ColorStateList a) {
        if (this.c == null) {
            this.c = new s0();
        }
        final s0 c = this.c;
        c.a = a;
        c.d = true;
        this.b();
    }
    
    void j(final PorterDuff$Mode b) {
        if (this.c == null) {
            this.c = new s0();
        }
        final s0 c = this.c;
        c.b = b;
        c.c = true;
        this.b();
    }
}
