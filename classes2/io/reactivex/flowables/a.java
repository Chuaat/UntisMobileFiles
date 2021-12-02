// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.flowables;

import io.reactivex.j0;
import java.util.concurrent.TimeUnit;
import io.reactivex.annotations.h;
import io.reactivex.annotations.d;
import io.reactivex.annotations.b;
import io.reactivex.internal.operators.flowable.z2;
import io.reactivex.internal.operators.flowable.k;
import io.reactivex.disposables.c;
import x5.g;
import io.reactivex.annotations.f;
import io.reactivex.l;

public abstract class a<T> extends l<T>
{
    @f
    public l<T> P8() {
        return this.Q8(1);
    }
    
    @f
    public l<T> Q8(final int n) {
        return this.R8(n, io.reactivex.internal.functions.a.h());
    }
    
    @f
    public l<T> R8(final int n, @f final g<? super c> g) {
        if (n <= 0) {
            this.T8(g);
            return (l<T>)io.reactivex.plugins.a.T((a<Object>)this);
        }
        return io.reactivex.plugins.a.P(new k<T>((a<? extends T>)this, n, g));
    }
    
    public final c S8() {
        final io.reactivex.internal.util.g g = new io.reactivex.internal.util.g();
        this.T8(g);
        return g.G;
    }
    
    public abstract void T8(@f final g<? super c> p0);
    
    @b(io.reactivex.annotations.a.G)
    @d
    @h("none")
    @f
    public l<T> U8() {
        return io.reactivex.plugins.a.P(new z2<T>(this));
    }
    
    @b(io.reactivex.annotations.a.G)
    @d
    @h("none")
    public final l<T> V8(final int n) {
        return this.X8(n, 0L, TimeUnit.NANOSECONDS, io.reactivex.schedulers.b.i());
    }
    
    @b(io.reactivex.annotations.a.G)
    @d
    @h("io.reactivex:computation")
    public final l<T> W8(final int n, final long n2, final TimeUnit timeUnit) {
        return this.X8(n, n2, timeUnit, io.reactivex.schedulers.b.a());
    }
    
    @b(io.reactivex.annotations.a.G)
    @d
    @h("custom")
    public final l<T> X8(final int n, final long n2, final TimeUnit timeUnit, final j0 j0) {
        io.reactivex.internal.functions.b.h(n, "subscriberCount");
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.b.g(j0, "scheduler is null");
        return io.reactivex.plugins.a.P(new z2<T>(this, n, n2, timeUnit, j0));
    }
    
    @b(io.reactivex.annotations.a.G)
    @d
    @h("io.reactivex:computation")
    public final l<T> Y8(final long n, final TimeUnit timeUnit) {
        return this.X8(1, n, timeUnit, io.reactivex.schedulers.b.a());
    }
    
    @b(io.reactivex.annotations.a.G)
    @d
    @h("custom")
    public final l<T> Z8(final long n, final TimeUnit timeUnit, final j0 j0) {
        return this.X8(1, n, timeUnit, j0);
    }
}
