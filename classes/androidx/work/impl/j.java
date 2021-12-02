// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl;

import androidx.work.impl.utils.i;
import androidx.work.e0;
import androidx.work.impl.utils.l;
import androidx.work.impl.utils.futures.c;
import android.app.PendingIntent;
import java.util.UUID;
import androidx.work.b0;
import androidx.work.s;
import androidx.work.impl.utils.m;
import androidx.work.WorkerParameters;
import androidx.work.impl.model.r;
import androidx.work.c0;
import androidx.lifecycle.LiveData;
import android.text.TextUtils;
import androidx.work.f0;
import java.util.Collections;
import androidx.work.k;
import androidx.work.w;
import java.util.Arrays;
import androidx.work.impl.utils.h;
import androidx.work.u;
import androidx.work.impl.utils.ForceStopRunnable;
import android.os.Build$VERSION;
import androidx.annotation.k0;
import java.util.concurrent.Executor;
import androidx.work.z;
import androidx.annotation.j0;
import androidx.work.q;
import android.content.BroadcastReceiver$PendingResult;
import androidx.work.impl.utils.f;
import java.util.List;
import androidx.work.impl.utils.taskexecutor.a;
import androidx.work.b;
import android.content.Context;
import androidx.annotation.t0;
import androidx.work.d0;

@t0({ t0.a.H })
public class j extends d0
{
    private static final String k;
    public static final int l = 22;
    public static final int m = 23;
    public static final String n = "androidx.work.multiprocess.RemoteWorkManagerClient";
    private static j o;
    private static j p;
    private static final Object q;
    private Context a;
    private b b;
    private WorkDatabase c;
    private a d;
    private List<e> e;
    private d f;
    private f g;
    private boolean h;
    private BroadcastReceiver$PendingResult i;
    private volatile androidx.work.multiprocess.d j;
    
    static {
        k = androidx.work.q.f("WorkManagerImpl");
        j.o = null;
        j.p = null;
        q = new Object();
    }
    
    @t0({ t0.a.H })
    public j(@j0 final Context context, @j0 final b b, @j0 final a a) {
        this(context, b, a, context.getResources().getBoolean(z.b.d));
    }
    
    @t0({ t0.a.H })
    public j(@j0 final Context context, @j0 final b b, @j0 final a a, @j0 final WorkDatabase workDatabase) {
        final Context applicationContext = context.getApplicationContext();
        androidx.work.q.e(new q.a(b.i()));
        final List<e> c = this.C(applicationContext, b, a);
        this.P(context, b, a, workDatabase, c, new d(context, b, a, workDatabase, c));
    }
    
    @t0({ t0.a.H })
    public j(@j0 final Context context, @j0 final b b, @j0 final a a, @j0 final WorkDatabase workDatabase, @j0 final List<e> list, @j0 final d d) {
        this.P(context, b, a, workDatabase, list, d);
    }
    
    @t0({ t0.a.H })
    public j(@j0 final Context context, @j0 final b b, @j0 final a a, final boolean b2) {
        this(context, b, a, WorkDatabase.K(context.getApplicationContext(), a.d(), b2));
    }
    
    @t0({ t0.a.H })
    public static void A(@j0 final Context context, @j0 final b b) {
        synchronized (j.q) {
            final j o = j.o;
            if (o != null && j.p != null) {
                throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
            }
            if (o == null) {
                final Context applicationContext = context.getApplicationContext();
                if (j.p == null) {
                    j.p = new j(applicationContext, b, new androidx.work.impl.utils.taskexecutor.b(b.k()));
                }
                j.o = j.p;
            }
        }
    }
    
    @Deprecated
    @k0
    @t0({ t0.a.H })
    public static j G() {
        synchronized (j.q) {
            final j o = j.o;
            if (o != null) {
                return o;
            }
            return j.p;
        }
    }
    
    @j0
    @t0({ t0.a.H })
    public static j H(@j0 Context applicationContext) {
        synchronized (j.q) {
            j j;
            if ((j = G()) == null) {
                applicationContext = applicationContext.getApplicationContext();
                if (!(applicationContext instanceof b.b)) {
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
                A(applicationContext, ((b.b)applicationContext).a());
                j = H(applicationContext);
            }
            return j;
        }
    }
    
    private void P(@j0 Context applicationContext, @j0 final b b, @j0 final a d, @j0 final WorkDatabase c, @j0 final List<e> e, @j0 final d f) {
        applicationContext = applicationContext.getApplicationContext();
        this.a = applicationContext;
        this.b = b;
        this.d = d;
        this.c = c;
        this.e = e;
        this.f = f;
        this.g = new f(c);
        this.h = false;
        if (Build$VERSION.SDK_INT >= 24 && applicationContext.isDeviceProtectedStorage()) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        this.d.c(new ForceStopRunnable(applicationContext, this));
    }
    
    @t0({ t0.a.H })
    public static void S(@k0 final j o) {
        synchronized (j.q) {
            j.o = o;
        }
    }
    
    private void Y() {
        try {
            this.j = (androidx.work.multiprocess.d)Class.forName("androidx.work.multiprocess.RemoteWorkManagerClient").getConstructor(Context.class, j.class).newInstance(this.a, this);
        }
        finally {
            final Throwable t;
            androidx.work.q.c().a(androidx.work.impl.j.k, "Unable to initialize multi-process support", t);
        }
    }
    
    @j0
    @Override
    public u B() {
        final h h = new h(this);
        this.d.c(h);
        return h.a();
    }
    
    @j0
    @t0({ t0.a.H })
    public List<e> C(@j0 final Context context, @j0 final b b, @j0 final a a) {
        return Arrays.asList(androidx.work.impl.f.a(context, this), new androidx.work.impl.background.greedy.b(context, b, a, this));
    }
    
    @j0
    public g D(@j0 final String s, @j0 final androidx.work.j j, @j0 final w o) {
        k k;
        if (j == j.H) {
            k = androidx.work.k.H;
        }
        else {
            k = androidx.work.k.G;
        }
        return new g(this, s, k, Collections.singletonList(o));
    }
    
    @j0
    @t0({ t0.a.H })
    public Context E() {
        return this.a;
    }
    
    @j0
    @t0({ t0.a.H })
    public b F() {
        return this.b;
    }
    
    @j0
    @t0({ t0.a.H })
    public f I() {
        return this.g;
    }
    
    @j0
    @t0({ t0.a.H })
    public d J() {
        return this.f;
    }
    
    @k0
    @t0({ t0.a.H })
    public androidx.work.multiprocess.d K() {
        if (this.j == null) {
            synchronized (androidx.work.impl.j.q) {
                if (this.j == null) {
                    this.Y();
                    if (this.j == null) {
                        if (!TextUtils.isEmpty((CharSequence)this.b.b())) {
                            throw new IllegalStateException("Invalid multiprocess configuration. Define an `implementation` dependency on :work:work-multiprocess library");
                        }
                    }
                }
            }
        }
        return this.j;
    }
    
    @j0
    @t0({ t0.a.H })
    public List<e> L() {
        return this.e;
    }
    
    @j0
    @t0({ t0.a.H })
    public WorkDatabase M() {
        return this.c;
    }
    
    LiveData<List<c0>> N(@j0 final List<String> list) {
        return androidx.work.impl.utils.d.a(this.c.U().x(list), r.t, this.d);
    }
    
    @j0
    @t0({ t0.a.H })
    public a O() {
        return this.d;
    }
    
    @t0({ t0.a.H })
    public void Q() {
        synchronized (androidx.work.impl.j.q) {
            this.h = true;
            final BroadcastReceiver$PendingResult i = this.i;
            if (i != null) {
                i.finish();
                this.i = null;
            }
        }
    }
    
    public void R() {
        if (Build$VERSION.SDK_INT >= 23) {
            androidx.work.impl.background.systemjob.b.b(this.E());
        }
        this.M().U().G();
        androidx.work.impl.f.b(this.F(), this.M(), this.L());
    }
    
    @t0({ t0.a.H })
    public void T(@j0 final BroadcastReceiver$PendingResult i) {
        synchronized (androidx.work.impl.j.q) {
            this.i = i;
            if (this.h) {
                i.finish();
                this.i = null;
            }
        }
    }
    
    @t0({ t0.a.H })
    public void U(@j0 final String s) {
        this.V(s, null);
    }
    
    @t0({ t0.a.H })
    public void V(@j0 final String s, @k0 final WorkerParameters.a a) {
        this.d.c(new androidx.work.impl.utils.k(this, s, a));
    }
    
    @t0({ t0.a.H })
    public void W(@j0 final String s) {
        this.d.c(new m(this, s, true));
    }
    
    @t0({ t0.a.H })
    public void X(@j0 final String s) {
        this.d.c(new m(this, s, false));
    }
    
    @j0
    @Override
    public b0 b(@j0 final String s, @j0 final k k, @j0 final List<s> list) {
        if (!list.isEmpty()) {
            return new g(this, s, k, list);
        }
        throw new IllegalArgumentException("beginUniqueWork needs at least one OneTimeWorkRequest.");
    }
    
    @j0
    @Override
    public b0 d(@j0 final List<s> list) {
        if (!list.isEmpty()) {
            return new g(this, list);
        }
        throw new IllegalArgumentException("beginWith needs at least one OneTimeWorkRequest.");
    }
    
    @j0
    @Override
    public u e() {
        final androidx.work.impl.utils.a b = androidx.work.impl.utils.a.b(this);
        this.d.c(b);
        return b.f();
    }
    
    @j0
    @Override
    public u f(@j0 final String s) {
        final androidx.work.impl.utils.a e = androidx.work.impl.utils.a.e(s, this);
        this.d.c(e);
        return e.f();
    }
    
    @j0
    @Override
    public u g(@j0 final String s) {
        final androidx.work.impl.utils.a d = androidx.work.impl.utils.a.d(s, this, true);
        this.d.c(d);
        return d.f();
    }
    
    @j0
    @Override
    public u h(@j0 final UUID uuid) {
        final androidx.work.impl.utils.a c = androidx.work.impl.utils.a.c(uuid, this);
        this.d.c(c);
        return c.f();
    }
    
    @j0
    @Override
    public PendingIntent i(@j0 final UUID uuid) {
        return PendingIntent.getService(this.a, 0, androidx.work.impl.foreground.b.a(this.a, uuid.toString()), 134217728);
    }
    
    @j0
    @Override
    public u k(@j0 final List<? extends f0> list) {
        if (!list.isEmpty()) {
            return new g(this, list).c();
        }
        throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
    }
    
    @j0
    @Override
    public u l(@j0 final String s, @j0 final androidx.work.j j, @j0 final w w) {
        return this.D(s, j, w).c();
    }
    
    @j0
    @Override
    public u n(@j0 final String s, @j0 final k k, @j0 final List<s> list) {
        return new g(this, s, k, list).c();
    }
    
    @j0
    @Override
    public x2.a<Long> q() {
        final c<Long> v = androidx.work.impl.utils.futures.c.v();
        this.d.c(new Runnable() {
            final /* synthetic */ f H = androidx.work.impl.j.this.g;
            
            @Override
            public void run() {
                try {
                    v.q(this.H.a());
                }
                finally {
                    final Throwable t;
                    v.r(t);
                }
            }
        });
        return v;
    }
    
    @j0
    @Override
    public LiveData<Long> r() {
        return this.g.b();
    }
    
    @j0
    @Override
    public x2.a<c0> s(@j0 final UUID uuid) {
        final l<c0> c = androidx.work.impl.utils.l.c(this, uuid);
        this.d.d().execute(c);
        return c.f();
    }
    
    @j0
    @Override
    public LiveData<c0> t(@j0 final UUID uuid) {
        return androidx.work.impl.utils.d.a(this.c.U().x(Collections.singletonList(uuid.toString())), (g.a<List<r.c>, c0>)new g.a<List<r.c>, c0>() {
            public c0 a(final List<r.c> list) {
                c0 a;
                if (list != null && list.size() > 0) {
                    a = list.get(0).a();
                }
                else {
                    a = null;
                }
                return a;
            }
        }, this.d);
    }
    
    @j0
    @Override
    public x2.a<List<c0>> u(@j0 final e0 e0) {
        final l<List<c0>> e2 = androidx.work.impl.utils.l.e(this, e0);
        this.d.d().execute(e2);
        return e2.f();
    }
    
    @j0
    @Override
    public x2.a<List<c0>> v(@j0 final String s) {
        final l<List<c0>> b = androidx.work.impl.utils.l.b(this, s);
        this.d.d().execute(b);
        return b.f();
    }
    
    @j0
    @Override
    public LiveData<List<c0>> w(@j0 final String s) {
        return androidx.work.impl.utils.d.a(this.c.U().o(s), r.t, this.d);
    }
    
    @j0
    @Override
    public x2.a<List<c0>> x(@j0 final String s) {
        final l<List<c0>> d = androidx.work.impl.utils.l.d(this, s);
        this.d.d().execute(d);
        return d.f();
    }
    
    @j0
    @Override
    public LiveData<List<c0>> y(@j0 final String s) {
        return androidx.work.impl.utils.d.a(this.c.U().m(s), r.t, this.d);
    }
    
    @j0
    @Override
    public LiveData<List<c0>> z(@j0 final e0 e0) {
        return androidx.work.impl.utils.d.a(this.c.Q().b(androidx.work.impl.utils.i.b(e0)), r.t, this.d);
    }
}
