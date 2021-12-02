// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.chrono;

import org.joda.time.a;

abstract class g extends c
{
    private static final long R0 = 538276888268L;
    private static final int[] S0;
    private static final int[] T0;
    private static final long[] U0;
    private static final long[] V0;
    private static final long W0 = 5097600000L;
    
    static {
        S0 = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        T0 = new int[] { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        U0 = new long[12];
        V0 = new long[12];
        long n = 0L;
        long n2 = 0L;
        int n3;
        for (int i = 0; i < 11; i = n3) {
            n += g.S0[i] * 86400000L;
            final long[] u0 = g.U0;
            n3 = i + 1;
            u0[n3] = n;
            n2 += g.T0[i] * 86400000L;
            g.V0[n3] = n2;
        }
    }
    
    g(final org.joda.time.a a, final Object o, final int n) {
        super(a, o, n);
    }
    
    @Override
    int G0(final long n, int n2) {
        final long p2 = this.P0(n2);
        final int n3 = 10;
        final int n4 = (int)(n - p2 >> 10);
        if (this.T0(n2)) {
            if (n4 < 15356250) {
                if (n4 < 7678125) {
                    if (n4 >= 2615625) {
                        if (n4 < 5062500) {
                            return 2;
                        }
                        return 3;
                    }
                }
                else {
                    if (n4 < 10209375) {
                        return 4;
                    }
                    if (n4 < 12825000) {
                        return 5;
                    }
                    return 6;
                }
            }
            else if (n4 < 23118750) {
                if (n4 < 17971875) {
                    return 7;
                }
                if (n4 < 20587500) {
                    return 8;
                }
                return 9;
            }
            else {
                if (n4 < 25734375) {
                    n2 = n3;
                    return n2;
                }
                if (n4 < 28265625) {
                    return 11;
                }
                return 12;
            }
        }
        else if (n4 < 15271875) {
            if (n4 < 7593750) {
                if (n4 >= 2615625) {
                    if (n4 < 4978125) {
                        return 2;
                    }
                    return 3;
                }
            }
            else {
                if (n4 < 10125000) {
                    return 4;
                }
                if (n4 < 12740625) {
                    return 5;
                }
                return 6;
            }
        }
        else if (n4 < 23034375) {
            if (n4 < 17887500) {
                return 7;
            }
            if (n4 < 20503125) {
                return 8;
            }
            return 9;
        }
        else {
            if (n4 < 25650000) {
                n2 = n3;
                return n2;
            }
            if (n4 < 28181250) {
                return 11;
            }
            return 12;
        }
        n2 = 1;
        return n2;
        n2 = 2;
        return n2;
        n2 = 3;
        return n2;
        n2 = 4;
        return n2;
        n2 = 5;
        return n2;
        n2 = 6;
        return n2;
        n2 = 7;
        return n2;
        n2 = 8;
        return n2;
        n2 = 9;
        return n2;
        n2 = 11;
        return n2;
        n2 = 12;
        return n2;
    }
    
    @Override
    long H0(final int n, final int n2) {
        if (this.T0(n)) {
            return g.V0[n2 - 1];
        }
        return g.U0[n2 - 1];
    }
    
    @Override
    long N0(long n, long n2) {
        final int m0 = this.M0(n);
        final int m2 = this.M0(n2);
        final long n3 = n - this.P0(m0);
        final long n4 = n2 - this.P0(m2);
        n2 = n3;
        n = n4;
        if (n4 >= 5097600000L) {
            if (this.T0(m2)) {
                n2 = n3;
                n = n4;
                if (!this.T0(m0)) {
                    n = n4 - 86400000L;
                    n2 = n3;
                }
            }
            else {
                n2 = n3;
                n = n4;
                if (n3 >= 5097600000L) {
                    n2 = n3;
                    n = n4;
                    if (this.T0(m0)) {
                        n2 = n3 - 86400000L;
                        n = n4;
                    }
                }
            }
        }
        int n5 = m0 - m2;
        if (n2 < n) {
            --n5;
        }
        return n5;
    }
    
    @Override
    boolean S0(final long n) {
        return this.g().g(n) == 29 && this.F().K(n);
    }
    
    @Override
    long U0(final long n, final int n2) {
        final int m0 = this.M0(n);
        final int q0 = this.q0(n, m0);
        final int c0 = this.C0(n);
        int n3 = q0;
        if (q0 > 59) {
            if (this.T0(m0)) {
                n3 = q0;
                if (!this.T0(n2)) {
                    n3 = q0 - 1;
                }
            }
            else {
                n3 = q0;
                if (this.T0(n2)) {
                    n3 = q0 + 1;
                }
            }
        }
        return this.Q0(n2, 1, n3) + c0;
    }
    
    @Override
    int s0(final int n) {
        return g.T0[n - 1];
    }
    
    @Override
    int u0(final long n, final int n2) {
        int t0 = 28;
        if (n2 > 28 || n2 < 1) {
            t0 = this.t0(n);
        }
        return t0;
    }
    
    @Override
    int x0(final int n, final int n2) {
        if (this.T0(n)) {
            return g.T0[n2 - 1];
        }
        return g.S0[n2 - 1];
    }
}
