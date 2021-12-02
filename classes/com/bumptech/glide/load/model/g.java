// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.model;

import java.util.Map;
import androidx.annotation.j0;
import java.security.MessageDigest;
import java.net.MalformedURLException;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.util.k;
import androidx.annotation.k0;
import java.net.URL;

public class g implements com.bumptech.glide.load.g
{
    private static final String j = "@#&=*+-_.,:!?()/~'%;$";
    private final h c;
    @k0
    private final URL d;
    @k0
    private final String e;
    @k0
    private String f;
    @k0
    private URL g;
    @k0
    private volatile byte[] h;
    private int i;
    
    public g(final String s) {
        this(s, com.bumptech.glide.load.model.h.b);
    }
    
    public g(final String s, final h h) {
        this.d = null;
        this.e = k.b(s);
        this.c = k.d(h);
    }
    
    public g(final URL url) {
        this(url, com.bumptech.glide.load.model.h.b);
    }
    
    public g(final URL url, final h h) {
        this.d = k.d(url);
        this.e = null;
        this.c = k.d(h);
    }
    
    private byte[] d() {
        if (this.h == null) {
            this.h = this.c().getBytes(com.bumptech.glide.load.g.b);
        }
        return this.h;
    }
    
    private String f() {
        if (TextUtils.isEmpty((CharSequence)this.f)) {
            String s;
            if (TextUtils.isEmpty((CharSequence)(s = this.e))) {
                s = k.d(this.d).toString();
            }
            this.f = Uri.encode(s, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f;
    }
    
    private URL g() throws MalformedURLException {
        if (this.g == null) {
            this.g = new URL(this.f());
        }
        return this.g;
    }
    
    @Override
    public void a(@j0 final MessageDigest messageDigest) {
        messageDigest.update(this.d());
    }
    
    public String c() {
        String s = this.e;
        if (s == null) {
            s = k.d(this.d).toString();
        }
        return s;
    }
    
    public Map<String, String> e() {
        return this.c.a();
    }
    
    @Override
    public boolean equals(final Object o) {
        final boolean b = o instanceof g;
        boolean b3;
        final boolean b2 = b3 = false;
        if (b) {
            final g g = (g)o;
            b3 = b2;
            if (this.c().equals(g.c())) {
                b3 = b2;
                if (this.c.equals(g.c)) {
                    b3 = true;
                }
            }
        }
        return b3;
    }
    
    public String h() {
        return this.f();
    }
    
    @Override
    public int hashCode() {
        if (this.i == 0) {
            final int hashCode = this.c().hashCode();
            this.i = hashCode;
            this.i = hashCode * 31 + this.c.hashCode();
        }
        return this.i;
    }
    
    public URL i() throws MalformedURLException {
        return this.g();
    }
    
    @Override
    public String toString() {
        return this.c();
    }
}
