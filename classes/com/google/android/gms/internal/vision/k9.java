// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.io.IOException;

abstract class k9<T, B>
{
    abstract B a();
    
    abstract T b(final B p0);
    
    abstract void c(final B p0, final int p1, final int p2);
    
    abstract void d(final B p0, final int p1, final long p2);
    
    abstract void e(final B p0, final int p1, final f5 p2);
    
    abstract void f(final B p0, final int p1, final T p2);
    
    abstract void g(final T p0, final ia p1) throws IOException;
    
    abstract void h(final Object p0, final T p1);
    
    abstract boolean i(final t8 p0);
    
    final boolean j(final B b, final t8 t8) throws IOException {
        final int zzb = t8.zzb();
        final int n = zzb >>> 3;
        final int n2 = zzb & 0x7;
        if (n2 == 0) {
            this.d(b, n, t8.m());
            return true;
        }
        if (n2 == 1) {
            this.l(b, n, t8.k());
            return true;
        }
        if (n2 == 2) {
            this.e(b, n, t8.s());
            return true;
        }
        if (n2 != 3) {
            if (n2 == 4) {
                return false;
            }
            if (n2 == 5) {
                this.c(b, n, t8.r());
                return true;
            }
            throw y6.g();
        }
        else {
            final B a = this.a();
            while (t8.zza() != Integer.MAX_VALUE && this.j(a, t8)) {}
            if ((0x4 | n << 3) == t8.zzb()) {
                this.f(b, n, this.b(a));
                return true;
            }
            throw y6.f();
        }
    }
    
    abstract T k(final Object p0);
    
    abstract void l(final B p0, final int p1, final long p2);
    
    abstract void m(final T p0, final ia p1) throws IOException;
    
    abstract void n(final Object p0, final B p1);
    
    abstract B o(final Object p0);
    
    abstract T p(final T p0, final T p1);
    
    abstract void q(final Object p0);
    
    abstract int r(final T p0);
    
    abstract int s(final T p0);
}
