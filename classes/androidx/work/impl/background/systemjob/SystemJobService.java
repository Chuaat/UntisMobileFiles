// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl.background.systemjob;

import java.util.Arrays;
import androidx.work.WorkerParameters;
import android.os.Build$VERSION;
import android.text.TextUtils;
import android.app.Application;
import androidx.annotation.k0;
import android.os.PersistableBundle;
import androidx.annotation.j0;
import java.util.HashMap;
import androidx.work.q;
import android.app.job.JobParameters;
import java.util.Map;
import androidx.work.impl.j;
import androidx.annotation.t0;
import androidx.annotation.p0;
import androidx.work.impl.b;
import android.app.job.JobService;

@p0(23)
@t0({ t0.a.H })
public class SystemJobService extends JobService implements b
{
    private static final String I;
    private j G;
    private final Map<String, JobParameters> H;
    
    static {
        I = q.f("SystemJobService");
    }
    
    public SystemJobService() {
        this.H = new HashMap<String, JobParameters>();
    }
    
    @k0
    private static String a(@j0 final JobParameters jobParameters) {
        try {
            final PersistableBundle extras = jobParameters.getExtras();
            if (extras != null && extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return extras.getString("EXTRA_WORK_SPEC_ID");
            }
            return null;
        }
        catch (NullPointerException ex) {
            return null;
        }
    }
    
    public void d(@j0 final String s, final boolean b) {
        q.c().a(SystemJobService.I, String.format("%s executed on JobScheduler", s), new Throwable[0]);
        synchronized (this.H) {
            final JobParameters jobParameters = this.H.remove(s);
            // monitorexit(this.H)
            if (jobParameters != null) {
                this.jobFinished(jobParameters, b);
            }
        }
    }
    
    public void onCreate() {
        super.onCreate();
        try {
            final j h = j.H(this.getApplicationContext());
            this.G = h;
            h.J().c(this);
        }
        catch (IllegalStateException ex) {
            if (!Application.class.equals(this.getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            q.c().h(SystemJobService.I, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
        }
    }
    
    public void onDestroy() {
        super.onDestroy();
        final j g = this.G;
        if (g != null) {
            g.J().j(this);
        }
    }
    
    public boolean onStartJob(@j0 final JobParameters jobParameters) {
        if (this.G == null) {
            q.c().a(SystemJobService.I, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            this.jobFinished(jobParameters, true);
            return false;
        }
        final String a = a(jobParameters);
        if (TextUtils.isEmpty((CharSequence)a)) {
            q.c().b(SystemJobService.I, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        Object h = this.H;
        synchronized (h) {
            if (this.H.containsKey(a)) {
                q.c().a(SystemJobService.I, String.format("Job is already being executed by SystemJobService: %s", a), new Throwable[0]);
                return false;
            }
            q.c().a(SystemJobService.I, String.format("onStartJob for %s", a), new Throwable[0]);
            this.H.put(a, jobParameters);
            // monitorexit(h)
            h = null;
            final int sdk_INT = Build$VERSION.SDK_INT;
            if (sdk_INT >= 24) {
                final WorkerParameters.a a2 = new WorkerParameters.a();
                if (jobParameters.getTriggeredContentUris() != null) {
                    a2.b = Arrays.asList(jobParameters.getTriggeredContentUris());
                }
                if (jobParameters.getTriggeredContentAuthorities() != null) {
                    a2.a = Arrays.asList(jobParameters.getTriggeredContentAuthorities());
                }
                h = a2;
                if (sdk_INT >= 28) {
                    a2.c = jobParameters.getNetwork();
                    h = a2;
                }
            }
            this.G.V(a, (WorkerParameters.a)h);
            return true;
        }
    }
    
    public boolean onStopJob(@j0 final JobParameters jobParameters) {
        if (this.G == null) {
            q.c().a(SystemJobService.I, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            return true;
        }
        final String a = a(jobParameters);
        if (TextUtils.isEmpty((CharSequence)a)) {
            q.c().b(SystemJobService.I, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        q.c().a(SystemJobService.I, String.format("onStopJob for %s", a), new Throwable[0]);
        synchronized (this.H) {
            this.H.remove(a);
            // monitorexit(this.H)
            this.G.X(a);
            return this.G.J().g(a) ^ true;
        }
    }
}
