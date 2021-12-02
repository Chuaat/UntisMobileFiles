// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.inspector.network;

import c6.h;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

final class AsyncPrettyPrinterExecutorHolder
{
    private static ExecutorService sExecutorService;
    
    private AsyncPrettyPrinterExecutorHolder() {
    }
    
    public static void ensureInitialized() {
        if (AsyncPrettyPrinterExecutorHolder.sExecutorService == null) {
            AsyncPrettyPrinterExecutorHolder.sExecutorService = Executors.newCachedThreadPool();
        }
    }
    
    @h
    public static ExecutorService getExecutorService() {
        return AsyncPrettyPrinterExecutorHolder.sExecutorService;
    }
    
    public static void shutdown() {
        AsyncPrettyPrinterExecutorHolder.sExecutorService.shutdown();
        AsyncPrettyPrinterExecutorHolder.sExecutorService = null;
    }
}
