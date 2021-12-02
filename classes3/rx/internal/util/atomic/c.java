// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.util.atomic;

import java.util.concurrent.atomic.AtomicReference;

public final class c<E> extends AtomicReference<c<E>>
{
    private static final long H = 2404266111789071508L;
    private E G;
    
    public c() {
    }
    
    public c(final E e) {
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
    
    public c<E> c() {
        return this.get();
    }
    
    public void d(final c<E> newValue) {
        this.lazySet(newValue);
    }
    
    public void e(final E g) {
        this.G = g;
    }
}
