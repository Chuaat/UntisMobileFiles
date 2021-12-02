// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.util;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import android.text.TextUtils;
import androidx.annotation.k0;
import java.util.regex.Pattern;
import f2.a;

@d0
@a
public class b0
{
    private static final Pattern a;
    
    static {
        a = Pattern.compile("\\$\\{(.*?)\\}");
    }
    
    private b0() {
    }
    
    @RecentlyNullable
    @a
    public static String a(@k0 final String s) {
        String s2 = s;
        if (TextUtils.isEmpty((CharSequence)s)) {
            s2 = null;
        }
        return s2;
    }
    
    @RecentlyNonNull
    @a
    public static boolean b(@k0 final String s) {
        return s == null || s.trim().isEmpty();
    }
}
