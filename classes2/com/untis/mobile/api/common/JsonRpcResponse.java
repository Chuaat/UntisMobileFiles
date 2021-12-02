// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.common;

import com.google.gson.annotations.SerializedName;
import androidx.annotation.k0;

public class JsonRpcResponse<Result>
{
    @k0
    public JsonRpcError error;
    @SerializedName("id")
    @k0
    public String id;
    @k0
    public String jsonrpc;
    @k0
    public Result result;
}
