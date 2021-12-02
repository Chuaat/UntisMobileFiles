// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.schedulers;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

public final class k extends AtomicLong implements ThreadFactory
{
    private static final long J = -7789753024099756196L;
    final String G;
    final int H;
    final boolean I;
    
    public k(final String s) {
        this(s, 5, false);
    }
    
    public k(final String s, final int n) {
        this(s, n, false);
    }
    
    public k(final String g, final int h, final boolean i) {
        this.G = g;
        this.H = h;
        this.I = i;
    }
    
    @Override
    public Thread newThread(final Runnable target) {
        final StringBuilder sb = new StringBuilder(this.G);
        sb.append('-');
        sb.append(this.incrementAndGet());
        final String string = sb.toString();
        Thread thread;
        if (this.I) {
            thread = new a(target, string);
        }
        else {
            thread = new Thread(target, string);
        }
        thread.setPriority(this.H);
        thread.setDaemon(true);
        return thread;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("RxThreadFactory[");
        sb.append(this.G);
        sb.append("]");
        return sb.toString();
    }
    
    static final class a extends Thread implements j
    {
        a(final Runnable target, final String name) {
            super(target, name);
        }
    }
}
