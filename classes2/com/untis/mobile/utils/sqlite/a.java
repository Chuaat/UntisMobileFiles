// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.sqlite;

import u5.b;
import androidx.annotation.j0;
import u5.c;

public class a
{
    @j0
    private static c a;
    
    static {
        com.untis.mobile.utils.sqlite.a.a = new b();
    }
    
    @j0
    public static String a() {
        return com.untis.mobile.utils.sqlite.a.a.a();
    }
    
    public static int b() {
        return com.untis.mobile.utils.sqlite.a.a.getVersion();
    }
    
    public static void c() {
        com.untis.mobile.utils.sqlite.a.a = new b();
    }
    
    public static void d(@j0 final c a) {
        a.a = a;
    }
}
