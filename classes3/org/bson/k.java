// 
// Decompiled by Procyon v0.5.36
// 

package org.bson;

import org.bson.io.c;
import java.nio.ByteBuffer;
import java.io.IOException;
import org.bson.io.b;
import java.io.InputStream;

public class k implements f
{
    private byte[] e(final InputStream inputStream) throws IOException {
        final byte[] array = new byte[4];
        b.a(inputStream, array);
        final int f = b.f(array);
        final byte[] array2 = new byte[f];
        System.arraycopy(array, 0, array2, 0, 4);
        b.c(inputStream, array2, 4, f - 4);
        return array2;
    }
    
    @Override
    public i a(final InputStream inputStream) throws IOException {
        return this.b(this.e(inputStream));
    }
    
    @Override
    public i b(final byte[] array) {
        final j j = new j();
        this.d(array, j);
        return (i)j.get();
    }
    
    @Override
    public int c(final InputStream inputStream, final d d) throws IOException {
        return this.d(this.e(inputStream), d);
    }
    
    @Override
    public int d(byte[] array, final d d) {
        array = (byte[])(Object)new p(new org.bson.io.f(new c1(ByteBuffer.wrap(array))));
        try {
            new e(new a1(), d).G0((p0)(Object)array);
            return ((p)(Object)array).s0().getPosition();
        }
        finally {
            ((p)(Object)array).close();
        }
    }
}
