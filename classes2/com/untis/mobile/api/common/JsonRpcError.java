// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.common;

import android.annotation.SuppressLint;
import androidx.annotation.j0;
import androidx.annotation.k0;

public class JsonRpcError
{
    public int code;
    @k0
    public JsonRpcErrorData data;
    @k0
    public String message;
    
    @j0
    public JsonRpcErrorType getJsonRpcErrorType() {
        return JsonRpcErrorType.getJsonRpcErrorTypeFrom(this.code);
    }
    
    @SuppressLint({ "DefaultLocale" })
    @Override
    public String toString() {
        if (this.message == null) {
            return String.format("[%d: no message]", this.code);
        }
        return String.format("[%d: %s]", this.code, this.message);
    }
}
