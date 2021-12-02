// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.crashlytics.internal.common;

import android.os.Build$VERSION;
import android.os.Build;
import java.util.Locale;
import com.google.android.gms.tasks.m;
import androidx.annotation.j0;
import com.google.firebase.crashlytics.internal.f;
import java.util.UUID;
import android.content.SharedPreferences;
import com.google.firebase.installations.j;
import android.content.Context;
import java.util.regex.Pattern;

public class w implements x
{
    public static final String g = "0.0";
    static final String h = "crashlytics.advertising.id";
    static final String i = "crashlytics.installation.id";
    static final String j = "firebase.installation.id";
    static final String k = "crashlytics.installation.id";
    private static final Pattern l;
    private static final String m = "SYN_";
    private static final String n;
    private final y a;
    private final Context b;
    private final String c;
    private final j d;
    private final s e;
    private String f;
    
    static {
        l = Pattern.compile("[^\\p{Alnum}]");
        n = Pattern.quote("/");
    }
    
    public w(final Context b, final String c, final j d, final s e) {
        if (b == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (c != null) {
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.a = new y();
            return;
        }
        throw new IllegalArgumentException("appIdentifier must not be null");
    }
    
    @j0
    private String b(final String str, final SharedPreferences sharedPreferences) {
        synchronized (this) {
            final String e = e(UUID.randomUUID().toString());
            final f f = com.google.firebase.crashlytics.internal.f.f();
            final StringBuilder sb = new StringBuilder();
            sb.append("Created new Crashlytics installation ID: ");
            sb.append(e);
            sb.append(" for FID: ");
            sb.append(str);
            f.k(sb.toString());
            sharedPreferences.edit().putString("crashlytics.installation.id", e).putString("firebase.installation.id", str).apply();
            return e;
        }
    }
    
    static String c() {
        final StringBuilder sb = new StringBuilder();
        sb.append("SYN_");
        sb.append(UUID.randomUUID().toString());
        return sb.toString();
    }
    
    @androidx.annotation.k0
    private String d() {
        final m b = this.d.b();
        String s;
        try {
            s = k0.b((m<String>)b);
        }
        catch (Exception ex) {
            com.google.firebase.crashlytics.internal.f.f().n("Failed to retrieve Firebase Installations ID.", ex);
            s = null;
        }
        return s;
    }
    
    private static String e(String lowerCase) {
        if (lowerCase == null) {
            lowerCase = null;
        }
        else {
            lowerCase = w.l.matcher(lowerCase).replaceAll("").toLowerCase(Locale.US);
        }
        return lowerCase;
    }
    
    static boolean k(final String s) {
        return s != null && s.startsWith("SYN_");
    }
    
    private String l(final SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("crashlytics.installation.id", (String)null);
    }
    
    private String m(final String s) {
        return s.replaceAll(w.n, "");
    }
    
    @j0
    @Override
    public String a() {
        synchronized (this) {
            final String f = this.f;
            if (f != null) {
                return f;
            }
            com.google.firebase.crashlytics.internal.f.f().k("Determining Crashlytics installation ID...");
            final SharedPreferences s = com.google.firebase.crashlytics.internal.common.g.s(this.b);
            final String string = s.getString("firebase.installation.id", (String)null);
            final f f2 = com.google.firebase.crashlytics.internal.f.f();
            final StringBuilder sb = new StringBuilder();
            sb.append("Cached Firebase Installation ID: ");
            sb.append(string);
            f2.k(sb.toString());
            String f4;
            if (this.e.d()) {
                final String d = this.d();
                final f f3 = com.google.firebase.crashlytics.internal.f.f();
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Fetched Firebase Installation ID: ");
                sb2.append(d);
                f3.k(sb2.toString());
                String c;
                if ((c = d) == null) {
                    if (string == null) {
                        c = c();
                    }
                    else {
                        c = string;
                    }
                }
                if (c.equals(string)) {
                    f4 = this.l(s);
                }
                else {
                    f4 = this.b(c, s);
                }
            }
            else if (k(string)) {
                f4 = this.l(s);
            }
            else {
                f4 = this.b(c(), s);
            }
            this.f = f4;
            if (this.f == null) {
                com.google.firebase.crashlytics.internal.f.f().m("Unable to determine Crashlytics Install Id, creating a new one.");
                this.f = this.b(c(), s);
            }
            final f f5 = com.google.firebase.crashlytics.internal.f.f();
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("Crashlytics installation ID: ");
            sb3.append(this.f);
            f5.k(sb3.toString());
            return this.f;
        }
    }
    
    public String f() {
        return this.c;
    }
    
    public String g() {
        return this.a.a(this.b);
    }
    
    public String h() {
        return String.format(Locale.US, "%s/%s", this.m(Build.MANUFACTURER), this.m(Build.MODEL));
    }
    
    public String i() {
        return this.m(Build$VERSION.INCREMENTAL);
    }
    
    public String j() {
        return this.m(Build$VERSION.RELEASE);
    }
}
