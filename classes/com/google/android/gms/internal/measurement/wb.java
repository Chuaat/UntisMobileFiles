// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Arrays;

public final class wb
{
    private static final wb f;
    private int a;
    private int[] b;
    private Object[] c;
    private int d;
    private boolean e;
    
    static {
        f = new wb(0, new int[0], new Object[0], false);
    }
    
    private wb() {
        this(0, new int[8], new Object[8], true);
    }
    
    private wb(final int a, final int[] b, final Object[] c, final boolean e) {
        this.d = -1;
        this.a = a;
        this.b = b;
        this.c = c;
        this.e = e;
    }
    
    public static wb c() {
        return wb.f;
    }
    
    static wb d(final wb wb, final wb wb2) {
        final int n = wb.a + wb2.a;
        final int[] copy = Arrays.copyOf(wb.b, n);
        System.arraycopy(wb2.b, 0, copy, wb.a, wb2.a);
        final Object[] copy2 = Arrays.copyOf(wb.c, n);
        System.arraycopy(wb2.c, 0, copy2, wb.a, wb2.a);
        return new wb(n, copy, copy2, true);
    }
    
    static wb e() {
        return new wb(0, new int[8], new Object[8], true);
    }
    
    public final int a() {
        final int d = this.d;
        if (d == -1) {
            int i = 0;
            int d2 = 0;
            while (i < this.a) {
                final int n = this.b[i];
                final int n2 = n >>> 3;
                final int n3 = n & 0x7;
                int n5 = 0;
                Label_0237: {
                    int n4 = 0;
                    Label_0233: {
                        int a2;
                        int n6;
                        if (n3 != 0) {
                            if (n3 == 1) {
                                (long)this.c[i];
                                n4 = q8.a(n2 << 3) + 8;
                                break Label_0233;
                            }
                            if (n3 == 2) {
                                final h8 h8 = (h8)this.c[i];
                                final int a = q8.a(n2 << 3);
                                final int h9 = h8.h();
                                n5 = d2 + (a + (q8.a(h9) + h9));
                                break Label_0237;
                            }
                            if (n3 != 3) {
                                if (n3 == 5) {
                                    (int)this.c[i];
                                    n4 = q8.a(n2 << 3) + 4;
                                    break Label_0233;
                                }
                                throw new IllegalStateException(u9.a());
                            }
                            else {
                                final int d3 = q8.D(n2);
                                a2 = d3 + d3;
                                n6 = ((wb)this.c[i]).a();
                            }
                        }
                        else {
                            final long longValue = (long)this.c[i];
                            a2 = q8.a(n2 << 3);
                            n6 = q8.b(longValue);
                        }
                        n4 = a2 + n6;
                    }
                    n5 = d2 + n4;
                }
                ++i;
                d2 = n5;
            }
            return this.d = d2;
        }
        return d;
    }
    
    public final int b() {
        final int d = this.d;
        if (d == -1) {
            int i = 0;
            int d2 = 0;
            while (i < this.a) {
                final int n = this.b[i];
                final h8 h8 = (h8)this.c[i];
                final int a = q8.a(8);
                final int h9 = h8.h();
                d2 += a + a + (q8.a(16) + q8.a(n >>> 3)) + (q8.a(24) + (q8.a(h9) + h9));
                ++i;
            }
            return this.d = d2;
        }
        return d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (!(o instanceof wb)) {
            return false;
        }
        final wb wb = (wb)o;
        final int a = this.a;
        if (a == wb.a) {
            final int[] b = this.b;
            final int[] b2 = wb.b;
            for (int i = 0; i < a; ++i) {
                if (b[i] != b2[i]) {
                    return false;
                }
            }
            final Object[] c = this.c;
            final Object[] c2 = wb.c;
            for (int a2 = this.a, j = 0; j < a2; ++j) {
                if (!c[j].equals(c2[j])) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    public final void f() {
        this.e = false;
    }
    
    final void g(final StringBuilder sb, final int n) {
        for (int i = 0; i < this.a; ++i) {
            ua.b(sb, n, String.valueOf(this.b[i] >>> 3), this.c[i]);
        }
    }
    
    final void h(final int n, final Object o) {
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
    
    public final void i(final r8 r8) throws IOException {
        if (this.a != 0) {
            for (int i = 0; i < this.a; ++i) {
                final int n = this.b[i];
                final Object o = this.c[i];
                final int n2 = n >>> 3;
                final int n3 = n & 0x7;
                if (n3 != 0) {
                    if (n3 != 1) {
                        if (n3 != 2) {
                            if (n3 != 3) {
                                if (n3 != 5) {
                                    throw new RuntimeException(u9.a());
                                }
                                r8.v(n2, (int)o);
                            }
                            else {
                                r8.e(n2);
                                ((wb)o).i(r8);
                                r8.s(n2);
                            }
                        }
                        else {
                            r8.o(n2, (h8)o);
                        }
                    }
                    else {
                        r8.x(n2, (long)o);
                    }
                }
                else {
                    r8.E(n2, (long)o);
                }
            }
        }
    }
}
