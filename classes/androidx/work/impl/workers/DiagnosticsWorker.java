// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl.workers;

import androidx.work.impl.model.s;
import androidx.work.impl.WorkDatabase;
import java.util.concurrent.TimeUnit;
import androidx.work.ListenableWorker;
import androidx.work.impl.model.i;
import java.util.Iterator;
import android.text.TextUtils;
import android.os.Build$VERSION;
import java.util.List;
import androidx.work.impl.model.j;
import androidx.work.impl.model.v;
import androidx.work.impl.model.m;
import androidx.annotation.k0;
import androidx.work.impl.model.r;
import androidx.work.WorkerParameters;
import androidx.annotation.j0;
import android.content.Context;
import androidx.work.q;
import androidx.annotation.t0;
import androidx.work.Worker;

@t0({ t0.a.H })
public class DiagnosticsWorker extends Worker
{
    private static final String a;
    
    static {
        a = q.f("DiagnosticsWrkr");
    }
    
    public DiagnosticsWorker(@j0 final Context context, @j0 final WorkerParameters workerParameters) {
        super(context, workerParameters);
    }
    
    @j0
    private static String a(@j0 final r r, @k0 final String s, @k0 final Integer n, @j0 final String s2) {
        return String.format("\n%s\t %s\t %s\t %s\t %s\t %s\t", r.a, r.c, n, r.b.name(), s, s2);
    }
    
    @j0
    private static String c(@j0 final m m, @j0 final v v, @j0 final j j, @j0 final List<r> list) {
        final StringBuilder sb = new StringBuilder();
        String s;
        if (Build$VERSION.SDK_INT >= 23) {
            s = "Job Id";
        }
        else {
            s = "Alarm Id";
        }
        sb.append(String.format("\n Id \t Class Name\t %s\t State\t Unique Name\t Tags\t", s));
        for (final r r : list) {
            Integer value = null;
            final i c = j.c(r.a);
            if (c != null) {
                value = c.b;
            }
            sb.append(a(r, TextUtils.join((CharSequence)",", (Iterable)m.c(r.a)), value, TextUtils.join((CharSequence)",", (Iterable)v.b(r.a))));
        }
        return sb.toString();
    }
    
    @j0
    @Override
    public ListenableWorker.a doWork() {
        final WorkDatabase m = androidx.work.impl.j.H(this.getApplicationContext()).M();
        final s u = m.U();
        final m s = m.S();
        final v v = m.V();
        final j r = m.R();
        final List<r> f = u.f(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L));
        final List<r> n = u.n();
        final List<r> e = u.E(200);
        if (f != null && !f.isEmpty()) {
            final q c = q.c();
            final String a = DiagnosticsWorker.a;
            c.d(a, "Recently completed work:\n\n", new Throwable[0]);
            q.c().d(a, c(s, v, r, f), new Throwable[0]);
        }
        if (n != null && !n.isEmpty()) {
            final q c2 = q.c();
            final String a2 = DiagnosticsWorker.a;
            c2.d(a2, "Running work:\n\n", new Throwable[0]);
            q.c().d(a2, c(s, v, r, n), new Throwable[0]);
        }
        if (e != null && !e.isEmpty()) {
            final q c3 = q.c();
            final String a3 = DiagnosticsWorker.a;
            c3.d(a3, "Enqueued work:\n\n", new Throwable[0]);
            q.c().d(a3, c(s, v, r, e), new Throwable[0]);
        }
        return ListenableWorker.a.d();
    }
}
