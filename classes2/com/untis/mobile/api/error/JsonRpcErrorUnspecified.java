// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.error;

import androidx.annotation.k0;

public class JsonRpcErrorUnspecified extends Throwable
{
    public final int code;
    @k0
    public final String message;
    
    public JsonRpcErrorUnspecified(final int code, @k0 final String message) {
        this.code = code;
        this.message = message;
    }
}
