// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.util;

import androidx.annotation.RecentlyNullable;
import androidx.annotation.RecentlyNonNull;
import f2.a;

@a
public final class o
{
    @RecentlyNullable
    @a
    public static String a(@RecentlyNonNull final byte[] array, @RecentlyNonNull int n, @RecentlyNonNull final int n2, @RecentlyNonNull final boolean b) {
        if (array != null && array.length != 0 && n >= 0 && n2 > 0 && n + n2 <= array.length) {
            int n3 = 57;
            if (b) {
                n3 = 75;
            }
            final StringBuilder sb = new StringBuilder(n3 * ((n2 + 16 - 1) / 16));
            int i = n2;
            int n4 = 0;
            int n5 = 0;
            while (i > 0) {
                int n6;
                if (n4 == 0) {
                    String str;
                    if (n2 < 65536) {
                        str = String.format("%04X:", n);
                    }
                    else {
                        str = String.format("%08X:", n);
                    }
                    sb.append(str);
                    n6 = n;
                }
                else {
                    n6 = n5;
                    if (n4 == 8) {
                        sb.append(" -");
                        n6 = n5;
                    }
                }
                sb.append(String.format(" %02X", array[n] & 0xFF));
                --i;
                final int n7 = n4 + 1;
                if (b && (n7 == 16 || i == 0)) {
                    final int n8 = 16 - n7;
                    if (n8 > 0) {
                        for (int j = 0; j < n8; ++j) {
                            sb.append("   ");
                        }
                    }
                    if (n8 >= 8) {
                        sb.append("  ");
                    }
                    sb.append("  ");
                    for (int k = 0; k < n7; ++k) {
                        final char c = (char)array[n6 + k];
                        char c2;
                        if (c >= ' ' && c <= '~') {
                            c2 = c;
                        }
                        else {
                            c2 = '.';
                        }
                        sb.append(c2);
                    }
                }
                Label_0364: {
                    if (n7 != 16) {
                        n4 = n7;
                        if (i != 0) {
                            break Label_0364;
                        }
                    }
                    sb.append('\n');
                    n4 = 0;
                }
                ++n;
                n5 = n6;
            }
            return sb.toString();
        }
        return null;
    }
}
