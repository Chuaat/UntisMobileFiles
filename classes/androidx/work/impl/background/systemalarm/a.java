// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl.background.systemalarm;

import android.os.Build$VERSION;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.c;
import android.app.PendingIntent;
import android.app.AlarmManager;
import androidx.work.impl.model.i;
import androidx.work.impl.j;
import androidx.annotation.j0;
import android.content.Context;
import androidx.work.q;
import androidx.annotation.t0;

@t0({ t0.a.H })
class a
{
    private static final String a;
    
    static {
        a = q.f("Alarms");
    }
    
    private a() {
    }
    
    public static void a(@j0 final Context context, @j0 final j j, @j0 final String s) {
        final androidx.work.impl.model.j r = j.M().R();
        final i c = r.c(s);
        if (c != null) {
            b(context, s, c.b);
            q.c().a(androidx.work.impl.background.systemalarm.a.a, String.format("Removing SystemIdInfo for workSpecId (%s)", s), new Throwable[0]);
            r.d(s);
        }
    }
    
    private static void b(@j0 final Context context, @j0 final String s, final int i) {
        final AlarmManager alarmManager = (AlarmManager)context.getSystemService("alarm");
        final PendingIntent service = PendingIntent.getService(context, i, b.b(context, s), 536870912);
        if (service != null && alarmManager != null) {
            q.c().a(androidx.work.impl.background.systemalarm.a.a, String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", s, i), new Throwable[0]);
            alarmManager.cancel(service);
        }
    }
    
    public static void c(@j0 final Context context, @j0 final j j, @j0 final String s, final long n) {
        final WorkDatabase m = j.M();
        final androidx.work.impl.model.j r = m.R();
        final i c = r.c(s);
        int n2;
        if (c != null) {
            b(context, s, c.b);
            n2 = c.b;
        }
        else {
            n2 = new c(m).b();
            r.b(new i(s, n2));
        }
        d(context, s, n2, n);
    }
    
    private static void d(@j0 final Context context, @j0 final String s, final int n, final long n2) {
        final AlarmManager alarmManager = (AlarmManager)context.getSystemService("alarm");
        final PendingIntent service = PendingIntent.getService(context, n, b.b(context, s), 134217728);
        if (alarmManager != null) {
            if (Build$VERSION.SDK_INT >= 19) {
                alarmManager.setExact(0, n2, service);
            }
            else {
                alarmManager.set(0, n2, service);
            }
        }
    }
}
