// 
// Decompiled by Procyon v0.5.36
// 

package androidx.recyclerview.widget;

import android.graphics.PointF;
import androidx.annotation.j0;
import android.view.View;
import androidx.annotation.k0;

public class t extends e0
{
    private static final float g = 1.0f;
    @k0
    private androidx.recyclerview.widget.z e;
    @k0
    private androidx.recyclerview.widget.z f;
    
    private float m(final p p2, final androidx.recyclerview.widget.z z) {
        final int q = p2.Q();
        if (q == 0) {
            return 1.0f;
        }
        int i = 0;
        View view = null;
        View view2 = null;
        int n = Integer.MAX_VALUE;
        int n2 = Integer.MIN_VALUE;
        while (i < q) {
            final View p3 = p2.P(i);
            final int s0 = p2.s0(p3);
            View view3;
            int n3;
            if (s0 == -1) {
                view3 = view;
                n3 = n2;
            }
            else {
                int n4;
                if (s0 < (n4 = n)) {
                    view = p3;
                    n4 = s0;
                }
                view3 = view;
                n = n4;
                if (s0 > (n3 = n2)) {
                    view2 = p3;
                    n3 = s0;
                    n = n4;
                    view3 = view;
                }
            }
            ++i;
            view = view3;
            n2 = n3;
        }
        if (view == null || view2 == null) {
            return 1.0f;
        }
        final int n5 = Math.max(z.d(view), z.d(view2)) - Math.min(z.g(view), z.g(view2));
        if (n5 == 0) {
            return 1.0f;
        }
        return n5 * 1.0f / (n2 - n + 1);
    }
    
    private int n(@j0 final View view, final androidx.recyclerview.widget.z z) {
        return z.g(view) + z.e(view) / 2 - (z.n() + z.o() / 2);
    }
    
    private int o(final p p4, final androidx.recyclerview.widget.z z, int n, final int n2) {
        final int[] d = this.d(n, n2);
        final float m = this.m(p4, z);
        if (m <= 0.0f) {
            return 0;
        }
        if (Math.abs(d[0]) > Math.abs(d[1])) {
            n = d[0];
        }
        else {
            n = d[1];
        }
        return Math.round(n / m);
    }
    
    @k0
    private View p(final p p2, final androidx.recyclerview.widget.z z) {
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
    private androidx.recyclerview.widget.z q(@j0 final p p) {
        final androidx.recyclerview.widget.z f = this.f;
        if (f == null || f.a != p) {
            this.f = androidx.recyclerview.widget.z.a(p);
        }
        return this.f;
    }
    
    @j0
    private androidx.recyclerview.widget.z r(@j0 final p p) {
        final androidx.recyclerview.widget.z e = this.e;
        if (e == null || e.a != p) {
            this.e = androidx.recyclerview.widget.z.c(p);
        }
        return this.e;
    }
    
    @Override
    public int[] c(@j0 final p p2, @j0 final View view) {
        final int[] array = new int[2];
        if (p2.n()) {
            array[0] = this.n(view, this.q(p2));
        }
        else {
            array[0] = 0;
        }
        if (p2.o()) {
            array[1] = this.n(view, this.r(p2));
        }
        else {
            array[1] = 0;
        }
        return array;
    }
    
    @Override
    public View h(final p p) {
        androidx.recyclerview.widget.z z;
        if (p.o()) {
            z = this.r(p);
        }
        else {
            if (!p.n()) {
                return null;
            }
            z = this.q(p);
        }
        return this.p(p, z);
    }
    
    @Override
    public int i(final p p3, int o, int o2) {
        if (!(p3 instanceof c0.b)) {
            return -1;
        }
        final int g0 = p3.g0();
        if (g0 == 0) {
            return -1;
        }
        final View h = this.h(p3);
        if (h == null) {
            return -1;
        }
        final int s0 = p3.s0(h);
        if (s0 == -1) {
            return -1;
        }
        final c0.b b = (c0.b)p3;
        final int n = g0 - 1;
        final PointF a = b.a(n);
        if (a == null) {
            return -1;
        }
        final boolean n2 = p3.n();
        final int n3 = 0;
        if (n2) {
            final int n4 = o = this.o(p3, this.q(p3), o, 0);
            if (a.x < 0.0f) {
                o = -n4;
            }
        }
        else {
            o = 0;
        }
        if (p3.o()) {
            final int n5 = o2 = this.o(p3, this.r(p3), 0, o2);
            if (a.y < 0.0f) {
                o2 = -n5;
            }
        }
        else {
            o2 = 0;
        }
        if (p3.o()) {
            o = o2;
        }
        if (o == 0) {
            return -1;
        }
        o += s0;
        if (o < 0) {
            o = n3;
        }
        if (o >= g0) {
            o = n;
        }
        return o;
    }
}
