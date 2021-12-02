// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.exceptions.c;
import rx.m;
import rx.functions.a;
import rx.k;

public final class o4<T> implements t<T>
{
    final t<T> G;
    final a H;
    
    public o4(final t<T> g, final a h) {
        this.G = g;
        this.H = h;
    }
    
    public void a(final m<? super T> m) {
        try {
            this.H.call();
            this.G.h(m);
        }
        finally {
            final Throwable t;
            c.e(t);
            m.b(t);
        }
    }
}
