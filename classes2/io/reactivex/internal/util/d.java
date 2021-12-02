// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.util;

import io.reactivex.plugins.a;
import java.util.concurrent.atomic.AtomicLong;

public final class d
{
    private d() {
        throw new IllegalStateException("No instances!");
    }
    
    public static long a(final AtomicLong atomicLong, final long n) {
        long value;
        do {
            value = atomicLong.get();
            if (value == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        } while (!atomicLong.compareAndSet(value, c(value, n)));
        return value;
    }
    
    public static long b(final AtomicLong atomicLong, final long n) {
        long value;
        do {
            value = atomicLong.get();
            if (value == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            if (value == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        } while (!atomicLong.compareAndSet(value, c(value, n)));
        return value;
    }
    
    public static long c(long n, long n2) {
        n2 = (n += n2);
        if (n2 < 0L) {
            n = Long.MAX_VALUE;
        }
        return n;
    }
    
    public static long d(final long n, final long n2) {
        final long n3 = n * n2;
        if ((n | n2) >>> 31 != 0L && n3 / n != n2) {
            return Long.MAX_VALUE;
        }
        return n3;
    }
    
    public static long e(final AtomicLong atomicLong, final long n) {
        long value;
        long newValue;
        do {
            value = atomicLong.get();
            if (value == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
            final long lng = newValue = value - n;
            if (lng >= 0L) {
                continue;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("More produced than requested: ");
            sb.append(lng);
            a.Y(new IllegalStateException(sb.toString()));
            newValue = 0L;
        } while (!atomicLong.compareAndSet(value, newValue));
        return newValue;
    }
    
    public static long f(final AtomicLong atomicLong, final long n) {
        long value;
        long newValue;
        do {
            value = atomicLong.get();
            if (value == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            if (value == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
            final long lng = newValue = value - n;
            if (lng >= 0L) {
                continue;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("More produced than requested: ");
            sb.append(lng);
            a.Y(new IllegalStateException(sb.toString()));
            newValue = 0L;
        } while (!atomicLong.compareAndSet(value, newValue));
        return newValue;
    }
}
