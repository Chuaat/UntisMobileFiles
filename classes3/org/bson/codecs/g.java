// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.codecs;

import java.util.Iterator;
import java.util.List;
import org.bson.w0;
import org.bson.y0;
import java.util.ArrayList;
import org.bson.p0;
import org.bson.z0;
import e7.a;
import org.bson.codecs.configuration.c;
import org.bson.codecs.configuration.b;
import org.bson.codecs.configuration.d;
import org.bson.n;

public class g implements n0<n>
{
    private static final d b;
    private final d a;
    
    static {
        b = c.d(new h0());
    }
    
    public g() {
        this(g.b);
    }
    
    public g(final d d) {
        this.a = e7.a.e("codecRegistry", d);
    }
    
    public n e(final p0 p2, final s0 s0) {
        p2.h2();
        final ArrayList<y0> list = new ArrayList<y0>();
        while (p2.o5() != org.bson.w0.H) {
            list.add(this.i(p2, s0));
        }
        p2.P2();
        return new n(list);
    }
    
    @Override
    public Class<n> g() {
        return n.class;
    }
    
    public void h(final z0 z0, final n n, final x0 x0) {
        z0.R();
        for (final y0 y0 : n) {
            x0.b((w0<y0>)this.a.a(y0.getClass()), z0, y0);
        }
        z0.o();
    }
    
    protected y0 i(final p0 p2, final s0 s0) {
        return this.a.a(h0.e(p2.O5())).c(p2, s0);
    }
}
