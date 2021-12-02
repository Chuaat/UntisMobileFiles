// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.observers;

import io.reactivex.exceptions.a;
import x5.b;
import io.reactivex.n0;
import io.reactivex.disposables.c;
import java.util.concurrent.atomic.AtomicReference;

public final class d<T> extends AtomicReference<c> implements n0<T>, c
{
    private static final long H = 4943102778943297569L;
    final b<? super T, ? super Throwable> G;
    
    public d(final b<? super T, ? super Throwable> g) {
        this.G = g;
    }
    
    @Override
    public void b(final Throwable t) {
        try {
            this.lazySet(io.reactivex.internal.disposables.d.G);
            this.G.a((Object)null, t);
        }
        finally {
            final Throwable t2;
            io.reactivex.exceptions.b.b(t2);
            io.reactivex.plugins.a.Y(new a(new Throwable[] { t, t2 }));
        }
    }
    
    @Override
    public void d(final T t) {
        try {
            this.lazySet(io.reactivex.internal.disposables.d.G);
            this.G.a((Object)t, (Object)null);
        }
        finally {
            final Throwable t2;
            io.reactivex.exceptions.b.b(t2);
            io.reactivex.plugins.a.Y(t2);
        }
    }
    
    @Override
    public void dispose() {
        io.reactivex.internal.disposables.d.b(this);
    }
    
    @Override
    public boolean i() {
        return this.get() == io.reactivex.internal.disposables.d.G;
    }
    
    @Override
    public void l(final c c) {
        io.reactivex.internal.disposables.d.j(this, c);
    }
}
