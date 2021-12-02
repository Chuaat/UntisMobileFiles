// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.n;
import rx.g;

public final class i1<T> implements a<T>
{
    private final Throwable G;
    
    public i1(final Throwable g) {
        this.G = g;
    }
    
    public void a(final n<? super T> n) {
        n.b(this.G);
    }
}
