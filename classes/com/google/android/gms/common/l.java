// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common;

import java.util.Iterator;
import android.content.pm.PackageInstaller$SessionInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.common.util.f0;
import android.annotation.TargetApi;
import android.os.Bundle;
import android.os.UserManager;
import com.google.android.gms.common.util.v;
import com.google.android.gms.common.util.c0;
import com.google.android.gms.common.internal.w1;
import com.google.android.gms.common.internal.o;
import android.content.pm.PackageInfo;
import android.content.res.Resources;
import androidx.annotation.j0;
import androidx.annotation.RecentlyNullable;
import android.app.PendingIntent;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.internal.x;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.Intent;
import android.util.Log;
import android.app.NotificationManager;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import com.google.android.gms.common.util.d0;
import androidx.annotation.RecentlyNonNull;
import f2.a;
import com.google.android.gms.common.internal.b0;

@b0
@a
public class l
{
    @Deprecated
    @RecentlyNonNull
    @a
    public static final int a = 12451000;
    @Deprecated
    @RecentlyNonNull
    @a
    public static final String b = "com.google.android.gms";
    @RecentlyNonNull
    @a
    public static final String c = "com.google.android.play.games";
    @RecentlyNonNull
    @a
    public static final String d = "com.android.vending";
    @a
    static final int e = 39789;
    @a
    static final int f = 10436;
    @d0
    private static boolean g = false;
    @d0
    private static boolean h = false;
    private static boolean i = false;
    @d0
    private static boolean j = false;
    @d0
    @a
    static final AtomicBoolean k;
    private static final AtomicBoolean l;
    
    static {
        k = new AtomicBoolean();
        l = new AtomicBoolean();
    }
    
    @a
    l() {
    }
    
    @Deprecated
    @a
    public static void a(@RecentlyNonNull final Context context) {
        if (com.google.android.gms.common.l.k.getAndSet(true)) {
            return;
        }
        try {
            final NotificationManager notificationManager = (NotificationManager)context.getSystemService("notification");
            if (notificationManager != null) {
                notificationManager.cancel(10436);
            }
        }
        catch (SecurityException ex) {}
    }
    
    @b0
    @a
    public static void b() {
        com.google.android.gms.common.l.l.set(true);
    }
    
    @Deprecated
    @a
    public static void c(@RecentlyNonNull final Context context, @RecentlyNonNull int k) throws j, i {
        k = com.google.android.gms.common.h.i().k(context, k);
        if (k == 0) {
            return;
        }
        final Intent e = com.google.android.gms.common.h.i().e(context, k, "e");
        final StringBuilder sb = new StringBuilder(57);
        sb.append("GooglePlayServices not available due to error ");
        sb.append(k);
        Log.e("GooglePlayServicesUtil", sb.toString());
        if (e == null) {
            throw new i(k);
        }
        throw new j(k, "Google Play Services not available", e);
    }
    
    @Deprecated
    @RecentlyNonNull
    @b0
    @a
    public static int d(@RecentlyNonNull final Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        }
        catch (PackageManager$NameNotFoundException ex) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }
    
    @Deprecated
    @RecentlyNonNull
    @b0
    @a
    public static int e(@RecentlyNonNull final Context context) {
        x.q(true);
        return com.google.android.gms.common.util.e.a(context, context.getPackageName());
    }
    
    @Deprecated
    @RecentlyNullable
    @a
    public static PendingIntent f(@RecentlyNonNull final int n, @RecentlyNonNull final Context context, @RecentlyNonNull final int n2) {
        return com.google.android.gms.common.h.i().f(context, n, n2);
    }
    
    @Deprecated
    @j0
    @d0
    @a
    public static String g(@RecentlyNonNull final int n) {
        return com.google.android.gms.common.c.i3(n);
    }
    
    @Deprecated
    @RecentlyNullable
    @b0
    @a
    public static Intent h(@RecentlyNonNull final int n) {
        return com.google.android.gms.common.h.i().e(null, n, null);
    }
    
    @RecentlyNullable
    @a
    public static Context i(@RecentlyNonNull Context packageContext) {
        try {
            packageContext = packageContext.createPackageContext("com.google.android.gms", 3);
            return packageContext;
        }
        catch (PackageManager$NameNotFoundException ex) {
            return null;
        }
    }
    
    @RecentlyNullable
    @a
    public static Resources j(@RecentlyNonNull final Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        }
        catch (PackageManager$NameNotFoundException ex) {
            return null;
        }
    }
    
    @RecentlyNonNull
    @b0
    @a
    public static boolean k(@RecentlyNonNull final Context context) {
        if (!com.google.android.gms.common.l.j) {
            try {
                try {
                    final PackageInfo e = com.google.android.gms.common.wrappers.c.a(context).e("com.google.android.gms", 64);
                    m.a(context);
                    if (e != null && !m.g(e, false) && m.g(e, true)) {
                        com.google.android.gms.common.l.i = true;
                    }
                    com.google.android.gms.common.l.i = false;
                }
                finally {}
            }
            catch (PackageManager$NameNotFoundException ex) {
                Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", (Throwable)ex);
            }
            com.google.android.gms.common.l.j = true;
            return com.google.android.gms.common.l.i || !com.google.android.gms.common.util.l.i();
            com.google.android.gms.common.l.j = true;
        }
        return com.google.android.gms.common.l.i || !com.google.android.gms.common.util.l.i();
    }
    
    @Deprecated
    @RecentlyNonNull
    @o
    @a
    public static int l(@RecentlyNonNull final Context context) {
        return m(context, com.google.android.gms.common.l.a);
    }
    
    @Deprecated
    @RecentlyNonNull
    @a
    public static int m(@RecentlyNonNull final Context context, @RecentlyNonNull final int n) {
        try {
            context.getResources().getString(com.google.android.gms.common.o.b.a);
        }
        finally {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !com.google.android.gms.common.l.l.get()) {
            final int b = w1.b(context);
            if (b == 0) {
                throw new IllegalStateException("A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
            }
            final int a = com.google.android.gms.common.l.a;
            if (b != a) {
                final StringBuilder sb = new StringBuilder(320);
                sb.append("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ");
                sb.append(a);
                sb.append(" but found ");
                sb.append(b);
                sb.append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
                throw new IllegalStateException(sb.toString());
            }
        }
        return u(context, !com.google.android.gms.common.util.l.l(context) && !com.google.android.gms.common.util.l.m(context), n);
    }
    
    @Deprecated
    @RecentlyNonNull
    @a
    public static boolean n(@RecentlyNonNull final Context context, @RecentlyNonNull final int n) {
        return c0.a(context, n);
    }
    
    @Deprecated
    @RecentlyNonNull
    @b0
    @a
    public static boolean o(@RecentlyNonNull final Context context, @RecentlyNonNull final int n) {
        return n == 18 || (n == 1 && v(context, "com.google.android.gms"));
    }
    
    @Deprecated
    @RecentlyNonNull
    @b0
    @a
    public static boolean p(@RecentlyNonNull final Context context, @RecentlyNonNull final int n) {
        return n == 9 && v(context, "com.android.vending");
    }
    
    @TargetApi(18)
    @RecentlyNonNull
    @a
    public static boolean q(@RecentlyNonNull final Context context) {
        if (v.g()) {
            final Bundle applicationRestrictions = x.k(context.getSystemService("user")).getApplicationRestrictions(context.getPackageName());
            if (applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile"))) {
                return true;
            }
        }
        return false;
    }
    
    @Deprecated
    @RecentlyNonNull
    @b0
    @d0
    @a
    public static boolean r(@RecentlyNonNull final Context context) {
        return com.google.android.gms.common.util.l.e(context);
    }
    
    @Deprecated
    @RecentlyNonNull
    @a
    public static boolean s(@RecentlyNonNull final int n) {
        return n == 1 || n == 2 || n == 3 || n == 9;
    }
    
    @Deprecated
    @TargetApi(19)
    @RecentlyNonNull
    @a
    public static boolean t(@RecentlyNonNull final Context context, @RecentlyNonNull final int n, @RecentlyNonNull final String s) {
        return c0.b(context, n, s);
    }
    
    @d0
    private static int u(final Context context, final boolean b, final int i) {
        x.a(i >= 0);
        final String packageName = context.getPackageName();
        final PackageManager packageManager = context.getPackageManager();
        PackageInfo packageInfo = null;
        Label_0076: {
            if (!b) {
                break Label_0076;
            }
            String s;
            String str;
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
                break Label_0076;
            }
            catch (PackageManager$NameNotFoundException ex2) {
                s = String.valueOf(packageName);
                str = " requires the Google Play Store, but it is missing.";
            }
            while (true) {
                Log.w("GooglePlayServicesUtil", s.concat(str));
                return 9;
                try {
                    final PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
                    m.a(context);
                    if (!m.g(packageInfo2, true)) {
                        s = String.valueOf(packageName);
                        str = " requires Google Play services, but their signature is invalid.";
                        continue;
                    }
                    if (b && (!m.g(x.k(packageInfo), true) || !packageInfo.signatures[0].equals((Object)packageInfo2.signatures[0]))) {
                        s = String.valueOf(packageName);
                        str = " requires Google Play Store, but its signature is invalid.";
                        continue;
                    }
                    if (f0.a(packageInfo2.versionCode) < f0.a(i)) {
                        final int versionCode = packageInfo2.versionCode;
                        final StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 82);
                        sb.append("Google Play services out of date for ");
                        sb.append(packageName);
                        sb.append(".  Requires ");
                        sb.append(i);
                        sb.append(" but found ");
                        sb.append(versionCode);
                        Log.w("GooglePlayServicesUtil", sb.toString());
                        return 2;
                    }
                    ApplicationInfo applicationInfo;
                    if ((applicationInfo = packageInfo2.applicationInfo) == null) {
                        try {
                            applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                        }
                        catch (PackageManager$NameNotFoundException ex) {
                            Log.wtf("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), (Throwable)ex);
                            return 1;
                        }
                    }
                    if (!applicationInfo.enabled) {
                        return 3;
                    }
                    return 0;
                }
                catch (PackageManager$NameNotFoundException ex3) {
                    Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they are missing."));
                    return 1;
                }
                break;
            }
        }
    }
    
    @TargetApi(21)
    static boolean v(final Context context, final String s) {
        final boolean equals = s.equals("com.google.android.gms");
        if (v.j()) {
            try {
                final Iterator<PackageInstaller$SessionInfo> iterator = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
                while (iterator.hasNext()) {
                    if (s.equals(iterator.next().getAppPackageName())) {
                        return true;
                    }
                }
            }
            catch (Exception ex) {
                return false;
            }
        }
        final PackageManager packageManager = context.getPackageManager();
        try {
            final ApplicationInfo applicationInfo = packageManager.getApplicationInfo(s, 8192);
            if (equals) {
                return applicationInfo.enabled;
            }
            if (applicationInfo.enabled && !q(context)) {
                return true;
            }
            return false;
        }
        catch (PackageManager$NameNotFoundException ex2) {
            return false;
        }
    }
}
