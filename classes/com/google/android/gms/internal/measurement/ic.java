// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

final class ic extends hc
{
    @Override
    final int a(int i, final byte[] array, int n, final int n2) {
        while (n < n2 && array[n] >= 0) {
            ++n;
        }
        final int n3 = 0;
        if ((i = n) >= n2) {
            i = n3;
        }
        else {
            while (i < n2) {
                final int n4 = i + 1;
                n = array[i];
                i = n4;
                if (n < 0) {
                    if (n >= -32) {
                        if (n < -16) {
                            if (n4 < n2 - 1) {
                                final int n5 = n4 + 1;
                                i = array[n4];
                                if (i > -65 || (n == -32 && i < -96) || (n == -19 && i >= -96)) {
                                    return -1;
                                }
                                i = n5 + 1;
                                if (array[n5] > -65) {
                                    return -1;
                                }
                                continue;
                            }
                        }
                        else if (n4 < n2 - 2) {
                            i = n4 + 1;
                            final byte b = array[n4];
                            if (b > -65 || (n << 28) + (b + 112) >> 30 != 0) {
                                return -1;
                            }
                            n = i + 1;
                            if (array[i] > -65) {
                                return -1;
                            }
                            i = n + 1;
                            if (array[n] > -65) {
                                return -1;
                            }
                            continue;
                        }
                        i = kc.a(array, n4, n2);
                        return i;
                    }
                    if (n4 >= n2) {
                        i = n;
                        return i;
                    }
                    if (n >= -62) {
                        i = n4 + 1;
                        if (array[n4] <= -65) {
                            continue;
                        }
                    }
                    i = -1;
                    return i;
                }
            }
            i = n3;
        }
        return i;
    }
}
