// 
// Decompiled by Procyon v0.5.36
// 

package org.bson;

import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

class e extends b
{
    private org.bson.d M;
    
    protected e(final a1 a1, final org.bson.d m) {
        super(a1);
        this.M = m;
    }
    
    @Override
    protected void D(final String s) {
        this.M.p(this.E1(), s);
    }
    
    @Override
    protected String E1() {
        if (((b)this.u2()).d() == u.I) {
            return Integer.toString(this.u2().e++);
        }
        return super.E1();
    }
    
    @Override
    protected void F(final String s) {
        this.u2().f = this.M;
        this.u2().g = s;
        this.u2().h = this.E1();
        this.M = this.M.d();
    }
    
    @Override
    protected void G() {
        this.M.i(this.E1());
    }
    
    @Override
    protected void H() {
        this.M.g(this.E1());
    }
    
    public void M() {
        this.M.a(this.E1());
    }
    
    public void N(final ObjectId objectId) {
        this.M.k(this.E1(), objectId);
    }
    
    @Override
    public void flush() {
    }
    
    @Override
    protected void h(final o o) {
        if (o.c1() == q.K.b()) {
            this.M.y(this.E1(), org.bson.io.b.l(o.b1(), 0), org.bson.io.b.l(o.b1(), 8));
        }
        else {
            this.M.v(this.E1(), o.c1(), o.b1());
        }
    }
    
    public void j(final boolean b) {
        this.M.x(this.E1(), b);
        this.p2(this.F1());
    }
    
    @Override
    protected void k(final w w) {
        this.M.b(this.E1(), w.Y0(), w.X0());
    }
    
    public void k1(final r0 r0) {
        this.M.w(this.E1(), r0.Y0(), r0.X0());
    }
    
    public void o1() {
        this.M.f(this.E1());
        this.o2((b)new a(this.u2(), u.I));
    }
    
    public void p1() {
        u u;
        if (this.G1() == d.J) {
            u = org.bson.u.K;
        }
        else {
            u = org.bson.u.H;
        }
        if (this.u2() != null && u != org.bson.u.K) {
            this.M.l(this.E1());
        }
        else {
            this.M.c();
        }
        this.o2((b)new a(this.u2(), u));
    }
    
    @Override
    protected void q(final long n) {
        this.M.h(this.E1(), n);
    }
    
    public void q1(final String s) {
        this.M.m(this.E1(), s);
    }
    
    @Override
    protected void r(final Decimal128 decimal128) {
        this.M.t(this.E1(), decimal128);
    }
    
    @Override
    protected void s(final double n) {
        this.M.u(this.E1(), n);
    }
    
    @Override
    protected void t() {
        this.o2((b)this.u2().m());
        this.M.r();
    }
    
    public void t1(final String s) {
        this.M.z(this.E1(), s);
    }
    
    protected a u2() {
        return (a)super.B1();
    }
    
    public void v1(final v0 v0) {
        this.M.B(this.E1(), v0.Z0(), v0.Y0());
    }
    
    @Override
    protected void w() {
        final u d = ((b)this.u2()).d();
        this.o2((b)this.u2().m());
        this.M.q();
        if (d == u.K) {
            (this.M = this.u2().f).j(this.u2().h, this.u2().g, this.M.get());
        }
    }
    
    @Override
    protected void x(final int n) {
        this.M.o(this.E1(), n);
    }
    
    @Override
    protected void y(final long n) {
        this.M.A(this.E1(), n);
    }
    
    public void z1() {
        this.M.n(this.E1());
    }
    
    public class a extends b
    {
        private int e;
        private org.bson.d f;
        private String g;
        private String h;
        
        a(final a a, final u u) {
            super((b)a, u);
        }
        
        public a m() {
            return (a)super.e();
        }
    }
}
