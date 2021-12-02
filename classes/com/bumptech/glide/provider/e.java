// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.provider;

import java.util.Collection;
import java.util.Iterator;
import com.bumptech.glide.load.l;
import androidx.annotation.j0;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;

public class e
{
    private final List<String> a;
    private final Map<String, List<a<?, ?>>> b;
    
    public e() {
        this.a = new ArrayList<String>();
        this.b = new HashMap<String, List<a<?, ?>>>();
    }
    
    @j0
    private List<a<?, ?>> c(@j0 final String s) {
        synchronized (this) {
            if (!this.a.contains(s)) {
                this.a.add(s);
            }
            List<a<?, ?>> list;
            if ((list = this.b.get(s)) == null) {
                list = new ArrayList<a<?, ?>>();
                this.b.put(s, list);
            }
            return list;
        }
    }
    
    public <T, R> void a(@j0 final String s, @j0 final l<T, R> l, @j0 final Class<T> clazz, @j0 final Class<R> clazz2) {
        synchronized (this) {
            this.c(s).add(new a<Object, Object>((Class<Object>)clazz, (Class<Object>)clazz2, (l<Object, Object>)l));
        }
    }
    
    @j0
    public <T, R> List<l<T, R>> b(@j0 final Class<T> clazz, @j0 final Class<R> clazz2) {
        synchronized (this) {
            final ArrayList<l<T, R>> list = new ArrayList<l<T, R>>();
            final Iterator<String> iterator = this.a.iterator();
            while (iterator.hasNext()) {
                final List<a<?, ?>> list2 = this.b.get(iterator.next());
                if (list2 == null) {
                    continue;
                }
                for (final a<?, ?> a : list2) {
                    if (a.a(clazz, clazz2)) {
                        list.add((l<T, R>)a.c);
                    }
                }
            }
            return (List<l<T, R>>)list;
        }
    }
    
    @j0
    public <T, R> List<Class<R>> d(@j0 final Class<T> clazz, @j0 final Class<R> clazz2) {
        synchronized (this) {
            final ArrayList<Class<R>> list = new ArrayList<Class<R>>();
            final Iterator<String> iterator = this.a.iterator();
            while (iterator.hasNext()) {
                final List<a<?, ?>> list2 = this.b.get(iterator.next());
                if (list2 == null) {
                    continue;
                }
                for (final a<?, ?> a : list2) {
                    if (a.a(clazz, clazz2) && !list.contains(a.b)) {
                        list.add((Class<R>)a.b);
                    }
                }
            }
            return (List<Class<R>>)list;
        }
    }
    
    public <T, R> void e(@j0 final String s, @j0 final l<T, R> l, @j0 final Class<T> clazz, @j0 final Class<R> clazz2) {
        synchronized (this) {
            this.c(s).add(0, new a<Object, Object>((Class<Object>)clazz, (Class<Object>)clazz2, (l<Object, Object>)l));
        }
    }
    
    public void f(@j0 final List<String> list) {
        synchronized (this) {
            final ArrayList<String> list2 = new ArrayList<String>(this.a);
            this.a.clear();
            final Iterator<String> iterator = list.iterator();
            while (iterator.hasNext()) {
                this.a.add(iterator.next());
            }
            for (final String s : list2) {
                if (!list.contains(s)) {
                    this.a.add(s);
                }
            }
        }
    }
    
    private static class a<T, R>
    {
        private final Class<T> a;
        final Class<R> b;
        final l<T, R> c;
        
        public a(@j0 final Class<T> a, @j0 final Class<R> b, final l<T, R> c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        public boolean a(@j0 final Class<?> clazz, @j0 final Class<?> clazz2) {
            return this.a.isAssignableFrom(clazz) && clazz2.isAssignableFrom(this.b);
        }
    }
}
