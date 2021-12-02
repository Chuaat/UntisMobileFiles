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

final class v extends e
{
    private static final long e = -5961050944769862059L;
    private final org.joda.time.chrono.c d;
    
    v(final f f, final org.joda.time.chrono.c d) {
        super(f, g.Z());
        this.d = d;
    }
    
    private Object b0() {
        return this.d.V();
    }
    
    @Override
    public int D() {
        return 1;
    }
    
    @Override
    public l I() {
        return this.d.l();
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
        j.p(this, n2, 1, this.y());
        int n3 = n2;
        if (this.d.M0(n) <= 0) {
            n3 = 1 - n2;
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
        if (n2 <= 0) {
            g = 1 - n2;
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
