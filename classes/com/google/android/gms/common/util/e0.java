// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.util;

import android.annotation.SuppressLint;
import com.google.android.gms.common.internal.x;
import java.util.ArrayList;
import java.util.List;
import androidx.annotation.RecentlyNullable;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager$NameNotFoundException;
import android.util.Log;
import com.google.android.gms.common.wrappers.c;
import android.os.WorkSource;
import androidx.annotation.RecentlyNonNull;
import android.content.Context;
import android.os.Process;
import androidx.annotation.k0;
import java.lang.reflect.Method;
import f2.a;

@a
public class e0
{
    private static final int a;
    @k0
    private static final Method b;
    @k0
    private static final Method c;
    @k0
    private static final Method d;
    @k0
    private static final Method e;
    @k0
    private static final Method f;
    @k0
    private static final Method g;
    @k0
    private static final Method h;
    
    static {
        a = Process.myUid();
        b = i();
        c = k();
        d = l();
        e = m();
        f = n();
        g = o();
        h = p();
    }
    
    private e0() {
    }
    
    @RecentlyNullable
    @a
    public static WorkSource a(@RecentlyNonNull final Context context, @k0 final String s) {
        if (context != null && context.getPackageManager() != null) {
            if (s != null) {
                try {
                    final ApplicationInfo c = com.google.android.gms.common.wrappers.c.a(context).c(s, 0);
                    if (c == null) {
                        String concat;
                        if (s.length() != 0) {
                            concat = "Could not get applicationInfo from package: ".concat(s);
                        }
                        else {
                            concat = new String("Could not get applicationInfo from package: ");
                        }
                        Log.e("WorkSourceUtil", concat);
                        return null;
                    }
                    return g(c.uid, s);
                }
                catch (PackageManager$NameNotFoundException ex) {
                    String concat2;
                    if (s.length() != 0) {
                        concat2 = "Could not find package: ".concat(s);
                    }
                    else {
                        concat2 = new String("Could not find package: ");
                    }
                    Log.e("WorkSourceUtil", concat2);
                }
            }
        }
        return null;
    }
    
    @RecentlyNullable
    @a
    public static WorkSource b(@RecentlyNonNull Context obj, @RecentlyNonNull final String s, @RecentlyNonNull final String s2) {
        if (obj == null || obj.getPackageManager() == null || s2 == null || s == null) {
            Log.w("WorkSourceUtil", "Unexpected null arguments");
            return null;
        }
        final int e = e(obj, s);
        if (e < 0) {
            return null;
        }
        obj = (Context)new WorkSource();
        final Method g = e0.g;
        if (g != null) {
            final Method h = e0.h;
            if (h != null) {
                try {
                    final Object invoke = g.invoke(obj, new Object[0]);
                    final int a = e0.a;
                    if (e != a) {
                        h.invoke(invoke, e, s);
                    }
                    h.invoke(invoke, a, s2);
                }
                catch (Exception ex) {
                    Log.w("WorkSourceUtil", "Unable to assign chained blame through WorkSource", (Throwable)ex);
                }
                return (WorkSource)obj;
            }
        }
        j((WorkSource)obj, e, s);
        return (WorkSource)obj;
    }
    
    @RecentlyNonNull
    @a
    public static List<String> c(@k0 final WorkSource workSource) {
        final ArrayList<String> list = new ArrayList<String>();
        int i = 0;
        int f;
        if (workSource == null) {
            f = 0;
        }
        else {
            f = f(workSource);
        }
        if (f == 0) {
            return list;
        }
        while (i < f) {
            final String h = h(workSource, i);
            if (!b0.b(h)) {
                list.add(x.k(h));
            }
            ++i;
        }
        return list;
    }
    
    @RecentlyNonNull
    @a
    public static boolean d(@RecentlyNonNull final Context context) {
        return context != null && context.getPackageManager() != null && com.google.android.gms.common.wrappers.c.a(context).b("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) == 0;
    }
    
    private static int e(final Context context, final String s) {
        try {
            final ApplicationInfo c = com.google.android.gms.common.wrappers.c.a(context).c(s, 0);
            if (c == null) {
                final String value = String.valueOf(s);
                String concat;
                if (value.length() != 0) {
                    concat = "Could not get applicationInfo from package: ".concat(value);
                }
                else {
                    concat = new String("Could not get applicationInfo from package: ");
                }
                Log.e("WorkSourceUtil", concat);
                return -1;
            }
            return c.uid;
        }
        catch (PackageManager$NameNotFoundException ex) {
            final String value2 = String.valueOf(s);
            String concat2;
            if (value2.length() != 0) {
                concat2 = "Could not find package: ".concat(value2);
            }
            else {
                concat2 = new String("Could not find package: ");
            }
            Log.e("WorkSourceUtil", concat2);
            return -1;
        }
    }
    
    private static int f(final WorkSource obj) {
        final Method d = e0.d;
        if (d != null) {
            try {
                return x.k(d.invoke(obj, new Object[0]));
            }
            catch (Exception ex) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", (Throwable)ex);
            }
        }
        return 0;
    }
    
    private static WorkSource g(final int n, final String s) {
        final WorkSource workSource = new WorkSource();
        j(workSource, n, s);
        return workSource;
    }
    
    @k0
    private static String h(@k0 final WorkSource obj, final int i) {
        final Method f = e0.f;
        if (f != null) {
            try {
                return (String)f.invoke(obj, i);
            }
            catch (Exception ex) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", (Throwable)ex);
            }
        }
        return null;
    }
    
    @k0
    private static Method i() {
        Method method;
        try {
            method = WorkSource.class.getMethod("add", Integer.TYPE);
        }
        catch (Exception ex) {
            method = null;
        }
        return method;
    }
    
    private static void j(final WorkSource workSource, final int n, @k0 final String s) {
        final Method c = e0.c;
        if (c != null) {
            String s2;
            if ((s2 = s) == null) {
                s2 = "";
            }
            try {
                c.invoke(workSource, n, s2);
                return;
            }
            catch (Exception ex) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", (Throwable)ex);
                return;
            }
        }
        final Method b = e0.b;
        if (b != null) {
            try {
                b.invoke(workSource, n);
            }
            catch (Exception ex2) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", (Throwable)ex2);
            }
        }
    }
    
    @k0
    private static Method k() {
        Label_0032: {
            if (!v.g()) {
                break Label_0032;
            }
            try {
                return WorkSource.class.getMethod("add", Integer.TYPE, String.class);
                method = null;
                return method;
            }
            catch (Exception ex) {
                return null;
            }
        }
    }
    
    @k0
    private static Method l() {
        Method method;
        try {
            method = WorkSource.class.getMethod("size", (Class<?>[])new Class[0]);
        }
        catch (Exception ex) {
            method = null;
        }
        return method;
    }
    
    @k0
    private static Method m() {
        Method method;
        try {
            method = WorkSource.class.getMethod("get", Integer.TYPE);
        }
        catch (Exception ex) {
            method = null;
        }
        return method;
    }
    
    @k0
    private static Method n() {
        Label_0027: {
            if (!v.g()) {
                break Label_0027;
            }
            try {
                return WorkSource.class.getMethod("getName", Integer.TYPE);
                method = null;
                return method;
            }
            catch (Exception ex) {
                return null;
            }
        }
    }
    
    @k0
    private static final Method o() {
        if (v.o()) {
            try {
                return WorkSource.class.getMethod("createWorkChain", (Class<?>[])new Class[0]);
            }
            catch (Exception ex) {
                Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", (Throwable)ex);
            }
        }
        return null;
    }
    
    @SuppressLint({ "PrivateApi" })
    @k0
    private static final Method p() {
        if (v.o()) {
            try {
                return Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", Integer.TYPE, String.class);
            }
            catch (Exception ex) {
                Log.w("WorkSourceUtil", "Missing WorkChain class", (Throwable)ex);
            }
        }
        return null;
    }
}
