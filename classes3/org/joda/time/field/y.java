// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.field;

import org.joda.time.l;
import org.joda.time.n0;
import org.joda.time.g;
import org.joda.time.f;

public final class y extends e
{
    private static final long d = 961749798233026866L;
    
    public y(final f f, final g g) {
        super(f, g);
        if (f.D() == 0) {
            return;
        }
        throw new IllegalArgumentException("Wrapped field's minumum value must be zero");
    }
    
    @Override
    public int B(final n0 n0) {
        return this.a0().B(n0) + 1;
    }
    
    @Override
    public int C(final n0 n0, final int[] array) {
        return this.a0().C(n0, array) + 1;
    }
    
    @Override
    public int D() {
        return 1;
    }
    
    @Override
    public int E(final long n) {
        return 1;
    }
    
    @Override
    public int F(final n0 n0) {
        return 1;
    }
    
    @Override
    public int G(final n0 n0, final int[] array) {
        return 1;
    }
    
    @Override
    public boolean K(final long n) {
        return this.a0().K(n);
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
    public long Q(final long n) {
        return this.a0().Q(n);
    }
    
    @Override
    public long R(final long n) {
        return this.a0().R(n);
    }
    
    @Override
    public long S(final long n) {
        return this.a0().S(n);
    }
    
    @Override
    public long T(final long n, final int n2) {
        final int y = this.y();
        j.p(this, n2, 1, y);
        int n3 = n2;
        if (n2 == y) {
            n3 = 0;
        }
        return this.a0().T(n, n3);
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
        int n2;
        if ((n2 = this.a0().g(n)) == 0) {
            n2 = this.y();
        }
        return n2;
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
    public int u(final long n) {
        return this.a0().u(n);
    }
    
    @Override
    public l v() {
        return this.a0().v();
    }
    
    @Override
    public int y() {
        return this.a0().y() + 1;
    }
    
    @Override
    public int z(final long n) {
        return this.a0().z(n) + 1;
    }
}
