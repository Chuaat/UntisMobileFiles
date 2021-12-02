// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.subscriptions;

import rx.exceptions.c;
import rx.o;
import rx.functions.n;
import java.util.concurrent.atomic.AtomicReference;

public final class a extends AtomicReference<n> implements o
{
    private static final long G = 5718521705281392066L;
    
    public a(final n initialValue) {
        super(initialValue);
    }
    
    @Override
    public boolean g() {
        return this.get() == null;
    }
    
    @Override
    public void i() {
        if (this.get() != null) {
            final n n = this.getAndSet(null);
            if (n != null) {
                try {
                    n.cancel();
                }
                catch (Exception ex) {
                    c.e(ex);
                    rx.plugins.c.I(ex);
                }
            }
        }
    }
}
