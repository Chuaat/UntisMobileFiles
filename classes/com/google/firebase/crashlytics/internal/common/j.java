// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.crashlytics.internal.common;

import java.io.IOException;
import java.util.Locale;
import com.google.firebase.crashlytics.internal.model.c0$c;
import android.os.Build;
import android.os.StatFs;
import android.os.Environment;
import com.google.firebase.crashlytics.internal.model.c0$b;
import com.google.firebase.crashlytics.internal.model.c0$a;
import java.util.Map;
import android.app.ApplicationExitInfo;
import android.app.ActivityManager;
import android.os.Build$VERSION;
import com.google.android.gms.tasks.l;
import java.util.Collection;
import java.util.concurrent.Executor;
import android.os.Bundle;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import com.google.android.gms.tasks.p;
import androidx.annotation.j0;
import java.util.ArrayList;
import androidx.annotation.k0;
import java.util.List;
import com.google.firebase.crashlytics.internal.g;
import com.google.firebase.crashlytics.internal.f;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import com.google.android.gms.tasks.n;
import com.google.firebase.crashlytics.internal.log.b;
import com.google.firebase.crashlytics.internal.log.b$b;
import android.content.Context;
import java.io.FilenameFilter;

class j
{
    private static final String A = "Crashlytics Android SDK/%s";
    static final String t = "fatal";
    static final String u = "timestamp";
    static final String v = "_ae";
    static final String w = ".ae";
    static final FilenameFilter x;
    static final String y = "native-sessions";
    static final int z = 1;
    private final Context a;
    private final s b;
    private final m c;
    private final i0 d;
    private final h e;
    private final w f;
    private final com.google.firebase.crashlytics.internal.persistence.h g;
    private final a h;
    private final b$b i;
    private final b j;
    private final com.google.firebase.crashlytics.internal.a k;
    private final String l;
    private final com.google.firebase.crashlytics.internal.analytics.a m;
    private final g0 n;
    private q o;
    final n<Boolean> p;
    final n<Boolean> q;
    final n<Void> r;
    final AtomicBoolean s;
    
    static {
        x = i.a;
    }
    
    j(final Context a, final h e, final w f, final s b, final com.google.firebase.crashlytics.internal.persistence.h g, final m c, final a h, final i0 d, final b j, final b$b i, final g0 n, final com.google.firebase.crashlytics.internal.a k, final com.google.firebase.crashlytics.internal.analytics.a m) {
        this.p = new n<Boolean>();
        this.q = new n<Boolean>();
        this.r = new n<Void>();
        this.s = new AtomicBoolean(false);
        this.a = a;
        this.e = e;
        this.f = f;
        this.b = b;
        this.g = g;
        this.c = c;
        this.h = h;
        this.d = d;
        this.j = j;
        this.i = i;
        this.k = k;
        this.l = h.g.a();
        this.m = m;
        this.n = n;
    }
    
    private static File[] B(final File[] array) {
        File[] array2 = array;
        if (array == null) {
            array2 = new File[0];
        }
        return array2;
    }
    
    private void C(final String child) {
        final f f = com.google.firebase.crashlytics.internal.f.f();
        final StringBuilder sb = new StringBuilder();
        sb.append("Finalizing native report for session ");
        sb.append(child);
        f.k(sb.toString());
        final g b = this.k.b(child);
        final File e = b.e();
        if (e == null || !e.exists()) {
            final f f2 = com.google.firebase.crashlytics.internal.f.f();
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("No minidump data found for session ");
            sb2.append(child);
            f2.m(sb2.toString());
            return;
        }
        final long lastModified = e.lastModified();
        final b b2 = new b(this.a, this.i, child);
        final File file = new File(this.K(), child);
        if (!file.mkdirs()) {
            com.google.firebase.crashlytics.internal.f.f().m("Couldn't create directory to store native session files, aborting.");
            return;
        }
        this.z(lastModified);
        final List<b0> j = J(b, child, this.I(), b2.c());
        c0.b(file, j);
        this.n.l(child, j);
        b2.a();
    }
    
    private static boolean E() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        }
        catch (ClassNotFoundException ex) {
            return false;
        }
    }
    
    private Context F() {
        return this.a;
    }
    
    @k0
    private String G() {
        final List<String> q = this.n.q();
        String s;
        if (!q.isEmpty()) {
            s = q.get(0);
        }
        else {
            s = null;
        }
        return s;
    }
    
    private static long H() {
        return L(System.currentTimeMillis());
    }
    
    @j0
    static List<b0> J(final g g, final String s, File c, final byte[] array) {
        final a0 a0 = new a0(c);
        c = a0.c(s);
        final File b = a0.b(s);
        final ArrayList<v> list = (ArrayList<v>)new ArrayList<b0>();
        list.add(new e("logs_file", "logs", array));
        list.add(new v("crash_meta_file", "metadata", g.g()));
        list.add(new v("session_meta_file", "session", g.f()));
        list.add(new v("app_meta_file", "app", g.a()));
        list.add(new v("device_meta_file", "device", g.c()));
        list.add(new v("os_meta_file", "os", g.b()));
        list.add(new v("minidump_file", "minidump", g.e()));
        list.add(new v("user_meta_file", "user", c));
        list.add(new v("keys_file", "keys", b));
        return (List<b0>)list;
    }
    
    private static long L(final long n) {
        return n / 1000L;
    }
    
    private static File[] R(final File file, final FilenameFilter filter) {
        return B(file.listFiles(filter));
    }
    
    private File[] S(final FilenameFilter filenameFilter) {
        return R(this.I(), filenameFilter);
    }
    
    private com.google.android.gms.tasks.m<Void> U(final long n) {
        if (E()) {
            com.google.firebase.crashlytics.internal.f.f().m("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            return com.google.android.gms.tasks.p.g((Void)null);
        }
        com.google.firebase.crashlytics.internal.f.f().b("Logging app exception event to Firebase Analytics");
        return com.google.android.gms.tasks.p.d(new ScheduledThreadPoolExecutor(1), (Callable<Void>)new Callable<Void>() {
            public Void a() throws Exception {
                final Bundle bundle = new Bundle();
                bundle.putInt("fatal", 1);
                bundle.putLong("timestamp", n);
                com.google.firebase.crashlytics.internal.common.j.this.m.a("_ae", bundle);
                return null;
            }
        });
    }
    
    private com.google.android.gms.tasks.m<Void> V() {
        final ArrayList<com.google.android.gms.tasks.m<Void>> list = new ArrayList<com.google.android.gms.tasks.m<Void>>();
        for (final File file : this.Q()) {
            try {
                list.add(this.U(Long.parseLong(file.getName().substring(3))));
            }
            catch (NumberFormatException ex) {
                final f f = com.google.firebase.crashlytics.internal.f.f();
                final StringBuilder sb = new StringBuilder();
                sb.append("Could not parse app exception timestamp from file ");
                sb.append(file.getName());
                f.m(sb.toString());
            }
            file.delete();
        }
        return com.google.android.gms.tasks.p.h(list);
    }
    
    private com.google.android.gms.tasks.m<Boolean> d0() {
        if (this.b.d()) {
            com.google.firebase.crashlytics.internal.f.f().b("Automatic data collection is enabled. Allowing upload.");
            this.p.e(Boolean.FALSE);
            return com.google.android.gms.tasks.p.g(Boolean.TRUE);
        }
        com.google.firebase.crashlytics.internal.f.f().b("Automatic data collection is disabled.");
        com.google.firebase.crashlytics.internal.f.f().k("Notifying that unsent reports are available.");
        this.p.e(Boolean.TRUE);
        final com.google.android.gms.tasks.m<T> w = this.b.i().w((l<Void, T>)new l<Void, Boolean>() {
            @j0
            public com.google.android.gms.tasks.m<Boolean> b(@k0 final Void void1) throws Exception {
                return com.google.android.gms.tasks.p.g(Boolean.TRUE);
            }
        });
        com.google.firebase.crashlytics.internal.f.f().b("Waiting for send/deleteUnsentReports to be called.");
        return com.google.firebase.crashlytics.internal.common.k0.e((com.google.android.gms.tasks.m<Boolean>)w, this.q.a());
    }
    
    private void e0(final String s) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 30) {
            final List historicalProcessExitReasons = ((ActivityManager)this.a.getSystemService("activity")).getHistoricalProcessExitReasons((String)null, 0, 1);
            if (historicalProcessExitReasons.size() != 0) {
                final b b = new b(this.a, this.i, s);
                final i0 i0 = new i0();
                i0.e(new a0(this.I()).g(s));
                this.n.s(s, historicalProcessExitReasons.get(0), b, i0);
            }
        }
        else {
            final f f = com.google.firebase.crashlytics.internal.f.f();
            final StringBuilder sb = new StringBuilder();
            sb.append("ANR feature enabled, but device is API ");
            sb.append(sdk_INT);
            f.k(sb.toString());
        }
    }
    
    private void n(final Map<String, String> map, final boolean b) {
        this.e.h((Callable<Object>)new Callable<Void>() {
            public Void a() throws Exception {
                new a0(com.google.firebase.crashlytics.internal.common.j.this.I()).m(com.google.firebase.crashlytics.internal.common.j.this.G(), map, b);
                return null;
            }
        });
    }
    
    private void o(final i0 i0) {
        this.e.h((Callable<Object>)new Callable<Void>() {
            public Void a() throws Exception {
                final String c = com.google.firebase.crashlytics.internal.common.j.this.G();
                if (c == null) {
                    com.google.firebase.crashlytics.internal.f.f().b("Tried to cache user data while no session was open.");
                    return null;
                }
                com.google.firebase.crashlytics.internal.common.j.this.n.w(c);
                new a0(com.google.firebase.crashlytics.internal.common.j.this.I()).n(c, i0);
                return null;
            }
        });
    }
    
    private static c0$a q(final w w, final a a, final String s) {
        return c0$a.b(w.f(), a.e, a.f, w.a(), com.google.firebase.crashlytics.internal.common.t.b(a.c).d(), s);
    }
    
    private static c0$b r(final Context context) {
        final StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return c0$b.c(com.google.firebase.crashlytics.internal.common.g.l(), Build.MODEL, Runtime.getRuntime().availableProcessors(), com.google.firebase.crashlytics.internal.common.g.u(), statFs.getBlockCount() * (long)statFs.getBlockSize(), com.google.firebase.crashlytics.internal.common.g.A(context), com.google.firebase.crashlytics.internal.common.g.m(context), Build.MANUFACTURER, Build.PRODUCT);
    }
    
    private static c0$c s(final Context context) {
        return c0$c.a(Build$VERSION.RELEASE, Build$VERSION.CODENAME, com.google.firebase.crashlytics.internal.common.g.C(context));
    }
    
    private static void t(final File[] array) {
        if (array == null) {
            return;
        }
        for (int length = array.length, i = 0; i < length; ++i) {
            array[i].delete();
        }
    }
    
    private void x(final boolean b, final com.google.firebase.crashlytics.internal.settings.e e) {
        final List<String> q = this.n.q();
        if (q.size() <= (b ? 1 : 0)) {
            com.google.firebase.crashlytics.internal.f.f().k("No open sessions to be closed.");
            return;
        }
        final String s = q.get(b ? 1 : 0);
        if (e.b().a().b) {
            this.e0(s);
        }
        if (this.k.c(s)) {
            this.C(s);
            this.k.a(s);
        }
        String s2 = null;
        if ((b ? 1 : 0) != 0) {
            s2 = q.get(0);
        }
        this.n.m(H(), s2);
    }
    
    private void y() {
        final long h = H();
        final String string = new com.google.firebase.crashlytics.internal.common.f(this.f).toString();
        final f f = com.google.firebase.crashlytics.internal.f.f();
        final StringBuilder sb = new StringBuilder();
        sb.append("Opening a new session with ID ");
        sb.append(string);
        f.b(sb.toString());
        this.k.d(string, String.format(Locale.US, "Crashlytics Android SDK/%s", com.google.firebase.crashlytics.internal.common.l.m()), h, com.google.firebase.crashlytics.internal.model.c0.b(q(this.f, this.h, this.l), s(this.F()), r(this.F())));
        this.j.g(string);
        this.n.b(string, h);
    }
    
    private void z(final long lng) {
        try {
            final File i = this.I();
            final StringBuilder sb = new StringBuilder();
            sb.append(".ae");
            sb.append(lng);
            new File(i, sb.toString()).createNewFile();
        }
        catch (IOException ex) {
            com.google.firebase.crashlytics.internal.f.f().n("Could not create app exception marker file.", ex);
        }
    }
    
    void A(final Thread.UncaughtExceptionHandler uncaughtExceptionHandler, final com.google.firebase.crashlytics.internal.settings.e e) {
        this.W();
        Thread.setDefaultUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)(this.o = new q((q.a)new q.a() {
            @Override
            public void a(@j0 final com.google.firebase.crashlytics.internal.settings.e e, @j0 final Thread thread, @j0 final Throwable t) {
                com.google.firebase.crashlytics.internal.common.j.this.N(e, thread, t);
            }
        }, e, uncaughtExceptionHandler)));
    }
    
    boolean D(final com.google.firebase.crashlytics.internal.settings.e e) {
        this.e.b();
        if (this.O()) {
            com.google.firebase.crashlytics.internal.f.f().m("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        com.google.firebase.crashlytics.internal.f.f().k("Finalizing previously open sessions.");
        try {
            this.x(true, e);
            com.google.firebase.crashlytics.internal.f.f().k("Closed all previously open sessions.");
            return true;
        }
        catch (Exception ex) {
            com.google.firebase.crashlytics.internal.f.f().e("Unable to finalize previously open sessions.", ex);
            return false;
        }
    }
    
    File I() {
        return this.g.b();
    }
    
    File K() {
        return new File(this.I(), "native-sessions");
    }
    
    i0 M() {
        return this.d;
    }
    
    void N(@j0 final com.google.firebase.crashlytics.internal.settings.e e, @j0 final Thread thread, @j0 final Throwable obj) {
        synchronized (this) {
            final f f = com.google.firebase.crashlytics.internal.f.f();
            final StringBuilder sb = new StringBuilder();
            sb.append("Handling uncaught exception \"");
            sb.append(obj);
            sb.append("\" from thread ");
            sb.append(thread.getName());
            f.b(sb.toString());
            final com.google.android.gms.tasks.m<T> i = this.e.i((Callable<com.google.android.gms.tasks.m<T>>)new Callable<com.google.android.gms.tasks.m<Void>>() {
                final /* synthetic */ long G = System.currentTimeMillis();
                
                public com.google.android.gms.tasks.m<Void> a() throws Exception {
                    final long b = L(this.G);
                    final String c = com.google.firebase.crashlytics.internal.common.j.this.G();
                    if (c == null) {
                        com.google.firebase.crashlytics.internal.f.f().d("Tried to write a fatal exception while no session was open.");
                        return com.google.android.gms.tasks.p.g((Void)null);
                    }
                    com.google.firebase.crashlytics.internal.common.j.this.c.a();
                    com.google.firebase.crashlytics.internal.common.j.this.n.u(obj, thread, c, b);
                    com.google.firebase.crashlytics.internal.common.j.this.z(this.G);
                    com.google.firebase.crashlytics.internal.common.j.this.w(e);
                    com.google.firebase.crashlytics.internal.common.j.this.y();
                    if (!com.google.firebase.crashlytics.internal.common.j.this.b.d()) {
                        return com.google.android.gms.tasks.p.g((Void)null);
                    }
                    final Executor c2 = com.google.firebase.crashlytics.internal.common.j.this.e.c();
                    return e.a().x(c2, new l<b3.b, Void>() {
                        @j0
                        public com.google.android.gms.tasks.m<Void> b(@k0 final b3.b b) throws Exception {
                            if (b == null) {
                                com.google.firebase.crashlytics.internal.f.f().m("Received null app settings, cannot send reports at crash time.");
                                return com.google.android.gms.tasks.p.g((Void)null);
                            }
                            return com.google.android.gms.tasks.p.i(com.google.firebase.crashlytics.internal.common.j.this.V(), com.google.firebase.crashlytics.internal.common.j.this.n.y(c2));
                        }
                    });
                }
            });
            try {
                com.google.firebase.crashlytics.internal.common.k0.b((com.google.android.gms.tasks.m<Object>)i);
            }
            catch (Exception ex) {
                com.google.firebase.crashlytics.internal.f.f().e("Error handling uncaught exception", ex);
            }
        }
    }
    
    boolean O() {
        final q o = this.o;
        return o != null && o.a();
    }
    
    File[] Q() {
        return this.S(com.google.firebase.crashlytics.internal.common.j.x);
    }
    
    File[] T() {
        return B(this.K().listFiles());
    }
    
    void W() {
        this.e.h((Callable<Object>)new Callable<Void>() {
            public Void a() throws Exception {
                com.google.firebase.crashlytics.internal.common.j.this.y();
                return null;
            }
        });
    }
    
    com.google.android.gms.tasks.m<Void> X() {
        this.q.e(Boolean.TRUE);
        return this.r.a();
    }
    
    void Y(final String s, final String s2) {
        try {
            this.d.d(s, s2);
            this.n(this.d.a(), false);
        }
        catch (IllegalArgumentException ex) {
            final Context a = this.a;
            if (a != null && com.google.firebase.crashlytics.internal.common.g.y(a)) {
                throw ex;
            }
            com.google.firebase.crashlytics.internal.f.f().d("Attempting to set custom attribute with null key, ignoring.");
        }
    }
    
    void Z(final Map<String, String> map) {
        this.d.e(map);
        this.n(this.d.a(), false);
    }
    
    void a0(final String s, final String s2) {
        try {
            this.d.f(s, s2);
            this.n(this.d.b(), true);
        }
        catch (IllegalArgumentException ex) {
            final Context a = this.a;
            if (a != null && com.google.firebase.crashlytics.internal.common.g.y(a)) {
                throw ex;
            }
            com.google.firebase.crashlytics.internal.f.f().d("Attempting to set custom attribute with null key, ignoring.");
        }
    }
    
    void b0(final String s) {
        this.d.g(s);
        this.o(this.d);
    }
    
    com.google.android.gms.tasks.m<Void> c0(final com.google.android.gms.tasks.m<b3.b> m) {
        if (!this.n.o()) {
            com.google.firebase.crashlytics.internal.f.f().k("No crash reports are available to be sent.");
            this.p.e(Boolean.FALSE);
            return com.google.android.gms.tasks.p.g((Void)null);
        }
        com.google.firebase.crashlytics.internal.f.f().k("Crash reports are available to be sent.");
        return this.d0().w((l<Boolean, Void>)new l<Boolean, Void>() {
            @j0
            public com.google.android.gms.tasks.m<Void> b(@k0 final Boolean b) throws Exception {
                return com.google.firebase.crashlytics.internal.common.j.this.e.i((Callable<com.google.android.gms.tasks.m<Void>>)new Callable<com.google.android.gms.tasks.m<Void>>() {
                    public com.google.android.gms.tasks.m<Void> a() throws Exception {
                        if (!b) {
                            com.google.firebase.crashlytics.internal.f.f().k("Deleting cached crash reports...");
                            t(com.google.firebase.crashlytics.internal.common.j.this.Q());
                            com.google.firebase.crashlytics.internal.common.j.this.n.x();
                            com.google.firebase.crashlytics.internal.common.j.this.r.e(null);
                            return com.google.android.gms.tasks.p.g((Void)null);
                        }
                        com.google.firebase.crashlytics.internal.f.f().b("Sending cached crash reports...");
                        com.google.firebase.crashlytics.internal.common.j.this.b.c(b);
                        final Executor c = com.google.firebase.crashlytics.internal.common.j.this.e.c();
                        return m.x(c, new l<b3.b, Void>() {
                            @j0
                            public com.google.android.gms.tasks.m<Void> b(@k0 final b3.b b) throws Exception {
                                if (b == null) {
                                    com.google.firebase.crashlytics.internal.f.f().m("Received null app settings at app startup. Cannot send cached reports");
                                }
                                else {
                                    com.google.firebase.crashlytics.internal.common.j.this.V();
                                    com.google.firebase.crashlytics.internal.common.j.this.n.y(c);
                                    com.google.firebase.crashlytics.internal.common.j.this.r.e(null);
                                }
                                return com.google.android.gms.tasks.p.g((Void)null);
                            }
                        });
                    }
                });
            }
        });
    }
    
    void f0(@j0 final Thread thread, @j0 final Throwable t) {
        this.e.g(new Runnable() {
            final /* synthetic */ long G = System.currentTimeMillis();
            
            @Override
            public void run() {
                if (!com.google.firebase.crashlytics.internal.common.j.this.O()) {
                    final long b = L(this.G);
                    final String c = com.google.firebase.crashlytics.internal.common.j.this.G();
                    if (c == null) {
                        com.google.firebase.crashlytics.internal.f.f().m("Tried to write a non-fatal exception while no session was open.");
                        return;
                    }
                    com.google.firebase.crashlytics.internal.common.j.this.n.v(t, thread, c, b);
                }
            }
        });
    }
    
    void g0(final long n, final String s) {
        this.e.h((Callable<Object>)new Callable<Void>() {
            public Void a() throws Exception {
                if (!com.google.firebase.crashlytics.internal.common.j.this.O()) {
                    com.google.firebase.crashlytics.internal.common.j.this.j.i(n, s);
                }
                return null;
            }
        });
    }
    
    @j0
    com.google.android.gms.tasks.m<Boolean> p() {
        if (!this.s.compareAndSet(false, true)) {
            com.google.firebase.crashlytics.internal.f.f().m("checkForUnsentReports should only be called once per execution.");
            return com.google.android.gms.tasks.p.g(Boolean.FALSE);
        }
        return this.p.a();
    }
    
    com.google.android.gms.tasks.m<Void> u() {
        this.q.e(Boolean.FALSE);
        return this.r.a();
    }
    
    boolean v() {
        final boolean c = this.c.c();
        boolean b = true;
        if (!c) {
            final String g = this.G();
            if (g == null || !this.k.c(g)) {
                b = false;
            }
            return b;
        }
        com.google.firebase.crashlytics.internal.f.f().k("Found previous crash marker.");
        this.c.d();
        return true;
    }
    
    void w(final com.google.firebase.crashlytics.internal.settings.e e) {
        this.x(false, e);
    }
}
