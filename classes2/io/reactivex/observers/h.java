// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.observers;

import io.reactivex.internal.util.i;
import io.reactivex.internal.disposables.d;
import io.reactivex.internal.functions.b;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.disposables.c;
import io.reactivex.f;

public abstract class h implements f, c
{
    private final AtomicReference<c> G;
    private final io.reactivex.internal.disposables.f H;
    
    public h() {
        this.G = new AtomicReference<c>();
        this.H = new io.reactivex.internal.disposables.f();
    }
    
    public final void a(@io.reactivex.annotations.f final c c) {
        b.g(c, "resource is null");
        this.H.b(c);
    }
    
    protected void c() {
    }
    
    @Override
    public final void dispose() {
        if (d.b(this.G)) {
            this.H.dispose();
        }
    }
    
    @Override
    public final boolean i() {
        return d.d(this.G.get());
    }
    
    @Override
    public final void l(@io.reactivex.annotations.f final c c) {
        if (i.c(this.G, c, this.getClass())) {
            this.c();
        }
    }
}
