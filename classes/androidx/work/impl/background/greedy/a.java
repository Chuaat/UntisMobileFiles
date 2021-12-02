// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl.background.greedy;

import androidx.work.impl.model.r;
import java.util.HashMap;
import androidx.annotation.j0;
import androidx.work.q;
import java.util.Map;
import androidx.work.a0;
import androidx.annotation.t0;

@t0({ t0.a.H })
public class a
{
    static final String d;
    final b a;
    private final a0 b;
    private final Map<String, Runnable> c;
    
    static {
        d = q.f("DelayedWorkTracker");
    }
    
    public a(@j0 final b a, @j0 final a0 b) {
        this.a = a;
        this.b = b;
        this.c = new HashMap<String, Runnable>();
    }
    
    public void a(@j0 final r r) {
        final Runnable runnable = this.c.remove(r.a);
        if (runnable != null) {
            this.b.b(runnable);
        }
        final Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                q.c().a(androidx.work.impl.background.greedy.a.d, String.format("Scheduling work %s", r.a), new Throwable[0]);
                androidx.work.impl.background.greedy.a.this.a.a(r);
            }
        };
        this.c.put(r.a, runnable2);
        this.b.a(r.a() - System.currentTimeMillis(), runnable2);
    }
    
    public void b(@j0 final String s) {
        final Runnable runnable = this.c.remove(s);
        if (runnable != null) {
            this.b.b(runnable);
        }
    }
}
