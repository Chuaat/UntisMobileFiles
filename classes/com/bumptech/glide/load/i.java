// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load;

import com.bumptech.glide.util.k;
import androidx.annotation.k0;
import java.security.MessageDigest;
import androidx.annotation.j0;

public final class i<T>
{
    private static final b<Object> e;
    private final T a;
    private final b<T> b;
    private final String c;
    private volatile byte[] d;
    
    static {
        e = (b)new b<Object>() {
            @Override
            public void a(@j0 final byte[] array, @j0 final Object o, @j0 final MessageDigest messageDigest) {
            }
        };
    }
    
    private i(@j0 final String s, @k0 final T a, @j0 final b<T> b) {
        this.c = k.b(s);
        this.a = a;
        this.b = k.d(b);
    }
    
    @j0
    public static <T> i<T> a(@j0 final String s, @j0 final b<T> b) {
        return new i<T>(s, null, b);
    }
    
    @j0
    public static <T> i<T> b(@j0 final String s, @k0 final T t, @j0 final b<T> b) {
        return new i<T>(s, t, b);
    }
    
    @j0
    private static <T> b<T> c() {
        return (b<T>)i.e;
    }
    
    @j0
    private byte[] e() {
        if (this.d == null) {
            this.d = this.c.getBytes(g.b);
        }
        return this.d;
    }
    
    @j0
    public static <T> i<T> f(@j0 final String s) {
        return new i<T>(s, null, c());
    }
    
    @j0
    public static <T> i<T> g(@j0 final String s, @j0 final T t) {
        return new i<T>(s, t, c());
    }
    
    @k0
    public T d() {
        return this.a;
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof i && this.c.equals(((i)o).c);
    }
    
    public void h(@j0 final T t, @j0 final MessageDigest messageDigest) {
        this.b.a(this.e(), t, messageDigest);
    }
    
    @Override
    public int hashCode() {
        return this.c.hashCode();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Option{key='");
        sb.append(this.c);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
    
    public interface b<T>
    {
        void a(@j0 final byte[] p0, @j0 final T p1, @j0 final MessageDigest p2);
    }
}
