// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.observers;

import io.reactivex.exceptions.b;
import io.reactivex.internal.disposables.d;
import x5.a;
import io.reactivex.observers.g;
import io.reactivex.i0;
import io.reactivex.disposables.c;
import java.util.concurrent.atomic.AtomicReference;

public final class u<T> extends AtomicReference<c> implements i0<T>, c, g
{
    private static final long K = -7251123623727029452L;
    final x5.g<? super T> G;
    final x5.g<? super Throwable> H;
    final a I;
    final x5.g<? super c> J;
    
    public u(final x5.g<? super T> g, final x5.g<? super Throwable> h, final a i, final x5.g<? super c> j) {
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
    }
    
    @Override
    public boolean a() {
        return this.H != io.reactivex.internal.functions.a.f;
    }
    
    @Override
    public void b(final Throwable t) {
        if (!this.i()) {
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
        else {
            io.reactivex.plugins.a.Y(t);
        }
    }
    
    @Override
    public void dispose() {
        d.b(this);
    }
    
    @Override
    public void f() {
        if (!this.i()) {
            this.lazySet(d.G);
            try {
                this.I.run();
            }
            finally {
                final Throwable t;
                b.b(t);
                io.reactivex.plugins.a.Y(t);
            }
        }
    }
    
    @Override
    public boolean i() {
        return this.get() == d.G;
    }
    
    @Override
    public void l(final c c) {
        if (d.j(this, c)) {
            try {
                this.J.accept(this);
            }
            finally {
                final Throwable t;
                b.b(t);
                c.dispose();
                this.b(t);
            }
        }
    }
    
    @Override
    public void m(final T t) {
        if (!this.i()) {
            try {
                this.G.accept((Object)t);
            }
            finally {
                final Throwable t2;
                b.b(t2);
                this.get().dispose();
                this.b(t2);
            }
        }
    }
}
