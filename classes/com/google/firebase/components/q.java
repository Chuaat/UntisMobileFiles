// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.components;

import androidx.annotation.t0;
import androidx.annotation.b1;
import java.util.HashSet;
import java.util.Collections;
import android.util.Log;
import java.util.Arrays;
import java.util.Iterator;
import j3.c;
import j3.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Map;
import java.util.Set;
import n3.b;

public class q extends a implements f3.a
{
    private static final n3.b<Set<Object>> g;
    private final Map<f<?>, n3.b<?>> a;
    private final Map<Class<?>, n3.b<?>> b;
    private final Map<Class<?>, a0<?>> c;
    private final List<n3.b<k>> d;
    private final x e;
    private final AtomicReference<Boolean> f;
    
    static {
        g = (n3.b)p.a;
    }
    
    private q(final Executor executor, final Iterable<n3.b<k>> iterable, final Collection<f<?>> collection) {
        this.a = new HashMap<f<?>, n3.b<?>>();
        this.b = new HashMap<Class<?>, n3.b<?>>();
        this.c = new HashMap<Class<?>, a0<?>>();
        this.f = new AtomicReference<Boolean>();
        final x e = new x(executor);
        this.e = e;
        final ArrayList<f<x>> list = new ArrayList<f<x>>();
        list.add(com.google.firebase.components.f.t(e, x.class, d.class, c.class));
        list.add(com.google.firebase.components.f.t((x)this, (Class<x>)f3.a.class, (Class<? super x>[])new Class[0]));
        for (final f<x> f : collection) {
            if (f != null) {
                list.add(f);
            }
        }
        this.d = p(iterable);
        this.l((List<f<?>>)list);
    }
    
    @Deprecated
    public q(final Executor executor, final Iterable<k> iterable, final f<?>... a) {
        this(executor, y(iterable), Arrays.asList(a));
    }
    
    public static b k(final Executor executor) {
        return new b(executor);
    }
    
    private void l(final List<f<?>> c) {
        final ArrayList<Runnable> list = new ArrayList<Runnable>();
        synchronized (this) {
            final Iterator<n3.b<k>> iterator = this.d.iterator();
            while (iterator.hasNext()) {
                final n3.b<k> b = iterator.next();
                try {
                    final k k = (k)b.get();
                    if (k == null) {
                        continue;
                    }
                    c.addAll(k.getComponents());
                    iterator.remove();
                }
                catch (y y) {
                    iterator.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", (Throwable)y);
                }
            }
            if (this.a.isEmpty()) {
                s.a(c);
            }
            else {
                final ArrayList list2 = new ArrayList<f<?>>(this.a.keySet());
                list2.addAll(c);
                s.a(list2);
            }
            for (final f<?> f : c) {
                this.a.put(f, (n3.b<?>)new z((n3.b<Object>)new o(this, f)));
            }
            list.addAll((Collection<?>)this.w(c));
            list.addAll((Collection<?>)this.x());
            this.v();
            // monitorexit(this)
            final Iterator<Object> iterator3 = list.iterator();
            while (iterator3.hasNext()) {
                iterator3.next().run();
            }
            this.u();
        }
    }
    
    private void m(final Map<f<?>, n3.b<?>> map, final boolean b) {
        for (final Map.Entry<f<?>, n3.b<?>> entry : map.entrySet()) {
            final f<?> f = entry.getKey();
            final n3.b<?> b2 = entry.getValue();
            if (f.l() || (f.m() && b)) {
                b2.get();
            }
        }
        this.e.f();
    }
    
    private static <T> List<T> p(final Iterable<T> iterable) {
        final ArrayList<T> list = new ArrayList<T>();
        final Iterator<T> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            list.add(iterator.next());
        }
        return list;
    }
    
    private void u() {
        final Boolean b = this.f.get();
        if (b != null) {
            this.m(this.a, b);
        }
    }
    
    private void v() {
        for (final f<?> f : this.a.keySet()) {
            for (final t t : f.f()) {
                Object o;
                Class<?> clazz;
                Object o2;
                if (t.g() && !this.c.containsKey(t.c())) {
                    o = this.c;
                    clazz = t.c();
                    o2 = a0.b((Collection<n3.b<?>>)Collections.emptySet());
                }
                else {
                    if (this.b.containsKey(t.c())) {
                        continue;
                    }
                    if (t.f()) {
                        throw new b0(String.format("Unsatisfied dependency for component %s: %s", f, t.c()));
                    }
                    if (t.g()) {
                        continue;
                    }
                    o = this.b;
                    clazz = t.c();
                    o2 = f0.e();
                }
                ((Map<Class<?>, a0>)o).put(clazz, (a0)o2);
            }
        }
    }
    
    private List<Runnable> w(final List<f<?>> list) {
        final ArrayList<m> list2 = (ArrayList<m>)new ArrayList<Runnable>();
        for (final f<?> f : list) {
            if (!f.o()) {
                continue;
            }
            final n3.b<?> b = this.a.get(f);
            for (final Class<?> clazz : f.h()) {
                if (!this.b.containsKey(clazz)) {
                    this.b.put(clazz, b);
                }
                else {
                    list2.add(new m((f0)this.b.get(clazz), b));
                }
            }
        }
        return (List<Runnable>)list2;
    }
    
    private List<Runnable> x() {
        final ArrayList<Runnable> list = new ArrayList<Runnable>();
        final HashMap<Object, HashSet<n3.b>> hashMap = new HashMap<Object, HashSet<n3.b>>();
        for (final Map.Entry<f<?>, n3.b<?>> entry : this.a.entrySet()) {
            final f<?> f = entry.getKey();
            if (f.o()) {
                continue;
            }
            final n3.b<?> b = entry.getValue();
            for (final Class<?> clazz : f.h()) {
                if (!hashMap.containsKey(clazz)) {
                    hashMap.put(clazz, new HashSet<n3.b>());
                }
                hashMap.get(clazz).add(b);
            }
        }
        for (final Map.Entry<Class<?>, HashSet<n3.b>> entry2 : hashMap.entrySet()) {
            if (!this.c.containsKey(entry2.getKey())) {
                this.c.put(entry2.getKey(), a0.b((Collection<n3.b<?>>)entry2.getValue()));
            }
            else {
                final a0<?> a0 = this.c.get(entry2.getKey());
                final Iterator<Object> iterator4 = entry2.getValue().iterator();
                while (iterator4.hasNext()) {
                    list.add(new l(a0, iterator4.next()));
                }
            }
        }
        return list;
    }
    
    private static Iterable<n3.b<k>> y(final Iterable<k> iterable) {
        final ArrayList<n> list = (ArrayList<n>)new ArrayList<n3.b<k>>();
        final Iterator<k> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            list.add(new n(iterator.next()));
        }
        return (Iterable<n3.b<k>>)list;
    }
    
    public <T> n3.b<T> b(final Class<T> clazz) {
        synchronized (this) {
            g0.c(clazz, "Null interface requested.");
            return (n3.b<T>)this.b.get(clazz);
        }
    }
    
    public void c() {
        synchronized (this) {
            if (this.d.isEmpty()) {
                return;
            }
            // monitorexit(this)
            this.l(new ArrayList<f<?>>());
        }
    }
    
    public <T> n3.b<Set<T>> d(final Class<T> clazz) {
        synchronized (this) {
            final a0<?> a0 = this.c.get(clazz);
            if (a0 != null) {
                return (n3.b<Set<T>>)a0;
            }
            return (n3.b<Set<T>>)q.g;
        }
    }
    
    public <T> n3.a<T> f(final Class<T> clazz) {
        final n3.b<T> b = this.b(clazz);
        if (b == null) {
            return (n3.a<T>)f0.e();
        }
        if (b instanceof f0) {
            return (n3.a<T>)(f0)b;
        }
        return (n3.a<T>)f0.i((n3.b<Object>)b);
    }
    
    @b1
    @t0({ t0.a.K })
    public void n() {
        final Iterator<n3.b<?>> iterator = this.a.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().get();
        }
    }
    
    public void o(final boolean b) {
        if (!this.f.compareAndSet(null, b)) {
            return;
        }
        synchronized (this) {
            final HashMap<f<?>, n3.b<?>> hashMap = new HashMap<f<?>, n3.b<?>>(this.a);
            // monitorexit(this)
            this.m(hashMap, b);
        }
    }
    
    public static final class b
    {
        private final Executor a;
        private final List<n3.b<k>> b;
        private final List<f<?>> c;
        
        b(final Executor a) {
            this.b = new ArrayList<n3.b<k>>();
            this.c = new ArrayList<f<?>>();
            this.a = a;
        }
        
        public b b(final f<?> f) {
            this.c.add(f);
            return this;
        }
        
        public b c(final k k) {
            this.b.add((n3.b<k>)new r(k));
            return this;
        }
        
        public b d(final Collection<n3.b<k>> collection) {
            this.b.addAll(collection);
            return this;
        }
        
        public q e() {
            return new q(this.a, this.b, this.c, null);
        }
    }
}
