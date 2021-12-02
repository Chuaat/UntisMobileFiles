// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.inspector.jsonrpc.protocol;

import c6.h;
import org.json.JSONObject;
import com.facebook.stetho.json.annotation.JsonProperty;
import android.annotation.SuppressLint;

@SuppressLint({ "UsingDefaultJsonDeserializer", "EmptyJsonPropertyUse" })
public class JsonRpcEvent
{
    @JsonProperty(required = true)
    public String method;
    @JsonProperty
    public JSONObject params;
    
    public JsonRpcEvent() {
    }
    
    public JsonRpcEvent(final String method, @h final JSONObject params) {
        this.method = method;
        this.params = params;
    }
}
