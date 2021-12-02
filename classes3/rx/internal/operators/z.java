// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.observers.h;
import rx.n;
import rx.o;
import rx.functions.b;
import rx.observables.c;
import rx.g;
import java.util.concurrent.atomic.AtomicInteger;

public final class z<T> extends AtomicInteger implements a<T>
{
    final rx.observables.c<? extends T> G;
    final int H;
    final b<? super o> I;
    
    public z(final rx.observables.c<? extends T> g, final int h, final b<? super o> i) {
        if (h > 0) {
            this.G = g;
            this.H = h;
            this.I = i;
            return;
        }
        throw new IllegalArgumentException("numberOfSubscribers > 0 required");
    }
    
    public void a(final n<? super T> n) {
        this.G.R6(h.f((n<? super Object>)n));
        if (this.incrementAndGet() == this.H) {
            this.G.I7(this.I);
        }
    }
}
