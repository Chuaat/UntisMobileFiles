// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.security.PrivilegedExceptionAction;
import java.security.AccessController;
import java.nio.Buffer;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.lang.reflect.Field;
import java.nio.ByteOrder;
import sun.misc.Unsafe;

final class r9
{
    private static final Unsafe a;
    private static final Class<?> b;
    private static final boolean c;
    private static final boolean d;
    private static final d e;
    private static final boolean f;
    private static final boolean g;
    private static final long h;
    private static final long i;
    private static final long j;
    private static final long k;
    private static final long l;
    private static final long m;
    private static final long n;
    private static final long o;
    private static final long p;
    private static final long q;
    private static final long r;
    private static final long s;
    private static final long t;
    private static final long u;
    private static final int v;
    static final boolean w;
    
    static {
        final Unsafe unsafe = a = t();
        b = u4.c();
        final boolean b2 = c = B(Long.TYPE);
        final boolean b3 = d = B(Integer.TYPE);
        Object e2 = null;
        if (unsafe != null) {
            if (u4.b()) {
                if (b2) {
                    e2 = new c(unsafe);
                }
                else if (b3) {
                    e2 = new a(unsafe);
                }
            }
            else {
                e2 = new b(unsafe);
            }
        }
        e = (d)e2;
        f = E();
        g = A();
        final long n2 = h = n(byte[].class);
        i = n(boolean[].class);
        j = s(boolean[].class);
        k = n(int[].class);
        l = s(int[].class);
        m = n(long[].class);
        n = s(long[].class);
        o = n(float[].class);
        p = s(float[].class);
        q = n(double[].class);
        r = s(double[].class);
        s = n(Object[].class);
        t = s(Object[].class);
        final Field g2 = G();
        long objectFieldOffset;
        if (g2 != null && e2 != null) {
            objectFieldOffset = ((d)e2).a.objectFieldOffset(g2);
        }
        else {
            objectFieldOffset = -1L;
        }
        u = objectFieldOffset;
        v = (int)(0x7L & n2);
        w = (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN);
    }
    
    private r9() {
    }
    
    private static boolean A() {
        final Unsafe a = r9.a;
        if (a == null) {
            return false;
        }
        try {
            final Class<? extends Unsafe> class1 = a.getClass();
            class1.getMethod("objectFieldOffset", Field.class);
            class1.getMethod("arrayBaseOffset", Class.class);
            class1.getMethod("arrayIndexScale", Class.class);
            final Class<Long> type = Long.TYPE;
            class1.getMethod("getInt", Object.class, type);
            class1.getMethod("putInt", Object.class, type, Integer.TYPE);
            class1.getMethod("getLong", Object.class, type);
            class1.getMethod("putLong", Object.class, type, type);
            class1.getMethod("getObject", Object.class, type);
            class1.getMethod("putObject", Object.class, type, Object.class);
            if (u4.b()) {
                return true;
            }
            class1.getMethod("getByte", Object.class, type);
            class1.getMethod("putByte", Object.class, type, Byte.TYPE);
            class1.getMethod("getBoolean", Object.class, type);
            class1.getMethod("putBoolean", Object.class, type, Boolean.TYPE);
            class1.getMethod("getFloat", Object.class, type);
            class1.getMethod("putFloat", Object.class, type, Float.TYPE);
            class1.getMethod("getDouble", Object.class, type);
            class1.getMethod("putDouble", Object.class, type, Double.TYPE);
            return true;
        }
        finally {
            final Logger logger = Logger.getLogger(r9.class.getName());
            final Level warning = Level.WARNING;
            final Throwable obj;
            final String value = String.valueOf(obj);
            final StringBuilder sb = new StringBuilder(value.length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(value);
            logger.logp(warning, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb.toString());
            return false;
        }
    }
    
    private static boolean B(final Class<?> clazz) {
        if (!u4.b()) {
            return false;
        }
        try {
            final Class<?> b = r9.b;
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
    
    static double C(final Object o, final long n) {
        return r9.e.j(o, n);
    }
    
    private static void D(final Object o, final long n, final boolean b) {
        y(o, n, (byte)(b ? 1 : 0));
    }
    
    private static boolean E() {
        final Unsafe a = r9.a;
        if (a == null) {
            return false;
        }
        try {
            final Class<? extends Unsafe> class1 = a.getClass();
            class1.getMethod("objectFieldOffset", Field.class);
            final Class<Long> type = Long.TYPE;
            class1.getMethod("getLong", Object.class, type);
            if (G() == null) {
                return false;
            }
            if (u4.b()) {
                return true;
            }
            class1.getMethod("getByte", type);
            class1.getMethod("putByte", type, Byte.TYPE);
            class1.getMethod("getInt", type);
            class1.getMethod("putInt", type, Integer.TYPE);
            class1.getMethod("getLong", type);
            class1.getMethod("putLong", type, type);
            class1.getMethod("copyMemory", type, type, type);
            class1.getMethod("copyMemory", Object.class, type, Object.class, type, type);
            return true;
        }
        finally {
            final Logger logger = Logger.getLogger(r9.class.getName());
            final Level warning = Level.WARNING;
            final Throwable obj;
            final String value = String.valueOf(obj);
            final StringBuilder sb = new StringBuilder(value.length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(value);
            logger.logp(warning, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
            return false;
        }
    }
    
    static Object F(final Object o, final long offset) {
        return r9.e.a.getObject(o, offset);
    }
    
    private static Field G() {
        if (u4.b()) {
            final Field d = d(Buffer.class, "effectiveDirectAddress");
            if (d != null) {
                return d;
            }
        }
        final Field d2 = d(Buffer.class, "address");
        if (d2 != null && d2.getType() == Long.TYPE) {
            return d2;
        }
        return null;
    }
    
    private static byte L(final Object o, final long n) {
        return (byte)(b(o, 0xFFFFFFFFFFFFFFFCL & n) >>> (int)((~n & 0x3L) << 3));
    }
    
    private static byte M(final Object o, final long n) {
        return (byte)(b(o, 0xFFFFFFFFFFFFFFFCL & n) >>> (int)((n & 0x3L) << 3));
    }
    
    private static boolean N(final Object o, final long n) {
        return L(o, n) != 0;
    }
    
    private static boolean O(final Object o, final long n) {
        return M(o, n) != 0;
    }
    
    static byte a(final byte[] array, final long n) {
        return r9.e.a(array, r9.h + n);
    }
    
    static int b(final Object o, final long n) {
        return r9.e.k(o, n);
    }
    
    static <T> T c(final Class<T> cls) {
        try {
            return (T)r9.a.allocateInstance(cls);
        }
        catch (InstantiationException cause) {
            throw new IllegalStateException(cause);
        }
    }
    
    private static Field d(final Class<?> clazz, final String name) {
        Field field;
        try {
            clazz.getDeclaredField(name);
        }
        finally {
            field = null;
        }
        return field;
    }
    
    static void f(final Object o, final long n, final double n2) {
        r9.e.c(o, n, n2);
    }
    
    static void g(final Object o, final long n, final float n2) {
        r9.e.d(o, n, n2);
    }
    
    static void h(final Object o, final long n, final int n2) {
        r9.e.e(o, n, n2);
    }
    
    static void i(final Object o, final long n, final long n2) {
        r9.e.f(o, n, n2);
    }
    
    static void j(final Object o, final long offset, final Object x) {
        r9.e.a.putObject(o, offset, x);
    }
    
    static void k(final Object o, final long n, final boolean b) {
        r9.e.g(o, n, b);
    }
    
    static void l(final byte[] array, final long n, final byte b) {
        r9.e.b(array, r9.h + n, b);
    }
    
    static boolean m() {
        return r9.g;
    }
    
    private static int n(final Class<?> arrayClass) {
        if (r9.g) {
            return r9.e.a.arrayBaseOffset(arrayClass);
        }
        return -1;
    }
    
    static long o(final Object o, final long n) {
        return r9.e.l(o, n);
    }
    
    static boolean r() {
        return r9.f;
    }
    
    private static int s(final Class<?> arrayClass) {
        if (r9.g) {
            return r9.e.a.arrayIndexScale(arrayClass);
        }
        return -1;
    }
    
    static Unsafe t() {
        Unsafe unsafe2;
        try {
            final Unsafe unsafe = AccessController.doPrivileged((PrivilegedExceptionAction<Unsafe>)new t9());
        }
        finally {
            unsafe2 = null;
        }
        return unsafe2;
    }
    
    private static void u(final Object o, final long n, final byte b) {
        final long n2 = 0xFFFFFFFFFFFFFFFCL & n;
        final int b2 = b(o, n2);
        final int n3 = (~(int)n & 0x3) << 3;
        h(o, n2, (0xFF & b) << n3 | (b2 & ~(255 << n3)));
    }
    
    static boolean w(final Object o, final long n) {
        return r9.e.h(o, n);
    }
    
    static float x(final Object o, final long n) {
        return r9.e.i(o, n);
    }
    
    private static void y(final Object o, final long n, final byte b) {
        final long n2 = 0xFFFFFFFFFFFFFFFCL & n;
        final int b2 = b(o, n2);
        final int n3 = ((int)n & 0x3) << 3;
        h(o, n2, (0xFF & b) << n3 | (b2 & ~(255 << n3)));
    }
    
    private static void z(final Object o, final long n, final boolean b) {
        u(o, n, (byte)(b ? 1 : 0));
    }
    
    private static final class a extends d
    {
        a(final Unsafe unsafe) {
            super(unsafe);
        }
        
        @Override
        public final byte a(final Object o, final long n) {
            if (r9.w) {
                return L(o, n);
            }
            return M(o, n);
        }
        
        @Override
        public final void b(final Object o, final long n, final byte b) {
            if (r9.w) {
                u(o, n, b);
                return;
            }
            y(o, n, b);
        }
        
        @Override
        public final void c(final Object o, final long n, final double value) {
            ((d)this).f(o, n, Double.doubleToLongBits(value));
        }
        
        @Override
        public final void d(final Object o, final long n, final float value) {
            ((d)this).e(o, n, Float.floatToIntBits(value));
        }
        
        @Override
        public final void g(final Object o, final long n, final boolean b) {
            if (r9.w) {
                z(o, n, b);
                return;
            }
            D(o, n, b);
        }
        
        @Override
        public final boolean h(final Object o, final long n) {
            if (r9.w) {
                return N(o, n);
            }
            return O(o, n);
        }
        
        @Override
        public final float i(final Object o, final long n) {
            return Float.intBitsToFloat(((d)this).k(o, n));
        }
        
        @Override
        public final double j(final Object o, final long n) {
            return Double.longBitsToDouble(((d)this).l(o, n));
        }
    }
    
    private static final class b extends d
    {
        b(final Unsafe unsafe) {
            super(unsafe);
        }
        
        @Override
        public final byte a(final Object o, final long offset) {
            return super.a.getByte(o, offset);
        }
        
        @Override
        public final void b(final Object o, final long offset, final byte x) {
            super.a.putByte(o, offset, x);
        }
        
        @Override
        public final void c(final Object o, final long offset, final double x) {
            super.a.putDouble(o, offset, x);
        }
        
        @Override
        public final void d(final Object o, final long offset, final float x) {
            super.a.putFloat(o, offset, x);
        }
        
        @Override
        public final void g(final Object o, final long offset, final boolean x) {
            super.a.putBoolean(o, offset, x);
        }
        
        @Override
        public final boolean h(final Object o, final long offset) {
            return super.a.getBoolean(o, offset);
        }
        
        @Override
        public final float i(final Object o, final long offset) {
            return super.a.getFloat(o, offset);
        }
        
        @Override
        public final double j(final Object o, final long offset) {
            return super.a.getDouble(o, offset);
        }
    }
    
    private static final class c extends d
    {
        c(final Unsafe unsafe) {
            super(unsafe);
        }
        
        @Override
        public final byte a(final Object o, final long n) {
            if (r9.w) {
                return L(o, n);
            }
            return M(o, n);
        }
        
        @Override
        public final void b(final Object o, final long n, final byte b) {
            if (r9.w) {
                u(o, n, b);
                return;
            }
            y(o, n, b);
        }
        
        @Override
        public final void c(final Object o, final long n, final double value) {
            ((d)this).f(o, n, Double.doubleToLongBits(value));
        }
        
        @Override
        public final void d(final Object o, final long n, final float value) {
            ((d)this).e(o, n, Float.floatToIntBits(value));
        }
        
        @Override
        public final void g(final Object o, final long n, final boolean b) {
            if (r9.w) {
                z(o, n, b);
                return;
            }
            D(o, n, b);
        }
        
        @Override
        public final boolean h(final Object o, final long n) {
            if (r9.w) {
                return N(o, n);
            }
            return O(o, n);
        }
        
        @Override
        public final float i(final Object o, final long n) {
            return Float.intBitsToFloat(((d)this).k(o, n));
        }
        
        @Override
        public final double j(final Object o, final long n) {
            return Double.longBitsToDouble(((d)this).l(o, n));
        }
    }
    
    private abstract static class d
    {
        Unsafe a;
        
        d(final Unsafe a) {
            this.a = a;
        }
        
        public abstract byte a(final Object p0, final long p1);
        
        public abstract void b(final Object p0, final long p1, final byte p2);
        
        public abstract void c(final Object p0, final long p1, final double p2);
        
        public abstract void d(final Object p0, final long p1, final float p2);
        
        public final void e(final Object o, final long offset, final int x) {
            this.a.putInt(o, offset, x);
        }
        
        public final void f(final Object o, final long offset, final long x) {
            this.a.putLong(o, offset, x);
        }
        
        public abstract void g(final Object p0, final long p1, final boolean p2);
        
        public abstract boolean h(final Object p0, final long p1);
        
        public abstract float i(final Object p0, final long p1);
        
        public abstract double j(final Object p0, final long p1);
        
        public final int k(final Object o, final long offset) {
            return this.a.getInt(o, offset);
        }
        
        public final long l(final Object o, final long offset) {
            return this.a.getLong(o, offset);
        }
    }
}
