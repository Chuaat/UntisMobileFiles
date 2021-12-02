// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.chrono;

import org.joda.time.a;

abstract class f extends c
{
    private static final long R0 = 261387371998L;
    static final int S0 = 30;
    static final long T0 = 31557600000L;
    static final long U0 = 2592000000L;
    
    f(final org.joda.time.a a, final Object o, final int n) {
        super(a, o, n);
    }
    
    @Override
    int F0(final long n) {
        return (this.p0(n) - 1) / 30 + 1;
    }
    
    @Override
    int G0(final long n, final int n2) {
        return (int)((n - this.P0(n2)) / 2592000000L) + 1;
    }
    
    @Override
    long H0(final int n, final int n2) {
        return (n2 - 1) * 2592000000L;
    }
    
    @Override
    long N0(final long n, final long n2) {
        final int m0 = this.M0(n);
        final int m2 = this.M0(n2);
        final long p2 = this.P0(m0);
        final long p3 = this.P0(m2);
        int n3 = m0 - m2;
        if (n - p2 < n2 - p3) {
            --n3;
        }
        return n3;
    }
    
    @Override
    boolean T0(final int n) {
        return (n & 0x3) == 0x3;
    }
    
    @Override
    long U0(final long n, final int n2) {
        final int q0 = this.q0(n, this.M0(n));
        final int c0 = this.C0(n);
        int n3 = q0;
        if (q0 > 365) {
            n3 = q0;
            if (!this.T0(n2)) {
                n3 = q0 - 1;
            }
        }
        return this.Q0(n2, 1, n3) + c0;
    }
    
    @Override
    long g0() {
        return 2592000000L;
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
    int l0(final long n) {
        return (this.p0(n) - 1) % 30 + 1;
    }
    
    @Override
    int r0() {
        return 30;
    }
    
    @Override
    int s0(int n) {
        if (n != 13) {
            n = 30;
        }
        else {
            n = 6;
        }
        return n;
    }
    
    @Override
    int x0(int n, final int n2) {
        if (n2 != 13) {
            n = 30;
        }
        else if (this.T0(n)) {
            n = 6;
        }
        else {
            n = 5;
        }
        return n;
    }
    
    @Override
    int z0() {
        return 13;
    }
}
