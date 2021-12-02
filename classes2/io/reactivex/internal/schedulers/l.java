// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.schedulers;

import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

public final class l extends a implements Runnable
{
    private static final long L = 1811839108042568751L;
    
    public l(final Runnable runnable) {
        super(runnable);
    }
    
    @Override
    public void run() {
        super.H = Thread.currentThread();
        try {
            super.G.run();
            super.H = null;
        }
        finally {
            super.H = null;
            ((AtomicReference<FutureTask<Void>>)this).lazySet(a.J);
            final Throwable t;
            io.reactivex.plugins.a.Y(t);
        }
    }
}
