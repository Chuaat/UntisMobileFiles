// 
// Decompiled by Procyon v0.5.36
// 

package rx;

import rx.internal.util.q;

public abstract class m<T> implements o
{
    private final q G;
    
    public m() {
        this.G = new q();
    }
    
    public abstract void b(final Throwable p0);
    
    public final void d(final o o) {
        this.G.a(o);
    }
    
    public abstract void e(final T p0);
    
    @Override
    public final boolean g() {
        return this.G.g();
    }
    
    @Override
    public final void i() {
        this.G.i();
    }
}
