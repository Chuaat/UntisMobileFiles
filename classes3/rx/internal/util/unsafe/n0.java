// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.util.unsafe;

import java.lang.reflect.Field;
import sun.misc.Unsafe;
import rx.internal.util.r;

@r
public final class n0
{
    public static final Unsafe a;
    private static final boolean b;
    
    static {
        b = (System.getProperty("rx.unsafe-disable") != null);
        Unsafe a2 = null;
        while (true) {
            try {
                final Field declaredField = Unsafe.class.getDeclaredField("theUnsafe");
                declaredField.setAccessible(true);
                a2 = (Unsafe)declaredField.get(null);
                a = a2;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    private n0() {
        throw new IllegalStateException("No instances!");
    }
    
    public static long a(final Class<?> clazz, final String name) {
        try {
            return n0.a.objectFieldOffset(clazz.getDeclaredField(name));
        }
        catch (NoSuchFieldException cause) {
            final InternalError internalError = new InternalError();
            internalError.initCause(cause);
            throw internalError;
        }
    }
    
    public static boolean b(final Object o, final long offset, final int expected, final int x) {
        return n0.a.compareAndSwapInt(o, offset, expected, x);
    }
    
    public static int c(final Object o, final long n, final int n2) {
        Unsafe a;
        int intVolatile;
        do {
            a = n0.a;
            intVolatile = a.getIntVolatile(o, n);
        } while (!a.compareAndSwapInt(o, n, intVolatile, intVolatile + n2));
        return intVolatile;
    }
    
    public static int d(final Object o, final long n) {
        Unsafe a;
        int intVolatile;
        do {
            a = n0.a;
            intVolatile = a.getIntVolatile(o, n);
        } while (!a.compareAndSwapInt(o, n, intVolatile, intVolatile + 1));
        return intVolatile;
    }
    
    public static int e(final Object o, final long n, final int x) {
        Unsafe a;
        int intVolatile;
        do {
            a = n0.a;
            intVolatile = a.getIntVolatile(o, n);
        } while (!a.compareAndSwapInt(o, n, intVolatile, x));
        return intVolatile;
    }
    
    public static boolean f() {
        return n0.a != null && !n0.b;
    }
}
