// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.codecs;

import org.bson.p0;
import org.bson.z0;
import org.bson.codecs.configuration.c;
import org.bson.codecs.configuration.b;
import org.bson.codecs.configuration.d;
import org.bson.y0;

public class g0 implements n0<y0>
{
    private final d a;
    
    public g0() {
        this(c.d(new h0()));
    }
    
    public g0(final d a) {
        this.a = a;
    }
    
    public y0 e(final p0 p2, final s0 s0) {
        return this.a.a(h0.e(p2.O5())).c(p2, s0);
    }
    
    @Override
    public Class<y0> g() {
        return y0.class;
    }
    
    public void h(final z0 z0, final y0 y0, final x0 x0) {
        x0.b((w0<y0>)this.a.a(y0.getClass()), z0, y0);
    }
}
