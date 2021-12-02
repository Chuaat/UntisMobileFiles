// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.util;

import rx.functions.a;
import rx.h;

public final class b<T> implements h<T>
{
    final rx.functions.b<? super T> G;
    final rx.functions.b<? super Throwable> H;
    final a I;
    
    public b(final rx.functions.b<? super T> g, final rx.functions.b<? super Throwable> h, final a i) {
        this.G = g;
        this.H = h;
        this.I = i;
    }
    
    @Override
    public void b(final Throwable t) {
        this.H.h(t);
    }
    
    @Override
    public void c() {
        this.I.call();
    }
    
    @Override
    public void m(final T t) {
        this.G.h((Object)t);
    }
}
