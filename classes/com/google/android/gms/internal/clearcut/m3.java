// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

import java.util.Iterator;
import java.util.RandomAccess;
import java.io.IOException;
import java.util.List;

final class m3
{
    private static final Class<?> a;
    private static final c4<?, ?> b;
    private static final c4<?, ?> c;
    private static final c4<?, ?> d;
    
    static {
        a = C();
        b = w(false);
        c = w(true);
        d = new e4();
    }
    
    public static c4<?, ?> A() {
        return m3.c;
    }
    
    public static c4<?, ?> B() {
        return m3.d;
    }
    
    private static Class<?> C() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        }
        finally {
            return null;
        }
    }
    
    private static Class<?> D() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        }
        finally {
            return null;
        }
    }
    
    static int E(final List<Integer> list) {
        final int size = list.size();
        final int n = 0;
        int n2 = 0;
        if (size == 0) {
            return 0;
        }
        int n4;
        if (list instanceof k1) {
            final k1 k1 = (k1)list;
            int n3 = 0;
            while (true) {
                n4 = n3;
                if (n2 >= size) {
                    break;
                }
                n3 += p0.D0(k1.f(n2));
                ++n2;
            }
        }
        else {
            int n5 = 0;
            int n6 = n;
            while (true) {
                n4 = n5;
                if (n6 >= size) {
                    break;
                }
                n5 += p0.D0(list.get(n6));
                ++n6;
            }
        }
        return n4;
    }
    
    public static void F(final int n, final List<Long> list, final x4 x4, final boolean b) throws IOException {
        if (list != null && !list.isEmpty()) {
            x4.v(n, list, b);
        }
    }
    
    static int G(final List<Integer> list) {
        final int size = list.size();
        final int n = 0;
        int n2 = 0;
        if (size == 0) {
            return 0;
        }
        int n4;
        if (list instanceof k1) {
            final k1 k1 = (k1)list;
            int n3 = 0;
            while (true) {
                n4 = n3;
                if (n2 >= size) {
                    break;
                }
                n3 += p0.E0(k1.f(n2));
                ++n2;
            }
        }
        else {
            int n5 = 0;
            int n6 = n;
            while (true) {
                n4 = n5;
                if (n6 >= size) {
                    break;
                }
                n5 += p0.E0(list.get(n6));
                ++n6;
            }
        }
        return n4;
    }
    
    public static void H(final int n, final List<Long> list, final x4 x4, final boolean b) throws IOException {
        if (list != null && !list.isEmpty()) {
            x4.t(n, list, b);
        }
    }
    
    public static void I(final Class<?> clazz) {
        if (!j1.class.isAssignableFrom(clazz)) {
            final Class<?> a = m3.a;
            if (a != null) {
                if (!a.isAssignableFrom(clazz)) {
                    throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
                }
            }
        }
    }
    
    static int J(final List<Integer> list) {
        final int size = list.size();
        final int n = 0;
        int n2 = 0;
        if (size == 0) {
            return 0;
        }
        int n4;
        if (list instanceof k1) {
            final k1 k1 = (k1)list;
            int n3 = 0;
            while (true) {
                n4 = n3;
                if (n2 >= size) {
                    break;
                }
                n3 += p0.F0(k1.f(n2));
                ++n2;
            }
        }
        else {
            int n5 = 0;
            int n6 = n;
            while (true) {
                n4 = n5;
                if (n6 >= size) {
                    break;
                }
                n5 += p0.F0(list.get(n6));
                ++n6;
            }
        }
        return n4;
    }
    
    public static void K(final int n, final List<Long> list, final x4 x4, final boolean b) throws IOException {
        if (list != null && !list.isEmpty()) {
            x4.k(n, list, b);
        }
    }
    
    static int L(final List<?> list) {
        return list.size() << 2;
    }
    
    public static void M(final int n, final List<Integer> list, final x4 x4, final boolean b) throws IOException {
        if (list != null && !list.isEmpty()) {
            x4.e(n, list, b);
        }
    }
    
    static int N(final List<?> list) {
        return list.size() << 3;
    }
    
    public static void O(final int n, final List<Integer> list, final x4 x4, final boolean b) throws IOException {
        if (list != null && !list.isEmpty()) {
            x4.n(n, list, b);
        }
    }
    
    static int P(final List<?> list) {
        return list.size();
    }
    
    public static void Q(final int n, final List<Integer> list, final x4 x4, final boolean b) throws IOException {
        if (list != null && !list.isEmpty()) {
            x4.x(n, list, b);
        }
    }
    
    public static void R(final int n, final List<Integer> list, final x4 x4, final boolean b) throws IOException {
        if (list != null && !list.isEmpty()) {
            x4.l(n, list, b);
        }
    }
    
    public static void S(final int n, final List<Integer> list, final x4 x4, final boolean b) throws IOException {
        if (list != null && !list.isEmpty()) {
            x4.o(n, list, b);
        }
    }
    
    public static void T(final int n, final List<Integer> list, final x4 x4, final boolean b) throws IOException {
        if (list != null && !list.isEmpty()) {
            x4.f(n, list, b);
        }
    }
    
    public static void U(final int n, final List<Boolean> list, final x4 x4, final boolean b) throws IOException {
        if (list != null && !list.isEmpty()) {
            x4.b(n, list, b);
        }
    }
    
    static int V(final int n, final List<Long> list, final boolean b) {
        if (list.size() == 0) {
            return 0;
        }
        return a(list) + list.size() * p0.C0(n);
    }
    
    static int W(final int n, final List<Long> list, final boolean b) {
        final int size = list.size();
        if (size == 0) {
            return 0;
        }
        return j(list) + size * p0.C0(n);
    }
    
    static int X(final int n, final List<Long> list, final boolean b) {
        final int size = list.size();
        if (size == 0) {
            return 0;
        }
        return q(list) + size * p0.C0(n);
    }
    
    static int Y(final int n, final List<Integer> list, final boolean b) {
        final int size = list.size();
        if (size == 0) {
            return 0;
        }
        return v(list) + size * p0.C0(n);
    }
    
    static int Z(final int n, final List<Integer> list, final boolean b) {
        final int size = list.size();
        if (size == 0) {
            return 0;
        }
        return E(list) + size * p0.C0(n);
    }
    
    static int a(final List<Long> list) {
        final int size = list.size();
        final int n = 0;
        int n2 = 0;
        if (size == 0) {
            return 0;
        }
        int n4;
        if (list instanceof g2) {
            final g2 g2 = (g2)list;
            int n3 = 0;
            while (true) {
                n4 = n3;
                if (n2 >= size) {
                    break;
                }
                n3 += p0.f0(g2.f(n2));
                ++n2;
            }
        }
        else {
            int n5 = 0;
            int n6 = n;
            while (true) {
                n4 = n5;
                if (n6 >= size) {
                    break;
                }
                n5 += p0.f0(list.get(n6));
                ++n6;
            }
        }
        return n4;
    }
    
    static int a0(final int n, final List<Integer> list, final boolean b) {
        final int size = list.size();
        if (size == 0) {
            return 0;
        }
        return G(list) + size * p0.C0(n);
    }
    
    private static <UT, UB> UB b(final int n, final int n2, final UB ub, final c4<UT, UB> c4) {
        UB f = ub;
        if (ub == null) {
            f = c4.f();
        }
        c4.a(f, n, n2);
        return f;
    }
    
    static int b0(final int n, final List<Integer> list, final boolean b) {
        final int size = list.size();
        if (size == 0) {
            return 0;
        }
        return J(list) + size * p0.C0(n);
    }
    
    static <UT, UB> UB c(final int n, final List<Integer> list, final n1<?> n2, UB ub, final c4<UT, UB> c4) {
        if (n2 == null) {
            return ub;
        }
        UB ub2;
        if (list instanceof RandomAccess) {
            final int size = list.size();
            int i = 0;
            int n3 = 0;
            while (i < size) {
                final int intValue = list.get(i);
                if (n2.s(intValue) != null) {
                    if (i != n3) {
                        list.set(n3, intValue);
                    }
                    ++n3;
                }
                else {
                    ub = b(n, intValue, ub, c4);
                }
                ++i;
            }
            ub2 = ub;
            if (n3 != size) {
                list.subList(n3, size).clear();
                ub2 = ub;
            }
        }
        else {
            final Iterator<Integer> iterator = list.iterator();
            while (true) {
                ub2 = ub;
                if (!iterator.hasNext()) {
                    break;
                }
                final int intValue2 = iterator.next();
                if (n2.s(intValue2) != null) {
                    continue;
                }
                ub = b(n, intValue2, ub, c4);
                iterator.remove();
            }
        }
        return ub2;
    }
    
    static int c0(final int n, final List<?> list, final boolean b) {
        final int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * p0.u0(n, 0);
    }
    
    public static void d(final int n, final List<String> list, final x4 x4) throws IOException {
        if (list != null && !list.isEmpty()) {
            x4.D(n, list);
        }
    }
    
    static int d0(final int n, final List<?> list, final boolean b) {
        final int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * p0.l0(n, 0L);
    }
    
    public static void e(final int n, final List<?> list, final x4 x4, final k3 k3) throws IOException {
        if (list != null && !list.isEmpty()) {
            x4.H(n, list, k3);
        }
    }
    
    static int e0(final int n, final List<?> list, final boolean b) {
        final int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * p0.Q(n, true);
    }
    
    public static void f(final int n, final List<Double> list, final x4 x4, final boolean b) throws IOException {
        if (list != null && !list.isEmpty()) {
            x4.y(n, list, b);
        }
    }
    
    static <T, FT extends d1<FT>> void g(final w0<FT> w0, final T t, final T t2) {
        final a1<FT> b = w0.b(t2);
        if (!b.b()) {
            w0.e(t).i(b);
        }
    }
    
    static <T> void h(final n2 n2, final T t, final T t2, final long n3) {
        j4.i(t, n3, n2.d(j4.M(t, n3), j4.M(t2, n3)));
    }
    
    static <T, UT, UB> void i(final c4<UT, UB> c4, final T t, final T t2) {
        c4.g(t, c4.i(c4.k(t), c4.k(t2)));
    }
    
    static int j(final List<Long> list) {
        final int size = list.size();
        final int n = 0;
        int n2 = 0;
        if (size == 0) {
            return 0;
        }
        int n4;
        if (list instanceof g2) {
            final g2 g2 = (g2)list;
            int n3 = 0;
            while (true) {
                n4 = n3;
                if (n2 >= size) {
                    break;
                }
                n3 += p0.i0(g2.f(n2));
                ++n2;
            }
        }
        else {
            int n5 = 0;
            int n6 = n;
            while (true) {
                n4 = n5;
                if (n6 >= size) {
                    break;
                }
                n5 += p0.i0(list.get(n6));
                ++n6;
            }
        }
        return n4;
    }
    
    public static void k(final int n, final List<d0> list, final x4 x4) throws IOException {
        if (list != null && !list.isEmpty()) {
            x4.z(n, list);
        }
    }
    
    public static void l(final int n, final List<?> list, final x4 x4, final k3 k3) throws IOException {
        if (list != null && !list.isEmpty()) {
            x4.F(n, list, k3);
        }
    }
    
    public static void m(final int n, final List<Float> list, final x4 x4, final boolean b) throws IOException {
        if (list != null && !list.isEmpty()) {
            x4.B(n, list, b);
        }
    }
    
    static int n(final int n, final Object o, final k3 k3) {
        if (o instanceof y1) {
            return p0.d(n, (y1)o);
        }
        return p0.B(n, (s2)o, k3);
    }
    
    static int o(int n, final List<?> list) {
        final int size = list.size();
        int n2 = 0;
        final int n3 = 0;
        if (size == 0) {
            return 0;
        }
        final int n4 = n = p0.C0(n) * size;
        int n6;
        if (list instanceof a2) {
            final a2 a2 = (a2)list;
            n = n4;
            int n5 = n3;
            while (true) {
                n6 = n;
                if (n5 >= size) {
                    break;
                }
                final Object q5 = a2.q5(n5);
                int n7;
                if (q5 instanceof d0) {
                    n7 = p0.D((d0)q5);
                }
                else {
                    n7 = p0.r0((String)q5);
                }
                n += n7;
                ++n5;
            }
        }
        else {
            while (true) {
                n6 = n;
                if (n2 >= size) {
                    break;
                }
                final d0 value = list.get(n2);
                int n8;
                if (value instanceof d0) {
                    n8 = p0.D(value);
                }
                else {
                    n8 = p0.r0((String)value);
                }
                n += n8;
                ++n2;
            }
        }
        return n6;
    }
    
    static int p(int n, final List<?> list, final k3 k3) {
        final int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        n = p0.C0(n) * size;
        while (i < size) {
            final Object value = list.get(i);
            int n2;
            if (value instanceof y1) {
                n2 = p0.e((y1)value);
            }
            else {
                n2 = p0.E((s2)value, k3);
            }
            n += n2;
            ++i;
        }
        return n;
    }
    
    static int q(final List<Long> list) {
        final int size = list.size();
        final int n = 0;
        int n2 = 0;
        if (size == 0) {
            return 0;
        }
        int n4;
        if (list instanceof g2) {
            final g2 g2 = (g2)list;
            int n3 = 0;
            while (true) {
                n4 = n3;
                if (n2 >= size) {
                    break;
                }
                n3 += p0.m0(g2.f(n2));
                ++n2;
            }
        }
        else {
            int n5 = 0;
            int n6 = n;
            while (true) {
                n4 = n5;
                if (n6 >= size) {
                    break;
                }
                n5 += p0.m0(list.get(n6));
                ++n6;
            }
        }
        return n4;
    }
    
    public static void r(final int n, final List<Long> list, final x4 x4, final boolean b) throws IOException {
        if (list != null && !list.isEmpty()) {
            x4.j(n, list, b);
        }
    }
    
    public static boolean s(final int n, final int n2, final int n3) {
        if (n2 < 40) {
            return true;
        }
        final long n4 = n2;
        final long n5 = n;
        final long n6 = n3;
        return n4 - n5 + 1L + 9L <= 2L * n6 + 3L + (n6 + 3L) * 3L;
    }
    
    static int t(int i, final List<d0> list) {
        final int size = list.size();
        final int n = 0;
        if (size == 0) {
            return 0;
        }
        final int n2 = size * p0.C0(i);
        i = n;
        int n3 = n2;
        while (i < list.size()) {
            n3 += p0.D(list.get(i));
            ++i;
        }
        return n3;
    }
    
    static int u(final int n, final List<s2> list, final k3 k3) {
        final int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        int n2 = 0;
        while (i < size) {
            n2 += p0.P(n, list.get(i), k3);
            ++i;
        }
        return n2;
    }
    
    static int v(final List<Integer> list) {
        final int size = list.size();
        final int n = 0;
        int n2 = 0;
        if (size == 0) {
            return 0;
        }
        int n4;
        if (list instanceof k1) {
            final k1 k1 = (k1)list;
            int n3 = 0;
            while (true) {
                n4 = n3;
                if (n2 >= size) {
                    break;
                }
                n3 += p0.I0(k1.f(n2));
                ++n2;
            }
        }
        else {
            int n5 = 0;
            int n6 = n;
            while (true) {
                n4 = n5;
                if (n6 >= size) {
                    break;
                }
                n5 += p0.I0(list.get(n6));
                ++n6;
            }
        }
        return n4;
    }
    
    private static c4<?, ?> w(final boolean b) {
        try {
            final Class<?> d = D();
            if (d == null) {}
            return (c4<?, ?>)d.getConstructor(Boolean.TYPE).newInstance(b);
        }
        finally {
            return null;
        }
    }
    
    public static void x(final int n, final List<Long> list, final x4 x4, final boolean b) throws IOException {
        if (list != null && !list.isEmpty()) {
            x4.w(n, list, b);
        }
    }
    
    static boolean y(final Object o, final Object obj) {
        return o == obj || (o != null && o.equals(obj));
    }
    
    public static c4<?, ?> z() {
        return m3.b;
    }
}
