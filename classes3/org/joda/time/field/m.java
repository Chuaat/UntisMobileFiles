// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.field;

import java.io.Serializable;
import org.joda.time.l;

public final class m extends l implements Serializable
{
    private static final long G = 2656707858124633367L;
    public static final l H;
    
    static {
        H = new m();
    }
    
    private m() {
    }
    
    private Object I() {
        return m.H;
    }
    
    public int G(final l l) {
        final long n = lcmp(this.o(), l.o());
        if (n == 0) {
            return 0;
        }
        if (n < 0) {
            return -1;
        }
        return 1;
    }
    
    @Override
    public long b(final long n, final int n2) {
        return j.e(n, n2);
    }
    
    @Override
    public long d(final long n, final long n2) {
        return j.e(n, n2);
    }
    
    @Override
    public boolean equals(final Object o) {
        final boolean b = o instanceof m;
        boolean b2 = false;
        if (b) {
            b2 = b2;
            if (this.o() == ((m)o).o()) {
                b2 = true;
            }
        }
        return b2;
    }
    
    @Override
    public int f(final long n, final long n2) {
        return j.n(j.m(n, n2));
    }
    
    @Override
    public long g(final long n, final long n2) {
        return j.m(n, n2);
    }
    
    @Override
    public long h(final int n) {
        return n;
    }
    
    @Override
    public int hashCode() {
        return (int)this.o();
    }
    
    @Override
    public long i(final int n, final long n2) {
        return n;
    }
    
    @Override
    public long j(final long n) {
        return n;
    }
    
    @Override
    public long k(final long n, final long n2) {
        return n;
    }
    
    @Override
    public String l() {
        return "millis";
    }
    
    @Override
    public org.joda.time.m m() {
        return org.joda.time.m.i();
    }
    
    @Override
    public final long o() {
        return 1L;
    }
    
    @Override
    public int p(final long n) {
        return j.n(n);
    }
    
    @Override
    public int s(final long n, final long n2) {
        return j.n(n);
    }
    
    @Override
    public String toString() {
        return "DurationField[millis]";
    }
    
    @Override
    public long u(final long n) {
        return n;
    }
    
    @Override
    public long v(final long n, final long n2) {
        return n;
    }
    
    @Override
    public final boolean y() {
        return true;
    }
    
    @Override
    public boolean z() {
        return true;
    }
}
