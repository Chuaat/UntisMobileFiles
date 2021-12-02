// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.io;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

@Deprecated
public class b
{
    public static void a(final InputStream inputStream, final byte[] array) throws IOException {
        b(inputStream, array, array.length);
    }
    
    public static void b(final InputStream inputStream, final byte[] array, final int n) throws IOException {
        c(inputStream, array, 0, n);
    }
    
    public static void c(final InputStream inputStream, final byte[] b, int off, int i) throws IOException {
        if (b.length >= i + off) {
            while (i > 0) {
                final int read = inputStream.read(b, off, i);
                if (read < 0) {
                    throw new EOFException();
                }
                i -= read;
                off += read;
            }
            return;
        }
        throw new IllegalArgumentException("Buffer is too small");
    }
    
    public static int d(final InputStream inputStream) throws IOException {
        return e(inputStream, new byte[4]);
    }
    
    public static int e(final InputStream inputStream, final byte[] array) throws IOException {
        b(inputStream, array, 4);
        return f(array);
    }
    
    public static int f(final byte[] array) {
        return g(array, 0);
    }
    
    public static int g(final byte[] array, final int n) {
        return (array[n + 3] & 0xFF) << 24 | ((array[n + 0] & 0xFF) << 0 | 0x0 | (array[n + 1] & 0xFF) << 8 | (array[n + 2] & 0xFF) << 16);
    }
    
    public static int h(final byte[] array, final int n) {
        return (array[n + 3] & 0xFF) << 0 | ((array[n + 0] & 0xFF) << 24 | 0x0 | (array[n + 1] & 0xFF) << 16 | (array[n + 2] & 0xFF) << 8);
    }
    
    public static long i(final InputStream inputStream) throws IOException {
        return j(inputStream, new byte[8]);
    }
    
    public static long j(final InputStream inputStream, final byte[] array) throws IOException {
        b(inputStream, array, 8);
        return k(array);
    }
    
    public static long k(final byte[] array) {
        return l(array, 0);
    }
    
    public static long l(final byte[] array, final int n) {
        return ((long)array[n + 7] & 0xFFL) << 56 | (((long)array[n + 0] & 0xFFL) << 0 | 0x0L | ((long)array[n + 1] & 0xFFL) << 8 | ((long)array[n + 2] & 0xFFL) << 16 | ((long)array[n + 3] & 0xFFL) << 24 | ((long)array[n + 4] & 0xFFL) << 32 | ((long)array[n + 5] & 0xFFL) << 40 | ((long)array[n + 6] & 0xFFL) << 48);
    }
}
