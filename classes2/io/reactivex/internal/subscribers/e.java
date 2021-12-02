// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.subscribers;

public final class e<T> extends c<T>
{
    public void b(final Throwable h) {
        super.G = null;
        super.H = h;
        this.countDown();
    }
    
    public void m(final T g) {
        super.G = g;
    }
}
