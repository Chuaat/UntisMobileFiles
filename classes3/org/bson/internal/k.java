// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.internal;

import org.bson.s0;
import org.bson.h;
import org.bson.q;
import java.util.UUID;
import org.bson.q1;

public final class k
{
    private k() {
    }
    
    public static UUID a(final byte[] array, final byte b, final q1 obj) {
        if (array.length == 16) {
            if (b == q.K.b()) {
                final int n = k$a.a[obj.ordinal()];
                if (n != 1) {
                    if (n != 2) {
                        if (n != 3) {
                            if (n != 4) {
                                final StringBuilder sb = new StringBuilder();
                                sb.append("Unexpected UUID representation: ");
                                sb.append(obj);
                                throw new h(sb.toString());
                            }
                            throw new h("Can not decode a subtype 3 (UUID legacy) BSON binary when the decoder is configured to use the standard UUID representation");
                        }
                    }
                    else {
                        d(array, 0, 8);
                        d(array, 8, 8);
                    }
                }
                else {
                    d(array, 0, 4);
                    d(array, 4, 2);
                    d(array, 6, 2);
                }
            }
            return new UUID(c(array, 0), c(array, 8));
        }
        throw new s0(String.format("Expected length to be 16, not %d.", array.length));
    }
    
    public static byte[] b(final UUID uuid, final q1 obj) {
        final byte[] array = new byte[16];
        e(array, 0, uuid.getMostSignificantBits());
        e(array, 8, uuid.getLeastSignificantBits());
        final int n = k$a.a[obj.ordinal()];
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    if (n != 4) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Unexpected UUID representation: ");
                        sb.append(obj);
                        throw new h(sb.toString());
                    }
                }
            }
            else {
                d(array, 0, 8);
                d(array, 8, 8);
            }
        }
        else {
            d(array, 0, 4);
            d(array, 4, 2);
            d(array, 6, 2);
        }
        return array;
    }
    
    private static long c(final byte[] array, final int n) {
        return ((long)array[n] & 0xFFL) << 56 | (((long)array[n + 7] & 0xFFL) | 0x0L | ((long)array[n + 6] & 0xFFL) << 8 | ((long)array[n + 5] & 0xFFL) << 16 | ((long)array[n + 4] & 0xFFL) << 24 | ((long)array[n + 3] & 0xFFL) << 32 | ((long)array[n + 2] & 0xFFL) << 40 | ((long)array[n + 1] & 0xFFL) << 48);
    }
    
    private static void d(final byte[] array, int i, int n) {
        byte b;
        for (n = n + i - 1; i < n; ++i, --n) {
            b = array[i];
            array[i] = array[n];
            array[n] = b;
        }
    }
    
    private static void e(final byte[] array, final int n, final long n2) {
        array[n + 7] = (byte)(n2 & 0xFFL);
        array[n + 6] = (byte)(n2 >> 8 & 0xFFL);
        array[n + 5] = (byte)(n2 >> 16 & 0xFFL);
        array[n + 4] = (byte)(n2 >> 24 & 0xFFL);
        array[n + 3] = (byte)(n2 >> 32 & 0xFFL);
        array[n + 2] = (byte)(n2 >> 40 & 0xFFL);
        array[n + 1] = (byte)(n2 >> 48 & 0xFFL);
        array[n] = (byte)(n2 >> 56 & 0xFFL);
    }
}
