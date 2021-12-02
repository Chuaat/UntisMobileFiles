// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.components;

import java.util.Collection;
import java.util.Iterator;
import java.util.Collections;
import java.util.Set;
import java.util.ArrayDeque;
import java.util.HashMap;
import j3.a;
import java.util.Queue;
import androidx.annotation.w;
import java.util.concurrent.Executor;
import j3.b;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import j3.c;
import j3.d;

class x implements d, c
{
    @w("this")
    private final Map<Class<?>, ConcurrentHashMap<b<Object>, Executor>> a;
    @w("this")
    private Queue<a<?>> b;
    private final Executor c;
    
    x(final Executor c) {
        this.a = new HashMap<Class<?>, ConcurrentHashMap<b<Object>, Executor>>();
        this.b = new ArrayDeque<a<?>>();
        this.c = c;
    }
    
    private Set<Map.Entry<b<Object>, Executor>> g(final a<?> a) {
        synchronized (this) {
            final ConcurrentHashMap<b<Object>, Executor> concurrentHashMap = this.a.get(a.b());
            Object o;
            if (concurrentHashMap == null) {
                o = Collections.emptySet();
            }
            else {
                o = concurrentHashMap.entrySet();
            }
            return (Set<Map.Entry<b<Object>, Executor>>)o;
        }
    }
    
    public <T> void a(final Class<T> clazz, final b<? super T> b) {
        this.b(clazz, this.c, b);
    }
    
    public <T> void b(final Class<T> clazz, final Executor value, final b<? super T> key) {
        synchronized (this) {
            g0.b(clazz);
            g0.b(key);
            g0.b(value);
            if (!this.a.containsKey(clazz)) {
                this.a.put(clazz, new ConcurrentHashMap<b<Object>, Executor>());
            }
            this.a.get(clazz).put((b<Object>)key, value);
        }
    }
    
    public <T> void c(final Class<T> clazz, final b<? super T> key) {
        synchronized (this) {
            g0.b(clazz);
            g0.b(key);
            if (!this.a.containsKey(clazz)) {
                return;
            }
            final ConcurrentHashMap<b<Object>, Executor> concurrentHashMap = this.a.get(clazz);
            concurrentHashMap.remove(key);
            if (concurrentHashMap.isEmpty()) {
                this.a.remove(clazz);
            }
        }
    }
    
    public void d(final a<?> a) {
        g0.b(a);
        synchronized (this) {
            final Queue<a<?>> b = this.b;
            if (b != null) {
                b.add(a);
                return;
            }
            // monitorexit(this)
            for (final Map.Entry<b<Object>, Executor> entry : this.g(a)) {
                entry.getValue().execute(new com.google.firebase.components.w((Map.Entry)entry, a));
            }
        }
    }
    
    void f() {
        synchronized (this) {
            Object b = this.b;
            if (b != null) {
                this.b = null;
            }
            else {
                b = null;
            }
            // monitorexit(this)
            if (b != null) {
                final Iterator<a> iterator = ((Collection<a>)b).iterator();
                while (iterator.hasNext()) {
                    this.d((a<?>)iterator.next());
                }
            }
        }
    }
}
