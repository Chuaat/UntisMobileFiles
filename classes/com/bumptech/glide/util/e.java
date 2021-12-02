// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.util;

import androidx.annotation.b1;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutorService;
import androidx.annotation.j0;
import android.os.Looper;
import android.os.Handler;
import java.util.concurrent.Executor;

public final class e
{
    private static final Executor a;
    private static final Executor b;
    
    static {
        a = new Executor() {
            private final Handler G = new Handler(Looper.getMainLooper());
            
            @Override
            public void execute(@j0 final Runnable runnable) {
                this.G.post(runnable);
            }
        };
        b = new Executor() {
            @Override
            public void execute(@j0 final Runnable runnable) {
                runnable.run();
            }
        };
    }
    
    private e() {
    }
    
    public static Executor a() {
        return e.b;
    }
    
    public static Executor b() {
        return e.a;
    }
    
    @b1
    public static void c(final ExecutorService executorService) {
        executorService.shutdownNow();
        try {
            final TimeUnit seconds = TimeUnit.SECONDS;
            if (!executorService.awaitTermination(5L, seconds)) {
                executorService.shutdownNow();
                if (!executorService.awaitTermination(5L, seconds)) {
                    throw new RuntimeException("Failed to shutdown");
                }
            }
        }
        catch (InterruptedException cause) {
            executorService.shutdownNow();
            Thread.currentThread().interrupt();
            throw new RuntimeException(cause);
        }
    }
}
