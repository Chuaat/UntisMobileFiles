// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.inspector.protocol.module;

import com.facebook.stetho.json.annotation.JsonValue;
import java.util.List;
import com.facebook.stetho.json.annotation.JsonProperty;
import com.facebook.stetho.common.Util;
import com.facebook.stetho.inspector.network.AsyncPrettyPrinterInitializer;
import org.json.JSONException;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcResult;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsMethod;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcPeer;
import java.io.IOException;
import com.facebook.stetho.inspector.network.ResponseBodyData;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcException;
import org.json.JSONObject;
import com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError;
import android.content.Context;
import com.facebook.stetho.inspector.network.ResponseBodyFileManager;
import com.facebook.stetho.inspector.network.NetworkPeerManager;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsDomain;

public class Network implements ChromeDevtoolsDomain
{
    private final NetworkPeerManager mNetworkPeerManager;
    private final ResponseBodyFileManager mResponseBodyFileManager;
    
    public Network(final Context context) {
        final NetworkPeerManager orCreateInstance = NetworkPeerManager.getOrCreateInstance(context);
        this.mNetworkPeerManager = orCreateInstance;
        this.mResponseBodyFileManager = orCreateInstance.getResponseBodyFileManager();
    }
    
    private GetResponseBodyResponse readResponseBody(final String s) throws IOException, JsonRpcException {
        final GetResponseBodyResponse getResponseBodyResponse = new GetResponseBodyResponse();
        try {
            final ResponseBodyData file = this.mResponseBodyFileManager.readFile(s);
            getResponseBodyResponse.body = file.data;
            getResponseBodyResponse.base64Encoded = file.base64Encoded;
            return getResponseBodyResponse;
        }
        catch (OutOfMemoryError outOfMemoryError) {
            throw new JsonRpcException(new JsonRpcError(JsonRpcError.ErrorCode.INTERNAL_ERROR, outOfMemoryError.toString(), null));
        }
    }
    
    @ChromeDevtoolsMethod
    public void disable(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) {
        this.mNetworkPeerManager.removePeer(jsonRpcPeer);
    }
    
    @ChromeDevtoolsMethod
    public void enable(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) {
        this.mNetworkPeerManager.addPeer(jsonRpcPeer);
    }
    
    @ChromeDevtoolsMethod
    public JsonRpcResult getResponseBody(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) throws JsonRpcException {
        try {
            return this.readResponseBody(jsonObject.getString("requestId"));
        }
        catch (JSONException ex) {
            throw new JsonRpcException(new JsonRpcError(JsonRpcError.ErrorCode.INTERNAL_ERROR, ex.toString(), null));
        }
        catch (IOException ex2) {
            throw new JsonRpcException(new JsonRpcError(JsonRpcError.ErrorCode.INTERNAL_ERROR, ex2.toString(), null));
        }
    }
    
    public void setPrettyPrinterInitializer(final AsyncPrettyPrinterInitializer prettyPrinterInitializer) {
        Util.throwIfNull(prettyPrinterInitializer);
        this.mNetworkPeerManager.setPrettyPrinterInitializer(prettyPrinterInitializer);
    }
    
    @ChromeDevtoolsMethod
    public void setUserAgentOverride(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) {
    }
    
    public static class DataReceivedParams
    {
        @JsonProperty(required = true)
        public int dataLength;
        @JsonProperty(required = true)
        public int encodedDataLength;
        @JsonProperty(required = true)
        public String requestId;
        @JsonProperty(required = true)
        public double timestamp;
    }
    
    private static class GetResponseBodyResponse implements JsonRpcResult
    {
        @JsonProperty(required = true)
        public boolean base64Encoded;
        @JsonProperty(required = true)
        public String body;
    }
    
    public static class Initiator
    {
        @JsonProperty
        public List<Console.CallFrame> stackTrace;
        @JsonProperty(required = true)
        public InitiatorType type;
    }
    
    public enum InitiatorType
    {
        OTHER("other"), 
        PARSER("parser"), 
        SCRIPT("script");
        
        private final String mProtocolValue;
        
        private InitiatorType(final String mProtocolValue) {
            this.mProtocolValue = mProtocolValue;
        }
        
        @JsonValue
        public String getProtocolValue() {
            return this.mProtocolValue;
        }
    }
    
    public static class LoadingFailedParams
    {
        @JsonProperty(required = true)
        public String errorText;
        @JsonProperty(required = true)
        public String requestId;
        @JsonProperty(required = true)
        public double timestamp;
        @JsonProperty
        public Page.ResourceType type;
    }
    
    public static class LoadingFinishedParams
    {
        @JsonProperty(required = true)
        public String requestId;
        @JsonProperty(required = true)
        public double timestamp;
    }
    
    public static class Request
    {
        @JsonProperty(required = true)
        public JSONObject headers;
        @JsonProperty(required = true)
        public String method;
        @JsonProperty
        public String postData;
        @JsonProperty(required = true)
        public String url;
    }
    
    public static class RequestWillBeSentParams
    {
        @JsonProperty(required = true)
        public String documentURL;
        @JsonProperty(required = true)
        public String frameId;
        @JsonProperty(required = true)
        public Initiator initiator;
        @JsonProperty(required = true)
        public String loaderId;
        @JsonProperty
        public Response redirectResponse;
        @JsonProperty(required = true)
        public Request request;
        @JsonProperty(required = true)
        public String requestId;
        @JsonProperty(required = true)
        public double timestamp;
        @JsonProperty
        public Page.ResourceType type;
    }
    
    public static class ResourceTiming
    {
        @JsonProperty(required = true)
        public double connectionEnd;
        @JsonProperty(required = true)
        public double connectionStart;
        @JsonProperty(required = true)
        public double dnsEnd;
        @JsonProperty(required = true)
        public double dnsStart;
        @JsonProperty(required = true)
        public double proxyEnd;
        @JsonProperty(required = true)
        public double proxyStart;
        @JsonProperty(required = true)
        public double receivedHeadersEnd;
        @JsonProperty(required = true)
        public double requestTime;
        @JsonProperty(required = true)
        public double sendEnd;
        @JsonProperty(required = true)
        public double sendStart;
        @JsonProperty(required = true)
        public double sslEnd;
        @JsonProperty(required = true)
        public double sslStart;
    }
    
    public static class Response
    {
        @JsonProperty(required = true)
        public int connectionId;
        @JsonProperty(required = true)
        public boolean connectionReused;
        @JsonProperty(required = true)
        public Boolean fromDiskCache;
        @JsonProperty(required = true)
        public JSONObject headers;
        @JsonProperty
        public String headersText;
        @JsonProperty(required = true)
        public String mimeType;
        @JsonProperty
        public JSONObject requestHeaders;
        @JsonProperty
        public String requestHeadersTest;
        @JsonProperty(required = true)
        public int status;
        @JsonProperty(required = true)
        public String statusText;
        @JsonProperty
        public ResourceTiming timing;
        @JsonProperty(required = true)
        public String url;
    }
    
    public static class ResponseReceivedParams
    {
        @JsonProperty(required = true)
        public String frameId;
        @JsonProperty(required = true)
        public String loaderId;
        @JsonProperty(required = true)
        public String requestId;
        @JsonProperty(required = true)
        public Response response;
        @JsonProperty(required = true)
        public double timestamp;
        @JsonProperty(required = true)
        public Page.ResourceType type;
    }
    
    public static class WebSocketClosedParams
    {
        @JsonProperty(required = true)
        public String requestId;
        @JsonProperty(required = true)
        public double timestamp;
    }
    
    public static class WebSocketCreatedParams
    {
        @JsonProperty(required = true)
        public String requestId;
        @JsonProperty(required = true)
        public String url;
    }
    
    public static class WebSocketFrame
    {
        @JsonProperty(required = true)
        public boolean mask;
        @JsonProperty(required = true)
        public int opcode;
        @JsonProperty(required = true)
        public String payloadData;
    }
    
    public static class WebSocketFrameErrorParams
    {
        @JsonProperty(required = true)
        public String errorMessage;
        @JsonProperty(required = true)
        public String requestId;
        @JsonProperty(required = true)
        public double timestamp;
    }
    
    public static class WebSocketFrameReceivedParams
    {
        @JsonProperty(required = true)
        public String requestId;
        @JsonProperty(required = true)
        public WebSocketFrame response;
        @JsonProperty(required = true)
        public double timestamp;
    }
    
    public static class WebSocketFrameSentParams
    {
        @JsonProperty(required = true)
        public String requestId;
        @JsonProperty(required = true)
        public WebSocketFrame response;
        @JsonProperty(required = true)
        public double timestamp;
    }
    
    public static class WebSocketHandshakeResponseReceivedParams
    {
        @JsonProperty(required = true)
        public String requestId;
        @JsonProperty(required = true)
        public WebSocketResponse response;
        @JsonProperty(required = true)
        public double timestamp;
    }
    
    public static class WebSocketRequest
    {
        @JsonProperty(required = true)
        public JSONObject headers;
    }
    
    public static class WebSocketResponse
    {
        @JsonProperty(required = true)
        public JSONObject headers;
        @JsonProperty
        public String headersText;
        @JsonProperty
        public JSONObject requestHeaders;
        @JsonProperty
        public String requestHeadersText;
        @JsonProperty(required = true)
        public int status;
        @JsonProperty(required = true)
        public String statusText;
    }
    
    public static class WebSocketWillSendHandshakeRequestParams
    {
        @JsonProperty(required = true)
        public WebSocketRequest request;
        @JsonProperty(required = true)
        public String requestId;
        @JsonProperty(required = true)
        public double timestamp;
        @JsonProperty(required = true)
        public double wallTime;
    }
}
