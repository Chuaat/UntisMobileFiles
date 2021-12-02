// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement;

import androidx.annotation.g0;
import android.app.job.JobParameters;
import androidx.annotation.j0;
import android.content.Intent;
import com.google.android.gms.measurement.internal.a9;
import android.annotation.TargetApi;
import com.google.android.gms.measurement.internal.z8;
import android.app.job.JobService;

@TargetApi(24)
public final class AppMeasurementJobService extends JobService implements z8
{
    private a9<AppMeasurementJobService> G;
    
    private final a9<AppMeasurementJobService> c() {
        if (this.G == null) {
            this.G = new a9<AppMeasurementJobService>(this);
        }
        return this.G;
    }
    
    public final void I(@j0 final Intent intent) {
    }
    
    public final boolean a(final int n) {
        throw new UnsupportedOperationException();
    }
    
    @TargetApi(24)
    public final void b(@j0 final JobParameters jobParameters, final boolean b) {
        this.jobFinished(jobParameters, false);
    }
    
    @g0
    public void onCreate() {
        super.onCreate();
        this.c().e();
    }
    
    @g0
    public void onDestroy() {
        this.c().f();
        super.onDestroy();
    }
    
    @g0
    public void onRebind(@j0 final Intent intent) {
        this.c().g(intent);
    }
    
    public boolean onStartJob(@j0 final JobParameters jobParameters) {
        this.c().i(jobParameters);
        return true;
    }
    
    public boolean onStopJob(@j0 final JobParameters jobParameters) {
        return false;
    }
    
    @g0
    public boolean onUnbind(@j0 final Intent intent) {
        this.c().j(intent);
        return true;
    }
}
