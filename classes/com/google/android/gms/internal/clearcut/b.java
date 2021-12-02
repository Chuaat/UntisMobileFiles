// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

import android.annotation.TargetApi;
import android.os.Build$VERSION;
import android.content.Context;
import android.os.UserManager;

public class b
{
    private static volatile UserManager a;
    private static volatile boolean b;
    
    static {
        com.google.android.gms.internal.clearcut.b.b = (b() ^ true);
    }
    
    private b() {
    }
    
    public static boolean a(final Context context) {
        return b() && !c(context);
    }
    
    private static boolean b() {
        return Build$VERSION.SDK_INT >= 24;
    }
    
    @TargetApi(24)
    private static boolean c(final Context context) {
        boolean b;
        if (!(b = com.google.android.gms.internal.clearcut.b.b)) {
            UserManager a;
            if ((a = com.google.android.gms.internal.clearcut.b.a) == null) {
                synchronized (b.class) {
                    if ((a = com.google.android.gms.internal.clearcut.b.a) == null) {
                        a = (UserManager)context.getSystemService((Class)UserManager.class);
                        if ((com.google.android.gms.internal.clearcut.b.a = a) == null) {
                            return com.google.android.gms.internal.clearcut.b.b = true;
                        }
                    }
                }
            }
            final boolean b2 = b = (com.google.android.gms.internal.clearcut.b.b = a.isUserUnlocked());
            if (b2) {
                com.google.android.gms.internal.clearcut.b.a = null;
                b = b2;
            }
        }
        return b;
    }
}
