// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.content;

import androidx.annotation.t0;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;
import androidx.core.app.h;
import androidx.annotation.k0;
import android.os.Process;
import android.os.Binder;
import androidx.annotation.j0;
import android.content.Context;

public final class i
{
    public static final int a = 0;
    public static final int b = -1;
    public static final int c = -2;
    
    private i() {
    }
    
    public static int a(@j0 final Context context, @j0 final String s) {
        String packageName;
        if (Binder.getCallingPid() == Process.myPid()) {
            packageName = context.getPackageName();
        }
        else {
            packageName = null;
        }
        return c(context, s, Binder.getCallingPid(), Binder.getCallingUid(), packageName);
    }
    
    public static int b(@j0 final Context context, @j0 final String s, @k0 final String s2) {
        if (Binder.getCallingPid() == Process.myPid()) {
            return -1;
        }
        return c(context, s, Binder.getCallingPid(), Binder.getCallingUid(), s2);
    }
    
    public static int c(@j0 final Context context, @j0 String s, final int n, final int n2, @k0 final String s2) {
        if (context.checkPermission(s, n, n2) == -1) {
            return -1;
        }
        final String e = h.e(s);
        if (e == null) {
            return 0;
        }
        if ((s = s2) == null) {
            final String[] packagesForUid = context.getPackageManager().getPackagesForUid(n2);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            s = packagesForUid[0];
        }
        if (h.d(context, e, s) != 0) {
            return -2;
        }
        return 0;
    }
    
    public static int d(@j0 final Context context, @j0 final String s) {
        return c(context, s, Process.myPid(), Process.myUid(), context.getPackageName());
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @t0({ t0.a.I })
    public @interface a {
    }
}
