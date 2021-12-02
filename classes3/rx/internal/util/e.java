// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.util;

import rx.o;
import java.util.concurrent.CountDownLatch;

public final class e
{
    private e() {
    }
    
    public static void a(final CountDownLatch countDownLatch, final o o) {
        if (countDownLatch.getCount() == 0L) {
            return;
        }
        try {
            countDownLatch.await();
        }
        catch (InterruptedException cause) {
            o.i();
            Thread.currentThread().interrupt();
            throw new IllegalStateException("Interrupted while waiting for subscription to complete.", cause);
        }
    }
}
