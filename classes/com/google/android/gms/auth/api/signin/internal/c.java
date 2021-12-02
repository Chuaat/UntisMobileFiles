// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.auth.api.signin.internal;

import androidx.annotation.RecentlyNullable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import org.json.JSONException;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.x;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.util.d0;
import android.content.Context;
import java.util.concurrent.locks.ReentrantLock;
import android.content.SharedPreferences;
import androidx.annotation.k0;
import java.util.concurrent.locks.Lock;
import f2.a;

@a
public class c
{
    private static final Lock c;
    @k0
    @d6.a("sLk")
    private static c d;
    private final Lock a;
    @d6.a("mLk")
    private final SharedPreferences b;
    
    static {
        c = new ReentrantLock();
    }
    
    @d0
    private c(final Context context) {
        this.a = new ReentrantLock();
        this.b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }
    
    @RecentlyNonNull
    @a
    public static c b(@RecentlyNonNull final Context context) {
        x.k(context);
        final Lock c = com.google.android.gms.auth.api.signin.internal.c.c;
        c.lock();
        try {
            if (com.google.android.gms.auth.api.signin.internal.c.d == null) {
                com.google.android.gms.auth.api.signin.internal.c.d = new c(context.getApplicationContext());
            }
            final c d = com.google.android.gms.auth.api.signin.internal.c.d;
            c.unlock();
            return d;
        }
        finally {
            com.google.android.gms.auth.api.signin.internal.c.c.unlock();
        }
    }
    
    @k0
    @d0
    private final GoogleSignInAccount g(@k0 String l) {
        if (TextUtils.isEmpty((CharSequence)l)) {
            return null;
        }
        l = this.l(k("googleSignInAccount", l));
        Label_0031: {
            if (l == null) {
                break Label_0031;
            }
            try {
                return GoogleSignInAccount.R5(l);
                return null;
            }
            catch (JSONException ex) {
                return null;
            }
        }
    }
    
    private final void i(final String s, final String s2) {
        this.a.lock();
        try {
            this.b.edit().putString(s, s2).apply();
        }
        finally {
            this.a.unlock();
        }
    }
    
    @k0
    @d0
    private final GoogleSignInOptions j(@k0 String l) {
        if (TextUtils.isEmpty((CharSequence)l)) {
            return null;
        }
        l = this.l(k("googleSignInOptions", l));
        Label_0031: {
            if (l == null) {
                break Label_0031;
            }
            try {
                return GoogleSignInOptions.O3(l);
                return null;
            }
            catch (JSONException ex) {
                return null;
            }
        }
    }
    
    private static String k(final String s, final String s2) {
        final StringBuilder sb = new StringBuilder(String.valueOf(s).length() + 1 + String.valueOf(s2).length());
        sb.append(s);
        sb.append(":");
        sb.append(s2);
        return sb.toString();
    }
    
    @k0
    private final String l(String string) {
        this.a.lock();
        try {
            string = this.b.getString(string, (String)null);
            return string;
        }
        finally {
            this.a.unlock();
        }
    }
    
    private final void m(final String s) {
        this.a.lock();
        try {
            this.b.edit().remove(s).apply();
        }
        finally {
            this.a.unlock();
        }
    }
    
    @a
    public void a() {
        this.a.lock();
        try {
            this.b.edit().clear().apply();
        }
        finally {
            this.a.unlock();
        }
    }
    
    @RecentlyNullable
    @a
    public GoogleSignInAccount c() {
        return this.g(this.l("defaultGoogleSignInAccount"));
    }
    
    @RecentlyNullable
    @a
    public GoogleSignInOptions d() {
        return this.j(this.l("defaultGoogleSignInAccount"));
    }
    
    @RecentlyNullable
    @a
    public String e() {
        return this.l("refreshToken");
    }
    
    @a
    public void f(@RecentlyNonNull final GoogleSignInAccount googleSignInAccount, @RecentlyNonNull final GoogleSignInOptions googleSignInOptions) {
        x.k(googleSignInAccount);
        x.k(googleSignInOptions);
        this.i("defaultGoogleSignInAccount", googleSignInAccount.T5());
        x.k(googleSignInAccount);
        x.k(googleSignInOptions);
        final String t5 = googleSignInAccount.T5();
        this.i(k("googleSignInAccount", t5), googleSignInAccount.U5());
        this.i(k("googleSignInOptions", t5), googleSignInOptions.U3());
    }
    
    public final void h() {
        final String l = this.l("defaultGoogleSignInAccount");
        this.m("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty((CharSequence)l)) {
            this.m(k("googleSignInAccount", l));
            this.m(k("googleSignInOptions", l));
        }
    }
}
