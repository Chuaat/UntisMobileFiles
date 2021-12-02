// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.signature;

import androidx.annotation.b1;
import java.util.UUID;
import androidx.annotation.k0;
import android.content.pm.PackageManager$NameNotFoundException;
import android.util.Log;
import android.content.pm.PackageInfo;
import androidx.annotation.j0;
import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;
import com.bumptech.glide.load.g;
import java.util.concurrent.ConcurrentMap;

public final class b
{
    private static final String a = "AppVersionSignature";
    private static final ConcurrentMap<String, g> b;
    
    static {
        b = new ConcurrentHashMap<String, g>();
    }
    
    private b() {
    }
    
    @k0
    private static PackageInfo a(@j0 final Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        }
        catch (PackageManager$NameNotFoundException ex) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Cannot resolve info for");
            sb.append(context.getPackageName());
            Log.e("AppVersionSignature", sb.toString(), (Throwable)ex);
            return null;
        }
    }
    
    @j0
    private static String b(@k0 final PackageInfo packageInfo) {
        String s;
        if (packageInfo != null) {
            s = String.valueOf(packageInfo.versionCode);
        }
        else {
            s = UUID.randomUUID().toString();
        }
        return s;
    }
    
    @j0
    public static g c(@j0 final Context context) {
        final String packageName = context.getPackageName();
        final ConcurrentMap<String, g> b = com.bumptech.glide.signature.b.b;
        g d;
        if ((d = b.get(packageName)) == null) {
            d = d(context);
            final g g = b.putIfAbsent(packageName, d);
            if (g != null) {
                d = g;
            }
        }
        return d;
    }
    
    @j0
    private static g d(@j0 final Context context) {
        return new e(b(a(context)));
    }
    
    @b1
    static void e() {
        com.bumptech.glide.signature.b.b.clear();
    }
}
