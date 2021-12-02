// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import java.util.logging.Logger;

final class g1
{
    private static final Logger a;
    private static final h1 b;
    
    static {
        a = Logger.getLogger(g1.class.getName());
        b = (h1)new a(null);
    }
    
    private g1() {
    }
    
    static String a(@NullableDecl final String s) {
        String s2 = s;
        if (s == null) {
            s2 = "";
        }
        return s2;
    }
    
    private static final class a
    {
    }
}
