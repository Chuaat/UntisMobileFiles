// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.codecs.pojo;

import org.bson.codecs.n0;
import org.bson.codecs.configuration.d;

final class o implements f0
{
    private final d a;
    private final a0<?> b;
    
    o(final a0<?> b, final d a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public <S> n0<S> a(final q0<S> q0, final g0 g0) {
        if (q0.a() == this.b.g()) {
            return (n0<S>)this.b;
        }
        return this.a.a(q0.a());
    }
}
