// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.codecs;

import org.bson.m1;
import org.bson.codecs.configuration.d;
import org.bson.y0;
import org.bson.v0;
import org.bson.u0;
import org.bson.t0;
import org.bson.r0;
import org.bson.o0;
import org.bson.i0;
import org.bson.l0;
import org.bson.j0;
import org.bson.x;
import org.bson.f0;
import org.bson.e0;
import org.bson.c0;
import org.bson.y;
import org.bson.w;
import org.bson.v;
import org.bson.t;
import org.bson.o;
import org.bson.n;
import org.bson.m0;
import org.bson.x0;
import org.bson.w0;
import java.util.HashMap;
import java.util.Map;
import org.bson.codecs.configuration.b;

public class h0 implements b
{
    private static final d0 b;
    private final Map<Class<?>, n0<?>> a;
    
    static {
        final HashMap<w0, Class<x0>> hashMap = new HashMap<w0, Class<x0>>();
        hashMap.put(w0.R, m0.class);
        hashMap.put(w0.L, (Class<m0>)n.class);
        hashMap.put(w0.M, (Class<m0>)o.class);
        hashMap.put(w0.P, (Class<m0>)t.class);
        hashMap.put(w0.Q, (Class<m0>)v.class);
        hashMap.put(w0.T, (Class<m0>)w.class);
        hashMap.put(w0.K, (Class<m0>)y.class);
        hashMap.put(w0.I, (Class<m0>)c0.class);
        hashMap.put(w0.X, (Class<m0>)e0.class);
        hashMap.put(w0.Z, (Class<m0>)f0.class);
        hashMap.put(w0.a0, (Class<m0>)x.class);
        hashMap.put(w0.c0, (Class<m0>)j0.class);
        hashMap.put(w0.b0, (Class<m0>)l0.class);
        hashMap.put(w0.U, (Class<m0>)org.bson.h0.class);
        hashMap.put(w0.W, (Class<m0>)i0.class);
        hashMap.put(w0.O, (Class<m0>)o0.class);
        hashMap.put(w0.S, (Class<m0>)r0.class);
        hashMap.put(w0.J, (Class<m0>)t0.class);
        hashMap.put(w0.V, (Class<m0>)u0.class);
        hashMap.put(w0.Y, (Class<m0>)v0.class);
        hashMap.put(w0.N, (Class<m0>)x0.class);
        b = new d0((Map<w0, Class<?>>)hashMap);
    }
    
    public h0() {
        this.a = new HashMap<Class<?>, n0<?>>();
        this.c();
    }
    
    private <T extends y0> void a(final n0<T> n0) {
        this.a.put(n0.g(), n0);
    }
    
    private void c() {
        this.a((n0<y0>)new org.bson.codecs.x());
        this.a((n0<y0>)new h());
        this.a((n0<y0>)new i());
        this.a((n0<y0>)new m());
        this.a((n0<y0>)new l());
        this.a((n0<y0>)new q());
        this.a((n0<y0>)new r());
        this.a((n0<y0>)new s());
        this.a((n0<y0>)new org.bson.codecs.n());
        this.a((n0<y0>)new org.bson.codecs.w());
        this.a((n0<y0>)new org.bson.codecs.v());
        this.a((n0<y0>)new org.bson.codecs.t());
        this.a((n0<y0>)new org.bson.codecs.y());
        this.a((n0<y0>)new z());
        this.a((n0<y0>)new a0());
        this.a((n0<y0>)new b0());
        this.a((n0<y0>)new org.bson.codecs.c0());
        this.a((n0<y0>)new org.bson.codecs.f0());
    }
    
    public static d0 d() {
        return h0.b;
    }
    
    public static Class<? extends y0> e(final w0 w0) {
        return (Class<? extends y0>)h0.b.b(w0);
    }
    
    @Override
    public <T> n0<T> b(final Class<T> clazz, final d d) {
        if (this.a.containsKey(clazz)) {
            return (n0<T>)this.a.get(clazz);
        }
        if (clazz == i0.class) {
            return (n0<T>)new u(d.a(y.class));
        }
        if (clazz == y0.class) {
            return (n0<T>)new g0(d);
        }
        if (clazz == org.bson.a0.class) {
            return (n0<T>)new p(d.a(y.class));
        }
        if (clazz == m1.class) {
            return (n0<T>)new o1();
        }
        if (y.class.isAssignableFrom(clazz)) {
            return (n0<T>)new org.bson.codecs.o(d);
        }
        if (n.class.isAssignableFrom(clazz)) {
            return (n0<T>)new g(d);
        }
        return null;
    }
}
