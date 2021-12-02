// 
// Decompiled by Procyon v0.5.36
// 

package com.google.gson.internal;

import java.io.Writer;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonParseException;
import com.google.gson.JsonNull;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import java.io.EOFException;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.JsonElement;
import com.google.gson.stream.JsonReader;

public final class Streams
{
    private Streams() {
        throw new UnsupportedOperationException();
    }
    
    public static JsonElement parse(final JsonReader jsonReader) throws JsonParseException {
        boolean b;
        try {
            try {
                jsonReader.peek();
                b = false;
                try {
                    return TypeAdapters.JSON_ELEMENT.read(jsonReader);
                }
                catch (EOFException ex4) {}
            }
            catch (NumberFormatException ex) {
                throw new JsonSyntaxException(ex);
            }
            catch (IOException ex2) {
                throw new JsonIOException(ex2);
            }
            catch (MalformedJsonException ex3) {
                throw new JsonSyntaxException(ex3);
            }
        }
        catch (EOFException ex4) {
            b = true;
        }
        if (b) {
            return JsonNull.INSTANCE;
        }
        final EOFException ex4;
        throw new JsonSyntaxException(ex4);
    }
    
    public static void write(final JsonElement jsonElement, final JsonWriter jsonWriter) throws IOException {
        TypeAdapters.JSON_ELEMENT.write(jsonWriter, jsonElement);
    }
    
    public static Writer writerForAppendable(final Appendable appendable) {
        Writer writer;
        if (appendable instanceof Writer) {
            writer = (Writer)appendable;
        }
        else {
            writer = new AppendableWriter(appendable);
        }
        return writer;
    }
    
    private static final class AppendableWriter extends Writer
    {
        private final Appendable appendable;
        private final CurrentWrite currentWrite;
        
        AppendableWriter(final Appendable appendable) {
            this.currentWrite = new CurrentWrite();
            this.appendable = appendable;
        }
        
        @Override
        public void close() {
        }
        
        @Override
        public void flush() {
        }
        
        @Override
        public void write(final int n) throws IOException {
            this.appendable.append((char)n);
        }
        
        @Override
        public void write(final char[] chars, final int n, final int n2) throws IOException {
            final CurrentWrite currentWrite = this.currentWrite;
            currentWrite.chars = chars;
            this.appendable.append(currentWrite, n, n2 + n);
        }
        
        static class CurrentWrite implements CharSequence
        {
            char[] chars;
            
            @Override
            public char charAt(final int n) {
                return this.chars[n];
            }
            
            @Override
            public int length() {
                return this.chars.length;
            }
            
            @Override
            public CharSequence subSequence(final int offset, final int n) {
                return new String(this.chars, offset, n - offset);
            }
        }
    }
}
