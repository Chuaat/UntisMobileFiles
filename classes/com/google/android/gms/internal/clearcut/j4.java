// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

import libcore.io.Memory;
import java.security.PrivilegedExceptionAction;
import java.security.AccessController;
import java.nio.ByteBuffer;
import java.nio.Buffer;
import java.util.logging.Level;
import java.lang.reflect.Field;
import java.nio.ByteOrder;
import sun.misc.Unsafe;
import java.util.logging.Logger;

final class j4
{
    private static final Logger a;
    private static final Unsafe b;
    private static final Class<?> c;
    private static final boolean d;
    private static final boolean e;
    private static final d f;
    private static final boolean g;
    private static final boolean h;
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
    private static final long v;
    private static final long w;
    private static final boolean x;
    
    static {
        a = Logger.getLogger(j4.class.getName());
        final Unsafe unsafe = b = z();
        c = com.google.android.gms.internal.clearcut.x.c();
        final boolean b2 = d = G(Long.TYPE);
        final boolean b3 = e = G(Integer.TYPE);
        final Field field = null;
        Object f2 = null;
        Label_0105: {
            if (unsafe != null) {
                if (!com.google.android.gms.internal.clearcut.x.b()) {
                    f2 = new c(unsafe);
                    break Label_0105;
                }
                if (b2) {
                    f2 = new b(unsafe);
                    break Label_0105;
                }
                if (b3) {
                    f2 = new a(unsafe);
                    break Label_0105;
                }
            }
            f2 = null;
        }
        f = (d)f2;
        g = B();
        h = A();
        i = E(byte[].class);
        j = E(boolean[].class);
        k = F(boolean[].class);
        l = E(int[].class);
        m = F(int[].class);
        n = E(long[].class);
        o = F(long[].class);
        p = E(float[].class);
        q = F(float[].class);
        r = E(double[].class);
        s = F(double[].class);
        t = E(Object[].class);
        u = F(Object[].class);
        v = n(C());
        final Field p2 = p(String.class, "value");
        Field field2 = field;
        if (p2 != null) {
            field2 = field;
            if (p2.getType() == char[].class) {
                field2 = p2;
            }
        }
        w = n(field2);
        x = (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN);
    }
    
    private j4() {
    }
    
    private static boolean A() {
        final Unsafe b = j4.b;
        if (b == null) {
            return false;
        }
        try {
            final Class<? extends Unsafe> class1 = b.getClass();
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
            if (com.google.android.gms.internal.clearcut.x.b()) {
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
            final Logger a = j4.a;
            final Level warning = Level.WARNING;
            final Throwable obj;
            final String value = String.valueOf(obj);
            final StringBuilder sb = new StringBuilder(value.length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(value);
            a.logp(warning, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb.toString());
            return false;
        }
    }
    
    private static boolean B() {
        final Unsafe b = j4.b;
        if (b == null) {
            return false;
        }
        try {
            final Class<? extends Unsafe> class1 = b.getClass();
            class1.getMethod("objectFieldOffset", Field.class);
            final Class<Long> type = Long.TYPE;
            class1.getMethod("getLong", Object.class, type);
            if (C() == null) {
                return false;
            }
            if (com.google.android.gms.internal.clearcut.x.b()) {
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
            final Logger a = j4.a;
            final Level warning = Level.WARNING;
            final Throwable obj;
            final String value = String.valueOf(obj);
            final StringBuilder sb = new StringBuilder(value.length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(value);
            a.logp(warning, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
            return false;
        }
    }
    
    private static Field C() {
        if (com.google.android.gms.internal.clearcut.x.b()) {
            final Field p = p(Buffer.class, "effectiveDirectAddress");
            if (p != null) {
                return p;
            }
        }
        final Field p2 = p(Buffer.class, "address");
        if (p2 != null && p2.getType() == Long.TYPE) {
            return p2;
        }
        return null;
    }
    
    private static int E(final Class<?> arrayClass) {
        if (j4.h) {
            return j4.f.a.arrayBaseOffset(arrayClass);
        }
        return -1;
    }
    
    private static int F(final Class<?> arrayClass) {
        if (j4.h) {
            return j4.f.a.arrayIndexScale(arrayClass);
        }
        return -1;
    }
    
    private static boolean G(final Class<?> clazz) {
        if (!com.google.android.gms.internal.clearcut.x.b()) {
            return false;
        }
        try {
            final Class<?> c = j4.c;
            final Class<Boolean> type = Boolean.TYPE;
            c.getMethod("peekLong", clazz, type);
            c.getMethod("pokeLong", clazz, Long.TYPE, type);
            final Class<Integer> type2 = Integer.TYPE;
            c.getMethod("pokeInt", clazz, type2, type);
            c.getMethod("peekInt", clazz, type);
            c.getMethod("pokeByte", clazz, Byte.TYPE);
            c.getMethod("peekByte", clazz);
            c.getMethod("pokeByteArray", clazz, byte[].class, type2, type2);
            c.getMethod("peekByteArray", clazz, byte[].class, type2, type2);
            return true;
        }
        finally {
            return false;
        }
    }
    
    static int H(final Object o, final long n) {
        return j4.f.j(o, n);
    }
    
    static long I(final Object o, final long n) {
        return j4.f.k(o, n);
    }
    
    static boolean J(final Object o, final long n) {
        return j4.f.l(o, n);
    }
    
    static float K(final Object o, final long n) {
        return j4.f.m(o, n);
    }
    
    static double L(final Object o, final long n) {
        return j4.f.n(o, n);
    }
    
    static Object M(final Object o, final long offset) {
        return j4.f.a.getObject(o, offset);
    }
    
    private static byte N(final Object o, final long n) {
        return (byte)(H(o, 0xFFFFFFFFFFFFFFFCL & n) >>> (int)((~n & 0x3L) << 3));
    }
    
    private static byte O(final Object o, final long n) {
        return (byte)(H(o, 0xFFFFFFFFFFFFFFFCL & n) >>> (int)((n & 0x3L) << 3));
    }
    
    private static boolean P(final Object o, final long n) {
        return N(o, n) != 0;
    }
    
    private static boolean Q(final Object o, final long n) {
        return O(o, n) != 0;
    }
    
    static byte a(final byte[] array, final long n) {
        return j4.f.o(array, j4.i + n);
    }
    
    static long b(final Field field) {
        return j4.f.a(field);
    }
    
    static void c(final long n, final byte b) {
        j4.f.b(n, b);
    }
    
    private static void d(final Object o, final long n, final byte b) {
        final long n2 = 0xFFFFFFFFFFFFFFFCL & n;
        final int h = H(o, n2);
        final int n3 = (~(int)n & 0x3) << 3;
        g(o, n2, (0xFF & b) << n3 | (h & ~(255 << n3)));
    }
    
    static void e(final Object o, final long n, final double n2) {
        j4.f.c(o, n, n2);
    }
    
    static void f(final Object o, final long n, final float n2) {
        j4.f.d(o, n, n2);
    }
    
    static void g(final Object o, final long n, final int n2) {
        j4.f.e(o, n, n2);
    }
    
    static void h(final Object o, final long n, final long n2) {
        j4.f.f(o, n, n2);
    }
    
    static void i(final Object o, final long offset, final Object x) {
        j4.f.a.putObject(o, offset, x);
    }
    
    static void j(final Object o, final long n, final boolean b) {
        j4.f.g(o, n, b);
    }
    
    static void k(final byte[] array, final long n, final byte b) {
        j4.f.i(array, j4.i + n, b);
    }
    
    static void l(final byte[] array, final long n, final long n2, final long n3) {
        j4.f.h(array, n, n2, n3);
    }
    
    private static long n(final Field field) {
        if (field != null) {
            final d f = j4.f;
            if (f != null) {
                return f.a(field);
            }
        }
        return -1L;
    }
    
    static long o(final ByteBuffer byteBuffer) {
        return j4.f.k(byteBuffer, j4.v);
    }
    
    private static Field p(final Class<?> clazz, final String name) {
        Field field;
        try {
            clazz.getDeclaredField(name).setAccessible(true);
        }
        finally {
            field = null;
        }
        return field;
    }
    
    private static void q(final Object o, final long n, final byte b) {
        final long n2 = 0xFFFFFFFFFFFFFFFCL & n;
        final int h = H(o, n2);
        final int n3 = ((int)n & 0x3) << 3;
        g(o, n2, (0xFF & b) << n3 | (h & ~(255 << n3)));
    }
    
    private static void r(final Object o, final long n, final boolean b) {
        d(o, n, (byte)(b ? 1 : 0));
    }
    
    private static void t(final Object o, final long n, final boolean b) {
        q(o, n, (byte)(b ? 1 : 0));
    }
    
    static boolean x() {
        return j4.h;
    }
    
    static boolean y() {
        return j4.g;
    }
    
    static Unsafe z() {
        Unsafe unsafe2;
        try {
            final Unsafe unsafe = AccessController.doPrivileged((PrivilegedExceptionAction<Unsafe>)new k4());
        }
        finally {
            unsafe2 = null;
        }
        return unsafe2;
    }
    
    static final class a extends d
    {
        a(final Unsafe unsafe) {
            super(unsafe);
        }
        
        @Override
        public final void b(final long n, final byte b) {
            Memory.pokeByte((int)(n & -1L), b);
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
            if (j4.x) {
                r(o, n, b);
                return;
            }
            t(o, n, b);
        }
        
        @Override
        public final void h(final byte[] array, final long n, final long n2, final long n3) {
            Memory.pokeByteArray((int)(n2 & -1L), array, (int)n, (int)n3);
        }
        
        @Override
        public final void i(final Object o, final long n, final byte b) {
            if (j4.x) {
                d(o, n, b);
                return;
            }
            q(o, n, b);
        }
        
        @Override
        public final boolean l(final Object o, final long n) {
            if (j4.x) {
                return P(o, n);
            }
            return Q(o, n);
        }
        
        @Override
        public final float m(final Object o, final long n) {
            return Float.intBitsToFloat(((d)this).j(o, n));
        }
        
        @Override
        public final double n(final Object o, final long n) {
            return Double.longBitsToDouble(((d)this).k(o, n));
        }
        
        @Override
        public final byte o(final Object o, final long n) {
            if (j4.x) {
                return N(o, n);
            }
            return O(o, n);
        }
    }
    
    static final class b extends d
    {
        b(final Unsafe unsafe) {
            super(unsafe);
        }
        
        @Override
        public final void b(final long n, final byte b) {
            Memory.pokeByte(n, b);
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
            if (j4.x) {
                r(o, n, b);
                return;
            }
            t(o, n, b);
        }
        
        @Override
        public final void h(final byte[] array, final long n, final long n2, final long n3) {
            Memory.pokeByteArray(n2, array, (int)n, (int)n3);
        }
        
        @Override
        public final void i(final Object o, final long n, final byte b) {
            if (j4.x) {
                d(o, n, b);
                return;
            }
            q(o, n, b);
        }
        
        @Override
        public final boolean l(final Object o, final long n) {
            if (j4.x) {
                return P(o, n);
            }
            return Q(o, n);
        }
        
        @Override
        public final float m(final Object o, final long n) {
            return Float.intBitsToFloat(((d)this).j(o, n));
        }
        
        @Override
        public final double n(final Object o, final long n) {
            return Double.longBitsToDouble(((d)this).k(o, n));
        }
        
        @Override
        public final byte o(final Object o, final long n) {
            if (j4.x) {
                return N(o, n);
            }
            return O(o, n);
        }
    }
    
    static final class c extends d
    {
        c(final Unsafe unsafe) {
            super(unsafe);
        }
        
        @Override
        public final void b(final long address, final byte x) {
            super.a.putByte(address, x);
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
        public final void h(final byte[] srcBase, final long n, final long destOffset, final long bytes) {
            super.a.copyMemory(srcBase, j4.i + n, null, destOffset, bytes);
        }
        
        @Override
        public final void i(final Object o, final long offset, final byte x) {
            super.a.putByte(o, offset, x);
        }
        
        @Override
        public final boolean l(final Object o, final long offset) {
            return super.a.getBoolean(o, offset);
        }
        
        @Override
        public final float m(final Object o, final long offset) {
            return super.a.getFloat(o, offset);
        }
        
        @Override
        public final double n(final Object o, final long offset) {
            return super.a.getDouble(o, offset);
        }
        
        @Override
        public final byte o(final Object o, final long offset) {
            return super.a.getByte(o, offset);
        }
    }
    
    abstract static class d
    {
        Unsafe a;
        
        d(final Unsafe a) {
            this.a = a;
        }
        
        public final long a(final Field f) {
            return this.a.objectFieldOffset(f);
        }
        
        public abstract void b(final long p0, final byte p1);
        
        public abstract void c(final Object p0, final long p1, final double p2);
        
        public abstract void d(final Object p0, final long p1, final float p2);
        
        public final void e(final Object o, final long offset, final int x) {
            this.a.putInt(o, offset, x);
        }
        
        public final void f(final Object o, final long offset, final long x) {
            this.a.putLong(o, offset, x);
        }
        
        public abstract void g(final Object p0, final long p1, final boolean p2);
        
        public abstract void h(final byte[] p0, final long p1, final long p2, final long p3);
        
        public abstract void i(final Object p0, final long p1, final byte p2);
        
        public final int j(final Object o, final long offset) {
            return this.a.getInt(o, offset);
        }
        
        public final long k(final Object o, final long offset) {
            return this.a.getLong(o, offset);
        }
        
        public abstract boolean l(final Object p0, final long p1);
        
        public abstract float m(final Object p0, final long p1);
        
        public abstract double n(final Object p0, final long p1);
        
        public abstract byte o(final Object p0, final long p1);
    }
}
