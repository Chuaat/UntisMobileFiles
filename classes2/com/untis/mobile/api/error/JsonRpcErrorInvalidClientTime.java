// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.error;

public class JsonRpcErrorInvalidClientTime extends Throwable
{
    private final long serverTime;
    
    public JsonRpcErrorInvalidClientTime(final long serverTime) {
        this.serverTime = serverTime;
    }
    
    public long getServerTime() {
        return this.serverTime;
    }
}
