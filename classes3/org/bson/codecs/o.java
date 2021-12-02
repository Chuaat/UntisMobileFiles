// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.codecs;

import org.bson.types.ObjectId;
import java.util.Iterator;
import java.util.Map;
import java.util.List;
import org.bson.d0;
import java.util.ArrayList;
import org.bson.p0;
import org.bson.y0;
import org.bson.z0;
import org.bson.codecs.configuration.c;
import org.bson.codecs.configuration.b;
import org.bson.codecs.configuration.d;
import org.bson.y;

public class o implements o0<y>
{
    private static final String c = "_id";
    private static final d d;
    private final d a;
    private final e0 b;
    
    static {
        d = org.bson.codecs.configuration.c.d(new h0());
    }
    
    public o() {
        this(o.d);
    }
    
    public o(final d a) {
        if (a != null) {
            this.a = a;
            this.b = new e0(h0.d(), a);
            return;
        }
        throw new IllegalArgumentException("Codec registry can not be null");
    }
    
    private void e(final z0 z0, final x0 x0, final y y) {
        if (x0.d() && y.containsKey("_id")) {
            z0.K("_id");
            this.p(z0, x0, y.b1("_id"));
        }
    }
    
    private boolean o(final x0 x0, final String s) {
        return x0.d() && s.equals("_id");
    }
    
    private void p(final z0 z0, final x0 x0, final y0 y0) {
        x0.b((w0<y0>)this.a.a(y0.getClass()), z0, y0);
    }
    
    @Override
    public Class<y> g() {
        return y.class;
    }
    
    public y h(final p0 p2, final s0 s0) {
        final ArrayList<d0> list = new ArrayList<d0>();
        p2.b4();
        while (p2.o5() != org.bson.w0.H) {
            list.add(new d0(p2.F4(), this.n(p2, s0)));
        }
        p2.K3();
        return new y(list);
    }
    
    public boolean i(final y y) {
        return y.containsKey("_id");
    }
    
    public void j(final z0 z0, final y y, final x0 x0) {
        z0.w0();
        this.e(z0, x0, y);
        for (final Map.Entry<String, y0> entry : y.entrySet()) {
            if (this.o(x0, entry.getKey())) {
                continue;
            }
            z0.K(entry.getKey());
            this.p(z0, x0, entry.getValue());
        }
        z0.N0();
    }
    
    public y k(final y y) {
        if (!this.i(y)) {
            y.C2("_id", new org.bson.o0(new ObjectId()));
        }
        return y;
    }
    
    public d l() {
        return this.a;
    }
    
    public y0 m(final y y) {
        return y.b1("_id");
    }
    
    protected y0 n(final p0 p2, final s0 s0) {
        return this.b.a(p2.O5()).c(p2, s0);
    }
}
