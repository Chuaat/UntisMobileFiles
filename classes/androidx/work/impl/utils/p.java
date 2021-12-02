// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl.utils;

import androidx.work.c0;
import androidx.work.impl.foreground.b;
import androidx.work.impl.utils.futures.c;
import androidx.work.l;
import java.util.UUID;
import android.content.Context;
import androidx.annotation.j0;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.s;
import androidx.work.impl.utils.taskexecutor.a;
import androidx.annotation.t0;
import androidx.work.m;

@t0({ t0.a.H })
public class p implements m
{
    private final a a;
    final androidx.work.impl.foreground.a b;
    final s c;
    
    public p(@j0 final WorkDatabase workDatabase, @j0 final androidx.work.impl.foreground.a b, @j0 final a a) {
        this.b = b;
        this.a = a;
        this.c = workDatabase.U();
    }
    
    @j0
    @Override
    public x2.a<Void> a(@j0 final Context context, @j0 final UUID uuid, @j0 final l l) {
        final c<Void> v = androidx.work.impl.utils.futures.c.v();
        this.a.c(new Runnable() {
            @Override
            public void run() {
                try {
                    if (!v.isCancelled()) {
                        final String string = uuid.toString();
                        final c0.a s = p.this.c.s(string);
                        if (s == null || s.b()) {
                            throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                        }
                        p.this.b.a(string, l);
                        context.startService(androidx.work.impl.foreground.b.c(context, string, l));
                    }
                    v.q(null);
                }
                finally {
                    final Throwable t;
                    v.r(t);
                }
            }
        });
        return v;
    }
}
