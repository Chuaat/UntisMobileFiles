// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.wrappers;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import com.google.android.gms.common.util.v;
import android.os.Process;
import android.os.Binder;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.pm.ApplicationInfo;
import androidx.annotation.RecentlyNonNull;
import android.content.Context;
import f2.a;

@a
public class b
{
    private final Context a;
    
    public b(@RecentlyNonNull final Context a) {
        this.a = a;
    }
    
    @RecentlyNonNull
    @a
    public int a(@RecentlyNonNull final String s) {
        return this.a.checkCallingOrSelfPermission(s);
    }
    
    @RecentlyNonNull
    @a
    public int b(@RecentlyNonNull final String s, @RecentlyNonNull final String s2) {
        return this.a.getPackageManager().checkPermission(s, s2);
    }
    
    @RecentlyNonNull
    @a
    public ApplicationInfo c(@RecentlyNonNull final String s, @RecentlyNonNull final int n) throws PackageManager$NameNotFoundException {
        return this.a.getPackageManager().getApplicationInfo(s, n);
    }
    
    @RecentlyNonNull
    @a
    public CharSequence d(@RecentlyNonNull final String s) throws PackageManager$NameNotFoundException {
        return this.a.getPackageManager().getApplicationLabel(this.a.getPackageManager().getApplicationInfo(s, 0));
    }
    
    @RecentlyNonNull
    @a
    public PackageInfo e(@RecentlyNonNull final String s, @RecentlyNonNull final int n) throws PackageManager$NameNotFoundException {
        return this.a.getPackageManager().getPackageInfo(s, n);
    }
    
    @RecentlyNonNull
    @a
    public boolean f() {
        if (Binder.getCallingUid() == Process.myUid()) {
            return com.google.android.gms.common.wrappers.a.a(this.a);
        }
        if (v.n()) {
            final String nameForUid = this.a.getPackageManager().getNameForUid(Binder.getCallingUid());
            if (nameForUid != null) {
                return this.a.getPackageManager().isInstantApp(nameForUid);
            }
        }
        return false;
    }
    
    @TargetApi(19)
    @RecentlyNonNull
    public final boolean g(@RecentlyNonNull int i, @RecentlyNonNull final String s) {
        if (v.h()) {
            try {
                final AppOpsManager appOpsManager = (AppOpsManager)this.a.getSystemService("appops");
                if (appOpsManager != null) {
                    appOpsManager.checkPackage(i, s);
                    return true;
                }
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            catch (SecurityException ex) {
                return false;
            }
        }
        final String[] packagesForUid = this.a.getPackageManager().getPackagesForUid(i);
        if (s != null && packagesForUid != null) {
            for (i = 0; i < packagesForUid.length; ++i) {
                if (s.equals(packagesForUid[i])) {
                    return true;
                }
            }
        }
        return false;
    }
}
