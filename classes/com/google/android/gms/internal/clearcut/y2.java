// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

final class y2<T> implements k3<T>
{
    private final s2 a;
    private final c4<?, ?> b;
    private final boolean c;
    private final w0<?> d;
    
    private y2(final c4<?, ?> b, final w0<?> d, final s2 a) {
        this.b = b;
        this.c = d.g(a);
        this.d = d;
        this.a = a;
    }
    
    static <T> y2<T> a(final c4<?, ?> c4, final w0<?> w0, final s2 s2) {
        return new y2<T>(c4, w0, s2);
    }
    
    @Override
    public final void b(final T t) {
        this.b.d(t);
        this.d.f(t);
    }
    
    @Override
    public final void c(final T t, final x4 x4) throws IOException {
        final Iterator<Map.Entry<?, Object>> e = this.d.b(t).e();
        while (e.hasNext()) {
            final Map.Entry<d1, V> entry = (Map.Entry<d1, V>)e.next();
            final d1 d1 = entry.getKey();
            if (d1.F() != w4.P || d1.L() || d1.a1()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            final boolean b = entry instanceof w1;
            final int a = d1.a();
            Object o;
            if (b) {
                o = ((w1)entry).a().d();
            }
            else {
                o = entry.getValue();
            }
            x4.i(a, o);
        }
        final c4<?, ?> b2 = this.b;
        b2.e(b2.k(t), x4);
    }
    
    @Override
    public final void d(final T t, final T t2) {
        m3.i(this.b, t, t2);
        if (this.c) {
            m3.g(this.d, t, t2);
        }
    }
    
    @Override
    public final int e(final T t) {
        final c4<?, ?> b = this.b;
        int n = b.l(b.k(t)) + 0;
        if (this.c) {
            n += this.d.b(t).n();
        }
        return n;
    }
    
    @Override
    public final void f(final T t, final byte[] array, int i, final int n, final z z) throws IOException {
        final j1 j1 = (j1)t;
        d4 zzjp;
        if ((zzjp = j1.zzjp) == d4.h()) {
            zzjp = d4.i();
            j1.zzjp = zzjp;
        }
        while (i < n) {
            i = y.e(array, i, z);
            final int a = z.a;
            if (a != 11) {
                if ((a & 0x7) == 0x2) {
                    i = y.c(a, array, i, n, zzjp, z);
                }
                else {
                    i = y.a(a, array, i, n, z);
                }
            }
            else {
                int a2 = 0;
                Object o = null;
                int n2;
                while (true) {
                    n2 = i;
                    if (i >= n) {
                        break;
                    }
                    i = y.e(array, i, z);
                    final int a3 = z.a;
                    final int n3 = a3 >>> 3;
                    final int n4 = a3 & 0x7;
                    if (n3 != 2) {
                        if (n3 == 3) {
                            if (n4 == 2) {
                                i = y.m(array, i, z);
                                o = z.c;
                                continue;
                            }
                        }
                    }
                    else if (n4 == 0) {
                        i = y.e(array, i, z);
                        a2 = z.a;
                        continue;
                    }
                    n2 = i;
                    if (a3 == 12) {
                        break;
                    }
                    i = y.a(a3, array, i, n, z);
                }
                if (o != null) {
                    zzjp.e(a2 << 3 | 0x2, o);
                }
                i = n2;
            }
        }
        if (i == n) {
            return;
        }
        throw r1.d();
    }
    
    @Override
    public final boolean g(final T t, final T t2) {
        return this.b.k(t).equals(this.b.k(t2)) && (!this.c || this.d.b(t).equals(this.d.b(t2)));
    }
    
    @Override
    public final boolean h(final T t) {
        return this.d.b(t).d();
    }
    
    @Override
    public final int i(final T t) {
        int hashCode = this.b.k(t).hashCode();
        if (this.c) {
            hashCode = hashCode * 53 + this.d.b(t).hashCode();
        }
        return hashCode;
    }
    
    @Override
    public final T newInstance() {
        return (T)this.a.d().i3();
    }
}
