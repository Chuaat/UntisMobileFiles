// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.internal;

import org.bson.codecs.s0;
import org.bson.p0;
import org.bson.codecs.x0;
import org.bson.z0;
import org.bson.codecs.configuration.d;
import org.bson.codecs.n0;

class f<T> implements n0<T>
{
    private final d a;
    private final Class<T> b;
    private volatile n0<T> c;
    
    f(final d a, final Class<T> b) {
        this.a = a;
        this.b = b;
    }
    
    private n0<T> e() {
        if (this.c == null) {
            this.c = this.a.a(this.b);
        }
        return this.c;
    }
    
    @Override
    public void a(final z0 z0, final T t, final x0 x0) {
        this.e().a(z0, t, x0);
    }
    
    @Override
    public T c(final p0 p2, final s0 s0) {
        return this.e().c(p2, s0);
    }
    
    @Override
    public Class<T> g() {
        return this.b;
    }
}
