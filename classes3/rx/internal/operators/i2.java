// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.observers.h;
import rx.n;
import rx.functions.a;
import rx.g;

public class i2<T> implements b<T, T>
{
    private final rx.functions.a G;
    
    public i2(final rx.functions.a g) {
        this.G = g;
    }
    
    public n<? super T> a(final n<? super T> n) {
        this.G.call();
        return h.f(n);
    }
}
