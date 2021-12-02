// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.inspector;

import com.facebook.stetho.common.Util;
import com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError;
import com.facebook.stetho.common.LogRedirector;
import com.facebook.stetho.inspector.jsonrpc.PendingRequestCallback;
import com.facebook.stetho.inspector.jsonrpc.PendingRequest;
import com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcResponse;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcException;
import com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcRequest;
import org.json.JSONException;
import java.io.IOException;
import org.json.JSONObject;
import java.util.Collections;
import java.util.HashMap;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsDomain;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcPeer;
import com.facebook.stetho.websocket.SimpleSession;
import java.util.Map;
import com.facebook.stetho.json.ObjectMapper;
import com.facebook.stetho.websocket.SimpleEndpoint;

public class ChromeDevtoolsServer implements SimpleEndpoint
{
    public static final String PATH = "/inspector";
    private static final String TAG = "ChromeDevtoolsServer";
    private final MethodDispatcher mMethodDispatcher;
    private final ObjectMapper mObjectMapper;
    private final Map<SimpleSession, JsonRpcPeer> mPeers;
    
    public ChromeDevtoolsServer(final Iterable<ChromeDevtoolsDomain> iterable) {
        this.mPeers = Collections.synchronizedMap(new HashMap<SimpleSession, JsonRpcPeer>());
        final ObjectMapper mObjectMapper = new ObjectMapper();
        this.mObjectMapper = mObjectMapper;
        this.mMethodDispatcher = new MethodDispatcher(mObjectMapper, iterable);
    }
    
    private void closeSafely(final SimpleSession simpleSession, final int n, final String s) {
        simpleSession.close(n, s);
    }
    
    private void handleRemoteMessage(final JsonRpcPeer jsonRpcPeer, final String str) throws IOException, MessageHandlingException, JSONException {
        final JSONObject jsonObject = new JSONObject(str);
        if (jsonObject.has("method")) {
            this.handleRemoteRequest(jsonRpcPeer, jsonObject);
        }
        else {
            if (!jsonObject.has("result")) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Improper JSON-RPC message: ");
                sb.append(str);
                throw new MessageHandlingException(sb.toString());
            }
            this.handleRemoteResponse(jsonRpcPeer, jsonObject);
        }
    }
    
    private void handleRemoteRequest(final JsonRpcPeer jsonRpcPeer, JSONObject error) throws MessageHandlingException {
        final JsonRpcRequest jsonRpcRequest = this.mObjectMapper.convertValue(error, JsonRpcRequest.class);
        JSONObject dispatch;
        try {
            dispatch = this.mMethodDispatcher.dispatch(jsonRpcPeer, jsonRpcRequest.method, jsonRpcRequest.params);
            error = null;
        }
        catch (JsonRpcException ex) {
            logDispatchException(ex);
            error = this.mObjectMapper.convertValue(ex.getErrorMessage(), JSONObject.class);
            dispatch = null;
        }
        if (jsonRpcRequest.id != null) {
            final JsonRpcResponse jsonRpcResponse = new JsonRpcResponse();
            jsonRpcResponse.id = jsonRpcRequest.id;
            jsonRpcResponse.result = dispatch;
            jsonRpcResponse.error = error;
            error = this.mObjectMapper.convertValue(jsonRpcResponse, JSONObject.class);
            String s;
            try {
                s = error.toString();
            }
            catch (OutOfMemoryError outOfMemoryError) {
                jsonRpcResponse.result = null;
                jsonRpcResponse.error = this.mObjectMapper.convertValue(outOfMemoryError.getMessage(), JSONObject.class);
                s = this.mObjectMapper.convertValue(jsonRpcResponse, JSONObject.class).toString();
            }
            jsonRpcPeer.getWebSocket().sendText(s);
        }
    }
    
    private void handleRemoteResponse(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) throws MismatchedResponseException {
        final JsonRpcResponse jsonRpcResponse = this.mObjectMapper.convertValue(jsonObject, JsonRpcResponse.class);
        final PendingRequest andRemovePendingRequest = jsonRpcPeer.getAndRemovePendingRequest(jsonRpcResponse.id);
        if (andRemovePendingRequest != null) {
            final PendingRequestCallback callback = andRemovePendingRequest.callback;
            if (callback != null) {
                callback.onResponse(jsonRpcPeer, jsonRpcResponse);
            }
            return;
        }
        throw new MismatchedResponseException(jsonRpcResponse.id);
    }
    
    private static void logDispatchException(final JsonRpcException ex) {
        final JsonRpcError errorMessage = ex.getErrorMessage();
        if (ChromeDevtoolsServer$1.$SwitchMap$com$facebook$stetho$inspector$jsonrpc$protocol$JsonRpcError$ErrorCode[errorMessage.code.ordinal()] != 1) {
            LogRedirector.w("ChromeDevtoolsServer", "Error processing remote message", ex);
        }
        else {
            final StringBuilder sb = new StringBuilder();
            sb.append("Method not implemented: ");
            sb.append(errorMessage.message);
            LogRedirector.d("ChromeDevtoolsServer", sb.toString());
        }
    }
    
    @Override
    public void onClose(final SimpleSession simpleSession, final int i, final String str) {
        final StringBuilder sb = new StringBuilder();
        sb.append("onClose: reason=");
        sb.append(i);
        sb.append(" ");
        sb.append(str);
        LogRedirector.d("ChromeDevtoolsServer", sb.toString());
        final JsonRpcPeer jsonRpcPeer = this.mPeers.remove(simpleSession);
        if (jsonRpcPeer != null) {
            jsonRpcPeer.invokeDisconnectReceivers();
        }
    }
    
    @Override
    public void onError(final SimpleSession simpleSession, final Throwable t) {
        final StringBuilder sb = new StringBuilder();
        sb.append("onError: ex=");
        sb.append(t.toString());
        LogRedirector.e("ChromeDevtoolsServer", sb.toString());
    }
    
    @Override
    public void onMessage(final SimpleSession simpleSession, final String str) {
        if (LogRedirector.isLoggable("ChromeDevtoolsServer", 2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("onMessage: message=");
            sb.append(str);
            LogRedirector.v("ChromeDevtoolsServer", sb.toString());
        }
        try {
            final JsonRpcPeer jsonRpcPeer = this.mPeers.get(simpleSession);
            Util.throwIfNull(jsonRpcPeer);
            this.handleRemoteMessage(jsonRpcPeer, str);
        }
        catch (JSONException obj) {
            LogRedirector.v("ChromeDevtoolsServer", "Unexpected JSON exception processing message", obj);
            goto Label_0112;
        }
        catch (MessageHandlingException obj) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Message could not be processed by implementation: ");
            sb2.append(obj);
            LogRedirector.i("ChromeDevtoolsServer", sb2.toString());
        }
        catch (IOException obj2) {
            IOException obj = obj2;
            if (LogRedirector.isLoggable("ChromeDevtoolsServer", 2)) {
                final StringBuilder sb3 = new StringBuilder();
                sb3.append("Unexpected I/O exception processing message: ");
                sb3.append(obj2);
                LogRedirector.v("ChromeDevtoolsServer", sb3.toString());
                obj = obj2;
                goto Label_0112;
            }
            goto Label_0112;
        }
    }
    
    @Override
    public void onMessage(final SimpleSession simpleSession, final byte[] array, final int i) {
        final StringBuilder sb = new StringBuilder();
        sb.append("Ignoring binary message of length ");
        sb.append(i);
        LogRedirector.d("ChromeDevtoolsServer", sb.toString());
    }
    
    @Override
    public void onOpen(final SimpleSession simpleSession) {
        LogRedirector.d("ChromeDevtoolsServer", "onOpen");
        this.mPeers.put(simpleSession, new JsonRpcPeer(this.mObjectMapper, simpleSession));
    }
}
