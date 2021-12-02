// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common;

import android.annotation.SuppressLint;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.pm.Signature;
import android.util.Log;
import android.content.pm.PackageInfo;
import com.google.android.gms.common.internal.x;
import androidx.annotation.RecentlyNonNull;
import android.content.Context;
import c6.h;
import f2.a;
import com.google.android.gms.common.internal.b0;
import c6.c;

@c
@b0
@a
public class m
{
    @h
    private static m c;
    private final Context a;
    private volatile String b;
    
    private m(final Context context) {
        this.a = context.getApplicationContext();
    }
    
    @RecentlyNonNull
    @a
    public static m a(@RecentlyNonNull final Context context) {
        x.k(context);
        synchronized (m.class) {
            if (m.c == null) {
                w.c(context);
                m.c = new m(context);
            }
            return m.c;
        }
    }
    
    @h
    private static com.google.android.gms.common.x e(final PackageInfo packageInfo, final com.google.android.gms.common.x... array) {
        final Signature[] signatures = packageInfo.signatures;
        if (signatures == null) {
            return null;
        }
        if (signatures.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        final Signature[] signatures2 = packageInfo.signatures;
        int i = 0;
        final a0 a0 = new a0(signatures2[0].toByteArray());
        while (i < array.length) {
            if (array[i].equals(a0)) {
                return array[i];
            }
            ++i;
        }
        return null;
    }
    
    @SuppressLint({ "PackageManagerGetSignatures" })
    private final f0 f(String concat, final boolean b, final boolean b2) {
        String s = "null pkg";
        if (concat == null) {
            return f0.b("null pkg");
        }
        if (concat.equals(this.b)) {
            return f0.a();
        }
        try {
            final PackageInfo packageInfo = this.a.getPackageManager().getPackageInfo(concat, 64);
            final boolean k = l.k(this.a);
            f0 f0 = null;
            Label_0188: {
                Label_0057: {
                    if (packageInfo != null) {
                        final Signature[] signatures = packageInfo.signatures;
                        if (signatures != null && signatures.length == 1) {
                            final a0 a0 = new a0(packageInfo.signatures[0].toByteArray());
                            final String packageName = packageInfo.packageName;
                            f0 = w.a(packageName, a0, k, false);
                            if (f0.a) {
                                final ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                                if (applicationInfo != null && (applicationInfo.flags & 0x2) != 0x0 && w.a(packageName, a0, false, true).a) {
                                    s = "debuggable release cert app rejected";
                                    break Label_0057;
                                }
                            }
                            break Label_0188;
                        }
                        s = "single cert required";
                    }
                }
                f0 = com.google.android.gms.common.f0.b(s);
            }
            if (f0.a) {
                this.b = concat;
            }
            return f0;
        }
        catch (PackageManager$NameNotFoundException ex) {
            if (concat.length() != 0) {
                concat = "no pkg ".concat(concat);
            }
            else {
                concat = new String("no pkg ");
            }
            return f0.c(concat, (Throwable)ex);
        }
    }
    
    @RecentlyNonNull
    public static boolean g(@RecentlyNonNull final PackageInfo packageInfo, @RecentlyNonNull final boolean b) {
        if (packageInfo != null && packageInfo.signatures != null) {
            com.google.android.gms.common.x x;
            if (b) {
                x = e(packageInfo, c0.a);
            }
            else {
                x = e(packageInfo, c0.a[0]);
            }
            if (x != null) {
                return true;
            }
        }
        return false;
    }
    
    @RecentlyNonNull
    @a
    public boolean b(@RecentlyNonNull final PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (g(packageInfo, false)) {
            return true;
        }
        if (g(packageInfo, true)) {
            if (l.k(this.a)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }
    
    @RecentlyNonNull
    @b0
    @a
    public boolean c(@RecentlyNonNull final String s) {
        final f0 f = this.f(s, false, false);
        f.g();
        return f.a;
    }
    
    @RecentlyNonNull
    @b0
    @a
    public boolean d(@RecentlyNonNull int i) {
        final String[] packagesForUid = this.a.getPackageManager().getPackagesForUid(i);
        f0 f0 = null;
        Label_0081: {
            if (packagesForUid != null && packagesForUid.length != 0) {
                f0 = null;
                int length;
                for (length = packagesForUid.length, i = 0; i < length; ++i) {
                    f0 = this.f(packagesForUid[i], false, false);
                    if (f0.a) {
                        break Label_0081;
                    }
                }
                f0 = x.k(f0);
            }
            else {
                f0 = com.google.android.gms.common.f0.b("no pkgs");
            }
        }
        f0.g();
        return f0.a;
    }
}
