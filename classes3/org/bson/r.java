// 
// Decompiled by Procyon v0.5.36
// 

package org.bson;

import org.bson.types.Decimal128;
import org.bson.types.ObjectId;
import org.bson.io.c;
import java.util.List;
import java.util.Stack;
import org.bson.io.e;

public class r extends org.bson.b
{
    private final s M;
    private final e N;
    private final Stack<Integer> O;
    private b P;
    
    public r(final a1 a1, final s s, final e e) {
        this(a1, s, e, new k1());
    }
    
    public r(final a1 a1, final s m, final e n, final f1 f1) {
        super(a1, f1);
        final Stack<Integer> o = new Stack<Integer>();
        this.O = o;
        this.M = m;
        this.N = n;
        o.push(m.a());
    }
    
    public r(final e e) {
        this(new a1(), new s(), e);
    }
    
    public r(final e e, final f1 f1) {
        this(new a1(), new s(), e, f1);
    }
    
    private void P1(final p0 p2, final List<d0> list) {
        if (p2 instanceof p) {
            final p p3 = (p)p2;
            if (this.G1() == d.I) {
                this.N.A(w0.K.d());
                this.V2();
            }
            final org.bson.io.c s0 = p3.s0();
            final int b0 = s0.b0();
            if (b0 < 5) {
                throw new s0("Document size must be at least 5");
            }
            final int position = this.N.getPosition();
            this.N.l(b0);
            final byte[] array = new byte[b0 - 4];
            s0.i2(array);
            this.N.C2(array);
            p3.f0(org.bson.a.d.H);
            if (list != null) {
                final e n = this.N;
                n.u1(n.getPosition() - 1);
                this.o2((org.bson.b.b)new a(this.K2(), u.H, position));
                this.p2(d.H);
                this.Q1(list);
                this.N.A(0);
                final e n2 = this.N;
                n2.V3(position, n2.getPosition() - position);
                this.o2((org.bson.b.b)this.K2().i());
            }
            d d;
            if (this.K2() == null) {
                d = org.bson.b.d.K;
            }
            else {
                if (((org.bson.b.b)this.K2()).d() == u.J) {
                    this.z2();
                    this.o2((org.bson.b.b)this.K2().i());
                }
                d = this.F1();
            }
            this.p2(d);
            this.S2(this.N.getPosition() - position);
        }
        else if (list != null) {
            super.H1(p2, list);
        }
        else {
            super.G0(p2);
        }
    }
    
    private void S2(final int i) {
        if (i <= this.O.peek()) {
            return;
        }
        throw new k0(String.format("Document size of %d is larger than maximum of %d.", i, this.O.peek()));
    }
    
    private void V2() {
        e e;
        String s;
        if (((org.bson.b.b)this.K2()).d() == u.I) {
            e = this.N;
            s = Integer.toString(this.K2().f++);
        }
        else {
            e = this.N;
            s = this.E1();
        }
        e.L2(s);
    }
    
    private void z2() {
        final int n = this.N.getPosition() - this.K2().e;
        this.S2(n);
        final e n2 = this.N;
        n2.V3(n2.getPosition() - n, n);
    }
    
    public s A2() {
        return this.M;
    }
    
    @Override
    protected void D(final String s) {
        this.N.A(w0.U.d());
        this.V2();
        this.N.i(s);
    }
    
    @Override
    protected void F(final String s) {
        this.N.A(w0.W.d());
        this.V2();
        this.o2((org.bson.b.b)new a(this.K2(), u.J, this.N.getPosition()));
        this.N.l(0);
        this.N.i(s);
    }
    
    @Override
    protected void G() {
        this.N.A(w0.c0.d());
        this.V2();
    }
    
    @Override
    public void G0(final p0 p) {
        e7.a.e("reader", p);
        this.P1(p, null);
    }
    
    public e G2() {
        return this.N;
    }
    
    @Override
    protected void H() {
        this.N.A(w0.b0.d());
        this.V2();
    }
    
    @Override
    public void H1(final p0 p2, final List<d0> list) {
        e7.a.e("reader", p2);
        e7.a.e("extraElements", list);
        this.P1(p2, list);
    }
    
    protected a K2() {
        return (a)super.B1();
    }
    
    public void M() {
        this.N.A(w0.R.d());
        this.V2();
    }
    
    public void N(final ObjectId objectId) {
        this.N.A(w0.O.d());
        this.V2();
        this.N.C2(objectId.T());
    }
    
    public void N2() {
        this.O.pop();
    }
    
    public void O() {
        this.P = new b();
    }
    
    public void O2(final int i) {
        this.O.push(i);
    }
    
    @Override
    public void close() {
        super.close();
    }
    
    @Override
    public void flush() {
    }
    
    @Override
    protected void h(final o o) {
        this.N.A(w0.M.d());
        this.V2();
        final int length = o.b1().length;
        final byte c1 = o.c1();
        final q j = q.J;
        int n = length;
        if (c1 == j.b()) {
            n = length + 4;
        }
        this.N.l(n);
        this.N.A(o.c1());
        if (o.c1() == j.b()) {
            this.N.l(n - 4);
        }
        this.N.C2(o.b1());
    }
    
    public void j(final boolean b) {
        this.N.A(w0.P.d());
        this.V2();
        this.N.A(b ? 1 : 0);
    }
    
    @Override
    protected void k(final w w) {
        this.N.A(w0.T.d());
        this.V2();
        this.N.i(w.Y0());
        this.N.C2(w.X0().T());
    }
    
    public void k1(final r0 r0) {
        this.N.A(w0.S.d());
        this.V2();
        this.N.L2(r0.Y0());
        this.N.L2(r0.X0());
    }
    
    @Override
    protected void o1() {
        this.N.A(w0.L.d());
        this.V2();
        this.o2((org.bson.b.b)new a(this.K2(), u.I, this.N.getPosition()));
        this.N.l(0);
    }
    
    @Override
    protected void p1() {
        if (this.G1() == d.I) {
            this.N.A(w0.K.d());
            this.V2();
        }
        this.o2((org.bson.b.b)new a(this.K2(), u.H, this.N.getPosition()));
        this.N.l(0);
    }
    
    @Override
    protected void q(final long n) {
        this.N.A(w0.Q.d());
        this.V2();
        this.N.I(n);
    }
    
    public void q1(final String s) {
        this.N.A(w0.J.d());
        this.V2();
        this.N.i(s);
    }
    
    @Override
    protected void r(final Decimal128 decimal128) {
        this.N.A(w0.a0.d());
        this.V2();
        this.N.I(decimal128.l());
        this.N.I(decimal128.k());
    }
    
    public void reset() {
        final b p = this.P;
        if (p != null) {
            p.a();
            this.P = null;
            return;
        }
        throw new IllegalStateException("Can not reset without first marking");
    }
    
    @Override
    protected void s(final double n) {
        this.N.A(w0.I.d());
        this.V2();
        this.N.P(n);
    }
    
    @Override
    protected void t() {
        this.N.A(0);
        this.z2();
        this.o2((org.bson.b.b)this.K2().i());
    }
    
    public void t1(final String s) {
        this.N.A(w0.V.d());
        this.V2();
        this.N.i(s);
    }
    
    public void v1(final v0 v0) {
        this.N.A(w0.Y.d());
        this.V2();
        this.N.I(v0.b1());
    }
    
    @Override
    protected void w() {
        this.N.A(0);
        this.z2();
        this.o2((org.bson.b.b)this.K2().i());
        if (this.K2() != null && ((org.bson.b.b)this.K2()).d() == u.J) {
            this.z2();
            this.o2((org.bson.b.b)this.K2().i());
        }
    }
    
    @Override
    protected void x(final int n) {
        this.N.A(w0.X.d());
        this.V2();
        this.N.l(n);
    }
    
    @Override
    protected void y(final long n) {
        this.N.A(w0.Z.d());
        this.V2();
        this.N.I(n);
    }
    
    public void z1() {
        this.N.A(w0.N.d());
        this.V2();
    }
    
    protected class a extends b
    {
        private final int e;
        private int f;
        
        public a(final a a) {
            super((b)a);
            this.e = a.e;
            this.f = a.f;
        }
        
        public a(final a a, final u u, final int e) {
            super((b)a, u);
            this.e = e;
        }
        
        public a h() {
            return new a(this);
        }
        
        public a i() {
            return (a)super.e();
        }
    }
    
    protected class b extends c
    {
        private final int f;
        
        protected b() {
            this.f = r.this.N.getPosition();
        }
        
        @Override
        protected void a() {
            super.a();
            r.this.N.u1(r.this.P.f);
        }
    }
}
