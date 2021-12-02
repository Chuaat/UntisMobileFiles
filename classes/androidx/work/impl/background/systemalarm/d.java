// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl.background.systemalarm;

import androidx.annotation.c1;
import java.util.Collections;
import androidx.work.impl.utils.o;
import java.util.List;
import android.content.Intent;
import androidx.annotation.j0;
import androidx.work.q;
import androidx.annotation.k0;
import android.os.PowerManager$WakeLock;
import android.content.Context;
import androidx.annotation.t0;
import androidx.work.impl.utils.r;
import androidx.work.impl.b;
import androidx.work.impl.constraints.c;

@t0({ t0.a.H })
public class d implements c, b, r.b
{
    private static final String P;
    private static final int Q = 0;
    private static final int R = 1;
    private static final int S = 2;
    private final Context G;
    private final int H;
    private final String I;
    private final e J;
    private final androidx.work.impl.constraints.d K;
    private final Object L;
    private int M;
    @k0
    private PowerManager$WakeLock N;
    private boolean O;
    
    static {
        P = q.f("DelayMetCommandHandler");
    }
    
    d(@j0 final Context g, final int h, @j0 final String i, @j0 final e j) {
        this.G = g;
        this.H = h;
        this.J = j;
        this.I = i;
        this.K = new androidx.work.impl.constraints.d(g, j.f(), this);
        this.O = false;
        this.M = 0;
        this.L = new Object();
    }
    
    private void c() {
        synchronized (this.L) {
            this.K.e();
            this.J.h().f(this.I);
            final PowerManager$WakeLock n = this.N;
            if (n != null && n.isHeld()) {
                q.c().a(d.P, String.format("Releasing wakelock %s for WorkSpec %s", this.N, this.I), new Throwable[0]);
                this.N.release();
            }
        }
    }
    
    private void g() {
        synchronized (this.L) {
            if (this.M < 2) {
                this.M = 2;
                final q c = q.c();
                final String p = d.P;
                c.a(p, String.format("Stopping work for WorkSpec %s", this.I), new Throwable[0]);
                final Intent g = b.g(this.G, this.I);
                final e j = this.J;
                j.k(new e.b(j, g, this.H));
                if (this.J.e().h(this.I)) {
                    q.c().a(p, String.format("WorkSpec %s needs to be rescheduled", this.I), new Throwable[0]);
                    final Intent f = b.f(this.G, this.I);
                    final e i = this.J;
                    i.k(new e.b(i, f, this.H));
                }
                else {
                    q.c().a(p, String.format("Processor does not have WorkSpec %s. No need to reschedule ", this.I), new Throwable[0]);
                }
            }
            else {
                q.c().a(d.P, String.format("Already stopped work for %s", this.I), new Throwable[0]);
            }
        }
    }
    
    @Override
    public void a(@j0 final String s) {
        q.c().a(d.P, String.format("Exceeded time limits on execution for %s", s), new Throwable[0]);
        this.g();
    }
    
    @Override
    public void b(@j0 final List<String> list) {
        this.g();
    }
    
    @Override
    public void d(@j0 final String s, final boolean b) {
        q.c().a(d.P, String.format("onExecuted %s, %s", s, b), new Throwable[0]);
        this.c();
        if (b) {
            final Intent f = b.f(this.G, this.I);
            final e j = this.J;
            j.k(new e.b(j, f, this.H));
        }
        if (this.O) {
            final Intent a = b.a(this.G);
            final e i = this.J;
            i.k(new e.b(i, a, this.H));
        }
    }
    
    @c1
    void e() {
        this.N = o.b(this.G, String.format("%s (%s)", this.I, this.H));
        final q c = q.c();
        final String p = d.P;
        c.a(p, String.format("Acquiring wakelock %s for WorkSpec %s", this.N, this.I), new Throwable[0]);
        this.N.acquire();
        final androidx.work.impl.model.r t = this.J.g().M().U().t(this.I);
        if (t == null) {
            this.g();
            return;
        }
        if (!(this.O = t.b())) {
            q.c().a(p, String.format("No constraints for %s", this.I), new Throwable[0]);
            this.f(Collections.singletonList(this.I));
        }
        else {
            this.K.d(Collections.singletonList(t));
        }
    }
    
    @Override
    public void f(@j0 final List<String> list) {
        if (!list.contains(this.I)) {
            return;
        }
        synchronized (this.L) {
            if (this.M == 0) {
                this.M = 1;
                q.c().a(d.P, String.format("onAllConstraintsMet for %s", this.I), new Throwable[0]);
                if (this.J.e().k(this.I)) {
                    this.J.h().e(this.I, 600000L, (r.b)this);
                }
                else {
                    this.c();
                }
            }
            else {
                q.c().a(d.P, String.format("Already started work for %s", this.I), new Throwable[0]);
            }
        }
    }
}
