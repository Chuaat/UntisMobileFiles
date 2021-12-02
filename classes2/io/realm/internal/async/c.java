// 
// Decompiled by Procyon v0.5.36
// 

package io.realm.internal.async;

import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.Future;
import io.realm.g0;

public final class c implements g0
{
    private final Future<?> a;
    private final ThreadPoolExecutor b;
    private volatile boolean c;
    
    public c(final Future<?> a, final ThreadPoolExecutor b) {
        this.c = false;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void cancel() {
        this.a.cancel(true);
        this.c = true;
        this.b.getQueue().remove(this.a);
    }
    
    @Override
    public boolean isCancelled() {
        return this.c;
    }
}
