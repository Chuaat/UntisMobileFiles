// 
// Decompiled by Procyon v0.5.36
// 

package com.google.gson;

public enum LongSerializationPolicy
{
    DEFAULT(0) {
        @Override
        public JsonElement serialize(final Long n) {
            return new JsonPrimitive(n);
        }
    }, 
    STRING(1) {
        @Override
        public JsonElement serialize(final Long obj) {
            return new JsonPrimitive(String.valueOf(obj));
        }
    };
    
    public abstract JsonElement serialize(final Long p0);
}
