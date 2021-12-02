// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.provider;

import androidx.annotation.k0;
import com.bumptech.glide.load.m;
import androidx.annotation.j0;
import java.util.ArrayList;
import java.util.List;

public class f
{
    private final List<a<?>> a;
    
    public f() {
        this.a = new ArrayList<a<?>>();
    }
    
    public <Z> void a(@j0 final Class<Z> clazz, @j0 final m<Z> m) {
        synchronized (this) {
            this.a.add(new a<Object>((Class<Object>)clazz, (m<Object>)m));
        }
    }
    
    @k0
    public <Z> m<Z> b(@j0 final Class<Z> clazz) {
        // monitorenter(this)
        int i = 0;
        try {
            while (i < this.a.size()) {
                final a<?> a = this.a.get(i);
                if (a.a(clazz)) {
                    return (m<Z>)a.b;
                }
                ++i;
            }
            return null;
        }
        finally {
        }
        // monitorexit(this)
    }
    
    public <Z> void c(@j0 final Class<Z> clazz, @j0 final m<Z> m) {
        synchronized (this) {
            this.a.add(0, new a<Object>((Class<Object>)clazz, (m<Object>)m));
        }
    }
    
    private static final class a<T>
    {
        private final Class<T> a;
        final m<T> b;
        
        a(@j0 final Class<T> a, @j0 final m<T> b) {
            this.a = a;
            this.b = b;
        }
        
        boolean a(@j0 final Class<?> clazz) {
            return this.a.isAssignableFrom(clazz);
        }
    }
}
