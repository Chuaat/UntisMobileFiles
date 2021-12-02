// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

public final class c5 implements Cloneable
{
    private static final d5 K;
    private boolean G;
    private int[] H;
    private d5[] I;
    private int J;
    
    static {
        K = new d5();
    }
    
    c5() {
        this(10);
    }
    
    private c5(int n) {
        this.G = false;
        final int n2 = n << 2;
        n = 4;
        int n3;
        while (true) {
            n3 = n2;
            if (n >= 32) {
                break;
            }
            n3 = (1 << n) - 12;
            if (n2 <= n3) {
                break;
            }
            ++n;
        }
        n = n3 / 4;
        this.H = new int[n];
        this.I = new d5[n];
        this.J = 0;
    }
    
    public final boolean a() {
        return this.J == 0;
    }
    
    final int b() {
        return this.J;
    }
    
    final d5 c(final int n) {
        return this.I[n];
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof c5)) {
            return false;
        }
        final c5 c5 = (c5)o;
        final int j = this.J;
        if (j != c5.J) {
            return false;
        }
        final int[] h = this.H;
        final int[] h2 = c5.H;
        while (true) {
            for (int i = 0; i < j; ++i) {
                if (h[i] != h2[i]) {
                    final boolean b = false;
                    if (b) {
                        final d5[] k = this.I;
                        final d5[] l = c5.I;
                        final int m = this.J;
                        int n = 0;
                        while (true) {
                            while (n < m) {
                                if (!k[n].equals(l[n])) {
                                    final boolean b2 = false;
                                    if (b2) {
                                        return true;
                                    }
                                    return false;
                                }
                                else {
                                    ++n;
                                }
                            }
                            final boolean b2 = true;
                            continue;
                        }
                    }
                    return false;
                }
            }
            final boolean b = true;
            continue;
        }
    }
    
    @Override
    public final int hashCode() {
        int n = 17;
        for (int i = 0; i < this.J; ++i) {
            n = (n * 31 + this.H[i]) * 31 + this.I[i].hashCode();
        }
        return n;
    }
}
