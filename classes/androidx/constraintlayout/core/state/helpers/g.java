// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.a;
import java.util.Iterator;

public class g extends d
{
    public g(final androidx.constraintlayout.core.state.g g) {
        super(g, androidx.constraintlayout.core.state.g.e.G);
    }
    
    @Override
    public void a() {
        final Iterator<Object> iterator = super.f0.iterator();
        while (iterator.hasNext()) {
            super.d0.e(iterator.next()).t();
        }
        final Iterator<Object> iterator2 = super.f0.iterator();
        a a = null;
        a a2 = null;
        while (iterator2.hasNext()) {
            final a e = super.d0.e(iterator2.next());
            a a3;
            if ((a3 = a2) == null) {
                final Object k = super.K;
                Label_0142: {
                    a a4;
                    if (k != null) {
                        a4 = e.u0(k);
                    }
                    else {
                        final Object l = super.L;
                        if (l == null) {
                            e.u0(androidx.constraintlayout.core.state.g.j);
                            break Label_0142;
                        }
                        a4 = e.t0(l);
                    }
                    a4.Y(super.k);
                }
                a3 = e;
            }
            if (a != null) {
                a.z(e.getKey());
                e.t0(a.getKey());
            }
            a = e;
            a2 = a3;
        }
        Label_0242: {
            if (a != null) {
                final Object m = super.M;
                a a5;
                if (m != null) {
                    a5 = a.z(m);
                }
                else {
                    final Object n = super.N;
                    if (n == null) {
                        a.y(androidx.constraintlayout.core.state.g.j);
                        break Label_0242;
                    }
                    a5 = a.y(n);
                }
                a5.Y(super.l);
            }
        }
        if (a2 == null) {
            return;
        }
        final float h0 = super.h0;
        if (h0 != 0.5f) {
            a2.U(h0);
        }
        final int n2 = g$a.a[super.i0.ordinal()];
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 == 3) {
                    a2.n0(2);
                }
            }
            else {
                a2.n0(1);
            }
        }
        else {
            a2.n0(0);
        }
    }
}
