// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core.widgets;

import java.util.HashMap;
import java.util.Arrays;
import java.util.ArrayList;

public class g extends m
{
    public static final int n2 = 0;
    public static final int o2 = 1;
    public static final int p2 = 2;
    public static final int q2 = 0;
    public static final int r2 = 1;
    public static final int s2 = 2;
    public static final int t2 = 3;
    public static final int u2 = 0;
    public static final int v2 = 1;
    public static final int w2 = 2;
    private int O1;
    private int P1;
    private int Q1;
    private int R1;
    private int S1;
    private int T1;
    private float U1;
    private float V1;
    private float W1;
    private float X1;
    private float Y1;
    private float Z1;
    private int a2;
    private int b2;
    private int c2;
    private int d2;
    private int e2;
    private int f2;
    private int g2;
    private ArrayList<a> h2;
    private e[] i2;
    private e[] j2;
    private int[] k2;
    private e[] l2;
    private int m2;
    
    public g() {
        this.O1 = -1;
        this.P1 = -1;
        this.Q1 = -1;
        this.R1 = -1;
        this.S1 = -1;
        this.T1 = -1;
        this.U1 = 0.5f;
        this.V1 = 0.5f;
        this.W1 = 0.5f;
        this.X1 = 0.5f;
        this.Y1 = 0.5f;
        this.Z1 = 0.5f;
        this.a2 = 0;
        this.b2 = 0;
        this.c2 = 2;
        this.d2 = 2;
        this.e2 = 0;
        this.f2 = -1;
        this.g2 = 0;
        this.h2 = new ArrayList<a>();
        this.i2 = null;
        this.j2 = null;
        this.k2 = null;
        this.m2 = 0;
    }
    
    private void W2(final boolean b) {
        if (this.k2 != null && this.j2 != null) {
            if (this.i2 != null) {
                for (int i = 0; i < this.m2; ++i) {
                    this.l2[i].Q0();
                }
                final int[] k2 = this.k2;
                final int n = k2[0];
                final int n2 = k2[1];
                e e = null;
                float u1 = this.U1;
                e e3;
                for (int j = 0; j < n; ++j, e = e3) {
                    int n3;
                    if (b) {
                        n3 = n - j - 1;
                        u1 = 1.0f - this.U1;
                    }
                    else {
                        n3 = j;
                    }
                    final e e2 = this.j2[n3];
                    e3 = e;
                    if (e2 != null) {
                        if (e2.i0() == 8) {
                            e3 = e;
                        }
                        else {
                            if (j == 0) {
                                e2.l(e2.Q, super.Q, this.m2());
                                e2.v1(this.O1);
                                e2.u1(u1);
                            }
                            if (j == n - 1) {
                                e2.l(e2.S, super.S, this.n2());
                            }
                            if (j > 0 && e != null) {
                                e2.l(e2.Q, e.S, this.a2);
                                e.l(e.S, e2.Q, 0);
                            }
                            e3 = e2;
                        }
                    }
                }
                int l = 0;
                e e4 = e;
                while (l < n2) {
                    final e e5 = this.i2[l];
                    e e6 = e4;
                    if (e5 != null) {
                        if (e5.i0() == 8) {
                            e6 = e4;
                        }
                        else {
                            if (l == 0) {
                                e5.l(e5.R, super.R, this.o2());
                                e5.Q1(this.P1);
                                e5.P1(this.V1);
                            }
                            if (l == n2 - 1) {
                                e5.l(e5.T, super.T, this.l2());
                            }
                            if (l > 0 && e4 != null) {
                                e5.l(e5.R, e4.T, this.b2);
                                e4.l(e4.T, e5.R, 0);
                            }
                            e6 = e5;
                        }
                    }
                    ++l;
                    e4 = e6;
                }
                for (int n4 = 0; n4 < n; ++n4) {
                    for (int n5 = 0; n5 < n2; ++n5) {
                        int n6 = n5 * n + n4;
                        if (this.g2 == 1) {
                            n6 = n4 * n2 + n5;
                        }
                        final e[] l2 = this.l2;
                        if (n6 < l2.length) {
                            final e e7 = l2[n6];
                            if (e7 != null) {
                                if (e7.i0() != 8) {
                                    final e e8 = this.j2[n4];
                                    final e e9 = this.i2[n5];
                                    if (e7 != e8) {
                                        e7.l(e7.Q, e8.Q, 0);
                                        e7.l(e7.S, e8.S, 0);
                                    }
                                    if (e7 != e9) {
                                        e7.l(e7.R, e9.R, 0);
                                        e7.l(e7.T, e9.T, 0);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    private final int X2(final e e, int n) {
        if (e == null) {
            return 0;
        }
        if (e.g0() == androidx.constraintlayout.core.widgets.e.b.I) {
            final int x = e.x;
            if (x == 0) {
                return 0;
            }
            if (x == 2) {
                n *= (int)e.E;
                if (n != e.D()) {
                    e.H1(true);
                    this.q2(e, e.H(), e.j0(), androidx.constraintlayout.core.widgets.e.b.G, n);
                }
                return n;
            }
            if (x == 1) {
                return e.D();
            }
            if (x == 3) {
                return (int)(e.j0() * e.f0 + 0.5f);
            }
        }
        return e.D();
    }
    
    private final int Y2(final e e, int n) {
        if (e == null) {
            return 0;
        }
        if (e.H() == androidx.constraintlayout.core.widgets.e.b.I) {
            final int w = e.w;
            if (w == 0) {
                return 0;
            }
            if (w == 2) {
                n *= (int)e.B;
                if (n != e.j0()) {
                    e.H1(true);
                    this.q2(e, androidx.constraintlayout.core.widgets.e.b.G, n, e.g0(), e.D());
                }
                return n;
            }
            if (w == 1) {
                return e.j0();
            }
            if (w == 3) {
                return (int)(e.D() * e.f0 + 0.5f);
            }
        }
        return e.j0();
    }
    
    private void Z2(final e[] array, final int n, final int n2, final int n3, final int[] array2) {
        final int f2 = this.f2;
        int n9;
        int n10;
        if (n2 == 0) {
            int n4;
            if ((n4 = f2) <= 0) {
                int n5 = 0;
                int n6 = 0;
                int n7 = 0;
                while (true) {
                    n4 = n5;
                    if (n6 >= n) {
                        break;
                    }
                    int n8 = n7;
                    if (n6 > 0) {
                        n8 = n7 + this.a2;
                    }
                    final e e = array[n6];
                    if (e == null) {
                        n7 = n8;
                    }
                    else {
                        n7 = n8 + this.Y2(e, n3);
                        if (n7 > n3) {
                            n4 = n5;
                            break;
                        }
                        ++n5;
                    }
                    ++n6;
                }
            }
            n9 = n4;
            n10 = 0;
        }
        else {
            int n11;
            if ((n11 = f2) <= 0) {
                int n12 = 0;
                int n13 = 0;
                int n14 = 0;
                while (true) {
                    n11 = n12;
                    if (n13 >= n) {
                        break;
                    }
                    int n15 = n14;
                    if (n13 > 0) {
                        n15 = n14 + this.b2;
                    }
                    final e e2 = array[n13];
                    if (e2 == null) {
                        n14 = n15;
                    }
                    else {
                        n14 = n15 + this.X2(e2, n3);
                        if (n14 > n3) {
                            n11 = n12;
                            break;
                        }
                        ++n12;
                    }
                    ++n13;
                }
            }
            n9 = 0;
            n10 = n11;
        }
        if (this.k2 == null) {
            this.k2 = new int[2];
        }
        while (true) {
            int n16 = 0;
            int n17 = 0;
            Label_0276: {
                Label_0259: {
                    if (n10 != 0) {
                        break Label_0259;
                    }
                    n16 = n10;
                    n17 = n9;
                    if (n2 != 1) {
                        break Label_0259;
                    }
                    break Label_0276;
                    final boolean b;
                    while (!b) {
                        if (n2 == 0) {
                            n10 = (int)Math.ceil(n / (float)n9);
                        }
                        else {
                            n9 = (int)Math.ceil(n / (float)n10);
                        }
                        final e[] j2 = this.j2;
                        if (j2 != null && j2.length >= n9) {
                            Arrays.fill(j2, null);
                        }
                        else {
                            this.j2 = new e[n9];
                        }
                        final e[] i2 = this.i2;
                        if (i2 != null && i2.length >= n10) {
                            Arrays.fill(i2, null);
                        }
                        else {
                            this.i2 = new e[n10];
                        }
                        for (int k = 0; k < n9; ++k) {
                            for (int l = 0; l < n10; ++l) {
                                int n18 = l * n9 + k;
                                if (n2 == 1) {
                                    n18 = k * n10 + l;
                                }
                                if (n18 < array.length) {
                                    final e e3 = array[n18];
                                    if (e3 != null) {
                                        final int y2 = this.Y2(e3, n3);
                                        final e[] j3 = this.j2;
                                        if (j3[k] == null || j3[k].j0() < y2) {
                                            this.j2[k] = e3;
                                        }
                                        final int x2 = this.X2(e3, n3);
                                        final e[] i3 = this.i2;
                                        if (i3[l] == null || i3[l].D() < x2) {
                                            this.i2[l] = e3;
                                        }
                                    }
                                }
                            }
                        }
                        int n19 = 0;
                        int n20 = 0;
                        while (n19 < n9) {
                            final e e4 = this.j2[n19];
                            int n21 = n20;
                            if (e4 != null) {
                                int n22 = n20;
                                if (n19 > 0) {
                                    n22 = n20 + this.a2;
                                }
                                n21 = n22 + this.Y2(e4, n3);
                            }
                            ++n19;
                            n20 = n21;
                        }
                        int n23 = 0;
                        int n24 = 0;
                        while (n23 < n10) {
                            final e e5 = this.i2[n23];
                            int n25 = n24;
                            if (e5 != null) {
                                int n26 = n24;
                                if (n23 > 0) {
                                    n26 = n24 + this.b2;
                                }
                                n25 = n26 + this.X2(e5, n3);
                            }
                            ++n23;
                            n24 = n25;
                        }
                        array2[0] = n20;
                        array2[1] = n24;
                        if (n2 == 0) {
                            n16 = n10;
                            n17 = n9;
                            if (n20 <= n3) {
                                break Label_0276;
                            }
                            n16 = n10;
                            if ((n17 = n9) <= 1) {
                                break Label_0276;
                            }
                            --n9;
                        }
                        else {
                            n16 = n10;
                            n17 = n9;
                            if (n24 <= n3) {
                                break Label_0276;
                            }
                            n16 = n10;
                            n17 = n9;
                            if (n10 <= 1) {
                                break Label_0276;
                            }
                            --n10;
                        }
                    }
                    final int[] k2 = this.k2;
                    k2[0] = n9;
                    k2[1] = n10;
                    return;
                }
                if (n9 != 0 || n2 != 0) {
                    final boolean b = false;
                    continue;
                }
                n17 = n9;
                n16 = n10;
            }
            final boolean b = true;
            n10 = n16;
            n9 = n17;
            continue;
        }
    }
    
    private void a3(final e[] array, int i, final int n, final int n2, final int[] array2) {
        if (i == 0) {
            return;
        }
        this.h2.clear();
        a e = new a(n, super.Q, super.R, super.S, super.T, n2);
        this.h2.add(e);
        int n3 = 0;
        final int n4 = 0;
        int n5 = 0;
        final int n6 = 0;
        int n7 = 0;
        final int n8 = 0;
        a a = e;
        int n12;
        if (n == 0) {
            int n9 = n8;
            int n10 = n6;
            int n11 = n4;
            while (true) {
                n12 = n11;
                if (n9 >= i) {
                    break;
                }
                final e e2 = array[n9];
                final int y2 = this.Y2(e2, n2);
                int n13 = n11;
                if (e2.H() == androidx.constraintlayout.core.widgets.e.b.I) {
                    n13 = n11 + 1;
                }
                boolean b2;
                final boolean b = b2 = ((n10 == n2 || this.a2 + n10 + y2 > n2) && e.b != null);
                if (!b) {
                    b2 = b;
                    if (n9 > 0) {
                        final int f2 = this.f2;
                        b2 = b;
                        if (f2 > 0) {
                            b2 = b;
                            if (n9 % f2 == 0) {
                                b2 = true;
                            }
                        }
                    }
                }
                a e3 = null;
                Label_0306: {
                    if (b2) {
                        e3 = new a(n, super.Q, super.R, super.S, super.T, n2);
                        e3.i(n9);
                        this.h2.add(e3);
                    }
                    else {
                        e3 = e;
                        if (n9 > 0) {
                            n10 += this.a2 + y2;
                            e3 = e;
                            break Label_0306;
                        }
                    }
                    n10 = y2;
                }
                e3.b(e2);
                ++n9;
                n11 = n13;
                e = e3;
            }
        }
        else {
            while (true) {
                n12 = n3;
                if (n7 >= i) {
                    break;
                }
                final e e4 = array[n7];
                final int x2 = this.X2(e4, n2);
                int n14 = n3;
                if (e4.g0() == androidx.constraintlayout.core.widgets.e.b.I) {
                    n14 = n3 + 1;
                }
                boolean b4;
                final boolean b3 = b4 = ((n5 == n2 || this.b2 + n5 + x2 > n2) && a.b != null);
                if (!b3) {
                    b4 = b3;
                    if (n7 > 0) {
                        final int f3 = this.f2;
                        b4 = b3;
                        if (f3 > 0) {
                            b4 = b3;
                            if (n7 % f3 == 0) {
                                b4 = true;
                            }
                        }
                    }
                }
                Label_0544: {
                    a e5;
                    if (b4) {
                        e5 = new a(n, super.Q, super.R, super.S, super.T, n2);
                        e5.i(n7);
                        this.h2.add(e5);
                    }
                    else {
                        e5 = a;
                        if (n7 > 0) {
                            n5 += this.b2 + x2;
                            break Label_0544;
                        }
                    }
                    n5 = x2;
                    a = e5;
                }
                a.b(e4);
                ++n7;
                n3 = n14;
            }
        }
        final int size = this.h2.size();
        d q = super.Q;
        d r = super.R;
        d d = super.S;
        d d2 = super.T;
        int m2 = this.m2();
        int o2 = this.o2();
        int n15 = this.n2();
        int l2 = this.l2();
        final b h = this.H();
        final b h2 = androidx.constraintlayout.core.widgets.e.b.H;
        if (h != h2 && this.g0() != h2) {
            i = 0;
        }
        else {
            i = 1;
        }
        if (n12 > 0 && i != 0) {
            a a2;
            int n16;
            for (i = 0; i < size; ++i) {
                a2 = this.h2.get(i);
                if (n == 0) {
                    n16 = a2.f();
                }
                else {
                    n16 = a2.e();
                }
                a2.g(n2 - n16);
            }
        }
        int a3 = 0;
        int a4 = 0;
        a a5;
        int l3;
        d t;
        int max;
        int n17;
        int n18;
        int n19;
        int n20;
        int n21;
        d s;
        int n22;
        int max2;
        int n23;
        int n24;
        int n25;
        for (i = 0; i < size; ++i, a4 = n19) {
            a5 = this.h2.get(i);
            if (n == 0) {
                if (i < size - 1) {
                    d2 = this.h2.get(i + 1).b.R;
                    l3 = 0;
                }
                else {
                    d2 = super.T;
                    l3 = this.l2();
                }
                t = a5.b.T;
                a5.j(n, q, r, d, d2, m2, o2, n15, l3, n2);
                max = Math.max(a4, a5.f());
                n17 = (a3 += a5.e());
                if (i > 0) {
                    a3 = n17 + this.b2;
                }
                r = t;
                n18 = 0;
                l2 = l3;
                n19 = max;
                o2 = n18;
            }
            else {
                n20 = i;
                if (n20 < size - 1) {
                    d = this.h2.get(n20 + 1).b.Q;
                    n21 = 0;
                }
                else {
                    d = super.S;
                    n21 = this.n2();
                }
                s = a5.b.S;
                a5.j(n, q, r, d, d2, m2, o2, n21, l2, n2);
                n22 = a4 + a5.f();
                max2 = Math.max(a3, a5.e());
                n23 = n22;
                if (n20 > 0) {
                    n23 = n22 + this.a2;
                }
                n24 = max2;
                n15 = n21;
                q = s;
                n25 = 0;
                n19 = n23;
                a3 = n24;
                m2 = n25;
            }
        }
        array2[0] = a4;
        array2[1] = a3;
    }
    
    private void b3(final e[] array, final int n, int i, final int n2, final int[] array2) {
        if (n == 0) {
            return;
        }
        a e;
        if (this.h2.size() == 0) {
            e = new a(i, super.Q, super.R, super.S, super.T, n2);
            this.h2.add(e);
        }
        else {
            e = this.h2.get(0);
            e.c();
            e.j(i, super.Q, super.R, super.S, super.T, this.m2(), this.o2(), this.n2(), this.l2(), n2);
        }
        for (i = 0; i < n; ++i) {
            e.b(array[i]);
        }
        array2[0] = e.f();
        array2[1] = e.e();
    }
    
    public void c3(final float w1) {
        this.W1 = w1;
    }
    
    public void d3(final int q1) {
        this.Q1 = q1;
    }
    
    public void e3(final float x1) {
        this.X1 = x1;
    }
    
    public void f3(final int r1) {
        this.R1 = r1;
    }
    
    @Override
    public void g(final androidx.constraintlayout.core.e e, final boolean b) {
        super.g(e, b);
        final boolean b2 = this.U() != null && ((f)this.U()).I2();
        final int e2 = this.e2;
        if (e2 != 0) {
            if (e2 != 1) {
                if (e2 == 2) {
                    this.W2(b2);
                }
            }
            else {
                for (int size = this.h2.size(), i = 0; i < size; ++i) {
                    this.h2.get(i).d(b2, i, i == size - 1);
                }
            }
        }
        else if (this.h2.size() > 0) {
            this.h2.get(0).d(b2, 0, true);
        }
        this.t2(false);
    }
    
    public void g3(final int c2) {
        this.c2 = c2;
    }
    
    public void h3(final float u1) {
        this.U1 = u1;
    }
    
    public void i3(final int a2) {
        this.a2 = a2;
    }
    
    public void j3(final int o1) {
        this.O1 = o1;
    }
    
    public void k3(final float y1) {
        this.Y1 = y1;
    }
    
    public void l3(final int s1) {
        this.S1 = s1;
    }
    
    public void m3(final float z1) {
        this.Z1 = z1;
    }
    
    @Override
    public void n(final e e, final HashMap<e, e> hashMap) {
        super.n(e, hashMap);
        final g g = (g)e;
        this.O1 = g.O1;
        this.P1 = g.P1;
        this.Q1 = g.Q1;
        this.R1 = g.R1;
        this.S1 = g.S1;
        this.T1 = g.T1;
        this.U1 = g.U1;
        this.V1 = g.V1;
        this.W1 = g.W1;
        this.X1 = g.X1;
        this.Y1 = g.Y1;
        this.Z1 = g.Z1;
        this.a2 = g.a2;
        this.b2 = g.b2;
        this.c2 = g.c2;
        this.d2 = g.d2;
        this.e2 = g.e2;
        this.f2 = g.f2;
        this.g2 = g.g2;
    }
    
    public void n3(final int t1) {
        this.T1 = t1;
    }
    
    public void o3(final int f2) {
        this.f2 = f2;
    }
    
    @Override
    public void p2(int min, int min2, final int n, final int b) {
        if (super.A1 > 0 && !this.r2()) {
            this.u2(0, 0);
            this.t2(false);
            return;
        }
        final int m2 = this.m2();
        final int n2 = this.n2();
        final int o2 = this.o2();
        final int l2 = this.l2();
        final int[] array = new int[2];
        int n3 = min2 - m2 - n2;
        final int g2 = this.g2;
        if (g2 == 1) {
            n3 = b - o2 - l2;
        }
        Label_0141: {
            if (g2 == 0) {
                if (this.O1 == -1) {
                    this.O1 = 0;
                }
                if (this.P1 != -1) {
                    break Label_0141;
                }
            }
            else {
                if (this.O1 == -1) {
                    this.O1 = 0;
                }
                if (this.P1 != -1) {
                    break Label_0141;
                }
            }
            this.P1 = 0;
        }
        e[] z1 = super.z1;
        int n4 = 0;
        int n5 = 0;
        int a1;
        while (true) {
            a1 = super.A1;
            if (n4 >= a1) {
                break;
            }
            int n6 = n5;
            if (super.z1[n4].i0() == 8) {
                n6 = n5 + 1;
            }
            ++n4;
            n5 = n6;
        }
        int m3;
        if (n5 > 0) {
            z1 = new e[a1 - n5];
            int i = 0;
            m3 = 0;
            while (i < super.A1) {
                final e e = super.z1[i];
                int n7 = m3;
                if (e.i0() != 8) {
                    z1[m3] = e;
                    n7 = m3 + 1;
                }
                ++i;
                m3 = n7;
            }
        }
        else {
            m3 = a1;
        }
        this.l2 = z1;
        this.m2 = m3;
        final int e2 = this.e2;
        if (e2 != 0) {
            if (e2 != 1) {
                if (e2 == 2) {
                    this.Z2(z1, m3, this.g2, n3, array);
                }
            }
            else {
                this.a3(z1, m3, this.g2, n3, array);
            }
        }
        else {
            this.b3(z1, m3, this.g2, n3, array);
        }
        boolean b2 = true;
        final int a2 = array[0] + m2 + n2;
        final int a3 = array[1] + o2 + l2;
        if (min == 1073741824) {
            min = min2;
        }
        else if (min == Integer.MIN_VALUE) {
            min = Math.min(a2, min2);
        }
        else if (min == 0) {
            min = a2;
        }
        else {
            min = 0;
        }
        if (n == 1073741824) {
            min2 = b;
        }
        else if (n == Integer.MIN_VALUE) {
            min2 = Math.min(a3, b);
        }
        else if (n == 0) {
            min2 = a3;
        }
        else {
            min2 = 0;
        }
        this.u2(min, min2);
        this.W1(min);
        this.s1(min2);
        if (super.A1 <= 0) {
            b2 = false;
        }
        this.t2(b2);
    }
    
    public void p3(final int g2) {
        this.g2 = g2;
    }
    
    public void q3(final int d2) {
        this.d2 = d2;
    }
    
    public void r3(final float v1) {
        this.V1 = v1;
    }
    
    public void s3(final int b2) {
        this.b2 = b2;
    }
    
    public void t3(final int p) {
        this.P1 = p;
    }
    
    public void u3(final int e2) {
        this.e2 = e2;
    }
    
    private class a
    {
        private int a;
        private e b;
        int c;
        private d d;
        private d e;
        private d f;
        private d g;
        private int h;
        private int i;
        private int j;
        private int k;
        private int l;
        private int m;
        private int n;
        private int o;
        private int p;
        private int q;
        
        public a(final int a, final d d, final d e, final d f, final d g, final int q) {
            this.a = 0;
            this.b = null;
            this.c = 0;
            this.h = 0;
            this.i = 0;
            this.j = 0;
            this.k = 0;
            this.l = 0;
            this.m = 0;
            this.n = 0;
            this.o = 0;
            this.p = 0;
            this.q = 0;
            this.a = a;
            this.d = d;
            this.e = e;
            this.f = f;
            this.g = g;
            this.h = androidx.constraintlayout.core.widgets.g.this.m2();
            this.i = androidx.constraintlayout.core.widgets.g.this.o2();
            this.j = androidx.constraintlayout.core.widgets.g.this.n2();
            this.k = androidx.constraintlayout.core.widgets.g.this.l2();
            this.q = q;
        }
        
        private void h() {
            this.l = 0;
            this.m = 0;
            this.b = null;
            this.c = 0;
            for (int o = this.o, n = 0; n < o && this.n + n < androidx.constraintlayout.core.widgets.g.this.m2; ++n) {
                final e e = androidx.constraintlayout.core.widgets.g.this.l2[this.n + n];
                if (this.a == 0) {
                    final int j0 = e.j0();
                    int c2 = androidx.constraintlayout.core.widgets.g.this.a2;
                    if (e.i0() == 8) {
                        c2 = 0;
                    }
                    this.l += j0 + c2;
                    final int p2 = androidx.constraintlayout.core.widgets.g.this.X2(e, this.q);
                    if (this.b == null || this.c < p2) {
                        this.b = e;
                        this.c = p2;
                        this.m = p2;
                    }
                }
                else {
                    final int o2 = androidx.constraintlayout.core.widgets.g.this.Y2(e, this.q);
                    final int p3 = androidx.constraintlayout.core.widgets.g.this.X2(e, this.q);
                    int d2 = androidx.constraintlayout.core.widgets.g.this.b2;
                    if (e.i0() == 8) {
                        d2 = 0;
                    }
                    this.m += p3 + d2;
                    if (this.b == null || this.c < o2) {
                        this.b = e;
                        this.c = o2;
                        this.l = o2;
                    }
                }
            }
        }
        
        public void b(final e e) {
            final int a = this.a;
            int n = 0;
            final int n2 = 0;
            if (a == 0) {
                int o2 = androidx.constraintlayout.core.widgets.g.this.Y2(e, this.q);
                if (e.H() == androidx.constraintlayout.core.widgets.e.b.I) {
                    ++this.p;
                    o2 = 0;
                }
                int c2 = androidx.constraintlayout.core.widgets.g.this.a2;
                if (e.i0() == 8) {
                    c2 = n2;
                }
                this.l += o2 + c2;
                final int p = androidx.constraintlayout.core.widgets.g.this.X2(e, this.q);
                if (this.b == null || this.c < p) {
                    this.b = e;
                    this.c = p;
                    this.m = p;
                }
            }
            else {
                final int o3 = androidx.constraintlayout.core.widgets.g.this.Y2(e, this.q);
                int p2 = androidx.constraintlayout.core.widgets.g.this.X2(e, this.q);
                if (e.g0() == androidx.constraintlayout.core.widgets.e.b.I) {
                    ++this.p;
                    p2 = 0;
                }
                final int d2 = androidx.constraintlayout.core.widgets.g.this.b2;
                if (e.i0() != 8) {
                    n = d2;
                }
                this.m += p2 + n;
                if (this.b == null || this.c < o3) {
                    this.b = e;
                    this.c = o3;
                    this.l = o3;
                }
            }
            ++this.o;
        }
        
        public void c() {
            this.c = 0;
            this.b = null;
            this.l = 0;
            this.m = 0;
            this.n = 0;
            this.o = 0;
            this.p = 0;
        }
        
        public void d(final boolean b, int i, final boolean b2) {
            final int o = this.o;
            for (int n = 0; n < o && this.n + n < androidx.constraintlayout.core.widgets.g.this.m2; ++n) {
                final e e = androidx.constraintlayout.core.widgets.g.this.l2[this.n + n];
                if (e != null) {
                    e.Q0();
                }
            }
            if (o != 0) {
                if (this.b != null) {
                    final boolean b3 = b2 && i == 0;
                    int j = 0;
                    int n2 = -1;
                    int n3 = -1;
                    while (j < o) {
                        int n4;
                        if (b) {
                            n4 = o - 1 - j;
                        }
                        else {
                            n4 = j;
                        }
                        if (this.n + n4 >= androidx.constraintlayout.core.widgets.g.this.m2) {
                            break;
                        }
                        int n5 = n2;
                        int n6 = n3;
                        if (androidx.constraintlayout.core.widgets.g.this.l2[this.n + n4].i0() == 0) {
                            int n7;
                            if ((n7 = n2) == -1) {
                                n7 = j;
                            }
                            n6 = j;
                            n5 = n7;
                        }
                        ++j;
                        n2 = n5;
                        n3 = n6;
                    }
                    final e e2 = null;
                    e e3 = null;
                    if (this.a == 0) {
                        final e b4 = this.b;
                        b4.Q1(androidx.constraintlayout.core.widgets.g.this.P1);
                        int k = this.i;
                        if (i > 0) {
                            k += androidx.constraintlayout.core.widgets.g.this.b2;
                        }
                        b4.R.a(this.e, k);
                        if (b2) {
                            b4.T.a(this.g, this.k);
                        }
                        if (i > 0) {
                            this.e.d.T.a(b4.R, 0);
                        }
                        e e4 = null;
                        Label_0442: {
                            if (androidx.constraintlayout.core.widgets.g.this.d2 == 3 && !b4.n0()) {
                                int n8;
                                for (i = 0; i < o; ++i) {
                                    if (b) {
                                        n8 = o - 1 - i;
                                    }
                                    else {
                                        n8 = i;
                                    }
                                    if (this.n + n8 >= androidx.constraintlayout.core.widgets.g.this.m2) {
                                        break;
                                    }
                                    e4 = androidx.constraintlayout.core.widgets.g.this.l2[this.n + n8];
                                    if (e4.n0()) {
                                        break Label_0442;
                                    }
                                }
                            }
                            e4 = b4;
                        }
                        e e5;
                        for (int l = 0; l < o; ++l, e3 = e5) {
                            if (b) {
                                i = o - 1 - l;
                            }
                            else {
                                i = l;
                            }
                            if (this.n + i >= androidx.constraintlayout.core.widgets.g.this.m2) {
                                break;
                            }
                            e5 = androidx.constraintlayout.core.widgets.g.this.l2[this.n + i];
                            if (l == 0) {
                                e5.l(e5.Q, this.d, this.h);
                            }
                            if (i == 0) {
                                final int u2 = androidx.constraintlayout.core.widgets.g.this.O1;
                                float v2;
                                final float n9 = v2 = androidx.constraintlayout.core.widgets.g.this.U1;
                                if (b) {
                                    v2 = 1.0f - n9;
                                }
                                float n12 = 0.0f;
                                Label_0693: {
                                    float n10 = 0.0f;
                                    Label_0621: {
                                        float n11;
                                        if (this.n == 0 && androidx.constraintlayout.core.widgets.g.this.Q1 != -1) {
                                            i = androidx.constraintlayout.core.widgets.g.this.Q1;
                                            if (!b) {
                                                n10 = androidx.constraintlayout.core.widgets.g.this.W1;
                                                break Label_0621;
                                            }
                                            n11 = androidx.constraintlayout.core.widgets.g.this.W1;
                                        }
                                        else {
                                            i = u2;
                                            n12 = v2;
                                            if (!b2) {
                                                break Label_0693;
                                            }
                                            i = u2;
                                            n12 = v2;
                                            if (androidx.constraintlayout.core.widgets.g.this.S1 == -1) {
                                                break Label_0693;
                                            }
                                            i = androidx.constraintlayout.core.widgets.g.this.S1;
                                            if (!b) {
                                                n10 = androidx.constraintlayout.core.widgets.g.this.Y1;
                                                break Label_0621;
                                            }
                                            n11 = androidx.constraintlayout.core.widgets.g.this.Y1;
                                        }
                                        n10 = 1.0f - n11;
                                    }
                                    n12 = n10;
                                }
                                e5.v1(i);
                                e5.u1(n12);
                            }
                            if (l == o - 1) {
                                e5.l(e5.S, this.f, this.j);
                            }
                            if (e3 != null) {
                                e5.Q.a(e3.S, androidx.constraintlayout.core.widgets.g.this.a2);
                                if (l == n2) {
                                    e5.Q.B(this.h);
                                }
                                e3.S.a(e5.Q, 0);
                                if (l == n3 + 1) {
                                    e3.S.B(this.j);
                                }
                            }
                            if (e5 != b4) {
                                d d;
                                d d2;
                                if (androidx.constraintlayout.core.widgets.g.this.d2 == 3 && e4.n0() && e5 != e4 && e5.n0()) {
                                    d = e5.U;
                                    d2 = e4.U;
                                }
                                else {
                                    i = androidx.constraintlayout.core.widgets.g.this.d2;
                                    if (i != 0) {
                                        if (i != 1) {
                                            final d r = e5.R;
                                            if (b3) {
                                                r.a(this.e, this.i);
                                                e5.T.a(this.g, this.k);
                                                continue;
                                            }
                                            r.a(b4.R, 0);
                                        }
                                        d = e5.T;
                                        d2 = b4.T;
                                    }
                                    else {
                                        d = e5.R;
                                        d2 = b4.R;
                                    }
                                }
                                d.a(d2, 0);
                            }
                        }
                    }
                    else {
                        final e b5 = this.b;
                        b5.v1(androidx.constraintlayout.core.widgets.g.this.O1);
                        int h;
                        final int n13 = h = this.h;
                        if (i > 0) {
                            h = n13 + androidx.constraintlayout.core.widgets.g.this.a2;
                        }
                        Label_1178: {
                            d d3;
                            d d4;
                            if (b) {
                                b5.S.a(this.f, h);
                                if (b2) {
                                    b5.Q.a(this.d, this.j);
                                }
                                if (i <= 0) {
                                    break Label_1178;
                                }
                                d3 = this.f.d.Q;
                                d4 = b5.S;
                            }
                            else {
                                b5.Q.a(this.d, h);
                                if (b2) {
                                    b5.S.a(this.f, this.j);
                                }
                                if (i <= 0) {
                                    break Label_1178;
                                }
                                d3 = this.d.d.S;
                                d4 = b5.Q;
                            }
                            d3.a(d4, 0);
                        }
                        int n14 = 0;
                        e e6 = e2;
                        while (n14 < o) {
                            if (this.n + n14 >= androidx.constraintlayout.core.widgets.g.this.m2) {
                                break;
                            }
                            final e e7 = androidx.constraintlayout.core.widgets.g.this.l2[this.n + n14];
                            if (n14 == 0) {
                                e7.l(e7.R, this.e, this.i);
                                final int s2 = androidx.constraintlayout.core.widgets.g.this.P1;
                                final float i2 = androidx.constraintlayout.core.widgets.g.this.V1;
                                float n15;
                                if (this.n == 0 && androidx.constraintlayout.core.widgets.g.this.R1 != -1) {
                                    i = androidx.constraintlayout.core.widgets.g.this.R1;
                                    n15 = androidx.constraintlayout.core.widgets.g.this.X1;
                                }
                                else {
                                    i = s2;
                                    n15 = i2;
                                    if (b2) {
                                        i = s2;
                                        n15 = i2;
                                        if (androidx.constraintlayout.core.widgets.g.this.T1 != -1) {
                                            i = androidx.constraintlayout.core.widgets.g.this.T1;
                                            n15 = androidx.constraintlayout.core.widgets.g.this.Z1;
                                        }
                                    }
                                }
                                e7.Q1(i);
                                e7.P1(n15);
                            }
                            if (n14 == o - 1) {
                                e7.l(e7.T, this.g, this.k);
                            }
                            if (e6 != null) {
                                e7.R.a(e6.T, androidx.constraintlayout.core.widgets.g.this.b2);
                                if (n14 == n2) {
                                    e7.R.B(this.i);
                                }
                                e6.T.a(e7.R, 0);
                                if (n14 == n3 + 1) {
                                    e6.T.B(this.k);
                                }
                            }
                            Label_1690: {
                                if (e7 != b5) {
                                    i = androidx.constraintlayout.core.widgets.g.this.c2;
                                    if (b) {
                                        d d5 = null;
                                        d d6 = null;
                                        Label_1560: {
                                            if (i != 0) {
                                                if (i == 1) {
                                                    d5 = e7.Q;
                                                    d6 = b5.Q;
                                                    break Label_1560;
                                                }
                                                if (i != 2) {
                                                    break Label_1690;
                                                }
                                                e7.Q.a(b5.Q, 0);
                                            }
                                            d5 = e7.S;
                                            d6 = b5.S;
                                        }
                                        d5.a(d6, 0);
                                    }
                                    else {
                                        d d7;
                                        d d8;
                                        if (i != 0) {
                                            if (i != 1) {
                                                if (i != 2) {
                                                    break Label_1690;
                                                }
                                                final d q = e7.Q;
                                                if (b3) {
                                                    q.a(this.d, this.h);
                                                    e7.S.a(this.f, this.j);
                                                    break Label_1690;
                                                }
                                                q.a(b5.Q, 0);
                                            }
                                            d7 = e7.S;
                                            d8 = b5.S;
                                        }
                                        else {
                                            d7 = e7.Q;
                                            d8 = b5.Q;
                                        }
                                        d7.a(d8, 0);
                                    }
                                }
                            }
                            ++n14;
                            e6 = e7;
                        }
                    }
                }
            }
        }
        
        public int e() {
            if (this.a == 1) {
                return this.m - androidx.constraintlayout.core.widgets.g.this.b2;
            }
            return this.m;
        }
        
        public int f() {
            if (this.a == 0) {
                return this.l - androidx.constraintlayout.core.widgets.g.this.a2;
            }
            return this.l;
        }
        
        public void g(int n) {
            final int p = this.p;
            if (p == 0) {
                return;
            }
            final int o = this.o;
            n /= p;
            for (int n2 = 0; n2 < o && this.n + n2 < androidx.constraintlayout.core.widgets.g.this.m2; ++n2) {
                final e e = androidx.constraintlayout.core.widgets.g.this.l2[this.n + n2];
                g g;
                b b;
                b b2;
                int d;
                int j0;
                if (this.a == 0) {
                    if (e == null || e.H() != androidx.constraintlayout.core.widgets.e.b.I || e.w != 0) {
                        continue;
                    }
                    g = androidx.constraintlayout.core.widgets.g.this;
                    b = androidx.constraintlayout.core.widgets.e.b.G;
                    b2 = e.g0();
                    d = e.D();
                    j0 = n;
                }
                else {
                    if (e == null || e.g0() != androidx.constraintlayout.core.widgets.e.b.I || e.x != 0) {
                        continue;
                    }
                    g = androidx.constraintlayout.core.widgets.g.this;
                    b = e.H();
                    j0 = e.j0();
                    b2 = androidx.constraintlayout.core.widgets.e.b.G;
                    d = n;
                }
                g.q2(e, b, j0, b2, d);
            }
            this.h();
        }
        
        public void i(final int n) {
            this.n = n;
        }
        
        public void j(final int a, final d d, final d e, final d f, final d g, final int h, final int i, final int j, final int k, final int q) {
            this.a = a;
            this.d = d;
            this.e = e;
            this.f = f;
            this.g = g;
            this.h = h;
            this.i = i;
            this.j = j;
            this.k = k;
            this.q = q;
        }
    }
}
