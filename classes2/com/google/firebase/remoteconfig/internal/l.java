// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.remoteconfig.internal;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.HashMap;
import com.google.android.gms.tasks.p;
import androidx.annotation.c1;
import com.google.firebase.remoteconfig.n;
import android.text.format.DateUtils;
import com.google.firebase.remoteconfig.m;
import com.google.firebase.remoteconfig.q;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.Map;
import java.util.Random;
import com.google.android.gms.common.util.g;
import java.util.concurrent.Executor;
import androidx.annotation.k0;
import com.google.firebase.analytics.connector.a;
import com.google.firebase.installations.j;
import androidx.annotation.b1;

public class l
{
    public static final long j;
    @b1
    static final int[] k;
    @b1
    static final int l = 429;
    private final j a;
    @k0
    private final com.google.firebase.analytics.connector.a b;
    private final Executor c;
    private final g d;
    private final Random e;
    private final f f;
    private final ConfigFetchHttpClient g;
    private final o h;
    private final Map<String, String> i;
    
    static {
        j = TimeUnit.HOURS.toSeconds(12L);
        k = new int[] { 2, 4, 8, 16, 32, 64, 128, 256 };
    }
    
    public l(final j a, @k0 final com.google.firebase.analytics.connector.a b, final Executor c, final g d, final Random e, final f f, final ConfigFetchHttpClient g, final o h, final Map<String, String> i) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    private boolean a(final long duration, final Date date) {
        final Date g = this.h.g();
        return !g.equals(o.e) && date.before(new Date(g.getTime() + TimeUnit.SECONDS.toMillis(duration)));
    }
    
    private q b(final q q) throws m {
        final int a = q.a();
        String str;
        if (a != 401) {
            if (a != 403) {
                if (a == 429) {
                    throw new m("The throttled response from the server was not handled correctly by the FRC SDK.");
                }
                if (a != 500) {
                    switch (a) {
                        default: {
                            str = "The server returned an unexpected error.";
                            break;
                        }
                        case 502:
                        case 503:
                        case 504: {
                            str = "The server is unavailable. Please try again later.";
                            break;
                        }
                    }
                }
                else {
                    str = "There was an internal server error.";
                }
            }
            else {
                str = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
            }
        }
        else {
            str = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
        }
        final int a2 = q.a();
        final StringBuilder sb = new StringBuilder();
        sb.append("Fetch failed: ");
        sb.append(str);
        return new q(a2, sb.toString(), (Throwable)q);
    }
    
    private String c(final long duration) {
        return String.format("Fetch is throttled. Please wait before calling fetch again: %s", DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(duration)));
    }
    
    @c1
    private a f(final String s, final String s2, final Date date) throws n {
        try {
            final a fetch = this.g.fetch(this.g.c(), s, s2, this.l(), this.h.e(), this.i, date);
            if (fetch.f() != null) {
                this.h.m(fetch.f());
            }
            this.h.i();
            return fetch;
        }
        catch (q q) {
            final o.a s3 = this.s(q.a(), date);
            if (this.r(s3, q.a())) {
                throw new com.google.firebase.remoteconfig.o(s3.a().getTime());
            }
            throw this.b(q);
        }
    }
    
    private com.google.android.gms.tasks.m<a> g(final String s, final String s2, final Date date) {
        try {
            final a f = this.f(s, s2, date);
            if (f.g() != 0) {
                return (com.google.android.gms.tasks.m<a>)p.g((Object)f);
            }
            return (com.google.android.gms.tasks.m<a>)this.f.k(f.e()).x(this.c, com.google.firebase.remoteconfig.internal.k.b(f));
        }
        catch (n n) {
            return (com.google.android.gms.tasks.m<a>)p.f((Exception)n);
        }
    }
    
    private com.google.android.gms.tasks.m<a> h(final com.google.android.gms.tasks.m<com.google.firebase.remoteconfig.internal.g> m, final long n) {
        final Date date = new Date(this.d.a());
        if (m.v() && this.a(n, date)) {
            return (com.google.android.gms.tasks.m<a>)p.g((Object)com.google.firebase.remoteconfig.internal.l.a.c(date));
        }
        final Date j = this.j(date);
        com.google.android.gms.tasks.m i;
        if (j != null) {
            i = p.f((Exception)new com.google.firebase.remoteconfig.o(this.c(j.getTime() - date.getTime()), j.getTime()));
        }
        else {
            final com.google.android.gms.tasks.m<String> b = this.a.b();
            final com.google.android.gms.tasks.m<com.google.firebase.installations.o> a = this.a.a(false);
            i = p.k(new com.google.android.gms.tasks.m[] { b, a }).p(this.c, com.google.firebase.remoteconfig.internal.i.b(this, b, a, date));
        }
        return (com.google.android.gms.tasks.m<a>)i.p(this.c, com.google.firebase.remoteconfig.internal.j.b(this, date));
    }
    
    @k0
    private Date j(final Date date) {
        final Date a = this.h.b().a();
        if (date.before(a)) {
            return a;
        }
        return null;
    }
    
    private long k(final int a) {
        final TimeUnit minutes = TimeUnit.MINUTES;
        final int[] k = com.google.firebase.remoteconfig.internal.l.k;
        final long millis = minutes.toMillis(k[Math.min(a, k.length) - 1]);
        return millis / 2L + this.e.nextInt((int)millis);
    }
    
    @c1
    private Map<String, String> l() {
        final HashMap<String, String> hashMap = new HashMap<String, String>();
        final com.google.firebase.analytics.connector.a b = this.b;
        if (b == null) {
            return hashMap;
        }
        for (final Map.Entry<String, V> entry : b.a(false).entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue().toString());
        }
        return hashMap;
    }
    
    private boolean m(final int n) {
        return n == 429 || n == 502 || n == 503 || n == 504;
    }
    
    private boolean r(final o.a a, final int n) {
        final int b = a.b();
        boolean b2 = true;
        if (b <= 1) {
            b2 = (n == 429 && b2);
        }
        return b2;
    }
    
    private o.a s(final int n, final Date date) {
        if (this.m(n)) {
            this.t(date);
        }
        return this.h.b();
    }
    
    private void t(Date date) {
        final int n = this.h.b().b() + 1;
        date = new Date(date.getTime() + this.k(n));
        this.h.j(n, date);
    }
    
    private void u(final com.google.android.gms.tasks.m<a> m, final Date date) {
        if (m.v()) {
            this.h.o(date);
            return;
        }
        final Exception q = m.q();
        if (q == null) {
            return;
        }
        if (q instanceof com.google.firebase.remoteconfig.o) {
            this.h.p();
        }
        else {
            this.h.n();
        }
    }
    
    public com.google.android.gms.tasks.m<a> d() {
        return this.e(this.h.h());
    }
    
    public com.google.android.gms.tasks.m<a> e(final long n) {
        return (com.google.android.gms.tasks.m<a>)this.f.d().p(this.c, com.google.firebase.remoteconfig.internal.h.b(this, n));
    }
    
    @b1
    @k0
    public com.google.firebase.analytics.connector.a i() {
        return this.b;
    }
    
    public static class a
    {
        private final Date a;
        private final int b;
        private final com.google.firebase.remoteconfig.internal.g c;
        @k0
        private final String d;
        
        private a(final Date a, final int b, final com.google.firebase.remoteconfig.internal.g c, @k0 final String d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
        
        public static l.a a(final Date date) {
            return new l.a(date, 1, null, null);
        }
        
        public static l.a b(final com.google.firebase.remoteconfig.internal.g g, final String s) {
            return new l.a(g.e(), 0, g, s);
        }
        
        public static l.a c(final Date date) {
            return new l.a(date, 2, null, null);
        }
        
        Date d() {
            return this.a;
        }
        
        public com.google.firebase.remoteconfig.internal.g e() {
            return this.c;
        }
        
        @k0
        String f() {
            return this.d;
        }
        
        int g() {
            return this.b;
        }
        
        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
            public static final int v1 = 0;
            public static final int w1 = 1;
            public static final int x1 = 2;
        }
    }
}
