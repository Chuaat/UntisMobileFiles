// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.crashlytics;

import java.util.Locale;
import android.os.Bundle;
import androidx.annotation.j0;
import androidx.annotation.k0;
import com.google.firebase.crashlytics.internal.analytics.b;
import com.google.firebase.analytics.connector.a;

class f implements b
{
    static final String c = "_o";
    static final String d = "name";
    static final String e = "params";
    static final String f = "clx";
    private com.google.firebase.crashlytics.internal.analytics.b a;
    private com.google.firebase.crashlytics.internal.analytics.b b;
    
    private static void b(@k0 final com.google.firebase.crashlytics.internal.analytics.b b, @j0 final String s, @j0 final Bundle bundle) {
        if (b == null) {
            return;
        }
        b.S(s, bundle);
    }
    
    private void c(@j0 final String s, @j0 final Bundle bundle) {
        com.google.firebase.crashlytics.internal.analytics.b b;
        if ("clx".equals(bundle.getString("_o"))) {
            b = this.a;
        }
        else {
            b = this.b;
        }
        b(b, s, bundle);
    }
    
    @Override
    public void a(final int i, @k0 Bundle bundle) {
        com.google.firebase.crashlytics.internal.f.f().k(String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", i, bundle));
        if (bundle == null) {
            return;
        }
        final String string = bundle.getString("name");
        if (string != null) {
            if ((bundle = bundle.getBundle("params")) == null) {
                bundle = new Bundle();
            }
            this.c(string, bundle);
        }
    }
    
    public void d(@k0 final com.google.firebase.crashlytics.internal.analytics.b b) {
        this.b = b;
    }
    
    public void e(@k0 final com.google.firebase.crashlytics.internal.analytics.b a) {
        this.a = a;
    }
}
