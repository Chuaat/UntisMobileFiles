// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.inspector.protocol.module;

import java.util.List;
import com.facebook.stetho.json.annotation.JsonProperty;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsMethod;
import java.util.Collections;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcResult;
import org.json.JSONObject;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcPeer;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsDomain;

public class HeapProfiler implements ChromeDevtoolsDomain
{
    @ChromeDevtoolsMethod
    public JsonRpcResult getProfileHeaders(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) {
        final ProfileHeaderResponse profileHeaderResponse = new ProfileHeaderResponse();
        profileHeaderResponse.headers = Collections.emptyList();
        return profileHeaderResponse;
    }
    
    private static class ProfileHeader
    {
        @JsonProperty(required = true)
        public String title;
        @JsonProperty(required = true)
        public int uid;
    }
    
    private static class ProfileHeaderResponse implements JsonRpcResult
    {
        @JsonProperty(required = true)
        public List<ProfileHeader> headers;
    }
}
