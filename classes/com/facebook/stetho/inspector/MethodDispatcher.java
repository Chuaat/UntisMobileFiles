// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.inspector;

import com.facebook.stetho.inspector.jsonrpc.protocol.EmptyResult;
import java.lang.reflect.InvocationTargetException;
import com.facebook.stetho.common.ExceptionUtil;
import org.json.JSONException;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcException;
import com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError;
import c6.h;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcResult;
import org.json.JSONObject;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcPeer;
import java.lang.annotation.Annotation;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsMethod;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Collections;
import java.util.HashMap;
import com.facebook.stetho.common.Util;
import com.facebook.stetho.json.ObjectMapper;
import d6.a;
import java.util.Map;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsDomain;
import d6.d;

@d
public class MethodDispatcher
{
    private final Iterable<ChromeDevtoolsDomain> mDomainHandlers;
    @a("this")
    private Map<String, MethodDispatchHelper> mMethods;
    private final ObjectMapper mObjectMapper;
    
    public MethodDispatcher(final ObjectMapper mObjectMapper, final Iterable<ChromeDevtoolsDomain> mDomainHandlers) {
        this.mObjectMapper = mObjectMapper;
        this.mDomainHandlers = mDomainHandlers;
    }
    
    private static Map<String, MethodDispatchHelper> buildDispatchTable(final ObjectMapper objectMapper, final Iterable<ChromeDevtoolsDomain> iterable) {
        Util.throwIfNull(objectMapper);
        final HashMap<String, MethodDispatchHelper> m = new HashMap<String, MethodDispatchHelper>();
        for (final ChromeDevtoolsDomain chromeDevtoolsDomain : Util.throwIfNull(iterable)) {
            final Class<? extends ChromeDevtoolsDomain> class1 = chromeDevtoolsDomain.getClass();
            final String simpleName = class1.getSimpleName();
            for (final Method method : class1.getMethods()) {
                if (isDevtoolsMethod(method)) {
                    final MethodDispatchHelper value = new MethodDispatchHelper(objectMapper, chromeDevtoolsDomain, method);
                    final StringBuilder sb = new StringBuilder();
                    sb.append(simpleName);
                    sb.append(".");
                    sb.append(method.getName());
                    m.put(sb.toString(), value);
                }
            }
        }
        return (Map<String, MethodDispatchHelper>)Collections.unmodifiableMap((Map<?, ?>)m);
    }
    
    private MethodDispatchHelper findMethodDispatcher(final String s) {
        synchronized (this) {
            if (this.mMethods == null) {
                this.mMethods = buildDispatchTable(this.mObjectMapper, this.mDomainHandlers);
            }
            return this.mMethods.get(s);
        }
    }
    
    private static boolean isDevtoolsMethod(final Method method) throws IllegalArgumentException {
        if (!method.isAnnotationPresent(ChromeDevtoolsMethod.class)) {
            return false;
        }
        final Class<?>[] parameterTypes = method.getParameterTypes();
        final StringBuilder sb = new StringBuilder();
        sb.append(method.getDeclaringClass().getSimpleName());
        sb.append(".");
        sb.append(method.getName());
        final String string = sb.toString();
        Util.throwIfNot(parameterTypes.length == 2, "%s: expected 2 args, got %s", string, parameterTypes.length);
        Util.throwIfNot(parameterTypes[0].equals(JsonRpcPeer.class), "%s: expected 1st arg of JsonRpcPeer, got %s", string, parameterTypes[0].getName());
        Util.throwIfNot(parameterTypes[1].equals(JSONObject.class), "%s: expected 2nd arg of JSONObject, got %s", string, parameterTypes[1].getName());
        final Class<?> returnType = method.getReturnType();
        if (!returnType.equals(Void.TYPE)) {
            Util.throwIfNot(JsonRpcResult.class.isAssignableFrom(returnType), "%s: expected JsonRpcResult return type, got %s", string, returnType.getName());
        }
        return true;
    }
    
    public JSONObject dispatch(final JsonRpcPeer jsonRpcPeer, final String str, @h final JSONObject jsonObject) throws JsonRpcException {
        final MethodDispatchHelper methodDispatcher = this.findMethodDispatcher(str);
        if (methodDispatcher != null) {
            try {
                return methodDispatcher.invoke(jsonRpcPeer, jsonObject);
            }
            catch (JSONException ex) {
                throw new JsonRpcException(new JsonRpcError(JsonRpcError.ErrorCode.INTERNAL_ERROR, ex.toString(), null));
            }
            catch (IllegalAccessException cause) {
                throw new RuntimeException(cause);
            }
            catch (InvocationTargetException ex2) {
                final Throwable cause2 = ex2.getCause();
                ExceptionUtil.propagateIfInstanceOf(cause2, JsonRpcException.class);
                throw ExceptionUtil.propagate(cause2);
            }
        }
        final JsonRpcError.ErrorCode method_NOT_FOUND = JsonRpcError.ErrorCode.METHOD_NOT_FOUND;
        final StringBuilder sb = new StringBuilder();
        sb.append("Not implemented: ");
        sb.append(str);
        throw new JsonRpcException(new JsonRpcError(method_NOT_FOUND, sb.toString(), null));
    }
    
    private static class MethodDispatchHelper
    {
        private final ChromeDevtoolsDomain mInstance;
        private final Method mMethod;
        private final ObjectMapper mObjectMapper;
        
        public MethodDispatchHelper(final ObjectMapper mObjectMapper, final ChromeDevtoolsDomain mInstance, final Method mMethod) {
            this.mObjectMapper = mObjectMapper;
            this.mInstance = mInstance;
            this.mMethod = mMethod;
        }
        
        public JSONObject invoke(final JsonRpcPeer jsonRpcPeer, @h final JSONObject jsonObject) throws InvocationTargetException, IllegalAccessException, JSONException, JsonRpcException {
            final Object invoke = this.mMethod.invoke(this.mInstance, jsonRpcPeer, jsonObject);
            if (invoke != null && !(invoke instanceof EmptyResult)) {
                return this.mObjectMapper.convertValue(invoke, JSONObject.class);
            }
            return new JSONObject();
        }
    }
}
