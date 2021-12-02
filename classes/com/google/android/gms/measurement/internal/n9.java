// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.v0;
import android.app.job.JobInfo$Builder;
import android.os.PersistableBundle;
import android.content.ComponentName;
import android.os.Build$VERSION;
import android.annotation.TargetApi;
import android.app.job.JobScheduler;
import android.content.Context;
import com.google.android.gms.internal.measurement.u0;
import android.content.Intent;
import android.app.PendingIntent;
import android.app.AlarmManager;

public final class n9 extends p9
{
    private final AlarmManager d;
    private n e;
    private Integer f;
    
    protected n9(final z9 z9) {
        super(z9);
        this.d = (AlarmManager)super.a.X().getSystemService("alarm");
    }
    
    private final int l() {
        if (this.f == null) {
            final String value = String.valueOf(super.a.X().getPackageName());
            String concat;
            if (value.length() != 0) {
                concat = "measurement".concat(value);
            }
            else {
                concat = new String("measurement");
            }
            this.f = concat.hashCode();
        }
        return this.f;
    }
    
    private final PendingIntent m() {
        final Context x = super.a.X();
        return u0.a(x, 0, new Intent().setClassName(x, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), u0.a);
    }
    
    private final n n() {
        if (this.e == null) {
            this.e = new m9(this, super.b.b0());
        }
        return this.e;
    }
    
    @TargetApi(24)
    private final void o() {
        final JobScheduler jobScheduler = (JobScheduler)super.a.X().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(this.l());
        }
    }
    
    @Override
    protected final boolean i() {
        final AlarmManager d = this.d;
        if (d != null) {
            d.cancel(this.m());
        }
        if (Build$VERSION.SDK_INT >= 24) {
            this.o();
        }
        return false;
    }
    
    public final void j() {
        this.f();
        super.a.c().s().a("Unscheduling upload");
        final AlarmManager d = this.d;
        if (d != null) {
            d.cancel(this.m());
        }
        this.n().b();
        if (Build$VERSION.SDK_INT >= 24) {
            this.o();
        }
    }
    
    public final void k(final long b) {
        this.f();
        super.a.L();
        final Context x = super.a.X();
        if (!ga.W(x)) {
            super.a.c().n().a("Receiver not registered/enabled");
        }
        if (!ga.Y(x, false)) {
            super.a.c().n().a("Service not registered/enabled");
        }
        this.j();
        super.a.c().s().b("Scheduling upload, millis", b);
        final long d = super.a.F().d();
        super.a.w();
        if (b < Math.max(0L, a3.y.a(null)) && !this.n().e()) {
            this.n().d(b);
        }
        super.a.L();
        if (Build$VERSION.SDK_INT >= 24) {
            final Context x2 = super.a.X();
            final ComponentName componentName = new ComponentName(x2, "com.google.android.gms.measurement.AppMeasurementJobService");
            final int l = this.l();
            final PersistableBundle extras = new PersistableBundle();
            extras.putString("action", "com.google.android.gms.measurement.UPLOAD");
            v0.a(x2, new JobInfo$Builder(l, componentName).setMinimumLatency(b).setOverrideDeadline(b + b).setExtras(extras).build(), "com.google.android.gms", "UploadAlarm");
            return;
        }
        final AlarmManager d2 = this.d;
        if (d2 != null) {
            super.a.w();
            d2.setInexactRepeating(2, d + b, Math.max(a3.t.a(null), b), this.m());
        }
    }
}
