// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core.widgets;

import java.util.HashSet;
import androidx.constraintlayout.core.widgets.analyzer.b;

public class m extends j
{
    private int B1;
    private int C1;
    private int D1;
    private int E1;
    private int F1;
    private int G1;
    private int H1;
    private int I1;
    private boolean J1;
    private int K1;
    private int L1;
    protected androidx.constraintlayout.core.widgets.analyzer.b.a M1;
    androidx.constraintlayout.core.widgets.analyzer.b.b N1;
    
    public m() {
        this.B1 = 0;
        this.C1 = 0;
        this.D1 = 0;
        this.E1 = 0;
        this.F1 = 0;
        this.G1 = 0;
        this.H1 = 0;
        this.I1 = 0;
        this.J1 = false;
        this.K1 = 0;
        this.L1 = 0;
        this.M1 = new androidx.constraintlayout.core.widgets.analyzer.b.a();
        this.N1 = null;
    }
    
    public void A2(final int i1) {
        this.F1 = i1;
        this.H1 = i1;
        this.I1 = i1;
    }
    
    public void B2(final int b1) {
        this.B1 = b1;
    }
    
    @Override
    public void c(final f f) {
        this.h2();
    }
    
    public void g2(final boolean b) {
        final int f1 = this.F1;
        if (f1 > 0 || this.G1 > 0) {
            if (b) {
                this.H1 = this.G1;
                this.I1 = f1;
            }
            else {
                this.H1 = f1;
                this.I1 = this.G1;
            }
        }
    }
    
    public void h2() {
        for (int i = 0; i < super.A1; ++i) {
            final e e = super.z1[i];
            if (e != null) {
                e.C1(true);
            }
        }
    }
    
    public boolean i2(final HashSet<e> set) {
        for (int i = 0; i < super.A1; ++i) {
            if (set.contains(super.z1[i])) {
                return true;
            }
        }
        return false;
    }
    
    public int j2() {
        return this.L1;
    }
    
    public int k2() {
        return this.K1;
    }
    
    public int l2() {
        return this.C1;
    }
    
    public int m2() {
        return this.H1;
    }
    
    public int n2() {
        return this.I1;
    }
    
    public int o2() {
        return this.B1;
    }
    
    public void p2(final int n, final int n2, final int n3, final int n4) {
    }
    
    protected void q2(final e e, final b a, final int c, final b b, final int d) {
        while (this.N1 == null && this.U() != null) {
            this.N1 = ((f)this.U()).A2();
        }
        final androidx.constraintlayout.core.widgets.analyzer.b.a m1 = this.M1;
        m1.a = a;
        m1.b = b;
        m1.c = c;
        m1.d = d;
        this.N1.b(e, m1);
        e.W1(this.M1.e);
        e.s1(this.M1.f);
        e.r1(this.M1.h);
        e.a1(this.M1.g);
    }
    
    protected boolean r2() {
        final e c0 = super.c0;
        androidx.constraintlayout.core.widgets.analyzer.b.b a2;
        if (c0 != null) {
            a2 = ((f)c0).A2();
        }
        else {
            a2 = null;
        }
        if (a2 == null) {
            return false;
        }
        int n = 0;
        while (true) {
            final int a3 = super.A1;
            boolean b = true;
            if (n >= a3) {
                break;
            }
            final e e = super.z1[n];
            if (e != null) {
                if (!(e instanceof h)) {
                    final b z = e.z(0);
                    final b z2 = e.z(1);
                    final b i = androidx.constraintlayout.core.widgets.e.b.I;
                    if (z != i || e.w == 1 || z2 != i || e.x == 1) {
                        b = false;
                    }
                    if (!b) {
                        Enum<b> h;
                        if ((h = z) == i) {
                            h = androidx.constraintlayout.core.widgets.e.b.H;
                        }
                        Enum<b> h2;
                        if ((h2 = z2) == i) {
                            h2 = androidx.constraintlayout.core.widgets.e.b.H;
                        }
                        final androidx.constraintlayout.core.widgets.analyzer.b.a m1 = this.M1;
                        m1.a = (b)h;
                        m1.b = (b)h2;
                        m1.c = e.j0();
                        this.M1.d = e.D();
                        a2.b(e, this.M1);
                        e.W1(this.M1.e);
                        e.s1(this.M1.f);
                        e.a1(this.M1.g);
                    }
                }
            }
            ++n;
        }
        return true;
    }
    
    public boolean s2() {
        return this.J1;
    }
    
    protected void t2(final boolean j1) {
        this.J1 = j1;
    }
    
    public void u2(final int k1, final int l1) {
        this.K1 = k1;
        this.L1 = l1;
    }
    
    public void v2(final int n) {
        this.D1 = n;
        this.B1 = n;
        this.E1 = n;
        this.C1 = n;
        this.F1 = n;
        this.G1 = n;
    }
    
    public void w2(final int c1) {
        this.C1 = c1;
    }
    
    public void x2(final int g1) {
        this.G1 = g1;
    }
    
    public void y2(final int n) {
        this.D1 = n;
        this.H1 = n;
    }
    
    public void z2(final int n) {
        this.E1 = n;
        this.I1 = n;
    }
}
