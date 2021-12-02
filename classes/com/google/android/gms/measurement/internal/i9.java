// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.util.d0;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.md;
import android.os.Bundle;
import androidx.annotation.c1;
import android.app.ActivityManager;
import android.app.ActivityManager$RunningAppProcessInfo;

final class i9
{
    final /* synthetic */ j9 a;
    
    i9(final j9 a) {
        this.a = a;
    }
    
    @c1
    final void a() {
        this.a.e();
        if (this.a.a.C().s(this.a.a.F().a())) {
            this.a.a.C().l.a(true);
            final ActivityManager$RunningAppProcessInfo activityManager$RunningAppProcessInfo = new ActivityManager$RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(activityManager$RunningAppProcessInfo);
            if (activityManager$RunningAppProcessInfo.importance == 100) {
                this.a.a.c().s().a("Detected application was in foreground");
                this.c(this.a.a.F().a(), false);
            }
        }
    }
    
    @c1
    final void b(final long n, final boolean b) {
        this.a.e();
        j9.m(this.a);
        if (this.a.a.C().s(n)) {
            this.a.a.C().l.a(true);
        }
        this.a.a.C().o.b(n);
        if (this.a.a.C().l.b()) {
            this.c(n, b);
        }
    }
    
    @c1
    @d0
    final void c(final long n, final boolean b) {
        this.a.e();
        if (!this.a.a.l()) {
            return;
        }
        this.a.a.C().o.b(n);
        this.a.a.c().s().b("Session started, time", this.a.a.F().d());
        final Long value = n / 1000L;
        this.a.a.G().J("auto", "_sid", value, n);
        this.a.a.C().l.a(false);
        final Bundle bundle = new Bundle();
        bundle.putLong("_sid", (long)value);
        if (this.a.a.w().y(null, a3.g0) && b) {
            bundle.putLong("_aib", 1L);
        }
        this.a.a.G().r("auto", "_s", n, bundle);
        md.b();
        if (this.a.a.w().y(null, a3.k0)) {
            final String a = this.a.a.C().t.a();
            if (!TextUtils.isEmpty((CharSequence)a)) {
                final Bundle bundle2 = new Bundle();
                bundle2.putString("_ffr", a);
                this.a.a.G().r("auto", "_ssr", n, bundle2);
            }
        }
    }
}
