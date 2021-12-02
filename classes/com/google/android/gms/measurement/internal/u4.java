// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import androidx.annotation.j0;
import java.util.concurrent.Callable;
import com.google.android.gms.common.internal.x;
import java.util.concurrent.FutureTask;

final class u4<V> extends FutureTask<V> implements Comparable<u4<V>>
{
    private final long G;
    final boolean H;
    private final String I;
    final /* synthetic */ w4 J;
    
    u4(final w4 j, final Runnable runnable, final boolean h, final String i) {
        this.J = j;
        super(runnable, null);
        x.k(i);
        final long andIncrement = w4.s().getAndIncrement();
        this.G = andIncrement;
        this.I = i;
        this.H = h;
        if (andIncrement == Long.MAX_VALUE) {
            j.a.c().o().a("Tasks index overflow");
        }
    }
    
    u4(final w4 j, final Callable<V> callable, final boolean h, final String s) {
        this.J = j;
        super(callable);
        x.k("Task exception on worker thread");
        final long andIncrement = w4.s().getAndIncrement();
        this.G = andIncrement;
        this.I = "Task exception on worker thread";
        this.H = h;
        if (andIncrement == Long.MAX_VALUE) {
            j.a.c().o().a("Tasks index overflow");
        }
    }
    
    @Override
    protected final void setException(final Throwable exception) {
        this.J.a.c().o().b(this.I, exception);
        if (exception instanceof s4) {
            final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (defaultUncaughtExceptionHandler != null) {
                defaultUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), exception);
            }
        }
        super.setException(exception);
    }
}
