// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.chrono;

import org.joda.time.i;
import java.io.IOException;
import java.io.ObjectInputStream;
import org.joda.time.f;
import org.joda.time.l;

public abstract class a extends b
{
    private static final long t0 = -6728465968995518215L;
    private final a H;
    private final Object I;
    private transient l J;
    private transient l K;
    private transient l L;
    private transient l M;
    private transient l N;
    private transient l O;
    private transient l P;
    private transient l Q;
    private transient l R;
    private transient l S;
    private transient l T;
    private transient l U;
    private transient f V;
    private transient f W;
    private transient f X;
    private transient f Y;
    private transient f Z;
    private transient f a0;
    private transient f b0;
    private transient f c0;
    private transient f d0;
    private transient f e0;
    private transient f f0;
    private transient f g0;
    private transient f h0;
    private transient f i0;
    private transient f j0;
    private transient f k0;
    private transient f l0;
    private transient f m0;
    private transient f n0;
    private transient f o0;
    private transient f p0;
    private transient f q0;
    private transient f r0;
    private transient int s0;
    
    protected a(final a h, final Object i) {
        this.H = h;
        this.I = i;
        this.b0();
    }
    
    private void a0(final ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.b0();
    }
    
    private void b0() {
        final a a = new a();
        final a h = this.H;
        if (h != null) {
            a.a(h);
        }
        this.X(a);
        l j = a.a;
        if (j == null) {
            j = super.y();
        }
        this.J = j;
        l k = a.b;
        if (k == null) {
            k = super.J();
        }
        this.K = k;
        l l = a.c;
        if (l == null) {
            l = super.E();
        }
        this.L = l;
        l m = a.d;
        if (m == null) {
            m = super.x();
        }
        this.M = m;
        l n = a.e;
        if (n == null) {
            n = super.u();
        }
        this.N = n;
        l o = a.f;
        if (o == null) {
            o = super.j();
        }
        this.O = o;
        l p = a.g;
        if (p == null) {
            p = super.N();
        }
        this.P = p;
        l q = a.h;
        if (q == null) {
            q = super.Q();
        }
        this.Q = q;
        l r = a.i;
        if (r == null) {
            r = super.G();
        }
        this.R = r;
        l s = a.j;
        if (s == null) {
            s = super.W();
        }
        this.S = s;
        l t = a.k;
        if (t == null) {
            t = super.c();
        }
        this.T = t;
        l u = a.l;
        if (u == null) {
            u = super.l();
        }
        this.U = u;
        f v = a.m;
        if (v == null) {
            v = super.B();
        }
        this.V = v;
        f w = a.n;
        if (w == null) {
            w = super.z();
        }
        this.W = w;
        f x = a.o;
        if (x == null) {
            x = super.I();
        }
        this.X = x;
        f y = a.p;
        if (y == null) {
            y = super.H();
        }
        this.Y = y;
        f z = a.q;
        if (z == null) {
            z = super.D();
        }
        this.Z = z;
        f a2 = a.r;
        if (a2 == null) {
            a2 = super.C();
        }
        this.a0 = a2;
        f b0 = a.s;
        if (b0 == null) {
            b0 = super.v();
        }
        this.b0 = b0;
        f c0 = a.t;
        if (c0 == null) {
            c0 = super.e();
        }
        this.c0 = c0;
        f d0 = a.u;
        if (d0 == null) {
            d0 = super.w();
        }
        this.d0 = d0;
        f e0 = a.v;
        if (e0 == null) {
            e0 = super.f();
        }
        this.e0 = e0;
        f f0 = a.w;
        if (f0 == null) {
            f0 = super.t();
        }
        this.f0 = f0;
        f g0 = a.x;
        if (g0 == null) {
            g0 = super.h();
        }
        this.g0 = g0;
        f h2 = a.y;
        if (h2 == null) {
            h2 = super.g();
        }
        this.h0 = h2;
        f i0 = a.z;
        if (i0 == null) {
            i0 = super.i();
        }
        this.i0 = i0;
        f j2 = a.A;
        if (j2 == null) {
            j2 = super.M();
        }
        this.j0 = j2;
        f k2 = a.B;
        if (k2 == null) {
            k2 = super.O();
        }
        this.k0 = k2;
        f l2 = a.C;
        if (l2 == null) {
            l2 = super.P();
        }
        this.l0 = l2;
        f m2 = a.D;
        if (m2 == null) {
            m2 = super.F();
        }
        this.m0 = m2;
        f n2 = a.E;
        if (n2 == null) {
            n2 = super.T();
        }
        this.n0 = n2;
        f o2 = a.F;
        if (o2 == null) {
            o2 = super.V();
        }
        this.o0 = o2;
        f p2 = a.G;
        if (p2 == null) {
            p2 = super.U();
        }
        this.p0 = p2;
        f q2 = a.H;
        if (q2 == null) {
            q2 = super.d();
        }
        this.q0 = q2;
        f r2 = a.I;
        if (r2 == null) {
            r2 = super.k();
        }
        this.r0 = r2;
        final a h3 = this.H;
        int s2 = 0;
        final boolean b2 = false;
        if (h3 != null) {
            final boolean b3 = this.b0 == h3.v() && this.Z == this.H.D() && this.X == this.H.I() && this.V == this.H.B();
            int n3;
            if (this.W == this.H.z()) {
                n3 = 2;
            }
            else {
                n3 = 0;
            }
            int n4 = b2 ? 1 : 0;
            if (this.n0 == this.H.T()) {
                n4 = (b2 ? 1 : 0);
                if (this.m0 == this.H.F()) {
                    n4 = (b2 ? 1 : 0);
                    if (this.h0 == this.H.g()) {
                        n4 = 4;
                    }
                }
            }
            s2 = (n4 | ((b3 ? 1 : 0) | n3));
        }
        this.s0 = s2;
    }
    
    @Override
    public final f B() {
        return this.V;
    }
    
    @Override
    public final f C() {
        return this.a0;
    }
    
    @Override
    public final f D() {
        return this.Z;
    }
    
    @Override
    public final l E() {
        return this.L;
    }
    
    @Override
    public final f F() {
        return this.m0;
    }
    
    @Override
    public final l G() {
        return this.R;
    }
    
    @Override
    public final f H() {
        return this.Y;
    }
    
    @Override
    public final f I() {
        return this.X;
    }
    
    @Override
    public final l J() {
        return this.K;
    }
    
    @Override
    public final f M() {
        return this.j0;
    }
    
    @Override
    public final l N() {
        return this.P;
    }
    
    @Override
    public final f O() {
        return this.k0;
    }
    
    @Override
    public final f P() {
        return this.l0;
    }
    
    @Override
    public final l Q() {
        return this.Q;
    }
    
    @Override
    public final f T() {
        return this.n0;
    }
    
    @Override
    public final f U() {
        return this.p0;
    }
    
    @Override
    public final f V() {
        return this.o0;
    }
    
    @Override
    public final l W() {
        return this.S;
    }
    
    protected abstract void X(final a p0);
    
    protected final a Y() {
        return this.H;
    }
    
    protected final Object Z() {
        return this.I;
    }
    
    @Override
    public final l c() {
        return this.T;
    }
    
    @Override
    public final f d() {
        return this.q0;
    }
    
    @Override
    public final f e() {
        return this.c0;
    }
    
    @Override
    public final f f() {
        return this.e0;
    }
    
    @Override
    public final f g() {
        return this.h0;
    }
    
    @Override
    public final f h() {
        return this.g0;
    }
    
    @Override
    public final f i() {
        return this.i0;
    }
    
    @Override
    public final l j() {
        return this.O;
    }
    
    @Override
    public final f k() {
        return this.r0;
    }
    
    @Override
    public final l l() {
        return this.U;
    }
    
    @Override
    public long p(final int n, final int n2, final int n3, final int n4) throws IllegalArgumentException {
        final a h = this.H;
        if (h != null && (this.s0 & 0x6) == 0x6) {
            return h.p(n, n2, n3, n4);
        }
        return super.p(n, n2, n3, n4);
    }
    
    @Override
    public long q(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7) throws IllegalArgumentException {
        final a h = this.H;
        if (h != null && (this.s0 & 0x5) == 0x5) {
            return h.q(n, n2, n3, n4, n5, n6, n7);
        }
        return super.q(n, n2, n3, n4, n5, n6, n7);
    }
    
    @Override
    public long r(final long n, final int n2, final int n3, final int n4, final int n5) throws IllegalArgumentException {
        final a h = this.H;
        if (h != null && (this.s0 & 0x1) == 0x1) {
            return h.r(n, n2, n3, n4, n5);
        }
        return super.r(n, n2, n3, n4, n5);
    }
    
    @Override
    public i s() {
        final a h = this.H;
        if (h != null) {
            return h.s();
        }
        return null;
    }
    
    @Override
    public final f t() {
        return this.f0;
    }
    
    @Override
    public final l u() {
        return this.N;
    }
    
    @Override
    public final f v() {
        return this.b0;
    }
    
    @Override
    public final f w() {
        return this.d0;
    }
    
    @Override
    public final l x() {
        return this.M;
    }
    
    @Override
    public final l y() {
        return this.J;
    }
    
    @Override
    public final f z() {
        return this.W;
    }
    
    public static final class a
    {
        public f A;
        public f B;
        public f C;
        public f D;
        public f E;
        public f F;
        public f G;
        public f H;
        public f I;
        public l a;
        public l b;
        public l c;
        public l d;
        public l e;
        public l f;
        public l g;
        public l h;
        public l i;
        public l j;
        public l k;
        public l l;
        public f m;
        public f n;
        public f o;
        public f p;
        public f q;
        public f r;
        public f s;
        public f t;
        public f u;
        public f v;
        public f w;
        public f x;
        public f y;
        public f z;
        
        a() {
        }
        
        private static boolean b(final f f) {
            return f != null && f.M();
        }
        
        private static boolean c(final l l) {
            return l != null && l.z();
        }
        
        public void a(final org.joda.time.a a) {
            final l y = a.y();
            if (c(y)) {
                this.a = y;
            }
            final l j = a.J();
            if (c(j)) {
                this.b = j;
            }
            final l e = a.E();
            if (c(e)) {
                this.c = e;
            }
            final l x = a.x();
            if (c(x)) {
                this.d = x;
            }
            final l u = a.u();
            if (c(u)) {
                this.e = u;
            }
            final l i = a.j();
            if (c(i)) {
                this.f = i;
            }
            final l n = a.N();
            if (c(n)) {
                this.g = n;
            }
            final l q = a.Q();
            if (c(q)) {
                this.h = q;
            }
            final l g = a.G();
            if (c(g)) {
                this.i = g;
            }
            final l w = a.W();
            if (c(w)) {
                this.j = w;
            }
            final l c = a.c();
            if (c(c)) {
                this.k = c;
            }
            final l l = a.l();
            if (c(l)) {
                this.l = l;
            }
            final f b = a.B();
            if (b(b)) {
                this.m = b;
            }
            final f z = a.z();
            if (b(z)) {
                this.n = z;
            }
            final f k = a.I();
            if (b(k)) {
                this.o = k;
            }
            final f h = a.H();
            if (b(h)) {
                this.p = h;
            }
            final f d = a.D();
            if (b(d)) {
                this.q = d;
            }
            final f c2 = a.C();
            if (b(c2)) {
                this.r = c2;
            }
            final f v = a.v();
            if (b(v)) {
                this.s = v;
            }
            final f e2 = a.e();
            if (b(e2)) {
                this.t = e2;
            }
            final f w2 = a.w();
            if (b(w2)) {
                this.u = w2;
            }
            final f f = a.f();
            if (b(f)) {
                this.v = f;
            }
            final f t = a.t();
            if (b(t)) {
                this.w = t;
            }
            final f h2 = a.h();
            if (b(h2)) {
                this.x = h2;
            }
            final f g2 = a.g();
            if (b(g2)) {
                this.y = g2;
            }
            final f m = a.i();
            if (b(m)) {
                this.z = m;
            }
            final f m2 = a.M();
            if (b(m2)) {
                this.A = m2;
            }
            final f o = a.O();
            if (b(o)) {
                this.B = o;
            }
            final f p = a.P();
            if (b(p)) {
                this.C = p;
            }
            final f f2 = a.F();
            if (b(f2)) {
                this.D = f2;
            }
            final f t2 = a.T();
            if (b(t2)) {
                this.E = t2;
            }
            final f v2 = a.V();
            if (b(v2)) {
                this.F = v2;
            }
            final f u2 = a.U();
            if (b(u2)) {
                this.G = u2;
            }
            final f d2 = a.d();
            if (b(d2)) {
                this.H = d2;
            }
            final f k2 = a.k();
            if (b(k2)) {
                this.I = k2;
            }
        }
    }
}
