// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common;

import android.util.Log;
import com.google.android.gms.common.util.n;
import com.google.android.gms.common.util.a;
import java.security.MessageDigest;
import java.util.concurrent.Callable;
import androidx.annotation.j0;
import c6.h;
import c6.c;

@c
class f0
{
    private static final f0 d;
    final boolean a;
    @h
    private final String b;
    @h
    private final Throwable c;
    
    static {
        d = new f0(true, null, null);
    }
    
    f0(final boolean a, @h final String b, @h final Throwable c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    static f0 a() {
        return f0.d;
    }
    
    static f0 b(@j0 final String s) {
        return new f0(false, s, null);
    }
    
    static f0 c(@j0 final String s, @j0 final Throwable t) {
        return new f0(false, s, t);
    }
    
    static f0 d(final Callable<String> callable) {
        return new h0(callable, null);
    }
    
    static String e(final String s, final x x, final boolean b, final boolean b2) {
        String s2;
        if (b2) {
            s2 = "debug cert rejected";
        }
        else {
            s2 = "not allowed";
        }
        final String a = n.a(com.google.android.gms.common.internal.x.k(com.google.android.gms.common.util.a.c("SHA-1")).digest(x.y2()));
        final StringBuilder sb = new StringBuilder(14);
        sb.append("12451009.false");
        return String.format("%s: pkg=%s, sha1=%s, atk=%s, ver=%s", s2, s, a, b, sb.toString());
    }
    
    @h
    String f() {
        return this.b;
    }
    
    final void g() {
        if (!this.a && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            if (this.c != null) {
                Log.d("GoogleCertificatesRslt", this.f(), this.c);
                return;
            }
            Log.d("GoogleCertificatesRslt", this.f());
        }
    }
}
