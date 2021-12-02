// 
// Decompiled by Procyon v0.5.36
// 

package com.squareup.moshi;

import okio.t0;
import java.io.IOException;
import okio.m;
import okio.o;
import okio.p;
import okio.r0;

final class r implements r0
{
    static final p N;
    static final p O;
    static final p P;
    static final p Q;
    static final p R;
    static final p S;
    private final o G;
    private final m H;
    private final m I;
    private p J;
    private int K;
    private long L;
    private boolean M;
    
    static {
        N = p.o("[]{}\"'/#");
        O = p.o("'\\");
        P = p.o("\"\\");
        Q = p.o("\r\n");
        R = p.o("*");
        S = p.K;
    }
    
    r(final o o) {
        this(o, new m(), r.N, 0);
    }
    
    r(final o g, final m i, final p j, final int k) {
        this.L = 0L;
        this.M = false;
        this.G = g;
        this.H = g.z();
        this.I = i;
        this.J = j;
        this.K = k;
    }
    
    private void a(final long n) throws IOException {
    Label_0333_Outer:
        while (true) {
            final long l = this.L;
            if (l >= n) {
                return;
            }
            final p j = this.J;
            p s = r.S;
            if (j == s) {
                return;
            }
            if (l == this.H.h0()) {
                if (this.L > 0L) {
                    return;
                }
                this.G.B5(1L);
            }
            final long y5 = this.H.y5(this.J, this.L);
            long h2 = 0L;
            Label_0094: {
                if (y5 != -1L) {
                    final byte f = this.H.F(y5);
                    final p i = this.J;
                    final p n2 = r.N;
                    while (true) {
                        Label_0497: {
                            if (i == n2) {
                                p j2;
                                if (f != 34) {
                                    if (f != 35) {
                                        if (f != 39) {
                                            if (f != 47) {
                                                Label_0211: {
                                                    if (f != 91) {
                                                        if (f != 93) {
                                                            if (f == 123) {
                                                                break Label_0211;
                                                            }
                                                            if (f != 125) {
                                                                continue Label_0333_Outer;
                                                            }
                                                        }
                                                        if (--this.K == 0) {
                                                            break Label_0497;
                                                        }
                                                        break Label_0333;
                                                    }
                                                }
                                                ++this.K;
                                                break Label_0333;
                                            }
                                            final o g = this.G;
                                            final long k = 2L + y5;
                                            g.B5(k);
                                            final m h = this.H;
                                            h2 = y5 + 1L;
                                            final byte f2 = h.F(h2);
                                            p m;
                                            if (f2 == 47) {
                                                m = r.Q;
                                            }
                                            else {
                                                if (f2 != 42) {
                                                    break Label_0094;
                                                }
                                                m = r.R;
                                            }
                                            this.J = m;
                                            this.L = k;
                                            continue Label_0333_Outer;
                                        }
                                        else {
                                            j2 = r.O;
                                        }
                                    }
                                    else {
                                        j2 = r.Q;
                                    }
                                }
                                else {
                                    j2 = r.P;
                                }
                                this.J = j2;
                            }
                            else {
                                if (i != r.O && i != r.P) {
                                    if (i == r.R) {
                                        final o g2 = this.G;
                                        final long l2 = 2L + y5;
                                        g2.B5(l2);
                                        if (this.H.F(h2 = y5 + 1L) != 47) {
                                            break Label_0094;
                                        }
                                        this.L = l2;
                                    }
                                    else {
                                        if (i != r.Q) {
                                            throw new AssertionError();
                                        }
                                        this.L = y5 + 1L;
                                    }
                                    this.J = n2;
                                    continue Label_0333_Outer;
                                }
                                if (f == 92) {
                                    final o g3 = this.G;
                                    h2 = y5 + 2L;
                                    g3.B5(h2);
                                    break Label_0094;
                                }
                                if (this.K > 0) {
                                    s = n2;
                                }
                                break Label_0497;
                            }
                            h2 = y5 + 1L;
                            break Label_0094;
                        }
                        this.J = s;
                        continue;
                    }
                }
                h2 = this.H.h0();
            }
            this.L = h2;
        }
    }
    
    public void b() throws IOException {
        this.M = true;
        while (this.J != r.S) {
            this.a(8192L);
            this.G.skip(this.L);
        }
    }
    
    public void close() throws IOException {
        this.M = true;
    }
    
    public long read(final m m, long min) throws IOException {
        if (this.M) {
            throw new IllegalStateException("closed");
        }
        if (min == 0L) {
            return 0L;
        }
        if (!this.I.D1()) {
            final long read = this.I.read(m, min);
            if (this.H.D1()) {
                return read;
            }
            final long read2 = this.read(m, min - read);
            min = read;
            if (read2 != -1L) {
                min = read + read2;
            }
            return min;
        }
        else {
            this.a(min);
            final long l = this.L;
            if (l != 0L) {
                min = Math.min(min, l);
                m.t3(this.H, min);
                this.L -= min;
                return min;
            }
            if (this.J == r.S) {
                return -1L;
            }
            throw new AssertionError();
        }
    }
    
    public t0 timeout() {
        return ((r0)this.G).timeout();
    }
}
