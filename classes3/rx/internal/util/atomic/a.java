// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.util.atomic;

import java.util.Iterator;
import rx.internal.util.unsafe.p;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.AbstractQueue;

abstract class a<E> extends AbstractQueue<E>
{
    protected final AtomicReferenceArray<E> G;
    protected final int H;
    
    public a(int b) {
        b = p.b(b);
        this.H = b - 1;
        this.G = new AtomicReferenceArray<E>(b);
    }
    
    protected final int b(final long n) {
        return this.H & (int)n;
    }
    
    @Override
    public void clear() {
        while (true) {
            if (this.poll() == null) {
                if (!this.isEmpty()) {
                    continue;
                }
                break;
            }
        }
    }
    
    protected final int f(final long n, final int n2) {
        return (int)n & n2;
    }
    
    protected final E h(final int i) {
        return this.G.get(i);
    }
    
    protected final E i(final AtomicReferenceArray<E> atomicReferenceArray, final int i) {
        return atomicReferenceArray.get(i);
    }
    
    @Override
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }
    
    protected final E k(final int n) {
        return this.l(this.G, n);
    }
    
    protected final E l(final AtomicReferenceArray<E> atomicReferenceArray, final int i) {
        return atomicReferenceArray.get(i);
    }
    
    protected final void m(final int i, final E newValue) {
        this.G.lazySet(i, newValue);
    }
    
    protected final void n(final AtomicReferenceArray<E> atomicReferenceArray, final int i, final E newValue) {
        atomicReferenceArray.lazySet(i, newValue);
    }
    
    protected final void o(final int i, final E newValue) {
        this.G.lazySet(i, newValue);
    }
    
    protected final void p(final AtomicReferenceArray<E> atomicReferenceArray, final int i, final E newValue) {
        atomicReferenceArray.lazySet(i, newValue);
    }
    
    protected final void q(final AtomicReferenceArray<E> atomicReferenceArray, final int i, final E newValue) {
        atomicReferenceArray.set(i, newValue);
    }
}
