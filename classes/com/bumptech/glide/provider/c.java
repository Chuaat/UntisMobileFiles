// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.provider;

import androidx.annotation.k0;
import java.util.List;
import androidx.core.util.m;
import com.bumptech.glide.load.resource.transcode.e;
import com.bumptech.glide.load.engine.i;
import com.bumptech.glide.load.resource.transcode.g;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import com.bumptech.glide.util.j;
import androidx.collection.a;
import com.bumptech.glide.load.engine.t;

public class c
{
    private static final t<?, ?, ?> c;
    private final a<j, t<?, ?, ?>> a;
    private final AtomicReference<j> b;
    
    static {
        c = new t<Object, Object, Object>(Object.class, Object.class, Object.class, (List<i<?, ?, ?>>)Collections.singletonList((i<Data, ResourceType, Transcode>)new i<Object, Object, Object>((Class<Data>)Object.class, (Class<ResourceType>)Object.class, (Class<Transcode>)Object.class, Collections.emptyList(), (e<ResourceType, Transcode>)new g(), null)), null);
    }
    
    public c() {
        this.a = new a<j, t<?, ?, ?>>();
        this.b = new AtomicReference<j>();
    }
    
    private j b(final Class<?> clazz, final Class<?> clazz2, final Class<?> clazz3) {
        j j;
        if ((j = this.b.getAndSet(null)) == null) {
            j = new j();
        }
        j.b(clazz, clazz2, clazz3);
        return j;
    }
    
    @k0
    public <Data, TResource, Transcode> t<Data, TResource, Transcode> a(final Class<Data> clazz, final Class<TResource> clazz2, final Class<Transcode> clazz3) {
        final j b = this.b(clazz, clazz2, clazz3);
        synchronized (this.a) {
            final t<?, ?, ?> t = this.a.get(b);
            // monitorexit(this.a)
            this.b.set(b);
            return (t<Data, TResource, Transcode>)t;
        }
    }
    
    public boolean c(@k0 final t<?, ?, ?> obj) {
        return com.bumptech.glide.provider.c.c.equals(obj);
    }
    
    public void d(final Class<?> clazz, final Class<?> clazz2, final Class<?> clazz3, @k0 t<?, ?, ?> c) {
        synchronized (this.a) {
            final a<j, t<?, ?, ?>> a = this.a;
            final j j = new j(clazz, clazz2, clazz3);
            if (c == null) {
                c = c.c;
            }
            a.put(j, c);
        }
    }
}
