// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.error;

import androidx.annotation.k0;
import androidx.annotation.j0;
import com.untis.mobile.api.common.JsonRpcErrorType;

public class JsonRpcError extends Throwable
{
    @j0
    private final JsonRpcErrorType type;
    
    public JsonRpcError(@j0 final JsonRpcErrorType type) {
        this.type = type;
    }
    
    @j0
    public JsonRpcErrorType getType() {
        return this.type;
    }
    
    public boolean isAnyOf(@k0 final JsonRpcErrorType... array) {
        if (array != null) {
            if (array.length != 0) {
                for (int length = array.length, i = 0; i < length; ++i) {
                    if (this.getType().equals(array[i])) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
