// 
// Decompiled by Procyon v0.5.36
// 

package com.google.gson.internal.bind;

import com.google.gson.JsonNull;
import java.util.Map;
import com.google.gson.JsonPrimitive;
import java.util.Iterator;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import java.util.Arrays;
import com.google.gson.stream.JsonToken;
import com.google.gson.JsonElement;
import java.io.IOException;
import java.io.Reader;
import com.google.gson.stream.JsonReader;

public final class JsonTreeReader extends JsonReader
{
    private static final Object SENTINEL_CLOSED;
    private static final Reader UNREADABLE_READER;
    private int[] pathIndices;
    private String[] pathNames;
    private Object[] stack;
    private int stackSize;
    
    static {
        UNREADABLE_READER = new Reader() {
            @Override
            public void close() throws IOException {
                throw new AssertionError();
            }
            
            @Override
            public int read(final char[] array, final int n, final int n2) throws IOException {
                throw new AssertionError();
            }
        };
        SENTINEL_CLOSED = new Object();
    }
    
    public JsonTreeReader(final JsonElement jsonElement) {
        super(JsonTreeReader.UNREADABLE_READER);
        this.stack = new Object[32];
        this.stackSize = 0;
        this.pathNames = new String[32];
        this.pathIndices = new int[32];
        this.push(jsonElement);
    }
    
    private void expect(final JsonToken obj) throws IOException {
        if (this.peek() == obj) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Expected ");
        sb.append(obj);
        sb.append(" but was ");
        sb.append(this.peek());
        sb.append(this.locationString());
        throw new IllegalStateException(sb.toString());
    }
    
    private String locationString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(" at path ");
        sb.append(this.getPath());
        return sb.toString();
    }
    
    private Object peekStack() {
        return this.stack[this.stackSize - 1];
    }
    
    private Object popStack() {
        final Object[] stack = this.stack;
        final int stackSize = this.stackSize - 1;
        this.stackSize = stackSize;
        final Object o = stack[stackSize];
        stack[stackSize] = null;
        return o;
    }
    
    private void push(final Object o) {
        final int stackSize = this.stackSize;
        final Object[] stack = this.stack;
        if (stackSize == stack.length) {
            final int newLength = stackSize * 2;
            this.stack = Arrays.copyOf(stack, newLength);
            this.pathIndices = Arrays.copyOf(this.pathIndices, newLength);
            this.pathNames = Arrays.copyOf(this.pathNames, newLength);
        }
        this.stack[this.stackSize++] = o;
    }
    
    @Override
    public void beginArray() throws IOException {
        this.expect(JsonToken.BEGIN_ARRAY);
        this.push(((JsonArray)this.peekStack()).iterator());
        this.pathIndices[this.stackSize - 1] = 0;
    }
    
    @Override
    public void beginObject() throws IOException {
        this.expect(JsonToken.BEGIN_OBJECT);
        this.push(((JsonObject)this.peekStack()).entrySet().iterator());
    }
    
    @Override
    public void close() throws IOException {
        this.stack = new Object[] { JsonTreeReader.SENTINEL_CLOSED };
        this.stackSize = 1;
    }
    
    @Override
    public void endArray() throws IOException {
        this.expect(JsonToken.END_ARRAY);
        this.popStack();
        this.popStack();
        int stackSize = this.stackSize;
        if (stackSize > 0) {
            final int[] pathIndices = this.pathIndices;
            --stackSize;
            ++pathIndices[stackSize];
        }
    }
    
    @Override
    public void endObject() throws IOException {
        this.expect(JsonToken.END_OBJECT);
        this.popStack();
        this.popStack();
        int stackSize = this.stackSize;
        if (stackSize > 0) {
            final int[] pathIndices = this.pathIndices;
            --stackSize;
            ++pathIndices[stackSize];
        }
    }
    
    @Override
    public String getPath() {
        final StringBuilder sb = new StringBuilder();
        sb.append('$');
        int n;
        for (int i = 0; i < this.stackSize; i = n + 1) {
            final Object[] stack = this.stack;
            if (stack[i] instanceof JsonArray) {
                n = ++i;
                if (stack[i] instanceof Iterator) {
                    sb.append('[');
                    sb.append(this.pathIndices[i]);
                    sb.append(']');
                    n = i;
                }
            }
            else {
                n = i;
                if (stack[i] instanceof JsonObject) {
                    n = ++i;
                    if (stack[i] instanceof Iterator) {
                        sb.append('.');
                        final String[] pathNames = this.pathNames;
                        n = i;
                        if (pathNames[i] != null) {
                            sb.append(pathNames[i]);
                            n = i;
                        }
                    }
                }
            }
        }
        return sb.toString();
    }
    
    @Override
    public boolean hasNext() throws IOException {
        final JsonToken peek = this.peek();
        return peek != JsonToken.END_OBJECT && peek != JsonToken.END_ARRAY;
    }
    
    @Override
    public boolean nextBoolean() throws IOException {
        this.expect(JsonToken.BOOLEAN);
        final boolean asBoolean = ((JsonPrimitive)this.popStack()).getAsBoolean();
        int stackSize = this.stackSize;
        if (stackSize > 0) {
            final int[] pathIndices = this.pathIndices;
            --stackSize;
            ++pathIndices[stackSize];
        }
        return asBoolean;
    }
    
    @Override
    public double nextDouble() throws IOException {
        final JsonToken peek = this.peek();
        final JsonToken number = JsonToken.NUMBER;
        if (peek != number && peek != JsonToken.STRING) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Expected ");
            sb.append(number);
            sb.append(" but was ");
            sb.append(peek);
            sb.append(this.locationString());
            throw new IllegalStateException(sb.toString());
        }
        final double asDouble = ((JsonPrimitive)this.peekStack()).getAsDouble();
        if (!this.isLenient() && (Double.isNaN(asDouble) || Double.isInfinite(asDouble))) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("JSON forbids NaN and infinities: ");
            sb2.append(asDouble);
            throw new NumberFormatException(sb2.toString());
        }
        this.popStack();
        int stackSize = this.stackSize;
        if (stackSize > 0) {
            final int[] pathIndices = this.pathIndices;
            --stackSize;
            ++pathIndices[stackSize];
        }
        return asDouble;
    }
    
    @Override
    public int nextInt() throws IOException {
        final JsonToken peek = this.peek();
        final JsonToken number = JsonToken.NUMBER;
        if (peek != number && peek != JsonToken.STRING) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Expected ");
            sb.append(number);
            sb.append(" but was ");
            sb.append(peek);
            sb.append(this.locationString());
            throw new IllegalStateException(sb.toString());
        }
        final int asInt = ((JsonPrimitive)this.peekStack()).getAsInt();
        this.popStack();
        int stackSize = this.stackSize;
        if (stackSize > 0) {
            final int[] pathIndices = this.pathIndices;
            --stackSize;
            ++pathIndices[stackSize];
        }
        return asInt;
    }
    
    @Override
    public long nextLong() throws IOException {
        final JsonToken peek = this.peek();
        final JsonToken number = JsonToken.NUMBER;
        if (peek != number && peek != JsonToken.STRING) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Expected ");
            sb.append(number);
            sb.append(" but was ");
            sb.append(peek);
            sb.append(this.locationString());
            throw new IllegalStateException(sb.toString());
        }
        final long asLong = ((JsonPrimitive)this.peekStack()).getAsLong();
        this.popStack();
        int stackSize = this.stackSize;
        if (stackSize > 0) {
            final int[] pathIndices = this.pathIndices;
            --stackSize;
            ++pathIndices[stackSize];
        }
        return asLong;
    }
    
    @Override
    public String nextName() throws IOException {
        this.expect(JsonToken.NAME);
        final Map.Entry<String, V> entry = ((Iterator)this.peekStack()).next();
        final String s = entry.getKey();
        this.pathNames[this.stackSize - 1] = s;
        this.push(entry.getValue());
        return s;
    }
    
    @Override
    public void nextNull() throws IOException {
        this.expect(JsonToken.NULL);
        this.popStack();
        int stackSize = this.stackSize;
        if (stackSize > 0) {
            final int[] pathIndices = this.pathIndices;
            --stackSize;
            ++pathIndices[stackSize];
        }
    }
    
    @Override
    public String nextString() throws IOException {
        final JsonToken peek = this.peek();
        final JsonToken string = JsonToken.STRING;
        if (peek != string && peek != JsonToken.NUMBER) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Expected ");
            sb.append(string);
            sb.append(" but was ");
            sb.append(peek);
            sb.append(this.locationString());
            throw new IllegalStateException(sb.toString());
        }
        final String asString = ((JsonPrimitive)this.popStack()).getAsString();
        int stackSize = this.stackSize;
        if (stackSize > 0) {
            final int[] pathIndices = this.pathIndices;
            --stackSize;
            ++pathIndices[stackSize];
        }
        return asString;
    }
    
    @Override
    public JsonToken peek() throws IOException {
        if (this.stackSize == 0) {
            return JsonToken.END_DOCUMENT;
        }
        final Object peekStack = this.peekStack();
        if (peekStack instanceof Iterator) {
            final boolean b = this.stack[this.stackSize - 2] instanceof JsonObject;
            final Iterator<Object> iterator = (Iterator<Object>)peekStack;
            if (!iterator.hasNext()) {
                JsonToken jsonToken;
                if (b) {
                    jsonToken = JsonToken.END_OBJECT;
                }
                else {
                    jsonToken = JsonToken.END_ARRAY;
                }
                return jsonToken;
            }
            if (b) {
                return JsonToken.NAME;
            }
            this.push(iterator.next());
            return this.peek();
        }
        else {
            if (peekStack instanceof JsonObject) {
                return JsonToken.BEGIN_OBJECT;
            }
            if (peekStack instanceof JsonArray) {
                return JsonToken.BEGIN_ARRAY;
            }
            if (peekStack instanceof JsonPrimitive) {
                final JsonPrimitive jsonPrimitive = (JsonPrimitive)peekStack;
                if (jsonPrimitive.isString()) {
                    return JsonToken.STRING;
                }
                if (jsonPrimitive.isBoolean()) {
                    return JsonToken.BOOLEAN;
                }
                if (jsonPrimitive.isNumber()) {
                    return JsonToken.NUMBER;
                }
                throw new AssertionError();
            }
            else {
                if (peekStack instanceof JsonNull) {
                    return JsonToken.NULL;
                }
                if (peekStack == JsonTreeReader.SENTINEL_CLOSED) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new AssertionError();
            }
        }
    }
    
    public void promoteNameToValue() throws IOException {
        this.expect(JsonToken.NAME);
        final Map.Entry<K, Object> entry = ((Iterator)this.peekStack()).next();
        this.push(entry.getValue());
        this.push(new JsonPrimitive((String)entry.getKey()));
    }
    
    @Override
    public void skipValue() throws IOException {
        if (this.peek() == JsonToken.NAME) {
            this.nextName();
            this.pathNames[this.stackSize - 2] = "null";
        }
        else {
            this.popStack();
            final int stackSize = this.stackSize;
            if (stackSize > 0) {
                this.pathNames[stackSize - 1] = "null";
            }
        }
        int stackSize2 = this.stackSize;
        if (stackSize2 > 0) {
            final int[] pathIndices = this.pathIndices;
            --stackSize2;
            ++pathIndices[stackSize2];
        }
    }
    
    @Override
    public String toString() {
        return JsonTreeReader.class.getSimpleName();
    }
}
