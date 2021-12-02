// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import androidx.annotation.p0;
import android.annotation.TargetApi;
import android.util.Log;
import android.os.Process;
import android.content.Context;
import android.os.Build$VERSION;
import androidx.annotation.w;
import android.os.UserManager;

public class t
{
    @w("DirectBootUtils.class")
    private static UserManager a;
    private static volatile boolean b;
    @w("DirectBootUtils.class")
    private static boolean c;
    
    static {
        t.b = (a() ^ true);
        t.c = false;
    }
    
    private t() {
    }
    
    public static boolean a() {
        return Build$VERSION.SDK_INT >= 24;
    }
    
    public static boolean b(final Context context) {
        return !a() || d(context);
    }
    
    @TargetApi(24)
    @p0(24)
    @w("DirectBootUtils.class")
    private static boolean c(final Context context) {
        final boolean b = true;
        int n = 1;
        boolean b2;
        while (true) {
            b2 = false;
            if (n > 2) {
                break;
            }
            if (t.a == null) {
                t.a = (UserManager)context.getSystemService((Class)UserManager.class);
            }
            final UserManager a = t.a;
            if (a == null) {
                return true;
            }
            b2 = b;
            try {
                if (!a.isUserUnlocked()) {
                    b2 = (!a.isUserRunning(Process.myUserHandle()) && b);
                }
            }
            catch (NullPointerException ex) {
                Log.w("DirectBootUtils", "Failed to check if user is unlocked.", (Throwable)ex);
                t.a = null;
                ++n;
                continue;
            }
            break;
        }
        if (b2) {
            t.a = null;
        }
        return b2;
    }
    
    @TargetApi(24)
    @p0(24)
    private static boolean d(final Context context) {
        if (t.b) {
            return true;
        }
        synchronized (t.class) {
            if (t.b) {
                return true;
            }
            final boolean c = c(context);
            if (c) {
                t.b = c;
            }
            return c;
        }
    }
}
