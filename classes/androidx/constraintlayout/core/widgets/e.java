// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core.widgets;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.HashSet;
import androidx.constraintlayout.core.state.i;
import androidx.constraintlayout.core.widgets.analyzer.n;
import androidx.constraintlayout.core.widgets.analyzer.l;
import androidx.constraintlayout.core.widgets.analyzer.c;
import androidx.constraintlayout.core.widgets.analyzer.p;
import java.util.ArrayList;

public class e
{
    private static final boolean T0 = false;
    protected static final int U0 = 1;
    protected static final int V0 = 2;
    private static final boolean W0 = false;
    public static final int X0 = 0;
    public static final int Y0 = 1;
    public static final int Z0 = 2;
    public static final int a1 = 3;
    public static final int b1 = 4;
    public static final int c1 = -1;
    public static final int d1 = 0;
    public static final int e1 = 1;
    public static final int f1 = 2;
    public static final int g1 = 0;
    public static final int h1 = 4;
    public static final int i1 = 8;
    public static final int j1 = 0;
    public static final int k1 = 1;
    public static final int l1 = 2;
    public static final int m1 = 0;
    public static final int n1 = 1;
    public static final int o1 = 2;
    public static final int p1 = 3;
    private static final int q1 = -2;
    public static final int r1 = 0;
    public static final int s1 = 1;
    public static final int t1 = 2;
    public static final int u1 = 3;
    public static final int v1 = 4;
    static final int w1 = 0;
    static final int x1 = 1;
    public static float y1 = 0.5f;
    public int A;
    int A0;
    public float B;
    boolean B0;
    public int C;
    boolean C0;
    public int D;
    boolean D0;
    public float E;
    boolean E0;
    public boolean F;
    boolean F0;
    public boolean G;
    boolean G0;
    int H;
    boolean H0;
    float I;
    int I0;
    private int[] J;
    int J0;
    private float K;
    boolean K0;
    private boolean L;
    boolean L0;
    private boolean M;
    public float[] M0;
    private boolean N;
    protected e[] N0;
    private int O;
    protected e[] O0;
    private int P;
    e P0;
    public d Q;
    e Q0;
    public d R;
    public int R0;
    public d S;
    public int S0;
    public d T;
    public d U;
    d V;
    d W;
    public d X;
    public d[] Y;
    protected ArrayList<d> Z;
    public boolean a;
    private boolean[] a0;
    public p[] b;
    public b[] b0;
    public c c;
    public e c0;
    public c d;
    int d0;
    public l e;
    int e0;
    public n f;
    public float f0;
    public boolean[] g;
    protected int g0;
    boolean h;
    protected int h0;
    private boolean i;
    protected int i0;
    private boolean j;
    int j0;
    private boolean k;
    int k0;
    private int l;
    protected int l0;
    private int m;
    protected int m0;
    public i n;
    int n0;
    public String o;
    protected int o0;
    private boolean p;
    protected int p0;
    private boolean q;
    float q0;
    private boolean r;
    float r0;
    private boolean s;
    private Object s0;
    public int t;
    private int t0;
    public int u;
    private int u0;
    private int v;
    private String v0;
    public int w;
    private String w0;
    public int x;
    int x0;
    public int[] y;
    int y0;
    public int z;
    int z0;
    
    public e() {
        this.a = false;
        this.b = new p[2];
        this.e = null;
        this.f = null;
        this.g = new boolean[] { true, true };
        this.h = false;
        this.i = true;
        this.j = false;
        this.k = true;
        this.l = -1;
        this.m = -1;
        this.n = new i(this);
        this.p = false;
        this.q = false;
        this.r = false;
        this.s = false;
        this.t = -1;
        this.u = -1;
        this.v = 0;
        this.w = 0;
        this.x = 0;
        this.y = new int[2];
        this.z = 0;
        this.A = 0;
        this.B = 1.0f;
        this.C = 0;
        this.D = 0;
        this.E = 1.0f;
        this.H = -1;
        this.I = 1.0f;
        this.J = new int[] { Integer.MAX_VALUE, Integer.MAX_VALUE };
        this.K = 0.0f;
        this.L = false;
        this.N = false;
        this.O = 0;
        this.P = 0;
        this.Q = new d(this, androidx.constraintlayout.core.widgets.d.b.H);
        this.R = new d(this, androidx.constraintlayout.core.widgets.d.b.I);
        this.S = new d(this, androidx.constraintlayout.core.widgets.d.b.J);
        this.T = new d(this, androidx.constraintlayout.core.widgets.d.b.K);
        this.U = new d(this, androidx.constraintlayout.core.widgets.d.b.L);
        this.V = new d(this, androidx.constraintlayout.core.widgets.d.b.N);
        this.W = new d(this, androidx.constraintlayout.core.widgets.d.b.O);
        final d x = new d(this, androidx.constraintlayout.core.widgets.d.b.M);
        this.X = x;
        this.Y = new d[] { this.Q, this.S, this.R, this.T, this.U, x };
        this.Z = new ArrayList<d>();
        this.a0 = new boolean[2];
        final b g = androidx.constraintlayout.core.widgets.e.b.G;
        this.b0 = new b[] { g, g };
        this.c0 = null;
        this.d0 = 0;
        this.e0 = 0;
        this.f0 = 0.0f;
        this.g0 = -1;
        this.h0 = 0;
        this.i0 = 0;
        this.j0 = 0;
        this.k0 = 0;
        this.l0 = 0;
        this.m0 = 0;
        this.n0 = 0;
        final float y1 = androidx.constraintlayout.core.widgets.e.y1;
        this.q0 = y1;
        this.r0 = y1;
        this.t0 = 0;
        this.u0 = 0;
        this.v0 = null;
        this.w0 = null;
        this.H0 = false;
        this.I0 = 0;
        this.J0 = 0;
        this.M0 = new float[] { -1.0f, -1.0f };
        this.N0 = new e[] { null, null };
        this.O0 = new e[] { null, null };
        this.P0 = null;
        this.Q0 = null;
        this.R0 = -1;
        this.S0 = -1;
        this.d();
    }
    
    public e(final int n, final int n2) {
        this(0, 0, n, n2);
    }
    
    public e(final int h0, final int i0, final int d0, final int e0) {
        this.a = false;
        this.b = new p[2];
        this.e = null;
        this.f = null;
        this.g = new boolean[] { true, true };
        this.h = false;
        this.i = true;
        this.j = false;
        this.k = true;
        this.l = -1;
        this.m = -1;
        this.n = new i(this);
        this.p = false;
        this.q = false;
        this.r = false;
        this.s = false;
        this.t = -1;
        this.u = -1;
        this.v = 0;
        this.w = 0;
        this.x = 0;
        this.y = new int[2];
        this.z = 0;
        this.A = 0;
        this.B = 1.0f;
        this.C = 0;
        this.D = 0;
        this.E = 1.0f;
        this.H = -1;
        this.I = 1.0f;
        this.J = new int[] { Integer.MAX_VALUE, Integer.MAX_VALUE };
        this.K = 0.0f;
        this.L = false;
        this.N = false;
        this.O = 0;
        this.P = 0;
        this.Q = new d(this, androidx.constraintlayout.core.widgets.d.b.H);
        this.R = new d(this, androidx.constraintlayout.core.widgets.d.b.I);
        this.S = new d(this, androidx.constraintlayout.core.widgets.d.b.J);
        this.T = new d(this, androidx.constraintlayout.core.widgets.d.b.K);
        this.U = new d(this, androidx.constraintlayout.core.widgets.d.b.L);
        this.V = new d(this, androidx.constraintlayout.core.widgets.d.b.N);
        this.W = new d(this, androidx.constraintlayout.core.widgets.d.b.O);
        final d x = new d(this, androidx.constraintlayout.core.widgets.d.b.M);
        this.X = x;
        this.Y = new d[] { this.Q, this.S, this.R, this.T, this.U, x };
        this.Z = new ArrayList<d>();
        this.a0 = new boolean[2];
        final b g = androidx.constraintlayout.core.widgets.e.b.G;
        this.b0 = new b[] { g, g };
        this.c0 = null;
        this.d0 = 0;
        this.e0 = 0;
        this.f0 = 0.0f;
        this.g0 = -1;
        this.h0 = 0;
        this.i0 = 0;
        this.j0 = 0;
        this.k0 = 0;
        this.l0 = 0;
        this.m0 = 0;
        this.n0 = 0;
        final float y1 = androidx.constraintlayout.core.widgets.e.y1;
        this.q0 = y1;
        this.r0 = y1;
        this.t0 = 0;
        this.u0 = 0;
        this.v0 = null;
        this.w0 = null;
        this.H0 = false;
        this.I0 = 0;
        this.J0 = 0;
        this.M0 = new float[] { -1.0f, -1.0f };
        this.N0 = new e[] { null, null };
        this.O0 = new e[] { null, null };
        this.P0 = null;
        this.Q0 = null;
        this.R0 = -1;
        this.S0 = -1;
        this.h0 = h0;
        this.i0 = i0;
        this.d0 = d0;
        this.e0 = e0;
        this.d();
    }
    
    public e(final String s) {
        this.a = false;
        this.b = new p[2];
        this.e = null;
        this.f = null;
        this.g = new boolean[] { true, true };
        this.h = false;
        this.i = true;
        this.j = false;
        this.k = true;
        this.l = -1;
        this.m = -1;
        this.n = new i(this);
        this.p = false;
        this.q = false;
        this.r = false;
        this.s = false;
        this.t = -1;
        this.u = -1;
        this.v = 0;
        this.w = 0;
        this.x = 0;
        this.y = new int[2];
        this.z = 0;
        this.A = 0;
        this.B = 1.0f;
        this.C = 0;
        this.D = 0;
        this.E = 1.0f;
        this.H = -1;
        this.I = 1.0f;
        this.J = new int[] { Integer.MAX_VALUE, Integer.MAX_VALUE };
        this.K = 0.0f;
        this.L = false;
        this.N = false;
        this.O = 0;
        this.P = 0;
        this.Q = new d(this, androidx.constraintlayout.core.widgets.d.b.H);
        this.R = new d(this, androidx.constraintlayout.core.widgets.d.b.I);
        this.S = new d(this, androidx.constraintlayout.core.widgets.d.b.J);
        this.T = new d(this, androidx.constraintlayout.core.widgets.d.b.K);
        this.U = new d(this, androidx.constraintlayout.core.widgets.d.b.L);
        this.V = new d(this, androidx.constraintlayout.core.widgets.d.b.N);
        this.W = new d(this, androidx.constraintlayout.core.widgets.d.b.O);
        final d x = new d(this, androidx.constraintlayout.core.widgets.d.b.M);
        this.X = x;
        this.Y = new d[] { this.Q, this.S, this.R, this.T, this.U, x };
        this.Z = new ArrayList<d>();
        this.a0 = new boolean[2];
        final b g = androidx.constraintlayout.core.widgets.e.b.G;
        this.b0 = new b[] { g, g };
        this.c0 = null;
        this.d0 = 0;
        this.e0 = 0;
        this.f0 = 0.0f;
        this.g0 = -1;
        this.h0 = 0;
        this.i0 = 0;
        this.j0 = 0;
        this.k0 = 0;
        this.l0 = 0;
        this.m0 = 0;
        this.n0 = 0;
        final float y1 = androidx.constraintlayout.core.widgets.e.y1;
        this.q0 = y1;
        this.r0 = y1;
        this.t0 = 0;
        this.u0 = 0;
        this.v0 = null;
        this.w0 = null;
        this.H0 = false;
        this.I0 = 0;
        this.J0 = 0;
        this.M0 = new float[] { -1.0f, -1.0f };
        this.N0 = new e[] { null, null };
        this.O0 = new e[] { null, null };
        this.P0 = null;
        this.Q0 = null;
        this.R0 = -1;
        this.S0 = -1;
        this.d();
        this.d1(s);
    }
    
    public e(final String s, final int n, final int n2) {
        this(n, n2);
        this.d1(s);
    }
    
    public e(final String s, final int n, final int n2, final int n3, final int n4) {
        this(n, n2, n3, n4);
        this.d1(s);
    }
    
    private void V0(final StringBuilder sb, final String str, final d d) {
        if (d.f == null) {
            return;
        }
        sb.append(str);
        sb.append(" : [ '");
        sb.append(d.f);
        sb.append("',");
        sb.append(d.g);
        sb.append(",");
        sb.append(d.h);
        sb.append(",");
        sb.append(" ] ,\n");
    }
    
    private void W0(final StringBuilder sb, final String str, final float n, final float f) {
        if (n == f) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f);
        sb.append(",\n");
    }
    
    private void X0(final StringBuilder sb, final d d, final float f) {
        if (d.f == null) {
            return;
        }
        sb.append("circle : [ '");
        sb.append(d.f);
        sb.append("',");
        sb.append(d.g);
        sb.append(",");
        sb.append(f);
        sb.append(",");
        sb.append(" ] ,\n");
    }
    
    private void Y0(final StringBuilder sb, final String str, final float f, final int i) {
        if (f == 0.0f) {
            return;
        }
        sb.append(str);
        sb.append(" :  [");
        sb.append(f);
        sb.append(",");
        sb.append(i);
        sb.append("");
        sb.append("],\n");
    }
    
    private void Z0(final StringBuilder sb, final String str, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, float n7, final float n8) {
        sb.append(str);
        sb.append(" :  {\n");
        this.W0(sb, "size", (float)n, -2.14748365E9f);
        this.W0(sb, "min", (float)n2, 0.0f);
        this.W0(sb, "max", (float)n3, 2.14748365E9f);
        this.W0(sb, "matchMin", (float)n5, 0.0f);
        n7 = (float)n6;
        this.W0(sb, "matchDef", n7, 0.0f);
        this.W0(sb, "matchPercent", n7, 1.0f);
        sb.append("},\n");
    }
    
    private void d() {
        this.Z.add(this.Q);
        this.Z.add(this.R);
        this.Z.add(this.S);
        this.Z.add(this.T);
        this.Z.add(this.V);
        this.Z.add(this.W);
        this.Z.add(this.X);
        this.Z.add(this.U);
    }
    
    private void i(final androidx.constraintlayout.core.e e, final boolean b, boolean b2, final boolean b3, boolean b4, androidx.constraintlayout.core.i i, final androidx.constraintlayout.core.i j, final b b5, final boolean b6, final d d, final d d2, int n, int b7, final int n2, int n3, final float n4, final boolean b8, final boolean b9, final boolean b10, final boolean b11, final boolean b12, int n5, int n6, int n7, int a, final float n8, final boolean b13) {
        final androidx.constraintlayout.core.i u = e.u(d);
        final androidx.constraintlayout.core.i u2 = e.u(d2);
        final androidx.constraintlayout.core.i u3 = e.u(d.k());
        final androidx.constraintlayout.core.i u4 = e.u(d2.k());
        if (e.L() != null) {
            final androidx.constraintlayout.core.f l = e.L();
            ++l.H;
        }
        final int p27 = d.p() ? 1 : 0;
        final boolean p28 = d2.p();
        final boolean p29 = this.X.p();
        int n9;
        if (p28) {
            n9 = p27 + 1;
        }
        else {
            n9 = p27;
        }
        int n10 = n9;
        if (p29) {
            n10 = n9 + 1;
        }
        if (b8) {
            n5 = 3;
        }
        final int n11 = e$a.b[b5.ordinal()];
        int n12;
        if (n11 != 1 && n11 != 2 && n11 != 3 && n11 == 4 && n5 != 4) {
            n12 = 1;
        }
        else {
            n12 = 0;
        }
        final int n13 = n5;
        n5 = this.l;
        if (n5 != -1 && b) {
            this.l = -1;
            n12 = 0;
        }
        else {
            n5 = b7;
        }
        final int m = this.m;
        int n14 = n5;
        b7 = n12;
        if (m != -1) {
            n14 = n5;
            b7 = n12;
            if (!b) {
                this.m = -1;
                n14 = m;
                b7 = 0;
            }
        }
        n5 = n14;
        if (this.u0 == 8) {
            n5 = 0;
            b7 = 0;
        }
        if (b13) {
            if (p27 == 0 && !p28 && !p29) {
                e.f(u, n);
            }
            else if (p27 != 0 && !p28) {
                e.e(u, u3, d.g(), 8);
            }
        }
        Label_0856: {
            if (b7 == 0) {
                if (b6) {
                    e.e(u2, u, 0, 3);
                    if (n2 > 0) {
                        e.i(u2, u, n2, 8);
                    }
                    if (n3 < Integer.MAX_VALUE) {
                        e.k(u2, u, n3, 8);
                    }
                }
                else {
                    e.e(u2, u, n5, 8);
                }
                n = b7;
            }
            else if (n10 != 2 && !b8 && (n13 == 1 || n13 == 0)) {
                b7 = (n = Math.max(n7, n5));
                if (a > 0) {
                    n = Math.min(a, b7);
                }
                e.e(u2, u, n, 8);
                n = 0;
            }
            else {
                if (n7 == -2) {
                    n = n5;
                }
                else {
                    n = n7;
                }
                if (a == -2) {
                    n3 = n5;
                }
                else {
                    n3 = a;
                }
                n7 = n5;
                if (n5 > 0) {
                    n7 = n5;
                    if (n13 != 1) {
                        n7 = 0;
                    }
                }
                n5 = n7;
                if (n > 0) {
                    e.i(u2, u, n, 8);
                    n5 = Math.max(n7, n);
                }
                if (n3 > 0) {
                    if (b2 && n13 == 1) {
                        n7 = 0;
                    }
                    else {
                        n7 = 1;
                    }
                    if (n7 != 0) {
                        e.k(u2, u, n3, 8);
                    }
                    n5 = Math.min(n5, n3);
                }
                if (n13 == 1) {
                    if (b2) {
                        e.e(u2, u, n5, 8);
                    }
                    else {
                        e.e(u2, u, n5, 5);
                        e.k(u2, u, n5, 8);
                    }
                    n7 = n;
                    a = b7;
                    break Label_0856;
                }
                if (n13 == 2) {
                    final d.b k = d.l();
                    final d.b i2 = d.b.I;
                    androidx.constraintlayout.core.i i3;
                    e e2;
                    d.b b14;
                    if (k != i2 && d.l() != d.b.K) {
                        i3 = e.u(this.c0.r(d.b.H));
                        e2 = this.c0;
                        b14 = d.b.J;
                    }
                    else {
                        i3 = e.u(this.c0.r(i2));
                        e2 = this.c0;
                        b14 = d.b.K;
                    }
                    e.d(e.v().n(u2, u, e.u(e2.r(b14)), i3, n8));
                    if (b2) {
                        b7 = 0;
                    }
                    n7 = n;
                    a = b7;
                    break Label_0856;
                }
                b4 = true;
                a = b7;
                n7 = n;
                break Label_0856;
            }
            n3 = a;
            a = n;
        }
        final androidx.constraintlayout.core.i i4 = u2;
        final androidx.constraintlayout.core.i i5 = u4;
        if (b13 && !b10) {
            Label_2241: {
                Label_2238: {
                    Label_2234: {
                        if (p27 != 0 || p28 || p29) {
                            if (p27 != 0 && !p28) {
                                final e d3 = d.f.d;
                                if (b2 && d3 instanceof a) {
                                    n = 8;
                                }
                                else {
                                    n = 5;
                                }
                                i = i4;
                                break Label_2241;
                            }
                            if (p27 == 0 && p28) {
                                e.e(i4, i5, -d2.g(), 8);
                                if (b2) {
                                    if (this.j && u.M) {
                                        final e c0 = this.c0;
                                        if (c0 != null) {
                                            final f f = (f)c0;
                                            if (b) {
                                                f.o2(d);
                                                break Label_2234;
                                            }
                                            f.t2(d);
                                            break Label_2234;
                                        }
                                    }
                                    e.i(u, i, 0, 5);
                                }
                            }
                            else if (p27 != 0 && p28) {
                                final e d4 = d.f.d;
                                final e d5 = d2.f.d;
                                final e u5 = this.U();
                                int n15 = 0;
                                Label_1628: {
                                    Label_1621: {
                                        Label_1615: {
                                            Label_1612: {
                                                Label_1276: {
                                                    if (a != 0) {
                                                        Label_1217: {
                                                            if (n13 == 0) {
                                                                if (n3 == 0 && n7 == 0) {
                                                                    if (u3.M && i5.M) {
                                                                        e.e(u, u3, d.g(), 8);
                                                                        e.e(i4, i5, -d2.g(), 8);
                                                                        return;
                                                                    }
                                                                    n = 8;
                                                                    n6 = 8;
                                                                    b7 = 0;
                                                                    n3 = 1;
                                                                    n5 = 0;
                                                                }
                                                                else {
                                                                    n = 5;
                                                                    n6 = 5;
                                                                    b7 = 1;
                                                                    n3 = 0;
                                                                    n5 = 1;
                                                                }
                                                                if (d4 instanceof a || d5 instanceof a) {
                                                                    n6 = n3;
                                                                    n3 = 6;
                                                                    n15 = b7;
                                                                    b7 = 4;
                                                                    break Label_1628;
                                                                }
                                                                n15 = b7;
                                                                b7 = n6;
                                                                n6 = n3;
                                                            }
                                                            else if (n13 == 2) {
                                                                if (d4 instanceof a) {
                                                                    break Label_1276;
                                                                }
                                                                if (d5 instanceof a) {
                                                                    break Label_1276;
                                                                }
                                                                n = 5;
                                                                b7 = 5;
                                                                break Label_1615;
                                                            }
                                                            else {
                                                                if (n13 == 1) {
                                                                    n = 8;
                                                                    break Label_1612;
                                                                }
                                                                if (n13 == 3) {
                                                                    Label_1346: {
                                                                        if (this.H == -1) {
                                                                            if (b11) {
                                                                                if (b2) {
                                                                                    n = 5;
                                                                                }
                                                                                else {
                                                                                    n = 4;
                                                                                }
                                                                            }
                                                                            else {
                                                                                n = 8;
                                                                            }
                                                                            n5 = 8;
                                                                            n3 = n;
                                                                        }
                                                                        else {
                                                                            if (b8) {
                                                                                if (n6 != 2 && n6 != 1) {
                                                                                    n = 0;
                                                                                }
                                                                                else {
                                                                                    n = 1;
                                                                                }
                                                                                if (n == 0) {
                                                                                    n = 8;
                                                                                    b7 = 5;
                                                                                }
                                                                                else {
                                                                                    n = 5;
                                                                                    b7 = 4;
                                                                                }
                                                                                n15 = 1;
                                                                                n5 = 1;
                                                                                n6 = 1;
                                                                                break Label_1217;
                                                                            }
                                                                            if (n3 <= 0) {
                                                                                if (n3 == 0 && n7 == 0) {
                                                                                    if (!b11) {
                                                                                        n3 = 6;
                                                                                        n = 5;
                                                                                        b7 = 8;
                                                                                        break Label_1346;
                                                                                    }
                                                                                    if (d4 != u5 && d5 != u5) {
                                                                                        n = 4;
                                                                                    }
                                                                                    else {
                                                                                        n = 5;
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    n = 5;
                                                                                }
                                                                                n3 = 6;
                                                                                b7 = 4;
                                                                                break Label_1346;
                                                                            }
                                                                            n3 = 6;
                                                                            n5 = 5;
                                                                        }
                                                                        b7 = 5;
                                                                        n = n5;
                                                                    }
                                                                    n15 = 1;
                                                                    n5 = 1;
                                                                    n6 = 1;
                                                                    break Label_1628;
                                                                }
                                                                n = 5;
                                                                b7 = 4;
                                                                n15 = 0;
                                                                n5 = 0;
                                                                break Label_1621;
                                                            }
                                                        }
                                                        n3 = 6;
                                                        break Label_1628;
                                                    }
                                                    if (u3.M && i5.M) {
                                                        e.c(u, u3, d.g(), n4, i5, i4, d2.g(), 8);
                                                        if (b2 && b4) {
                                                            if (d2.f != null) {
                                                                n = d2.g();
                                                            }
                                                            else {
                                                                n = 0;
                                                            }
                                                            if (i5 != j) {
                                                                e.i(j, i4, n, 5);
                                                            }
                                                        }
                                                        return;
                                                    }
                                                }
                                                n = 5;
                                            }
                                            b7 = 4;
                                        }
                                        n15 = 1;
                                        n5 = 1;
                                    }
                                    n3 = 6;
                                    n6 = 0;
                                }
                                int n16;
                                if (n5 != 0 && u3 == i5 && d4 != u5) {
                                    n5 = 0;
                                    n16 = 0;
                                }
                                else {
                                    n16 = 1;
                                }
                                if (n15 != 0) {
                                    int n17;
                                    if (a == 0 && !b9 && !b11 && u3 == i && i5 == j) {
                                        b2 = false;
                                        n3 = 8;
                                        n17 = 8;
                                        n = 0;
                                    }
                                    else {
                                        final int n18 = n16;
                                        final int n19 = n;
                                        n = n18;
                                        n17 = n3;
                                        n3 = n19;
                                    }
                                    e.c(u, u3, d.g(), n4, i5, i4, d2.g(), n17);
                                    n16 = n;
                                    n = n3;
                                }
                                if (this.u0 == 8 && !d2.n()) {
                                    return;
                                }
                                if (n5 != 0) {
                                    n3 = n;
                                    Label_1841: {
                                        if (b2) {
                                            n3 = n;
                                            if (u3 != i5) {
                                                n3 = n;
                                                if (a == 0) {
                                                    if (!(d4 instanceof a)) {
                                                        n3 = n;
                                                        if (!(d5 instanceof a)) {
                                                            break Label_1841;
                                                        }
                                                    }
                                                    n3 = 6;
                                                }
                                            }
                                        }
                                    }
                                    e.i(u, u3, d.g(), n3);
                                    e.k(i4, i5, -d2.g(), n3);
                                }
                                else {
                                    n3 = n;
                                }
                                if (b2 && b12 && !(d4 instanceof a) && !(d5 instanceof a) && d5 != u5) {
                                    n3 = 6;
                                    n = 6;
                                    n16 = 1;
                                }
                                else {
                                    n = b7;
                                }
                                if (n16 != 0) {
                                    b7 = n;
                                    Label_2040: {
                                        if (n6 != 0) {
                                            if (b11) {
                                                b7 = n;
                                                if (!b3) {
                                                    break Label_2040;
                                                }
                                            }
                                            if (d4 != u5 && d5 != u5) {
                                                b7 = n;
                                            }
                                            else {
                                                b7 = 6;
                                            }
                                            if (d4 instanceof h || d5 instanceof h) {
                                                b7 = 5;
                                            }
                                            if (d4 instanceof a || d5 instanceof a) {
                                                b7 = 5;
                                            }
                                            if (b11) {
                                                b7 = 5;
                                            }
                                            b7 = Math.max(b7, n);
                                        }
                                    }
                                    n = b7;
                                    if (b2) {
                                        n = Math.min(n3, b7);
                                        if (b8 && !b11 && (d4 == u5 || d5 == u5)) {
                                            n = 4;
                                        }
                                    }
                                    e.e(u, u3, d.g(), n);
                                    e.e(i4, i5, -d2.g(), n);
                                }
                                if (b2) {
                                    if (i == u3) {
                                        n = d.g();
                                    }
                                    else {
                                        n = 0;
                                    }
                                    if (u3 != i) {
                                        e.i(u, i, n, 5);
                                    }
                                }
                                if (!b2 || a == 0 || n2 != 0 || n7 != 0) {
                                    i = i4;
                                    break Label_2238;
                                }
                                if (a != 0 && n13 == 3) {
                                    e.i(i4, u, 0, 8);
                                    i = i4;
                                    break Label_2238;
                                }
                                e.i(i4, u, 0, 5);
                                i = i4;
                                break Label_2238;
                            }
                        }
                    }
                    i = i4;
                }
                n = 5;
            }
            if (b2 && b4) {
                if (d2.f != null) {
                    b7 = d2.g();
                }
                else {
                    b7 = 0;
                }
                if (i5 != j) {
                    if (this.j && i.M) {
                        final e c2 = this.c0;
                        if (c2 != null) {
                            final f f2 = (f)c2;
                            if (b) {
                                f2.n2(d2);
                            }
                            else {
                                f2.s2(d2);
                            }
                            return;
                        }
                    }
                    e.i(j, i, b7, n);
                }
            }
            return;
        }
        if (n10 < 2 && b2 && b4) {
            e.i(u, i, 0, 8);
            if (!b && this.U.f != null) {
                n = 0;
            }
            else {
                n = 1;
            }
            Label_2476: {
                if (!b) {
                    final d f3 = this.U.f;
                    if (f3 != null) {
                        final e d6 = f3.d;
                        if (d6.f0 != 0.0f) {
                            final b[] b15 = d6.b0;
                            final b b16 = b15[0];
                            final b i6 = b.I;
                            if (b16 == i6 && b15[1] == i6) {
                                n = 1;
                                break Label_2476;
                            }
                        }
                        n = 0;
                    }
                }
            }
            if (n != 0) {
                e.i(j, i4, 0, 8);
            }
        }
    }
    
    private boolean t0(int n) {
        n *= 2;
        final d[] y = this.Y;
        final d f = y[n].f;
        boolean b = true;
        if (f != null && y[n].f.f != y[n]) {
            ++n;
            if (y[n].f != null && y[n].f.f == y[n]) {
                return b;
            }
        }
        b = false;
        return b;
    }
    
    public float A() {
        return this.f0;
    }
    
    public boolean A0() {
        return this.N;
    }
    
    protected void A1(final int n, final boolean b) {
        this.a0[n] = b;
    }
    
    public int B() {
        return this.g0;
    }
    
    public boolean B0() {
        return this.i && this.u0 != 8;
    }
    
    public void B1(final boolean m) {
        this.M = m;
    }
    
    public boolean C() {
        return this.L;
    }
    
    public boolean C0() {
        return this.p || (this.Q.o() && this.S.o());
    }
    
    public void C1(final boolean n) {
        this.N = n;
    }
    
    public int D() {
        if (this.u0 == 8) {
            return 0;
        }
        return this.e0;
    }
    
    public boolean D0() {
        return this.q || (this.R.o() && this.T.o());
    }
    
    public void D1(final int o, final int p2) {
        this.O = o;
        this.P = p2;
        this.H1(false);
    }
    
    public float E() {
        return this.q0;
    }
    
    public boolean E0() {
        return this.c0 == null;
    }
    
    public void E1(final int n, final int n2) {
        if (n2 == 0) {
            this.W1(n);
        }
        else if (n2 == 1) {
            this.s1(n);
        }
    }
    
    public e F() {
        final boolean x0 = this.x0();
        e e = null;
        if (x0) {
            e = this;
            e e2 = null;
            while (e2 == null && e != null) {
                final d r = e.r(androidx.constraintlayout.core.widgets.d.b.H);
                d k;
                if (r == null) {
                    k = null;
                }
                else {
                    k = r.k();
                }
                e i;
                if (k == null) {
                    i = null;
                }
                else {
                    i = k.i();
                }
                if (i == this.U()) {
                    return e;
                }
                d j;
                if (i == null) {
                    j = null;
                }
                else {
                    j = i.r(androidx.constraintlayout.core.widgets.d.b.J).k();
                }
                if (j != null && j.i() != e) {
                    e2 = e;
                }
                else {
                    e = i;
                }
            }
            e = e2;
        }
        return e;
    }
    
    public boolean F0() {
        final int x = this.x;
        boolean b = true;
        if (x != 0 || this.f0 != 0.0f || this.C != 0 || this.D != 0 || this.b0[1] != androidx.constraintlayout.core.widgets.e.b.I) {
            b = false;
        }
        return b;
    }
    
    public void F1(final int n) {
        this.J[1] = n;
    }
    
    public int G() {
        return this.I0;
    }
    
    public boolean G0() {
        final int w = this.w;
        boolean b2;
        final boolean b = b2 = false;
        if (w == 0) {
            b2 = b;
            if (this.f0 == 0.0f) {
                b2 = b;
                if (this.z == 0) {
                    b2 = b;
                    if (this.A == 0) {
                        b2 = b;
                        if (this.b0[0] == androidx.constraintlayout.core.widgets.e.b.I) {
                            b2 = true;
                        }
                    }
                }
            }
        }
        return b2;
    }
    
    public void G1(final int n) {
        this.J[0] = n;
    }
    
    public b H() {
        return this.b0[0];
    }
    
    public boolean H0() {
        return this.s;
    }
    
    public void H1(final boolean i) {
        this.i = i;
    }
    
    public int I() {
        final d q = this.Q;
        int n = 0;
        if (q != null) {
            n = 0 + q.g;
        }
        final d s = this.S;
        int n2 = n;
        if (s != null) {
            n2 = n + s.g;
        }
        return n2;
    }
    
    public boolean I0() {
        return this.F;
    }
    
    public void I1(final int n) {
        int p = n;
        if (n < 0) {
            p = 0;
        }
        this.p0 = p;
    }
    
    public int J() {
        return this.O;
    }
    
    public void J0() {
        this.r = true;
    }
    
    public void J1(final int n) {
        int o0 = n;
        if (n < 0) {
            o0 = 0;
        }
        this.o0 = o0;
    }
    
    public int K() {
        return this.P;
    }
    
    public void K0() {
        this.s = true;
    }
    
    public void K1(final int l0, final int m0) {
        this.l0 = l0;
        this.m0 = m0;
    }
    
    public int L() {
        return this.l0();
    }
    
    public boolean L0(final int n) {
        boolean b = true;
        int n2;
        if (n == 0) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        final b[] b2 = this.b0;
        final b b3 = b2[n];
        final b b4 = b2[n2];
        final b i = androidx.constraintlayout.core.widgets.e.b.I;
        if (b3 != i || b4 != i) {
            b = false;
        }
        return b;
    }
    
    public void L1(final int h0, final int i0) {
        this.h0 = h0;
        this.i0 = i0;
    }
    
    public int M(final int n) {
        if (n == 0) {
            return this.j0();
        }
        if (n == 1) {
            return this.D();
        }
        return 0;
    }
    
    public boolean M0() {
        final b[] b0 = this.b0;
        final boolean b2 = false;
        final b b3 = b0[0];
        final b i = androidx.constraintlayout.core.widgets.e.b.I;
        boolean b4 = b2;
        if (b3 == i) {
            b4 = b2;
            if (b0[1] == i) {
                b4 = true;
            }
        }
        return b4;
    }
    
    public void M1(final e c0) {
        this.c0 = c0;
    }
    
    public int N() {
        return this.J[1];
    }
    
    public void N0() {
        this.Q.x();
        this.R.x();
        this.S.x();
        this.T.x();
        this.U.x();
        this.V.x();
        this.W.x();
        this.X.x();
        this.c0 = null;
        this.K = 0.0f;
        this.d0 = 0;
        this.e0 = 0;
        this.f0 = 0.0f;
        this.g0 = -1;
        this.h0 = 0;
        this.i0 = 0;
        this.l0 = 0;
        this.m0 = 0;
        this.n0 = 0;
        this.o0 = 0;
        this.p0 = 0;
        final float y1 = androidx.constraintlayout.core.widgets.e.y1;
        this.q0 = y1;
        this.r0 = y1;
        final b[] b0 = this.b0;
        b0[1] = (b0[0] = androidx.constraintlayout.core.widgets.e.b.G);
        this.s0 = null;
        this.t0 = 0;
        this.u0 = 0;
        this.w0 = null;
        this.F0 = false;
        this.G0 = false;
        this.I0 = 0;
        this.J0 = 0;
        this.K0 = false;
        this.L0 = false;
        final float[] m0 = this.M0;
        m0[1] = (m0[0] = -1.0f);
        this.t = -1;
        this.u = -1;
        final int[] j = this.J;
        j[1] = (j[0] = Integer.MAX_VALUE);
        this.w = 0;
        this.x = 0;
        this.B = 1.0f;
        this.E = 1.0f;
        this.A = Integer.MAX_VALUE;
        this.D = Integer.MAX_VALUE;
        this.z = 0;
        this.C = 0;
        this.h = false;
        this.H = -1;
        this.I = 1.0f;
        this.H0 = false;
        final boolean[] g = this.g;
        g[1] = (g[0] = true);
        this.N = false;
        final boolean[] a0 = this.a0;
        a0[1] = (a0[0] = false);
        this.i = true;
        final int[] y2 = this.y;
        y2[1] = (y2[0] = 0);
        this.l = -1;
        this.m = -1;
    }
    
    void N1(final int n, final int n2) {
        if (n2 == 0) {
            this.j0 = n;
        }
        else if (n2 == 1) {
            this.k0 = n;
        }
    }
    
    public int O() {
        return this.J[0];
    }
    
    public void O0() {
        this.Q0();
        this.P1(androidx.constraintlayout.core.widgets.e.y1);
        this.u1(androidx.constraintlayout.core.widgets.e.y1);
    }
    
    public void O1(final String w0) {
        this.w0 = w0;
    }
    
    public int P() {
        return this.p0;
    }
    
    public void P0(final d d) {
        if (this.U() != null && this.U() instanceof f && ((f)this.U()).E2()) {
            return;
        }
        final d r = this.r(androidx.constraintlayout.core.widgets.d.b.H);
        final d r2 = this.r(androidx.constraintlayout.core.widgets.d.b.J);
        final d r3 = this.r(androidx.constraintlayout.core.widgets.d.b.I);
        final d r4 = this.r(androidx.constraintlayout.core.widgets.d.b.K);
        final d r5 = this.r(androidx.constraintlayout.core.widgets.d.b.M);
        final d r6 = this.r(androidx.constraintlayout.core.widgets.d.b.N);
        final d r7 = this.r(androidx.constraintlayout.core.widgets.d.b.O);
        Label_0365: {
            if (d == r5) {
                if (r.p() && r2.p() && r.k() == r2.k()) {
                    r.x();
                    r2.x();
                }
                if (r3.p() && r4.p() && r3.k() == r4.k()) {
                    r3.x();
                    r4.x();
                }
                this.q0 = 0.5f;
            }
            else {
                if (d == r6) {
                    if (r.p() && r2.p() && r.k().i() == r2.k().i()) {
                        r.x();
                        r2.x();
                    }
                    this.q0 = 0.5f;
                    break Label_0365;
                }
                if (d != r7) {
                    if (d != r && d != r2) {
                        if ((d != r3 && d != r4) || !r3.p() || r3.k() != r4.k()) {
                            break Label_0365;
                        }
                    }
                    else if (!r.p() || r.k() != r2.k()) {
                        break Label_0365;
                    }
                    r5.x();
                    break Label_0365;
                }
                if (r3.p() && r4.p() && r3.k().i() == r4.k().i()) {
                    r3.x();
                    r4.x();
                }
            }
            this.r0 = 0.5f;
        }
        d.x();
    }
    
    public void P1(final float r0) {
        this.r0 = r0;
    }
    
    public int Q() {
        return this.o0;
    }
    
    public void Q0() {
        final e u = this.U();
        if (u != null && u instanceof f && ((f)this.U()).E2()) {
            return;
        }
        for (int i = 0; i < this.Z.size(); ++i) {
            this.Z.get(i).x();
        }
    }
    
    public void Q1(final int j0) {
        this.J0 = j0;
    }
    
    public e R(final int n) {
        if (n == 0) {
            final d s = this.S;
            final d f = s.f;
            if (f != null && f.f == s) {
                return f.d;
            }
        }
        else if (n == 1) {
            final d t = this.T;
            final d f2 = t.f;
            if (f2 != null && f2.f == t) {
                return f2.d;
            }
        }
        return null;
    }
    
    public void R0() {
        int i = 0;
        this.p = false;
        this.q = false;
        this.r = false;
        this.s = false;
        while (i < this.Z.size()) {
            this.Z.get(i).y();
            ++i;
        }
    }
    
    public void R1(int p2, int e0) {
        this.i0 = p2;
        e0 -= p2;
        this.e0 = e0;
        p2 = this.p0;
        if (e0 < p2) {
            this.e0 = p2;
        }
    }
    
    public int S() {
        int e0 = this.e0;
        if (this.b0[1] == androidx.constraintlayout.core.widgets.e.b.I) {
            int e2;
            if (this.x == 1) {
                e2 = Math.max(this.C, e0);
            }
            else {
                e2 = this.C;
                if (e2 > 0) {
                    this.e0 = e2;
                }
                else {
                    e2 = 0;
                }
            }
            final int d = this.D;
            e0 = e2;
            if (d > 0 && d < (e0 = e2)) {
                e0 = d;
            }
        }
        return e0;
    }
    
    public void S0(final androidx.constraintlayout.core.c c) {
        this.Q.z(c);
        this.R.z(c);
        this.S.z(c);
        this.T.z(c);
        this.U.z(c);
        this.X.z(c);
        this.V.z(c);
        this.W.z(c);
    }
    
    public void S1(final b b) {
        this.b0[1] = b;
    }
    
    public int T() {
        int d0 = this.d0;
        if (this.b0[0] == androidx.constraintlayout.core.widgets.e.b.I) {
            int d2;
            if (this.w == 1) {
                d2 = Math.max(this.z, d0);
            }
            else {
                d2 = this.z;
                if (d2 > 0) {
                    this.d0 = d2;
                }
                else {
                    d2 = 0;
                }
            }
            final int a = this.A;
            d0 = d2;
            if (a > 0 && a < (d0 = d2)) {
                d0 = a;
            }
        }
        return d0;
    }
    
    public void T0() {
        this.r = false;
        this.s = false;
    }
    
    public void T1(final int x, int n, final int n2, final float e) {
        this.x = x;
        this.C = n;
        n = n2;
        if (n2 == Integer.MAX_VALUE) {
            n = 0;
        }
        this.D = n;
        this.E = e;
        if (e > 0.0f && e < 1.0f && x == 0) {
            this.x = 2;
        }
    }
    
    public e U() {
        return this.c0;
    }
    
    public StringBuilder U0(final StringBuilder sb) {
        sb.append("{\n");
        this.V0(sb, "left", this.Q);
        this.V0(sb, "top", this.R);
        this.V0(sb, "right", this.S);
        this.V0(sb, "bottom", this.T);
        this.V0(sb, "baseline", this.U);
        this.V0(sb, "centerX", this.V);
        this.V0(sb, "centerY", this.W);
        this.X0(sb, this.X, this.K);
        this.Z0(sb, "width", this.d0, this.o0, this.J[0], this.l, this.z, this.w, this.B, this.M0[0]);
        this.Z0(sb, "height", this.e0, this.p0, this.J[1], this.m, this.C, this.x, this.E, this.M0[1]);
        this.Y0(sb, "dimensionRatio", this.f0, this.g0);
        this.W0(sb, "horizontalBias", this.q0, androidx.constraintlayout.core.widgets.e.y1);
        this.W0(sb, "verticalBias", this.r0, androidx.constraintlayout.core.widgets.e.y1);
        sb.append("}\n");
        return sb;
    }
    
    public void U1(final float n) {
        this.M0[1] = n;
    }
    
    public e V(final int n) {
        if (n == 0) {
            final d q = this.Q;
            final d f = q.f;
            if (f != null && f.f == q) {
                return f.d;
            }
        }
        else if (n == 1) {
            final d r = this.R;
            final d f2 = r.f;
            if (f2 != null && f2.f == r) {
                return f2.d;
            }
        }
        return null;
    }
    
    public void V1(final int u0) {
        this.u0 = u0;
    }
    
    int W(final int n) {
        if (n == 0) {
            return this.j0;
        }
        if (n == 1) {
            return this.k0;
        }
        return 0;
    }
    
    public void W1(final int d0) {
        this.d0 = d0;
        final int o0 = this.o0;
        if (d0 < o0) {
            this.d0 = o0;
        }
    }
    
    public int X() {
        return this.l0() + this.d0;
    }
    
    public void X1(final boolean f) {
        this.F = f;
    }
    
    protected int Y() {
        return this.h0 + this.l0;
    }
    
    public void Y1(final int v) {
        if (v >= 0 && v <= 3) {
            this.v = v;
        }
    }
    
    protected int Z() {
        return this.i0 + this.m0;
    }
    
    public void Z1(final int h0) {
        this.h0 = h0;
    }
    
    public p a0(final int n) {
        if (n == 0) {
            return this.e;
        }
        if (n == 1) {
            return this.f;
        }
        return null;
    }
    
    public void a1(final int n0) {
        this.n0 = n0;
        this.L = (n0 > 0);
    }
    
    public void a2(final int i0) {
        this.i0 = i0;
    }
    
    public int b0() {
        return this.m0();
    }
    
    public void b1(final Object s0) {
        this.s0 = s0;
    }
    
    public void b2(final boolean b, final boolean b2, final boolean b3, final boolean b4) {
        if (this.H == -1) {
            if (b3 && !b4) {
                this.H = 0;
            }
            else if (!b3 && b4) {
                this.H = 1;
                if (this.g0 == -1) {
                    this.I = 1.0f / this.I;
                }
            }
        }
        if (this.H == 0 && (!this.R.p() || !this.T.p())) {
            this.H = 1;
        }
        else if (this.H == 1 && (!this.Q.p() || !this.S.p())) {
            this.H = 0;
        }
        if (this.H == -1 && (!this.R.p() || !this.T.p() || !this.Q.p() || !this.S.p())) {
            if (this.R.p() && this.T.p()) {
                this.H = 0;
            }
            else if (this.Q.p() && this.S.p()) {
                this.I = 1.0f / this.I;
                this.H = 1;
            }
        }
        if (this.H == -1) {
            final int z = this.z;
            if (z > 0 && this.C == 0) {
                this.H = 0;
            }
            else if (z == 0 && this.C > 0) {
                this.I = 1.0f / this.I;
                this.H = 1;
            }
        }
    }
    
    public String c0() {
        return this.w0;
    }
    
    public void c1(int t0) {
        if (t0 < 0) {
            t0 = 0;
        }
        this.t0 = t0;
    }
    
    public void c2(final boolean b, final boolean b2) {
        final boolean b3 = b & this.e.m();
        final boolean b4 = b2 & this.f.m();
        final l e = this.e;
        int g = e.h.g;
        final n f = this.f;
        int g2 = f.h.g;
        int g3 = e.i.g;
        final int g4 = f.i.g;
        int n;
        if (g3 - g < 0 || g4 - g2 < 0 || g == Integer.MIN_VALUE || g == Integer.MAX_VALUE || g2 == Integer.MIN_VALUE || g2 == Integer.MAX_VALUE || g3 == Integer.MIN_VALUE || g3 == Integer.MAX_VALUE || g4 == Integer.MIN_VALUE || (n = g4) == Integer.MAX_VALUE) {
            g3 = 0;
            g = 0;
            n = 0;
            g2 = 0;
        }
        final int n2 = g3 - g;
        final int n3 = n - g2;
        if (b3) {
            this.h0 = g;
        }
        if (b4) {
            this.i0 = g2;
        }
        if (this.u0 == 8) {
            this.d0 = 0;
            this.e0 = 0;
            return;
        }
        if (b3) {
            int d0 = n2;
            if (this.b0[0] == androidx.constraintlayout.core.widgets.e.b.G) {
                final int d2 = this.d0;
                if ((d0 = n2) < d2) {
                    d0 = d2;
                }
            }
            this.d0 = d0;
            final int o0 = this.o0;
            if (d0 < o0) {
                this.d0 = o0;
            }
        }
        if (b4) {
            int e2 = n3;
            if (this.b0[1] == androidx.constraintlayout.core.widgets.e.b.G) {
                final int e3 = this.e0;
                if ((e2 = n3) < e3) {
                    e2 = e3;
                }
            }
            this.e0 = e2;
            final int p2 = this.p0;
            if (e2 < p2) {
                this.e0 = p2;
            }
        }
    }
    
    public float d0() {
        return this.r0;
    }
    
    public void d1(final String v0) {
        this.v0 = v0;
    }
    
    public void d2(final androidx.constraintlayout.core.e e, final boolean b) {
        final int o = e.O(this.Q);
        final int o2 = e.O(this.R);
        final int o3 = e.O(this.S);
        final int o4 = e.O(this.T);
        int g = o;
        int g2 = o3;
        if (b) {
            final l e2 = this.e;
            g = o;
            g2 = o3;
            if (e2 != null) {
                final androidx.constraintlayout.core.widgets.analyzer.f h = e2.h;
                g = o;
                g2 = o3;
                if (h.j) {
                    final androidx.constraintlayout.core.widgets.analyzer.f i = e2.i;
                    g = o;
                    g2 = o3;
                    if (i.j) {
                        g = h.g;
                        g2 = i.g;
                    }
                }
            }
        }
        int g3 = o2;
        int g4 = o4;
        if (b) {
            final n f = this.f;
            g3 = o2;
            g4 = o4;
            if (f != null) {
                final androidx.constraintlayout.core.widgets.analyzer.f h2 = f.h;
                g3 = o2;
                g4 = o4;
                if (h2.j) {
                    final androidx.constraintlayout.core.widgets.analyzer.f j = f.i;
                    g3 = o2;
                    g4 = o4;
                    if (j.j) {
                        g3 = h2.g;
                        g4 = j.g;
                    }
                }
            }
        }
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        Label_0302: {
            if (g2 - g >= 0 && g4 - g3 >= 0 && g != Integer.MIN_VALUE && g != Integer.MAX_VALUE && g3 != Integer.MIN_VALUE && g3 != Integer.MAX_VALUE && g2 != Integer.MIN_VALUE && g2 != Integer.MAX_VALUE && g4 != Integer.MIN_VALUE) {
                n = g;
                n2 = g2;
                if ((n3 = g4) != Integer.MAX_VALUE) {
                    break Label_0302;
                }
            }
            n3 = 0;
            n = 0;
            g3 = 0;
            n2 = 0;
        }
        this.p1(n, g3, n2, n3);
    }
    
    public void e(final f f, final androidx.constraintlayout.core.e e, final HashSet<e> set, final int n, final boolean b) {
        if (b) {
            if (!set.contains(this)) {
                return;
            }
            androidx.constraintlayout.core.widgets.k.a(f, e, this);
            set.remove(this);
            this.g(e, f.M2(64));
        }
        Iterator<d> iterator5;
        if (n == 0) {
            final HashSet<d> e2 = this.Q.e();
            if (e2 != null) {
                final Iterator<d> iterator = e2.iterator();
                while (iterator.hasNext()) {
                    iterator.next().d.e(f, e, set, n, true);
                }
            }
            final HashSet<d> e3 = this.S.e();
            if (e3 != null) {
                final Iterator<d> iterator2 = e3.iterator();
                while (iterator2.hasNext()) {
                    iterator2.next().d.e(f, e, set, n, true);
                }
            }
            return;
        }
        else {
            final HashSet<d> e4 = this.R.e();
            if (e4 != null) {
                final Iterator<d> iterator3 = e4.iterator();
                while (iterator3.hasNext()) {
                    iterator3.next().d.e(f, e, set, n, true);
                }
            }
            final HashSet<d> e5 = this.T.e();
            if (e5 != null) {
                final Iterator<d> iterator4 = e5.iterator();
                while (iterator4.hasNext()) {
                    iterator4.next().d.e(f, e, set, n, true);
                }
            }
            final HashSet<d> e6 = this.U.e();
            if (e6 == null) {
                return;
            }
            iterator5 = e6.iterator();
        }
        while (true) {
            if (!iterator5.hasNext()) {
                return;
            }
            final e d = iterator5.next().d;
            try {
                d.e(f, e, set, n, true);
                continue;
            }
            finally {}
            break;
        }
    }
    
    public e e0() {
        final boolean z0 = this.z0();
        e e = null;
        if (z0) {
            e = this;
            e e2 = null;
            while (e2 == null && e != null) {
                final d r = e.r(androidx.constraintlayout.core.widgets.d.b.I);
                d k;
                if (r == null) {
                    k = null;
                }
                else {
                    k = r.k();
                }
                e i;
                if (k == null) {
                    i = null;
                }
                else {
                    i = k.i();
                }
                if (i == this.U()) {
                    return e;
                }
                d j;
                if (i == null) {
                    j = null;
                }
                else {
                    j = i.r(androidx.constraintlayout.core.widgets.d.b.K).k();
                }
                if (j != null && j.i() != e) {
                    e2 = e;
                }
                else {
                    e = i;
                }
            }
            e = e2;
        }
        return e;
    }
    
    public void e1(final androidx.constraintlayout.core.e e, final String s) {
        this.v0 = s;
        final androidx.constraintlayout.core.i u = e.u(this.Q);
        final androidx.constraintlayout.core.i u2 = e.u(this.R);
        final androidx.constraintlayout.core.i u3 = e.u(this.S);
        final androidx.constraintlayout.core.i u4 = e.u(this.T);
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append(".left");
        u.m(sb.toString());
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(s);
        sb2.append(".top");
        u2.m(sb2.toString());
        final StringBuilder sb3 = new StringBuilder();
        sb3.append(s);
        sb3.append(".right");
        u3.m(sb3.toString());
        final StringBuilder sb4 = new StringBuilder();
        sb4.append(s);
        sb4.append(".bottom");
        u4.m(sb4.toString());
        final androidx.constraintlayout.core.i u5 = e.u(this.U);
        final StringBuilder sb5 = new StringBuilder();
        sb5.append(s);
        sb5.append(".baseline");
        u5.m(sb5.toString());
    }
    
    boolean f() {
        return this instanceof m || this instanceof h;
    }
    
    public int f0() {
        return this.J0;
    }
    
    public void f1(int p2, final int e0) {
        this.d0 = p2;
        final int o0 = this.o0;
        if (p2 < o0) {
            this.d0 = o0;
        }
        this.e0 = e0;
        p2 = this.p0;
        if (e0 < p2) {
            this.e0 = p2;
        }
    }
    
    public void g(final androidx.constraintlayout.core.e e, final boolean b) {
        final androidx.constraintlayout.core.i u = e.u(this.Q);
        final androidx.constraintlayout.core.i u2 = e.u(this.S);
        final androidx.constraintlayout.core.i u3 = e.u(this.R);
        final androidx.constraintlayout.core.i u4 = e.u(this.T);
        final androidx.constraintlayout.core.i u5 = e.u(this.U);
        final e c0 = this.c0;
        boolean b4 = false;
        boolean b5 = false;
        Label_0172: {
            Label_0169: {
                if (c0 != null) {
                    final boolean b2 = c0 != null && c0.b0[0] == b.H;
                    final boolean b3 = c0 != null && c0.b0[1] == b.H;
                    final int v = this.v;
                    if (v == 1) {
                        b4 = b2;
                        break Label_0169;
                    }
                    if (v == 2) {
                        b5 = b3;
                        b4 = false;
                        break Label_0172;
                    }
                    if (v != 3) {
                        b4 = b2;
                        b5 = b3;
                        break Label_0172;
                    }
                }
                b4 = false;
            }
            b5 = false;
        }
        if (this.u0 == 8 && !this.p0()) {
            final boolean[] a0 = this.a0;
            if (!a0[0] && !a0[1]) {
                return;
            }
        }
        final boolean p2 = this.p;
        if (p2 || this.q) {
            if (p2) {
                e.f(u, this.h0);
                e.f(u2, this.h0 + this.d0);
                if (b4) {
                    final e c2 = this.c0;
                    if (c2 != null) {
                        if (this.k) {
                            final f f = (f)c2;
                            f.o2(this.Q);
                            f.n2(this.S);
                        }
                        else {
                            e.i(e.u(c2.S), u2, 0, 5);
                        }
                    }
                }
            }
            if (this.q) {
                e.f(u3, this.i0);
                e.f(u4, this.i0 + this.e0);
                if (this.U.n()) {
                    e.f(u5, this.i0 + this.n0);
                }
                if (b5) {
                    final e c3 = this.c0;
                    if (c3 != null) {
                        if (this.k) {
                            final f f2 = (f)c3;
                            f2.t2(this.R);
                            f2.s2(this.T);
                        }
                        else {
                            e.i(e.u(c3.T), u4, 0, 5);
                        }
                    }
                }
            }
            if (this.p && this.q) {
                this.p = false;
                this.q = false;
                return;
            }
        }
        final androidx.constraintlayout.core.f c4 = e.C;
        if (c4 != null) {
            ++c4.K;
        }
        if (b) {
            final l e2 = this.e;
            if (e2 != null) {
                final n f3 = this.f;
                if (f3 != null) {
                    final androidx.constraintlayout.core.widgets.analyzer.f h = e2.h;
                    if (h.j && e2.i.j && f3.h.j && f3.i.j) {
                        if (c4 != null) {
                            ++c4.w;
                        }
                        e.f(u, h.g);
                        e.f(u2, this.e.i.g);
                        e.f(u3, this.f.h.g);
                        e.f(u4, this.f.i.g);
                        e.f(u5, this.f.k.g);
                        if (this.c0 != null) {
                            if (b4 && this.g[0] && !this.x0()) {
                                e.i(e.u(this.c0.S), u2, 0, 8);
                            }
                            if (b5 && this.g[1] && !this.z0()) {
                                e.i(e.u(this.c0.T), u4, 0, 8);
                            }
                        }
                        this.p = false;
                        this.q = false;
                        return;
                    }
                }
            }
        }
        if (c4 != null) {
            ++c4.x;
        }
        int n;
        int n2;
        if (this.c0 != null) {
            int x0;
            if (this.t0(0)) {
                ((f)this.c0).k2(this, 0);
                x0 = 1;
            }
            else {
                x0 = (this.x0() ? 1 : 0);
            }
            int z0;
            if (this.t0(1)) {
                ((f)this.c0).k2(this, 1);
                z0 = 1;
            }
            else {
                z0 = (this.z0() ? 1 : 0);
            }
            if (x0 == 0 && b4 && this.u0 != 8 && this.Q.f == null && this.S.f == null) {
                e.i(e.u(this.c0.S), u2, 0, 1);
            }
            if (z0 == 0 && b5 && this.u0 != 8 && this.R.f == null && this.T.f == null && this.U == null) {
                e.i(e.u(this.c0.T), u4, 0, 1);
            }
            n = z0;
            n2 = x0;
        }
        else {
            n = 0;
            n2 = 0;
        }
        final int d0 = this.d0;
        int o0 = this.o0;
        if (d0 >= o0) {
            o0 = d0;
        }
        final int e3 = this.e0;
        int p3 = this.p0;
        if (e3 >= p3) {
            p3 = e3;
        }
        final b[] b6 = this.b0;
        final b b7 = b6[0];
        final b i = b.I;
        final boolean b8 = b7 != i;
        final boolean b9 = b6[1] != i;
        final int g0 = this.g0;
        this.H = g0;
        final float f4 = this.f0;
        this.I = f4;
        int w = this.w;
        final int x2 = this.x;
        int n6 = 0;
        boolean h2 = false;
        int n9 = 0;
        int n10 = 0;
        Label_1464: {
            if (f4 > 0.0f && this.u0 != 8) {
                int n3 = w;
                if (b6[0] == i && (n3 = w) == 0) {
                    n3 = 3;
                }
                int n4 = x2;
                if (b6[1] == i && (n4 = x2) == 0) {
                    n4 = 3;
                }
                Label_1427: {
                    if (b6[0] == i && b6[1] == i && n3 == 3 && n4 == 3) {
                        this.b2(b4, b5, b8, b9);
                    }
                    else if (b6[0] == i && n3 == 3) {
                        this.H = 0;
                        final int n5 = (int)(f4 * e3);
                        if (b6[1] != i) {
                            n6 = n4;
                            final int n7 = p3;
                            h2 = false;
                            final int n8 = 4;
                            n9 = n5;
                            n10 = n7;
                            w = n8;
                            break Label_1464;
                        }
                        final int n11 = p3;
                        n9 = n5;
                        n10 = n11;
                        break Label_1427;
                    }
                    else if (b6[1] == i && n4 == 3) {
                        this.H = 1;
                        if (g0 == -1) {
                            this.I = 1.0f / f4;
                        }
                        final int n12 = (int)(this.I * d0);
                        final b b10 = b6[0];
                        final int n13 = n3;
                        if (b10 != i) {
                            h2 = false;
                            n6 = 4;
                            n9 = o0;
                            n10 = n12;
                            w = n13;
                            break Label_1464;
                        }
                        n9 = o0;
                        n10 = n12;
                        break Label_1427;
                    }
                    final int n14 = o0;
                    n10 = p3;
                    n9 = n14;
                }
                final int n15 = n3;
                n6 = n4;
                h2 = true;
                w = n15;
            }
            else {
                n6 = x2;
                final int n16 = o0;
                n10 = p3;
                h2 = false;
                n9 = n16;
            }
        }
        final int[] y = this.y;
        y[0] = w;
        y[1] = n6;
        this.h = h2;
        boolean b11 = false;
        Label_1519: {
            if (h2) {
                final int h3 = this.H;
                if (h3 == 0 || h3 == -1) {
                    b11 = true;
                    break Label_1519;
                }
            }
            b11 = false;
        }
        boolean b12 = false;
        Label_1551: {
            if (h2) {
                final int h4 = this.H;
                if (h4 == 1 || h4 == -1) {
                    b12 = true;
                    break Label_1551;
                }
            }
            b12 = false;
        }
        final b b13 = this.b0[0];
        final b h5 = b.H;
        final boolean b14 = b13 == h5 && this instanceof f;
        if (b14) {
            n9 = 0;
        }
        final boolean b15 = this.X.p() ^ true;
        final boolean[] a2 = this.a0;
        final boolean b16 = a2[0];
        final boolean b17 = a2[1];
        Label_1967: {
            if (this.t != 2 && !this.p) {
                if (b) {
                    final l e4 = this.e;
                    if (e4 != null) {
                        final androidx.constraintlayout.core.widgets.analyzer.f h6 = e4.h;
                        if (h6.j) {
                            if (e4.i.j) {
                                if (b) {
                                    e.f(u, h6.g);
                                    e.f(u2, this.e.i.g);
                                    if (this.c0 != null && b4 && this.g[0] && !this.x0()) {
                                        e.i(e.u(this.c0.S), u2, 0, 8);
                                    }
                                }
                                break Label_1967;
                            }
                        }
                    }
                }
                final e c5 = this.c0;
                androidx.constraintlayout.core.i u6;
                if (c5 != null) {
                    u6 = e.u(c5.S);
                }
                else {
                    u6 = null;
                }
                final e c6 = this.c0;
                androidx.constraintlayout.core.i u7;
                if (c6 != null) {
                    u7 = e.u(c6.Q);
                }
                else {
                    u7 = null;
                }
                final boolean b18 = this.g[0];
                final b[] b19 = this.b0;
                this.i(e, true, b4, b5, b18, u7, u6, b19[0], b14, this.Q, this.S, this.h0, n9, this.o0, this.J[0], this.q0, b11, b19[1] == i, (boolean)(n2 != 0), (boolean)(n != 0), b16, w, n6, this.z, this.A, this.B, b15);
            }
        }
        final androidx.constraintlayout.core.i j = u4;
        final boolean b20 = b5;
        final androidx.constraintlayout.core.i k = u2;
        boolean b21 = false;
        Label_2157: {
            if (b) {
                final n f5 = this.f;
                if (f5 != null) {
                    final androidx.constraintlayout.core.widgets.analyzer.f h7 = f5.h;
                    if (h7.j && f5.i.j) {
                        e.f(u3, h7.g);
                        final int g2 = this.f.i.g;
                        final androidx.constraintlayout.core.i l = j;
                        e.f(l, g2);
                        e.f(u5, this.f.k.g);
                        final e c7 = this.c0;
                        if (c7 != null && n == 0 && b20) {
                            if (this.g[1]) {
                                e.i(e.u(c7.T), l, 0, 8);
                            }
                        }
                        b21 = false;
                        break Label_2157;
                    }
                }
            }
            b21 = true;
        }
        final androidx.constraintlayout.core.i m = j;
        final androidx.constraintlayout.core.i i2 = u5;
        if (this.u == 2) {
            b21 = false;
        }
        if (b21 && !this.q) {
            final boolean b22 = this.b0[1] == h5 && this instanceof f;
            if (b22) {
                n10 = 0;
            }
            final e c8 = this.c0;
            androidx.constraintlayout.core.i u8;
            if (c8 != null) {
                u8 = e.u(c8.T);
            }
            else {
                u8 = null;
            }
            final e c9 = this.c0;
            androidx.constraintlayout.core.i u9;
            if (c9 != null) {
                u9 = e.u(c9.R);
            }
            else {
                u9 = null;
            }
            boolean b23 = false;
            Label_2447: {
                if (this.n0 > 0 || this.u0 == 8) {
                    final d u10 = this.U;
                    if (u10.f != null) {
                        e.e(i2, u3, this.t(), 8);
                        e.e(i2, e.u(this.U.f), this.U.g(), 8);
                        if (b20) {
                            e.i(u8, e.u(this.T), 0, 5);
                        }
                        b23 = false;
                        break Label_2447;
                    }
                    int n17;
                    if (this.u0 == 8) {
                        n17 = u10.g();
                    }
                    else {
                        n17 = this.t();
                    }
                    e.e(i2, u3, n17, 8);
                }
                b23 = b15;
            }
            final boolean b24 = this.g[1];
            final b[] b25 = this.b0;
            this.i(e, false, b20, b4, b24, u9, u8, b25[1], b22, this.R, this.T, this.i0, n10, this.p0, this.J[1], this.r0, b12, b25[0] == i, (boolean)(n != 0), (boolean)(n2 != 0), b17, n6, w, this.C, this.D, this.E, b23);
        }
        androidx.constraintlayout.core.i i3 = u3;
        final androidx.constraintlayout.core.i i4 = m;
        if (h2) {
            final int h8 = this.H;
            final float i5 = this.I;
            androidx.constraintlayout.core.i i6;
            androidx.constraintlayout.core.i i7;
            androidx.constraintlayout.core.i i8;
            if (h8 == 1) {
                i6 = i4;
                i7 = i3;
                i8 = k;
                i3 = u;
            }
            else {
                i8 = i4;
                i7 = u;
                i6 = k;
            }
            e.l(i6, i7, i8, i3, i5, 8);
        }
        if (this.X.p()) {
            e.b(this, this.X.k().i(), (float)Math.toRadians(this.K + 90.0f), this.X.g());
        }
        this.p = false;
        this.q = false;
    }
    
    public b g0() {
        return this.b0[1];
    }
    
    public void g1(final float f0, final int g0) {
        this.f0 = f0;
        this.g0 = g0;
    }
    
    public boolean h() {
        return this.u0 != 8;
    }
    
    public int h0() {
        final d q = this.Q;
        int n = 0;
        if (q != null) {
            n = 0 + this.R.g;
        }
        int n2 = n;
        if (this.S != null) {
            n2 = n + this.T.g;
        }
        return n2;
    }
    
    public void h1(String s) {
        Label_0263: {
            if (s == null || s.length() == 0) {
                break Label_0263;
            }
            final int n = -1;
            final int length = s.length();
            final int index = s.indexOf(44);
            final int n2 = 0;
            int g0 = n;
            int n3 = n2;
            if (index > 0) {
                g0 = n;
                n3 = n2;
                if (index < length - 1) {
                    final String substring = s.substring(0, index);
                    if (substring.equalsIgnoreCase("W")) {
                        g0 = 0;
                    }
                    else {
                        g0 = n;
                        if (substring.equalsIgnoreCase("H")) {
                            g0 = 1;
                        }
                    }
                    n3 = index + 1;
                }
            }
            final int index2 = s.indexOf(58);
            Label_0217: {
                if (index2 < 0 || index2 >= length - 1) {
                    break Label_0217;
                }
                final String substring2 = s.substring(n3, index2);
                s = s.substring(index2 + 1);
                while (true) {
                    if (substring2.length() <= 0 || s.length() <= 0) {
                        break Label_0240;
                    }
                    try {
                        final float float1 = Float.parseFloat(substring2);
                        final float float2 = Float.parseFloat(s);
                        while (true) {
                            if (float1 > 0.0f && float2 > 0.0f) {
                                if (g0 == 1) {
                                    final float f0 = Math.abs(float2 / float1);
                                    break Label_0243;
                                }
                                final float f0 = Math.abs(float1 / float2);
                                break Label_0243;
                            }
                            float f0 = 0.0f;
                            if (f0 > 0.0f) {
                                this.f0 = f0;
                                this.g0 = g0;
                            }
                            return;
                            this.f0 = 0.0f;
                            return;
                            s = s.substring(n3);
                            f0 = Float.parseFloat(s);
                            continue;
                        }
                    }
                    // iftrue(Label_0240:, s.length() <= 0)
                    catch (NumberFormatException ex) {
                        continue;
                    }
                    break;
                }
            }
        }
    }
    
    public int i0() {
        return this.u0;
    }
    
    public void i1(final int n) {
        if (!this.L) {
            return;
        }
        final int i0 = n - this.n0;
        final int e0 = this.e0;
        this.i0 = i0;
        this.R.A(i0);
        this.T.A(e0 + i0);
        this.U.A(n);
        this.q = true;
    }
    
    public void j(final d.b b, final e e, final d.b b2) {
        this.k(b, e, b2, 0);
    }
    
    public int j0() {
        if (this.u0 == 8) {
            return 0;
        }
        return this.d0;
    }
    
    public void j1(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        this.p1(n, n2, n3, n4);
        this.a1(n5);
        Label_0025: {
            if (n6 != 0) {
                if (n6 == 1) {
                    this.p = false;
                }
                else {
                    if (n6 != 2) {
                        this.p = false;
                        break Label_0025;
                    }
                    this.p = true;
                }
                this.q = true;
                return;
            }
            this.p = true;
        }
        this.q = false;
    }
    
    public void k(d.b b, final e e, d.b j, int n) {
        final d.b m = androidx.constraintlayout.core.widgets.d.b.M;
        Label_0325: {
            if (b != m) {
                break Label_0325;
            }
            b = androidx.constraintlayout.core.widgets.d.b.H;
            d r;
            d r2;
            d.b i;
            d r3;
            d.b k;
            d r4;
            boolean b2;
            d d;
            d d2;
            d.b h = null;
            d r5;
            d r6;
            d.b n2 = null;
            d r7 = null;
            d d3;
            d.b l;
            d d4;
            d r8;
            d.b o = null;
            d.b l2;
            d r9;
            d r10 = null;
            d r11 = null;
            d r12 = null;
            d r13 = null;
            Label_0316_Outer:Label_0354_Outer:Label_0656_Outer:
            while (true) {
                Label_0309: {
                    if (j == m) {
                        r = this.r(b);
                        j = androidx.constraintlayout.core.widgets.d.b.J;
                        r2 = this.r(j);
                        i = androidx.constraintlayout.core.widgets.d.b.I;
                        r3 = this.r(i);
                        k = androidx.constraintlayout.core.widgets.d.b.K;
                        r4 = this.r(k);
                        b2 = true;
                        if ((r != null && r.p()) || (r2 != null && r2.p())) {
                            n = 0;
                        }
                        else {
                            this.k(b, e, b, 0);
                            this.k(j, e, j, 0);
                            n = 1;
                        }
                        if ((r3 != null && r3.p()) || (r4 != null && r4.p())) {
                            b2 = false;
                        }
                        else {
                            this.k(i, e, i, 0);
                            this.k(k, e, k, 0);
                        }
                        if (n != 0 && b2) {
                            d = this.r(m);
                            d2 = e.r(m);
                            break Label_0396;
                        }
                        if (n != 0) {
                            b = androidx.constraintlayout.core.widgets.d.b.N;
                        }
                        else {
                            if (!b2) {
                                return;
                            }
                            b = androidx.constraintlayout.core.widgets.d.b.O;
                        }
                        this.r(b).a(e.r(b), 0);
                        return;
                    }
                    else if (j != b && j != androidx.constraintlayout.core.widgets.d.b.J) {
                        b = androidx.constraintlayout.core.widgets.d.b.I;
                        if (j == b || j == androidx.constraintlayout.core.widgets.d.b.K) {
                            this.k(b, e, j, 0);
                            this.k(androidx.constraintlayout.core.widgets.d.b.K, e, j, 0);
                            break Label_0309;
                        }
                        return;
                    }
                    this.k(b, e, j, 0);
                    b = androidx.constraintlayout.core.widgets.d.b.J;
                    try {
                        this.k(b, e, j, 0);
                        d = this.r(m);
                        // iftrue(Label_0656:, r7 == null)
                        // iftrue(Label_0481:, j != l && j != d.b.K)
                        // iftrue(Label_0806:, b != d.b.H && b != d.b.J)
                        // iftrue(Label_0806:, !d3.p())
                        // iftrue(Label_0761:, r9 == null)
                        // iftrue(Label_0663:, b != l2)
                        // iftrue(Label_0541:, b != n2 || j != n2)
                        // iftrue(Label_0481:, b != o)
                        // iftrue(Label_0406:, b != n2)
                        // iftrue(Label_0815:, !r10.v(r11))
                        // iftrue(Label_0806:, d3 == null)
                        // iftrue(Label_0780:, r12.k() == r11)
                        // iftrue(Label_0601:, b != o || j != o)
                        // iftrue(Label_0713:, r13.k() == r11)
                        // iftrue(Label_0747:, b == d.b.I || b == d.b.K)
                        // iftrue(Label_0806:, !d3.p())
                        // iftrue(Label_0406:, j != h && j != d.b.J)
                        while (true) {
                            Block_26:Label_0713_Outer:
                            while (true) {
                            Label_0736_Outer:
                                while (true) {
                                    Block_31: {
                                    Label_0736:
                                        while (true) {
                                            Block_18_Outer:Label_0680_Outer:
                                            while (true) {
                                                d2 = e.r(j);
                                                d.a(d2, 0);
                                                Label_0815: {
                                                    return;
                                                }
                                                r5 = this.r(h);
                                                d2 = e.r(j);
                                                r6 = this.r(androidx.constraintlayout.core.widgets.d.b.J);
                                                r5.a(d2, 0);
                                                r6.a(d2, 0);
                                                d = this.r(n2);
                                                continue Label_0316_Outer;
                                                Block_23: {
                                                    Label_0740_Outer:Block_27_Outer:
                                                    while (true) {
                                                        Label_0694: {
                                                            Label_0761: {
                                                                Block_21: {
                                                                    while (true) {
                                                                        while (true) {
                                                                            while (true) {
                                                                                Block_32: {
                                                                                    while (true) {
                                                                                        while (true) {
                                                                                            r7 = this.r(androidx.constraintlayout.core.widgets.d.b.I);
                                                                                            d3 = this.r(androidx.constraintlayout.core.widgets.d.b.K);
                                                                                            break Block_26;
                                                                                            l = androidx.constraintlayout.core.widgets.d.b.I;
                                                                                            Label_0435: {
                                                                                                break Label_0435;
                                                                                                break Label_0694;
                                                                                                d4 = this.r(b).h();
                                                                                                d3 = this.r(n2);
                                                                                                break Label_0736;
                                                                                            }
                                                                                            r8 = e.r(j);
                                                                                            this.r(l).a(r8, 0);
                                                                                            this.r(androidx.constraintlayout.core.widgets.d.b.K).a(r8, 0);
                                                                                            this.r(o).a(r8, 0);
                                                                                            return;
                                                                                            Label_0747:
                                                                                            r9 = this.r(l2);
                                                                                            break Block_32;
                                                                                            l2 = androidx.constraintlayout.core.widgets.d.b.L;
                                                                                            continue Block_18_Outer;
                                                                                        }
                                                                                        Label_0481:
                                                                                        break Block_21;
                                                                                        Label_0406:
                                                                                        o = androidx.constraintlayout.core.widgets.d.b.O;
                                                                                        continue Label_0680_Outer;
                                                                                    }
                                                                                    d4.x();
                                                                                    d3.x();
                                                                                    break Label_0736;
                                                                                }
                                                                                r9.x();
                                                                                break Label_0761;
                                                                                n2 = androidx.constraintlayout.core.widgets.d.b.N;
                                                                                break Label_0736_Outer;
                                                                                Label_0601:
                                                                                r10 = this.r(b);
                                                                                r11 = e.r(j);
                                                                                continue Label_0740_Outer;
                                                                            }
                                                                            continue Block_27_Outer;
                                                                        }
                                                                        continue Label_0656_Outer;
                                                                    }
                                                                }
                                                                b = androidx.constraintlayout.core.widgets.d.b.H;
                                                                this.r(b).a(e.r(b), 0);
                                                                b = androidx.constraintlayout.core.widgets.d.b.J;
                                                                this.r(b).a(e.r(b), 0);
                                                                d = this.r(n2);
                                                                continue Label_0354_Outer;
                                                            }
                                                            r12 = this.r(m);
                                                            break Block_18_Outer;
                                                            Label_0541:
                                                            break Block_23;
                                                        }
                                                        r13 = this.r(m);
                                                        break Block_31;
                                                        Label_0663:
                                                        continue Label_0713_Outer;
                                                    }
                                                }
                                                b = androidx.constraintlayout.core.widgets.d.b.I;
                                                this.r(b).a(e.r(b), 0);
                                                b = androidx.constraintlayout.core.widgets.d.b.K;
                                                this.r(b).a(e.r(b), 0);
                                                d = this.r(o);
                                                continue Label_0354_Outer;
                                            }
                                            r12.x();
                                            Label_0780: {
                                                d4 = this.r(b).h();
                                            }
                                            d3 = this.r(o);
                                            continue Label_0736;
                                        }
                                        r10.a(r11, n);
                                        return;
                                    }
                                    r13.x();
                                    continue Label_0736_Outer;
                                }
                                h = androidx.constraintlayout.core.widgets.d.b.H;
                                continue Label_0713_Outer;
                            }
                            r7.x();
                            continue;
                        }
                    }
                    finally {}
                }
                break;
            }
        }
    }
    
    public int k0() {
        return this.v;
    }
    
    public void k1(final int h0, final int n) {
        if (this.p) {
            return;
        }
        this.Q.A(h0);
        this.S.A(n);
        this.h0 = h0;
        this.d0 = n - h0;
        this.p = true;
    }
    
    public void l(final d d, final d d2, final int n) {
        if (d.i() == this) {
            this.k(d.l(), d2.i(), d2.l(), n);
        }
    }
    
    public int l0() {
        final e c0 = this.c0;
        if (c0 != null && c0 instanceof f) {
            return ((f)c0).H1 + this.h0;
        }
        return this.h0;
    }
    
    public void l1(final int h0) {
        this.Q.A(h0);
        this.h0 = h0;
    }
    
    public void m(final e e, final float k, final int n) {
        final d.b m = androidx.constraintlayout.core.widgets.d.b.M;
        this.s0(m, e, m, n, 0);
        this.K = k;
    }
    
    public int m0() {
        final e c0 = this.c0;
        if (c0 != null && c0 instanceof f) {
            return ((f)c0).I1 + this.i0;
        }
        return this.i0;
    }
    
    public void m1(final int i0) {
        this.R.A(i0);
        this.i0 = i0;
    }
    
    public void n(e q0, final HashMap<e, e> hashMap) {
        this.t = q0.t;
        this.u = q0.u;
        this.w = q0.w;
        this.x = q0.x;
        final int[] y = this.y;
        final int[] y2 = q0.y;
        y[0] = y2[0];
        y[1] = y2[1];
        this.z = q0.z;
        this.A = q0.A;
        this.C = q0.C;
        this.D = q0.D;
        this.E = q0.E;
        this.F = q0.F;
        this.G = q0.G;
        this.H = q0.H;
        this.I = q0.I;
        final int[] j = q0.J;
        this.J = Arrays.copyOf(j, j.length);
        this.K = q0.K;
        this.L = q0.L;
        this.M = q0.M;
        this.Q.x();
        this.R.x();
        this.S.x();
        this.T.x();
        this.U.x();
        this.V.x();
        this.W.x();
        this.X.x();
        this.b0 = Arrays.copyOf(this.b0, 2);
        final e c0 = this.c0;
        final e e = null;
        e c2;
        if (c0 == null) {
            c2 = null;
        }
        else {
            c2 = hashMap.get(q0.c0);
        }
        this.c0 = c2;
        this.d0 = q0.d0;
        this.e0 = q0.e0;
        this.f0 = q0.f0;
        this.g0 = q0.g0;
        this.h0 = q0.h0;
        this.i0 = q0.i0;
        this.j0 = q0.j0;
        this.k0 = q0.k0;
        this.l0 = q0.l0;
        this.m0 = q0.m0;
        this.n0 = q0.n0;
        this.o0 = q0.o0;
        this.p0 = q0.p0;
        this.q0 = q0.q0;
        this.r0 = q0.r0;
        this.s0 = q0.s0;
        this.t0 = q0.t0;
        this.u0 = q0.u0;
        this.v0 = q0.v0;
        this.w0 = q0.w0;
        this.x0 = q0.x0;
        this.y0 = q0.y0;
        this.z0 = q0.z0;
        this.A0 = q0.A0;
        this.B0 = q0.B0;
        this.C0 = q0.C0;
        this.D0 = q0.D0;
        this.E0 = q0.E0;
        this.F0 = q0.F0;
        this.G0 = q0.G0;
        this.I0 = q0.I0;
        this.J0 = q0.J0;
        this.K0 = q0.K0;
        this.L0 = q0.L0;
        final float[] m0 = this.M0;
        final float[] m2 = q0.M0;
        m0[0] = m2[0];
        m0[1] = m2[1];
        final e[] n0 = this.N0;
        final e[] n2 = q0.N0;
        n0[0] = n2[0];
        n0[1] = n2[1];
        final e[] o0 = this.O0;
        final e[] o2 = q0.O0;
        o0[0] = o2[0];
        o0[1] = o2[1];
        final e p2 = q0.P0;
        e p3;
        if (p2 == null) {
            p3 = null;
        }
        else {
            p3 = hashMap.get(p2);
        }
        this.P0 = p3;
        q0 = q0.Q0;
        if (q0 == null) {
            q0 = e;
        }
        else {
            q0 = hashMap.get(q0);
        }
        this.Q0 = q0;
    }
    
    public boolean n0() {
        return this.L;
    }
    
    public void n1(final int i0, final int n) {
        if (this.q) {
            return;
        }
        this.R.A(i0);
        this.T.A(n);
        this.i0 = i0;
        this.e0 = n - i0;
        if (this.L) {
            this.U.A(i0 + this.n0);
        }
        this.q = true;
    }
    
    public void o(final androidx.constraintlayout.core.e e) {
        e.u(this.Q);
        e.u(this.R);
        e.u(this.S);
        e.u(this.T);
        if (this.n0 > 0) {
            e.u(this.U);
        }
    }
    
    public boolean o0(int n) {
        final boolean b = true;
        boolean b2 = true;
        if (n == 0) {
            if (this.Q.f != null) {
                n = 1;
            }
            else {
                n = 0;
            }
            int n2;
            if (this.S.f != null) {
                n2 = 1;
            }
            else {
                n2 = 0;
            }
            if (n + n2 >= 2) {
                b2 = false;
            }
            return b2;
        }
        if (this.R.f != null) {
            n = 1;
        }
        else {
            n = 0;
        }
        int n3;
        if (this.T.f != null) {
            n3 = 1;
        }
        else {
            n3 = 0;
        }
        int n4;
        if (this.U.f != null) {
            n4 = 1;
        }
        else {
            n4 = 0;
        }
        return n + n3 + n4 < 2 && b;
    }
    
    public void o1(final int n, final int n2, final int n3) {
        if (n3 == 0) {
            this.w1(n, n2);
        }
        else if (n3 == 1) {
            this.R1(n, n2);
        }
    }
    
    public void p() {
        this.i = true;
    }
    
    public boolean p0() {
        for (int size = this.Z.size(), i = 0; i < size; ++i) {
            if (this.Z.get(i).n()) {
                return true;
            }
        }
        return false;
    }
    
    public void p1(int e0, int d0, int l, int e2) {
        final int n = l - e0;
        l = e2 - d0;
        this.h0 = e0;
        this.i0 = d0;
        if (this.u0 == 8) {
            this.d0 = 0;
            this.e0 = 0;
            return;
        }
        final b[] b0 = this.b0;
        final b b2 = b0[0];
        final b g = androidx.constraintlayout.core.widgets.e.b.G;
        e0 = n;
        if (b2 == g) {
            d0 = this.d0;
            if ((e0 = n) < d0) {
                e0 = d0;
            }
        }
        d0 = l;
        if (b0[1] == g) {
            e2 = this.e0;
            if ((d0 = l) < e2) {
                d0 = e2;
            }
        }
        this.d0 = e0;
        this.e0 = d0;
        l = this.p0;
        if (d0 < l) {
            this.e0 = l;
        }
        l = this.o0;
        if (e0 < l) {
            this.d0 = l;
        }
        l = this.A;
        if (l > 0 && b0[0] == androidx.constraintlayout.core.widgets.e.b.I) {
            this.d0 = Math.min(this.d0, l);
        }
        l = this.D;
        if (l > 0 && this.b0[1] == androidx.constraintlayout.core.widgets.e.b.I) {
            this.e0 = Math.min(this.e0, l);
        }
        l = this.d0;
        if (e0 != l) {
            this.l = l;
        }
        e0 = this.e0;
        if (d0 != e0) {
            this.m = e0;
        }
    }
    
    public void q() {
        if (this.e == null) {
            this.e = new l(this);
        }
        if (this.f == null) {
            this.f = new n(this);
        }
    }
    
    public boolean q0() {
        return this.l != -1 || this.m != -1;
    }
    
    public void q1(final d.b b, final int h) {
        final int n = e$a.a[b.ordinal()];
        d d;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    if (n != 4) {
                        if (n != 5) {
                            return;
                        }
                        d = this.U;
                    }
                    else {
                        d = this.T;
                    }
                }
                else {
                    d = this.S;
                }
            }
            else {
                d = this.R;
            }
        }
        else {
            d = this.Q;
        }
        d.h = h;
    }
    
    public d r(final d.b b) {
        switch (e$a.a[b.ordinal()]) {
            default: {
                throw new AssertionError((Object)b.name());
            }
            case 9: {
                return null;
            }
            case 8: {
                return this.W;
            }
            case 7: {
                return this.V;
            }
            case 6: {
                return this.X;
            }
            case 5: {
                return this.U;
            }
            case 4: {
                return this.T;
            }
            case 3: {
                return this.S;
            }
            case 2: {
                return this.R;
            }
            case 1: {
                return this.Q;
            }
        }
    }
    
    public boolean r0(final int n, final int n2) {
        final boolean b = true;
        boolean b2 = true;
        if (n == 0) {
            final d f = this.Q.f;
            if (f != null && f.o()) {
                final d f2 = this.S.f;
                if (f2 != null && f2.o()) {
                    if (this.S.f.f() - this.S.g() - (this.Q.f.f() + this.Q.g()) < n2) {
                        b2 = false;
                    }
                    return b2;
                }
            }
        }
        else {
            final d f3 = this.R.f;
            if (f3 != null && f3.o()) {
                final d f4 = this.T.f;
                if (f4 != null && f4.o()) {
                    return this.T.f.f() - this.T.g() - (this.R.f.f() + this.R.g()) >= n2 && b;
                }
            }
        }
        return false;
    }
    
    public void r1(final boolean l) {
        this.L = l;
    }
    
    public ArrayList<d> s() {
        return this.Z;
    }
    
    public void s0(final d.b b, final e e, final d.b b2, final int n, final int n2) {
        this.r(b).b(e.r(b2), n, n2, true);
    }
    
    public void s1(final int e0) {
        this.e0 = e0;
        final int p = this.p0;
        if (e0 < p) {
            this.e0 = p;
        }
    }
    
    public int t() {
        return this.n0;
    }
    
    public void t1(final boolean g) {
        this.G = g;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        final String w0 = this.w0;
        final String s = "";
        String string;
        if (w0 != null) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("type: ");
            sb2.append(this.w0);
            sb2.append(" ");
            string = sb2.toString();
        }
        else {
            string = "";
        }
        sb.append(string);
        String string2 = s;
        if (this.v0 != null) {
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("id: ");
            sb3.append(this.v0);
            sb3.append(" ");
            string2 = sb3.toString();
        }
        sb.append(string2);
        sb.append("(");
        sb.append(this.h0);
        sb.append(", ");
        sb.append(this.i0);
        sb.append(") - (");
        sb.append(this.d0);
        sb.append(" x ");
        sb.append(this.e0);
        sb.append(")");
        return sb.toString();
    }
    
    public float u(final int n) {
        if (n == 0) {
            return this.q0;
        }
        if (n == 1) {
            return this.r0;
        }
        return -1.0f;
    }
    
    public boolean u0() {
        return this.G;
    }
    
    public void u1(final float q0) {
        this.q0 = q0;
    }
    
    public int v() {
        return this.m0() + this.e0;
    }
    
    public boolean v0() {
        return this.r;
    }
    
    public void v1(final int i0) {
        this.I0 = i0;
    }
    
    public Object w() {
        return this.s0;
    }
    
    public boolean w0(final int n) {
        return this.a0[n];
    }
    
    public void w1(int n, int o0) {
        this.h0 = n;
        n = o0 - n;
        this.d0 = n;
        o0 = this.o0;
        if (n < o0) {
            this.d0 = o0;
        }
    }
    
    public int x() {
        return this.t0;
    }
    
    public boolean x0() {
        final d q = this.Q;
        final d f = q.f;
        if (f == null || f.f != q) {
            final d s = this.S;
            final d f2 = s.f;
            if (f2 == null || f2.f != s) {
                return false;
            }
        }
        return true;
    }
    
    public void x1(final b b) {
        this.b0[0] = b;
    }
    
    public String y() {
        return this.v0;
    }
    
    public boolean y0() {
        return this.M;
    }
    
    public void y1(final int w, int n, final int n2, final float b) {
        this.w = w;
        this.z = n;
        n = n2;
        if (n2 == Integer.MAX_VALUE) {
            n = 0;
        }
        this.A = n;
        this.B = b;
        if (b > 0.0f && b < 1.0f && w == 0) {
            this.w = 2;
        }
    }
    
    public b z(final int n) {
        if (n == 0) {
            return this.H();
        }
        if (n == 1) {
            return this.g0();
        }
        return null;
    }
    
    public boolean z0() {
        final d r = this.R;
        final d f = r.f;
        if (f == null || f.f != r) {
            final d t = this.T;
            final d f2 = t.f;
            if (f2 == null || f2.f != t) {
                return false;
            }
        }
        return true;
    }
    
    public void z1(final float n) {
        this.M0[0] = n;
    }
    
    public enum b
    {
        G, 
        H, 
        I, 
        J;
    }
}
