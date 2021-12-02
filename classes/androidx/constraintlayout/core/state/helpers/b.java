// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.a;
import java.util.Iterator;
import androidx.constraintlayout.core.state.g;
import androidx.constraintlayout.core.state.c;

public class b extends c
{
    private float h0;
    
    public b(final g g) {
        super(g, androidx.constraintlayout.core.state.g.e.J);
        this.h0 = 0.5f;
    }
    
    @Override
    public void a() {
        final Iterator<Object> iterator = super.f0.iterator();
        while (iterator.hasNext()) {
            final a e = super.d0.e(iterator.next());
            e.u();
            Object o = super.O;
            Label_0081: {
                if (o == null) {
                    final Object p = super.P;
                    if (p != null) {
                        e.w0(p);
                        break Label_0081;
                    }
                    o = androidx.constraintlayout.core.state.g.j;
                }
                e.x0(o);
            }
            final Object q = super.Q;
            if (q != null) {
                e.o(q);
            }
            else {
                Object o2 = super.R;
                if (o2 == null) {
                    o2 = androidx.constraintlayout.core.state.g.j;
                }
                e.n(o2);
            }
            final float h0 = this.h0;
            if (h0 != 0.5f) {
                e.C0(h0);
            }
        }
    }
}
