// 
// Decompiled by Procyon v0.5.36
// 

package rx.observers;

import rx.h;
import rx.n;

public class g<T> extends n<T>
{
    private final h<T> L;
    
    public g(final n<? super T> n) {
        this(n, true);
    }
    
    public g(final n<? super T> n, final boolean b) {
        super(n, b);
        this.L = new f<T>(n);
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
        this.L.m(t);
    }
}
