// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.inspector.jsonrpc.protocol;

import org.json.JSONObject;
import com.facebook.stetho.json.annotation.JsonProperty;
import android.annotation.SuppressLint;

@SuppressLint({ "UsingDefaultJsonDeserializer", "EmptyJsonPropertyUse" })
public class JsonRpcRequest
{
    @JsonProperty
    public Long id;
    @JsonProperty(required = true)
    public String method;
    @JsonProperty
    public JSONObject params;
    
    public JsonRpcRequest() {
    }
    
    public JsonRpcRequest(final Long id, final String method, final JSONObject params) {
        this.id = id;
        this.method = method;
        this.params = params;
    }
}
