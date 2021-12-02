// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.common;

import java.util.ArrayList;
import java.util.List;
import androidx.annotation.j0;

public class JsonRpcRequest<Parameter>
{
    @j0
    public final String id;
    @j0
    public final String jsonrpc;
    @j0
    public final String method;
    @j0
    public final List<Parameter> params;
    
    public JsonRpcRequest(@j0 final String method) {
        this.id = "untis-mobile-android-5.1.0";
        this.params = new ArrayList<Parameter>();
        this.jsonrpc = "2.0";
        this.method = method;
    }
    
    public JsonRpcRequest(@j0 final String method, @j0 final Parameter parameter) {
        this.id = "untis-mobile-android-5.1.0";
        final ArrayList<Parameter> params = new ArrayList<Parameter>();
        this.params = params;
        this.jsonrpc = "2.0";
        this.method = method;
        params.add(parameter);
    }
}
