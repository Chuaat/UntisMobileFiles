// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.content.pm;

import androidx.annotation.t0;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;
import android.annotation.SuppressLint;
import android.os.Build$VERSION;
import androidx.annotation.j0;
import android.content.pm.PermissionInfo;

public final class c
{
    private c() {
    }
    
    @SuppressLint({ "WrongConstant" })
    public static int a(@j0 final PermissionInfo permissionInfo) {
        if (Build$VERSION.SDK_INT >= 28) {
            return permissionInfo.getProtection();
        }
        return permissionInfo.protectionLevel & 0xF;
    }
    
    @SuppressLint({ "WrongConstant" })
    public static int b(@j0 final PermissionInfo permissionInfo) {
        if (Build$VERSION.SDK_INT >= 28) {
            return permissionInfo.getProtectionFlags();
        }
        return permissionInfo.protectionLevel & 0xFFFFFFF0;
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @t0({ t0.a.G })
    public @interface a {
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @SuppressLint({ "UniqueConstants" })
    @t0({ t0.a.G })
    public @interface b {
    }
}
