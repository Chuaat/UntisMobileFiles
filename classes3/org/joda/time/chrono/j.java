// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.chrono;

import org.joda.time.n0;
import org.joda.time.g;
import org.joda.time.l;
import org.joda.time.field.p;

final class j extends p
{
    private static final long f = -1587436826395135328L;
    private final org.joda.time.chrono.c e;
    
    j(final org.joda.time.chrono.c e, final l l) {
        super(g.U(), l);
        this.e = e;
    }
    
    private Object c0() {
        return this.e.M();
    }
    
    @Override
    public int B(final n0 n0) {
        if (n0.Z(g.V())) {
            return this.e.K0(n0.j0(g.V()));
        }
        return 53;
    }
    
    @Override
    public int C(final n0 n0, final int[] array) {
        for (int size = n0.size(), i = 0; i < size; ++i) {
            if (n0.N(i) == g.V()) {
                return this.e.K0(array[i]);
            }
        }
        return 53;
    }
    
    @Override
    public int D() {
        return 1;
    }
    
    @Override
    public l I() {
        return this.e.Q();
    }
    
    @Override
    public long N(final long n) {
        return super.N(n + 259200000L);
    }
    
    @Override
    public long O(final long n) {
        return super.O(n + 259200000L) - 259200000L;
    }
    
    @Override
    public long P(final long n) {
        return super.P(n + 259200000L) - 259200000L;
    }
    
    @Override
    protected int a0(final long n, final int n2) {
        int z = 52;
        if (n2 > 52) {
            z = this.z(n);
        }
        return z;
    }
    
    @Override
    public int g(final long n) {
        return this.e.I0(n);
    }
    
    @Override
    public int y() {
        return 53;
    }
    
    @Override
    public int z(final long n) {
        return this.e.K0(this.e.L0(n));
    }
}
