// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core.widgets;

import java.util.ArrayList;
import androidx.constraintlayout.core.i;
import androidx.constraintlayout.core.e;

public class b
{
    private static final boolean a = false;
    public static final boolean b = false;
    
    static void a(final f f, final e e, int n, int g, final c c) {
        final int n2 = n;
        final androidx.constraintlayout.core.widgets.e a = c.a;
        final androidx.constraintlayout.core.widgets.e c2 = c.c;
        final androidx.constraintlayout.core.widgets.e b = c.b;
        final androidx.constraintlayout.core.widgets.e d = c.d;
        final androidx.constraintlayout.core.widgets.e e2 = c.e;
        final float k = c.k;
        final boolean b2 = f.b0[n2] == androidx.constraintlayout.core.widgets.e.b.H;
        int n5 = 0;
        int n6 = 0;
        boolean b3 = false;
        Label_0192: {
            Label_0189: {
                int n3;
                int n4;
                if (n2 == 0) {
                    final int i0 = e2.I0;
                    if (i0 == 0) {
                        n3 = 1;
                    }
                    else {
                        n3 = 0;
                    }
                    if (i0 == 1) {
                        n4 = 1;
                    }
                    else {
                        n4 = 0;
                    }
                    n5 = n3;
                    n6 = n4;
                    if (i0 != 2) {
                        break Label_0189;
                    }
                }
                else {
                    final int j0 = e2.J0;
                    if (j0 == 0) {
                        n3 = 1;
                    }
                    else {
                        n3 = 0;
                    }
                    if (j0 == 1) {
                        n4 = 1;
                    }
                    else {
                        n4 = 0;
                    }
                    n5 = n3;
                    n6 = n4;
                    if (j0 != 2) {
                        break Label_0189;
                    }
                }
                b3 = true;
                n5 = n3;
                n6 = n4;
                break Label_0192;
            }
            b3 = false;
        }
        androidx.constraintlayout.core.widgets.e e3 = a;
        int n7 = 0;
        final int n8 = n5;
        i l;
        while (true) {
            l = null;
            final androidx.constraintlayout.core.widgets.e e4 = null;
            if (n7 != 0) {
                break;
            }
            final d d2 = e3.Y[g];
            int n9;
            if (b3) {
                n9 = 1;
            }
            else {
                n9 = 4;
            }
            final int g2 = d2.g();
            final androidx.constraintlayout.core.widgets.e.b b4 = e3.b0[n2];
            final androidx.constraintlayout.core.widgets.e.b m = androidx.constraintlayout.core.widgets.e.b.I;
            final boolean b5 = b4 == m && e3.y[n2] == 0;
            final d f2 = d2.f;
            int n10 = g2;
            if (f2 != null) {
                n10 = g2;
                if (e3 != a) {
                    n10 = g2 + f2.g();
                }
            }
            if (b3 && e3 != a && e3 != b) {
                n9 = 8;
            }
            final d f3 = d2.f;
            if (f3 != null) {
                if (e3 == b) {
                    e.i(d2.i, f3.i, n10, 6);
                }
                else {
                    e.i(d2.i, f3.i, n10, 8);
                }
                int n11 = n9;
                if (b5) {
                    n11 = n9;
                    if (!b3) {
                        n11 = 5;
                    }
                }
                if (e3 == b && b3 && e3.w0(n2)) {
                    n11 = 5;
                }
                e.e(d2.i, d2.f.i, n10, n11);
            }
            if (b2) {
                if (e3.i0() != 8 && e3.b0[n2] == m) {
                    final d[] y = e3.Y;
                    e.i(y[g + 1].i, y[g].i, 0, 5);
                }
                e.i(e3.Y[g].i, f.Y[g].i, 0, 8);
            }
            final d f4 = e3.Y[g + 1].f;
            androidx.constraintlayout.core.widgets.e e5 = e4;
            if (f4 != null) {
                final androidx.constraintlayout.core.widgets.e d3 = f4.d;
                final d[] y2 = d3.Y;
                e5 = e4;
                if (y2[g].f != null) {
                    if (y2[g].f.d != e3) {
                        e5 = e4;
                    }
                    else {
                        e5 = d3;
                    }
                }
            }
            if (e5 != null) {
                e3 = e5;
            }
            else {
                n7 = 1;
            }
        }
        if (d != null) {
            final d[] y3 = c2.Y;
            final int n12 = g + 1;
            if (y3[n12].f != null) {
                final d d4 = d.Y[n12];
                Label_0825: {
                    if (d.b0[n2] == androidx.constraintlayout.core.widgets.e.b.I && d.y[n2] == 0 && !b3) {
                        final d f5 = d4.f;
                        if (f5.d == f) {
                            e.e(d4.i, f5.i, -d4.g(), 5);
                            break Label_0825;
                        }
                    }
                    if (b3) {
                        final d f6 = d4.f;
                        if (f6.d == f) {
                            e.e(d4.i, f6.i, -d4.g(), 4);
                        }
                    }
                }
                e.k(d4.i, c2.Y[n12].f.i, -d4.g(), 6);
            }
        }
        if (b2) {
            final d[] y4 = f.Y;
            final int n13 = g + 1;
            final i i2 = y4[n13].i;
            final d[] y5 = c2.Y;
            e.i(i2, y5[n13].i, y5[n13].g(), 8);
        }
        final ArrayList<androidx.constraintlayout.core.widgets.e> h = c.h;
        if (h != null) {
            final int size = h.size();
            if (size > 1) {
                float n14;
                if (c.r && !c.t) {
                    n14 = (float)c.j;
                }
                else {
                    n14 = k;
                }
                androidx.constraintlayout.core.widgets.e e6 = null;
                int index = 0;
                float n15 = 0.0f;
                while (index < size) {
                    final androidx.constraintlayout.core.widgets.e e7 = h.get(index);
                    float n16 = e7.M0[n2];
                    Label_1201: {
                        Label_1093: {
                            if (n16 < 0.0f) {
                                if (c.t) {
                                    final d[] y6 = e7.Y;
                                    e.e(y6[g + 1].i, y6[g].i, 0, 4);
                                    break Label_1093;
                                }
                                n16 = 1.0f;
                            }
                            if (n16 != 0.0f) {
                                if (e6 != null) {
                                    final d[] y7 = e6.Y;
                                    final i i3 = y7[g].i;
                                    final int n17 = g + 1;
                                    final i i4 = y7[n17].i;
                                    final d[] y8 = e7.Y;
                                    final i i5 = y8[g].i;
                                    final i i6 = y8[n17].i;
                                    final androidx.constraintlayout.core.b v = e.v();
                                    v.p(n15, n14, n16, i3, i4, i5, i6);
                                    e.d(v);
                                }
                                e6 = e7;
                                break Label_1201;
                            }
                            final d[] y9 = e7.Y;
                            e.e(y9[g + 1].i, y9[g].i, 0, 8);
                        }
                        n16 = n15;
                    }
                    ++index;
                    n15 = n16;
                }
            }
        }
        if (b != null && (b == d || b3)) {
            final d d5 = a.Y[g];
            final d[] y10 = c2.Y;
            n = g + 1;
            d d6 = y10[n];
            final d f7 = d5.f;
            i i7;
            if (f7 != null) {
                i7 = f7.i;
            }
            else {
                i7 = null;
            }
            final d f8 = d6.f;
            i i8;
            if (f8 != null) {
                i8 = f8.i;
            }
            else {
                i8 = null;
            }
            final d d7 = b.Y[g];
            if (d != null) {
                d6 = d.Y[n];
            }
            if (i7 != null && i8 != null) {
                float n18;
                if (n2 == 0) {
                    n18 = e2.q0;
                }
                else {
                    n18 = e2.r0;
                }
                final int g3 = d7.g();
                n = d6.g();
                e.c(d7.i, i7, g3, n18, i8, d6.i, n, 7);
            }
        }
        else if (n8 != 0 && b != null) {
            n = c.j;
            final boolean b6 = n > 0 && c.i == n;
            androidx.constraintlayout.core.widgets.e e9;
            androidx.constraintlayout.core.widgets.e e10;
            for (androidx.constraintlayout.core.widgets.e e8 = e9 = b; e9 != null; e9 = e10) {
                for (e10 = e9.O0[n2]; e10 != null && e10.i0() == 8; e10 = e10.O0[n2]) {}
                if (e10 != null || e9 == d) {
                    final d d8 = e9.Y[g];
                    final i i9 = d8.i;
                    final d f9 = d8.f;
                    i i10;
                    if (f9 != null) {
                        i10 = f9.i;
                    }
                    else {
                        i10 = null;
                    }
                    Label_1600: {
                        d f10;
                        if (e8 != e9) {
                            f10 = e8.Y[g + 1];
                        }
                        else {
                            if (e9 != b) {
                                break Label_1600;
                            }
                            final d[] y11 = a.Y;
                            if (y11[g].f == null) {
                                i10 = null;
                                break Label_1600;
                            }
                            f10 = y11[g].f;
                        }
                        i10 = f10.i;
                    }
                    final int g4 = d8.g();
                    final d[] y12 = e9.Y;
                    final int n19 = g + 1;
                    final int g5 = y12[n19].g();
                    d f11 = null;
                    i i11 = null;
                    Label_1687: {
                        d d9;
                        if (e10 != null) {
                            d9 = e10.Y[g];
                        }
                        else {
                            f11 = c2.Y[n19].f;
                            if (f11 == null) {
                                i11 = null;
                                break Label_1687;
                            }
                            d9 = f11;
                        }
                        final i i12 = d9.i;
                        f11 = d9;
                        i11 = i12;
                    }
                    final i i13 = e9.Y[n19].i;
                    n = g5;
                    if (f11 != null) {
                        n = g5 + f11.g();
                    }
                    int g6 = g4 + e8.Y[n19].g();
                    if (i9 != null && i10 != null && i11 != null && i13 != null) {
                        if (e9 == b) {
                            g6 = b.Y[g].g();
                        }
                        if (e9 == d) {
                            n = d.Y[n19].g();
                        }
                        int n20;
                        if (b6) {
                            n20 = 8;
                        }
                        else {
                            n20 = 5;
                        }
                        e.c(i9, i10, g6, 0.5f, i11, i13, n, n20);
                    }
                }
                if (e9.i0() == 8) {
                    e9 = e8;
                }
                e8 = e9;
            }
        }
        else if (n6 != 0 && b != null) {
            final int j2 = c.j;
            final boolean b7 = j2 > 0 && c.i == j2;
            androidx.constraintlayout.core.widgets.e e12;
            androidx.constraintlayout.core.widgets.e e11 = e12 = b;
            while (true) {
                final int n21 = n;
                if (e12 == null) {
                    break;
                }
                androidx.constraintlayout.core.widgets.e e13;
                for (e13 = e12.O0[n21]; e13 != null && e13.i0() == 8; e13 = e13.O0[n21]) {}
                if (e12 != b && e12 != d && e13 != null) {
                    if (e13 == d) {
                        e13 = null;
                    }
                    final d d10 = e12.Y[g];
                    final i i14 = d10.i;
                    final d f12 = d10.f;
                    if (f12 != null) {
                        final i i15 = f12.i;
                    }
                    final d[] y13 = e11.Y;
                    final int n22 = g + 1;
                    final i i16 = y13[n22].i;
                    final int g7 = d10.g();
                    final int g8 = e12.Y[n22].g();
                    i i17;
                    i i19;
                    d d12;
                    if (e13 != null) {
                        final d d11 = e13.Y[g];
                        i17 = d11.i;
                        final d f13 = d11.f;
                        i i18;
                        if (f13 != null) {
                            i18 = f13.i;
                        }
                        else {
                            i18 = null;
                        }
                        i19 = i18;
                        d12 = d11;
                    }
                    else {
                        final d d13 = d.Y[g];
                        i i20;
                        if (d13 != null) {
                            i20 = d13.i;
                        }
                        else {
                            i20 = null;
                        }
                        i19 = e12.Y[n22].i;
                        i17 = i20;
                        d12 = d13;
                    }
                    int n23 = g8;
                    if (d12 != null) {
                        n23 = g8 + d12.g();
                    }
                    final int g9 = e11.Y[n22].g();
                    int n24;
                    if (b7) {
                        n24 = 8;
                    }
                    else {
                        n24 = 4;
                    }
                    if (i14 != null && i16 != null && i17 != null && i19 != null) {
                        e.c(i14, i16, g9 + g7, 0.5f, i17, i19, n23, n24);
                    }
                }
                if (e12.i0() != 8) {
                    e11 = e12;
                }
                e12 = e13;
            }
            final d d14 = b.Y[g];
            final d f14 = a.Y[g].f;
            final d[] y14 = d.Y;
            n = g + 1;
            final d d15 = y14[n];
            final d f15 = c2.Y[n].f;
            if (f14 != null) {
                if (b != d) {
                    e.e(d14.i, f14.i, d14.g(), 5);
                }
                else if (f15 != null) {
                    e.c(d14.i, f14.i, d14.g(), 0.5f, d15.i, f15.i, d15.g(), 5);
                }
            }
            if (f15 != null && b != d) {
                e.e(d15.i, f15.i, -d15.g(), 5);
            }
        }
        if ((n8 != 0 || n6 != 0) && b != null && b != d) {
            final d[] y15 = b.Y;
            d d16 = y15[g];
            androidx.constraintlayout.core.widgets.e e14;
            if ((e14 = d) == null) {
                e14 = b;
            }
            final d[] y16 = e14.Y;
            n = g + 1;
            d d17 = y16[n];
            final d f16 = d16.f;
            i i21;
            if (f16 != null) {
                i21 = f16.i;
            }
            else {
                i21 = null;
            }
            final d f17 = d17.f;
            i i22;
            if (f17 != null) {
                i22 = f17.i;
            }
            else {
                i22 = null;
            }
            if (c2 != e14) {
                final d f18 = c2.Y[n].f;
                i22 = l;
                if (f18 != null) {
                    i22 = f18.i;
                }
            }
            if (b == e14) {
                d16 = y15[g];
                d17 = y15[n];
            }
            if (i21 != null && i22 != null) {
                g = d16.g();
                n = e14.Y[n].g();
                e.c(d16.i, i21, g, 0.5f, i22, d17.i, n, 5);
            }
        }
    }
    
    public static void b(final f f, final e e, final ArrayList<androidx.constraintlayout.core.widgets.e> list, final int n) {
        int i = 0;
        int n2;
        c[] array;
        int n3;
        if (n == 0) {
            n2 = f.L1;
            array = f.O1;
            n3 = 0;
        }
        else {
            n2 = f.M1;
            array = f.N1;
            n3 = 2;
        }
        while (i < n2) {
            final c c = array[i];
            c.a();
            if (list == null || list.contains(c.a)) {
                a(f, e, n, n3, c);
            }
            ++i;
        }
    }
}
