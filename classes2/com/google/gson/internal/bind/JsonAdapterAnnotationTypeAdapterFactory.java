// 
// Decompiled by Procyon v0.5.36
// 

package com.google.gson.internal.bind;

import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializer;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.TypeAdapterFactory;

public final class JsonAdapterAnnotationTypeAdapterFactory implements TypeAdapterFactory
{
    private final ConstructorConstructor constructorConstructor;
    
    public JsonAdapterAnnotationTypeAdapterFactory(final ConstructorConstructor constructorConstructor) {
        this.constructorConstructor = constructorConstructor;
    }
    
    @Override
    public <T> TypeAdapter<T> create(final Gson gson, final TypeToken<T> typeToken) {
        final JsonAdapter jsonAdapter = typeToken.getRawType().getAnnotation(JsonAdapter.class);
        if (jsonAdapter == null) {
            return null;
        }
        return (TypeAdapter<T>)this.getTypeAdapter(this.constructorConstructor, gson, typeToken, jsonAdapter);
    }
    
    TypeAdapter<?> getTypeAdapter(final ConstructorConstructor constructorConstructor, final Gson gson, final TypeToken<?> typeToken, final JsonAdapter jsonAdapter) {
        final TypeAdapter<?> construct = constructorConstructor.get((TypeToken<TypeAdapter<?>>)TypeToken.get(jsonAdapter.value())).construct();
        TypeAdapter<?> create;
        if (construct instanceof TypeAdapter) {
            create = construct;
        }
        else if (construct instanceof TypeAdapterFactory) {
            create = ((TypeAdapterFactory)construct).create(gson, typeToken);
        }
        else {
            final boolean b = construct instanceof JsonSerializer;
            if (!b && !(construct instanceof JsonDeserializer)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Invalid attempt to bind an instance of ");
                sb.append(construct.getClass().getName());
                sb.append(" as a @JsonAdapter for ");
                sb.append(typeToken.toString());
                sb.append(". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
                throw new IllegalArgumentException(sb.toString());
            }
            JsonDeserializer<Object> jsonDeserializer = null;
            JsonSerializer<Object> jsonSerializer;
            if (b) {
                jsonSerializer = (JsonSerializer<Object>)construct;
            }
            else {
                jsonSerializer = null;
            }
            if (construct instanceof JsonDeserializer) {
                jsonDeserializer = (JsonDeserializer<Object>)construct;
            }
            create = new TreeTypeAdapter<Object>(jsonSerializer, jsonDeserializer, gson, (TypeToken<Object>)typeToken, null);
        }
        TypeAdapter<?> nullSafe = create;
        if (create != null) {
            nullSafe = create;
            if (jsonAdapter.nullSafe()) {
                nullSafe = create.nullSafe();
            }
        }
        return nullSafe;
    }
}
