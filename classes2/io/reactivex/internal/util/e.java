// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.util;

import io.reactivex.internal.schedulers.j;
import io.reactivex.plugins.a;
import io.reactivex.disposables.c;
import java.util.concurrent.CountDownLatch;

public final class e
{
    private e() {
        throw new IllegalStateException("No instances!");
    }
    
    public static void a(final CountDownLatch countDownLatch, final c c) {
        if (countDownLatch.getCount() == 0L) {
            return;
        }
        try {
            b();
            countDownLatch.await();
        }
        catch (InterruptedException cause) {
            c.dispose();
            Thread.currentThread().interrupt();
            throw new IllegalStateException("Interrupted while waiting for subscription to complete.", cause);
        }
    }
    
    public static void b() {
        if (a.L() && (Thread.currentThread() instanceof j || a.W())) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Attempt to block on a Scheduler ");
            sb.append(Thread.currentThread().getName());
            sb.append(" that doesn't support blocking operators as they may lead to deadlock");
            throw new IllegalStateException(sb.toString());
        }
    }
}
