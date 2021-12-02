// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.firebase_messaging;

import java.io.IOException;
import java.util.Queue;
import java.util.ArrayDeque;
import java.io.InputStream;
import java.io.OutputStream;

public final class r
{
    private static final OutputStream a;
    
    static {
        a = new p();
    }
    
    public static byte[] a(final InputStream inputStream) throws IOException {
        final ArrayDeque<byte[]> arrayDeque = new ArrayDeque<byte[]>(20);
        int a = 8192;
        int i = 0;
        while (i < 2147483639) {
            final int min = Math.min(a, 2147483639 - i);
            final byte[] b = new byte[min];
            arrayDeque.add(b);
            int read;
            for (int j = 0; j < min; j += read, i += read) {
                read = inputStream.read(b, j, min - j);
                if (read == -1) {
                    return c(arrayDeque, i);
                }
            }
            final long n = a;
            final long n2 = n + n;
            if (n2 > 2147483647L) {
                a = Integer.MAX_VALUE;
                continue;
            }
            if (n2 < -2147483648L) {
                a = Integer.MIN_VALUE;
                continue;
            }
            a = (int)n2;
        }
        if (inputStream.read() == -1) {
            return c(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }
    
    public static InputStream b(final InputStream inputStream, final long n) {
        return new q(inputStream, 1048577L);
    }
    
    private static byte[] c(final Queue<byte[]> queue, final int n) {
        final byte[] array = new byte[n];
        int min;
        for (int i = n; i > 0; i -= min) {
            final byte[] array2 = queue.remove();
            min = Math.min(i, array2.length);
            System.arraycopy(array2, 0, array, n - i, min);
        }
        return array;
    }
}
