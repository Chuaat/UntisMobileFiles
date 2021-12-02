// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time;

import org.joda.time.field.j;
import java.io.Serializable;
import org.joda.time.base.i;

public class a0 extends i implements h0, Cloneable, Serializable
{
    private static final long K = -5982824024992428470L;
    
    public a0() {
        super(0L, 0L, null);
    }
    
    public a0(final long n, final long n2) {
        super(n, n2, null);
    }
    
    public a0(final long n, final long n2, final a a) {
        super(n, n2, a);
    }
    
    public a0(final Object o) {
        super(o, null);
    }
    
    public a0(final Object o, final a a) {
        super(o, a);
    }
    
    public a0(final k0 k0, final l0 l0) {
        super(k0, l0);
    }
    
    public a0(final l0 l0, final k0 k0) {
        super(l0, k0);
    }
    
    public a0(final l0 l0, final l0 l2) {
        super(l0, l2);
    }
    
    public a0(final l0 l0, final o0 o0) {
        super(l0, o0);
    }
    
    public a0(final o0 o0, final l0 l0) {
        super(o0, l0);
    }
    
    public static a0 X(final String s) {
        return new a0(s);
    }
    
    @Override
    public void D(final l0 l0) {
        super.V(h.j(l0), this.I(), this.t());
    }
    
    @Override
    public void J(final a a) {
        super.V(this.n(), this.I(), a);
    }
    
    public a0 W() {
        return (a0)this.clone();
    }
    
    public void Y(final long n) {
        this.g(j.e(this.n(), n));
    }
    
    public void Z(final long n) {
        this.y(j.e(this.I(), -n));
    }
    
    @Override
    public void c(final o0 o0) {
        long n;
        if (o0 == null) {
            n = this.n();
        }
        else {
            n = this.t().b(o0, this.n(), 1);
        }
        this.g(n);
    }
    
    public Object clone() {
        try {
            return super.clone();
        }
        catch (CloneNotSupportedException ex) {
            throw new InternalError("Clone error");
        }
    }
    
    @Override
    public void f(final long n, final long n2) {
        super.V(n, n2, this.t());
    }
    
    @Override
    public void g(final long n) {
        super.V(this.n(), n, this.t());
    }
    
    @Override
    public void i(final k0 k0) {
        this.y(j.e(this.I(), -h.h(k0)));
    }
    
    @Override
    public void j(final k0 k0) {
        this.g(j.e(this.n(), h.h(k0)));
    }
    
    @Override
    public void m(final m0 m0) {
        if (m0 != null) {
            super.V(m0.n(), m0.I(), m0.t());
            return;
        }
        throw new IllegalArgumentException("Interval must not be null");
    }
    
    @Override
    public void q(final o0 o0) {
        long n;
        if (o0 == null) {
            n = this.I();
        }
        else {
            n = this.t().b(o0, this.I(), -1);
        }
        this.y(n);
    }
    
    @Override
    public void x(final l0 l0, final l0 l2) {
        if (l0 == null && l2 == null) {
            final long c = h.c();
            this.f(c, c);
        }
        else {
            super.V(h.j(l0), h.j(l2), h.i(l0));
        }
    }
    
    @Override
    public void y(final long n) {
        super.V(n, this.I(), this.t());
    }
    
    @Override
    public void z(final l0 l0) {
        super.V(this.n(), h.j(l0), this.t());
    }
}
