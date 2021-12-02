// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.observers;

import io.reactivex.internal.util.i;
import io.reactivex.annotations.f;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.disposables.c;
import io.reactivex.v;

public abstract class d<T> implements v<T>, c
{
    final AtomicReference<c> G;
    
    public d() {
        this.G = new AtomicReference<c>();
    }
    
    protected void a() {
    }
    
    @Override
    public final void dispose() {
        io.reactivex.internal.disposables.d.b(this.G);
    }
    
    @Override
    public final boolean i() {
        return this.G.get() == io.reactivex.internal.disposables.d.G;
    }
    
    @Override
    public final void l(@f final c c) {
        if (i.c(this.G, c, this.getClass())) {
            this.a();
        }
    }
}
