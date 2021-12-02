// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.inspector.protocol.module;

import java.util.Set;
import java.lang.reflect.Modifier;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;
import java.util.ArrayList;
import java.lang.reflect.Array;
import java.util.Arrays;
import c6.h;
import com.facebook.stetho.inspector.helper.ObjectIdMapper;
import com.facebook.stetho.json.annotation.JsonValue;
import java.util.List;
import com.facebook.stetho.json.annotation.JsonProperty;
import com.facebook.stetho.common.LogUtil;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsMethod;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcException;
import com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcResult;
import org.json.JSONObject;
import org.json.JSONException;
import c6.g;
import com.facebook.stetho.inspector.jsonrpc.DisconnectReceiver;
import com.facebook.stetho.inspector.runtime.RhinoDetectingRuntimeReplFactory;
import android.content.Context;
import com.facebook.stetho.inspector.console.RuntimeRepl;
import java.util.Collections;
import java.util.HashMap;
import com.facebook.stetho.inspector.console.RuntimeReplFactory;
import com.facebook.stetho.json.ObjectMapper;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcPeer;
import java.util.Map;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsDomain;

public class Runtime implements ChromeDevtoolsDomain
{
    private static final Map<JsonRpcPeer, Session> sSessions;
    private final ObjectMapper mObjectMapper;
    private final RuntimeReplFactory mReplFactory;
    
    static {
        sSessions = Collections.synchronizedMap(new HashMap<JsonRpcPeer, Session>());
    }
    
    @Deprecated
    public Runtime() {
        this(new RuntimeReplFactory() {
            @Override
            public RuntimeRepl newInstance() {
                return new RuntimeRepl() {
                    @Override
                    public Object evaluate(final String s) throws Throwable {
                        return "Not supported with legacy Runtime module";
                    }
                };
            }
        });
    }
    
    public Runtime(final Context context) {
        this(new RhinoDetectingRuntimeReplFactory(context));
    }
    
    public Runtime(final RuntimeReplFactory mReplFactory) {
        this.mObjectMapper = new ObjectMapper();
        this.mReplFactory = mReplFactory;
    }
    
    private static String getPropertyClassName(final Object o) {
        String s;
        if ((s = o.getClass().getSimpleName()).length() == 0) {
            s = o.getClass().getName();
        }
        return s;
    }
    
    @g
    private static Session getSession(final JsonRpcPeer jsonRpcPeer) {
        synchronized (Runtime.class) {
            final Map<JsonRpcPeer, Session> sSessions = Runtime.sSessions;
            Session session;
            if ((session = sSessions.get(jsonRpcPeer)) == null) {
                session = new Session();
                sSessions.put(jsonRpcPeer, session);
                jsonRpcPeer.registerDisconnectReceiver(new DisconnectReceiver() {
                    @Override
                    public void onDisconnect() {
                        Runtime.sSessions.remove(jsonRpcPeer);
                    }
                });
            }
            return session;
        }
    }
    
    public static int mapObject(final JsonRpcPeer jsonRpcPeer, final Object o) {
        return getSession(jsonRpcPeer).getObjects().putObject(o);
    }
    
    public static void releaseObject(final JsonRpcPeer jsonRpcPeer, final Integer n) throws JSONException {
        getSession(jsonRpcPeer).getObjects().removeObjectById(n);
    }
    
    @ChromeDevtoolsMethod
    public JsonRpcResult callFunctionOn(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) throws JsonRpcException {
        final CallFunctionOnRequest callFunctionOnRequest = this.mObjectMapper.convertValue(jsonObject, CallFunctionOnRequest.class);
        final Session session = getSession(jsonRpcPeer);
        final Object objectOrThrow = session.getObjectOrThrow(callFunctionOnRequest.objectId);
        if (callFunctionOnRequest.functionDeclaration.startsWith("function protoList(")) {
            final ObjectProtoContainer objectProtoContainer = new ObjectProtoContainer(objectOrThrow);
            final RemoteObject result = new RemoteObject();
            result.type = ObjectType.OBJECT;
            result.subtype = ObjectSubType.NODE;
            result.className = objectOrThrow.getClass().getName();
            result.description = getPropertyClassName(objectOrThrow);
            result.objectId = String.valueOf(session.getObjects().putObject(objectProtoContainer));
            final CallFunctionOnResponse callFunctionOnResponse = new CallFunctionOnResponse();
            callFunctionOnResponse.result = result;
            callFunctionOnResponse.wasThrown = Boolean.FALSE;
            return callFunctionOnResponse;
        }
        final JsonRpcError.ErrorCode internal_ERROR = JsonRpcError.ErrorCode.INTERNAL_ERROR;
        final StringBuilder sb = new StringBuilder();
        sb.append("Expected protoList, got: ");
        sb.append(callFunctionOnRequest.functionDeclaration);
        throw new JsonRpcException(new JsonRpcError(internal_ERROR, sb.toString(), null));
    }
    
    @ChromeDevtoolsMethod
    public JsonRpcResult evaluate(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) {
        return getSession(jsonRpcPeer).evaluate(this.mReplFactory, jsonObject);
    }
    
    @ChromeDevtoolsMethod
    public JsonRpcResult getProperties(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) throws JsonRpcException {
        return getSession(jsonRpcPeer).getProperties(jsonObject);
    }
    
    @ChromeDevtoolsMethod
    public void releaseObject(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) throws JSONException {
        getSession(jsonRpcPeer).getObjects().removeObjectById(Integer.parseInt(jsonObject.getString("objectId")));
    }
    
    @ChromeDevtoolsMethod
    public void releaseObjectGroup(final JsonRpcPeer jsonRpcPeer, final JSONObject obj) {
        final StringBuilder sb = new StringBuilder();
        sb.append("Ignoring request to releaseObjectGroup: ");
        sb.append(obj);
        LogUtil.w(sb.toString());
    }
    
    private static class CallArgument
    {
        @JsonProperty(required = false)
        public String objectId;
        @JsonProperty(required = false)
        public ObjectType type;
        @JsonProperty(required = false)
        public Object value;
    }
    
    private static class CallFunctionOnRequest
    {
        @JsonProperty
        public List<CallArgument> arguments;
        @JsonProperty(required = false)
        public Boolean doNotPauseOnExceptionsAndMuteConsole;
        @JsonProperty
        public String functionDeclaration;
        @JsonProperty(required = false)
        public Boolean generatePreview;
        @JsonProperty
        public String objectId;
        @JsonProperty(required = false)
        public Boolean returnByValue;
    }
    
    private static class CallFunctionOnResponse implements JsonRpcResult
    {
        @JsonProperty
        public RemoteObject result;
        @JsonProperty(required = false)
        public Boolean wasThrown;
    }
    
    private static class EvaluateRequest implements JsonRpcResult
    {
        @JsonProperty(required = true)
        public String expression;
        @JsonProperty(required = true)
        public String objectGroup;
    }
    
    private static class EvaluateResponse implements JsonRpcResult
    {
        @JsonProperty
        public ExceptionDetails exceptionDetails;
        @JsonProperty(required = true)
        public RemoteObject result;
        @JsonProperty(required = true)
        public boolean wasThrown;
    }
    
    private static class ExceptionDetails
    {
        @JsonProperty(required = true)
        public String text;
    }
    
    private static class GetPropertiesRequest implements JsonRpcResult
    {
        @JsonProperty(required = true)
        public String objectId;
        @JsonProperty(required = true)
        public boolean ownProperties;
    }
    
    private static class GetPropertiesResponse implements JsonRpcResult
    {
        @JsonProperty(required = true)
        public List<PropertyDescriptor> result;
    }
    
    private static class ObjectProtoContainer
    {
        public final Object object;
        
        public ObjectProtoContainer(final Object object) {
            this.object = object;
        }
    }
    
    public enum ObjectSubType
    {
        ARRAY("array"), 
        DATE("date"), 
        ERROR("error"), 
        GENERATOR("generator"), 
        ITERATOR("iterator"), 
        MAP("map"), 
        NODE("node"), 
        NULL("null"), 
        REGEXP("regexp"), 
        SET("set");
        
        private final String mProtocolValue;
        
        private ObjectSubType(final String mProtocolValue) {
            this.mProtocolValue = mProtocolValue;
        }
        
        @JsonValue
        public String getProtocolValue() {
            return this.mProtocolValue;
        }
    }
    
    public enum ObjectType
    {
        BOOLEAN("boolean"), 
        FUNCTION("function"), 
        NUMBER("number"), 
        OBJECT("object"), 
        STRING("string"), 
        SYMBOL("symbol"), 
        UNDEFINED("undefined");
        
        private final String mProtocolValue;
        
        private ObjectType(final String mProtocolValue) {
            this.mProtocolValue = mProtocolValue;
        }
        
        @JsonValue
        public String getProtocolValue() {
            return this.mProtocolValue;
        }
    }
    
    private static class PropertyDescriptor
    {
        @JsonProperty(required = true)
        public final boolean configurable;
        @JsonProperty(required = true)
        public final boolean enumerable;
        @JsonProperty(required = true)
        public final boolean isOwn;
        @JsonProperty(required = true)
        public String name;
        @JsonProperty(required = true)
        public RemoteObject value;
        @JsonProperty(required = true)
        public final boolean writable;
        
        private PropertyDescriptor() {
            this.isOwn = true;
            this.configurable = false;
            this.enumerable = true;
            this.writable = false;
        }
    }
    
    public static class RemoteObject
    {
        @JsonProperty
        public String className;
        @JsonProperty
        public String description;
        @JsonProperty
        public String objectId;
        @JsonProperty
        public ObjectSubType subtype;
        @JsonProperty(required = true)
        public ObjectType type;
        @JsonProperty
        public Object value;
    }
    
    private static class Session
    {
        private final ObjectMapper mObjectMapper;
        private final ObjectIdMapper mObjects;
        @h
        private RuntimeRepl mRepl;
        
        private Session() {
            this.mObjects = new ObjectIdMapper();
            this.mObjectMapper = new ObjectMapper();
        }
        
        private List<?> arrayToList(final Object o) {
            final Class<?> class1 = o.getClass();
            if (!class1.isArray()) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Argument must be an array.  Was ");
                sb.append(class1);
                throw new IllegalArgumentException(sb.toString());
            }
            if (!class1.getComponentType().isPrimitive()) {
                return Arrays.asList((Object[])o);
            }
            final int length = Array.getLength(o);
            final ArrayList list = new ArrayList<Object>(length);
            for (int i = 0; i < length; ++i) {
                list.add(Array.get(o, i));
            }
            return list;
        }
        
        private EvaluateResponse buildExceptionResponse(final Object o) {
            final EvaluateResponse evaluateResponse = new EvaluateResponse();
            evaluateResponse.wasThrown = true;
            evaluateResponse.result = this.objectForRemote(o);
            final ExceptionDetails exceptionDetails = new ExceptionDetails();
            evaluateResponse.exceptionDetails = exceptionDetails;
            exceptionDetails.text = o.toString();
            return evaluateResponse;
        }
        
        private EvaluateResponse buildNormalResponse(final Object o) {
            final EvaluateResponse evaluateResponse = new EvaluateResponse();
            evaluateResponse.wasThrown = false;
            evaluateResponse.result = this.objectForRemote(o);
            return evaluateResponse;
        }
        
        private GetPropertiesResponse getPropertiesForIterable(final Iterable<?> iterable, final boolean b) {
            final GetPropertiesResponse getPropertiesResponse = new GetPropertiesResponse();
            final ArrayList<PropertyDescriptor> result = new ArrayList<PropertyDescriptor>();
            final Iterator<?> iterator = iterable.iterator();
            int i = 0;
            while (iterator.hasNext()) {
                final Object next = iterator.next();
                final PropertyDescriptor propertyDescriptor = new PropertyDescriptor();
                String value;
                if (b) {
                    final int n = i + 1;
                    value = String.valueOf(i);
                    i = n;
                }
                else {
                    value = null;
                }
                propertyDescriptor.name = value;
                propertyDescriptor.value = this.objectForRemote(next);
                result.add(propertyDescriptor);
            }
            getPropertiesResponse.result = result;
            return getPropertiesResponse;
        }
        
        private GetPropertiesResponse getPropertiesForMap(Object o) {
            final GetPropertiesResponse getPropertiesResponse = new GetPropertiesResponse();
            final ArrayList<PropertyDescriptor> result = new ArrayList<PropertyDescriptor>();
            for (final Map.Entry<Object, V> entry : ((Map)o).entrySet()) {
                o = new PropertyDescriptor();
                ((PropertyDescriptor)o).name = String.valueOf(entry.getKey());
                ((PropertyDescriptor)o).value = this.objectForRemote(entry.getValue());
                result.add((PropertyDescriptor)o);
            }
            getPropertiesResponse.result = result;
            return getPropertiesResponse;
        }
        
        private GetPropertiesResponse getPropertiesForObject(final Object obj) {
            final GetPropertiesResponse getPropertiesResponse = new GetPropertiesResponse();
            final ArrayList<PropertyDescriptor> list = new ArrayList<PropertyDescriptor>();
            for (Class<?> clazz = obj.getClass(); clazz != null; clazz = clazz.getSuperclass()) {
                final ArrayList list2 = new ArrayList<Object>(Arrays.asList(clazz.getDeclaredFields()));
                Collections.reverse(list2);
                String string;
                if (clazz == obj.getClass()) {
                    string = "";
                }
                else {
                    final StringBuilder sb = new StringBuilder();
                    sb.append(clazz.getSimpleName());
                    sb.append(".");
                    string = sb.toString();
                }
                for (final Field field : list2) {
                    if (Modifier.isStatic(field.getModifiers())) {
                        continue;
                    }
                    field.setAccessible(true);
                    try {
                        final Object value = field.get(obj);
                        final PropertyDescriptor propertyDescriptor = new PropertyDescriptor();
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append(string);
                        sb2.append(field.getName());
                        propertyDescriptor.name = sb2.toString();
                        propertyDescriptor.value = this.objectForRemote(value);
                        list.add(propertyDescriptor);
                        continue;
                    }
                    catch (IllegalAccessException cause) {
                        throw new RuntimeException(cause);
                    }
                    break;
                }
            }
            Collections.reverse(list);
            getPropertiesResponse.result = list;
            return getPropertiesResponse;
        }
        
        private GetPropertiesResponse getPropertiesForProtoContainer(final ObjectProtoContainer objectProtoContainer) {
            final Object object = objectProtoContainer.object;
            final RemoteObject value = new RemoteObject();
            value.type = ObjectType.OBJECT;
            value.subtype = ObjectSubType.NODE;
            value.className = object.getClass().getName();
            value.description = getPropertyClassName(object);
            value.objectId = String.valueOf(this.mObjects.putObject(object));
            final PropertyDescriptor propertyDescriptor = new PropertyDescriptor();
            propertyDescriptor.name = "1";
            propertyDescriptor.value = value;
            final GetPropertiesResponse getPropertiesResponse = new GetPropertiesResponse();
            (getPropertiesResponse.result = new ArrayList<PropertyDescriptor>(1)).add(propertyDescriptor);
            return getPropertiesResponse;
        }
        
        @g
        private RuntimeRepl getRepl(final RuntimeReplFactory runtimeReplFactory) {
            synchronized (this) {
                if (this.mRepl == null) {
                    this.mRepl = runtimeReplFactory.newInstance();
                }
                return this.mRepl;
            }
        }
        
        public EvaluateResponse evaluate(final RuntimeReplFactory runtimeReplFactory, final JSONObject jsonObject) {
            final EvaluateRequest evaluateRequest = this.mObjectMapper.convertValue(jsonObject, EvaluateRequest.class);
            try {
                if (!evaluateRequest.objectGroup.equals("console")) {
                    return this.buildExceptionResponse("Not supported by FAB");
                }
                return this.buildNormalResponse(this.getRepl(runtimeReplFactory).evaluate(evaluateRequest.expression));
            }
            finally {
                final Throwable t;
                return this.buildExceptionResponse(t);
            }
        }
        
        public Object getObjectOrThrow(final String s) throws JsonRpcException {
            final Object objectForId = this.getObjects().getObjectForId(Integer.parseInt(s));
            if (objectForId != null) {
                return objectForId;
            }
            final JsonRpcError.ErrorCode invalid_REQUEST = JsonRpcError.ErrorCode.INVALID_REQUEST;
            final StringBuilder sb = new StringBuilder();
            sb.append("No object found for ");
            sb.append(s);
            throw new JsonRpcException(new JsonRpcError(invalid_REQUEST, sb.toString(), null));
        }
        
        public ObjectIdMapper getObjects() {
            return this.mObjects;
        }
        
        public GetPropertiesResponse getProperties(final JSONObject jsonObject) throws JsonRpcException {
            final GetPropertiesRequest getPropertiesRequest = this.mObjectMapper.convertValue(jsonObject, GetPropertiesRequest.class);
            if (!getPropertiesRequest.ownProperties) {
                final GetPropertiesResponse getPropertiesResponse = new GetPropertiesResponse();
                getPropertiesResponse.result = new ArrayList<PropertyDescriptor>();
                return getPropertiesResponse;
            }
            Object o2;
            final Object o = o2 = this.getObjectOrThrow(getPropertiesRequest.objectId);
            if (((List<?>)o).getClass().isArray()) {
                o2 = this.arrayToList(o);
            }
            if (o2 instanceof ObjectProtoContainer) {
                return this.getPropertiesForProtoContainer((ObjectProtoContainer)o2);
            }
            if (o2 instanceof List) {
                return this.getPropertiesForIterable((Iterable<?>)o2, true);
            }
            if (o2 instanceof Set) {
                return this.getPropertiesForIterable((Iterable<?>)o2, false);
            }
            if (o2 instanceof Map) {
                return this.getPropertiesForMap(o2);
            }
            return this.getPropertiesForObject(o2);
        }
        
        public RemoteObject objectForRemote(Object o) {
            final RemoteObject remoteObject = new RemoteObject();
            Label_0030: {
                if (o == null) {
                    remoteObject.type = ObjectType.OBJECT;
                    remoteObject.subtype = ObjectSubType.NULL;
                    o = JSONObject.NULL;
                }
                else {
                    ObjectType type;
                    if (o instanceof Boolean) {
                        type = ObjectType.BOOLEAN;
                    }
                    else if (o instanceof Number) {
                        type = ObjectType.NUMBER;
                    }
                    else {
                        if (o instanceof Character) {
                            remoteObject.type = ObjectType.NUMBER;
                            o = o;
                            break Label_0030;
                        }
                        if (o instanceof String) {
                            remoteObject.type = ObjectType.STRING;
                            o = String.valueOf(o);
                            break Label_0030;
                        }
                        remoteObject.type = ObjectType.OBJECT;
                        remoteObject.className = "What??";
                        remoteObject.objectId = String.valueOf(this.mObjects.putObject(o));
                        String access$300;
                        if (o.getClass().isArray()) {
                            access$300 = "array";
                        }
                        else if (o instanceof List) {
                            access$300 = "List";
                        }
                        else if (o instanceof Set) {
                            access$300 = "Set";
                        }
                        else if (o instanceof Map) {
                            access$300 = "Map";
                        }
                        else {
                            access$300 = getPropertyClassName(o);
                        }
                        remoteObject.description = access$300;
                        return remoteObject;
                    }
                    remoteObject.type = type;
                }
            }
            remoteObject.value = o;
            return remoteObject;
        }
    }
}
