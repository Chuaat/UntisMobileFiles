// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.base;

import org.joda.time.k;
import org.joda.time.n0;
import org.joda.time.field.j;
import org.joda.time.l0;
import org.joda.time.k0;
import org.joda.time.convert.m;
import org.joda.time.b0;
import org.joda.time.i0;
import org.joda.time.convert.d;
import org.joda.time.h;
import org.joda.time.a;
import org.joda.time.chrono.x;
import org.joda.time.e0;
import java.io.Serializable;
import org.joda.time.o0;

public abstract class l extends f implements o0, Serializable
{
    private static final long I = -2110953284060001145L;
    private static final o0 J;
    private final e0 G;
    private final int[] H;
    
    static {
        J = new f() {
            @Override
            public e0 I() {
                return e0.r();
            }
            
            @Override
            public int e0(final int n) {
                return 0;
            }
        };
    }
    
    protected l(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final e0 e0) {
        this.G = this.L(e0);
        this.H = this.Z(n, n2, n3, n4, n5, n6, n7, n8);
    }
    
    protected l(final long n) {
        this.G = e0.q();
        System.arraycopy(x.e0().n(l.J, n), 0, this.H = new int[8], 4, 4);
    }
    
    protected l(final long n, final long n2, e0 l, a e) {
        l = this.L(l);
        e = h.e(e);
        this.G = l;
        this.H = e.o(this, n, n2);
    }
    
    protected l(final long n, e0 l, a e) {
        l = this.L(l);
        e = h.e(e);
        this.G = l;
        this.H = e.n(this, n);
    }
    
    protected l(final Object o, e0 l, final a a) {
        final m t = d.m().t(o);
        e0 h = l;
        if (l == null) {
            h = t.h(o);
        }
        l = this.L(h);
        this.G = l;
        if (this instanceof i0) {
            this.H = new int[this.size()];
            t.e((i0)this, o, org.joda.time.h.e(a));
        }
        else {
            this.H = new b0(o, l, a).c();
        }
    }
    
    protected l(final k0 k0, final l0 l0, e0 i) {
        i = this.L(i);
        final long h = org.joda.time.h.h(k0);
        final long j = org.joda.time.h.j(l0);
        final long m = org.joda.time.field.j.m(j, h);
        final a i2 = org.joda.time.h.i(l0);
        this.G = i;
        this.H = i2.o(this, m, j);
    }
    
    protected l(final l0 l0, final k0 k0, e0 i) {
        i = this.L(i);
        final long j = h.j(l0);
        final long e = org.joda.time.field.j.e(j, h.h(k0));
        final a m = h.i(l0);
        this.G = i;
        this.H = m.o(this, j, e);
    }
    
    protected l(final l0 l0, final l0 l2, e0 i) {
        i = this.L(i);
        if (l0 == null && l2 == null) {
            this.G = i;
            this.H = new int[this.size()];
        }
        else {
            final long j = h.j(l0);
            final long k = h.j(l2);
            final a m = h.k(l0, l2);
            this.G = i;
            this.H = m.o(this, j, k);
        }
    }
    
    protected l(final n0 n0, final n0 n2, e0 l) {
        if (n0 != null && n2 != null) {
            if (n0 instanceof org.joda.time.base.j && n2 instanceof org.joda.time.base.j && n0.getClass() == n2.getClass()) {
                l = this.L(l);
                final long u = ((org.joda.time.base.j)n0).u();
                final long u2 = ((org.joda.time.base.j)n2).u();
                final a e = h.e(n0.t());
                this.G = l;
                this.H = e.o(this, u, u2);
            }
            else {
                if (n0.size() != n2.size()) {
                    throw new IllegalArgumentException("ReadablePartial objects must have the same set of fields");
                }
                for (int i = 0; i < n0.size(); ++i) {
                    if (n0.N(i) != n2.N(i)) {
                        throw new IllegalArgumentException("ReadablePartial objects must have the same set of fields");
                    }
                }
                if (!h.p(n0)) {
                    throw new IllegalArgumentException("ReadablePartial objects must be contiguous");
                }
                this.G = this.L(l);
                final a r = h.e(n0.t()).R();
                this.H = r.o(this, r.K(n0, 0L), r.K(n2, 0L));
            }
            return;
        }
        throw new IllegalArgumentException("ReadablePartial objects must not be null");
    }
    
    protected l(final int[] h, final e0 g) {
        this.G = g;
        this.H = h;
    }
    
    private void J(final org.joda.time.m m, final int[] array, final int n) {
        final int n2 = this.n(m);
        if (n2 == -1) {
            if (n != 0) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Period does not support field '");
                sb.append(m.e());
                sb.append("'");
                throw new IllegalArgumentException(sb.toString());
            }
        }
        else {
            array[n2] = n;
        }
    }
    
    private void X(final o0 o0) {
        final int[] array = new int[this.size()];
        for (int size = o0.size(), i = 0; i < size; ++i) {
            this.J(o0.N(i), array, o0.e0(i));
        }
        this.a0(array);
    }
    
    private int[] Z(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        final int[] array = new int[this.size()];
        this.J(org.joda.time.m.o(), array, n);
        this.J(org.joda.time.m.k(), array, n2);
        this.J(org.joda.time.m.m(), array, n3);
        this.J(org.joda.time.m.b(), array, n4);
        this.J(org.joda.time.m.g(), array, n5);
        this.J(org.joda.time.m.j(), array, n6);
        this.J(org.joda.time.m.l(), array, n7);
        this.J(org.joda.time.m.i(), array, n8);
        return array;
    }
    
    protected void C(final int[] array, final org.joda.time.m obj, final int n) {
        final int n2 = this.n(obj);
        if (n2 == -1) {
            if (n != 0 || obj == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Period does not support field '");
                sb.append(obj);
                sb.append("'");
                throw new IllegalArgumentException(sb.toString());
            }
        }
        else {
            array[n2] = j.d(array[n2], n);
        }
    }
    
    protected void F(final o0 o0) {
        if (o0 != null) {
            this.a0(this.H(this.c(), o0));
        }
    }
    
    protected int[] H(final int[] array, final o0 o0) {
        for (int size = o0.size(), i = 0; i < size; ++i) {
            final org.joda.time.m n = o0.N(i);
            final int e0 = o0.e0(i);
            if (e0 != 0) {
                final int n2 = this.n(n);
                if (n2 == -1) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Period does not support field '");
                    sb.append(n.e());
                    sb.append("'");
                    throw new IllegalArgumentException(sb.toString());
                }
                array[n2] = j.d(this.e0(n2), e0);
            }
        }
        return array;
    }
    
    @Override
    public e0 I() {
        return this.G;
    }
    
    protected e0 L(final e0 e0) {
        return h.m(e0);
    }
    
    protected void R(final o0 o0) {
        if (o0 != null) {
            this.a0(this.T(this.c(), o0));
        }
    }
    
    protected int[] T(final int[] array, final o0 o0) {
        for (int size = o0.size(), i = 0; i < size; ++i) {
            this.J(o0.N(i), array, o0.e0(i));
        }
        return array;
    }
    
    protected void U(final org.joda.time.m m, final int n) {
        this.V(this.H, m, n);
    }
    
    protected void V(final int[] array, final org.joda.time.m obj, final int n) {
        final int n2 = this.n(obj);
        if (n2 == -1) {
            if (n != 0 || obj == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Period does not support field '");
                sb.append(obj);
                sb.append("'");
                throw new IllegalArgumentException(sb.toString());
            }
        }
        else {
            array[n2] = n;
        }
    }
    
    protected void a0(final int[] array) {
        final int[] h = this.H;
        System.arraycopy(array, 0, h, 0, h.length);
    }
    
    protected void b(final int n, final int n2) {
        this.H[n] = n2;
    }
    
    public k b0(final l0 l0) {
        final long j = h.j(l0);
        return new k(j, h.i(l0).b(this, j, 1));
    }
    
    public k c0(final l0 l0) {
        final long j = h.j(l0);
        return new k(h.i(l0).b(this, j, -1), j);
    }
    
    @Override
    public int e0(final int n) {
        return this.H[n];
    }
    
    protected void f(final o0 o0) {
        if (o0 == null) {
            this.a0(new int[this.size()]);
        }
        else {
            this.X(o0);
        }
    }
    
    protected void i(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        this.a0(this.Z(n, n2, n3, n4, n5, n6, n7, n8));
    }
    
    protected void t(final org.joda.time.m m, final int n) {
        this.C(this.H, m, n);
    }
}
