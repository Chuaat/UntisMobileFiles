// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.inspector.protocol.module;

import com.facebook.stetho.json.annotation.JsonProperty;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcResult;

public class SimpleBooleanResult implements JsonRpcResult
{
    @JsonProperty(required = true)
    public boolean result;
    
    public SimpleBooleanResult() {
    }
    
    public SimpleBooleanResult(final boolean result) {
        this.result = result;
    }
}
