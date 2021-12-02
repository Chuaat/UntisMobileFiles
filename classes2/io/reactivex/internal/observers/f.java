// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.observers;

public final class f<T> extends e<T>
{
    @Override
    public void b(final Throwable h) {
        if (super.G == null) {
            super.H = h;
        }
        this.countDown();
    }
    
    @Override
    public void m(final T g) {
        if (super.G == null) {
            super.G = g;
            super.I.dispose();
            this.countDown();
        }
    }
}
