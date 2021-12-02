// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.inspector.jsonrpc;

import c6.h;

public class PendingRequest
{
    @h
    public final PendingRequestCallback callback;
    public final long requestId;
    
    public PendingRequest(final long requestId, @h final PendingRequestCallback callback) {
        this.requestId = requestId;
        this.callback = callback;
    }
}
