// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.util;

import android.util.Log;
import android.os.Build;
import android.os.Build$VERSION;
import androidx.annotation.RecentlyNonNull;
import f2.a;

@d0
@a
public final class v
{
    private static Boolean a;
    
    private v() {
    }
    
    @RecentlyNonNull
    @a
    public static boolean a() {
        return true;
    }
    
    @RecentlyNonNull
    @a
    public static boolean b() {
        return true;
    }
    
    @RecentlyNonNull
    @a
    public static boolean c() {
        return true;
    }
    
    @RecentlyNonNull
    @a
    public static boolean d() {
        return Build$VERSION.SDK_INT >= 15;
    }
    
    @RecentlyNonNull
    @a
    public static boolean e() {
        return Build$VERSION.SDK_INT >= 16;
    }
    
    @RecentlyNonNull
    @a
    public static boolean f() {
        return Build$VERSION.SDK_INT >= 17;
    }
    
    @RecentlyNonNull
    @a
    public static boolean g() {
        return Build$VERSION.SDK_INT >= 18;
    }
    
    @RecentlyNonNull
    @a
    public static boolean h() {
        return Build$VERSION.SDK_INT >= 19;
    }
    
    @RecentlyNonNull
    @a
    public static boolean i() {
        return Build$VERSION.SDK_INT >= 20;
    }
    
    @RecentlyNonNull
    @a
    public static boolean j() {
        return Build$VERSION.SDK_INT >= 21;
    }
    
    @RecentlyNonNull
    @a
    public static boolean k() {
        return Build$VERSION.SDK_INT >= 22;
    }
    
    @RecentlyNonNull
    @a
    public static boolean l() {
        return Build$VERSION.SDK_INT >= 23;
    }
    
    @RecentlyNonNull
    @a
    public static boolean m() {
        return Build$VERSION.SDK_INT >= 24;
    }
    
    @RecentlyNonNull
    @a
    public static boolean n() {
        return Build$VERSION.SDK_INT >= 26;
    }
    
    @RecentlyNonNull
    @a
    public static boolean o() {
        return Build$VERSION.SDK_INT >= 28;
    }
    
    @RecentlyNonNull
    @a
    public static boolean p() {
        return Build$VERSION.SDK_INT >= 29;
    }
    
    @RecentlyNonNull
    @a
    public static boolean q() {
        final boolean p = p();
        final boolean b = false;
        if (!p) {
            return false;
        }
        if (Build$VERSION.SDK_INT >= 30 && Build$VERSION.CODENAME.equals("REL")) {
            return true;
        }
        final String codename = Build$VERSION.CODENAME;
        if (codename.length() != 1 || codename.charAt(0) < 'R' || codename.charAt(0) > 'Z') {
            return false;
        }
        final Boolean a = v.a;
        if (a != null) {
            return a;
        }
        boolean b2 = b;
        try {
            if ("google".equals(Build.BRAND)) {
                b2 = b;
                if (!Build.ID.startsWith("RPP1")) {
                    b2 = b;
                    if (!Build.ID.startsWith("RPP2")) {
                        b2 = b;
                        if (Integer.parseInt(Build$VERSION.INCREMENTAL) >= 6301457) {
                            b2 = true;
                        }
                    }
                }
            }
            v.a = b2;
        }
        catch (NumberFormatException ex) {
            v.a = Boolean.TRUE;
        }
        if (!v.a) {
            Log.w("PlatformVersion", "Build version must be at least 6301457 to support R in gmscore");
        }
        return v.a;
    }
}
