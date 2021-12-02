// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.functions.p;

public class a5<T, R> implements p<T, R>
{
    final Class<R> G;
    
    public a5(final Class<R> g) {
        this.G = g;
    }
    
    @Override
    public R h(final T obj) {
        return this.G.cast(obj);
    }
}
