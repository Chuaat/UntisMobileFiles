// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.cloudmessaging;

import java.util.List;
import android.content.pm.PackageManager;
import android.content.Intent;
import com.google.android.gms.common.util.v;
import androidx.annotation.k0;
import android.content.pm.PackageManager$NameNotFoundException;
import android.util.Log;
import com.google.android.gms.common.wrappers.c;
import android.content.pm.PackageInfo;
import d6.a;
import android.content.Context;

public final class w
{
    private final Context a;
    @a("this")
    private int b;
    @a("this")
    private int c;
    
    public w(final Context a) {
        this.c = 0;
        this.a = a;
    }
    
    @k0
    private final PackageInfo b(final String s) {
        try {
            return com.google.android.gms.common.wrappers.c.a(this.a).e(s, 0);
        }
        catch (PackageManager$NameNotFoundException obj) {
            final String value = String.valueOf(obj);
            final StringBuilder sb = new StringBuilder(value.length() + 23);
            sb.append("Failed to find package ");
            sb.append(value);
            Log.w("Metadata", sb.toString());
            return null;
        }
    }
    
    public final int a() {
        synchronized (this) {
            final int c = this.c;
            if (c != 0) {
                return c;
            }
            final PackageManager packageManager = this.a.getPackageManager();
            if (com.google.android.gms.common.wrappers.c.a(this.a).b("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                Log.e("Metadata", "Google Play services missing or without correct permission.");
                return 0;
            }
            if (!v.n()) {
                final Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                intent.setPackage("com.google.android.gms");
                final List queryIntentServices = packageManager.queryIntentServices(intent, 0);
                if (queryIntentServices != null && queryIntentServices.size() > 0) {
                    return this.c = 1;
                }
            }
            final Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
            intent2.setPackage("com.google.android.gms");
            final List queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
            if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
                return this.c = 2;
            }
            Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
            if (v.n()) {
                this.c = 2;
            }
            else {
                this.c = 1;
            }
            return this.c;
        }
    }
    
    public final int c() {
        synchronized (this) {
            if (this.b == 0) {
                final PackageInfo b = this.b("com.google.android.gms");
                if (b != null) {
                    this.b = b.versionCode;
                }
            }
            return this.b;
        }
    }
}
