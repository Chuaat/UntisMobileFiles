// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.d;
import io.reactivex.i0;
import io.reactivex.disposables.c;
import java.util.concurrent.atomic.AtomicReference;

public final class n4<T> extends AtomicReference<c> implements i0<T>, c
{
    private static final long I = -8612022020200669122L;
    final i0<? super T> G;
    final AtomicReference<c> H;
    
    public n4(final i0<? super T> g) {
        this.H = new AtomicReference<c>();
        this.G = g;
    }
    
    public void a(final c c) {
        d.h(this, c);
    }
    
    @Override
    public void b(final Throwable t) {
        this.dispose();
        this.G.b(t);
    }
    
    @Override
    public void dispose() {
        d.b(this.H);
        d.b(this);
    }
    
    @Override
    public void f() {
        this.dispose();
        this.G.f();
    }
    
    @Override
    public boolean i() {
        return this.H.get() == d.G;
    }
    
    @Override
    public void l(final c c) {
        if (d.j(this.H, c)) {
            this.G.l(this);
        }
    }
    
    @Override
    public void m(final T t) {
        this.G.m((Object)t);
    }
}
