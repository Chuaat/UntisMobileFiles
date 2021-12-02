// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.crashlytics.internal.settings;

import androidx.annotation.j0;
import androidx.annotation.k0;
import com.google.android.gms.tasks.l;
import com.google.android.gms.tasks.p;
import java.util.concurrent.Executor;
import com.google.android.gms.tasks.m;
import android.annotation.SuppressLint;
import android.content.SharedPreferences$Editor;
import b3.f;
import java.util.Locale;
import com.google.firebase.crashlytics.internal.common.x;
import com.google.firebase.crashlytics.internal.common.t;
import com.google.firebase.crashlytics.internal.common.h0;
import com.google.firebase.crashlytics.internal.common.w;
import org.json.JSONException;
import org.json.JSONObject;
import com.google.android.gms.tasks.n;
import java.util.concurrent.atomic.AtomicReference;
import com.google.firebase.crashlytics.internal.common.s;
import com.google.firebase.crashlytics.internal.settings.network.b;
import com.google.firebase.crashlytics.internal.common.r;
import b3.g;
import android.content.Context;

public class d implements e
{
    private static final String j = "existing_instance_identifier";
    private static final String k = "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings";
    private final Context a;
    private final g b;
    private final com.google.firebase.crashlytics.internal.settings.g c;
    private final r d;
    private final a e;
    private final b f;
    private final s g;
    private final AtomicReference<b3.e> h;
    private final AtomicReference<n<b3.b>> i;
    
    d(final Context a, final g b, final r d, final com.google.firebase.crashlytics.internal.settings.g c, final a e, final b f, final s g) {
        final AtomicReference<b3.e> h = new AtomicReference<b3.e>();
        this.h = h;
        this.i = new AtomicReference<n<b3.b>>((n<b3.b>)new n());
        this.a = a;
        this.b = b;
        this.d = d;
        this.c = c;
        this.e = e;
        this.f = f;
        this.g = g;
        h.set(com.google.firebase.crashlytics.internal.settings.b.f(d));
    }
    
    public static d l(final Context context, final String s, final w w, final a3.b b, final String s2, final String s3, final s s4) {
        final String g = w.g();
        final h0 h0 = new h0();
        return new d(context, new g(s, w.h(), w.i(), w.j(), (x)w, com.google.firebase.crashlytics.internal.common.g.h(new String[] { com.google.firebase.crashlytics.internal.common.g.o(context), s, s3, s2 }), s3, s2, t.b(g).d()), (r)h0, new com.google.firebase.crashlytics.internal.settings.g((r)h0), new a(context), new com.google.firebase.crashlytics.internal.settings.network.a(String.format(Locale.US, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings", s), b), s4);
    }
    
    private f m(final c c) {
        final f f = null;
        final f f2 = null;
        f b = f;
        Label_0151: {
            try {
                if (c.H.equals(c)) {
                    return b;
                }
                final JSONObject b2 = this.e.b();
                if (b2 != null) {
                    b = this.c.b(b2);
                    if (b != null) {
                        this.q(b2, "Loaded cached settings: ");
                        final long a = this.d.a();
                        if (!c.I.equals(c)) {
                            if (b.d(a)) {
                                com.google.firebase.crashlytics.internal.f.f().k("Cached settings have expired.");
                                b = f;
                                return b;
                            }
                        }
                        try {
                            com.google.firebase.crashlytics.internal.f.f().k("Returning cached settings.");
                            return b;
                        }
                        catch (Exception ex) {
                            break Label_0151;
                        }
                    }
                    com.google.firebase.crashlytics.internal.f.f().e("Failed to parse cached settings data.", (Throwable)null);
                    b = f;
                    return b;
                }
                com.google.firebase.crashlytics.internal.f.f().b("No cached settings data found.");
                b = f;
                return b;
            }
            catch (Exception ex) {
                b = f2;
            }
        }
        final Exception ex;
        com.google.firebase.crashlytics.internal.f.f().e("Failed to get cached settings", (Throwable)ex);
        return b;
    }
    
    private String n() {
        return com.google.firebase.crashlytics.internal.common.g.s(this.a).getString("existing_instance_identifier", "");
    }
    
    private void q(final JSONObject jsonObject, final String str) throws JSONException {
        final com.google.firebase.crashlytics.internal.f f = com.google.firebase.crashlytics.internal.f.f();
        final StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(jsonObject.toString());
        f.b(sb.toString());
    }
    
    @SuppressLint({ "CommitPrefEdits" })
    private boolean r(final String s) {
        final SharedPreferences$Editor edit = com.google.firebase.crashlytics.internal.common.g.s(this.a).edit();
        edit.putString("existing_instance_identifier", s);
        edit.apply();
        return true;
    }
    
    @Override
    public m<b3.b> a() {
        return (m<b3.b>)this.i.get().a();
    }
    
    @Override
    public b3.e b() {
        return this.h.get();
    }
    
    boolean k() {
        return this.n().equals(this.b.f) ^ true;
    }
    
    public m<Void> o(final c c, final Executor executor) {
        if (!this.k()) {
            final f m = this.m(c);
            if (m != null) {
                this.h.set(m);
                this.i.get().e((Object)m.g());
                return (m<Void>)p.g((Object)null);
            }
        }
        final f i = this.m(c.I);
        if (i != null) {
            this.h.set(i);
            this.i.get().e((Object)i.g());
        }
        return (m<Void>)this.g.j().x(executor, (l)new l<Void, Void>() {
            @j0
            public m<Void> b(@k0 final Void void1) throws Exception {
                final JSONObject a = com.google.firebase.crashlytics.internal.settings.d.this.f.a(com.google.firebase.crashlytics.internal.settings.d.this.b, true);
                if (a != null) {
                    final f b = com.google.firebase.crashlytics.internal.settings.d.this.c.b(a);
                    com.google.firebase.crashlytics.internal.settings.d.this.e.c(b.b(), a);
                    com.google.firebase.crashlytics.internal.settings.d.this.q(a, "Loaded settings: ");
                    final d a2 = com.google.firebase.crashlytics.internal.settings.d.this;
                    a2.r(a2.b.f);
                    com.google.firebase.crashlytics.internal.settings.d.this.h.set(b);
                    com.google.firebase.crashlytics.internal.settings.d.this.i.get().e((Object)b.g());
                    final n newValue = new n();
                    newValue.e((Object)b.g());
                    com.google.firebase.crashlytics.internal.settings.d.this.i.set(newValue);
                }
                return (m<Void>)p.g((Object)null);
            }
        });
    }
    
    public m<Void> p(final Executor executor) {
        return this.o(com.google.firebase.crashlytics.internal.settings.c.G, executor);
    }
}
