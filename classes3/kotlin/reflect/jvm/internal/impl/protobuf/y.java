// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.protobuf;

final class y
{
    private static int a(final int n) {
        int n2 = n;
        if (n > -12) {
            n2 = -1;
        }
        return n2;
    }
    
    private static int b(int n, final int n2) {
        if (n <= -12 && n2 <= -65) {
            n ^= n2 << 8;
        }
        else {
            n = -1;
        }
        return n;
    }
    
    private static int c(int n, final int n2, final int n3) {
        if (n <= -12 && n2 <= -65 && n3 <= -65) {
            n = (n ^ n2 << 8 ^ n3 << 16);
        }
        else {
            n = -1;
        }
        return n;
    }
    
    private static int d(final byte[] array, final int n, int n2) {
        final byte b = array[n - 1];
        n2 -= n;
        if (n2 == 0) {
            return a(b);
        }
        if (n2 == 1) {
            return b(b, array[n]);
        }
        if (n2 == 2) {
            return c(b, array[n], array[n + 1]);
        }
        throw new AssertionError();
    }
    
    public static boolean e(final byte[] array) {
        return f(array, 0, array.length);
    }
    
    public static boolean f(final byte[] array, final int n, final int n2) {
        return h(array, n, n2) == 0;
    }
    
    public static int g(int n, final byte[] array, int n2, final int n3) {
        int n4 = n2;
        if (n != 0) {
            if (n2 >= n3) {
                return n;
            }
            final byte b = (byte)n;
            Label_0047: {
                if (b < -32) {
                    if (b >= -62) {
                        n = n2 + 1;
                        if (array[n2] <= -65) {
                            break Label_0047;
                        }
                    }
                    return -1;
                }
                if (b < -16) {
                    final byte b2 = (byte)(n = (byte)~(n >> 8));
                    int n5 = n2;
                    if (b2 == 0) {
                        n5 = n2 + 1;
                        n = array[n2];
                        if (n5 >= n3) {
                            return b(b, n);
                        }
                    }
                    if (n <= -65 && (b != -32 || n >= -96) && (b != -19 || n < -96)) {
                        n = n5 + 1;
                        if (array[n5] <= -65) {
                            break Label_0047;
                        }
                    }
                    return -1;
                }
                byte b3 = (byte)~(n >> 8);
                final int n6 = 0;
                if (b3 == 0) {
                    n = n2 + 1;
                    b3 = array[n2];
                    if (n >= n3) {
                        return b(b, b3);
                    }
                    n2 = n;
                    n = n6;
                }
                else {
                    n = (byte)(n >> 16);
                }
                int n7 = n;
                int n8 = n2;
                if (n == 0) {
                    n8 = n2 + 1;
                    n7 = array[n2];
                    if (n8 >= n3) {
                        return c(b, b3, n7);
                    }
                }
                if (b3 <= -65 && (b << 28) + (b3 + 112) >> 30 == 0 && n7 <= -65) {
                    n = n8 + 1;
                    if (array[n8] <= -65) {
                        break Label_0047;
                    }
                }
                return -1;
            }
            n4 = n;
        }
        return h(array, n4, n3);
    }
    
    public static int h(final byte[] array, int i, final int n) {
        while (i < n && array[i] >= 0) {
            ++i;
        }
        if (i >= n) {
            i = 0;
        }
        else {
            i = i(array, i, n);
        }
        return i;
    }
    
    private static int i(final byte[] array, int i, final int n) {
        while (i < n) {
            final int n2 = i + 1;
            final byte b = array[i];
            i = n2;
            if (b < 0) {
                if (b < -32) {
                    if (n2 >= n) {
                        return b;
                    }
                    if (b >= -62) {
                        i = n2 + 1;
                        if (array[n2] <= -65) {
                            continue;
                        }
                    }
                    return -1;
                }
                else if (b < -16) {
                    if (n2 >= n - 1) {
                        return d(array, n2, n);
                    }
                    final int n3 = n2 + 1;
                    i = array[n2];
                    if (i <= -65 && (b != -32 || i >= -96) && (b != -19 || i < -96)) {
                        i = n3 + 1;
                        if (array[n3] <= -65) {
                            continue;
                        }
                    }
                    return -1;
                }
                else {
                    if (n2 >= n - 2) {
                        return d(array, n2, n);
                    }
                    i = n2 + 1;
                    final byte b2 = array[n2];
                    if (b2 <= -65 && (b << 28) + (b2 + 112) >> 30 == 0) {
                        final int n4 = i + 1;
                        if (array[i] <= -65) {
                            i = n4 + 1;
                            if (array[n4] <= -65) {
                                continue;
                            }
                        }
                    }
                    return -1;
                }
            }
        }
        return 0;
    }
}
