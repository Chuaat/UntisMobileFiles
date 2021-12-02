// 
// Decompiled by Procyon v0.5.36
// 

package retrofit2;

import okhttp3.v;
import okhttp3.e0;
import okhttp3.d0;
import java.util.Objects;
import okhttp3.h0;
import c6.h;
import okhttp3.g0;

public final class t<T>
{
    private final g0 a;
    @h
    private final T b;
    @h
    private final h0 c;
    
    private t(final g0 a, @h final T b, @h final h0 c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static <T> t<T> c(final int i, final h0 obj) {
        Objects.requireNonNull(obj, "body == null");
        if (i >= 400) {
            return d(obj, new g0.a().b(new n.c(obj.contentType(), obj.contentLength())).g(i).y("Response.error()").B(d0.I).E(new e0.a().B("http://localhost/").b()).c());
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("code < 400: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static <T> t<T> d(final h0 obj, final g0 obj2) {
        Objects.requireNonNull(obj, "body == null");
        Objects.requireNonNull(obj2, "rawResponse == null");
        if (!obj2.L()) {
            return new t<T>(obj2, null, obj);
        }
        throw new IllegalArgumentException("rawResponse should not be successful response");
    }
    
    public static <T> t<T> j(final int i, @h final T t) {
        if (i >= 200 && i < 300) {
            return m(t, new g0.a().g(i).y("Response.success()").B(d0.I).E(new e0.a().B("http://localhost/").b()).c());
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("code < 200 or >= 300: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static <T> t<T> k(@h final T t) {
        return m(t, new g0.a().g(200).y("OK").B(d0.I).E(new e0.a().B("http://localhost/").b()).c());
    }
    
    public static <T> t<T> l(@h final T t, final v obj) {
        Objects.requireNonNull(obj, "headers == null");
        return m(t, new g0.a().g(200).y("OK").B(d0.I).w(obj).E(new e0.a().B("http://localhost/").b()).c());
    }
    
    public static <T> t<T> m(@h final T t, final g0 obj) {
        Objects.requireNonNull(obj, "rawResponse == null");
        if (obj.L()) {
            return new t<T>(obj, t, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }
    
    @h
    public T a() {
        return this.b;
    }
    
    public int b() {
        return this.a.x();
    }
    
    @h
    public h0 e() {
        return this.c;
    }
    
    public v f() {
        return this.a.J();
    }
    
    public boolean g() {
        return this.a.L();
    }
    
    public String h() {
        return this.a.M();
    }
    
    public g0 i() {
        return this.a;
    }
    
    @Override
    public String toString() {
        return this.a.toString();
    }
}
