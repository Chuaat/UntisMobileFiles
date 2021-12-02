// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core.widgets.analyzer;

import java.util.List;
import androidx.constraintlayout.core.widgets.i;
import androidx.constraintlayout.core.widgets.e;

public class l extends p
{
    private static int[] k;
    
    static {
        l.k = new int[2];
    }
    
    public l(final e e) {
        super(e);
        super.h.e = androidx.constraintlayout.core.widgets.analyzer.f.a.J;
        super.i.e = androidx.constraintlayout.core.widgets.analyzer.f.a.K;
        super.f = 0;
    }
    
    private void u(final int[] array, int n, int n2, int n3, int n4, final float n5, final int n6) {
        n = n2 - n;
        n2 = n4 - n3;
        if (n6 != -1) {
            if (n6 != 0) {
                if (n6 == 1) {
                    n2 = (int)(n * n5 + 0.5f);
                    array[0] = n;
                    array[1] = n2;
                }
            }
            else {
                array[0] = (int)(n2 * n5 + 0.5f);
                array[1] = n2;
            }
        }
        else {
            n3 = (int)(n2 * n5 + 0.5f);
            n4 = (int)(n / n5 + 0.5f);
            if (n3 <= n) {
                array[0] = n3;
                array[1] = n2;
            }
            else if (n4 <= n2) {
                array[0] = n;
                array[1] = n4;
            }
        }
    }
    
    @Override
    public void a(final d d) {
        final int n = l$a.a[super.j.ordinal()];
        if (n != 1) {
            if (n != 2) {
                if (n == 3) {
                    final e b = super.b;
                    this.q(d, b.Q, b.S, 0);
                    return;
                }
            }
            else {
                this.r(d);
            }
        }
        else {
            this.s(d);
        }
        Label_1481: {
            if (!super.e.j && super.d == androidx.constraintlayout.core.widgets.e.b.I) {
                final e b2 = super.b;
                final int w = b2.w;
                int n17 = 0;
                Label_0207: {
                    if (w != 2) {
                        if (w != 3) {
                            break Label_1481;
                        }
                        final int x = b2.x;
                        if (x == 0 || x == 3) {
                            final n f = b2.f;
                            final f h = f.h;
                            final f i = f.i;
                            final boolean b3 = b2.Q.f != null;
                            final boolean b4 = b2.R.f != null;
                            final boolean b5 = b2.S.f != null;
                            final boolean b6 = b2.T.f != null;
                            final int b7 = b2.B();
                            g g;
                            int n2 = 0;
                            if (b3 && b4 && b5 && b6) {
                                final float a = super.b.A();
                                if (h.j && i.j) {
                                    final f h2 = super.h;
                                    if (h2.c) {
                                        if (super.i.c) {
                                            this.u(l.k, h2.l.get(0).g + super.h.f, super.i.l.get(0).g - super.i.f, h.g + h.f, i.g - i.f, a, b7);
                                            super.e.e(l.k[0]);
                                            super.b.f.e.e(l.k[1]);
                                        }
                                    }
                                    return;
                                }
                                final f h3 = super.h;
                                if (h3.j) {
                                    final f j = super.i;
                                    if (j.j) {
                                        if (!h.c || !i.c) {
                                            return;
                                        }
                                        this.u(l.k, h3.g + h3.f, j.g - j.f, h.l.get(0).g + h.f, i.l.get(0).g - i.f, a, b7);
                                        super.e.e(l.k[0]);
                                        super.b.f.e.e(l.k[1]);
                                    }
                                }
                                final f h4 = super.h;
                                if (!h4.c || !super.i.c || !h.c || !i.c) {
                                    return;
                                }
                                this.u(l.k, h4.l.get(0).g + super.h.f, super.i.l.get(0).g - super.i.f, h.l.get(0).g + h.f, i.l.get(0).g - i.f, a, b7);
                                super.e.e(l.k[0]);
                                g = super.b.f.e;
                                n2 = l.k[1];
                            }
                            else if (b3 && b5) {
                                if (super.h.c && super.i.c) {
                                    final float a2 = super.b.A();
                                    final int n3 = super.h.l.get(0).g + super.h.f;
                                    final int n4 = super.i.l.get(0).g - super.i.f;
                                    int n5 = 0;
                                    int n7 = 0;
                                    Label_1158: {
                                        float n8;
                                        if (b7 != -1 && b7 != 0) {
                                            if (b7 != 1) {
                                                break Label_1481;
                                            }
                                            n5 = this.g(n4 - n3, 0);
                                            final int n6 = (int)(n5 / a2 + 0.5f);
                                            final int g2 = this.g(n6, 1);
                                            if (n6 == (n7 = g2)) {
                                                break Label_1158;
                                            }
                                            n8 = g2 * a2;
                                            n7 = g2;
                                        }
                                        else {
                                            n5 = this.g(n4 - n3, 0);
                                            final int n9 = (int)(n5 * a2 + 0.5f);
                                            final int g3 = this.g(n9, 1);
                                            if (n9 == (n7 = g3)) {
                                                break Label_1158;
                                            }
                                            n8 = g3 / a2;
                                            n7 = g3;
                                        }
                                        n5 = (int)(n8 + 0.5f);
                                    }
                                    super.e.e(n5);
                                    super.b.f.e.e(n7);
                                    break Label_1481;
                                }
                                return;
                            }
                            else {
                                if (!b4 || !b6) {
                                    break Label_1481;
                                }
                                if (!h.c || !i.c) {
                                    return;
                                }
                                final float a3 = super.b.A();
                                final int n10 = h.l.get(0).g + h.f;
                                final int n11 = i.l.get(0).g - i.f;
                                int n13 = 0;
                                Label_1402: {
                                    float n14 = 0.0f;
                                    Label_1395: {
                                        if (b7 != -1) {
                                            if (b7 != 0) {
                                                if (b7 != 1) {
                                                    break Label_1481;
                                                }
                                            }
                                            else {
                                                n2 = this.g(n11 - n10, 1);
                                                final int n12 = (int)(n2 * a3 + 0.5f);
                                                final int g4 = this.g(n12, 0);
                                                if (n12 != (n13 = g4)) {
                                                    n14 = g4 / a3;
                                                    n13 = g4;
                                                    break Label_1395;
                                                }
                                                break Label_1402;
                                            }
                                        }
                                        n2 = this.g(n11 - n10, 1);
                                        final int n15 = (int)(n2 / a3 + 0.5f);
                                        final int g5 = this.g(n15, 0);
                                        if (n15 == (n13 = g5)) {
                                            break Label_1402;
                                        }
                                        n14 = g5 * a3;
                                        n13 = g5;
                                    }
                                    n2 = (int)(n14 + 0.5f);
                                }
                                super.e.e(n13);
                                g = super.b.f.e;
                            }
                            g.e(n2);
                            break Label_1481;
                        }
                        final int b8 = b2.B();
                        float n16 = 0.0f;
                        Label_0200: {
                            if (b8 != -1) {
                                if (b8 == 0) {
                                    final e b9 = super.b;
                                    n16 = b9.f.e.g / b9.A();
                                    break Label_0200;
                                }
                                if (b8 != 1) {
                                    n17 = 0;
                                    break Label_0207;
                                }
                            }
                            final e b10 = super.b;
                            n16 = b10.f.e.g * b10.A();
                        }
                        n17 = (int)(n16 + 0.5f);
                    }
                    else {
                        final e u = b2.U();
                        if (u == null) {
                            break Label_1481;
                        }
                        final g e = u.e.e;
                        if (!e.j) {
                            break Label_1481;
                        }
                        n17 = (int)(e.g * super.b.B + 0.5f);
                    }
                }
                super.e.e(n17);
            }
        }
        final f h5 = super.h;
        if (h5.c) {
            final f k = super.i;
            if (k.c) {
                if (h5.j && k.j && super.e.j) {
                    return;
                }
                if (!super.e.j && super.d == androidx.constraintlayout.core.widgets.e.b.I) {
                    final e b11 = super.b;
                    if (b11.w == 0 && !b11.x0()) {
                        final f f2 = super.h.l.get(0);
                        final f f3 = super.i.l.get(0);
                        final int g6 = f2.g;
                        final f h6 = super.h;
                        final int n18 = g6 + h6.f;
                        final int n19 = f3.g + super.i.f;
                        h6.e(n18);
                        super.i.e(n19);
                        super.e.e(n19 - n18);
                        return;
                    }
                }
                if (!super.e.j && super.d == androidx.constraintlayout.core.widgets.e.b.I && super.a == 1 && super.h.l.size() > 0 && super.i.l.size() > 0) {
                    final int min = Math.min(super.i.l.get(0).g + super.i.f - (super.h.l.get(0).g + super.h.f), super.e.m);
                    final e b12 = super.b;
                    final int a4 = b12.A;
                    int b13 = Math.max(b12.z, min);
                    if (a4 > 0) {
                        b13 = Math.min(a4, b13);
                    }
                    super.e.e(b13);
                }
                if (!super.e.j) {
                    return;
                }
                final f f4 = super.h.l.get(0);
                final f f5 = super.i.l.get(0);
                int g7 = f4.g + super.h.f;
                int g8 = f5.g + super.i.f;
                float e2 = super.b.E();
                if (f4 == f5) {
                    g7 = f4.g;
                    g8 = f5.g;
                    e2 = 0.5f;
                }
                super.h.e((int)(g7 + 0.5f + (g8 - g7 - super.e.g) * e2));
                super.i.e(super.h.g + super.e.g);
            }
        }
    }
    
    @Override
    void d() {
        final e b = super.b;
        if (b.a) {
            super.e.e(b.j0());
        }
        if (!super.e.j) {
            final e.b h = super.b.H();
            if ((super.d = h) != androidx.constraintlayout.core.widgets.e.b.I) {
                final e.b j = androidx.constraintlayout.core.widgets.e.b.J;
                if (h == j) {
                    final e u = super.b.U();
                    if (u != null && (u.H() == androidx.constraintlayout.core.widgets.e.b.G || u.H() == j)) {
                        final int j2 = u.j0();
                        final int g = super.b.Q.g();
                        final int g2 = super.b.S.g();
                        this.b(super.h, u.e.h, super.b.Q.g());
                        this.b(super.i, u.e.i, -super.b.S.g());
                        super.e.e(j2 - g - g2);
                        return;
                    }
                }
                if (super.d == androidx.constraintlayout.core.widgets.e.b.G) {
                    super.e.e(super.b.j0());
                }
            }
        }
        else {
            final e.b d = super.d;
            final e.b i = androidx.constraintlayout.core.widgets.e.b.J;
            if (d == i) {
                final e u2 = super.b.U();
                if (u2 != null && (u2.H() == androidx.constraintlayout.core.widgets.e.b.G || u2.H() == i)) {
                    this.b(super.h, u2.e.h, super.b.Q.g());
                    this.b(super.i, u2.e.i, -super.b.S.g());
                    return;
                }
            }
        }
        final g e = super.e;
        f f5 = null;
        androidx.constraintlayout.core.widgets.d d2 = null;
        Label_1328: {
            if (e.j) {
                final e b2 = super.b;
                if (b2.a) {
                    final androidx.constraintlayout.core.widgets.d[] y = b2.Y;
                    if (y[0].f == null || y[1].f == null) {
                        f f3 = null;
                        f f4 = null;
                        int g3 = 0;
                        Label_0693: {
                            f f;
                            f f2;
                            int n;
                            if (y[0].f != null) {
                                f = this.h(y[0]);
                                if (f == null) {
                                    return;
                                }
                                f2 = super.h;
                                n = super.b.Y[0].g();
                            }
                            else if (y[1].f != null) {
                                final f h2 = this.h(y[1]);
                                if (h2 != null) {
                                    this.b(super.i, h2, -super.b.Y[1].g());
                                    f3 = super.h;
                                    f4 = super.i;
                                    g3 = -super.e.g;
                                    break Label_0693;
                                }
                                return;
                            }
                            else {
                                if (b2 instanceof i || b2.U() == null || super.b.r(androidx.constraintlayout.core.widgets.d.b.M).f != null) {
                                    return;
                                }
                                f = super.b.U().e.h;
                                f2 = super.h;
                                n = super.b.l0();
                            }
                            this.b(f2, f, n);
                            f3 = super.i;
                            f4 = super.h;
                            g3 = super.e.g;
                        }
                        this.b(f3, f4, g3);
                        return;
                    }
                    if (b2.x0()) {
                        super.h.f = super.b.Y[0].g();
                        f5 = super.i;
                        d2 = super.b.Y[1];
                        break Label_1328;
                    }
                    final f h3 = this.h(super.b.Y[0]);
                    if (h3 != null) {
                        this.b(super.h, h3, super.b.Y[0].g());
                    }
                    final f h4 = this.h(super.b.Y[1]);
                    if (h4 != null) {
                        this.b(super.i, h4, -super.b.Y[1].g());
                    }
                    super.h.b = true;
                    super.i.b = true;
                    return;
                }
            }
            Label_1259: {
                if (super.d == androidx.constraintlayout.core.widgets.e.b.I) {
                    final e b3 = super.b;
                    final int w = b3.w;
                    Object o = null;
                    f f8 = null;
                    Label_1251: {
                        if (w != 2) {
                            if (w != 3) {
                                break Label_1259;
                            }
                            Label_1158: {
                                f f9;
                                if (b3.x == 3) {
                                    super.h.a = this;
                                    super.i.a = this;
                                    final n f6 = b3.f;
                                    f6.h.a = this;
                                    f6.i.a = this;
                                    e.a = this;
                                    if (b3.z0()) {
                                        super.e.l.add(super.b.f.e);
                                        super.b.f.e.k.add(super.e);
                                        final n f7 = super.b.f;
                                        f7.e.a = this;
                                        super.e.l.add(f7.h);
                                        super.e.l.add(super.b.f.i);
                                        super.b.f.h.k.add(super.e);
                                        o = super.b.f.i.k;
                                        break Label_1158;
                                    }
                                    if (super.b.x0()) {
                                        super.b.f.e.l.add(super.e);
                                        o = super.e.k;
                                        f8 = super.b.f.e;
                                        break Label_1251;
                                    }
                                    f9 = super.b.f.e;
                                }
                                else {
                                    final g e2 = b3.f.e;
                                    e.l.add(e2);
                                    e2.k.add(super.e);
                                    super.b.f.h.k.add(super.e);
                                    super.b.f.i.k.add(super.e);
                                    final g e3 = super.e;
                                    e3.b = true;
                                    e3.k.add(super.h);
                                    super.e.k.add(super.i);
                                    super.h.l.add(super.e);
                                    f9 = super.i;
                                }
                                o = f9.l;
                            }
                            f8 = super.e;
                        }
                        else {
                            final e u3 = b3.U();
                            if (u3 == null) {
                                break Label_1259;
                            }
                            final g e4 = u3.f.e;
                            super.e.l.add(e4);
                            e4.k.add(super.e);
                            final g e5 = super.e;
                            e5.b = true;
                            e5.k.add(super.h);
                            o = super.e.k;
                            f8 = super.i;
                        }
                    }
                    ((List<g>)o).add((g)f8);
                }
            }
            final e b4 = super.b;
            final androidx.constraintlayout.core.widgets.d[] y2 = b4.Y;
            if (y2[0].f == null || y2[1].f == null) {
                f f10;
                f f11;
                int n2;
                if (y2[0].f != null) {
                    f10 = this.h(y2[0]);
                    if (f10 == null) {
                        return;
                    }
                    f11 = super.h;
                    n2 = super.b.Y[0].g();
                }
                else if (y2[1].f != null) {
                    final f h5 = this.h(y2[1]);
                    if (h5 != null) {
                        this.b(super.i, h5, -super.b.Y[1].g());
                        this.c(super.h, super.i, -1, super.e);
                    }
                    return;
                }
                else {
                    if (b4 instanceof i || b4.U() == null) {
                        return;
                    }
                    f10 = super.b.U().e.h;
                    f11 = super.h;
                    n2 = super.b.l0();
                }
                this.b(f11, f10, n2);
                this.c(super.i, super.h, 1, super.e);
                return;
            }
            if (!b4.x0()) {
                final f h6 = this.h(super.b.Y[0]);
                final f h7 = this.h(super.b.Y[1]);
                if (h6 != null) {
                    h6.b(this);
                }
                if (h7 != null) {
                    h7.b(this);
                }
                super.j = p.b.J;
                return;
            }
            super.h.f = super.b.Y[0].g();
            f5 = super.i;
            d2 = super.b.Y[1];
        }
        f5.f = -d2.g();
    }
    
    public void e() {
        final f h = super.h;
        if (h.j) {
            super.b.Z1(h.g);
        }
    }
    
    @Override
    void f() {
        super.c = null;
        super.h.c();
        super.i.c();
        super.e.c();
        super.g = false;
    }
    
    @Override
    void n() {
        super.g = false;
        super.h.c();
        super.h.j = false;
        super.i.c();
        super.i.j = false;
        super.e.j = false;
    }
    
    @Override
    boolean p() {
        return super.d != androidx.constraintlayout.core.widgets.e.b.I || super.b.w == 0;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("HorizontalRun ");
        sb.append(super.b.y());
        return sb.toString();
    }
}
