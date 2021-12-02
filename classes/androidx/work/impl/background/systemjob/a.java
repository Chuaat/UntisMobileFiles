// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl.background.systemjob;

import java.util.Iterator;
import androidx.work.c;
import android.app.job.JobInfo$Builder;
import android.os.PersistableBundle;
import android.app.job.JobInfo;
import android.os.Build$VERSION;
import androidx.work.r;
import android.app.job.JobInfo$TriggerContentUri;
import androidx.work.d;
import androidx.annotation.b1;
import androidx.annotation.j0;
import android.content.Context;
import androidx.work.q;
import android.content.ComponentName;
import androidx.annotation.t0;
import androidx.annotation.p0;

@p0(api = 23)
@t0({ t0.a.H })
class a
{
    private static final String b;
    static final String c = "EXTRA_WORK_SPEC_ID";
    static final String d = "EXTRA_IS_PERIODIC";
    private final ComponentName a;
    
    static {
        b = q.f("SystemJobInfoConverter");
    }
    
    @b1(otherwise = 3)
    a(@j0 final Context context) {
        this.a = new ComponentName(context.getApplicationContext(), (Class)SystemJobService.class);
    }
    
    @p0(24)
    private static JobInfo$TriggerContentUri b(final d.a a) {
        return new JobInfo$TriggerContentUri(a.a(), (int)(a.b() ? 1 : 0));
    }
    
    static int c(final r r) {
        final int n = a$a.a[r.ordinal()];
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        if (n != 3) {
            if (n != 4) {
                if (n == 5) {
                    if (Build$VERSION.SDK_INT >= 26) {
                        return 4;
                    }
                }
            }
            else if (Build$VERSION.SDK_INT >= 24) {
                return 3;
            }
            q.c().a(a.b, String.format("API version too low. Cannot convert network type value %s", r), new Throwable[0]);
            return 1;
        }
        return 2;
    }
    
    JobInfo a(final androidx.work.impl.model.r r, int sdk_INT) {
        final c j = r.j;
        final int c = c(j.b());
        final PersistableBundle extras = new PersistableBundle();
        extras.putString("EXTRA_WORK_SPEC_ID", r.a);
        extras.putBoolean("EXTRA_IS_PERIODIC", r.d());
        final JobInfo$Builder setExtras = new JobInfo$Builder(sdk_INT, this.a).setRequiredNetworkType(c).setRequiresCharging(j.g()).setRequiresDeviceIdle(j.h()).setExtras(extras);
        if (!j.h()) {
            if (r.l == androidx.work.a.H) {
                sdk_INT = 0;
            }
            else {
                sdk_INT = 1;
            }
            setExtras.setBackoffCriteria(r.m, sdk_INT);
        }
        final long max = Math.max(r.a() - System.currentTimeMillis(), 0L);
        sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT > 28 && max <= 0L) {
            setExtras.setImportantWhileForeground(true);
        }
        else {
            setExtras.setMinimumLatency(max);
        }
        if (sdk_INT >= 24 && j.e()) {
            final Iterator<d.a> iterator = j.a().b().iterator();
            while (iterator.hasNext()) {
                setExtras.addTriggerContentUri(b(iterator.next()));
            }
            setExtras.setTriggerContentUpdateDelay(j.c());
            setExtras.setTriggerContentMaxDelay(j.d());
        }
        setExtras.setPersisted(false);
        if (Build$VERSION.SDK_INT >= 26) {
            setExtras.setRequiresBatteryNotLow(j.f());
            setExtras.setRequiresStorageNotLow(j.i());
        }
        return setExtras.build();
    }
}
