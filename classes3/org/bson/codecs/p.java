// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.codecs;

import org.bson.p0;
import org.bson.z0;
import org.bson.y;
import org.bson.a0;

public class p implements n0<a0>
{
    private final n0<y> a;
    
    public p(final n0<y> a) {
        this.a = a;
    }
    
    public a0 e(final p0 p2, final s0 s0) {
        throw new UnsupportedOperationException("Decoding into a BsonDocumentWrapper is not allowed");
    }
    
    @Override
    public Class<a0> g() {
        return a0.class;
    }
    
    public void h(final z0 z0, a0 q2, final x0 x0) {
        Object o;
        if (q2.R2()) {
            o = this.a;
        }
        else {
            o = q2.M2();
            q2 = q2.Q2();
        }
        ((w0<a0<a0>>)o).a(z0, q2, x0);
    }
}
