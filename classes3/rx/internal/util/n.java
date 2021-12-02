// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.util;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

public final class n extends AtomicLong implements ThreadFactory
{
    private static final long H = -8841098858898482335L;
    public static final ThreadFactory I;
    final String G;
    
    static {
        I = new ThreadFactory() {
            @Override
            public Thread newThread(final Runnable runnable) {
                throw new AssertionError((Object)"No threads allowed.");
            }
        };
    }
    
    public n(final String g) {
        this.G = g;
    }
    
    @Override
    public Thread newThread(final Runnable target) {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.G);
        sb.append(this.incrementAndGet());
        final Thread thread = new Thread(target, sb.toString());
        thread.setDaemon(true);
        return thread;
    }
}
