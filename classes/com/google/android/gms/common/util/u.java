// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.util;

import androidx.annotation.RecentlyNonNull;
import f2.a;

@d0
@a
public class u
{
    private u() {
    }
    
    @RecentlyNonNull
    @a
    public static long a(@RecentlyNonNull final String s) {
        if (s.length() > 16) {
            final StringBuilder sb = new StringBuilder(s.length() + 37);
            sb.append("Invalid input: ");
            sb.append(s);
            sb.append(" exceeds 16 characters");
            throw new NumberFormatException(sb.toString());
        }
        if (s.length() == 16) {
            return Long.parseLong(s.substring(0, 8), 16) << 32 | Long.parseLong(s.substring(8), 16);
        }
        return Long.parseLong(s, 16);
    }
}
