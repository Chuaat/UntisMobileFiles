// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.field;

import org.joda.time.m;
import org.joda.time.g;
import org.joda.time.l;

public abstract class k extends c
{
    private static final long d = 7190739608550251860L;
    final long b;
    private final l c;
    
    public k(final g g, final long b) {
        super(g);
        this.b = b;
        this.c = new a(g.F());
    }
    
    @Override
    public abstract l I();
    
    @Override
    public abstract long P(final long p0);
    
    @Override
    public abstract long T(final long p0, final int p1);
    
    @Override
    public abstract long a(final long p0, final int p1);
    
    protected final long a0() {
        return this.b;
    }
    
    @Override
    public abstract long b(final long p0, final long p1);
    
    @Override
    public abstract int g(final long p0);
    
    @Override
    public int r(final long n, final long n2) {
        return j.n(this.s(n, n2));
    }
    
    @Override
    public long s(final long n, final long n2) {
        if (n < n2) {
            return -this.s(n2, n);
        }
        long n3 = (n - n2) / this.b;
        long n5;
        if (this.b(n2, n3) < n) {
            long n4;
            do {
                n4 = ++n3;
            } while (this.b(n2, n4) <= n);
            n5 = n4 - 1L;
        }
        else {
            n5 = n3;
            if (this.b(n2, n3) > n) {
                do {
                    n5 = --n3;
                } while (this.b(n2, n5) > n);
            }
        }
        return n5;
    }
    
    @Override
    public final l t() {
        return this.c;
    }
    
    private final class a extends d
    {
        private static final long J = -203813474600094134L;
        
        a(final m m) {
            super(m);
        }
        
        @Override
        public long b(final long n, final int n2) {
            return k.this.a(n, n2);
        }
        
        @Override
        public long d(final long n, final long n2) {
            return k.this.b(n, n2);
        }
        
        @Override
        public int f(final long n, final long n2) {
            return k.this.r(n, n2);
        }
        
        @Override
        public long g(final long n, final long n2) {
            return k.this.s(n, n2);
        }
        
        @Override
        public long i(final int n, final long n2) {
            return k.this.a(n2, n) - n2;
        }
        
        @Override
        public long k(final long n, final long n2) {
            return k.this.b(n2, n) - n2;
        }
        
        @Override
        public long o() {
            return k.this.b;
        }
        
        @Override
        public int s(final long n, final long n2) {
            return k.this.r(n + n2, n2);
        }
        
        @Override
        public long v(final long n, final long n2) {
            return k.this.s(n + n2, n2);
        }
        
        @Override
        public boolean y() {
            return false;
        }
    }
}
