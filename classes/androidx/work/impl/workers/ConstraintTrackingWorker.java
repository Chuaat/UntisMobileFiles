// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl.workers;

import x2.a;
import androidx.work.impl.model.r;
import java.util.Collections;
import androidx.work.impl.constraints.d;
import android.text.TextUtils;
import androidx.work.impl.j;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import androidx.annotation.b1;
import androidx.annotation.j0;
import android.content.Context;
import androidx.work.q;
import androidx.annotation.k0;
import androidx.work.WorkerParameters;
import androidx.annotation.t0;
import androidx.work.impl.constraints.c;
import androidx.work.ListenableWorker;

@t0({ t0.a.H })
public class ConstraintTrackingWorker extends ListenableWorker implements c
{
    private static final String L;
    public static final String M = "androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME";
    private WorkerParameters G;
    final Object H;
    volatile boolean I;
    androidx.work.impl.utils.futures.c<ListenableWorker.a> J;
    @k0
    private ListenableWorker K;
    
    static {
        L = q.f("ConstraintTrkngWrkr");
    }
    
    public ConstraintTrackingWorker(@j0 final Context context, @j0 final WorkerParameters g) {
        super(context, g);
        this.G = g;
        this.H = new Object();
        this.I = false;
        this.J = androidx.work.impl.utils.futures.c.v();
    }
    
    @b1
    @k0
    @t0({ t0.a.H })
    public ListenableWorker a() {
        return this.K;
    }
    
    @Override
    public void b(@j0 final List<String> list) {
        q.c().a(ConstraintTrackingWorker.L, String.format("Constraints changed for %s", list), new Throwable[0]);
        synchronized (this.H) {
            this.I = true;
        }
    }
    
    @b1
    @j0
    @t0({ t0.a.H })
    public WorkDatabase c() {
        return j.H(this.getApplicationContext()).M();
    }
    
    void d() {
        this.J.q(ListenableWorker.a.a());
    }
    
    void e() {
        this.J.q(ListenableWorker.a.c());
    }
    
    @Override
    public void f(@j0 final List<String> list) {
    }
    
    void g() {
        final String u = this.getInputData().u("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        if (TextUtils.isEmpty((CharSequence)u)) {
            q.c().b(ConstraintTrackingWorker.L, "No worker to delegate to.", new Throwable[0]);
        }
        else if ((this.K = this.getWorkerFactory().b(this.getApplicationContext(), u, this.G)) == null) {
            q.c().a(ConstraintTrackingWorker.L, "No worker to delegate to.", new Throwable[0]);
        }
        else {
            final r t = this.c().U().t(this.getId().toString());
            if (t == null) {
                this.d();
                return;
            }
            final d d = new d(this.getApplicationContext(), this.getTaskExecutor(), this);
            d.d(Collections.singletonList(t));
            if (d.c(this.getId().toString())) {
                q.c().a(ConstraintTrackingWorker.L, String.format("Constraints met for delegate %s", u), new Throwable[0]);
                try {
                    final a<ListenableWorker.a> startWork = this.K.startWork();
                    startWork.g(new Runnable() {
                        @Override
                        public void run() {
                            synchronized (ConstraintTrackingWorker.this.H) {
                                if (ConstraintTrackingWorker.this.I) {
                                    ConstraintTrackingWorker.this.e();
                                }
                                else {
                                    ConstraintTrackingWorker.this.J.s(startWork);
                                }
                            }
                        }
                    }, this.getBackgroundExecutor());
                    return;
                }
                finally {
                    final q c = q.c();
                    final String l = ConstraintTrackingWorker.L;
                    final Throwable t2;
                    c.a(l, String.format("Delegated worker %s threw exception in startWork.", u), t2);
                    synchronized (this.H) {
                        if (this.I) {
                            q.c().a(l, "Constraints were unmet, Retrying.", new Throwable[0]);
                            this.e();
                        }
                        else {
                            this.d();
                        }
                    }
                }
            }
            q.c().a(ConstraintTrackingWorker.L, String.format("Constraints not met for delegate %s. Requesting retry.", u), new Throwable[0]);
            this.e();
            return;
        }
        this.d();
    }
    
    @b1
    @j0
    @t0({ t0.a.H })
    @Override
    public androidx.work.impl.utils.taskexecutor.a getTaskExecutor() {
        return j.H(this.getApplicationContext()).O();
    }
    
    @Override
    public boolean isRunInForeground() {
        final ListenableWorker k = this.K;
        return k != null && k.isRunInForeground();
    }
    
    @Override
    public void onStopped() {
        super.onStopped();
        final ListenableWorker k = this.K;
        if (k != null && !k.isStopped()) {
            this.K.stop();
        }
    }
    
    @j0
    @Override
    public a<ListenableWorker.a> startWork() {
        this.getBackgroundExecutor().execute(new Runnable() {
            @Override
            public void run() {
                ConstraintTrackingWorker.this.g();
            }
        });
        return this.J;
    }
}
