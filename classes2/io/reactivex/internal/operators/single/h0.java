// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.single;

import java.util.Iterator;
import io.reactivex.b0;
import o7.b;
import x5.o;
import io.reactivex.l;
import io.reactivex.q0;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;

public final class h0
{
    private h0() {
        throw new IllegalStateException("No instances!");
    }
    
    public static <T> Callable<NoSuchElementException> a() {
        return a.G;
    }
    
    public static <T> Iterable<? extends l<T>> b(final Iterable<? extends q0<? extends T>> iterable) {
        return (Iterable<? extends l<T>>)new c(iterable);
    }
    
    public static <T> o<q0<? extends T>, o7.b<? extends T>> c() {
        return (o<q0<? extends T>, o7.b<? extends T>>)b.G;
    }
    
    public static <T> o<q0<? extends T>, b0<? extends T>> d() {
        return (o<q0<? extends T>, b0<? extends T>>)e.G;
    }
    
    enum a implements Callable<NoSuchElementException>
    {
        G;
        
        public NoSuchElementException b() throws Exception {
            return new NoSuchElementException();
        }
    }
    
    enum b implements o<q0, o7.b>
    {
        G;
        
        public o7.b b(final q0 q0) {
            return (o7.b)new u0(q0);
        }
    }
    
    static final class c<T> implements Iterable<l<T>>
    {
        private final Iterable<? extends q0<? extends T>> G;
        
        c(final Iterable<? extends q0<? extends T>> g) {
            this.G = g;
        }
        
        @Override
        public Iterator<l<T>> iterator() {
            return new d<T>(this.G.iterator());
        }
    }
    
    static final class d<T> implements Iterator<l<T>>
    {
        private final Iterator<? extends q0<? extends T>> G;
        
        d(final Iterator<? extends q0<? extends T>> g) {
            this.G = g;
        }
        
        public l<T> a() {
            return new u0<T>((q0<? extends T>)this.G.next());
        }
        
        @Override
        public boolean hasNext() {
            return this.G.hasNext();
        }
        
        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
    
    enum e implements o<q0, b0>
    {
        G;
        
        public b0 b(final q0 q0) {
            return new v0(q0);
        }
    }
}
