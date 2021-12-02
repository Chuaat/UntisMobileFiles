// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl.background.systemalarm;

import android.text.TextUtils;
import android.os.PowerManager$WakeLock;
import androidx.work.impl.utils.o;
import androidx.annotation.g0;
import java.util.Iterator;
import androidx.annotation.b1;
import android.os.Looper;
import java.util.ArrayList;
import androidx.annotation.j0;
import androidx.work.q;
import androidx.annotation.k0;
import android.content.Intent;
import java.util.List;
import android.os.Handler;
import androidx.work.impl.j;
import androidx.work.impl.d;
import androidx.work.impl.utils.r;
import androidx.work.impl.utils.taskexecutor.a;
import android.content.Context;
import androidx.annotation.t0;
import androidx.work.impl.b;

@t0({ t0.a.H })
public class e implements androidx.work.impl.b
{
    static final String Q;
    private static final String R = "ProcessCommand";
    private static final String S = "KEY_START_ID";
    private static final int T = 0;
    final Context G;
    private final a H;
    private final r I;
    private final androidx.work.impl.d J;
    private final j K;
    final androidx.work.impl.background.systemalarm.b L;
    private final Handler M;
    final List<Intent> N;
    Intent O;
    @k0
    private c P;
    
    static {
        Q = q.f("SystemAlarmDispatcher");
    }
    
    e(@j0 final Context context) {
        this(context, null, null);
    }
    
    @b1
    e(@j0 final Context context, @k0 androidx.work.impl.d j, @k0 j h) {
        final Context applicationContext = context.getApplicationContext();
        this.G = applicationContext;
        this.L = new androidx.work.impl.background.systemalarm.b(applicationContext);
        this.I = new r();
        if (h == null) {
            h = j.H(context);
        }
        this.K = h;
        if (j == null) {
            j = h.J();
        }
        this.J = j;
        this.H = h.O();
        j.c(this);
        this.N = new ArrayList<Intent>();
        this.O = null;
        this.M = new Handler(Looper.getMainLooper());
    }
    
    private void b() {
        if (this.M.getLooper().getThread() == Thread.currentThread()) {
            return;
        }
        throw new IllegalStateException("Needs to be invoked on the main thread.");
    }
    
    @g0
    private boolean i(@j0 final String s) {
        this.b();
        synchronized (this.N) {
            final Iterator<Intent> iterator = this.N.iterator();
            while (iterator.hasNext()) {
                if (s.equals(iterator.next().getAction())) {
                    return true;
                }
            }
            return false;
        }
    }
    
    @g0
    private void l() {
        this.b();
        final PowerManager$WakeLock b = o.b(this.G, "ProcessCommand");
        try {
            b.acquire();
            this.K.O().c(new Runnable() {
                final /* synthetic */ e G;
                
                @Override
                public void run() {
                    Object o = e.this.N;
                    synchronized (o) {
                        final e g = e.this;
                        g.O = g.N.get(0);
                        // monitorexit(o)
                        o = e.this.O;
                        if (o != null) {
                            o = ((Intent)o).getAction();
                            final int intExtra = e.this.O.getIntExtra("KEY_START_ID", 0);
                            final q c = q.c();
                            final String q = e.Q;
                            c.a(q, String.format("Processing command %s, %s", e.this.O, intExtra), new Throwable[0]);
                            Object o2 = androidx.work.impl.utils.o.b(e.this.G, String.format("%s (%s)", o, intExtra));
                            Label_0323: {
                                final Throwable t2;
                                try {
                                    androidx.work.q.c().a(q, String.format("Acquiring operation wake lock (%s) %s", o, o2), new Throwable[0]);
                                    ((PowerManager$WakeLock)o2).acquire();
                                    final e g2 = e.this;
                                    g2.L.p(g2.O, intExtra, g2);
                                    androidx.work.q.c().a(q, String.format("Releasing operation wake lock (%s) %s", o, o2), new Throwable[0]);
                                    ((PowerManager$WakeLock)o2).release();
                                    o2 = e.this;
                                    o = new d((e)o2);
                                    break Label_0323;
                                }
                                finally {
                                    final q q2 = androidx.work.q.c();
                                    final String s = e.Q;
                                    final q q3 = q2;
                                    final String s2 = s;
                                    final String s3 = "Unexpected error in onHandleIntent";
                                    final int n = 1;
                                    final Throwable[] array = new Throwable[n];
                                    final int n2 = 0;
                                    final Throwable t = t2;
                                    array[n2] = t;
                                    q3.b(s2, s3, array);
                                    final q q4 = androidx.work.q.c();
                                    final String s4 = s;
                                    final String s5 = "Releasing operation wake lock (%s) %s";
                                    final int n3 = 2;
                                    final Object[] array2 = new Object[n3];
                                    final int n4 = 0;
                                    array2[n4] = o;
                                    final int n5 = 1;
                                    final e e = (e)o2;
                                    array2[n5] = e;
                                    final String s6 = String.format(s5, array2);
                                    final int n6 = 0;
                                    final Throwable[] array3 = new Throwable[n6];
                                    q4.a(s4, s6, array3);
                                    final e e2 = (e)o2;
                                    ((PowerManager$WakeLock)e2).release();
                                    final Runnable runnable = this;
                                    o2 = runnable.G;
                                    final e g3 = (e)o2;
                                    final d d = (d)(o = new d(g3));
                                }
                                try {
                                    final q q2 = androidx.work.q.c();
                                    final String s = e.Q;
                                    final q q3 = q2;
                                    final String s2 = s;
                                    final String s3 = "Unexpected error in onHandleIntent";
                                    final int n = 1;
                                    final Throwable[] array = new Throwable[n];
                                    final int n2 = 0;
                                    final Throwable t = t2;
                                    array[n2] = t;
                                    q3.b(s2, s3, array);
                                    final q q4 = androidx.work.q.c();
                                    final String s4 = s;
                                    final String s5 = "Releasing operation wake lock (%s) %s";
                                    final int n3 = 2;
                                    final Object[] array2 = new Object[n3];
                                    final int n4 = 0;
                                    array2[n4] = o;
                                    final int n5 = 1;
                                    final e e = (e)o2;
                                    array2[n5] = e;
                                    final String s6 = String.format(s5, array2);
                                    final int n6 = 0;
                                    final Throwable[] array3 = new Throwable[n6];
                                    q4.a(s4, s6, array3);
                                    final e e2 = (e)o2;
                                    ((PowerManager$WakeLock)e2).release();
                                    final Runnable runnable = this;
                                    final e g3;
                                    o2 = (g3 = runnable.G);
                                    o = new d(g3);
                                    ((e)o2).k((Runnable)o);
                                }
                                finally {
                                    androidx.work.q.c().a(e.Q, String.format("Releasing operation wake lock (%s) %s", o, o2), new Throwable[0]);
                                    ((PowerManager$WakeLock)o2).release();
                                    o = e.this;
                                    ((e)o).k(new d((e)o));
                                }
                            }
                        }
                    }
                }
            });
        }
        finally {
            b.release();
        }
    }
    
    @g0
    public boolean a(@j0 final Intent intent, int i) {
        final q c = q.c();
        final String q = e.Q;
        final int n = 0;
        c.a(q, String.format("Adding command %s (%s)", intent, i), new Throwable[0]);
        this.b();
        final String action = intent.getAction();
        if (TextUtils.isEmpty((CharSequence)action)) {
            androidx.work.q.c().h(q, "Unknown command. Ignoring", new Throwable[0]);
            return false;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && this.i("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        }
        intent.putExtra("KEY_START_ID", i);
        final List<Intent> n2 = this.N;
        // monitorenter(n2)
        i = n;
        try {
            if (!this.N.isEmpty()) {
                i = 1;
            }
            this.N.add(intent);
            if (i == 0) {
                this.l();
            }
            return true;
        }
        finally {
        }
        // monitorexit(n2)
    }
    
    @g0
    void c() {
        final q c = q.c();
        final String q = e.Q;
        c.a(q, "Checking if commands are complete.", new Throwable[0]);
        this.b();
        synchronized (this.N) {
            if (this.O != null) {
                androidx.work.q.c().a(q, String.format("Removing command %s", this.O), new Throwable[0]);
                if (!this.N.remove(0).equals(this.O)) {
                    throw new IllegalStateException("Dequeue-d command is not the first.");
                }
                this.O = null;
            }
            final androidx.work.impl.utils.j d = this.H.d();
            if (!this.L.o() && this.N.isEmpty() && !d.b()) {
                androidx.work.q.c().a(q, "No more commands & intents.", new Throwable[0]);
                final c p = this.P;
                if (p != null) {
                    p.a();
                }
            }
            else if (!this.N.isEmpty()) {
                this.l();
            }
        }
    }
    
    @Override
    public void d(@j0 final String s, final boolean b) {
        this.k(new b(this, b.c(this.G, s, b), 0));
    }
    
    androidx.work.impl.d e() {
        return this.J;
    }
    
    a f() {
        return this.H;
    }
    
    j g() {
        return this.K;
    }
    
    r h() {
        return this.I;
    }
    
    void j() {
        q.c().a(e.Q, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.J.j(this);
        this.I.d();
        this.P = null;
    }
    
    void k(@j0 final Runnable runnable) {
        this.M.post(runnable);
    }
    
    void m(@j0 final c p) {
        if (this.P != null) {
            q.c().b(e.Q, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
            return;
        }
        this.P = p;
    }
    
    static class b implements Runnable
    {
        private final e G;
        private final Intent H;
        private final int I;
        
        b(@j0 final e g, @j0 final Intent h, final int i) {
            this.G = g;
            this.H = h;
            this.I = i;
        }
        
        @Override
        public void run() {
            this.G.a(this.H, this.I);
        }
    }
    
    interface c
    {
        void a();
    }
    
    static class d implements Runnable
    {
        private final e G;
        
        d(@j0 final e g) {
            this.G = g;
        }
        
        @Override
        public void run() {
            this.G.c();
        }
    }
}
