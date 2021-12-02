// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.subscribers;

import io.reactivex.plugins.a;

public final class d<T> extends c<T>
{
    public void b(final Throwable h) {
        if (super.G == null) {
            super.H = h;
        }
        else {
            a.Y(h);
        }
        this.countDown();
    }
    
    public void m(final T g) {
        if (super.G == null) {
            super.G = g;
            super.I.cancel();
            this.countDown();
        }
    }
}
