// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.inspector.protocol.module;

import com.facebook.stetho.json.annotation.JsonValue;
import java.util.List;
import com.facebook.stetho.json.annotation.JsonProperty;
import java.util.Iterator;
import java.util.ArrayList;
import com.facebook.stetho.inspector.domstorage.SharedPreferencesHelper;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsMethod;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcResult;
import org.json.JSONObject;
import com.facebook.stetho.common.ProcessUtil;
import com.facebook.stetho.inspector.jsonrpc.PendingRequestCallback;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcPeer;
import java.util.Collections;
import androidx.annotation.k0;
import com.facebook.stetho.inspector.screencast.ScreencastDispatcher;
import com.facebook.stetho.json.ObjectMapper;
import android.content.Context;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsDomain;

public class Page implements ChromeDevtoolsDomain
{
    public static final String BANNER = "_____/\\\\\\\\\\\\\\\\\\\\\\_______________________________________________/\\\\\\_______________________\n ___/\\\\\\/////////\\\\\\____________________________________________\\/\\\\\\_______________________\n  __\\//\\\\\\______\\///______/\\\\\\_________________________/\\\\\\______\\/\\\\\\_______________________\n   ___\\////\\\\\\__________/\\\\\\\\\\\\\\\\\\\\\\_____/\\\\\\\\\\\\\\\\___/\\\\\\\\\\\\\\\\\\\\\\_\\/\\\\\\_____________/\\\\\\\\\\____\n    ______\\////\\\\\\______\\////\\\\\\////____/\\\\\\/////\\\\\\_\\////\\\\\\////__\\/\\\\\\\\\\\\\\\\\\\\____/\\\\\\///\\\\\\__\n     _________\\////\\\\\\______\\/\\\\\\_______/\\\\\\\\\\\\\\\\\\\\\\_____\\/\\\\\\______\\/\\\\\\/////\\\\\\__/\\\\\\__\\//\\\\\\_\n      __/\\\\\\______\\//\\\\\\_____\\/\\\\\\_/\\\\__\\//\\\\///////______\\/\\\\\\_/\\\\__\\/\\\\\\___\\/\\\\\\_\\//\\\\\\__/\\\\\\__\n       _\\///\\\\\\\\\\\\\\\\\\\\\\/______\\//\\\\\\\\\\____\\//\\\\\\\\\\\\\\\\\\\\____\\//\\\\\\\\\\___\\/\\\\\\___\\/\\\\\\__\\///\\\\\\\\\\/___\n        ___\\///////////_________\\/////______\\//////////______\\/////____\\///____\\///_____\\/////_____\n         Welcome to Stetho";
    private final Context mContext;
    private final String mMessage;
    private final ObjectMapper mObjectMapper;
    @k0
    private ScreencastDispatcher mScreencastDispatcher;
    
    public Page(final Context context) {
        this(context, "_____/\\\\\\\\\\\\\\\\\\\\\\_______________________________________________/\\\\\\_______________________\n ___/\\\\\\/////////\\\\\\____________________________________________\\/\\\\\\_______________________\n  __\\//\\\\\\______\\///______/\\\\\\_________________________/\\\\\\______\\/\\\\\\_______________________\n   ___\\////\\\\\\__________/\\\\\\\\\\\\\\\\\\\\\\_____/\\\\\\\\\\\\\\\\___/\\\\\\\\\\\\\\\\\\\\\\_\\/\\\\\\_____________/\\\\\\\\\\____\n    ______\\////\\\\\\______\\////\\\\\\////____/\\\\\\/////\\\\\\_\\////\\\\\\////__\\/\\\\\\\\\\\\\\\\\\\\____/\\\\\\///\\\\\\__\n     _________\\////\\\\\\______\\/\\\\\\_______/\\\\\\\\\\\\\\\\\\\\\\_____\\/\\\\\\______\\/\\\\\\/////\\\\\\__/\\\\\\__\\//\\\\\\_\n      __/\\\\\\______\\//\\\\\\_____\\/\\\\\\_/\\\\__\\//\\\\///////______\\/\\\\\\_/\\\\__\\/\\\\\\___\\/\\\\\\_\\//\\\\\\__/\\\\\\__\n       _\\///\\\\\\\\\\\\\\\\\\\\\\/______\\//\\\\\\\\\\____\\//\\\\\\\\\\\\\\\\\\\\____\\//\\\\\\\\\\___\\/\\\\\\___\\/\\\\\\__\\///\\\\\\\\\\/___\n        ___\\///////////_________\\/////______\\//////////______\\/////____\\///____\\///_____\\/////_____\n         Welcome to Stetho");
    }
    
    public Page(final Context mContext, final String mMessage) {
        this.mObjectMapper = new ObjectMapper();
        this.mContext = mContext;
        this.mMessage = mMessage;
    }
    
    private static FrameResourceTree createSimpleFrameResourceTree(final String id, final String parentId, final String name, final String securityOrigin) {
        final Frame frame = new Frame();
        frame.id = id;
        frame.parentId = parentId;
        frame.loaderId = "1";
        frame.name = name;
        frame.url = "";
        frame.securityOrigin = securityOrigin;
        frame.mimeType = "text/plain";
        final FrameResourceTree frameResourceTree = new FrameResourceTree();
        frameResourceTree.frame = frame;
        frameResourceTree.resources = Collections.emptyList();
        frameResourceTree.childFrames = null;
        return frameResourceTree;
    }
    
    private void notifyExecutionContexts(final JsonRpcPeer jsonRpcPeer) {
        final ExecutionContextDescription context = new ExecutionContextDescription();
        context.frameId = "1";
        context.id = 1;
        final ExecutionContextCreatedParams executionContextCreatedParams = new ExecutionContextCreatedParams();
        executionContextCreatedParams.context = context;
        jsonRpcPeer.invokeMethod("Runtime.executionContextCreated", executionContextCreatedParams, null);
    }
    
    private void sendWelcomeMessage(final JsonRpcPeer jsonRpcPeer) {
        final Console.ConsoleMessage message = new Console.ConsoleMessage();
        message.source = Console.MessageSource.JAVASCRIPT;
        message.level = Console.MessageLevel.LOG;
        final StringBuilder sb = new StringBuilder();
        sb.append(this.mMessage);
        sb.append("\n          Attached to ");
        sb.append(ProcessUtil.getProcessName());
        sb.append("\n");
        message.text = sb.toString();
        final Console.MessageAddedRequest messageAddedRequest = new Console.MessageAddedRequest();
        messageAddedRequest.message = message;
        jsonRpcPeer.invokeMethod("Console.messageAdded", messageAddedRequest, null);
    }
    
    @ChromeDevtoolsMethod
    public JsonRpcResult canScreencast(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) {
        return new SimpleBooleanResult(true);
    }
    
    @ChromeDevtoolsMethod
    public void clearDeviceOrientationOverride(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) {
    }
    
    @ChromeDevtoolsMethod
    public void clearGeolocationOverride(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) {
    }
    
    @ChromeDevtoolsMethod
    public void disable(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) {
    }
    
    @ChromeDevtoolsMethod
    public void enable(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) {
        this.notifyExecutionContexts(jsonRpcPeer);
        this.sendWelcomeMessage(jsonRpcPeer);
    }
    
    @ChromeDevtoolsMethod
    public JsonRpcResult getResourceTree(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) {
        final Iterator<String> iterator = SharedPreferencesHelper.getSharedPreferenceTags(this.mContext).iterator();
        String s;
        if (iterator.hasNext()) {
            s = iterator.next();
        }
        else {
            s = "";
        }
        final FrameResourceTree simpleFrameResourceTree = createSimpleFrameResourceTree("1", null, "Stetho", s);
        if (simpleFrameResourceTree.childFrames == null) {
            simpleFrameResourceTree.childFrames = new ArrayList<FrameResourceTree>();
        }
        int i = 1;
        while (iterator.hasNext()) {
            final StringBuilder sb = new StringBuilder();
            sb.append("1.");
            sb.append(i);
            final String string = sb.toString();
            final String s2 = iterator.next();
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Child #");
            sb2.append(string);
            simpleFrameResourceTree.childFrames.add(createSimpleFrameResourceTree(string, "1", sb2.toString(), s2));
            ++i;
        }
        final GetResourceTreeParams getResourceTreeParams = new GetResourceTreeParams();
        getResourceTreeParams.frameTree = simpleFrameResourceTree;
        return getResourceTreeParams;
    }
    
    @ChromeDevtoolsMethod
    public JsonRpcResult hasTouchInputs(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) {
        return new SimpleBooleanResult(false);
    }
    
    @ChromeDevtoolsMethod
    public void screencastFrameAck(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) {
    }
    
    @ChromeDevtoolsMethod
    public void setDeviceMetricsOverride(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) {
    }
    
    @ChromeDevtoolsMethod
    public void setEmulatedMedia(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) {
    }
    
    @ChromeDevtoolsMethod
    public void setShowViewportSizeOnResize(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) {
    }
    
    @ChromeDevtoolsMethod
    public void setTouchEmulationEnabled(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) {
    }
    
    @ChromeDevtoolsMethod
    public void startScreencast(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) {
        final StartScreencastRequest startScreencastRequest = this.mObjectMapper.convertValue(jsonObject, StartScreencastRequest.class);
        if (this.mScreencastDispatcher == null) {
            (this.mScreencastDispatcher = new ScreencastDispatcher()).startScreencast(jsonRpcPeer, startScreencastRequest);
        }
    }
    
    @ChromeDevtoolsMethod
    public void stopScreencast(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) {
        final ScreencastDispatcher mScreencastDispatcher = this.mScreencastDispatcher;
        if (mScreencastDispatcher != null) {
            mScreencastDispatcher.stopScreencast();
            this.mScreencastDispatcher = null;
        }
    }
    
    private static class ExecutionContextCreatedParams
    {
        @JsonProperty(required = true)
        public ExecutionContextDescription context;
    }
    
    private static class ExecutionContextDescription
    {
        @JsonProperty(required = true)
        public String frameId;
        @JsonProperty(required = true)
        public int id;
    }
    
    private static class Frame
    {
        @JsonProperty(required = true)
        public String id;
        @JsonProperty(required = true)
        public String loaderId;
        @JsonProperty(required = true)
        public String mimeType;
        @JsonProperty
        public String name;
        @JsonProperty
        public String parentId;
        @JsonProperty(required = true)
        public String securityOrigin;
        @JsonProperty(required = true)
        public String url;
    }
    
    private static class FrameResourceTree
    {
        @JsonProperty
        public List<FrameResourceTree> childFrames;
        @JsonProperty(required = true)
        public Frame frame;
        @JsonProperty(required = true)
        public List<Resource> resources;
    }
    
    private static class GetResourceTreeParams implements JsonRpcResult
    {
        @JsonProperty(required = true)
        public FrameResourceTree frameTree;
    }
    
    private static class Resource
    {
    }
    
    public enum ResourceType
    {
        DOCUMENT("Document"), 
        FONT("Font"), 
        IMAGE("Image"), 
        OTHER("Other"), 
        SCRIPT("Script"), 
        STYLESHEET("Stylesheet"), 
        WEBSOCKET("WebSocket"), 
        XHR("XHR");
        
        private final String mProtocolValue;
        
        private ResourceType(final String mProtocolValue) {
            this.mProtocolValue = mProtocolValue;
        }
        
        @JsonValue
        public String getProtocolValue() {
            return this.mProtocolValue;
        }
    }
    
    public static class ScreencastFrameEvent
    {
        @JsonProperty(required = true)
        public String data;
        @JsonProperty(required = true)
        public ScreencastFrameEventMetadata metadata;
    }
    
    public static class ScreencastFrameEventMetadata
    {
        @JsonProperty(required = true)
        public int deviceHeight;
        @JsonProperty(required = true)
        public int deviceWidth;
        @JsonProperty(required = true)
        public int offsetTop;
        @JsonProperty(required = true)
        public int pageScaleFactor;
        @JsonProperty(required = true)
        public int scrollOffsetX;
        @JsonProperty(required = true)
        public int scrollOffsetY;
    }
    
    public static class StartScreencastRequest
    {
        @JsonProperty
        public String format;
        @JsonProperty
        public int maxHeight;
        @JsonProperty
        public int maxWidth;
        @JsonProperty
        public int quality;
    }
}
