// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.observables;

import io.reactivex.j0;
import io.reactivex.schedulers.b;
import java.util.concurrent.TimeUnit;
import io.reactivex.annotations.h;
import io.reactivex.annotations.d;
import io.reactivex.internal.operators.observable.n2;
import io.reactivex.internal.operators.observable.k;
import io.reactivex.disposables.c;
import x5.g;
import io.reactivex.annotations.f;
import io.reactivex.b0;

public abstract class a<T> extends b0<T>
{
    @f
    public b0<T> l8() {
        return this.m8(1);
    }
    
    @f
    public b0<T> m8(final int n) {
        return this.n8(n, io.reactivex.internal.functions.a.h());
    }
    
    @f
    public b0<T> n8(final int n, @f final g<? super c> g) {
        if (n <= 0) {
            this.p8(g);
            return (b0<T>)io.reactivex.plugins.a.U((a<Object>)this);
        }
        return io.reactivex.plugins.a.R(new k<T>((a<? extends T>)this, n, g));
    }
    
    public final c o8() {
        final io.reactivex.internal.util.g g = new io.reactivex.internal.util.g();
        this.p8(g);
        return g.G;
    }
    
    public abstract void p8(@f final g<? super c> p0);
    
    @d
    @h("none")
    @f
    public b0<T> q8() {
        return io.reactivex.plugins.a.R(new n2<T>(this));
    }
    
    @d
    @h("none")
    public final b0<T> r8(final int n) {
        return this.t8(n, 0L, TimeUnit.NANOSECONDS, b.i());
    }
    
    @d
    @h("io.reactivex:computation")
    public final b0<T> s8(final int n, final long n2, final TimeUnit timeUnit) {
        return this.t8(n, n2, timeUnit, b.a());
    }
    
    @d
    @h("custom")
    public final b0<T> t8(final int n, final long n2, final TimeUnit timeUnit, final j0 j0) {
        io.reactivex.internal.functions.b.h(n, "subscriberCount");
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.b.g(j0, "scheduler is null");
        return io.reactivex.plugins.a.R(new n2<T>(this, n, n2, timeUnit, j0));
    }
    
    @d
    @h("io.reactivex:computation")
    public final b0<T> u8(final long n, final TimeUnit timeUnit) {
        return this.t8(1, n, timeUnit, b.a());
    }
    
    @d
    @h("custom")
    public final b0<T> v8(final long n, final TimeUnit timeUnit, final j0 j0) {
        return this.t8(1, n, timeUnit, j0);
    }
}
