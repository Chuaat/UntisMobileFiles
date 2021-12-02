// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.crashlytics.internal.common;

import com.google.android.gms.tasks.n;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import android.os.Looper;
import com.google.android.gms.tasks.c;
import java.util.concurrent.Executor;
import com.google.android.gms.tasks.m;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;

public final class k0
{
    private static final ExecutorService a;
    
    static {
        a = u.c("awaitEvenIfOnMainThread task continuation executor");
    }
    
    private k0() {
    }
    
    public static <T> T b(final m<T> m) throws InterruptedException, TimeoutException {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        m.n(k0.a, (c<T, Object>)new j0(countDownLatch));
        if (Looper.getMainLooper() == Looper.myLooper()) {
            countDownLatch.await(4L, TimeUnit.SECONDS);
        }
        else {
            countDownLatch.await();
        }
        if (m.v()) {
            return m.r();
        }
        if (m.t()) {
            throw new CancellationException("Task is already canceled");
        }
        if (m.u()) {
            throw new IllegalStateException(m.q());
        }
        throw new TimeoutException();
    }
    
    public static <T> m<T> c(final Executor executor, final Callable<m<T>> callable) {
        final n<T> n = new n<T>();
        executor.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    callable.call().m(new c<T, Void>() {
                        public Void b(@androidx.annotation.j0 final m<T> m) throws Exception {
                            if (m.v()) {
                                n.c(m.r());
                            }
                            else {
                                n.b(m.q());
                            }
                            return null;
                        }
                    });
                }
                catch (Exception ex) {
                    n.b(ex);
                }
            }
        });
        return n.a();
    }
    
    public static <T> m<T> e(final m<T> m, final m<T> i) {
        final n<T> n = new n<T>();
        final c<T, Void> c = new c<T, Void>() {
            public Void b(@androidx.annotation.j0 final m<T> m) throws Exception {
                if (m.v()) {
                    n.e(m.r());
                }
                else {
                    n.d(m.q());
                }
                return null;
            }
        };
        m.m((c<T, Object>)c);
        i.m((c<T, Object>)c);
        return n.a();
    }
}
