// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.subscribers;

import io.reactivex.exceptions.b;
import io.reactivex.internal.subscriptions.j;
import x5.a;
import io.reactivex.observers.g;
import io.reactivex.disposables.c;
import io.reactivex.q;
import o7.d;
import java.util.concurrent.atomic.AtomicReference;

public final class m<T> extends AtomicReference<d> implements q<T>, d, c, g
{
    private static final long K = -7251123623727029452L;
    final x5.g<? super T> G;
    final x5.g<? super Throwable> H;
    final a I;
    final x5.g<? super d> J;
    
    public m(final x5.g<? super T> g, final x5.g<? super Throwable> h, final a i, final x5.g<? super d> j) {
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
    }
    
    public boolean a() {
        return this.H != io.reactivex.internal.functions.a.f;
    }
    
    public void b(final Throwable t) {
        final j value = this.get();
        final j g = j.G;
        if (value != g) {
            this.lazySet((d)g);
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
    
    public void cancel() {
        j.b(this);
    }
    
    public void dispose() {
        this.cancel();
    }
    
    public void f() {
        final j value = this.get();
        final j g = j.G;
        if (value != g) {
            this.lazySet((d)g);
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
    
    public boolean i() {
        return this.get() == j.G;
    }
    
    public void m(final T t) {
        if (!this.i()) {
            try {
                this.G.accept((Object)t);
            }
            finally {
                final Throwable t2;
                b.b(t2);
                this.get().cancel();
                this.b(t2);
            }
        }
    }
    
    public void v(final long n) {
        this.get().v(n);
    }
    
    @Override
    public void z(final d d) {
        if (j.k(this, d)) {
            try {
                this.J.accept((Object)this);
            }
            finally {
                final Throwable t;
                b.b(t);
                d.cancel();
                this.b(t);
            }
        }
    }
}
