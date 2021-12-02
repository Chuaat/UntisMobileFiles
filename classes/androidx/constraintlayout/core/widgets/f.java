// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core.widgets;

import java.util.Iterator;
import java.io.PrintStream;
import java.util.ArrayList;
import androidx.constraintlayout.core.i;
import java.util.Arrays;
import java.util.HashSet;
import java.lang.ref.WeakReference;
import androidx.constraintlayout.core.widgets.analyzer.e;
import androidx.constraintlayout.core.widgets.analyzer.b;

public class f extends n
{
    private static final int f2 = 8;
    private static final boolean g2 = false;
    private static final boolean h2 = false;
    static final boolean i2 = false;
    static int j2;
    androidx.constraintlayout.core.widgets.analyzer.b A1;
    public androidx.constraintlayout.core.widgets.analyzer.e B1;
    private int C1;
    protected androidx.constraintlayout.core.widgets.analyzer.b.b D1;
    private boolean E1;
    public androidx.constraintlayout.core.f F1;
    protected androidx.constraintlayout.core.e G1;
    int H1;
    int I1;
    int J1;
    int K1;
    public int L1;
    public int M1;
    c[] N1;
    c[] O1;
    public boolean P1;
    public boolean Q1;
    public boolean R1;
    public int S1;
    public int T1;
    private int U1;
    public boolean V1;
    private boolean W1;
    private boolean X1;
    int Y1;
    private WeakReference<d> Z1;
    private WeakReference<d> a2;
    private WeakReference<d> b2;
    private WeakReference<d> c2;
    HashSet<e> d2;
    public androidx.constraintlayout.core.widgets.analyzer.b.a e2;
    
    public f() {
        this.A1 = new androidx.constraintlayout.core.widgets.analyzer.b(this);
        this.B1 = new androidx.constraintlayout.core.widgets.analyzer.e(this);
        this.D1 = null;
        this.E1 = false;
        this.G1 = new androidx.constraintlayout.core.e();
        this.L1 = 0;
        this.M1 = 0;
        this.N1 = new c[4];
        this.O1 = new c[4];
        this.P1 = false;
        this.Q1 = false;
        this.R1 = false;
        this.S1 = 0;
        this.T1 = 0;
        this.U1 = 257;
        this.V1 = false;
        this.W1 = false;
        this.X1 = false;
        this.Y1 = 0;
        this.Z1 = null;
        this.a2 = null;
        this.b2 = null;
        this.c2 = null;
        this.d2 = new HashSet<e>();
        this.e2 = new androidx.constraintlayout.core.widgets.analyzer.b.a();
    }
    
    public f(final int n, final int n2) {
        super(n, n2);
        this.A1 = new androidx.constraintlayout.core.widgets.analyzer.b(this);
        this.B1 = new androidx.constraintlayout.core.widgets.analyzer.e(this);
        this.D1 = null;
        this.E1 = false;
        this.G1 = new androidx.constraintlayout.core.e();
        this.L1 = 0;
        this.M1 = 0;
        this.N1 = new c[4];
        this.O1 = new c[4];
        this.P1 = false;
        this.Q1 = false;
        this.R1 = false;
        this.S1 = 0;
        this.T1 = 0;
        this.U1 = 257;
        this.V1 = false;
        this.W1 = false;
        this.X1 = false;
        this.Y1 = 0;
        this.Z1 = null;
        this.a2 = null;
        this.b2 = null;
        this.c2 = null;
        this.d2 = new HashSet<e>();
        this.e2 = new androidx.constraintlayout.core.widgets.analyzer.b.a();
    }
    
    public f(final int n, final int n2, final int n3, final int n4) {
        super(n, n2, n3, n4);
        this.A1 = new androidx.constraintlayout.core.widgets.analyzer.b(this);
        this.B1 = new androidx.constraintlayout.core.widgets.analyzer.e(this);
        this.D1 = null;
        this.E1 = false;
        this.G1 = new androidx.constraintlayout.core.e();
        this.L1 = 0;
        this.M1 = 0;
        this.N1 = new c[4];
        this.O1 = new c[4];
        this.P1 = false;
        this.Q1 = false;
        this.R1 = false;
        this.S1 = 0;
        this.T1 = 0;
        this.U1 = 257;
        this.V1 = false;
        this.W1 = false;
        this.X1 = false;
        this.Y1 = 0;
        this.Z1 = null;
        this.a2 = null;
        this.b2 = null;
        this.c2 = null;
        this.d2 = new HashSet<e>();
        this.e2 = new androidx.constraintlayout.core.widgets.analyzer.b.a();
    }
    
    public f(final String s, final int n, final int n2) {
        super(n, n2);
        this.A1 = new androidx.constraintlayout.core.widgets.analyzer.b(this);
        this.B1 = new androidx.constraintlayout.core.widgets.analyzer.e(this);
        this.D1 = null;
        this.E1 = false;
        this.G1 = new androidx.constraintlayout.core.e();
        this.L1 = 0;
        this.M1 = 0;
        this.N1 = new c[4];
        this.O1 = new c[4];
        this.P1 = false;
        this.Q1 = false;
        this.R1 = false;
        this.S1 = 0;
        this.T1 = 0;
        this.U1 = 257;
        this.V1 = false;
        this.W1 = false;
        this.X1 = false;
        this.Y1 = 0;
        this.Z1 = null;
        this.a2 = null;
        this.b2 = null;
        this.c2 = null;
        this.d2 = new HashSet<e>();
        this.e2 = new androidx.constraintlayout.core.widgets.analyzer.b.a();
        this.d1(s);
    }
    
    public static boolean L2(int d, final e e, final androidx.constraintlayout.core.widgets.analyzer.b.b b, final androidx.constraintlayout.core.widgets.analyzer.b.a a, int j) {
        if (b == null) {
            return false;
        }
        if (e.i0() != 8 && !(e instanceof h) && !(e instanceof a)) {
            a.a = e.H();
            a.b = e.g0();
            a.c = e.j0();
            a.d = e.D();
            a.i = false;
            a.j = j;
            final b a2 = a.a;
            final b i = b.I;
            if (a2 == i) {
                d = 1;
            }
            else {
                d = 0;
            }
            if (a.b == i) {
                j = 1;
            }
            else {
                j = 0;
            }
            final boolean b2 = d != 0 && e.f0 > 0.0f;
            final boolean b3 = j != 0 && e.f0 > 0.0f;
            int n = d;
            if (d != 0) {
                n = d;
                if (e.o0(0)) {
                    n = d;
                    if (e.w == 0) {
                        n = d;
                        if (!b2) {
                            a.a = b.H;
                            if (j != 0 && e.x == 0) {
                                a.a = b.G;
                            }
                            n = 0;
                        }
                    }
                }
            }
            if ((d = j) != 0) {
                d = j;
                if (e.o0(1)) {
                    d = j;
                    if (e.x == 0) {
                        d = j;
                        if (!b3) {
                            a.b = b.H;
                            if (n != 0 && e.w == 0) {
                                a.b = b.G;
                            }
                            d = 0;
                        }
                    }
                }
            }
            if (e.C0()) {
                a.a = b.G;
                n = 0;
            }
            if (e.D0()) {
                a.b = b.G;
                d = 0;
            }
            if (b2) {
                if (e.y[0] == 4) {
                    a.a = b.G;
                }
                else if (d == 0) {
                    final b b4 = a.b;
                    final b g = b.G;
                    if (b4 == g) {
                        d = a.d;
                    }
                    else {
                        a.a = b.H;
                        b.b(e, a);
                        d = a.f;
                    }
                    a.a = g;
                    a.c = (int)(e.A() * d);
                }
            }
            if (b3) {
                if (e.y[1] == 4) {
                    a.b = b.G;
                }
                else if (n == 0) {
                    final b a3 = a.a;
                    final b g2 = b.G;
                    if (a3 == g2) {
                        d = a.c;
                    }
                    else {
                        a.b = b.H;
                        b.b(e, a);
                        d = a.e;
                    }
                    a.b = g2;
                    if (e.B() == -1) {
                        d /= (int)e.A();
                    }
                    else {
                        d *= (int)e.A();
                    }
                    a.d = d;
                }
            }
            b.b(e, a);
            e.W1(a.e);
            e.s1(a.f);
            e.r1(a.h);
            e.a1(a.g);
            a.j = b.a.k;
            return a.i;
        }
        a.e = 0;
        a.f = 0;
        return false;
    }
    
    private void N2() {
        this.L1 = 0;
        this.M1 = 0;
    }
    
    private void m2(final e e) {
        final int l1 = this.L1;
        final c[] o1 = this.O1;
        if (l1 + 1 >= o1.length) {
            this.O1 = Arrays.copyOf(o1, o1.length * 2);
        }
        this.O1[this.L1] = new c(e, 0, this.I2());
        ++this.L1;
    }
    
    private void p2(final d d, final i i) {
        this.G1.i(i, this.G1.u(d), 0, 5);
    }
    
    private void q2(final d d, final i i) {
        this.G1.i(this.G1.u(d), i, 0, 5);
    }
    
    private void r2(final e e) {
        final int m1 = this.M1;
        final c[] n1 = this.N1;
        if (m1 + 1 >= n1.length) {
            this.N1 = Arrays.copyOf(n1, n1.length * 2);
        }
        this.N1[this.M1] = new c(e, 1, this.I2());
        ++this.M1;
    }
    
    public androidx.constraintlayout.core.widgets.analyzer.b.b A2() {
        return this.D1;
    }
    
    public int B2() {
        return this.U1;
    }
    
    public androidx.constraintlayout.core.e C2() {
        return this.G1;
    }
    
    public ArrayList<h> D2() {
        final ArrayList<h> list = new ArrayList<h>();
        for (int size = super.z1.size(), i = 0; i < size; ++i) {
            final e e = super.z1.get(i);
            if (e instanceof h) {
                final h e2 = (h)e;
                if (e2.g2() == 1) {
                    list.add(e2);
                }
            }
        }
        return list;
    }
    
    public boolean E2() {
        return false;
    }
    
    public void F2() {
        this.B1.o();
    }
    
    public void G2() {
        this.B1.p();
    }
    
    public boolean H2() {
        return this.X1;
    }
    
    public boolean I2() {
        return this.E1;
    }
    
    public boolean J2() {
        return this.W1;
    }
    
    public long K2(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int h1, final int i1) {
        this.H1 = h1;
        this.I1 = i1;
        return this.A1.d(this, n, h1, i1, n2, n3, n4, n5, n6, n7);
    }
    
    public boolean M2(final int n) {
        return (this.U1 & n) == n;
    }
    
    @Override
    public void N0() {
        this.G1.Y();
        this.H1 = 0;
        this.J1 = 0;
        this.I1 = 0;
        this.K1 = 0;
        this.V1 = false;
        super.N0();
    }
    
    public void O2(final androidx.constraintlayout.core.widgets.analyzer.b.b d1) {
        this.D1 = d1;
        this.B1.u(d1);
    }
    
    public void P2(final int u1) {
        this.U1 = u1;
        androidx.constraintlayout.core.e.v = this.M2(512);
    }
    
    public void Q2(final int h1, final int i1, final int j1, final int k1) {
        this.H1 = h1;
        this.I1 = i1;
        this.J1 = j1;
        this.K1 = k1;
    }
    
    public void R2(final int c1) {
        this.C1 = c1;
    }
    
    public void S2(final boolean e1) {
        this.E1 = e1;
    }
    
    public boolean T2(final androidx.constraintlayout.core.e e, final boolean[] array) {
        int i = 0;
        array[2] = false;
        final boolean m2 = this.M2(64);
        this.d2(e, m2);
        final int size = super.z1.size();
        boolean b = false;
        while (i < size) {
            final e e2 = super.z1.get(i);
            e2.d2(e, m2);
            if (e2.q0()) {
                b = true;
            }
            ++i;
        }
        return b;
    }
    
    public void U2() {
        this.A1.e(this);
    }
    
    @Override
    public String c0() {
        return "ConstraintLayout";
    }
    
    @Override
    public void c2(final boolean b, final boolean b2) {
        super.c2(b, b2);
        for (int size = super.z1.size(), i = 0; i < size; ++i) {
            super.z1.get(i).c2(b, b2);
        }
    }
    
    @Override
    public void h2() {
        super.h0 = 0;
        super.i0 = 0;
        this.W1 = false;
        this.X1 = false;
        final int size = super.z1.size();
        final int max = Math.max(0, this.j0());
        final int max2 = Math.max(0, this.D());
        final b[] b0 = super.b0;
        final b b2 = b0[1];
        final b b3 = b0[0];
        final androidx.constraintlayout.core.f f1 = this.F1;
        if (f1 != null) {
            ++f1.P;
        }
        if (this.C1 == 0 && androidx.constraintlayout.core.widgets.k.b(this.U1, 1)) {
            androidx.constraintlayout.core.widgets.analyzer.h.j(this, this.A2());
            for (int i = 0; i < size; ++i) {
                final e e = super.z1.get(i);
                if (e.B0() && !(e instanceof h) && !(e instanceof a) && !(e instanceof m) && !e.A0()) {
                    final b z = e.z(0);
                    final b z2 = e.z(1);
                    final b j = androidx.constraintlayout.core.widgets.e.b.I;
                    if (z != j || e.w == 1 || z2 != j || e.x == 1) {
                        L2(0, e, this.D1, new androidx.constraintlayout.core.widgets.analyzer.b.a(), androidx.constraintlayout.core.widgets.analyzer.b.a.k);
                    }
                }
            }
        }
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        Label_0429: {
            if (size > 2) {
                final b h = androidx.constraintlayout.core.widgets.e.b.H;
                if ((b3 == h || b2 == h) && androidx.constraintlayout.core.widgets.k.b(this.U1, 1024) && androidx.constraintlayout.core.widgets.analyzer.i.c(this, this.A2())) {
                    int j2 = max;
                    if (b3 == h) {
                        if (max < this.j0() && max > 0) {
                            this.W1(max);
                            this.W1 = true;
                            j2 = max;
                        }
                        else {
                            j2 = this.j0();
                        }
                    }
                    int d = max2;
                    if (b2 == h) {
                        if (max2 < this.D() && max2 > 0) {
                            this.s1(max2);
                            this.X1 = true;
                            d = max2;
                        }
                        else {
                            d = this.D();
                        }
                    }
                    n = j2;
                    n2 = 1;
                    n3 = d;
                    break Label_0429;
                }
            }
            n2 = 0;
            n3 = max2;
            n = max;
        }
        final boolean b4 = this.M2(64) || this.M2(128);
        final androidx.constraintlayout.core.e g1 = this.G1;
        g1.h = false;
        g1.i = false;
        if (this.U1 != 0 && b4) {
            g1.i = true;
        }
        final ArrayList<e> z3 = (ArrayList<e>)super.z1;
        final b h2 = this.H();
        final b h3 = androidx.constraintlayout.core.widgets.e.b.H;
        final boolean b5 = h2 == h3 || this.g0() == h3;
        this.N2();
        for (int k = 0; k < size; ++k) {
            final e e2 = super.z1.get(k);
            if (e2 instanceof n) {
                ((n)e2).h2();
            }
        }
        final boolean m2 = this.M2(64);
        int n4 = 0;
        int l = 1;
        while (l != 0) {
            final int n5 = n4 + 1;
            int l2 = l;
            try {
                this.G1.Y();
                l2 = l;
                this.N2();
                l2 = l;
                this.o(this.G1);
                for (int index = 0; index < size; ++index) {
                    l2 = l;
                    super.z1.get(index).o(this.G1);
                }
                l2 = l;
                final boolean b6 = (l2 = (this.l2(this.G1) ? 1 : 0)) != 0;
                final WeakReference<d> z4 = this.Z1;
                if (z4 != null) {
                    l2 = (b6 ? 1 : 0);
                    if (z4.get() != null) {
                        l2 = (b6 ? 1 : 0);
                        this.q2(this.Z1.get(), this.G1.u(super.R));
                        l2 = (b6 ? 1 : 0);
                        this.Z1 = null;
                    }
                }
                l2 = (b6 ? 1 : 0);
                final WeakReference<d> b7 = this.b2;
                if (b7 != null) {
                    l2 = (b6 ? 1 : 0);
                    if (b7.get() != null) {
                        l2 = (b6 ? 1 : 0);
                        this.p2(this.b2.get(), this.G1.u(super.T));
                        l2 = (b6 ? 1 : 0);
                        this.b2 = null;
                    }
                }
                l2 = (b6 ? 1 : 0);
                final WeakReference<d> a2 = this.a2;
                if (a2 != null) {
                    l2 = (b6 ? 1 : 0);
                    if (a2.get() != null) {
                        l2 = (b6 ? 1 : 0);
                        this.q2(this.a2.get(), this.G1.u(super.Q));
                        l2 = (b6 ? 1 : 0);
                        this.a2 = null;
                    }
                }
                l2 = (b6 ? 1 : 0);
                final WeakReference<d> c2 = this.c2;
                if (c2 != null) {
                    l2 = (b6 ? 1 : 0);
                    if (c2.get() != null) {
                        l2 = (b6 ? 1 : 0);
                        this.p2(this.c2.get(), this.G1.u(super.S));
                        l2 = (b6 ? 1 : 0);
                        this.c2 = null;
                    }
                }
                if ((l2 = (b6 ? 1 : 0)) != 0) {
                    l2 = (b6 ? 1 : 0);
                    this.G1.T();
                    l2 = (b6 ? 1 : 0);
                }
            }
            catch (Exception obj) {
                obj.printStackTrace();
                final PrintStream out = System.out;
                final StringBuilder sb = new StringBuilder();
                sb.append("EXCEPTION : ");
                sb.append(obj);
                out.println(sb.toString());
            }
            final androidx.constraintlayout.core.e g2 = this.G1;
            int t2;
            if (l2 != 0) {
                t2 = (this.T2(g2, androidx.constraintlayout.core.widgets.k.n) ? 1 : 0);
            }
            else {
                this.d2(g2, m2);
                for (int index2 = 0; index2 < size; ++index2) {
                    super.z1.get(index2).d2(this.G1, m2);
                }
                t2 = 0;
            }
            if (b5 && n5 < 8 && androidx.constraintlayout.core.widgets.k.n[2]) {
                int index3 = 0;
                int max3 = 0;
                int max4 = 0;
                while (index3 < size) {
                    final e e3 = super.z1.get(index3);
                    max4 = Math.max(max4, e3.h0 + e3.j0());
                    max3 = Math.max(max3, e3.i0 + e3.D());
                    ++index3;
                }
                final int max5 = Math.max(super.o0, max4);
                final int max6 = Math.max(super.p0, max3);
                final b h4 = androidx.constraintlayout.core.widgets.e.b.H;
                int n6 = n2;
                int n7 = t2;
                if (b3 == h4) {
                    n6 = n2;
                    n7 = t2;
                    if (this.j0() < max5) {
                        this.W1(max5);
                        super.b0[0] = h4;
                        n6 = 1;
                        n7 = 1;
                    }
                }
                n2 = n6;
                t2 = n7;
                if (b2 == h4) {
                    n2 = n6;
                    t2 = n7;
                    if (this.D() < max6) {
                        this.s1(max6);
                        super.b0[1] = h4;
                        n2 = 1;
                        t2 = 1;
                    }
                }
            }
            final int max7 = Math.max(super.o0, this.j0());
            if (max7 > this.j0()) {
                this.W1(max7);
                super.b0[0] = androidx.constraintlayout.core.widgets.e.b.G;
                n2 = 1;
                t2 = 1;
            }
            final int max8 = Math.max(super.p0, this.D());
            if (max8 > this.D()) {
                this.s1(max8);
                super.b0[1] = androidx.constraintlayout.core.widgets.e.b.G;
                n2 = 1;
                t2 = 1;
            }
            int n8 = n2;
            int n9 = t2;
            int n12 = 0;
            Label_1555: {
                if (n2 == 0) {
                    final b b8 = super.b0[0];
                    final b h5 = androidx.constraintlayout.core.widgets.e.b.H;
                    int n10 = n2;
                    int n11 = t2;
                    if (b8 == h5) {
                        n10 = n2;
                        n11 = t2;
                        if (n > 0) {
                            n10 = n2;
                            n11 = t2;
                            if (this.j0() > n) {
                                this.W1 = true;
                                super.b0[0] = androidx.constraintlayout.core.widgets.e.b.G;
                                this.W1(n);
                                n10 = 1;
                                n11 = 1;
                            }
                        }
                    }
                    n8 = n10;
                    n9 = n11;
                    if (super.b0[1] == h5) {
                        n8 = n10;
                        n9 = n11;
                        if (n3 > 0) {
                            n8 = n10;
                            n9 = n11;
                            if (this.D() > n3) {
                                this.X1 = true;
                                super.b0[1] = androidx.constraintlayout.core.widgets.e.b.G;
                                this.s1(n3);
                                n12 = 1;
                                n2 = 1;
                                break Label_1555;
                            }
                        }
                    }
                }
                n2 = n8;
                n12 = n9;
            }
            if (n5 > 8) {
                l = 0;
            }
            else {
                l = n12;
            }
            n4 = n5;
        }
        super.z1 = z3;
        if (n2 != 0) {
            final b[] b9 = super.b0;
            b9[0] = b3;
            b9[1] = b2;
        }
        this.S0(this.G1.G());
    }
    
    void k2(final e e, final int n) {
        if (n == 0) {
            this.m2(e);
        }
        else if (n == 1) {
            this.r2(e);
        }
    }
    
    public boolean l2(final androidx.constraintlayout.core.e e) {
        final boolean m2 = this.M2(64);
        this.g(e, m2);
        final int size = super.z1.size();
        int i = 0;
        boolean b = false;
        while (i < size) {
            final e e2 = super.z1.get(i);
            e2.A1(0, false);
            e2.A1(1, false);
            if (e2 instanceof a) {
                b = true;
            }
            ++i;
        }
        if (b) {
            for (int j = 0; j < size; ++j) {
                final e e3 = super.z1.get(j);
                if (e3 instanceof a) {
                    ((a)e3).m2();
                }
            }
        }
        this.d2.clear();
        for (int k = 0; k < size; ++k) {
            final e e4 = super.z1.get(k);
            if (e4.f()) {
                if (e4 instanceof m) {
                    this.d2.add(e4);
                }
                else {
                    e4.g(e, m2);
                }
            }
        }
        while (this.d2.size() > 0) {
            final int size2 = this.d2.size();
            for (final m o : this.d2) {
                if (o.i2(this.d2)) {
                    o.g(e, m2);
                    this.d2.remove(o);
                    break;
                }
            }
            if (size2 == this.d2.size()) {
                final Iterator<e> iterator2 = this.d2.iterator();
                while (iterator2.hasNext()) {
                    iterator2.next().g(e, m2);
                }
                this.d2.clear();
            }
        }
        if (androidx.constraintlayout.core.e.v) {
            final HashSet<e> set = new HashSet<e>();
            for (int l = 0; l < size; ++l) {
                final e e5 = super.z1.get(l);
                if (!e5.f()) {
                    set.add(e5);
                }
            }
            int n;
            if (this.H() == androidx.constraintlayout.core.widgets.e.b.H) {
                n = 0;
            }
            else {
                n = 1;
            }
            this.e(this, e, set, n, false);
            for (final e e6 : set) {
                androidx.constraintlayout.core.widgets.k.a(this, e, e6);
                e6.g(e, m2);
            }
        }
        else {
            for (int index = 0; index < size; ++index) {
                final e e7 = super.z1.get(index);
                if (e7 instanceof f) {
                    final b[] b2 = e7.b0;
                    final b b3 = b2[0];
                    final b b4 = b2[1];
                    final b h = androidx.constraintlayout.core.widgets.e.b.H;
                    if (b3 == h) {
                        e7.x1(androidx.constraintlayout.core.widgets.e.b.G);
                    }
                    if (b4 == h) {
                        e7.S1(androidx.constraintlayout.core.widgets.e.b.G);
                    }
                    e7.g(e, m2);
                    if (b3 == h) {
                        e7.x1(b3);
                    }
                    if (b4 == h) {
                        e7.S1(b4);
                    }
                }
                else {
                    androidx.constraintlayout.core.widgets.k.a(this, e, e7);
                    if (!e7.f()) {
                        e7.g(e, m2);
                    }
                }
            }
        }
        if (this.L1 > 0) {
            androidx.constraintlayout.core.widgets.b.b(this, e, null, 0);
        }
        if (this.M1 > 0) {
            androidx.constraintlayout.core.widgets.b.b(this, e, null, 1);
        }
        return true;
    }
    
    public void n2(final d referent) {
        final WeakReference<d> c2 = this.c2;
        if (c2 == null || c2.get() == null || referent.f() > this.c2.get().f()) {
            this.c2 = new WeakReference<d>(referent);
        }
    }
    
    public void o2(final d referent) {
        final WeakReference<d> a2 = this.a2;
        if (a2 == null || a2.get() == null || referent.f() > this.a2.get().f()) {
            this.a2 = new WeakReference<d>(referent);
        }
    }
    
    void s2(final d referent) {
        final WeakReference<d> b2 = this.b2;
        if (b2 == null || b2.get() == null || referent.f() > this.b2.get().f()) {
            this.b2 = new WeakReference<d>(referent);
        }
    }
    
    void t2(final d referent) {
        final WeakReference<d> z1 = this.Z1;
        if (z1 == null || z1.get() == null || referent.f() > this.Z1.get().f()) {
            this.Z1 = new WeakReference<d>(referent);
        }
    }
    
    public void u2() {
        this.B1.f(this.H(), this.g0());
    }
    
    public boolean v2(final boolean b) {
        return this.B1.g(b);
    }
    
    public boolean w2(final boolean b) {
        return this.B1.h(b);
    }
    
    public boolean x2(final boolean b, final int n) {
        return this.B1.i(b, n);
    }
    
    public void y2(final androidx.constraintlayout.core.f f1) {
        this.F1 = f1;
        this.G1.F(f1);
    }
    
    public ArrayList<h> z2() {
        final ArrayList<h> list = new ArrayList<h>();
        for (int size = super.z1.size(), i = 0; i < size; ++i) {
            final e e = super.z1.get(i);
            if (e instanceof h) {
                final h e2 = (h)e;
                if (e2.g2() == 0) {
                    list.add(e2);
                }
            }
        }
        return list;
    }
}
