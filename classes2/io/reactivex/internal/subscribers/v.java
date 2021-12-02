// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.subscribers;

import io.reactivex.internal.subscriptions.j;
import o7.d;
import io.reactivex.q;
import io.reactivex.disposables.c;
import java.util.concurrent.atomic.AtomicReference;

public final class v<T> extends AtomicReference<c> implements q<T>, c, d
{
    private static final long I = -8612022020200669122L;
    final o7.c<? super T> G;
    final AtomicReference<d> H;
    
    public v(final o7.c<? super T> g) {
        this.H = new AtomicReference<d>();
        this.G = g;
    }
    
    public void a(final c c) {
        io.reactivex.internal.disposables.d.h(this, c);
    }
    
    public void b(final Throwable t) {
        io.reactivex.internal.disposables.d.b(this);
        this.G.b(t);
    }
    
    public void cancel() {
        this.dispose();
    }
    
    @Override
    public void dispose() {
        j.b(this.H);
        io.reactivex.internal.disposables.d.b(this);
    }
    
    public void f() {
        io.reactivex.internal.disposables.d.b(this);
        this.G.f();
    }
    
    @Override
    public boolean i() {
        return this.H.get() == j.G;
    }
    
    public void m(final T t) {
        this.G.m((Object)t);
    }
    
    public void v(final long n) {
        if (j.m(n)) {
            this.H.get().v(n);
        }
    }
    
    @Override
    public void z(final d d) {
        if (j.k(this.H, d)) {
            this.G.z((d)this);
        }
    }
}
