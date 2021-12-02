// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.util;

import androidx.annotation.k0;
import android.content.pm.PackageManager$NameNotFoundException;
import com.google.android.gms.common.wrappers.c;
import android.os.Bundle;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import androidx.annotation.RecentlyNonNull;
import android.content.Context;
import f2.a;

@a
public class e
{
    private e() {
    }
    
    @RecentlyNonNull
    @a
    public static int a(@RecentlyNonNull final Context context, @RecentlyNonNull final String s) {
        final PackageInfo d = d(context, s);
        if (d != null) {
            final ApplicationInfo applicationInfo = d.applicationInfo;
            if (applicationInfo != null) {
                final Bundle metaData = applicationInfo.metaData;
                if (metaData == null) {
                    return -1;
                }
                return metaData.getInt("com.google.android.gms.version", -1);
            }
        }
        return -1;
    }
    
    @RecentlyNonNull
    @a
    public static boolean b() {
        return false;
    }
    
    @RecentlyNonNull
    public static boolean c(@RecentlyNonNull final Context context, @RecentlyNonNull final String anObject) {
        "com.google.android.gms".equals(anObject);
        try {
            if ((c.a(context).c(anObject, 0).flags & 0x200000) != 0x0) {
                return true;
            }
            return false;
        }
        catch (PackageManager$NameNotFoundException ex) {
            return false;
        }
    }
    
    @k0
    private static PackageInfo d(final Context context, final String s) {
        try {
            return c.a(context).e(s, 128);
        }
        catch (PackageManager$NameNotFoundException ex) {
            return null;
        }
    }
}
