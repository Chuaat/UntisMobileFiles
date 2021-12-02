// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import com.google.android.gms.common.wrappers.c;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import android.util.Log;
import com.google.android.gms.common.m;
import androidx.annotation.RecentlyNonNull;
import android.content.Context;
import f2.a;

@a
public final class c0
{
    private c0() {
    }
    
    @RecentlyNonNull
    @a
    public static boolean a(@RecentlyNonNull final Context context, @RecentlyNonNull final int n) {
        if (!b(context, n, "com.google.android.gms")) {
            return false;
        }
        final PackageManager packageManager = context.getPackageManager();
        try {
            return m.a(context).b(packageManager.getPackageInfo("com.google.android.gms", 64));
        }
        catch (PackageManager$NameNotFoundException ex) {
            if (Log.isLoggable("UidVerifier", 3)) {
                Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
            }
            return false;
        }
    }
    
    @TargetApi(19)
    @RecentlyNonNull
    @a
    public static boolean b(@RecentlyNonNull final Context context, @RecentlyNonNull final int n, @RecentlyNonNull final String s) {
        return c.a(context).g(n, s);
    }
}
