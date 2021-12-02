// 
// Decompiled by Procyon v0.5.36
// 

package org.bson;

import java.util.Collection;
import java.util.Arrays;
import org.bson.types.Decimal128;
import e7.a;
import org.bson.types.ObjectId;
import java.util.List;
import java.util.Map;
import java.util.Iterator;
import java.util.Stack;
import java.io.Closeable;

public abstract class b implements z0, Closeable
{
    private final a1 G;
    private final Stack<f1> H;
    private d I;
    private b J;
    private int K;
    private boolean L;
    
    protected b(final a1 a1) {
        this(a1, new k1());
    }
    
    protected b(final a1 g, final f1 item) {
        final Stack<f1> h = new Stack<f1>();
        this.H = h;
        if (item != null) {
            this.G = g;
            h.push(item);
            this.I = d.G;
            return;
        }
        throw new IllegalArgumentException("Validator can not be null");
    }
    
    private void J1(final n n) {
        this.R();
        final Iterator<y0> iterator = n.iterator();
        while (iterator.hasNext()) {
            this.k2(iterator.next());
        }
        this.o();
    }
    
    private void L1(final p0 p) {
        p.h2();
        this.R();
        while (p.o5() != w0.H) {
            this.j2(p);
            if (this.a()) {
                return;
            }
        }
        p.P2();
        this.o();
    }
    
    private void M1(final y y) {
        this.w0();
        for (final Map.Entry<String, y0> entry : y.entrySet()) {
            this.K(entry.getKey());
            this.k2(entry.getValue());
        }
        this.N0();
    }
    
    private void P1(final p0 p2, final List<d0> list) {
        p2.b4();
        this.w0();
        while (p2.o5() != w0.H) {
            this.K(p2.F4());
            this.j2(p2);
            if (this.a()) {
                return;
            }
        }
        p2.K3();
        if (list != null) {
            this.Q1(list);
        }
        this.N0();
    }
    
    private void c2(final i0 i0) {
        this.d1(i0.Y0());
        this.M1(i0.Z0());
    }
    
    private void f2(final p0 p) {
        this.d1(p.F2());
        this.P1(p, null);
    }
    
    private void j2(final p0 p) {
        switch (b$a.a[p.O5().ordinal()]) {
            default: {
                final StringBuilder sb = new StringBuilder();
                sb.append("unhandled BSON type: ");
                sb.append(p.O5());
                throw new IllegalArgumentException(sb.toString());
            }
            case 21: {
                p.J2();
                this.W();
                break;
            }
            case 20: {
                this.j0(p.O0());
                break;
            }
            case 19: {
                p.X0();
                this.m0();
                break;
            }
            case 18: {
                this.g1(p.q0());
                break;
            }
            case 17: {
                this.I(p.k0());
                break;
            }
            case 16: {
                this.p0(p.R0());
                break;
            }
            case 15: {
                this.l(p.b0());
                break;
            }
            case 14: {
                this.f2(p);
                break;
            }
            case 13: {
                this.f0(p.m1());
                break;
            }
            case 12: {
                this.y0(p.H3());
                break;
            }
            case 11: {
                this.Y(p.C4());
                break;
            }
            case 10: {
                p.H4();
                this.T();
                break;
            }
            case 9: {
                this.D0(p.U1());
                break;
            }
            case 8: {
                this.Q(p.readBoolean());
                break;
            }
            case 7: {
                this.B(p.E());
                break;
            }
            case 6: {
                p.W3();
                this.e1();
                break;
            }
            case 5: {
                this.X(p.o0());
                break;
            }
            case 4: {
                this.i(p.U());
                break;
            }
            case 3: {
                this.P(p.readDouble());
                break;
            }
            case 2: {
                this.L1(p);
                break;
            }
            case 1: {
                this.P1(p, null);
                break;
            }
        }
    }
    
    private void k2(final y0 y0) {
        switch (b$a.a[y0.t0().ordinal()]) {
            default: {
                final StringBuilder sb = new StringBuilder();
                sb.append("unhandled BSON type: ");
                sb.append(y0.t0());
                throw new IllegalArgumentException(sb.toString());
            }
            case 21: {
                this.W();
                break;
            }
            case 20: {
                this.j0(y0.z());
                break;
            }
            case 19: {
                this.m0();
                break;
            }
            case 18: {
                this.g1(y0.E().c1());
                break;
            }
            case 17: {
                this.I(y0.U().h1());
                break;
            }
            case 16: {
                this.p0(y0.r0());
                break;
            }
            case 15: {
                this.l(y0.P().h1());
                break;
            }
            case 14: {
                this.c2(y0.c0());
                break;
            }
            case 13: {
                this.f0(y0.q0().X0());
                break;
            }
            case 12: {
                this.y0(y0.b0().X0());
                break;
            }
            case 11: {
                this.Y(y0.n0());
                break;
            }
            case 10: {
                this.T();
                break;
            }
            case 9: {
                this.D0(y0.B().Y0());
                break;
            }
            case 8: {
                this.Q(y0.v().Y0());
                break;
            }
            case 7: {
                this.B(y0.l0().Y0());
                break;
            }
            case 6: {
                this.e1();
                break;
            }
            case 5: {
                this.X(y0.i());
                break;
            }
            case 4: {
                this.i(y0.o0().Y0());
                break;
            }
            case 3: {
                this.P(y0.O().h1());
                break;
            }
            case 2: {
                this.J1(y0.f());
                break;
            }
            case 1: {
                this.M1(y0.I());
                break;
            }
        }
    }
    
    @Override
    public void B(final ObjectId objectId) {
        a.e("value", objectId);
        this.f("writeObjectId", d.I);
        this.N(objectId);
        this.p2(this.F1());
    }
    
    protected b B1() {
        return this.J;
    }
    
    @Override
    public void C(final String s) {
        this.K(s);
        this.T();
    }
    
    protected abstract void D(final String p0);
    
    @Override
    public void D0(final long n) {
        this.f("writeDateTime", d.I, d.G);
        this.q(n);
        this.p2(this.F1());
    }
    
    protected String E1() {
        return this.J.c;
    }
    
    protected abstract void F(final String p0);
    
    protected d F1() {
        if (this.B1().d() == u.I) {
            return d.I;
        }
        return d.H;
    }
    
    protected abstract void G();
    
    @Override
    public void G0(final p0 p) {
        a.e("reader", p);
        this.P1(p, null);
    }
    
    protected d G1() {
        return this.I;
    }
    
    protected abstract void H();
    
    @Override
    public void H0(final String s, final ObjectId objectId) {
        a.e("name", s);
        a.e("value", objectId);
        this.K(s);
        this.B(objectId);
    }
    
    public void H1(final p0 p2, final List<d0> list) {
        a.e("reader", p2);
        a.e("extraElements", list);
        this.P1(p2, list);
    }
    
    @Override
    public void I(final long n) {
        this.f("writeInt64", d.I);
        this.y(n);
        this.p2(this.F1());
    }
    
    @Override
    public void J(final String s, final boolean b) {
        this.K(s);
        this.Q(b);
    }
    
    @Override
    public void K(final String s) {
        a.e("name", s);
        final d i = this.I;
        final d h = d.H;
        if (i != h) {
            this.r2("WriteName", h);
        }
        if (this.H.peek().b(s)) {
            this.L(s);
            this.J.c = s;
            this.I = d.I;
            return;
        }
        throw new IllegalArgumentException(String.format("Invalid BSON field name %s", s));
    }
    
    protected void L(final String s) {
    }
    
    @Override
    public void L0(final String s, final String s2) {
        a.e("name", s);
        a.e("value", s2);
        this.K(s);
        this.d1(s2);
    }
    
    protected abstract void M();
    
    @Override
    public void M0(final String s, final double n) {
        this.K(s);
        this.P(n);
    }
    
    protected abstract void N(final ObjectId p0);
    
    @Override
    public void N0() {
        this.f("writeEndDocument", d.H);
        final u d = this.B1().d();
        final u h = u.H;
        if (d != h) {
            final u k = u.K;
            if (d != k) {
                this.q2("WriteEndDocument", d, h, k);
            }
        }
        if (this.J.e() != null && this.J.e().c != null) {
            this.H.pop();
        }
        --this.K;
        this.w();
        d d2;
        if (this.B1() != null && this.B1().d() != u.G) {
            d2 = this.F1();
        }
        else {
            d2 = org.bson.b.d.K;
        }
        this.p2(d2);
    }
    
    @Override
    public void P(final double n) {
        this.f("writeDBPointer", d.I, d.G);
        this.s(n);
        this.p2(this.F1());
    }
    
    @Override
    public void Q(final boolean b) {
        this.f("writeBoolean", d.I, d.G);
        this.j(b);
        this.p2(this.F1());
    }
    
    @Override
    public void Q0(final String s, final String s2) {
        a.e("name", s);
        a.e("value", s2);
        this.K(s);
        this.y0(s2);
    }
    
    protected void Q1(final List<d0> list) {
        a.e("extraElements", list);
        for (final d0 d0 : list) {
            this.K(d0.a());
            this.k2(d0.b());
        }
    }
    
    @Override
    public void R() {
        final d i = d.I;
        this.f("writeStartArray", i);
        final b j = this.J;
        if (j != null && j.c != null) {
            final Stack<f1> h = this.H;
            h.push(h.peek().a(this.E1()));
        }
        if (++this.K <= this.G.a()) {
            this.o1();
            this.p2(i);
            return;
        }
        throw new s0("Maximum serialization depth exceeded (does the object being serialized have a circular reference?).");
    }
    
    @Override
    public void S(final String s, final String s2) {
        a.e("name", s);
        a.e("value", s2);
        this.K(s);
        this.i(s2);
    }
    
    @Override
    public void T() {
        this.f("writeNull", d.I);
        this.M();
        this.p2(this.F1());
    }
    
    @Override
    public void V(final String s) {
        this.K(s);
        this.w0();
    }
    
    @Override
    public void W() {
        this.f("writeMaxKey", d.I);
        this.G();
        this.p2(this.F1());
    }
    
    @Override
    public void W0(final String s, final v0 v0) {
        a.e("name", s);
        a.e("value", v0);
        this.K(s);
        this.p0(v0);
    }
    
    @Override
    public void X(final o o) {
        a.e("value", o);
        this.f("writeBinaryData", d.I, d.G);
        this.h(o);
        this.p2(this.F1());
    }
    
    @Override
    public void Y(final r0 r0) {
        a.e("value", r0);
        this.f("writeRegularExpression", d.I);
        this.k1(r0);
        this.p2(this.F1());
    }
    
    @Override
    public void Z(final String s) {
        this.K(s);
        this.m0();
    }
    
    @Override
    public void Z0(final String s, final int n) {
        this.K(s);
        this.l(n);
    }
    
    protected boolean a() {
        return false;
    }
    
    @Override
    public void a0(final String s) {
        this.K(s);
        this.e1();
    }
    
    @Override
    public void a1(final String s, final w w) {
        a.e("name", s);
        a.e("value", w);
        this.K(s);
        this.j0(w);
    }
    
    @Override
    public void close() {
        this.L = true;
    }
    
    @Override
    public void d0(final String s, final Decimal128 decimal128) {
        a.e("name", s);
        a.e("value", decimal128);
        this.K(s);
        this.g1(decimal128);
    }
    
    @Override
    public void d1(final String s) {
        a.e("value", s);
        this.f("writeJavaScriptWithScope", d.I);
        this.F(s);
        this.p2(d.J);
    }
    
    @Override
    public void e0(final String s, final long n) {
        this.K(s);
        this.I(n);
    }
    
    @Override
    public void e1() {
        this.f("writeUndefined", d.I);
        this.z1();
        this.p2(this.F1());
    }
    
    protected void f(final String s, final d... array) {
        if (!this.isClosed()) {
            if (!this.g(array)) {
                this.r2(s, array);
            }
            return;
        }
        throw new IllegalStateException("BsonWriter is closed");
    }
    
    @Override
    public void f0(final String s) {
        a.e("value", s);
        this.f("writeSymbol", d.I);
        this.t1(s);
        this.p2(this.F1());
    }
    
    @Override
    public void f1(final String s) {
        this.K(s);
        this.W();
    }
    
    protected boolean g(final d[] array) {
        for (int length = array.length, i = 0; i < length; ++i) {
            if (array[i] == this.G1()) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public void g0(final String s, final r0 r0) {
        a.e("name", s);
        a.e("value", r0);
        this.K(s);
        this.Y(r0);
    }
    
    @Override
    public void g1(final Decimal128 decimal128) {
        a.e("value", decimal128);
        this.f("writeInt64", d.I);
        this.r(decimal128);
        this.p2(this.F1());
    }
    
    protected abstract void h(final o p0);
    
    @Override
    public void h0(final String s, final o o) {
        a.e("name", s);
        a.e("value", o);
        this.K(s);
        this.X(o);
    }
    
    @Override
    public void i(final String s) {
        a.e("value", s);
        this.f("writeString", d.I);
        this.q1(s);
        this.p2(this.F1());
    }
    
    @Override
    public void i0(final String s, final long n) {
        this.K(s);
        this.D0(n);
    }
    
    protected boolean isClosed() {
        return this.L;
    }
    
    protected abstract void j(final boolean p0);
    
    @Override
    public void j0(final w w) {
        a.e("value", w);
        this.f("writeDBPointer", d.I, d.G);
        this.k(w);
        this.p2(this.F1());
    }
    
    protected abstract void k(final w p0);
    
    protected abstract void k1(final r0 p0);
    
    @Override
    public void l(final int n) {
        this.f("writeInt32", d.I);
        this.x(n);
        this.p2(this.F1());
    }
    
    @Override
    public void m0() {
        this.f("writeMinKey", d.I);
        this.H();
        this.p2(this.F1());
    }
    
    @Override
    public void n(final String s) {
        this.K(s);
        this.R();
    }
    
    @Override
    public void o() {
        this.f("writeEndArray", d.I);
        final u d = this.B1().d();
        final u i = u.I;
        if (d != i) {
            this.q2("WriteEndArray", this.B1().d(), i);
        }
        if (this.J.e() != null && this.J.e().c != null) {
            this.H.pop();
        }
        --this.K;
        this.t();
        this.p2(this.F1());
    }
    
    protected abstract void o1();
    
    protected void o2(final b j) {
        this.J = j;
    }
    
    @Override
    public void p0(final v0 v0) {
        a.e("value", v0);
        this.f("writeTimestamp", d.I);
        this.v1(v0);
        this.p2(this.F1());
    }
    
    protected abstract void p1();
    
    protected void p2(final d i) {
        this.I = i;
    }
    
    protected abstract void q(final long p0);
    
    protected abstract void q1(final String p0);
    
    protected void q2(final String s, final u u, final u... a) {
        throw new g0(String.format("%s can only be called when ContextType is %s, not when ContextType is %s.", s, o1.a(" or ", Arrays.asList(a)), u));
    }
    
    protected abstract void r(final Decimal128 p0);
    
    protected void r2(String s, final d... a) {
        final d i = this.I;
        if ((i == d.G || i == d.J || i == d.K) && !s.startsWith("end") && !s.equals("writeName")) {
            final String s2 = s = s.substring(5);
            if (s2.startsWith("start")) {
                s = s2.substring(5);
            }
            String s3;
            if (Arrays.asList('A', 'E', 'I', 'O', 'U').contains(s.charAt(0))) {
                s3 = "An";
            }
            else {
                s3 = "A";
            }
            throw new g0(String.format("%s %s value cannot be written to the root level of a BSON document.", s3, s));
        }
        throw new g0(String.format("%s can only be called when State is %s, not when State is %s", s, o1.a(" or ", Arrays.asList(a)), this.I));
    }
    
    protected abstract void s(final double p0);
    
    @Override
    public void s0(final String s, final String s2) {
        a.e("name", s);
        a.e("value", s2);
        this.K(s);
        this.f0(s2);
    }
    
    protected abstract void t();
    
    protected abstract void t1(final String p0);
    
    protected abstract void v1(final v0 p0);
    
    protected abstract void w();
    
    @Override
    public void w0() {
        this.f("writeStartDocument", d.G, d.I, d.J, d.K);
        final b j = this.J;
        if (j != null && j.c != null) {
            final Stack<f1> h = this.H;
            h.push(h.peek().a(this.E1()));
        }
        if (++this.K <= this.G.a()) {
            this.p1();
            this.p2(d.H);
            return;
        }
        throw new s0("Maximum serialization depth exceeded (does the object being serialized have a circular reference?).");
    }
    
    protected abstract void x(final int p0);
    
    protected abstract void y(final long p0);
    
    @Override
    public void y0(final String s) {
        a.e("value", s);
        this.f("writeJavaScript", d.I);
        this.D(s);
        this.p2(this.F1());
    }
    
    protected abstract void z1();
    
    public class b
    {
        private final b a;
        private final u b;
        private String c;
        
        public b(final b b) {
            this.a = b.a;
            this.b = b.b;
        }
        
        public b(final b a, final u b) {
            this.a = a;
            this.b = b;
        }
        
        public b c() {
            return new b(this);
        }
        
        public u d() {
            return this.b;
        }
        
        public b e() {
            return this.a;
        }
    }
    
    protected class c
    {
        private final b a;
        private final d b;
        private final String c;
        private final int d;
        
        protected c() {
            this.a = org.bson.b.this.J.c();
            this.b = org.bson.b.this.I;
            this.c = org.bson.b.this.J.c;
            this.d = org.bson.b.this.K;
        }
        
        protected void a() {
            org.bson.b.this.o2(this.a);
            org.bson.b.this.p2(this.b);
            org.bson.b.this.J.c = this.c;
            org.bson.b.this.K = this.d;
        }
    }
    
    public enum d
    {
        G, 
        H, 
        I, 
        J, 
        K, 
        L;
    }
}
