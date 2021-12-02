// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.util;

import android.os.Build;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.annotation.TargetApi;
import android.content.pm.PackageManager;
import androidx.annotation.RecentlyNonNull;
import android.content.Context;
import androidx.annotation.k0;
import f2.a;

@a
public final class l
{
    @k0
    private static Boolean a;
    @k0
    private static Boolean b;
    @k0
    private static Boolean c;
    @k0
    private static Boolean d;
    @k0
    private static Boolean e;
    @k0
    private static Boolean f;
    @k0
    private static Boolean g;
    @k0
    private static Boolean h;
    
    private l() {
    }
    
    @RecentlyNonNull
    @a
    public static boolean a(@RecentlyNonNull final Context context) {
        return b(context.getPackageManager());
    }
    
    @RecentlyNonNull
    @a
    public static boolean b(@RecentlyNonNull final PackageManager packageManager) {
        if (l.g == null) {
            l.g = (v.n() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        return l.g;
    }
    
    @Deprecated
    @RecentlyNonNull
    @a
    public static boolean c(@RecentlyNonNull final Context context) {
        return false;
    }
    
    @RecentlyNonNull
    @a
    public static boolean d(@RecentlyNonNull final Context context) {
        if (l.e == null) {
            final PackageManager packageManager = context.getPackageManager();
            l.e = (packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services"));
        }
        return l.e;
    }
    
    @TargetApi(21)
    @RecentlyNonNull
    @a
    public static boolean e(@RecentlyNonNull final Context context) {
        return n(context);
    }
    
    @RecentlyNonNull
    @a
    public static boolean f(@RecentlyNonNull final Resources resources) {
        final boolean b = false;
        if (resources == null) {
            return false;
        }
        if (l.a == null) {
            boolean b2 = false;
            Label_0098: {
                if ((resources.getConfiguration().screenLayout & 0xF) <= 3) {
                    if (l.b == null) {
                        final Configuration configuration = resources.getConfiguration();
                        l.b = ((configuration.screenLayout & 0xF) <= 3 && configuration.smallestScreenWidthDp >= 600);
                    }
                    b2 = b;
                    if (!l.b) {
                        break Label_0098;
                    }
                }
                b2 = true;
            }
            l.a = b2;
        }
        return l.a;
    }
    
    @RecentlyNonNull
    @a
    public static boolean g(@RecentlyNonNull final Context context) {
        return h(context.getPackageManager());
    }
    
    @RecentlyNonNull
    @a
    public static boolean h(@RecentlyNonNull final PackageManager packageManager) {
        if (l.h == null) {
            l.h = (packageManager.hasSystemFeature("com.google.android.tv") || packageManager.hasSystemFeature("android.hardware.type.television") || packageManager.hasSystemFeature("android.software.leanback"));
        }
        return l.h;
    }
    
    @RecentlyNonNull
    @a
    public static boolean i() {
        return "user".equals(Build.TYPE);
    }
    
    @TargetApi(20)
    @RecentlyNonNull
    @a
    public static boolean j(@RecentlyNonNull final Context context) {
        return k(context.getPackageManager());
    }
    
    @TargetApi(20)
    @RecentlyNonNull
    @a
    public static boolean k(@RecentlyNonNull final PackageManager packageManager) {
        if (l.c == null) {
            l.c = (v.i() && packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        return l.c;
    }
    
    @TargetApi(26)
    @RecentlyNonNull
    @a
    public static boolean l(@RecentlyNonNull final Context context) {
        return j(context) && (!v.m() || (n(context) && !v.n()));
    }
    
    @RecentlyNonNull
    public static boolean m(@RecentlyNonNull final Context context) {
        if (l.f == null) {
            l.f = (context.getPackageManager().hasSystemFeature("android.hardware.type.iot") || context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
        }
        return l.f;
    }
    
    @TargetApi(21)
    private static boolean n(final Context context) {
        if (l.d == null) {
            l.d = (v.j() && context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return l.d;
    }
}
