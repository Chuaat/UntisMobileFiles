// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api.internal;

import androidx.annotation.j0;
import com.google.android.gms.common.api.x;
import com.google.android.gms.common.api.w;
import com.google.android.gms.common.api.u;
import java.util.concurrent.TimeUnit;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.n;
import f2.a;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.t;

@f2.a
public final class r<R extends t> extends m<R>
{
    private final BasePendingResult<R> a;
    
    public r(@RecentlyNonNull final n<R> n) {
        this.a = (BasePendingResult<R>)n;
    }
    
    @Override
    public final void c(@RecentlyNonNull final a a) {
        this.a.c(a);
    }
    
    @RecentlyNonNull
    @Override
    public final R d() {
        return this.a.d();
    }
    
    @RecentlyNonNull
    @Override
    public final R e(@RecentlyNonNull final long n, @RecentlyNonNull final TimeUnit timeUnit) {
        return this.a.e(n, timeUnit);
    }
    
    @Override
    public final void f() {
        this.a.f();
    }
    
    @RecentlyNonNull
    @Override
    public final boolean g() {
        return this.a.g();
    }
    
    @Override
    public final void h(@RecentlyNonNull final u<? super R> u) {
        this.a.h(u);
    }
    
    @Override
    public final void i(@RecentlyNonNull final u<? super R> u, @RecentlyNonNull final long n, @RecentlyNonNull final TimeUnit timeUnit) {
        this.a.i(u, n, timeUnit);
    }
    
    @j0
    @Override
    public final <S extends t> x<S> j(@RecentlyNonNull final w<? super R, ? extends S> w) {
        return this.a.j((w<? super t, ? extends S>)w);
    }
    
    @RecentlyNonNull
    @Override
    public final R k() {
        if (this.l()) {
            return this.e(0L, TimeUnit.MILLISECONDS);
        }
        throw new IllegalStateException("Result is not available. Check that isDone() returns true before calling get().");
    }
    
    @RecentlyNonNull
    @Override
    public final boolean l() {
        return this.a.m();
    }
}
