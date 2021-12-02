// 
// Decompiled by Procyon v0.5.36
// 

package com.squareup.moshi;

final class n
{
    static final int a = 1;
    static final int b = 2;
    static final int c = 3;
    static final int d = 4;
    static final int e = 5;
    static final int f = 6;
    static final int g = 7;
    static final int h = 8;
    static final int i = 9;
    
    private n() {
    }
    
    static String a(final int n, final int[] array, final String[] array2, final int[] array3) {
        final StringBuilder sb = new StringBuilder();
        sb.append('$');
        for (int i = 0; i < n; ++i) {
            final int n2 = array[i];
            if (n2 != 1 && n2 != 2) {
                if (n2 == 3 || n2 == 4 || n2 == 5) {
                    sb.append('.');
                    if (array2[i] != null) {
                        sb.append(array2[i]);
                    }
                }
            }
            else {
                sb.append('[');
                sb.append(array3[i]);
                sb.append(']');
            }
        }
        return sb.toString();
    }
}
