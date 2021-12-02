// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.crashlytics.internal.common;

import java.io.File;
import java.util.Map;
import c3.c;
import c3.d;
import com.google.firebase.crashlytics.internal.log.b$b;
import com.google.firebase.crashlytics.internal.persistence.i;
import androidx.annotation.j0;
import android.util.Log;
import android.text.TextUtils;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.TimeUnit;
import com.google.android.gms.tasks.p;
import com.google.firebase.crashlytics.internal.f;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import com.google.firebase.crashlytics.internal.analytics.a;
import androidx.annotation.b1;
import z2.b;
import com.google.firebase.e;
import android.content.Context;

public class l
{
    private static final String o = "The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.";
    static final int p = 1024;
    static final int q = 10;
    static final String r = "com.crashlytics.RequireBuildId";
    static final boolean s = true;
    static final int t = 4;
    private static final String u = "initialization_marker";
    static final String v = "crash_marker";
    private final Context a;
    private final com.google.firebase.e b;
    private final s c;
    private final long d;
    private m e;
    private m f;
    private boolean g;
    private j h;
    private final w i;
    @b1
    public final b j;
    private final a k;
    private final ExecutorService l;
    private final h m;
    private final com.google.firebase.crashlytics.internal.a n;
    
    public l(final com.google.firebase.e b, final w i, final com.google.firebase.crashlytics.internal.a n, final s c, final b j, final a k, final ExecutorService l) {
        this.b = b;
        this.c = c;
        this.a = b.m();
        this.i = i;
        this.n = n;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = new h(l);
        this.d = System.currentTimeMillis();
    }
    
    private void d() {
        final com.google.android.gms.tasks.m<T> h = this.m.h((Callable<T>)new Callable<Boolean>() {
            public Boolean a() throws Exception {
                return com.google.firebase.crashlytics.internal.common.l.this.h.v();
            }
        });
        while (true) {
            try {
                final boolean equals = Boolean.TRUE.equals(k0.b((com.google.android.gms.tasks.m<Boolean>)h));
                this.g = equals;
            }
            catch (Exception ex) {
                final boolean equals = false;
                continue;
            }
            break;
        }
    }
    
    private com.google.android.gms.tasks.m<Void> i(final com.google.firebase.crashlytics.internal.settings.e e) {
        this.r();
        try {
            try {
                this.j.a(new k(this));
                if (!e.b().a().a) {
                    com.google.firebase.crashlytics.internal.f.f().b("Collection of crash reports disabled in Crashlytics settings.");
                    final com.google.android.gms.tasks.m<Void> f = com.google.android.gms.tasks.p.f(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
                    this.q();
                    return f;
                }
                if (!this.h.D(e)) {
                    com.google.firebase.crashlytics.internal.f.f().m("Previous sessions could not be finalized.");
                }
                final com.google.android.gms.tasks.m<Void> c0 = this.h.c0(e.a());
                this.q();
                return c0;
            }
            finally {}
        }
        catch (Exception ex) {
            com.google.firebase.crashlytics.internal.f.f().e("Crashlytics encountered a problem during asynchronous initialization.", ex);
            final com.google.android.gms.tasks.m<Void> f2 = com.google.android.gms.tasks.p.f(ex);
            this.q();
            return f2;
        }
        this.q();
    }
    
    private void k(final com.google.firebase.crashlytics.internal.settings.e e) {
        final Future<?> submit = this.l.submit(new Runnable() {
            @Override
            public void run() {
                com.google.firebase.crashlytics.internal.common.l.this.i(e);
            }
        });
        com.google.firebase.crashlytics.internal.f.f().b("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        f f;
        String s;
        try {
            submit.get(4L, TimeUnit.SECONDS);
            return;
        }
        catch (TimeoutException ex) {
            f = com.google.firebase.crashlytics.internal.f.f();
            s = "Crashlytics timed out during initialization.";
        }
        catch (ExecutionException ex) {
            f = com.google.firebase.crashlytics.internal.f.f();
            s = "Crashlytics encountered a problem during initialization.";
        }
        catch (InterruptedException ex) {
            f = com.google.firebase.crashlytics.internal.f.f();
            s = "Crashlytics was interrupted during initialization.";
        }
        final TimeoutException ex;
        f.e(s, ex);
    }
    
    public static String m() {
        return "18.2.1";
    }
    
    static boolean n(final String s, final boolean b) {
        if (!b) {
            f.f().k("Configured not to require a build ID.");
            return true;
        }
        if (!TextUtils.isEmpty((CharSequence)s)) {
            return true;
        }
        Log.e("FirebaseCrashlytics", ".");
        Log.e("FirebaseCrashlytics", ".     |  | ");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".   \\ |  | /");
        Log.e("FirebaseCrashlytics", ".    \\    /");
        Log.e("FirebaseCrashlytics", ".     \\  /");
        Log.e("FirebaseCrashlytics", ".      \\/");
        Log.e("FirebaseCrashlytics", ".");
        Log.e("FirebaseCrashlytics", "The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.");
        Log.e("FirebaseCrashlytics", ".");
        Log.e("FirebaseCrashlytics", ".      /\\");
        Log.e("FirebaseCrashlytics", ".     /  \\");
        Log.e("FirebaseCrashlytics", ".    /    \\");
        Log.e("FirebaseCrashlytics", ".   / |  | \\");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".");
        return false;
    }
    
    @j0
    public com.google.android.gms.tasks.m<Boolean> e() {
        return this.h.p();
    }
    
    public com.google.android.gms.tasks.m<Void> f() {
        return this.h.u();
    }
    
    public boolean g() {
        return this.g;
    }
    
    boolean h() {
        return this.e.c();
    }
    
    public com.google.android.gms.tasks.m<Void> j(final com.google.firebase.crashlytics.internal.settings.e e) {
        return k0.c(this.l, (Callable<com.google.android.gms.tasks.m<Void>>)new Callable<com.google.android.gms.tasks.m<Void>>() {
            public com.google.android.gms.tasks.m<Void> a() throws Exception {
                return com.google.firebase.crashlytics.internal.common.l.this.i(e);
            }
        });
    }
    
    j l() {
        return this.h;
    }
    
    public void o(final String s) {
        this.h.g0(System.currentTimeMillis() - this.d, s);
    }
    
    public void p(@j0 final Throwable t) {
        this.h.f0(Thread.currentThread(), t);
    }
    
    void q() {
        this.m.h((Callable<Object>)new Callable<Boolean>() {
            public Boolean a() throws Exception {
                try {
                    final boolean d = com.google.firebase.crashlytics.internal.common.l.this.e.d();
                    if (!d) {
                        com.google.firebase.crashlytics.internal.f.f().m("Initialization marker file was not properly removed.");
                    }
                    return d;
                }
                catch (Exception ex) {
                    com.google.firebase.crashlytics.internal.f.f().e("Problem encountered deleting Crashlytics initialization marker.", ex);
                    return Boolean.FALSE;
                }
            }
        });
    }
    
    void r() {
        this.m.b();
        this.e.a();
        com.google.firebase.crashlytics.internal.f.f().k("Initialization marker file was created.");
    }
    
    public boolean s(final com.google.firebase.crashlytics.internal.common.a a, final com.google.firebase.crashlytics.internal.settings.e e) {
        if (n(a.b, com.google.firebase.crashlytics.internal.common.g.k(this.a, "com.crashlytics.RequireBuildId", true))) {
            try {
                final i i = new i(this.a);
                this.f = new m("crash_marker", (com.google.firebase.crashlytics.internal.persistence.h)i);
                this.e = new m("initialization_marker", (com.google.firebase.crashlytics.internal.persistence.h)i);
                final i0 i2 = new i0();
                final e e2 = new e((com.google.firebase.crashlytics.internal.persistence.h)i);
                final com.google.firebase.crashlytics.internal.log.b b = new com.google.firebase.crashlytics.internal.log.b(this.a, (b$b)e2);
                this.h = new j(this.a, this.m, this.i, this.c, (com.google.firebase.crashlytics.internal.persistence.h)i, this.f, a, i2, b, (b$b)e2, g0.k(this.a, this.i, (com.google.firebase.crashlytics.internal.persistence.h)i, a, b, i2, (d)new c3.a(1024, new d[] { (d)new c(10) }), e), this.n, this.k);
                final boolean h = this.h();
                this.d();
                this.h.A(Thread.getDefaultUncaughtExceptionHandler(), e);
                if (h && com.google.firebase.crashlytics.internal.common.g.c(this.a)) {
                    com.google.firebase.crashlytics.internal.f.f().b("Crashlytics did not finish previous background initialization. Initializing synchronously.");
                    this.k(e);
                    return false;
                }
                com.google.firebase.crashlytics.internal.f.f().b("Successfully configured exception handler.");
                return true;
            }
            catch (Exception ex) {
                com.google.firebase.crashlytics.internal.f.f().e("Crashlytics was not started due to an exception during initialization", ex);
                this.h = null;
                return false;
            }
        }
        throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.");
    }
    
    public com.google.android.gms.tasks.m<Void> t() {
        return this.h.X();
    }
    
    public void u(@androidx.annotation.k0 final Boolean b) {
        this.c.g(b);
    }
    
    public void v(final String s, final String s2) {
        this.h.Y(s, s2);
    }
    
    public void w(final Map<String, String> map) {
        this.h.Z(map);
    }
    
    public void x(final String s, final String s2) {
        this.h.a0(s, s2);
    }
    
    public void y(final String s) {
        this.h.b0(s);
    }
    
    private static final class e implements b$b
    {
        private static final String b = "log-files";
        private final com.google.firebase.crashlytics.internal.persistence.h a;
        
        public e(final com.google.firebase.crashlytics.internal.persistence.h a) {
            this.a = a;
        }
        
        public File a() {
            final File file = new File(this.a.b(), "log-files");
            if (!file.exists()) {
                file.mkdirs();
            }
            return file;
        }
    }
}
