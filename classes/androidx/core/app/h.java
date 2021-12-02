// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.app;

import androidx.annotation.k0;
import android.app.AppOpsManager;
import android.os.Build$VERSION;
import androidx.annotation.j0;
import android.content.Context;

public final class h
{
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    
    private h() {
    }
    
    public static int a(@j0 final Context context, @j0 final String s, final int n, @j0 final String s2) {
        if (Build$VERSION.SDK_INT >= 19) {
            return ((AppOpsManager)context.getSystemService("appops")).noteOp(s, n, s2);
        }
        return 1;
    }
    
    public static int b(@j0 final Context context, @j0 final String s, final int n, @j0 final String s2) {
        if (Build$VERSION.SDK_INT >= 19) {
            return ((AppOpsManager)context.getSystemService("appops")).noteOpNoThrow(s, n, s2);
        }
        return 1;
    }
    
    public static int c(@j0 final Context context, @j0 final String s, @j0 final String s2) {
        if (Build$VERSION.SDK_INT >= 23) {
            return ((AppOpsManager)context.getSystemService((Class)AppOpsManager.class)).noteProxyOp(s, s2);
        }
        return 1;
    }
    
    public static int d(@j0 final Context context, @j0 final String s, @j0 final String s2) {
        if (Build$VERSION.SDK_INT >= 23) {
            return ((AppOpsManager)context.getSystemService((Class)AppOpsManager.class)).noteProxyOpNoThrow(s, s2);
        }
        return 1;
    }
    
    @k0
    public static String e(@j0 final String s) {
        if (Build$VERSION.SDK_INT >= 23) {
            return AppOpsManager.permissionToOp(s);
        }
        return null;
    }
}
