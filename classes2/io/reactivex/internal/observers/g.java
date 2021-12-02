// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.observers;

public final class g<T> extends e<T>
{
    @Override
    public void b(final Throwable h) {
        super.G = null;
        super.H = h;
        this.countDown();
    }
    
    @Override
    public void m(final T g) {
        super.G = g;
    }
}
