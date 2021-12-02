// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.inspector.jsonrpc.protocol;

import com.facebook.stetho.json.annotation.JsonValue;
import c6.h;
import org.json.JSONObject;
import com.facebook.stetho.json.annotation.JsonProperty;
import android.annotation.SuppressLint;

@SuppressLint({ "UsingDefaultJsonDeserializer", "EmptyJsonPropertyUse" })
public class JsonRpcError
{
    @JsonProperty(required = true)
    public ErrorCode code;
    @JsonProperty
    public JSONObject data;
    @JsonProperty(required = true)
    public String message;
    
    public JsonRpcError() {
    }
    
    public JsonRpcError(final ErrorCode code, final String message, @h final JSONObject data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
    
    public enum ErrorCode
    {
        INTERNAL_ERROR(-32603), 
        INVALID_PARAMS(-32602), 
        INVALID_REQUEST(-32600), 
        METHOD_NOT_FOUND(-32601), 
        PARSER_ERROR(-32700);
        
        private final int mProtocolValue;
        
        private ErrorCode(final int mProtocolValue) {
            this.mProtocolValue = mProtocolValue;
        }
        
        @JsonValue
        public int getProtocolValue() {
            return this.mProtocolValue;
        }
    }
}
