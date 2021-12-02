// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.chrono;

import org.joda.time.field.t;
import org.joda.time.o;
import org.joda.time.a;
import org.joda.time.i;
import java.util.concurrent.ConcurrentHashMap;

public final class a0 extends g
{
    private static final long X0 = -8731039522547897247L;
    private static final long Y0 = 31557600000L;
    private static final long Z0 = 2629800000L;
    private static final int a1 = -292269054;
    private static final int b1 = 292272992;
    private static final a0 c1;
    private static final ConcurrentHashMap<i, a0[]> d1;
    
    static {
        d1 = new ConcurrentHashMap<i, a0[]>();
        c1 = X0(i.I);
    }
    
    a0(final org.joda.time.a a, final Object o, final int n) {
        super(a, o, n);
    }
    
    static int V0(final int i) {
        int n = i;
        if (i <= 0) {
            if (i == 0) {
                throw new o(org.joda.time.g.X(), i, null, null);
            }
            n = i + 1;
        }
        return n;
    }
    
    public static a0 W0() {
        return Y0(i.n(), 4);
    }
    
    public static a0 X0(final i i) {
        return Y0(i, 4);
    }
    
    public static a0 Y0(i value, final int n) {
        Object n2 = value;
        if (value == null) {
            n2 = i.n();
        }
        final ConcurrentHashMap<i, a0[]> d1 = a0.d1;
        if ((value = d1.get(n2)) == null) {
            value = new a0[7];
            final a0[] array = d1.putIfAbsent((i)n2, (a0[])value);
            if (array != null) {
                value = array;
            }
        }
        final int n3 = n - 1;
        final a0 a0;
        if ((a0 = value[n3]) == null) {
            // monitorenter(value)
            Label_0142: {
                if (value[n3] != null) {
                    break Label_0142;
                }
                try {
                    final i i = org.joda.time.i.I;
                    a0 a2;
                    if (n2 == i) {
                        a2 = new a0(null, null, n);
                    }
                    else {
                        a2 = new a0(e0.e0(Y0(i, n), (i)n2), null, n);
                    }
                    value[n3] = a2;
                }
                finally {
                }
                // monitorexit(value)
            }
        }
        return a0;
    }
    
    public static a0 Z0() {
        return a0.c1;
    }
    
    private Object a1() {
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
        return Y0(i, e0);
    }
    
    @Override
    int B0() {
        return 292272992;
    }
    
    @Override
    int D0() {
        return -292269054;
    }
    
    @Override
    public org.joda.time.a R() {
        return a0.c1;
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
        return X0(n);
    }
    
    @Override
    boolean T0(final int n) {
        return (n & 0x3) == 0x0;
    }
    
    @Override
    protected void X(final org.joda.time.chrono.a.a a) {
        if (this.Y() == null) {
            super.X(a);
            a.E = new t(this, a.E);
            a.B = new t(this, a.B);
        }
    }
    
    @Override
    long e0(int n) {
        final int n2 = n - 1968;
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
        return (n2 * 365L + n) * 86400000L - 62035200000L;
    }
    
    @Override
    long f0() {
        return 31083663600000L;
    }
    
    @Override
    long g0() {
        return 2629800000L;
    }
    
    @Override
    long h0() {
        return 31557600000L;
    }
    
    @Override
    long i0() {
        return 15778800000L;
    }
    
    @Override
    long j0(final int n, final int n2, final int n3) throws IllegalArgumentException {
        return super.j0(V0(n), n2, n3);
    }
}
