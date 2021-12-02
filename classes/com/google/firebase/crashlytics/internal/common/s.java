// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.crashlytics.internal.common;

import com.google.android.gms.tasks.m;
import android.annotation.SuppressLint;
import android.content.SharedPreferences$Editor;
import android.os.Bundle;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import com.google.firebase.crashlytics.internal.f;
import android.content.Context;
import androidx.annotation.k0;
import com.google.android.gms.tasks.n;
import com.google.firebase.e;
import android.content.SharedPreferences;

public class s
{
    private static final String i = "firebase_crashlytics_collection_enabled";
    private final SharedPreferences a;
    private final e b;
    private final Object c;
    n<Void> d;
    boolean e;
    private boolean f;
    @k0
    private Boolean g;
    private final n<Void> h;
    
    public s(final e b) {
        final Object c = new Object();
        this.c = c;
        this.d = new n<Void>();
        this.e = false;
        this.f = false;
        this.h = new n<Void>();
        final Context m = b.m();
        this.b = b;
        this.a = com.google.firebase.crashlytics.internal.common.g.s(m);
        Boolean g;
        if ((g = this.b()) == null) {
            g = this.a(m);
        }
        this.g = g;
        synchronized (c) {
            if (this.d()) {
                this.d.e(null);
                this.e = true;
            }
        }
    }
    
    @k0
    private Boolean a(final Context context) {
        final Boolean f = f(context);
        if (f == null) {
            this.f = false;
            return null;
        }
        this.f = true;
        return Boolean.TRUE.equals(f);
    }
    
    @k0
    private Boolean b() {
        if (this.a.contains("firebase_crashlytics_collection_enabled")) {
            this.f = false;
            return this.a.getBoolean("firebase_crashlytics_collection_enabled", true);
        }
        return null;
    }
    
    private void e(final boolean b) {
        String s;
        if (b) {
            s = "ENABLED";
        }
        else {
            s = "DISABLED";
        }
        String s2;
        if (this.g == null) {
            s2 = "global Firebase setting";
        }
        else if (this.f) {
            s2 = "firebase_crashlytics_collection_enabled manifest flag";
        }
        else {
            s2 = "API";
        }
        com.google.firebase.crashlytics.internal.f.f().b(String.format("Crashlytics automatic data collection %s by %s.", s, s2));
    }
    
    @k0
    private static Boolean f(final Context context) {
        try {
            final PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                final ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128);
                if (applicationInfo != null) {
                    final Bundle metaData = applicationInfo.metaData;
                    if (metaData != null && metaData.containsKey("firebase_crashlytics_collection_enabled")) {
                        return applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled");
                    }
                }
            }
        }
        catch (PackageManager$NameNotFoundException ex) {
            f.f().e("Could not read data collection permission from manifest", (Throwable)ex);
        }
        return null;
    }
    
    @SuppressLint({ "ApplySharedPref" })
    private static void h(final SharedPreferences sharedPreferences, final Boolean b) {
        final SharedPreferences$Editor edit = sharedPreferences.edit();
        if (b != null) {
            edit.putBoolean("firebase_crashlytics_collection_enabled", (boolean)b);
        }
        else {
            edit.remove("firebase_crashlytics_collection_enabled");
        }
        edit.commit();
    }
    
    public void c(final boolean b) {
        if (b) {
            this.h.e(null);
            return;
        }
        throw new IllegalStateException("An invalid data collection token was used.");
    }
    
    public boolean d() {
        synchronized (this) {
            final Boolean g = this.g;
            boolean b;
            if (g != null) {
                b = g;
            }
            else {
                b = this.b.z();
            }
            this.e(b);
            return b;
        }
    }
    
    public void g(@k0 final Boolean b) {
        // monitorenter(this)
        Label_0125: {
            if (b != null) {
                try {
                    this.f = false;
                }
                finally {
                    break Label_0125;
                }
            }
            Boolean a;
            if (b != null) {
                a = b;
            }
            else {
                a = this.a(this.b.m());
            }
            this.g = a;
            h(this.a, b);
            synchronized (this.c) {
                if (this.d()) {
                    if (!this.e) {
                        this.d.e(null);
                        this.e = true;
                    }
                }
                else if (this.e) {
                    this.d = new n<Void>();
                    this.e = false;
                }
                // monitorexit(this.c)
                return;
            }
        }
    }
    // monitorexit(this)
    
    public m<Void> i() {
        synchronized (this.c) {
            return this.d.a();
        }
    }
    
    public m<Void> j() {
        return com.google.firebase.crashlytics.internal.common.k0.e(this.h.a(), this.i());
    }
}
