// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.util;

import rx.functions.a;
import rx.functions.b;
import rx.n;

public final class c<T> extends n<T>
{
    final b<? super T> L;
    final b<Throwable> M;
    final a N;
    
    public c(final b<? super T> l, final b<Throwable> m, final a n) {
        this.L = l;
        this.M = m;
        this.N = n;
    }
    
    @Override
    public void b(final Throwable t) {
        this.M.h(t);
    }
    
    @Override
    public void c() {
        this.N.call();
    }
    
    @Override
    public void m(final T t) {
        this.L.h((Object)t);
    }
}
