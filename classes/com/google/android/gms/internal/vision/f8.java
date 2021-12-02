// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

final class f8<T> implements s8<T>
{
    private final z7 a;
    private final k9<?, ?> b;
    private final boolean c;
    private final d6<?> d;
    
    private f8(final k9<?, ?> b, final d6<?> d, final z7 a) {
        this.b = b;
        this.c = d.h(a);
        this.d = d;
        this.a = a;
    }
    
    static <T> f8<T> j(final k9<?, ?> k9, final d6<?> d6, final z7 z7) {
        return new f8<T>(k9, d6, z7);
    }
    
    @Override
    public final int a(final T t) {
        int hashCode = this.b.k(t).hashCode();
        if (this.c) {
            hashCode = hashCode * 53 + this.d.b(t).hashCode();
        }
        return hashCode;
    }
    
    @Override
    public final void b(final T t) {
        this.b.q(t);
        this.d.j(t);
    }
    
    @Override
    public final int c(final T t) {
        final k9<?, ?> b = this.b;
        int n = b.r(b.k(t)) + 0;
        if (this.c) {
            n += this.d.b(t).t();
        }
        return n;
    }
    
    @Override
    public final void d(final T t, final T t2) {
        u8.o(this.b, t, t2);
        if (this.c) {
            u8.m(this.d, t, t2);
        }
    }
    
    @Override
    public final boolean e(final T t) {
        return this.d.b(t).s();
    }
    
    @Override
    public final boolean f(final T t, final T t2) {
        return this.b.k(t).equals(this.b.k(t2)) && (!this.c || this.d.b(t).equals(this.d.b(t2)));
    }
    
    @Override
    public final void g(final T t, final ia ia) throws IOException {
        final Iterator<Map.Entry<?, Object>> p2 = this.d.b(t).p();
        while (p2.hasNext()) {
            final Map.Entry<j6, V> entry = (Map.Entry<j6, V>)p2.next();
            final j6 j6 = entry.getKey();
            if (j6.a() != fa.P || j6.c() || j6.e()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            final boolean b = entry instanceof f7;
            final int zza = j6.zza();
            Object o;
            if (b) {
                o = ((f7)entry).a().d();
            }
            else {
                o = entry.getValue();
            }
            ia.i(zza, o);
        }
        final k9<?, ?> b2 = this.b;
        b2.m(b2.k(t), ia);
    }
    
    @Override
    public final void h(final T t, final t8 t2, final b6 b6) throws IOException {
        final k9<?, ?> b7 = this.b;
        final d6<?> d = this.d;
        final Object o = b7.o(t);
        final h6<?> i = d.i(t);
        try {
            while (t2.zza() != Integer.MAX_VALUE) {
                final int zzb = t2.zzb();
                boolean b8 = false;
                Label_0291: {
                    if (zzb != 11) {
                        if ((zzb & 0x7) != 0x2) {
                            b8 = t2.a();
                            break Label_0291;
                        }
                        final Object c = d.c(b6, this.a, zzb >>> 3);
                        if (c == null) {
                            b8 = b7.j(o, t2);
                            break Label_0291;
                        }
                        d.f(t2, c, b6, i);
                    }
                    else {
                        int t3 = 0;
                        Object c2 = null;
                        f5 s = null;
                        while (t2.zza() != Integer.MAX_VALUE) {
                            final int zzb2 = t2.zzb();
                            if (zzb2 == 16) {
                                t3 = t2.t();
                                c2 = d.c(b6, this.a, t3);
                            }
                            else if (zzb2 == 26) {
                                if (c2 != null) {
                                    d.f(t2, c2, b6, i);
                                }
                                else {
                                    s = t2.s();
                                }
                            }
                            else {
                                if (!t2.a()) {
                                    break;
                                }
                                continue;
                            }
                        }
                        if (t2.zzb() != 12) {
                            throw y6.f();
                        }
                        if (s != null) {
                            if (c2 != null) {
                                d.e(s, c2, b6, i);
                            }
                            else {
                                b7.e(o, t3, s);
                            }
                        }
                    }
                    b8 = true;
                }
                if (!b8) {
                    return;
                }
            }
        }
        finally {
            b7.n(t, o);
        }
    }
    
    @Override
    public final void i(final T t, final byte[] array, int i, final int n, final z4 z4) throws IOException {
        final p6 p5 = (p6)t;
        n9 zzb;
        if ((zzb = p5.zzb) == n9.a()) {
            zzb = n9.g();
            p5.zzb = zzb;
        }
        final h6 f = ((p6.c)t).F();
        p6.e e = null;
        while (i < n) {
            i = x4.i(array, i, z4);
            final int a = z4.a;
            if (a != 11) {
                if ((a & 0x7) == 0x2) {
                    e = (p6.e)this.d.c(z4.d, this.a, a >>> 3);
                    if (e != null) {
                        i = x4.g(n8.a().b(e.c.getClass()), array, i, n, z4);
                        f.h(e.d, z4.c);
                    }
                    else {
                        i = x4.c(a, array, i, n, zzb, z4);
                    }
                }
                else {
                    i = x4.a(a, array, i, n, z4);
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
                    i = x4.i(array, i, z4);
                    final int a3 = z4.a;
                    final int n3 = a3 >>> 3;
                    final int n4 = a3 & 0x7;
                    if (n3 != 2) {
                        if (n3 == 3) {
                            if (e != null) {
                                i = x4.g(n8.a().b(e.c.getClass()), array, i, n, z4);
                                f.h(e.d, z4.c);
                                continue;
                            }
                            if (n4 == 2) {
                                i = x4.q(array, i, z4);
                                o = z4.c;
                                continue;
                            }
                        }
                    }
                    else if (n4 == 0) {
                        i = x4.i(array, i, z4);
                        a2 = z4.a;
                        e = (p6.e)this.d.c(z4.d, this.a, a2);
                        continue;
                    }
                    n2 = i;
                    if (a3 == 12) {
                        break;
                    }
                    i = x4.a(a3, array, i, n, z4);
                }
                if (o != null) {
                    zzb.c(a2 << 3 | 0x2, o);
                }
                i = n2;
            }
        }
        if (i == n) {
            return;
        }
        throw y6.h();
    }
    
    @Override
    public final T zza() {
        return (T)this.a.n().e();
    }
}
