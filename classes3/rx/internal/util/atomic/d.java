// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.util.atomic;

import java.util.Objects;

public final class d<E> extends b<E>
{
    public d() {
        final c<E> c = new c<E>();
        this.k(c);
        this.m(c);
    }
    
    @Override
    public boolean offer(final E obj) {
        Objects.requireNonNull(obj, "null elements not allowed");
        final c<E> c = new c<E>(obj);
        this.m(c).d(c);
        return true;
    }
    
    @Override
    public E peek() {
        final c<E> b = this.b();
        final c<E> c = b.c();
        if (c != null) {
            return c.b();
        }
        if (b != this.i()) {
            c<E> c2;
            do {
                c2 = b.c();
            } while (c2 == null);
            return c2.b();
        }
        return null;
    }
    
    @Override
    public E poll() {
        final c<E> b = this.b();
        c<E> c = b.c();
        if (c == null) {
            if (b == this.i()) {
                return null;
            }
            while ((c = b.c()) == null) {}
        }
        final E a = c.a();
        this.k(c);
        return a;
    }
}
