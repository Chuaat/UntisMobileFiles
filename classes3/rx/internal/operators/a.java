// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.functions.p;
import rx.internal.util.s;
import rx.n;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;

public final class a
{
    static final long a = Long.MIN_VALUE;
    static final long b = Long.MAX_VALUE;
    
    private a() {
        throw new IllegalStateException("No instances!");
    }
    
    public static long a(long n, long n2) {
        n2 = (n += n2);
        if (n2 < 0L) {
            n = Long.MAX_VALUE;
        }
        return n;
    }
    
    public static long b(final AtomicLong atomicLong, final long n) {
        long value;
        do {
            value = atomicLong.get();
        } while (!atomicLong.compareAndSet(value, a(value, n)));
        return value;
    }
    
    public static long c(final long n, final long n2) {
        long n4;
        final long n3 = n4 = n * n2;
        if ((n | n2) >>> 31 != 0L) {
            n4 = n3;
            if (n2 != 0L) {
                n4 = n3;
                if (n3 / n2 != n) {
                    n4 = Long.MAX_VALUE;
                }
            }
        }
        return n4;
    }
    
    public static <T> void d(final AtomicLong atomicLong, final Queue<T> queue, final n<? super T> n) {
        e(atomicLong, queue, (n<? super Object>)n, (p<? super T, ?>)s.c());
    }
    
    public static <T, R> void e(final AtomicLong atomicLong, final Queue<T> queue, final n<? super R> n, final p<? super T, ? extends R> p4) {
        long value;
        do {
            value = atomicLong.get();
            if ((value & Long.MIN_VALUE) != 0x0L) {
                return;
            }
        } while (!atomicLong.compareAndSet(value, Long.MIN_VALUE | value));
        if (value != 0L) {
            f(atomicLong, (Queue<Object>)queue, (n<? super Object>)n, (p<? super Object, ?>)p4);
        }
    }
    
    static <T, R> void f(final AtomicLong atomicLong, final Queue<T> queue, final n<? super R> n, final p<? super T, ? extends R> p4) {
        long n2 = atomicLong.get();
        if (n2 == Long.MAX_VALUE) {
            while (!n.g()) {
                final T poll = queue.poll();
                if (poll == null) {
                    n.c();
                    return;
                }
                n.m((Object)p4.h(poll));
            }
            return;
        }
        long n3;
        do {
            n3 = Long.MIN_VALUE;
            while (true) {
                final long n4 = lcmp(n3, n2);
                if (n4 != 0) {
                    if (n.g()) {
                        return;
                    }
                    final T poll2 = queue.poll();
                    if (poll2 == null) {
                        n.c();
                        return;
                    }
                    n.m((Object)p4.h(poll2));
                    ++n3;
                }
                else {
                    if (n4 == 0) {
                        if (n.g()) {
                            return;
                        }
                        if (queue.isEmpty()) {
                            n.c();
                            return;
                        }
                    }
                    if ((n2 = atomicLong.get()) == n3) {
                        break;
                    }
                    continue;
                }
            }
        } while ((n2 = atomicLong.addAndGet(-(n3 & Long.MAX_VALUE))) != Long.MIN_VALUE);
    }
    
    public static <T> boolean g(final AtomicLong atomicLong, final long n, final Queue<T> queue, final n<? super T> n2) {
        return h(atomicLong, n, queue, (n<? super Object>)n2, (p<? super T, ?>)s.c());
    }
    
    public static <T, R> boolean h(final AtomicLong atomicLong, final long lng, final Queue<T> queue, final n<? super R> n, final p<? super T, ? extends R> p5) {
        final long n2 = lcmp(lng, 0L);
        if (n2 < 0) {
            final StringBuilder sb = new StringBuilder();
            sb.append("n >= 0 required but it was ");
            sb.append(lng);
            throw new IllegalArgumentException(sb.toString());
        }
        final boolean b = true;
        boolean b2 = true;
        if (n2 == 0) {
            if ((atomicLong.get() & Long.MIN_VALUE) != 0x0L) {
                b2 = false;
            }
            return b2;
        }
        long value;
        long n3;
        do {
            value = atomicLong.get();
            n3 = (value & Long.MIN_VALUE);
        } while (!atomicLong.compareAndSet(value, a(Long.MAX_VALUE & value, lng) | n3));
        if (value == Long.MIN_VALUE) {
            f(atomicLong, queue, (n<? super Object>)n, (p<? super T, ?>)p5);
            return false;
        }
        return n3 == 0L && b;
    }
    
    public static long i(final AtomicLong atomicLong, final long n) {
        long value;
        long n2;
        do {
            value = atomicLong.get();
            if (value == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
            n2 = value - n;
            if (n2 >= 0L) {
                continue;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("More produced than requested: ");
            sb.append(n2);
            throw new IllegalStateException(sb.toString());
        } while (!atomicLong.compareAndSet(value, n2));
        return n2;
    }
    
    public static boolean j(final long lng) {
        final long n = lcmp(lng, 0L);
        if (n >= 0) {
            return n != 0;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("n >= 0 required but it was ");
        sb.append(lng);
        throw new IllegalArgumentException(sb.toString());
    }
}
