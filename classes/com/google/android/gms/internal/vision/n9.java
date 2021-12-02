// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.io.IOException;
import java.util.Arrays;

public final class n9
{
    private static final n9 f;
    private int a;
    private int[] b;
    private Object[] c;
    private int d;
    private boolean e;
    
    static {
        f = new n9(0, new int[0], new Object[0], false);
    }
    
    private n9() {
        this(0, new int[8], new Object[8], true);
    }
    
    private n9(final int a, final int[] b, final Object[] c, final boolean e) {
        this.d = -1;
        this.a = a;
        this.b = b;
        this.c = c;
        this.e = e;
    }
    
    public static n9 a() {
        return n9.f;
    }
    
    static n9 b(final n9 n9, final n9 n10) {
        final int n11 = n9.a + n10.a;
        final int[] copy = Arrays.copyOf(n9.b, n11);
        System.arraycopy(n10.b, 0, copy, n9.a, n10.a);
        final Object[] copy2 = Arrays.copyOf(n9.c, n11);
        System.arraycopy(n10.c, 0, copy2, n9.a, n10.a);
        return new n9(n11, copy, copy2, true);
    }
    
    private static void d(int n, final Object o, final ia ia) throws IOException {
        final int n2 = n >>> 3;
        n &= 0x7;
        if (n == 0) {
            ia.p(n2, (long)o);
            return;
        }
        if (n == 1) {
            ia.K(n2, (long)o);
            return;
        }
        if (n == 2) {
            ia.F(n2, (f5)o);
            return;
        }
        if (n != 3) {
            if (n == 5) {
                ia.A(n2, (int)o);
                return;
            }
            throw new RuntimeException(y6.g());
        }
        else {
            if (ia.zza() == ha.a) {
                ia.d(n2);
                ((n9)o).h(ia);
                ia.s(n2);
                return;
            }
            ia.s(n2);
            ((n9)o).h(ia);
            ia.d(n2);
        }
    }
    
    static n9 g() {
        return new n9();
    }
    
    final void c(final int n, final Object o) {
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
    
    final void e(final ia ia) throws IOException {
        if (ia.zza() == ha.b) {
            for (int i = this.a - 1; i >= 0; --i) {
                ia.i(this.b[i] >>> 3, this.c[i]);
            }
            return;
        }
        for (int j = 0; j < this.a; ++j) {
            ia.i(this.b[j] >>> 3, this.c[j]);
        }
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (!(o instanceof n9)) {
            return false;
        }
        final n9 n9 = (n9)o;
        final int a = this.a;
        if (a == n9.a) {
            final int[] b = this.b;
            final int[] b2 = n9.b;
            int i = 0;
            while (true) {
                while (i < a) {
                    if (b[i] != b2[i]) {
                        final boolean b3 = false;
                        if (b3) {
                            final Object[] c = this.c;
                            final Object[] c2 = n9.c;
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
    
    final void f(final StringBuilder sb, final int n) {
        for (int i = 0; i < this.a; ++i) {
            e8.d(sb, n, String.valueOf(this.b[i] >>> 3), this.c[i]);
        }
    }
    
    public final void h(final ia ia) throws IOException {
        if (this.a == 0) {
            return;
        }
        if (ia.zza() == ha.a) {
            for (int i = 0; i < this.a; ++i) {
                d(this.b[i], this.c[i], ia);
            }
            return;
        }
        for (int j = this.a - 1; j >= 0; --j) {
            d(this.b[j], this.c[j], ia);
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
    
    public final void i() {
        this.e = false;
    }
    
    public final int j() {
        final int d = this.d;
        if (d != -1) {
            return d;
        }
        int i = 0;
        int d2 = 0;
        while (i < this.a) {
            d2 += v5.d0(this.b[i] >>> 3, (f5)this.c[i]);
            ++i;
        }
        return this.d = d2;
    }
    
    public final int k() {
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
                                throw new IllegalStateException(y6.g());
                            }
                            n4 = v5.y0(n2, (int)this.c[i]);
                        }
                        else {
                            n4 = (v5.h0(n2) << 1) + ((n9)this.c[i]).k();
                        }
                    }
                    else {
                        n4 = v5.U(n2, (f5)this.c[i]);
                    }
                }
                else {
                    n4 = v5.r0(n2, (long)this.c[i]);
                }
            }
            else {
                n4 = v5.i0(n2, (long)this.c[i]);
            }
            d2 += n4;
            ++i;
        }
        return this.d = d2;
    }
}
