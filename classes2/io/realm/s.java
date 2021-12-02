// 
// Decompiled by Procyon v0.5.36
// 

package io.realm;

import c6.h;
import io.realm.internal.OsList;

abstract class s<T>
{
    static final String d = "RealmList does not accept null values.";
    static final String e = "Unacceptable value type. Acceptable: %1$s, actual: %2$s .";
    final a a;
    final OsList b;
    @h
    final Class<T> c;
    
    s(final a a, final OsList b, @h final Class<T> c) {
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    private void b() {
        this.b.j();
    }
    
    public final void a(@h final Object o) {
        this.d(o);
        if (o == null) {
            this.b();
        }
        else {
            this.c(o);
        }
    }
    
    protected abstract void c(final Object p0);
    
    protected abstract void d(@h final Object p0);
    
    final void e(final int n) {
        this.b.q(n);
    }
    
    final void f() {
        this.b.r();
    }
    
    final void g() {
        final OsList b = this.b;
        b.q(b.b0() - 1L);
    }
    
    public abstract boolean h();
    
    @h
    public abstract T i(final int p0);
    
    public final OsList j() {
        return this.b;
    }
    
    public final void k(final int n, @h final Object o) {
        this.d(o);
        if (o == null) {
            this.l(n);
        }
        else {
            this.m(n, o);
        }
    }
    
    protected void l(final int n) {
        this.b.E(n);
    }
    
    protected abstract void m(final int p0, final Object p1);
    
    public final boolean n() {
        return this.b.I();
    }
    
    public final boolean o() {
        return this.b.J();
    }
    
    final void p(final int n, final int n2) {
        this.b.K(n, n2);
    }
    
    final void q(final int n) {
        this.b.L(n);
    }
    
    final void r() {
        this.b.M();
    }
    
    @h
    public final T s(final int n, @h final Object o) {
        this.d(o);
        final T i = this.i(n);
        if (o == null) {
            this.t(n);
        }
        else {
            this.u(n, o);
        }
        return i;
    }
    
    protected void t(final int n) {
        this.b.X(n);
    }
    
    protected abstract void u(final int p0, final Object p1);
    
    public final int v() {
        final long b0 = this.b.b0();
        int n;
        if (b0 < 2147483647L) {
            n = (int)b0;
        }
        else {
            n = Integer.MAX_VALUE;
        }
        return n;
    }
}
