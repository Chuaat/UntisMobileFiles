// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl;

import androidx.annotation.c1;
import androidx.annotation.b1;
import androidx.work.o;
import java.util.concurrent.Executor;
import android.annotation.SuppressLint;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import androidx.work.m;
import androidx.work.y;
import androidx.work.impl.utils.p;
import java.util.UUID;
import androidx.work.f;
import java.util.ArrayList;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.Collection;
import androidx.work.c0;
import java.util.LinkedList;
import java.util.Iterator;
import androidx.work.q;
import androidx.annotation.k0;
import androidx.work.impl.utils.futures.c;
import androidx.work.impl.model.v;
import androidx.work.impl.model.s;
import androidx.work.impl.utils.taskexecutor.a;
import androidx.work.b;
import androidx.annotation.j0;
import androidx.work.ListenableWorker;
import androidx.work.impl.model.r;
import androidx.work.WorkerParameters;
import java.util.List;
import android.content.Context;
import androidx.annotation.t0;

@t0({ t0.a.H })
public class l implements Runnable
{
    static final String Z;
    Context G;
    private String H;
    private List<e> I;
    private WorkerParameters.a J;
    r K;
    ListenableWorker L;
    @j0
    ListenableWorker.a M;
    private b N;
    private a O;
    private androidx.work.impl.foreground.a P;
    private WorkDatabase Q;
    private s R;
    private androidx.work.impl.model.b S;
    private v T;
    private List<String> U;
    private String V;
    @j0
    androidx.work.impl.utils.futures.c<Boolean> W;
    @k0
    x2.a<ListenableWorker.a> X;
    private volatile boolean Y;
    
    static {
        Z = q.f("WorkerWrapper");
    }
    
    l(@j0 final c c) {
        this.M = ListenableWorker.a.a();
        this.W = androidx.work.impl.utils.futures.c.v();
        this.X = null;
        this.G = c.a;
        this.O = c.d;
        this.P = c.c;
        this.H = c.g;
        this.I = c.h;
        this.J = c.i;
        this.L = c.b;
        this.N = c.e;
        final WorkDatabase f = c.f;
        this.Q = f;
        this.R = f.U();
        this.S = this.Q.L();
        this.T = this.Q.V();
    }
    
    private String a(final List<String> list) {
        final StringBuilder sb = new StringBuilder("Work [ id=");
        sb.append(this.H);
        sb.append(", tags={ ");
        final Iterator<String> iterator = list.iterator();
        int n = 1;
        while (iterator.hasNext()) {
            final String str = iterator.next();
            if (n != 0) {
                n = 0;
            }
            else {
                sb.append(", ");
            }
            sb.append(str);
        }
        sb.append(" } ]");
        return sb.toString();
    }
    
    private void c(final ListenableWorker.a a) {
        if (a instanceof ListenableWorker.a.c) {
            q.c().d(l.Z, String.format("Worker result SUCCESS for %s", this.V), new Throwable[0]);
            if (!this.K.d()) {
                this.m();
                return;
            }
        }
        else {
            if (a instanceof ListenableWorker.a.b) {
                q.c().d(l.Z, String.format("Worker result RETRY for %s", this.V), new Throwable[0]);
                this.g();
                return;
            }
            q.c().d(l.Z, String.format("Worker result FAILURE for %s", this.V), new Throwable[0]);
            if (!this.K.d()) {
                this.l();
                return;
            }
        }
        this.h();
    }
    
    private void e(String e) {
        final LinkedList<String> list = new LinkedList<String>();
        list.add(e);
        while (!list.isEmpty()) {
            e = list.remove();
            if (this.R.s(e) != c0.a.L) {
                this.R.a(c0.a.J, e);
            }
            list.addAll(this.S.b(e));
        }
    }
    
    private void g() {
        this.Q.e();
        try {
            this.R.a(c0.a.G, this.H);
            this.R.B(this.H, System.currentTimeMillis());
            this.R.c(this.H, -1L);
            this.Q.I();
        }
        finally {
            this.Q.k();
            this.i(true);
        }
    }
    
    private void h() {
        this.Q.e();
        try {
            this.R.B(this.H, System.currentTimeMillis());
            this.R.a(c0.a.G, this.H);
            this.R.u(this.H);
            this.R.c(this.H, -1L);
            this.Q.I();
        }
        finally {
            this.Q.k();
            this.i(false);
        }
    }
    
    private void i(final boolean b) {
        this.Q.e();
        try {
            final List<String> p = this.Q.U().p();
            if (p == null || p.isEmpty()) {
                androidx.work.impl.utils.e.c(this.G, RescheduleReceiver.class, false);
            }
            if (b) {
                this.R.a(c0.a.G, this.H);
                this.R.c(this.H, -1L);
            }
            if (this.K != null) {
                final ListenableWorker l = this.L;
                if (l != null && l.isRunInForeground()) {
                    this.P.b(this.H);
                }
            }
            this.Q.I();
            this.Q.k();
            this.W.q(b);
        }
        finally {
            this.Q.k();
        }
    }
    
    private void j() {
        final c0.a s = this.R.s(this.H);
        if (s == c0.a.H) {
            q.c().a(l.Z, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", this.H), new Throwable[0]);
            this.i(true);
        }
        else {
            q.c().a(l.Z, String.format("Status for %s is %s; not doing any work", this.H, s), new Throwable[0]);
            this.i(false);
        }
    }
    
    private void k() {
        if (this.n()) {
            return;
        }
        this.Q.e();
        try {
            final r t = this.R.t(this.H);
            this.K = t;
            if (t == null) {
                q.c().b(l.Z, String.format("Didn't find WorkSpec for id %s", this.H), new Throwable[0]);
                this.i(false);
                this.Q.I();
                return;
            }
            if (t.b != c0.a.G) {
                this.j();
                this.Q.I();
                q.c().a(l.Z, String.format("%s is not in ENQUEUED state. Nothing more to do.", this.K.c), new Throwable[0]);
                return;
            }
            if (t.d() || this.K.c()) {
                final long currentTimeMillis = System.currentTimeMillis();
                final r k = this.K;
                if (k.n != 0L && currentTimeMillis < k.a()) {
                    q.c().a(l.Z, String.format("Delaying execution for %s because it is being executed before schedule.", this.K.c), new Throwable[0]);
                    this.i(true);
                    this.Q.I();
                    return;
                }
            }
            this.Q.I();
            this.Q.k();
            f f;
            if (this.K.d()) {
                f = this.K.e;
            }
            else {
                final o b = this.N.e().b(this.K.d);
                if (b == null) {
                    q.c().b(l.Z, String.format("Could not create Input Merger %s", this.K.d), new Throwable[0]);
                    this.l();
                    return;
                }
                final ArrayList<f> list = new ArrayList<f>();
                list.add(this.K.e);
                list.addAll((Collection<?>)this.R.z(this.H));
                f = b.b(list);
            }
            final WorkerParameters workerParameters = new WorkerParameters(UUID.fromString(this.H), f, this.U, this.J, this.K.k, this.N.d(), this.O, this.N.l(), new androidx.work.impl.utils.q(this.Q, this.O), new p(this.Q, this.P, this.O));
            if (this.L == null) {
                this.L = this.N.l().b(this.G, this.K.c, workerParameters);
            }
            final ListenableWorker l = this.L;
            if (l == null) {
                q.c().b(androidx.work.impl.l.Z, String.format("Could not create Worker %s", this.K.c), new Throwable[0]);
                this.l();
                return;
            }
            if (l.isUsed()) {
                q.c().b(androidx.work.impl.l.Z, String.format("Received an already-used Worker %s; WorkerFactory should return new instances", this.K.c), new Throwable[0]);
                this.l();
                return;
            }
            this.L.setUsed();
            if (this.o()) {
                if (this.n()) {
                    return;
                }
                final androidx.work.impl.utils.futures.c<Object> v = androidx.work.impl.utils.futures.c.v();
                this.O.b().execute(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            q.c().a(l.Z, String.format("Starting work for %s", l.this.K.c), new Throwable[0]);
                            final l h = l.this;
                            h.X = h.L.startWork();
                            v.s(l.this.X);
                        }
                        finally {
                            final Throwable t;
                            v.r(t);
                        }
                    }
                });
                v.g(new Runnable() {
                    final /* synthetic */ String H = l.this.V;
                    
                    @SuppressLint({ "SyntheticAccessor" })
                    @Override
                    public void run() {
                        try {
                            try {
                                final ListenableWorker.a m = (ListenableWorker.a)v.get();
                                if (m == null) {
                                    q.c().b(l.Z, String.format("%s returned a null result. Treating it as a failure.", l.this.K.c), new Throwable[0]);
                                }
                                q.c().a(l.Z, String.format("%s returned a %s result.", l.this.K.c, m), new Throwable[0]);
                                l.this.M = m;
                            }
                            finally {}
                        }
                        catch (ExecutionException t) {
                            goto Label_0112;
                        }
                        catch (InterruptedException ex2) {}
                        catch (CancellationException ex) {
                            q.c().d(l.Z, String.format("%s was cancelled", this.H), ex);
                        }
                        l.this.f();
                        return;
                        l.this.f();
                    }
                }, this.O.d());
            }
            else {
                this.j();
            }
        }
        finally {
            this.Q.k();
        }
    }
    
    private void m() {
        this.Q.e();
        try {
            this.R.a(c0.a.I, this.H);
            this.R.k(this.H, ((ListenableWorker.a.c)this.M).f());
            final long currentTimeMillis = System.currentTimeMillis();
            for (final String s : this.S.b(this.H)) {
                if (this.R.s(s) == c0.a.K && this.S.c(s)) {
                    q.c().d(l.Z, String.format("Setting status to enqueued for %s", s), new Throwable[0]);
                    this.R.a(c0.a.G, s);
                    this.R.B(s, currentTimeMillis);
                }
            }
            this.Q.I();
        }
        finally {
            this.Q.k();
            this.i(false);
        }
    }
    
    private boolean n() {
        if (this.Y) {
            q.c().a(l.Z, String.format("Work interrupted for %s", this.V), new Throwable[0]);
            final c0.a s = this.R.s(this.H);
            if (s == null) {
                this.i(false);
            }
            else {
                this.i(s.b() ^ true);
            }
            return true;
        }
        return false;
    }
    
    private boolean o() {
        this.Q.e();
        try {
            final c0.a s = this.R.s(this.H);
            final c0.a g = c0.a.G;
            boolean b = true;
            if (s == g) {
                this.R.a(c0.a.H, this.H);
                this.R.A(this.H);
            }
            else {
                b = false;
            }
            this.Q.I();
            return b;
        }
        finally {
            this.Q.k();
        }
    }
    
    @j0
    public x2.a<Boolean> b() {
        return this.W;
    }
    
    @t0({ t0.a.H })
    public void d() {
        this.Y = true;
        this.n();
        final x2.a<ListenableWorker.a> x = this.X;
        boolean done;
        if (x != null) {
            done = x.isDone();
            this.X.cancel(true);
        }
        else {
            done = false;
        }
        final ListenableWorker l = this.L;
        if (l != null && !done) {
            l.stop();
        }
        else {
            q.c().a(androidx.work.impl.l.Z, String.format("WorkSpec %s is already done. Not interrupting.", this.K), new Throwable[0]);
        }
    }
    
    void f() {
        if (!this.n()) {
            this.Q.e();
            try {
                final c0.a s = this.R.s(this.H);
                this.Q.T().d(this.H);
                if (s == null) {
                    this.i(false);
                }
                else if (s == c0.a.H) {
                    this.c(this.M);
                }
                else if (!s.b()) {
                    this.g();
                }
                this.Q.I();
            }
            finally {
                this.Q.k();
            }
        }
        final List<e> i = this.I;
        if (i != null) {
            final Iterator<e> iterator = i.iterator();
            while (iterator.hasNext()) {
                iterator.next().e(this.H);
            }
            androidx.work.impl.f.b(this.N, this.Q, this.I);
        }
    }
    
    @b1
    void l() {
        this.Q.e();
        try {
            this.e(this.H);
            this.R.k(this.H, ((ListenableWorker.a.a)this.M).f());
            this.Q.I();
        }
        finally {
            this.Q.k();
            this.i(false);
        }
    }
    
    @c1
    @Override
    public void run() {
        final List<String> b = this.T.b(this.H);
        this.U = b;
        this.V = this.a(b);
        this.k();
    }
    
    @t0({ t0.a.H })
    public static class c
    {
        @j0
        Context a;
        @k0
        ListenableWorker b;
        @j0
        androidx.work.impl.foreground.a c;
        @j0
        a d;
        @j0
        b e;
        @j0
        WorkDatabase f;
        @j0
        String g;
        List<e> h;
        @j0
        WorkerParameters.a i;
        
        public c(@j0 final Context context, @j0 final b e, @j0 final a d, @j0 final androidx.work.impl.foreground.a c, @j0 final WorkDatabase f, @j0 final String g) {
            this.i = new WorkerParameters.a();
            this.a = context.getApplicationContext();
            this.d = d;
            this.c = c;
            this.e = e;
            this.f = f;
            this.g = g;
        }
        
        public l a() {
            return new l(this);
        }
        
        @j0
        public c b(@k0 final WorkerParameters.a i) {
            if (i != null) {
                this.i = i;
            }
            return this;
        }
        
        @j0
        public c c(@j0 final List<e> h) {
            this.h = h;
            return this;
        }
        
        @b1
        @j0
        public c d(@j0 final ListenableWorker b) {
            this.b = b;
            return this;
        }
    }
}
