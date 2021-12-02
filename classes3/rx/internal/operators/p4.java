// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.subscriptions.f;
import rx.m;
import rx.functions.a;
import rx.k;

public final class p4<T> implements t<T>
{
    final t<T> G;
    final a H;
    
    public p4(final t<T> g, final a h) {
        this.G = g;
        this.H = h;
    }
    
    public void a(final m<? super T> m) {
        m.d(f.a(this.H));
        this.G.h(m);
    }
}
