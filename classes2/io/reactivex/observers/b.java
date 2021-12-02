// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.observers;

import io.reactivex.internal.util.i;
import io.reactivex.annotations.f;
import io.reactivex.internal.disposables.d;
import io.reactivex.disposables.c;
import io.reactivex.i0;

public abstract class b<T> implements i0<T>
{
    private c G;
    
    protected final void a() {
        final c g = this.G;
        this.G = d.G;
        g.dispose();
    }
    
    protected void c() {
    }
    
    @Override
    public final void l(@f final c g) {
        if (i.e(this.G, g, this.getClass())) {
            this.G = g;
            this.c();
        }
    }
}
