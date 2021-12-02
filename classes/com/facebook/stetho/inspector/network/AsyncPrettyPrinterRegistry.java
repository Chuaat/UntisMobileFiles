// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.inspector.network;

import c6.h;
import java.util.HashMap;
import java.util.Map;
import d6.d;

@d
public class AsyncPrettyPrinterRegistry
{
    private final Map<String, AsyncPrettyPrinterFactory> mRegistry;
    
    public AsyncPrettyPrinterRegistry() {
        this.mRegistry = new HashMap<String, AsyncPrettyPrinterFactory>();
    }
    
    @h
    public AsyncPrettyPrinterFactory lookup(final String s) {
        synchronized (this) {
            return this.mRegistry.get(s);
        }
    }
    
    public void register(final String s, final AsyncPrettyPrinterFactory asyncPrettyPrinterFactory) {
        synchronized (this) {
            this.mRegistry.put(s, asyncPrettyPrinterFactory);
        }
    }
    
    public boolean unregister(final String s) {
        synchronized (this) {
            return this.mRegistry.remove(s) != null;
        }
    }
}
