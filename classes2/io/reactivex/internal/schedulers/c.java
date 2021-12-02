// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.schedulers;

import java.util.concurrent.TimeoutException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

final class c implements Future<Object>
{
    final io.reactivex.disposables.c G;
    
    c(final io.reactivex.disposables.c g) {
        this.G = g;
    }
    
    @Override
    public boolean cancel(final boolean b) {
        this.G.dispose();
        return false;
    }
    
    @Override
    public Object get() throws InterruptedException, ExecutionException {
        return null;
    }
    
    @Override
    public Object get(final long n, final TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return null;
    }
    
    @Override
    public boolean isCancelled() {
        return false;
    }
    
    @Override
    public boolean isDone() {
        return false;
    }
}
