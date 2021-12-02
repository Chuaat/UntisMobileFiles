// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.codecs;

final class t1
{
    private t1() {
    }
    
    public static void a(final byte[] array, int i, int n) {
        byte b;
        for (n = n + i - 1; i < n; ++i, --n) {
            b = array[i];
            array[i] = array[n];
            array[n] = b;
        }
    }
}
