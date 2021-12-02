// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.chrono;

import org.joda.time.a;
import org.joda.time.i;
import java.util.concurrent.ConcurrentHashMap;

public final class w extends g
{
    private static final long X0 = -861407383323710522L;
    private static final long Y0 = 31556952000L;
    private static final long Z0 = 2629746000L;
    private static final int a1 = 719527;
    private static final int b1 = -292275054;
    private static final int c1 = 292278993;
    private static final w d1;
    private static final ConcurrentHashMap<i, w[]> e1;
    
    static {
        e1 = new ConcurrentHashMap<i, w[]>();
        d1 = W0(i.I);
    }
    
    private w(final org.joda.time.a a, final Object o, final int n) {
        super(a, o, n);
    }
    
    public static w V0() {
        return X0(i.n(), 4);
    }
    
    public static w W0(final i i) {
        return X0(i, 4);
    }
    
    public static w X0(i value, final int n) {
        Object n2 = value;
        if (value == null) {
            n2 = i.n();
        }
        final ConcurrentHashMap<i, w[]> e1 = w.e1;
        if ((value = e1.get(n2)) == null) {
            value = new w[7];
            final w[] array = e1.putIfAbsent((i)n2, (w[])value);
            if (array != null) {
                value = array;
            }
        }
        final int n3 = n - 1;
        final w w;
        if ((w = value[n3]) == null) {
            // monitorenter(value)
            Label_0142: {
                if (value[n3] != null) {
                    break Label_0142;
                }
                try {
                    final i i = org.joda.time.i.I;
                    w w2;
                    if (n2 == i) {
                        w2 = new w(null, null, n);
                    }
                    else {
                        w2 = new w(e0.e0(X0(i, n), (i)n2), null, n);
                    }
                    value[n3] = w2;
                }
                finally {
                }
                // monitorexit(value)
            }
        }
        return w;
    }
    
    public static w Y0() {
        return w.d1;
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
        return 292278993;
    }
    
    @Override
    int D0() {
        return -292275054;
    }
    
    @Override
    public org.joda.time.a R() {
        return w.d1;
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
    boolean T0(final int n) {
        return (n & 0x3) == 0x0 && (n % 100 != 0 || n % 400 == 0);
    }
    
    @Override
    protected void X(final org.joda.time.chrono.a.a a) {
        if (this.Y() == null) {
            super.X(a);
        }
    }
    
    @Override
    long e0(final int n) {
        final int n2 = n / 100;
        int n3;
        if (n < 0) {
            n3 = (n + 3 >> 2) - n2 + (n2 + 3 >> 2) - 1;
        }
        else {
            n3 = (n >> 2) - n2 + (n2 >> 2);
            if (this.T0(n)) {
                --n3;
            }
        }
        return (n * 365L + (n3 - 719527)) * 86400000L;
    }
    
    @Override
    long f0() {
        return 31083597720000L;
    }
    
    @Override
    long g0() {
        return 2629746000L;
    }
    
    @Override
    long h0() {
        return 31556952000L;
    }
    
    @Override
    long i0() {
        return 15778476000L;
    }
}
