// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core.state;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.HashMap;
import androidx.constraintlayout.core.widgets.e;

public class a implements d
{
    float A;
    float B;
    float C;
    float D;
    float E;
    int F;
    Object G;
    Object H;
    Object I;
    Object J;
    protected Object K;
    protected Object L;
    protected Object M;
    protected Object N;
    protected Object O;
    protected Object P;
    protected Object Q;
    protected Object R;
    Object S;
    Object T;
    private float U;
    private float V;
    g.c W;
    androidx.constraintlayout.core.state.b X;
    androidx.constraintlayout.core.state.b Y;
    private Object Z;
    private Object a;
    private e a0;
    final g b;
    private HashMap<String, Integer> b0;
    String c;
    private HashMap<String, Float> c0;
    androidx.constraintlayout.core.state.helpers.e d;
    int e;
    int f;
    float g;
    float h;
    int i;
    int j;
    protected int k;
    protected int l;
    int m;
    int n;
    int o;
    int p;
    int q;
    int r;
    int s;
    int t;
    float u;
    float v;
    float w;
    float x;
    float y;
    float z;
    
    public a(final g b) {
        this.c = null;
        this.d = null;
        this.e = 0;
        this.f = 0;
        this.g = 0.5f;
        this.h = 0.5f;
        this.i = 0;
        this.j = 0;
        this.k = 0;
        this.l = 0;
        this.m = 0;
        this.n = 0;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = Float.NaN;
        this.v = Float.NaN;
        this.w = Float.NaN;
        this.x = Float.NaN;
        this.y = Float.NaN;
        this.z = Float.NaN;
        this.A = Float.NaN;
        this.B = Float.NaN;
        this.C = Float.NaN;
        this.D = Float.NaN;
        this.E = Float.NaN;
        this.F = 0;
        this.G = null;
        this.H = null;
        this.I = null;
        this.J = null;
        this.K = null;
        this.L = null;
        this.M = null;
        this.N = null;
        this.O = null;
        this.P = null;
        this.Q = null;
        this.R = null;
        this.S = null;
        this.T = null;
        this.W = null;
        final Object j = androidx.constraintlayout.core.state.b.j;
        this.X = androidx.constraintlayout.core.state.b.b(j);
        this.Y = androidx.constraintlayout.core.state.b.b(j);
        this.b0 = new HashMap<String, Integer>();
        this.c0 = new HashMap<String, Float>();
        this.b = b;
    }
    
    private Object A(final Object o) {
        if (o == null) {
            return null;
        }
        Object r = o;
        if (!(o instanceof a)) {
            r = this.b.r(o);
        }
        return r;
    }
    
    private e M(final Object o) {
        if (o instanceof d) {
            return ((d)o).b();
        }
        return null;
    }
    
    private void i(final e e, final Object o, final g.c c) {
        final e m = this.M(o);
        if (m == null) {
            return;
        }
        final int[] a = a$a.a;
        final int n = a[c.ordinal()];
        androidx.constraintlayout.core.widgets.d d = null;
        androidx.constraintlayout.core.widgets.d d2 = null;
        int n2 = 0;
        int n3 = 0;
        Label_0417: {
            androidx.constraintlayout.core.widgets.d.b b6 = null;
            Label_0398: {
                androidx.constraintlayout.core.widgets.d.b b5 = null;
                Label_0351: {
                    androidx.constraintlayout.core.widgets.d.b b4 = null;
                    Label_0304: {
                        androidx.constraintlayout.core.widgets.d.b b3 = null;
                        Label_0257: {
                            androidx.constraintlayout.core.widgets.d.b b2 = null;
                            Label_0210: {
                                androidx.constraintlayout.core.widgets.d.b b = null;
                                switch (a[c.ordinal()]) {
                                    default: {
                                        return;
                                    }
                                    case 14: {
                                        e.m(m, this.U, (int)this.V);
                                        return;
                                    }
                                    case 13: {
                                        final androidx.constraintlayout.core.widgets.d.b l = androidx.constraintlayout.core.widgets.d.b.L;
                                        e.s0(l, m, l, 0, 0);
                                        return;
                                    }
                                    case 12: {
                                        b = androidx.constraintlayout.core.widgets.d.b.K;
                                        d = e.r(b);
                                        break;
                                    }
                                    case 11: {
                                        d = e.r(androidx.constraintlayout.core.widgets.d.b.K);
                                        b = androidx.constraintlayout.core.widgets.d.b.I;
                                        break;
                                    }
                                    case 10: {
                                        d = e.r(androidx.constraintlayout.core.widgets.d.b.I);
                                        b2 = androidx.constraintlayout.core.widgets.d.b.K;
                                        break Label_0210;
                                    }
                                    case 9: {
                                        b2 = androidx.constraintlayout.core.widgets.d.b.I;
                                        d = e.r(b2);
                                        break Label_0210;
                                    }
                                    case 8: {
                                        b3 = androidx.constraintlayout.core.widgets.d.b.J;
                                        d = e.r(b3);
                                        break Label_0257;
                                    }
                                    case 7: {
                                        d = e.r(androidx.constraintlayout.core.widgets.d.b.J);
                                        b3 = androidx.constraintlayout.core.widgets.d.b.H;
                                        break Label_0257;
                                    }
                                    case 6: {
                                        d = e.r(androidx.constraintlayout.core.widgets.d.b.H);
                                        b4 = androidx.constraintlayout.core.widgets.d.b.J;
                                        break Label_0304;
                                    }
                                    case 5: {
                                        b4 = androidx.constraintlayout.core.widgets.d.b.H;
                                        d = e.r(b4);
                                        break Label_0304;
                                    }
                                    case 4: {
                                        b5 = androidx.constraintlayout.core.widgets.d.b.J;
                                        d = e.r(b5);
                                        break Label_0351;
                                    }
                                    case 3: {
                                        d = e.r(androidx.constraintlayout.core.widgets.d.b.J);
                                        b5 = androidx.constraintlayout.core.widgets.d.b.H;
                                        break Label_0351;
                                    }
                                    case 2: {
                                        d = e.r(androidx.constraintlayout.core.widgets.d.b.H);
                                        b6 = androidx.constraintlayout.core.widgets.d.b.J;
                                        break Label_0398;
                                    }
                                    case 1: {
                                        b6 = androidx.constraintlayout.core.widgets.d.b.H;
                                        d = e.r(b6);
                                        break Label_0398;
                                    }
                                }
                                d2 = m.r(b);
                                n2 = this.n;
                                n3 = this.t;
                                break Label_0417;
                            }
                            d2 = m.r(b2);
                            n2 = this.m;
                            n3 = this.s;
                            break Label_0417;
                        }
                        d2 = m.r(b3);
                        n2 = this.l;
                        n3 = this.r;
                        break Label_0417;
                    }
                    d2 = m.r(b4);
                    n2 = this.k;
                    n3 = this.q;
                    break Label_0417;
                }
                d2 = m.r(b5);
                n2 = this.j;
                n3 = this.p;
                break Label_0417;
            }
            d2 = m.r(b6);
            n2 = this.i;
            n3 = this.o;
        }
        d.b(d2, n2, n3, false);
    }
    
    private void w() {
        this.G = this.A(this.G);
        this.H = this.A(this.H);
        this.I = this.A(this.I);
        this.J = this.A(this.J);
        this.K = this.A(this.K);
        this.L = this.A(this.L);
        this.M = this.A(this.M);
        this.N = this.A(this.N);
        this.O = this.A(this.O);
        this.P = this.A(this.P);
        this.Q = this.A(this.Q);
        this.R = this.A(this.R);
        this.S = this.A(this.S);
    }
    
    public a A0(final float b) {
        this.B = b;
        return this;
    }
    
    public float B() {
        return this.C;
    }
    
    public void B0() throws c {
        final ArrayList<String> list = new ArrayList<String>();
        if (this.G != null && this.H != null) {
            list.add("LeftToLeft and LeftToRight both defined");
        }
        if (this.I != null && this.J != null) {
            list.add("RightToLeft and RightToRight both defined");
        }
        if (this.K != null && this.L != null) {
            list.add("StartToStart and StartToEnd both defined");
        }
        if (this.M != null && this.N != null) {
            list.add("EndToStart and EndToEnd both defined");
        }
        if ((this.G != null || this.H != null || this.I != null || this.J != null) && (this.K != null || this.L != null || this.M != null || this.N != null)) {
            list.add("Both left/right and start/end constraints defined");
        }
        if (list.size() <= 0) {
            return;
        }
        throw new c(list);
    }
    
    public androidx.constraintlayout.core.state.b C() {
        return this.Y;
    }
    
    public a C0(final float h) {
        this.h = h;
        return this;
    }
    
    public int D() {
        return this.e;
    }
    
    public a D0(final int f) {
        this.F = f;
        return this;
    }
    
    public float E() {
        return this.u;
    }
    
    public a E0(final androidx.constraintlayout.core.state.b b) {
        return this.r0(b);
    }
    
    public float F() {
        return this.v;
    }
    
    public float G() {
        return this.w;
    }
    
    public float H() {
        return this.x;
    }
    
    public float I() {
        return this.y;
    }
    
    public float J() {
        return this.D;
    }
    
    public float K() {
        return this.E;
    }
    
    public String L() {
        return this.c;
    }
    
    public float N() {
        return this.z;
    }
    
    public float O() {
        return this.A;
    }
    
    public float P() {
        return this.B;
    }
    
    public int Q(final int n) {
        return this.f;
    }
    
    public Object R() {
        return this.Z;
    }
    
    public androidx.constraintlayout.core.state.b S() {
        return this.X;
    }
    
    public a T(final androidx.constraintlayout.core.state.b b) {
        return this.m0(b);
    }
    
    public a U(final float g) {
        this.g = g;
        return this;
    }
    
    public a V() {
        g.c w;
        if (this.G != null) {
            w = androidx.constraintlayout.core.state.g.c.G;
        }
        else {
            w = androidx.constraintlayout.core.state.g.c.H;
        }
        this.W = w;
        return this;
    }
    
    public a W(final Object g) {
        this.W = androidx.constraintlayout.core.state.g.c.G;
        this.G = g;
        return this;
    }
    
    public a X(final Object h) {
        this.W = androidx.constraintlayout.core.state.g.c.H;
        this.H = h;
        return this;
    }
    
    public a Y(final int n) {
        final g.c w = this.W;
        if (w != null) {
            switch (a$a.a[w.ordinal()]) {
                default: {
                    return this;
                }
                case 14: {
                    this.V = (float)n;
                    return this;
                }
                case 9:
                case 10: {
                    this.m = n;
                    return this;
                }
                case 7:
                case 8: {
                    this.l = n;
                    return this;
                }
                case 5:
                case 6: {
                    this.k = n;
                    return this;
                }
                case 3:
                case 4: {
                    this.j = n;
                    return this;
                }
                case 1:
                case 2: {
                    this.i = n;
                    return this;
                }
                case 11:
                case 12: {
                    break;
                }
            }
        }
        else {
            this.i = n;
            this.j = n;
            this.k = n;
            this.l = n;
            this.m = n;
        }
        this.n = n;
        return this;
    }
    
    public a Z(final Object o) {
        return this.Y(this.b.f(o));
    }
    
    @Override
    public void a() {
        if (this.a0 == null) {
            return;
        }
        final androidx.constraintlayout.core.state.helpers.e d = this.d;
        if (d != null) {
            d.a();
        }
        this.X.j(this.b, this.a0, 0);
        this.Y.j(this.b, this.a0, 1);
        this.w();
        this.i(this.a0, this.G, androidx.constraintlayout.core.state.g.c.G);
        this.i(this.a0, this.H, androidx.constraintlayout.core.state.g.c.H);
        this.i(this.a0, this.I, androidx.constraintlayout.core.state.g.c.I);
        this.i(this.a0, this.J, androidx.constraintlayout.core.state.g.c.J);
        this.i(this.a0, this.K, androidx.constraintlayout.core.state.g.c.K);
        this.i(this.a0, this.L, androidx.constraintlayout.core.state.g.c.L);
        this.i(this.a0, this.M, androidx.constraintlayout.core.state.g.c.M);
        this.i(this.a0, this.N, androidx.constraintlayout.core.state.g.c.N);
        this.i(this.a0, this.O, androidx.constraintlayout.core.state.g.c.O);
        this.i(this.a0, this.P, androidx.constraintlayout.core.state.g.c.P);
        this.i(this.a0, this.Q, androidx.constraintlayout.core.state.g.c.Q);
        this.i(this.a0, this.R, androidx.constraintlayout.core.state.g.c.R);
        this.i(this.a0, this.S, androidx.constraintlayout.core.state.g.c.S);
        this.i(this.a0, this.T, androidx.constraintlayout.core.state.g.c.V);
        final int e = this.e;
        if (e != 0) {
            this.a0.v1(e);
        }
        final int f = this.f;
        if (f != 0) {
            this.a0.Q1(f);
        }
        this.a0.u1(this.g);
        this.a0.P1(this.h);
        final e a0 = this.a0;
        final i n = a0.n;
        n.f = this.u;
        n.g = this.v;
        n.h = this.w;
        n.i = this.x;
        n.j = this.y;
        n.k = this.z;
        n.l = this.A;
        n.m = this.B;
        n.n = this.D;
        n.o = this.E;
        n.p = this.C;
        a0.V1(n.r = this.F);
        final HashMap<String, Integer> b0 = this.b0;
        if (b0 != null) {
            for (final String key : b0.keySet()) {
                this.a0.n.u(key, 902, this.b0.get(key));
            }
        }
        final HashMap<String, Float> c0 = this.c0;
        if (c0 != null) {
            for (final String key2 : c0.keySet()) {
                this.a0.n.t(key2, 901, this.c0.get(key2));
            }
        }
    }
    
    public a a0(final int t) {
        final g.c w = this.W;
        if (w != null) {
            switch (a$a.a[w.ordinal()]) {
                default: {
                    return this;
                }
                case 9:
                case 10: {
                    this.s = t;
                    return this;
                }
                case 7:
                case 8: {
                    this.r = t;
                    return this;
                }
                case 5:
                case 6: {
                    this.q = t;
                    return this;
                }
                case 3:
                case 4: {
                    this.p = t;
                    return this;
                }
                case 1:
                case 2: {
                    this.o = t;
                    return this;
                }
                case 11:
                case 12: {
                    break;
                }
            }
        }
        else {
            this.o = t;
            this.p = t;
            this.q = t;
            this.r = t;
            this.s = t;
        }
        this.t = t;
        return this;
    }
    
    @Override
    public e b() {
        if (this.a0 == null) {
            (this.a0 = this.v()).b1(this.Z);
        }
        return this.a0;
    }
    
    public a b0(final float u) {
        this.u = u;
        return this;
    }
    
    @Override
    public void c(final e a0) {
        if (a0 == null) {
            return;
        }
        (this.a0 = a0).b1(this.Z);
    }
    
    public a c0(final float v) {
        this.v = v;
        return this;
    }
    
    @Override
    public void d(final Object a) {
        this.a = a;
    }
    
    public a d0() {
        g.c w;
        if (this.I != null) {
            w = androidx.constraintlayout.core.state.g.c.I;
        }
        else {
            w = androidx.constraintlayout.core.state.g.c.J;
        }
        this.W = w;
        return this;
    }
    
    @Override
    public androidx.constraintlayout.core.state.helpers.e e() {
        return this.d;
    }
    
    public a e0(final Object i) {
        this.W = androidx.constraintlayout.core.state.g.c.I;
        this.I = i;
        return this;
    }
    
    public void f(final String key, final int i) {
        this.b0.put(key, i);
    }
    
    public a f0(final Object j) {
        this.W = androidx.constraintlayout.core.state.g.c.J;
        this.J = j;
        return this;
    }
    
    public void g(final String key, final float f) {
        if (this.c0 == null) {
            this.c0 = new HashMap<String, Float>();
        }
        this.c0.put(key, f);
    }
    
    public a g0(final float w) {
        this.w = w;
        return this;
    }
    
    @Override
    public Object getKey() {
        return this.a;
    }
    
    public a h(final float c) {
        this.C = c;
        return this;
    }
    
    public a h0(final float x) {
        this.x = x;
        return this;
    }
    
    public a i0(final float y) {
        this.y = y;
        return this;
    }
    
    public a j() {
        this.W = androidx.constraintlayout.core.state.g.c.S;
        return this;
    }
    
    public a j0(final float d) {
        this.D = d;
        return this;
    }
    
    public a k(final Object s) {
        this.W = androidx.constraintlayout.core.state.g.c.S;
        this.S = s;
        return this;
    }
    
    public a k0(final float e) {
        this.E = e;
        return this;
    }
    
    public a l(final float n) {
        final g.c w = this.W;
        if (w == null) {
            return this;
        }
        switch (a$a.a[w.ordinal()]) {
            case 9:
            case 10:
            case 11:
            case 12:
            case 16: {
                this.h = n;
                break;
            }
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 15: {
                this.g = n;
                break;
            }
        }
        return this;
    }
    
    public void l0(final androidx.constraintlayout.core.state.helpers.e d) {
        this.d = d;
        if (d != null) {
            this.c(d.b());
        }
    }
    
    public a m() {
        g.c w;
        if (this.Q != null) {
            w = androidx.constraintlayout.core.state.g.c.Q;
        }
        else {
            w = androidx.constraintlayout.core.state.g.c.R;
        }
        this.W = w;
        return this;
    }
    
    public a m0(final androidx.constraintlayout.core.state.b y) {
        this.Y = y;
        return this;
    }
    
    public a n(final Object r) {
        this.W = androidx.constraintlayout.core.state.g.c.R;
        this.R = r;
        return this;
    }
    
    public void n0(final int e) {
        this.e = e;
    }
    
    public a o(final Object q) {
        this.W = androidx.constraintlayout.core.state.g.c.Q;
        this.Q = q;
        return this;
    }
    
    public void o0(final String c) {
        this.c = c;
    }
    
    public a p(Object a) {
        a = this.A(a);
        this.K = a;
        this.N = a;
        this.W = androidx.constraintlayout.core.state.g.c.T;
        this.g = 0.5f;
        return this;
    }
    
    public void p0(final int f) {
        this.f = f;
    }
    
    public a q(Object a) {
        a = this.A(a);
        this.O = a;
        this.R = a;
        this.W = androidx.constraintlayout.core.state.g.c.U;
        this.h = 0.5f;
        return this;
    }
    
    public void q0(final Object z) {
        this.Z = z;
        final e a0 = this.a0;
        if (a0 != null) {
            a0.b1(z);
        }
    }
    
    public a r(final Object o, final float u, final float v) {
        this.T = this.A(o);
        this.U = u;
        this.V = v;
        this.W = androidx.constraintlayout.core.state.g.c.V;
        return this;
    }
    
    public a r0(final androidx.constraintlayout.core.state.b x) {
        this.X = x;
        return this;
    }
    
    public a s() {
        final g.c w = this.W;
        if (w != null) {
            switch (a$a.a[w.ordinal()]) {
                default: {
                    return this;
                }
                case 14: {
                    this.T = null;
                    return this;
                }
                case 13: {
                    this.S = null;
                    return this;
                }
                case 11:
                case 12: {
                    this.Q = null;
                    this.R = null;
                    this.n = 0;
                    break;
                }
                case 9:
                case 10: {
                    this.O = null;
                    this.P = null;
                    this.m = 0;
                    this.s = 0;
                    return this;
                }
                case 7:
                case 8: {
                    this.M = null;
                    this.N = null;
                    this.l = 0;
                    this.r = 0;
                    return this;
                }
                case 5:
                case 6: {
                    this.K = null;
                    this.L = null;
                    this.k = 0;
                    this.q = 0;
                    return this;
                }
                case 3:
                case 4: {
                    this.I = null;
                    this.J = null;
                    this.j = 0;
                    this.p = 0;
                    return this;
                }
                case 1:
                case 2: {
                    this.G = null;
                    this.H = null;
                    this.i = 0;
                    this.o = 0;
                    return this;
                }
            }
        }
        else {
            this.G = null;
            this.H = null;
            this.i = 0;
            this.I = null;
            this.J = null;
            this.j = 0;
            this.K = null;
            this.L = null;
            this.k = 0;
            this.M = null;
            this.N = null;
            this.l = 0;
            this.O = null;
            this.P = null;
            this.m = 0;
            this.Q = null;
            this.R = null;
            this.n = 0;
            this.S = null;
            this.T = null;
            this.g = 0.5f;
            this.h = 0.5f;
            this.o = 0;
            this.p = 0;
            this.q = 0;
            this.r = 0;
            this.s = 0;
        }
        this.t = 0;
        return this;
    }
    
    public a s0() {
        g.c w;
        if (this.K != null) {
            w = androidx.constraintlayout.core.state.g.c.K;
        }
        else {
            w = androidx.constraintlayout.core.state.g.c.L;
        }
        this.W = w;
        return this;
    }
    
    public a t() {
        this.s0().s();
        this.x().s();
        this.V().s();
        this.d0().s();
        return this;
    }
    
    public a t0(final Object l) {
        this.W = androidx.constraintlayout.core.state.g.c.L;
        this.L = l;
        return this;
    }
    
    public a u() {
        this.v0().s();
        this.j().s();
        this.m().s();
        return this;
    }
    
    public a u0(final Object k) {
        this.W = androidx.constraintlayout.core.state.g.c.K;
        this.K = k;
        return this;
    }
    
    public e v() {
        return new e(this.S().n(), this.C().n());
    }
    
    public a v0() {
        g.c w;
        if (this.O != null) {
            w = androidx.constraintlayout.core.state.g.c.O;
        }
        else {
            w = androidx.constraintlayout.core.state.g.c.P;
        }
        this.W = w;
        return this;
    }
    
    public a w0(final Object p) {
        this.W = androidx.constraintlayout.core.state.g.c.P;
        this.P = p;
        return this;
    }
    
    public a x() {
        g.c w;
        if (this.M != null) {
            w = androidx.constraintlayout.core.state.g.c.M;
        }
        else {
            w = androidx.constraintlayout.core.state.g.c.N;
        }
        this.W = w;
        return this;
    }
    
    public a x0(final Object o) {
        this.W = androidx.constraintlayout.core.state.g.c.O;
        this.O = o;
        return this;
    }
    
    public a y(final Object n) {
        this.W = androidx.constraintlayout.core.state.g.c.N;
        this.N = n;
        return this;
    }
    
    public a y0(final float z) {
        this.z = z;
        return this;
    }
    
    public a z(final Object m) {
        this.W = androidx.constraintlayout.core.state.g.c.M;
        this.M = m;
        return this;
    }
    
    public a z0(final float a) {
        this.A = a;
        return this;
    }
    
    public interface b
    {
        a a(final g p0);
    }
    
    static class c extends Exception
    {
        private final ArrayList<String> G;
        
        public c(final ArrayList<String> g) {
            this.G = g;
        }
        
        public ArrayList<String> a() {
            return this.G;
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("IncorrectConstraintException: ");
            sb.append(this.G.toString());
            return sb.toString();
        }
    }
}
