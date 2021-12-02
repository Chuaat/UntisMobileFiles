// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.io.IOException;

final class wa<T> implements db<T>
{
    private final sa a;
    private final vb<?, ?> b;
    private final boolean c;
    private final w8<?> d;
    
    private wa(final vb<?, ?> b, final w8<?> d, final sa a) {
        this.b = b;
        this.c = d.c(a);
        this.d = d;
        this.a = a;
    }
    
    static <T> wa<T> j(final vb<?, ?> vb, final w8<?> w8, final sa sa) {
        return new wa<T>(vb, w8, sa);
    }
    
    @Override
    public final int a(final T t) {
        final vb<?, ?> b = this.b;
        final int b2 = b.b(b.c(t));
        if (!this.c) {
            return b2;
        }
        this.d.a(t);
        throw null;
    }
    
    @Override
    public final boolean b(final T t) {
        this.d.a(t);
        throw null;
    }
    
    @Override
    public final int c(final T t) {
        final int hashCode = this.b.c(t).hashCode();
        if (!this.c) {
            return hashCode;
        }
        this.d.a(t);
        throw null;
    }
    
    @Override
    public final void d(final T t) {
        this.b.g(t);
        this.d.b(t);
    }
    
    @Override
    public final T e() {
        return (T)this.a.f().j2();
    }
    
    @Override
    public final void f(final T t, final byte[] array, final int n, final int n2, final t7 t2) throws IOException {
        final j9 j9 = (j9)t;
        if (j9.zzc == wb.c()) {
            j9.zzc = wb.e();
        }
        final g9 g9 = (g9)t;
        throw null;
    }
    
    @Override
    public final void g(final T t, final T t2) {
        fb.f(this.b, t, t2);
        if (this.c) {
            fb.e(this.d, t, t2);
        }
    }
    
    @Override
    public final void h(final T t, final r8 r8) throws IOException {
        this.d.a(t);
        throw null;
    }
    
    @Override
    public final boolean i(final T t, final T t2) {
        if (!this.b.c(t).equals(this.b.c(t2))) {
            return false;
        }
        if (!this.c) {
            return true;
        }
        this.d.a(t);
        this.d.a(t2);
        throw null;
    }
}
