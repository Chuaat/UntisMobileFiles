// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.messaging;

import java.util.List;
import android.content.pm.PackageManager;
import android.content.Intent;
import com.google.android.gms.common.util.v;
import android.content.pm.PackageManager$NameNotFoundException;
import android.util.Log;
import android.content.pm.PackageInfo;
import com.google.firebase.e;
import d6.a;
import android.content.Context;

class m0
{
    private final Context a;
    @a("this")
    private String b;
    @a("this")
    private String c;
    @a("this")
    private int d;
    @a("this")
    private int e;
    
    m0(final Context a) {
        this.e = 0;
        this.a = a;
    }
    
    static String c(final e e) {
        final String m = e.r().m();
        if (m != null) {
            return m;
        }
        final String j = e.r().j();
        if (!j.startsWith("1:")) {
            return j;
        }
        final String[] split = j.split(":");
        if (split.length < 2) {
            return null;
        }
        final String s = split[1];
        if (s.isEmpty()) {
            return null;
        }
        return s;
    }
    
    private PackageInfo f(final String s) {
        try {
            return this.a.getPackageManager().getPackageInfo(s, 0);
        }
        catch (PackageManager$NameNotFoundException obj) {
            final String value = String.valueOf(obj);
            final StringBuilder sb = new StringBuilder(value.length() + 23);
            sb.append("Failed to find package ");
            sb.append(value);
            Log.w("FirebaseMessaging", sb.toString());
            return null;
        }
    }
    
    private void h() {
        synchronized (this) {
            final PackageInfo f = this.f(this.a.getPackageName());
            if (f != null) {
                this.b = Integer.toString(f.versionCode);
                this.c = f.versionName;
            }
        }
    }
    
    String a() {
        synchronized (this) {
            if (this.b == null) {
                this.h();
            }
            return this.b;
        }
    }
    
    String b() {
        synchronized (this) {
            if (this.c == null) {
                this.h();
            }
            return this.c;
        }
    }
    
    int d() {
        synchronized (this) {
            if (this.d == 0) {
                final PackageInfo f = this.f("com.google.android.gms");
                if (f != null) {
                    this.d = f.versionCode;
                }
            }
            return this.d;
        }
    }
    
    int e() {
        synchronized (this) {
            final int e = this.e;
            if (e != 0) {
                return e;
            }
            final PackageManager packageManager = this.a.getPackageManager();
            if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
                return 0;
            }
            final boolean n = v.n();
            int n2 = 1;
            if (!n) {
                final Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                intent.setPackage("com.google.android.gms");
                final List queryIntentServices = packageManager.queryIntentServices(intent, 0);
                if (queryIntentServices != null) {
                    if (queryIntentServices.size() > 0) {
                        return this.e = 1;
                    }
                }
            }
            final Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
            intent2.setPackage("com.google.android.gms");
            final List queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
            if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
                return this.e = 2;
            }
            Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
            if (v.n()) {
                this.e = 2;
                n2 = 2;
            }
            else {
                this.e = 1;
            }
            return n2;
        }
    }
    
    boolean g() {
        return this.e() != 0;
    }
}
