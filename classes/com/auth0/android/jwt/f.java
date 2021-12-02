// 
// Decompiled by Procyon v0.5.36
// 

package com.auth0.android.jwt;

import java.util.Date;
import java.util.List;
import com.google.gson.GsonBuilder;
import com.google.gson.Gson;
import java.lang.reflect.Type;
import com.google.gson.reflect.TypeToken;
import androidx.annotation.k0;
import java.io.UnsupportedEncodingException;
import android.util.Base64;
import androidx.annotation.j0;
import android.os.Parcel;
import java.util.Map;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class f implements Parcelable
{
    public static final Parcelable$Creator<f> CREATOR;
    private static final String K;
    private static final String L = "UTF-8";
    private final String G;
    private Map<String, String> H;
    private h I;
    private String J;
    
    static {
        K = f.class.getSimpleName();
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<f>() {
            public f a(final Parcel parcel) {
                return new f(parcel.readString());
            }
            
            public f[] b(final int n) {
                return new f[n];
            }
        };
    }
    
    public f(@j0 final String g) {
        this.b(g);
        this.G = g;
    }
    
    @k0
    private String a(String s) {
        try {
            s = new String(Base64.decode(s, 11), "UTF-8");
            return s;
        }
        catch (UnsupportedEncodingException ex) {
            throw new e("Device doesn't support UTF-8 charset encoding.", ex);
        }
        catch (IllegalArgumentException ex2) {
            throw new e("Received bytes didn't correspond to a valid Base64 encoded string.", ex2);
        }
    }
    
    private void b(final String s) {
        final String[] q = this.q(s);
        this.H = (Map<String, String>)this.p(this.a(q[0]), new TypeToken<Map<String, String>>() {}.getType());
        this.I = (h)this.p(this.a(q[1]), h.class);
        this.J = q[2];
    }
    
    static Gson g() {
        return new GsonBuilder().registerTypeAdapter((Type)h.class, (Object)new g()).create();
    }
    
    private <T> T p(final String s, final Type type) {
        try {
            return (T)g().fromJson(s, type);
        }
        catch (Exception ex) {
            throw new e("The token's payload had an invalid JSON format.", ex);
        }
    }
    
    private String[] q(final String s) {
        String[] split;
        final String[] array = split = s.split("\\.");
        if (array.length == 2) {
            split = array;
            if (s.endsWith(".")) {
                split = new String[] { array[0], array[1], "" };
            }
        }
        if (split.length == 3) {
            return split;
        }
        throw new e(String.format("The token was expected to have 3 parts, but got %s.", split.length));
    }
    
    @k0
    public List<String> c() {
        return this.I.g;
    }
    
    @j0
    public c d(@j0 final String s) {
        return this.I.a(s);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @j0
    public Map<String, c> e() {
        return this.I.h;
    }
    
    @k0
    public Date f() {
        return this.I.c;
    }
    
    @j0
    public Map<String, String> h() {
        return this.H;
    }
    
    @k0
    public String i() {
        return this.I.f;
    }
    
    @k0
    public Date j() {
        return this.I.e;
    }
    
    @k0
    public String k() {
        return this.I.a;
    }
    
    @k0
    public Date l() {
        return this.I.d;
    }
    
    @j0
    public String m() {
        return this.J;
    }
    
    @k0
    public String n() {
        return this.I.b;
    }
    
    public boolean o(long n) {
        if (n >= 0L) {
            final long n2 = (long)(Math.floor((double)(new Date().getTime() / 1000L)) * 1000.0);
            n *= 1000L;
            final Date date = new Date(n2 + n);
            final Date date2 = new Date(n2 - n);
            final Date c = this.I.c;
            boolean b = false;
            final boolean b2 = c == null || !date2.after(c);
            final Date e = this.I.e;
            final boolean b3 = e == null || !date.before(e);
            if (!b2 || !b3) {
                b = true;
            }
            return b;
        }
        throw new IllegalArgumentException("The leeway must be a positive value.");
    }
    
    @Override
    public String toString() {
        return this.G;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.G);
    }
}
