// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.os.IBinder;
import androidx.annotation.g0;
import android.content.Intent;
import com.google.android.gms.internal.measurement.o1;
import com.google.android.gms.common.internal.x;

public final class a9<T extends Context>
{
    private final T a;
    
    public a9(final T a) {
        x.k(a);
        this.a = a;
    }
    
    private final n3 k() {
        return z4.E((Context)this.a, null, null).c();
    }
    
    @g0
    public final int a(final Intent intent, final int n, final int i) {
        final z4 e = z4.E((Context)this.a, null, null);
        final n3 c = e.c();
        if (intent == null) {
            c.t().a("AppMeasurementService started with null intent");
            return 2;
        }
        final String action = intent.getAction();
        e.L();
        c.s().c("Local AppMeasurementService called. startId, action", i, action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            this.h(new w8(this, i, c, intent));
        }
        return 2;
    }
    
    @g0
    public final IBinder b(final Intent intent) {
        if (intent == null) {
            this.k().o().a("onBind called with null intent");
            return null;
        }
        final String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return (IBinder)new s5(z9.e0((Context)this.a), null);
        }
        this.k().t().b("onBind received unknown action", action);
        return null;
    }
    
    @g0
    public final void e() {
        final z4 e = z4.E((Context)this.a, null, null);
        final n3 c = e.c();
        e.L();
        c.s().a("Local AppMeasurementService is starting up");
    }
    
    @g0
    public final void f() {
        final z4 e = z4.E((Context)this.a, null, null);
        final n3 c = e.c();
        e.L();
        c.s().a("Local AppMeasurementService is shutting down");
    }
    
    @g0
    public final void g(final Intent intent) {
        if (intent == null) {
            this.k().o().a("onRebind called with null intent");
            return;
        }
        this.k().s().b("onRebind called. action", intent.getAction());
    }
    
    public final void h(final Runnable runnable) {
        final z9 e0 = z9.e0((Context)this.a);
        e0.b().w(new y8(this, e0, runnable));
    }
    
    @TargetApi(24)
    @g0
    public final boolean i(final JobParameters jobParameters) {
        final z4 e = z4.E((Context)this.a, null, null);
        final n3 c = e.c();
        final String string = jobParameters.getExtras().getString("action");
        e.L();
        c.s().b("Local AppMeasurementJobService called. action", string);
        if ("com.google.android.gms.measurement.UPLOAD".equals(string)) {
            this.h(new x8(this, c, jobParameters));
        }
        return true;
    }
    
    @g0
    public final boolean j(final Intent intent) {
        if (intent == null) {
            this.k().o().a("onUnbind called with null intent");
            return true;
        }
        this.k().s().b("onUnbind called for intent. action", intent.getAction());
        return true;
    }
}
