// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.codecs;

import org.bson.p0;
import org.bson.z0;
import org.bson.y;
import org.bson.i0;

public class u implements n0<i0>
{
    private final n0<y> a;
    
    public u(final n0<y> a) {
        this.a = a;
    }
    
    public i0 e(final p0 p2, final s0 s0) {
        return new i0(p2.F2(), this.a.c(p2, s0));
    }
    
    @Override
    public Class<i0> g() {
        return i0.class;
    }
    
    public void h(final z0 z0, final i0 i0, final x0 x0) {
        z0.d1(i0.Y0());
        this.a.a(z0, i0.Z0(), x0);
    }
}
