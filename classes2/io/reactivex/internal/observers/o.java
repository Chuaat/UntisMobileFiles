// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.observers;

import io.reactivex.plugins.a;
import io.reactivex.internal.disposables.d;
import io.reactivex.observers.g;
import io.reactivex.f;
import io.reactivex.disposables.c;
import java.util.concurrent.atomic.AtomicReference;

public final class o extends AtomicReference<c> implements f, c, g
{
    private static final long G = -7545121636549663526L;
    
    @Override
    public boolean a() {
        return false;
    }
    
    @Override
    public void b(final Throwable t) {
        ((AtomicReference<d>)this).lazySet(d.G);
        a.Y(new io.reactivex.exceptions.d(t));
    }
    
    @Override
    public void dispose() {
        d.b(this);
    }
    
    @Override
    public void f() {
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
