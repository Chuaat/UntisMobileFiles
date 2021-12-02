// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core.motion;

import java.util.Collection;
import java.util.Arrays;
import java.lang.reflect.Array;
import androidx.constraintlayout.core.motion.utils.i;
import java.util.HashSet;
import androidx.constraintlayout.core.motion.utils.e0;
import androidx.constraintlayout.core.motion.utils.w;
import androidx.constraintlayout.core.motion.utils.d0;
import androidx.constraintlayout.core.motion.utils.c0;
import java.util.List;
import java.util.Collections;
import java.util.Iterator;
import java.util.ArrayList;
import androidx.constraintlayout.core.motion.utils.b;
import androidx.constraintlayout.core.motion.utils.m;
import androidx.constraintlayout.core.motion.key.g;
import androidx.constraintlayout.core.motion.utils.h;
import androidx.constraintlayout.core.motion.utils.o;
import androidx.constraintlayout.core.motion.utils.t;
import java.util.HashMap;

public class c
{
    public static final int M = 0;
    public static final int N = 1;
    public static final int O = 2;
    public static final int P = 3;
    public static final int Q = 4;
    public static final int R = 5;
    public static final int S = 0;
    public static final int T = 1;
    public static final int U = 2;
    public static final int V = 3;
    public static final int W = 4;
    public static final int X = 5;
    public static final int Y = 6;
    public static final int Z = 1;
    public static final int a0 = 2;
    private static final String b0 = "MotionController";
    private static final boolean c0 = false;
    private static final boolean d0 = false;
    static final int e0 = 0;
    static final int f0 = 1;
    static final int g0 = 2;
    static final int h0 = 3;
    static final int i0 = 4;
    static final int j0 = 5;
    private static final int k0 = -1;
    private static final int l0 = -2;
    private static final int m0 = -3;
    private HashMap<String, t> A;
    private HashMap<String, o> B;
    private HashMap<String, h> C;
    private g[] D;
    private int E;
    private int F;
    private f G;
    private int H;
    private float I;
    private androidx.constraintlayout.core.motion.utils.c J;
    private boolean K;
    String[] L;
    m a;
    f b;
    int c;
    String d;
    private int e;
    private e f;
    private e g;
    private d h;
    private d i;
    private b[] j;
    private b k;
    float l;
    float m;
    float n;
    float o;
    float p;
    private int[] q;
    private double[] r;
    private double[] s;
    private String[] t;
    private int[] u;
    private int v;
    private float[] w;
    private ArrayList<e> x;
    private float[] y;
    private ArrayList<androidx.constraintlayout.core.motion.key.b> z;
    
    public c(final f f) {
        this.a = new m();
        this.e = -1;
        this.f = new e();
        this.g = new e();
        this.h = new d();
        this.i = new d();
        this.l = Float.NaN;
        this.m = 0.0f;
        this.n = 1.0f;
        this.v = 4;
        this.w = new float[4];
        this.x = new ArrayList<e>();
        this.y = new float[1];
        this.z = new ArrayList<androidx.constraintlayout.core.motion.key.b>();
        this.E = -1;
        this.F = -1;
        this.G = null;
        this.H = -1;
        this.I = Float.NaN;
        this.J = null;
        this.K = false;
        this.X(f);
    }
    
    private float D() {
        final float[] array = new float[2];
        final float n = 1.0f / 99;
        double n3;
        double n2 = n3 = 0.0;
        float n4 = 0.0f;
        for (int i = 0; i < 100; ++i) {
            final float n5 = i * n;
            double n6 = n5;
            androidx.constraintlayout.core.motion.utils.d g = this.f.G;
            final Iterator<e> iterator = this.x.iterator();
            float n7 = Float.NaN;
            float n8 = 0.0f;
            while (iterator.hasNext()) {
                final e e = iterator.next();
                final androidx.constraintlayout.core.motion.utils.d g2 = e.G;
                androidx.constraintlayout.core.motion.utils.d d = g;
                float j = n7;
                float k = n8;
                if (g2 != null) {
                    k = e.I;
                    if (k < n5) {
                        d = g2;
                        j = n7;
                    }
                    else {
                        d = g;
                        j = n7;
                        k = n8;
                        if (Float.isNaN(n7)) {
                            j = e.I;
                            k = n8;
                            d = g;
                        }
                    }
                }
                g = d;
                n7 = j;
                n8 = k;
            }
            if (g != null) {
                float n9 = n7;
                if (Float.isNaN(n7)) {
                    n9 = 1.0f;
                }
                final float n10 = n9 - n8;
                n6 = (float)g.a((n5 - n8) / n10) * n10 + n8;
            }
            this.j[0].d(n6, this.r);
            this.f.k(n6, this.q, this.r, array, 0);
            if (i > 0) {
                n4 += (float)Math.hypot(n3 - array[1], n2 - array[0]);
            }
            n2 = array[0];
            n3 = array[1];
        }
        return n4;
    }
    
    private void K(final e e) {
        final Iterator<e> iterator = this.x.iterator();
        Object o = null;
        while (iterator.hasNext()) {
            final e e2 = iterator.next();
            if (e.J == e2.J) {
                o = e2;
            }
        }
        if (o != null) {
            this.x.remove(o);
        }
        final int binarySearch = Collections.binarySearch(this.x, e);
        if (binarySearch == 0) {
            final StringBuilder sb = new StringBuilder();
            sb.append(" KeyPath position \"");
            sb.append(e.J);
            sb.append("\" outside of range");
            androidx.constraintlayout.core.motion.utils.c0.f("MotionController", sb.toString());
        }
        this.x.add(-binarySearch - 1, e);
    }
    
    private void O(final e e) {
        e.B((float)this.b.E(), (float)this.b.F(), (float)this.b.D(), (float)this.b.k());
    }
    
    private float j(float i, final float[] array) {
        final float n = 0.0f;
        final float n2 = 1.0f;
        float min;
        if (array != null) {
            array[0] = 1.0f;
            min = i;
        }
        else {
            final float n3 = this.n;
            min = i;
            if (n3 != 1.0) {
                final float m = this.m;
                float n4 = i;
                if (i < m) {
                    n4 = 0.0f;
                }
                min = n4;
                if (n4 > m) {
                    min = n4;
                    if (n4 < 1.0) {
                        min = Math.min((n4 - m) * n3, 1.0f);
                    }
                }
            }
        }
        androidx.constraintlayout.core.motion.utils.d g = this.f.G;
        i = Float.NaN;
        final Iterator<e> iterator = this.x.iterator();
        float n5 = n;
        while (iterator.hasNext()) {
            final e e = iterator.next();
            final androidx.constraintlayout.core.motion.utils.d g2 = e.G;
            if (g2 != null) {
                final float j = e.I;
                if (j < min) {
                    g = g2;
                    n5 = j;
                }
                else {
                    if (!Float.isNaN(i)) {
                        continue;
                    }
                    i = e.I;
                }
            }
        }
        float n6 = min;
        if (g != null) {
            if (Float.isNaN(i)) {
                i = n2;
            }
            i -= n5;
            final double n7 = (min - n5) / i;
            i = (n6 = (float)g.a(n7) * i + n5);
            if (array != null) {
                array[0] = (float)g.b(n7);
                n6 = i;
            }
        }
        return n6;
    }
    
    private static androidx.constraintlayout.core.motion.utils.c v(final int n, final String s, final int n2) {
        if (n != -1) {
            return null;
        }
        return new androidx.constraintlayout.core.motion.utils.c() {
            float a;
            final /* synthetic */ androidx.constraintlayout.core.motion.utils.d b = androidx.constraintlayout.core.motion.utils.d.c(s);
            
            @Override
            public float a() {
                return (float)this.b.b(this.a);
            }
            
            @Override
            public float getInterpolation(final float a) {
                this.a = a;
                return (float)this.b.a(a);
            }
        };
    }
    
    double[] A(final double n) {
        this.j[0].d(n, this.r);
        final b k = this.k;
        if (k != null) {
            final double[] r = this.r;
            if (r.length > 0) {
                k.d(n, r);
            }
        }
        return this.r;
    }
    
    androidx.constraintlayout.core.motion.key.e B(final int n, final int n2, final float n3, final float n4) {
        final androidx.constraintlayout.core.motion.utils.e e = new androidx.constraintlayout.core.motion.utils.e();
        final e f = this.f;
        final float k = f.K;
        e.b = k;
        final float l = f.L;
        e.d = l;
        e.c = k + f.M;
        e.a = l + f.N;
        final androidx.constraintlayout.core.motion.utils.e e2 = new androidx.constraintlayout.core.motion.utils.e();
        final e g = this.g;
        final float i = g.K;
        e2.b = i;
        final float j = g.L;
        e2.d = j;
        e2.c = i + g.M;
        e2.a = j + g.N;
        for (final androidx.constraintlayout.core.motion.key.b b : this.z) {
            if (b instanceof androidx.constraintlayout.core.motion.key.e) {
                final androidx.constraintlayout.core.motion.key.e e3 = (androidx.constraintlayout.core.motion.key.e)b;
                if (e3.B(n, n2, e, e2, n3, n4)) {
                    return e3;
                }
                continue;
            }
        }
        return null;
    }
    
    void C(float n, final int n2, final int n3, final float n4, final float n5, final float[] array) {
        n = this.j(n, this.y);
        final HashMap<String, o> b = this.B;
        h h = null;
        o o;
        if (b == null) {
            o = null;
        }
        else {
            o = b.get("translationX");
        }
        final HashMap<String, o> b2 = this.B;
        o o2;
        if (b2 == null) {
            o2 = null;
        }
        else {
            o2 = b2.get("translationY");
        }
        final HashMap<String, o> b3 = this.B;
        o o3;
        if (b3 == null) {
            o3 = null;
        }
        else {
            o3 = b3.get("rotationZ");
        }
        final HashMap<String, o> b4 = this.B;
        o o4;
        if (b4 == null) {
            o4 = null;
        }
        else {
            o4 = b4.get("scaleX");
        }
        final HashMap<String, o> b5 = this.B;
        o o5;
        if (b5 == null) {
            o5 = null;
        }
        else {
            o5 = b5.get("scaleY");
        }
        final HashMap<String, h> c = this.C;
        h h2;
        if (c == null) {
            h2 = null;
        }
        else {
            h2 = c.get("translationX");
        }
        final HashMap<String, h> c2 = this.C;
        h h3;
        if (c2 == null) {
            h3 = null;
        }
        else {
            h3 = c2.get("translationY");
        }
        final HashMap<String, h> c3 = this.C;
        h h4;
        if (c3 == null) {
            h4 = null;
        }
        else {
            h4 = c3.get("rotationZ");
        }
        final HashMap<String, h> c4 = this.C;
        h h5;
        if (c4 == null) {
            h5 = null;
        }
        else {
            h5 = c4.get("scaleX");
        }
        final HashMap<String, h> c5 = this.C;
        if (c5 != null) {
            h = c5.get("scaleY");
        }
        final d0 d0 = new d0();
        d0.b();
        d0.d(o3, n);
        d0.h(o, o2, n);
        d0.f(o4, o5, n);
        d0.c(h4, n);
        d0.g(h2, h3, n);
        d0.e(h5, h, n);
        final b k = this.k;
        if (k != null) {
            final double[] r = this.r;
            if (r.length > 0) {
                final double n6 = n;
                k.d(n6, r);
                this.k.g(n6, this.s);
                this.f.E(n4, n5, array, this.q, this.s, this.r);
            }
            d0.a(n4, n5, n2, n3, array);
            return;
        }
        final b[] j = this.j;
        int n7 = 0;
        if (j != null) {
            n = this.j(n, this.y);
            final b b6 = this.j[0];
            final double n8 = n;
            b6.g(n8, this.s);
            this.j[0].d(n8, this.r);
            n = this.y[0];
            double[] s;
            while (true) {
                s = this.s;
                if (n7 >= s.length) {
                    break;
                }
                s[n7] *= n;
                ++n7;
            }
            this.f.E(n4, n5, array, this.q, s, this.r);
            d0.a(n4, n5, n2, n3, array);
            return;
        }
        final e g = this.g;
        final float i = g.K;
        final e f = this.f;
        final float n9 = i - f.K;
        final float n10 = g.L - f.L;
        final float m = g.M;
        final float l = f.M;
        final float n11 = g.N;
        final float n12 = f.N;
        array[0] = n9 * (1.0f - n4) + (m - l + n9) * n4;
        array[1] = n10 * (1.0f - n5) + (n11 - n12 + n10) * n5;
        d0.b();
        d0.d(o3, n);
        d0.h(o, o2, n);
        d0.f(o4, o5, n);
        d0.c(h4, n);
        d0.g(h2, h3, n);
        d0.e(h5, h, n);
        d0.a(n4, n5, n2, n3, array);
    }
    
    public float E() {
        return this.f.N;
    }
    
    public float F() {
        return this.f.M;
    }
    
    public float G() {
        return this.f.K;
    }
    
    public float H() {
        return this.f.L;
    }
    
    public int I() {
        return this.F;
    }
    
    public f J() {
        return this.b;
    }
    
    public boolean L(final f f, float interpolation, final long n, final androidx.constraintlayout.core.motion.utils.g g) {
        final float j = this.j(interpolation, null);
        final int h = this.H;
        interpolation = j;
        if (h != -1) {
            final float n2 = 1.0f / h;
            final float n3 = (float)Math.floor(j / n2);
            final float n4 = interpolation = j % n2 / n2;
            if (!Float.isNaN(this.I)) {
                interpolation = (n4 + this.I) % 1.0f;
            }
            final androidx.constraintlayout.core.motion.utils.c i = this.J;
            if (i != null) {
                interpolation = i.getInterpolation(interpolation);
            }
            else if (interpolation > 0.5) {
                interpolation = 1.0f;
            }
            else {
                interpolation = 0.0f;
            }
            interpolation = interpolation * n2 + n3 * n2;
        }
        final HashMap<String, o> b = this.B;
        if (b != null) {
            final Iterator<o> iterator = b.values().iterator();
            while (iterator.hasNext()) {
                iterator.next().h(f, interpolation);
            }
        }
        final b[] k = this.j;
        if (k != null) {
            final b b2 = k[0];
            final double n5 = interpolation;
            b2.d(n5, this.r);
            this.j[0].g(n5, this.s);
            final b l = this.k;
            if (l != null) {
                final double[] r = this.r;
                if (r.length > 0) {
                    l.d(n5, r);
                    this.k.g(n5, this.s);
                }
            }
            if (!this.K) {
                this.f.G(interpolation, f, this.q, this.r, this.s, null);
            }
            if (this.F != -1) {
                if (this.G == null) {
                    this.G = f.n().a(this.F);
                }
                final f g2 = this.G;
                if (g2 != null) {
                    final float n6 = (g2.w() + this.G.h()) / 2.0f;
                    final float n7 = (this.G.l() + this.G.q()) / 2.0f;
                    if (f.q() - f.l() > 0 && f.h() - f.w() > 0) {
                        final float n8 = (float)f.l();
                        final float n9 = (float)f.w();
                        f.M(n7 - n8);
                        f.N(n6 - n9);
                    }
                }
            }
            int n10 = 1;
            while (true) {
                final b[] m = this.j;
                if (n10 >= m.length) {
                    break;
                }
                m[n10].e(n5, this.w);
                this.f.U.get(this.t[n10 - 1]).w(f, this.w);
                ++n10;
            }
            d d = this.h;
            Label_0574: {
                if (d.H == 0) {
                    int i2 = 0;
                    Label_0529: {
                        if (interpolation > 0.0f) {
                            if (interpolation >= 1.0f) {
                                d = this.i;
                            }
                            else {
                                if (this.i.I != d.I) {
                                    i2 = 4;
                                    break Label_0529;
                                }
                                break Label_0574;
                            }
                        }
                        i2 = d.I;
                    }
                    f.a0(i2);
                }
            }
            if (this.D != null) {
                int n11 = 0;
                while (true) {
                    final g[] d2 = this.D;
                    if (n11 >= d2.length) {
                        break;
                    }
                    d2[n11].v(interpolation, f);
                    ++n11;
                }
            }
        }
        else {
            final e f2 = this.f;
            final float k2 = f2.K;
            final e g3 = this.g;
            final float k3 = g3.K;
            final float l2 = f2.L;
            final float l3 = g3.L;
            final float m2 = f2.M;
            final float m3 = g3.M;
            final float n12 = f2.N;
            final float n13 = g3.N;
            final float n14 = k2 + (k3 - k2) * interpolation + 0.5f;
            final int n15 = (int)n14;
            final float n16 = l2 + (l3 - l2) * interpolation + 0.5f;
            f.G(n15, (int)n16, (int)(n14 + (m2 + (m3 - m2) * interpolation)), (int)(n16 + (n12 + (n13 - n12) * interpolation)));
        }
        final HashMap<String, h> c = this.C;
        if (c != null) {
            for (final h h2 : c.values()) {
                if (h2 instanceof h.f) {
                    final h.f f3 = (h.f)h2;
                    final double[] s = this.s;
                    f3.l(f, interpolation, s[0], s[1]);
                }
                else {
                    h2.h(f, interpolation);
                }
            }
        }
        return false;
    }
    
    String M() {
        return this.b.m();
    }
    
    void N(final f f, final androidx.constraintlayout.core.motion.key.e e, final float n, final float n2, final String[] array, final float[] array2) {
        final androidx.constraintlayout.core.motion.utils.e e2 = new androidx.constraintlayout.core.motion.utils.e();
        final e f2 = this.f;
        final float k = f2.K;
        e2.b = k;
        final float l = f2.L;
        e2.d = l;
        e2.c = k + f2.M;
        e2.a = l + f2.N;
        final androidx.constraintlayout.core.motion.utils.e e3 = new androidx.constraintlayout.core.motion.utils.e();
        final e g = this.g;
        final float i = g.K;
        e3.b = i;
        final float j = g.L;
        e3.d = j;
        e3.c = i + g.M;
        e3.a = j + g.N;
        e.C(f, e2, e3, n, n2, array, array2);
    }
    
    void P(final m m, final m i, int n, int b, int n2) {
        Label_0183: {
            Label_0162: {
                if (n != 1) {
                    int n3;
                    if (n != 2) {
                        if (n == 3) {
                            n = m.b + m.c;
                            b = m.a() / 2 + m.d - n / 2;
                            break Label_0162;
                        }
                        if (n != 4) {
                            return;
                        }
                        n = m.b + m.c;
                        n2 = m.a;
                        n3 = m.d;
                    }
                    else {
                        n = m.b + m.c;
                        n2 = m.d;
                        n3 = m.a;
                    }
                    i.b = b - (n2 + n3 + m.b()) / 2;
                    i.d = (n - m.a()) / 2;
                    break Label_0183;
                }
                n = m.b + m.c;
                b = (m.d + m.a - m.b()) / 2;
            }
            i.b = b;
            i.d = n2 - (n + m.a()) / 2;
        }
        i.c = i.b + m.b();
        i.a = i.d + m.a();
    }
    
    void Q(final f f) {
        final e f2 = this.f;
        f2.I = 0.0f;
        f2.J = 0.0f;
        this.K = true;
        f2.B((float)f.E(), (float)f.F(), (float)f.D(), (float)f.k());
        this.g.B((float)f.E(), (float)f.F(), (float)f.D(), (float)f.k());
        this.h.p(f);
        this.i.p(f);
    }
    
    public void R(final int h) {
        this.f.H = h;
    }
    
    public void S(final f f) {
        final e g = this.g;
        g.I = 1.0f;
        g.J = 1.0f;
        this.O(g);
        this.g.B((float)f.l(), (float)f.w(), (float)f.D(), (float)f.k());
        this.g.b(f);
        this.i.p(f);
    }
    
    public void T(final int e) {
        this.E = e;
    }
    
    public void U(final f f) {
        final e f2 = this.f;
        f2.I = 0.0f;
        f2.J = 0.0f;
        f2.B((float)f.E(), (float)f.F(), (float)f.D(), (float)f.k());
        this.f.b(f);
        this.h.p(f);
    }
    
    public void V(final e0 e0, final f f, final int n, int d, int d2) {
        final e f2 = this.f;
        f2.I = 0.0f;
        f2.J = 0.0f;
        final m m = new m();
        Label_0180: {
            if (n != 1) {
                if (n != 2) {
                    break Label_0180;
                }
                final int b = e0.b;
                d = e0.d;
                m.b = d2 - (e0.c + e0.e + e0.c()) / 2;
                d = (b + d - e0.b()) / 2;
            }
            else {
                final int b2 = e0.b;
                d2 = e0.d;
                m.b = (e0.c + e0.e - e0.c()) / 2;
                d -= (b2 + d2 + e0.b()) / 2;
            }
            m.d = d;
            m.c = m.b + e0.c();
            m.a = m.d + e0.b();
        }
        this.f.B((float)m.b, (float)m.d, (float)m.b(), (float)m.a());
        this.h.s(m, f, n, e0.a);
    }
    
    public void W(final int f) {
        this.F = f;
        this.G = null;
    }
    
    public void X(final f b) {
        this.b = b;
    }
    
    public void Y(int i, int j, float d, final long n) {
        final Class<Double> type = Double.TYPE;
        new HashSet();
        final HashSet<String> set = new HashSet<String>();
        final HashSet<String> set2 = new HashSet<String>();
        final HashSet<String> set3 = new HashSet<String>();
        final HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        final int e = this.E;
        if (e != -1) {
            this.f.Q = e;
        }
        this.h.h(this.i, set2);
        final ArrayList<androidx.constraintlayout.core.motion.key.b> z = this.z;
        ArrayList<g> list2;
        if (z != null) {
            final Iterator<androidx.constraintlayout.core.motion.key.b> iterator = z.iterator();
            ArrayList<g> list = null;
            while (true) {
                list2 = list;
                if (!iterator.hasNext()) {
                    break;
                }
                final androidx.constraintlayout.core.motion.key.b b = iterator.next();
                if (b instanceof androidx.constraintlayout.core.motion.key.e) {
                    final androidx.constraintlayout.core.motion.key.e e2 = (androidx.constraintlayout.core.motion.key.e)b;
                    this.K(new e(i, j, e2, this.f, this.g));
                    final int y = e2.y;
                    if (y == -1) {
                        continue;
                    }
                    this.e = y;
                }
                else if (b instanceof androidx.constraintlayout.core.motion.key.d) {
                    b.i(set3);
                }
                else if (b instanceof androidx.constraintlayout.core.motion.key.f) {
                    b.i(set);
                }
                else if (b instanceof g) {
                    ArrayList<g> list3;
                    if ((list3 = list) == null) {
                        list3 = new ArrayList<g>();
                    }
                    list3.add((g)b);
                    list = list3;
                }
                else {
                    b.q(hashMap);
                    b.i(set2);
                }
            }
        }
        else {
            list2 = null;
        }
        if (list2 != null) {
            this.D = list2.toArray(new g[0]);
        }
        if (!set2.isEmpty()) {
            this.B = new HashMap<String, o>();
            for (final String key : set2) {
                o value;
                if (key.startsWith("CUSTOM,")) {
                    final i.b b2 = new i.b();
                    final String key2 = key.split(",")[1];
                    for (final androidx.constraintlayout.core.motion.key.b b3 : this.z) {
                        final HashMap<String, androidx.constraintlayout.core.motion.b> l = b3.l;
                        if (l == null) {
                            continue;
                        }
                        final androidx.constraintlayout.core.motion.b b4 = l.get(key2);
                        if (b4 == null) {
                            continue;
                        }
                        b2.a(b3.h, b4);
                    }
                    value = androidx.constraintlayout.core.motion.utils.o.e(key, b2);
                }
                else {
                    value = androidx.constraintlayout.core.motion.utils.o.f(key, n);
                }
                if (value == null) {
                    continue;
                }
                value.i(key);
                this.B.put(key, value);
            }
            final ArrayList<androidx.constraintlayout.core.motion.key.b> z2 = this.z;
            if (z2 != null) {
                for (final androidx.constraintlayout.core.motion.key.b b5 : z2) {
                    if (b5 instanceof androidx.constraintlayout.core.motion.key.c) {
                        b5.a(this.B);
                    }
                }
            }
            this.h.b(this.B, 0);
            this.i.b(this.B, 100);
            for (final String key3 : this.B.keySet()) {
                Label_0679: {
                    if (hashMap.containsKey(key3)) {
                        final Integer n2 = hashMap.get(key3);
                        if (n2 != null) {
                            i = n2;
                            break Label_0679;
                        }
                    }
                    i = 0;
                }
                final o o = this.B.get(key3);
                if (o != null) {
                    o.j(i);
                }
            }
        }
        if (!set.isEmpty()) {
            if (this.A == null) {
                this.A = new HashMap<String, t>();
            }
            for (final String key4 : set) {
                if (this.A.containsKey(key4)) {
                    continue;
                }
                o o2;
                if (key4.startsWith("CUSTOM,")) {
                    final i.b b6 = new i.b();
                    final String key5 = key4.split(",")[1];
                    for (final androidx.constraintlayout.core.motion.key.b b7 : this.z) {
                        final HashMap<String, androidx.constraintlayout.core.motion.b> k = b7.l;
                        if (k == null) {
                            continue;
                        }
                        final androidx.constraintlayout.core.motion.b b8 = k.get(key5);
                        if (b8 == null) {
                            continue;
                        }
                        b6.a(b7.h, b8);
                    }
                    o2 = androidx.constraintlayout.core.motion.utils.o.e(key4, b6);
                }
                else {
                    o2 = androidx.constraintlayout.core.motion.utils.o.f(key4, n);
                }
                if (o2 == null) {
                    continue;
                }
                o2.i(key4);
            }
            final ArrayList<androidx.constraintlayout.core.motion.key.b> z3 = this.z;
            if (z3 != null) {
                for (final androidx.constraintlayout.core.motion.key.b b9 : z3) {
                    if (b9 instanceof androidx.constraintlayout.core.motion.key.f) {
                        ((androidx.constraintlayout.core.motion.key.f)b9).v(this.A);
                    }
                }
            }
            for (final String key6 : this.A.keySet()) {
                if (hashMap.containsKey(key6)) {
                    i = hashMap.get(key6);
                }
                else {
                    i = 0;
                }
                this.A.get(key6).f(i);
            }
        }
        final int n3 = this.x.size() + 2;
        final e[] array = new e[n3];
        array[0] = this.f;
        array[n3 - 1] = this.g;
        if (this.x.size() > 0 && this.e == androidx.constraintlayout.core.motion.key.b.m) {
            this.e = 0;
        }
        final Iterator<e> iterator10 = this.x.iterator();
        i = 1;
        while (iterator10.hasNext()) {
            array[i] = iterator10.next();
            ++i;
        }
        final HashSet<String> set4 = new HashSet<String>();
        for (final String e3 : this.g.U.keySet()) {
            if (this.f.U.containsKey(e3)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("CUSTOM,");
                sb.append(e3);
                if (set2.contains(sb.toString())) {
                    continue;
                }
                set4.add(e3);
            }
        }
        final String[] t = set4.toArray(new String[0]);
        this.t = t;
        this.u = new int[t.length];
        i = 0;
        String[] t2;
        while (true) {
            t2 = this.t;
            if (i >= t2.length) {
                break;
            }
            final String s = t2[i];
            this.u[i] = 0;
            androidx.constraintlayout.core.motion.b b10;
            int[] u;
            for (j = 0; j < n3; ++j) {
                if (array[j].U.containsKey(s)) {
                    b10 = array[j].U.get(s);
                    if (b10 != null) {
                        u = this.u;
                        u[i] += b10.r();
                        break;
                    }
                }
            }
            ++i;
        }
        final boolean b11 = array[0].Q != -1;
        final int n4 = 18 + t2.length;
        final boolean[] array2 = new boolean[n4];
        for (i = 1; i < n3; ++i) {
            array[i].h(array[i - 1], array2, this.t, b11);
        }
        i = 1;
        int b12 = 0;
        while (i < n4) {
            j = b12;
            if (array2[i]) {
                j = b12 + 1;
            }
            ++i;
            b12 = j;
        }
        this.q = new int[b12];
        i = Math.max(2, b12);
        this.r = new double[i];
        this.s = new double[i];
        int n5 = 1;
        i = 0;
        while (n5 < n4) {
            j = i;
            if (array2[n5]) {
                this.q[i] = n5;
                j = i + 1;
            }
            ++n5;
            i = j;
        }
        final double[][] array3 = new double[n3][this.q.length];
        final double[] array4 = new double[n3];
        for (i = 0; i < n3; ++i) {
            array[i].i(array3[i], this.q);
            array4[i] = array[i].I;
        }
        i = 0;
        while (true) {
            final int[] q = this.q;
            if (i >= q.length) {
                break;
            }
            if (q[i] < androidx.constraintlayout.core.motion.e.l0.length) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(androidx.constraintlayout.core.motion.e.l0[this.q[i]]);
                sb2.append(" [");
                String str = sb2.toString();
                StringBuilder sb3;
                for (j = 0; j < n3; ++j) {
                    sb3 = new StringBuilder();
                    sb3.append(str);
                    sb3.append(array3[j][i]);
                    str = sb3.toString();
                }
            }
            ++i;
        }
        this.j = new b[this.t.length + 1];
        i = 0;
        final Class<Double> clazz = type;
        while (true) {
            final String[] t3 = this.t;
            if (i >= t3.length) {
                break;
            }
            final String s2 = t3[i];
            j = 0;
            int n6 = 0;
            double[] original = null;
            double[][] original2 = null;
            while (j < n3) {
                if (array[j].u(s2)) {
                    if (original2 == null) {
                        original = new double[n3];
                        original2 = (double[][])Array.newInstance(clazz, n3, array[j].p(s2));
                    }
                    original[n6] = array[j].I;
                    array[j].o(s2, original2[n6], 0);
                    ++n6;
                }
                ++j;
            }
            final double[] copy = Arrays.copyOf(original, n6);
            final double[][] array5 = Arrays.copyOf(original2, n6);
            final b[] m = this.j;
            ++i;
            m[i] = androidx.constraintlayout.core.motion.utils.b.a(this.e, copy, array5);
        }
        this.j[0] = androidx.constraintlayout.core.motion.utils.b.a(this.e, array4, array3);
        if (array[0].Q != -1) {
            final int[] array6 = new int[n3];
            final double[] array7 = new double[n3];
            final double[][] array8 = (double[][])Array.newInstance(clazz, n3, 2);
            for (i = 0; i < n3; ++i) {
                array6[i] = array[i].Q;
                array7[i] = array[i].I;
                array8[i][0] = array[i].K;
                array8[i][1] = array[i].L;
            }
            this.k = androidx.constraintlayout.core.motion.utils.b.b(array6, array7, array8);
        }
        float v = Float.NaN;
        this.C = new HashMap<String, h>();
        if (this.z != null) {
            for (final String key7 : set3) {
                final h d2 = androidx.constraintlayout.core.motion.utils.h.d(key7);
                if (d2 == null) {
                    continue;
                }
                d = v;
                if (d2.k()) {
                    d = v;
                    if (Float.isNaN(v)) {
                        d = this.D();
                    }
                }
                d2.i(key7);
                this.C.put(key7, d2);
                v = d;
            }
            for (final androidx.constraintlayout.core.motion.key.b b13 : this.z) {
                if (b13 instanceof androidx.constraintlayout.core.motion.key.d) {
                    ((androidx.constraintlayout.core.motion.key.d)b13).v(this.C);
                }
            }
            final Iterator<h> iterator14 = this.C.values().iterator();
            while (iterator14.hasNext()) {
                iterator14.next().j(v);
            }
        }
    }
    
    public void Z(final c c) {
        this.f.I(c, c.f);
        this.g.I(c, c.g);
    }
    
    public void a(final androidx.constraintlayout.core.motion.key.b e) {
        this.z.add(e);
    }
    
    void b(final ArrayList<androidx.constraintlayout.core.motion.key.b> c) {
        this.z.addAll(c);
    }
    
    void c(final float[] array, final int n) {
        final float n2 = 1.0f / (n - 1);
        final HashMap<String, o> b = this.B;
        if (b != null) {
            final o o = b.get("translationX");
        }
        final HashMap<String, o> b2 = this.B;
        if (b2 != null) {
            final o o2 = b2.get("translationY");
        }
        final HashMap<String, h> c = this.C;
        if (c != null) {
            final h h = c.get("translationX");
        }
        final HashMap<String, h> c2 = this.C;
        if (c2 != null) {
            final h h2 = c2.get("translationY");
        }
        for (int i = 0; i < n; ++i) {
            final float n3 = i * n2;
            final float n4 = this.n;
            final float n5 = 0.0f;
            float min = n3;
            if (n4 != 1.0f) {
                final float m = this.m;
                float n6 = n3;
                if (n3 < m) {
                    n6 = 0.0f;
                }
                min = n6;
                if (n6 > m) {
                    min = n6;
                    if (n6 < 1.0) {
                        min = Math.min((n6 - m) * n4, 1.0f);
                    }
                }
            }
            double n7 = min;
            androidx.constraintlayout.core.motion.utils.d g = this.f.G;
            float j = Float.NaN;
            final Iterator<e> iterator = this.x.iterator();
            float n8 = n5;
            while (iterator.hasNext()) {
                final e e = iterator.next();
                final androidx.constraintlayout.core.motion.utils.d g2 = e.G;
                if (g2 != null) {
                    final float k = e.I;
                    if (k < min) {
                        g = g2;
                        n8 = k;
                    }
                    else {
                        if (!Float.isNaN(j)) {
                            continue;
                        }
                        j = e.I;
                    }
                }
            }
            if (g != null) {
                float n9 = j;
                if (Float.isNaN(j)) {
                    n9 = 1.0f;
                }
                final float n10 = n9 - n8;
                n7 = (float)g.a((min - n8) / n10) * n10 + n8;
            }
            this.j[0].d(n7, this.r);
            final b l = this.k;
            if (l != null) {
                final double[] r = this.r;
                if (r.length > 0) {
                    l.d(n7, r);
                }
            }
            this.f.j(this.q, this.r, array, i * 2);
        }
    }
    
    int d(final float[] array, final int[] array2) {
        if (array != null) {
            final double[] h = this.j[0].h();
            if (array2 != null) {
                final Iterator<e> iterator = this.x.iterator();
                int n = 0;
                while (iterator.hasNext()) {
                    array2[n] = iterator.next().V;
                    ++n;
                }
            }
            int i = 0;
            int n2 = 0;
            while (i < h.length) {
                this.j[0].d(h[i], this.r);
                this.f.j(this.q, this.r, array, n2);
                n2 += 2;
                ++i;
            }
            return n2 / 2;
        }
        return 0;
    }
    
    public int e(final float[] array, final int[] array2, final int[] array3) {
        if (array != null) {
            final double[] h = this.j[0].h();
            if (array2 != null) {
                final Iterator<e> iterator = this.x.iterator();
                int n = 0;
                while (iterator.hasNext()) {
                    array2[n] = iterator.next().V;
                    ++n;
                }
            }
            if (array3 != null) {
                final Iterator<e> iterator2 = this.x.iterator();
                int n2 = 0;
                while (iterator2.hasNext()) {
                    array3[n2] = (int)(iterator2.next().J * 100.0f);
                    ++n2;
                }
            }
            int i = 0;
            int n3 = 0;
            while (i < h.length) {
                this.j[0].d(h[i], this.r);
                this.f.k(h[i], this.q, this.r, array, n3);
                n3 += 2;
                ++i;
            }
            return n3 / 2;
        }
        return 0;
    }
    
    public void f(final float[] array, final int n) {
        final float n2 = 1.0f / (n - 1);
        final HashMap<String, o> b = this.B;
        h h = null;
        o o;
        if (b == null) {
            o = null;
        }
        else {
            o = b.get("translationX");
        }
        final HashMap<String, o> b2 = this.B;
        o o2;
        if (b2 == null) {
            o2 = null;
        }
        else {
            o2 = b2.get("translationY");
        }
        final HashMap<String, h> c = this.C;
        h h2;
        if (c == null) {
            h2 = null;
        }
        else {
            h2 = c.get("translationX");
        }
        final HashMap<String, h> c2 = this.C;
        if (c2 != null) {
            h = c2.get("translationY");
        }
        for (int i = 0; i < n; ++i) {
            final float n3 = i * n2;
            final float n4 = this.n;
            float min = n3;
            if (n4 != 1.0f) {
                final float m = this.m;
                float n5 = n3;
                if (n3 < m) {
                    n5 = 0.0f;
                }
                min = n5;
                if (n5 > m) {
                    min = n5;
                    if (n5 < 1.0) {
                        min = Math.min((n5 - m) * n4, 1.0f);
                    }
                }
            }
            double n6 = min;
            androidx.constraintlayout.core.motion.utils.d g = this.f.G;
            float n7 = Float.NaN;
            final Iterator<e> iterator = this.x.iterator();
            float n8 = 0.0f;
            while (iterator.hasNext()) {
                final e e = iterator.next();
                final androidx.constraintlayout.core.motion.utils.d g2 = e.G;
                androidx.constraintlayout.core.motion.utils.d d = g;
                float j = n7;
                float k = n8;
                if (g2 != null) {
                    k = e.I;
                    if (k < min) {
                        d = g2;
                        j = n7;
                    }
                    else {
                        d = g;
                        j = n7;
                        k = n8;
                        if (Float.isNaN(n7)) {
                            j = e.I;
                            k = n8;
                            d = g;
                        }
                    }
                }
                g = d;
                n7 = j;
                n8 = k;
            }
            if (g != null) {
                float n9 = n7;
                if (Float.isNaN(n7)) {
                    n9 = 1.0f;
                }
                final float n10 = n9 - n8;
                n6 = (float)g.a((min - n8) / n10) * n10 + n8;
            }
            this.j[0].d(n6, this.r);
            final b l = this.k;
            if (l != null) {
                final double[] r = this.r;
                if (r.length > 0) {
                    l.d(n6, r);
                }
            }
            final e f = this.f;
            final int[] q = this.q;
            final double[] r2 = this.r;
            int n11 = i * 2;
            f.k(n6, q, r2, array, n11);
            if (h2 != null) {
                array[n11] += h2.a(min);
            }
            else if (o != null) {
                array[n11] += o.a(min);
            }
            if (h != null) {
                ++n11;
                array[n11] += h.a(min);
            }
            else if (o2 != null) {
                ++n11;
                array[n11] += o2.a(min);
            }
        }
    }
    
    public void g(float j, final float[] array, final int n) {
        j = this.j(j, null);
        this.j[0].d(j, this.r);
        this.f.s(this.q, this.r, array, n);
    }
    
    void h(final float[] array, final int n) {
        final float n2 = 1.0f / (n - 1);
        for (int i = 0; i < n; ++i) {
            this.j[0].d(this.j(i * n2, null), this.r);
            this.f.s(this.q, this.r, array, i * 8);
        }
    }
    
    void i(final boolean b) {
    }
    
    public int k() {
        return this.f.R;
    }
    
    int l(final String key, final float[] array, int i) {
        final o o = this.B.get(key);
        if (o == null) {
            return -1;
        }
        for (i = 0; i < array.length; ++i) {
            array[i] = o.a((float)(i / (array.length - 1)));
        }
        return array.length;
    }
    
    public void m(final double n, final float[] array, final float[] a) {
        final double[] array2 = new double[4];
        final double[] array3 = new double[4];
        this.j[0].d(n, array2);
        this.j[0].g(n, array3);
        Arrays.fill(a, 0.0f);
        this.f.l(n, this.q, array2, array, array3, a);
    }
    
    public float n() {
        return this.o;
    }
    
    public float o() {
        return this.p;
    }
    
    void p(float n, final float n2, final float n3, final float[] array) {
        n = this.j(n, this.y);
        final b[] j = this.j;
        int n4 = 0;
        if (j == null) {
            final e g = this.g;
            n = g.K;
            final e f = this.f;
            final float n5 = n - f.K;
            final float n6 = g.L - f.L;
            n = g.M;
            final float m = f.M;
            final float n7 = g.N;
            final float n8 = f.N;
            array[0] = n5 * (1.0f - n2) + (n - m + n5) * n2;
            array[1] = n6 * (1.0f - n3) + (n7 - n8 + n6) * n3;
            return;
        }
        final b b = j[0];
        final double n9 = n;
        b.g(n9, this.s);
        this.j[0].d(n9, this.r);
        n = this.y[0];
        double[] s;
        while (true) {
            s = this.s;
            if (n4 >= s.length) {
                break;
            }
            s[n4] *= n;
            ++n4;
        }
        final b k = this.k;
        if (k != null) {
            final double[] r = this.r;
            if (r.length > 0) {
                k.d(n9, r);
                this.k.g(n9, this.s);
                this.f.E(n2, n3, array, this.q, this.s, this.r);
            }
            return;
        }
        this.f.E(n2, n3, array, this.q, s, this.r);
    }
    
    public int q() {
        int n = this.f.H;
        final Iterator<e> iterator = this.x.iterator();
        while (iterator.hasNext()) {
            n = Math.max(n, iterator.next().H);
        }
        return Math.max(n, this.g.H);
    }
    
    public float r() {
        return this.g.N;
    }
    
    public float s() {
        return this.g.M;
    }
    
    public float t() {
        return this.g.K;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(" start: x: ");
        sb.append(this.f.K);
        sb.append(" y: ");
        sb.append(this.f.L);
        sb.append(" end: x: ");
        sb.append(this.g.K);
        sb.append(" y: ");
        sb.append(this.g.L);
        return sb.toString();
    }
    
    public float u() {
        return this.g.L;
    }
    
    public e w(final int index) {
        return this.x.get(index);
    }
    
    public int x(final int n, final int[] array) {
        final float[] array2 = new float[2];
        final Iterator<androidx.constraintlayout.core.motion.key.b> iterator = this.z.iterator();
        int n2 = 0;
        int n3 = 0;
        while (iterator.hasNext()) {
            final androidx.constraintlayout.core.motion.key.b b = iterator.next();
            final int k = b.k;
            if (k != n && n == -1) {
                continue;
            }
            array[n3] = 0;
            int n4 = n3 + 1;
            array[n4] = k;
            ++n4;
            final int h = b.h;
            array[n4] = h;
            final float n5 = h / 100.0f;
            final b b2 = this.j[0];
            final double n6 = n5;
            b2.d(n6, this.r);
            this.f.k(n6, this.q, this.r, array2, 0);
            ++n4;
            array[n4] = Float.floatToIntBits(array2[0]);
            final int n7 = n4 + 1;
            array[n7] = Float.floatToIntBits(array2[1]);
            int n8 = n7;
            if (b instanceof androidx.constraintlayout.core.motion.key.e) {
                final androidx.constraintlayout.core.motion.key.e e = (androidx.constraintlayout.core.motion.key.e)b;
                n8 = n7 + 1;
                array[n8] = e.I;
                ++n8;
                array[n8] = Float.floatToIntBits(e.E);
                ++n8;
                array[n8] = Float.floatToIntBits(e.F);
            }
            ++n8;
            array[n3] = n8 - n3;
            ++n2;
            n3 = n8;
        }
        return n2;
    }
    
    float y(final int n, float n2, float n3) {
        final e g = this.g;
        final float k = g.K;
        final e f = this.f;
        final float i = f.K;
        final float n4 = k - i;
        final float l = g.L;
        final float j = f.L;
        final float n5 = l - j;
        final float n6 = f.M / 2.0f;
        final float n7 = f.N / 2.0f;
        final float n8 = (float)Math.hypot(n4, n5);
        if (n8 < 1.0E-7) {
            return Float.NaN;
        }
        n2 -= i + n6;
        n3 -= j + n7;
        if ((float)Math.hypot(n2, n3) == 0.0f) {
            return 0.0f;
        }
        final float n9 = n2 * n4 + n3 * n5;
        if (n == 0) {
            return n9 / n8;
        }
        if (n == 1) {
            return (float)Math.sqrt(n8 * n8 - n9 * n9);
        }
        if (n == 2) {
            return n2 / n4;
        }
        if (n == 3) {
            return n3 / n4;
        }
        if (n == 4) {
            return n2 / n5;
        }
        if (n != 5) {
            return 0.0f;
        }
        return n3 / n5;
    }
    
    public int z(final int[] array, final float[] array2) {
        final Iterator<androidx.constraintlayout.core.motion.key.b> iterator = this.z.iterator();
        int n = 0;
        int n2 = 0;
        while (iterator.hasNext()) {
            final androidx.constraintlayout.core.motion.key.b b = iterator.next();
            final int h = b.h;
            array[n] = b.k * 1000 + h;
            final float n3 = h / 100.0f;
            final b b2 = this.j[0];
            final double n4 = n3;
            b2.d(n4, this.r);
            this.f.k(n4, this.q, this.r, array2, n2);
            n2 += 2;
            ++n;
        }
        return n;
    }
}
