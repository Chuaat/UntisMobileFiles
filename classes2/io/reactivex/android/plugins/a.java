// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.android.plugins;

import java.util.Objects;
import io.reactivex.exceptions.b;
import io.reactivex.j0;
import java.util.concurrent.Callable;
import x5.o;

public final class a
{
    private static volatile o<Callable<j0>, j0> a;
    private static volatile o<j0, j0> b;
    
    private a() {
        throw new AssertionError((Object)"No instances.");
    }
    
    static <T, R> R a(final o<T, R> o, final T t) {
        try {
            return o.apply(t);
        }
        finally {
            final Throwable t2;
            throw io.reactivex.exceptions.b.a(t2);
        }
    }
    
    static j0 b(final o<Callable<j0>, j0> o, final Callable<j0> callable) {
        final j0 obj = a(o, callable);
        Objects.requireNonNull(obj, "Scheduler Callable returned null");
        return obj;
    }
    
    static j0 c(final Callable<j0> callable) {
        try {
            final j0 j0 = callable.call();
            if (j0 != null) {
                return j0;
            }
            throw new NullPointerException("Scheduler Callable returned null");
        }
        finally {
            final Throwable t;
            throw io.reactivex.exceptions.b.a(t);
        }
    }
    
    public static o<Callable<j0>, j0> d() {
        return io.reactivex.android.plugins.a.a;
    }
    
    public static o<j0, j0> e() {
        return io.reactivex.android.plugins.a.b;
    }
    
    public static j0 f(final Callable<j0> obj) {
        Objects.requireNonNull(obj, "scheduler == null");
        final o<Callable<j0>, j0> a = io.reactivex.android.plugins.a.a;
        if (a == null) {
            return c(obj);
        }
        return b(a, obj);
    }
    
    public static j0 g(final j0 obj) {
        Objects.requireNonNull(obj, "scheduler == null");
        final o<j0, j0> b = io.reactivex.android.plugins.a.b;
        if (b == null) {
            return obj;
        }
        return a(b, obj);
    }
    
    public static void h() {
        i(null);
        j(null);
    }
    
    public static void i(final o<Callable<j0>, j0> a) {
        a.a = a;
    }
    
    public static void j(final o<j0, j0> b) {
        io.reactivex.android.plugins.a.b = b;
    }
}
