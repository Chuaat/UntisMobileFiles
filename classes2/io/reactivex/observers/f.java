// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.observers;

import io.reactivex.internal.util.i;
import io.reactivex.internal.disposables.d;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.disposables.c;
import io.reactivex.n0;

public abstract class f<T> implements n0<T>, c
{
    final AtomicReference<c> G;
    
    public f() {
        this.G = new AtomicReference<c>();
    }
    
    protected void a() {
    }
    
    @Override
    public final void dispose() {
        d.b(this.G);
    }
    
    @Override
    public final boolean i() {
        return this.G.get() == d.G;
    }
    
    @Override
    public final void l(@io.reactivex.annotations.f final c c) {
        if (i.c(this.G, c, this.getClass())) {
            this.a();
        }
    }
}
