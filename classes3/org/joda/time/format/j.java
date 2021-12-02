// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.format;

import java.util.HashSet;
import org.joda.time.g;
import java.util.Collection;

public class j
{
    protected j() {
    }
    
    public static b A() {
        return a.a0;
    }
    
    public static b B() {
        return a.E;
    }
    
    public static b C() {
        return a.F;
    }
    
    public static b D() {
        return a.e0;
    }
    
    public static b E(final Collection<g> collection, final boolean b, final boolean b2) {
        Label_0289: {
            if (collection == null || collection.size() == 0) {
                break Label_0289;
            }
            final HashSet<g> set = new HashSet<g>(collection);
            final int size = set.size();
            final c c = new c();
            boolean b3 = false;
            Label_0061: {
                Label_0051: {
                    if (!set.contains(g.R())) {
                        if (set.contains(g.D())) {
                            b3 = r(c, set, b, b2);
                            break Label_0061;
                        }
                        if (!set.contains(g.U())) {
                            if (set.contains(g.B())) {
                                break Label_0051;
                            }
                            if (!set.contains(g.C())) {
                                b b4;
                                if (set.remove(g.X())) {
                                    b4 = a.a;
                                }
                                else {
                                    if (!set.remove(g.V())) {
                                        b3 = false;
                                        break Label_0061;
                                    }
                                    b4 = a.d;
                                }
                                c.a(b4);
                                b3 = true;
                                break Label_0061;
                            }
                        }
                        b3 = s(c, set, b, b2);
                        break Label_0061;
                    }
                }
                b3 = q(c, set, b, b2);
            }
            T(c, set, b, b2, b3, set.size() < size);
            Label_0252: {
                if (!c.i0()) {
                    break Label_0252;
                }
                try {
                    collection.retainAll(set);
                    return c.u0();
                    final StringBuilder sb = new StringBuilder();
                    sb.append("No valid format for fields: ");
                    sb.append(collection);
                    throw new IllegalArgumentException(sb.toString());
                    throw new IllegalArgumentException("The fields must not be null or empty");
                }
                catch (UnsupportedOperationException ex) {
                    return c.u0();
                }
            }
        }
    }
    
    public static b F() {
        return a.h;
    }
    
    public static b G() {
        return a.r;
    }
    
    public static b H() {
        return a.s;
    }
    
    public static b I() {
        return a.u;
    }
    
    public static b J() {
        return a.t;
    }
    
    public static b K() {
        return a.g0;
    }
    
    public static b L() {
        return a.b0;
    }
    
    public static b M() {
        return a.d0;
    }
    
    public static b N() {
        return a.I;
    }
    
    public static b O() {
        return a.J;
    }
    
    public static b P() {
        return a.K;
    }
    
    public static b Q() {
        return a.C;
    }
    
    public static b R() {
        return a.D;
    }
    
    public static b S() {
        return a.A;
    }
    
    private static void T(final c c, final Collection<g> obj, final boolean b, final boolean b2, final boolean b3, final boolean b4) {
        final boolean remove = obj.remove(g.K());
        final boolean remove2 = obj.remove(g.Q());
        final boolean remove3 = obj.remove(g.T());
        final boolean remove4 = obj.remove(g.O());
        if (!remove && !remove2 && !remove3 && !remove4) {
            return;
        }
        if (remove || remove2 || remove3 || remove4) {
            if (b2 && b3) {
                final StringBuilder sb = new StringBuilder();
                sb.append("No valid ISO8601 format for fields because Date was reduced precision: ");
                sb.append(obj);
                throw new IllegalArgumentException(sb.toString());
            }
            if (b4) {
                c.B('T');
            }
        }
        Label_0257: {
            if (!remove || !remove2 || !remove3) {
                if (!remove || remove3 || remove4) {
                    if (b2 && b4) {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("No valid ISO8601 format for fields because Time was truncated: ");
                        sb2.append(obj);
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    if (!remove) {
                        if ((remove2 && remove3) || (remove2 && !remove4)) {
                            break Label_0257;
                        }
                        if (remove3) {
                            break Label_0257;
                        }
                    }
                    if (b2) {
                        final StringBuilder sb3 = new StringBuilder();
                        sb3.append("No valid ISO8601 format for fields: ");
                        sb3.append(obj);
                        throw new IllegalArgumentException(sb3.toString());
                    }
                }
            }
        }
        if (remove) {
            c.z(2);
        }
        else if (remove2 || remove3 || remove4) {
            c.B('-');
        }
        if (b && remove && remove2) {
            c.B(':');
        }
        if (remove2) {
            c.G(2);
        }
        else if (remove3 || remove4) {
            c.B('-');
        }
        if (b && remove2 && remove3) {
            c.B(':');
        }
        if (remove3) {
            c.N(2);
        }
        else if (remove4) {
            c.B('-');
        }
        if (remove4) {
            c.B('.');
            c.E(3);
        }
    }
    
    public static b U() {
        return a.Z;
    }
    
    public static b V() {
        return a.B;
    }
    
    public static b W() {
        return a.c0;
    }
    
    public static b X() {
        return a.q;
    }
    
    public static b Y() {
        return a.G;
    }
    
    public static b Z() {
        return a.H;
    }
    
    private static void a(final c c, final boolean b) {
        if (b) {
            c.B('-');
        }
    }
    
    public static b a0() {
        return a.d;
    }
    
    public static b b() {
        return a.L;
    }
    
    public static b b0() {
        return a.p;
    }
    
    public static b c() {
        return a.Q;
    }
    
    public static b c0() {
        return a.q;
    }
    
    public static b d() {
        return a.R;
    }
    
    public static b d0() {
        return a.a;
    }
    
    public static b e() {
        return a.S;
    }
    
    public static b e0() {
        return a.n;
    }
    
    public static b f() {
        return a.T;
    }
    
    public static b f0() {
        return a.o;
    }
    
    public static b g() {
        return a.U;
    }
    
    public static b h() {
        return a.O;
    }
    
    public static b i() {
        return a.P;
    }
    
    public static b j() {
        return a.M;
    }
    
    public static b k() {
        return a.N;
    }
    
    public static b l() {
        return a.V;
    }
    
    public static b m() {
        return a.W;
    }
    
    public static b n() {
        return a.X;
    }
    
    private static void o(final Collection<g> obj, final boolean b) {
        if (!b) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("No valid ISO8601 format for fields: ");
        sb.append(obj);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static b p() {
        return f0();
    }
    
    private static boolean q(final c c, final Collection<g> collection, final boolean b, final boolean b2) {
        final boolean remove = collection.remove(g.X());
        boolean b3 = true;
        Label_0186: {
            Label_0172: {
                if (remove) {
                    c.a(a.a);
                    if (collection.remove(g.R())) {
                        if (!collection.remove(g.B())) {
                            c.B('-');
                            c.H(2);
                            return b3;
                        }
                        a(c, b);
                        c.H(2);
                    }
                    else {
                        if (collection.remove(g.B())) {
                            o(collection, b2);
                            break Label_0172;
                        }
                        return b3;
                    }
                }
                else if (collection.remove(g.R())) {
                    c.B('-');
                    c.B('-');
                    c.H(2);
                    if (!collection.remove(g.B())) {
                        return b3;
                    }
                }
                else {
                    if (collection.remove(g.B())) {
                        c.B('-');
                        break Label_0172;
                    }
                    return false;
                }
                a(c, b);
                break Label_0186;
            }
            c.B('-');
            c.B('-');
        }
        c.k(2);
        b3 = false;
        return b3;
    }
    
    private static boolean r(final c c, final Collection<g> collection, final boolean b, final boolean b2) {
        if (collection.remove(g.X())) {
            c.a(a.a);
            if (!collection.remove(g.D())) {
                return true;
            }
            a(c, b);
        }
        else {
            if (!collection.remove(g.D())) {
                return false;
            }
            c.B('-');
        }
        c.o(3);
        return false;
    }
    
    private static boolean s(final c c, final Collection<g> collection, final boolean b, final boolean b2) {
        final boolean remove = collection.remove(g.V());
        boolean b3 = true;
        Label_0182: {
            Label_0168: {
                if (remove) {
                    c.a(a.d);
                    if (collection.remove(g.U())) {
                        a(c, b);
                        c.B('W');
                        c.d0(2);
                        if (!collection.remove(g.C())) {
                            return b3;
                        }
                    }
                    else {
                        if (collection.remove(g.C())) {
                            o(collection, b2);
                            a(c, b);
                            break Label_0168;
                        }
                        return b3;
                    }
                }
                else if (collection.remove(g.U())) {
                    c.B('-');
                    c.B('W');
                    c.d0(2);
                    if (!collection.remove(g.C())) {
                        return b3;
                    }
                }
                else {
                    if (collection.remove(g.C())) {
                        c.B('-');
                        break Label_0168;
                    }
                    return false;
                }
                a(c, b);
                break Label_0182;
            }
            c.B('W');
            c.B('-');
        }
        c.l(1);
        b3 = false;
        return b3;
    }
    
    public static b t() {
        return a.Y;
    }
    
    public static b u() {
        return a.v;
    }
    
    public static b v() {
        return a.w;
    }
    
    public static b w() {
        return a.x;
    }
    
    public static b x() {
        return a.z;
    }
    
    public static b y() {
        return a.y;
    }
    
    public static b z() {
        return a.f0;
    }
    
    static final class a
    {
        private static final b A;
        private static final b B;
        private static final b C;
        private static final b D;
        private static final b E;
        private static final b F;
        private static final b G;
        private static final b H;
        private static final b I;
        private static final b J;
        private static final b K;
        private static final b L;
        private static final b M;
        private static final b N;
        private static final b O;
        private static final b P;
        private static final b Q;
        private static final b R;
        private static final b S;
        private static final b T;
        private static final b U;
        private static final b V;
        private static final b W;
        private static final b X;
        private static final b Y;
        private static final b Z;
        private static final b a;
        private static final b a0;
        private static final b b;
        private static final b b0;
        private static final b c;
        private static final b c0;
        private static final b d;
        private static final b d0;
        private static final b e;
        private static final b e0;
        private static final b f;
        private static final b f0;
        private static final b g;
        private static final b g0;
        private static final b h;
        private static final b i;
        private static final b j;
        private static final b k;
        private static final b l;
        private static final b m;
        private static final b n;
        private static final b o;
        private static final b p;
        private static final b q;
        private static final b r;
        private static final b s;
        private static final b t;
        private static final b u;
        private static final b v;
        private static final b w;
        private static final b x;
        private static final b y;
        private static final b z;
        
        static {
            a = b1();
            b = J0();
            c = v0();
            d = Y0();
            e = X0();
            f = w0();
            g = x0();
            h = z0();
            i = I0();
            j = O0();
            k = y0();
            l = K0();
            m = E0();
            n = c1();
            o = d1();
            p = Z0();
            q = a1();
            r = A0();
            s = B0();
            t = D0();
            u = C0();
            v = l0();
            w = m0();
            x = n0();
            y = p0();
            z = o0();
            A = R0();
            B = T0();
            C = P0();
            D = Q0();
            E = s0();
            F = t0();
            G = V0();
            H = W0();
            I = L0();
            J = M0();
            K = N0();
            L = X();
            M = f0();
            N = g0();
            O = d0();
            P = e0();
            Q = Y();
            R = Z();
            S = a0();
            T = b0();
            U = c0();
            V = h0();
            W = i0();
            X = j0();
            Y = k0();
            Z = S0();
            a0 = r0();
            b0 = G0();
            c0 = U0();
            d0 = H0();
            e0 = u0();
            f0 = q0();
            g0 = F0();
        }
        
        private static b A0() {
            b b;
            if ((b = org.joda.time.format.j.a.r) == null) {
                b = new c().a(z0()).a(I0()).u0();
            }
            return b;
        }
        
        private static b B0() {
            b b;
            if ((b = org.joda.time.format.j.a.s) == null) {
                b = new c().a(z0()).a(I0()).a(O0()).u0();
            }
            return b;
        }
        
        private static b C0() {
            b b;
            if ((b = org.joda.time.format.j.a.u) == null) {
                b = new c().a(z0()).a(I0()).a(O0()).a(y0()).u0();
            }
            return b;
        }
        
        private static b D0() {
            b b;
            if ((b = org.joda.time.format.j.a.t) == null) {
                b = new c().a(z0()).a(I0()).a(O0()).B('.').x(3, 3).u0();
            }
            return b;
        }
        
        private static b E0() {
            b b;
            if ((b = org.joda.time.format.j.a.m) == null) {
                b = new c().B('T').u0();
            }
            return b;
        }
        
        private static b F0() {
            b b;
            if ((b = org.joda.time.format.j.a.g0) == null) {
                b = new c().a(k0()).K(new c().B('T').a(S0()).v0()).u0().U();
            }
            return b;
        }
        
        private static b G0() {
            b b;
            if ((b = org.joda.time.format.j.a.b0) == null) {
                b = k0().U();
            }
            return b;
        }
        
        private static b H0() {
            b b;
            if ((b = org.joda.time.format.j.a.d0) == null) {
                b = new c().K(E0().e()).a(S0()).u0().U();
            }
            return b;
        }
        
        private static b I0() {
            b b;
            if ((b = org.joda.time.format.j.a.i) == null) {
                b = new c().B(':').G(2).u0();
            }
            return b;
        }
        
        private static b J0() {
            b b;
            if ((b = org.joda.time.format.j.a.b) == null) {
                b = new c().B('-').H(2).u0();
            }
            return b;
        }
        
        private static b K0() {
            b b;
            if ((b = org.joda.time.format.j.a.l) == null) {
                b = new c().V("Z", true, 2, 4).u0();
            }
            return b;
        }
        
        private static b L0() {
            b b;
            if ((b = org.joda.time.format.j.a.I) == null) {
                b = new c().a(b1()).a(x0()).u0();
            }
            return b;
        }
        
        private static b M0() {
            b b;
            if ((b = org.joda.time.format.j.a.J) == null) {
                b = new c().a(L0()).a(P0()).u0();
            }
            return b;
        }
        
        private static b N0() {
            b b;
            if ((b = org.joda.time.format.j.a.K) == null) {
                b = new c().a(L0()).a(Q0()).u0();
            }
            return b;
        }
        
        private static b O0() {
            b b;
            if ((b = org.joda.time.format.j.a.j) == null) {
                b = new c().B(':').N(2).u0();
            }
            return b;
        }
        
        private static b P0() {
            b b;
            if ((b = org.joda.time.format.j.a.C) == null) {
                b = new c().a(E0()).a(R0()).u0();
            }
            return b;
        }
        
        private static b Q0() {
            b b;
            if ((b = org.joda.time.format.j.a.D) == null) {
                b = new c().a(E0()).a(T0()).u0();
            }
            return b;
        }
        
        private static b R0() {
            b b;
            if ((b = org.joda.time.format.j.a.A) == null) {
                b = new c().a(C0()).a(K0()).u0();
            }
            return b;
        }
        
        private static b S0() {
            b b;
            if ((b = org.joda.time.format.j.a.Z) == null) {
                final d v0 = new c().e(null, new d[] { new c().B('.').v0(), new c().B(',').v0() }).v0();
                b = new c().a(z0()).e(null, new d[] { new c().a(I0()).e(null, new d[] { new c().a(O0()).K(new c().b(v0).x(1, 9).v0()).v0(), new c().b(v0).w(1, 9).v0(), null }).v0(), new c().b(v0).v(1, 9).v0(), null }).u0();
            }
            return b;
        }
        
        private static b T0() {
            b b;
            if ((b = org.joda.time.format.j.a.B) == null) {
                b = new c().a(B0()).a(K0()).u0();
            }
            return b;
        }
        
        private static b U0() {
            b b;
            if ((b = org.joda.time.format.j.a.c0) == null) {
                b = new c().K(E0().e()).a(S0()).K(K0().e()).u0();
            }
            return b;
        }
        
        private static b V0() {
            b b;
            if ((b = org.joda.time.format.j.a.G) == null) {
                b = new c().a(org.joda.time.format.j.X()).a(P0()).u0();
            }
            return b;
        }
        
        private static b W0() {
            b b;
            if ((b = org.joda.time.format.j.a.H) == null) {
                b = new c().a(org.joda.time.format.j.X()).a(Q0()).u0();
            }
            return b;
        }
        
        private static b X() {
            b b;
            if ((b = org.joda.time.format.j.a.L) == null) {
                b = new c().f0(4, 4).r(org.joda.time.g.R(), 2).r(org.joda.time.g.B(), 2).u0();
            }
            return b;
        }
        
        private static b X0() {
            b b;
            if ((b = org.joda.time.format.j.a.e) == null) {
                b = new c().C("-W").d0(2).u0();
            }
            return b;
        }
        
        private static b Y() {
            b b;
            if ((b = org.joda.time.format.j.a.Q) == null) {
                b = new c().a(X()).a(d0()).u0();
            }
            return b;
        }
        
        private static b Y0() {
            b b;
            if ((b = org.joda.time.format.j.a.d) == null) {
                b = new c().e0(4, 9).u0();
            }
            return b;
        }
        
        private static b Z() {
            b b;
            if ((b = org.joda.time.format.j.a.R) == null) {
                b = new c().a(X()).a(e0()).u0();
            }
            return b;
        }
        
        private static b Z0() {
            b b;
            if ((b = org.joda.time.format.j.a.p) == null) {
                b = new c().a(Y0()).a(X0()).u0();
            }
            return b;
        }
        
        private static b a0() {
            b b;
            if ((b = org.joda.time.format.j.a.S) == null) {
                b = new c().f0(4, 4).r(org.joda.time.g.D(), 3).u0();
            }
            return b;
        }
        
        private static b a1() {
            b b;
            if ((b = org.joda.time.format.j.a.q) == null) {
                b = new c().a(Y0()).a(X0()).a(w0()).u0();
            }
            return b;
        }
        
        private static b b0() {
            b b;
            if ((b = org.joda.time.format.j.a.T) == null) {
                b = new c().a(a0()).a(d0()).u0();
            }
            return b;
        }
        
        private static b b1() {
            b b;
            if ((b = org.joda.time.format.j.a.a) == null) {
                b = new c().f0(4, 9).u0();
            }
            return b;
        }
        
        private static b c0() {
            b b;
            if ((b = org.joda.time.format.j.a.U) == null) {
                b = new c().a(a0()).a(e0()).u0();
            }
            return b;
        }
        
        private static b c1() {
            b b;
            if ((b = org.joda.time.format.j.a.n) == null) {
                b = new c().a(b1()).a(J0()).u0();
            }
            return b;
        }
        
        private static b d0() {
            b b;
            if ((b = org.joda.time.format.j.a.O) == null) {
                b = new c().a(E0()).a(f0()).u0();
            }
            return b;
        }
        
        private static b d1() {
            b b;
            if ((b = org.joda.time.format.j.a.o) == null) {
                b = new c().a(b1()).a(J0()).a(v0()).u0();
            }
            return b;
        }
        
        private static b e0() {
            b b;
            if ((b = org.joda.time.format.j.a.P) == null) {
                b = new c().a(E0()).a(g0()).u0();
            }
            return b;
        }
        
        private static b f0() {
            b b;
            if ((b = org.joda.time.format.j.a.M) == null) {
                b = new c().r(org.joda.time.g.K(), 2).r(org.joda.time.g.Q(), 2).r(org.joda.time.g.T(), 2).B('.').x(3, 9).V("Z", false, 2, 2).u0();
            }
            return b;
        }
        
        private static b g0() {
            b b;
            if ((b = org.joda.time.format.j.a.N) == null) {
                b = new c().r(org.joda.time.g.K(), 2).r(org.joda.time.g.Q(), 2).r(org.joda.time.g.T(), 2).V("Z", false, 2, 2).u0();
            }
            return b;
        }
        
        private static b h0() {
            b b;
            if ((b = org.joda.time.format.j.a.V) == null) {
                b = new c().e0(4, 4).B('W').r(org.joda.time.g.U(), 2).r(org.joda.time.g.C(), 1).u0();
            }
            return b;
        }
        
        private static b i0() {
            b b;
            if ((b = org.joda.time.format.j.a.W) == null) {
                b = new c().a(h0()).a(d0()).u0();
            }
            return b;
        }
        
        private static b j0() {
            b b;
            if ((b = org.joda.time.format.j.a.X) == null) {
                b = new c().a(h0()).a(e0()).u0();
            }
            return b;
        }
        
        private static b k0() {
            b b;
            if ((b = org.joda.time.format.j.a.Y) == null) {
                b = new c().e(null, new d[] { new c().a(b1()).K(new c().a(J0()).K(v0().e()).v0()).v0(), new c().a(Y0()).a(X0()).K(w0().e()).v0(), new c().a(b1()).a(x0()).v0() }).u0();
            }
            return b;
        }
        
        private static b l0() {
            b b;
            if ((b = org.joda.time.format.j.a.v) == null) {
                b = new c().a(org.joda.time.format.j.p()).a(E0()).a(org.joda.time.format.j.F()).u0();
            }
            return b;
        }
        
        private static b m0() {
            b b;
            if ((b = org.joda.time.format.j.a.w) == null) {
                b = new c().a(org.joda.time.format.j.p()).a(E0()).a(A0()).u0();
            }
            return b;
        }
        
        private static b n0() {
            b b;
            if ((b = org.joda.time.format.j.a.x) == null) {
                b = new c().a(org.joda.time.format.j.p()).a(E0()).a(B0()).u0();
            }
            return b;
        }
        
        private static b o0() {
            b b;
            if ((b = org.joda.time.format.j.a.z) == null) {
                b = new c().a(org.joda.time.format.j.p()).a(E0()).a(C0()).u0();
            }
            return b;
        }
        
        private static b p0() {
            b b;
            if ((b = org.joda.time.format.j.a.y) == null) {
                b = new c().a(org.joda.time.format.j.p()).a(E0()).a(D0()).u0();
            }
            return b;
        }
        
        private static b q0() {
            b b;
            if ((b = org.joda.time.format.j.a.f0) == null) {
                b = new c().a(k0()).K(new c().B('T').K(S0().e()).K(K0().e()).v0()).u0();
            }
            return b;
        }
        
        private static b r0() {
            b b;
            if ((b = org.joda.time.format.j.a.a0) == null) {
                b = new c().a(k0()).K(new c().B('T').a(K0()).v0()).u0();
            }
            return b;
        }
        
        private static b s0() {
            b b;
            if ((b = org.joda.time.format.j.a.E) == null) {
                b = new c().a(org.joda.time.format.j.p()).a(P0()).u0();
            }
            return b;
        }
        
        private static b t0() {
            b b;
            if ((b = org.joda.time.format.j.a.F) == null) {
                b = new c().a(org.joda.time.format.j.p()).a(Q0()).u0();
            }
            return b;
        }
        
        private static b u0() {
            b b;
            if ((b = org.joda.time.format.j.a.e0) == null) {
                b = new c().e(null, new d[] { new c().B('T').a(S0()).K(K0().e()).v0(), q0().e() }).u0();
            }
            return b;
        }
        
        private static b v0() {
            b b;
            if ((b = org.joda.time.format.j.a.c) == null) {
                b = new c().B('-').k(2).u0();
            }
            return b;
        }
        
        private static b w0() {
            b b;
            if ((b = org.joda.time.format.j.a.f) == null) {
                b = new c().B('-').l(1).u0();
            }
            return b;
        }
        
        private static b x0() {
            b b;
            if ((b = org.joda.time.format.j.a.g) == null) {
                b = new c().B('-').o(3).u0();
            }
            return b;
        }
        
        private static b y0() {
            b b;
            if ((b = org.joda.time.format.j.a.k) == null) {
                b = new c().B('.').x(3, 9).u0();
            }
            return b;
        }
        
        private static b z0() {
            b b;
            if ((b = org.joda.time.format.j.a.h) == null) {
                b = new c().z(2).u0();
            }
            return b;
        }
    }
}
