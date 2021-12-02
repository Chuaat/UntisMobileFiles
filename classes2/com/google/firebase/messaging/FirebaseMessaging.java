// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.messaging;

import android.content.SharedPreferences$Editor;
import android.os.Bundle;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.SharedPreferences;
import android.content.pm.PackageManager$NameNotFoundException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ExecutorService;
import com.google.android.gms.tasks.n;
import com.google.android.gms.tasks.c;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import com.google.android.gms.tasks.l;
import android.os.Parcelable;
import android.app.PendingIntent;
import android.os.Build$VERSION;
import android.text.TextUtils;
import android.content.Intent;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.x;
import com.google.firebase.heartbeatinfo.k;
import n3.b;
import com.google.android.gms.tasks.h;
import android.util.Log;
import android.app.Application;
import j3.d;
import java.util.concurrent.TimeUnit;
import android.app.Application$ActivityLifecycleCallbacks;
import com.google.android.gms.tasks.m;
import java.util.concurrent.Executor;
import android.content.Context;
import com.google.firebase.installations.j;
import com.google.firebase.e;
import d6.a;
import java.util.concurrent.ScheduledExecutorService;
import androidx.annotation.k0;
import androidx.annotation.b1;
import com.google.android.datatransport.i;
import android.annotation.SuppressLint;
import androidx.annotation.j0;

public class FirebaseMessaging
{
    @Deprecated
    @j0
    public static final String n = "FCM";
    private static final long o;
    @SuppressLint({ "StaticFieldLeak" })
    private static x0 p;
    @SuppressLint({ "FirebaseUnknownNullness" })
    @b1
    @k0
    static i q;
    @b1
    @d6.a("FirebaseMessaging.class")
    static ScheduledExecutorService r;
    private final e a;
    @k0
    private final m3.a b;
    private final j c;
    private final Context d;
    private final h0 e;
    private final s0 f;
    private final a g;
    private final Executor h;
    private final Executor i;
    private final m<c1> j;
    private final m0 k;
    @d6.a("this")
    private boolean l;
    private final Application$ActivityLifecycleCallbacks m;
    
    static {
        o = TimeUnit.HOURS.toSeconds(8L);
    }
    
    FirebaseMessaging(final e a, @k0 final m3.a b, final j c, @k0 final i q, final d d, final m0 k, final h0 e, final Executor i, final Executor h) {
        this.l = false;
        FirebaseMessaging.q = q;
        this.a = a;
        this.b = b;
        this.c = c;
        this.g = new a(d);
        final Context m = a.m();
        this.d = m;
        final r j = new r();
        this.m = (Application$ActivityLifecycleCallbacks)j;
        this.k = k;
        this.i = i;
        this.e = e;
        this.f = new s0(i);
        this.h = h;
        final Context l = a.m();
        if (l instanceof Application) {
            ((Application)l).registerActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)j);
        }
        else {
            final String value = String.valueOf(l);
            final StringBuilder sb = new StringBuilder(value.length() + 125);
            sb.append("Context ");
            sb.append(value);
            sb.append(" was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
            Log.w("FirebaseMessaging", sb.toString());
        }
        if (b != null) {
            b.a((m3.a.a)new s(this));
        }
        synchronized (FirebaseMessaging.class) {
            if (FirebaseMessaging.p == null) {
                FirebaseMessaging.p = new x0(m);
            }
            // monitorexit(FirebaseMessaging.class)
            h.execute(new u(this));
            (this.j = c1.e(this, c, k, e, m, com.google.firebase.messaging.q.f())).l(com.google.firebase.messaging.q.g(), (h)new v(this));
        }
    }
    
    FirebaseMessaging(final e e, @k0 final m3.a a, final b<com.google.firebase.platforminfo.i> b, final b<k> b2, final j j, @k0 final i i, final d d) {
        this(e, a, b, b2, j, i, d, new m0(e.m()));
    }
    
    FirebaseMessaging(final e e, @k0 final m3.a a, final b<com.google.firebase.platforminfo.i> b, final b<k> b2, final j j, @k0 final i i, final d d, final m0 m0) {
        this(e, a, j, i, d, m0, new h0(e, m0, b, b2, j), com.google.firebase.messaging.q.e(), com.google.firebase.messaging.q.b());
    }
    
    private void E() {
        synchronized (this) {
            if (!this.l) {
                this.H(0L);
            }
        }
    }
    
    private void F() {
        final m3.a b = this.b;
        if (b != null) {
            b.e();
            return;
        }
        if (this.I(this.l())) {
            this.E();
        }
    }
    
    @Keep
    @j0
    static FirebaseMessaging getInstance(@j0 final e e) {
        synchronized (FirebaseMessaging.class) {
            final FirebaseMessaging firebaseMessaging = (FirebaseMessaging)e.k((Class)FirebaseMessaging.class);
            x.l((Object)firebaseMessaging, (Object)"Firebase Messaging component is not present");
            return firebaseMessaging;
        }
    }
    
    @j0
    public static FirebaseMessaging i() {
        synchronized (FirebaseMessaging.class) {
            return getInstance(e.o());
        }
    }
    
    private String j() {
        String s;
        if ("[DEFAULT]".equals(this.a.q())) {
            s = "";
        }
        else {
            s = this.a.s();
        }
        return s;
    }
    
    @k0
    public static i m() {
        return FirebaseMessaging.q;
    }
    
    private void n(final String s) {
        if ("[DEFAULT]".equals(this.a.q())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                final String value = String.valueOf(this.a.q());
                String concat;
                if (value.length() != 0) {
                    concat = "Invoking onNewToken for app: ".concat(value);
                }
                else {
                    concat = new String("Invoking onNewToken for app: ");
                }
                Log.d("FirebaseMessaging", concat);
            }
            final Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", s);
            new p(this.d).g(intent);
        }
    }
    
    public void A(@j0 final p0 p) {
        if (!TextUtils.isEmpty((CharSequence)p.v5())) {
            final Intent intent = new Intent("com.google.android.gcm.intent.SEND");
            final Intent intent2 = new Intent();
            intent2.setPackage("com.google.example.invalidpackage");
            final Context d = this.d;
            int n;
            if (Build$VERSION.SDK_INT >= 23) {
                n = 67108864;
            }
            else {
                n = 0;
            }
            intent.putExtra("app", (Parcelable)PendingIntent.getBroadcast(d, 0, intent2, n));
            intent.setPackage("com.google.android.gms");
            p.R5(intent);
            this.d.sendOrderedBroadcast(intent, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
            return;
        }
        throw new IllegalArgumentException("Missing 'to'");
    }
    
    public void B(final boolean b) {
        this.g.e(b);
    }
    
    public void C(final boolean b) {
        l0.y(b);
    }
    
    void D(final boolean l) {
        synchronized (this) {
            this.l = l;
        }
    }
    
    @j0
    public m<Void> G(@j0 final String s) {
        return (m<Void>)this.j.w((l)new z(s));
    }
    
    void H(final long n) {
        synchronized (this) {
            this.g(new y0(this, Math.min(Math.max(30L, n + n), FirebaseMessaging.o)), n);
            this.l = true;
        }
    }
    
    @b1
    boolean I(@k0 final x0.a a) {
        return a == null || a.b(this.k.a());
    }
    
    @j0
    public m<Void> J(@j0 final String s) {
        return (m<Void>)this.j.w((l)new a0(s));
    }
    
    String c() throws IOException {
        Object b = this.b;
        if (b != null) {
            try {
                b = com.google.android.gms.tasks.p.a((m)((m3.a)b).d());
                return (String)b;
            }
            catch (InterruptedException b) {}
            catch (ExecutionException ex) {}
            throw new IOException((Throwable)b);
        }
        final x0.a l = this.l();
        if (!this.I(l)) {
            return l.a;
        }
        final String c = m0.c(this.a);
        final m p = this.c.b().p((Executor)com.google.firebase.messaging.q.d(), (c)new b0(this, c));
        try {
            final String s = (String)com.google.android.gms.tasks.p.a(p);
            FirebaseMessaging.p.g(this.j(), c, s, this.k.a());
            if (l == null || !s.equals(l.a)) {
                this.n(s);
            }
            return s;
        }
        catch (InterruptedException l) {}
        catch (ExecutionException ex2) {}
        throw new IOException((Throwable)l);
    }
    
    @j0
    public m<Void> e() {
        if (this.b != null) {
            final n n = new n();
            this.h.execute(new com.google.firebase.messaging.x(this, n));
            return (m<Void>)n.a();
        }
        if (this.l() == null) {
            return (m<Void>)com.google.android.gms.tasks.p.g((Object)null);
        }
        final ExecutorService d = com.google.firebase.messaging.q.d();
        return (m<Void>)this.c.b().p((Executor)d, (c)new y(this, d));
    }
    
    @j0
    public boolean f() {
        return l0.a();
    }
    
    void g(final Runnable runnable, final long n) {
        synchronized (FirebaseMessaging.class) {
            if (FirebaseMessaging.r == null) {
                FirebaseMessaging.r = new ScheduledThreadPoolExecutor(1, (ThreadFactory)new com.google.android.gms.common.util.concurrent.b("TAG"));
            }
            FirebaseMessaging.r.schedule(runnable, n, TimeUnit.SECONDS);
        }
    }
    
    Context h() {
        return this.d;
    }
    
    @j0
    public m<String> k() {
        final m3.a b = this.b;
        if (b != null) {
            return b.d();
        }
        final n n = new n();
        this.h.execute(new w(this, n));
        return (m<String>)n.a();
    }
    
    @b1
    @k0
    x0.a l() {
        return FirebaseMessaging.p.e(this.j(), m0.c(this.a));
    }
    
    public boolean o() {
        return this.g.b();
    }
    
    @b1
    boolean p() {
        return this.k.g();
    }
    
    private class a
    {
        private final d a;
        @d6.a("this")
        private boolean b;
        @k0
        @d6.a("this")
        private j3.b<com.google.firebase.b> c;
        @k0
        @d6.a("this")
        private Boolean d;
        
        a(final d a) {
            this.a = a;
        }
        
        @k0
        private Boolean d() {
            final Context m = FirebaseMessaging.this.a.m();
            final SharedPreferences sharedPreferences = m.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return sharedPreferences.getBoolean("auto_init", false);
            }
            try {
                final PackageManager packageManager = m.getPackageManager();
                if (packageManager != null) {
                    final ApplicationInfo applicationInfo = packageManager.getApplicationInfo(m.getPackageName(), 128);
                    if (applicationInfo != null) {
                        final Bundle metaData = applicationInfo.metaData;
                        if (metaData != null && metaData.containsKey("firebase_messaging_auto_init_enabled")) {
                            return applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled");
                        }
                    }
                }
                return null;
            }
            catch (PackageManager$NameNotFoundException ex) {
                return null;
            }
        }
        
        void a() {
            synchronized (this) {
                if (this.b) {
                    return;
                }
                if ((this.d = this.d()) == null) {
                    final d0 c = new d0(this);
                    this.c = (j3.b<com.google.firebase.b>)c;
                    this.a.a(com.google.firebase.b.class, c);
                }
                this.b = true;
            }
        }
        
        boolean b() {
            synchronized (this) {
                this.a();
                final Boolean d = this.d;
                boolean b;
                if (d != null) {
                    b = d;
                }
                else {
                    b = FirebaseMessaging.this.a.z();
                }
                return b;
            }
        }
        
        void e(final boolean b) {
            synchronized (this) {
                this.a();
                final j3.b<com.google.firebase.b> c = this.c;
                if (c != null) {
                    this.a.c(com.google.firebase.b.class, c);
                    this.c = null;
                }
                final SharedPreferences$Editor edit = FirebaseMessaging.this.a.m().getSharedPreferences("com.google.firebase.messaging", 0).edit();
                edit.putBoolean("auto_init", b);
                edit.apply();
                if (b) {
                    FirebaseMessaging.this.F();
                }
                this.d = b;
            }
        }
    }
}
