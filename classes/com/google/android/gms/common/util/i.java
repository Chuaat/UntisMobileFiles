// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.util;

import android.util.Log;
import com.google.android.gms.common.internal.x;
import androidx.annotation.RecentlyNonNull;
import android.content.Context;
import androidx.annotation.k0;
import android.os.DropBoxManager;
import f2.a;

@a
public final class i
{
    private static final String[] a;
    @k0
    private static DropBoxManager b;
    private static boolean c;
    private static int d;
    @d6.a("CrashUtils.class")
    private static int e;
    @d6.a("CrashUtils.class")
    private static int f;
    
    static {
        a = new String[] { "android.", "com.android.", "dalvik.", "java.", "javax." };
        i.b = null;
        i.c = false;
        i.d = -1;
        i.e = 0;
        i.f = 0;
    }
    
    @RecentlyNonNull
    @a
    public static boolean a(@RecentlyNonNull final Context context, @RecentlyNonNull final Throwable t) {
        return b(context, t, 536870912);
    }
    
    private static boolean b(final Context context, final Throwable t, final int n) {
        try {
            x.k(context);
            x.k(t);
            return false;
        }
        catch (Exception ex) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", (Throwable)ex);
            return false;
        }
    }
}
