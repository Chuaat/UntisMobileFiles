// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.crashlytics;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import com.google.firebase.crashlytics.internal.analytics.e;
import n3.a$a;
import android.os.Bundle;
import java.util.ArrayList;
import androidx.annotation.j0;
import com.google.firebase.crashlytics.internal.analytics.f;
import z2.c;
import androidx.annotation.w;
import java.util.List;
import z2.b;
import n3.a;

public class d
{
    private final a<com.google.firebase.analytics.connector.a> a;
    private volatile com.google.firebase.crashlytics.internal.analytics.a b;
    private volatile b c;
    @w("this")
    private final List<z2.a> d;
    
    public d(final a<com.google.firebase.analytics.connector.a> a) {
        this(a, new c(), new f());
    }
    
    public d(final a<com.google.firebase.analytics.connector.a> a, @j0 final b c, @j0 final com.google.firebase.crashlytics.internal.analytics.a b) {
        this.a = a;
        this.c = c;
        this.d = new ArrayList<z2.a>();
        this.b = b;
        this.f();
    }
    
    private void f() {
        this.a.a((a$a)new com.google.firebase.crashlytics.b(this));
    }
    
    @y2.a
    private static com.google.firebase.analytics.connector.a.a j(@j0 final com.google.firebase.analytics.connector.a a, @j0 final com.google.firebase.crashlytics.f f) {
        Object g;
        if ((g = a.g("clx", (com.google.firebase.analytics.connector.a.b)f)) == null) {
            com.google.firebase.crashlytics.internal.f.f().b("Could not register AnalyticsConnectorListener with Crashlytics origin.");
            final com.google.firebase.analytics.connector.a.a g2 = a.g("crash", (com.google.firebase.analytics.connector.a.b)f);
            if ((g = g2) != null) {
                com.google.firebase.crashlytics.internal.f.f().m("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
                g = g2;
            }
        }
        return (com.google.firebase.analytics.connector.a.a)g;
    }
    
    public com.google.firebase.crashlytics.internal.analytics.a d() {
        return new com.google.firebase.crashlytics.a(this);
    }
    
    public b e() {
        return new com.google.firebase.crashlytics.c(this);
    }
}
