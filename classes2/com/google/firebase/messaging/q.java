// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.messaging;

import java.util.concurrent.Executors;
import com.google.android.gms.internal.firebase_messaging.o;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import com.google.android.gms.common.util.concurrent.b;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executor;

class q
{
    private static Executor a(final String s) {
        return new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(), (ThreadFactory)new b("Firebase-Messaging-Trigger-Topics-Io"));
    }
    
    static ScheduledExecutorService b() {
        return new ScheduledThreadPoolExecutor(1, (ThreadFactory)new b("Firebase-Messaging-Init"));
    }
    
    static ExecutorService c() {
        o.a();
        final ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(), (ThreadFactory)new b("Firebase-Messaging-Intent-Handle"));
        executor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(executor);
    }
    
    static ExecutorService d() {
        return Executors.newSingleThreadExecutor((ThreadFactory)new b("Firebase-Messaging-Network-Io"));
    }
    
    static ExecutorService e() {
        return Executors.newSingleThreadExecutor((ThreadFactory)new b("Firebase-Messaging-Task"));
    }
    
    static ScheduledExecutorService f() {
        return new ScheduledThreadPoolExecutor(1, (ThreadFactory)new b("Firebase-Messaging-Topics-Io"));
    }
    
    static Executor g() {
        return a("Firebase-Messaging-Trigger-Topics-Io");
    }
}
