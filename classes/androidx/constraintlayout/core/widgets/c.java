// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core.widgets;

import java.util.ArrayList;

public class c
{
    protected e a;
    protected e b;
    protected e c;
    protected e d;
    protected e e;
    protected e f;
    protected e g;
    protected ArrayList<e> h;
    protected int i;
    protected int j;
    protected float k;
    int l;
    int m;
    int n;
    boolean o;
    private int p;
    private boolean q;
    protected boolean r;
    protected boolean s;
    protected boolean t;
    protected boolean u;
    private boolean v;
    
    public c(final e a, final int p3, final boolean q) {
        this.k = 0.0f;
        this.q = false;
        this.a = a;
        this.p = p3;
        this.q = q;
    }
    
    private void b() {
        final int n = this.p * 2;
        e a = this.a;
        boolean t = true;
        this.o = true;
        e e = a;
        int i = 0;
        while (i == 0) {
            ++this.i;
            final e[] o0 = a.O0;
            final int p = this.p;
            final e e2 = null;
            o0[p] = null;
            a.N0[p] = null;
            if (a.i0() != 8) {
                ++this.l;
                final e.b z = a.z(this.p);
                final e.b j = androidx.constraintlayout.core.widgets.e.b.I;
                if (z != j) {
                    this.m += a.M(this.p);
                }
                final int m = this.m + a.Y[n].g();
                this.m = m;
                final d[] y = a.Y;
                final int n2 = n + 1;
                this.m = m + y[n2].g();
                final int n3 = this.n + a.Y[n].g();
                this.n = n3;
                this.n = n3 + a.Y[n2].g();
                if (this.b == null) {
                    this.b = a;
                }
                this.d = a;
                final e.b[] b0 = a.b0;
                final int p2 = this.p;
                if (b0[p2] == j) {
                    final int[] y2 = a.y;
                    if (y2[p2] == 0 || y2[p2] == 3 || y2[p2] == 2) {
                        ++this.j;
                        final float[] m2 = a.M0;
                        final float n4 = m2[p2];
                        if (n4 > 0.0f) {
                            this.k += m2[p2];
                        }
                        if (k(a, p2)) {
                            if (n4 < 0.0f) {
                                this.r = true;
                            }
                            else {
                                this.s = true;
                            }
                            if (this.h == null) {
                                this.h = new ArrayList<e>();
                            }
                            this.h.add(a);
                        }
                        if (this.f == null) {
                            this.f = a;
                        }
                        final e g = this.g;
                        if (g != null) {
                            g.N0[this.p] = a;
                        }
                        this.g = a;
                    }
                    Label_0490: {
                        if (this.p == 0) {
                            if (a.w == 0) {
                                if (a.z == 0) {
                                    if (a.A == 0) {
                                        break Label_0490;
                                    }
                                }
                            }
                        }
                        else if (a.x == 0 && a.C == 0) {
                            if (a.D == 0) {
                                break Label_0490;
                            }
                        }
                        this.o = false;
                    }
                    if (a.f0 != 0.0f) {
                        this.o = false;
                        this.u = true;
                    }
                }
            }
            if (e != a) {
                e.O0[this.p] = a;
            }
            final d f = a.Y[n + 1].f;
            e e3 = e2;
            if (f != null) {
                final e d = f.d;
                final d[] y3 = d.Y;
                e3 = e2;
                if (y3[n].f != null) {
                    if (y3[n].f.d != a) {
                        e3 = e2;
                    }
                    else {
                        e3 = d;
                    }
                }
            }
            if (e3 == null) {
                e3 = a;
                i = 1;
            }
            final e e4 = a;
            a = e3;
            e = e4;
        }
        final e b2 = this.b;
        if (b2 != null) {
            this.m -= b2.Y[n].g();
        }
        final e d2 = this.d;
        if (d2 != null) {
            this.m -= d2.Y[n + 1].g();
        }
        this.c = a;
        if (this.p == 0 && this.q) {
            this.e = a;
        }
        else {
            this.e = this.a;
        }
        if (!this.s || !this.r) {
            t = false;
        }
        this.t = t;
    }
    
    private static boolean k(final e e, final int n) {
        if (e.i0() != 8 && e.b0[n] == e.b.I) {
            final int[] y = e.y;
            if (y[n] == 0 || y[n] == 3) {
                return true;
            }
        }
        return false;
    }
    
    public void a() {
        if (!this.v) {
            this.b();
        }
        this.v = true;
    }
    
    public e c() {
        return this.a;
    }
    
    public e d() {
        return this.f;
    }
    
    public e e() {
        return this.b;
    }
    
    public e f() {
        return this.e;
    }
    
    public e g() {
        return this.c;
    }
    
    public e h() {
        return this.g;
    }
    
    public e i() {
        return this.d;
    }
    
    public float j() {
        return this.k;
    }
}
