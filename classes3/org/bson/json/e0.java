// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.json;

import org.bson.v0;
import org.bson.types.Decimal128;
import org.bson.r0;
import org.bson.w;
import org.bson.o;
import org.bson.types.ObjectId;
import org.bson.m0;
import org.bson.l0;
import org.bson.j0;
import org.bson.u;
import org.bson.a1;
import java.io.Writer;
import org.bson.b;

public class e0 extends b
{
    private final f0 M;
    private final w0 N;
    
    public e0(final Writer writer) {
        this(writer, new f0());
    }
    
    public e0(final Writer writer, final f0 m) {
        super(m);
        this.M = m;
        this.o2((b)new c(null, u.G));
        this.N = new w0(writer, x0.a().f(m.x()).i(m.o()).g(m.h()).h(m.m()).e());
    }
    
    @Override
    protected void D(final String s) {
        this.M.k().a(s, this.N);
    }
    
    @Override
    protected void F(final String s) {
        this.w0();
        this.S("$code", s);
        this.K("$scope");
    }
    
    @Override
    protected void G() {
        this.M.l().a(null, this.N);
    }
    
    @Override
    protected void H() {
        this.M.n().a(null, this.N);
    }
    
    @Override
    protected void L(final String s) {
        this.N.K(s);
    }
    
    public void M() {
        this.M.p().a(null, this.N);
    }
    
    public void N(final ObjectId objectId) {
        this.M.q().a(objectId, this.N);
    }
    
    @Override
    protected boolean a() {
        return this.N.a();
    }
    
    @Override
    public void flush() {
        this.N.k();
    }
    
    @Override
    protected void h(final o o) {
        this.M.c().a(o, this.N);
    }
    
    public void j(final boolean b) {
        this.M.d().a(b, this.N);
    }
    
    @Override
    protected void k(final w w) {
        if (this.M.r() == t.I) {
            new a<w>() {
                public void b(final w w, final y0 y0) {
                    y0.f();
                    y0.c("$dbPointer");
                    y0.S("$ref", w.Y0());
                    y0.K("$id");
                    e0.this.N(w.X0());
                    y0.b();
                    y0.b();
                }
            }.b(w, this.N);
        }
        else {
            new a<w>() {
                public void b(final w w, final y0 y0) {
                    y0.f();
                    y0.S("$ref", w.Y0());
                    y0.K("$id");
                    e0.this.N(w.X0());
                    y0.b();
                }
            }.b(w, this.N);
        }
    }
    
    public void k1(final r0 r0) {
        this.M.s().a(r0, this.N);
    }
    
    @Override
    protected void o1() {
        this.N.R();
        this.o2((b)new c(this.u2(), u.I));
    }
    
    @Override
    protected void p1() {
        this.N.f();
        u u;
        if (this.G1() == d.J) {
            u = org.bson.u.K;
        }
        else {
            u = org.bson.u.H;
        }
        this.o2((b)new c(this.u2(), u));
    }
    
    @Override
    protected void q(final long l) {
        this.M.e().a(l, this.N);
    }
    
    public void q1(final String s) {
        this.M.t().a(s, this.N);
    }
    
    @Override
    protected void r(final Decimal128 decimal128) {
        this.M.f().a(decimal128, this.N);
    }
    
    @Override
    protected void s(final double d) {
        this.M.g().a(d, this.N);
    }
    
    @Override
    protected void t() {
        this.N.o();
        this.o2((b)this.u2().f());
    }
    
    public void t1(final String s) {
        this.M.u().a(s, this.N);
    }
    
    protected c u2() {
        return (c)super.B1();
    }
    
    public void v1(final v0 v0) {
        this.M.v().a(v0, this.N);
    }
    
    @Override
    protected void w() {
        this.N.b();
        if (((b)this.u2()).d() == u.K) {
            this.o2((b)this.u2().f());
            this.N0();
        }
        else {
            this.o2((b)this.u2().f());
        }
    }
    
    @Override
    protected void x(final int i) {
        this.M.i().a(i, this.N);
    }
    
    public Writer x2() {
        return this.N.m();
    }
    
    @Override
    protected void y(final long l) {
        this.M.j().a(l, this.N);
    }
    
    public void z1() {
        this.M.w().a(null, this.N);
    }
    
    public boolean z2() {
        return this.N.a();
    }
    
    public class c extends b
    {
        public c(final c c, final u u) {
            super((b)c, u);
        }
        
        @Deprecated
        public c(final e0 e0, final c c, final u u, final String s) {
            this(e0, c, u);
        }
        
        public c f() {
            return (c)super.e();
        }
    }
}
