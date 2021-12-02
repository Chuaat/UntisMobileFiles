// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.provider;

import androidx.annotation.k0;
import java.util.Iterator;
import com.bumptech.glide.load.d;
import androidx.annotation.j0;
import java.util.ArrayList;
import java.util.List;

public class a
{
    private final List<a<?>> a;
    
    public a() {
        this.a = new ArrayList<a<?>>();
    }
    
    public <T> void a(@j0 final Class<T> clazz, @j0 final d<T> d) {
        synchronized (this) {
            this.a.add(new a<Object>((Class<Object>)clazz, (d<Object>)d));
        }
    }
    
    @k0
    public <T> d<T> b(@j0 final Class<T> clazz) {
        synchronized (this) {
            for (final a<?> a : this.a) {
                if (a.a(clazz)) {
                    return (d<T>)a.b;
                }
            }
            return null;
        }
    }
    
    public <T> void c(@j0 final Class<T> clazz, @j0 final d<T> d) {
        synchronized (this) {
            this.a.add(0, new a<Object>((Class<Object>)clazz, (d<Object>)d));
        }
    }
    
    private static final class a<T>
    {
        private final Class<T> a;
        final d<T> b;
        
        a(@j0 final Class<T> a, @j0 final d<T> b) {
            this.a = a;
            this.b = b;
        }
        
        boolean a(@j0 final Class<?> clazz) {
            return this.a.isAssignableFrom(clazz);
        }
    }
}
