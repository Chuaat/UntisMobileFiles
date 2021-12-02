// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.json;

import org.bson.x0;
import org.bson.types.ObjectId;
import org.bson.types.Decimal128;
import org.bson.a1;

public class f0 extends a1
{
    private static final q A;
    private static final f B;
    private static final k0 C;
    private static final r D;
    private static final g E;
    private static final b0 F;
    private static final j G;
    private static final r0 H;
    private static final i I;
    private static final q0 J;
    private static final n K;
    private static final v0 L;
    private static final h0 M;
    private static final d N;
    private static final j0 O;
    private static final n0 P;
    private static final c Q;
    private static final g0 R;
    private static final m0 S;
    private static final h T;
    private static final l0 U;
    private static final p0 V;
    private static final e W;
    private static final o0 X;
    private static final k Y;
    private static final s0 Z;
    private static final m a0;
    private static final u0 b0;
    private static final l c0;
    private static final i0 d0;
    private static final t0 e0;
    private static final u x;
    private static final a0 y;
    private static final o z;
    private final boolean b;
    private final String c;
    private final String d;
    private final int e;
    private final t f;
    private final a<org.bson.m0> g;
    private final a<String> h;
    private final a<Long> i;
    private final a<org.bson.o> j;
    private final a<Boolean> k;
    private final a<Double> l;
    private final a<Integer> m;
    private final a<Long> n;
    private final a<Decimal128> o;
    private final a<ObjectId> p;
    private final a<org.bson.v0> q;
    private final a<org.bson.r0> r;
    private final a<String> s;
    private final a<x0> t;
    private final a<org.bson.l0> u;
    private final a<org.bson.j0> v;
    private final a<String> w;
    
    static {
        x = new u();
        y = new a0();
        z = new o();
        A = new q();
        B = new f();
        C = new k0();
        D = new r();
        E = new g();
        F = new b0();
        G = new j();
        H = new r0();
        I = new i();
        J = new q0();
        K = new n();
        L = new v0();
        M = new h0();
        N = new d();
        O = new j0();
        P = new n0();
        Q = new c();
        R = new g0();
        S = new m0();
        T = new h();
        U = new l0();
        V = new p0();
        W = new e();
        X = new o0();
        Y = new k();
        Z = new s0();
        a0 = new m();
        b0 = new u0();
        c0 = new l();
        d0 = new i0();
        e0 = new t0();
    }
    
    @Deprecated
    public f0() {
        this(b().N(org.bson.json.t.G));
    }
    
    private f0(final b b) {
        this.b = b.a;
        String c;
        if (b.b != null) {
            c = b.b;
        }
        else {
            c = System.getProperty("line.separator");
        }
        this.c = c;
        this.d = b.c;
        final t q = b.d;
        this.f = q;
        this.e = b.e;
        a g;
        if (b.f != null) {
            g = b.f;
        }
        else {
            g = f0.x;
        }
        this.g = (a<org.bson.m0>)g;
        a h;
        if (b.g != null) {
            h = b.g;
        }
        else {
            h = f0.y;
        }
        this.h = (a<String>)h;
        a k;
        if (b.j != null) {
            k = b.j;
        }
        else {
            k = f0.z;
        }
        this.k = (a<Boolean>)k;
        a l;
        if (b.k != null) {
            l = b.k;
        }
        else if (q == org.bson.json.t.I) {
            l = f0.B;
        }
        else if (q == org.bson.json.t.J) {
            l = f0.C;
        }
        else {
            l = f0.A;
        }
        this.l = (a<Double>)l;
        a m;
        if (b.l != null) {
            m = b.l;
        }
        else if (q == org.bson.json.t.I) {
            m = f0.E;
        }
        else {
            m = f0.D;
        }
        this.m = (a<Integer>)m;
        a s;
        if (b.r != null) {
            s = b.r;
        }
        else {
            s = f0.F;
        }
        this.s = (a<String>)s;
        a d;
        if (b.v != null) {
            d = b.v;
        }
        else {
            d = new s();
        }
        this.w = (a<String>)d;
        a u;
        if (b.t != null) {
            u = b.t;
        }
        else if (q != org.bson.json.t.G && q != org.bson.json.t.I && q != org.bson.json.t.J) {
            u = f0.H;
        }
        else {
            u = f0.G;
        }
        this.u = (a<org.bson.l0>)u;
        a v;
        if (b.u != null) {
            v = b.u;
        }
        else if (q != org.bson.json.t.G && q != org.bson.json.t.I && q != org.bson.json.t.J) {
            v = f0.J;
        }
        else {
            v = f0.I;
        }
        this.v = (a<org.bson.j0>)v;
        a t;
        if (b.s != null) {
            t = b.s;
        }
        else if (q != org.bson.json.t.G && q != org.bson.json.t.I && q != org.bson.json.t.J) {
            t = f0.L;
        }
        else {
            t = f0.K;
        }
        this.t = (a<x0>)t;
        a i;
        if (b.h != null) {
            i = b.h;
        }
        else if (q == org.bson.json.t.G) {
            i = f0.M;
        }
        else if (q == org.bson.json.t.I) {
            i = f0.N;
        }
        else if (q == org.bson.json.t.J) {
            i = f0.O;
        }
        else {
            i = f0.P;
        }
        this.i = (a<Long>)i;
        a j;
        if (b.i != null) {
            j = b.i;
        }
        else if (q == org.bson.json.t.G) {
            j = f0.R;
        }
        else if (q != org.bson.json.t.I && q != org.bson.json.t.J) {
            j = f0.S;
        }
        else {
            j = f0.Q;
        }
        this.j = (a<org.bson.o>)j;
        a n;
        if (b.m != null) {
            n = b.m;
        }
        else if (q != org.bson.json.t.G && q != org.bson.json.t.I) {
            if (q == org.bson.json.t.J) {
                n = f0.U;
            }
            else {
                n = f0.V;
            }
        }
        else {
            n = f0.T;
        }
        this.n = (a<Long>)n;
        a o;
        if (b.n != null) {
            o = b.n;
        }
        else if (q != org.bson.json.t.G && q != org.bson.json.t.I && q != org.bson.json.t.J) {
            o = f0.X;
        }
        else {
            o = f0.W;
        }
        this.o = (a<Decimal128>)o;
        a p;
        if (b.o != null) {
            p = b.o;
        }
        else if (q != org.bson.json.t.G && q != org.bson.json.t.I && q != org.bson.json.t.J) {
            p = f0.Z;
        }
        else {
            p = f0.Y;
        }
        this.p = (a<ObjectId>)p;
        a q2;
        if (b.p != null) {
            q2 = b.p;
        }
        else if (q != org.bson.json.t.G && q != org.bson.json.t.I && q != org.bson.json.t.J) {
            q2 = f0.b0;
        }
        else {
            q2 = f0.a0;
        }
        this.q = (a<org.bson.v0>)q2;
        a r;
        if (b.q != null) {
            r = b.q;
        }
        else if (q != org.bson.json.t.I && q != org.bson.json.t.J) {
            if (q == org.bson.json.t.G) {
                r = f0.d0;
            }
            else {
                r = f0.e0;
            }
        }
        else {
            r = f0.c0;
        }
        this.r = (a<org.bson.r0>)r;
    }
    
    @Deprecated
    public f0(final t t) {
        this(b().N(t));
    }
    
    @Deprecated
    public f0(final t t, final String s) {
        this(b().N(t).C(true).D(s));
    }
    
    @Deprecated
    public f0(final t t, final String s, final String s2) {
        this(b().N(t).C(true).D(s).K(s2));
    }
    
    @Deprecated
    public f0(final t t, final boolean b) {
        this(b().N(t).C(b));
    }
    
    @Deprecated
    public f0(final boolean b) {
        this(b().C(b));
    }
    
    public static b b() {
        return new b();
    }
    
    public a<org.bson.o> c() {
        return this.j;
    }
    
    public a<Boolean> d() {
        return this.k;
    }
    
    public a<Long> e() {
        return this.i;
    }
    
    public a<Decimal128> f() {
        return this.o;
    }
    
    public a<Double> g() {
        return this.l;
    }
    
    public String h() {
        return this.d;
    }
    
    public a<Integer> i() {
        return this.m;
    }
    
    public a<Long> j() {
        return this.n;
    }
    
    public a<String> k() {
        return this.w;
    }
    
    public a<org.bson.j0> l() {
        return this.v;
    }
    
    public int m() {
        return this.e;
    }
    
    public a<org.bson.l0> n() {
        return this.u;
    }
    
    public String o() {
        return this.c;
    }
    
    public a<org.bson.m0> p() {
        return this.g;
    }
    
    public a<ObjectId> q() {
        return this.p;
    }
    
    public t r() {
        return this.f;
    }
    
    public a<org.bson.r0> s() {
        return this.r;
    }
    
    public a<String> t() {
        return this.h;
    }
    
    public a<String> u() {
        return this.s;
    }
    
    public a<org.bson.v0> v() {
        return this.q;
    }
    
    public a<x0> w() {
        return this.t;
    }
    
    public boolean x() {
        return this.b;
    }
    
    public static final class b
    {
        private boolean a;
        private String b;
        private String c;
        private t d;
        private int e;
        private a<org.bson.m0> f;
        private a<String> g;
        private a<Long> h;
        private a<org.bson.o> i;
        private a<Boolean> j;
        private a<Double> k;
        private a<Integer> l;
        private a<Long> m;
        private a<Decimal128> n;
        private a<ObjectId> o;
        private a<org.bson.v0> p;
        private a<org.bson.r0> q;
        private a<String> r;
        private a<x0> s;
        private a<org.bson.l0> t;
        private a<org.bson.j0> u;
        private a<String> v;
        
        private b() {
            this.b = System.getProperty("line.separator");
            this.c = "  ";
            this.d = t.J;
        }
        
        public b A(final a<Decimal128> n) {
            this.n = n;
            return this;
        }
        
        public b B(final a<Double> k) {
            this.k = k;
            return this;
        }
        
        public b C(final boolean a) {
            this.a = a;
            return this;
        }
        
        public b D(final String c) {
            e7.a.e("indentCharacters", c);
            this.c = c;
            return this;
        }
        
        public b E(final a<Integer> l) {
            this.l = l;
            return this;
        }
        
        public b F(final a<Long> m) {
            this.m = m;
            return this;
        }
        
        public b G(final a<String> v) {
            this.v = v;
            return this;
        }
        
        public b H(final a<org.bson.j0> u) {
            this.u = u;
            return this;
        }
        
        public b I(final int e) {
            e7.a.d("maxLength >= 0", e >= 0);
            this.e = e;
            return this;
        }
        
        public b J(final a<org.bson.l0> t) {
            this.t = t;
            return this;
        }
        
        public b K(final String b) {
            e7.a.e("newLineCharacters", b);
            this.b = b;
            return this;
        }
        
        public b L(final a<org.bson.m0> f) {
            this.f = f;
            return this;
        }
        
        public b M(final a<ObjectId> o) {
            this.o = o;
            return this;
        }
        
        public b N(final t d) {
            e7.a.e("outputMode", d);
            this.d = d;
            return this;
        }
        
        public b O(final a<org.bson.r0> q) {
            this.q = q;
            return this;
        }
        
        public b P(final a<String> g) {
            this.g = g;
            return this;
        }
        
        public b Q(final a<String> r) {
            this.r = r;
            return this;
        }
        
        public b R(final a<org.bson.v0> p) {
            this.p = p;
            return this;
        }
        
        public b S(final a<x0> s) {
            this.s = s;
            return this;
        }
        
        public b w(final a<org.bson.o> i) {
            this.i = i;
            return this;
        }
        
        public b x(final a<Boolean> j) {
            this.j = j;
            return this;
        }
        
        public f0 y() {
            return new f0(this, null);
        }
        
        public b z(final a<Long> h) {
            this.h = h;
            return this;
        }
    }
}
