// 
// Decompiled by Procyon v0.5.36
// 

package org.bson;

import org.bson.types.Decimal128;
import java.util.Collection;
import java.util.Arrays;
import org.bson.types.ObjectId;

public abstract class a implements p0
{
    private d G;
    private b H;
    private w0 I;
    private String J;
    private boolean K;
    
    protected a() {
        this.G = d.G;
    }
    
    private void g0() {
        final int n = a$a.a[this.X().c().ordinal()];
        d d;
        if (n != 1 && n != 2) {
            if (n != 4) {
                throw new h(String.format("Unexpected ContextType %s.", this.X().c()));
            }
            d = a.d.N;
        }
        else {
            d = a.d.H;
        }
        this.f0(d);
    }
    
    protected abstract long C();
    
    @Override
    public String C0(final String s) {
        this.m0(s);
        return this.H3();
    }
    
    @Override
    public void C1() {
        if (!this.isClosed()) {
            final d z = this.Z();
            final d i = d.I;
            if (z != i) {
                this.i0("skipName", i);
            }
            this.f0(d.J);
            this.V();
            return;
        }
        throw new IllegalStateException("This instance has been closed");
    }
    
    @Override
    public r0 C4() {
        this.h("readRegularExpression", w0.S);
        this.f0(this.Y());
        return this.L();
    }
    
    protected abstract String D();
    
    @Override
    public String D2(final String s) {
        this.m0(s);
        return this.m1();
    }
    
    @Override
    public ObjectId E() {
        this.h("readObjectId", w0.O);
        this.f0(this.Y());
        return this.K();
    }
    
    @Override
    public String E4(final String s) {
        this.m0(s);
        return this.F2();
    }
    
    protected abstract String F();
    
    @Override
    public String F2() {
        this.h("readJavaScriptWithScope", w0.W);
        this.f0(d.K);
        return this.F();
    }
    
    @Override
    public String F4() {
        if (this.G == d.H) {
            this.o5();
        }
        final d g = this.G;
        final d i = d.I;
        if (g != i) {
            this.i0("readName", i);
        }
        this.G = d.J;
        return this.J;
    }
    
    protected abstract void G();
    
    protected abstract void H();
    
    @Override
    public String H3() {
        this.h("readJavaScript", w0.U);
        this.f0(this.Y());
        return this.D();
    }
    
    @Override
    public void H4() {
        this.h("readNull", w0.R);
        this.f0(this.Y());
        this.J();
    }
    
    @Override
    public void I2(final String s) {
        this.m0(s);
        this.W3();
    }
    
    @Override
    public int I5() {
        this.h("readBinaryData", w0.M);
        return this.j();
    }
    
    protected abstract void J();
    
    @Override
    public void J2() {
        this.h("readMaxKey", w0.c0);
        this.f0(this.Y());
        this.G();
    }
    
    @Override
    public String J5() {
        final d g = this.G;
        final d j = d.J;
        if (g != j) {
            this.i0("getCurrentName", j);
        }
        return this.J;
    }
    
    protected abstract ObjectId K();
    
    @Override
    public void K3() {
        if (!this.isClosed()) {
            final u c = this.X().c();
            final u h = u.H;
            if (c != h) {
                final u c2 = this.X().c();
                final u k = u.K;
                if (c2 != k) {
                    this.h0("readEndDocument", this.X().c(), h, k);
                }
            }
            if (this.Z() == d.H) {
                this.o5();
            }
            final d z = this.Z();
            final d l = d.L;
            if (z != l) {
                this.i0("readEndDocument", l);
            }
            this.x();
            this.g0();
            return;
        }
        throw new IllegalStateException("BSONBinaryWriter");
    }
    
    @Override
    public v0 K5(final String s) {
        this.m0(s);
        return this.R0();
    }
    
    protected abstract r0 L();
    
    protected abstract void M();
    
    @Override
    public void M2(final String s) {
        this.m0(s);
    }
    
    protected abstract void N();
    
    @Override
    public long N4(final String s) {
        this.m0(s);
        return this.U1();
    }
    
    @Override
    public w O0() {
        this.h("readDBPointer", w0.T);
        this.f0(this.Y());
        return this.q();
    }
    
    @Override
    public w0 O5() {
        return this.I;
    }
    
    @Override
    public void P2() {
        if (!this.isClosed()) {
            final u c = this.X().c();
            final u i = u.I;
            if (c != i) {
                this.h0("readEndArray", this.X().c(), i);
            }
            if (this.Z() == d.H) {
                this.o5();
            }
            final d z = this.Z();
            final d m = d.M;
            if (z != m) {
                this.i0("ReadEndArray", m);
            }
            this.w();
            this.g0();
            return;
        }
        throw new IllegalStateException("BSONBinaryWriter");
    }
    
    protected abstract String Q();
    
    protected abstract String R();
    
    @Override
    public v0 R0() {
        this.h("readTimestamp", w0.Y);
        this.f0(this.Y());
        return this.S();
    }
    
    protected abstract v0 S();
    
    protected abstract void T();
    
    @Override
    public void T0(final String s) {
        this.m0(s);
        this.J2();
    }
    
    @Override
    public void T1(final String s) {
        this.m0(s);
        this.H4();
    }
    
    @Override
    public String U() {
        this.h("readString", w0.J);
        this.f0(this.Y());
        return this.Q();
    }
    
    @Override
    public long U1() {
        this.h("readDateTime", w0.Q);
        this.f0(this.Y());
        return this.r();
    }
    
    protected abstract void V();
    
    protected abstract void W();
    
    @Override
    public ObjectId W1(final String s) {
        this.m0(s);
        return this.E();
    }
    
    @Override
    public void W3() {
        this.h("readUndefined", w0.N);
        this.f0(this.Y());
        this.T();
    }
    
    protected b X() {
        return this.H;
    }
    
    @Override
    public void X0() {
        this.h("readMinKey", w0.b0);
        this.f0(this.Y());
        this.H();
    }
    
    @Override
    public double X1(final String s) {
        this.m0(s);
        return this.readDouble();
    }
    
    protected d Y() {
        final int n = a$a.a[this.H.c().ordinal()];
        if (n == 1 || n == 2 || n == 3) {
            return d.H;
        }
        if (n == 4) {
            return d.N;
        }
        throw new h(String.format("Unexpected ContextType %s.", this.H.c()));
    }
    
    @Override
    public String Y0(final String s) {
        this.m0(s);
        return this.U();
    }
    
    public d Z() {
        return this.G;
    }
    
    protected void a0(final b h) {
        this.H = h;
    }
    
    @Override
    public byte a4() {
        this.h("readBinaryData", w0.M);
        return this.k();
    }
    
    @Override
    public int b0() {
        this.h("readInt32", w0.X);
        this.f0(this.Y());
        return this.y();
    }
    
    @Override
    public void b4() {
        this.h("readStartDocument", w0.K);
        this.N();
        this.f0(d.H);
    }
    
    @Override
    public void close() {
        this.K = true;
    }
    
    protected void d0(final w0 i) {
        this.I = i;
    }
    
    protected void e0(final String j) {
        this.J = j;
    }
    
    protected void f0(final d g) {
        this.G = g;
    }
    
    protected void h(final String s, final w0 w0) {
        if (!this.isClosed()) {
            this.j0(s, w0);
            return;
        }
        throw new IllegalStateException("BsonWriter is closed");
    }
    
    protected void h0(final String s, final u u, final u... a) {
        throw new g0(String.format("%s can only be called when ContextType is %s, not when ContextType is %s.", s, o1.a(" or ", Arrays.asList(a)), u));
    }
    
    @Override
    public void h2() {
        this.h("readStartArray", w0.L);
        this.M();
        this.f0(d.H);
    }
    
    protected void i0(final String s, final d... a) {
        throw new g0(String.format("%s can only be called when State is %s, not when State is %s.", s, o1.a(" or ", Arrays.asList(a)), this.G));
    }
    
    protected boolean isClosed() {
        return this.K;
    }
    
    protected abstract int j();
    
    protected void j0(final String s, final w0 w0) {
        final d g = this.G;
        if (g == d.G || g == d.K || g == d.H) {
            this.o5();
        }
        if (this.G == d.I) {
            this.C1();
        }
        final d g2 = this.G;
        final d j = d.J;
        if (g2 != j) {
            this.i0(s, j);
        }
        if (this.I == w0) {
            return;
        }
        throw new g0(String.format("%s can only be called when CurrentBSONType is %s, not when CurrentBSONType is %s.", s, w0, this.I));
    }
    
    protected abstract byte k();
    
    @Override
    public long k0() {
        this.h("readInt64", w0.Z);
        this.f0(this.Y());
        return this.C();
    }
    
    @Override
    public long k4(final String s) {
        this.m0(s);
        return this.k0();
    }
    
    protected void m0(final String anObject) {
        this.o5();
        final String f4 = this.F4();
        if (f4.equals(anObject)) {
            return;
        }
        throw new s0(String.format("Expected element name to be '%s', not '%s'.", anObject, f4));
    }
    
    @Override
    public String m1() {
        this.h("readSymbol", w0.V);
        this.f0(this.Y());
        return this.R();
    }
    
    protected abstract o n();
    
    @Override
    public o n3(final String s) {
        this.m0(s);
        return this.o0();
    }
    
    @Override
    public int n5(final String s) {
        this.m0(s);
        return this.b0();
    }
    
    protected abstract boolean o();
    
    @Override
    public o o0() {
        this.h("readBinaryData", w0.M);
        this.f0(this.Y());
        return this.n();
    }
    
    @Override
    public abstract w0 o5();
    
    protected abstract w q();
    
    @Override
    public Decimal128 q0() {
        this.h("readDecimal", w0.a0);
        this.f0(this.Y());
        return this.s();
    }
    
    protected abstract long r();
    
    @Override
    public boolean readBoolean() {
        this.h("readBoolean", w0.P);
        this.f0(this.Y());
        return this.o();
    }
    
    @Override
    public double readDouble() {
        this.h("readDouble", w0.I);
        this.f0(this.Y());
        return this.t();
    }
    
    protected abstract Decimal128 s();
    
    @Override
    public void skipValue() {
        if (!this.isClosed()) {
            final d z = this.Z();
            final d j = d.J;
            if (z != j) {
                this.i0("skipValue", j);
            }
            this.W();
            this.f0(d.H);
            return;
        }
        throw new IllegalStateException("BSONBinaryWriter");
    }
    
    protected abstract double t();
    
    @Override
    public w t4(final String s) {
        this.m0(s);
        return this.O0();
    }
    
    @Override
    public Decimal128 u3(final String s) {
        this.m0(s);
        return this.q0();
    }
    
    protected abstract void w();
    
    @Override
    public boolean w4(final String s) {
        this.m0(s);
        return this.readBoolean();
    }
    
    protected abstract void x();
    
    @Override
    public r0 x5(final String s) {
        this.m0(s);
        return this.C4();
    }
    
    protected abstract int y();
    
    @Override
    public void y3(final String s) {
        this.m0(s);
        this.X0();
    }
    
    protected abstract class b
    {
        private final b a;
        private final u b;
        
        protected b(final b a, final u b) {
            this.a = a;
            this.b = b;
        }
        
        protected u c() {
            return this.b;
        }
        
        protected b d() {
            return this.a;
        }
    }
    
    protected class c implements q0
    {
        private final d a;
        private final b b;
        private final u c;
        private final w0 d;
        private final String e;
        
        protected c() {
            this.a = org.bson.a.this.G;
            this.b = org.bson.a.this.H.a;
            this.c = org.bson.a.this.H.b;
            this.d = org.bson.a.this.I;
            this.e = org.bson.a.this.J;
        }
        
        protected u a() {
            return this.c;
        }
        
        protected b b() {
            return this.b;
        }
        
        @Override
        public void reset() {
            org.bson.a.this.G = this.a;
            org.bson.a.this.I = this.d;
            org.bson.a.this.J = this.e;
        }
    }
    
    public enum d
    {
        G, 
        H, 
        I, 
        J, 
        K, 
        L, 
        M, 
        N, 
        O;
    }
}
