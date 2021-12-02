// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.widget;

import android.graphics.drawable.Drawable$Callback;
import androidx.annotation.k0;
import android.graphics.Canvas;
import android.content.Context;
import android.view.View;
import androidx.core.view.j0;
import c.a;
import android.util.AttributeSet;
import androidx.core.graphics.drawable.c;
import android.widget.ProgressBar;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.widget.SeekBar;

class t extends o
{
    private final SeekBar d;
    private Drawable e;
    private ColorStateList f;
    private PorterDuff$Mode g;
    private boolean h;
    private boolean i;
    
    t(final SeekBar d) {
        super((ProgressBar)d);
        this.f = null;
        this.g = null;
        this.h = false;
        this.i = false;
        this.d = d;
    }
    
    private void f() {
        final Drawable e = this.e;
        if (e != null && (this.h || this.i)) {
            final Drawable r = androidx.core.graphics.drawable.c.r(e.mutate());
            this.e = r;
            if (this.h) {
                androidx.core.graphics.drawable.c.o(r, this.f);
            }
            if (this.i) {
                androidx.core.graphics.drawable.c.p(this.e, this.g);
            }
            if (this.e.isStateful()) {
                this.e.setState(this.d.getDrawableState());
            }
        }
    }
    
    @Override
    void c(final AttributeSet set, int n) {
        super.c(set, n);
        final Context context = this.d.getContext();
        final int[] w0 = c.a.n.w0;
        final u0 g = u0.G(context, set, w0, n, 0);
        final SeekBar d = this.d;
        j0.x1((View)d, d.getContext(), w0, set, g.B(), n, 0);
        final Drawable i = g.i(c.a.n.x0);
        if (i != null) {
            this.d.setThumb(i);
        }
        this.m(g.h(c.a.n.y0));
        n = c.a.n.A0;
        if (g.C(n)) {
            this.g = b0.e(g.o(n, -1), this.g);
            this.i = true;
        }
        n = c.a.n.z0;
        if (g.C(n)) {
            this.f = g.d(n);
            this.h = true;
        }
        g.I();
        this.f();
    }
    
    void g(final Canvas canvas) {
        if (this.e != null) {
            final int max = this.d.getMax();
            int n = 1;
            if (max > 1) {
                final int intrinsicWidth = this.e.getIntrinsicWidth();
                final int intrinsicHeight = this.e.getIntrinsicHeight();
                int n2;
                if (intrinsicWidth >= 0) {
                    n2 = intrinsicWidth / 2;
                }
                else {
                    n2 = 1;
                }
                if (intrinsicHeight >= 0) {
                    n = intrinsicHeight / 2;
                }
                this.e.setBounds(-n2, -n, n2, n);
                final float n3 = (this.d.getWidth() - this.d.getPaddingLeft() - this.d.getPaddingRight()) / (float)max;
                final int save = canvas.save();
                canvas.translate((float)this.d.getPaddingLeft(), (float)(this.d.getHeight() / 2));
                for (int i = 0; i <= max; ++i) {
                    this.e.draw(canvas);
                    canvas.translate(n3, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
    
    void h() {
        final Drawable e = this.e;
        if (e != null && e.isStateful() && e.setState(this.d.getDrawableState())) {
            this.d.invalidateDrawable(e);
        }
    }
    
    @k0
    Drawable i() {
        return this.e;
    }
    
    @k0
    ColorStateList j() {
        return this.f;
    }
    
    @k0
    PorterDuff$Mode k() {
        return this.g;
    }
    
    void l() {
        final Drawable e = this.e;
        if (e != null) {
            e.jumpToCurrentState();
        }
    }
    
    void m(@k0 final Drawable e) {
        final Drawable e2 = this.e;
        if (e2 != null) {
            e2.setCallback((Drawable$Callback)null);
        }
        if ((this.e = e) != null) {
            e.setCallback((Drawable$Callback)this.d);
            androidx.core.graphics.drawable.c.m(e, j0.X((View)this.d));
            if (e.isStateful()) {
                e.setState(this.d.getDrawableState());
            }
            this.f();
        }
        this.d.invalidate();
    }
    
    void n(@k0 final ColorStateList f) {
        this.f = f;
        this.h = true;
        this.f();
    }
    
    void o(@k0 final PorterDuff$Mode g) {
        this.g = g;
        this.i = true;
        this.f();
    }
}
