// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.util;

import java.util.Iterator;
import java.util.Collection;
import java.util.Set;
import java.util.Collections;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.ConcurrentMap;
import java.util.Map;

abstract class a<K, V, M extends Map<K, V>> implements ConcurrentMap<K, V>
{
    private volatile M G;
    private final transient Lock H;
    private final i<K, V> I;
    
    protected <N extends Map<? extends K, ? extends V>> a(final N n, final i.a a) {
        this.H = new ReentrantLock();
        this.G = e7.a.e("delegate", this.d((Map)e7.a.e("map", (N)n)));
        this.I = e7.a.e("viewType", a).b((a<K, V, Map>)this);
    }
    
    private boolean e(final Object o, final Object obj) {
        if (o == null) {
            return obj == null;
        }
        return o.equals(obj);
    }
    
    protected M c() {
        this.H.lock();
        try {
            return this.d(this.G);
        }
        finally {
            this.H.unlock();
        }
    }
    
    @Override
    public final void clear() {
        this.H.lock();
        try {
            this.g(this.d(Collections.emptyMap()));
        }
        finally {
            this.H.unlock();
        }
    }
    
    @Override
    public final boolean containsKey(final Object o) {
        return this.G.containsKey(o);
    }
    
    @Override
    public final boolean containsValue(final Object o) {
        return this.G.containsValue(o);
    }
    
    abstract <N extends Map<? extends K, ? extends V>> M d(final N p0);
    
    @Override
    public final Set<Entry<K, V>> entrySet() {
        return this.I.a();
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this.G.equals(o);
    }
    
    protected final M f() {
        return this.G;
    }
    
    protected void g(final M g) {
        this.G = g;
    }
    
    @Override
    public final V get(final Object o) {
        return ((Map<K, V>)this.G).get(o);
    }
    
    @Override
    public final int hashCode() {
        return this.G.hashCode();
    }
    
    @Override
    public final boolean isEmpty() {
        return this.G.isEmpty();
    }
    
    @Override
    public final Set<K> keySet() {
        return this.I.b();
    }
    
    @Override
    public final V put(final K k, final V v) {
        this.H.lock();
        try {
            final Map<K, V> c = this.c();
            try {
                return c.put(k, v);
            }
            finally {
                this.g((M)c);
            }
        }
        finally {
            this.H.unlock();
        }
    }
    
    @Override
    public final void putAll(final Map<? extends K, ? extends V> map) {
        this.H.lock();
        try {
            final Map<K, V> c = this.c();
            c.putAll(map);
            this.g((M)c);
        }
        finally {
            this.H.unlock();
        }
    }
    
    @Override
    public V putIfAbsent(final K k, final V v) {
        this.H.lock();
        try {
            if (this.G.containsKey(k)) {
                return ((Map<K, V>)this.G).get(k);
            }
            final Map<K, V> c = this.c();
            try {
                return c.put(k, v);
            }
            finally {
                this.g((M)c);
            }
            return ((Map<K, V>)this.G).get(k);
        }
        finally {
            this.H.unlock();
        }
    }
    
    @Override
    public final V remove(Object remove) {
        this.H.lock();
        try {
            V v = null;
            if (!this.G.containsKey(remove)) {
                v = null;
            }
            else {
                final Map<K, V> c = this.c();
                try {
                    remove = c.remove(remove);
                }
                finally {
                    this.g((M)c);
                }
            }
            return v;
        }
        finally {
            this.H.unlock();
        }
    }
    
    @Override
    public boolean remove(final Object o, final Object o2) {
        this.H.lock();
        try {
            boolean b;
            if (this.G.containsKey(o) && this.e(o2, ((Map<K, Object>)this.G).get(o))) {
                final Map<K, V> c = this.c();
                c.remove(o);
                this.g((M)c);
                b = true;
            }
            else {
                b = false;
            }
            return b;
        }
        finally {
            this.H.unlock();
        }
    }
    
    @Override
    public V replace(final K k, final V v) {
        this.H.lock();
        try {
            V v2 = null;
            if (!this.G.containsKey(k)) {
                v2 = null;
            }
            else {
                final Map<K, V> c = this.c();
                try {
                    c.put(k, v);
                }
                finally {
                    this.g((M)c);
                }
            }
            return v2;
        }
        finally {
            this.H.unlock();
        }
    }
    
    @Override
    public boolean replace(final K k, final V v, final V v2) {
        this.H.lock();
        try {
            boolean b;
            if (this.G.containsKey(k) && this.e(v, ((Map<K, Object>)this.G).get(k))) {
                final Map<K, V> c = this.c();
                c.put(k, v2);
                this.g((M)c);
                b = true;
            }
            else {
                b = false;
            }
            return b;
        }
        finally {
            this.H.unlock();
        }
    }
    
    @Override
    public final int size() {
        return this.G.size();
    }
    
    @Override
    public String toString() {
        return this.G.toString();
    }
    
    @Override
    public final Collection<V> values() {
        return this.I.c();
    }
    
    protected abstract static class b<E> implements Collection<E>
    {
        @Override
        public final boolean add(final E e) {
            throw new UnsupportedOperationException();
        }
        
        @Override
        public final boolean addAll(final Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }
        
        abstract Collection<E> b();
        
        @Override
        public final boolean contains(final Object o) {
            return this.b().contains(o);
        }
        
        @Override
        public final boolean containsAll(final Collection<?> collection) {
            return this.b().containsAll(collection);
        }
        
        @Override
        public boolean equals(final Object o) {
            return this.b().equals(o);
        }
        
        @Override
        public int hashCode() {
            return this.b().hashCode();
        }
        
        @Override
        public final boolean isEmpty() {
            return this.b().isEmpty();
        }
        
        @Override
        public final Iterator<E> iterator() {
            return new g<E>(this.b().iterator());
        }
        
        @Override
        public final int size() {
            return this.b().size();
        }
        
        @Override
        public final Object[] toArray() {
            return this.b().toArray();
        }
        
        @Override
        public final <T> T[] toArray(final T[] array) {
            return this.b().toArray(array);
        }
        
        @Override
        public String toString() {
            return this.b().toString();
        }
    }
    
    private class c extends b<Entry<K, V>> implements Set<Entry<K, V>>
    {
        @Override
        Collection<Entry<K, V>> b() {
            return (Collection<Entry<K, V>>)a.this.G.entrySet();
        }
        
        @Override
        public void clear() {
            a.this.H.lock();
            try {
                final Map<K, V> c = a.this.c();
                c.entrySet().clear();
                a.this.g(c);
            }
            finally {
                a.this.H.unlock();
            }
        }
        
        @Override
        public boolean remove(final Object o) {
            a.this.H.lock();
            try {
                boolean b = ((b)this).contains(o);
                if (!b) {
                    b = false;
                }
                else {
                    final Map<K, V> c = a.this.c();
                    try {
                        b = c.entrySet().remove(o);
                    }
                    finally {
                        a.this.g(c);
                    }
                }
                return b;
            }
            finally {
                a.this.H.unlock();
            }
        }
        
        @Override
        public boolean removeAll(final Collection<?> collection) {
            a.this.H.lock();
            try {
                final Map<K, V> c = a.this.c();
                try {
                    return c.entrySet().removeAll(collection);
                }
                finally {
                    a.this.g(c);
                }
            }
            finally {
                a.this.H.unlock();
            }
        }
        
        @Override
        public boolean retainAll(final Collection<?> collection) {
            a.this.H.lock();
            try {
                final Map<K, V> c = a.this.c();
                try {
                    return c.entrySet().retainAll(collection);
                }
                finally {
                    a.this.g(c);
                }
            }
            finally {
                a.this.H.unlock();
            }
        }
    }
    
    final class d extends i<K, V>
    {
        public Set<Entry<K, V>> a() {
            return Collections.unmodifiableSet((Set<? extends Entry<K, V>>)org.bson.util.a.this.G.entrySet());
        }
        
        public Set<K> b() {
            return Collections.unmodifiableSet(((Map<? extends K, V>)org.bson.util.a.this.G).keySet());
        }
        
        public Collection<V> c() {
            return Collections.unmodifiableCollection(((Map<K, ? extends V>)org.bson.util.a.this.G).values());
        }
    }
    
    private class e extends b<K> implements Set<K>
    {
        @Override
        Collection<K> b() {
            return (Collection<K>)a.this.G.keySet();
        }
        
        @Override
        public void clear() {
            a.this.H.lock();
            try {
                final Map<K, V> c = a.this.c();
                c.keySet().clear();
                a.this.g(c);
            }
            finally {
                a.this.H.unlock();
            }
        }
        
        @Override
        public boolean remove(final Object o) {
            return a.this.remove(o) != null;
        }
        
        @Override
        public boolean removeAll(final Collection<?> collection) {
            a.this.H.lock();
            try {
                final Map<K, V> c = a.this.c();
                try {
                    return c.keySet().removeAll(collection);
                }
                finally {
                    a.this.g(c);
                }
            }
            finally {
                a.this.H.unlock();
            }
        }
        
        @Override
        public boolean retainAll(final Collection<?> collection) {
            a.this.H.lock();
            try {
                final Map<K, V> c = a.this.c();
                try {
                    return c.keySet().retainAll(collection);
                }
                finally {
                    a.this.g(c);
                }
            }
            finally {
                a.this.H.unlock();
            }
        }
    }
    
    final class f extends i<K, V>
    {
        private final transient e a;
        private final transient c b;
        private final transient h c;
        
        f() {
            this.a = new e();
            this.b = new c();
            this.c = new h();
        }
        
        public Set<Entry<K, V>> a() {
            return this.b;
        }
        
        public Set<K> b() {
            return this.a;
        }
        
        public Collection<V> c() {
            return this.c;
        }
    }
    
    private static class g<T> implements Iterator<T>
    {
        private final Iterator<T> G;
        
        g(final Iterator<T> g) {
            this.G = g;
        }
        
        @Override
        public boolean hasNext() {
            return this.G.hasNext();
        }
        
        @Override
        public T next() {
            return this.G.next();
        }
        
        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
    
    private final class h extends b<V>
    {
        @Override
        Collection<V> b() {
            return ((Map<K, V>)a.this.G).values();
        }
        
        @Override
        public void clear() {
            a.this.H.lock();
            try {
                final Map<K, V> c = a.this.c();
                c.values().clear();
                a.this.g(c);
            }
            finally {
                a.this.H.unlock();
            }
        }
        
        @Override
        public boolean remove(final Object o) {
            a.this.H.lock();
            try {
                boolean b = ((b)this).contains(o);
                if (!b) {
                    b = false;
                }
                else {
                    final Map<K, V> c = a.this.c();
                    try {
                        b = c.values().remove(o);
                    }
                    finally {
                        a.this.g(c);
                    }
                }
                return b;
            }
            finally {
                a.this.H.unlock();
            }
        }
        
        @Override
        public boolean removeAll(final Collection<?> collection) {
            a.this.H.lock();
            try {
                final Map<K, V> c = a.this.c();
                try {
                    return c.values().removeAll(collection);
                }
                finally {
                    a.this.g(c);
                }
            }
            finally {
                a.this.H.unlock();
            }
        }
        
        @Override
        public boolean retainAll(final Collection<?> collection) {
            a.this.H.lock();
            try {
                final Map<K, V> c = a.this.c();
                try {
                    return c.values().retainAll(collection);
                }
                finally {
                    a.this.g(c);
                }
            }
            finally {
                a.this.H.unlock();
            }
        }
    }
    
    public abstract static class i<K, V>
    {
        i() {
        }
        
        abstract Set<Entry<K, V>> a();
        
        abstract Set<K> b();
        
        abstract Collection<V> c();
        
        public enum a
        {
            G(0) {
                @Override
                 <K, V, M extends Map<K, V>> i<K, V> b(final org.bson.util.a<K, V, M> a) {
                    a.getClass();
                    return (i<K, V>)a.new d();
                }
            }, 
            H(1) {
                @Override
                 <K, V, M extends Map<K, V>> i<K, V> b(final org.bson.util.a<K, V, M> a) {
                    a.getClass();
                    return (i<K, V>)a.new f();
                }
            };
            
            abstract <K, V, M extends Map<K, V>> i<K, V> b(final org.bson.util.a<K, V, M> p0);
        }
    }
}
