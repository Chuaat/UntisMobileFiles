// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.chrono;

import org.joda.time.field.t;
import org.joda.time.j0;
import org.joda.time.c;
import org.joda.time.a;
import org.joda.time.i;
import java.util.concurrent.ConcurrentHashMap;

public final class n extends f
{
    private static final long V0 = -5972804258688333942L;
    public static final int W0 = 1;
    private static final org.joda.time.f X0;
    private static final int Y0 = -292269337;
    private static final int Z0 = 292272708;
    private static final ConcurrentHashMap<i, n[]> a1;
    private static final n b1;
    
    static {
        X0 = new org.joda.time.chrono.i("AM");
        a1 = new ConcurrentHashMap<i, n[]>();
        b1 = W0(i.I);
    }
    
    n(final org.joda.time.a a, final Object o, final int n) {
        super(a, o, n);
    }
    
    public static n V0() {
        return X0(i.n(), 4);
    }
    
    public static n W0(final i i) {
        return X0(i, 4);
    }
    
    public static n X0(i value, final int n) {
        Object n2 = value;
        if (value == null) {
            n2 = i.n();
        }
        final ConcurrentHashMap<i, n[]> a1 = n.a1;
        if ((value = a1.get(n2)) == null) {
            value = new n[7];
            final n[] array = a1.putIfAbsent((i)n2, (n[])value);
            if (array != null) {
                value = array;
            }
        }
        final int n3 = n - 1;
        final n n4;
        if ((n4 = value[n3]) == null) {
            // monitorenter(value)
            Label_0174: {
                if (value[n3] != null) {
                    break Label_0174;
                }
                try {
                    final i i = org.joda.time.i.I;
                    n n6;
                    if (n2 == i) {
                        final n n5 = new n(null, null, n);
                        n6 = new n(c0.f0(n5, new org.joda.time.c(1, 1, 1, 0, 0, 0, 0, n5), null), null, n);
                    }
                    else {
                        n6 = new n(e0.e0(X0(i, n), (i)n2), null, n);
                    }
                    value[n3] = n6;
                }
                finally {
                }
                // monitorexit(value)
            }
        }
        return n4;
    }
    
    public static n Y0() {
        return n.b1;
    }
    
    private Object Z0() {
        final org.joda.time.a y = this.Y();
        int e0;
        if ((e0 = this.E0()) == 0) {
            e0 = 4;
        }
        i i;
        if (y == null) {
            i = org.joda.time.i.I;
        }
        else {
            i = y.s();
        }
        return X0(i, e0);
    }
    
    @Override
    int B0() {
        return 292272708;
    }
    
    @Override
    int D0() {
        return -292269337;
    }
    
    @Override
    public org.joda.time.a R() {
        return n.b1;
    }
    
    @Override
    public org.joda.time.a S(final i i) {
        i n = i;
        if (i == null) {
            n = i.n();
        }
        if (n == this.s()) {
            return this;
        }
        return W0(n);
    }
    
    @Override
    boolean S0(final long n) {
        return this.g().g(n) == 6 && this.F().K(n);
    }
    
    @Override
    protected void X(final org.joda.time.chrono.a.a a) {
        if (this.Y() == null) {
            super.X(a);
            a.E = new t(this, a.E);
            a.B = new t(this, a.B);
            a.I = n.X0;
            final h d = new h(this, 13);
            a.D = d;
            a.i = d.t();
        }
    }
    
    @Override
    long e0(int n) {
        final int n2 = n - 1687;
        if (n2 <= 0) {
            n = n2 + 3 >> 2;
        }
        else {
            final int n3 = n2 >> 2;
            if (!this.T0(n)) {
                n = n3 + 1;
            }
            else {
                n = n3;
            }
        }
        return (n2 * 365L + n) * 86400000L + 21859200000L;
    }
    
    @Override
    long f0() {
        return 26607895200000L;
    }
}
