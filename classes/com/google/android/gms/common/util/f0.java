// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.util;

import androidx.annotation.k0;
import java.util.regex.Pattern;

public final class f0
{
    @k0
    private static Pattern a;
    
    public static int a(final int n) {
        if (n == -1) {
            return -1;
        }
        return n / 1000;
    }
}
