// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.util;

import android.content.SharedPreferences$Editor;
import androidx.annotation.RecentlyNonNull;
import android.content.Context;
import f2.a;

@a
public class a0
{
    private a0() {
    }
    
    @Deprecated
    @a
    public static void a(@RecentlyNonNull final Context context, @RecentlyNonNull final SharedPreferences$Editor sharedPreferences$Editor, @RecentlyNonNull final String s) {
        throw new IllegalStateException("world-readable shared preferences should only be used by apk");
    }
}
