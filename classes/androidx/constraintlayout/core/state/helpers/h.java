// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.a;
import java.util.Iterator;
import androidx.constraintlayout.core.state.g;

public class h extends d
{
    public h(final g g) {
        super(g, androidx.constraintlayout.core.state.g.e.H);
    }
    
    @Override
    public void a() {
        final Iterator<Object> iterator = super.f0.iterator();
        while (iterator.hasNext()) {
            super.d0.e(iterator.next()).u();
        }
        final Iterator<Object> iterator2 = super.f0.iterator();
        a a = null;
        a a2 = null;
        while (iterator2.hasNext()) {
            final a e = super.d0.e(iterator2.next());
            a a3;
            if ((a3 = a2) == null) {
                Object o = super.O;
                Label_0131: {
                    if (o == null) {
                        final Object p = super.P;
                        if (p != null) {
                            e.w0(p);
                            break Label_0131;
                        }
                        o = androidx.constraintlayout.core.state.g.j;
                    }
                    e.x0(o);
                }
                a3 = e;
            }
            if (a != null) {
                a.o(e.getKey());
                e.w0(a.getKey());
            }
            a = e;
            a2 = a3;
        }
        if (a != null) {
            final Object q = super.Q;
            if (q != null) {
                a.o(q);
            }
            else {
                Object o2 = super.R;
                if (o2 == null) {
                    o2 = androidx.constraintlayout.core.state.g.j;
                }
                a.n(o2);
            }
        }
        if (a2 == null) {
            return;
        }
        final float h0 = super.h0;
        if (h0 != 0.5f) {
            a2.C0(h0);
        }
        final int n = h$a.a[super.i0.ordinal()];
        if (n != 1) {
            if (n != 2) {
                if (n == 3) {
                    a2.p0(2);
                }
            }
            else {
                a2.p0(1);
            }
        }
        else {
            a2.p0(0);
        }
    }
}
