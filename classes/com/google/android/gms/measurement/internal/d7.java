// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import androidx.annotation.g0;
import android.annotation.TargetApi;
import android.app.Application$ActivityLifecycleCallbacks;

@TargetApi(14)
@g0
final class d7 implements Application$ActivityLifecycleCallbacks
{
    final /* synthetic */ e7 G;
    
    public final void onActivityCreated(final Activity activity, final Bundle bundle) {
        while (true) {
            try {
                try {
                    this.G.a.c().s().a("onActivityCreated");
                    final Intent intent = activity.getIntent();
                    if (intent != null) {
                        final Uri data = intent.getData();
                        if (data != null) {
                            if (data.isHierarchical()) {
                                this.G.a.M();
                                final String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                                final boolean equals = "android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra);
                                boolean b = true;
                                String s;
                                if (!equals && !"https://www.google.com".equals(stringExtra) && !"android-app://com.google.appcrawler".equals(stringExtra)) {
                                    s = "auto";
                                }
                                else {
                                    s = "gs";
                                }
                                final String queryParameter = data.getQueryParameter("referrer");
                                if (bundle != null) {
                                    b = false;
                                }
                                this.G.a.b().w(new b7(this, b, data, s, queryParameter));
                            }
                        }
                    }
                    this.G.a.I().w(activity, bundle);
                    return;
                }
                finally {}
            }
            catch (RuntimeException ex) {
                this.G.a.c().o().b("Throwable caught in onActivityCreated", ex);
                continue;
            }
            break;
        }
        this.G.a.I().w(activity, bundle);
    }
    
    public final void onActivityDestroyed(final Activity activity) {
        this.G.a.I().x(activity);
    }
    
    @g0
    public final void onActivityPaused(final Activity activity) {
        this.G.a.I().y(activity);
        final j9 k = this.G.a.K();
        k.a.b().w(new c9(k, k.a.F().d()));
    }
    
    @g0
    public final void onActivityResumed(final Activity activity) {
        final j9 k = this.G.a.K();
        k.a.b().w(new b9(k, k.a.F().d()));
        this.G.a.I().z(activity);
    }
    
    public final void onActivitySaveInstanceState(final Activity activity, final Bundle bundle) {
        this.G.a.I().A(activity, bundle);
    }
    
    public final void onActivityStarted(final Activity activity) {
    }
    
    public final void onActivityStopped(final Activity activity) {
    }
}
