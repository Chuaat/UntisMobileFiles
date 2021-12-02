// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.observers;

import io.reactivex.internal.util.i;
import io.reactivex.internal.disposables.d;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.f;

public abstract class c implements f, io.reactivex.disposables.c
{
    final AtomicReference<io.reactivex.disposables.c> G;
    
    public c() {
        this.G = new AtomicReference<io.reactivex.disposables.c>();
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
    public final void l(@io.reactivex.annotations.f final io.reactivex.disposables.c c) {
        if (i.c(this.G, c, this.getClass())) {
            this.a();
        }
    }
}
