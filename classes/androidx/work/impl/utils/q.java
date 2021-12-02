// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl.utils;

import androidx.work.impl.model.r;
import androidx.work.impl.model.o;
import androidx.work.c0;
import androidx.work.impl.utils.futures.c;
import androidx.work.f;
import java.util.UUID;
import android.content.Context;
import androidx.annotation.j0;
import androidx.work.impl.utils.taskexecutor.a;
import androidx.work.impl.WorkDatabase;
import androidx.annotation.t0;
import androidx.work.y;

@t0({ t0.a.H })
public class q implements y
{
    static final String c;
    final WorkDatabase a;
    final a b;
    
    static {
        c = androidx.work.q.f("WorkProgressUpdater");
    }
    
    public q(@j0 final WorkDatabase a, @j0 final a b) {
        this.a = a;
        this.b = b;
    }
    
    @j0
    @Override
    public x2.a<Void> a(@j0 final Context context, @j0 final UUID uuid, @j0 final f f) {
        final c<Void> v = androidx.work.impl.utils.futures.c.v();
        this.b.c(new Runnable() {
            @Override
            public void run() {
                final String string = uuid.toString();
                final androidx.work.q c = androidx.work.q.c();
                final String c2 = q.c;
                c.a(c2, String.format("Updating progress for %s (%s)", uuid, f), new Throwable[0]);
                q.this.a.e();
                final Throwable t3;
                try {
                    final r t = q.this.a.U().t(string);
                    if (t != null) {
                        if (t.b == c0.a.H) {
                            q.this.a.T().h(new o(string, f));
                        }
                        else {
                            androidx.work.q.c().h(c2, String.format("Ignoring setProgressAsync(...). WorkSpec (%s) is not in a RUNNING state.", string), new Throwable[0]);
                        }
                        v.q(null);
                        q.this.a.I();
                        return;
                    }
                    throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                finally {
                    final androidx.work.q q = androidx.work.q.c();
                    final String s = androidx.work.impl.utils.q.c;
                    final String s2 = "Error updating Worker progress";
                    final int n = 1;
                    final Throwable[] array = new Throwable[n];
                    final int n2 = 0;
                    final Throwable t2 = t3;
                    array[n2] = t2;
                    q.b(s, s2, array);
                    final Runnable runnable = this;
                    final c c3 = v;
                    final Throwable t4 = t3;
                    c3.r(t4);
                }
                try {
                    final androidx.work.q q = androidx.work.q.c();
                    final String s = androidx.work.impl.utils.q.c;
                    final String s2 = "Error updating Worker progress";
                    final int n = 1;
                    final Throwable[] array = new Throwable[n];
                    final int n2 = 0;
                    final Throwable t2 = t3;
                    array[n2] = t2;
                    q.b(s, s2, array);
                    final Runnable runnable = this;
                    final c c3 = v;
                    final Throwable t4 = t3;
                    c3.r(t4);
                }
                finally {
                    q.this.a.k();
                }
            }
        });
        return v;
    }
}
