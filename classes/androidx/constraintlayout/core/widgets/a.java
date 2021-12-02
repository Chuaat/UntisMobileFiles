// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core.widgets;

import java.util.HashMap;
import androidx.constraintlayout.core.i;
import androidx.constraintlayout.core.e;

public class a extends j
{
    public static final int F1 = 0;
    public static final int G1 = 1;
    public static final int H1 = 2;
    public static final int I1 = 3;
    private static final boolean J1 = true;
    private static final boolean K1 = false;
    private int B1;
    private boolean C1;
    private int D1;
    boolean E1;
    
    public a() {
        this.B1 = 0;
        this.C1 = true;
        this.D1 = 0;
        this.E1 = false;
    }
    
    public a(final String s) {
        this.B1 = 0;
        this.C1 = true;
        this.D1 = 0;
        this.E1 = false;
        this.d1(s);
    }
    
    @Override
    public boolean C0() {
        return this.E1;
    }
    
    @Override
    public boolean D0() {
        return this.E1;
    }
    
    @Override
    public void g(final androidx.constraintlayout.core.e e, final boolean b) {
        final d[] y = super.Y;
        y[0] = super.Q;
        y[2] = super.R;
        y[1] = super.S;
        y[3] = super.T;
        int n = 0;
        d[] y2;
        while (true) {
            y2 = super.Y;
            if (n >= y2.length) {
                break;
            }
            y2[n].i = e.u(y2[n]);
            ++n;
        }
        final int b2 = this.B1;
        if (b2 >= 0 && b2 < 4) {
            final d d = y2[b2];
            if (!this.E1) {
                this.g2();
            }
            if (this.E1) {
                this.E1 = false;
                final int b3 = this.B1;
                androidx.constraintlayout.core.i i;
                int n2;
                if (b3 != 0 && b3 != 1) {
                    if (b3 != 2 && b3 != 3) {
                        return;
                    }
                    e.f(super.R.i, super.i0);
                    i = super.T.i;
                    n2 = super.i0;
                }
                else {
                    e.f(super.Q.i, super.h0);
                    i = super.S.i;
                    n2 = super.h0;
                }
                e.f(i, n2);
                return;
            }
            while (true) {
                for (int j = 0; j < super.A1; ++j) {
                    final e e2 = super.z1[j];
                    if (this.C1 || e2.h()) {
                        final int b4 = this.B1;
                        if ((b4 != 0 && b4 != 1) || e2.H() != b.I || e2.Q.f == null || e2.S.f == null) {
                            final int b5 = this.B1;
                            if ((b5 != 2 && b5 != 3) || e2.g0() != b.I || e2.R.f == null || e2.T.f == null) {
                                continue;
                            }
                        }
                        final boolean b6 = true;
                        final boolean b7 = super.Q.m() || super.S.m();
                        final boolean b8 = super.R.m() || super.T.m();
                        boolean b10 = false;
                        Label_0498: {
                            if (!b6) {
                                final int b9 = this.B1;
                                if ((b9 == 0 && b7) || (b9 == 2 && b8) || (b9 == 1 && b7) || (b9 == 3 && b8)) {
                                    b10 = true;
                                    break Label_0498;
                                }
                            }
                            b10 = false;
                        }
                        int n3 = 5;
                        if (!b10) {
                            n3 = 4;
                        }
                        for (int k = 0; k < super.A1; ++k) {
                            final e e3 = super.z1[k];
                            if (this.C1 || e3.h()) {
                                final androidx.constraintlayout.core.i u = e.u(e3.Y[this.B1]);
                                final d[] y3 = e3.Y;
                                final int b11 = this.B1;
                                y3[b11].i = u;
                                int n4;
                                if (y3[b11].f != null && y3[b11].f.d == this) {
                                    n4 = y3[b11].g + 0;
                                }
                                else {
                                    n4 = 0;
                                }
                                if (b11 != 0 && b11 != 2) {
                                    e.h(d.i, u, this.D1 + n4, b6);
                                }
                                else {
                                    e.j(d.i, u, this.D1 - n4, b6);
                                }
                                e.e(d.i, u, this.D1 + n4, n3);
                            }
                        }
                        final int b12 = this.B1;
                        androidx.constraintlayout.core.i l;
                        d d2;
                        if (b12 == 0) {
                            e.e(super.S.i, super.Q.i, 0, 8);
                            e.e(super.Q.i, super.c0.S.i, 0, 4);
                            l = super.Q.i;
                            d2 = super.c0.Q;
                        }
                        else if (b12 == 1) {
                            e.e(super.Q.i, super.S.i, 0, 8);
                            e.e(super.Q.i, super.c0.Q.i, 0, 4);
                            l = super.Q.i;
                            d2 = super.c0.S;
                        }
                        else if (b12 == 2) {
                            e.e(super.T.i, super.R.i, 0, 8);
                            e.e(super.R.i, super.c0.T.i, 0, 4);
                            l = super.R.i;
                            d2 = super.c0.R;
                        }
                        else {
                            if (b12 != 3) {
                                return;
                            }
                            e.e(super.R.i, super.T.i, 0, 8);
                            e.e(super.R.i, super.c0.R.i, 0, 4);
                            l = super.R.i;
                            d2 = super.c0.T;
                        }
                        e.e(l, d2.i, 0, 0);
                        return;
                    }
                }
                final boolean b6 = false;
                continue;
            }
        }
    }
    
    public boolean g2() {
        int i = 0;
        int n = 0;
        int n2 = 1;
        int a1;
        while (true) {
            a1 = super.A1;
            if (n >= a1) {
                break;
            }
            final e e = super.z1[n];
            int n3 = 0;
            Label_0113: {
                if (!this.C1 && !e.h()) {
                    n3 = n2;
                }
                else {
                    final int b1 = this.B1;
                    if ((b1 != 0 && b1 != 1) || e.C0()) {
                        final int b2 = this.B1;
                        if (b2 != 2) {
                            n3 = n2;
                            if (b2 != 3) {
                                break Label_0113;
                            }
                        }
                        n3 = n2;
                        if (e.D0()) {
                            break Label_0113;
                        }
                    }
                    n3 = 0;
                }
            }
            ++n;
            n2 = n3;
        }
        if (n2 != 0 && a1 > 0) {
            int n4 = 0;
            int n5 = 0;
            while (i < super.A1) {
                final e e2 = super.z1[i];
                Label_0358: {
                    if (this.C1 || e2.h()) {
                        int n6 = n4;
                        int n7;
                        if ((n7 = n5) == 0) {
                            final int b3 = this.B1;
                            Label_0248: {
                                d.b b4;
                                if (b3 == 0) {
                                    b4 = androidx.constraintlayout.core.widgets.d.b.H;
                                }
                                else if (b3 == 1) {
                                    b4 = androidx.constraintlayout.core.widgets.d.b.J;
                                }
                                else if (b3 == 2) {
                                    b4 = androidx.constraintlayout.core.widgets.d.b.I;
                                }
                                else {
                                    if (b3 != 3) {
                                        break Label_0248;
                                    }
                                    b4 = androidx.constraintlayout.core.widgets.d.b.K;
                                }
                                n4 = e2.r(b4).f();
                            }
                            n7 = 1;
                            n6 = n4;
                        }
                        final int b5 = this.B1;
                        d.b b7 = null;
                        Label_0269: {
                            if (b5 != 0) {
                                d.b b6;
                                if (b5 == 1) {
                                    b6 = androidx.constraintlayout.core.widgets.d.b.J;
                                }
                                else {
                                    if (b5 == 2) {
                                        b7 = androidx.constraintlayout.core.widgets.d.b.I;
                                        break Label_0269;
                                    }
                                    n4 = n6;
                                    n5 = n7;
                                    if (b5 != 3) {
                                        break Label_0358;
                                    }
                                    b6 = androidx.constraintlayout.core.widgets.d.b.K;
                                }
                                n4 = Math.max(n6, e2.r(b6).f());
                                n5 = n7;
                                break Label_0358;
                            }
                            b7 = androidx.constraintlayout.core.widgets.d.b.H;
                        }
                        n4 = Math.min(n6, e2.r(b7).f());
                        n5 = n7;
                    }
                }
                ++i;
            }
            final int n8 = n4 + this.D1;
            final int b8 = this.B1;
            if (b8 != 0 && b8 != 1) {
                this.n1(n8, n8);
            }
            else {
                this.k1(n8, n8);
            }
            return this.E1 = true;
        }
        return false;
    }
    
    @Override
    public boolean h() {
        return true;
    }
    
    @Deprecated
    public boolean h2() {
        return this.C1;
    }
    
    public boolean i2() {
        return this.C1;
    }
    
    public int j2() {
        return this.B1;
    }
    
    public int k2() {
        return this.D1;
    }
    
    public int l2() {
        final int b1 = this.B1;
        if (b1 == 0 || b1 == 1) {
            return 0;
        }
        if (b1 != 2 && b1 != 3) {
            return -1;
        }
        return 1;
    }
    
    protected void m2() {
        for (int i = 0; i < super.A1; ++i) {
            final e e = super.z1[i];
            if (this.C1 || e.h()) {
                final int b1 = this.B1;
                if (b1 != 0 && b1 != 1) {
                    if (b1 == 2 || b1 == 3) {
                        e.A1(1, true);
                    }
                }
                else {
                    e.A1(0, true);
                }
            }
        }
    }
    
    @Override
    public void n(final e e, final HashMap<e, e> hashMap) {
        super.n(e, hashMap);
        final a a = (a)e;
        this.B1 = a.B1;
        this.C1 = a.C1;
        this.D1 = a.D1;
    }
    
    public void n2(final boolean c1) {
        this.C1 = c1;
    }
    
    public void o2(final int b1) {
        this.B1 = b1;
    }
    
    public void p2(final int d1) {
        this.D1 = d1;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("[Barrier] ");
        sb.append(this.y());
        sb.append(" {");
        String s = sb.toString();
        for (int i = 0; i < super.A1; ++i) {
            final e e = super.z1[i];
            String string = s;
            if (i > 0) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(s);
                sb2.append(", ");
                string = sb2.toString();
            }
            final StringBuilder sb3 = new StringBuilder();
            sb3.append(string);
            sb3.append(e.y());
            s = sb3.toString();
        }
        final StringBuilder sb4 = new StringBuilder();
        sb4.append(s);
        sb4.append("}");
        return sb4.toString();
    }
}
