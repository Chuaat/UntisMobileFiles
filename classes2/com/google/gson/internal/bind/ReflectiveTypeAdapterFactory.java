// 
// Decompiled by Procyon v0.5.36
// 

package com.google.gson.internal.bind;

import java.util.Iterator;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonToken;
import com.google.gson.internal.ObjectConstructor;
import java.util.ArrayList;
import java.util.Collections;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import com.google.gson.internal.$Gson$Types;
import java.lang.reflect.AccessibleObject;
import java.util.LinkedHashMap;
import java.util.Map;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import com.google.gson.stream.JsonReader;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import java.lang.reflect.Type;
import com.google.gson.internal.Primitives;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Field;
import com.google.gson.Gson;
import com.google.gson.FieldNamingStrategy;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.reflect.ReflectionAccessor;
import com.google.gson.TypeAdapterFactory;

public final class ReflectiveTypeAdapterFactory implements TypeAdapterFactory
{
    private final ReflectionAccessor accessor;
    private final ConstructorConstructor constructorConstructor;
    private final Excluder excluder;
    private final FieldNamingStrategy fieldNamingPolicy;
    private final JsonAdapterAnnotationTypeAdapterFactory jsonAdapterFactory;
    
    public ReflectiveTypeAdapterFactory(final ConstructorConstructor constructorConstructor, final FieldNamingStrategy fieldNamingPolicy, final Excluder excluder, final JsonAdapterAnnotationTypeAdapterFactory jsonAdapterFactory) {
        this.accessor = ReflectionAccessor.getInstance();
        this.constructorConstructor = constructorConstructor;
        this.fieldNamingPolicy = fieldNamingPolicy;
        this.excluder = excluder;
        this.jsonAdapterFactory = jsonAdapterFactory;
    }
    
    private BoundField createBoundField(final Gson gson, final Field field, final String s, final TypeToken<?> typeToken, final boolean b, final boolean b2) {
        final boolean primitive = Primitives.isPrimitive(typeToken.getRawType());
        final JsonAdapter jsonAdapter = field.getAnnotation(JsonAdapter.class);
        TypeAdapter<?> typeAdapter;
        if (jsonAdapter != null) {
            typeAdapter = this.jsonAdapterFactory.getTypeAdapter(this.constructorConstructor, gson, typeToken, jsonAdapter);
        }
        else {
            typeAdapter = null;
        }
        final boolean b3 = typeAdapter != null;
        TypeAdapter<?> adapter = typeAdapter;
        if (typeAdapter == null) {
            adapter = gson.getAdapter(typeToken);
        }
        return (BoundField)new BoundField(s, b, b2) {
            @Override
            void read(final JsonReader jsonReader, final Object obj) throws IOException, IllegalAccessException {
                final Object read = adapter.read(jsonReader);
                if (read != null || !primitive) {
                    field.set(obj, read);
                }
            }
            
            @Override
            void write(final JsonWriter jsonWriter, final Object obj) throws IOException, IllegalAccessException {
                final Object value = field.get(obj);
                TypeAdapter<Object> val$typeAdapter;
                if (b3) {
                    val$typeAdapter = (TypeAdapter<Object>)adapter;
                }
                else {
                    val$typeAdapter = new TypeAdapterRuntimeTypeWrapper<Object>(gson, adapter, typeToken.getType());
                }
                val$typeAdapter.write(jsonWriter, value);
            }
            
            public boolean writeField(final Object obj) throws IOException, IllegalAccessException {
                final boolean serialized = super.serialized;
                boolean b = false;
                if (!serialized) {
                    return false;
                }
                if (field.get(obj) != obj) {
                    b = true;
                }
                return b;
            }
        };
    }
    
    static boolean excludeField(final Field field, final boolean b, final Excluder excluder) {
        return !excluder.excludeClass(field.getType(), b) && !excluder.excludeField(field, b);
    }
    
    private Map<String, BoundField> getBoundFields(final Gson gson, final TypeToken<?> typeToken, Class<?> rawType) {
        final LinkedHashMap<String, BoundField> linkedHashMap = new LinkedHashMap<String, BoundField>();
        if (rawType.isInterface()) {
            return linkedHashMap;
        }
        final Type type = typeToken.getType();
        for (TypeToken<?> value = typeToken; rawType != Object.class; rawType = value.getRawType()) {
            for (final Field field : rawType.getDeclaredFields()) {
                boolean excludeField = this.excludeField(field, true);
                final boolean excludeField2 = this.excludeField(field, false);
                if (excludeField || excludeField2) {
                    this.accessor.makeAccessible(field);
                    final Type resolve = $Gson$Types.resolve(value.getType(), rawType, field.getGenericType());
                    final List<String> fieldNames = this.getFieldNames(field);
                    final int size = fieldNames.size();
                    BoundField boundField = null;
                    for (int j = 0; j < size; ++j) {
                        final String s = fieldNames.get(j);
                        if (j != 0) {
                            excludeField = false;
                        }
                        final BoundField boundField2 = linkedHashMap.put(s, this.createBoundField(gson, field, s, TypeToken.get(resolve), excludeField, excludeField2));
                        if (boundField == null) {
                            boundField = boundField2;
                        }
                    }
                    if (boundField != null) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append(type);
                        sb.append(" declares multiple JSON fields named ");
                        sb.append(boundField.name);
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
            }
            value = TypeToken.get($Gson$Types.resolve(value.getType(), rawType, rawType.getGenericSuperclass()));
        }
        return linkedHashMap;
    }
    
    private List<String> getFieldNames(final Field field) {
        final SerializedName serializedName = field.getAnnotation(SerializedName.class);
        if (serializedName == null) {
            return Collections.singletonList(this.fieldNamingPolicy.translateName(field));
        }
        final String value = serializedName.value();
        final String[] alternate = serializedName.alternate();
        if (alternate.length == 0) {
            return Collections.singletonList(value);
        }
        final ArrayList list = new ArrayList<String>(alternate.length + 1);
        list.add(value);
        for (int length = alternate.length, i = 0; i < length; ++i) {
            list.add(alternate[i]);
        }
        return (List<String>)list;
    }
    
    @Override
    public <T> TypeAdapter<T> create(final Gson gson, final TypeToken<T> typeToken) {
        final Class<? super T> rawType = typeToken.getRawType();
        if (!Object.class.isAssignableFrom(rawType)) {
            return null;
        }
        return new Adapter<T>((ObjectConstructor<Object>)this.constructorConstructor.get(typeToken), this.getBoundFields(gson, typeToken, rawType));
    }
    
    public boolean excludeField(final Field field, final boolean b) {
        return excludeField(field, b, this.excluder);
    }
    
    public static final class Adapter<T> extends TypeAdapter<T>
    {
        private final Map<String, BoundField> boundFields;
        private final ObjectConstructor<T> constructor;
        
        Adapter(final ObjectConstructor<T> constructor, final Map<String, BoundField> boundFields) {
            this.constructor = constructor;
            this.boundFields = boundFields;
        }
        
        @Override
        public T read(final JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            final T construct = this.constructor.construct();
            try {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    final BoundField boundField = this.boundFields.get(jsonReader.nextName());
                    if (boundField != null && boundField.deserialized) {
                        boundField.read(jsonReader, construct);
                    }
                    else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                return construct;
            }
            catch (IllegalAccessException detailMessage) {
                throw new AssertionError((Object)detailMessage);
            }
            catch (IllegalStateException ex) {
                throw new JsonSyntaxException(ex);
            }
        }
        
        @Override
        public void write(final JsonWriter jsonWriter, final T t) throws IOException {
            if (t == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            try {
                for (final BoundField boundField : this.boundFields.values()) {
                    if (boundField.writeField(t)) {
                        jsonWriter.name(boundField.name);
                        boundField.write(jsonWriter, t);
                    }
                }
                jsonWriter.endObject();
            }
            catch (IllegalAccessException detailMessage) {
                throw new AssertionError((Object)detailMessage);
            }
        }
    }
    
    abstract static class BoundField
    {
        final boolean deserialized;
        final String name;
        final boolean serialized;
        
        protected BoundField(final String name, final boolean serialized, final boolean deserialized) {
            this.name = name;
            this.serialized = serialized;
            this.deserialized = deserialized;
        }
        
        abstract void read(final JsonReader p0, final Object p1) throws IOException, IllegalAccessException;
        
        abstract void write(final JsonWriter p0, final Object p1) throws IOException, IllegalAccessException;
        
        abstract boolean writeField(final Object p0) throws IOException, IllegalAccessException;
    }
}
