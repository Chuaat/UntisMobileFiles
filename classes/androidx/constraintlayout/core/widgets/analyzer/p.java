// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.e;

public abstract class p implements d
{
    public int a;
    e b;
    m c;
    protected e.b d;
    g e;
    public int f;
    boolean g;
    public f h;
    public f i;
    protected b j;
    
    public p(final e b) {
        this.e = new g(this);
        this.f = 0;
        this.g = false;
        this.h = new f(this);
        this.i = new f(this);
        this.j = p.b.G;
        this.b = b;
    }
    
    private void o(int a, final int b) {
        final int a2 = this.a;
        int n = b;
        g g = null;
        Label_0319: {
            if (a2 != 0) {
                if (a2 == 1) {
                    a = this.g(this.e.m, a);
                    g = this.e;
                    a = Math.min(a, b);
                    break Label_0319;
                }
                if (a2 != 2) {
                    if (a2 != 3) {
                        return;
                    }
                    final e b2 = this.b;
                    p p2 = b2.e;
                    final e.b d = p2.d;
                    final e.b i = androidx.constraintlayout.core.widgets.e.b.I;
                    if (d == i && p2.a == 3) {
                        final n f = b2.f;
                        if (f.d == i && f.a == 3) {
                            return;
                        }
                    }
                    if (a == 0) {
                        p2 = b2.f;
                    }
                    if (p2.e.j) {
                        final float a3 = b2.A();
                        if (a == 1) {
                            a = (int)(p2.e.g / a3 + 0.5f);
                        }
                        else {
                            a = (int)(a3 * p2.e.g + 0.5f);
                        }
                        this.e.e(a);
                    }
                    return;
                }
                else {
                    final e u = this.b.U();
                    if (u == null) {
                        return;
                    }
                    p p3;
                    if (a == 0) {
                        p3 = u.e;
                    }
                    else {
                        p3 = u.f;
                    }
                    final g e = p3.e;
                    if (!e.j) {
                        return;
                    }
                    final e b3 = this.b;
                    float n2;
                    if (a == 0) {
                        n2 = b3.B;
                    }
                    else {
                        n2 = b3.E;
                    }
                    n = (int)(e.g * n2 + 0.5f);
                }
            }
            g = this.e;
            a = this.g(n, a);
        }
        g.e(a);
    }
    
    @Override
    public void a(final d d) {
    }
    
    protected final void b(final f f, final f f2, final int f3) {
        f.l.add(f2);
        f.f = f3;
        f2.k.add(f);
    }
    
    protected final void c(final f f, final f f2, final int h, final g i) {
        f.l.add(f2);
        f.l.add(this.e);
        f.h = h;
        f.i = i;
        f2.k.add(f);
        i.k.add(f);
    }
    
    abstract void d();
    
    abstract void e();
    
    abstract void f();
    
    protected final int g(final int n, int n2) {
        if (n2 == 0) {
            final e b = this.b;
            final int a = b.A;
            n2 = Math.max(b.z, n);
            if (a > 0) {
                n2 = Math.min(a, n);
            }
            final int n3;
            if (n2 == (n3 = n)) {
                return n3;
            }
        }
        else {
            final e b2 = this.b;
            final int d = b2.D;
            n2 = Math.max(b2.C, n);
            if (d > 0) {
                n2 = Math.min(d, n);
            }
            final int n3;
            if (n2 == (n3 = n)) {
                return n3;
            }
        }
        return n2;
    }
    
    protected final f h(final androidx.constraintlayout.core.widgets.d d) {
        final androidx.constraintlayout.core.widgets.d f = d.f;
        f f2 = null;
        if (f == null) {
            return null;
        }
        final e d2 = f.d;
        final int n = p$a.a[f.e.ordinal()];
        if (n != 1) {
            p p2;
            if (n != 2) {
                if (n == 3) {
                    final p p = d2.f;
                    return p.h;
                }
                if (n == 4) {
                    f2 = d2.f.k;
                    return f2;
                }
                if (n != 5) {
                    return f2;
                }
                p2 = d2.f;
            }
            else {
                p2 = d2.e;
            }
            f2 = p2.i;
            return f2;
        }
        final p p = d2.e;
        f2 = p.h;
        return f2;
    }
    
    protected final f i(final androidx.constraintlayout.core.widgets.d d, int n) {
        final androidx.constraintlayout.core.widgets.d f = d.f;
        final f f2 = null;
        if (f == null) {
            return null;
        }
        final e d2 = f.d;
        p p2;
        if (n == 0) {
            p2 = d2.e;
        }
        else {
            p2 = d2.f;
        }
        n = p$a.a[f.e.ordinal()];
        if (n != 1) {
            if (n != 2) {
                if (n == 3) {
                    return p2.h;
                }
                if (n != 5) {
                    return f2;
                }
            }
            return p2.i;
        }
        return p2.h;
    }
    
    public long j() {
        final g e = this.e;
        if (e.j) {
            return e.g;
        }
        return 0L;
    }
    
    public boolean k() {
        final int size = this.h.l.size();
        boolean b = false;
        int i = 0;
        int n = 0;
        while (i < size) {
            int n2 = n;
            if (this.h.l.get(i).d != this) {
                n2 = n + 1;
            }
            ++i;
            n = n2;
        }
        final int size2 = this.i.l.size();
        int j = 0;
        int n3 = n;
        while (j < size2) {
            int n4 = n3;
            if (this.i.l.get(j).d != this) {
                n4 = n3 + 1;
            }
            ++j;
            n3 = n4;
        }
        if (n3 >= 2) {
            b = true;
        }
        return b;
    }
    
    public boolean l() {
        return this.e.j;
    }
    
    public boolean m() {
        return this.g;
    }
    
    abstract void n();
    
    abstract boolean p();
    
    protected void q(final d d, final androidx.constraintlayout.core.widgets.d d2, final androidx.constraintlayout.core.widgets.d d3, int g) {
        final f h = this.h(d2);
        final f h2 = this.h(d3);
        if (!h.j || !h2.j) {
            return;
        }
        final int n = h.g + d2.g();
        int g2 = h2.g - d3.g();
        final int n2 = g2 - n;
        if (!this.e.j && this.d == androidx.constraintlayout.core.widgets.e.b.I) {
            this.o(g, n2);
        }
        final g e = this.e;
        if (!e.j) {
            return;
        }
        f f;
        if (e.g == n2) {
            this.h.e(n);
            f = this.i;
        }
        else {
            final e b = this.b;
            float n3;
            if (g == 0) {
                n3 = b.E();
            }
            else {
                n3 = b.d0();
            }
            g = n;
            if (h == h2) {
                g = h.g;
                g2 = h2.g;
                n3 = 0.5f;
            }
            this.h.e((int)(g + 0.5f + (g2 - g - this.e.g) * n3));
            f = this.i;
            g2 = this.h.g + this.e.g;
        }
        f.e(g2);
    }
    
    protected void r(final d d) {
    }
    
    protected void s(final d d) {
    }
    
    public long t(int f) {
        final g e = this.e;
        if (e.j) {
            final long n = e.g;
            if (this.k()) {
                f = this.h.f - this.i.f;
            }
            else {
                if (f != 0) {
                    return n - this.i.f;
                }
                f = this.h.f;
            }
            return n + f;
        }
        return 0L;
    }
    
    enum b
    {
        G, 
        H, 
        I, 
        J;
    }
}
