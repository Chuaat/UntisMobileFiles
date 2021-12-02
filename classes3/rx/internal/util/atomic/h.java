// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.util.atomic;

import java.util.Objects;

public final class h<E> extends b<E>
{
    public h() {
        final c<E> c = new c<E>();
        this.l(c);
        this.k(c);
        c.d(null);
    }
    
    @Override
    public boolean offer(final E obj) {
        Objects.requireNonNull(obj, "null elements not allowed");
        final c<E> c = new c<E>(obj);
        this.f().d(c);
        this.l(c);
        return true;
    }
    
    @Override
    public E peek() {
        final c<E> c = this.b().c();
        if (c != null) {
            return c.b();
        }
        return null;
    }
    
    @Override
    public E poll() {
        final c<E> c = this.b().c();
        if (c != null) {
            final E a = c.a();
            this.k(c);
            return a;
        }
        return null;
    }
}
