// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.widgets.e;

public class b
{
    public static final Object i;
    public static final Object j;
    public static final Object k;
    public static final Object l;
    public static final Object m;
    public static final Object n;
    private final int a;
    int b;
    int c;
    float d;
    int e;
    String f;
    Object g;
    boolean h;
    
    static {
        i = new Object();
        j = new Object();
        k = new Object();
        l = new Object();
        m = new Object();
        n = new Object();
    }
    
    private b() {
        this.a = -2;
        this.b = 0;
        this.c = Integer.MAX_VALUE;
        this.d = 1.0f;
        this.e = 0;
        this.f = null;
        this.g = androidx.constraintlayout.core.state.b.j;
        this.h = false;
    }
    
    private b(final Object g) {
        this.a = -2;
        this.b = 0;
        this.c = Integer.MAX_VALUE;
        this.d = 1.0f;
        this.e = 0;
        this.f = null;
        this.g = androidx.constraintlayout.core.state.b.j;
        this.h = false;
        this.g = g;
    }
    
    public static b a(final int n) {
        final b b = new b(androidx.constraintlayout.core.state.b.i);
        b.l(n);
        return b;
    }
    
    public static b b(final Object o) {
        final b b = new b(androidx.constraintlayout.core.state.b.i);
        b.m(o);
        return b;
    }
    
    public static b c() {
        return new b(b.l);
    }
    
    public static b d(final Object o, final float n) {
        final b b = new b(androidx.constraintlayout.core.state.b.m);
        b.s(o, n);
        return b;
    }
    
    public static b e(final String s) {
        final b b = new b(androidx.constraintlayout.core.state.b.n);
        b.t(s);
        return b;
    }
    
    public static b f() {
        return new b(b.k);
    }
    
    public static b g(final int n) {
        final b b = new b();
        b.v(n);
        return b;
    }
    
    public static b h(final Object o) {
        final b b = new b();
        b.w(o);
        return b;
    }
    
    public static b i() {
        return new b(b.j);
    }
    
    public void j(final g g, final e e, int n) {
        final String f = this.f;
        if (f != null) {
            e.h1(f);
        }
        final int n2 = 2;
        if (n == 0) {
            if (this.h) {
                e.x1(androidx.constraintlayout.core.widgets.e.b.I);
                final Object g2 = this.g;
                if (g2 == androidx.constraintlayout.core.state.b.j) {
                    n = 1;
                }
                else if (g2 == androidx.constraintlayout.core.state.b.m) {
                    n = n2;
                }
                else {
                    n = 0;
                }
                e.y1(n, this.b, this.c, this.d);
            }
            else {
                n = this.b;
                if (n > 0) {
                    e.J1(n);
                }
                n = this.c;
                if (n < Integer.MAX_VALUE) {
                    e.G1(n);
                }
                final Object g3 = this.g;
                e.b b;
                if (g3 == androidx.constraintlayout.core.state.b.j) {
                    b = androidx.constraintlayout.core.widgets.e.b.H;
                }
                else if (g3 == androidx.constraintlayout.core.state.b.l) {
                    b = androidx.constraintlayout.core.widgets.e.b.J;
                }
                else {
                    if (g3 == null) {
                        e.x1(androidx.constraintlayout.core.widgets.e.b.G);
                        e.W1(this.e);
                    }
                    return;
                }
                e.x1(b);
            }
        }
        else if (this.h) {
            e.S1(androidx.constraintlayout.core.widgets.e.b.I);
            final Object g4 = this.g;
            if (g4 == androidx.constraintlayout.core.state.b.j) {
                n = 1;
            }
            else if (g4 == androidx.constraintlayout.core.state.b.m) {
                n = n2;
            }
            else {
                n = 0;
            }
            e.T1(n, this.b, this.c, this.d);
        }
        else {
            n = this.b;
            if (n > 0) {
                e.I1(n);
            }
            n = this.c;
            if (n < Integer.MAX_VALUE) {
                e.F1(n);
            }
            final Object g5 = this.g;
            e.b b2;
            if (g5 == androidx.constraintlayout.core.state.b.j) {
                b2 = androidx.constraintlayout.core.widgets.e.b.H;
            }
            else if (g5 == androidx.constraintlayout.core.state.b.l) {
                b2 = androidx.constraintlayout.core.widgets.e.b.J;
            }
            else {
                if (g5 == null) {
                    e.S1(androidx.constraintlayout.core.widgets.e.b.G);
                    e.s1(this.e);
                }
                return;
            }
            e.S1(b2);
        }
    }
    
    public boolean k(final int n) {
        return this.g == null && this.e == n;
    }
    
    public b l(final int e) {
        this.g = null;
        this.e = e;
        return this;
    }
    
    public b m(final Object g) {
        this.g = g;
        if (g instanceof Integer) {
            this.e = (int)g;
            this.g = null;
        }
        return this;
    }
    
    int n() {
        return this.e;
    }
    
    public b o(final int c) {
        if (this.c >= 0) {
            this.c = c;
        }
        return this;
    }
    
    public b p(final Object o) {
        final Object j = androidx.constraintlayout.core.state.b.j;
        if (o == j && this.h) {
            this.g = j;
            this.c = Integer.MAX_VALUE;
        }
        return this;
    }
    
    public b q(final int b) {
        if (b >= 0) {
            this.b = b;
        }
        return this;
    }
    
    public b r(final Object o) {
        if (o == androidx.constraintlayout.core.state.b.j) {
            this.b = -2;
        }
        return this;
    }
    
    public b s(final Object o, final float d) {
        this.d = d;
        return this;
    }
    
    public b t(final String f) {
        this.f = f;
        return this;
    }
    
    void u(final int e) {
        this.h = false;
        this.g = null;
        this.e = e;
    }
    
    public b v(final int n) {
        this.h = true;
        return this;
    }
    
    public b w(final Object g) {
        this.g = g;
        this.h = true;
        return this;
    }
    
    public enum a
    {
        G, 
        H, 
        I, 
        J;
    }
}
