// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.i;
import androidx.constraintlayout.core.widgets.d;
import androidx.constraintlayout.core.widgets.k;
import androidx.constraintlayout.core.widgets.m;
import androidx.constraintlayout.core.widgets.a;
import androidx.constraintlayout.core.widgets.h;
import androidx.constraintlayout.core.widgets.f;
import androidx.constraintlayout.core.widgets.e;
import java.util.ArrayList;

public class b
{
    private static final boolean d = false;
    private static final int e = 30;
    public static final int f = 0;
    public static final int g = 1073741824;
    public static final int h = Integer.MIN_VALUE;
    public static final int i = -1;
    public static final int j = -2;
    public static final int k = -3;
    private final ArrayList<e> a;
    private a b;
    private f c;
    
    public b(final f c) {
        this.a = new ArrayList<e>();
        this.b = new a();
        this.c = c;
    }
    
    private boolean a(final b b, final e e, int j) {
        this.b.a = e.H();
        this.b.b = e.g0();
        this.b.c = e.j0();
        this.b.d = e.D();
        final a b2 = this.b;
        b2.i = false;
        b2.j = j;
        final e.b a = b2.a;
        final e.b i = e.b.I;
        final boolean b3 = a == i;
        if (b2.b == i) {
            j = 1;
        }
        else {
            j = 0;
        }
        final boolean b4 = b3 && e.f0 > 0.0f;
        if (j != 0 && e.f0 > 0.0f) {
            j = 1;
        }
        else {
            j = 0;
        }
        if (b4 && e.y[0] == 4) {
            b2.a = e.b.G;
        }
        if (j != 0 && e.y[1] == 4) {
            b2.b = e.b.G;
        }
        b.b(e, b2);
        e.W1(this.b.e);
        e.s1(this.b.f);
        e.r1(this.b.h);
        e.a1(this.b.g);
        final a b5 = this.b;
        b5.j = androidx.constraintlayout.core.widgets.analyzer.b.a.k;
        return b5.i;
    }
    
    private void b(final f f) {
        final int size = f.z1.size();
        final boolean m2 = f.M2(64);
        final b a2 = f.A2();
        for (int i = 0; i < size; ++i) {
            final e e = f.z1.get(i);
            if (!(e instanceof h)) {
                if (!(e instanceof androidx.constraintlayout.core.widgets.a)) {
                    if (!e.A0()) {
                        if (m2) {
                            final l e2 = e.e;
                            if (e2 != null) {
                                final n f2 = e.f;
                                if (f2 != null && e2.e.j && f2.e.j) {
                                    continue;
                                }
                            }
                        }
                        final e.b z = e.z(0);
                        final int n = 1;
                        final e.b z2 = e.z(1);
                        final e.b j = androidx.constraintlayout.core.widgets.e.b.I;
                        final boolean b = z == j && e.w != 1 && z2 == j && e.x != 1;
                        int n2 = 0;
                        Label_0365: {
                            if ((n2 = (b ? 1 : 0)) == 0) {
                                n2 = (b ? 1 : 0);
                                if (f.M2(1)) {
                                    n2 = (b ? 1 : 0);
                                    if (!(e instanceof m)) {
                                        int n3 = b ? 1 : 0;
                                        if (z == j) {
                                            n3 = (b ? 1 : 0);
                                            if (e.w == 0) {
                                                n3 = (b ? 1 : 0);
                                                if (z2 != j) {
                                                    n3 = (b ? 1 : 0);
                                                    if (!e.x0()) {
                                                        n3 = 1;
                                                    }
                                                }
                                            }
                                        }
                                        int n4 = n3;
                                        if (z2 == j) {
                                            n4 = n3;
                                            if (e.x == 0) {
                                                n4 = n3;
                                                if (z != j) {
                                                    n4 = n3;
                                                    if (!e.x0()) {
                                                        n4 = 1;
                                                    }
                                                }
                                            }
                                        }
                                        if (z != j) {
                                            n2 = n4;
                                            if (z2 != j) {
                                                break Label_0365;
                                            }
                                        }
                                        n2 = n4;
                                        if (e.f0 > 0.0f) {
                                            n2 = n;
                                        }
                                    }
                                }
                            }
                        }
                        if (n2 == 0) {
                            this.a(a2, e, androidx.constraintlayout.core.widgets.analyzer.b.a.k);
                            final androidx.constraintlayout.core.f f3 = f.F1;
                            if (f3 != null) {
                                ++f3.c;
                            }
                        }
                    }
                }
            }
        }
        a2.a();
    }
    
    private void c(final f f, final String s, final int n, final int n2, final int n3) {
        final int q = f.Q();
        final int p5 = f.P();
        f.J1(0);
        f.I1(0);
        f.W1(n2);
        f.s1(n3);
        f.J1(q);
        f.I1(p5);
        this.c.R2(n);
        this.c.h2();
    }
    
    public long d(final f f, int n, int a, int b2, int n2, int j0, int i, int b3, int n3, int size) {
        final b a2 = f.A2();
        size = f.z1.size();
        final int j2 = f.j0();
        final int d = f.D();
        final boolean b4 = androidx.constraintlayout.core.widgets.k.b(n, 128);
        if (!b4 && !androidx.constraintlayout.core.widgets.k.b(n, 64)) {
            n = 0;
        }
        else {
            n = 1;
        }
        b2 = n;
        Label_0238: {
            if (n != 0) {
                a = 0;
                while (true) {
                    b2 = n;
                    if (a >= size) {
                        break Label_0238;
                    }
                    final e e = f.z1.get(a);
                    final e.b h = e.H();
                    final e.b k = androidx.constraintlayout.core.widgets.e.b.I;
                    if (h == k) {
                        b2 = 1;
                    }
                    else {
                        b2 = 0;
                    }
                    if (e.g0() == k) {
                        n3 = 1;
                    }
                    else {
                        n3 = 0;
                    }
                    if (b2 != 0 && n3 != 0 && e.A() > 0.0f) {
                        b2 = 1;
                    }
                    else {
                        b2 = 0;
                    }
                    if (e.x0() && b2 != 0) {
                        break;
                    }
                    if (e.z0() && b2 != 0) {
                        break;
                    }
                    if (e instanceof m) {
                        break;
                    }
                    if (e.x0()) {
                        break;
                    }
                    if (e.z0()) {
                        break;
                    }
                    ++a;
                }
                b2 = 0;
            }
        }
        if (b2 != 0) {
            final androidx.constraintlayout.core.f c = androidx.constraintlayout.core.e.C;
            if (c != null) {
                ++c.e;
            }
        }
        if ((n2 == 1073741824 && i == 1073741824) || b4) {
            n = 1;
        }
        else {
            n = 0;
        }
        final int n4 = b2 & n;
        boolean b6;
        if (n4 != 0) {
            n = Math.min(f.O(), j0);
            a = Math.min(f.N(), b3);
            if (n2 == 1073741824 && f.j0() != n) {
                f.W1(n);
                f.F2();
            }
            if (i == 1073741824 && f.D() != a) {
                f.s1(a);
                f.F2();
            }
            boolean b5;
            if (n2 == 1073741824 && i == 1073741824) {
                b5 = f.v2(b4);
                n = 2;
            }
            else {
                b5 = f.w2(b4);
                if (n2 == 1073741824) {
                    b5 &= f.x2(b4, 0);
                    n = 1;
                }
                else {
                    n = 0;
                }
                if (i == 1073741824) {
                    b5 &= f.x2(b4, 1);
                    ++n;
                }
            }
            b6 = b5;
            a = n;
            if (b5) {
                f.c2(n2 == 1073741824, i == 1073741824);
                b6 = b5;
                a = n;
            }
        }
        else {
            b6 = false;
            a = 0;
        }
        if (!b6 || a != 2) {
            b2 = f.B2();
            if (size > 0) {
                this.b(f);
            }
            this.e(f);
            b3 = this.a.size();
            if (size > 0) {
                this.c(f, "First pass", 0, j2, d);
            }
            if (b3 > 0) {
                final e.b h2 = f.H();
                final e.b h3 = androidx.constraintlayout.core.widgets.e.b.H;
                if (h2 == h3) {
                    n3 = 1;
                }
                else {
                    n3 = 0;
                }
                if (f.g0() == h3) {
                    size = 1;
                }
                else {
                    size = 0;
                }
                a = Math.max(f.j0(), this.c.Q());
                n = Math.max(f.D(), this.c.P());
                i = 0;
                n2 = 0;
                while (i < b3) {
                    final e e2 = this.a.get(i);
                    if (!(e2 instanceof m)) {
                        j0 = n2;
                    }
                    else {
                        final int j3 = e2.j0();
                        final int d2 = e2.D();
                        final boolean a3 = this.a(a2, e2, androidx.constraintlayout.core.widgets.analyzer.b.a.l);
                        final androidx.constraintlayout.core.f f2 = f.F1;
                        if (f2 != null) {
                            ++f2.d;
                        }
                        j0 = e2.j0();
                        final int d3 = e2.D();
                        if (j0 != j3) {
                            e2.W1(j0);
                            n2 = a;
                            if (n3 != 0 && e2.X() > (n2 = a)) {
                                n2 = Math.max(a, e2.X() + e2.r(androidx.constraintlayout.core.widgets.d.b.J).g());
                            }
                            j0 = 1;
                            a = n2;
                        }
                        else {
                            j0 = ((a3 ? 1 : 0) | n2);
                        }
                        n2 = n;
                        if (d3 != d2) {
                            e2.s1(d3);
                            n2 = n;
                            if (size != 0 && e2.v() > (n2 = n)) {
                                n2 = Math.max(n, e2.v() + e2.r(androidx.constraintlayout.core.widgets.d.b.K).g());
                            }
                            j0 = 1;
                        }
                        j0 |= (((m)e2).s2() ? 1 : 0);
                        n = n2;
                    }
                    ++i;
                    n2 = j0;
                }
                int l = 0;
                i = n2;
                n2 = b3;
                j0 = n4;
                while (l < 2) {
                    int n5;
                    for (int index = 0; index < n2; ++index, a = n5, i = b3) {
                        final e e3 = this.a.get(index);
                        if (!(e3 instanceof i) || e3 instanceof m) {
                            if (!(e3 instanceof h)) {
                                if (e3.i0() != 8) {
                                    if (j0 == 0 || !e3.e.e.j || !e3.f.e.j) {
                                        if (!(e3 instanceof m)) {
                                            final int j4 = e3.j0();
                                            final int d4 = e3.D();
                                            final int t = e3.t();
                                            b3 = androidx.constraintlayout.core.widgets.analyzer.b.a.l;
                                            if (l == 1) {
                                                b3 = androidx.constraintlayout.core.widgets.analyzer.b.a.m;
                                            }
                                            b3 = ((this.a(a2, e3, b3) ? 1 : 0) | i);
                                            final androidx.constraintlayout.core.f f3 = f.F1;
                                            if (f3 != null) {
                                                ++f3.d;
                                            }
                                            final int j5 = e3.j0();
                                            final int d5 = e3.D();
                                            i = a;
                                            if (j5 != j4) {
                                                e3.W1(j5);
                                                i = a;
                                                if (n3 != 0 && e3.X() > (i = a)) {
                                                    i = Math.max(a, e3.X() + e3.r(androidx.constraintlayout.core.widgets.d.b.J).g());
                                                }
                                                b3 = 1;
                                            }
                                            a = n;
                                            if (d5 != d4) {
                                                e3.s1(d5);
                                                a = n;
                                                if (size != 0 && e3.v() > (a = n)) {
                                                    a = Math.max(n, e3.v() + e3.r(androidx.constraintlayout.core.widgets.d.b.K).g());
                                                }
                                                b3 = 1;
                                            }
                                            if (e3.n0() && t != e3.t()) {
                                                b3 = 1;
                                                n5 = i;
                                                n = a;
                                                continue;
                                            }
                                            n = a;
                                            n5 = i;
                                            continue;
                                        }
                                    }
                                }
                            }
                        }
                        n5 = a;
                        b3 = i;
                    }
                    if (i == 0) {
                        break;
                    }
                    ++l;
                    this.c(f, "intermediate pass", l, j2, d);
                    i = 0;
                }
                n = b2;
            }
            else {
                n = b2;
            }
            f.P2(n);
        }
        return 0L;
    }
    
    public void e(final f f) {
        this.a.clear();
        for (int size = f.z1.size(), i = 0; i < size; ++i) {
            final e e = f.z1.get(i);
            final e.b h = e.H();
            final e.b j = androidx.constraintlayout.core.widgets.e.b.I;
            if (h == j || e.g0() == j) {
                this.a.add(e);
            }
        }
        f.F2();
    }
    
    public static class a
    {
        public static int k = 0;
        public static int l = 1;
        public static int m = 2;
        public e.b a;
        public e.b b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public boolean h;
        public boolean i;
        public int j;
    }
    
    public interface b
    {
        void a();
        
        void b(final e p0, final a p1);
    }
}
