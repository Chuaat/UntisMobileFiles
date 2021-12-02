// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.model;

import androidx.annotation.k0;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import com.bumptech.glide.j;
import java.util.Iterator;
import java.util.Collections;
import androidx.annotation.j0;
import java.util.List;
import androidx.core.util.m;

public class p
{
    private final r a;
    private final a b;
    
    public p(@j0 final m.a<List<Throwable>> a) {
        this(new r(a));
    }
    
    private p(@j0 final r a) {
        this.b = new a();
        this.a = a;
    }
    
    @j0
    private static <A> Class<A> c(@j0 final A a) {
        return (Class<A>)a.getClass();
    }
    
    @j0
    private <A> List<n<A, ?>> f(@j0 final Class<A> clazz) {
        synchronized (this) {
            List<n<A, ?>> list;
            if ((list = this.b.b(clazz)) == null) {
                list = Collections.unmodifiableList((List<? extends n<A, ?>>)this.a.e(clazz));
                this.b.c(clazz, list);
            }
            return list;
        }
    }
    
    private <Model, Data> void j(@j0 final List<o<? extends Model, ? extends Data>> list) {
        final Iterator<o<? extends Model, ? extends Data>> iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next().a();
        }
    }
    
    public <Model, Data> void a(@j0 final Class<Model> clazz, @j0 final Class<Data> clazz2, @j0 final o<? extends Model, ? extends Data> o) {
        synchronized (this) {
            this.a.b(clazz, clazz2, o);
            this.b.a();
        }
    }
    
    public <Model, Data> n<Model, Data> b(@j0 final Class<Model> clazz, @j0 final Class<Data> clazz2) {
        synchronized (this) {
            return this.a.d(clazz, clazz2);
        }
    }
    
    @j0
    public List<Class<?>> d(@j0 final Class<?> clazz) {
        synchronized (this) {
            return this.a.g(clazz);
        }
    }
    
    @j0
    public <A> List<n<A, ?>> e(@j0 final A a) {
        final List<n<M, ?>> f = this.f((Class<M>)c((A)a));
        if (f.isEmpty()) {
            throw new j.c(a);
        }
        final int size = f.size();
        List<n<A, ?>> emptyList = Collections.emptyList();
        int n = 1;
        List<n<A, ?>> list;
        int n3;
        for (int i = 0; i < size; ++i, emptyList = list, n = n3) {
            final n<M, ?> n2 = f.get(i);
            list = emptyList;
            n3 = n;
            if (n2.a((M)a)) {
                if ((n3 = n) != 0) {
                    emptyList = new ArrayList<n<A, ?>>(size - i);
                    n3 = 0;
                }
                emptyList.add((n<A, Data>)n2);
                list = emptyList;
            }
        }
        if (!emptyList.isEmpty()) {
            return emptyList;
        }
        throw new j.c((M)a, f);
    }
    
    public <Model, Data> void g(@j0 final Class<Model> clazz, @j0 final Class<Data> clazz2, @j0 final o<? extends Model, ? extends Data> o) {
        synchronized (this) {
            this.a.i(clazz, clazz2, o);
            this.b.a();
        }
    }
    
    public <Model, Data> void h(@j0 final Class<Model> clazz, @j0 final Class<Data> clazz2) {
        synchronized (this) {
            this.j((List<o<?, ?>>)this.a.j(clazz, clazz2));
            this.b.a();
        }
    }
    
    public <Model, Data> void i(@j0 final Class<Model> clazz, @j0 final Class<Data> clazz2, @j0 final o<? extends Model, ? extends Data> o) {
        synchronized (this) {
            this.j((List<o<?, ?>>)this.a.k(clazz, clazz2, o));
            this.b.a();
        }
    }
    
    private static class a
    {
        private final Map<Class<?>, p.a.a<?>> a;
        
        a() {
            this.a = new HashMap<Class<?>, p.a.a<?>>();
        }
        
        public void a() {
            this.a.clear();
        }
        
        @k0
        public <Model> List<n<Model, ?>> b(final Class<Model> clazz) {
            final p.a.a<?> a = this.a.get(clazz);
            Object a2;
            if (a == null) {
                a2 = null;
            }
            else {
                a2 = a.a;
            }
            return (List<n<Model, ?>>)a2;
        }
        
        public <Model> void c(final Class<Model> obj, final List<n<Model, ?>> list) {
            if (this.a.put(obj, new p.a.a<Object>((List<n<?, ?>>)list)) == null) {
                return;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Already cached loaders for model: ");
            sb.append(obj);
            throw new IllegalStateException(sb.toString());
        }
        
        private static class a<Model>
        {
            final List<n<Model, ?>> a;
            
            public a(final List<n<Model, ?>> a) {
                this.a = a;
            }
        }
    }
}
