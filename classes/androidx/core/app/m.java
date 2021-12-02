// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.app;

import android.app.job.JobInfo$Builder;
import android.app.job.JobScheduler;
import android.app.job.JobInfo;
import android.app.job.JobWorkItem;
import android.app.job.JobParameters;
import androidx.annotation.p0;
import android.app.job.JobServiceEngine;
import android.os.PowerManager;
import android.os.PowerManager$WakeLock;
import androidx.annotation.k0;
import android.os.IBinder;
import android.os.AsyncTask;
import android.content.Intent;
import androidx.annotation.j0;
import android.content.Context;
import android.os.Build$VERSION;
import java.util.ArrayList;
import android.content.ComponentName;
import java.util.HashMap;
import android.app.Service;

@Deprecated
public abstract class m extends Service
{
    static final String N = "JobIntentService";
    static final boolean O = false;
    static final Object P;
    static final HashMap<ComponentName, h> Q;
    b G;
    h H;
    a I;
    boolean J;
    boolean K;
    boolean L;
    final ArrayList<d> M;
    
    static {
        P = new Object();
        Q = new HashMap<ComponentName, h>();
    }
    
    public m() {
        this.J = false;
        this.K = false;
        this.L = false;
        ArrayList<d> m;
        if (Build$VERSION.SDK_INT >= 26) {
            m = null;
        }
        else {
            m = new ArrayList<d>();
        }
        this.M = m;
    }
    
    public static void c(@j0 final Context context, @j0 final ComponentName componentName, final int n, @j0 final Intent intent) {
        if (intent != null) {
            synchronized (m.P) {
                final h f = f(context, componentName, true, n);
                f.b(n);
                f.a(intent);
                return;
            }
        }
        throw new IllegalArgumentException("work must not be null");
    }
    
    public static void d(@j0 final Context context, @j0 final Class<?> clazz, final int n, @j0 final Intent intent) {
        c(context, new ComponentName(context, (Class)clazz), n, intent);
    }
    
    static h f(final Context context, final ComponentName componentName, final boolean b, final int n) {
        final HashMap<ComponentName, h> q = m.Q;
        h h;
        if ((h = q.get(componentName)) == null) {
            h value;
            if (Build$VERSION.SDK_INT >= 26) {
                if (!b) {
                    throw new IllegalArgumentException("Can't be here without a job id");
                }
                value = new g(context, componentName, n);
            }
            else {
                value = new c(context, componentName);
            }
            q.put(componentName, value);
            h = value;
        }
        return h;
    }
    
    e a() {
        final b g = this.G;
        if (g != null) {
            return g.b();
        }
        synchronized (this.M) {
            if (this.M.size() > 0) {
                return (e)this.M.remove(0);
            }
            return null;
        }
    }
    
    boolean b() {
        final a i = this.I;
        if (i != null) {
            i.cancel(this.J);
        }
        this.K = true;
        return this.i();
    }
    
    void e(final boolean b) {
        if (this.I == null) {
            this.I = new a();
            final h h = this.H;
            if (h != null && b) {
                h.d();
            }
            this.I.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new Void[0]);
        }
    }
    
    public boolean g() {
        return this.K;
    }
    
    protected abstract void h(@j0 final Intent p0);
    
    public boolean i() {
        return true;
    }
    
    void j() {
        final ArrayList<d> m = this.M;
        if (m != null) {
            synchronized (m) {
                this.I = null;
                final ArrayList<d> i = this.M;
                if (i != null && i.size() > 0) {
                    this.e(false);
                }
                else if (!this.L) {
                    this.H.c();
                }
            }
        }
    }
    
    public void k(final boolean j) {
        this.J = j;
    }
    
    public IBinder onBind(@j0 final Intent intent) {
        final b g = this.G;
        if (g != null) {
            return g.a();
        }
        return null;
    }
    
    public void onCreate() {
        super.onCreate();
        if (Build$VERSION.SDK_INT >= 26) {
            this.G = (b)new f(this);
            this.H = null;
        }
        else {
            this.G = null;
            this.H = f((Context)this, new ComponentName((Context)this, (Class)this.getClass()), false, 0);
        }
    }
    
    public void onDestroy() {
        super.onDestroy();
        final ArrayList<d> m = this.M;
        if (m != null) {
            synchronized (m) {
                this.L = true;
                this.H.c();
            }
        }
    }
    
    public int onStartCommand(@k0 Intent intent, final int n, final int n2) {
        if (this.M != null) {
            this.H.e();
            synchronized (this.M) {
                final ArrayList<d> m = this.M;
                if (intent == null) {
                    intent = new Intent();
                }
                m.add(new d(intent, n2));
                this.e(true);
                return 3;
            }
        }
        return 2;
    }
    
    final class a extends AsyncTask<Void, Void, Void>
    {
        protected Void a(final Void... array) {
            while (true) {
                final e a = m.this.a();
                if (a == null) {
                    break;
                }
                m.this.h(a.getIntent());
                a.b();
            }
            return null;
        }
        
        protected void b(final Void void1) {
            m.this.j();
        }
        
        protected void c(final Void void1) {
            m.this.j();
        }
    }
    
    interface b
    {
        IBinder a();
        
        e b();
    }
    
    static final class c extends h
    {
        private final Context d;
        private final PowerManager$WakeLock e;
        private final PowerManager$WakeLock f;
        boolean g;
        boolean h;
        
        c(final Context context, final ComponentName componentName) {
            super(componentName);
            this.d = context.getApplicationContext();
            final PowerManager powerManager = (PowerManager)context.getSystemService("power");
            final StringBuilder sb = new StringBuilder();
            sb.append(componentName.getClassName());
            sb.append(":launch");
            (this.e = powerManager.newWakeLock(1, sb.toString())).setReferenceCounted(false);
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(componentName.getClassName());
            sb2.append(":run");
            (this.f = powerManager.newWakeLock(1, sb2.toString())).setReferenceCounted(false);
        }
        
        @Override
        void a(Intent intent) {
            intent = new Intent(intent);
            intent.setComponent(super.a);
            if (this.d.startService(intent) != null) {
                synchronized (this) {
                    if (!this.g) {
                        this.g = true;
                        if (!this.h) {
                            this.e.acquire(60000L);
                        }
                    }
                }
            }
        }
        
        @Override
        public void c() {
            synchronized (this) {
                if (this.h) {
                    if (this.g) {
                        this.e.acquire(60000L);
                    }
                    this.h = false;
                    this.f.release();
                }
            }
        }
        
        @Override
        public void d() {
            synchronized (this) {
                if (!this.h) {
                    this.h = true;
                    this.f.acquire(600000L);
                    this.e.release();
                }
            }
        }
        
        @Override
        public void e() {
            synchronized (this) {
                this.g = false;
            }
        }
    }
    
    final class d implements e
    {
        final Intent a;
        final int b;
        
        d(final Intent a, final int b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public void b() {
            m.this.stopSelf(this.b);
        }
        
        @Override
        public Intent getIntent() {
            return this.a;
        }
    }
    
    interface e
    {
        void b();
        
        Intent getIntent();
    }
    
    @p0(26)
    static final class f extends JobServiceEngine implements b
    {
        static final String d = "JobServiceEngineImpl";
        static final boolean e = false;
        final m a;
        final Object b;
        JobParameters c;
        
        f(final m a) {
            super((Service)a);
            this.b = new Object();
            this.a = a;
        }
        
        public IBinder a() {
            return this.getBinder();
        }
        
        public e b() {
            synchronized (this.b) {
                final JobParameters c = this.c;
                if (c == null) {
                    return null;
                }
                final JobWorkItem dequeueWork = c.dequeueWork();
                // monitorexit(this.b)
                if (dequeueWork != null) {
                    dequeueWork.getIntent().setExtrasClassLoader(this.a.getClassLoader());
                    return new a(dequeueWork);
                }
                return null;
            }
        }
        
        public boolean onStartJob(final JobParameters c) {
            this.c = c;
            this.a.e(false);
            return true;
        }
        
        public boolean onStopJob(final JobParameters jobParameters) {
            final boolean b = this.a.b();
            synchronized (this.b) {
                this.c = null;
                return b;
            }
        }
        
        final class a implements e
        {
            final JobWorkItem a;
            
            a(final JobWorkItem a) {
                this.a = a;
            }
            
            @Override
            public void b() {
                synchronized (f.this.b) {
                    final JobParameters c = f.this.c;
                    if (c != null) {
                        c.completeWork(this.a);
                    }
                }
            }
            
            @Override
            public Intent getIntent() {
                return this.a.getIntent();
            }
        }
    }
    
    @p0(26)
    static final class g extends h
    {
        private final JobInfo d;
        private final JobScheduler e;
        
        g(final Context context, final ComponentName componentName, final int n) {
            super(componentName);
            ((h)this).b(n);
            this.d = new JobInfo$Builder(n, super.a).setOverrideDeadline(0L).build();
            this.e = (JobScheduler)context.getApplicationContext().getSystemService("jobscheduler");
        }
        
        @Override
        void a(final Intent intent) {
            this.e.enqueue(this.d, new JobWorkItem(intent));
        }
    }
    
    abstract static class h
    {
        final ComponentName a;
        boolean b;
        int c;
        
        h(final ComponentName a) {
            this.a = a;
        }
        
        abstract void a(final Intent p0);
        
        void b(final int n) {
            if (!this.b) {
                this.b = true;
                this.c = n;
            }
            else if (this.c != n) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Given job ID ");
                sb.append(n);
                sb.append(" is different than previous ");
                sb.append(this.c);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        
        public void c() {
        }
        
        public void d() {
        }
        
        public void e() {
        }
    }
}
