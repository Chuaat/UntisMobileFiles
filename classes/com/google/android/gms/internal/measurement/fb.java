// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.RandomAccess;
import java.io.IOException;
import java.util.List;

final class fb
{
    private static final Class<?> a;
    private static final vb<?, ?> b;
    private static final vb<?, ?> c;
    private static final vb<?, ?> d;
    
    static {
        Class<?> a2;
        try {
            Class.forName("com.google.protobuf.GeneratedMessage");
        }
        finally {
            a2 = null;
        }
        a = a2;
        b = C(false);
        c = C(true);
        d = new xb();
    }
    
    static int A(final int n, final List<?> list, final boolean b) {
        final int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (q8.a(n << 3) + 1);
    }
    
    public static void B(final int n, final List<Long> list, final r8 r8, final boolean b) throws IOException {
        if (list != null && !list.isEmpty()) {
            r8.k(n, list, b);
        }
    }
    
    private static vb<?, ?> C(final boolean b) {
        Class<vb<?, ?>> clazz;
        try {
            Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        }
        finally {
            clazz = null;
        }
        if (clazz == null) {
            return null;
        }
        try {
            return clazz.getConstructor(Boolean.TYPE).newInstance(b);
        }
        finally {
            return null;
        }
    }
    
    static int D(final List<?> list) {
        return list.size();
    }
    
    static int E(int i, final List<h8> list) {
        final int size = list.size();
        final int n = 0;
        if (size == 0) {
            return 0;
        }
        final int n2 = size * q8.D(i);
        i = n;
        int n3 = n2;
        while (i < list.size()) {
            n3 += q8.x(list.get(i));
            ++i;
        }
        return n3;
    }
    
    static int F(final int n, final List<Integer> list, final boolean b) {
        final int size = list.size();
        if (size == 0) {
            return 0;
        }
        return G(list) + size * q8.D(n);
    }
    
    static int G(final List<Integer> list) {
        final int size = list.size();
        final int n = 0;
        int n2 = 0;
        if (size == 0) {
            return 0;
        }
        int n4;
        if (list instanceof l9) {
            final l9 l9 = (l9)list;
            int n3 = 0;
            while (true) {
                n4 = n3;
                if (n2 >= size) {
                    break;
                }
                n3 += q8.z(l9.f(n2));
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
                n5 += q8.z(list.get(n6));
                ++n6;
            }
        }
        return n4;
    }
    
    static int H(final int n, final List<?> list, final boolean b) {
        final int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (q8.a(n << 3) + 4);
    }
    
    static int I(final List<?> list) {
        return list.size() * 4;
    }
    
    static int J(final int n, final List<?> list, final boolean b) {
        final int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (q8.a(n << 3) + 8);
    }
    
    static int K(final List<?> list) {
        return list.size() * 8;
    }
    
    static int L(final int n, final List<sa> list, final db db) {
        final int size = list.size();
        int i = 0;
        if (size != 0) {
            int n2 = 0;
            while (i < size) {
                n2 += q8.y(n, list.get(i), db);
                ++i;
            }
            return n2;
        }
        return 0;
    }
    
    static int M(final int n, final List<Integer> list, final boolean b) {
        final int size = list.size();
        if (size == 0) {
            return 0;
        }
        return N(list) + size * q8.D(n);
    }
    
    static int N(final List<Integer> list) {
        final int size = list.size();
        final int n = 0;
        int n2 = 0;
        if (size == 0) {
            return 0;
        }
        int n4;
        if (list instanceof l9) {
            final l9 l9 = (l9)list;
            int n3 = 0;
            while (true) {
                n4 = n3;
                if (n2 >= size) {
                    break;
                }
                n3 += q8.z(l9.f(n2));
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
                n5 += q8.z(list.get(n6));
                ++n6;
            }
        }
        return n4;
    }
    
    static int O(final int n, final List<Long> list, final boolean b) {
        if (list.size() == 0) {
            return 0;
        }
        return P(list) + list.size() * q8.D(n);
    }
    
    static int P(final List<Long> list) {
        final int size = list.size();
        final int n = 0;
        int n2 = 0;
        if (size == 0) {
            return 0;
        }
        int n4;
        if (list instanceof ga) {
            final ga ga = (ga)list;
            int n3 = 0;
            while (true) {
                n4 = n3;
                if (n2 >= size) {
                    break;
                }
                n3 += q8.b(ga.d(n2));
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
                n5 += q8.b(list.get(n6));
                ++n6;
            }
        }
        return n4;
    }
    
    static int Q(int a, final Object o, final db db) {
        if (o instanceof x9) {
            final x9 x9 = (x9)o;
            final int a2 = q8.a(a << 3);
            a = x9.a();
            return a2 + (q8.a(a) + a);
        }
        return q8.a(a << 3) + q8.B((sa)o, db);
    }
    
    static int R(int i, final List<?> list, final db db) {
        final int size = list.size();
        final int n = 0;
        if (size == 0) {
            return 0;
        }
        int n2 = q8.D(i) * size;
        Object value;
        int n3;
        for (i = n; i < size; ++i) {
            value = list.get(i);
            if (value instanceof x9) {
                n3 = q8.A((x9)value);
            }
            else {
                n3 = q8.B((sa)value, db);
            }
            n2 += n3;
        }
        return n2;
    }
    
    static int S(final int n, final List<Integer> list, final boolean b) {
        final int size = list.size();
        if (size == 0) {
            return 0;
        }
        return T(list) + size * q8.D(n);
    }
    
    static int T(final List<Integer> list) {
        final int size = list.size();
        final int n = 0;
        int n2 = 0;
        if (size == 0) {
            return 0;
        }
        int n4;
        if (list instanceof l9) {
            final l9 l9 = (l9)list;
            int n3 = 0;
            while (true) {
                n4 = n3;
                if (n2 >= size) {
                    break;
                }
                final int f = l9.f(n2);
                n3 += q8.a(f >> 31 ^ f + f);
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
                final int intValue = list.get(n6);
                n5 += q8.a(intValue >> 31 ^ intValue + intValue);
                ++n6;
            }
        }
        return n4;
    }
    
    static int U(final int n, final List<Long> list, final boolean b) {
        final int size = list.size();
        if (size == 0) {
            return 0;
        }
        return V(list) + size * q8.D(n);
    }
    
    static int V(final List<Long> list) {
        final int size = list.size();
        final int n = 0;
        int n2 = 0;
        if (size == 0) {
            return 0;
        }
        int n4;
        if (list instanceof ga) {
            final ga ga = (ga)list;
            int n3 = 0;
            while (true) {
                n4 = n3;
                if (n2 >= size) {
                    break;
                }
                final long d = ga.d(n2);
                n3 += q8.b(d >> 63 ^ d + d);
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
                final long longValue = list.get(n6);
                n5 += q8.b(longValue >> 63 ^ longValue + longValue);
                ++n6;
            }
        }
        return n4;
    }
    
    static int W(int n, final List<?> list) {
        final int size = list.size();
        int n2 = 0;
        final int n3 = 0;
        if (size == 0) {
            return 0;
        }
        final int n4 = n = q8.D(n) * size;
        int n6;
        if (list instanceof z9) {
            final z9 z9 = (z9)list;
            n = n4;
            int n5 = n3;
            while (true) {
                n6 = n;
                if (n5 >= size) {
                    break;
                }
                final Object j1 = z9.J1(n5);
                int n7;
                if (j1 instanceof h8) {
                    n7 = q8.x((h8)j1);
                }
                else {
                    n7 = q8.C((String)j1);
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
                final h8 value = list.get(n2);
                int n8;
                if (value instanceof h8) {
                    n8 = q8.x(value);
                }
                else {
                    n8 = q8.C((String)value);
                }
                n += n8;
                ++n2;
            }
        }
        return n6;
    }
    
    static int X(final int n, final List<Integer> list, final boolean b) {
        final int size = list.size();
        if (size == 0) {
            return 0;
        }
        return Y(list) + size * q8.D(n);
    }
    
    static int Y(final List<Integer> list) {
        final int size = list.size();
        final int n = 0;
        int n2 = 0;
        if (size == 0) {
            return 0;
        }
        int n4;
        if (list instanceof l9) {
            final l9 l9 = (l9)list;
            int n3 = 0;
            while (true) {
                n4 = n3;
                if (n2 >= size) {
                    break;
                }
                n3 += q8.a(l9.f(n2));
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
                n5 += q8.a(list.get(n6));
                ++n6;
            }
        }
        return n4;
    }
    
    static int Z(final int n, final List<Long> list, final boolean b) {
        final int size = list.size();
        if (size == 0) {
            return 0;
        }
        return a0(list) + size * q8.D(n);
    }
    
    public static vb<?, ?> a() {
        return fb.c;
    }
    
    static int a0(final List<Long> list) {
        final int size = list.size();
        final int n = 0;
        int n2 = 0;
        if (size == 0) {
            return 0;
        }
        int n4;
        if (list instanceof ga) {
            final ga ga = (ga)list;
            int n3 = 0;
            while (true) {
                n4 = n3;
                if (n2 >= size) {
                    break;
                }
                n3 += q8.b(ga.d(n2));
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
                n5 += q8.b(list.get(n6));
                ++n6;
            }
        }
        return n4;
    }
    
    public static vb<?, ?> b() {
        return fb.d;
    }
    
    public static vb<?, ?> b0() {
        return fb.b;
    }
    
    static <UT, UB> UB c(final int n, final List<Integer> list, final o9 o9, UB ub, final vb<UT, UB> vb) {
        if (o9 == null) {
            return ub;
        }
        UB ub2;
        if (list instanceof RandomAccess) {
            final int size = list.size();
            int i = 0;
            int n2 = 0;
            while (i < size) {
                final int intValue = list.get(i);
                if (o9.d(intValue)) {
                    if (i != n2) {
                        list.set(n2, intValue);
                    }
                    ++n2;
                }
                else {
                    ub = d(n, intValue, ub, vb);
                }
                ++i;
            }
            if (n2 != size) {
                list.subList(n2, size).clear();
                return ub;
            }
            ub2 = ub;
        }
        else {
            final Iterator<Integer> iterator = list.iterator();
            while (true) {
                ub2 = ub;
                if (!iterator.hasNext()) {
                    break;
                }
                final int intValue2 = iterator.next();
                if (o9.d(intValue2)) {
                    continue;
                }
                ub = d(n, intValue2, ub, vb);
                iterator.remove();
            }
        }
        return ub2;
    }
    
    static <UT, UB> UB d(final int n, final int n2, final UB ub, final vb<UT, UB> vb) {
        UB e = ub;
        if (ub == null) {
            e = vb.e();
        }
        vb.f(e, n, n2);
        return e;
    }
    
    static <T, FT extends z8<FT>> void e(final w8<FT> w8, final T t, final T t2) {
        w8.a(t2);
        throw null;
    }
    
    static <T, UT, UB> void f(final vb<UT, UB> vb, final T t, final T t2) {
        vb.h(t, vb.d(vb.c(t), vb.c(t2)));
    }
    
    public static void g(final Class<?> clazz) {
        if (!j9.class.isAssignableFrom(clazz)) {
            final Class<?> a = fb.a;
            if (a != null) {
                if (!a.isAssignableFrom(clazz)) {
                    throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
                }
            }
        }
    }
    
    static boolean h(final Object o, final Object obj) {
        boolean b = false;
        if (o != obj) {
            if (o == null) {
                return b;
            }
            if (!o.equals(obj)) {
                return false;
            }
        }
        b = true;
        return b;
    }
    
    static <T> void i(final na na, final T t, final T t2, final long n) {
        fc.x(t, n, na.b(fc.k(t, n), fc.k(t2, n)));
    }
    
    public static void j(final int n, final List<Boolean> list, final r8 r8, final boolean b) throws IOException {
        if (list != null && !list.isEmpty()) {
            r8.n(n, list, b);
        }
    }
    
    public static void k(final int n, final List<h8> list, final r8 r8) throws IOException {
        if (list != null && !list.isEmpty()) {
            r8.p(n, list);
        }
    }
    
    public static void l(final int n, final List<Double> list, final r8 r8, final boolean b) throws IOException {
        if (list != null && !list.isEmpty()) {
            r8.r(n, list, b);
        }
    }
    
    public static void m(final int n, final List<Integer> list, final r8 r8, final boolean b) throws IOException {
        if (list != null && !list.isEmpty()) {
            r8.u(n, list, b);
        }
    }
    
    public static void n(final int n, final List<Integer> list, final r8 r8, final boolean b) throws IOException {
        if (list != null && !list.isEmpty()) {
            r8.w(n, list, b);
        }
    }
    
    public static void o(final int n, final List<Long> list, final r8 r8, final boolean b) throws IOException {
        if (list != null && !list.isEmpty()) {
            r8.y(n, list, b);
        }
    }
    
    public static void p(final int n, final List<Float> list, final r8 r8, final boolean b) throws IOException {
        if (list != null && !list.isEmpty()) {
            r8.A(n, list, b);
        }
    }
    
    public static void q(final int n, final List<?> list, final r8 r8, final db db) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < list.size(); ++i) {
                r8.B(n, list.get(i), db);
            }
        }
    }
    
    public static void r(final int n, final List<Integer> list, final r8 r8, final boolean b) throws IOException {
        if (list != null && !list.isEmpty()) {
            r8.D(n, list, b);
        }
    }
    
    public static void s(final int n, final List<Long> list, final r8 r8, final boolean b) throws IOException {
        if (list != null && !list.isEmpty()) {
            r8.F(n, list, b);
        }
    }
    
    public static void t(final int n, final List<?> list, final r8 r8, final db db) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < list.size(); ++i) {
                r8.G(n, list.get(i), db);
            }
        }
    }
    
    public static void u(final int n, final List<Integer> list, final r8 r8, final boolean b) throws IOException {
        if (list != null && !list.isEmpty()) {
            r8.I(n, list, b);
        }
    }
    
    public static void v(final int n, final List<Long> list, final r8 r8, final boolean b) throws IOException {
        if (list != null && !list.isEmpty()) {
            r8.K(n, list, b);
        }
    }
    
    public static void w(final int n, final List<Integer> list, final r8 r8, final boolean b) throws IOException {
        if (list != null && !list.isEmpty()) {
            r8.b(n, list, b);
        }
    }
    
    public static void x(final int n, final List<Long> list, final r8 r8, final boolean b) throws IOException {
        if (list != null && !list.isEmpty()) {
            r8.d(n, list, b);
        }
    }
    
    public static void y(final int n, final List<String> list, final r8 r8) throws IOException {
        if (list != null && !list.isEmpty()) {
            r8.g(n, list);
        }
    }
    
    public static void z(final int n, final List<Integer> list, final r8 r8, final boolean b) throws IOException {
        if (list != null && !list.isEmpty()) {
            r8.i(n, list, b);
        }
    }
}
