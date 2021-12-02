// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.ArrayList;

public final class h6
{
    public static double a(final double a) {
        if (Double.isNaN(a)) {
            return 0.0;
        }
        if (!Double.isInfinite(a)) {
            final double n = dcmpl(a, 0.0);
            if (n != 0) {
                if (n != 0) {
                    int n2;
                    if (n > 0) {
                        n2 = 1;
                    }
                    else {
                        n2 = -1;
                    }
                    return n2 * Math.floor(Math.abs(a));
                }
            }
        }
        return a;
    }
    
    public static int b(final double a) {
        if (!Double.isNaN(a) && !Double.isInfinite(a)) {
            final double n = dcmpl(a, 0.0);
            if (n != 0) {
                int n2;
                if (n > 0) {
                    n2 = 1;
                }
                else {
                    n2 = -1;
                }
                return (int)(n2 * Math.floor(Math.abs(a)) % 4.294967296E9);
            }
        }
        return 0;
    }
    
    public static int c(final g5 g5) {
        final int b = b(g5.d("runtime.counter").g() + 1.0);
        if (b <= 1000000) {
            g5.g("runtime.counter", new i((double)b));
            return b;
        }
        throw new IllegalStateException("Instructions allowed exceeded");
    }
    
    public static long d(final double n) {
        return (long)b(n) & 0xFFFFFFFFL;
    }
    
    public static n0 e(final String s) {
        n0 b;
        final n0 n0 = b = null;
        if (s != null) {
            b = n0;
            if (!s.isEmpty()) {
                b = com.google.android.gms.internal.measurement.n0.b(Integer.parseInt(s));
            }
        }
        if (b != null) {
            return b;
        }
        throw new IllegalArgumentException(String.format("Unsupported commandId %s", s));
    }
    
    public static Object f(final q q) {
        if (q.g.equals(q)) {
            return null;
        }
        if (q.f.equals(q)) {
            return "";
        }
        if (q instanceof n) {
            return g((n)q);
        }
        if (q instanceof f) {
            final ArrayList<Object> list = new ArrayList<Object>();
            final Iterator<q> iterator = ((f)q).iterator();
            while (iterator.hasNext()) {
                final Object f = f(iterator.next());
                if (f != null) {
                    list.add(f);
                }
            }
            return list;
        }
        if (!q.g().isNaN()) {
            return q.g();
        }
        return q.k();
    }
    
    public static Map<String, Object> g(final n n) {
        final HashMap<String, Object> hashMap = new HashMap<String, Object>();
        for (final String s : n.a()) {
            final Object f = f(n.h(s));
            if (f != null) {
                hashMap.put(s, f);
            }
        }
        return hashMap;
    }
    
    public static void h(final String s, final int i, final List<q> list) {
        if (list.size() == i) {
            return;
        }
        throw new IllegalArgumentException(String.format("%s operation requires %s parameters found %s", s, i, list.size()));
    }
    
    public static void i(final String s, final int i, final List<q> list) {
        if (list.size() >= i) {
            return;
        }
        throw new IllegalArgumentException(String.format("%s operation requires at least %s parameters found %s", s, i, list.size()));
    }
    
    public static void j(final String s, final int i, final List<q> list) {
        if (list.size() <= i) {
            return;
        }
        throw new IllegalArgumentException(String.format("%s operation requires at most %s parameters found %s", s, i, list.size()));
    }
    
    public static boolean k(final q q) {
        if (q == null) {
            return false;
        }
        final Double g = q.g();
        return !g.isNaN() && g >= 0.0 && g.equals(Math.floor(g));
    }
    
    public static boolean l(final q q, final q q2) {
        if (!q.getClass().equals(q2.getClass())) {
            return false;
        }
        if (q instanceof v || q instanceof o) {
            return true;
        }
        if (q instanceof i) {
            return !Double.isNaN(q.g()) && !Double.isNaN(q2.g()) && q.g().equals(q2.g());
        }
        if (q instanceof u) {
            return q.k().equals(q2.k());
        }
        if (q instanceof g) {
            return q.m().equals(q2.m());
        }
        return q == q2;
    }
}
