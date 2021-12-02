// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.chrono;

import org.joda.time.o0;
import org.joda.time.field.j;
import org.joda.time.i;
import org.joda.time.o;
import org.joda.time.n0;
import org.joda.time.field.x;
import org.joda.time.m;
import org.joda.time.l;
import org.joda.time.field.w;
import org.joda.time.g;
import org.joda.time.f;
import java.io.Serializable;
import org.joda.time.a;

public abstract class b extends a implements Serializable
{
    private static final long G = -7310865996721419676L;
    
    protected b() {
    }
    
    @Override
    public f B() {
        return w.Z(g.O(), this.y());
    }
    
    @Override
    public f C() {
        return w.Z(g.P(), this.E());
    }
    
    @Override
    public f D() {
        return w.Z(g.Q(), this.E());
    }
    
    @Override
    public l E() {
        return x.I(m.j());
    }
    
    @Override
    public f F() {
        return w.Z(g.R(), this.G());
    }
    
    @Override
    public l G() {
        return x.I(m.k());
    }
    
    @Override
    public f H() {
        return w.Z(g.S(), this.J());
    }
    
    @Override
    public f I() {
        return w.Z(g.T(), this.J());
    }
    
    @Override
    public l J() {
        return x.I(m.l());
    }
    
    @Override
    public long K(final n0 n0, long t) {
        for (int size = n0.size(), i = 0; i < size; ++i) {
            t = n0.N(i).G(this).T(t, n0.e0(i));
        }
        return t;
    }
    
    @Override
    public void L(final n0 n0, final int[] array) {
        final int size = n0.size();
        final int n2 = 0;
        int n3 = 0;
        int i;
        while (true) {
            i = n2;
            if (n3 >= size) {
                break;
            }
            final int n4 = array[n3];
            final f q3 = n0.Q3(n3);
            if (n4 < q3.D()) {
                throw new o(q3.J(), n4, q3.D(), null);
            }
            if (n4 > q3.y()) {
                throw new o(q3.J(), n4, null, q3.y());
            }
            ++n3;
        }
        while (i < size) {
            final int n5 = array[i];
            final f q4 = n0.Q3(i);
            if (n5 < q4.G(n0, array)) {
                throw new o(q4.J(), n5, q4.G(n0, array), null);
            }
            if (n5 > q4.C(n0, array)) {
                throw new o(q4.J(), n5, null, q4.C(n0, array));
            }
            ++i;
        }
    }
    
    @Override
    public f M() {
        return w.Z(g.U(), this.N());
    }
    
    @Override
    public l N() {
        return x.I(m.m());
    }
    
    @Override
    public f O() {
        return w.Z(g.V(), this.Q());
    }
    
    @Override
    public f P() {
        return w.Z(g.W(), this.Q());
    }
    
    @Override
    public l Q() {
        return x.I(m.n());
    }
    
    @Override
    public abstract a R();
    
    @Override
    public abstract a S(final i p0);
    
    @Override
    public f T() {
        return w.Z(g.X(), this.W());
    }
    
    @Override
    public f U() {
        return w.Z(g.Y(), this.W());
    }
    
    @Override
    public f V() {
        return w.Z(g.Z(), this.W());
    }
    
    @Override
    public l W() {
        return x.I(m.o());
    }
    
    @Override
    public long a(final long n, final long n2, final int n3) {
        long e = n;
        if (n2 != 0L) {
            if (n3 == 0) {
                e = n;
            }
            else {
                e = j.e(n, j.i(n2, n3));
            }
        }
        return e;
    }
    
    @Override
    public long b(final o0 o0, long n, final int n2) {
        long n3 = n;
        if (n2 != 0) {
            n3 = n;
            if (o0 != null) {
                int n4 = 0;
                final int size = o0.size();
                while (true) {
                    n3 = n;
                    if (n4 >= size) {
                        break;
                    }
                    final long n5 = o0.e0(n4);
                    long d = n;
                    if (n5 != 0L) {
                        d = o0.N(n4).d(this).d(n, n5 * n2);
                    }
                    ++n4;
                    n = d;
                }
            }
        }
        return n3;
    }
    
    @Override
    public l c() {
        return x.I(m.a());
    }
    
    @Override
    public f d() {
        return w.Z(g.x(), this.c());
    }
    
    @Override
    public f e() {
        return w.Z(g.y(), this.x());
    }
    
    @Override
    public f f() {
        return w.Z(g.z(), this.x());
    }
    
    @Override
    public f g() {
        return w.Z(g.B(), this.j());
    }
    
    @Override
    public f h() {
        return w.Z(g.C(), this.j());
    }
    
    @Override
    public f i() {
        return w.Z(g.D(), this.j());
    }
    
    @Override
    public l j() {
        return x.I(m.b());
    }
    
    @Override
    public f k() {
        return w.Z(g.E(), this.l());
    }
    
    @Override
    public l l() {
        return x.I(m.c());
    }
    
    @Override
    public int[] m(final n0 n0, final long n2) {
        final int size = n0.size();
        final int[] array = new int[size];
        for (int i = 0; i < size; ++i) {
            array[i] = n0.N(i).G(this).g(n2);
        }
        return array;
    }
    
    @Override
    public int[] n(final o0 o0, final long n) {
        final int size = o0.size();
        final int[] array = new int[size];
        long n2 = 0L;
        if (n != 0L) {
            long b;
            for (int i = 0; i < size; ++i, n2 = b) {
                final l d = o0.N(i).d(this);
                b = n2;
                if (d.y()) {
                    final int f = d.f(n, n2);
                    b = d.b(n2, f);
                    array[i] = f;
                }
            }
        }
        return array;
    }
    
    @Override
    public int[] o(final o0 o0, long n, final long n2) {
        final int size = o0.size();
        final int[] array = new int[size];
        if (n != n2) {
            long b;
            for (int i = 0; i < size; ++i, n = b) {
                final l d = o0.N(i).d(this);
                final int f = d.f(n2, n);
                b = n;
                if (f != 0) {
                    b = d.b(n, f);
                }
                array[i] = f;
            }
        }
        return array;
    }
    
    @Override
    public long p(final int n, final int n2, final int n3, final int n4) throws IllegalArgumentException {
        return this.z().T(this.g().T(this.F().T(this.T().T(0L, n), n2), n3), n4);
    }
    
    @Override
    public long q(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7) throws IllegalArgumentException {
        return this.B().T(this.I().T(this.D().T(this.v().T(this.g().T(this.F().T(this.T().T(0L, n), n2), n3), n4), n5), n6), n7);
    }
    
    @Override
    public long r(long n, final int n2, final int n3, final int n4, final int n5) throws IllegalArgumentException {
        n = this.v().T(n, n2);
        n = this.D().T(n, n3);
        n = this.I().T(n, n4);
        return this.B().T(n, n5);
    }
    
    @Override
    public abstract i s();
    
    @Override
    public f t() {
        return w.Z(g.J(), this.u());
    }
    
    @Override
    public abstract String toString();
    
    @Override
    public l u() {
        return x.I(m.f());
    }
    
    @Override
    public f v() {
        return w.Z(g.K(), this.x());
    }
    
    @Override
    public f w() {
        return w.Z(g.L(), this.x());
    }
    
    @Override
    public l x() {
        return x.I(m.g());
    }
    
    @Override
    public l y() {
        return x.I(m.i());
    }
    
    @Override
    public f z() {
        return w.Z(g.N(), this.y());
    }
}
