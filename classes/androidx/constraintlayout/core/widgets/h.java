// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core.widgets;

import java.util.HashMap;
import androidx.constraintlayout.core.i;

public class h extends e
{
    public static final int G1 = 0;
    public static final int H1 = 1;
    public static final int I1 = 0;
    public static final int J1 = 1;
    public static final int K1 = 2;
    public static final int L1 = -1;
    protected int A1;
    protected int B1;
    private d C1;
    private int D1;
    private int E1;
    private boolean F1;
    protected float z1;
    
    public h() {
        this.z1 = -1.0f;
        this.A1 = -1;
        this.B1 = -1;
        this.C1 = super.R;
        int i = 0;
        this.D1 = 0;
        this.E1 = 0;
        super.Z.clear();
        super.Z.add(this.C1);
        while (i < super.Y.length) {
            super.Y[i] = this.C1;
            ++i;
        }
    }
    
    @Override
    public boolean C0() {
        return this.F1;
    }
    
    @Override
    public boolean D0() {
        return this.F1;
    }
    
    @Override
    public String c0() {
        return "Guideline";
    }
    
    @Override
    public void d2(final androidx.constraintlayout.core.e e, final boolean b) {
        if (this.U() == null) {
            return;
        }
        final int o = e.O(this.C1);
        if (this.D1 == 1) {
            this.Z1(o);
            this.a2(0);
            this.s1(this.U().D());
            this.W1(0);
        }
        else {
            this.Z1(0);
            this.a2(o);
            this.W1(this.U().j0());
            this.s1(0);
        }
    }
    
    public void e2() {
        if (this.A1 != -1) {
            this.n2();
        }
        else if (this.z1 != -1.0f) {
            this.m2();
        }
        else if (this.B1 != -1) {
            this.l2();
        }
    }
    
    public d f2() {
        return this.C1;
    }
    
    @Override
    public void g(final androidx.constraintlayout.core.e e, final boolean b) {
        final f f = (f)this.U();
        if (f == null) {
            return;
        }
        d d = f.r(androidx.constraintlayout.core.widgets.d.b.H);
        d d2 = f.r(androidx.constraintlayout.core.widgets.d.b.J);
        final e c0 = super.c0;
        final int n = 1;
        int n2;
        if (c0 != null && c0.b0[0] == b.H) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        if (this.D1 == 0) {
            d = f.r(androidx.constraintlayout.core.widgets.d.b.I);
            d2 = f.r(androidx.constraintlayout.core.widgets.d.b.K);
            final e c2 = super.c0;
            if (c2 != null && c2.b0[1] == b.H) {
                n2 = n;
            }
            else {
                n2 = 0;
            }
        }
        if (this.F1 && this.C1.o()) {
            final i u = e.u(this.C1);
            e.f(u, this.C1.f());
            if (this.A1 != -1) {
                if (n2 != 0) {
                    e.i(e.u(d2), u, 0, 5);
                }
            }
            else if (this.B1 != -1 && n2 != 0) {
                final i u2 = e.u(d2);
                e.i(u, e.u(d), 0, 5);
                e.i(u2, u, 0, 5);
            }
            this.F1 = false;
            return;
        }
        if (this.A1 != -1) {
            final i u3 = e.u(this.C1);
            e.e(u3, e.u(d), this.A1, 8);
            if (n2 != 0) {
                e.i(e.u(d2), u3, 0, 5);
            }
        }
        else if (this.B1 != -1) {
            final i u4 = e.u(this.C1);
            final i u5 = e.u(d2);
            e.e(u4, u5, -this.B1, 8);
            if (n2 != 0) {
                e.i(u4, e.u(d), 0, 5);
                e.i(u5, u4, 0, 5);
            }
        }
        else if (this.z1 != -1.0f) {
            e.d(androidx.constraintlayout.core.e.w(e, e.u(this.C1), e.u(d2), this.z1));
        }
    }
    
    public int g2() {
        return this.D1;
    }
    
    @Override
    public boolean h() {
        return true;
    }
    
    public int h2() {
        return this.A1;
    }
    
    public int i2() {
        if (this.z1 != -1.0f) {
            return 0;
        }
        if (this.A1 != -1) {
            return 1;
        }
        if (this.B1 != -1) {
            return 2;
        }
        return -1;
    }
    
    public int j2() {
        return this.B1;
    }
    
    public float k2() {
        return this.z1;
    }
    
    void l2() {
        int n = this.l0();
        if (this.D1 == 0) {
            n = this.m0();
        }
        this.q2(n);
    }
    
    void m2() {
        int n = this.U().j0() - this.l0();
        if (this.D1 == 0) {
            n = this.U().D() - this.m0();
        }
        this.r2(n);
    }
    
    @Override
    public void n(final e e, final HashMap<e, e> hashMap) {
        super.n(e, hashMap);
        final h h = (h)e;
        this.z1 = h.z1;
        this.A1 = h.A1;
        this.B1 = h.B1;
        this.v2(h.D1);
    }
    
    void n2() {
        float n = this.l0() / (float)this.U().j0();
        if (this.D1 == 0) {
            n = this.m0() / (float)this.U().D();
        }
        this.s2(n);
    }
    
    public boolean o2() {
        return this.z1 != -1.0f && this.A1 == -1 && this.B1 == -1;
    }
    
    public void p2(final int n) {
        this.C1.A(n);
        this.F1 = true;
    }
    
    public void q2(final int a1) {
        if (a1 > -1) {
            this.z1 = -1.0f;
            this.A1 = a1;
            this.B1 = -1;
        }
    }
    
    @Override
    public d r(final d.b b) {
        final int n = h$a.a[b.ordinal()];
        if (n != 1 && n != 2) {
            if (n == 3 || n == 4) {
                if (this.D1 == 0) {
                    return this.C1;
                }
            }
        }
        else if (this.D1 == 1) {
            return this.C1;
        }
        return null;
    }
    
    public void r2(final int b1) {
        if (b1 > -1) {
            this.z1 = -1.0f;
            this.A1 = -1;
            this.B1 = b1;
        }
    }
    
    public void s2(final float z1) {
        if (z1 > -1.0f) {
            this.z1 = z1;
            this.A1 = -1;
            this.B1 = -1;
        }
    }
    
    public void t2(final int n) {
        this.s2(n / 100.0f);
    }
    
    public void u2(final int e1) {
        this.E1 = e1;
    }
    
    public void v2(int i) {
        if (this.D1 == i) {
            return;
        }
        this.D1 = i;
        super.Z.clear();
        d c1;
        if (this.D1 == 1) {
            c1 = super.Q;
        }
        else {
            c1 = super.R;
        }
        this.C1 = c1;
        super.Z.add(this.C1);
        int length;
        for (length = super.Y.length, i = 0; i < length; ++i) {
            super.Y[i] = this.C1;
        }
    }
}
