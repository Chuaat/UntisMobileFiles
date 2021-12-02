// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.chrono;

import org.joda.time.n0;
import org.joda.time.g;
import org.joda.time.l;
import org.joda.time.field.p;

final class d extends p
{
    private static final long f = -4677223814028011723L;
    private final org.joda.time.chrono.c e;
    
    d(final org.joda.time.chrono.c e, final l l) {
        super(g.B(), l);
        this.e = e;
    }
    
    private Object c0() {
        return this.e.g();
    }
    
    @Override
    public int B(final n0 n0) {
        if (!n0.Z(g.R())) {
            return this.y();
        }
        final int j0 = n0.j0(g.R());
        if (n0.Z(g.X())) {
            return this.e.x0(n0.j0(g.X()), j0);
        }
        return this.e.s0(j0);
    }
    
    @Override
    public int C(final n0 n0, final int[] array) {
        final int size = n0.size();
        final int n2 = 0;
        for (int i = 0; i < size; ++i) {
            if (n0.N(i) == g.R()) {
                final int n3 = array[i];
                for (int j = n2; j < size; ++j) {
                    if (n0.N(j) == g.X()) {
                        return this.e.x0(array[j], n3);
                    }
                }
                return this.e.s0(n3);
            }
        }
        return this.y();
    }
    
    @Override
    public int D() {
        return 1;
    }
    
    @Override
    public l I() {
        return this.e.G();
    }
    
    @Override
    public boolean K(final long n) {
        return this.e.S0(n);
    }
    
    @Override
    protected int a0(final long n, final int n2) {
        return this.e.u0(n, n2);
    }
    
    @Override
    public int g(final long n) {
        return this.e.l0(n);
    }
    
    @Override
    public int y() {
        return this.e.r0();
    }
    
    @Override
    public int z(final long n) {
        return this.e.t0(n);
    }
}
