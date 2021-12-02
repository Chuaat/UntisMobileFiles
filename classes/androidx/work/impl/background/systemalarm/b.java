// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl.background.systemalarm;

import androidx.work.impl.WorkDatabase;
import androidx.room.r2;
import androidx.annotation.c1;
import androidx.annotation.k0;
import androidx.work.impl.model.r;
import android.os.Bundle;
import android.content.Intent;
import java.util.HashMap;
import androidx.annotation.j0;
import androidx.work.q;
import java.util.Map;
import android.content.Context;
import androidx.annotation.t0;

@t0({ t0.a.H })
public class b implements androidx.work.impl.b
{
    private static final String J;
    static final String K = "ACTION_SCHEDULE_WORK";
    static final String L = "ACTION_DELAY_MET";
    static final String M = "ACTION_STOP_WORK";
    static final String N = "ACTION_CONSTRAINTS_CHANGED";
    static final String O = "ACTION_RESCHEDULE";
    static final String P = "ACTION_EXECUTION_COMPLETED";
    private static final String Q = "KEY_WORKSPEC_ID";
    private static final String R = "KEY_NEEDS_RESCHEDULE";
    static final long S = 600000L;
    private final Context G;
    private final Map<String, androidx.work.impl.b> H;
    private final Object I;
    
    static {
        J = q.f("CommandHandler");
    }
    
    b(@j0 final Context g) {
        this.G = g;
        this.H = new HashMap<String, androidx.work.impl.b>();
        this.I = new Object();
    }
    
    static Intent a(@j0 final Context context) {
        final Intent intent = new Intent(context, (Class)SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }
    
    static Intent b(@j0 final Context context, @j0 final String s) {
        final Intent intent = new Intent(context, (Class)SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", s);
        return intent;
    }
    
    static Intent c(@j0 final Context context, @j0 final String s, final boolean b) {
        final Intent intent = new Intent(context, (Class)SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", s);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", b);
        return intent;
    }
    
    static Intent e(@j0 final Context context) {
        final Intent intent = new Intent(context, (Class)SystemAlarmService.class);
        intent.setAction("ACTION_RESCHEDULE");
        return intent;
    }
    
    static Intent f(@j0 final Context context, @j0 final String s) {
        final Intent intent = new Intent(context, (Class)SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", s);
        return intent;
    }
    
    static Intent g(@j0 final Context context, @j0 final String s) {
        final Intent intent = new Intent(context, (Class)SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", s);
        return intent;
    }
    
    private void h(@j0 final Intent intent, final int n, @j0 final e e) {
        q.c().a(b.J, String.format("Handling constraints changed %s", intent), new Throwable[0]);
        new c(this.G, n, e).a();
    }
    
    private void i(@j0 final Intent intent, final int n, @j0 final e e) {
        final Bundle extras = intent.getExtras();
        synchronized (this.I) {
            final String string = extras.getString("KEY_WORKSPEC_ID");
            final q c = q.c();
            final String j = b.J;
            c.a(j, String.format("Handing delay met for %s", string), new Throwable[0]);
            if (!this.H.containsKey(string)) {
                final d d = new d(this.G, n, string, e);
                this.H.put(string, d);
                d.e();
            }
            else {
                q.c().a(j, String.format("WorkSpec %s is already being handled for ACTION_DELAY_MET", string), new Throwable[0]);
            }
        }
    }
    
    private void j(@j0 final Intent intent, final int i) {
        final Bundle extras = intent.getExtras();
        final String string = extras.getString("KEY_WORKSPEC_ID");
        final boolean boolean1 = extras.getBoolean("KEY_NEEDS_RESCHEDULE");
        q.c().a(b.J, String.format("Handling onExecutionCompleted %s, %s", intent, i), new Throwable[0]);
        this.d(string, boolean1);
    }
    
    private void k(@j0 final Intent intent, final int i, @j0 final e e) {
        q.c().a(b.J, String.format("Handling reschedule %s, %s", intent, i), new Throwable[0]);
        e.g().R();
    }
    
    private void l(@j0 Intent m, final int n, @j0 final e e) {
        final String string = m.getExtras().getString("KEY_WORKSPEC_ID");
        final q c = q.c();
        final String j = b.J;
        c.a(j, String.format("Handling schedule work for %s", string), new Throwable[0]);
        m = (Intent)e.g().M();
        ((r2)m).e();
        try {
            final r t = ((WorkDatabase)m).U().t(string);
            if (t == null) {
                final q c2 = q.c();
                final StringBuilder sb = new StringBuilder();
                sb.append("Skipping scheduling ");
                sb.append(string);
                sb.append(" because it's no longer in the DB");
                c2.h(j, sb.toString(), new Throwable[0]);
                return;
            }
            if (t.b.b()) {
                final q c3 = q.c();
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Skipping scheduling ");
                sb2.append(string);
                sb2.append("because it is finished.");
                c3.h(j, sb2.toString(), new Throwable[0]);
                return;
            }
            final long a = t.a();
            if (!t.b()) {
                q.c().a(j, String.format("Setting up Alarms for %s at %s", string, a), new Throwable[0]);
                androidx.work.impl.background.systemalarm.a.c(this.G, e.g(), string, a);
            }
            else {
                q.c().a(j, String.format("Opportunistically setting an alarm for %s at %s", string, a), new Throwable[0]);
                androidx.work.impl.background.systemalarm.a.c(this.G, e.g(), string, a);
                e.k(new e.b(e, a(this.G), n));
            }
            ((r2)m).I();
        }
        finally {
            ((r2)m).k();
        }
    }
    
    private void m(@j0 final Intent intent, @j0 final e e) {
        final String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        q.c().a(b.J, String.format("Handing stopWork work for %s", string), new Throwable[0]);
        e.g().X(string);
        a.a(this.G, e.g(), string);
        e.d(string, false);
    }
    
    private static boolean n(@k0 final Bundle bundle, @j0 final String... array) {
        if (bundle != null && !bundle.isEmpty()) {
            for (int length = array.length, i = 0; i < length; ++i) {
                if (bundle.get(array[i]) == null) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    @Override
    public void d(@j0 final String s, final boolean b) {
        synchronized (this.I) {
            final androidx.work.impl.b b2 = this.H.remove(s);
            if (b2 != null) {
                b2.d(s, b);
            }
        }
    }
    
    boolean o() {
        synchronized (this.I) {
            return !this.H.isEmpty();
        }
    }
    
    @c1
    void p(@j0 final Intent intent, final int n, @j0 final e e) {
        final String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            this.h(intent, n, e);
        }
        else if ("ACTION_RESCHEDULE".equals(action)) {
            this.k(intent, n, e);
        }
        else if (!n(intent.getExtras(), "KEY_WORKSPEC_ID")) {
            q.c().b(b.J, String.format("Invalid request for %s, requires %s.", action, "KEY_WORKSPEC_ID"), new Throwable[0]);
        }
        else if ("ACTION_SCHEDULE_WORK".equals(action)) {
            this.l(intent, n, e);
        }
        else if ("ACTION_DELAY_MET".equals(action)) {
            this.i(intent, n, e);
        }
        else if ("ACTION_STOP_WORK".equals(action)) {
            this.m(intent, e);
        }
        else if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
            this.j(intent, n);
        }
        else {
            q.c().h(b.J, String.format("Ignoring intent %s", intent), new Throwable[0]);
        }
    }
}
