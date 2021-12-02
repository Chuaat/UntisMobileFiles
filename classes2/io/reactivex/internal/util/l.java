// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.util;

import io.reactivex.plugins.a;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.i0;

public final class l
{
    private l() {
        throw new IllegalStateException("No instances!");
    }
    
    public static void a(final i0<?> i0, final AtomicInteger atomicInteger, final c c) {
        if (atomicInteger.getAndIncrement() == 0) {
            final Throwable c2 = c.c();
            if (c2 != null) {
                i0.b(c2);
            }
            else {
                i0.f();
            }
        }
    }
    
    public static void b(final o7.c<?> c, final AtomicInteger atomicInteger, final c c2) {
        if (atomicInteger.getAndIncrement() == 0) {
            final Throwable c3 = c2.c();
            if (c3 != null) {
                c.b(c3);
            }
            else {
                c.f();
            }
        }
    }
    
    public static void c(final i0<?> i0, final Throwable t, final AtomicInteger atomicInteger, final c c) {
        if (c.a(t)) {
            if (atomicInteger.getAndIncrement() == 0) {
                i0.b(c.c());
            }
        }
        else {
            a.Y(t);
        }
    }
    
    public static void d(final o7.c<?> c, final Throwable t, final AtomicInteger atomicInteger, final c c2) {
        if (c2.a(t)) {
            if (atomicInteger.getAndIncrement() == 0) {
                c.b(c2.c());
            }
        }
        else {
            a.Y(t);
        }
    }
    
    public static <T> void e(final i0<? super T> i0, final T t, final AtomicInteger atomicInteger, final c c) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            i0.m(t);
            if (atomicInteger.decrementAndGet() != 0) {
                final Throwable c2 = c.c();
                if (c2 != null) {
                    i0.b(c2);
                }
                else {
                    i0.f();
                }
            }
        }
    }
    
    public static <T> void f(final o7.c<? super T> c, final T t, final AtomicInteger atomicInteger, final c c2) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            c.m((Object)t);
            if (atomicInteger.decrementAndGet() != 0) {
                final Throwable c3 = c2.c();
                if (c3 != null) {
                    c.b(c3);
                }
                else {
                    c.f();
                }
            }
        }
    }
}
