// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.resource.transcode;

import java.util.Iterator;
import androidx.annotation.j0;
import java.util.ArrayList;
import java.util.List;

public class f
{
    private final List<a<?, ?>> a;
    
    public f() {
        this.a = new ArrayList<a<?, ?>>();
    }
    
    @j0
    public <Z, R> e<Z, R> a(@j0 final Class<Z> obj, @j0 final Class<R> obj2) {
        synchronized (this) {
            if (obj2.isAssignableFrom(obj)) {
                return (e<Z, R>)g.b();
            }
            for (final a<?, ?> a : this.a) {
                if (a.a(obj, obj2)) {
                    return (e<Z, R>)a.c;
                }
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("No transcoder registered to transcode from ");
            sb.append(obj);
            sb.append(" to ");
            sb.append(obj2);
            throw new IllegalArgumentException(sb.toString());
        }
    }
    
    @j0
    public <Z, R> List<Class<R>> b(@j0 final Class<Z> clazz, @j0 final Class<R> clazz2) {
        synchronized (this) {
            final ArrayList<Class<R>> list = new ArrayList<Class<R>>();
            if (clazz2.isAssignableFrom(clazz)) {
                list.add(clazz2);
                return list;
            }
            final Iterator<a<?, ?>> iterator = this.a.iterator();
            while (iterator.hasNext()) {
                if (iterator.next().a(clazz, clazz2)) {
                    list.add(clazz2);
                }
            }
            return list;
        }
    }
    
    public <Z, R> void c(@j0 final Class<Z> clazz, @j0 final Class<R> clazz2, @j0 final e<Z, R> e) {
        synchronized (this) {
            this.a.add(new a<Object, Object>((Class<Object>)clazz, (Class<Object>)clazz2, (e<Object, Object>)e));
        }
    }
    
    private static final class a<Z, R>
    {
        private final Class<Z> a;
        private final Class<R> b;
        final e<Z, R> c;
        
        a(@j0 final Class<Z> a, @j0 final Class<R> b, @j0 final e<Z, R> c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        public boolean a(@j0 final Class<?> clazz, @j0 final Class<?> clazz2) {
            return this.a.isAssignableFrom(clazz) && clazz2.isAssignableFrom(this.b);
        }
    }
}
