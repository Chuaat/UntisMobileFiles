// 
// Decompiled by Procyon v0.5.36
// 

package org.bson;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.List;

@Deprecated
public class c
{
    private static final int[] A;
    private static volatile boolean B = false;
    private static volatile boolean C = false;
    private static final org.bson.util.c<List<p1>> D;
    private static final org.bson.util.c<List<p1>> E;
    public static final byte a = 0;
    public static final byte b = 1;
    public static final byte c = 2;
    public static final byte d = 3;
    public static final byte e = 4;
    public static final byte f = 5;
    public static final byte g = 6;
    public static final byte h = 7;
    public static final byte i = 8;
    public static final byte j = 9;
    public static final byte k = 10;
    public static final byte l = 11;
    public static final byte m = 12;
    public static final byte n = 13;
    public static final byte o = 14;
    public static final byte p = 15;
    public static final byte q = 16;
    public static final byte r = 17;
    public static final byte s = 18;
    public static final byte t = -1;
    public static final byte u = Byte.MAX_VALUE;
    public static final byte v = 0;
    public static final byte w = 1;
    public static final byte x = 2;
    public static final byte y = 3;
    private static final int z = 256;
    
    static {
        final int[] a = new int[65535];
        (A = a)[103] = 256;
        a[105] = 2;
        a[109] = 8;
        a[115] = 32;
        a[99] = 128;
        a[120] = 4;
        a[100] = 1;
        a[116] = 16;
        a[117] = 64;
        D = new org.bson.util.c<List<p1>>();
        E = new org.bson.util.c<List<p1>>();
    }
    
    public static void a(final Class<?> clazz, final p1 p2) {
        org.bson.c.C = true;
        final org.bson.util.c<List<p1>> e = org.bson.c.E;
        List<p1> list;
        if ((list = e.c(clazz)) == null) {
            list = new CopyOnWriteArrayList<p1>();
            e.f(clazz, list);
        }
        list.add(p2);
    }
    
    public static void b(final Class<?> clazz, final p1 p2) {
        org.bson.c.B = true;
        final org.bson.util.c<List<p1>> d = org.bson.c.D;
        List<p1> list;
        if ((list = d.c(clazz)) == null) {
            list = new CopyOnWriteArrayList<p1>();
            d.f(clazz, list);
        }
        list.add(p2);
    }
    
    public static Object c(final Object o) {
        Object a = o;
        if (l() && (a = o) != null) {
            final org.bson.util.c<List<p1>> e = org.bson.c.E;
            if (e.h() == 0) {
                a = o;
            }
            else {
                final List<p1> list = e.c(o.getClass());
                a = o;
                if (list != null) {
                    final Iterator<p1> iterator = list.iterator();
                    a = o;
                    while (iterator.hasNext()) {
                        a = iterator.next().a(o);
                    }
                }
            }
        }
        return a;
    }
    
    public static Object d(final Object o) {
        Object a = o;
        if (m() && (a = o) != null) {
            final org.bson.util.c<List<p1>> d = org.bson.c.D;
            if (d.h() == 0) {
                a = o;
            }
            else {
                final List<p1> list = d.c(o.getClass());
                a = o;
                if (list != null) {
                    final Iterator<p1> iterator = list.iterator();
                    a = o;
                    while (iterator.hasNext()) {
                        a = iterator.next().a(o);
                    }
                }
            }
        }
        return a;
    }
    
    public static void e() {
        g();
        f();
    }
    
    public static void f() {
        org.bson.c.C = false;
        org.bson.c.E.b();
    }
    
    public static void g() {
        org.bson.c.B = false;
        org.bson.c.D.b();
    }
    
    public static i h(final byte[] array) {
        return new k().b(array);
    }
    
    public static byte[] i(final i i) {
        return new l().c(i);
    }
    
    public static List<p1> j(final Class<?> clazz) {
        return org.bson.c.E.c(clazz);
    }
    
    public static List<p1> k(final Class<?> clazz) {
        return org.bson.c.D.c(clazz);
    }
    
    public static boolean l() {
        return org.bson.c.C;
    }
    
    public static boolean m() {
        return org.bson.c.B;
    }
    
    public static int n(final char c) {
        final int n = c.A[c];
        if (n != 0) {
            return n;
        }
        throw new IllegalArgumentException(String.format("Unrecognized flag [%c]", c));
    }
    
    public static int o(final String s) {
        int i = 0;
        if (s == null) {
            return 0;
        }
        final char[] charArray = s.toLowerCase().toCharArray();
        final int length = charArray.length;
        int n = 0;
        while (i < length) {
            n |= n(charArray[i]);
            ++i;
        }
        return n;
    }
    
    public static String p(int n) {
        final StringBuilder sb = new StringBuilder();
        final int n2 = 0;
        int n3 = n;
        n = n2;
        while (true) {
            final int[] a = org.bson.c.A;
            if (n >= a.length) {
                break;
            }
            int n4 = n3;
            if ((a[n] & n3) > 0) {
                sb.append((char)n);
                n4 = n3 - a[n];
            }
            ++n;
            n3 = n4;
        }
        if (n3 <= 0) {
            return sb.toString();
        }
        throw new IllegalArgumentException("Some flags could not be recognized.");
    }
    
    public static void q(final Class<?> clazz, final p1 p2) {
        j(clazz).remove(p2);
    }
    
    public static void r(final Class<?> clazz) {
        org.bson.c.E.g(clazz);
    }
    
    public static void s(final Class<?> clazz, final p1 p2) {
        k(clazz).remove(p2);
    }
    
    public static void t(final Class<?> clazz) {
        org.bson.c.D.g(clazz);
    }
    
    public static int u(final Object o) {
        if (o == null) {
            throw new IllegalArgumentException("Argument shouldn't be null");
        }
        if (o instanceof Number) {
            return ((Number)o).intValue();
        }
        if (o instanceof Boolean) {
            return ((boolean)o) ? 1 : 0;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Can't convert: ");
        sb.append(o.getClass().getName());
        sb.append(" to int");
        throw new IllegalArgumentException(sb.toString());
    }
}
