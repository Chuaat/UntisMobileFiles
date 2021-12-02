// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.observers;

import io.reactivex.internal.disposables.d;
import io.reactivex.internal.util.q;
import java.util.Queue;
import io.reactivex.i0;
import io.reactivex.disposables.c;
import java.util.concurrent.atomic.AtomicReference;

public final class i<T> extends AtomicReference<c> implements i0<T>, c
{
    private static final long H = -4875965440900746268L;
    public static final Object I;
    final Queue<Object> G;
    
    static {
        I = new Object();
    }
    
    public i(final Queue<Object> g) {
        this.G = g;
    }
    
    @Override
    public void b(final Throwable t) {
        this.G.offer(q.j(t));
    }
    
    @Override
    public void dispose() {
        if (d.b(this)) {
            this.G.offer(i.I);
        }
    }
    
    @Override
    public void f() {
        this.G.offer(q.h());
    }
    
    @Override
    public boolean i() {
        return this.get() == d.G;
    }
    
    @Override
    public void l(final c c) {
        d.j(this, c);
    }
    
    @Override
    public void m(final T t) {
        this.G.offer(q.y(t));
    }
}
