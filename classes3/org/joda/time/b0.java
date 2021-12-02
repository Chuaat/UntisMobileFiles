// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time;

import org.joda.time.field.j;
import org.joda.time.format.q;
import org.joda.convert.FromString;
import org.joda.time.format.k;
import java.io.Serializable;
import org.joda.time.base.l;

public class b0 extends l implements i0, Cloneable, Serializable
{
    private static final long K = 3436451121567212165L;
    
    public b0() {
        super(0L, null, null);
    }
    
    public b0(final int n, final int n2, final int n3, final int n4) {
        super(0, 0, 0, 0, n, n2, n3, n4, e0.q());
    }
    
    public b0(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        super(n, n2, n3, n4, n5, n6, n7, n8, e0.q());
    }
    
    public b0(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final e0 e0) {
        super(n, n2, n3, n4, n5, n6, n7, n8, e0);
    }
    
    public b0(final long n) {
        super(n);
    }
    
    public b0(final long n, final long n2) {
        super(n, n2, null, null);
    }
    
    public b0(final long n, final long n2, final a a) {
        super(n, n2, null, a);
    }
    
    public b0(final long n, final long n2, final e0 e0) {
        super(n, n2, e0, null);
    }
    
    public b0(final long n, final long n2, final e0 e0, final a a) {
        super(n, n2, e0, a);
    }
    
    public b0(final long n, final a a) {
        super(n, null, a);
    }
    
    public b0(final long n, final e0 e0) {
        super(n, e0, null);
    }
    
    public b0(final long n, final e0 e0, final a a) {
        super(n, e0, a);
    }
    
    public b0(final Object o) {
        super(o, null, null);
    }
    
    public b0(final Object o, final a a) {
        super(o, null, a);
    }
    
    public b0(final Object o, final e0 e0) {
        super(o, e0, null);
    }
    
    public b0(final Object o, final e0 e0, final a a) {
        super(o, e0, a);
    }
    
    public b0(final e0 e0) {
        super(0L, e0, null);
    }
    
    public b0(final k0 k0, final l0 l0) {
        super(k0, l0, null);
    }
    
    public b0(final k0 k0, final l0 l0, final e0 e0) {
        super(k0, l0, e0);
    }
    
    public b0(final l0 l0, final k0 k0) {
        super(l0, k0, null);
    }
    
    public b0(final l0 l0, final k0 k0, final e0 e0) {
        super(l0, k0, e0);
    }
    
    public b0(final l0 l0, final l0 l2) {
        super(l0, l2, null);
    }
    
    public b0(final l0 l0, final l0 l2, final e0 e0) {
        super(l0, l2, e0);
    }
    
    @FromString
    public static b0 u0(final String s) {
        return v0(s, k.e());
    }
    
    public static b0 v0(final String s, final q q) {
        return q.l(s).O();
    }
    
    public void A0(final k0 k0) {
        this.B0(k0, null);
    }
    
    public void B0(final k0 k0, final a a) {
        this.z0(h.h(k0), a);
    }
    
    public void C0(final l0 l0, final l0 l2) {
        if (l0 == l2) {
            this.w0(0L);
        }
        else {
            this.y0(h.j(l0), h.j(l2), h.k(l0, l2));
        }
    }
    
    @Override
    public void D(final o0 o0) {
        super.F(o0);
    }
    
    @Override
    public void E(final int n) {
        super.U(m.i(), n);
    }
    
    @Override
    public void P(final m0 m0) {
        if (m0 == null) {
            this.w0(0L);
        }
        else {
            this.y0(m0.n(), m0.I(), h.e(m0.t()));
        }
    }
    
    @Override
    public void Q(final int n) {
        super.U(m.k(), n);
    }
    
    public void R(final o0 o0) {
        super.R(o0);
    }
    
    @Override
    public void S(final int n) {
        super.t(m.g(), n);
    }
    
    @Override
    public void W(final int n) {
        super.t(m.m(), n);
    }
    
    @Override
    public void Y(final int n) {
        super.t(m.k(), n);
    }
    
    @Override
    public void b(final int n, final int n2) {
        super.b(n, n2);
    }
    
    @Override
    public void clear() {
        super.a0(new int[this.size()]);
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
    public void d(final int n) {
        super.U(m.j(), n);
    }
    
    @Override
    public void d0(final int n) {
        super.t(m.o(), n);
    }
    
    @Override
    public void f(final o0 o0) {
        super.f(o0);
    }
    
    public void f0(final long n) {
        this.D(new d0(n, this.I()));
    }
    
    @Override
    public void g(final int n) {
        super.U(m.m(), n);
    }
    
    @Override
    public void g0(final int n) {
        super.t(m.l(), n);
    }
    
    @Override
    public void h0(final int n) {
        super.t(m.b(), n);
    }
    
    @Override
    public void i(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        super.i(n, n2, n3, n4, n5, n6, n7, n8);
    }
    
    public void i0(final long n, final a a) {
        this.D(new d0(n, this.I(), a));
    }
    
    @Override
    public void j(final m m, final int n) {
        super.U(m, n);
    }
    
    public void j0(final k0 k0) {
        if (k0 != null) {
            this.D(new d0(k0.n(), this.I()));
        }
    }
    
    public b0 k0() {
        return (b0)this.clone();
    }
    
    @Override
    public void l(final int n) {
        super.U(m.o(), n);
    }
    
    public int l0() {
        return this.I().f(this, e0.O);
    }
    
    @Override
    public void m(final int n) {
        super.U(m.g(), n);
    }
    
    @Override
    public void m0(final int n) {
        super.t(m.i(), n);
    }
    
    public int n0() {
        return this.I().f(this, e0.P);
    }
    
    public int o0() {
        return this.I().f(this, e0.S);
    }
    
    public int p0() {
        return this.I().f(this, e0.Q);
    }
    
    public int q0() {
        return this.I().f(this, e0.M);
    }
    
    public int r0() {
        return this.I().f(this, e0.R);
    }
    
    @Override
    public void s(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        this.i(j.d(this.t0(), n), j.d(this.q0(), n2), j.d(this.s0(), n3), j.d(this.l0(), n4), j.d(this.n0(), n5), j.d(this.p0(), n6), j.d(this.r0(), n7), j.d(this.o0(), n8));
    }
    
    public int s0() {
        return this.I().f(this, e0.N);
    }
    
    public int t0() {
        return this.I().f(this, e0.L);
    }
    
    @Override
    public void u(final int n) {
        super.U(m.b(), n);
    }
    
    @Override
    public void v(final int n) {
        super.U(m.l(), n);
    }
    
    @Override
    public void w(final int n) {
        super.t(m.j(), n);
    }
    
    public void w0(final long n) {
        this.z0(n, null);
    }
    
    @Override
    public void x(final m m, final int n) {
        super.t(m, n);
    }
    
    public void x0(final long n, final long n2) {
        this.y0(n, n2, null);
    }
    
    public void y0(final long n, final long n2, final a a) {
        this.a0(h.e(a).o(this, n, n2));
    }
    
    @Override
    public void z(final m0 m0) {
        if (m0 != null) {
            this.D(m0.B(this.I()));
        }
    }
    
    public void z0(final long n, final a a) {
        this.a0(h.e(a).n(this, n));
    }
}
