// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.internal;

import java.util.Locale;
import android.os.Build;
import androidx.annotation.t0;

@t0({ t0.a.H })
public class g
{
    private static final String a = "lge";
    private static final String b = "samsung";
    private static final String c = "meizu";
    
    private g() {
    }
    
    public static boolean a() {
        return b() || d();
    }
    
    public static boolean b() {
        return Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("lge");
    }
    
    public static boolean c() {
        return Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu");
    }
    
    public static boolean d() {
        return Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("samsung");
    }
}
