// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl.utils;

import android.content.pm.PackageManager;
import androidx.annotation.j0;
import android.content.ComponentName;
import android.content.Context;
import androidx.work.q;

public class e
{
    private static final String a;
    
    static {
        a = q.f("PackageManagerHelper");
    }
    
    private e() {
    }
    
    public static boolean a(final Context context, final Class<?> clazz) {
        return b(context, clazz.getName());
    }
    
    public static boolean b(final Context context, final String s) {
        final int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, s));
        boolean b = true;
        if (componentEnabledSetting != 1) {
            b = false;
        }
        return b;
    }
    
    public static void c(@j0 final Context context, @j0 final Class<?> clazz, final boolean b) {
        final String s = "enabled";
        try {
            final PackageManager packageManager = context.getPackageManager();
            final ComponentName componentName = new ComponentName(context, clazz.getName());
            int n;
            if (b) {
                n = 1;
            }
            else {
                n = 2;
            }
            packageManager.setComponentEnabledSetting(componentName, n, 1);
            final q c = q.c();
            final String a = e.a;
            final String name = clazz.getName();
            String s2;
            if (b) {
                s2 = "enabled";
            }
            else {
                s2 = "disabled";
            }
            c.a(a, String.format("%s %s", name, s2), new Throwable[0]);
        }
        catch (Exception ex) {
            final q c2 = q.c();
            final String a2 = e.a;
            final String name2 = clazz.getName();
            String s3;
            if (b) {
                s3 = s;
            }
            else {
                s3 = "disabled";
            }
            c2.a(a2, String.format("%s could not be %s", name2, s3), ex);
        }
    }
}
