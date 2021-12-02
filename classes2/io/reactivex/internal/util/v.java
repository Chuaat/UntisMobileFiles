// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.util;

import java.util.concurrent.atomic.AtomicLong;
import java.util.Queue;
import x5.e;
import y5.n;
import io.reactivex.internal.queue.b;
import io.reactivex.disposables.c;
import y5.o;
import io.reactivex.i0;

public final class v
{
    static final long a = Long.MIN_VALUE;
    static final long b = Long.MAX_VALUE;
    
    private v() {
        throw new IllegalStateException("No instances!");
    }
    
    public static <T, U> boolean a(final boolean b, final boolean b2, final i0<?> i0, final boolean b3, final o<?> o, final c c, final r<T, U> r) {
        if (r.g()) {
            o.clear();
            c.dispose();
            return true;
        }
        if (b) {
            if (b3) {
                if (b2) {
                    if (c != null) {
                        c.dispose();
                    }
                    final Throwable c2 = r.c();
                    if (c2 != null) {
                        i0.b(c2);
                    }
                    else {
                        i0.f();
                    }
                    return true;
                }
            }
            else {
                final Throwable c3 = r.c();
                if (c3 != null) {
                    o.clear();
                    if (c != null) {
                        c.dispose();
                    }
                    i0.b(c3);
                    return true;
                }
                if (b2) {
                    if (c != null) {
                        c.dispose();
                    }
                    i0.f();
                    return true;
                }
            }
        }
        return false;
    }
    
    public static <T, U> boolean b(final boolean b, final boolean b2, final o7.c<?> c, final boolean b3, final o<?> o, final u<T, U> u) {
        if (u.g()) {
            o.clear();
            return true;
        }
        if (b) {
            if (b3) {
                if (b2) {
                    final Throwable c2 = u.c();
                    if (c2 != null) {
                        c.b(c2);
                    }
                    else {
                        c.f();
                    }
                    return true;
                }
            }
            else {
                final Throwable c3 = u.c();
                if (c3 != null) {
                    o.clear();
                    c.b(c3);
                    return true;
                }
                if (b2) {
                    c.f();
                    return true;
                }
            }
        }
        return false;
    }
    
    public static <T> o<T> c(final int n) {
        if (n < 0) {
            return new io.reactivex.internal.queue.c<T>(-n);
        }
        return new b<T>(n);
    }
    
    public static <T, U> void d(final n<T> n, final i0<? super U> i0, final boolean b, final c c, final r<T, U> r) {
        int h = 1;
        while (!a(r.a(), n.isEmpty(), i0, b, n, c, r)) {
            while (true) {
                final boolean a = r.a();
                final T poll = n.poll();
                final boolean b2 = poll == null;
                if (a(a, b2, i0, b, n, c, r)) {
                    return;
                }
                if (b2) {
                    if ((h = r.h(-h)) == 0) {
                        return;
                    }
                    break;
                }
                else {
                    r.j(i0, poll);
                }
            }
        }
    }
    
    public static <T, U> void e(final n<T> n, final o7.c<? super U> c, final boolean b, final c c2, final u<T, U> u) {
        int h = 1;
        while (true) {
            final boolean a = u.a();
            final T poll = n.poll();
            final boolean b2 = poll == null;
            if (b(a, b2, c, b, n, (u<Object, Object>)u)) {
                if (c2 != null) {
                    c2.dispose();
                }
                return;
            }
            if (b2) {
                if ((h = u.h(-h)) == 0) {
                    return;
                }
                continue;
            }
            else {
                final long d = u.d();
                if (d == 0L) {
                    n.clear();
                    if (c2 != null) {
                        c2.dispose();
                    }
                    c.b((Throwable)new io.reactivex.exceptions.c("Could not emit value due to lack of requests."));
                    return;
                }
                if (!u.j(c, poll) || d == Long.MAX_VALUE) {
                    continue;
                }
                u.k(1L);
            }
        }
    }
    
    static boolean f(final e e) {
        try {
            return e.a();
        }
        finally {
            final Throwable t;
            io.reactivex.exceptions.b.b(t);
            return true;
        }
    }
    
    public static <T> void g(final o7.c<? super T> c, final Queue<T> queue, final AtomicLong atomicLong, final e e) {
        if (queue.isEmpty()) {
            c.f();
            return;
        }
        if (h(atomicLong.get(), c, queue, atomicLong, e)) {
            return;
        }
        long value;
        long newValue;
        do {
            value = atomicLong.get();
            if ((value & Long.MIN_VALUE) != 0x0L) {
                return;
            }
            newValue = (value | Long.MIN_VALUE);
        } while (!atomicLong.compareAndSet(value, newValue));
        if (value != 0L) {
            h(newValue, c, queue, atomicLong, e);
        }
    }
    
    static <T> boolean h(long value, final o7.c<? super T> c, final Queue<T> queue, final AtomicLong atomicLong, final e e) {
        long n = value & Long.MIN_VALUE;
        while (true) {
            if (n != value) {
                if (f(e)) {
                    return true;
                }
                final T poll = queue.poll();
                if (poll == null) {
                    c.f();
                    return true;
                }
                c.m((Object)poll);
                ++n;
            }
            else {
                if (f(e)) {
                    return true;
                }
                if (queue.isEmpty()) {
                    c.f();
                    return true;
                }
                if ((value = atomicLong.get()) != n) {
                    continue;
                }
                final long addAndGet = atomicLong.addAndGet(-(n & Long.MAX_VALUE));
                if ((Long.MAX_VALUE & addAndGet) == 0x0L) {
                    return false;
                }
                value = addAndGet;
                n = (addAndGet & Long.MIN_VALUE);
            }
        }
    }
    
    public static <T> boolean i(final long n, final o7.c<? super T> c, final Queue<T> queue, final AtomicLong atomicLong, final e e) {
        long value;
        do {
            value = atomicLong.get();
        } while (!atomicLong.compareAndSet(value, d.c(Long.MAX_VALUE & value, n) | (value & Long.MIN_VALUE)));
        if (value == Long.MIN_VALUE) {
            h(n | Long.MIN_VALUE, (o7.c<? super Object>)c, (Queue<Object>)queue, atomicLong, e);
            return true;
        }
        return false;
    }
    
    public static void j(final o7.d d, final int n) {
        long n2;
        if (n < 0) {
            n2 = Long.MAX_VALUE;
        }
        else {
            n2 = n;
        }
        d.v(n2);
    }
}
