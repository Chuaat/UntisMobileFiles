// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.util.Base64;
import com.google.android.datatransport.runtime.util.a;
import com.google.android.datatransport.runtime.o;
import com.google.android.datatransport.runtime.t;
import android.app.job.JobParameters;
import androidx.annotation.p0;
import android.app.job.JobService;

@p0(api = 21)
public class JobInfoSchedulerService extends JobService
{
    public boolean onStartJob(final JobParameters jobParameters) {
        final String string = jobParameters.getExtras().getString("backendName");
        final String string2 = jobParameters.getExtras().getString("extras");
        final int int1 = jobParameters.getExtras().getInt("priority");
        final int int2 = jobParameters.getExtras().getInt("attemptNumber");
        t.f(this.getApplicationContext());
        final o.a d = o.a().b(string).d(a.b(int1));
        if (string2 != null) {
            d.c(Base64.decode(string2, 0));
        }
        t.c().e().k(d.a(), int2, new f(this, jobParameters));
        return true;
    }
    
    public boolean onStopJob(final JobParameters jobParameters) {
        return true;
    }
}
