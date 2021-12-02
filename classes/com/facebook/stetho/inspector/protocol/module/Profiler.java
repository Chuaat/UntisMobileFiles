// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.inspector.protocol.module;

import java.util.List;
import com.facebook.stetho.json.annotation.JsonProperty;
import java.util.Collections;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcResult;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsMethod;
import org.json.JSONObject;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcPeer;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsDomain;

public class Profiler implements ChromeDevtoolsDomain
{
    @ChromeDevtoolsMethod
    public void disable(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) {
    }
    
    @ChromeDevtoolsMethod
    public void enable(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) {
    }
    
    @ChromeDevtoolsMethod
    public JsonRpcResult getProfileHeaders(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) {
        final ProfileHeaderResponse profileHeaderResponse = new ProfileHeaderResponse();
        profileHeaderResponse.headers = Collections.emptyList();
        return profileHeaderResponse;
    }
    
    @ChromeDevtoolsMethod
    public void setSamplingInterval(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) {
    }
    
    private static class ProfileHeader
    {
        @JsonProperty(required = true)
        String title;
        @JsonProperty(required = true)
        String typeId;
        @JsonProperty(required = true)
        int uid;
    }
    
    private static class ProfileHeaderResponse implements JsonRpcResult
    {
        @JsonProperty(required = true)
        public List<ProfileHeader> headers;
    }
}
