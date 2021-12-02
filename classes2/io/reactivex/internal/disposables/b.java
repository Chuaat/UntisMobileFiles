// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.disposables;

import io.reactivex.plugins.a;
import io.reactivex.disposables.c;
import x5.f;
import java.util.concurrent.atomic.AtomicReference;

public final class b extends AtomicReference<f> implements c
{
    private static final long G = 5718521705281392066L;
    
    public b(final f initialValue) {
        super(initialValue);
    }
    
    @Override
    public void dispose() {
        if (this.get() != null) {
            final f f = this.getAndSet(null);
            if (f != null) {
                try {
                    f.cancel();
                }
                catch (Exception ex) {
                    io.reactivex.exceptions.b.b(ex);
                    a.Y(ex);
                }
            }
        }
    }
    
    @Override
    public boolean i() {
        return this.get() == null;
    }
}
