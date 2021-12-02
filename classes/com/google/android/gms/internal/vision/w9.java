// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

final class w9
{
    private static void f(final byte b, final byte b2, final byte b3, final byte b4, final char[] array, final int n) throws y6 {
        if (!o(b2) && (b << 28) + (b2 + 112) >> 30 == 0 && !o(b3) && !o(b4)) {
            final int n2 = (b & 0x7) << 18 | (b2 & 0x3F) << 12 | (b3 & 0x3F) << 6 | (b4 & 0x3F);
            array[n] = (char)((n2 >>> 10) + 55232);
            array[n + 1] = (char)((n2 & 0x3FF) + 56320);
            return;
        }
        throw y6.i();
    }
    
    private static void g(final byte b, final byte b2, final byte b3, final char[] array, final int n) throws y6 {
        if (!o(b2) && (b != -32 || b2 >= -96) && (b != -19 || b2 < -96) && !o(b3)) {
            array[n] = (char)((b & 0xF) << 12 | (b2 & 0x3F) << 6 | (b3 & 0x3F));
            return;
        }
        throw y6.i();
    }
    
    private static void h(final byte b, final byte b2, final char[] array, final int n) throws y6 {
        if (b >= -62 && !o(b2)) {
            array[n] = (char)((b & 0x1F) << 6 | (b2 & 0x3F));
            return;
        }
        throw y6.i();
    }
    
    private static void i(final byte b, final char[] array, final int n) {
        array[n] = (char)b;
    }
    
    private static boolean l(final byte b) {
        return b >= 0;
    }
    
    private static boolean m(final byte b) {
        return b < -32;
    }
    
    private static boolean n(final byte b) {
        return b < -16;
    }
    
    private static boolean o(final byte b) {
        return b > -65;
    }
}
