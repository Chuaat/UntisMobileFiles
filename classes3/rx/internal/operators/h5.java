// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.o;
import rx.n;
import rx.k;
import rx.g;

public final class h5<T> implements a<T>
{
    final rx.k.t<T> G;
    
    public h5(final rx.k.t<T> g) {
        this.G = g;
    }
    
    public void a(final n<? super T> n) {
        final u4.a<Object> a = new u4.a<Object>((n<? super Object>)n);
        n.r(a);
        this.G.h(a);
    }
}
