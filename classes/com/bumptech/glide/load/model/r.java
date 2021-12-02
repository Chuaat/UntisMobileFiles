// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.model;

import androidx.annotation.k0;
import java.util.Iterator;
import com.bumptech.glide.j;
import com.bumptech.glide.util.k;
import androidx.annotation.b1;
import java.util.HashSet;
import java.util.ArrayList;
import androidx.annotation.j0;
import androidx.core.util.m;
import java.util.Set;
import java.util.List;

public class r
{
    private static final c e;
    private static final n<Object, Object> f;
    private final List<b<?, ?>> a;
    private final c b;
    private final Set<b<?, ?>> c;
    private final m.a<List<Throwable>> d;
    
    static {
        e = new c();
        f = new a();
    }
    
    public r(@j0 final m.a<List<Throwable>> a) {
        this(a, r.e);
    }
    
    @b1
    r(@j0 final m.a<List<Throwable>> d, @j0 final c b) {
        this.a = new ArrayList<b<?, ?>>();
        this.c = new HashSet<b<?, ?>>();
        this.d = d;
        this.b = b;
    }
    
    private <Model, Data> void a(@j0 final Class<Model> clazz, @j0 final Class<Data> clazz2, @j0 final o<? extends Model, ? extends Data> o, final boolean b) {
        final b<Model, Data> b2 = new b<Model, Data>(clazz, clazz2, o);
        final List<b<?, ?>> a = this.a;
        int size;
        if (b) {
            size = a.size();
        }
        else {
            size = 0;
        }
        a.add(size, b2);
    }
    
    @j0
    private <Model, Data> n<Model, Data> c(@j0 final b<?, ?> b) {
        return k.d(b.c.c(this));
    }
    
    @j0
    private static <Model, Data> n<Model, Data> f() {
        return (n<Model, Data>)r.f;
    }
    
    @j0
    private <Model, Data> o<Model, Data> h(@j0 final b<?, ?> b) {
        return (o<Model, Data>)b.c;
    }
    
     <Model, Data> void b(@j0 final Class<Model> clazz, @j0 final Class<Data> clazz2, @j0 final o<? extends Model, ? extends Data> o) {
        synchronized (this) {
            this.a(clazz, clazz2, o, true);
        }
    }
    
    @j0
    public <Model, Data> n<Model, Data> d(@j0 final Class<Model> clazz, @j0 final Class<Data> clazz2) {
        // monitorenter(this)
        try {
            final ArrayList<n<Model, Data>> list = new ArrayList<n<Model, Data>>();
            final Iterator<b<?, ?>> iterator = this.a.iterator();
            boolean b = false;
            while (iterator.hasNext()) {
                final b<?, ?> b2 = iterator.next();
                if (this.c.contains(b2)) {
                    b = true;
                }
                else {
                    if (!b2.b(clazz, clazz2)) {
                        continue;
                    }
                    this.c.add(b2);
                    list.add(this.c(b2));
                    this.c.remove(b2);
                }
            }
            if (list.size() > 1) {
                // monitorexit(this)
                return this.b.a(list, this.d);
            }
            if (list.size() == 1) {
                // monitorexit(this)
                return list.get(0);
            }
            if (b) {
                // monitorexit(this)
                return f();
            }
            throw new j.c(clazz, clazz2);
        }
        finally {
            try {
                this.c.clear();
            }
            finally {
            }
            // monitorexit(this)
        }
    }
    
    @j0
     <Model> List<n<Model, ?>> e(@j0 final Class<Model> clazz) {
        // monitorenter(this)
        try {
            final ArrayList<n<Object, Object>> list = new ArrayList<n<Object, Object>>();
            for (final b<?, ?> b : this.a) {
                if (this.c.contains(b)) {
                    continue;
                }
                if (!b.a(clazz)) {
                    continue;
                }
                this.c.add(b);
                list.add(this.c(b));
                this.c.remove(b);
            }
            // monitorexit(this)
            return (List<n<Model, ?>>)list;
        }
        finally {
            try {
                this.c.clear();
            }
            finally {
            }
            // monitorexit(this)
        }
    }
    
    @j0
    List<Class<?>> g(@j0 final Class<?> clazz) {
        synchronized (this) {
            final ArrayList<Class<Data>> list = new ArrayList<Class<Data>>();
            for (final b<?, ?> b : this.a) {
                if (!list.contains(b.b) && b.a(clazz)) {
                    list.add((Class<Data>)b.b);
                }
            }
            return (List<Class<?>>)list;
        }
    }
    
     <Model, Data> void i(@j0 final Class<Model> clazz, @j0 final Class<Data> clazz2, @j0 final o<? extends Model, ? extends Data> o) {
        synchronized (this) {
            this.a(clazz, clazz2, o, false);
        }
    }
    
    @j0
     <Model, Data> List<o<? extends Model, ? extends Data>> j(@j0 final Class<Model> clazz, @j0 final Class<Data> clazz2) {
        synchronized (this) {
            final ArrayList<o<Object, Object>> list = new ArrayList<o<Object, Object>>();
            final Iterator<b<?, ?>> iterator = this.a.iterator();
            while (iterator.hasNext()) {
                final b<?, ?> b = iterator.next();
                if (b.b(clazz, clazz2)) {
                    iterator.remove();
                    list.add(this.h(b));
                }
            }
            return (List<o<? extends Model, ? extends Data>>)list;
        }
    }
    
    @j0
     <Model, Data> List<o<? extends Model, ? extends Data>> k(@j0 final Class<Model> clazz, @j0 final Class<Data> clazz2, @j0 final o<? extends Model, ? extends Data> o) {
        synchronized (this) {
            final List<o<? extends Model, ? extends Data>> j = this.j(clazz, clazz2);
            this.b(clazz, clazz2, o);
            return j;
        }
    }
    
    private static class a implements n<Object, Object>
    {
        a() {
        }
        
        @Override
        public boolean a(@j0 final Object o) {
            return false;
        }
        
        @k0
        @Override
        public n.a<Object> b(@j0 final Object o, final int n, final int n2, @j0 final com.bumptech.glide.load.j j) {
            return null;
        }
    }
    
    private static class b<Model, Data>
    {
        private final Class<Model> a;
        final Class<Data> b;
        final o<? extends Model, ? extends Data> c;
        
        public b(@j0 final Class<Model> a, @j0 final Class<Data> b, @j0 final o<? extends Model, ? extends Data> c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        public boolean a(@j0 final Class<?> clazz) {
            return this.a.isAssignableFrom(clazz);
        }
        
        public boolean b(@j0 final Class<?> clazz, @j0 final Class<?> clazz2) {
            return this.a(clazz) && this.b.isAssignableFrom(clazz2);
        }
    }
    
    static class c
    {
        @j0
        public <Model, Data> q<Model, Data> a(@j0 final List<n<Model, Data>> list, @j0 final m.a<List<Throwable>> a) {
            return new q<Model, Data>(list, a);
        }
    }
}
