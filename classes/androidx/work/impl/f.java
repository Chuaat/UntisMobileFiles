// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl;

import androidx.annotation.k0;
import java.util.Iterator;
import androidx.work.impl.model.s;
import androidx.work.impl.model.r;
import java.util.List;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.background.systemjob.b;
import android.os.Build$VERSION;
import androidx.annotation.j0;
import android.content.Context;
import androidx.work.q;
import androidx.annotation.t0;

@t0({ t0.a.H })
public class f
{
    public static final String a = "androidx.work.impl.background.gcm.GcmScheduler";
    private static final String b;
    
    static {
        b = q.f("Schedulers");
    }
    
    private f() {
    }
    
    @j0
    static e a(@j0 final Context context, @j0 final j j) {
        e c;
        if (Build$VERSION.SDK_INT >= 23) {
            c = new b(context, j);
            androidx.work.impl.utils.e.c(context, SystemJobService.class, true);
            q.c().a(f.b, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
        }
        else if ((c = c(context)) == null) {
            c = new androidx.work.impl.background.systemalarm.f(context);
            androidx.work.impl.utils.e.c(context, SystemAlarmService.class, true);
            q.c().a(f.b, "Created SystemAlarmScheduler", new Throwable[0]);
        }
        return c;
    }
    
    public static void b(@j0 final androidx.work.b b, @j0 WorkDatabase iterator, final List<e> list) {
        if (list != null) {
            if (list.size() != 0) {
                final s u = iterator.U();
                iterator.e();
                try {
                    final List<r> g = u.g(b.g());
                    final List<r> e = u.E(200);
                    if (g != null && g.size() > 0) {
                        final long currentTimeMillis = System.currentTimeMillis();
                        final Iterator<r> iterator2 = g.iterator();
                        while (iterator2.hasNext()) {
                            u.c(iterator2.next().a, currentTimeMillis);
                        }
                    }
                    iterator.I();
                    iterator.k();
                    if (g != null && g.size() > 0) {
                        final r[] array = g.toArray(new r[g.size()]);
                        final Iterator<e> iterator3 = list.iterator();
                        while (iterator3.hasNext()) {
                            iterator = (WorkDatabase)iterator3.next();
                            if (((e)iterator).c()) {
                                ((e)iterator).a(array);
                            }
                        }
                    }
                    if (e != null && e.size() > 0) {
                        final r[] array2 = e.toArray(new r[e.size()]);
                        iterator = (WorkDatabase)list.iterator();
                        while (((Iterator)iterator).hasNext()) {
                            final e e2 = ((Iterator<e>)iterator).next();
                            if (!e2.c()) {
                                e2.a(array2);
                            }
                        }
                    }
                }
                finally {
                    iterator.k();
                }
            }
        }
    }
    
    @k0
    private static e c(@j0 final Context context) {
        try {
            final e e = (e)Class.forName("androidx.work.impl.background.gcm.GcmScheduler").getConstructor(Context.class).newInstance(context);
            q.c().a(f.b, String.format("Created %s", "androidx.work.impl.background.gcm.GcmScheduler"), new Throwable[0]);
            return e;
        }
        finally {
            final Throwable t;
            q.c().a(f.b, "Unable to create GCM Scheduler", t);
            return null;
        }
    }
}
