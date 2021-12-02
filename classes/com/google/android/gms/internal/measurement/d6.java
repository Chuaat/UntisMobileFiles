// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import android.os.Build$VERSION;

public final class d6
{
    private static volatile boolean a;
    
    static {
        d6.a = (a() ^ true);
    }
    
    public static boolean a() {
        return Build$VERSION.SDK_INT >= 24;
    }
}
