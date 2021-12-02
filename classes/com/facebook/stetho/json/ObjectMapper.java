// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.json;

import com.facebook.stetho.common.ExceptionUtil;
import com.facebook.stetho.json.annotation.JsonValue;
import c6.h;
import java.util.Iterator;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import org.json.JSONArray;
import com.facebook.stetho.json.annotation.JsonProperty;
import org.json.JSONException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import org.json.JSONObject;
import java.util.IdentityHashMap;
import d6.a;
import java.lang.reflect.Method;
import java.util.Map;

public class ObjectMapper
{
    @a("mJsonValueMethodCache")
    private final Map<Class<?>, Method> mJsonValueMethodCache;
    
    public ObjectMapper() {
        this.mJsonValueMethodCache = new IdentityHashMap<Class<?>, Method>();
    }
    
    private <T> T _convertFromJSONObject(final JSONObject jsonObject, final Class<T> clazz) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, JSONException {
        final Constructor<T> declaredConstructor = clazz.getDeclaredConstructor((Class<?>[])null);
        declaredConstructor.setAccessible(true);
        int i = 0;
        final T instance = declaredConstructor.newInstance(new Object[0]);
        final Field[] fields = clazz.getFields();
        while (i < fields.length) {
            final Field field = fields[i];
            Label_0082: {
                if (Modifier.isStatic(field.getModifiers())) {
                    break Label_0082;
                }
                final Object valueForField = this.getValueForField(field, jsonObject.opt(field.getName()));
                try {
                    field.set(instance, valueForField);
                    ++i;
                    continue;
                }
                catch (IllegalArgumentException cause) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Class: ");
                    sb.append(clazz.getSimpleName());
                    sb.append(" Field: ");
                    sb.append(field.getName());
                    sb.append(" type ");
                    String name;
                    if (valueForField != null) {
                        name = valueForField.getClass().getName();
                    }
                    else {
                        name = "null";
                    }
                    sb.append(name);
                    throw new IllegalArgumentException(sb.toString(), cause);
                }
            }
            break;
        }
        return instance;
    }
    
    private JSONObject _convertToJSONObject(final Object obj) throws JSONException, InvocationTargetException, IllegalAccessException {
        final JSONObject jsonObject = new JSONObject();
        final Field[] fields = obj.getClass().getFields();
        for (int i = 0; i < fields.length; ++i) {
            final Field field = fields[i];
            if (!Modifier.isStatic(field.getModifiers())) {
                final JsonProperty jsonProperty = field.getAnnotation(JsonProperty.class);
                if (jsonProperty != null) {
                    final Object value = field.get(obj);
                    Class<?> clazz = field.getType();
                    if (value != null) {
                        clazz = value.getClass();
                    }
                    final String name = field.getName();
                    Object o;
                    if (jsonProperty.required() && value == null) {
                        o = JSONObject.NULL;
                    }
                    else if (value == JSONObject.NULL) {
                        o = value;
                    }
                    else {
                        o = this.getJsonValue(value, clazz, field);
                    }
                    jsonObject.put(name, o);
                }
            }
        }
        return jsonObject;
    }
    
    private static boolean canDirectlySerializeClass(final Class clazz) {
        return isWrapperOrPrimitiveType(clazz) || clazz.equals(String.class);
    }
    
    private List<Object> convertArrayToList(final Field field, final JSONArray jsonArray) throws IllegalAccessException, JSONException {
        if (!List.class.isAssignableFrom(field.getType())) {
            final StringBuilder sb = new StringBuilder();
            sb.append("only know how to deserialize List<?> on field ");
            sb.append(field.getName());
            throw new IllegalArgumentException(sb.toString());
        }
        final Type[] actualTypeArguments = ((ParameterizedType)field.getGenericType()).getActualTypeArguments();
        if (actualTypeArguments.length == 1) {
            int i = 0;
            final Class clazz = (Class)actualTypeArguments[0];
            final ArrayList<Enum> list = new ArrayList<Enum>();
            while (i < jsonArray.length()) {
                Object o;
                if (clazz.isEnum()) {
                    o = this.getEnumValue(jsonArray.getString(i), clazz);
                }
                else if (canDirectlySerializeClass(clazz)) {
                    o = jsonArray.get(i);
                }
                else {
                    final JSONObject jsonObject = jsonArray.getJSONObject(i);
                    if (jsonObject == null) {
                        o = null;
                    }
                    else {
                        o = this.convertValue(jsonObject, (Class<Enum>)clazz);
                    }
                }
                list.add((Enum)o);
                ++i;
            }
            return (List<Object>)list;
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Only able to handle a single type in a list ");
        sb2.append(field.getName());
        throw new IllegalArgumentException(sb2.toString());
    }
    
    private JSONArray convertListToJsonArray(Object jsonValue) throws InvocationTargetException, IllegalAccessException {
        final JSONArray jsonArray = new JSONArray();
        for (final Object next : (List)jsonValue) {
            jsonValue = null;
            if (next != null) {
                jsonValue = this.getJsonValue(next, next.getClass(), null);
            }
            jsonArray.put(jsonValue);
        }
        return jsonArray;
    }
    
    private Enum getEnumByMethod(final String s, final Class<? extends Enum> clazz, final Method method) {
        final Enum[] array = (Enum[])clazz.getEnumConstants();
        int i = 0;
        while (i < array.length) {
            final Enum obj = array[i];
            try {
                final Object invoke = method.invoke(obj, new Object[0]);
                if (invoke != null && invoke.toString().equals(s)) {
                    return obj;
                }
                ++i;
                continue;
            }
            catch (Exception cause) {
                throw new IllegalArgumentException(cause);
            }
            break;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("No enum constant ");
        sb.append(clazz.getName());
        sb.append(".");
        sb.append(s);
        throw new IllegalArgumentException(sb.toString());
    }
    
    private Enum getEnumValue(final String name, final Class<? extends Enum> enumType) {
        final Method jsonValueMethod = this.getJsonValueMethod(enumType);
        if (jsonValueMethod != null) {
            return this.getEnumByMethod(name, enumType, jsonValueMethod);
        }
        return Enum.valueOf(enumType, name);
    }
    
    private Object getJsonValue(final Object obj, final Class<?> clazz, final Field field) throws InvocationTargetException, IllegalAccessException {
        if (obj == null) {
            return null;
        }
        if (List.class.isAssignableFrom(clazz)) {
            return this.convertListToJsonArray(obj);
        }
        final Method jsonValueMethod = this.getJsonValueMethod(clazz);
        if (jsonValueMethod != null) {
            return jsonValueMethod.invoke(obj, new Object[0]);
        }
        if (!canDirectlySerializeClass(clazz)) {
            return this.convertValue(obj, JSONObject.class);
        }
        if (!clazz.equals(Double.class)) {
            final Object o = obj;
            if (!clazz.equals(Float.class)) {
                return o;
            }
        }
        final double doubleValue = ((Number)obj).doubleValue();
        if (Double.isNaN(doubleValue)) {
            return "NaN";
        }
        if (doubleValue == Double.POSITIVE_INFINITY) {
            return "Infinity";
        }
        Object o = obj;
        if (doubleValue == Double.NEGATIVE_INFINITY) {
            o = "-Infinity";
        }
        return o;
    }
    
    @h
    private Method getJsonValueMethod(final Class<?> clazz) {
        synchronized (this.mJsonValueMethodCache) {
            Method jsonValueMethodImpl;
            final Method method = jsonValueMethodImpl = this.mJsonValueMethodCache.get(clazz);
            if (method == null) {
                jsonValueMethodImpl = method;
                if (!this.mJsonValueMethodCache.containsKey(clazz)) {
                    jsonValueMethodImpl = getJsonValueMethodImpl(clazz);
                    this.mJsonValueMethodCache.put(clazz, jsonValueMethodImpl);
                }
            }
            return jsonValueMethodImpl;
        }
    }
    
    @h
    private static Method getJsonValueMethodImpl(final Class<?> clazz) {
        final Method[] methods = clazz.getMethods();
        for (int i = 0; i < methods.length; ++i) {
            if (methods[i].getAnnotation(JsonValue.class) != null) {
                return methods[i];
            }
        }
        return null;
    }
    
    private Object getValueForField(final Field field, final Object o) throws JSONException {
        if (o != null) {
            try {
                if (o == JSONObject.NULL) {
                    return null;
                }
                if (o.getClass() == field.getType()) {
                    return o;
                }
                if (o instanceof JSONObject) {
                    return this.convertValue(o, field.getType());
                }
                if (field.getType().isEnum()) {
                    return this.getEnumValue((String)o, field.getType().asSubclass(Enum.class));
                }
                if (o instanceof JSONArray) {
                    return this.convertArrayToList(field, (JSONArray)o);
                }
                if (o instanceof Number) {
                    final Number n = (Number)o;
                    final Class<?> type = field.getType();
                    if (type == Integer.class || type == Integer.TYPE) {
                        return n.intValue();
                    }
                    if (type == Long.class || type == Long.TYPE) {
                        return n.longValue();
                    }
                    if (type == Double.class || type == Double.TYPE) {
                        return n.doubleValue();
                    }
                    if (type == Float.class || type == Float.TYPE) {
                        return n.floatValue();
                    }
                    if (type == Byte.class || type == Byte.TYPE) {
                        return n.byteValue();
                    }
                    if (type != Short.class && type != Short.TYPE) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Not setup to handle class ");
                        sb.append(type.getName());
                        throw new IllegalArgumentException(sb.toString());
                    }
                    return n.shortValue();
                }
            }
            catch (IllegalAccessException cause) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Unable to set value for field ");
                sb2.append(field.getName());
                throw new IllegalArgumentException(sb2.toString(), cause);
            }
        }
        return o;
    }
    
    private static boolean isWrapperOrPrimitiveType(final Class<?> clazz) {
        return clazz.isPrimitive() || clazz.equals(Boolean.class) || clazz.equals(Integer.class) || clazz.equals(Character.class) || clazz.equals(Byte.class) || clazz.equals(Short.class) || clazz.equals(Double.class) || clazz.equals(Long.class) || clazz.equals(Float.class);
    }
    
    public <T> T convertValue(Object o, final Class<T> clazz) throws IllegalArgumentException {
        if (o == null) {
            return null;
        }
        if (clazz != Object.class && clazz.isAssignableFrom(o.getClass())) {
            return (T)o;
        }
        try {
            if (o instanceof JSONObject) {
                return this._convertFromJSONObject((JSONObject)o, clazz);
            }
            if (clazz == JSONObject.class) {
                return (T)this._convertToJSONObject(o);
            }
            o = new IllegalArgumentException("Expecting either fromValue or toValueType to be a JSONObject");
            throw o;
        }
        catch (InvocationTargetException ex) {
            throw ExceptionUtil.propagate(ex.getCause());
        }
        catch (JSONException cause) {
            throw new IllegalArgumentException((Throwable)cause);
        }
        catch (InstantiationException cause2) {
            throw new IllegalArgumentException(cause2);
        }
        catch (IllegalAccessException cause3) {
            throw new IllegalArgumentException(cause3);
        }
        catch (NoSuchMethodException cause4) {
            throw new IllegalArgumentException(cause4);
        }
    }
}
