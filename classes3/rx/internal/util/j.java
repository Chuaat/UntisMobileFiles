// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.util;

import rx.h;
import rx.n;

public final class j<T> extends n<T>
{
    final h<? super T> L;
    
    public j(final h<? super T> l) {
        this.L = l;
    }
    
    @Override
    public void b(final Throwable t) {
        this.L.b(t);
    }
    
    @Override
    public void c() {
        this.L.c();
    }
    
    @Override
    public void m(final T t) {
        this.L.m((Object)t);
    }
}
