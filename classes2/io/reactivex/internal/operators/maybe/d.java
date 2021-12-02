// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.maybe;

import io.reactivex.exceptions.b;
import x5.a;
import io.reactivex.observers.g;
import io.reactivex.v;
import io.reactivex.disposables.c;
import java.util.concurrent.atomic.AtomicReference;

public final class d<T> extends AtomicReference<c> implements v<T>, c, g
{
    private static final long J = -6076952298809384986L;
    final x5.g<? super T> G;
    final x5.g<? super Throwable> H;
    final a I;
    
    public d(final x5.g<? super T> g, final x5.g<? super Throwable> h, final a i) {
        this.G = g;
        this.H = h;
        this.I = i;
    }
    
    @Override
    public boolean a() {
        return this.H != io.reactivex.internal.functions.a.f;
    }
    
    @Override
    public void b(final Throwable t) {
        this.lazySet(io.reactivex.internal.disposables.d.G);
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
        this.lazySet(io.reactivex.internal.disposables.d.G);
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
        io.reactivex.internal.disposables.d.b(this);
    }
    
    @Override
    public void f() {
        this.lazySet(io.reactivex.internal.disposables.d.G);
        try {
            this.I.run();
        }
        finally {
            final Throwable t;
            b.b(t);
            io.reactivex.plugins.a.Y(t);
        }
    }
    
    @Override
    public boolean i() {
        return io.reactivex.internal.disposables.d.d(this.get());
    }
    
    @Override
    public void l(final c c) {
        io.reactivex.internal.disposables.d.j(this, c);
    }
}
