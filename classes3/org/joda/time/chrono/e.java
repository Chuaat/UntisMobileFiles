// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.chrono;

import org.joda.time.n0;
import org.joda.time.g;
import org.joda.time.l;
import org.joda.time.field.p;

final class e extends p
{
    private static final long f = -6821236822336841037L;
    private final org.joda.time.chrono.c e;
    
    e(final org.joda.time.chrono.c e, final l l) {
        super(g.D(), l);
        this.e = e;
    }
    
    private Object c0() {
        return this.e.i();
    }
    
    @Override
    public int B(final n0 n0) {
        if (n0.Z(g.X())) {
            return this.e.v0(n0.j0(g.X()));
        }
        return this.e.w0();
    }
    
    @Override
    public int C(final n0 n0, final int[] array) {
        for (int size = n0.size(), i = 0; i < size; ++i) {
            if (n0.N(i) == g.X()) {
                return this.e.v0(array[i]);
            }
        }
        return this.e.w0();
    }
    
    @Override
    public int D() {
        return 1;
    }
    
    @Override
    public l I() {
        return this.e.W();
    }
    
    @Override
    public boolean K(final long n) {
        return this.e.S0(n);
    }
    
    @Override
    protected int a0(final long n, final int n2) {
        int z = this.e.w0() - 1;
        if (n2 > z || n2 < 1) {
            z = this.z(n);
        }
        return z;
    }
    
    @Override
    public int g(final long n) {
        return this.e.p0(n);
    }
    
    @Override
    public int y() {
        return this.e.w0();
    }
    
    @Override
    public int z(final long n) {
        return this.e.v0(this.e.M0(n));
    }
}
