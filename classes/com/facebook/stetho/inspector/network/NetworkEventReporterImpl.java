// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.inspector.network;

import java.util.ArrayList;
import java.io.InputStream;
import android.os.SystemClock;
import com.facebook.stetho.inspector.helper.ChromePeerManager;
import com.facebook.stetho.inspector.console.CLog;
import com.facebook.stetho.inspector.protocol.module.Console;
import java.io.IOException;
import com.facebook.stetho.common.Utf8Charset;
import c6.g;
import org.json.JSONException;
import org.json.JSONObject;
import com.facebook.stetho.inspector.protocol.module.Page;
import com.facebook.stetho.inspector.protocol.module.Network;
import c6.h;
import java.util.concurrent.atomic.AtomicInteger;

public class NetworkEventReporterImpl implements NetworkEventReporter
{
    private static NetworkEventReporter sInstance;
    private final AtomicInteger mNextRequestId;
    @h
    private ResourceTypeHelper mResourceTypeHelper;
    
    private NetworkEventReporterImpl() {
        this.mNextRequestId = new AtomicInteger(0);
    }
    
    private static Network.WebSocketFrame convertFrame(final InspectorWebSocketFrame inspectorWebSocketFrame) {
        final Network.WebSocketFrame webSocketFrame = new Network.WebSocketFrame();
        webSocketFrame.opcode = inspectorWebSocketFrame.opcode();
        webSocketFrame.mask = inspectorWebSocketFrame.mask();
        webSocketFrame.payloadData = inspectorWebSocketFrame.payloadData();
        return webSocketFrame;
    }
    
    @h
    static AsyncPrettyPrinter createPrettyPrinterForResponse(final InspectorResponse inspectorResponse, @h final AsyncPrettyPrinterRegistry asyncPrettyPrinterRegistry) {
        if (asyncPrettyPrinterRegistry != null) {
            for (int i = 0; i < ((InspectorHeaders)inspectorResponse).headerCount(); ++i) {
                final AsyncPrettyPrinterFactory lookup = asyncPrettyPrinterRegistry.lookup(((InspectorHeaders)inspectorResponse).headerName(i));
                if (lookup != null) {
                    return lookup.getInstance(((InspectorHeaders)inspectorResponse).headerName(i), ((InspectorHeaders)inspectorResponse).headerValue(i));
                }
            }
        }
        return null;
    }
    
    private static Page.ResourceType determineResourceType(final AsyncPrettyPrinter asyncPrettyPrinter, final String s, final ResourceTypeHelper resourceTypeHelper) {
        if (asyncPrettyPrinter != null) {
            return asyncPrettyPrinter.getPrettifiedType().getResourceType();
        }
        Enum<Page.ResourceType> enum1;
        if (s != null) {
            enum1 = resourceTypeHelper.determineResourceType(s);
        }
        else {
            enum1 = Page.ResourceType.OTHER;
        }
        return (Page.ResourceType)enum1;
    }
    
    private static JSONObject formatHeadersAsJSON(final InspectorHeaders inspectorHeaders) {
        final JSONObject jsonObject = new JSONObject();
        int i = 0;
        while (i < inspectorHeaders.headerCount()) {
            final String headerName = inspectorHeaders.headerName(i);
            String str = inspectorHeaders.headerValue(i);
            try {
                if (jsonObject.has(headerName)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append(jsonObject.getString(headerName));
                    sb.append("\n");
                    sb.append(str);
                    str = sb.toString();
                }
                jsonObject.put(headerName, (Object)str);
                ++i;
                continue;
            }
            catch (JSONException cause) {
                throw new RuntimeException((Throwable)cause);
            }
            break;
        }
        return jsonObject;
    }
    
    public static NetworkEventReporter get() {
        synchronized (NetworkEventReporterImpl.class) {
            if (NetworkEventReporterImpl.sInstance == null) {
                NetworkEventReporterImpl.sInstance = new NetworkEventReporterImpl();
            }
            return NetworkEventReporterImpl.sInstance;
        }
    }
    
    @h
    private String getContentType(final InspectorHeaders inspectorHeaders) {
        return inspectorHeaders.firstHeaderValue("Content-Type");
    }
    
    @h
    private NetworkPeerManager getPeerManagerIfEnabled() {
        final NetworkPeerManager instanceOrNull = NetworkPeerManager.getInstanceOrNull();
        if (instanceOrNull != null && instanceOrNull.hasRegisteredPeers()) {
            return instanceOrNull;
        }
        return null;
    }
    
    @g
    private ResourceTypeHelper getResourceTypeHelper() {
        if (this.mResourceTypeHelper == null) {
            this.mResourceTypeHelper = new ResourceTypeHelper();
        }
        return this.mResourceTypeHelper;
    }
    
    @h
    private static AsyncPrettyPrinter initAsyncPrettyPrinterForResponse(final InspectorResponse inspectorResponse, final NetworkPeerManager networkPeerManager) {
        final AsyncPrettyPrinter prettyPrinterForResponse = createPrettyPrinterForResponse(inspectorResponse, networkPeerManager.getAsyncPrettyPrinterRegistry());
        if (prettyPrinterForResponse != null) {
            networkPeerManager.getResponseBodyFileManager().associateAsyncPrettyPrinterWithId(((InspectorResponseCommon)inspectorResponse).requestId(), prettyPrinterForResponse);
        }
        return prettyPrinterForResponse;
    }
    
    private void loadingFailed(final String requestId, final String errorText) {
        final NetworkPeerManager peerManagerIfEnabled = this.getPeerManagerIfEnabled();
        if (peerManagerIfEnabled != null) {
            final Network.LoadingFailedParams loadingFailedParams = new Network.LoadingFailedParams();
            loadingFailedParams.requestId = requestId;
            loadingFailedParams.timestamp = stethoNow() / 1000.0;
            loadingFailedParams.errorText = errorText;
            loadingFailedParams.type = Page.ResourceType.OTHER;
            peerManagerIfEnabled.sendNotificationToPeers("Network.loadingFailed", loadingFailedParams);
        }
    }
    
    private void loadingFinished(final String requestId) {
        final NetworkPeerManager peerManagerIfEnabled = this.getPeerManagerIfEnabled();
        if (peerManagerIfEnabled != null) {
            final Network.LoadingFinishedParams loadingFinishedParams = new Network.LoadingFinishedParams();
            loadingFinishedParams.requestId = requestId;
            loadingFinishedParams.timestamp = stethoNow() / 1000.0;
            peerManagerIfEnabled.sendNotificationToPeers("Network.loadingFinished", loadingFinishedParams);
        }
    }
    
    @h
    private static String readBodyAsString(final NetworkPeerManager networkPeerManager, InspectorRequest body) {
        try {
            body = (OutOfMemoryError)(Object)((InspectorRequest)body).body();
            if (body != null) {
                body = (OutOfMemoryError)new String((byte[])(Object)body, Utf8Charset.INSTANCE);
                return (String)body;
            }
            return null;
        }
        catch (OutOfMemoryError body) {}
        catch (IOException ex) {}
        final Console.MessageLevel warning = Console.MessageLevel.WARNING;
        final Console.MessageSource network = Console.MessageSource.NETWORK;
        final StringBuilder sb = new StringBuilder();
        sb.append("Could not reproduce POST body: ");
        sb.append(body);
        CLog.writeToConsole(networkPeerManager, warning, network, sb.toString());
        return null;
    }
    
    private static long stethoNow() {
        return SystemClock.elapsedRealtime();
    }
    
    @Override
    public void dataReceived(final String requestId, final int dataLength, final int encodedDataLength) {
        final NetworkPeerManager peerManagerIfEnabled = this.getPeerManagerIfEnabled();
        if (peerManagerIfEnabled != null) {
            final Network.DataReceivedParams dataReceivedParams = new Network.DataReceivedParams();
            dataReceivedParams.requestId = requestId;
            dataReceivedParams.timestamp = stethoNow() / 1000.0;
            dataReceivedParams.dataLength = dataLength;
            dataReceivedParams.encodedDataLength = encodedDataLength;
            peerManagerIfEnabled.sendNotificationToPeers("Network.dataReceived", dataReceivedParams);
        }
    }
    
    @Override
    public void dataSent(final String s, final int n, final int n2) {
        this.dataReceived(s, n, n2);
    }
    
    @Override
    public void httpExchangeFailed(final String s, final String s2) {
        this.loadingFailed(s, s2);
    }
    
    @Override
    public InputStream interpretResponseStream(final String str, @h final String s, @h final String s2, @h final InputStream inputStream, final ResponseHandler responseHandler) {
        final NetworkPeerManager peerManagerIfEnabled = this.getPeerManagerIfEnabled();
        if (peerManagerIfEnabled != null) {
            Enum<Page.ResourceType> determineResourceType = null;
            if (inputStream == null) {
                responseHandler.onEOF();
                return null;
            }
            if (s != null) {
                determineResourceType = this.getResourceTypeHelper().determineResourceType(s);
            }
            boolean b = false;
            if (determineResourceType != null) {
                b = b;
                if (determineResourceType == Page.ResourceType.IMAGE) {
                    b = true;
                }
            }
            try {
                return DecompressionHelper.teeInputWithDecompression(peerManagerIfEnabled, str, inputStream, peerManagerIfEnabled.getResponseBodyFileManager().openResponseBodyFile(str, b), s2, responseHandler);
            }
            catch (IOException ex) {
                final Console.MessageLevel error = Console.MessageLevel.ERROR;
                final Console.MessageSource network = Console.MessageSource.NETWORK;
                final StringBuilder sb = new StringBuilder();
                sb.append("Error writing response body data for request #");
                sb.append(str);
                CLog.writeToConsole(peerManagerIfEnabled, error, network, sb.toString());
            }
        }
        return inputStream;
    }
    
    @Override
    public boolean isEnabled() {
        return this.getPeerManagerIfEnabled() != null;
    }
    
    @Override
    public String nextRequestId() {
        return String.valueOf(this.mNextRequestId.getAndIncrement());
    }
    
    @Override
    public void requestWillBeSent(final InspectorRequest inspectorRequest) {
        final NetworkPeerManager peerManagerIfEnabled = this.getPeerManagerIfEnabled();
        if (peerManagerIfEnabled != null) {
            final Network.Request request = new Network.Request();
            request.url = inspectorRequest.url();
            request.method = inspectorRequest.method();
            request.headers = formatHeadersAsJSON(inspectorRequest);
            request.postData = readBodyAsString(peerManagerIfEnabled, inspectorRequest);
            final String friendlyName = ((InspectorRequestCommon)inspectorRequest).friendlyName();
            final Integer friendlyNameExtra = inspectorRequest.friendlyNameExtra();
            final Network.Initiator initiator = new Network.Initiator();
            initiator.type = Network.InitiatorType.SCRIPT;
            final ArrayList<Console.CallFrame> stackTrace = new ArrayList<Console.CallFrame>();
            initiator.stackTrace = stackTrace;
            int intValue;
            if (friendlyNameExtra != null) {
                intValue = friendlyNameExtra;
            }
            else {
                intValue = 0;
            }
            stackTrace.add(new Console.CallFrame(friendlyName, friendlyName, intValue, 0));
            final Network.RequestWillBeSentParams requestWillBeSentParams = new Network.RequestWillBeSentParams();
            requestWillBeSentParams.requestId = ((InspectorRequestCommon)inspectorRequest).id();
            requestWillBeSentParams.frameId = "1";
            requestWillBeSentParams.loaderId = "1";
            requestWillBeSentParams.documentURL = inspectorRequest.url();
            requestWillBeSentParams.request = request;
            requestWillBeSentParams.timestamp = stethoNow() / 1000.0;
            requestWillBeSentParams.initiator = initiator;
            requestWillBeSentParams.redirectResponse = null;
            requestWillBeSentParams.type = Page.ResourceType.OTHER;
            peerManagerIfEnabled.sendNotificationToPeers("Network.requestWillBeSent", requestWillBeSentParams);
        }
    }
    
    @Override
    public void responseHeadersReceived(final InspectorResponse inspectorResponse) {
        final NetworkPeerManager peerManagerIfEnabled = this.getPeerManagerIfEnabled();
        if (peerManagerIfEnabled != null) {
            final Network.Response response = new Network.Response();
            response.url = inspectorResponse.url();
            response.status = ((InspectorResponseCommon)inspectorResponse).statusCode();
            response.statusText = ((InspectorResponseCommon)inspectorResponse).reasonPhrase();
            response.headers = formatHeadersAsJSON(inspectorResponse);
            final String contentType = this.getContentType(inspectorResponse);
            String stripContentExtras;
            if (contentType != null) {
                stripContentExtras = this.getResourceTypeHelper().stripContentExtras(contentType);
            }
            else {
                stripContentExtras = "application/octet-stream";
            }
            response.mimeType = stripContentExtras;
            response.connectionReused = inspectorResponse.connectionReused();
            response.connectionId = inspectorResponse.connectionId();
            response.fromDiskCache = inspectorResponse.fromDiskCache();
            final Network.ResponseReceivedParams responseReceivedParams = new Network.ResponseReceivedParams();
            responseReceivedParams.requestId = ((InspectorResponseCommon)inspectorResponse).requestId();
            responseReceivedParams.frameId = "1";
            responseReceivedParams.loaderId = "1";
            responseReceivedParams.timestamp = stethoNow() / 1000.0;
            responseReceivedParams.response = response;
            responseReceivedParams.type = determineResourceType(initAsyncPrettyPrinterForResponse(inspectorResponse, peerManagerIfEnabled), contentType, this.getResourceTypeHelper());
            peerManagerIfEnabled.sendNotificationToPeers("Network.responseReceived", responseReceivedParams);
        }
    }
    
    @Override
    public void responseReadFailed(final String s, final String s2) {
        this.loadingFailed(s, s2);
    }
    
    @Override
    public void responseReadFinished(final String s) {
        this.loadingFinished(s);
    }
    
    @Override
    public void webSocketClosed(final String requestId) {
        final NetworkPeerManager peerManagerIfEnabled = this.getPeerManagerIfEnabled();
        if (peerManagerIfEnabled != null) {
            final Network.WebSocketClosedParams webSocketClosedParams = new Network.WebSocketClosedParams();
            webSocketClosedParams.requestId = requestId;
            webSocketClosedParams.timestamp = stethoNow() / 1000.0;
            peerManagerIfEnabled.sendNotificationToPeers("Network.webSocketClosed", webSocketClosedParams);
        }
    }
    
    @Override
    public void webSocketCreated(final String requestId, final String url) {
        final NetworkPeerManager peerManagerIfEnabled = this.getPeerManagerIfEnabled();
        if (peerManagerIfEnabled != null) {
            final Network.WebSocketCreatedParams webSocketCreatedParams = new Network.WebSocketCreatedParams();
            webSocketCreatedParams.requestId = requestId;
            webSocketCreatedParams.url = url;
            peerManagerIfEnabled.sendNotificationToPeers("Network.webSocketCreated", webSocketCreatedParams);
        }
    }
    
    @Override
    public void webSocketFrameError(final String requestId, final String errorMessage) {
        final NetworkPeerManager peerManagerIfEnabled = this.getPeerManagerIfEnabled();
        if (peerManagerIfEnabled != null) {
            final Network.WebSocketFrameErrorParams webSocketFrameErrorParams = new Network.WebSocketFrameErrorParams();
            webSocketFrameErrorParams.requestId = requestId;
            webSocketFrameErrorParams.timestamp = stethoNow() / 1000.0;
            webSocketFrameErrorParams.errorMessage = errorMessage;
            peerManagerIfEnabled.sendNotificationToPeers("Network.webSocketFrameError", webSocketFrameErrorParams);
        }
    }
    
    @Override
    public void webSocketFrameReceived(final InspectorWebSocketFrame inspectorWebSocketFrame) {
        final NetworkPeerManager peerManagerIfEnabled = this.getPeerManagerIfEnabled();
        if (peerManagerIfEnabled != null) {
            final Network.WebSocketFrameReceivedParams webSocketFrameReceivedParams = new Network.WebSocketFrameReceivedParams();
            webSocketFrameReceivedParams.requestId = inspectorWebSocketFrame.requestId();
            webSocketFrameReceivedParams.timestamp = stethoNow() / 1000.0;
            webSocketFrameReceivedParams.response = convertFrame(inspectorWebSocketFrame);
            peerManagerIfEnabled.sendNotificationToPeers("Network.webSocketFrameReceived", webSocketFrameReceivedParams);
        }
    }
    
    @Override
    public void webSocketFrameSent(final InspectorWebSocketFrame inspectorWebSocketFrame) {
        final NetworkPeerManager peerManagerIfEnabled = this.getPeerManagerIfEnabled();
        if (peerManagerIfEnabled != null) {
            final Network.WebSocketFrameSentParams webSocketFrameSentParams = new Network.WebSocketFrameSentParams();
            webSocketFrameSentParams.requestId = inspectorWebSocketFrame.requestId();
            webSocketFrameSentParams.timestamp = stethoNow() / 1000.0;
            webSocketFrameSentParams.response = convertFrame(inspectorWebSocketFrame);
            peerManagerIfEnabled.sendNotificationToPeers("Network.webSocketFrameSent", webSocketFrameSentParams);
        }
    }
    
    @Override
    public void webSocketHandshakeResponseReceived(final InspectorWebSocketResponse inspectorWebSocketResponse) {
        final NetworkPeerManager peerManagerIfEnabled = this.getPeerManagerIfEnabled();
        if (peerManagerIfEnabled != null) {
            final Network.WebSocketHandshakeResponseReceivedParams webSocketHandshakeResponseReceivedParams = new Network.WebSocketHandshakeResponseReceivedParams();
            webSocketHandshakeResponseReceivedParams.requestId = ((InspectorResponseCommon)inspectorWebSocketResponse).requestId();
            webSocketHandshakeResponseReceivedParams.timestamp = stethoNow() / 1000.0;
            final Network.WebSocketResponse response = new Network.WebSocketResponse();
            response.headers = formatHeadersAsJSON(inspectorWebSocketResponse);
            response.headersText = null;
            if (inspectorWebSocketResponse.requestHeaders() != null) {
                response.requestHeaders = formatHeadersAsJSON(inspectorWebSocketResponse.requestHeaders());
                response.requestHeadersText = null;
            }
            response.status = ((InspectorResponseCommon)inspectorWebSocketResponse).statusCode();
            response.statusText = ((InspectorResponseCommon)inspectorWebSocketResponse).reasonPhrase();
            webSocketHandshakeResponseReceivedParams.response = response;
            peerManagerIfEnabled.sendNotificationToPeers("Network.webSocketHandshakeResponseReceived", webSocketHandshakeResponseReceivedParams);
        }
    }
    
    @Override
    public void webSocketWillSendHandshakeRequest(final InspectorWebSocketRequest inspectorWebSocketRequest) {
        final NetworkPeerManager peerManagerIfEnabled = this.getPeerManagerIfEnabled();
        if (peerManagerIfEnabled != null) {
            final Network.WebSocketWillSendHandshakeRequestParams webSocketWillSendHandshakeRequestParams = new Network.WebSocketWillSendHandshakeRequestParams();
            webSocketWillSendHandshakeRequestParams.requestId = ((InspectorRequestCommon)inspectorWebSocketRequest).id();
            webSocketWillSendHandshakeRequestParams.timestamp = stethoNow() / 1000.0;
            webSocketWillSendHandshakeRequestParams.wallTime = System.currentTimeMillis() / 1000.0;
            final Network.WebSocketRequest request = new Network.WebSocketRequest();
            request.headers = formatHeadersAsJSON(inspectorWebSocketRequest);
            webSocketWillSendHandshakeRequestParams.request = request;
            peerManagerIfEnabled.sendNotificationToPeers("Network.webSocketWillSendHandshakeRequest", webSocketWillSendHandshakeRequestParams);
        }
    }
}
