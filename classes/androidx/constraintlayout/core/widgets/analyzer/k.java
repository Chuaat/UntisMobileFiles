// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core.widgets.analyzer;

import java.util.Iterator;
import androidx.constraintlayout.core.widgets.a;
import androidx.constraintlayout.core.widgets.e;

class k extends p
{
    public k(final e e) {
        super(e);
    }
    
    private void u(final f f) {
        super.h.k.add(f);
        f.l.add(super.h);
    }
    
    @Override
    public void a(final d d) {
        final a a = (a)super.b;
        final int j2 = a.j2();
        final Iterator<f> iterator = super.h.l.iterator();
        int n = 0;
        int n2 = -1;
        while (iterator.hasNext()) {
            final int g = iterator.next().g;
            int n3;
            if (n2 == -1 || g < (n3 = n2)) {
                n3 = g;
            }
            n2 = n3;
            if (n < g) {
                n = g;
                n2 = n3;
            }
        }
        if (j2 != 0 && j2 != 2) {
            super.h.e(n + a.k2());
        }
        else {
            super.h.e(n2 + a.k2());
        }
    }
    
    @Override
    void d() {
        final e b = super.b;
        if (b instanceof a) {
            super.h.b = true;
            final a a = (a)b;
            final int j2 = a.j2();
            final boolean i2 = a.i2();
            final int n = 0;
            final int n2 = 0;
            final int n3 = 0;
            int k = 0;
            p p = null;
            Label_0492: {
                if (j2 != 0) {
                    if (j2 != 1) {
                        if (j2 != 2) {
                            if (j2 != 3) {
                                return;
                            }
                            super.h.e = androidx.constraintlayout.core.widgets.analyzer.f.a.M;
                            while (k < a.A1) {
                                final e e = a.z1[k];
                                if (i2 || e.i0() != 8) {
                                    final f l = e.f.i;
                                    l.k.add(super.h);
                                    super.h.l.add(l);
                                }
                                ++k;
                            }
                        }
                        else {
                            super.h.e = androidx.constraintlayout.core.widgets.analyzer.f.a.L;
                            for (int n4 = n; n4 < a.A1; ++n4) {
                                final e e2 = a.z1[n4];
                                if (i2 || e2.i0() != 8) {
                                    final f h = e2.f.h;
                                    h.k.add(super.h);
                                    super.h.l.add(h);
                                }
                            }
                        }
                        this.u(super.b.f.h);
                        p = super.b.f;
                        break Label_0492;
                    }
                    super.h.e = androidx.constraintlayout.core.widgets.analyzer.f.a.K;
                    for (int n5 = n2; n5 < a.A1; ++n5) {
                        final e e3 = a.z1[n5];
                        if (i2 || e3.i0() != 8) {
                            final f m = e3.e.i;
                            m.k.add(super.h);
                            super.h.l.add(m);
                        }
                    }
                }
                else {
                    super.h.e = androidx.constraintlayout.core.widgets.analyzer.f.a.J;
                    for (int n6 = n3; n6 < a.A1; ++n6) {
                        final e e4 = a.z1[n6];
                        if (i2 || e4.i0() != 8) {
                            final f h2 = e4.e.h;
                            h2.k.add(super.h);
                            super.h.l.add(h2);
                        }
                    }
                }
                this.u(super.b.e.h);
                p = super.b.e;
            }
            this.u(p.i);
        }
    }
    
    public void e() {
        final e b = super.b;
        if (b instanceof a) {
            final int j2 = ((a)b).j2();
            if (j2 != 0 && j2 != 1) {
                super.b.a2(super.h.g);
            }
            else {
                super.b.Z1(super.h.g);
            }
        }
    }
    
    @Override
    void f() {
        super.c = null;
        super.h.c();
    }
    
    @Override
    void n() {
        super.h.j = false;
    }
    
    @Override
    boolean p() {
        return false;
    }
}
