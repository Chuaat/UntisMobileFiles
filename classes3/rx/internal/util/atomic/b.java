// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.util.atomic;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import java.util.AbstractQueue;

abstract class b<E> extends AbstractQueue<E>
{
    private final AtomicReference<c<E>> G;
    private final AtomicReference<c<E>> H;
    
    public b() {
        this.G = new AtomicReference<c<E>>();
        this.H = new AtomicReference<c<E>>();
    }
    
    protected final c<E> b() {
        return this.H.get();
    }
    
    protected final c<E> f() {
        return this.G.get();
    }
    
    protected final c<E> h() {
        return this.H.get();
    }
    
    protected final c<E> i() {
        return this.G.get();
    }
    
    @Override
    public final boolean isEmpty() {
        return this.h() == this.i();
    }
    
    @Override
    public final Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }
    
    protected final void k(final c<E> newValue) {
        this.H.lazySet(newValue);
    }
    
    protected final void l(final c<E> newValue) {
        this.G.lazySet(newValue);
    }
    
    protected final c<E> m(final c<E> newValue) {
        return this.G.getAndSet(newValue);
    }
    
    @Override
    public final int size() {
        c<E> h;
        c<E> i;
        int n;
        c<E> c;
        for (h = this.h(), i = this.i(), n = 0; h != i && n < Integer.MAX_VALUE; ++n, h = c) {
            do {
                c = h.c();
            } while (c == null);
        }
        return n;
    }
}
