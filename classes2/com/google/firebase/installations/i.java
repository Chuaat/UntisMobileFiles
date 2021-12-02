// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.installations;

import androidx.annotation.b1;
import androidx.annotation.k0;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import com.google.android.gms.tasks.p;
import java.io.IOException;
import com.google.android.gms.tasks.n;
import com.google.android.gms.tasks.m;
import java.util.Iterator;
import android.text.TextUtils;
import com.google.firebase.installations.local.d;
import com.google.android.gms.common.internal.x;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import com.google.firebase.heartbeatinfo.k;
import androidx.annotation.j0;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.List;
import o3.a;
import java.util.Set;
import androidx.annotation.w;
import java.util.concurrent.ExecutorService;
import com.google.firebase.installations.local.b;
import com.google.firebase.installations.remote.c;
import com.google.firebase.e;
import java.util.concurrent.ThreadFactory;

public class i implements j
{
    private static final Object m;
    private static final String n = "generatefid.lock";
    private static final String o = "CHIME_ANDROID_SDK";
    private static final int p = 0;
    private static final int q = 1;
    private static final long r = 30L;
    private static final ThreadFactory s;
    private static final String t = "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.";
    private static final String u = "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.";
    private static final String v = "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.";
    private static final String w = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request.";
    private final e a;
    private final c b;
    private final com.google.firebase.installations.local.c c;
    private final s d;
    private final b e;
    private final q f;
    private final Object g;
    private final ExecutorService h;
    private final ExecutorService i;
    @w("this")
    private String j;
    @w("FirebaseInstallations.this")
    private Set<a> k;
    @w("lock")
    private final List<r> l;
    
    static {
        m = new Object();
        s = new ThreadFactory() {
            private final AtomicInteger G = new AtomicInteger(1);
            
            @Override
            public Thread newThread(final Runnable target) {
                return new Thread(target, String.format("firebase-installations-executor-%d", this.G.getAndIncrement()));
            }
        };
    }
    
    i(final e e, @j0 final n3.b<com.google.firebase.platforminfo.i> b, @j0 final n3.b<k> b2) {
        this(new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(), com.google.firebase.installations.i.s), e, new c(e.m(), b, b2), new com.google.firebase.installations.local.c(e), com.google.firebase.installations.s.c(), new b(e), new q());
    }
    
    i(final ExecutorService h, final e a, final c b, final com.google.firebase.installations.local.c c, final s d, final b e, final q f) {
        this.g = new Object();
        this.k = new HashSet<a>();
        this.l = new ArrayList<r>();
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.h = h;
        this.i = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(), com.google.firebase.installations.i.s);
    }
    
    private void D() {
        x.h(this.r(), (Object)"Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        x.h(this.y(), (Object)"Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        x.h(this.q(), (Object)"Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        x.b(com.google.firebase.installations.s.h(this.r()), (Object)"Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        x.b(com.google.firebase.installations.s.g(this.q()), (Object)"Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }
    
    private String E(final d d) {
        if ((!this.a.q().equals("CHIME_ANDROID_SDK") && !this.a.A()) || !d.m()) {
            return this.f.a();
        }
        String s;
        if (TextUtils.isEmpty((CharSequence)(s = this.e.f()))) {
            s = this.f.a();
        }
        return s;
    }
    
    private d F(final d d) throws com.google.firebase.installations.k {
        String i;
        if (d.d() != null && d.d().length() == 11) {
            i = this.e.i();
        }
        else {
            i = null;
        }
        final com.google.firebase.installations.remote.d d2 = this.b.d(this.q(), d.d(), this.y(), this.r(), i);
        final int n = i$c.a[d2.e().ordinal()];
        if (n == 1) {
            return d.s(d2.c(), d2.d(), this.d.b(), d2.b().c(), d2.b().d());
        }
        if (n == 2) {
            return d.q("BAD CONFIG");
        }
        throw new com.google.firebase.installations.k("Firebase Installations Service is unavailable. Please try again later.", com.google.firebase.installations.k.a.H);
    }
    
    private void G(final Exception ex) {
        synchronized (this.g) {
            final Iterator<r> iterator = this.l.iterator();
            while (iterator.hasNext()) {
                if (iterator.next().a(ex)) {
                    iterator.remove();
                }
            }
        }
    }
    
    private void H(final d d) {
        synchronized (this.g) {
            final Iterator<r> iterator = this.l.iterator();
            while (iterator.hasNext()) {
                if (iterator.next().b(d)) {
                    iterator.remove();
                }
            }
        }
    }
    
    private void I(final String j) {
        synchronized (this) {
            this.j = j;
        }
    }
    
    private void J(final d d, final d d2) {
        synchronized (this) {
            if (this.k.size() != 0 && !d.d().equals(d2.d())) {
                final Iterator<a> iterator = this.k.iterator();
                while (iterator.hasNext()) {
                    iterator.next().a(d2.d());
                }
            }
        }
    }
    
    private m<o> j() {
        final n n = new n();
        this.l(new com.google.firebase.installations.m(this.d, (n<o>)n));
        return (m<o>)n.a();
    }
    
    private m<String> k() {
        final n n = new n();
        this.l(new com.google.firebase.installations.n((n<String>)n));
        return (m<String>)n.a();
    }
    
    private void l(final r r) {
        synchronized (this.g) {
            this.l.add(r);
        }
    }
    
    private Void m() throws com.google.firebase.installations.k {
        this.I(null);
        final d v = this.v();
        if (v.k()) {
            this.b.e(this.q(), v.d(), this.y(), v.f());
        }
        this.z(v.r());
        return null;
    }
    
    private void n(final boolean b) {
        final d v = this.v();
        try {
            d d;
            if (!v.i() && !v.l()) {
                if (!b && !this.d.f(v)) {
                    return;
                }
                d = this.p(v);
            }
            else {
                d = this.F(v);
            }
            this.z(d);
            this.J(v, d);
            if (d.k()) {
                this.I(d.d());
            }
            Object o;
            if (d.i()) {
                o = new com.google.firebase.installations.k(com.google.firebase.installations.k.a.G);
            }
            else {
                if (!d.j()) {
                    this.H(d);
                    return;
                }
                o = new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request.");
            }
            this.G((Exception)o);
        }
        catch (com.google.firebase.installations.k k) {
            this.G((Exception)k);
        }
    }
    
    private final void o(final boolean b) {
        d d = this.x();
        if (b) {
            d = d.p();
        }
        this.H(d);
        this.i.execute(new f(this, b));
    }
    
    private d p(@j0 final d d) throws com.google.firebase.installations.k {
        final com.google.firebase.installations.remote.f f = this.b.f(this.q(), d.d(), this.y(), d.f());
        final int n = i$c.b[f.b().ordinal()];
        if (n == 1) {
            return d.o(f.c(), f.d(), this.d.b());
        }
        if (n == 2) {
            return d.q("BAD CONFIG");
        }
        if (n == 3) {
            this.I(null);
            return d.r();
        }
        throw new com.google.firebase.installations.k("Firebase Installations Service is unavailable. Please try again later.", com.google.firebase.installations.k.a.H);
    }
    
    private String s() {
        synchronized (this) {
            return this.j;
        }
    }
    
    @j0
    public static i t() {
        return u(e.o());
    }
    
    @j0
    public static i u(@j0 final e e) {
        x.b(e != null, (Object)"Null is not a valid value of FirebaseApp.");
        return (i)e.k((Class)j.class);
    }
    
    private d v() {
        synchronized (com.google.firebase.installations.i.m) {
            final com.google.firebase.installations.d a = com.google.firebase.installations.d.a(this.a.m(), "generatefid.lock");
            try {
                return this.c.d();
            }
            finally {
                if (a != null) {
                    a.b();
                }
            }
        }
    }
    
    private d x() {
        synchronized (com.google.firebase.installations.i.m) {
            final com.google.firebase.installations.d a = com.google.firebase.installations.d.a(this.a.m(), "generatefid.lock");
            try {
                d d2;
                final d d = d2 = this.c.d();
                if (d.j()) {
                    d2 = this.c.b(d.t(this.E(d)));
                }
                return d2;
            }
            finally {
                if (a != null) {
                    a.b();
                }
            }
        }
    }
    
    private void z(final d d) {
        synchronized (com.google.firebase.installations.i.m) {
            final com.google.firebase.installations.d a = d.a(this.a.m(), "generatefid.lock");
            try {
                this.c.b(d);
            }
            finally {
                if (a != null) {
                    a.b();
                }
            }
        }
    }
    
    @j0
    @Override
    public m<o> a(final boolean b) {
        this.D();
        final m<o> j = this.j();
        this.h.execute(new g(this, b));
        return j;
    }
    
    @j0
    @Override
    public m<String> b() {
        this.D();
        final String s = this.s();
        if (s != null) {
            return (m<String>)com.google.android.gms.tasks.p.g((Object)s);
        }
        final m<String> k = this.k();
        this.h.execute(new com.google.firebase.installations.e(this));
        return k;
    }
    
    @j0
    @Override
    public o3.b c(@j0 final a a) {
        synchronized (this) {
            this.k.add(a);
            return new o3.b() {
                @Override
                public void a() {
                    synchronized (com.google.firebase.installations.i.this) {
                        com.google.firebase.installations.i.this.k.remove(a);
                    }
                }
            };
        }
    }
    
    @j0
    @Override
    public m<Void> d() {
        return (m<Void>)com.google.android.gms.tasks.p.d((Executor)this.h, (Callable)new h(this));
    }
    
    @k0
    String q() {
        return this.a.r().i();
    }
    
    @b1
    String r() {
        return this.a.r().j();
    }
    
    @b1
    String w() {
        return this.a.q();
    }
    
    @k0
    String y() {
        return this.a.r().n();
    }
}
