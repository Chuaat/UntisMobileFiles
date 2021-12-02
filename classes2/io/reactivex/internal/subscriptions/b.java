// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.subscriptions;

import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.disposables.c;
import o7.d;
import java.util.concurrent.atomic.AtomicLong;

public final class b extends AtomicLong implements d, c
{
    private static final long I = 7028635084060361255L;
    final AtomicReference<d> G;
    final AtomicReference<c> H;
    
    public b() {
        this.H = new AtomicReference<c>();
        this.G = new AtomicReference<d>();
    }
    
    public b(final c newValue) {
        this();
        this.H.lazySet(newValue);
    }
    
    public boolean a(final c c) {
        return io.reactivex.internal.disposables.d.f(this.H, c);
    }
    
    public boolean b(final c c) {
        return io.reactivex.internal.disposables.d.h(this.H, c);
    }
    
    public void c(final d d) {
        j.f(this.G, this, d);
    }
    
    public void cancel() {
        this.dispose();
    }
    
    public void dispose() {
        j.b(this.G);
        io.reactivex.internal.disposables.d.b(this.H);
    }
    
    public boolean i() {
        return this.G.get() == j.G;
    }
    
    public void v(final long n) {
        j.d(this.G, this, n);
    }
}
