// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.schedulers;

import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.Callable;

public final class m extends a implements Callable<Void>
{
    private static final long L = 1811839108042568751L;
    
    public m(final Runnable runnable) {
        super(runnable);
    }
    
    public Void c() throws Exception {
        super.H = Thread.currentThread();
        try {
            super.G.run();
            return null;
        }
        finally {
            ((AtomicReference<FutureTask<Void>>)this).lazySet(a.J);
            super.H = null;
        }
    }
}
