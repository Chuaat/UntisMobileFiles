// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl.utils;

import android.content.BroadcastReceiver;
import androidx.work.n;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteAccessPermException;
import androidx.work.impl.i;
import androidx.work.impl.f;
import java.util.Iterator;
import java.util.List;
import androidx.work.impl.model.p;
import androidx.work.impl.model.s;
import androidx.work.impl.WorkDatabase;
import androidx.work.c0;
import androidx.work.impl.model.r;
import androidx.work.impl.background.systemjob.b;
import android.os.Build$VERSION;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import androidx.annotation.j0;
import java.util.concurrent.TimeUnit;
import androidx.work.q;
import androidx.work.impl.j;
import android.content.Context;
import androidx.annotation.b1;
import androidx.annotation.t0;

@t0({ t0.a.H })
public class ForceStopRunnable implements Runnable
{
    private static final String J;
    @b1
    static final String K = "ACTION_FORCE_STOP_RESCHEDULE";
    @b1
    static final int L = 3;
    private static final int M = -1;
    private static final long N = 300L;
    private static final long O;
    private final Context G;
    private final j H;
    private int I;
    
    static {
        J = q.f("ForceStopRunnable");
        O = TimeUnit.DAYS.toMillis(3650L);
    }
    
    public ForceStopRunnable(@j0 final Context context, @j0 final j h) {
        this.G = context.getApplicationContext();
        this.H = h;
        this.I = 0;
    }
    
    @b1
    static Intent c(final Context context) {
        final Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class)BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }
    
    private static PendingIntent d(final Context context, final int n) {
        return PendingIntent.getBroadcast(context, -1, c(context), n);
    }
    
    static void g(final Context context) {
        final AlarmManager alarmManager = (AlarmManager)context.getSystemService("alarm");
        final PendingIntent d = d(context, 134217728);
        final long n = System.currentTimeMillis() + ForceStopRunnable.O;
        if (alarmManager != null) {
            if (Build$VERSION.SDK_INT >= 19) {
                alarmManager.setExact(0, n, d);
            }
            else {
                alarmManager.set(0, n, d);
            }
        }
    }
    
    @b1
    public boolean a() {
        final int sdk_INT = Build$VERSION.SDK_INT;
        boolean b = false;
        final boolean b2 = sdk_INT >= 23 && androidx.work.impl.background.systemjob.b.i(this.G, this.H);
        final WorkDatabase m = this.H.M();
        final s u = m.U();
        final p t = m.T();
        m.e();
        try {
            final List<r> n = u.n();
            final boolean b3 = n != null && !n.isEmpty();
            if (b3) {
                for (final r r : n) {
                    u.a(c0.a.G, r.a);
                    u.c(r.a, -1L);
                }
            }
            t.e();
            m.I();
            m.k();
            if (b3 || b2) {
                b = true;
            }
            return b;
        }
        finally {
            m.k();
        }
    }
    
    @b1
    public void b() {
        final boolean a = this.a();
        if (this.h()) {
            q.c().a(ForceStopRunnable.J, "Rescheduling Workers.", new Throwable[0]);
            this.H.R();
            this.H.I().f(false);
        }
        else if (this.e()) {
            q.c().a(ForceStopRunnable.J, "Application was force-stopped, rescheduling.", new Throwable[0]);
            this.H.R();
        }
        else if (a) {
            q.c().a(ForceStopRunnable.J, "Found unfinished work, scheduling it.", new Throwable[0]);
            f.b(this.H.F(), this.H.M(), this.H.L());
        }
        this.H.Q();
    }
    
    @b1
    public boolean e() {
        if (d(this.G, 536870912) == null) {
            g(this.G);
            return true;
        }
        return false;
    }
    
    @b1
    public boolean f() {
        if (this.H.K() == null) {
            return true;
        }
        final q c = q.c();
        final String j = ForceStopRunnable.J;
        c.a(j, "Found a remote implementation for WorkManager", new Throwable[0]);
        final boolean b = g.b(this.G, this.H.F());
        q.c().a(j, String.format("Is default app process = %s", b), new Throwable[0]);
        return b;
    }
    
    @b1
    boolean h() {
        return this.H.I().c();
    }
    
    @b1
    public void i(final long n) {
        try {
            Thread.sleep(n);
        }
        catch (InterruptedException ex) {}
    }
    
    @Override
    public void run() {
        if (!this.f()) {
            return;
        }
        while (true) {
            i.e(this.G);
            q.c().a(ForceStopRunnable.J, "Performing cleanup operations.", new Throwable[0]);
            try {
                this.b();
                break;
            }
            catch (SQLiteAccessPermException cause) {}
            catch (SQLiteConstraintException cause) {}
            catch (SQLiteTableLockedException cause) {}
            catch (SQLiteDatabaseLockedException cause) {}
            catch (SQLiteDatabaseCorruptException cause) {}
            catch (SQLiteCantOpenDatabaseException ex2) {}
            final int i = this.I + 1;
            this.I = i;
            if (i >= 3) {
                final q c = q.c();
                final String j = ForceStopRunnable.J;
                final SQLiteAccessPermException cause;
                c.b(j, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", (Throwable)cause);
                final IllegalStateException ex = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", (Throwable)cause);
                final n c2 = this.H.F().c();
                if (c2 != null) {
                    q.c().a(j, "Routing exception to the specified exception handler", ex);
                    c2.a(ex);
                    break;
                }
                throw ex;
            }
            else {
                final SQLiteAccessPermException cause;
                q.c().a(ForceStopRunnable.J, String.format("Retrying after %s", i * 300L), (Throwable)cause);
                this.i(this.I * 300L);
            }
        }
    }
    
    @t0({ t0.a.H })
    public static class BroadcastReceiver extends android.content.BroadcastReceiver
    {
        private static final String a;
        
        static {
            a = q.f("ForceStopRunnable$Rcvr");
        }
        
        public void onReceive(final Context context, final Intent intent) {
            if (intent != null && "ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                q.c().g(BroadcastReceiver.a, "Rescheduling alarm that keeps track of force-stops.", new Throwable[0]);
                ForceStopRunnable.g(context);
            }
        }
    }
}
