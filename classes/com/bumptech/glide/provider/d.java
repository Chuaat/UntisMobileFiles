// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.provider;

import androidx.annotation.k0;
import androidx.annotation.j0;
import java.util.List;
import androidx.collection.a;
import com.bumptech.glide.util.j;
import java.util.concurrent.atomic.AtomicReference;

public class d
{
    private final AtomicReference<j> a;
    private final a<j, List<Class<?>>> b;
    
    public d() {
        this.a = new AtomicReference<j>();
        this.b = new a<j, List<Class<?>>>();
    }
    
    public void a() {
        synchronized (this.b) {
            this.b.clear();
        }
    }
    
    @k0
    public List<Class<?>> b(@j0 final Class<?> clazz, @j0 final Class<?> clazz2, @j0 final Class<?> clazz3) {
        final j j = this.a.getAndSet(null);
        j newValue;
        if (j == null) {
            newValue = new j(clazz, clazz2, clazz3);
        }
        else {
            j.b(clazz, clazz2, clazz3);
            newValue = j;
        }
        synchronized (this.b) {
            final List<Class<?>> list = this.b.get(newValue);
            // monitorexit(this.b)
            this.a.set(newValue);
            return list;
        }
    }
    
    public void c(@j0 final Class<?> clazz, @j0 final Class<?> clazz2, @j0 final Class<?> clazz3, @j0 final List<Class<?>> list) {
        synchronized (this.b) {
            this.b.put(new j(clazz, clazz2, clazz3), list);
        }
    }
}
