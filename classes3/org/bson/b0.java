// 
// Decompiled by Procyon v0.5.36
// 

package org.bson;

import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

public class b0 extends org.bson.b
{
    private final y M;
    
    public b0(final y m) {
        super(new a1());
        this.M = m;
        this.o2((org.bson.b.b)new b());
    }
    
    private void z2(final y0 y0) {
        this.u2().g(y0);
    }
    
    @Override
    protected void D(final String s) {
        this.z2(new h0(s));
    }
    
    @Override
    protected void F(final String s) {
        this.o2((org.bson.b.b)new b(new t0(s), u.J, this.u2()));
    }
    
    @Override
    protected void G() {
        this.z2(new j0());
    }
    
    @Override
    protected void H() {
        this.z2(new l0());
    }
    
    public void M() {
        this.z2(m0.a);
    }
    
    public void N(final ObjectId objectId) {
        this.z2(new o0(objectId));
    }
    
    @Override
    public void flush() {
    }
    
    @Override
    protected void h(final o o) {
        this.z2(o);
    }
    
    public void j(final boolean b) {
        this.z2(t.Z0(b));
    }
    
    @Override
    protected void k(final w w) {
        this.z2(w);
    }
    
    public void k1(final r0 r0) {
        this.z2(r0);
    }
    
    @Override
    protected void o1() {
        this.o2((org.bson.b.b)new b(new n(), u.I, this.u2()));
    }
    
    @Override
    protected void p1() {
        final int n = b0$a.a[this.G1().ordinal()];
        b b;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Unexpected state ");
                    sb.append(this.G1());
                    throw new g0(sb.toString());
                }
                b = new b(new y(), u.K, this.u2());
            }
            else {
                b = new b(new y(), u.H, this.u2());
            }
        }
        else {
            b = new b(this.M, u.H, this.u2());
        }
        this.o2((org.bson.b.b)b);
    }
    
    @Override
    protected void q(final long n) {
        this.z2(new v(n));
    }
    
    public void q1(final String s) {
        this.z2(new t0(s));
    }
    
    @Override
    protected void r(final Decimal128 decimal128) {
        this.z2(new x(decimal128));
    }
    
    @Override
    protected void s(final double n) {
        this.z2(new c0(n));
    }
    
    @Override
    protected void t() {
        final y0 f = this.u2().e;
        this.o2(((org.bson.b.b)this.u2()).e());
        this.z2(f);
    }
    
    public void t1(final String s) {
        this.z2(new u0(s));
    }
    
    protected b u2() {
        return (b)super.B1();
    }
    
    public void v1(final v0 v0) {
        this.z2(v0);
    }
    
    @Override
    protected void w() {
        final y0 f = this.u2().e;
        this.o2(((org.bson.b.b)this.u2()).e());
        if (((org.bson.b.b)this.u2()).d() == u.J) {
            final y y = (y)f;
            final t0 t0 = (t0)this.u2().e;
            this.o2(((org.bson.b.b)this.u2()).e());
            this.z2(new i0(t0.Y0(), y));
        }
        else if (((org.bson.b.b)this.u2()).d() != u.G) {
            this.z2(f);
        }
    }
    
    @Override
    protected void x(final int n) {
        this.z2(new e0(n));
    }
    
    public y x2() {
        return this.M;
    }
    
    @Override
    protected void y(final long n) {
        this.z2(new f0(n));
    }
    
    public void z1() {
        this.z2(new x0());
    }
    
    private class b extends org.bson.b.b
    {
        private y0 e;
        
        b() {
            super(null, u.G);
        }
        
        b(final y0 e, final u u, final b b) {
            super((org.bson.b.b)b, u);
            this.e = e;
        }
        
        void g(final y0 y0) {
            final y0 e = this.e;
            if (e instanceof n) {
                ((n)e).Y0(y0);
            }
            else {
                ((y)e).C2(b0.this.E1(), y0);
            }
        }
    }
}
