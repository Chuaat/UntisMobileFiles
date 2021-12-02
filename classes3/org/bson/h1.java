// 
// Decompiled by Procyon v0.5.36
// 

package org.bson;

import java.io.ByteArrayInputStream;
import java.util.Arrays;
import org.bson.io.b;
import java.io.IOException;
import java.io.InputStream;

public class h1 implements f
{
    private static final int a = 4;
    
    @Override
    public i a(final InputStream inputStream) throws IOException {
        final g1 g1 = new g1();
        this.c(inputStream, g1);
        return (i)g1.get();
    }
    
    @Override
    public i b(final byte[] array) {
        final g1 g1 = new g1();
        this.d(array, g1);
        return (i)g1.get();
    }
    
    @Override
    public int c(final InputStream inputStream, final d d) throws IOException {
        final byte[] original = new byte[4];
        final int e = b.e(inputStream, original);
        final byte[] copy = Arrays.copyOf(original, e);
        b.c(inputStream, copy, 4, e - 4);
        d.v(null, (byte)0, copy);
        return e;
    }
    
    @Override
    public int d(final byte[] buf, final d d) {
        try {
            return this.c(new ByteArrayInputStream(buf), d);
        }
        catch (IOException ex) {
            throw new h("Invalid bytes received", ex);
        }
    }
}
