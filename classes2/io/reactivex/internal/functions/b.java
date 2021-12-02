// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.functions;

import java.util.Objects;
import x5.d;

public final class b
{
    static final d<Object, Object> a;
    
    static {
        a = new a();
    }
    
    private b() {
        throw new IllegalStateException("No instances!");
    }
    
    public static int a(int n, final int n2) {
        if (n < n2) {
            n = -1;
        }
        else if (n > n2) {
            n = 1;
        }
        else {
            n = 0;
        }
        return n;
    }
    
    public static int b(final long n, final long n2) {
        final long n3 = lcmp(n, n2);
        int n4;
        if (n3 < 0) {
            n4 = -1;
        }
        else if (n3 > 0) {
            n4 = 1;
        }
        else {
            n4 = 0;
        }
        return n4;
    }
    
    public static boolean c(final Object o, final Object obj) {
        return o == obj || (o != null && o.equals(obj));
    }
    
    public static <T> d<T, T> d() {
        return (d<T, T>)b.a;
    }
    
    public static int e(final Object o) {
        int hashCode;
        if (o != null) {
            hashCode = o.hashCode();
        }
        else {
            hashCode = 0;
        }
        return hashCode;
    }
    
    @Deprecated
    public static long f(final long n, final String str) {
        final StringBuilder sb = new StringBuilder();
        sb.append("Null check on a primitive: ");
        sb.append(str);
        throw new InternalError(sb.toString());
    }
    
    public static <T> T g(final T obj, final String message) {
        Objects.requireNonNull(obj, message);
        return obj;
    }
    
    public static int h(final int i, final String str) {
        if (i > 0) {
            return i;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" > 0 required but it was ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static long i(final long lng, final String str) {
        if (lng > 0L) {
            return lng;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" > 0 required but it was ");
        sb.append(lng);
        throw new IllegalArgumentException(sb.toString());
    }
    
    static final class a implements d<Object, Object>
    {
        @Override
        public boolean a(final Object o, final Object o2) {
            return b.c(o, o2);
        }
    }
}
