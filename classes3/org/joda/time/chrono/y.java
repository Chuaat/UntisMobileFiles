// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.chrono;

import org.joda.time.n0;
import org.joda.time.field.j;
import org.joda.time.l;
import org.joda.time.g;
import org.joda.time.f;
import org.joda.time.field.e;

class y extends e
{
    private static final long d = 7037524068969447317L;
    static final f e;
    
    static {
        e = new y();
    }
    
    private y() {
        super(w.Y0().T(), g.Z());
    }
    
    private Object b0() {
        return y.e;
    }
    
    @Override
    public int D() {
        return 0;
    }
    
    @Override
    public l I() {
        return w.Y0().l();
    }
    
    @Override
    public long N(final long n) {
        return this.a0().N(n);
    }
    
    @Override
    public long O(final long n) {
        return this.a0().O(n);
    }
    
    @Override
    public long P(final long n) {
        return this.a0().P(n);
    }
    
    @Override
    public long T(final long n, final int n2) {
        j.p(this, n2, 0, this.y());
        int n3 = n2;
        if (this.a0().g(n) < 0) {
            n3 = -n2;
        }
        return super.T(n, n3);
    }
    
    @Override
    public long a(final long n, final int n2) {
        return this.a0().a(n, n2);
    }
    
    @Override
    public long b(final long n, final long n2) {
        return this.a0().b(n, n2);
    }
    
    @Override
    public long d(final long n, final int n2) {
        return this.a0().d(n, n2);
    }
    
    @Override
    public int[] e(final n0 n0, final int n2, final int[] array, final int n3) {
        return this.a0().e(n0, n2, array, n3);
    }
    
    @Override
    public int g(final long n) {
        int g;
        final int n2 = g = this.a0().g(n);
        if (n2 < 0) {
            g = -n2;
        }
        return g;
    }
    
    @Override
    public int r(final long n, final long n2) {
        return this.a0().r(n, n2);
    }
    
    @Override
    public long s(final long n, final long n2) {
        return this.a0().s(n, n2);
    }
    
    @Override
    public int y() {
        return this.a0().y();
    }
}
