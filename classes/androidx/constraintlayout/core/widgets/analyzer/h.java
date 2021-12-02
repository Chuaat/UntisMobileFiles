// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core.widgets.analyzer;

import java.util.ArrayList;
import androidx.constraintlayout.core.widgets.c;
import androidx.constraintlayout.core.widgets.a;
import java.util.Iterator;
import androidx.constraintlayout.core.widgets.d;
import androidx.constraintlayout.core.widgets.f;
import androidx.constraintlayout.core.widgets.e;

public class h
{
    private static final boolean a = false;
    private static final boolean b = false;
    private static b.a c;
    private static final boolean d = true;
    private static int e;
    private static int f;
    
    static {
        h.c = new b.a();
        h.e = 0;
        h.f = 0;
    }
    
    private static boolean a(int n, final e e) {
        final e.b h = e.H();
        final e.b g0 = e.g0();
        f f;
        if (e.U() != null) {
            f = (f)e.U();
        }
        else {
            f = null;
        }
        if (f != null) {
            f.H();
            final e.b g2 = androidx.constraintlayout.core.widgets.e.b.G;
        }
        if (f != null) {
            f.g0();
            final e.b g3 = androidx.constraintlayout.core.widgets.e.b.G;
        }
        final e.b g4 = androidx.constraintlayout.core.widgets.e.b.G;
        final boolean b = false;
        Label_0163: {
            if (h != g4 && !e.C0() && h != androidx.constraintlayout.core.widgets.e.b.H) {
                final e.b i = androidx.constraintlayout.core.widgets.e.b.I;
                if (h != i || e.w != 0 || e.f0 != 0.0f || !e.o0(0)) {
                    if (h != i || e.w != 1 || !e.r0(0, e.j0())) {
                        n = 0;
                        break Label_0163;
                    }
                }
            }
            n = 1;
        }
        boolean b2 = false;
        Label_0256: {
            if (g0 != g4 && !e.D0() && g0 != androidx.constraintlayout.core.widgets.e.b.H) {
                final e.b j = androidx.constraintlayout.core.widgets.e.b.I;
                if (g0 != j || e.x != 0 || e.f0 != 0.0f || !e.o0(1)) {
                    if (h != j || e.x != 1 || !e.r0(1, e.D())) {
                        b2 = false;
                        break Label_0256;
                    }
                }
            }
            b2 = true;
        }
        if (e.f0 > 0.0f && (n != 0 || b2)) {
            return true;
        }
        boolean b3 = b;
        if (n != 0) {
            b3 = b;
            if (b2) {
                b3 = true;
            }
        }
        return b3;
    }
    
    private static void b(final int n, final e e, final b.b b, final boolean b2) {
        if (e.v0()) {
            return;
        }
        ++h.e;
        if (!(e instanceof f) && e.B0()) {
            final int n2 = n + 1;
            if (a(n2, e)) {
                androidx.constraintlayout.core.widgets.f.L2(n2, e, b, new b.a(), androidx.constraintlayout.core.widgets.analyzer.b.a.k);
            }
        }
        final d r = e.r(androidx.constraintlayout.core.widgets.d.b.H);
        final d r2 = e.r(androidx.constraintlayout.core.widgets.d.b.J);
        final int f = r.f();
        final int f2 = r2.f();
        if (r.e() != null && r.o()) {
            for (final d d : r.e()) {
                final e d2 = d.d;
                final int n3 = n + 1;
                final boolean a = a(n3, d2);
                if (d2.B0() && a) {
                    androidx.constraintlayout.core.widgets.f.L2(n3, d2, b, new b.a(), androidx.constraintlayout.core.widgets.analyzer.b.a.k);
                }
                final e.b h = d2.H();
                final e.b i = e.b.I;
                if (h == i && !a) {
                    if (d2.H() != i || d2.A < 0 || d2.z < 0 || (d2.i0() != 8 && (d2.w != 0 || d2.A() != 0.0f)) || d2.x0() || d2.A0()) {
                        continue;
                    }
                    boolean b3 = false;
                    Label_0367: {
                        Label_0358: {
                            if (d == d2.Q) {
                                final d f3 = d2.S.f;
                                if (f3 != null && f3.o()) {
                                    break Label_0358;
                                }
                            }
                            if (d == d2.S) {
                                final d f4 = d2.Q.f;
                                if (f4 != null && f4.o()) {
                                    break Label_0358;
                                }
                            }
                            b3 = false;
                            break Label_0367;
                        }
                        b3 = true;
                    }
                    if (!b3 || d2.x0()) {
                        continue;
                    }
                    g(n3, e, b, d2, b2);
                }
                else {
                    if (d2.B0()) {
                        continue;
                    }
                    final d q = d2.Q;
                    if (d == q && d2.S.f == null) {
                        final int n4 = q.g() + f;
                        d2.k1(n4, d2.j0() + n4);
                    }
                    else {
                        final d s = d2.S;
                        if (d == s && q.f == null) {
                            final int n5 = f - s.g();
                            d2.k1(n5 - d2.j0(), n5);
                        }
                        else {
                            if (d != q) {
                                continue;
                            }
                            final d f5 = s.f;
                            if (f5 != null && f5.o() && !d2.x0()) {
                                f(n3, b, d2, b2);
                                continue;
                            }
                            continue;
                        }
                    }
                    b(n3, d2, b, b2);
                }
            }
        }
        if (e instanceof androidx.constraintlayout.core.widgets.h) {
            return;
        }
        if (r2.e() != null && r2.o()) {
            for (final d d3 : r2.e()) {
                final e d4 = d3.d;
                final int n6 = n + 1;
                final boolean a2 = a(n6, d4);
                if (d4.B0() && a2) {
                    androidx.constraintlayout.core.widgets.f.L2(n6, d4, b, new b.a(), androidx.constraintlayout.core.widgets.analyzer.b.a.k);
                }
                boolean b4 = false;
                Label_0747: {
                    Label_0738: {
                        if (d3 == d4.Q) {
                            final d f6 = d4.S.f;
                            if (f6 != null && f6.o()) {
                                break Label_0738;
                            }
                        }
                        if (d3 == d4.S) {
                            final d f7 = d4.Q.f;
                            if (f7 != null && f7.o()) {
                                break Label_0738;
                            }
                        }
                        b4 = false;
                        break Label_0747;
                    }
                    b4 = true;
                }
                final e.b h2 = d4.H();
                final e.b j = e.b.I;
                if (h2 == j && !a2) {
                    if (d4.H() != j || d4.A < 0 || d4.z < 0 || (d4.i0() != 8 && (d4.w != 0 || d4.A() != 0.0f)) || d4.x0() || d4.A0() || !b4 || d4.x0()) {
                        continue;
                    }
                    g(n6, e, b, d4, b2);
                }
                else {
                    if (d4.B0()) {
                        continue;
                    }
                    final d q2 = d4.Q;
                    if (d3 == q2 && d4.S.f == null) {
                        final int n7 = q2.g() + f2;
                        d4.k1(n7, d4.j0() + n7);
                    }
                    else {
                        final d s2 = d4.S;
                        if (d3 == s2 && q2.f == null) {
                            final int n8 = f2 - s2.g();
                            d4.k1(n8 - d4.j0(), n8);
                        }
                        else {
                            if (b4 && !d4.x0()) {
                                f(n6, b, d4, b2);
                                continue;
                            }
                            continue;
                        }
                    }
                    b(n6, d4, b, b2);
                }
            }
        }
        e.J0();
    }
    
    public static String c(final int i) {
        final StringBuilder sb = new StringBuilder();
        for (int j = 0; j < i; ++j) {
            sb.append("  ");
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("+-(");
        sb2.append(i);
        sb2.append(") ");
        sb.append(sb2.toString());
        return sb.toString();
    }
    
    private static void d(int n, final a a, final b.b b, final int n2, final boolean b2) {
        if (a.g2()) {
            ++n;
            if (n2 == 0) {
                b(n, a, b, b2);
            }
            else {
                k(n, a, b);
            }
        }
    }
    
    public static boolean e(final f f, final androidx.constraintlayout.core.e e, final int n, int n2, final c c, final boolean b, final boolean b2, final boolean b3) {
        if (b3) {
            return false;
        }
        if (n == 0) {
            if (!f.C0()) {
                return false;
            }
        }
        else if (!f.D0()) {
            return false;
        }
        final boolean i2 = f.I2();
        final e c2 = c.c();
        final e g = c.g();
        final e e2 = c.e();
        final e j = c.i();
        final e f2 = c.f();
        final d d = c2.Y[n2];
        final d[] y = g.Y;
        final int n3 = n2 + 1;
        final d d2 = y[n3];
        final d f3 = d.f;
        if (f3 != null) {
            if (d2.f != null) {
                if (f3.o()) {
                    if (d2.f.o()) {
                        if (e2 != null) {
                            if (j != null) {
                                final int n4 = d.f.f() + e2.Y[n2].g();
                                final int n5 = d2.f.f() - j.Y[n3].g();
                                final int n6 = n5 - n4;
                                if (n6 <= 0) {
                                    return false;
                                }
                                final b.a a = new b.a();
                                e e3 = c2;
                                int n7 = 0;
                                int n8 = 0;
                                int n9 = 0;
                                int n10 = 0;
                                final e e4 = c2;
                                while (true) {
                                    final e e5 = null;
                                    if (n7 == 0) {
                                        if (!a(1, e3)) {
                                            return false;
                                        }
                                        if (e3.b0[n] == e.b.I) {
                                            return false;
                                        }
                                        if (e3.B0()) {
                                            f.L2(1, e3, f.A2(), a, androidx.constraintlayout.core.widgets.analyzer.b.a.k);
                                        }
                                        final int g2 = e3.Y[n2].g();
                                        int n11;
                                        if (n == 0) {
                                            n11 = e3.j0();
                                        }
                                        else {
                                            n11 = e3.D();
                                        }
                                        final int n12 = n10 + g2 + n11 + e3.Y[n3].g();
                                        ++n9;
                                        int n13 = n8;
                                        if (e3.i0() != 8) {
                                            n13 = n8 + 1;
                                        }
                                        final d f4 = e3.Y[n3].f;
                                        e e6 = e5;
                                        if (f4 != null) {
                                            final e d3 = f4.d;
                                            final d[] y2 = d3.Y;
                                            e6 = e5;
                                            if (y2[n2].f != null) {
                                                if (y2[n2].f.d != e3) {
                                                    e6 = e5;
                                                }
                                                else {
                                                    e6 = d3;
                                                }
                                            }
                                        }
                                        if (e6 != null) {
                                            e3 = e6;
                                        }
                                        else {
                                            n7 = 1;
                                        }
                                        n8 = n13;
                                        n10 = n12;
                                    }
                                    else {
                                        if (n8 == 0) {
                                            return false;
                                        }
                                        if (n8 != n9) {
                                            return false;
                                        }
                                        if (n6 < n10) {
                                            return false;
                                        }
                                        final int n14 = n6 - n10;
                                        int n15;
                                        if (b) {
                                            n15 = n14 / (n8 + 1);
                                        }
                                        else {
                                            n15 = n14;
                                            if (b2) {
                                                n15 = n14;
                                                if (n8 > 2) {
                                                    n15 = n14 / n8 - 1;
                                                }
                                            }
                                        }
                                        if (n8 == 1) {
                                            float n16;
                                            if (n == 0) {
                                                n16 = f2.E();
                                            }
                                            else {
                                                n16 = f2.d0();
                                            }
                                            n2 = (int)(n4 + 0.5f + n15 * n16);
                                            if (n == 0) {
                                                e2.k1(n2, e2.j0() + n2);
                                            }
                                            else {
                                                e2.n1(n2, e2.D() + n2);
                                            }
                                            b(1, e2, f.A2(), i2);
                                            return true;
                                        }
                                        if (b) {
                                            int n17 = n4 + n15;
                                            int k = 0;
                                            e e7 = e4;
                                            while (k == 0) {
                                                if (e7.i0() == 8) {
                                                    if (n == 0) {
                                                        e7.k1(n17, n17);
                                                        b(1, e7, f.A2(), i2);
                                                    }
                                                    else {
                                                        e7.n1(n17, n17);
                                                        k(1, e7, f.A2());
                                                    }
                                                }
                                                else {
                                                    final int n18 = n17 + e7.Y[n2].g();
                                                    int n19;
                                                    if (n == 0) {
                                                        e7.k1(n18, e7.j0() + n18);
                                                        b(1, e7, f.A2(), i2);
                                                        n19 = e7.j0();
                                                    }
                                                    else {
                                                        e7.n1(n18, e7.D() + n18);
                                                        k(1, e7, f.A2());
                                                        n19 = e7.D();
                                                    }
                                                    n17 = n18 + n19 + e7.Y[n3].g() + n15;
                                                }
                                                e7.g(e, false);
                                                final d f5 = e7.Y[n3].f;
                                                e d4 = null;
                                                Label_0914: {
                                                    if (f5 != null) {
                                                        d4 = f5.d;
                                                        final d[] y3 = d4.Y;
                                                        if (y3[n2].f != null && y3[n2].f.d == e7) {
                                                            break Label_0914;
                                                        }
                                                    }
                                                    d4 = null;
                                                }
                                                if (d4 == null) {
                                                    k = 1;
                                                    d4 = e7;
                                                }
                                                e7 = d4;
                                            }
                                        }
                                        else if (b2) {
                                            if (n8 == 2) {
                                                if (n == 0) {
                                                    e2.k1(n4, e2.j0() + n4);
                                                    j.k1(n5 - j.j0(), n5);
                                                    b(1, e2, f.A2(), i2);
                                                    b(1, j, f.A2(), i2);
                                                }
                                                else {
                                                    e2.n1(n4, e2.D() + n4);
                                                    j.n1(n5 - j.D(), n5);
                                                    k(1, e2, f.A2());
                                                    k(1, j, f.A2());
                                                }
                                                return true;
                                            }
                                            return false;
                                        }
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
    
    private static void f(final int n, final b.b b, final e e, final boolean b2) {
        float e2 = e.E();
        int f = e.Q.f.f();
        int f2 = e.S.f.f();
        final int g = e.Q.g();
        final int g2 = e.S.g();
        if (f == f2) {
            e2 = 0.5f;
        }
        else {
            f += g;
            f2 -= g2;
        }
        final int j0 = e.j0();
        int n2 = f2 - f - j0;
        if (f > f2) {
            n2 = f - f2 - j0;
        }
        float n3;
        if (n2 > 0) {
            n3 = e2 * n2 + 0.5f;
        }
        else {
            n3 = e2 * n2;
        }
        final int n4 = (int)n3 + f;
        int n5 = n4 + j0;
        if (f > f2) {
            n5 = n4 - j0;
        }
        e.k1(n4, n5);
        b(n + 1, e, b, b2);
    }
    
    private static void g(final int n, e u, final b.b b, final e e, final boolean b2) {
        final float e2 = e.E();
        final int n2 = e.Q.f.f() + e.Q.g();
        final int n3 = e.S.f.f() - e.S.g();
        if (n3 >= n2) {
            int n5;
            final int n4 = n5 = e.j0();
            if (e.i0() != 8) {
                final int w = e.w;
                int b3;
                if (w == 2) {
                    if (!(u instanceof f)) {
                        u = u.U();
                    }
                    b3 = (int)(e.E() * 0.5f * u.j0());
                }
                else {
                    b3 = n4;
                    if (w == 0) {
                        b3 = n3 - n2;
                    }
                }
                final int max = Math.max(e.z, b3);
                final int a = e.A;
                n5 = max;
                if (a > 0) {
                    n5 = Math.min(a, max);
                }
            }
            final int n6 = n2 + (int)(e2 * (n3 - n2 - n5) + 0.5f);
            e.k1(n6, n5 + n6);
            b(n + 1, e, b, b2);
        }
    }
    
    private static void h(final int n, final b.b b, final e e) {
        float d0 = e.d0();
        int f = e.R.f.f();
        int f2 = e.T.f.f();
        final int g = e.R.g();
        final int g2 = e.T.g();
        if (f == f2) {
            d0 = 0.5f;
        }
        else {
            f += g;
            f2 -= g2;
        }
        final int d2 = e.D();
        int n2 = f2 - f - d2;
        if (f > f2) {
            n2 = f - f2 - d2;
        }
        float n3;
        if (n2 > 0) {
            n3 = d0 * n2 + 0.5f;
        }
        else {
            n3 = d0 * n2;
        }
        final int n4 = (int)n3;
        int n5 = f + n4;
        int n6 = n5 + d2;
        if (f > f2) {
            n5 = f - n4;
            n6 = n5 - d2;
        }
        e.n1(n5, n6);
        k(n + 1, e, b);
    }
    
    private static void i(final int n, e u, final b.b b, final e e) {
        final float d0 = e.d0();
        final int n2 = e.R.f.f() + e.R.g();
        final int n3 = e.T.f.f() - e.T.g();
        if (n3 >= n2) {
            int n5;
            final int n4 = n5 = e.D();
            if (e.i0() != 8) {
                final int x = e.x;
                int b2;
                if (x == 2) {
                    if (!(u instanceof f)) {
                        u = u.U();
                    }
                    b2 = (int)(d0 * 0.5f * u.D());
                }
                else {
                    b2 = n4;
                    if (x == 0) {
                        b2 = n3 - n2;
                    }
                }
                final int max = Math.max(e.C, b2);
                final int d2 = e.D;
                n5 = max;
                if (d2 > 0) {
                    n5 = Math.min(d2, max);
                }
            }
            final int n6 = n2 + (int)(d0 * (n3 - n2 - n5) + 0.5f);
            e.n1(n6, n5 + n6);
            k(n + 1, e, b);
        }
    }
    
    public static void j(final f f, final b.b b) {
        final e.b h = f.H();
        final e.b g0 = f.g0();
        androidx.constraintlayout.core.widgets.analyzer.h.e = 0;
        androidx.constraintlayout.core.widgets.analyzer.h.f = 0;
        f.R0();
        final ArrayList<e> f2 = f.f2();
        final int size = f2.size();
        for (int i = 0; i < size; ++i) {
            f2.get(i).R0();
        }
        final boolean i2 = f.I2();
        if (h == androidx.constraintlayout.core.widgets.e.b.G) {
            f.k1(0, f.j0());
        }
        else {
            f.l1(0);
        }
        int j = 0;
        int n = 0;
        int n2 = 0;
        while (j < size) {
            final e e = f2.get(j);
            int n3;
            int n4;
            if (e instanceof androidx.constraintlayout.core.widgets.h) {
                final androidx.constraintlayout.core.widgets.h h2 = (androidx.constraintlayout.core.widgets.h)e;
                n3 = n;
                n4 = n2;
                if (h2.g2() == 1) {
                    Label_0228: {
                        int h3;
                        if (h2.h2() != -1) {
                            h3 = h2.h2();
                        }
                        else if (h2.j2() != -1 && f.C0()) {
                            h3 = f.j0() - h2.j2();
                        }
                        else {
                            if (!f.C0()) {
                                break Label_0228;
                            }
                            h3 = (int)(h2.k2() * f.j0() + 0.5f);
                        }
                        h2.p2(h3);
                    }
                    n3 = 1;
                    n4 = n2;
                }
            }
            else {
                n3 = n;
                n4 = n2;
                if (e instanceof a) {
                    n3 = n;
                    n4 = n2;
                    if (((a)e).l2() == 0) {
                        n4 = 1;
                        n3 = n;
                    }
                }
            }
            ++j;
            n = n3;
            n2 = n4;
        }
        if (n != 0) {
            for (int k = 0; k < size; ++k) {
                final e e2 = f2.get(k);
                if (e2 instanceof androidx.constraintlayout.core.widgets.h) {
                    final androidx.constraintlayout.core.widgets.h h4 = (androidx.constraintlayout.core.widgets.h)e2;
                    if (h4.g2() == 1) {
                        b(0, h4, b, i2);
                    }
                }
            }
        }
        b(0, f, b, i2);
        if (n2 != 0) {
            for (int l = 0; l < size; ++l) {
                final e e3 = f2.get(l);
                if (e3 instanceof a) {
                    final a a = (a)e3;
                    if (a.l2() == 0) {
                        d(0, a, b, 0, i2);
                    }
                }
            }
        }
        if (g0 == androidx.constraintlayout.core.widgets.e.b.G) {
            f.n1(0, f.D());
        }
        else {
            f.m1(0);
        }
        int index = 0;
        int n5 = 0;
        int n6 = 0;
        while (index < size) {
            final e e4 = f2.get(index);
            int n7;
            int n8;
            if (e4 instanceof androidx.constraintlayout.core.widgets.h) {
                final androidx.constraintlayout.core.widgets.h h5 = (androidx.constraintlayout.core.widgets.h)e4;
                n7 = n5;
                n8 = n6;
                if (h5.g2() == 0) {
                    Label_0577: {
                        int h6;
                        if (h5.h2() != -1) {
                            h6 = h5.h2();
                        }
                        else if (h5.j2() != -1 && f.D0()) {
                            h6 = f.D() - h5.j2();
                        }
                        else {
                            if (!f.D0()) {
                                break Label_0577;
                            }
                            h6 = (int)(h5.k2() * f.D() + 0.5f);
                        }
                        h5.p2(h6);
                    }
                    n7 = 1;
                    n8 = n6;
                }
            }
            else {
                n7 = n5;
                n8 = n6;
                if (e4 instanceof a) {
                    n7 = n5;
                    n8 = n6;
                    if (((a)e4).l2() == 1) {
                        n8 = 1;
                        n7 = n5;
                    }
                }
            }
            ++index;
            n5 = n7;
            n6 = n8;
        }
        if (n5 != 0) {
            for (int index2 = 0; index2 < size; ++index2) {
                final e e5 = f2.get(index2);
                if (e5 instanceof androidx.constraintlayout.core.widgets.h) {
                    final androidx.constraintlayout.core.widgets.h h7 = (androidx.constraintlayout.core.widgets.h)e5;
                    if (h7.g2() == 0) {
                        k(1, h7, b);
                    }
                }
            }
        }
        k(0, f, b);
        if (n6 != 0) {
            for (int index3 = 0; index3 < size; ++index3) {
                final e e6 = f2.get(index3);
                if (e6 instanceof a) {
                    final a a2 = (a)e6;
                    if (a2.l2() == 1) {
                        d(0, a2, b, 1, i2);
                    }
                }
            }
        }
        for (int index4 = 0; index4 < size; ++index4) {
            final e e7 = f2.get(index4);
            if (e7.B0() && a(0, e7)) {
                f.L2(0, e7, b, androidx.constraintlayout.core.widgets.analyzer.h.c, androidx.constraintlayout.core.widgets.analyzer.b.a.k);
                if (e7 instanceof androidx.constraintlayout.core.widgets.h) {
                    if (((androidx.constraintlayout.core.widgets.h)e7).g2() != 0) {
                        b(0, e7, b, i2);
                        continue;
                    }
                }
                else {
                    b(0, e7, b, i2);
                }
                k(0, e7, b);
            }
        }
    }
    
    private static void k(final int n, final e e, final b.b b) {
        if (e.H0()) {
            return;
        }
        ++h.f;
        int f = 0;
        if (!(e instanceof f) && e.B0()) {
            f = n + 1;
            if (a(f, e)) {
                androidx.constraintlayout.core.widgets.f.L2(f, e, b, new b.a(), androidx.constraintlayout.core.widgets.analyzer.b.a.k);
            }
        }
        final d r = e.r(androidx.constraintlayout.core.widgets.d.b.I);
        final d r2 = e.r(androidx.constraintlayout.core.widgets.d.b.K);
        final int f2 = r.f();
        final int f3 = r2.f();
        if (r.e() != null && r.o()) {
            for (final d d : r.e()) {
                final e d2 = d.d;
                final int n2 = n + 1;
                final boolean a = a(n2, d2);
                if (d2.B0() && a) {
                    androidx.constraintlayout.core.widgets.f.L2(n2, d2, b, new b.a(), androidx.constraintlayout.core.widgets.analyzer.b.a.k);
                }
                final e.b g0 = d2.g0();
                final e.b i = e.b.I;
                if (g0 == i && !a) {
                    if (d2.g0() != i || d2.D < 0 || d2.C < 0 || (d2.i0() != 8 && (d2.x != 0 || d2.A() != 0.0f)) || d2.z0() || d2.A0()) {
                        continue;
                    }
                    Label_0362: {
                        Label_0355: {
                            if (d == d2.R) {
                                final d f4 = d2.T.f;
                                if (f4 != null && f4.o()) {
                                    break Label_0355;
                                }
                            }
                            if (d == d2.T) {
                                final d f5 = d2.R.f;
                                if (f5 != null && f5.o()) {
                                    break Label_0355;
                                }
                            }
                            f = 0;
                            break Label_0362;
                        }
                        f = 1;
                    }
                    if (f == 0 || d2.z0()) {
                        continue;
                    }
                    i(n2, e, b, d2);
                }
                else {
                    if (d2.B0()) {
                        continue;
                    }
                    final d r3 = d2.R;
                    if (d == r3 && d2.T.f == null) {
                        f = r3.g() + f2;
                        d2.n1(f, d2.D() + f);
                    }
                    else {
                        final d t = d2.T;
                        if (d == t && t.f == null) {
                            f = f2 - t.g();
                            d2.n1(f - d2.D(), f);
                        }
                        else {
                            if (d != r3) {
                                continue;
                            }
                            final d f6 = t.f;
                            if (f6 != null && f6.o()) {
                                h(n2, b, d2);
                                continue;
                            }
                            continue;
                        }
                    }
                    k(n2, d2, b);
                }
            }
        }
        if (e instanceof androidx.constraintlayout.core.widgets.h) {
            return;
        }
        if (r2.e() != null && r2.o()) {
            for (final d d3 : r2.e()) {
                final e d4 = d3.d;
                final int n3 = n + 1;
                final boolean a2 = a(n3, d4);
                if (d4.B0() && a2) {
                    androidx.constraintlayout.core.widgets.f.L2(n3, d4, b, new b.a(), androidx.constraintlayout.core.widgets.analyzer.b.a.k);
                }
                Label_0722: {
                    Label_0715: {
                        if (d3 == d4.R) {
                            final d f7 = d4.T.f;
                            if (f7 != null && f7.o()) {
                                break Label_0715;
                            }
                        }
                        if (d3 == d4.T) {
                            final d f8 = d4.R.f;
                            if (f8 != null && f8.o()) {
                                break Label_0715;
                            }
                        }
                        f = 0;
                        break Label_0722;
                    }
                    f = 1;
                }
                final e.b g2 = d4.g0();
                final e.b j = e.b.I;
                if (g2 == j && !a2) {
                    if (d4.g0() != j || d4.D < 0 || d4.C < 0 || (d4.i0() != 8 && (d4.x != 0 || d4.A() != 0.0f)) || d4.z0() || d4.A0() || f == 0 || d4.z0()) {
                        continue;
                    }
                    i(n3, e, b, d4);
                }
                else {
                    if (d4.B0()) {
                        continue;
                    }
                    final d r4 = d4.R;
                    if (d3 == r4 && d4.T.f == null) {
                        f = r4.g() + f3;
                        d4.n1(f, d4.D() + f);
                    }
                    else {
                        final d t2 = d4.T;
                        if (d3 == t2 && r4.f == null) {
                            f = f3 - t2.g();
                            d4.n1(f - d4.D(), f);
                        }
                        else {
                            if (f != 0 && !d4.z0()) {
                                h(n3, b, d4);
                                continue;
                            }
                            continue;
                        }
                    }
                    k(n3, d4, b);
                }
            }
        }
        Object o = e.r(androidx.constraintlayout.core.widgets.d.b.L);
        Label_1158: {
            if (((d)o).e() == null || !((d)o).o()) {
                break Label_1158;
            }
            f = ((d)o).f();
            while (true) {
                o = ((d)o).e().iterator();
                d d5 = null;
                e d6 = null;
                int n4 = 0;
                Block_68: {
                    while (((Iterator)o).hasNext()) {
                        d5 = ((Iterator<d>)o).next();
                        d6 = d5.d;
                        n4 = n + 1;
                        final boolean a3 = a(n4, d6);
                        if (d6.B0() && a3) {
                            androidx.constraintlayout.core.widgets.f.L2(n4, d6, b, new b.a(), androidx.constraintlayout.core.widgets.analyzer.b.a.k);
                        }
                        if (d6.g0() != e.b.I || a3) {
                            if (d6.B0()) {
                                continue;
                            }
                            if (d5 == d6.U) {
                                break Block_68;
                            }
                            continue;
                        }
                    }
                    break Label_1158;
                }
                d6.i1(d5.g() + f);
                try {
                    k(n4, d6, b);
                    continue;
                    e.K0();
                }
                finally {}
                break;
            }
        }
    }
}
