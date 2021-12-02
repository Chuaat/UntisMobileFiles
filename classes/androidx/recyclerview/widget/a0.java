// 
// Decompiled by Procyon v0.5.36
// 

package androidx.recyclerview.widget;

import android.util.DisplayMetrics;
import android.view.animation.Interpolator;
import android.content.Context;
import android.graphics.PointF;
import androidx.annotation.j0;
import android.view.View;
import androidx.annotation.k0;

public class a0 extends e0
{
    private static final int g = 100;
    @k0
    private androidx.recyclerview.widget.z e;
    @k0
    private androidx.recyclerview.widget.z f;
    
    private int m(@j0 final View view, final androidx.recyclerview.widget.z z) {
        return z.g(view) + z.e(view) / 2 - (z.n() + z.o() / 2);
    }
    
    @k0
    private View n(final p p2, final androidx.recyclerview.widget.z z) {
        final int q = p2.Q();
        View view = null;
        if (q == 0) {
            return null;
        }
        final int n = z.n();
        final int n2 = z.o() / 2;
        int n3 = Integer.MAX_VALUE;
        int n4;
        for (int i = 0; i < q; ++i, n3 = n4) {
            final View p3 = p2.P(i);
            final int abs = Math.abs(z.g(p3) + z.e(p3) / 2 - (n + n2));
            if (abs < (n4 = n3)) {
                view = p3;
                n4 = abs;
            }
        }
        return view;
    }
    
    @j0
    private androidx.recyclerview.widget.z o(@j0 final p p) {
        final androidx.recyclerview.widget.z f = this.f;
        if (f == null || f.a != p) {
            this.f = androidx.recyclerview.widget.z.a(p);
        }
        return this.f;
    }
    
    @k0
    private androidx.recyclerview.widget.z p(final p p) {
        if (p.o()) {
            return this.q(p);
        }
        if (p.n()) {
            return this.o(p);
        }
        return null;
    }
    
    @j0
    private androidx.recyclerview.widget.z q(@j0 final p p) {
        final androidx.recyclerview.widget.z e = this.e;
        if (e == null || e.a != p) {
            this.e = androidx.recyclerview.widget.z.c(p);
        }
        return this.e;
    }
    
    private boolean r(final p p3, final int n, final int n2) {
        final boolean n3 = p3.n();
        final boolean b = true;
        boolean b2 = true;
        if (n3) {
            if (n <= 0) {
                b2 = false;
            }
            return b2;
        }
        return n2 > 0 && b;
    }
    
    private boolean s(final p p) {
        final int g0 = p.g0();
        final boolean b = p instanceof c0.b;
        boolean b3;
        final boolean b2 = b3 = false;
        if (b) {
            final PointF a = ((c0.b)p).a(g0 - 1);
            b3 = b2;
            if (a != null) {
                if (a.x >= 0.0f) {
                    b3 = b2;
                    if (a.y >= 0.0f) {
                        return b3;
                    }
                }
                b3 = true;
            }
        }
        return b3;
    }
    
    @k0
    @Override
    public int[] c(@j0 final p p2, @j0 final View view) {
        final int[] array = new int[2];
        if (p2.n()) {
            array[0] = this.m(view, this.o(p2));
        }
        else {
            array[0] = 0;
        }
        if (p2.o()) {
            array[1] = this.m(view, this.q(p2));
        }
        else {
            array[1] = 0;
        }
        return array;
    }
    
    @k0
    @Override
    protected c0 e(@j0 final p p) {
        if (!(p instanceof c0.b)) {
            return null;
        }
        return new androidx.recyclerview.widget.s(super.a.getContext()) {
            @Override
            protected void p(final View view, final d0 d0, final c0.a a) {
                final a0 x = a0.this;
                final int[] c = x.c(x.a.getLayoutManager(), view);
                final int a2 = c[0];
                final int a3 = c[1];
                final int x2 = this.x(Math.max(Math.abs(a2), Math.abs(a3)));
                if (x2 > 0) {
                    a.l(a2, a3, x2, (Interpolator)super.j);
                }
            }
            
            @Override
            protected float w(final DisplayMetrics displayMetrics) {
                return 100.0f / displayMetrics.densityDpi;
            }
            
            @Override
            protected int y(final int n) {
                return Math.min(100, super.y(n));
            }
        };
    }
    
    @k0
    @Override
    public View h(final p p) {
        androidx.recyclerview.widget.z z;
        if (p.o()) {
            z = this.q(p);
        }
        else {
            if (!p.n()) {
                return null;
            }
            z = this.o(p);
        }
        return this.n(p, z);
    }
    
    @Override
    public int i(final p p3, int n, int s0) {
        final int g0 = p3.g0();
        if (g0 == 0) {
            return -1;
        }
        final androidx.recyclerview.widget.z p4 = this.p(p3);
        if (p4 == null) {
            return -1;
        }
        int n2 = Integer.MIN_VALUE;
        int n3 = Integer.MAX_VALUE;
        final int q = p3.Q();
        int i = 0;
        View view = null;
        View view2 = null;
        while (i < q) {
            final View p5 = p3.P(i);
            int n4;
            View view3;
            if (p5 == null) {
                n4 = n3;
                view3 = view;
            }
            else {
                final int m = this.m(p5, p4);
                int n5 = n2;
                View view4 = view2;
                if (m <= 0) {
                    n5 = n2;
                    view4 = view2;
                    if (m > n2) {
                        view4 = p5;
                        n5 = m;
                    }
                }
                n2 = n5;
                n4 = n3;
                view3 = view;
                view2 = view4;
                if (m >= 0) {
                    n2 = n5;
                    n4 = n3;
                    view3 = view;
                    view2 = view4;
                    if (m < n3) {
                        view2 = view4;
                        view3 = p5;
                        n4 = m;
                        n2 = n5;
                    }
                }
            }
            ++i;
            n3 = n4;
            view = view3;
        }
        final boolean r = this.r(p3, n, s0);
        if (r && view != null) {
            return p3.s0(view);
        }
        if (!r && view2 != null) {
            return p3.s0(view2);
        }
        if (r) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        s0 = p3.s0(view);
        if (this.s(p3) == r) {
            n = -1;
        }
        else {
            n = 1;
        }
        n += s0;
        if (n >= 0 && n < g0) {
            return n;
        }
        return -1;
    }
}
