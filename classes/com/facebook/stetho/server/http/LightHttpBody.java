// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.server.http;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

public abstract class LightHttpBody
{
    public static LightHttpBody create(final String s, final String s2) {
        try {
            return create(s.getBytes("UTF-8"), s2);
        }
        catch (UnsupportedEncodingException cause) {
            throw new RuntimeException(cause);
        }
    }
    
    public static LightHttpBody create(final byte[] array, final String s) {
        return new LightHttpBody() {
            @Override
            public int contentLength() {
                return array.length;
            }
            
            @Override
            public String contentType() {
                return s;
            }
            
            @Override
            public void writeTo(final OutputStream outputStream) throws IOException {
                outputStream.write(array);
            }
        };
    }
    
    public abstract int contentLength();
    
    public abstract String contentType();
    
    public abstract void writeTo(final OutputStream p0) throws IOException;
}
