// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.codecs.pojo;

import org.bson.codecs.s0;
import org.bson.p0;
import org.bson.codecs.x0;
import org.bson.z0;
import org.bson.codecs.n0;
import java.util.concurrent.ConcurrentMap;
import org.bson.codecs.configuration.d;

class x<T> extends a0<T>
{
    private final b<T> a;
    private final d b;
    private final g0 c;
    private final m d;
    private final ConcurrentMap<b<?>, n0<?>> e;
    private volatile b0<T> f;
    
    x(final b<T> a, final d b, final g0 c, final m d, final ConcurrentMap<b<?>, n0<?>> e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    private n0<T> h() {
        if (this.f == null) {
            this.f = new b0<T>(this.a, this.b, this.c, this.d, this.e, true);
        }
        return this.f;
    }
    
    @Override
    public void a(final z0 z0, final T t, final x0 x0) {
        this.h().a(z0, t, x0);
    }
    
    @Override
    public T c(final p0 p2, final s0 s0) {
        return this.h().c(p2, s0);
    }
    
    @Override
    b<T> e() {
        return this.a;
    }
    
    @Override
    public Class<T> g() {
        return this.a.l();
    }
}
