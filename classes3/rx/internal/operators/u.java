// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.plugins.c;
import rx.n;

public abstract class u<T, R> extends t<T, R>
{
    protected boolean T;
    
    public u(final n<? super R> n) {
        super(n);
    }
    
    @Override
    public void b(final Throwable t) {
        if (!this.T) {
            this.T = true;
            super.b(t);
        }
        else {
            c.I(t);
        }
    }
    
    @Override
    public void c() {
        if (this.T) {
            return;
        }
        this.T = true;
        super.c();
    }
}
