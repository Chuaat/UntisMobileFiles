// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.i;
import androidx.constraintlayout.core.widgets.e;

public class n extends p
{
    public f k;
    g l;
    
    public n(final e e) {
        super(e);
        final f k = new f(this);
        this.k = k;
        this.l = null;
        super.h.e = androidx.constraintlayout.core.widgets.analyzer.f.a.L;
        super.i.e = androidx.constraintlayout.core.widgets.analyzer.f.a.M;
        k.e = androidx.constraintlayout.core.widgets.analyzer.f.a.N;
        super.f = 1;
    }
    
    @Override
    public void a(final d d) {
        final int n = n$a.a[super.j.ordinal()];
        if (n != 1) {
            if (n != 2) {
                if (n == 3) {
                    final e b = super.b;
                    this.q(d, b.R, b.T, 1);
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
        final g e = super.e;
        Label_0268: {
            if (e.c && !e.j && super.d == androidx.constraintlayout.core.widgets.e.b.I) {
                final e b2 = super.b;
                final int x = b2.x;
                int n3 = 0;
                Label_0208: {
                    if (x != 2) {
                        if (x != 3) {
                            break Label_0268;
                        }
                        if (!b2.e.e.j) {
                            break Label_0268;
                        }
                        final int b3 = b2.B();
                        float n2 = 0.0f;
                        Label_0201: {
                            if (b3 != -1) {
                                if (b3 == 0) {
                                    final e b4 = super.b;
                                    n2 = b4.e.e.g * b4.A();
                                    break Label_0201;
                                }
                                if (b3 != 1) {
                                    n3 = 0;
                                    break Label_0208;
                                }
                            }
                            final e b5 = super.b;
                            n2 = b5.e.e.g / b5.A();
                        }
                        n3 = (int)(n2 + 0.5f);
                    }
                    else {
                        final e u = b2.U();
                        if (u == null) {
                            break Label_0268;
                        }
                        final g e2 = u.f.e;
                        if (!e2.j) {
                            break Label_0268;
                        }
                        n3 = (int)(e2.g * super.b.E + 0.5f);
                    }
                }
                super.e.e(n3);
            }
        }
        final f h = super.h;
        if (h.c) {
            final f i = super.i;
            if (i.c) {
                if (h.j && i.j && super.e.j) {
                    return;
                }
                if (!super.e.j && super.d == androidx.constraintlayout.core.widgets.e.b.I) {
                    final e b6 = super.b;
                    if (b6.w == 0 && !b6.z0()) {
                        final f f = super.h.l.get(0);
                        final f f2 = super.i.l.get(0);
                        final int g = f.g;
                        final f h2 = super.h;
                        final int n4 = g + h2.f;
                        final int n5 = f2.g + super.i.f;
                        h2.e(n4);
                        super.i.e(n5);
                        super.e.e(n5 - n4);
                        return;
                    }
                }
                if (!super.e.j && super.d == androidx.constraintlayout.core.widgets.e.b.I && super.a == 1 && super.h.l.size() > 0 && super.i.l.size() > 0) {
                    final int n6 = super.i.l.get(0).g + super.i.f - (super.h.l.get(0).g + super.h.f);
                    final g e3 = super.e;
                    final int m = e3.m;
                    if (n6 < m) {
                        e3.e(n6);
                    }
                    else {
                        e3.e(m);
                    }
                }
                if (!super.e.j) {
                    return;
                }
                if (super.h.l.size() > 0 && super.i.l.size() > 0) {
                    final f f3 = super.h.l.get(0);
                    final f f4 = super.i.l.get(0);
                    int g2 = f3.g + super.h.f;
                    int g3 = f4.g + super.i.f;
                    float d2 = super.b.d0();
                    if (f3 == f4) {
                        g2 = f3.g;
                        g3 = f4.g;
                        d2 = 0.5f;
                    }
                    super.h.e((int)(g2 + 0.5f + (g3 - g2 - super.e.g) * d2));
                    super.i.e(super.h.g + super.e.g);
                }
            }
        }
    }
    
    @Override
    void d() {
        final e b = super.b;
        if (b.a) {
            super.e.e(b.D());
        }
        if (!super.e.j) {
            super.d = super.b.g0();
            if (super.b.n0()) {
                this.l = new a(this);
            }
            final e.b d = super.d;
            if (d != androidx.constraintlayout.core.widgets.e.b.I) {
                if (d == androidx.constraintlayout.core.widgets.e.b.J) {
                    final e u = super.b.U();
                    if (u != null && u.g0() == androidx.constraintlayout.core.widgets.e.b.G) {
                        final int d2 = u.D();
                        final int g = super.b.R.g();
                        final int g2 = super.b.T.g();
                        this.b(super.h, u.f.h, super.b.R.g());
                        this.b(super.i, u.f.i, -super.b.T.g());
                        super.e.e(d2 - g - g2);
                        return;
                    }
                }
                if (super.d == androidx.constraintlayout.core.widgets.e.b.G) {
                    super.e.e(super.b.D());
                }
            }
        }
        else if (super.d == androidx.constraintlayout.core.widgets.e.b.J) {
            final e u2 = super.b.U();
            if (u2 != null && u2.g0() == androidx.constraintlayout.core.widgets.e.b.G) {
                this.b(super.h, u2.f.h, super.b.R.g());
                this.b(super.i, u2.f.i, -super.b.T.g());
                return;
            }
        }
        final g e = super.e;
        final boolean j = e.j;
        if (j) {
            final e b2 = super.b;
            if (b2.a) {
                final androidx.constraintlayout.core.widgets.d[] y = b2.Y;
                f f = null;
                f f2 = null;
                int n = 0;
                Label_0541: {
                    if (y[2].f != null && y[3].f != null) {
                        if (b2.z0()) {
                            super.h.f = super.b.Y[2].g();
                            super.i.f = -super.b.Y[3].g();
                        }
                        else {
                            final f h = this.h(super.b.Y[2]);
                            if (h != null) {
                                this.b(super.h, h, super.b.Y[2].g());
                            }
                            final f h2 = this.h(super.b.Y[3]);
                            if (h2 != null) {
                                this.b(super.i, h2, -super.b.Y[3].g());
                            }
                            super.h.b = true;
                            super.i.b = true;
                        }
                        if (!super.b.n0()) {
                            return;
                        }
                    }
                    else if (y[2].f != null) {
                        final f h3 = this.h(y[2]);
                        if (h3 == null) {
                            return;
                        }
                        this.b(super.h, h3, super.b.Y[2].g());
                        this.b(super.i, super.h, super.e.g);
                        if (!super.b.n0()) {
                            return;
                        }
                    }
                    else if (y[3].f != null) {
                        final f h4 = this.h(y[3]);
                        if (h4 != null) {
                            this.b(super.i, h4, -super.b.Y[3].g());
                            this.b(super.h, super.i, -super.e.g);
                        }
                        if (!super.b.n0()) {
                            return;
                        }
                    }
                    else if (y[4].f != null) {
                        final f h5 = this.h(y[4]);
                        if (h5 != null) {
                            this.b(this.k, h5, 0);
                            this.b(super.h, this.k, -super.b.t());
                            f = super.i;
                            f2 = super.h;
                            n = super.e.g;
                            break Label_0541;
                        }
                        return;
                    }
                    else {
                        if (b2 instanceof i || b2.U() == null || super.b.r(androidx.constraintlayout.core.widgets.d.b.M).f != null) {
                            return;
                        }
                        this.b(super.h, super.b.U().f.h, super.b.m0());
                        this.b(super.i, super.h, super.e.g);
                        if (!super.b.n0()) {
                            return;
                        }
                    }
                    f = this.k;
                    f2 = super.h;
                    n = super.b.t();
                }
                this.b(f, f2, n);
                return;
            }
        }
        Label_1047: {
            if (!j && super.d == androidx.constraintlayout.core.widgets.e.b.I) {
                final e b3 = super.b;
                final int x = b3.x;
                p p;
                if (x != 2) {
                    if (x != 3) {
                        break Label_1047;
                    }
                    if (b3.z0()) {
                        break Label_1047;
                    }
                    final e b4 = super.b;
                    if (b4.w == 3) {
                        break Label_1047;
                    }
                    p = b4.e;
                }
                else {
                    final e u3 = b3.U();
                    if (u3 == null) {
                        break Label_1047;
                    }
                    p = u3.f;
                }
                final g e2 = p.e;
                super.e.l.add(e2);
                e2.k.add(super.e);
                final g e3 = super.e;
                e3.b = true;
                e3.k.add(super.h);
                super.e.k.add(super.i);
            }
            else {
                e.b(this);
            }
        }
        final e b5 = super.b;
        final androidx.constraintlayout.core.widgets.d[] y2 = b5.Y;
        Label_1685: {
            f f3 = null;
            f f4 = null;
            g g3 = null;
            Label_1210: {
                Label_1193: {
                    if (y2[2].f == null || y2[3].f == null) {
                        l l;
                        if (y2[2].f != null) {
                            final f h6 = this.h(y2[2]);
                            if (h6 == null) {
                                break Label_1685;
                            }
                            this.b(super.h, h6, super.b.Y[2].g());
                            this.c(super.i, super.h, 1, super.e);
                            if (super.b.n0()) {
                                this.c(this.k, super.h, 1, this.l);
                            }
                            final e.b d3 = super.d;
                            final e.b i = androidx.constraintlayout.core.widgets.e.b.I;
                            if (d3 != i || super.b.A() <= 0.0f) {
                                break Label_1685;
                            }
                            l = super.b.e;
                            if (l.d != i) {
                                break Label_1685;
                            }
                        }
                        else if (y2[3].f != null) {
                            final f h7 = this.h(y2[3]);
                            if (h7 == null) {
                                break Label_1685;
                            }
                            this.b(super.i, h7, -super.b.Y[3].g());
                            this.c(super.h, super.i, -1, super.e);
                            if (super.b.n0()) {
                                break Label_1193;
                            }
                            break Label_1685;
                        }
                        else if (y2[4].f != null) {
                            final f h8 = this.h(y2[4]);
                            if (h8 != null) {
                                this.b(this.k, h8, 0);
                                this.c(super.h, this.k, -1, this.l);
                                f3 = super.i;
                                f4 = super.h;
                                g3 = super.e;
                                break Label_1210;
                            }
                            break Label_1685;
                        }
                        else {
                            if (b5 instanceof i || b5.U() == null) {
                                break Label_1685;
                            }
                            this.b(super.h, super.b.U().f.h, super.b.m0());
                            this.c(super.i, super.h, 1, super.e);
                            if (super.b.n0()) {
                                this.c(this.k, super.h, 1, this.l);
                            }
                            final e.b d4 = super.d;
                            final e.b k = androidx.constraintlayout.core.widgets.e.b.I;
                            if (d4 != k || super.b.A() <= 0.0f) {
                                break Label_1685;
                            }
                            l = super.b.e;
                            if (l.d != k) {
                                break Label_1685;
                            }
                        }
                        l.e.k.add(super.e);
                        super.e.l.add(super.b.e.e);
                        super.e.a = this;
                        break Label_1685;
                    }
                    if (b5.z0()) {
                        super.h.f = super.b.Y[2].g();
                        super.i.f = -super.b.Y[3].g();
                    }
                    else {
                        final f h9 = this.h(super.b.Y[2]);
                        final f h10 = this.h(super.b.Y[3]);
                        if (h9 != null) {
                            h9.b(this);
                        }
                        if (h10 != null) {
                            h10.b(this);
                        }
                        super.j = p.b.J;
                    }
                    if (!super.b.n0()) {
                        break Label_1685;
                    }
                }
                f3 = this.k;
                f4 = super.h;
                g3 = this.l;
            }
            this.c(f3, f4, 1, g3);
        }
        if (super.e.l.size() == 0) {
            super.e.c = true;
        }
    }
    
    public void e() {
        final f h = super.h;
        if (h.j) {
            super.b.a2(h.g);
        }
    }
    
    @Override
    void f() {
        super.c = null;
        super.h.c();
        super.i.c();
        this.k.c();
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
        this.k.c();
        this.k.j = false;
        super.e.j = false;
    }
    
    @Override
    boolean p() {
        return super.d != androidx.constraintlayout.core.widgets.e.b.I || super.b.x == 0;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("VerticalRun ");
        sb.append(super.b.y());
        return sb.toString();
    }
}
