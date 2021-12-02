// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl;

import java.util.concurrent.ExecutionException;
import androidx.work.WorkerParameters;
import java.util.Iterator;
import androidx.work.impl.utils.o;
import android.content.Intent;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import androidx.annotation.j0;
import androidx.work.q;
import java.util.Set;
import java.util.List;
import java.util.Map;
import android.content.Context;
import androidx.annotation.k0;
import android.os.PowerManager$WakeLock;
import androidx.annotation.t0;
import androidx.work.impl.foreground.a;

@t0({ t0.a.H })
public class d implements b, androidx.work.impl.foreground.a
{
    private static final String R;
    private static final String S = "ProcessorForegroundLck";
    @k0
    private PowerManager$WakeLock G;
    private Context H;
    private androidx.work.b I;
    private androidx.work.impl.utils.taskexecutor.a J;
    private WorkDatabase K;
    private Map<String, l> L;
    private Map<String, l> M;
    private List<e> N;
    private Set<String> O;
    private final List<b> P;
    private final Object Q;
    
    static {
        R = q.f("Processor");
    }
    
    public d(@j0 final Context h, @j0 final androidx.work.b i, @j0 final androidx.work.impl.utils.taskexecutor.a j, @j0 final WorkDatabase k, @j0 final List<e> n) {
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
        this.M = new HashMap<String, l>();
        this.L = new HashMap<String, l>();
        this.N = n;
        this.O = new HashSet<String>();
        this.P = new ArrayList<b>();
        this.G = null;
        this.Q = new Object();
    }
    
    private static boolean f(@j0 final String s, @k0 final l l) {
        if (l != null) {
            l.d();
            q.c().a(d.R, String.format("WorkerWrapper interrupted for %s", s), new Throwable[0]);
            return true;
        }
        q.c().a(d.R, String.format("WorkerWrapper could not be found for %s", s), new Throwable[0]);
        return false;
    }
    
    private void n() {
        synchronized (this.Q) {
            if (!(this.L.isEmpty() ^ true)) {
                final Intent g = androidx.work.impl.foreground.b.g(this.H);
                try {
                    this.H.startService(g);
                }
                finally {
                    final Throwable t;
                    q.c().b(d.R, "Unable to stop foreground service", t);
                }
                final PowerManager$WakeLock g2 = this.G;
                if (g2 != null) {
                    g2.release();
                    this.G = null;
                }
            }
        }
    }
    
    @Override
    public void a(@j0 final String s, @j0 final androidx.work.l l) {
        synchronized (this.Q) {
            q.c().d(d.R, String.format("Moving WorkSpec (%s) to the foreground", s), new Throwable[0]);
            final l i = this.M.remove(s);
            if (i != null) {
                if (this.G == null) {
                    (this.G = o.b(this.H, "ProcessorForegroundLck")).acquire();
                }
                this.L.put(s, i);
                androidx.core.content.d.u(this.H, androidx.work.impl.foreground.b.e(this.H, s, l));
            }
        }
    }
    
    @Override
    public void b(@j0 final String s) {
        synchronized (this.Q) {
            this.L.remove(s);
            this.n();
        }
    }
    
    public void c(@j0 final b b) {
        synchronized (this.Q) {
            this.P.add(b);
        }
    }
    
    @Override
    public void d(@j0 final String s, final boolean b) {
        synchronized (this.Q) {
            this.M.remove(s);
            q.c().a(d.R, String.format("%s %s executed; reschedule = %s", this.getClass().getSimpleName(), s, b), new Throwable[0]);
            final Iterator<b> iterator = this.P.iterator();
            while (iterator.hasNext()) {
                iterator.next().d(s, b);
            }
        }
    }
    
    public boolean e() {
        synchronized (this.Q) {
            return !this.M.isEmpty() || !this.L.isEmpty();
        }
    }
    
    public boolean g(@j0 final String s) {
        synchronized (this.Q) {
            return this.O.contains(s);
        }
    }
    
    public boolean h(@j0 final String s) {
        synchronized (this.Q) {
            return this.M.containsKey(s) || this.L.containsKey(s);
        }
    }
    
    public boolean i(@j0 final String s) {
        synchronized (this.Q) {
            return this.L.containsKey(s);
        }
    }
    
    public void j(@j0 final b b) {
        synchronized (this.Q) {
            this.P.remove(b);
        }
    }
    
    public boolean k(@j0 final String s) {
        return this.l(s, null);
    }
    
    public boolean l(@j0 final String s, @k0 final WorkerParameters.a a) {
        synchronized (this.Q) {
            if (this.h(s)) {
                q.c().a(d.R, String.format("Work %s is already enqueued for processing", s), new Throwable[0]);
                return false;
            }
            final l a2 = new l.c(this.H, this.I, this.J, this, this.K, s).c(this.N).b(a).a();
            final x2.a<Boolean> b = a2.b();
            b.g(new a(this, s, b), this.J.b());
            this.M.put(s, a2);
            // monitorexit(this.Q)
            this.J.d().execute(a2);
            q.c().a(d.R, String.format("%s: processing %s", this.getClass().getSimpleName(), s), new Throwable[0]);
            return true;
        }
    }
    
    public boolean m(@j0 final String s) {
        synchronized (this.Q) {
            final q c = q.c();
            final String r = d.R;
            boolean b = true;
            c.a(r, String.format("Processor cancelling %s", s), new Throwable[0]);
            this.O.add(s);
            final l l = this.L.remove(s);
            if (l == null) {
                b = false;
            }
            l i = l;
            if (l == null) {
                i = this.M.remove(s);
            }
            final boolean f = f(s, i);
            if (b) {
                this.n();
            }
            return f;
        }
    }
    
    public boolean o(@j0 final String s) {
        synchronized (this.Q) {
            q.c().a(d.R, String.format("Processor stopping foreground work %s", s), new Throwable[0]);
            return f(s, this.L.remove(s));
        }
    }
    
    public boolean p(@j0 final String s) {
        synchronized (this.Q) {
            q.c().a(d.R, String.format("Processor stopping background work %s", s), new Throwable[0]);
            return f(s, this.M.remove(s));
        }
    }
    
    private static class a implements Runnable
    {
        @j0
        private b G;
        @j0
        private String H;
        @j0
        private x2.a<Boolean> I;
        
        a(@j0 final b g, @j0 final String h, @j0 final x2.a<Boolean> i) {
            this.G = g;
            this.H = h;
            this.I = i;
        }
        
        @Override
        public void run() {
            boolean booleanValue;
            try {
                booleanValue = this.I.get();
            }
            catch (InterruptedException | ExecutionException ex) {
                booleanValue = true;
            }
            this.G.d(this.H, booleanValue);
        }
    }
}
