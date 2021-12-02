// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.crashlytics.internal.settings.network;

import a3.c;
import java.io.IOException;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import com.google.firebase.crashlytics.internal.common.l;
import b3.g;
import com.google.firebase.crashlytics.internal.f;

public class a implements b
{
    static final String d = "X-CRASHLYTICS-GOOGLE-APP-ID";
    static final String e = "X-CRASHLYTICS-API-CLIENT-TYPE";
    static final String f = "X-CRASHLYTICS-API-CLIENT-VERSION";
    static final String g = "User-Agent";
    static final String h = "Accept";
    static final String i = "Crashlytics Android SDK/";
    static final String j = "application/json";
    static final String k = "android";
    static final String l = "build_version";
    static final String m = "display_version";
    static final String n = "instance";
    static final String o = "source";
    static final String p = "X-CRASHLYTICS-DEVICE-MODEL";
    static final String q = "X-CRASHLYTICS-OS-BUILD-VERSION";
    static final String r = "X-CRASHLYTICS-OS-DISPLAY-VERSION";
    static final String s = "X-CRASHLYTICS-INSTALLATION-ID";
    private final String a;
    private final a3.b b;
    private final f c;
    
    public a(final String s, final a3.b b) {
        this(s, b, com.google.firebase.crashlytics.internal.f.f());
    }
    
    a(final String a, final a3.b b, final f c) {
        if (a != null) {
            this.c = c;
            this.b = b;
            this.a = a;
            return;
        }
        throw new IllegalArgumentException("url must not be null.");
    }
    
    private a3.a b(final a3.a a, final g g) {
        this.c(a, "X-CRASHLYTICS-GOOGLE-APP-ID", g.a);
        this.c(a, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        this.c(a, "X-CRASHLYTICS-API-CLIENT-VERSION", com.google.firebase.crashlytics.internal.common.l.m());
        this.c(a, "Accept", "application/json");
        this.c(a, "X-CRASHLYTICS-DEVICE-MODEL", g.b);
        this.c(a, "X-CRASHLYTICS-OS-BUILD-VERSION", g.c);
        this.c(a, "X-CRASHLYTICS-OS-DISPLAY-VERSION", g.d);
        this.c(a, "X-CRASHLYTICS-INSTALLATION-ID", g.e.a());
        return a;
    }
    
    private void c(final a3.a a, final String s, final String s2) {
        if (s2 != null) {
            a.d(s, s2);
        }
    }
    
    private JSONObject e(final String str) {
        try {
            return new JSONObject(str);
        }
        catch (Exception ex) {
            final f c = this.c;
            final StringBuilder sb = new StringBuilder();
            sb.append("Failed to parse settings JSON from ");
            sb.append(this.a);
            c.n(sb.toString(), (Throwable)ex);
            final f c2 = this.c;
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Settings response ");
            sb2.append(str);
            c2.m(sb2.toString());
            return null;
        }
    }
    
    private Map<String, String> f(final g g) {
        final HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("build_version", g.h);
        hashMap.put("display_version", g.g);
        hashMap.put("source", Integer.toString(g.i));
        final String f = g.f;
        if (!TextUtils.isEmpty((CharSequence)f)) {
            hashMap.put("instance", f);
        }
        return hashMap;
    }
    
    @Override
    public JSONObject a(final g g, final boolean b) {
        if (b) {
            JSONObject g2;
            try {
                final Map<String, String> f = this.f(g);
                final a3.a b2 = this.b(this.d(f), g);
                final f c = this.c;
                final StringBuilder sb = new StringBuilder();
                sb.append("Requesting settings from ");
                sb.append(this.a);
                c.b(sb.toString());
                final f c2 = this.c;
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Settings query params were: ");
                sb2.append(f);
                c2.k(sb2.toString());
                g2 = this.g(b2.c());
            }
            catch (IOException ex) {
                this.c.e("Settings request failed.", (Throwable)ex);
                g2 = null;
            }
            return g2;
        }
        throw new RuntimeException("An invalid data collection token was used.");
    }
    
    protected a3.a d(final Map<String, String> map) {
        final a3.a b = this.b.b(this.a, map);
        final StringBuilder sb = new StringBuilder();
        sb.append("Crashlytics Android SDK/");
        sb.append(com.google.firebase.crashlytics.internal.common.l.m());
        return b.d("User-Agent", sb.toString()).d("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }
    
    JSONObject g(final c c) {
        final int b = c.b();
        final f c2 = this.c;
        final StringBuilder sb = new StringBuilder();
        sb.append("Settings response code was: ");
        sb.append(b);
        c2.k(sb.toString());
        JSONObject e;
        if (this.h(b)) {
            e = this.e(c.a());
        }
        else {
            final f c3 = this.c;
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Settings request failed; (status: ");
            sb2.append(b);
            sb2.append(") from ");
            sb2.append(this.a);
            c3.d(sb2.toString());
            e = null;
        }
        return e;
    }
    
    boolean h(final int n) {
        return n == 200 || n == 201 || n == 202 || n == 203;
    }
}
