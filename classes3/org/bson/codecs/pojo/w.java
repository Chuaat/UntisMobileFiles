// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.codecs.pojo;

import org.bson.codecs.s0;
import org.bson.p0;
import org.bson.codecs.x0;
import org.bson.z0;
import org.bson.codecs.configuration.a;
import org.bson.codecs.n0;

class w<S> implements n0<S>
{
    private final Class<S> a;
    private final a b;
    
    w(final Class<S> a, final a b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void a(final z0 z0, final S n, final x0 x0) {
        throw this.b;
    }
    
    @Override
    public S c(final p0 p2, final s0 s0) {
        throw this.b;
    }
    
    @Override
    public Class<S> g() {
        return this.a;
    }
}
