// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import androidx.annotation.b1;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;
import android.util.Base64;
import android.os.PersistableBundle;
import android.app.job.JobInfo$Builder;
import z1.a;
import android.content.ComponentName;
import com.google.android.datatransport.runtime.o;
import java.util.Iterator;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import com.google.android.datatransport.runtime.scheduling.persistence.c;
import android.content.Context;
import androidx.annotation.p0;

@p0(api = 21)
public class e implements s
{
    private static final String d = "JobInfoScheduler";
    static final String e = "attemptNumber";
    static final String f = "backendName";
    static final String g = "priority";
    static final String h = "extras";
    private final Context a;
    private final c b;
    private final g c;
    
    public e(final Context a, final c b, final g c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    private boolean d(final JobScheduler jobScheduler, final int n, final int n2) {
        final Iterator iterator = jobScheduler.getAllPendingJobs().iterator();
        JobInfo jobInfo;
        boolean b;
        int int1;
        do {
            final boolean hasNext = iterator.hasNext();
            b = false;
            if (!hasNext) {
                return b;
            }
            jobInfo = iterator.next();
            int1 = jobInfo.getExtras().getInt("attemptNumber");
        } while (jobInfo.getId() != n);
        b = b;
        if (int1 >= n2) {
            b = true;
            return b;
        }
        return b;
    }
    
    @Override
    public void a(final o o, final int n) {
        this.b(o, n, false);
    }
    
    @Override
    public void b(final o o, final int i, final boolean b) {
        final ComponentName componentName = new ComponentName(this.a, (Class)JobInfoSchedulerService.class);
        final JobScheduler jobScheduler = (JobScheduler)this.a.getSystemService("jobscheduler");
        final int c = this.c(o);
        if (!b && this.d(jobScheduler, c, i)) {
            z1.a.b("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", o);
            return;
        }
        final long t4 = this.b.T4(o);
        final JobInfo$Builder c2 = this.c.c(new JobInfo$Builder(c, componentName), o.d(), t4, i);
        final PersistableBundle extras = new PersistableBundle();
        extras.putInt("attemptNumber", i);
        extras.putString("backendName", o.b());
        extras.putInt("priority", com.google.android.datatransport.runtime.util.a.a(o.d()));
        if (o.c() != null) {
            extras.putString("extras", Base64.encodeToString(o.c(), 0));
        }
        c2.setExtras(extras);
        z1.a.d("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", o, c, this.c.h(o.d(), t4, i), t4, i);
        jobScheduler.schedule(c2.build());
    }
    
    @b1
    int c(final o o) {
        final Adler32 adler32 = new Adler32();
        adler32.update(this.a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(o.b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(com.google.android.datatransport.runtime.util.a.a(o.d())).array());
        if (o.c() != null) {
            adler32.update(o.c());
        }
        return (int)adler32.getValue();
    }
}
