// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

import java.util.Objects;
import java.util.Iterator;
import java.io.Serializable;
import java.lang.constant.Constable;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

final class w2<T> implements k3<T>
{
    private static final Unsafe s;
    private final int[] a;
    private final Object[] b;
    private final int c;
    private final int d;
    private final int e;
    private final s2 f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final int[] k;
    private final int[] l;
    private final int[] m;
    private final a3 n;
    private final b2 o;
    private final c4<?, ?> p;
    private final w0<?> q;
    private final n2 r;
    
    static {
        s = j4.z();
    }
    
    private w2(final int[] a, final Object[] b, final int c, final int d, final int e, final s2 f, final boolean i, final boolean b2, final int[] k, final int[] l, final int[] m, final a3 n, final b2 o, final c4<?, ?> p16, final w0<?> q, final n2 r) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.h = (f instanceof j1);
        this.i = i;
        this.g = (q != null && q.g(f));
        this.j = false;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.p = p16;
        this.q = q;
        this.f = f;
        this.r = r;
    }
    
    private final boolean A(final T t, final int n, final int n2, final int n3) {
        if (this.i) {
            return this.y(t, n);
        }
        return (n2 & n3) != 0x0;
    }
    
    private static boolean B(final Object o, final int n, final k3 k3) {
        return k3.h(j4.M(o, n & 0xFFFFF));
    }
    
    private final k3 C(int n) {
        n = n / 4 << 1;
        final k3 k3 = (k3)this.b[n];
        if (k3 != null) {
            return k3;
        }
        return (k3)(this.b[n] = f3.a().b((Class<Object>)this.b[n + 1]));
    }
    
    private final Object D(final int n) {
        return this.b[n / 4 << 1];
    }
    
    private final n1<?> E(final int n) {
        return (n1<?>)this.b[(n / 4 << 1) + 1];
    }
    
    private final int F(final int n) {
        return this.a[n + 1];
    }
    
    private final int G(final int n) {
        return this.a[n + 2];
    }
    
    private final int H(final int n) {
        final int c = this.c;
        if (n >= c) {
            final int e = this.e;
            if (n < e) {
                final int n2 = n - c << 2;
                if (this.a[n2] == n) {
                    return n2;
                }
                return -1;
            }
            else if (n <= this.d) {
                int i = e - c;
                int n3 = this.a.length / 4 - 1;
                while (i <= n3) {
                    final int n4 = n3 + i >>> 1;
                    final int n5 = n4 << 2;
                    final int n6 = this.a[n5];
                    if (n == n6) {
                        return n5;
                    }
                    if (n < n6) {
                        n3 = n4 - 1;
                    }
                    else {
                        i = n4 + 1;
                    }
                }
            }
        }
        return -1;
    }
    
    private final void I(final T t, int g) {
        if (this.i) {
            return;
        }
        g = this.G(g);
        final long n = g & 0xFFFFF;
        j4.g(t, n, j4.H(t, n) | 1 << (g >>> 20));
    }
    
    private final void J(final T t, final int n, final int n2) {
        j4.g(t, this.G(n2) & 0xFFFFF, n);
    }
    
    private final void K(final T o, final x4 x4) throws IOException {
        Object e = null;
        Map.Entry<?, ?> entry = null;
        Label_0048: {
            if (this.g) {
                final a1<?> b = this.q.b(o);
                if (!b.b()) {
                    e = b.e();
                    entry = (Map.Entry<?, ?>)((Iterator<Map.Entry>)e).next();
                    break Label_0048;
                }
            }
            e = null;
            entry = null;
        }
        int n = -1;
        final int length = this.a.length;
        final Unsafe s = w2.s;
        int n2 = 0;
        int int1 = 0;
        Map.Entry<?, ?> entry2;
        while (true) {
            entry2 = entry;
            if (n2 >= length) {
                break;
            }
            final int f = this.F(n2);
            final int[] a = this.a;
            final int n3 = a[n2];
            final int n4 = (0xFF00000 & f) >>> 20;
            int n8;
            if (!this.i && n4 <= 17) {
                final int n5 = a[n2 + 2];
                final int n6 = n5 & 0xFFFFF;
                int n7;
                if (n6 != (n7 = n)) {
                    int1 = s.getInt(o, n6);
                    n7 = n6;
                }
                n8 = 1 << (n5 >>> 20);
                n = n7;
            }
            else {
                n8 = 0;
            }
            int n9;
            while (true) {
                n9 = n2;
                if (entry == null || this.q.a(entry) > n3) {
                    break;
                }
                this.q.c(x4, entry);
                if (((Iterator)e).hasNext()) {
                    entry = (Map.Entry<?, ?>)((Iterator<Map.Entry>)e).next();
                }
                else {
                    entry = null;
                }
            }
            final long n10 = f & 0xFFFFF;
            switch (n4) {
                case 68: {
                    if (this.z(o, n3, n9)) {
                        x4.O(n3, s.getObject(o, n10), this.C(n9));
                        break;
                    }
                    break;
                }
                case 67: {
                    if (this.z(o, n3, n9)) {
                        x4.c(n3, R(o, n10));
                        break;
                    }
                    break;
                }
                case 66: {
                    if (this.z(o, n3, n9)) {
                        x4.C(n3, Q(o, n10));
                        break;
                    }
                    break;
                }
                case 65: {
                    if (this.z(o, n3, n9)) {
                        x4.E(n3, R(o, n10));
                        break;
                    }
                    break;
                }
                case 64: {
                    if (this.z(o, n3, n9)) {
                        x4.R(n3, Q(o, n10));
                        break;
                    }
                    break;
                }
                case 63: {
                    if (this.z(o, n3, n9)) {
                        x4.K(n3, Q(o, n10));
                        break;
                    }
                    break;
                }
                case 62: {
                    if (this.z(o, n3, n9)) {
                        x4.A(n3, Q(o, n10));
                        break;
                    }
                    break;
                }
                case 61: {
                    if (this.z(o, n3, n9)) {
                        x4.L(n3, (d0)s.getObject(o, n10));
                        break;
                    }
                    break;
                }
                case 60: {
                    if (this.z(o, n3, n9)) {
                        x4.M(n3, s.getObject(o, n10), this.C(n9));
                        break;
                    }
                    break;
                }
                case 59: {
                    if (this.z(o, n3, n9)) {
                        u(n3, s.getObject(o, n10), x4);
                        break;
                    }
                    break;
                }
                case 58: {
                    if (this.z(o, n3, n9)) {
                        x4.G(n3, S(o, n10));
                        break;
                    }
                    break;
                }
                case 57: {
                    if (this.z(o, n3, n9)) {
                        x4.u(n3, Q(o, n10));
                        break;
                    }
                    break;
                }
                case 56: {
                    if (this.z(o, n3, n9)) {
                        x4.h(n3, R(o, n10));
                        break;
                    }
                    break;
                }
                case 55: {
                    if (this.z(o, n3, n9)) {
                        x4.g(n3, Q(o, n10));
                        break;
                    }
                    break;
                }
                case 54: {
                    if (this.z(o, n3, n9)) {
                        x4.p(n3, R(o, n10));
                        break;
                    }
                    break;
                }
                case 53: {
                    if (this.z(o, n3, n9)) {
                        x4.J(n3, R(o, n10));
                        break;
                    }
                    break;
                }
                case 52: {
                    if (this.z(o, n3, n9)) {
                        x4.r(n3, P(o, n10));
                        break;
                    }
                    break;
                }
                case 51: {
                    if (this.z(o, n3, n9)) {
                        x4.q(n3, O(o, n10));
                        break;
                    }
                    break;
                }
                case 50: {
                    this.w(x4, n3, s.getObject(o, n10), n9);
                    break;
                }
                case 49: {
                    m3.l(this.a[n9], (List<?>)s.getObject(o, n10), x4, this.C(n9));
                    break;
                }
                case 48: {
                    m3.F(this.a[n9], (List<Long>)s.getObject(o, n10), x4, true);
                    break;
                }
                case 47: {
                    m3.Q(this.a[n9], (List<Integer>)s.getObject(o, n10), x4, true);
                    break;
                }
                case 46: {
                    m3.K(this.a[n9], (List<Long>)s.getObject(o, n10), x4, true);
                    break;
                }
                case 45: {
                    m3.S(this.a[n9], (List<Integer>)s.getObject(o, n10), x4, true);
                    break;
                }
                case 44: {
                    m3.T(this.a[n9], (List<Integer>)s.getObject(o, n10), x4, true);
                    break;
                }
                case 43: {
                    m3.O(this.a[n9], (List<Integer>)s.getObject(o, n10), x4, true);
                    break;
                }
                case 42: {
                    m3.U(this.a[n9], (List<Boolean>)s.getObject(o, n10), x4, true);
                    break;
                }
                case 41: {
                    m3.R(this.a[n9], (List<Integer>)s.getObject(o, n10), x4, true);
                    break;
                }
                case 40: {
                    m3.H(this.a[n9], (List<Long>)s.getObject(o, n10), x4, true);
                    break;
                }
                case 39: {
                    m3.M(this.a[n9], (List<Integer>)s.getObject(o, n10), x4, true);
                    break;
                }
                case 38: {
                    m3.x(this.a[n9], (List<Long>)s.getObject(o, n10), x4, true);
                    break;
                }
                case 37: {
                    m3.r(this.a[n9], (List<Long>)s.getObject(o, n10), x4, true);
                    break;
                }
                case 36: {
                    m3.m(this.a[n9], (List<Float>)s.getObject(o, n10), x4, true);
                    break;
                }
                case 35: {
                    m3.f(this.a[n9], (List<Double>)s.getObject(o, n10), x4, true);
                    break;
                }
                case 34: {
                    m3.F(this.a[n9], (List<Long>)s.getObject(o, n10), x4, false);
                    break;
                }
                case 33: {
                    m3.Q(this.a[n9], (List<Integer>)s.getObject(o, n10), x4, false);
                    break;
                }
                case 32: {
                    m3.K(this.a[n9], (List<Long>)s.getObject(o, n10), x4, false);
                    break;
                }
                case 31: {
                    m3.S(this.a[n9], (List<Integer>)s.getObject(o, n10), x4, false);
                    break;
                }
                case 30: {
                    m3.T(this.a[n9], (List<Integer>)s.getObject(o, n10), x4, false);
                    break;
                }
                case 29: {
                    m3.O(this.a[n9], (List<Integer>)s.getObject(o, n10), x4, false);
                    break;
                }
                case 28: {
                    m3.k(this.a[n9], (List<d0>)s.getObject(o, n10), x4);
                    break;
                }
                case 27: {
                    m3.e(this.a[n9], (List<?>)s.getObject(o, n10), x4, this.C(n9));
                    break;
                }
                case 26: {
                    m3.d(this.a[n9], (List<String>)s.getObject(o, n10), x4);
                    break;
                }
                case 25: {
                    m3.U(this.a[n9], (List<Boolean>)s.getObject(o, n10), x4, false);
                    break;
                }
                case 24: {
                    m3.R(this.a[n9], (List<Integer>)s.getObject(o, n10), x4, false);
                    break;
                }
                case 23: {
                    m3.H(this.a[n9], (List<Long>)s.getObject(o, n10), x4, false);
                    break;
                }
                case 22: {
                    m3.M(this.a[n9], (List<Integer>)s.getObject(o, n10), x4, false);
                    break;
                }
                case 21: {
                    m3.x(this.a[n9], (List<Long>)s.getObject(o, n10), x4, false);
                    break;
                }
                case 20: {
                    m3.r(this.a[n9], (List<Long>)s.getObject(o, n10), x4, false);
                    break;
                }
                case 19: {
                    m3.m(this.a[n9], (List<Float>)s.getObject(o, n10), x4, false);
                    break;
                }
                case 18: {
                    m3.f(this.a[n9], (List<Double>)s.getObject(o, n10), x4, false);
                    break;
                }
                case 17: {
                    if ((n8 & int1) != 0x0) {
                        x4.O(n3, s.getObject(o, n10), this.C(n9));
                        break;
                    }
                    break;
                }
                case 16: {
                    if ((n8 & int1) != 0x0) {
                        x4.c(n3, s.getLong(o, n10));
                        break;
                    }
                    break;
                }
                case 15: {
                    if ((n8 & int1) != 0x0) {
                        x4.C(n3, s.getInt(o, n10));
                        break;
                    }
                    break;
                }
                case 14: {
                    if ((n8 & int1) != 0x0) {
                        x4.E(n3, s.getLong(o, n10));
                        break;
                    }
                    break;
                }
                case 13: {
                    if ((n8 & int1) != 0x0) {
                        x4.R(n3, s.getInt(o, n10));
                        break;
                    }
                    break;
                }
                case 12: {
                    if ((n8 & int1) != 0x0) {
                        x4.K(n3, s.getInt(o, n10));
                        break;
                    }
                    break;
                }
                case 11: {
                    if ((n8 & int1) != 0x0) {
                        x4.A(n3, s.getInt(o, n10));
                        break;
                    }
                    break;
                }
                case 10: {
                    if ((n8 & int1) != 0x0) {
                        x4.L(n3, (d0)s.getObject(o, n10));
                        break;
                    }
                    break;
                }
                case 9: {
                    if ((n8 & int1) != 0x0) {
                        x4.M(n3, s.getObject(o, n10), this.C(n9));
                        break;
                    }
                    break;
                }
                case 8: {
                    if ((n8 & int1) != 0x0) {
                        u(n3, s.getObject(o, n10), x4);
                        break;
                    }
                    break;
                }
                case 7: {
                    if ((n8 & int1) != 0x0) {
                        x4.G(n3, j4.J(o, n10));
                        break;
                    }
                    break;
                }
                case 6: {
                    if ((n8 & int1) != 0x0) {
                        x4.u(n3, s.getInt(o, n10));
                        break;
                    }
                    break;
                }
                case 5: {
                    if ((n8 & int1) != 0x0) {
                        x4.h(n3, s.getLong(o, n10));
                        break;
                    }
                    break;
                }
                case 4: {
                    if ((n8 & int1) != 0x0) {
                        x4.g(n3, s.getInt(o, n10));
                        break;
                    }
                    break;
                }
                case 3: {
                    if ((n8 & int1) != 0x0) {
                        x4.p(n3, s.getLong(o, n10));
                        break;
                    }
                    break;
                }
                case 2: {
                    if ((n8 & int1) != 0x0) {
                        x4.J(n3, s.getLong(o, n10));
                        break;
                    }
                    break;
                }
                case 1: {
                    if ((n8 & int1) != 0x0) {
                        x4.r(n3, j4.K(o, n10));
                        break;
                    }
                    break;
                }
                case 0: {
                    if ((n8 & int1) != 0x0) {
                        x4.q(n3, j4.L(o, n10));
                        break;
                    }
                    break;
                }
            }
            n2 = n9 + 4;
        }
        while (entry2 != null) {
            this.q.c(x4, entry2);
            if (((Iterator)e).hasNext()) {
                entry2 = (Map.Entry<?, ?>)((Iterator<Map.Entry>)e).next();
            }
            else {
                entry2 = null;
            }
        }
        v(this.p, o, x4);
    }
    
    private final void L(final T t, final T t2, final int n) {
        final int f = this.F(n);
        final int n2 = this.a[n];
        final long n3 = f & 0xFFFFF;
        if (!this.z(t2, n2, n)) {
            return;
        }
        final Object m = j4.M(t, n3);
        final Object i = j4.M(t2, n3);
        if (m != null && i != null) {
            j4.i(t, n3, l1.d(m, i));
            this.J(t, n2, n);
            return;
        }
        if (i != null) {
            j4.i(t, n3, i);
            this.J(t, n2, n);
        }
    }
    
    private final boolean M(final T t, final T t2, final int n) {
        return this.y(t, n) == this.y(t2, n);
    }
    
    private static <E> List<E> N(final Object o, final long n) {
        return (List<E>)j4.M(o, n);
    }
    
    private static <T> double O(final T t, final long n) {
        return (double)j4.M(t, n);
    }
    
    private static <T> float P(final T t, final long n) {
        return (float)j4.M(t, n);
    }
    
    private static <T> int Q(final T t, final long n) {
        return (int)j4.M(t, n);
    }
    
    private static <T> long R(final T t, final long n) {
        return (long)j4.M(t, n);
    }
    
    private static <T> boolean S(final T t, final long n) {
        return (boolean)j4.M(t, n);
    }
    
    private static d4 T(final Object o) {
        final j1 j1 = (j1)o;
        d4 zzjp;
        if ((zzjp = j1.zzjp) == d4.h()) {
            zzjp = d4.i();
            j1.zzjp = zzjp;
        }
        return zzjp;
    }
    
    private static int a(final int n, final byte[] array, final int n2, final int n3, final Object o, final z z) throws IOException {
        return y.c(n, array, n2, n3, T(o), z);
    }
    
    private static int j(final k3<?> k3, final int n, final byte[] array, int n2, final int n3, final q1<?> q1, final z z) throws IOException {
        n2 = l(k3, array, n2, n3, z);
        while (true) {
            q1.add(z.c);
            if (n2 >= n3) {
                break;
            }
            final int e = y.e(array, n2, z);
            if (n != z.a) {
                break;
            }
            n2 = l(k3, array, e, n3, z);
        }
        return n2;
    }
    
    private static int k(final k3 k3, final byte[] array, int q, final int n, final int n2, final z z) throws IOException {
        final w2<Object> w2 = (w2<Object>)k3;
        final Object instance = w2.newInstance();
        q = w2.q(instance, array, q, n, n2, z);
        w2.b(instance);
        z.c = instance;
        return q;
    }
    
    private static int l(final k3 k3, final byte[] array, int d, int n, final z z) throws IOException {
        final int n2 = d + 1;
        final byte b = array[d];
        d = n2;
        int a = b;
        if (b < 0) {
            d = y.d(b, array, n2, z);
            a = z.a;
        }
        if (a >= 0 && a <= n - d) {
            final Object instance = k3.newInstance();
            n = a + d;
            k3.f(instance, array, d, n, z);
            k3.b(instance);
            z.c = instance;
            return n;
        }
        throw r1.a();
    }
    
    private static <UT, UB> int m(final c4<UT, UB> c4, final T t) {
        return c4.j(c4.k(t));
    }
    
    private final int n(final T o, final byte[] bytes, int offset, int n, int a, final int x, final int n2, final int n3, final int n4, final long n5, final int n6, final z z) throws IOException {
        final Unsafe s = w2.s;
        final long offset2 = this.a[n6 + 2] & 0xFFFFF;
        Label_0752: {
            Constable x4 = null;
            Label_0740: {
                Constable x3 = null;
                Label_0710: {
                    Object x2 = null;
                    Label_0683: {
                        long l = 0L;
                        Label_0677: {
                            Label_0648: {
                                switch (n4) {
                                    default: {
                                        return offset;
                                    }
                                    case 68: {
                                        if (n2 != 3) {
                                            return offset;
                                        }
                                        offset = k(this.C(n6), bytes, offset, n, (a & 0xFFFFFFF8) | 0x4, z);
                                        Object object;
                                        if (s.getInt(o, offset2) == x) {
                                            object = s.getObject(o, n5);
                                        }
                                        else {
                                            object = null;
                                        }
                                        final Object c = z.c;
                                        if (object == null) {
                                            x2 = c;
                                            break Label_0683;
                                        }
                                        x2 = l1.d(object, c);
                                        break Label_0683;
                                    }
                                    case 67: {
                                        if (n2 == 0) {
                                            offset = y.g(bytes, offset, z);
                                            l = m0.a(z.b);
                                            break Label_0677;
                                        }
                                        return offset;
                                    }
                                    case 66: {
                                        if (n2 == 0) {
                                            offset = y.e(bytes, offset, z);
                                            n = m0.e(z.a);
                                            break Label_0648;
                                        }
                                        return offset;
                                    }
                                    case 63: {
                                        if (n2 != 0) {
                                            return offset;
                                        }
                                        offset = y.e(bytes, offset, z);
                                        n = z.a;
                                        final n1<?> e = this.E(n6);
                                        if (e != null && e.s(n) == null) {
                                            T(o).e(a, (long)n);
                                            return offset;
                                        }
                                        s.putObject(o, n5, n);
                                        break Label_0752;
                                    }
                                    case 61: {
                                        if (n2 != 2) {
                                            return offset;
                                        }
                                        n = y.e(bytes, offset, z);
                                        offset = z.a;
                                        if (offset == 0) {
                                            x2 = d0.H;
                                            offset = n;
                                            break Label_0683;
                                        }
                                        s.putObject(o, n5, d0.n(bytes, n, offset));
                                        break;
                                    }
                                    case 60: {
                                        if (n2 != 2) {
                                            return offset;
                                        }
                                        offset = l(this.C(n6), bytes, offset, n, z);
                                        Object object2;
                                        if (s.getInt(o, offset2) == x) {
                                            object2 = s.getObject(o, n5);
                                        }
                                        else {
                                            object2 = null;
                                        }
                                        final Object c2 = z.c;
                                        if (object2 == null) {
                                            x2 = c2;
                                            break Label_0683;
                                        }
                                        x2 = l1.d(object2, c2);
                                        break Label_0683;
                                    }
                                    case 59: {
                                        if (n2 != 2) {
                                            return offset;
                                        }
                                        offset = y.e(bytes, offset, z);
                                        a = z.a;
                                        if (a == 0) {
                                            x2 = "";
                                            break Label_0683;
                                        }
                                        if ((n3 & 0x20000000) != 0x0 && !l4.i(bytes, offset, offset + a)) {
                                            throw r1.e();
                                        }
                                        s.putObject(o, n5, new String(bytes, offset, a, l1.a));
                                        n = offset;
                                        offset = a;
                                        break;
                                    }
                                    case 58: {
                                        if (n2 == 0) {
                                            offset = y.g(bytes, offset, z);
                                            x2 = (z.b != 0L);
                                            break Label_0683;
                                        }
                                        return offset;
                                    }
                                    case 57:
                                    case 64: {
                                        if (n2 == 5) {
                                            x3 = y.h(bytes, offset);
                                            break Label_0710;
                                        }
                                        return offset;
                                    }
                                    case 56:
                                    case 65: {
                                        if (n2 == 1) {
                                            x4 = y.k(bytes, offset);
                                            break Label_0740;
                                        }
                                        return offset;
                                    }
                                    case 55:
                                    case 62: {
                                        if (n2 == 0) {
                                            offset = y.e(bytes, offset, z);
                                            n = z.a;
                                            break Label_0648;
                                        }
                                        return offset;
                                    }
                                    case 53:
                                    case 54: {
                                        if (n2 == 0) {
                                            offset = y.g(bytes, offset, z);
                                            l = z.b;
                                            break Label_0677;
                                        }
                                        return offset;
                                    }
                                    case 52: {
                                        if (n2 == 5) {
                                            x3 = y.n(bytes, offset);
                                            break Label_0710;
                                        }
                                        return offset;
                                    }
                                    case 51: {
                                        if (n2 == 1) {
                                            x4 = y.l(bytes, offset);
                                            break Label_0740;
                                        }
                                        return offset;
                                    }
                                }
                                offset += n;
                                break Label_0752;
                            }
                            x2 = n;
                            break Label_0683;
                        }
                        x2 = l;
                    }
                    s.putObject(o, n5, x2);
                    break Label_0752;
                }
                s.putObject(o, n5, x3);
                offset += 4;
                break Label_0752;
            }
            s.putObject(o, n5, x4);
            offset += 8;
        }
        s.putInt(o, offset2, x);
        return offset;
    }
    
    private final int o(final T t, final byte[] array, int i, int n, final int n2, int n3, int n4, int n5, final long n6, int n7, final long n8, final z z) throws IOException {
        int n9 = i;
        final Unsafe s = w2.s;
        q1<Integer> j3;
        final q1 q1 = j3 = (q1<Integer>)s.getObject(t, n8);
        if (!q1.Q()) {
            final int size = q1.size();
            int n10;
            if (size == 0) {
                n10 = 10;
            }
            else {
                n10 = size << 1;
            }
            j3 = q1.J3(n10);
            s.putObject(t, n8, j3);
        }
        switch (n7) {
            default: {
                n7 = n9;
                return n7;
            }
            case 49: {
                n7 = n9;
                if (n4 != 3) {
                    return n7;
                }
                final k3 c = this.C(n5);
                n3 = ((n2 & 0xFFFFFFF8) | 0x4);
                i = k(c, array, i, n, n3, z);
                while (true) {
                    j3.add((Integer)z.c);
                    n7 = i;
                    if (i >= n) {
                        return n7;
                    }
                    n4 = y.e(array, i, z);
                    n7 = i;
                    if (n2 != z.a) {
                        return n7;
                    }
                    i = k(c, array, n4, n, n3, z);
                }
                break;
            }
            case 34:
            case 48: {
                if (n4 == 2) {
                    final g2 g2 = (g2)j3;
                    i = y.e(array, n9, z);
                    n = z.a + i;
                    while (i < n) {
                        i = y.g(array, i, z);
                        g2.m(m0.a(z.b));
                    }
                    if (i == n) {
                        return i;
                    }
                    throw r1.a();
                }
                else {
                    n7 = n9;
                    if (n4 != 0) {
                        return n7;
                    }
                    final g2 g3 = (g2)j3;
                    while (true) {
                        n3 = y.g(array, n9, z);
                        g3.m(m0.a(z.b));
                        i = n3;
                        if (n3 >= n) {
                            return i;
                        }
                        n9 = y.e(array, n3, z);
                        i = n3;
                        if (n2 == z.a) {
                            continue;
                        }
                        return i;
                    }
                }
                break;
            }
            case 33:
            case 47: {
                if (n4 == 2) {
                    final k1 k1 = (k1)j3;
                    i = y.e(array, n9, z);
                    n = z.a + i;
                    while (i < n) {
                        i = y.e(array, i, z);
                        k1.h(m0.e(z.a));
                    }
                    if (i == n) {
                        return i;
                    }
                    throw r1.a();
                }
                else {
                    n7 = n9;
                    if (n4 != 0) {
                        return n7;
                    }
                    final k1 k2 = (k1)j3;
                    while (true) {
                        n3 = y.e(array, n9, z);
                        k2.h(m0.e(z.a));
                        i = n3;
                        if (n3 >= n) {
                            return i;
                        }
                        n9 = y.e(array, n3, z);
                        i = n3;
                        if (n2 == z.a) {
                            continue;
                        }
                        return i;
                    }
                }
                break;
            }
            case 30:
            case 44: {
                if (n4 == 2) {
                    i = y.f(array, n9, j3, z);
                }
                else {
                    n7 = n9;
                    if (n4 != 0) {
                        return n7;
                    }
                    i = y.b(n2, array, i, n, j3, z);
                }
                final j1 j4 = (j1)t;
                d4 zzjp;
                if ((zzjp = j4.zzjp) == d4.h()) {
                    zzjp = null;
                }
                final d4 zzjp2 = m3.c(n3, j3, this.E(n5), zzjp, this.p);
                n = i;
                if (zzjp2 != null) {
                    j4.zzjp = zzjp2;
                    n = i;
                    break;
                }
                break;
            }
            case 28: {
                n7 = n9;
                if (n4 != 2) {
                    return n7;
                }
                n4 = y.e(array, n9, z);
                n5 = z.a;
                n3 = n4;
                i = n5;
                k1 k3 = (k1)j3;
            Label_0781_Outer:
                while (true) {
                    if (n5 != 0) {
                        break Label_0795;
                    }
                    n3 = n4;
                    while (true) {
                        j3.add((Integer)d0.H);
                        Label_0818: {
                            break Label_0818;
                            k3.add((Integer)d0.n(array, n3, i));
                            n3 += i;
                            j3 = k3;
                        }
                        i = n3;
                        if (n3 >= n) {
                            return i;
                        }
                        n4 = y.e(array, n3, z);
                        i = n3;
                        if (n2 != z.a) {
                            return i;
                        }
                        n4 = y.e(array, n4, z);
                        n5 = z.a;
                        n3 = n4;
                        i = n5;
                        k3 = (k1)j3;
                        if (n5 == 0) {
                            n3 = n4;
                            continue;
                        }
                        break;
                    }
                    continue Label_0781_Outer;
                }
            }
            case 27: {
                n7 = n9;
                if (n4 == 2) {
                    i = j(this.C(n5), n2, array, i, n, j3, z);
                    return i;
                }
                return n7;
            }
            case 26: {
                n7 = n9;
                if (n4 != 2) {
                    return n7;
                }
                i = y.e(array, n9, z);
                if ((n6 & 0x20000000L) == 0x0L) {
                    n3 = z.a;
                Label_0965_Outer:
                    while (true) {
                        if (n3 != 0) {
                            final String s2 = new String(array, i, n3, l1.a);
                            break Label_0994;
                        }
                        while (true) {
                            j3.add((Integer)"");
                            Label_1008: {
                                break Label_1008;
                                final String s2;
                                j3.add((Integer)s2);
                                i += n3;
                            }
                            n7 = i;
                            if (i >= n) {
                                return n7;
                            }
                            n3 = y.e(array, i, z);
                            n7 = i;
                            if (n2 != z.a) {
                                return n7;
                            }
                            i = y.e(array, n3, z);
                            n3 = z.a;
                            if (n3 == 0) {
                                continue;
                            }
                            break;
                        }
                        final String s2 = new String(array, i, n3, l1.a);
                        continue Label_0965_Outer;
                    }
                }
                else {
                    n4 = z.a;
                Label_1093_Outer:
                    while (true) {
                        if (n4 != 0) {
                            n3 = i + n4;
                            if (l4.i(array, i, n3)) {
                                final String s3 = new String(array, i, n4, l1.a);
                                i = n3;
                                break Label_1141;
                            }
                            throw r1.e();
                        }
                        while (true) {
                            j3.add((Integer)"");
                            Label_1150: {
                                break Label_1150;
                                final String s3;
                                j3.add((Integer)s3);
                            }
                            n7 = i;
                            if (i >= n) {
                                return n7;
                            }
                            n3 = y.e(array, i, z);
                            n7 = i;
                            if (n2 != z.a) {
                                return n7;
                            }
                            i = y.e(array, n3, z);
                            n4 = z.a;
                            if (n4 == 0) {
                                continue;
                            }
                            break;
                        }
                        n3 = i + n4;
                        if (l4.i(array, i, n3)) {
                            final String s3 = new String(array, i, n4, l1.a);
                            i = n3;
                            continue Label_1093_Outer;
                        }
                        break;
                    }
                    throw r1.e();
                }
                break;
            }
            case 25:
            case 42: {
                if (n4 == 2) {
                    final a0 a0 = (a0)j3;
                    i = y.e(array, n9, z);
                    n = z.a + i;
                    while (i < n) {
                        i = y.g(array, i, z);
                        a0.f(z.b != 0L);
                    }
                    if (i == n) {
                        n = i;
                        break;
                    }
                    throw r1.a();
                }
                else {
                    n7 = n9;
                    if (n4 != 0) {
                        return n7;
                    }
                    final a0 a2 = (a0)j3;
                    n3 = (i = y.g(array, n9, z));
                Label_1379_Outer:
                    while (true) {
                        if (z.b == 0L) {
                            break Label_1385;
                        }
                        i = n3;
                        while (true) {
                            boolean b = true;
                            Label_1388: {
                                break Label_1388;
                                b = false;
                            }
                            a2.f(b);
                            n7 = i;
                            if (i >= n) {
                                return n7;
                            }
                            n3 = y.e(array, i, z);
                            n7 = i;
                            if (n2 != z.a) {
                                return n7;
                            }
                            n3 = (i = y.g(array, n3, z));
                            if (z.b != 0L) {
                                i = n3;
                                continue;
                            }
                            break;
                        }
                        continue Label_1379_Outer;
                    }
                }
                break;
            }
            case 24:
            case 31:
            case 41:
            case 45: {
                if (n4 == 2) {
                    final k1 k4 = (k1)j3;
                    for (i = y.e(array, n9, z), n = z.a + i; i < n; i += 4) {
                        k4.h(y.h(array, i));
                    }
                    if (i == n) {
                        return i;
                    }
                    throw r1.a();
                }
                else {
                    n7 = n9;
                    if (n4 != 5) {
                        return n7;
                    }
                    final k1 k5 = (k1)j3;
                    k5.h(y.h(array, i));
                    while (true) {
                        n3 = (i = n9 + 4);
                        if (n3 >= n) {
                            return i;
                        }
                        n9 = y.e(array, n3, z);
                        i = n3;
                        if (n2 != z.a) {
                            return i;
                        }
                        k5.h(y.h(array, n9));
                    }
                }
                break;
            }
            case 23:
            case 32:
            case 40:
            case 46: {
                if (n4 == 2) {
                    final g2 g4 = (g2)j3;
                    for (i = y.e(array, n9, z), n = z.a + i; i < n; i += 8) {
                        g4.m(y.k(array, i));
                    }
                    if (i == n) {
                        return i;
                    }
                    throw r1.a();
                }
                else {
                    n7 = n9;
                    if (n4 != 1) {
                        return n7;
                    }
                    final g2 g5 = (g2)j3;
                    g5.m(y.k(array, i));
                    while (true) {
                        n3 = (i = n9 + 8);
                        if (n3 >= n) {
                            return i;
                        }
                        n9 = y.e(array, n3, z);
                        i = n3;
                        if (n2 != z.a) {
                            return i;
                        }
                        g5.m(y.k(array, n9));
                    }
                }
                break;
            }
            case 22:
            case 29:
            case 39:
            case 43: {
                if (n4 == 2) {
                    i = y.f(array, n9, j3, z);
                    return i;
                }
                n7 = n9;
                if (n4 == 0) {
                    i = y.b(n2, array, i, n, j3, z);
                    return i;
                }
                return n7;
            }
            case 20:
            case 21:
            case 37:
            case 38: {
                if (n4 == 2) {
                    final g2 g6 = (g2)j3;
                    i = y.e(array, n9, z);
                    n = z.a + i;
                    while (i < n) {
                        i = y.g(array, i, z);
                        g6.m(z.b);
                    }
                    if (i == n) {
                        return i;
                    }
                    throw r1.a();
                }
                else {
                    n7 = n9;
                    if (n4 != 0) {
                        return n7;
                    }
                    final g2 g7 = (g2)j3;
                    while (true) {
                        n3 = y.g(array, n9, z);
                        g7.m(z.b);
                        i = n3;
                        if (n3 >= n) {
                            return i;
                        }
                        n9 = y.e(array, n3, z);
                        i = n3;
                        if (n2 == z.a) {
                            continue;
                        }
                        return i;
                    }
                }
                break;
            }
            case 19:
            case 36: {
                if (n4 == 2) {
                    final h1 h1 = (h1)j3;
                    for (i = y.e(array, n9, z), n = z.a + i; i < n; i += 4) {
                        h1.f(y.n(array, i));
                    }
                    if (i == n) {
                        return i;
                    }
                    throw r1.a();
                }
                else {
                    n7 = n9;
                    if (n4 != 5) {
                        return n7;
                    }
                    final h1 h2 = (h1)j3;
                    h2.f(y.n(array, i));
                    while (true) {
                        n3 = (i = n9 + 4);
                        if (n3 >= n) {
                            return i;
                        }
                        n9 = y.e(array, n3, z);
                        i = n3;
                        if (n2 != z.a) {
                            return i;
                        }
                        h2.f(y.n(array, n9));
                    }
                }
                break;
            }
            case 18:
            case 35: {
                if (n4 == 2) {
                    final s0 s4 = (s0)j3;
                    for (i = y.e(array, n9, z), n = z.a + i; i < n; i += 8) {
                        s4.f(y.l(array, i));
                    }
                    if (i == n) {
                        return i;
                    }
                    throw r1.a();
                }
                else {
                    n7 = n9;
                    if (n4 != 1) {
                        return n7;
                    }
                    final s0 s5 = (s0)j3;
                    s5.f(y.l(array, i));
                    while (true) {
                        n3 = (i = n9 + 8);
                        if (n3 >= n) {
                            return i;
                        }
                        n9 = y.e(array, n3, z);
                        i = n3;
                        if (n2 != z.a) {
                            return i;
                        }
                        s5.f(y.l(array, n9));
                    }
                }
                break;
            }
        }
        i = n;
        return i;
        i = n7;
        return i;
    }
    
    private final <K, V> int p(final T t, final byte[] array, int i, final int n, int n2, int n3, final long n4, final z z) throws IOException {
        final Unsafe s = w2.s;
        final Object d = this.D(n2);
        Object x;
        final Object o = x = s.getObject(t, n4);
        if (this.r.h(o)) {
            x = this.r.f(d);
            this.r.d(x, o);
            s.putObject(t, n4, x);
        }
        final l2<?, ?> e = this.r.e(d);
        final Map<?, ?> j = this.r.j(x);
        i = y.e(array, i, z);
        n2 = z.a;
        if (n2 < 0 || n2 > n - i) {
            throw r1.a();
        }
        final int n5 = n2 + i;
        Object o2 = e.b;
        Object o3 = e.d;
        while (i < n5) {
            n3 = i + 1;
            final int n6 = array[i];
            n2 = n3;
            if ((i = n6) < 0) {
                n2 = y.d(n6, array, n3, z);
                i = z.a;
            }
            final int n7 = i >>> 3;
            n3 = (i & 0x7);
            if (n7 != 1) {
                if (n7 == 2) {
                    if (n3 == e.c.d()) {
                        i = r(array, n2, n, e.c, e.d.getClass(), z);
                        o3 = z.c;
                        continue;
                    }
                }
            }
            else if (n3 == e.a.d()) {
                i = r(array, n2, n, e.a, null, z);
                o2 = z.c;
                continue;
            }
            i = y.a(i, array, n2, n, z);
        }
        if (i == n5) {
            j.put(o2, o3);
            return n5;
        }
        throw r1.d();
    }
    
    private final int q(final T t, final byte[] array, int i, final int n, int n2, final z z) throws IOException {
        w2 w2 = this;
        T o = t;
        int n3 = n;
        int n4 = n2;
        z z2 = z;
        final Unsafe s = com.google.android.gms.internal.clearcut.w2.s;
        int n5 = 0;
        int x = 0;
        int n6 = -1;
        while (true) {
            while (i < n3) {
                int d = i + 1;
                i = array[i];
                if (i < 0) {
                    d = y.d(i, array, d, z2);
                    i = z2.a;
                }
                final int n7 = i >>> 3;
                final int n8 = i & 0x7;
                final int h = w2.H(n7);
                Label_1553: {
                    int int1 = 0;
                    int n25 = 0;
                    int n26 = 0;
                    Label_1490: {
                        Label_1482: {
                            Label_1478: {
                                if (h != -1) {
                                    final int[] a = w2.a;
                                    final int n9 = a[h + 1];
                                    final int n10 = (n9 & 0xFF00000) >>> 20;
                                    final long n11 = n9 & 0xFFFFF;
                                    if (n10 <= 17) {
                                        final int n12 = a[h + 2];
                                        final int n13 = 1 << (n12 >>> 20);
                                        final int n14 = n12 & 0xFFFFF;
                                        int1 = x;
                                        int n15;
                                        if (n14 != (n15 = n6)) {
                                            if (n6 != -1) {
                                                s.putInt(o, n6, x);
                                            }
                                            int1 = s.getInt(o, n14);
                                            n15 = n14;
                                        }
                                        Label_1138: {
                                            int n17 = 0;
                                            int n18 = 0;
                                            int n19 = 0;
                                            Label_1115: {
                                                int n21 = 0;
                                                Label_1111: {
                                                    int n20 = 0;
                                                    int n23 = 0;
                                                    Label_1097: {
                                                        Label_1082: {
                                                            Label_0884: {
                                                                Object x3 = null;
                                                                Label_0793: {
                                                                    int n16 = 0;
                                                                    Label_0642: {
                                                                        Label_0635: {
                                                                            Label_0594: {
                                                                                switch (n10) {
                                                                                    case 17: {
                                                                                        if (n8 == 3) {
                                                                                            n16 = k(w2.C(h), array, d, n, n7 << 3 | 0x4, z);
                                                                                            Object x2;
                                                                                            if ((int1 & n13) == 0x0) {
                                                                                                x2 = z.c;
                                                                                            }
                                                                                            else {
                                                                                                x2 = l1.d(s.getObject(o, n11), z.c);
                                                                                            }
                                                                                            s.putObject(o, n11, x2);
                                                                                            int1 |= n13;
                                                                                            break Label_0594;
                                                                                        }
                                                                                        break;
                                                                                    }
                                                                                    case 16: {
                                                                                        if (n8 == 0) {
                                                                                            final int g = y.g(array, d, z);
                                                                                            s.putLong(t, n11, m0.a(z.b));
                                                                                            n17 = (int1 | n13);
                                                                                            n18 = i;
                                                                                            z2 = z;
                                                                                            i = g;
                                                                                            n3 = n;
                                                                                            n19 = n15;
                                                                                            break Label_1115;
                                                                                        }
                                                                                        break;
                                                                                    }
                                                                                    case 15: {
                                                                                        if (n8 == 0) {
                                                                                            n16 = y.e(array, d, z);
                                                                                            s.putInt(o, n11, m0.e(z.a));
                                                                                            break Label_0635;
                                                                                        }
                                                                                        break;
                                                                                    }
                                                                                    case 12: {
                                                                                        if (n8 != 0) {
                                                                                            break;
                                                                                        }
                                                                                        n16 = y.e(array, d, z);
                                                                                        final int a2 = z.a;
                                                                                        final n1<?> e = w2.E(h);
                                                                                        if (e != null && e.s(a2) == null) {
                                                                                            T(t).e(i, (long)a2);
                                                                                            break Label_0594;
                                                                                        }
                                                                                        s.putInt(o, n11, a2);
                                                                                        int1 |= n13;
                                                                                        break Label_0594;
                                                                                    }
                                                                                    case 10: {
                                                                                        if (n8 == 2) {
                                                                                            n16 = y.m(array, d, z);
                                                                                            s.putObject(o, n11, z.c);
                                                                                            break Label_0635;
                                                                                        }
                                                                                        break;
                                                                                    }
                                                                                    case 9: {
                                                                                        if (n8 != 2) {
                                                                                            break;
                                                                                        }
                                                                                        n20 = l(w2.C(h), array, d, n, z);
                                                                                        if ((int1 & n13) == 0x0) {
                                                                                            x3 = z.c;
                                                                                            break Label_0793;
                                                                                        }
                                                                                        x3 = l1.d(s.getObject(o, n11), z.c);
                                                                                        break Label_0793;
                                                                                    }
                                                                                    case 8: {
                                                                                        if (n8 == 2) {
                                                                                            if ((n9 & 0x20000000) == 0x0) {
                                                                                                n20 = y.i(array, d, z);
                                                                                            }
                                                                                            else {
                                                                                                n20 = y.j(array, d, z);
                                                                                            }
                                                                                            x3 = z.c;
                                                                                            break Label_0793;
                                                                                        }
                                                                                        break;
                                                                                    }
                                                                                    case 7: {
                                                                                        if (n8 == 0) {
                                                                                            n20 = y.g(array, d, z);
                                                                                            j4.j(o, n11, z.b != 0L);
                                                                                            break Label_0884;
                                                                                        }
                                                                                        break;
                                                                                    }
                                                                                    case 6:
                                                                                    case 13: {
                                                                                        if (n8 == 5) {
                                                                                            s.putInt(o, n11, y.h(array, d));
                                                                                            n20 = d + 4;
                                                                                            break Label_0884;
                                                                                        }
                                                                                        break;
                                                                                    }
                                                                                    case 5:
                                                                                    case 14: {
                                                                                        if (n8 == 1) {
                                                                                            s.putLong(t, n11, y.k(array, d));
                                                                                            n20 = d + 8;
                                                                                            break Label_1082;
                                                                                        }
                                                                                        break;
                                                                                    }
                                                                                    case 4:
                                                                                    case 11: {
                                                                                        if (n8 == 0) {
                                                                                            n20 = y.e(array, d, z);
                                                                                            s.putInt(o, n11, z.a);
                                                                                            break Label_1082;
                                                                                        }
                                                                                        break;
                                                                                    }
                                                                                    case 2:
                                                                                    case 3: {
                                                                                        if (n8 == 0) {
                                                                                            final int g2 = y.g(array, d, z);
                                                                                            s.putLong(t, n11, z.b);
                                                                                            n17 = (int1 | n13);
                                                                                            n19 = n15;
                                                                                            n3 = n;
                                                                                            n21 = i;
                                                                                            z2 = z;
                                                                                            i = g2;
                                                                                            break Label_1111;
                                                                                        }
                                                                                        break;
                                                                                    }
                                                                                    case 1: {
                                                                                        n20 = d;
                                                                                        if (n8 == 5) {
                                                                                            j4.f(o, n11, y.n(array, n20));
                                                                                            n20 += 4;
                                                                                            break Label_1082;
                                                                                        }
                                                                                        break;
                                                                                    }
                                                                                    case 0: {
                                                                                        n20 = d;
                                                                                        if (n8 == 1) {
                                                                                            j4.e(o, n11, y.l(array, n20));
                                                                                            n20 += 8;
                                                                                            break Label_1082;
                                                                                        }
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                while (true) {
                                                                                    break Label_1138;
                                                                                    continue;
                                                                                }
                                                                            }
                                                                            n17 = int1;
                                                                            break Label_0642;
                                                                        }
                                                                        n17 = (int1 | n13);
                                                                    }
                                                                    n3 = n;
                                                                    final int n22 = i;
                                                                    z2 = z;
                                                                    i = n16;
                                                                    n18 = n22;
                                                                    n19 = n15;
                                                                    break Label_1115;
                                                                }
                                                                s.putObject(o, n11, x3);
                                                            }
                                                            n17 = (int1 | n13);
                                                            n19 = n15;
                                                            n23 = n;
                                                            break Label_1097;
                                                            break Label_1138;
                                                        }
                                                        n17 = (int1 | n13);
                                                        n19 = n15;
                                                        n23 = n;
                                                    }
                                                    z2 = z;
                                                    n3 = n23;
                                                    n21 = i;
                                                    i = n20;
                                                }
                                                n18 = n21;
                                            }
                                            final int n24 = n2;
                                            n5 = n18;
                                            x = n17;
                                            n6 = n19;
                                            n4 = n24;
                                            continue;
                                        }
                                        n25 = n15;
                                        n26 = d;
                                        break Label_1490;
                                    }
                                    final int n27 = n6;
                                    if (n10 != 27) {
                                        Label_1475: {
                                            int n28;
                                            if (n10 <= 49) {
                                                final int o2 = this.o(t, array, d, n, i, n7, n8, h, n9, n10, n11, z);
                                                if ((n28 = o2) == d) {
                                                    n26 = o2;
                                                    break Label_1475;
                                                }
                                            }
                                            else {
                                                final int n29 = d;
                                                if (n10 == 50) {
                                                    if (n8 != 2) {
                                                        break Label_1478;
                                                    }
                                                    final int p6 = this.p(t, array, n29, n, h, n7, n11, z);
                                                    if ((n28 = p6) == n29) {
                                                        n26 = p6;
                                                        break Label_1475;
                                                    }
                                                }
                                                else {
                                                    final int n30 = this.n(t, array, n29, n, i, n7, n8, n9, n10, n11, h, z);
                                                    if ((n28 = n30) == n29) {
                                                        n26 = n30;
                                                        break Label_1475;
                                                    }
                                                }
                                            }
                                            w2 = this;
                                            o = t;
                                            final int n31 = i;
                                            n4 = n2;
                                            z2 = z;
                                            i = n28;
                                            n5 = n31;
                                            n6 = n27;
                                            n3 = n;
                                            continue;
                                        }
                                        break Label_1482;
                                    }
                                    if (n8 == 2) {
                                        q1<?> j3;
                                        final q1 q1 = j3 = (q1<?>)s.getObject(o, n11);
                                        if (!q1.Q()) {
                                            final int size = q1.size();
                                            int n32;
                                            if (size == 0) {
                                                n32 = 10;
                                            }
                                            else {
                                                n32 = size << 1;
                                            }
                                            j3 = q1.J3(n32);
                                            s.putObject(o, n11, j3);
                                        }
                                        final k3 c = w2.C(h);
                                        n5 = i;
                                        i = j(c, n5, array, d, n, j3, z);
                                        n4 = n2;
                                        n6 = n27;
                                        break Label_1553;
                                    }
                                }
                            }
                            n26 = d;
                        }
                        int1 = x;
                        n25 = n6;
                    }
                    final int n33 = n2;
                    if (i == n33 && n33 != 0) {
                        n2 = n26;
                        if (n25 != -1) {
                            s.putInt(t, n25, int1);
                        }
                        final int[] l = this.l;
                        if (l != null) {
                            final int length = l.length;
                            Object t2 = null;
                            for (final int n34 : l) {
                                final c4<?, ?> p7 = this.p;
                                final int n35 = this.a[n34];
                                final Object m = j4.M(t, this.F(n34) & 0xFFFFF);
                                if (m != null) {
                                    final n1<?> e2 = this.E(n34);
                                    if (e2 != null) {
                                        t2 = this.t(n34, n35, this.r.j(m), e2, t2, p7);
                                    }
                                }
                                t2 = t2;
                            }
                            if (t2 != null) {
                                this.p.h(t, t2);
                            }
                        }
                        if (n33 == 0) {
                            if (n2 != n) {
                                throw r1.d();
                            }
                        }
                        else if (n2 > n || i != n33) {
                            throw r1.d();
                        }
                        return n2;
                    }
                    final int a3 = a(i, array, n26, n, t, z);
                    w2 = this;
                    o = t;
                    n4 = n33;
                    n6 = n25;
                    x = int1;
                    n5 = i;
                    i = a3;
                }
                n3 = n;
                z2 = z;
            }
            n2 = i;
            i = n5;
            final int n36 = n6;
            final int n33 = n4;
            int int1 = x;
            int n25 = n36;
            continue;
        }
    }
    
    private static int r(final byte[] array, int n, int i, final r4 r4, final Class<?> clazz, final z z) throws IOException {
        Constable c2 = null;
        Label_0281: {
            Constable c = null;
            Label_0260: {
                Serializable c3 = null;
                Label_0218: {
                    Label_0213: {
                        long l = 0L;
                        switch (x2.a[r4.ordinal()]) {
                            default: {
                                throw new RuntimeException("unsupported field type.");
                            }
                            case 17: {
                                n = y.j(array, n, z);
                                return n;
                            }
                            case 16: {
                                n = y.g(array, n, z);
                                l = m0.a(z.b);
                                break;
                            }
                            case 15: {
                                n = y.e(array, n, z);
                                i = m0.e(z.a);
                                break Label_0213;
                            }
                            case 14: {
                                n = l(f3.a().b(clazz), array, n, i, z);
                                return n;
                            }
                            case 12:
                            case 13: {
                                n = y.g(array, n, z);
                                l = z.b;
                                break;
                            }
                            case 9:
                            case 10:
                            case 11: {
                                n = y.e(array, n, z);
                                i = z.a;
                                break Label_0213;
                            }
                            case 8: {
                                c = y.n(array, n);
                                break Label_0260;
                            }
                            case 6:
                            case 7: {
                                c2 = y.k(array, n);
                                break Label_0281;
                            }
                            case 4:
                            case 5: {
                                c = y.h(array, n);
                                break Label_0260;
                            }
                            case 3: {
                                c2 = y.l(array, n);
                                break Label_0281;
                            }
                            case 2: {
                                n = y.m(array, n, z);
                                return n;
                            }
                            case 1: {
                                n = y.g(array, n, z);
                                c3 = (z.b != 0L);
                                break Label_0218;
                            }
                        }
                        c3 = l;
                        break Label_0218;
                    }
                    c3 = i;
                }
                z.c = c3;
                return n;
            }
            z.c = c;
            n += 4;
            return n;
        }
        z.c = c2;
        n += 8;
        return n;
    }
    
    static <T> w2<T> s(final Class<T> clazz, final q2 q2, final a3 a3, final b2 b2, final c4<?, ?> c4, final w0<?> w0, final n2 n2) {
        if (q2 instanceof h3) {
            final h3 h3 = (h3)q2;
            final boolean b3 = h3.a() == j1.g.j;
            int k;
            int f;
            int g;
            if (h3.d() == 0) {
                k = 0;
                f = 0;
                g = 0;
            }
            else {
                f = h3.f();
                g = h3.g();
                k = h3.k();
            }
            final int[] array = new int[k << 2];
            final Object[] array2 = new Object[k << 1];
            int[] array3;
            if (h3.h() > 0) {
                array3 = new int[h3.h()];
            }
            else {
                array3 = null;
            }
            int[] array4;
            if (h3.i() > 0) {
                array4 = new int[h3.i()];
            }
            else {
                array4 = null;
            }
            final i3 e = h3.e();
            if (e.a()) {
                int g2 = e.g();
                int n3 = 0;
                int n4 = 0;
                int n5 = 0;
                while (true) {
                    int g3;
                    int n7;
                    int n8;
                    if (g2 < h3.l() && n3 < g2 - f << 2) {
                        int n6 = 0;
                        while (true) {
                            g3 = g2;
                            n7 = n4;
                            n8 = n5;
                            if (n6 >= 4) {
                                break;
                            }
                            array[n3 + n6] = -1;
                            ++n6;
                        }
                    }
                    else {
                        int n9;
                        int n10;
                        int q3;
                        if (e.k()) {
                            n9 = (int)j4.b(e.l());
                            n10 = (int)j4.b(e.m());
                            q3 = 0;
                        }
                        else {
                            n9 = (int)j4.b(e.n());
                            if (e.o()) {
                                n10 = (int)j4.b(e.p());
                                q3 = e.q();
                            }
                            else {
                                q3 = 0;
                                n10 = 0;
                            }
                        }
                        array[n3] = e.g();
                        final int n11 = n3 + 1;
                        int n12;
                        if (e.s()) {
                            n12 = 536870912;
                        }
                        else {
                            n12 = 0;
                        }
                        int n13;
                        if (e.r()) {
                            n13 = 268435456;
                        }
                        else {
                            n13 = 0;
                        }
                        array[n11] = (n12 | n13 | e.h() << 20 | n9);
                        array[n3 + 2] = (q3 << 20 | n10);
                        if (e.v() != null) {
                            final int n14 = n3 / 4 << 1;
                            array2[n14] = e.v();
                            if (e.t() != null) {
                                array2[n14 + 1] = e.t();
                            }
                            else if (e.u() != null) {
                                array2[n14 + 1] = e.u();
                            }
                        }
                        else if (e.t() != null) {
                            array2[(n3 / 4 << 1) + 1] = e.t();
                        }
                        else if (e.u() != null) {
                            array2[(n3 / 4 << 1) + 1] = e.u();
                        }
                        final int h4 = e.h();
                        int n15;
                        if (h4 == e1.J0.ordinal()) {
                            array3[n4] = n3;
                            n15 = n4 + 1;
                            n8 = n5;
                        }
                        else {
                            n15 = n4;
                            n8 = n5;
                            if (h4 >= 18) {
                                n15 = n4;
                                n8 = n5;
                                if (h4 <= 49) {
                                    array4[n5] = (array[n11] & 0xFFFFF);
                                    n8 = n5 + 1;
                                    n15 = n4;
                                }
                            }
                        }
                        if (!e.a()) {
                            break;
                        }
                        g3 = e.g();
                        n7 = n15;
                    }
                    n3 += 4;
                    g2 = g3;
                    n4 = n7;
                    n5 = n8;
                }
            }
            return new w2<T>(array, array2, f, g, h3.l(), h3.c(), b3, false, h3.j(), array3, array4, a3, b2, c4, w0, n2);
        }
        ((x3)q2).a();
        throw new NoSuchMethodError();
    }
    
    private final <K, V, UT, UB> UB t(final int n, final int n2, final Map<K, V> map, final n1<?> n3, UB ub, final c4<UT, UB> c4) {
        final l2<?, ?> e = this.r.e(this.D(n));
        final Iterator<Map.Entry<K, V>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            final Map.Entry<K, V> entry = iterator.next();
            if (n3.s((int)entry.getValue()) == null) {
                UB f;
                if ((f = ub) == null) {
                    f = c4.f();
                }
                final i0 q = d0.q(k2.a(e, entry.getKey(), entry.getValue()));
                final p0 b = q.b();
                try {
                    k2.b(b, e, entry.getKey(), entry.getValue());
                    c4.b(f, n2, q.a());
                    iterator.remove();
                    ub = f;
                    continue;
                }
                catch (IOException cause) {
                    throw new RuntimeException(cause);
                }
                break;
            }
        }
        return ub;
    }
    
    private static void u(final int n, final Object o, final x4 x4) throws IOException {
        if (o instanceof String) {
            x4.m(n, (String)o);
            return;
        }
        x4.L(n, (d0)o);
    }
    
    private static <UT, UB> void v(final c4<UT, UB> c4, final T t, final x4 x4) throws IOException {
        c4.c(c4.k(t), x4);
    }
    
    private final <K, V> void w(final x4 x4, final int n, final Object o, final int n2) throws IOException {
        if (o != null) {
            x4.Q(n, this.r.e(this.D(n2)), this.r.i(o));
        }
    }
    
    private final void x(final T t, final T t2, final int n) {
        final long n2 = this.F(n) & 0xFFFFF;
        if (!this.y(t2, n)) {
            return;
        }
        final Object m = j4.M(t, n2);
        final Object i = j4.M(t2, n2);
        if (m != null && i != null) {
            j4.i(t, n2, l1.d(m, i));
            this.I(t, n);
            return;
        }
        if (i != null) {
            j4.i(t, n2, i);
            this.I(t, n);
        }
    }
    
    private final boolean y(final T t, int n) {
        if (!this.i) {
            n = this.G(n);
            return (j4.H(t, n & 0xFFFFF) & 1 << (n >>> 20)) != 0x0;
        }
        n = this.F(n);
        final long n2 = n & 0xFFFFF;
        switch ((n & 0xFF00000) >>> 20) {
            default: {
                throw new IllegalArgumentException();
            }
            case 17: {
                return j4.M(t, n2) != null;
            }
            case 16: {
                return j4.I(t, n2) != 0L;
            }
            case 15: {
                return j4.H(t, n2) != 0;
            }
            case 14: {
                return j4.I(t, n2) != 0L;
            }
            case 13: {
                return j4.H(t, n2) != 0;
            }
            case 12: {
                return j4.H(t, n2) != 0;
            }
            case 11: {
                return j4.H(t, n2) != 0;
            }
            case 10: {
                return !d0.H.equals(j4.M(t, n2));
            }
            case 9: {
                return j4.M(t, n2) != null;
            }
            case 8: {
                final Object m = j4.M(t, n2);
                if (m instanceof String) {
                    return !((String)m).isEmpty();
                }
                if (m instanceof d0) {
                    return !d0.H.equals(m);
                }
                throw new IllegalArgumentException();
            }
            case 7: {
                return j4.J(t, n2);
            }
            case 6: {
                return j4.H(t, n2) != 0;
            }
            case 5: {
                return j4.I(t, n2) != 0L;
            }
            case 4: {
                return j4.H(t, n2) != 0;
            }
            case 3: {
                return j4.I(t, n2) != 0L;
            }
            case 2: {
                return j4.I(t, n2) != 0L;
            }
            case 1: {
                return j4.K(t, n2) != 0.0f;
            }
            case 0: {
                return j4.L(t, n2) != 0.0;
            }
        }
    }
    
    private final boolean z(final T t, final int n, final int n2) {
        return j4.H(t, this.G(n2) & 0xFFFFF) == n;
    }
    
    @Override
    public final void b(final T t) {
        final int[] l = this.l;
        final int n = 0;
        if (l != null) {
            for (int length = l.length, i = 0; i < length; ++i) {
                final long n2 = this.F(l[i]) & 0xFFFFF;
                final Object m = j4.M(t, n2);
                if (m != null) {
                    j4.i(t, n2, this.r.b(m));
                }
            }
        }
        final int[] j = this.m;
        if (j != null) {
            for (int length2 = j.length, k = n; k < length2; ++k) {
                this.o.a(t, j[k]);
            }
        }
        this.p.d(t);
        if (this.g) {
            this.q.f(t);
        }
    }
    
    @Override
    public final void c(final T t, final x4 x4) throws IOException {
        if (x4.P() == j1.g.m) {
            v(this.p, t, x4);
            Object a = null;
            Map.Entry<?, ?> entry = null;
            Label_0070: {
                if (this.g) {
                    final a1<?> b = this.q.b(t);
                    if (!b.b()) {
                        a = b.a();
                        entry = ((Iterator<Map.Entry<?, ?>>)a).next();
                        break Label_0070;
                    }
                }
                a = (entry = null);
            }
            int n = this.a.length - 4;
            Object o = entry;
            Object o2;
            while (true) {
                o2 = o;
                if (n < 0) {
                    break;
                }
                final int f = this.F(n);
                final int n2 = this.a[n];
                while (o != null && this.q.a((Map.Entry<?, ?>)o) > n2) {
                    this.q.c(x4, (Map.Entry<?, ?>)o);
                    if (((Iterator)a).hasNext()) {
                        o = ((Iterator<Map.Entry<?, ?>>)a).next();
                    }
                    else {
                        o = null;
                    }
                }
                Label_2455: {
                    double n15 = 0.0;
                    Label_2445: {
                        float n14 = 0.0f;
                        Label_2410: {
                            long n13 = 0L;
                            Label_2375: {
                                long n12 = 0L;
                                Label_2340: {
                                    int n11 = 0;
                                    Label_2305: {
                                        long n10 = 0L;
                                        Label_2270: {
                                            int n9 = 0;
                                            Label_2235: {
                                                boolean b2 = false;
                                                Label_2200: {
                                                    Label_2159: {
                                                        Label_2122: {
                                                            Label_2088: {
                                                                int n8 = 0;
                                                                Label_2065: {
                                                                    int n7 = 0;
                                                                    Label_2030: {
                                                                        int n6 = 0;
                                                                        Label_1995: {
                                                                            long n5 = 0L;
                                                                            Label_1960: {
                                                                                int n4 = 0;
                                                                                Label_1925: {
                                                                                    long n3 = 0L;
                                                                                    Label_1890: {
                                                                                        switch ((f & 0xFF00000) >>> 20) {
                                                                                            default: {
                                                                                                break Label_2455;
                                                                                            }
                                                                                            case 68: {
                                                                                                if (this.z(t, n2, n)) {
                                                                                                    break;
                                                                                                }
                                                                                                break Label_2455;
                                                                                            }
                                                                                            case 67: {
                                                                                                if (this.z(t, n2, n)) {
                                                                                                    n3 = R(t, f & 0xFFFFF);
                                                                                                    break Label_1890;
                                                                                                }
                                                                                                break Label_2455;
                                                                                            }
                                                                                            case 66: {
                                                                                                if (this.z(t, n2, n)) {
                                                                                                    n4 = Q(t, f & 0xFFFFF);
                                                                                                    break Label_1925;
                                                                                                }
                                                                                                break Label_2455;
                                                                                            }
                                                                                            case 65: {
                                                                                                if (this.z(t, n2, n)) {
                                                                                                    n5 = R(t, f & 0xFFFFF);
                                                                                                    break Label_1960;
                                                                                                }
                                                                                                break Label_2455;
                                                                                            }
                                                                                            case 64: {
                                                                                                if (this.z(t, n2, n)) {
                                                                                                    n6 = Q(t, f & 0xFFFFF);
                                                                                                    break Label_1995;
                                                                                                }
                                                                                                break Label_2455;
                                                                                            }
                                                                                            case 63: {
                                                                                                if (this.z(t, n2, n)) {
                                                                                                    n7 = Q(t, f & 0xFFFFF);
                                                                                                    break Label_2030;
                                                                                                }
                                                                                                break Label_2455;
                                                                                            }
                                                                                            case 62: {
                                                                                                if (this.z(t, n2, n)) {
                                                                                                    n8 = Q(t, f & 0xFFFFF);
                                                                                                    break Label_2065;
                                                                                                }
                                                                                                break Label_2455;
                                                                                            }
                                                                                            case 61: {
                                                                                                if (this.z(t, n2, n)) {
                                                                                                    break Label_2088;
                                                                                                }
                                                                                                break Label_2455;
                                                                                            }
                                                                                            case 60: {
                                                                                                if (this.z(t, n2, n)) {
                                                                                                    break Label_2122;
                                                                                                }
                                                                                                break Label_2455;
                                                                                            }
                                                                                            case 59: {
                                                                                                if (this.z(t, n2, n)) {
                                                                                                    break Label_2159;
                                                                                                }
                                                                                                break Label_2455;
                                                                                            }
                                                                                            case 58: {
                                                                                                if (this.z(t, n2, n)) {
                                                                                                    b2 = S(t, f & 0xFFFFF);
                                                                                                    break Label_2200;
                                                                                                }
                                                                                                break Label_2455;
                                                                                            }
                                                                                            case 57: {
                                                                                                if (this.z(t, n2, n)) {
                                                                                                    n9 = Q(t, f & 0xFFFFF);
                                                                                                    break Label_2235;
                                                                                                }
                                                                                                break Label_2455;
                                                                                            }
                                                                                            case 56: {
                                                                                                if (this.z(t, n2, n)) {
                                                                                                    n10 = R(t, f & 0xFFFFF);
                                                                                                    break Label_2270;
                                                                                                }
                                                                                                break Label_2455;
                                                                                            }
                                                                                            case 55: {
                                                                                                if (this.z(t, n2, n)) {
                                                                                                    n11 = Q(t, f & 0xFFFFF);
                                                                                                    break Label_2305;
                                                                                                }
                                                                                                break Label_2455;
                                                                                            }
                                                                                            case 54: {
                                                                                                if (this.z(t, n2, n)) {
                                                                                                    n12 = R(t, f & 0xFFFFF);
                                                                                                    break Label_2340;
                                                                                                }
                                                                                                break Label_2455;
                                                                                            }
                                                                                            case 53: {
                                                                                                if (this.z(t, n2, n)) {
                                                                                                    n13 = R(t, f & 0xFFFFF);
                                                                                                    break Label_2375;
                                                                                                }
                                                                                                break Label_2455;
                                                                                            }
                                                                                            case 52: {
                                                                                                if (this.z(t, n2, n)) {
                                                                                                    n14 = P(t, f & 0xFFFFF);
                                                                                                    break Label_2410;
                                                                                                }
                                                                                                break Label_2455;
                                                                                            }
                                                                                            case 51: {
                                                                                                if (this.z(t, n2, n)) {
                                                                                                    n15 = O(t, f & 0xFFFFF);
                                                                                                    break Label_2445;
                                                                                                }
                                                                                                break Label_2455;
                                                                                            }
                                                                                            case 50: {
                                                                                                this.w(x4, n2, j4.M(t, f & 0xFFFFF), n);
                                                                                                break Label_2455;
                                                                                            }
                                                                                            case 49: {
                                                                                                m3.l(this.a[n], (List<?>)j4.M(t, f & 0xFFFFF), x4, this.C(n));
                                                                                                break Label_2455;
                                                                                            }
                                                                                            case 48: {
                                                                                                m3.F(this.a[n], (List<Long>)j4.M(t, f & 0xFFFFF), x4, true);
                                                                                                break Label_2455;
                                                                                            }
                                                                                            case 47: {
                                                                                                m3.Q(this.a[n], (List<Integer>)j4.M(t, f & 0xFFFFF), x4, true);
                                                                                                break Label_2455;
                                                                                            }
                                                                                            case 46: {
                                                                                                m3.K(this.a[n], (List<Long>)j4.M(t, f & 0xFFFFF), x4, true);
                                                                                                break Label_2455;
                                                                                            }
                                                                                            case 45: {
                                                                                                m3.S(this.a[n], (List<Integer>)j4.M(t, f & 0xFFFFF), x4, true);
                                                                                                break Label_2455;
                                                                                            }
                                                                                            case 44: {
                                                                                                m3.T(this.a[n], (List<Integer>)j4.M(t, f & 0xFFFFF), x4, true);
                                                                                                break Label_2455;
                                                                                            }
                                                                                            case 43: {
                                                                                                m3.O(this.a[n], (List<Integer>)j4.M(t, f & 0xFFFFF), x4, true);
                                                                                                break Label_2455;
                                                                                            }
                                                                                            case 42: {
                                                                                                m3.U(this.a[n], (List<Boolean>)j4.M(t, f & 0xFFFFF), x4, true);
                                                                                                break Label_2455;
                                                                                            }
                                                                                            case 41: {
                                                                                                m3.R(this.a[n], (List<Integer>)j4.M(t, f & 0xFFFFF), x4, true);
                                                                                                break Label_2455;
                                                                                            }
                                                                                            case 40: {
                                                                                                m3.H(this.a[n], (List<Long>)j4.M(t, f & 0xFFFFF), x4, true);
                                                                                                break Label_2455;
                                                                                            }
                                                                                            case 39: {
                                                                                                m3.M(this.a[n], (List<Integer>)j4.M(t, f & 0xFFFFF), x4, true);
                                                                                                break Label_2455;
                                                                                            }
                                                                                            case 38: {
                                                                                                m3.x(this.a[n], (List<Long>)j4.M(t, f & 0xFFFFF), x4, true);
                                                                                                break Label_2455;
                                                                                            }
                                                                                            case 37: {
                                                                                                m3.r(this.a[n], (List<Long>)j4.M(t, f & 0xFFFFF), x4, true);
                                                                                                break Label_2455;
                                                                                            }
                                                                                            case 36: {
                                                                                                m3.m(this.a[n], (List<Float>)j4.M(t, f & 0xFFFFF), x4, true);
                                                                                                break Label_2455;
                                                                                            }
                                                                                            case 35: {
                                                                                                m3.f(this.a[n], (List<Double>)j4.M(t, f & 0xFFFFF), x4, true);
                                                                                                break Label_2455;
                                                                                            }
                                                                                            case 34: {
                                                                                                m3.F(this.a[n], (List<Long>)j4.M(t, f & 0xFFFFF), x4, false);
                                                                                                break Label_2455;
                                                                                            }
                                                                                            case 33: {
                                                                                                m3.Q(this.a[n], (List<Integer>)j4.M(t, f & 0xFFFFF), x4, false);
                                                                                                break Label_2455;
                                                                                            }
                                                                                            case 32: {
                                                                                                m3.K(this.a[n], (List<Long>)j4.M(t, f & 0xFFFFF), x4, false);
                                                                                                break Label_2455;
                                                                                            }
                                                                                            case 31: {
                                                                                                m3.S(this.a[n], (List<Integer>)j4.M(t, f & 0xFFFFF), x4, false);
                                                                                                break Label_2455;
                                                                                            }
                                                                                            case 30: {
                                                                                                m3.T(this.a[n], (List<Integer>)j4.M(t, f & 0xFFFFF), x4, false);
                                                                                                break Label_2455;
                                                                                            }
                                                                                            case 29: {
                                                                                                m3.O(this.a[n], (List<Integer>)j4.M(t, f & 0xFFFFF), x4, false);
                                                                                                break Label_2455;
                                                                                            }
                                                                                            case 28: {
                                                                                                m3.k(this.a[n], (List<d0>)j4.M(t, f & 0xFFFFF), x4);
                                                                                                break Label_2455;
                                                                                            }
                                                                                            case 27: {
                                                                                                m3.e(this.a[n], (List<?>)j4.M(t, f & 0xFFFFF), x4, this.C(n));
                                                                                                break Label_2455;
                                                                                            }
                                                                                            case 26: {
                                                                                                m3.d(this.a[n], (List<String>)j4.M(t, f & 0xFFFFF), x4);
                                                                                                break Label_2455;
                                                                                            }
                                                                                            case 25: {
                                                                                                m3.U(this.a[n], (List<Boolean>)j4.M(t, f & 0xFFFFF), x4, false);
                                                                                                break Label_2455;
                                                                                            }
                                                                                            case 24: {
                                                                                                m3.R(this.a[n], (List<Integer>)j4.M(t, f & 0xFFFFF), x4, false);
                                                                                                break Label_2455;
                                                                                            }
                                                                                            case 23: {
                                                                                                m3.H(this.a[n], (List<Long>)j4.M(t, f & 0xFFFFF), x4, false);
                                                                                                break Label_2455;
                                                                                            }
                                                                                            case 22: {
                                                                                                m3.M(this.a[n], (List<Integer>)j4.M(t, f & 0xFFFFF), x4, false);
                                                                                                break Label_2455;
                                                                                            }
                                                                                            case 21: {
                                                                                                m3.x(this.a[n], (List<Long>)j4.M(t, f & 0xFFFFF), x4, false);
                                                                                                break Label_2455;
                                                                                            }
                                                                                            case 20: {
                                                                                                m3.r(this.a[n], (List<Long>)j4.M(t, f & 0xFFFFF), x4, false);
                                                                                                break Label_2455;
                                                                                            }
                                                                                            case 19: {
                                                                                                m3.m(this.a[n], (List<Float>)j4.M(t, f & 0xFFFFF), x4, false);
                                                                                                break Label_2455;
                                                                                            }
                                                                                            case 18: {
                                                                                                m3.f(this.a[n], (List<Double>)j4.M(t, f & 0xFFFFF), x4, false);
                                                                                                break Label_2455;
                                                                                            }
                                                                                            case 17: {
                                                                                                if (this.y(t, n)) {
                                                                                                    break;
                                                                                                }
                                                                                                break Label_2455;
                                                                                            }
                                                                                            case 16: {
                                                                                                if (this.y(t, n)) {
                                                                                                    n3 = j4.I(t, f & 0xFFFFF);
                                                                                                    break Label_1890;
                                                                                                }
                                                                                                break Label_2455;
                                                                                            }
                                                                                            case 15: {
                                                                                                if (this.y(t, n)) {
                                                                                                    n4 = j4.H(t, f & 0xFFFFF);
                                                                                                    break Label_1925;
                                                                                                }
                                                                                                break Label_2455;
                                                                                            }
                                                                                            case 14: {
                                                                                                if (this.y(t, n)) {
                                                                                                    n5 = j4.I(t, f & 0xFFFFF);
                                                                                                    break Label_1960;
                                                                                                }
                                                                                                break Label_2455;
                                                                                            }
                                                                                            case 13: {
                                                                                                if (this.y(t, n)) {
                                                                                                    n6 = j4.H(t, f & 0xFFFFF);
                                                                                                    break Label_1995;
                                                                                                }
                                                                                                break Label_2455;
                                                                                            }
                                                                                            case 12: {
                                                                                                if (this.y(t, n)) {
                                                                                                    n7 = j4.H(t, f & 0xFFFFF);
                                                                                                    break Label_2030;
                                                                                                }
                                                                                                break Label_2455;
                                                                                            }
                                                                                            case 11: {
                                                                                                if (this.y(t, n)) {
                                                                                                    n8 = j4.H(t, f & 0xFFFFF);
                                                                                                    break Label_2065;
                                                                                                }
                                                                                                break Label_2455;
                                                                                            }
                                                                                            case 10: {
                                                                                                if (this.y(t, n)) {
                                                                                                    break Label_2088;
                                                                                                }
                                                                                                break Label_2455;
                                                                                            }
                                                                                            case 9: {
                                                                                                if (this.y(t, n)) {
                                                                                                    break Label_2122;
                                                                                                }
                                                                                                break Label_2455;
                                                                                            }
                                                                                            case 8: {
                                                                                                if (this.y(t, n)) {
                                                                                                    break Label_2159;
                                                                                                }
                                                                                                break Label_2455;
                                                                                            }
                                                                                            case 7: {
                                                                                                if (this.y(t, n)) {
                                                                                                    b2 = j4.J(t, f & 0xFFFFF);
                                                                                                    break Label_2200;
                                                                                                }
                                                                                                break Label_2455;
                                                                                            }
                                                                                            case 6: {
                                                                                                if (this.y(t, n)) {
                                                                                                    n9 = j4.H(t, f & 0xFFFFF);
                                                                                                    break Label_2235;
                                                                                                }
                                                                                                break Label_2455;
                                                                                            }
                                                                                            case 5: {
                                                                                                if (this.y(t, n)) {
                                                                                                    n10 = j4.I(t, f & 0xFFFFF);
                                                                                                    break Label_2270;
                                                                                                }
                                                                                                break Label_2455;
                                                                                            }
                                                                                            case 4: {
                                                                                                if (this.y(t, n)) {
                                                                                                    n11 = j4.H(t, f & 0xFFFFF);
                                                                                                    break Label_2305;
                                                                                                }
                                                                                                break Label_2455;
                                                                                            }
                                                                                            case 3: {
                                                                                                if (this.y(t, n)) {
                                                                                                    n12 = j4.I(t, f & 0xFFFFF);
                                                                                                    break Label_2340;
                                                                                                }
                                                                                                break Label_2455;
                                                                                            }
                                                                                            case 2: {
                                                                                                if (this.y(t, n)) {
                                                                                                    n13 = j4.I(t, f & 0xFFFFF);
                                                                                                    break Label_2375;
                                                                                                }
                                                                                                break Label_2455;
                                                                                            }
                                                                                            case 1: {
                                                                                                if (this.y(t, n)) {
                                                                                                    n14 = j4.K(t, f & 0xFFFFF);
                                                                                                    break Label_2410;
                                                                                                }
                                                                                                break Label_2455;
                                                                                            }
                                                                                            case 0: {
                                                                                                if (this.y(t, n)) {
                                                                                                    n15 = j4.L(t, f & 0xFFFFF);
                                                                                                    break Label_2445;
                                                                                                }
                                                                                                break Label_2455;
                                                                                            }
                                                                                        }
                                                                                        x4.O(n2, j4.M(t, f & 0xFFFFF), this.C(n));
                                                                                        break Label_2455;
                                                                                    }
                                                                                    x4.c(n2, n3);
                                                                                    break Label_2455;
                                                                                }
                                                                                x4.C(n2, n4);
                                                                                break Label_2455;
                                                                            }
                                                                            x4.E(n2, n5);
                                                                            break Label_2455;
                                                                        }
                                                                        x4.R(n2, n6);
                                                                        break Label_2455;
                                                                    }
                                                                    x4.K(n2, n7);
                                                                    break Label_2455;
                                                                }
                                                                x4.A(n2, n8);
                                                                break Label_2455;
                                                            }
                                                            x4.L(n2, (d0)j4.M(t, f & 0xFFFFF));
                                                            break Label_2455;
                                                        }
                                                        x4.M(n2, j4.M(t, f & 0xFFFFF), this.C(n));
                                                        break Label_2455;
                                                    }
                                                    u(n2, j4.M(t, f & 0xFFFFF), x4);
                                                    break Label_2455;
                                                }
                                                x4.G(n2, b2);
                                                break Label_2455;
                                            }
                                            x4.u(n2, n9);
                                            break Label_2455;
                                        }
                                        x4.h(n2, n10);
                                        break Label_2455;
                                    }
                                    x4.g(n2, n11);
                                    break Label_2455;
                                }
                                x4.p(n2, n12);
                                break Label_2455;
                            }
                            x4.J(n2, n13);
                            break Label_2455;
                        }
                        x4.r(n2, n14);
                        break Label_2455;
                    }
                    x4.q(n2, n15);
                }
                n -= 4;
            }
            while (o2 != null) {
                this.q.c(x4, (Map.Entry<?, ?>)o2);
                if (((Iterator)a).hasNext()) {
                    o2 = ((Iterator<Map.Entry<?, ?>>)a).next();
                }
                else {
                    o2 = null;
                }
            }
            return;
        }
        if (this.i) {
            Object e = null;
            Map.Entry<?, ?> entry2 = null;
            Label_2560: {
                if (this.g) {
                    final a1<?> b3 = this.q.b(t);
                    if (!b3.b()) {
                        e = b3.e();
                        entry2 = ((Iterator<Map.Entry<?, ?>>)e).next();
                        break Label_2560;
                    }
                }
                e = (entry2 = null);
            }
            final int length = this.a.length;
            int n16 = 0;
            Object o3 = entry2;
            Object o4;
            while (true) {
                o4 = o3;
                if (n16 >= length) {
                    break;
                }
                final int f2 = this.F(n16);
                final int n17 = this.a[n16];
                while (o3 != null && this.q.a((Map.Entry<?, ?>)o3) <= n17) {
                    this.q.c(x4, (Map.Entry<?, ?>)o3);
                    if (((Iterator)e).hasNext()) {
                        o3 = ((Iterator<Map.Entry<?, ?>>)e).next();
                    }
                    else {
                        o3 = null;
                    }
                }
                Label_4951: {
                    double n30 = 0.0;
                    Label_4941: {
                        float n29 = 0.0f;
                        Label_4906: {
                            long n28 = 0L;
                            Label_4871: {
                                long n27 = 0L;
                                Label_4836: {
                                    int n26 = 0;
                                    Label_4801: {
                                        long n25 = 0L;
                                        Label_4766: {
                                            int n24 = 0;
                                            Label_4731: {
                                                boolean b4 = false;
                                                Label_4696: {
                                                    Label_4655: {
                                                        Label_4618: {
                                                            Label_4584: {
                                                                int n23 = 0;
                                                                Label_4561: {
                                                                    int n22 = 0;
                                                                    Label_4526: {
                                                                        int n21 = 0;
                                                                        Label_4491: {
                                                                            long n20 = 0L;
                                                                            Label_4456: {
                                                                                int n19 = 0;
                                                                                Label_4421: {
                                                                                    long n18 = 0L;
                                                                                    Label_4386: {
                                                                                        switch ((f2 & 0xFF00000) >>> 20) {
                                                                                            default: {
                                                                                                break Label_4951;
                                                                                            }
                                                                                            case 68: {
                                                                                                if (this.z(t, n17, n16)) {
                                                                                                    break;
                                                                                                }
                                                                                                break Label_4951;
                                                                                            }
                                                                                            case 67: {
                                                                                                if (this.z(t, n17, n16)) {
                                                                                                    n18 = R(t, f2 & 0xFFFFF);
                                                                                                    break Label_4386;
                                                                                                }
                                                                                                break Label_4951;
                                                                                            }
                                                                                            case 66: {
                                                                                                if (this.z(t, n17, n16)) {
                                                                                                    n19 = Q(t, f2 & 0xFFFFF);
                                                                                                    break Label_4421;
                                                                                                }
                                                                                                break Label_4951;
                                                                                            }
                                                                                            case 65: {
                                                                                                if (this.z(t, n17, n16)) {
                                                                                                    n20 = R(t, f2 & 0xFFFFF);
                                                                                                    break Label_4456;
                                                                                                }
                                                                                                break Label_4951;
                                                                                            }
                                                                                            case 64: {
                                                                                                if (this.z(t, n17, n16)) {
                                                                                                    n21 = Q(t, f2 & 0xFFFFF);
                                                                                                    break Label_4491;
                                                                                                }
                                                                                                break Label_4951;
                                                                                            }
                                                                                            case 63: {
                                                                                                if (this.z(t, n17, n16)) {
                                                                                                    n22 = Q(t, f2 & 0xFFFFF);
                                                                                                    break Label_4526;
                                                                                                }
                                                                                                break Label_4951;
                                                                                            }
                                                                                            case 62: {
                                                                                                if (this.z(t, n17, n16)) {
                                                                                                    n23 = Q(t, f2 & 0xFFFFF);
                                                                                                    break Label_4561;
                                                                                                }
                                                                                                break Label_4951;
                                                                                            }
                                                                                            case 61: {
                                                                                                if (this.z(t, n17, n16)) {
                                                                                                    break Label_4584;
                                                                                                }
                                                                                                break Label_4951;
                                                                                            }
                                                                                            case 60: {
                                                                                                if (this.z(t, n17, n16)) {
                                                                                                    break Label_4618;
                                                                                                }
                                                                                                break Label_4951;
                                                                                            }
                                                                                            case 59: {
                                                                                                if (this.z(t, n17, n16)) {
                                                                                                    break Label_4655;
                                                                                                }
                                                                                                break Label_4951;
                                                                                            }
                                                                                            case 58: {
                                                                                                if (this.z(t, n17, n16)) {
                                                                                                    b4 = S(t, f2 & 0xFFFFF);
                                                                                                    break Label_4696;
                                                                                                }
                                                                                                break Label_4951;
                                                                                            }
                                                                                            case 57: {
                                                                                                if (this.z(t, n17, n16)) {
                                                                                                    n24 = Q(t, f2 & 0xFFFFF);
                                                                                                    break Label_4731;
                                                                                                }
                                                                                                break Label_4951;
                                                                                            }
                                                                                            case 56: {
                                                                                                if (this.z(t, n17, n16)) {
                                                                                                    n25 = R(t, f2 & 0xFFFFF);
                                                                                                    break Label_4766;
                                                                                                }
                                                                                                break Label_4951;
                                                                                            }
                                                                                            case 55: {
                                                                                                if (this.z(t, n17, n16)) {
                                                                                                    n26 = Q(t, f2 & 0xFFFFF);
                                                                                                    break Label_4801;
                                                                                                }
                                                                                                break Label_4951;
                                                                                            }
                                                                                            case 54: {
                                                                                                if (this.z(t, n17, n16)) {
                                                                                                    n27 = R(t, f2 & 0xFFFFF);
                                                                                                    break Label_4836;
                                                                                                }
                                                                                                break Label_4951;
                                                                                            }
                                                                                            case 53: {
                                                                                                if (this.z(t, n17, n16)) {
                                                                                                    n28 = R(t, f2 & 0xFFFFF);
                                                                                                    break Label_4871;
                                                                                                }
                                                                                                break Label_4951;
                                                                                            }
                                                                                            case 52: {
                                                                                                if (this.z(t, n17, n16)) {
                                                                                                    n29 = P(t, f2 & 0xFFFFF);
                                                                                                    break Label_4906;
                                                                                                }
                                                                                                break Label_4951;
                                                                                            }
                                                                                            case 51: {
                                                                                                if (this.z(t, n17, n16)) {
                                                                                                    n30 = O(t, f2 & 0xFFFFF);
                                                                                                    break Label_4941;
                                                                                                }
                                                                                                break Label_4951;
                                                                                            }
                                                                                            case 50: {
                                                                                                this.w(x4, n17, j4.M(t, f2 & 0xFFFFF), n16);
                                                                                                break Label_4951;
                                                                                            }
                                                                                            case 49: {
                                                                                                m3.l(this.a[n16], (List<?>)j4.M(t, f2 & 0xFFFFF), x4, this.C(n16));
                                                                                                break Label_4951;
                                                                                            }
                                                                                            case 48: {
                                                                                                m3.F(this.a[n16], (List<Long>)j4.M(t, f2 & 0xFFFFF), x4, true);
                                                                                                break Label_4951;
                                                                                            }
                                                                                            case 47: {
                                                                                                m3.Q(this.a[n16], (List<Integer>)j4.M(t, f2 & 0xFFFFF), x4, true);
                                                                                                break Label_4951;
                                                                                            }
                                                                                            case 46: {
                                                                                                m3.K(this.a[n16], (List<Long>)j4.M(t, f2 & 0xFFFFF), x4, true);
                                                                                                break Label_4951;
                                                                                            }
                                                                                            case 45: {
                                                                                                m3.S(this.a[n16], (List<Integer>)j4.M(t, f2 & 0xFFFFF), x4, true);
                                                                                                break Label_4951;
                                                                                            }
                                                                                            case 44: {
                                                                                                m3.T(this.a[n16], (List<Integer>)j4.M(t, f2 & 0xFFFFF), x4, true);
                                                                                                break Label_4951;
                                                                                            }
                                                                                            case 43: {
                                                                                                m3.O(this.a[n16], (List<Integer>)j4.M(t, f2 & 0xFFFFF), x4, true);
                                                                                                break Label_4951;
                                                                                            }
                                                                                            case 42: {
                                                                                                m3.U(this.a[n16], (List<Boolean>)j4.M(t, f2 & 0xFFFFF), x4, true);
                                                                                                break Label_4951;
                                                                                            }
                                                                                            case 41: {
                                                                                                m3.R(this.a[n16], (List<Integer>)j4.M(t, f2 & 0xFFFFF), x4, true);
                                                                                                break Label_4951;
                                                                                            }
                                                                                            case 40: {
                                                                                                m3.H(this.a[n16], (List<Long>)j4.M(t, f2 & 0xFFFFF), x4, true);
                                                                                                break Label_4951;
                                                                                            }
                                                                                            case 39: {
                                                                                                m3.M(this.a[n16], (List<Integer>)j4.M(t, f2 & 0xFFFFF), x4, true);
                                                                                                break Label_4951;
                                                                                            }
                                                                                            case 38: {
                                                                                                m3.x(this.a[n16], (List<Long>)j4.M(t, f2 & 0xFFFFF), x4, true);
                                                                                                break Label_4951;
                                                                                            }
                                                                                            case 37: {
                                                                                                m3.r(this.a[n16], (List<Long>)j4.M(t, f2 & 0xFFFFF), x4, true);
                                                                                                break Label_4951;
                                                                                            }
                                                                                            case 36: {
                                                                                                m3.m(this.a[n16], (List<Float>)j4.M(t, f2 & 0xFFFFF), x4, true);
                                                                                                break Label_4951;
                                                                                            }
                                                                                            case 35: {
                                                                                                m3.f(this.a[n16], (List<Double>)j4.M(t, f2 & 0xFFFFF), x4, true);
                                                                                                break Label_4951;
                                                                                            }
                                                                                            case 34: {
                                                                                                m3.F(this.a[n16], (List<Long>)j4.M(t, f2 & 0xFFFFF), x4, false);
                                                                                                break Label_4951;
                                                                                            }
                                                                                            case 33: {
                                                                                                m3.Q(this.a[n16], (List<Integer>)j4.M(t, f2 & 0xFFFFF), x4, false);
                                                                                                break Label_4951;
                                                                                            }
                                                                                            case 32: {
                                                                                                m3.K(this.a[n16], (List<Long>)j4.M(t, f2 & 0xFFFFF), x4, false);
                                                                                                break Label_4951;
                                                                                            }
                                                                                            case 31: {
                                                                                                m3.S(this.a[n16], (List<Integer>)j4.M(t, f2 & 0xFFFFF), x4, false);
                                                                                                break Label_4951;
                                                                                            }
                                                                                            case 30: {
                                                                                                m3.T(this.a[n16], (List<Integer>)j4.M(t, f2 & 0xFFFFF), x4, false);
                                                                                                break Label_4951;
                                                                                            }
                                                                                            case 29: {
                                                                                                m3.O(this.a[n16], (List<Integer>)j4.M(t, f2 & 0xFFFFF), x4, false);
                                                                                                break Label_4951;
                                                                                            }
                                                                                            case 28: {
                                                                                                m3.k(this.a[n16], (List<d0>)j4.M(t, f2 & 0xFFFFF), x4);
                                                                                                break Label_4951;
                                                                                            }
                                                                                            case 27: {
                                                                                                m3.e(this.a[n16], (List<?>)j4.M(t, f2 & 0xFFFFF), x4, this.C(n16));
                                                                                                break Label_4951;
                                                                                            }
                                                                                            case 26: {
                                                                                                m3.d(this.a[n16], (List<String>)j4.M(t, f2 & 0xFFFFF), x4);
                                                                                                break Label_4951;
                                                                                            }
                                                                                            case 25: {
                                                                                                m3.U(this.a[n16], (List<Boolean>)j4.M(t, f2 & 0xFFFFF), x4, false);
                                                                                                break Label_4951;
                                                                                            }
                                                                                            case 24: {
                                                                                                m3.R(this.a[n16], (List<Integer>)j4.M(t, f2 & 0xFFFFF), x4, false);
                                                                                                break Label_4951;
                                                                                            }
                                                                                            case 23: {
                                                                                                m3.H(this.a[n16], (List<Long>)j4.M(t, f2 & 0xFFFFF), x4, false);
                                                                                                break Label_4951;
                                                                                            }
                                                                                            case 22: {
                                                                                                m3.M(this.a[n16], (List<Integer>)j4.M(t, f2 & 0xFFFFF), x4, false);
                                                                                                break Label_4951;
                                                                                            }
                                                                                            case 21: {
                                                                                                m3.x(this.a[n16], (List<Long>)j4.M(t, f2 & 0xFFFFF), x4, false);
                                                                                                break Label_4951;
                                                                                            }
                                                                                            case 20: {
                                                                                                m3.r(this.a[n16], (List<Long>)j4.M(t, f2 & 0xFFFFF), x4, false);
                                                                                                break Label_4951;
                                                                                            }
                                                                                            case 19: {
                                                                                                m3.m(this.a[n16], (List<Float>)j4.M(t, f2 & 0xFFFFF), x4, false);
                                                                                                break Label_4951;
                                                                                            }
                                                                                            case 18: {
                                                                                                m3.f(this.a[n16], (List<Double>)j4.M(t, f2 & 0xFFFFF), x4, false);
                                                                                                break Label_4951;
                                                                                            }
                                                                                            case 17: {
                                                                                                if (this.y(t, n16)) {
                                                                                                    break;
                                                                                                }
                                                                                                break Label_4951;
                                                                                            }
                                                                                            case 16: {
                                                                                                if (this.y(t, n16)) {
                                                                                                    n18 = j4.I(t, f2 & 0xFFFFF);
                                                                                                    break Label_4386;
                                                                                                }
                                                                                                break Label_4951;
                                                                                            }
                                                                                            case 15: {
                                                                                                if (this.y(t, n16)) {
                                                                                                    n19 = j4.H(t, f2 & 0xFFFFF);
                                                                                                    break Label_4421;
                                                                                                }
                                                                                                break Label_4951;
                                                                                            }
                                                                                            case 14: {
                                                                                                if (this.y(t, n16)) {
                                                                                                    n20 = j4.I(t, f2 & 0xFFFFF);
                                                                                                    break Label_4456;
                                                                                                }
                                                                                                break Label_4951;
                                                                                            }
                                                                                            case 13: {
                                                                                                if (this.y(t, n16)) {
                                                                                                    n21 = j4.H(t, f2 & 0xFFFFF);
                                                                                                    break Label_4491;
                                                                                                }
                                                                                                break Label_4951;
                                                                                            }
                                                                                            case 12: {
                                                                                                if (this.y(t, n16)) {
                                                                                                    n22 = j4.H(t, f2 & 0xFFFFF);
                                                                                                    break Label_4526;
                                                                                                }
                                                                                                break Label_4951;
                                                                                            }
                                                                                            case 11: {
                                                                                                if (this.y(t, n16)) {
                                                                                                    n23 = j4.H(t, f2 & 0xFFFFF);
                                                                                                    break Label_4561;
                                                                                                }
                                                                                                break Label_4951;
                                                                                            }
                                                                                            case 10: {
                                                                                                if (this.y(t, n16)) {
                                                                                                    break Label_4584;
                                                                                                }
                                                                                                break Label_4951;
                                                                                            }
                                                                                            case 9: {
                                                                                                if (this.y(t, n16)) {
                                                                                                    break Label_4618;
                                                                                                }
                                                                                                break Label_4951;
                                                                                            }
                                                                                            case 8: {
                                                                                                if (this.y(t, n16)) {
                                                                                                    break Label_4655;
                                                                                                }
                                                                                                break Label_4951;
                                                                                            }
                                                                                            case 7: {
                                                                                                if (this.y(t, n16)) {
                                                                                                    b4 = j4.J(t, f2 & 0xFFFFF);
                                                                                                    break Label_4696;
                                                                                                }
                                                                                                break Label_4951;
                                                                                            }
                                                                                            case 6: {
                                                                                                if (this.y(t, n16)) {
                                                                                                    n24 = j4.H(t, f2 & 0xFFFFF);
                                                                                                    break Label_4731;
                                                                                                }
                                                                                                break Label_4951;
                                                                                            }
                                                                                            case 5: {
                                                                                                if (this.y(t, n16)) {
                                                                                                    n25 = j4.I(t, f2 & 0xFFFFF);
                                                                                                    break Label_4766;
                                                                                                }
                                                                                                break Label_4951;
                                                                                            }
                                                                                            case 4: {
                                                                                                if (this.y(t, n16)) {
                                                                                                    n26 = j4.H(t, f2 & 0xFFFFF);
                                                                                                    break Label_4801;
                                                                                                }
                                                                                                break Label_4951;
                                                                                            }
                                                                                            case 3: {
                                                                                                if (this.y(t, n16)) {
                                                                                                    n27 = j4.I(t, f2 & 0xFFFFF);
                                                                                                    break Label_4836;
                                                                                                }
                                                                                                break Label_4951;
                                                                                            }
                                                                                            case 2: {
                                                                                                if (this.y(t, n16)) {
                                                                                                    n28 = j4.I(t, f2 & 0xFFFFF);
                                                                                                    break Label_4871;
                                                                                                }
                                                                                                break Label_4951;
                                                                                            }
                                                                                            case 1: {
                                                                                                if (this.y(t, n16)) {
                                                                                                    n29 = j4.K(t, f2 & 0xFFFFF);
                                                                                                    break Label_4906;
                                                                                                }
                                                                                                break Label_4951;
                                                                                            }
                                                                                            case 0: {
                                                                                                if (this.y(t, n16)) {
                                                                                                    n30 = j4.L(t, f2 & 0xFFFFF);
                                                                                                    break Label_4941;
                                                                                                }
                                                                                                break Label_4951;
                                                                                            }
                                                                                        }
                                                                                        x4.O(n17, j4.M(t, f2 & 0xFFFFF), this.C(n16));
                                                                                        break Label_4951;
                                                                                    }
                                                                                    x4.c(n17, n18);
                                                                                    break Label_4951;
                                                                                }
                                                                                x4.C(n17, n19);
                                                                                break Label_4951;
                                                                            }
                                                                            x4.E(n17, n20);
                                                                            break Label_4951;
                                                                        }
                                                                        x4.R(n17, n21);
                                                                        break Label_4951;
                                                                    }
                                                                    x4.K(n17, n22);
                                                                    break Label_4951;
                                                                }
                                                                x4.A(n17, n23);
                                                                break Label_4951;
                                                            }
                                                            x4.L(n17, (d0)j4.M(t, f2 & 0xFFFFF));
                                                            break Label_4951;
                                                        }
                                                        x4.M(n17, j4.M(t, f2 & 0xFFFFF), this.C(n16));
                                                        break Label_4951;
                                                    }
                                                    u(n17, j4.M(t, f2 & 0xFFFFF), x4);
                                                    break Label_4951;
                                                }
                                                x4.G(n17, b4);
                                                break Label_4951;
                                            }
                                            x4.u(n17, n24);
                                            break Label_4951;
                                        }
                                        x4.h(n17, n25);
                                        break Label_4951;
                                    }
                                    x4.g(n17, n26);
                                    break Label_4951;
                                }
                                x4.p(n17, n27);
                                break Label_4951;
                            }
                            x4.J(n17, n28);
                            break Label_4951;
                        }
                        x4.r(n17, n29);
                        break Label_4951;
                    }
                    x4.q(n17, n30);
                }
                n16 += 4;
            }
            while (o4 != null) {
                this.q.c(x4, (Map.Entry<?, ?>)o4);
                if (((Iterator)e).hasNext()) {
                    o4 = ((Iterator<Map.Entry<?, ?>>)e).next();
                }
                else {
                    o4 = null;
                }
            }
            v(this.p, t, x4);
            return;
        }
        this.K(t, x4);
    }
    
    @Override
    public final void d(final T t, final T obj) {
        Objects.requireNonNull(obj);
        for (int i = 0; i < this.a.length; i += 4) {
            final int f = this.F(i);
            final long n = 0xFFFFF & f;
            final int n2 = this.a[i];
            Label_0696: {
                Label_0636: {
                    Label_0600: {
                        Label_0528: {
                            Label_0482: {
                                switch ((f & 0xFF00000) >>> 20) {
                                    default: {
                                        continue;
                                    }
                                    case 61:
                                    case 62:
                                    case 63:
                                    case 64:
                                    case 65:
                                    case 66:
                                    case 67: {
                                        if (this.z(obj, n2, i)) {
                                            break;
                                        }
                                        continue;
                                    }
                                    case 60:
                                    case 68: {
                                        this.L(t, obj, i);
                                        continue;
                                    }
                                    case 51:
                                    case 52:
                                    case 53:
                                    case 54:
                                    case 55:
                                    case 56:
                                    case 57:
                                    case 58:
                                    case 59: {
                                        if (this.z(obj, n2, i)) {
                                            break;
                                        }
                                        continue;
                                    }
                                    case 50: {
                                        m3.h(this.r, t, obj, n);
                                        continue;
                                    }
                                    case 18:
                                    case 19:
                                    case 20:
                                    case 21:
                                    case 22:
                                    case 23:
                                    case 24:
                                    case 25:
                                    case 26:
                                    case 27:
                                    case 28:
                                    case 29:
                                    case 30:
                                    case 31:
                                    case 32:
                                    case 33:
                                    case 34:
                                    case 35:
                                    case 36:
                                    case 37:
                                    case 38:
                                    case 39:
                                    case 40:
                                    case 41:
                                    case 42:
                                    case 43:
                                    case 44:
                                    case 45:
                                    case 46:
                                    case 47:
                                    case 48:
                                    case 49: {
                                        this.o.b(t, obj, n);
                                        continue;
                                    }
                                    case 16: {
                                        if (this.y(obj, i)) {
                                            break Label_0636;
                                        }
                                        continue;
                                    }
                                    case 15: {
                                        if (this.y(obj, i)) {
                                            break Label_0482;
                                        }
                                        continue;
                                    }
                                    case 14: {
                                        if (this.y(obj, i)) {
                                            break Label_0636;
                                        }
                                        continue;
                                    }
                                    case 13: {
                                        if (this.y(obj, i)) {
                                            break Label_0482;
                                        }
                                        continue;
                                    }
                                    case 12: {
                                        if (this.y(obj, i)) {
                                            break Label_0482;
                                        }
                                        continue;
                                    }
                                    case 11: {
                                        if (this.y(obj, i)) {
                                            break Label_0600;
                                        }
                                        continue;
                                    }
                                    case 10: {
                                        if (this.y(obj, i)) {
                                            break Label_0528;
                                        }
                                        continue;
                                    }
                                    case 9:
                                    case 17: {
                                        this.x(t, obj, i);
                                        continue;
                                    }
                                    case 8: {
                                        if (this.y(obj, i)) {
                                            break Label_0528;
                                        }
                                        continue;
                                    }
                                    case 7: {
                                        if (this.y(obj, i)) {
                                            j4.j(t, n, j4.J(obj, n));
                                            break Label_0696;
                                        }
                                        continue;
                                    }
                                    case 6: {
                                        if (this.y(obj, i)) {
                                            break Label_0600;
                                        }
                                        continue;
                                    }
                                    case 5: {
                                        if (this.y(obj, i)) {
                                            break Label_0636;
                                        }
                                        continue;
                                    }
                                    case 4: {
                                        if (this.y(obj, i)) {
                                            break Label_0600;
                                        }
                                        continue;
                                    }
                                    case 3: {
                                        if (this.y(obj, i)) {
                                            break Label_0636;
                                        }
                                        continue;
                                    }
                                    case 2: {
                                        if (this.y(obj, i)) {
                                            break Label_0636;
                                        }
                                        continue;
                                    }
                                    case 1: {
                                        if (this.y(obj, i)) {
                                            j4.f(t, n, j4.K(obj, n));
                                            break Label_0696;
                                        }
                                        continue;
                                    }
                                    case 0: {
                                        if (this.y(obj, i)) {
                                            j4.e(t, n, j4.L(obj, n));
                                            break Label_0696;
                                        }
                                        continue;
                                    }
                                }
                                j4.i(t, n, j4.M(obj, n));
                                this.J(t, n2, i);
                                continue;
                            }
                            break Label_0600;
                        }
                        j4.i(t, n, j4.M(obj, n));
                        break Label_0696;
                    }
                    j4.g(t, n, j4.H(obj, n));
                    break Label_0696;
                }
                j4.h(t, n, j4.I(obj, n));
            }
            this.I(t, i);
        }
        if (!this.i) {
            m3.i(this.p, t, obj);
            if (this.g) {
                m3.g(this.q, t, obj);
            }
        }
    }
    
    @Override
    public final int e(final T t) {
        if (this.i) {
            final Unsafe s = w2.s;
            int i = 0;
            int n = 0;
            while (i < this.a.length) {
                final int f = this.F(i);
                final int n2 = (f & 0xFF00000) >>> 20;
                final int n3 = this.a[i];
                final long n4 = f & 0xFFFFF;
                int n5;
                if (n2 >= e1.u0.b() && n2 <= e1.H0.b()) {
                    n5 = (this.a[i + 2] & 0xFFFFF);
                }
                else {
                    n5 = 0;
                }
                int n6 = 0;
            Label_1933_Outer:
                while (true) {
                    Label_2245: {
                        Label_2221: {
                            long n13 = 0L;
                            Label_2196: {
                                long n12 = 0L;
                                Label_2163: {
                                    int n11 = 0;
                                    Label_2130: {
                                        Label_2098: {
                                            Label_2074: {
                                                Label_2050: {
                                                    Object o2 = null;
                                                    Label_2022: {
                                                        while (true) {
                                                            Label_2019: {
                                                                Label_1961: {
                                                                    Label_1925: {
                                                                        int n10 = 0;
                                                                        Label_1900: {
                                                                            int n9 = 0;
                                                                            Label_1867: {
                                                                                Label_1835: {
                                                                                    Label_1811: {
                                                                                        int n8 = 0;
                                                                                        Label_1786: {
                                                                                            long n7 = 0L;
                                                                                            Label_1753: {
                                                                                                Label_1708: {
                                                                                                    int x = 0;
                                                                                                    Label_1446: {
                                                                                                        switch (n2) {
                                                                                                            default: {
                                                                                                                n6 = n;
                                                                                                                break Label_1933_Outer;
                                                                                                            }
                                                                                                            case 68: {
                                                                                                                n6 = n;
                                                                                                                if (this.z(t, n3, i)) {
                                                                                                                    break Label_1708;
                                                                                                                }
                                                                                                                break Label_1933_Outer;
                                                                                                            }
                                                                                                            case 67: {
                                                                                                                n6 = n;
                                                                                                                if (this.z(t, n3, i)) {
                                                                                                                    n7 = R(t, n4);
                                                                                                                    break Label_1753;
                                                                                                                }
                                                                                                                break Label_1933_Outer;
                                                                                                            }
                                                                                                            case 66: {
                                                                                                                n6 = n;
                                                                                                                if (this.z(t, n3, i)) {
                                                                                                                    n8 = Q(t, n4);
                                                                                                                    break Label_1786;
                                                                                                                }
                                                                                                                break Label_1933_Outer;
                                                                                                            }
                                                                                                            case 65: {
                                                                                                                n6 = n;
                                                                                                                if (this.z(t, n3, i)) {
                                                                                                                    break Label_1811;
                                                                                                                }
                                                                                                                break Label_1933_Outer;
                                                                                                            }
                                                                                                            case 64: {
                                                                                                                n6 = n;
                                                                                                                if (this.z(t, n3, i)) {
                                                                                                                    break Label_1835;
                                                                                                                }
                                                                                                                break Label_1933_Outer;
                                                                                                            }
                                                                                                            case 63: {
                                                                                                                n6 = n;
                                                                                                                if (this.z(t, n3, i)) {
                                                                                                                    n9 = Q(t, n4);
                                                                                                                    break Label_1867;
                                                                                                                }
                                                                                                                break Label_1933_Outer;
                                                                                                            }
                                                                                                            case 62: {
                                                                                                                n6 = n;
                                                                                                                if (this.z(t, n3, i)) {
                                                                                                                    n10 = Q(t, n4);
                                                                                                                    break Label_1900;
                                                                                                                }
                                                                                                                break Label_1933_Outer;
                                                                                                            }
                                                                                                            case 61: {
                                                                                                                n6 = n;
                                                                                                                if (this.z(t, n3, i)) {
                                                                                                                    break Label_1925;
                                                                                                                }
                                                                                                                break Label_1933_Outer;
                                                                                                            }
                                                                                                            case 60: {
                                                                                                                n6 = n;
                                                                                                                if (this.z(t, n3, i)) {
                                                                                                                    break Label_1961;
                                                                                                                }
                                                                                                                break Label_1933_Outer;
                                                                                                            }
                                                                                                            case 59: {
                                                                                                                n6 = n;
                                                                                                                if (!this.z(t, n3, i)) {
                                                                                                                    break Label_1933_Outer;
                                                                                                                }
                                                                                                                final Object o = o2 = j4.M(t, n4);
                                                                                                                if (o instanceof d0) {
                                                                                                                    final Object m = o;
                                                                                                                    break Label_2019;
                                                                                                                }
                                                                                                                break Label_2022;
                                                                                                            }
                                                                                                            case 58: {
                                                                                                                n6 = n;
                                                                                                                if (this.z(t, n3, i)) {
                                                                                                                    break Label_2050;
                                                                                                                }
                                                                                                                break Label_1933_Outer;
                                                                                                            }
                                                                                                            case 57: {
                                                                                                                n6 = n;
                                                                                                                if (this.z(t, n3, i)) {
                                                                                                                    break Label_2074;
                                                                                                                }
                                                                                                                break Label_1933_Outer;
                                                                                                            }
                                                                                                            case 56: {
                                                                                                                n6 = n;
                                                                                                                if (this.z(t, n3, i)) {
                                                                                                                    break Label_2098;
                                                                                                                }
                                                                                                                break Label_1933_Outer;
                                                                                                            }
                                                                                                            case 55: {
                                                                                                                n6 = n;
                                                                                                                if (this.z(t, n3, i)) {
                                                                                                                    n11 = Q(t, n4);
                                                                                                                    break Label_2130;
                                                                                                                }
                                                                                                                break Label_1933_Outer;
                                                                                                            }
                                                                                                            case 54: {
                                                                                                                n6 = n;
                                                                                                                if (this.z(t, n3, i)) {
                                                                                                                    n12 = R(t, n4);
                                                                                                                    break Label_2163;
                                                                                                                }
                                                                                                                break Label_1933_Outer;
                                                                                                            }
                                                                                                            case 53: {
                                                                                                                n6 = n;
                                                                                                                if (this.z(t, n3, i)) {
                                                                                                                    n13 = R(t, n4);
                                                                                                                    break Label_2196;
                                                                                                                }
                                                                                                                break Label_1933_Outer;
                                                                                                            }
                                                                                                            case 52: {
                                                                                                                n6 = n;
                                                                                                                if (this.z(t, n3, i)) {
                                                                                                                    break Label_2221;
                                                                                                                }
                                                                                                                break Label_1933_Outer;
                                                                                                            }
                                                                                                            case 51: {
                                                                                                                n6 = n;
                                                                                                                if (this.z(t, n3, i)) {
                                                                                                                    break Label_2245;
                                                                                                                }
                                                                                                                break Label_1933_Outer;
                                                                                                            }
                                                                                                            case 50: {
                                                                                                                final int n14 = this.r.g(n3, j4.M(t, n4), this.D(i));
                                                                                                                break Label_1685;
                                                                                                            }
                                                                                                            case 49: {
                                                                                                                final int n14 = m3.u(n3, N(t, n4), this.C(i));
                                                                                                                break Label_1685;
                                                                                                            }
                                                                                                            case 48: {
                                                                                                                final int q = m3.q((List<Long>)s.getObject(t, n4));
                                                                                                                n6 = n;
                                                                                                                if (q <= 0) {
                                                                                                                    break Label_1933_Outer;
                                                                                                                }
                                                                                                                x = q;
                                                                                                                if (this.j) {
                                                                                                                    x = q;
                                                                                                                    break;
                                                                                                                }
                                                                                                                break Label_1446;
                                                                                                            }
                                                                                                            case 47: {
                                                                                                                final int j = m3.J((List<Integer>)s.getObject(t, n4));
                                                                                                                n6 = n;
                                                                                                                if (j <= 0) {
                                                                                                                    break Label_1933_Outer;
                                                                                                                }
                                                                                                                x = j;
                                                                                                                if (this.j) {
                                                                                                                    x = j;
                                                                                                                    break;
                                                                                                                }
                                                                                                                break Label_1446;
                                                                                                            }
                                                                                                            case 46: {
                                                                                                                final int n15 = m3.N((List<?>)s.getObject(t, n4));
                                                                                                                n6 = n;
                                                                                                                if (n15 <= 0) {
                                                                                                                    break Label_1933_Outer;
                                                                                                                }
                                                                                                                x = n15;
                                                                                                                if (this.j) {
                                                                                                                    x = n15;
                                                                                                                    break;
                                                                                                                }
                                                                                                                break Label_1446;
                                                                                                            }
                                                                                                            case 45: {
                                                                                                                final int l = m3.L((List<?>)s.getObject(t, n4));
                                                                                                                n6 = n;
                                                                                                                if (l <= 0) {
                                                                                                                    break Label_1933_Outer;
                                                                                                                }
                                                                                                                x = l;
                                                                                                                if (this.j) {
                                                                                                                    x = l;
                                                                                                                    break;
                                                                                                                }
                                                                                                                break Label_1446;
                                                                                                            }
                                                                                                            case 44: {
                                                                                                                final int v = m3.v((List<Integer>)s.getObject(t, n4));
                                                                                                                n6 = n;
                                                                                                                if (v <= 0) {
                                                                                                                    break Label_1933_Outer;
                                                                                                                }
                                                                                                                x = v;
                                                                                                                if (this.j) {
                                                                                                                    x = v;
                                                                                                                    break;
                                                                                                                }
                                                                                                                break Label_1446;
                                                                                                            }
                                                                                                            case 43: {
                                                                                                                final int g = m3.G((List<Integer>)s.getObject(t, n4));
                                                                                                                n6 = n;
                                                                                                                if (g <= 0) {
                                                                                                                    break Label_1933_Outer;
                                                                                                                }
                                                                                                                x = g;
                                                                                                                if (this.j) {
                                                                                                                    x = g;
                                                                                                                    break;
                                                                                                                }
                                                                                                                break Label_1446;
                                                                                                            }
                                                                                                            case 42: {
                                                                                                                final int p = m3.P((List<?>)s.getObject(t, n4));
                                                                                                                n6 = n;
                                                                                                                if (p <= 0) {
                                                                                                                    break Label_1933_Outer;
                                                                                                                }
                                                                                                                x = p;
                                                                                                                if (this.j) {
                                                                                                                    x = p;
                                                                                                                    break;
                                                                                                                }
                                                                                                                break Label_1446;
                                                                                                            }
                                                                                                            case 41: {
                                                                                                                final int k = m3.L((List<?>)s.getObject(t, n4));
                                                                                                                n6 = n;
                                                                                                                if (k <= 0) {
                                                                                                                    break Label_1933_Outer;
                                                                                                                }
                                                                                                                x = k;
                                                                                                                if (this.j) {
                                                                                                                    x = k;
                                                                                                                    break;
                                                                                                                }
                                                                                                                break Label_1446;
                                                                                                            }
                                                                                                            case 40: {
                                                                                                                final int n16 = m3.N((List<?>)s.getObject(t, n4));
                                                                                                                n6 = n;
                                                                                                                if (n16 <= 0) {
                                                                                                                    break Label_1933_Outer;
                                                                                                                }
                                                                                                                x = n16;
                                                                                                                if (this.j) {
                                                                                                                    x = n16;
                                                                                                                    break;
                                                                                                                }
                                                                                                                break Label_1446;
                                                                                                            }
                                                                                                            case 39: {
                                                                                                                final int e = m3.E((List<Integer>)s.getObject(t, n4));
                                                                                                                n6 = n;
                                                                                                                if (e <= 0) {
                                                                                                                    break Label_1933_Outer;
                                                                                                                }
                                                                                                                x = e;
                                                                                                                if (this.j) {
                                                                                                                    x = e;
                                                                                                                    break;
                                                                                                                }
                                                                                                                break Label_1446;
                                                                                                            }
                                                                                                            case 38: {
                                                                                                                final int j2 = m3.j((List<Long>)s.getObject(t, n4));
                                                                                                                n6 = n;
                                                                                                                if (j2 <= 0) {
                                                                                                                    break Label_1933_Outer;
                                                                                                                }
                                                                                                                x = j2;
                                                                                                                if (this.j) {
                                                                                                                    x = j2;
                                                                                                                    break;
                                                                                                                }
                                                                                                                break Label_1446;
                                                                                                            }
                                                                                                            case 37: {
                                                                                                                final int a = m3.a((List<Long>)s.getObject(t, n4));
                                                                                                                n6 = n;
                                                                                                                if (a <= 0) {
                                                                                                                    break Label_1933_Outer;
                                                                                                                }
                                                                                                                x = a;
                                                                                                                if (this.j) {
                                                                                                                    x = a;
                                                                                                                    break;
                                                                                                                }
                                                                                                                break Label_1446;
                                                                                                            }
                                                                                                            case 36: {
                                                                                                                final int l2 = m3.L((List<?>)s.getObject(t, n4));
                                                                                                                n6 = n;
                                                                                                                if (l2 <= 0) {
                                                                                                                    break Label_1933_Outer;
                                                                                                                }
                                                                                                                x = l2;
                                                                                                                if (this.j) {
                                                                                                                    x = l2;
                                                                                                                    break;
                                                                                                                }
                                                                                                                break Label_1446;
                                                                                                            }
                                                                                                            case 35: {
                                                                                                                final int n17 = m3.N((List<?>)s.getObject(t, n4));
                                                                                                                n6 = n;
                                                                                                                if (n17 <= 0) {
                                                                                                                    break Label_1933_Outer;
                                                                                                                }
                                                                                                                x = n17;
                                                                                                                if (this.j) {
                                                                                                                    x = n17;
                                                                                                                    break;
                                                                                                                }
                                                                                                                break Label_1446;
                                                                                                            }
                                                                                                            case 34: {
                                                                                                                final int n14 = m3.X(n3, N(t, n4), false);
                                                                                                                break Label_1685;
                                                                                                            }
                                                                                                            case 33: {
                                                                                                                final int n14 = m3.b0(n3, N(t, n4), false);
                                                                                                                break Label_1685;
                                                                                                            }
                                                                                                            case 30: {
                                                                                                                final int n14 = m3.Y(n3, N(t, n4), false);
                                                                                                                break Label_1685;
                                                                                                            }
                                                                                                            case 29: {
                                                                                                                final int n14 = m3.a0(n3, N(t, n4), false);
                                                                                                                break Label_1685;
                                                                                                            }
                                                                                                            case 28: {
                                                                                                                final int n14 = m3.t(n3, N(t, n4));
                                                                                                                break Label_1685;
                                                                                                            }
                                                                                                            case 27: {
                                                                                                                final int n14 = m3.p(n3, N(t, n4), this.C(i));
                                                                                                                break Label_1685;
                                                                                                            }
                                                                                                            case 26: {
                                                                                                                final int n14 = m3.o(n3, N(t, n4));
                                                                                                                break Label_1685;
                                                                                                            }
                                                                                                            case 25: {
                                                                                                                final int n14 = m3.e0(n3, N(t, n4), false);
                                                                                                                break Label_1685;
                                                                                                            }
                                                                                                            case 22: {
                                                                                                                final int n14 = m3.Z(n3, N(t, n4), false);
                                                                                                                break Label_1685;
                                                                                                            }
                                                                                                            case 21: {
                                                                                                                final int n14 = m3.W(n3, N(t, n4), false);
                                                                                                                break Label_1685;
                                                                                                            }
                                                                                                            case 20: {
                                                                                                                final int n14 = m3.V(n3, N(t, n4), false);
                                                                                                                break Label_1685;
                                                                                                            }
                                                                                                            case 19:
                                                                                                            case 24:
                                                                                                            case 31: {
                                                                                                                final int n14 = m3.c0(n3, N(t, n4), false);
                                                                                                                break Label_1685;
                                                                                                            }
                                                                                                            case 18:
                                                                                                            case 23:
                                                                                                            case 32: {
                                                                                                                final int n14 = m3.d0(n3, N(t, n4), false);
                                                                                                                break Label_1685;
                                                                                                            }
                                                                                                            case 17: {
                                                                                                                n6 = n;
                                                                                                                if (this.y(t, i)) {
                                                                                                                    break Label_1708;
                                                                                                                }
                                                                                                                break Label_1933_Outer;
                                                                                                            }
                                                                                                            case 16: {
                                                                                                                n6 = n;
                                                                                                                if (this.y(t, i)) {
                                                                                                                    n7 = j4.I(t, n4);
                                                                                                                    break Label_1753;
                                                                                                                }
                                                                                                                break Label_1933_Outer;
                                                                                                            }
                                                                                                            case 15: {
                                                                                                                n6 = n;
                                                                                                                if (this.y(t, i)) {
                                                                                                                    n8 = j4.H(t, n4);
                                                                                                                    break Label_1786;
                                                                                                                }
                                                                                                                break Label_1933_Outer;
                                                                                                            }
                                                                                                            case 14: {
                                                                                                                n6 = n;
                                                                                                                if (this.y(t, i)) {
                                                                                                                    break Label_1811;
                                                                                                                }
                                                                                                                break Label_1933_Outer;
                                                                                                            }
                                                                                                            case 13: {
                                                                                                                n6 = n;
                                                                                                                if (this.y(t, i)) {
                                                                                                                    break Label_1835;
                                                                                                                }
                                                                                                                break Label_1933_Outer;
                                                                                                            }
                                                                                                            case 12: {
                                                                                                                n6 = n;
                                                                                                                if (this.y(t, i)) {
                                                                                                                    n9 = j4.H(t, n4);
                                                                                                                    break Label_1867;
                                                                                                                }
                                                                                                                break Label_1933_Outer;
                                                                                                            }
                                                                                                            case 11: {
                                                                                                                n6 = n;
                                                                                                                if (this.y(t, i)) {
                                                                                                                    n10 = j4.H(t, n4);
                                                                                                                    break Label_1900;
                                                                                                                }
                                                                                                                break Label_1933_Outer;
                                                                                                            }
                                                                                                            case 10: {
                                                                                                                n6 = n;
                                                                                                                if (this.y(t, i)) {
                                                                                                                    break Label_1925;
                                                                                                                }
                                                                                                                break Label_1933_Outer;
                                                                                                            }
                                                                                                            case 9: {
                                                                                                                n6 = n;
                                                                                                                if (this.y(t, i)) {
                                                                                                                    break Label_1961;
                                                                                                                }
                                                                                                                break Label_1933_Outer;
                                                                                                            }
                                                                                                            case 8: {
                                                                                                                n6 = n;
                                                                                                                if (!this.y(t, i)) {
                                                                                                                    break Label_1933_Outer;
                                                                                                                }
                                                                                                                final Object o3 = o2 = j4.M(t, n4);
                                                                                                                if (o3 instanceof d0) {
                                                                                                                    final Object m = o3;
                                                                                                                    break Label_2019;
                                                                                                                }
                                                                                                                break Label_2022;
                                                                                                            }
                                                                                                            case 7: {
                                                                                                                n6 = n;
                                                                                                                if (this.y(t, i)) {
                                                                                                                    break Label_2050;
                                                                                                                }
                                                                                                                break Label_1933_Outer;
                                                                                                            }
                                                                                                            case 6: {
                                                                                                                n6 = n;
                                                                                                                if (this.y(t, i)) {
                                                                                                                    break Label_2074;
                                                                                                                }
                                                                                                                break Label_1933_Outer;
                                                                                                            }
                                                                                                            case 5: {
                                                                                                                n6 = n;
                                                                                                                if (this.y(t, i)) {
                                                                                                                    break Label_2098;
                                                                                                                }
                                                                                                                break Label_1933_Outer;
                                                                                                            }
                                                                                                            case 4: {
                                                                                                                n6 = n;
                                                                                                                if (this.y(t, i)) {
                                                                                                                    n11 = j4.H(t, n4);
                                                                                                                    break Label_2130;
                                                                                                                }
                                                                                                                break Label_1933_Outer;
                                                                                                            }
                                                                                                            case 3: {
                                                                                                                n6 = n;
                                                                                                                if (this.y(t, i)) {
                                                                                                                    n12 = j4.I(t, n4);
                                                                                                                    break Label_2163;
                                                                                                                }
                                                                                                                break Label_1933_Outer;
                                                                                                            }
                                                                                                            case 2: {
                                                                                                                n6 = n;
                                                                                                                if (this.y(t, i)) {
                                                                                                                    n13 = j4.I(t, n4);
                                                                                                                    break Label_2196;
                                                                                                                }
                                                                                                                break Label_1933_Outer;
                                                                                                            }
                                                                                                            case 1: {
                                                                                                                n6 = n;
                                                                                                                if (this.y(t, i)) {
                                                                                                                    break Label_2221;
                                                                                                                }
                                                                                                                break Label_1933_Outer;
                                                                                                            }
                                                                                                            case 0: {
                                                                                                                n6 = n;
                                                                                                                if (this.y(t, i)) {
                                                                                                                    break Label_2245;
                                                                                                                }
                                                                                                                break Label_1933_Outer;
                                                                                                            }
                                                                                                        }
                                                                                                        s.putInt(t, n5, x);
                                                                                                    }
                                                                                                    final int n14 = p0.C0(n3) + p0.E0(x) + x;
                                                                                                    n6 = n + n14;
                                                                                                    break Label_1933_Outer;
                                                                                                }
                                                                                                final int n14 = p0.P(n3, (s2)j4.M(t, n4), this.C(i));
                                                                                                continue Label_1933_Outer;
                                                                                            }
                                                                                            final int n14 = p0.h0(n3, n7);
                                                                                            continue Label_1933_Outer;
                                                                                        }
                                                                                        final int n14 = p0.s0(n3, n8);
                                                                                        continue Label_1933_Outer;
                                                                                    }
                                                                                    final int n14 = p0.p0(n3, 0L);
                                                                                    continue Label_1933_Outer;
                                                                                }
                                                                                final int n14 = p0.w0(n3, 0);
                                                                                continue Label_1933_Outer;
                                                                            }
                                                                            final int n14 = p0.x0(n3, n9);
                                                                            continue Label_1933_Outer;
                                                                        }
                                                                        final int n14 = p0.o0(n3, n10);
                                                                        continue Label_1933_Outer;
                                                                    }
                                                                    final Object m = j4.M(t, n4);
                                                                    final int n14 = p0.N(n3, (d0)m);
                                                                    continue Label_1933_Outer;
                                                                }
                                                                final int n14 = m3.n(n3, j4.M(t, n4), this.C(i));
                                                                continue Label_1933_Outer;
                                                            }
                                                            continue;
                                                        }
                                                    }
                                                    final int n14 = p0.C(n3, (String)o2);
                                                    continue;
                                                }
                                                final int n14 = p0.Q(n3, true);
                                                continue;
                                            }
                                            final int n14 = p0.u0(n3, 0);
                                            continue;
                                        }
                                        final int n14 = p0.l0(n3, 0L);
                                        continue;
                                    }
                                    final int n14 = p0.k0(n3, n11);
                                    continue;
                                }
                                final int n14 = p0.e0(n3, n12);
                                continue;
                            }
                            final int n14 = p0.W(n3, n13);
                            continue;
                        }
                        final int n14 = p0.z(n3, 0.0f);
                        continue;
                    }
                    final int n14 = p0.y(n3, 0.0);
                    continue;
                }
                i += 4;
                n = n6;
            }
            return n + m(this.p, t);
        }
        final Unsafe s2 = w2.s;
        int n18 = -1;
        int n19 = 0;
        int n20 = 0;
        int int1 = 0;
    Label_4179_Outer:
        while (n19 < this.a.length) {
            final int f2 = this.F(n19);
            final int[] a2 = this.a;
            final int n21 = a2[n19];
            final int n22 = (f2 & 0xFF00000) >>> 20;
            int n25;
            int n27;
            int n28;
            if (n22 <= 17) {
                final int n23 = a2[n19 + 2];
                final int n24 = n23 & 0xFFFFF;
                n25 = 1 << (n23 >>> 20);
                int n26;
                if (n24 != (n26 = n18)) {
                    int1 = s2.getInt(t, n24);
                    n26 = n24;
                }
                n18 = n26;
                n27 = n23;
                n28 = int1;
            }
            else {
                if (this.j && n22 >= e1.u0.b() && n22 <= e1.H0.b()) {
                    n27 = (this.a[n19 + 2] & 0xFFFFF);
                }
                else {
                    n27 = 0;
                }
                n25 = 0;
                n28 = int1;
            }
            final long offset = f2 & 0xFFFFF;
            int n29 = 0;
            Label_4701: {
                int n39 = 0;
            Label_4179:
                while (true) {
                    Label_4550: {
                        Object o5 = null;
                        Label_4523: {
                            while (true) {
                                Label_4520: {
                                    Label_4460: {
                                        Label_4424: {
                                            int n33 = 0;
                                            Label_4400: {
                                                int n32 = 0;
                                            Label_4367:
                                                while (true) {
                                                    int n34 = 0;
                                                    Label_4336: {
                                                        Label_4328: {
                                                            Label_4305: {
                                                                int n31 = 0;
                                                                Label_4281: {
                                                                    long n30 = 0L;
                                                                    Label_4248: {
                                                                        Label_4201: {
                                                                            int x2 = 0;
                                                                            Label_3887: {
                                                                                switch (n22) {
                                                                                    default: {
                                                                                        n29 = n20;
                                                                                        break Label_4186;
                                                                                    }
                                                                                    case 68: {
                                                                                        n29 = n20;
                                                                                        if (this.z(t, n21, n19)) {
                                                                                            break Label_4201;
                                                                                        }
                                                                                        break Label_4186;
                                                                                    }
                                                                                    case 67: {
                                                                                        n29 = n20;
                                                                                        if (this.z(t, n21, n19)) {
                                                                                            n30 = R(t, offset);
                                                                                            break Label_4248;
                                                                                        }
                                                                                        break Label_4186;
                                                                                    }
                                                                                    case 66: {
                                                                                        n29 = n20;
                                                                                        if (this.z(t, n21, n19)) {
                                                                                            n31 = Q(t, offset);
                                                                                            break Label_4281;
                                                                                        }
                                                                                        break Label_4186;
                                                                                    }
                                                                                    case 65: {
                                                                                        n29 = n20;
                                                                                        if (this.z(t, n21, n19)) {
                                                                                            break Label_4305;
                                                                                        }
                                                                                        break Label_4186;
                                                                                    }
                                                                                    case 64: {
                                                                                        n29 = n20;
                                                                                        if (this.z(t, n21, n19)) {
                                                                                            break Label_4328;
                                                                                        }
                                                                                        break Label_4186;
                                                                                    }
                                                                                    case 63: {
                                                                                        n29 = n20;
                                                                                        if (this.z(t, n21, n19)) {
                                                                                            n32 = Q(t, offset);
                                                                                            break Label_4367;
                                                                                        }
                                                                                        break Label_4186;
                                                                                    }
                                                                                    case 62: {
                                                                                        n29 = n20;
                                                                                        if (this.z(t, n21, n19)) {
                                                                                            n33 = Q(t, offset);
                                                                                            break Label_4400;
                                                                                        }
                                                                                        break Label_4186;
                                                                                    }
                                                                                    case 61: {
                                                                                        n29 = n20;
                                                                                        if (this.z(t, n21, n19)) {
                                                                                            break Label_4424;
                                                                                        }
                                                                                        break Label_4186;
                                                                                    }
                                                                                    case 60: {
                                                                                        n29 = n20;
                                                                                        if (this.z(t, n21, n19)) {
                                                                                            break Label_4460;
                                                                                        }
                                                                                        break Label_4186;
                                                                                    }
                                                                                    case 59: {
                                                                                        n29 = n20;
                                                                                        if (!this.z(t, n21, n19)) {
                                                                                            break Label_4186;
                                                                                        }
                                                                                        final Object o4 = o5 = s2.getObject(t, offset);
                                                                                        if (o4 instanceof d0) {
                                                                                            final Object object = o4;
                                                                                            break Label_4520;
                                                                                        }
                                                                                        break Label_4523;
                                                                                    }
                                                                                    case 58: {
                                                                                        n29 = n20;
                                                                                        if (this.z(t, n21, n19)) {
                                                                                            break Label_4550;
                                                                                        }
                                                                                        break Label_4186;
                                                                                    }
                                                                                    case 57: {
                                                                                        n29 = n20;
                                                                                        if (this.z(t, n21, n19)) {
                                                                                            n34 = p0.u0(n21, 0);
                                                                                            break Label_4336;
                                                                                        }
                                                                                        break Label_4186;
                                                                                    }
                                                                                    case 56: {
                                                                                        n29 = n20;
                                                                                        if (this.z(t, n21, n19)) {
                                                                                            final int n35 = p0.l0(n21, 0L);
                                                                                            break Label_4179;
                                                                                        }
                                                                                        break Label_4186;
                                                                                    }
                                                                                    case 55: {
                                                                                        n29 = n20;
                                                                                        if (this.z(t, n21, n19)) {
                                                                                            final int n35 = p0.k0(n21, Q(t, offset));
                                                                                            break Label_4179;
                                                                                        }
                                                                                        break Label_4186;
                                                                                    }
                                                                                    case 54: {
                                                                                        n29 = n20;
                                                                                        if (this.z(t, n21, n19)) {
                                                                                            final int n35 = p0.e0(n21, R(t, offset));
                                                                                            break Label_4179;
                                                                                        }
                                                                                        break Label_4186;
                                                                                    }
                                                                                    case 53: {
                                                                                        n29 = n20;
                                                                                        if (this.z(t, n21, n19)) {
                                                                                            final int n35 = p0.W(n21, R(t, offset));
                                                                                            break Label_4179;
                                                                                        }
                                                                                        break Label_4186;
                                                                                    }
                                                                                    case 52: {
                                                                                        n29 = n20;
                                                                                        if (this.z(t, n21, n19)) {
                                                                                            n34 = p0.z(n21, 0.0f);
                                                                                            break Label_4336;
                                                                                        }
                                                                                        break Label_4186;
                                                                                    }
                                                                                    case 51: {
                                                                                        n29 = n20;
                                                                                        if (this.z(t, n21, n19)) {
                                                                                            final int n35 = p0.y(n21, 0.0);
                                                                                            break Label_4179;
                                                                                        }
                                                                                        break Label_4186;
                                                                                    }
                                                                                    case 50: {
                                                                                        final int n35 = this.r.g(n21, s2.getObject(t, offset), this.D(n19));
                                                                                        break Label_4179;
                                                                                    }
                                                                                    case 49: {
                                                                                        final int n35 = m3.u(n21, (List<s2>)s2.getObject(t, offset), this.C(n19));
                                                                                        break Label_4179;
                                                                                    }
                                                                                    case 48: {
                                                                                        final int q2 = m3.q((List<Long>)s2.getObject(t, offset));
                                                                                        n29 = n20;
                                                                                        if (q2 <= 0) {
                                                                                            break Label_4186;
                                                                                        }
                                                                                        x2 = q2;
                                                                                        if (this.j) {
                                                                                            x2 = q2;
                                                                                            break;
                                                                                        }
                                                                                        break Label_3887;
                                                                                    }
                                                                                    case 47: {
                                                                                        final int j3 = m3.J((List<Integer>)s2.getObject(t, offset));
                                                                                        n29 = n20;
                                                                                        if (j3 <= 0) {
                                                                                            break Label_4186;
                                                                                        }
                                                                                        x2 = j3;
                                                                                        if (this.j) {
                                                                                            x2 = j3;
                                                                                            break;
                                                                                        }
                                                                                        break Label_3887;
                                                                                    }
                                                                                    case 46: {
                                                                                        final int n36 = m3.N((List<?>)s2.getObject(t, offset));
                                                                                        n29 = n20;
                                                                                        if (n36 <= 0) {
                                                                                            break Label_4186;
                                                                                        }
                                                                                        x2 = n36;
                                                                                        if (this.j) {
                                                                                            x2 = n36;
                                                                                            break;
                                                                                        }
                                                                                        break Label_3887;
                                                                                    }
                                                                                    case 45: {
                                                                                        final int l3 = m3.L((List<?>)s2.getObject(t, offset));
                                                                                        n29 = n20;
                                                                                        if (l3 <= 0) {
                                                                                            break Label_4186;
                                                                                        }
                                                                                        x2 = l3;
                                                                                        if (this.j) {
                                                                                            x2 = l3;
                                                                                            break;
                                                                                        }
                                                                                        break Label_3887;
                                                                                    }
                                                                                    case 44: {
                                                                                        final int v2 = m3.v((List<Integer>)s2.getObject(t, offset));
                                                                                        n29 = n20;
                                                                                        if (v2 <= 0) {
                                                                                            break Label_4186;
                                                                                        }
                                                                                        x2 = v2;
                                                                                        if (this.j) {
                                                                                            x2 = v2;
                                                                                            break;
                                                                                        }
                                                                                        break Label_3887;
                                                                                    }
                                                                                    case 43: {
                                                                                        final int g2 = m3.G((List<Integer>)s2.getObject(t, offset));
                                                                                        n29 = n20;
                                                                                        if (g2 <= 0) {
                                                                                            break Label_4186;
                                                                                        }
                                                                                        x2 = g2;
                                                                                        if (this.j) {
                                                                                            x2 = g2;
                                                                                            break;
                                                                                        }
                                                                                        break Label_3887;
                                                                                    }
                                                                                    case 42: {
                                                                                        final int p2 = m3.P((List<?>)s2.getObject(t, offset));
                                                                                        n29 = n20;
                                                                                        if (p2 <= 0) {
                                                                                            break Label_4186;
                                                                                        }
                                                                                        x2 = p2;
                                                                                        if (this.j) {
                                                                                            x2 = p2;
                                                                                            break;
                                                                                        }
                                                                                        break Label_3887;
                                                                                    }
                                                                                    case 41: {
                                                                                        final int l4 = m3.L((List<?>)s2.getObject(t, offset));
                                                                                        n29 = n20;
                                                                                        if (l4 <= 0) {
                                                                                            break Label_4186;
                                                                                        }
                                                                                        x2 = l4;
                                                                                        if (this.j) {
                                                                                            x2 = l4;
                                                                                            break;
                                                                                        }
                                                                                        break Label_3887;
                                                                                    }
                                                                                    case 40: {
                                                                                        final int n37 = m3.N((List<?>)s2.getObject(t, offset));
                                                                                        n29 = n20;
                                                                                        if (n37 <= 0) {
                                                                                            break Label_4186;
                                                                                        }
                                                                                        x2 = n37;
                                                                                        if (this.j) {
                                                                                            x2 = n37;
                                                                                            break;
                                                                                        }
                                                                                        break Label_3887;
                                                                                    }
                                                                                    case 39: {
                                                                                        final int e2 = m3.E((List<Integer>)s2.getObject(t, offset));
                                                                                        n29 = n20;
                                                                                        if (e2 <= 0) {
                                                                                            break Label_4186;
                                                                                        }
                                                                                        x2 = e2;
                                                                                        if (this.j) {
                                                                                            x2 = e2;
                                                                                            break;
                                                                                        }
                                                                                        break Label_3887;
                                                                                    }
                                                                                    case 38: {
                                                                                        final int j4 = m3.j((List<Long>)s2.getObject(t, offset));
                                                                                        n29 = n20;
                                                                                        if (j4 <= 0) {
                                                                                            break Label_4186;
                                                                                        }
                                                                                        x2 = j4;
                                                                                        if (this.j) {
                                                                                            x2 = j4;
                                                                                            break;
                                                                                        }
                                                                                        break Label_3887;
                                                                                    }
                                                                                    case 37: {
                                                                                        final int a3 = m3.a((List<Long>)s2.getObject(t, offset));
                                                                                        n29 = n20;
                                                                                        if (a3 <= 0) {
                                                                                            break Label_4186;
                                                                                        }
                                                                                        x2 = a3;
                                                                                        if (this.j) {
                                                                                            x2 = a3;
                                                                                            break;
                                                                                        }
                                                                                        break Label_3887;
                                                                                    }
                                                                                    case 36: {
                                                                                        final int l5 = m3.L((List<?>)s2.getObject(t, offset));
                                                                                        n29 = n20;
                                                                                        if (l5 <= 0) {
                                                                                            break Label_4186;
                                                                                        }
                                                                                        x2 = l5;
                                                                                        if (this.j) {
                                                                                            x2 = l5;
                                                                                            break;
                                                                                        }
                                                                                        break Label_3887;
                                                                                    }
                                                                                    case 35: {
                                                                                        final int n38 = m3.N((List<?>)s2.getObject(t, offset));
                                                                                        n29 = n20;
                                                                                        if (n38 <= 0) {
                                                                                            break Label_4186;
                                                                                        }
                                                                                        x2 = n38;
                                                                                        if (this.j) {
                                                                                            x2 = n38;
                                                                                            break;
                                                                                        }
                                                                                        break Label_3887;
                                                                                    }
                                                                                    case 34: {
                                                                                        final int n35 = m3.X(n21, (List<Long>)s2.getObject(t, offset), false);
                                                                                        break Label_4179;
                                                                                    }
                                                                                    case 33: {
                                                                                        final int n35 = m3.b0(n21, (List<Integer>)s2.getObject(t, offset), false);
                                                                                        break Label_4179;
                                                                                    }
                                                                                    case 30: {
                                                                                        final int n35 = m3.Y(n21, (List<Integer>)s2.getObject(t, offset), false);
                                                                                        break Label_4179;
                                                                                    }
                                                                                    case 29: {
                                                                                        final int n35 = m3.a0(n21, (List<Integer>)s2.getObject(t, offset), false);
                                                                                        break Label_4179;
                                                                                    }
                                                                                    case 28: {
                                                                                        final int n35 = m3.t(n21, (List<d0>)s2.getObject(t, offset));
                                                                                        break Label_4179;
                                                                                    }
                                                                                    case 27: {
                                                                                        final int n35 = m3.p(n21, (List<?>)s2.getObject(t, offset), this.C(n19));
                                                                                        break Label_4179;
                                                                                    }
                                                                                    case 26: {
                                                                                        final int n35 = m3.o(n21, (List<?>)s2.getObject(t, offset));
                                                                                        break Label_4179;
                                                                                    }
                                                                                    case 25: {
                                                                                        final int n35 = m3.e0(n21, (List<?>)s2.getObject(t, offset), false);
                                                                                        break Label_4179;
                                                                                    }
                                                                                    case 22: {
                                                                                        final int n35 = m3.Z(n21, (List<Integer>)s2.getObject(t, offset), false);
                                                                                        break Label_4179;
                                                                                    }
                                                                                    case 21: {
                                                                                        final int n35 = m3.W(n21, (List<Long>)s2.getObject(t, offset), false);
                                                                                        break Label_4179;
                                                                                    }
                                                                                    case 20: {
                                                                                        final int n35 = m3.V(n21, (List<Long>)s2.getObject(t, offset), false);
                                                                                        break Label_4179;
                                                                                    }
                                                                                    case 19:
                                                                                    case 24:
                                                                                    case 31: {
                                                                                        final int n35 = m3.c0(n21, (List<?>)s2.getObject(t, offset), false);
                                                                                        break Label_4179;
                                                                                    }
                                                                                    case 18:
                                                                                    case 23:
                                                                                    case 32: {
                                                                                        final int n35 = m3.d0(n21, (List<?>)s2.getObject(t, offset), false);
                                                                                        break Label_4179;
                                                                                    }
                                                                                    case 17: {
                                                                                        n29 = n20;
                                                                                        if ((n28 & n25) != 0x0) {
                                                                                            break Label_4201;
                                                                                        }
                                                                                        break Label_4186;
                                                                                    }
                                                                                    case 16: {
                                                                                        n29 = n20;
                                                                                        if ((n28 & n25) != 0x0) {
                                                                                            n30 = s2.getLong(t, offset);
                                                                                            break Label_4248;
                                                                                        }
                                                                                        break Label_4186;
                                                                                    }
                                                                                    case 15: {
                                                                                        n29 = n20;
                                                                                        if ((n28 & n25) != 0x0) {
                                                                                            n31 = s2.getInt(t, offset);
                                                                                            break Label_4281;
                                                                                        }
                                                                                        break Label_4186;
                                                                                    }
                                                                                    case 14: {
                                                                                        n29 = n20;
                                                                                        if ((n28 & n25) != 0x0) {
                                                                                            break Label_4305;
                                                                                        }
                                                                                        break Label_4186;
                                                                                    }
                                                                                    case 13: {
                                                                                        n29 = n20;
                                                                                        if ((n28 & n25) != 0x0) {
                                                                                            break Label_4328;
                                                                                        }
                                                                                        break Label_4186;
                                                                                    }
                                                                                    case 12: {
                                                                                        n29 = n20;
                                                                                        if ((n28 & n25) != 0x0) {
                                                                                            n32 = s2.getInt(t, offset);
                                                                                            break Label_4367;
                                                                                        }
                                                                                        break Label_4186;
                                                                                    }
                                                                                    case 11: {
                                                                                        n29 = n20;
                                                                                        if ((n28 & n25) != 0x0) {
                                                                                            n33 = s2.getInt(t, offset);
                                                                                            break Label_4400;
                                                                                        }
                                                                                        break Label_4186;
                                                                                    }
                                                                                    case 10: {
                                                                                        n29 = n20;
                                                                                        if ((n28 & n25) != 0x0) {
                                                                                            break Label_4424;
                                                                                        }
                                                                                        break Label_4186;
                                                                                    }
                                                                                    case 9: {
                                                                                        n29 = n20;
                                                                                        if ((n28 & n25) != 0x0) {
                                                                                            break Label_4460;
                                                                                        }
                                                                                        break Label_4186;
                                                                                    }
                                                                                    case 8: {
                                                                                        n29 = n20;
                                                                                        if ((n28 & n25) == 0x0) {
                                                                                            break Label_4186;
                                                                                        }
                                                                                        final Object o6 = o5 = s2.getObject(t, offset);
                                                                                        if (o6 instanceof d0) {
                                                                                            final Object object = o6;
                                                                                            break Label_4520;
                                                                                        }
                                                                                        break Label_4523;
                                                                                    }
                                                                                    case 7: {
                                                                                        n29 = n20;
                                                                                        if ((n28 & n25) != 0x0) {
                                                                                            break Label_4550;
                                                                                        }
                                                                                        break Label_4186;
                                                                                    }
                                                                                    case 6: {
                                                                                        n29 = n20;
                                                                                        if ((n28 & n25) != 0x0) {
                                                                                            n29 = n20 + p0.u0(n21, 0);
                                                                                        }
                                                                                        break Label_4186;
                                                                                    }
                                                                                    case 5: {
                                                                                        n29 = n20;
                                                                                        if ((n28 & n25) != 0x0) {
                                                                                            n39 = p0.l0(n21, 0L);
                                                                                            break Label_4179;
                                                                                        }
                                                                                        break Label_4701;
                                                                                    }
                                                                                    case 4: {
                                                                                        n29 = n20;
                                                                                        if ((n28 & n25) != 0x0) {
                                                                                            n39 = p0.k0(n21, s2.getInt(t, offset));
                                                                                            break Label_4179;
                                                                                        }
                                                                                        break Label_4701;
                                                                                    }
                                                                                    case 3: {
                                                                                        n29 = n20;
                                                                                        if ((n28 & n25) != 0x0) {
                                                                                            n39 = p0.e0(n21, s2.getLong(t, offset));
                                                                                            break Label_4179;
                                                                                        }
                                                                                        break Label_4701;
                                                                                    }
                                                                                    case 2: {
                                                                                        n29 = n20;
                                                                                        if ((n28 & n25) != 0x0) {
                                                                                            n39 = p0.W(n21, s2.getLong(t, offset));
                                                                                            break Label_4179;
                                                                                        }
                                                                                        break Label_4701;
                                                                                    }
                                                                                    case 1: {
                                                                                        n29 = n20;
                                                                                        if ((n28 & n25) != 0x0) {
                                                                                            n29 = n20 + p0.z(n21, 0.0f);
                                                                                        }
                                                                                        break Label_4701;
                                                                                    }
                                                                                    case 0: {
                                                                                        n29 = n20;
                                                                                        if ((n28 & n25) != 0x0) {
                                                                                            n29 = n20 + p0.y(n21, 0.0);
                                                                                        }
                                                                                        break Label_4701;
                                                                                    }
                                                                                }
                                                                                s2.putInt(t, n27, x2);
                                                                            }
                                                                            n34 = p0.C0(n21) + p0.E0(x2) + x2;
                                                                            break Label_4336;
                                                                            int n35 = 0;
                                                                            n29 = n20 + n35;
                                                                            break Label_4701;
                                                                        }
                                                                        final int n35 = p0.P(n21, (s2)s2.getObject(t, offset), this.C(n19));
                                                                        continue Label_4179;
                                                                    }
                                                                    final int n35 = p0.h0(n21, n30);
                                                                    continue Label_4179;
                                                                }
                                                                final int n35 = p0.s0(n21, n31);
                                                                continue Label_4179;
                                                            }
                                                            final int n35 = p0.p0(n21, 0L);
                                                            continue Label_4179;
                                                        }
                                                        n34 = p0.w0(n21, 0);
                                                    }
                                                    n29 = n20 + n34;
                                                    continue Label_4179_Outer;
                                                }
                                                final int n35 = p0.x0(n21, n32);
                                                continue Label_4179;
                                            }
                                            final int n35 = p0.o0(n21, n33);
                                            continue Label_4179;
                                        }
                                        final Object object = s2.getObject(t, offset);
                                        final int n35 = p0.N(n21, (d0)object);
                                        continue Label_4179;
                                    }
                                    final int n35 = m3.n(n21, s2.getObject(t, offset), this.C(n19));
                                    continue Label_4179;
                                }
                                continue;
                            }
                        }
                        final int n35 = p0.C(n21, (String)o5);
                        continue Label_4179;
                    }
                    final int n35 = p0.Q(n21, true);
                    continue Label_4179;
                }
                n29 = n20 + n39;
            }
            n19 += 4;
            n20 = n29;
            int1 = n28;
        }
        int n40 = n20 + m(this.p, t);
        if (this.g) {
            n40 += this.q.b(t).m();
        }
        return n40;
    }
    
    @Override
    public final void f(final T t, final byte[] array, int i, final int n, final z z) throws IOException {
        if (!this.i) {
            this.q(t, array, i, n, 0, z);
            return;
        }
        final Unsafe s = w2.s;
        while (i < n) {
            int d = i + 1;
            int a = array[i];
            if (a < 0) {
                d = y.d(a, array, d, z);
                a = z.a;
            }
            final int n2 = a >>> 3;
            final int n3 = a & 0x7;
            final int h = this.H(n2);
            Label_0904: {
                Label_0901: {
                    if (h >= 0) {
                        final int n4 = this.a[h + 1];
                        i = (0xFF00000 & n4) >>> 20;
                        final long n5 = 0xFFFFF & n4;
                        if (i <= 17) {
                            boolean b = true;
                            Label_0639: {
                                Label_0611: {
                                    long x = 0L;
                                    Label_0578: {
                                        int x2 = 0;
                                        Label_0542: {
                                            Label_0525: {
                                                Object x3 = null;
                                                Label_0314: {
                                                    switch (i) {
                                                        default: {
                                                            break Label_0901;
                                                        }
                                                        case 16: {
                                                            if (n3 == 0) {
                                                                i = y.g(array, d, z);
                                                                x = m0.a(z.b);
                                                                break Label_0578;
                                                            }
                                                            break Label_0901;
                                                        }
                                                        case 15: {
                                                            if (n3 == 0) {
                                                                i = y.e(array, d, z);
                                                                x2 = m0.e(z.a);
                                                                break Label_0542;
                                                            }
                                                            break Label_0901;
                                                        }
                                                        case 12: {
                                                            if (n3 == 0) {
                                                                break Label_0525;
                                                            }
                                                            break Label_0901;
                                                        }
                                                        case 10: {
                                                            if (n3 == 2) {
                                                                i = y.m(array, d, z);
                                                                break;
                                                            }
                                                            break Label_0901;
                                                        }
                                                        case 9: {
                                                            if (n3 != 2) {
                                                                break Label_0901;
                                                            }
                                                            i = l(this.C(h), array, d, n, z);
                                                            final Object object = s.getObject(t, n5);
                                                            if (object == null) {
                                                                break;
                                                            }
                                                            x3 = l1.d(object, z.c);
                                                            break Label_0314;
                                                        }
                                                        case 8: {
                                                            if (n3 != 2) {
                                                                break Label_0901;
                                                            }
                                                            if ((0x20000000 & n4) == 0x0) {
                                                                i = y.i(array, d, z);
                                                                break;
                                                            }
                                                            i = y.j(array, d, z);
                                                            break;
                                                        }
                                                        case 7: {
                                                            if (n3 == 0) {
                                                                i = y.g(array, d, z);
                                                                if (z.b == 0L) {
                                                                    b = false;
                                                                }
                                                                j4.j(t, n5, b);
                                                                continue;
                                                            }
                                                            break Label_0901;
                                                        }
                                                        case 6:
                                                        case 13: {
                                                            if (n3 == 5) {
                                                                s.putInt(t, n5, y.h(array, d));
                                                                break Label_0611;
                                                            }
                                                            break Label_0901;
                                                        }
                                                        case 5:
                                                        case 14: {
                                                            if (n3 == 1) {
                                                                s.putLong(t, n5, y.k(array, d));
                                                                break Label_0639;
                                                            }
                                                            break Label_0901;
                                                        }
                                                        case 4:
                                                        case 11: {
                                                            if (n3 == 0) {
                                                                break Label_0525;
                                                            }
                                                            break Label_0901;
                                                        }
                                                        case 2:
                                                        case 3: {
                                                            if (n3 == 0) {
                                                                i = y.g(array, d, z);
                                                                x = z.b;
                                                                break Label_0578;
                                                            }
                                                            break Label_0901;
                                                        }
                                                        case 1: {
                                                            if (n3 == 5) {
                                                                j4.f(t, n5, y.n(array, d));
                                                                break Label_0611;
                                                            }
                                                            break Label_0901;
                                                        }
                                                        case 0: {
                                                            if (n3 == 1) {
                                                                j4.e(t, n5, y.l(array, d));
                                                                break Label_0639;
                                                            }
                                                            break Label_0901;
                                                        }
                                                    }
                                                    x3 = z.c;
                                                }
                                                s.putObject(t, n5, x3);
                                                continue;
                                            }
                                            i = y.e(array, d, z);
                                            x2 = z.a;
                                        }
                                        s.putInt(t, n5, x2);
                                        continue;
                                    }
                                    s.putLong(t, n5, x);
                                    continue;
                                }
                                i = d + 4;
                                continue;
                            }
                            i = d + 8;
                            continue;
                        }
                        if (i != 27) {
                            if (i <= 49) {
                                final int o = this.o(t, array, d, n, a, n2, n3, h, n4, i, n5, z);
                                if ((i = o) != d) {
                                    continue;
                                }
                                i = o;
                            }
                            else {
                                final int n6 = d;
                                if (i == 50) {
                                    if (n3 != 2) {
                                        break Label_0901;
                                    }
                                    final int p5 = this.p(t, array, n6, n, h, n2, n5, z);
                                    if ((i = p5) != n6) {
                                        continue;
                                    }
                                    i = p5;
                                }
                                else {
                                    final int n7 = this.n(t, array, n6, n, a, n2, n3, n4, i, n5, h, z);
                                    if ((i = n7) != n6) {
                                        continue;
                                    }
                                    i = n7;
                                }
                            }
                            break Label_0904;
                        }
                        if (n3 == 2) {
                            q1<?> j3;
                            final q1 q1 = j3 = (q1<?>)s.getObject(t, n5);
                            if (!q1.Q()) {
                                i = q1.size();
                                if (i == 0) {
                                    i = 10;
                                }
                                else {
                                    i <<= 1;
                                }
                                j3 = q1.J3(i);
                                s.putObject(t, n5, j3);
                            }
                            i = j(this.C(h), a, array, d, n, j3, z);
                            continue;
                        }
                    }
                }
                i = d;
            }
            i = a(a, array, i, n, t, z);
        }
        if (i == n) {
            return;
        }
        throw r1.d();
    }
    
    @Override
    public final boolean g(final T t, final T t2) {
        final int length = this.a.length;
        int n = 0;
        while (true) {
            boolean y = true;
            if (n >= length) {
                return this.p.k(t).equals(this.p.k(t2)) && (!this.g || this.q.b(t).equals(this.q.b(t2)));
            }
            final int f = this.F(n);
            final long n2 = f & 0xFFFFF;
            Label_0943: {
                switch ((f & 0xFF00000) >>> 20) {
                    default: {
                        break Label_0943;
                    }
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68: {
                        final long n3 = this.G(n) & 0xFFFFF;
                        if (j4.H(t, n3) != j4.H(t2, n3)) {
                            break;
                        }
                        if (!m3.y(j4.M(t, n2), j4.M(t2, n2))) {
                            break;
                        }
                        break Label_0943;
                    }
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                    case 50: {
                        y = m3.y(j4.M(t, n2), j4.M(t2, n2));
                        break Label_0943;
                    }
                    case 17: {
                        if (!this.M(t, t2, n)) {
                            break;
                        }
                        if (!m3.y(j4.M(t, n2), j4.M(t2, n2))) {
                            break;
                        }
                        break Label_0943;
                    }
                    case 16: {
                        if (!this.M(t, t2, n)) {
                            break;
                        }
                        if (j4.I(t, n2) != j4.I(t2, n2)) {
                            break;
                        }
                        break Label_0943;
                    }
                    case 15: {
                        if (!this.M(t, t2, n)) {
                            break;
                        }
                        if (j4.H(t, n2) != j4.H(t2, n2)) {
                            break;
                        }
                        break Label_0943;
                    }
                    case 14: {
                        if (!this.M(t, t2, n)) {
                            break;
                        }
                        if (j4.I(t, n2) != j4.I(t2, n2)) {
                            break;
                        }
                        break Label_0943;
                    }
                    case 13: {
                        if (!this.M(t, t2, n)) {
                            break;
                        }
                        if (j4.H(t, n2) != j4.H(t2, n2)) {
                            break;
                        }
                        break Label_0943;
                    }
                    case 12: {
                        if (!this.M(t, t2, n)) {
                            break;
                        }
                        if (j4.H(t, n2) != j4.H(t2, n2)) {
                            break;
                        }
                        break Label_0943;
                    }
                    case 11: {
                        if (!this.M(t, t2, n)) {
                            break;
                        }
                        if (j4.H(t, n2) != j4.H(t2, n2)) {
                            break;
                        }
                        break Label_0943;
                    }
                    case 10: {
                        if (!this.M(t, t2, n)) {
                            break;
                        }
                        if (!m3.y(j4.M(t, n2), j4.M(t2, n2))) {
                            break;
                        }
                        break Label_0943;
                    }
                    case 9: {
                        if (!this.M(t, t2, n)) {
                            break;
                        }
                        if (!m3.y(j4.M(t, n2), j4.M(t2, n2))) {
                            break;
                        }
                        break Label_0943;
                    }
                    case 8: {
                        if (!this.M(t, t2, n)) {
                            break;
                        }
                        if (!m3.y(j4.M(t, n2), j4.M(t2, n2))) {
                            break;
                        }
                        break Label_0943;
                    }
                    case 7: {
                        if (!this.M(t, t2, n)) {
                            break;
                        }
                        if (j4.J(t, n2) != j4.J(t2, n2)) {
                            break;
                        }
                        break Label_0943;
                    }
                    case 6: {
                        if (!this.M(t, t2, n)) {
                            break;
                        }
                        if (j4.H(t, n2) != j4.H(t2, n2)) {
                            break;
                        }
                        break Label_0943;
                    }
                    case 5: {
                        if (!this.M(t, t2, n)) {
                            break;
                        }
                        if (j4.I(t, n2) != j4.I(t2, n2)) {
                            break;
                        }
                        break Label_0943;
                    }
                    case 4: {
                        if (!this.M(t, t2, n)) {
                            break;
                        }
                        if (j4.H(t, n2) != j4.H(t2, n2)) {
                            break;
                        }
                        break Label_0943;
                    }
                    case 3: {
                        if (!this.M(t, t2, n)) {
                            break;
                        }
                        if (j4.I(t, n2) != j4.I(t2, n2)) {
                            break;
                        }
                        break Label_0943;
                    }
                    case 2: {
                        if (!this.M(t, t2, n)) {
                            break;
                        }
                        if (j4.I(t, n2) != j4.I(t2, n2)) {
                            break;
                        }
                        break Label_0943;
                    }
                    case 1: {
                        if (!this.M(t, t2, n)) {
                            break;
                        }
                        if (j4.H(t, n2) != j4.H(t2, n2)) {
                            break;
                        }
                        break Label_0943;
                    }
                    case 0: {
                        if (!this.M(t, t2, n) || j4.I(t, n2) != j4.I(t2, n2)) {
                            break;
                        }
                        break Label_0943;
                    }
                }
                y = false;
            }
            if (!y) {
                return false;
            }
            n += 4;
        }
    }
    
    @Override
    public final boolean h(final T o) {
        final int[] k = this.k;
        if (k != null) {
            if (k.length != 0) {
                int n = -1;
                final int length = k.length;
                int i = 0;
                int int1 = 0;
                while (i < length) {
                    final int n2 = k[i];
                    final int h = this.H(n2);
                    final int f = this.F(h);
                    int n5;
                    if (!this.i) {
                        final int n3 = this.a[h + 2];
                        final int n4 = n3 & 0xFFFFF;
                        n5 = 1 << (n3 >>> 20);
                        if (n4 != n) {
                            int1 = w2.s.getInt(o, n4);
                            n = n4;
                        }
                    }
                    else {
                        n5 = 0;
                    }
                    if ((0x10000000 & f) != 0x0 && !this.A(o, h, int1, n5)) {
                        return false;
                    }
                    final int n6 = (0xFF00000 & f) >>> 20;
                    Label_0524: {
                        if (n6 != 9 && n6 != 17) {
                            if (n6 != 27) {
                                if (n6 != 60 && n6 != 68) {
                                    if (n6 != 49) {
                                        if (n6 != 50) {
                                            break Label_0524;
                                        }
                                        final Map<?, ?> j = this.r.i(j4.M(o, f & 0xFFFFF));
                                        boolean b2 = false;
                                        Label_0368: {
                                            if (!j.isEmpty() && this.r.e(this.D(h)).c.b() == w4.P) {
                                                k3<?> k2 = null;
                                                for (final Object next : j.values()) {
                                                    k3<?> b;
                                                    if ((b = k2) == null) {
                                                        b = f3.a().b(next.getClass());
                                                    }
                                                    k2 = b;
                                                    if (!b.h(next)) {
                                                        b2 = false;
                                                        break Label_0368;
                                                    }
                                                }
                                            }
                                            b2 = true;
                                        }
                                        if (!b2) {
                                            return false;
                                        }
                                        break Label_0524;
                                    }
                                }
                                else {
                                    if (this.z(o, n2, h) && !B(o, f, this.C(h))) {
                                        return false;
                                    }
                                    break Label_0524;
                                }
                            }
                            final List list = (List)j4.M(o, f & 0xFFFFF);
                            boolean b3 = false;
                            Label_0486: {
                                if (!list.isEmpty()) {
                                    final k3 c = this.C(h);
                                    for (int l = 0; l < list.size(); ++l) {
                                        if (!c.h(list.get(l))) {
                                            b3 = false;
                                            break Label_0486;
                                        }
                                    }
                                }
                                b3 = true;
                            }
                            if (!b3) {
                                return false;
                            }
                        }
                        else if (this.A(o, h, int1, n5) && !B(o, f, this.C(h))) {
                            return false;
                        }
                    }
                    ++i;
                }
                if (this.g && !this.q.b(o).d()) {
                    return false;
                }
            }
        }
        return true;
    }
    
    @Override
    public final int i(final T t) {
        final int length = this.a.length;
        int i = 0;
        int n = 0;
        while (i < length) {
            final int f = this.F(i);
            final int n2 = this.a[i];
            final long n3 = 0xFFFFF & f;
            int hashCode = 37;
            int n4 = 0;
            Label_0981: {
                int n5 = 0;
                int n6 = 0;
                Label_0974: {
                    long n7 = 0L;
                    Label_0967: {
                        double value2 = 0.0;
                        Label_0960: {
                            float value = 0.0f;
                            Label_0935: {
                                boolean b = false;
                                Label_0874: {
                                    Label_0822: {
                                        Object o = null;
                                        Label_0815: {
                                            Object o2 = null;
                                            Label_0792: {
                                                Label_0677: {
                                                    Label_0626: {
                                                        Label_0506: {
                                                            Label_0835: {
                                                                switch ((f & 0xFF00000) >>> 20) {
                                                                    default: {
                                                                        n4 = n;
                                                                        break Label_0981;
                                                                    }
                                                                    case 68: {
                                                                        n4 = n;
                                                                        if (this.z(t, n2, i)) {
                                                                            break Label_0506;
                                                                        }
                                                                        break Label_0981;
                                                                    }
                                                                    case 67: {
                                                                        n4 = n;
                                                                        if (this.z(t, n2, i)) {
                                                                            break Label_0677;
                                                                        }
                                                                        break Label_0981;
                                                                    }
                                                                    case 66: {
                                                                        n4 = n;
                                                                        if (this.z(t, n2, i)) {
                                                                            break;
                                                                        }
                                                                        break Label_0981;
                                                                    }
                                                                    case 65: {
                                                                        n4 = n;
                                                                        if (this.z(t, n2, i)) {
                                                                            break Label_0677;
                                                                        }
                                                                        break Label_0981;
                                                                    }
                                                                    case 64: {
                                                                        n4 = n;
                                                                        if (this.z(t, n2, i)) {
                                                                            break;
                                                                        }
                                                                        break Label_0981;
                                                                    }
                                                                    case 63: {
                                                                        n4 = n;
                                                                        if (this.z(t, n2, i)) {
                                                                            break;
                                                                        }
                                                                        break Label_0981;
                                                                    }
                                                                    case 62: {
                                                                        n4 = n;
                                                                        if (this.z(t, n2, i)) {
                                                                            break;
                                                                        }
                                                                        break Label_0981;
                                                                    }
                                                                    case 61: {
                                                                        n4 = n;
                                                                        if (this.z(t, n2, i)) {
                                                                            break Label_0835;
                                                                        }
                                                                        break Label_0981;
                                                                    }
                                                                    case 60: {
                                                                        n4 = n;
                                                                        if (this.z(t, n2, i)) {
                                                                            break Label_0506;
                                                                        }
                                                                        break Label_0981;
                                                                    }
                                                                    case 59: {
                                                                        n4 = n;
                                                                        if (this.z(t, n2, i)) {
                                                                            break Label_0835;
                                                                        }
                                                                        break Label_0981;
                                                                    }
                                                                    case 58: {
                                                                        n4 = n;
                                                                        if (this.z(t, n2, i)) {
                                                                            n5 = n * 53;
                                                                            b = S(t, n3);
                                                                            break Label_0874;
                                                                        }
                                                                        break Label_0981;
                                                                    }
                                                                    case 57: {
                                                                        n4 = n;
                                                                        if (this.z(t, n2, i)) {
                                                                            break;
                                                                        }
                                                                        break Label_0981;
                                                                    }
                                                                    case 56: {
                                                                        n4 = n;
                                                                        if (this.z(t, n2, i)) {
                                                                            break Label_0677;
                                                                        }
                                                                        break Label_0981;
                                                                    }
                                                                    case 55: {
                                                                        n4 = n;
                                                                        if (this.z(t, n2, i)) {
                                                                            break;
                                                                        }
                                                                        break Label_0981;
                                                                    }
                                                                    case 54: {
                                                                        n4 = n;
                                                                        if (this.z(t, n2, i)) {
                                                                            break Label_0677;
                                                                        }
                                                                        break Label_0981;
                                                                    }
                                                                    case 53: {
                                                                        n4 = n;
                                                                        if (this.z(t, n2, i)) {
                                                                            break Label_0677;
                                                                        }
                                                                        break Label_0981;
                                                                    }
                                                                    case 52: {
                                                                        n4 = n;
                                                                        if (this.z(t, n2, i)) {
                                                                            n5 = n * 53;
                                                                            value = P(t, n3);
                                                                            break Label_0935;
                                                                        }
                                                                        break Label_0981;
                                                                    }
                                                                    case 51: {
                                                                        n4 = n;
                                                                        if (this.z(t, n2, i)) {
                                                                            n5 = n * 53;
                                                                            value2 = O(t, n3);
                                                                            break Label_0960;
                                                                        }
                                                                        break Label_0981;
                                                                    }
                                                                    case 17: {
                                                                        o = j4.M(t, n3);
                                                                        if (o != null) {
                                                                            break Label_0815;
                                                                        }
                                                                        break Label_0822;
                                                                    }
                                                                    case 10:
                                                                    case 18:
                                                                    case 19:
                                                                    case 20:
                                                                    case 21:
                                                                    case 22:
                                                                    case 23:
                                                                    case 24:
                                                                    case 25:
                                                                    case 26:
                                                                    case 27:
                                                                    case 28:
                                                                    case 29:
                                                                    case 30:
                                                                    case 31:
                                                                    case 32:
                                                                    case 33:
                                                                    case 34:
                                                                    case 35:
                                                                    case 36:
                                                                    case 37:
                                                                    case 38:
                                                                    case 39:
                                                                    case 40:
                                                                    case 41:
                                                                    case 42:
                                                                    case 43:
                                                                    case 44:
                                                                    case 45:
                                                                    case 46:
                                                                    case 47:
                                                                    case 48:
                                                                    case 49:
                                                                    case 50: {
                                                                        n5 = n * 53;
                                                                        o2 = j4.M(t, n3);
                                                                        break Label_0792;
                                                                    }
                                                                    case 9: {
                                                                        o = j4.M(t, n3);
                                                                        if (o != null) {
                                                                            break Label_0815;
                                                                        }
                                                                        break Label_0822;
                                                                    }
                                                                    case 8: {
                                                                        n5 = n * 53;
                                                                        n6 = ((String)j4.M(t, n3)).hashCode();
                                                                        break Label_0974;
                                                                    }
                                                                    case 7: {
                                                                        n5 = n * 53;
                                                                        b = j4.J(t, n3);
                                                                        break Label_0874;
                                                                    }
                                                                    case 4:
                                                                    case 6:
                                                                    case 11:
                                                                    case 12:
                                                                    case 13:
                                                                    case 15: {
                                                                        n5 = n * 53;
                                                                        n6 = j4.H(t, n3);
                                                                        break Label_0974;
                                                                    }
                                                                    case 2:
                                                                    case 3:
                                                                    case 5:
                                                                    case 14:
                                                                    case 16: {
                                                                        n5 = n * 53;
                                                                        n7 = j4.I(t, n3);
                                                                        break Label_0967;
                                                                    }
                                                                    case 1: {
                                                                        n5 = n * 53;
                                                                        value = j4.K(t, n3);
                                                                        break Label_0935;
                                                                    }
                                                                    case 0: {
                                                                        n5 = n * 53;
                                                                        value2 = j4.L(t, n3);
                                                                        break Label_0960;
                                                                    }
                                                                }
                                                            }
                                                            break Label_0626;
                                                        }
                                                        o2 = j4.M(t, n3);
                                                        n5 = n * 53;
                                                        break Label_0792;
                                                    }
                                                    n5 = n * 53;
                                                    n6 = Q(t, n3);
                                                    break Label_0974;
                                                }
                                                n5 = n * 53;
                                                n7 = R(t, n3);
                                                break Label_0967;
                                            }
                                            n6 = o2.hashCode();
                                            break Label_0974;
                                        }
                                        hashCode = o.hashCode();
                                    }
                                    n4 = n * 53 + hashCode;
                                    break Label_0981;
                                }
                                n6 = l1.f(b);
                                break Label_0974;
                            }
                            n6 = Float.floatToIntBits(value);
                            break Label_0974;
                        }
                        n7 = Double.doubleToLongBits(value2);
                    }
                    n6 = l1.j(n7);
                }
                n4 = n5 + n6;
            }
            i += 4;
            n = n4;
        }
        int n8 = n * 53 + this.p.k(t).hashCode();
        if (this.g) {
            n8 = n8 * 53 + this.q.b(t).hashCode();
        }
        return n8;
    }
    
    @Override
    public final T newInstance() {
        return (T)this.n.a(this.f);
    }
}
