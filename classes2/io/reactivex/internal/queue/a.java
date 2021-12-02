// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.queue;

import io.reactivex.annotations.g;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import y5.n;

public final class a<T> implements n<T>
{
    private final AtomicReference<a<T>> G;
    private final AtomicReference<a<T>> H;
    
    public a() {
        this.G = new AtomicReference<a<T>>();
        this.H = new AtomicReference<a<T>>();
        final a<T> a = new a<T>();
        this.d(a);
        this.e(a);
    }
    
    a<T> a() {
        return this.H.get();
    }
    
    a<T> b() {
        return this.H.get();
    }
    
    a<T> c() {
        return this.G.get();
    }
    
    @Override
    public void clear() {
        while (this.poll() != null && !this.isEmpty()) {}
    }
    
    void d(final a<T> newValue) {
        this.H.lazySet(newValue);
    }
    
    a<T> e(final a<T> newValue) {
        return this.G.getAndSet(newValue);
    }
    
    @Override
    public boolean isEmpty() {
        return this.b() == this.c();
    }
    
    @Override
    public boolean offer(final T obj) {
        Objects.requireNonNull(obj, "Null is not a valid element");
        final a<T> a = new a<T>(obj);
        this.e(a).d(a);
        return true;
    }
    
    @Override
    public boolean p(final T t, final T t2) {
        this.offer(t);
        this.offer(t2);
        return true;
    }
    
    @g
    @Override
    public T poll() {
        final a<T> a = this.a();
        a<T> a2 = a.c();
        if (a2 == null) {
            if (a == this.c()) {
                return null;
            }
            while ((a2 = a.c()) == null) {}
        }
        final T a3 = a2.a();
        this.d(a2);
        return a3;
    }
    
    static final class a<E> extends AtomicReference<a<E>>
    {
        private static final long H = 2404266111789071508L;
        private E G;
        
        a() {
        }
        
        a(final E e) {
            this.e(e);
        }
        
        public E a() {
            final E b = this.b();
            this.e(null);
            return b;
        }
        
        public E b() {
            return this.G;
        }
        
        public a<E> c() {
            return this.get();
        }
        
        public void d(final a<E> newValue) {
            this.lazySet(newValue);
        }
        
        public void e(final E g) {
            this.G = g;
        }
    }
}
