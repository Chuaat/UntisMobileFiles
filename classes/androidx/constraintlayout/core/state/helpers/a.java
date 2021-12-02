// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core.state.helpers;

import java.util.Iterator;
import androidx.constraintlayout.core.state.g;
import androidx.constraintlayout.core.state.c;

public class a extends c
{
    private float h0;
    
    public a(final g g) {
        super(g, androidx.constraintlayout.core.state.g.e.J);
        this.h0 = 0.5f;
    }
    
    @Override
    public void a() {
        final Iterator<Object> iterator = super.f0.iterator();
        while (iterator.hasNext()) {
            final androidx.constraintlayout.core.state.a e = super.d0.e(iterator.next());
            e.t();
            Object o = super.K;
            Label_0081: {
                if (o == null) {
                    final Object l = super.L;
                    if (l != null) {
                        e.t0(l);
                        break Label_0081;
                    }
                    o = androidx.constraintlayout.core.state.g.j;
                }
                e.u0(o);
            }
            final Object m = super.M;
            if (m != null) {
                e.z(m);
            }
            else {
                Object o2 = super.N;
                if (o2 == null) {
                    o2 = androidx.constraintlayout.core.state.g.j;
                }
                e.y(o2);
            }
            final float h0 = this.h0;
            if (h0 != 0.5f) {
                e.U(h0);
            }
        }
    }
}
