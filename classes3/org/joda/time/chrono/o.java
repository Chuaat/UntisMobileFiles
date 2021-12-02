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

public final class o extends f
{
    private static final long V0 = -5972804258688333942L;
    public static final int W0 = 1;
    private static final org.joda.time.f X0;
    private static final int Y0 = -292269337;
    private static final int Z0 = 292272984;
    private static final ConcurrentHashMap<i, o[]> a1;
    private static final o b1;
    
    static {
        X0 = new org.joda.time.chrono.i("EE");
        a1 = new ConcurrentHashMap<i, o[]>();
        b1 = W0(i.I);
    }
    
    o(final org.joda.time.a a, final Object o, final int n) {
        super(a, o, n);
    }
    
    public static o V0() {
        return X0(i.n(), 4);
    }
    
    public static o W0(final i i) {
        return X0(i, 4);
    }
    
    public static o X0(i value, final int n) {
        Object n2 = value;
        if (value == null) {
            n2 = i.n();
        }
        final ConcurrentHashMap<i, o[]> a1 = o.a1;
        if ((value = a1.get(n2)) == null) {
            value = new o[7];
            final o[] array = a1.putIfAbsent((i)n2, (o[])value);
            if (array != null) {
                value = array;
            }
        }
        final int n3 = n - 1;
        final o o;
        if ((o = value[n3]) == null) {
            // monitorenter(value)
            Label_0174: {
                if (value[n3] != null) {
                    break Label_0174;
                }
                try {
                    final i i = org.joda.time.i.I;
                    o o3;
                    if (n2 == i) {
                        final o o2 = new o(null, null, n);
                        o3 = new o(c0.f0(o2, new org.joda.time.c(1, 1, 1, 0, 0, 0, 0, o2), null), null, n);
                    }
                    else {
                        o3 = new o(e0.e0(X0(i, n), (i)n2), null, n);
                    }
                    value[n3] = o3;
                }
                finally {
                }
                // monitorexit(value)
            }
        }
        return o;
    }
    
    public static o Y0() {
        return o.b1;
    }
    
    private Object Z0() {
        final org.joda.time.a y = this.Y();
        i i;
        if (y == null) {
            i = org.joda.time.i.I;
        }
        else {
            i = y.s();
        }
        return X0(i, this.E0());
    }
    
    @Override
    int B0() {
        return 292272984;
    }
    
    @Override
    int D0() {
        return -292269337;
    }
    
    @Override
    public org.joda.time.a R() {
        return o.b1;
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
            a.I = o.X0;
            final h d = new h(this, 13);
            a.D = d;
            a.i = d.t();
        }
    }
    
    @Override
    long e0(int n) {
        final int n2 = n - 1963;
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
        return 30962844000000L;
    }
}
