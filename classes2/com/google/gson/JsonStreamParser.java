// 
// Decompiled by Procyon v0.5.36
// 

package com.google.gson;

import java.util.NoSuchElementException;
import java.io.EOFException;
import com.google.gson.internal.Streams;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import com.google.gson.stream.JsonToken;
import java.io.StringReader;
import java.io.Reader;
import com.google.gson.stream.JsonReader;
import java.util.Iterator;

public final class JsonStreamParser implements Iterator<JsonElement>
{
    private final Object lock;
    private final JsonReader parser;
    
    public JsonStreamParser(final Reader reader) {
        (this.parser = new JsonReader(reader)).setLenient(true);
        this.lock = new Object();
    }
    
    public JsonStreamParser(final String s) {
        this(new StringReader(s));
    }
    
    @Override
    public boolean hasNext() {
        final Object lock = this.lock;
        // monitorenter(lock)
        try {
            try {
                // monitorexit(lock)
                return this.parser.peek() != JsonToken.END_DOCUMENT;
            }
            finally {
            }
            // monitorexit(lock)
        }
        catch (IOException ex) {}
        catch (MalformedJsonException ex2) {}
    }
    
    @Override
    public JsonElement next() throws JsonParseException {
        if (this.hasNext()) {
            try {
                return Streams.parse(this.parser);
            }
            catch (JsonParseException ex2) {
                RuntimeException ex = ex2;
                if (ex2.getCause() instanceof EOFException) {
                    ex = new NoSuchElementException();
                }
                throw ex;
            }
            catch (OutOfMemoryError outOfMemoryError) {
                throw new JsonParseException("Failed parsing JSON source to Json", outOfMemoryError);
            }
            catch (StackOverflowError stackOverflowError) {
                throw new JsonParseException("Failed parsing JSON source to Json", stackOverflowError);
            }
        }
        throw new NoSuchElementException();
    }
    
    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
