// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.util.Iterator;
import java.util.RandomAccess;
import java.io.IOException;
import java.util.List;

final class u8
{
    private static final Class<?> a;
    private static final k9<?, ?> b;
    private static final k9<?, ?> c;
    private static final k9<?, ?> d;
    
    static {
        a = F();
        b = g(false);
        c = g(true);
        d = new m9();
    }
    
    static int A(final List<Long> list) {
        final int size = list.size();
        final int n = 0;
        int n2 = 0;
        if (size == 0) {
            return 0;
        }
        int n4;
        if (list instanceof m7) {
            final m7 m7 = (m7)list;
            int n3 = 0;
            while (true) {
                n4 = n3;
                if (n2 >= size) {
                    break;
                }
                n3 += v5.o0(m7.h(n2));
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
                n5 += v5.o0(list.get(n6));
                ++n6;
            }
        }
        return n4;
    }
    
    public static k9<?, ?> B() {
        return u8.d;
    }
    
    public static void C(final int n, final List<Long> list, final ia ia, final boolean b) throws IOException {
        if (list != null && !list.isEmpty()) {
            ia.j(n, list, b);
        }
    }
    
    static int D(final int n, final List<Integer> list, final boolean b) {
        final int size = list.size();
        if (size == 0) {
            return 0;
        }
        return E(list) + size * v5.h0(n);
    }
    
    static int E(final List<Integer> list) {
        final int size = list.size();
        final int n = 0;
        int n2 = 0;
        if (size == 0) {
            return 0;
        }
        int n4;
        if (list instanceof r6) {
            final r6 r6 = (r6)list;
            int n3 = 0;
            while (true) {
                n4 = n3;
                if (n2 >= size) {
                    break;
                }
                n3 += v5.C0(r6.f(n2));
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
                n5 += v5.C0(list.get(n6));
                ++n6;
            }
        }
        return n4;
    }
    
    private static Class<?> F() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        }
        finally {
            return null;
        }
    }
    
    public static void G(final int n, final List<Long> list, final ia ia, final boolean b) throws IOException {
        if (list != null && !list.isEmpty()) {
            ia.w(n, list, b);
        }
    }
    
    static int H(final int n, final List<Integer> list, final boolean b) {
        final int size = list.size();
        if (size == 0) {
            return 0;
        }
        return I(list) + size * v5.h0(n);
    }
    
    static int I(final List<Integer> list) {
        final int size = list.size();
        final int n = 0;
        int n2 = 0;
        if (size == 0) {
            return 0;
        }
        int n4;
        if (list instanceof r6) {
            final r6 r6 = (r6)list;
            int n3 = 0;
            while (true) {
                n4 = n3;
                if (n2 >= size) {
                    break;
                }
                n3 += v5.l0(r6.f(n2));
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
                n5 += v5.l0(list.get(n6));
                ++n6;
            }
        }
        return n4;
    }
    
    private static Class<?> J() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        }
        finally {
            return null;
        }
    }
    
    public static void K(final int n, final List<Long> list, final ia ia, final boolean b) throws IOException {
        if (list != null && !list.isEmpty()) {
            ia.v(n, list, b);
        }
    }
    
    static int L(final int n, final List<Integer> list, final boolean b) {
        final int size = list.size();
        if (size == 0) {
            return 0;
        }
        return M(list) + size * v5.h0(n);
    }
    
    static int M(final List<Integer> list) {
        final int size = list.size();
        final int n = 0;
        int n2 = 0;
        if (size == 0) {
            return 0;
        }
        int n4;
        if (list instanceof r6) {
            final r6 r6 = (r6)list;
            int n3 = 0;
            while (true) {
                n4 = n3;
                if (n2 >= size) {
                    break;
                }
                n3 += v5.p0(r6.f(n2));
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
                n5 += v5.p0(list.get(n6));
                ++n6;
            }
        }
        return n4;
    }
    
    public static void N(final int n, final List<Long> list, final ia ia, final boolean b) throws IOException {
        if (list != null && !list.isEmpty()) {
            ia.t(n, list, b);
        }
    }
    
    static int O(final int n, final List<Integer> list, final boolean b) {
        final int size = list.size();
        if (size == 0) {
            return 0;
        }
        return P(list) + size * v5.h0(n);
    }
    
    static int P(final List<Integer> list) {
        final int size = list.size();
        final int n = 0;
        int n2 = 0;
        if (size == 0) {
            return 0;
        }
        int n4;
        if (list instanceof r6) {
            final r6 r6 = (r6)list;
            int n3 = 0;
            while (true) {
                n4 = n3;
                if (n2 >= size) {
                    break;
                }
                n3 += v5.t0(r6.f(n2));
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
                n5 += v5.t0(list.get(n6));
                ++n6;
            }
        }
        return n4;
    }
    
    public static void Q(final int n, final List<Long> list, final ia ia, final boolean b) throws IOException {
        if (list != null && !list.isEmpty()) {
            ia.k(n, list, b);
        }
    }
    
    static int R(final int n, final List<?> list, final boolean b) {
        final int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * v5.y0(n, 0);
    }
    
    static int S(final List<?> list) {
        return list.size() << 2;
    }
    
    public static void T(final int n, final List<Integer> list, final ia ia, final boolean b) throws IOException {
        if (list != null && !list.isEmpty()) {
            ia.e(n, list, b);
        }
    }
    
    static int U(final int n, final List<?> list, final boolean b) {
        final int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * v5.r0(n, 0L);
    }
    
    static int V(final List<?> list) {
        return list.size() << 3;
    }
    
    public static void W(final int n, final List<Integer> list, final ia ia, final boolean b) throws IOException {
        if (list != null && !list.isEmpty()) {
            ia.n(n, list, b);
        }
    }
    
    static int X(final int n, final List<?> list, final boolean b) {
        final int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * v5.H(n, true);
    }
    
    static int Y(final List<?> list) {
        return list.size();
    }
    
    public static void Z(final int n, final List<Integer> list, final ia ia, final boolean b) throws IOException {
        if (list != null && !list.isEmpty()) {
            ia.x(n, list, b);
        }
    }
    
    static int a(final int n, final Object o, final s8 s8) {
        if (o instanceof h7) {
            return v5.c(n, (h7)o);
        }
        return v5.F(n, (z7)o, s8);
    }
    
    public static void a0(final int n, final List<Integer> list, final ia ia, final boolean b) throws IOException {
        if (list != null && !list.isEmpty()) {
            ia.l(n, list, b);
        }
    }
    
    static int b(int n, final List<?> list) {
        final int size = list.size();
        int n2 = 0;
        final int n3 = 0;
        if (size == 0) {
            return 0;
        }
        final int n4 = n = v5.h0(n) * size;
        int n6;
        if (list instanceof j7) {
            final j7 j7 = (j7)list;
            n = n4;
            int n5 = n3;
            while (true) {
                n6 = n;
                if (n5 >= size) {
                    break;
                }
                final Object s = j7.s(n5);
                int n7;
                if (s instanceof f5) {
                    n7 = v5.I((f5)s);
                }
                else {
                    n7 = v5.K((String)s);
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
                final f5 value = list.get(n2);
                int n8;
                if (value instanceof f5) {
                    n8 = v5.I(value);
                }
                else {
                    n8 = v5.K((String)value);
                }
                n += n8;
                ++n2;
            }
        }
        return n6;
    }
    
    public static void b0(final int n, final List<Integer> list, final ia ia, final boolean b) throws IOException {
        if (list != null && !list.isEmpty()) {
            ia.o(n, list, b);
        }
    }
    
    static int c(int i, final List<?> list, final s8 s8) {
        final int size = list.size();
        final int n = 0;
        if (size == 0) {
            return 0;
        }
        int n2 = v5.h0(i) * size;
        Object value;
        int n3;
        for (i = n; i < size; ++i) {
            value = list.get(i);
            if (value instanceof h7) {
                n3 = v5.d((h7)value);
            }
            else {
                n3 = v5.e((z7)value, s8);
            }
            n2 += n3;
        }
        return n2;
    }
    
    public static void c0(final int n, final List<Integer> list, final ia ia, final boolean b) throws IOException {
        if (list != null && !list.isEmpty()) {
            ia.f(n, list, b);
        }
    }
    
    static int d(final int n, final List<Long> list, final boolean b) {
        if (list.size() == 0) {
            return 0;
        }
        return e(list) + list.size() * v5.h0(n);
    }
    
    public static void d0(final int n, final List<Boolean> list, final ia ia, final boolean b) throws IOException {
        if (list != null && !list.isEmpty()) {
            ia.b(n, list, b);
        }
    }
    
    static int e(final List<Long> list) {
        final int size = list.size();
        final int n = 0;
        int n2 = 0;
        if (size == 0) {
            return 0;
        }
        int n4;
        if (list instanceof m7) {
            final m7 m7 = (m7)list;
            int n3 = 0;
            while (true) {
                n4 = n3;
                if (n2 >= size) {
                    break;
                }
                n3 += v5.e0(m7.h(n2));
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
                n5 += v5.e0(list.get(n6));
                ++n6;
            }
        }
        return n4;
    }
    
    public static k9<?, ?> f() {
        return u8.b;
    }
    
    private static k9<?, ?> g(final boolean b) {
        try {
            final Class<?> j = J();
            if (j == null) {}
            return (k9<?, ?>)j.getConstructor(Boolean.TYPE).newInstance(b);
        }
        finally {
            return null;
        }
    }
    
    static <UT, UB> UB h(final int n, final int n2, final UB ub, final k9<UT, UB> k9) {
        UB a = ub;
        if (ub == null) {
            a = k9.a();
        }
        k9.d(a, n, n2);
        return a;
    }
    
    static <UT, UB> UB i(final int n, final List<Integer> list, final u6 u6, UB ub, final k9<UT, UB> k9) {
        if (u6 == null) {
            return ub;
        }
        UB ub2;
        if (list instanceof RandomAccess) {
            final int size = list.size();
            int i = 0;
            int n2 = 0;
            while (i < size) {
                final int intValue = list.get(i);
                if (u6.d(intValue)) {
                    if (i != n2) {
                        list.set(n2, intValue);
                    }
                    ++n2;
                }
                else {
                    ub = h(n, intValue, ub, k9);
                }
                ++i;
            }
            ub2 = ub;
            if (n2 != size) {
                list.subList(n2, size).clear();
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
                if (u6.d(intValue2)) {
                    continue;
                }
                ub = h(n, intValue2, ub, k9);
                iterator.remove();
            }
        }
        return ub2;
    }
    
    public static void j(final int n, final List<String> list, final ia ia) throws IOException {
        if (list != null && !list.isEmpty()) {
            ia.D(n, list);
        }
    }
    
    public static void k(final int n, final List<?> list, final ia ia, final s8 s8) throws IOException {
        if (list != null && !list.isEmpty()) {
            ia.N(n, list, s8);
        }
    }
    
    public static void l(final int n, final List<Double> list, final ia ia, final boolean b) throws IOException {
        if (list != null && !list.isEmpty()) {
            ia.y(n, list, b);
        }
    }
    
    static <T, FT extends j6<FT>> void m(final d6<FT> d6, final T t, final T t2) {
        final h6<FT> b = d6.b(t2);
        if (!b.a.isEmpty()) {
            d6.i(t).g(b);
        }
    }
    
    static <T> void n(final w7 w7, final T t, final T t2, final long n) {
        r9.j(t, n, w7.f(r9.F(t, n), r9.F(t2, n)));
    }
    
    static <T, UT, UB> void o(final k9<UT, UB> k9, final T t, final T t2) {
        k9.h(t, k9.p(k9.k(t), k9.k(t2)));
    }
    
    public static void p(final Class<?> clazz) {
        if (!p6.class.isAssignableFrom(clazz)) {
            final Class<?> a = u8.a;
            if (a != null) {
                if (!a.isAssignableFrom(clazz)) {
                    throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
                }
            }
        }
    }
    
    static boolean q(final Object o, final Object obj) {
        return o == obj || (o != null && o.equals(obj));
    }
    
    static int r(int i, final List<f5> list) {
        final int size = list.size();
        final int n = 0;
        if (size == 0) {
            return 0;
        }
        final int n2 = size * v5.h0(i);
        i = n;
        int n3 = n2;
        while (i < list.size()) {
            n3 += v5.I(list.get(i));
            ++i;
        }
        return n3;
    }
    
    static int s(final int n, final List<z7> list, final s8 s8) {
        final int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        int n2 = 0;
        while (i < size) {
            n2 += v5.V(n, list.get(i), s8);
            ++i;
        }
        return n2;
    }
    
    static int t(final int n, final List<Long> list, final boolean b) {
        final int size = list.size();
        if (size == 0) {
            return 0;
        }
        return u(list) + size * v5.h0(n);
    }
    
    static int u(final List<Long> list) {
        final int size = list.size();
        final int n = 0;
        int n2 = 0;
        if (size == 0) {
            return 0;
        }
        int n4;
        if (list instanceof m7) {
            final m7 m7 = (m7)list;
            int n3 = 0;
            while (true) {
                n4 = n3;
                if (n2 >= size) {
                    break;
                }
                n3 += v5.j0(m7.h(n2));
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
                n5 += v5.j0(list.get(n6));
                ++n6;
            }
        }
        return n4;
    }
    
    public static k9<?, ?> v() {
        return u8.c;
    }
    
    public static void w(final int n, final List<f5> list, final ia ia) throws IOException {
        if (list != null && !list.isEmpty()) {
            ia.z(n, list);
        }
    }
    
    public static void x(final int n, final List<?> list, final ia ia, final s8 s8) throws IOException {
        if (list != null && !list.isEmpty()) {
            ia.I(n, list, s8);
        }
    }
    
    public static void y(final int n, final List<Float> list, final ia ia, final boolean b) throws IOException {
        if (list != null && !list.isEmpty()) {
            ia.B(n, list, b);
        }
    }
    
    static int z(final int n, final List<Long> list, final boolean b) {
        final int size = list.size();
        if (size == 0) {
            return 0;
        }
        return A(list) + size * v5.h0(n);
    }
}
