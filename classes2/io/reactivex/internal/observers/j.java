// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.observers;

import io.reactivex.internal.disposables.d;
import io.reactivex.exceptions.b;
import x5.a;
import x5.g;
import io.reactivex.f;
import io.reactivex.disposables.c;
import java.util.concurrent.atomic.AtomicReference;

public final class j extends AtomicReference<c> implements f, c, g<Throwable>, io.reactivex.observers.g
{
    private static final long I = -4361286194466301354L;
    final g<? super Throwable> G;
    final a H;
    
    public j(final a h) {
        this.G = this;
        this.H = h;
    }
    
    public j(final g<? super Throwable> g, final a h) {
        this.G = g;
        this.H = h;
    }
    
    @Override
    public boolean a() {
        return this.G != this;
    }
    
    @Override
    public void b(final Throwable t) {
        try {
            this.G.accept(t);
        }
        finally {
            b.b(t);
            io.reactivex.plugins.a.Y(t);
        }
        ((AtomicReference<d>)this).lazySet(d.G);
    }
    
    public void c(final Throwable t) {
        io.reactivex.plugins.a.Y(new io.reactivex.exceptions.d(t));
    }
    
    @Override
    public void dispose() {
        d.b(this);
    }
    
    @Override
    public void f() {
        try {
            this.H.run();
        }
        finally {
            final Throwable t;
            b.b(t);
            io.reactivex.plugins.a.Y(t);
        }
        ((AtomicReference<d>)this).lazySet(d.G);
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
