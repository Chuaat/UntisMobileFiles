// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.util.Arrays;

public final class d4
{
    private static final d4 f;
    private int a;
    private int[] b;
    private Object[] c;
    private int d;
    private boolean e;
    
    static {
        f = new d4(0, new int[0], new Object[0], false);
    }
    
    private d4() {
        this(0, new int[8], new Object[8], true);
    }
    
    private d4(final int a, final int[] b, final Object[] c, final boolean e) {
        this.d = -1;
        this.a = a;
        this.b = b;
        this.c = c;
        this.e = e;
    }
    
    static d4 a(final d4 d4, final d4 d5) {
        final int n = d4.a + d5.a;
        final int[] copy = Arrays.copyOf(d4.b, n);
        System.arraycopy(d5.b, 0, copy, d4.a, d5.a);
        final Object[] copy2 = Arrays.copyOf(d4.c, n);
        System.arraycopy(d5.c, 0, copy2, d4.a, d5.a);
        return new d4(n, copy, copy2, true);
    }
    
    private static void f(int n, final Object o, final x4 x4) throws IOException {
        final int n2 = n >>> 3;
        n &= 0x7;
        if (n == 0) {
            x4.J(n2, (long)o);
            return;
        }
        if (n == 1) {
            x4.h(n2, (long)o);
            return;
        }
        if (n == 2) {
            x4.L(n2, (d0)o);
            return;
        }
        if (n != 3) {
            if (n == 5) {
                x4.u(n2, (int)o);
                return;
            }
            throw new RuntimeException(r1.c());
        }
        else {
            if (x4.P() == j1.g.l) {
                x4.N(n2);
                ((d4)o).g(x4);
                x4.I(n2);
                return;
            }
            x4.I(n2);
            ((d4)o).g(x4);
            x4.N(n2);
        }
    }
    
    public static d4 h() {
        return d4.f;
    }
    
    static d4 i() {
        return new d4();
    }
    
    final void b(final x4 x4) throws IOException {
        if (x4.P() == j1.g.m) {
            for (int i = this.a - 1; i >= 0; --i) {
                x4.i(this.b[i] >>> 3, this.c[i]);
            }
            return;
        }
        for (int j = 0; j < this.a; ++j) {
            x4.i(this.b[j] >>> 3, this.c[j]);
        }
    }
    
    final void c(final StringBuilder sb, final int n) {
        for (int i = 0; i < this.a; ++i) {
            v2.c(sb, n, String.valueOf(this.b[i] >>> 3), this.c[i]);
        }
    }
    
    public final int d() {
        final int d = this.d;
        if (d != -1) {
            return d;
        }
        int i = 0;
        int d2 = 0;
        while (i < this.a) {
            final int n = this.b[i];
            final int n2 = n >>> 3;
            final int n3 = n & 0x7;
            int n4;
            if (n3 != 0) {
                if (n3 != 1) {
                    if (n3 != 2) {
                        if (n3 != 3) {
                            if (n3 != 5) {
                                throw new IllegalStateException(r1.c());
                            }
                            n4 = p0.u0(n2, (int)this.c[i]);
                        }
                        else {
                            n4 = (p0.C0(n2) << 1) + ((d4)this.c[i]).d();
                        }
                    }
                    else {
                        n4 = p0.N(n2, (d0)this.c[i]);
                    }
                }
                else {
                    n4 = p0.l0(n2, (long)this.c[i]);
                }
            }
            else {
                n4 = p0.e0(n2, (long)this.c[i]);
            }
            d2 += n4;
            ++i;
        }
        return this.d = d2;
    }
    
    final void e(final int n, final Object o) {
        if (this.e) {
            final int a = this.a;
            final int[] b = this.b;
            if (a == b.length) {
                int n2;
                if (a < 4) {
                    n2 = 8;
                }
                else {
                    n2 = a >> 1;
                }
                final int n3 = a + n2;
                this.b = Arrays.copyOf(b, n3);
                this.c = Arrays.copyOf(this.c, n3);
            }
            final int[] b2 = this.b;
            final int a2 = this.a;
            b2[a2] = n;
            this.c[a2] = o;
            this.a = a2 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (!(o instanceof d4)) {
            return false;
        }
        final d4 d4 = (d4)o;
        final int a = this.a;
        if (a == d4.a) {
            final int[] b = this.b;
            final int[] b2 = d4.b;
            int i = 0;
            while (true) {
                while (i < a) {
                    if (b[i] != b2[i]) {
                        final boolean b3 = false;
                        if (b3) {
                            final Object[] c = this.c;
                            final Object[] c2 = d4.c;
                            final int a2 = this.a;
                            int j = 0;
                            while (true) {
                                while (j < a2) {
                                    if (!c[j].equals(c2[j])) {
                                        final boolean b4 = false;
                                        if (!b4) {
                                            return false;
                                        }
                                        return true;
                                    }
                                    else {
                                        ++j;
                                    }
                                }
                                final boolean b4 = true;
                                continue;
                            }
                        }
                        return false;
                    }
                    else {
                        ++i;
                    }
                }
                final boolean b3 = true;
                continue;
            }
        }
        return false;
    }
    
    public final void g(final x4 x4) throws IOException {
        if (this.a == 0) {
            return;
        }
        if (x4.P() == j1.g.l) {
            for (int i = 0; i < this.a; ++i) {
                f(this.b[i], this.c[i], x4);
            }
            return;
        }
        for (int j = this.a - 1; j >= 0; --j) {
            f(this.b[j], this.c[j], x4);
        }
    }
    
    @Override
    public final int hashCode() {
        final int a = this.a;
        final int[] b = this.b;
        final int n = 0;
        int n2 = 17;
        int i = 0;
        int n3 = 17;
        while (i < a) {
            n3 = n3 * 31 + b[i];
            ++i;
        }
        final Object[] c = this.c;
        for (int a2 = this.a, j = n; j < a2; ++j) {
            n2 = n2 * 31 + c[j].hashCode();
        }
        return ((a + 527) * 31 + n3) * 31 + n2;
    }
    
    public final int j() {
        final int d = this.d;
        if (d != -1) {
            return d;
        }
        int i = 0;
        int d2 = 0;
        while (i < this.a) {
            d2 += p0.X(this.b[i] >>> 3, (d0)this.c[i]);
            ++i;
        }
        return this.d = d2;
    }
    
    public final void k() {
        this.e = false;
    }
}
