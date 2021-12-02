// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.observers;

import io.reactivex.exceptions.b;
import io.reactivex.internal.disposables.d;
import io.reactivex.internal.functions.a;
import io.reactivex.observers.g;
import io.reactivex.n0;
import io.reactivex.disposables.c;
import java.util.concurrent.atomic.AtomicReference;

public final class k<T> extends AtomicReference<c> implements n0<T>, c, g
{
    private static final long I = -7012088219455310787L;
    final x5.g<? super T> G;
    final x5.g<? super Throwable> H;
    
    public k(final x5.g<? super T> g, final x5.g<? super Throwable> h) {
        this.G = g;
        this.H = h;
    }
    
    @Override
    public boolean a() {
        return this.H != a.f;
    }
    
    @Override
    public void b(final Throwable t) {
        this.lazySet(d.G);
        try {
            this.H.accept(t);
        }
        finally {
            final Throwable t2;
            b.b(t2);
            io.reactivex.plugins.a.Y(new io.reactivex.exceptions.a(new Throwable[] { t, t2 }));
        }
    }
    
    @Override
    public void d(final T t) {
        this.lazySet(d.G);
        try {
            this.G.accept((Object)t);
        }
        finally {
            final Throwable t2;
            b.b(t2);
            io.reactivex.plugins.a.Y(t2);
        }
    }
    
    @Override
    public void dispose() {
        d.b(this);
    }
    
    @Override
    public boolean i() {
        return this.get() == d.G;
    }
    
    @Override
    public void l(final c c) {
        d.j(this, c);
    }
}
