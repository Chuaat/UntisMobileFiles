// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl.utils;

import android.text.TextUtils;
import androidx.annotation.k0;
import android.annotation.SuppressLint;
import java.util.Iterator;
import java.util.List;
import java.lang.reflect.Method;
import android.app.ActivityManager$RunningAppProcessInfo;
import android.app.ActivityManager;
import android.os.Process;
import androidx.work.impl.background.greedy.b;
import android.app.Application;
import android.os.Build$VERSION;
import androidx.annotation.j0;
import android.content.Context;
import androidx.work.q;
import androidx.annotation.t0;

@t0({ t0.a.H })
public class g
{
    private static final String a;
    
    static {
        a = q.f("ProcessUtils");
    }
    
    private g() {
    }
    
    @SuppressLint({ "PrivateApi", "DiscouragedPrivateApi" })
    @k0
    public static String a(@j0 final Context context) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 28) {
            return Application.getProcessName();
        }
        try {
            final Class<?> forName = Class.forName("android.app.ActivityThread", false, b.class.getClassLoader());
            Object o;
            if (sdk_INT >= 18) {
                final Method declaredMethod = forName.getDeclaredMethod("currentProcessName", (Class<?>[])new Class[0]);
                declaredMethod.setAccessible(true);
                o = declaredMethod.invoke(null, new Object[0]);
            }
            else {
                final Method declaredMethod2 = forName.getDeclaredMethod("currentActivityThread", (Class<?>[])new Class[0]);
                declaredMethod2.setAccessible(true);
                final Method declaredMethod3 = forName.getDeclaredMethod("getProcessName", (Class<?>[])new Class[0]);
                declaredMethod3.setAccessible(true);
                o = declaredMethod3.invoke(declaredMethod2.invoke(null, new Object[0]), new Object[0]);
            }
            if (o instanceof String) {
                return (String)o;
            }
        }
        finally {
            final Throwable t;
            q.c().a(g.a, "Unable to check ActivityThread for processName", t);
        }
        final int myPid = Process.myPid();
        final ActivityManager activityManager = (ActivityManager)context.getSystemService("activity");
        if (activityManager != null) {
            final List runningAppProcesses = activityManager.getRunningAppProcesses();
            if (runningAppProcesses != null && !runningAppProcesses.isEmpty()) {
                for (final ActivityManager$RunningAppProcessInfo activityManager$RunningAppProcessInfo : runningAppProcesses) {
                    if (activityManager$RunningAppProcessInfo.pid == myPid) {
                        return activityManager$RunningAppProcessInfo.processName;
                    }
                }
            }
        }
        return null;
    }
    
    public static boolean b(@j0 final Context context, @j0 final androidx.work.b b) {
        final String a = a(context);
        String s;
        if (!TextUtils.isEmpty((CharSequence)b.b())) {
            s = b.b();
        }
        else {
            s = context.getApplicationInfo().processName;
        }
        return TextUtils.equals((CharSequence)a, (CharSequence)s);
    }
}
