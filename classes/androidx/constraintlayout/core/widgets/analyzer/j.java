// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.h;
import androidx.constraintlayout.core.widgets.e;

class j extends p
{
    public j(final e e) {
        super(e);
        e.e.f();
        e.f.f();
        super.f = ((h)e).g2();
    }
    
    private void u(final f f) {
        super.h.k.add(f);
        f.l.add(super.h);
    }
    
    @Override
    public void a(final d d) {
        final f h = super.h;
        if (!h.c) {
            return;
        }
        if (h.j) {
            return;
        }
        super.h.e((int)(h.l.get(0).g * ((h)super.b).k2() + 0.5f));
    }
    
    @Override
    void d() {
        final h h = (h)super.b;
        int h2 = h.h2();
        final int j2 = h.j2();
        h.k2();
        p p;
        if (h.g2() == 1) {
            final f h3 = super.h;
            Label_0222: {
                f f;
                if (h2 != -1) {
                    h3.l.add(super.b.c0.e.h);
                    super.b.c0.e.h.k.add(super.h);
                    f = super.h;
                }
                else {
                    if (j2 == -1) {
                        h3.b = true;
                        h3.l.add(super.b.c0.e.i);
                        super.b.c0.e.i.k.add(super.h);
                        break Label_0222;
                    }
                    h3.l.add(super.b.c0.e.i);
                    super.b.c0.e.i.k.add(super.h);
                    f = super.h;
                    h2 = -j2;
                }
                f.f = h2;
            }
            this.u(super.b.e.h);
            p = super.b.e;
        }
        else {
            final f h4 = super.h;
            Label_0438: {
                f f2;
                if (h2 != -1) {
                    h4.l.add(super.b.c0.f.h);
                    super.b.c0.f.h.k.add(super.h);
                    f2 = super.h;
                }
                else {
                    if (j2 == -1) {
                        h4.b = true;
                        h4.l.add(super.b.c0.f.i);
                        super.b.c0.f.i.k.add(super.h);
                        break Label_0438;
                    }
                    h4.l.add(super.b.c0.f.i);
                    super.b.c0.f.i.k.add(super.h);
                    f2 = super.h;
                    h2 = -j2;
                }
                f2.f = h2;
            }
            this.u(super.b.f.h);
            p = super.b.f;
        }
        this.u(p.i);
    }
    
    public void e() {
        if (((h)super.b).g2() == 1) {
            super.b.Z1(super.h.g);
        }
        else {
            super.b.a2(super.h.g);
        }
    }
    
    @Override
    void f() {
        super.h.c();
    }
    
    @Override
    void n() {
        super.h.j = false;
        super.i.j = false;
    }
    
    @Override
    boolean p() {
        return false;
    }
}
