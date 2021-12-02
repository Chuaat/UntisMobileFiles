// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.util;

import rx.f;
import rx.functions.b;
import rx.h;

public final class a<T> implements h<T>
{
    final b<f<? super T>> G;
    
    public a(final b<f<? super T>> g) {
        this.G = g;
    }
    
    @Override
    public void b(final Throwable t) {
        this.G.h(f.d(t));
    }
    
    @Override
    public void c() {
        this.G.h(f.b());
    }
    
    @Override
    public void m(final T t) {
        this.G.h(f.e(t));
    }
}
