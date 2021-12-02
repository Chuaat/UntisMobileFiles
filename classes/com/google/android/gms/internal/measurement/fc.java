// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.security.PrivilegedExceptionAction;
import java.security.AccessController;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.lang.reflect.Field;
import sun.misc.Unsafe;

final class fc
{
    private static final Unsafe a;
    private static final Class<?> b;
    private static final boolean c;
    private static final boolean d;
    private static final ec e;
    private static final boolean f;
    private static final boolean g;
    static final long h;
    static final boolean i;
    
    static {
        final Unsafe unsafe = a = l();
        b = s7.a();
        final Class<Long> type = Long.TYPE;
        boolean b2 = c = A(type);
        final boolean b3 = d = A(Integer.TYPE);
        ec e2 = null;
        if (unsafe != null) {
            if (b2) {
                e2 = new dc(unsafe);
            }
            else if (b3) {
                e2 = new cc(unsafe);
            }
        }
        e = e2;
        final boolean b4 = true;
        Label_0184: {
            Label_0091: {
                if (e2 != null) {
                    final Unsafe a2 = e2.a;
                    if (a2 != null) {
                        try {
                            final Class<? extends Unsafe> class1 = a2.getClass();
                            class1.getMethod("objectFieldOffset", Field.class);
                            class1.getMethod("getLong", Object.class, type);
                            if (b() == null) {
                                break Label_0091;
                            }
                            b2 = true;
                        }
                        finally {
                            final Throwable t;
                            m(t);
                            break Label_0091;
                        }
                        break Label_0184;
                    }
                }
            }
            b2 = false;
        }
        f = b2;
        final ec e3 = fc.e;
        Label_0434: {
            Label_0198: {
                if (e3 != null) {
                    final Unsafe a3 = e3.a;
                    if (a3 != null) {
                        try {
                            final Class<? extends Unsafe> class2 = a3.getClass();
                            class2.getMethod("objectFieldOffset", Field.class);
                            class2.getMethod("arrayBaseOffset", Class.class);
                            class2.getMethod("arrayIndexScale", Class.class);
                            final Class<Long> type2 = Long.TYPE;
                            class2.getMethod("getInt", Object.class, type2);
                            class2.getMethod("putInt", Object.class, type2, Integer.TYPE);
                            class2.getMethod("getLong", Object.class, type2);
                            class2.getMethod("putLong", Object.class, type2, type2);
                            class2.getMethod("getObject", Object.class, type2);
                            class2.getMethod("putObject", Object.class, type2, Object.class);
                            b2 = true;
                        }
                        finally {
                            final Throwable t2;
                            m(t2);
                            break Label_0198;
                        }
                        break Label_0434;
                    }
                }
            }
            b2 = false;
        }
        g = b2;
        h = E(byte[].class);
        E(boolean[].class);
        a(boolean[].class);
        E(int[].class);
        a(int[].class);
        E(long[].class);
        a(long[].class);
        E(float[].class);
        a(float[].class);
        E(double[].class);
        a(double[].class);
        E(Object[].class);
        a(Object[].class);
        final Field b5 = b();
        if (b5 != null) {
            final ec e4 = fc.e;
            if (e4 != null) {
                e4.l(b5);
            }
        }
        i = (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN && b4);
    }
    
    private fc() {
    }
    
    static boolean A(final Class<?> clazz) {
        final int a = s7.a;
        try {
            final Class<?> b = fc.b;
            final Class<Boolean> type = Boolean.TYPE;
            b.getMethod("peekLong", clazz, type);
            b.getMethod("pokeLong", clazz, Long.TYPE, type);
            final Class<Integer> type2 = Integer.TYPE;
            b.getMethod("pokeInt", clazz, type2, type);
            b.getMethod("peekInt", clazz, type);
            b.getMethod("pokeByte", clazz, Byte.TYPE);
            b.getMethod("peekByte", clazz);
            b.getMethod("pokeByteArray", clazz, byte[].class, type2, type2);
            b.getMethod("peekByteArray", clazz, byte[].class, type2, type2);
            return true;
        }
        finally {
            return false;
        }
    }
    
    static boolean B(final Object o, final long n) {
        return fc.e.g(o, n);
    }
    
    static boolean C() {
        return fc.g;
    }
    
    static boolean D() {
        return fc.f;
    }
    
    private static int E(final Class<?> clazz) {
        if (fc.g) {
            return fc.e.h(clazz);
        }
        return -1;
    }
    
    private static int a(final Class<?> clazz) {
        if (fc.g) {
            return fc.e.i(clazz);
        }
        return -1;
    }
    
    private static Field b() {
        final int a = s7.a;
        Field c;
        if ((c = c(Buffer.class, "effectiveDirectAddress")) == null) {
            final Field c2 = c(Buffer.class, "address");
            if (c2 != null && c2.getType() == Long.TYPE) {
                return c2;
            }
            c = null;
        }
        return c;
    }
    
    private static Field c(final Class<?> clazz, final String name) {
        Field field;
        try {
            clazz.getDeclaredField(name);
        }
        finally {
            field = null;
        }
        return field;
    }
    
    private static void d(final Object o, final long n, final byte b) {
        final long n2 = 0xFFFFFFFFFFFFFFFCL & n;
        final ec e = fc.e;
        final int j = e.j(o, n2);
        final int n3 = (~(int)n & 0x3) << 3;
        e.n(o, n2, (0xFF & b) << n3 | (j & ~(255 << n3)));
    }
    
    private static void e(final Object o, final long n, final byte b) {
        final long n2 = 0xFFFFFFFFFFFFFFFCL & n;
        final ec e = fc.e;
        final int j = e.j(o, n2);
        final int n3 = ((int)n & 0x3) << 3;
        e.n(o, n2, (0xFF & b) << n3 | (j & ~(255 << n3)));
    }
    
    static double f(final Object o, final long n) {
        return fc.e.a(o, n);
    }
    
    static float g(final Object o, final long n) {
        return fc.e.b(o, n);
    }
    
    static int h(final Object o, final long n) {
        return fc.e.j(o, n);
    }
    
    static long i(final Object o, final long n) {
        return fc.e.k(o, n);
    }
    
    static <T> T j(final Class<T> cls) {
        try {
            return (T)fc.a.allocateInstance(cls);
        }
        catch (InstantiationException cause) {
            throw new IllegalStateException(cause);
        }
    }
    
    static Object k(final Object o, final long n) {
        return fc.e.m(o, n);
    }
    
    static Unsafe l() {
        Unsafe unsafe2;
        try {
            final Unsafe unsafe = AccessController.doPrivileged((PrivilegedExceptionAction<Unsafe>)new bc());
        }
        finally {
            unsafe2 = null;
        }
        return unsafe2;
    }
    
    static void r(final Object o, final long n, final boolean b) {
        fc.e.c(o, n, b);
    }
    
    static void s(final byte[] array, final long n, final byte b) {
        fc.e.d(array, fc.h + n, b);
    }
    
    static void t(final Object o, final long n, final double n2) {
        fc.e.e(o, n, n2);
    }
    
    static void u(final Object o, final long n, final float n2) {
        fc.e.f(o, n, n2);
    }
    
    static void v(final Object o, final long n, final int n2) {
        fc.e.n(o, n, n2);
    }
    
    static void w(final Object o, final long n, final long n2) {
        fc.e.o(o, n, n2);
    }
    
    static void x(final Object o, final long n, final Object o2) {
        fc.e.p(o, n, o2);
    }
}
