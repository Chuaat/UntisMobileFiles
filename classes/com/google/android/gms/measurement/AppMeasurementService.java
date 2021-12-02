// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement;

import androidx.annotation.g0;
import android.os.IBinder;
import android.app.job.JobParameters;
import androidx.legacy.content.a;
import androidx.annotation.j0;
import android.content.Intent;
import com.google.android.gms.measurement.internal.a9;
import com.google.android.gms.measurement.internal.z8;
import android.app.Service;

public final class AppMeasurementService extends Service implements z8
{
    private a9<AppMeasurementService> G;
    
    private final a9<AppMeasurementService> c() {
        if (this.G == null) {
            this.G = new a9<AppMeasurementService>(this);
        }
        return this.G;
    }
    
    public final void I(@j0 final Intent intent) {
        a.b(intent);
    }
    
    public final boolean a(final int n) {
        return this.stopSelfResult(n);
    }
    
    public final void b(@j0 final JobParameters jobParameters, final boolean b) {
        throw new UnsupportedOperationException();
    }
    
    @g0
    @j0
    public IBinder onBind(@j0 final Intent intent) {
        return this.c().b(intent);
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
    
    @g0
    public int onStartCommand(@j0 final Intent intent, final int n, final int n2) {
        this.c().a(intent, n, n2);
        return 2;
    }
    
    @g0
    public boolean onUnbind(@j0 final Intent intent) {
        this.c().j(intent);
        return true;
    }
}
