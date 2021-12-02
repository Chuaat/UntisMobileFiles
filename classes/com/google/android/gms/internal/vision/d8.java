// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.util.Objects;
import java.util.Arrays;
import java.util.Iterator;
import java.lang.reflect.Field;
import java.io.Serializable;
import java.lang.constant.Constable;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

final class d8<T> implements s8<T>
{
    private static final int[] r;
    private static final Unsafe s;
    private final int[] a;
    private final Object[] b;
    private final int c;
    private final int d;
    private final z7 e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final int[] j;
    private final int k;
    private final int l;
    private final h8 m;
    private final i7 n;
    private final k9<?, ?> o;
    private final d6<?> p;
    private final w7 q;
    
    static {
        r = new int[0];
        s = r9.t();
    }
    
    private d8(final int[] a, final Object[] b, final int c, final int d, final z7 e, final boolean h, final boolean b2, final int[] j, final int k, final int l, final h8 m, final i7 n, final k9<?, ?> o, final d6<?> p15, final w7 q) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.g = (e instanceof p6);
        this.h = h;
        this.f = (p15 != null && p15.h(e));
        this.i = false;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.p = p15;
        this.e = e;
        this.q = q;
    }
    
    private final void A(final T t, final T t2, final int n) {
        final long n2 = this.P(n) & 0xFFFFF;
        if (!this.B(t2, n)) {
            return;
        }
        final Object f = r9.F(t, n2);
        final Object f2 = r9.F(t2, n2);
        if (f != null && f2 != null) {
            r9.j(t, n2, t6.e(f, f2));
            this.I(t, n);
            return;
        }
        if (f2 != null) {
            r9.j(t, n2, f2);
            this.I(t, n);
        }
    }
    
    private final boolean B(final T t, int p2) {
        final int r = this.R(p2);
        final long n = r & 0xFFFFF;
        if (n != 1048575L) {
            return (r9.b(t, n) & 1 << (r >>> 20)) != 0x0;
        }
        p2 = this.P(p2);
        final long n2 = p2 & 0xFFFFF;
        switch ((p2 & 0xFF00000) >>> 20) {
            default: {
                throw new IllegalArgumentException();
            }
            case 17: {
                return r9.F(t, n2) != null;
            }
            case 16: {
                return r9.o(t, n2) != 0L;
            }
            case 15: {
                return r9.b(t, n2) != 0;
            }
            case 14: {
                return r9.o(t, n2) != 0L;
            }
            case 13: {
                return r9.b(t, n2) != 0;
            }
            case 12: {
                return r9.b(t, n2) != 0;
            }
            case 11: {
                return r9.b(t, n2) != 0;
            }
            case 10: {
                return !f5.H.equals(r9.F(t, n2));
            }
            case 9: {
                return r9.F(t, n2) != null;
            }
            case 8: {
                final Object f = r9.F(t, n2);
                if (f instanceof String) {
                    return !((String)f).isEmpty();
                }
                if (f instanceof f5) {
                    return !f5.H.equals(f);
                }
                throw new IllegalArgumentException();
            }
            case 7: {
                return r9.w(t, n2);
            }
            case 6: {
                return r9.b(t, n2) != 0;
            }
            case 5: {
                return r9.o(t, n2) != 0L;
            }
            case 4: {
                return r9.b(t, n2) != 0;
            }
            case 3: {
                return r9.o(t, n2) != 0L;
            }
            case 2: {
                return r9.o(t, n2) != 0L;
            }
            case 1: {
                return r9.x(t, n2) != 0.0f;
            }
            case 0: {
                return r9.C(t, n2) != 0.0;
            }
        }
    }
    
    private final boolean C(final T t, final int n, final int n2) {
        return r9.b(t, this.R(n2) & 0xFFFFF) == n;
    }
    
    private final boolean D(final T t, final int n, final int n2, final int n3, final int n4) {
        if (n2 == 1048575) {
            return this.B(t, n);
        }
        return (n3 & n4) != 0x0;
    }
    
    private static boolean E(final Object o, final int n, final s8 s8) {
        return s8.e(r9.F(o, n & 0xFFFFF));
    }
    
    private static <T> double F(final T t, final long n) {
        return (double)r9.F(t, n);
    }
    
    private final int G(final int n, int i) {
        int n2 = this.a.length / 3 - 1;
        while (i <= n2) {
            final int n3 = n2 + i >>> 1;
            final int n4 = n3 * 3;
            final int n5 = this.a[n4];
            if (n == n5) {
                return n4;
            }
            if (n < n5) {
                n2 = n3 - 1;
            }
            else {
                i = n3 + 1;
            }
        }
        return -1;
    }
    
    private final Object H(final int n) {
        return this.b[n / 3 << 1];
    }
    
    private final void I(final T t, int r) {
        r = this.R(r);
        final long n = 0xFFFFF & r;
        if (n == 1048575L) {
            return;
        }
        r9.h(t, n, 1 << (r >>> 20) | r9.b(t, n));
    }
    
    private final void J(final T t, final int n, final int n2) {
        r9.h(t, this.R(n2) & 0xFFFFF, n);
    }
    
    private final void K(final T o, final ia ia) throws IOException {
        Object p2 = null;
        Map.Entry<?, ?> entry = null;
        Label_0051: {
            if (this.f) {
                final h6<?> b = this.p.b(o);
                if (!b.a.isEmpty()) {
                    p2 = b.p();
                    entry = (Map.Entry<?, ?>)((Iterator<Map.Entry>)p2).next();
                    break Label_0051;
                }
            }
            p2 = null;
            entry = null;
        }
        final int length = this.a.length;
        final Unsafe s = d8.s;
        int n = 0;
        int n2 = 1048575;
        int int1 = 0;
        Map.Entry<?, ?> entry2;
        while (true) {
            entry2 = entry;
            if (n >= length) {
                break;
            }
            final int p3 = this.P(n);
            final int[] a = this.a;
            final int n3 = a[n];
            final int n4 = (p3 & 0xFF00000) >>> 20;
            int n8;
            if (n4 <= 17) {
                final int n5 = a[n + 2];
                final int n6 = n5 & 0xFFFFF;
                int n7;
                if (n6 != (n7 = n2)) {
                    int1 = s.getInt(o, n6);
                    n7 = n6;
                }
                n8 = 1 << (n5 >>> 20);
                n2 = n7;
            }
            else {
                n8 = 0;
            }
            while (entry != null && this.p.a(entry) <= n3) {
                this.p.g(ia, entry);
                if (((Iterator)p2).hasNext()) {
                    entry = (Map.Entry<?, ?>)((Iterator<Map.Entry>)p2).next();
                }
                else {
                    entry = null;
                }
            }
            final long n9 = p3 & 0xFFFFF;
            Label_2424: {
                boolean b15 = false;
                int n23 = 0;
                Label_1912: {
                    while (true) {
                        boolean b14 = false;
                        int n22 = 0;
                        Label_1878: {
                            boolean b13 = false;
                            int n21 = 0;
                            Label_1844: {
                                boolean b12 = false;
                                int n20 = 0;
                                Label_1810: {
                                    boolean b11 = false;
                                    int n19 = 0;
                                    Label_1776: {
                                        boolean b10 = false;
                                        int n18 = 0;
                                        Label_1742: {
                                            boolean b9 = false;
                                            int n17 = 0;
                                            Label_1708: {
                                                boolean b8 = false;
                                                int n16 = 0;
                                                List list2 = null;
                                                Label_1683: {
                                                    boolean b7 = false;
                                                    int n15 = 0;
                                                    Label_1555: {
                                                        boolean b6 = false;
                                                        int n14 = 0;
                                                        Label_1521: {
                                                            boolean b5 = false;
                                                            int n13 = 0;
                                                            Label_1487: {
                                                                boolean b4 = false;
                                                                int n12 = 0;
                                                                Label_1453: {
                                                                    boolean b3 = false;
                                                                    int n11 = 0;
                                                                    Label_1419: {
                                                                        int n10 = 0;
                                                                        List list = null;
                                                                        boolean b2 = false;
                                                                        Label_1394: {
                                                                            switch (n4) {
                                                                                case 68: {
                                                                                    if (this.C(o, n3, n)) {
                                                                                        ia.M(n3, s.getObject(o, n9), this.r(n));
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                }
                                                                                case 67: {
                                                                                    if (this.C(o, n3, n)) {
                                                                                        ia.L(n3, S(o, n9));
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                }
                                                                                case 66: {
                                                                                    if (this.C(o, n3, n)) {
                                                                                        ia.u(n3, Q(o, n9));
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                }
                                                                                case 65: {
                                                                                    if (this.C(o, n3, n)) {
                                                                                        ia.c(n3, S(o, n9));
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                }
                                                                                case 64: {
                                                                                    if (this.C(o, n3, n)) {
                                                                                        ia.a(n3, Q(o, n9));
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                }
                                                                                case 63: {
                                                                                    if (this.C(o, n3, n)) {
                                                                                        ia.G(n3, Q(o, n9));
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                }
                                                                                case 62: {
                                                                                    if (this.C(o, n3, n)) {
                                                                                        ia.C(n3, Q(o, n9));
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                }
                                                                                case 61: {
                                                                                    if (this.C(o, n3, n)) {
                                                                                        ia.F(n3, (f5)s.getObject(o, n9));
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                }
                                                                                case 60: {
                                                                                    if (this.C(o, n3, n)) {
                                                                                        ia.J(n3, s.getObject(o, n9), this.r(n));
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                }
                                                                                case 59: {
                                                                                    if (this.C(o, n3, n)) {
                                                                                        w(n3, s.getObject(o, n9), ia);
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                }
                                                                                case 58: {
                                                                                    if (this.C(o, n3, n)) {
                                                                                        ia.E(n3, V(o, n9));
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                }
                                                                                case 57: {
                                                                                    if (this.C(o, n3, n)) {
                                                                                        ia.A(n3, Q(o, n9));
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                }
                                                                                case 56: {
                                                                                    if (this.C(o, n3, n)) {
                                                                                        ia.K(n3, S(o, n9));
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                }
                                                                                case 55: {
                                                                                    if (this.C(o, n3, n)) {
                                                                                        ia.g(n3, Q(o, n9));
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                }
                                                                                case 54: {
                                                                                    if (this.C(o, n3, n)) {
                                                                                        ia.h(n3, S(o, n9));
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                }
                                                                                case 53: {
                                                                                    if (this.C(o, n3, n)) {
                                                                                        ia.p(n3, S(o, n9));
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                }
                                                                                case 52: {
                                                                                    if (this.C(o, n3, n)) {
                                                                                        ia.r(n3, M(o, n9));
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                }
                                                                                case 51: {
                                                                                    if (this.C(o, n3, n)) {
                                                                                        ia.q(n3, F(o, n9));
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                }
                                                                                case 50: {
                                                                                    this.y(ia, n3, s.getObject(o, n9), n);
                                                                                    break;
                                                                                }
                                                                                case 49: {
                                                                                    u8.x(this.a[n], (List<?>)s.getObject(o, n9), ia, this.r(n));
                                                                                    break;
                                                                                }
                                                                                case 48: {
                                                                                    n10 = this.a[n];
                                                                                    list = (List)s.getObject(o, n9);
                                                                                    b2 = true;
                                                                                    break Label_1394;
                                                                                }
                                                                                case 47: {
                                                                                    b3 = true;
                                                                                    n11 = this.a[n];
                                                                                    break Label_1419;
                                                                                }
                                                                                case 46: {
                                                                                    b4 = true;
                                                                                    n12 = this.a[n];
                                                                                    break Label_1453;
                                                                                }
                                                                                case 45: {
                                                                                    b5 = true;
                                                                                    n13 = this.a[n];
                                                                                    break Label_1487;
                                                                                }
                                                                                case 44: {
                                                                                    b6 = true;
                                                                                    n14 = this.a[n];
                                                                                    break Label_1521;
                                                                                }
                                                                                case 43: {
                                                                                    b7 = true;
                                                                                    n15 = this.a[n];
                                                                                    break Label_1555;
                                                                                }
                                                                                case 42: {
                                                                                    b8 = true;
                                                                                    n16 = this.a[n];
                                                                                    list2 = (List)s.getObject(o, n9);
                                                                                    break Label_1683;
                                                                                }
                                                                                case 41: {
                                                                                    b9 = true;
                                                                                    n17 = this.a[n];
                                                                                    break Label_1708;
                                                                                }
                                                                                case 40: {
                                                                                    b10 = true;
                                                                                    n18 = this.a[n];
                                                                                    break Label_1742;
                                                                                }
                                                                                case 39: {
                                                                                    b11 = true;
                                                                                    n19 = this.a[n];
                                                                                    break Label_1776;
                                                                                }
                                                                                case 38: {
                                                                                    b12 = true;
                                                                                    n20 = this.a[n];
                                                                                    break Label_1810;
                                                                                }
                                                                                case 37: {
                                                                                    b13 = true;
                                                                                    n21 = this.a[n];
                                                                                    break Label_1844;
                                                                                }
                                                                                case 36: {
                                                                                    b14 = true;
                                                                                    n22 = this.a[n];
                                                                                    break Label_1878;
                                                                                }
                                                                                case 35: {
                                                                                    b15 = true;
                                                                                    n23 = this.a[n];
                                                                                    break Label_1912;
                                                                                }
                                                                                case 34: {
                                                                                    n10 = this.a[n];
                                                                                    list = (List)s.getObject(o, n9);
                                                                                    b2 = false;
                                                                                    break Label_1394;
                                                                                }
                                                                                case 33: {
                                                                                    b3 = false;
                                                                                    n11 = this.a[n];
                                                                                    break Label_1419;
                                                                                }
                                                                                case 32: {
                                                                                    b4 = false;
                                                                                    n12 = this.a[n];
                                                                                    break Label_1453;
                                                                                }
                                                                                case 31: {
                                                                                    b5 = false;
                                                                                    n13 = this.a[n];
                                                                                    break Label_1487;
                                                                                }
                                                                                case 30: {
                                                                                    b6 = false;
                                                                                    n14 = this.a[n];
                                                                                    break Label_1521;
                                                                                }
                                                                                case 29: {
                                                                                    b7 = false;
                                                                                    n15 = this.a[n];
                                                                                    break Label_1555;
                                                                                }
                                                                                case 28: {
                                                                                    u8.w(this.a[n], (List<f5>)s.getObject(o, n9), ia);
                                                                                    break;
                                                                                }
                                                                                case 27: {
                                                                                    u8.k(this.a[n], (List<?>)s.getObject(o, n9), ia, this.r(n));
                                                                                    break;
                                                                                }
                                                                                case 26: {
                                                                                    u8.j(this.a[n], (List<String>)s.getObject(o, n9), ia);
                                                                                    break;
                                                                                }
                                                                                case 25: {
                                                                                    n16 = this.a[n];
                                                                                    list2 = (List)s.getObject(o, n9);
                                                                                    b8 = false;
                                                                                    break Label_1683;
                                                                                }
                                                                                case 24: {
                                                                                    b9 = false;
                                                                                    n17 = this.a[n];
                                                                                    break Label_1708;
                                                                                }
                                                                                case 23: {
                                                                                    b10 = false;
                                                                                    n18 = this.a[n];
                                                                                    break Label_1742;
                                                                                }
                                                                                case 22: {
                                                                                    b11 = false;
                                                                                    n19 = this.a[n];
                                                                                    break Label_1776;
                                                                                }
                                                                                case 21: {
                                                                                    b12 = false;
                                                                                    n20 = this.a[n];
                                                                                    break Label_1810;
                                                                                }
                                                                                case 20: {
                                                                                    b13 = false;
                                                                                    n21 = this.a[n];
                                                                                    break Label_1844;
                                                                                }
                                                                                case 19: {
                                                                                    b14 = false;
                                                                                    n22 = this.a[n];
                                                                                    break Label_1878;
                                                                                }
                                                                                case 18: {
                                                                                    b15 = false;
                                                                                    n23 = this.a[n];
                                                                                    break Label_1912;
                                                                                }
                                                                                case 17: {
                                                                                    if ((n8 & int1) != 0x0) {
                                                                                        ia.M(n3, s.getObject(o, n9), this.r(n));
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                }
                                                                                case 16: {
                                                                                    if ((n8 & int1) != 0x0) {
                                                                                        ia.L(n3, s.getLong(o, n9));
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                }
                                                                                case 15: {
                                                                                    if ((n8 & int1) != 0x0) {
                                                                                        ia.u(n3, s.getInt(o, n9));
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                }
                                                                                case 14: {
                                                                                    if ((n8 & int1) != 0x0) {
                                                                                        ia.c(n3, s.getLong(o, n9));
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                }
                                                                                case 13: {
                                                                                    if ((n8 & int1) != 0x0) {
                                                                                        ia.a(n3, s.getInt(o, n9));
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                }
                                                                                case 12: {
                                                                                    if ((n8 & int1) != 0x0) {
                                                                                        ia.G(n3, s.getInt(o, n9));
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                }
                                                                                case 11: {
                                                                                    if ((n8 & int1) != 0x0) {
                                                                                        ia.C(n3, s.getInt(o, n9));
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                }
                                                                                case 10: {
                                                                                    if ((n8 & int1) != 0x0) {
                                                                                        ia.F(n3, (f5)s.getObject(o, n9));
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                }
                                                                                case 9: {
                                                                                    if ((n8 & int1) != 0x0) {
                                                                                        ia.J(n3, s.getObject(o, n9), this.r(n));
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                }
                                                                                case 8: {
                                                                                    if ((n8 & int1) != 0x0) {
                                                                                        w(n3, s.getObject(o, n9), ia);
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                }
                                                                                case 7: {
                                                                                    if ((n8 & int1) != 0x0) {
                                                                                        ia.E(n3, r9.w(o, n9));
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                }
                                                                                case 6: {
                                                                                    if ((n8 & int1) != 0x0) {
                                                                                        ia.A(n3, s.getInt(o, n9));
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                }
                                                                                case 5: {
                                                                                    if ((n8 & int1) != 0x0) {
                                                                                        ia.K(n3, s.getLong(o, n9));
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                }
                                                                                case 4: {
                                                                                    if ((n8 & int1) != 0x0) {
                                                                                        ia.g(n3, s.getInt(o, n9));
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                }
                                                                                case 3: {
                                                                                    if ((n8 & int1) != 0x0) {
                                                                                        ia.h(n3, s.getLong(o, n9));
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                }
                                                                                case 2: {
                                                                                    if ((n8 & int1) != 0x0) {
                                                                                        ia.p(n3, s.getLong(o, n9));
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                }
                                                                                case 1: {
                                                                                    if ((n8 & int1) != 0x0) {
                                                                                        ia.r(n3, r9.x(o, n9));
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                }
                                                                                case 0: {
                                                                                    if ((n8 & int1) != 0x0) {
                                                                                        ia.q(n3, r9.C(o, n9));
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                }
                                                                            }
                                                                            break Label_2424;
                                                                        }
                                                                        u8.K(n10, list, ia, b2);
                                                                        continue;
                                                                    }
                                                                    u8.Z(n11, (List<Integer>)s.getObject(o, n9), ia, b3);
                                                                    continue;
                                                                }
                                                                u8.Q(n12, (List<Long>)s.getObject(o, n9), ia, b4);
                                                                continue;
                                                            }
                                                            u8.b0(n13, (List<Integer>)s.getObject(o, n9), ia, b5);
                                                            continue;
                                                        }
                                                        u8.c0(n14, (List<Integer>)s.getObject(o, n9), ia, b6);
                                                        continue;
                                                    }
                                                    u8.W(n15, (List<Integer>)s.getObject(o, n9), ia, b7);
                                                    continue;
                                                }
                                                u8.d0(n16, list2, ia, b8);
                                                continue;
                                            }
                                            u8.a0(n17, (List<Integer>)s.getObject(o, n9), ia, b9);
                                            continue;
                                        }
                                        u8.N(n18, (List<Long>)s.getObject(o, n9), ia, b10);
                                        continue;
                                    }
                                    u8.T(n19, (List<Integer>)s.getObject(o, n9), ia, b11);
                                    continue;
                                }
                                u8.G(n20, (List<Long>)s.getObject(o, n9), ia, b12);
                                continue;
                            }
                            u8.C(n21, (List<Long>)s.getObject(o, n9), ia, b13);
                            continue;
                        }
                        u8.y(n22, (List<Float>)s.getObject(o, n9), ia, b14);
                        continue;
                    }
                }
                u8.l(n23, (List<Double>)s.getObject(o, n9), ia, b15);
            }
            n += 3;
        }
        while (entry2 != null) {
            this.p.g(ia, entry2);
            if (((Iterator)p2).hasNext()) {
                entry2 = (Map.Entry<?, ?>)((Iterator<Map.Entry>)p2).next();
            }
            else {
                entry2 = null;
            }
        }
        x(this.o, o, ia);
    }
    
    private final void L(final T t, final T t2, final int n) {
        final int p3 = this.P(n);
        final int n2 = this.a[n];
        final long n3 = p3 & 0xFFFFF;
        if (!this.C(t2, n2, n)) {
            return;
        }
        Object f = null;
        if (this.C(t, n2, n)) {
            f = r9.F(t, n3);
        }
        final Object f2 = r9.F(t2, n3);
        if (f != null && f2 != null) {
            r9.j(t, n3, t6.e(f, f2));
            this.J(t, n2, n);
            return;
        }
        if (f2 != null) {
            r9.j(t, n3, f2);
            this.J(t, n2, n);
        }
    }
    
    private static <T> float M(final T t, final long n) {
        return (float)r9.F(t, n);
    }
    
    private final u6 N(final int n) {
        return (u6)this.b[(n / 3 << 1) + 1];
    }
    
    private final boolean O(final T t, final T t2, final int n) {
        return this.B(t, n) == this.B(t2, n);
    }
    
    private final int P(final int n) {
        return this.a[n + 1];
    }
    
    private static <T> int Q(final T t, final long n) {
        return (int)r9.F(t, n);
    }
    
    private final int R(final int n) {
        return this.a[n + 2];
    }
    
    private static <T> long S(final T t, final long n) {
        return (long)r9.F(t, n);
    }
    
    private static n9 T(final Object o) {
        final p6 p = (p6)o;
        n9 zzb;
        if ((zzb = p.zzb) == n9.a()) {
            zzb = n9.g();
            p.zzb = zzb;
        }
        return zzb;
    }
    
    private static boolean U(final int n) {
        return (n & 0x20000000) != 0x0;
    }
    
    private static <T> boolean V(final T t, final long n) {
        return (boolean)r9.F(t, n);
    }
    
    private final int W(final int n) {
        if (n >= this.c && n <= this.d) {
            return this.G(n, 0);
        }
        return -1;
    }
    
    private final int j(final int n, final int n2) {
        if (n >= this.c && n <= this.d) {
            return this.G(n, n2);
        }
        return -1;
    }
    
    private static <UT, UB> int k(final k9<UT, UB> k9, final T t) {
        return k9.s(k9.k(t));
    }
    
    private final int l(final T t, final byte[] bytes, int offset, int i, final int n, final int x, final int n2, final int n3, final int n4, final long offset2, final int n5, final z4 z4) throws IOException {
        final Unsafe s = d8.s;
        final long offset3 = this.a[n5 + 2] & 0xFFFFF;
        Label_0716: {
            Constable x4 = null;
            Label_0704: {
                Constable x3 = null;
                Label_0674: {
                    Object x2 = null;
                    Label_0647: {
                        long l = 0L;
                        Label_0641: {
                            switch (n4) {
                                default: {
                                    return offset;
                                }
                                case 68: {
                                    if (n2 != 3) {
                                        return offset;
                                    }
                                    offset = com.google.android.gms.internal.vision.x4.f(this.r(n5), bytes, offset, i, (n & 0xFFFFFFF8) | 0x4, z4);
                                    Object object;
                                    if (s.getInt(t, offset3) == x) {
                                        object = s.getObject(t, offset2);
                                    }
                                    else {
                                        object = null;
                                    }
                                    final Object c = z4.c;
                                    if (object == null) {
                                        x2 = c;
                                        break Label_0647;
                                    }
                                    x2 = t6.e(object, c);
                                    break Label_0647;
                                }
                                case 67: {
                                    if (n2 == 0) {
                                        offset = com.google.android.gms.internal.vision.x4.k(bytes, offset, z4);
                                        l = s5.b(z4.b);
                                        break Label_0641;
                                    }
                                    return offset;
                                }
                                case 66: {
                                    if (n2 == 0) {
                                        offset = com.google.android.gms.internal.vision.x4.i(bytes, offset, z4);
                                        i = s5.k(z4.a);
                                        break;
                                    }
                                    return offset;
                                }
                                case 63: {
                                    if (n2 != 0) {
                                        return offset;
                                    }
                                    offset = com.google.android.gms.internal.vision.x4.i(bytes, offset, z4);
                                    i = z4.a;
                                    final u6 n6 = this.N(n5);
                                    if (n6 != null && !n6.d(i)) {
                                        T(t).c(n, (long)i);
                                        return offset;
                                    }
                                    s.putObject(t, offset2, i);
                                    break Label_0716;
                                }
                                case 61: {
                                    if (n2 == 2) {
                                        offset = com.google.android.gms.internal.vision.x4.q(bytes, offset, z4);
                                        x2 = z4.c;
                                        break Label_0647;
                                    }
                                    return offset;
                                }
                                case 60: {
                                    if (n2 != 2) {
                                        return offset;
                                    }
                                    offset = com.google.android.gms.internal.vision.x4.g(this.r(n5), bytes, offset, i, z4);
                                    Object object2;
                                    if (s.getInt(t, offset3) == x) {
                                        object2 = s.getObject(t, offset2);
                                    }
                                    else {
                                        object2 = null;
                                    }
                                    final Object c2 = z4.c;
                                    if (object2 == null) {
                                        x2 = c2;
                                        break Label_0647;
                                    }
                                    x2 = t6.e(object2, c2);
                                    break Label_0647;
                                }
                                case 59: {
                                    if (n2 != 2) {
                                        return offset;
                                    }
                                    offset = com.google.android.gms.internal.vision.x4.i(bytes, offset, z4);
                                    i = z4.a;
                                    if (i == 0) {
                                        x2 = "";
                                        break Label_0647;
                                    }
                                    if ((n3 & 0x20000000) != 0x0 && !u9.g(bytes, offset, offset + i)) {
                                        throw y6.i();
                                    }
                                    s.putObject(t, offset2, new String(bytes, offset, i, t6.a));
                                    offset += i;
                                    break Label_0716;
                                }
                                case 58: {
                                    if (n2 == 0) {
                                        offset = com.google.android.gms.internal.vision.x4.k(bytes, offset, z4);
                                        x2 = (z4.b != 0L);
                                        break Label_0647;
                                    }
                                    return offset;
                                }
                                case 57:
                                case 64: {
                                    if (n2 == 5) {
                                        x3 = com.google.android.gms.internal.vision.x4.h(bytes, offset);
                                        break Label_0674;
                                    }
                                    return offset;
                                }
                                case 56:
                                case 65: {
                                    if (n2 == 1) {
                                        x4 = com.google.android.gms.internal.vision.x4.l(bytes, offset);
                                        break Label_0704;
                                    }
                                    return offset;
                                }
                                case 55:
                                case 62: {
                                    if (n2 == 0) {
                                        offset = com.google.android.gms.internal.vision.x4.i(bytes, offset, z4);
                                        i = z4.a;
                                        break;
                                    }
                                    return offset;
                                }
                                case 53:
                                case 54: {
                                    if (n2 == 0) {
                                        offset = com.google.android.gms.internal.vision.x4.k(bytes, offset, z4);
                                        l = z4.b;
                                        break Label_0641;
                                    }
                                    return offset;
                                }
                                case 52: {
                                    if (n2 == 5) {
                                        x3 = com.google.android.gms.internal.vision.x4.o(bytes, offset);
                                        break Label_0674;
                                    }
                                    return offset;
                                }
                                case 51: {
                                    if (n2 == 1) {
                                        x4 = com.google.android.gms.internal.vision.x4.m(bytes, offset);
                                        break Label_0704;
                                    }
                                    return offset;
                                }
                            }
                            x2 = i;
                            break Label_0647;
                        }
                        x2 = l;
                    }
                    s.putObject(t, offset2, x2);
                    break Label_0716;
                }
                s.putObject(t, offset2, x3);
                offset += 4;
                break Label_0716;
            }
            s.putObject(t, offset2, x4);
            offset += 8;
        }
        s.putInt(t, offset3, x);
        return offset;
    }
    
    private final int m(final T t, final byte[] array, int i, int j, final int n, int n2, int n3, int n4, final long n5, int n6, final long n7, final z4 z4) throws IOException {
        int n8 = i;
        final Unsafe s = d8.s;
        z6<String> d;
        final z6 z5 = d = (z6<String>)s.getObject(t, n7);
        if (!z5.zza()) {
            final int size = z5.size();
            int n9;
            if (size == 0) {
                n9 = 10;
            }
            else {
                n9 = size << 1;
            }
            d = z5.d(n9);
            s.putObject(t, n7, d);
        }
        switch (n6) {
            default: {
                n6 = n8;
                return n6;
            }
            case 49: {
                n6 = n8;
                if (n3 != 3) {
                    return n6;
                }
                final s8 r = this.r(n4);
                n2 = ((n & 0xFFFFFFF8) | 0x4);
                i = x4.f(r, array, i, j, n2, z4);
                while (true) {
                    d.add((String)z4.c);
                    n6 = i;
                    if (i >= j) {
                        return n6;
                    }
                    n3 = x4.i(array, i, z4);
                    n6 = i;
                    if (n != z4.a) {
                        return n6;
                    }
                    i = x4.f(r, array, n3, j, n2, z4);
                }
                break;
            }
            case 34:
            case 48: {
                if (n3 == 2) {
                    final m7 m7 = (m7)d;
                    i = x4.i(array, n8, z4);
                    j = z4.a + i;
                    while (i < j) {
                        i = x4.k(array, i, z4);
                        m7.f(s5.b(z4.b));
                    }
                    if (i == j) {
                        return i;
                    }
                    throw y6.a();
                }
                else {
                    n6 = n8;
                    if (n3 != 0) {
                        return n6;
                    }
                    final m7 m8 = (m7)d;
                    while (true) {
                        n2 = x4.k(array, n8, z4);
                        m8.f(s5.b(z4.b));
                        i = n2;
                        if (n2 >= j) {
                            return i;
                        }
                        n8 = x4.i(array, n2, z4);
                        i = n2;
                        if (n == z4.a) {
                            continue;
                        }
                        return i;
                    }
                }
                break;
            }
            case 33:
            case 47: {
                if (n3 == 2) {
                    final r6 r2 = (r6)d;
                    i = x4.i(array, n8, z4);
                    j = z4.a + i;
                    while (i < j) {
                        i = x4.i(array, i, z4);
                        r2.h(s5.k(z4.a));
                    }
                    if (i == j) {
                        return i;
                    }
                    throw y6.a();
                }
                else {
                    n6 = n8;
                    if (n3 != 0) {
                        return n6;
                    }
                    final r6 r3 = (r6)d;
                    while (true) {
                        n2 = x4.i(array, n8, z4);
                        r3.h(s5.k(z4.a));
                        i = n2;
                        if (n2 >= j) {
                            return i;
                        }
                        n8 = x4.i(array, n2, z4);
                        i = n2;
                        if (n == z4.a) {
                            continue;
                        }
                        return i;
                    }
                }
                break;
            }
            case 30:
            case 44: {
                if (n3 == 2) {
                    i = x4.j(array, n8, d, z4);
                }
                else {
                    n6 = n8;
                    if (n3 != 0) {
                        return n6;
                    }
                    i = x4.b(n, array, i, j, d, z4);
                }
                final p6 p12 = (p6)t;
                n9 zzb;
                if ((zzb = p12.zzb) == n9.a()) {
                    zzb = null;
                }
                final n9 zzb2 = u8.i(n2, (List<Integer>)d, this.N(n4), zzb, this.o);
                j = i;
                if (zzb2 != null) {
                    p12.zzb = zzb2;
                    j = i;
                    break;
                }
                break;
            }
            case 28: {
                n6 = n8;
                if (n3 != 2) {
                    return n6;
                }
                n3 = x4.i(array, n8, z4);
                n4 = z4.a;
                if (n4 < 0) {
                    throw y6.c();
                }
                if (n4 > array.length - n3) {
                    throw y6.a();
                }
                n2 = n3;
                i = n4;
                z6<String> z6 = d;
            Label_0796_Outer:
                while (true) {
                    if (n4 != 0) {
                        break Label_0810;
                    }
                    n2 = n3;
                    while (true) {
                        d.add((String)f5.H);
                        Label_0833: {
                            break Label_0833;
                            z6.add((String)f5.n(array, n2, i));
                            n2 += i;
                            d = z6;
                        }
                        i = n2;
                        if (n2 >= j) {
                            return i;
                        }
                        n3 = x4.i(array, n2, z4);
                        i = n2;
                        if (n != z4.a) {
                            return i;
                        }
                        n3 = x4.i(array, n3, z4);
                        n4 = z4.a;
                        if (n4 < 0) {
                            throw y6.c();
                        }
                        if (n4 > array.length - n3) {
                            throw y6.a();
                        }
                        n2 = n3;
                        i = n4;
                        z6 = d;
                        if (n4 == 0) {
                            n2 = n3;
                            continue;
                        }
                        break;
                    }
                    continue Label_0796_Outer;
                }
            }
            case 27: {
                n6 = n8;
                if (n3 == 2) {
                    i = x4.e(this.r(n4), n, array, i, j, d, z4);
                    return i;
                }
                return n6;
            }
            case 26: {
                n6 = n8;
                if (n3 != 2) {
                    return n6;
                }
                i = x4.i(array, n8, z4);
                if ((n5 & 0x20000000L) == 0x0L) {
                    n2 = z4.a;
                    if (n2 < 0) {
                        throw y6.c();
                    }
                Label_1016_Outer:
                    while (true) {
                        if (n2 != 0) {
                            final String s2 = new String(array, i, n2, t6.a);
                            break Label_1045;
                        }
                        while (true) {
                            d.add("");
                            Label_1059: {
                                break Label_1059;
                                final String s2;
                                d.add(s2);
                                i += n2;
                            }
                            n6 = i;
                            if (i >= j) {
                                return n6;
                            }
                            n2 = x4.i(array, i, z4);
                            n6 = i;
                            if (n != z4.a) {
                                return n6;
                            }
                            i = x4.i(array, n2, z4);
                            n2 = z4.a;
                            if (n2 < 0) {
                                throw y6.c();
                            }
                            if (n2 == 0) {
                                continue;
                            }
                            break;
                        }
                        final String s2 = new String(array, i, n2, t6.a);
                        continue Label_1016_Outer;
                    }
                }
                else {
                    n3 = z4.a;
                    if (n3 < 0) {
                        throw y6.c();
                    }
                Label_1165_Outer:
                    while (true) {
                        z6<String> z7;
                        if (n3 == 0) {
                            z7 = d;
                        }
                        else {
                            n2 = i + n3;
                            if (u9.g(array, i, n2)) {
                                final String s3 = new String(array, i, n3, t6.a);
                                z7 = d;
                                final String s4 = s3;
                                i = n2;
                                break Label_1220;
                            }
                            throw y6.i();
                        }
                        while (true) {
                            z7.add("");
                            Label_1229: {
                                break Label_1229;
                                final String s4;
                                z7.add(s4);
                            }
                            n6 = i;
                            if (i >= j) {
                                return n6;
                            }
                            n2 = x4.i(array, i, z4);
                            n6 = i;
                            if (n != z4.a) {
                                return n6;
                            }
                            i = x4.i(array, n2, z4);
                            n3 = z4.a;
                            if (n3 < 0) {
                                throw y6.c();
                            }
                            if (n3 == 0) {
                                continue;
                            }
                            break;
                        }
                        n2 = i + n3;
                        if (u9.g(array, i, n2)) {
                            final String s4 = new String(array, i, n3, t6.a);
                            i = n2;
                            continue Label_1165_Outer;
                        }
                        break;
                    }
                    throw y6.i();
                }
                break;
            }
            case 25:
            case 42: {
                if (n3 == 2) {
                    final d5 d2 = (d5)d;
                    j = x4.i(array, n8, z4);
                    i = z4.a + j;
                    while (j < i) {
                        j = x4.k(array, j, z4);
                        d2.f(z4.b != 0L);
                    }
                    if (j == i) {
                        break;
                    }
                    throw y6.a();
                }
                else {
                    n6 = n8;
                    if (n3 != 0) {
                        return n6;
                    }
                    final d5 d3 = (d5)d;
                    n2 = (i = x4.k(array, n8, z4));
                Label_1472_Outer:
                    while (true) {
                        if (z4.b == 0L) {
                            break Label_1478;
                        }
                        i = n2;
                        while (true) {
                            boolean b = true;
                            Label_1481: {
                                break Label_1481;
                                b = false;
                            }
                            d3.f(b);
                            n6 = i;
                            if (i >= j) {
                                return n6;
                            }
                            n2 = x4.i(array, i, z4);
                            n6 = i;
                            if (n != z4.a) {
                                return n6;
                            }
                            n2 = (i = x4.k(array, n2, z4));
                            if (z4.b != 0L) {
                                i = n2;
                                continue;
                            }
                            break;
                        }
                        continue Label_1472_Outer;
                    }
                }
                break;
            }
            case 24:
            case 31:
            case 41:
            case 45: {
                if (n3 == 2) {
                    final r6 r4 = (r6)d;
                    for (i = x4.i(array, n8, z4), j = z4.a + i; i < j; i += 4) {
                        r4.h(x4.h(array, i));
                    }
                    if (i == j) {
                        return i;
                    }
                    throw y6.a();
                }
                else {
                    n6 = n8;
                    if (n3 != 5) {
                        return n6;
                    }
                    final r6 r5 = (r6)d;
                    r5.h(x4.h(array, i));
                    while (true) {
                        n2 = (i = n8 + 4);
                        if (n2 >= j) {
                            return i;
                        }
                        n8 = x4.i(array, n2, z4);
                        i = n2;
                        if (n != z4.a) {
                            return i;
                        }
                        r5.h(x4.h(array, n8));
                    }
                }
                break;
            }
            case 23:
            case 32:
            case 40:
            case 46: {
                if (n3 == 2) {
                    final m7 m9 = (m7)d;
                    for (i = x4.i(array, n8, z4), j = z4.a + i; i < j; i += 8) {
                        m9.f(x4.l(array, i));
                    }
                    if (i == j) {
                        return i;
                    }
                    throw y6.a();
                }
                else {
                    n6 = n8;
                    if (n3 != 1) {
                        return n6;
                    }
                    final m7 m10 = (m7)d;
                    m10.f(x4.l(array, i));
                    while (true) {
                        n2 = (i = n8 + 8);
                        if (n2 >= j) {
                            return i;
                        }
                        n8 = x4.i(array, n2, z4);
                        i = n2;
                        if (n != z4.a) {
                            return i;
                        }
                        m10.f(x4.l(array, n8));
                    }
                }
                break;
            }
            case 22:
            case 29:
            case 39:
            case 43: {
                if (n3 == 2) {
                    i = x4.j(array, n8, d, z4);
                    return i;
                }
                n6 = n8;
                if (n3 == 0) {
                    i = x4.b(n, array, i, j, d, z4);
                    return i;
                }
                return n6;
            }
            case 20:
            case 21:
            case 37:
            case 38: {
                if (n3 == 2) {
                    final m7 m11 = (m7)d;
                    i = x4.i(array, n8, z4);
                    j = z4.a + i;
                    while (i < j) {
                        i = x4.k(array, i, z4);
                        m11.f(z4.b);
                    }
                    if (i == j) {
                        return i;
                    }
                    throw y6.a();
                }
                else {
                    n6 = n8;
                    if (n3 != 0) {
                        return n6;
                    }
                    final m7 m12 = (m7)d;
                    while (true) {
                        n2 = x4.k(array, n8, z4);
                        m12.f(z4.b);
                        i = n2;
                        if (n2 >= j) {
                            return i;
                        }
                        n8 = x4.i(array, n2, z4);
                        i = n2;
                        if (n == z4.a) {
                            continue;
                        }
                        return i;
                    }
                }
                break;
            }
            case 19:
            case 36: {
                if (n3 == 2) {
                    final o6 o6 = (o6)d;
                    for (i = x4.i(array, n8, z4), j = z4.a + i; i < j; i += 4) {
                        o6.f(x4.o(array, i));
                    }
                    if (i == j) {
                        return i;
                    }
                    throw y6.a();
                }
                else {
                    n6 = n8;
                    if (n3 != 5) {
                        return n6;
                    }
                    final o6 o7 = (o6)d;
                    o7.f(x4.o(array, i));
                    while (true) {
                        n2 = (i = n8 + 4);
                        if (n2 >= j) {
                            return i;
                        }
                        n8 = x4.i(array, n2, z4);
                        i = n2;
                        if (n != z4.a) {
                            return i;
                        }
                        o7.f(x4.o(array, n8));
                    }
                }
                break;
            }
            case 18:
            case 35: {
                if (n3 == 2) {
                    final a6 a6 = (a6)d;
                    for (i = x4.i(array, n8, z4), j = z4.a + i; i < j; i += 8) {
                        a6.f(x4.m(array, i));
                    }
                    if (i == j) {
                        return i;
                    }
                    throw y6.a();
                }
                else {
                    n6 = n8;
                    if (n3 != 1) {
                        return n6;
                    }
                    final a6 a7 = (a6)d;
                    a7.f(x4.m(array, i));
                    while (true) {
                        n2 = (i = n8 + 8);
                        if (n2 >= j) {
                            return i;
                        }
                        n8 = x4.i(array, n2, z4);
                        i = n2;
                        if (n != z4.a) {
                            return i;
                        }
                        a7.f(x4.m(array, n8));
                    }
                }
                break;
            }
        }
        i = j;
        return i;
        i = n6;
        return i;
    }
    
    private final <K, V> int n(final T t, final byte[] array, int i, final int n, int n2, final long n3, final z4 z4) throws IOException {
        final Unsafe s = d8.s;
        final Object h = this.H(n2);
        Object x;
        final Object o = x = s.getObject(t, n3);
        if (this.q.e(o)) {
            x = this.q.d(h);
            this.q.f(x, o);
            s.putObject(t, n3, x);
        }
        final u7<?, ?> c = this.q.c(h);
        final Map<?, ?> a = this.q.a(x);
        i = x4.i(array, i, z4);
        n2 = z4.a;
        if (n2 < 0 || n2 > n - i) {
            throw y6.a();
        }
        final int n4 = n2 + i;
        Object o2 = c.b;
        Object o3 = c.d;
        while (i < n4) {
            final int n5 = i + 1;
            final int n6 = array[i];
            n2 = n5;
            if ((i = n6) < 0) {
                n2 = x4.d(n6, array, n5, z4);
                i = z4.a;
            }
            final int n7 = i >>> 3;
            final int n8 = i & 0x7;
            if (n7 != 1) {
                if (n7 == 2) {
                    if (n8 == c.c.d()) {
                        i = p(array, n2, n, c.c, c.d.getClass(), z4);
                        o3 = z4.c;
                        continue;
                    }
                }
            }
            else if (n8 == c.a.d()) {
                i = p(array, n2, n, c.a, null, z4);
                o2 = z4.c;
                continue;
            }
            i = x4.a(i, array, n2, n, z4);
        }
        if (i == n4) {
            a.put(o2, o3);
            return n4;
        }
        throw y6.h();
    }
    
    private static int p(final byte[] array, int n, int i, final ca ca, final Class<?> clazz, final z4 z4) throws IOException {
        Constable c2 = null;
        Label_0281: {
            Constable c = null;
            Label_0260: {
                Serializable c3 = null;
                Label_0218: {
                    Label_0213: {
                        long l = 0L;
                        switch (g8.a[ca.ordinal()]) {
                            default: {
                                throw new RuntimeException("unsupported field type.");
                            }
                            case 17: {
                                n = x4.p(array, n, z4);
                                return n;
                            }
                            case 16: {
                                n = x4.k(array, n, z4);
                                l = s5.b(z4.b);
                                break;
                            }
                            case 15: {
                                n = x4.i(array, n, z4);
                                i = s5.k(z4.a);
                                break Label_0213;
                            }
                            case 14: {
                                n = x4.g(n8.a().b(clazz), array, n, i, z4);
                                return n;
                            }
                            case 12:
                            case 13: {
                                n = x4.k(array, n, z4);
                                l = z4.b;
                                break;
                            }
                            case 9:
                            case 10:
                            case 11: {
                                n = x4.i(array, n, z4);
                                i = z4.a;
                                break Label_0213;
                            }
                            case 8: {
                                c = x4.o(array, n);
                                break Label_0260;
                            }
                            case 6:
                            case 7: {
                                c2 = x4.l(array, n);
                                break Label_0281;
                            }
                            case 4:
                            case 5: {
                                c = x4.h(array, n);
                                break Label_0260;
                            }
                            case 3: {
                                c2 = x4.m(array, n);
                                break Label_0281;
                            }
                            case 2: {
                                n = x4.q(array, n, z4);
                                return n;
                            }
                            case 1: {
                                n = x4.k(array, n, z4);
                                c3 = (z4.b != 0L);
                                break Label_0218;
                            }
                        }
                        c3 = l;
                        break Label_0218;
                    }
                    c3 = i;
                }
                z4.c = c3;
                return n;
            }
            z4.c = c;
            n += 4;
            return n;
        }
        z4.c = c2;
        n += 8;
        return n;
    }
    
    static <T> d8<T> q(final Class<T> clazz, final x7 x7, final h8 h8, final i7 i7, final k9<?, ?> k9, final d6<?> d6, final w7 w7) {
        if (x7 instanceof q8) {
            final q8 q8 = (q8)x7;
            final int zza = q8.zza();
            final int b = o8.b;
            final int n = 0;
            final boolean b2 = zza == b;
            final String b3 = q8.b();
            final int length = b3.length();
            int index2;
            if (b3.charAt(0) >= '\ud800') {
                int index = 1;
                while (true) {
                    final int n2 = index2 = index + 1;
                    if (b3.charAt(index) < '\ud800') {
                        break;
                    }
                    index = n2;
                }
            }
            else {
                index2 = 1;
            }
            final int n3 = index2 + 1;
            final char char1 = b3.charAt(index2);
            int index3 = n3;
            int n4;
            if ((n4 = char1) >= 55296) {
                int n5 = char1 & '\u1fff';
                int n6 = 13;
                int index4 = n3;
                int n7;
                char char2;
                while (true) {
                    n7 = index4 + 1;
                    char2 = b3.charAt(index4);
                    if (char2 < '\ud800') {
                        break;
                    }
                    n5 |= (char2 & '\u1fff') << n6;
                    n6 += 13;
                    index4 = n7;
                }
                n4 = (n5 | char2 << n6);
                index3 = n7;
            }
            int[] r;
            int n8;
            int n10;
            int n11;
            int n12;
            int n13;
            int n14;
            int n15;
            if (n4 == 0) {
                r = d8.r;
                n8 = 0;
                final int n9 = 0;
                n10 = 0;
                n11 = 0;
                n12 = 0;
                n13 = 0;
                n14 = n;
                n15 = n9;
            }
            else {
                final int n16 = index3 + 1;
                int char3;
                final char c = (char)(char3 = b3.charAt(index3));
                int index5 = n16;
                if (c >= '\ud800') {
                    final int n17 = c & '\u1fff';
                    int n18 = 13;
                    int index6 = n16;
                    int n19 = n17;
                    int n20;
                    char char4;
                    while (true) {
                        n20 = index6 + 1;
                        char4 = b3.charAt(index6);
                        if (char4 < '\ud800') {
                            break;
                        }
                        n19 |= (char4 & '\u1fff') << n18;
                        n18 += 13;
                        index6 = n20;
                    }
                    final int n21 = n19 | char4 << n18;
                    index5 = n20;
                    char3 = n21;
                }
                final int n22 = index5 + 1;
                int char5;
                final char c2 = (char)(char5 = b3.charAt(index5));
                int index7 = n22;
                if (c2 >= '\ud800') {
                    int n23 = c2 & '\u1fff';
                    int n24 = 13;
                    int index8 = n22;
                    int n25;
                    char char6;
                    while (true) {
                        n25 = index8 + 1;
                        char6 = b3.charAt(index8);
                        if (char6 < '\ud800') {
                            break;
                        }
                        n23 |= (char6 & '\u1fff') << n24;
                        n24 += 13;
                        index8 = n25;
                    }
                    char5 = (n23 | char6 << n24);
                    index7 = n25;
                }
                final int n26 = index7 + 1;
                int char7;
                final char c3 = (char)(char7 = b3.charAt(index7));
                int index9 = n26;
                if (c3 >= '\ud800') {
                    final int n27 = c3 & '\u1fff';
                    int n28 = 13;
                    int index10 = n26;
                    int n29 = n27;
                    int n30;
                    char char8;
                    while (true) {
                        n30 = index10 + 1;
                        char8 = b3.charAt(index10);
                        if (char8 < '\ud800') {
                            break;
                        }
                        n29 |= (char8 & '\u1fff') << n28;
                        n28 += 13;
                        index10 = n30;
                    }
                    final int n31 = n29 | char8 << n28;
                    index9 = n30;
                    char7 = n31;
                }
                final int n32 = index9 + 1;
                int char9;
                final char c4 = (char)(char9 = b3.charAt(index9));
                int index11 = n32;
                if (c4 >= '\ud800') {
                    final int n33 = c4 & '\u1fff';
                    int n34 = 13;
                    int index12 = n32;
                    int n35 = n33;
                    int n36;
                    char char10;
                    while (true) {
                        n36 = index12 + 1;
                        char10 = b3.charAt(index12);
                        if (char10 < '\ud800') {
                            break;
                        }
                        n35 |= (char10 & '\u1fff') << n34;
                        n34 += 13;
                        index12 = n36;
                    }
                    final int n37 = n35 | char10 << n34;
                    index11 = n36;
                    char9 = n37;
                }
                final int n38 = index11 + 1;
                int char11;
                final char c5 = (char)(char11 = b3.charAt(index11));
                int index13 = n38;
                if (c5 >= '\ud800') {
                    int n39 = c5 & '\u1fff';
                    int n40 = 13;
                    int index14 = n38;
                    int n41;
                    char char12;
                    while (true) {
                        n41 = index14 + 1;
                        char12 = b3.charAt(index14);
                        if (char12 < '\ud800') {
                            break;
                        }
                        n39 |= (char12 & '\u1fff') << n40;
                        n40 += 13;
                        index14 = n41;
                    }
                    char11 = (n39 | char12 << n40);
                    index13 = n41;
                }
                final int n42 = index13 + 1;
                int char13;
                final char c6 = (char)(char13 = b3.charAt(index13));
                int index15 = n42;
                if (c6 >= '\ud800') {
                    int n43 = c6 & '\u1fff';
                    int n44 = 13;
                    int index16 = n42;
                    int n45;
                    char char14;
                    while (true) {
                        n45 = index16 + 1;
                        char14 = b3.charAt(index16);
                        if (char14 < '\ud800') {
                            break;
                        }
                        n43 |= (char14 & '\u1fff') << n44;
                        n44 += 13;
                        index16 = n45;
                    }
                    char13 = (n43 | char14 << n44);
                    index15 = n45;
                }
                final int n46 = index15 + 1;
                int char15;
                final char c7 = (char)(char15 = b3.charAt(index15));
                int index17 = n46;
                if (c7 >= '\ud800') {
                    int n47 = c7 & '\u1fff';
                    int n48 = 13;
                    int index18 = n46;
                    int n49;
                    char char16;
                    while (true) {
                        n49 = index18 + 1;
                        char16 = b3.charAt(index18);
                        if (char16 < '\ud800') {
                            break;
                        }
                        n47 |= (char16 & '\u1fff') << n48;
                        n48 += 13;
                        index18 = n49;
                    }
                    char15 = (n47 | char16 << n48);
                    index17 = n49;
                }
                final int n50 = index17 + 1;
                int char17;
                final char c8 = (char)(char17 = b3.charAt(index17));
                int n51 = n50;
                if (c8 >= '\ud800') {
                    final int n52 = c8 & '\u1fff';
                    int index19 = n50;
                    int n53 = 13;
                    int n54 = n52;
                    int n55;
                    char char18;
                    while (true) {
                        n55 = index19 + 1;
                        char18 = b3.charAt(index19);
                        if (char18 < '\ud800') {
                            break;
                        }
                        n54 |= (char18 & '\u1fff') << n53;
                        n53 += 13;
                        index19 = n55;
                    }
                    final int n56 = n54 | char18 << n53;
                    n51 = n55;
                    char17 = n56;
                }
                r = new int[char17 + char13 + char15];
                final int n57 = (char3 << 1) + char5;
                final int n58 = char3;
                index3 = n51;
                n13 = char17;
                n12 = char13;
                n11 = char11;
                n10 = char9;
                n15 = char7;
                n8 = n57;
                n14 = n58;
            }
            final Unsafe s = d8.s;
            final Object[] c9 = q8.c();
            final Class<? extends z7> class1 = q8.a().getClass();
            final int[] array = new int[n11 * 3];
            final Object[] array2 = new Object[n11 << 1];
            final int n59 = n13 + n12;
            int n60 = n8;
            final int n61 = n13;
            final int n62 = index3;
            int n63 = n59;
            final int n64 = 0;
            int n65 = 0;
            int n66 = n61;
            int n67 = n64;
            final int n68 = n10;
            final int n69 = n15;
            int j = n62;
            final int n70 = n14;
            while (j < length) {
                int index20 = j + 1;
                int char19 = b3.charAt(j);
                if (char19 >= 55296) {
                    int n71 = char19 & 0x1FFF;
                    int n72 = 13;
                    int index21 = index20;
                    char char20;
                    while (true) {
                        index20 = index21 + 1;
                        char20 = b3.charAt(index21);
                        if (char20 < '\ud800') {
                            break;
                        }
                        n71 |= (char20 & '\u1fff') << n72;
                        n72 += 13;
                        index21 = index20;
                    }
                    char19 = (n71 | char20 << n72);
                }
                int index22 = index20 + 1;
                int char21 = b3.charAt(index20);
                int n76;
                int n77;
                if (char21 >= 55296) {
                    int n73 = char21 & 0x1FFF;
                    int n74 = 13;
                    int n75;
                    char char22;
                    while (true) {
                        n75 = index22 + 1;
                        char22 = b3.charAt(index22);
                        n76 = n13;
                        if (char22 < '\ud800') {
                            break;
                        }
                        n73 |= (char22 & '\u1fff') << n74;
                        n74 += 13;
                        n13 = n76;
                        index22 = n75;
                    }
                    char21 = (n73 | char22 << n74);
                    n77 = n75;
                }
                else {
                    n77 = index22;
                    n76 = n13;
                }
                final int n78 = char21 & 0xFF;
                int n79 = n67;
                if ((char21 & 0x400) != 0x0) {
                    r[n67] = n65;
                    n79 = n67 + 1;
                }
                int n80;
                int n87;
                int n88;
                int n89;
                if (n78 >= 51) {
                    int index23 = n77 + 1;
                    int char23;
                    final char c10 = (char)(char23 = b3.charAt(n77));
                    n80 = index23;
                    if (c10 >= '\ud800') {
                        int n81 = c10 & '\u1fff';
                        int n82 = 13;
                        int n83;
                        char char24;
                        while (true) {
                            n83 = index23 + 1;
                            char24 = b3.charAt(index23);
                            if (char24 < '\ud800') {
                                break;
                            }
                            n81 |= (char24 & '\u1fff') << n82;
                            n82 += 13;
                            index23 = n83;
                        }
                        char23 = (n81 | char24 << n82);
                        n80 = n83;
                    }
                    final int n84 = n78 - 51;
                    if (n84 != 9 && n84 != 17) {
                        int n85 = n60;
                        if (n84 == 12) {
                            n85 = n60;
                            if (!b2) {
                                array2[(n65 / 3 << 1) + 1] = c9[n60];
                                n85 = n60 + 1;
                            }
                        }
                        n60 = n85;
                    }
                    else {
                        array2[(n65 / 3 << 1) + 1] = c9[n60];
                        ++n60;
                    }
                    int n86 = char23 << 1;
                    final Object o = c9[n86];
                    Field u;
                    if (o instanceof Field) {
                        u = (Field)o;
                    }
                    else {
                        u = u(class1, (String)o);
                        c9[n86] = u;
                    }
                    n87 = (int)s.objectFieldOffset(u);
                    ++n86;
                    final Object o2 = c9[n86];
                    Field u2;
                    if (o2 instanceof Field) {
                        u2 = (Field)o2;
                    }
                    else {
                        u2 = u(class1, (String)o2);
                        c9[n86] = u2;
                    }
                    n88 = (int)s.objectFieldOffset(u2);
                    n89 = 0;
                }
                else {
                    final int n90 = n60 + 1;
                    final Field u3 = u(class1, (String)c9[n60]);
                    int n96 = 0;
                    Label_2153: {
                        int n91 = 0;
                        int n92 = 0;
                        Label_2145: {
                            if (n78 != 9 && n78 != 17) {
                                if (n78 != 27 && n78 != 49) {
                                    if (n78 != 12 && n78 != 30 && n78 != 44) {
                                        n91 = n90;
                                        n92 = n66;
                                        if (n78 != 50) {
                                            break Label_2145;
                                        }
                                        n92 = n66 + 1;
                                        r[n66] = n65;
                                        final int n93 = n65 / 3 << 1;
                                        final int n94 = n90 + 1;
                                        array2[n93] = c9[n90];
                                        if ((char21 & 0x800) != 0x0) {
                                            final int n95 = n94 + 1;
                                            array2[n93 + 1] = c9[n94];
                                            n91 = n95;
                                            break Label_2145;
                                        }
                                        n66 = n92;
                                        n96 = n94;
                                    }
                                    else {
                                        if (b2) {
                                            n91 = n90;
                                            n92 = n66;
                                            break Label_2145;
                                        }
                                        final int n97 = n65 / 3;
                                        n96 = n90 + 1;
                                        array2[(n97 << 1) + 1] = c9[n90];
                                    }
                                }
                                else {
                                    final int n98 = n65 / 3;
                                    n96 = n90 + 1;
                                    array2[(n98 << 1) + 1] = c9[n90];
                                }
                                break Label_2153;
                            }
                            array2[(n65 / 3 << 1) + 1] = u3.getType();
                            n92 = n66;
                            n91 = n90;
                        }
                        n66 = n92;
                        n96 = n91;
                    }
                    final int n99 = (int)s.objectFieldOffset(u3);
                    int n106;
                    if ((char21 & 0x1000) == 0x1000 && n78 <= 17) {
                        final int n100 = n77 + 1;
                        int char25;
                        final char c11 = (char)(char25 = b3.charAt(n77));
                        int n101 = n100;
                        if (c11 >= '\ud800') {
                            final int n102 = c11 & '\u1fff';
                            int n103 = 13;
                            int index24 = n100;
                            int n104 = n102;
                            char char26;
                            while (true) {
                                n101 = index24 + 1;
                                char26 = b3.charAt(index24);
                                if (char26 < '\ud800') {
                                    break;
                                }
                                n104 |= (char26 & '\u1fff') << n103;
                                n103 += 13;
                                index24 = n101;
                            }
                            char25 = (n104 | char26 << n103);
                        }
                        final int n105 = (n70 << 1) + char25 / 32;
                        final Object o3 = c9[n105];
                        Field u4;
                        if (o3 instanceof Field) {
                            u4 = (Field)o3;
                        }
                        else {
                            u4 = u(class1, (String)o3);
                            c9[n105] = u4;
                        }
                        n88 = (int)s.objectFieldOffset(u4);
                        n89 = char25 % 32;
                        n106 = n101;
                    }
                    else {
                        n88 = 1048575;
                        final int n107 = 0;
                        n106 = n77;
                        n89 = n107;
                    }
                    int n108 = n63;
                    if (n78 >= 18) {
                        n108 = n63;
                        if (n78 <= 49) {
                            r[n63] = n99;
                            n108 = n63 + 1;
                        }
                    }
                    n63 = n108;
                    n60 = n96;
                    n80 = n106;
                    n87 = n99;
                }
                final int n109 = n65 + 1;
                array[n65] = char19;
                final int n110 = n109 + 1;
                int n111;
                if ((char21 & 0x200) != 0x0) {
                    n111 = 536870912;
                }
                else {
                    n111 = 0;
                }
                int n112;
                if ((char21 & 0x100) != 0x0) {
                    n112 = 268435456;
                }
                else {
                    n112 = 0;
                }
                array[n109] = (n112 | n111 | n78 << 20 | n87);
                array[n110] = (n89 << 20 | n88);
                final int n113 = n80;
                n13 = n76;
                n65 = n110 + 1;
                j = n113;
                n67 = n79;
            }
            return new d8<T>(array, array2, n69, n68, q8.a(), b2, false, r, n13, n59, h8, i7, k9, d6, w7);
        }
        ((h9)x7).zza();
        final int b4 = o8.b;
        throw new NoSuchMethodError();
    }
    
    private final s8 r(int n) {
        n = n / 3 << 1;
        final s8 s8 = (s8)this.b[n];
        if (s8 != null) {
            return s8;
        }
        return (s8)(this.b[n] = n8.a().b((Class<Object>)this.b[n + 1]));
    }
    
    private final <K, V, UT, UB> UB s(final int n, final int n2, final Map<K, V> map, final u6 u6, UB ub, final k9<UT, UB> k9) {
        final u7<?, ?> c = this.q.c(this.H(n));
        final Iterator<Map.Entry<K, V>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            final Map.Entry<K, V> entry = iterator.next();
            if (!u6.d((int)entry.getValue())) {
                UB a;
                if ((a = ub) == null) {
                    a = k9.a();
                }
                final o5 z = f5.z(r7.a(c, entry.getKey(), entry.getValue()));
                final v5 b = z.b();
                try {
                    r7.b(b, c, entry.getKey(), entry.getValue());
                    k9.e(a, n2, z.a());
                    iterator.remove();
                    ub = a;
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
    
    private final <UT, UB> UB t(Object f, final int n, final UB ub, final k9<UT, UB> k9) {
        final int n2 = this.a[n];
        f = r9.F(f, this.P(n) & 0xFFFFF);
        if (f == null) {
            return ub;
        }
        final u6 n3 = this.N(n);
        if (n3 == null) {
            return ub;
        }
        return this.s(n, n2, this.q.a(f), n3, ub, k9);
    }
    
    private static Field u(final Class<?> clazz, final String str) {
        try {
            return clazz.getDeclaredField(str);
        }
        catch (NoSuchFieldException ex) {
            final Field[] declaredFields = clazz.getDeclaredFields();
            for (final Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            final String name = clazz.getName();
            final String string = Arrays.toString(declaredFields);
            final StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + name.length() + String.valueOf(string).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(string);
            throw new RuntimeException(sb.toString());
        }
    }
    
    private static List<?> v(final Object o, final long n) {
        return (List<?>)r9.F(o, n);
    }
    
    private static void w(final int n, final Object o, final ia ia) throws IOException {
        if (o instanceof String) {
            ia.m(n, (String)o);
            return;
        }
        ia.F(n, (f5)o);
    }
    
    private static <UT, UB> void x(final k9<UT, UB> k9, final T t, final ia ia) throws IOException {
        k9.g(k9.k(t), ia);
    }
    
    private final <K, V> void y(final ia ia, final int n, final Object o, final int n2) throws IOException {
        if (o != null) {
            ia.H(n, this.q.c(this.H(n2)), this.q.b(o));
        }
    }
    
    private final void z(final Object o, int n, final t8 t8) throws IOException {
        long n2;
        Serializable s;
        if (U(n)) {
            n2 = (n & 0xFFFFF);
            s = t8.q();
        }
        else {
            final boolean g = this.g;
            n &= 0xFFFFF;
            if (g) {
                n2 = n;
                s = t8.p();
            }
            else {
                n2 = n;
                s = t8.s();
            }
        }
        r9.j(o, n2, s);
    }
    
    @Override
    public final int a(final T t) {
        final int length = this.a.length;
        int i = 0;
        int n = 0;
        while (i < length) {
            final int p = this.P(i);
            final int n2 = this.a[i];
            final long n3 = 0xFFFFF & p;
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
                                                                switch ((p & 0xFF00000) >>> 20) {
                                                                    default: {
                                                                        n4 = n;
                                                                        break Label_0981;
                                                                    }
                                                                    case 68: {
                                                                        n4 = n;
                                                                        if (this.C(t, n2, i)) {
                                                                            break Label_0506;
                                                                        }
                                                                        break Label_0981;
                                                                    }
                                                                    case 67: {
                                                                        n4 = n;
                                                                        if (this.C(t, n2, i)) {
                                                                            break Label_0677;
                                                                        }
                                                                        break Label_0981;
                                                                    }
                                                                    case 66: {
                                                                        n4 = n;
                                                                        if (this.C(t, n2, i)) {
                                                                            break;
                                                                        }
                                                                        break Label_0981;
                                                                    }
                                                                    case 65: {
                                                                        n4 = n;
                                                                        if (this.C(t, n2, i)) {
                                                                            break Label_0677;
                                                                        }
                                                                        break Label_0981;
                                                                    }
                                                                    case 64: {
                                                                        n4 = n;
                                                                        if (this.C(t, n2, i)) {
                                                                            break;
                                                                        }
                                                                        break Label_0981;
                                                                    }
                                                                    case 63: {
                                                                        n4 = n;
                                                                        if (this.C(t, n2, i)) {
                                                                            break;
                                                                        }
                                                                        break Label_0981;
                                                                    }
                                                                    case 62: {
                                                                        n4 = n;
                                                                        if (this.C(t, n2, i)) {
                                                                            break;
                                                                        }
                                                                        break Label_0981;
                                                                    }
                                                                    case 61: {
                                                                        n4 = n;
                                                                        if (this.C(t, n2, i)) {
                                                                            break Label_0835;
                                                                        }
                                                                        break Label_0981;
                                                                    }
                                                                    case 60: {
                                                                        n4 = n;
                                                                        if (this.C(t, n2, i)) {
                                                                            break Label_0506;
                                                                        }
                                                                        break Label_0981;
                                                                    }
                                                                    case 59: {
                                                                        n4 = n;
                                                                        if (this.C(t, n2, i)) {
                                                                            break Label_0835;
                                                                        }
                                                                        break Label_0981;
                                                                    }
                                                                    case 58: {
                                                                        n4 = n;
                                                                        if (this.C(t, n2, i)) {
                                                                            n5 = n * 53;
                                                                            b = V(t, n3);
                                                                            break Label_0874;
                                                                        }
                                                                        break Label_0981;
                                                                    }
                                                                    case 57: {
                                                                        n4 = n;
                                                                        if (this.C(t, n2, i)) {
                                                                            break;
                                                                        }
                                                                        break Label_0981;
                                                                    }
                                                                    case 56: {
                                                                        n4 = n;
                                                                        if (this.C(t, n2, i)) {
                                                                            break Label_0677;
                                                                        }
                                                                        break Label_0981;
                                                                    }
                                                                    case 55: {
                                                                        n4 = n;
                                                                        if (this.C(t, n2, i)) {
                                                                            break;
                                                                        }
                                                                        break Label_0981;
                                                                    }
                                                                    case 54: {
                                                                        n4 = n;
                                                                        if (this.C(t, n2, i)) {
                                                                            break Label_0677;
                                                                        }
                                                                        break Label_0981;
                                                                    }
                                                                    case 53: {
                                                                        n4 = n;
                                                                        if (this.C(t, n2, i)) {
                                                                            break Label_0677;
                                                                        }
                                                                        break Label_0981;
                                                                    }
                                                                    case 52: {
                                                                        n4 = n;
                                                                        if (this.C(t, n2, i)) {
                                                                            n5 = n * 53;
                                                                            value = M(t, n3);
                                                                            break Label_0935;
                                                                        }
                                                                        break Label_0981;
                                                                    }
                                                                    case 51: {
                                                                        n4 = n;
                                                                        if (this.C(t, n2, i)) {
                                                                            n5 = n * 53;
                                                                            value2 = F(t, n3);
                                                                            break Label_0960;
                                                                        }
                                                                        break Label_0981;
                                                                    }
                                                                    case 17: {
                                                                        o = r9.F(t, n3);
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
                                                                        o2 = r9.F(t, n3);
                                                                        break Label_0792;
                                                                    }
                                                                    case 9: {
                                                                        o = r9.F(t, n3);
                                                                        if (o != null) {
                                                                            break Label_0815;
                                                                        }
                                                                        break Label_0822;
                                                                    }
                                                                    case 8: {
                                                                        n5 = n * 53;
                                                                        n6 = ((String)r9.F(t, n3)).hashCode();
                                                                        break Label_0974;
                                                                    }
                                                                    case 7: {
                                                                        n5 = n * 53;
                                                                        b = r9.w(t, n3);
                                                                        break Label_0874;
                                                                    }
                                                                    case 4:
                                                                    case 6:
                                                                    case 11:
                                                                    case 12:
                                                                    case 13:
                                                                    case 15: {
                                                                        n5 = n * 53;
                                                                        n6 = r9.b(t, n3);
                                                                        break Label_0974;
                                                                    }
                                                                    case 2:
                                                                    case 3:
                                                                    case 5:
                                                                    case 14:
                                                                    case 16: {
                                                                        n5 = n * 53;
                                                                        n7 = r9.o(t, n3);
                                                                        break Label_0967;
                                                                    }
                                                                    case 1: {
                                                                        n5 = n * 53;
                                                                        value = r9.x(t, n3);
                                                                        break Label_0935;
                                                                    }
                                                                    case 0: {
                                                                        n5 = n * 53;
                                                                        value2 = r9.C(t, n3);
                                                                        break Label_0960;
                                                                    }
                                                                }
                                                            }
                                                            break Label_0626;
                                                        }
                                                        o2 = r9.F(t, n3);
                                                        n5 = n * 53;
                                                        break Label_0792;
                                                    }
                                                    n5 = n * 53;
                                                    n6 = Q(t, n3);
                                                    break Label_0974;
                                                }
                                                n5 = n * 53;
                                                n7 = S(t, n3);
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
                                n6 = t6.c(b);
                                break Label_0974;
                            }
                            n6 = Float.floatToIntBits(value);
                            break Label_0974;
                        }
                        n7 = Double.doubleToLongBits(value2);
                    }
                    n6 = t6.b(n7);
                }
                n4 = n5 + n6;
            }
            i += 3;
            n = n4;
        }
        int n8 = n * 53 + this.o.k(t).hashCode();
        if (this.f) {
            n8 = n8 * 53 + this.p.b(t).hashCode();
        }
        return n8;
    }
    
    @Override
    public final void b(final T t) {
        int k = this.k;
        int l;
        while (true) {
            l = this.l;
            if (k >= l) {
                break;
            }
            final long n = this.P(this.j[k]) & 0xFFFFF;
            final Object f = r9.F(t, n);
            if (f != null) {
                r9.j(t, n, this.q.g(f));
            }
            ++k;
        }
        for (int length = this.j.length, i = l; i < length; ++i) {
            this.n.e(t, this.j[i]);
        }
        this.o.q(t);
        if (this.f) {
            this.p.j(t);
        }
    }
    
    @Override
    public final int c(final T o) {
        if (this.h) {
            final Unsafe s = d8.s;
            int i = 0;
            int n = 0;
            while (i < this.a.length) {
                final int p = this.P(i);
                final int n2 = (p & 0xFF00000) >>> 20;
                final int n3 = this.a[i];
                final long n4 = p & 0xFFFFF;
                if (n2 >= i6.u0.zza() && n2 <= i6.H0.zza()) {
                    final int n5 = this.a[i + 2];
                }
                int n6 = 0;
            Label_1761_Outer:
                while (true) {
                    Label_2073: {
                        Label_2049: {
                            long n13 = 0L;
                            Label_2024: {
                                long n12 = 0L;
                                Label_1991: {
                                    int n11 = 0;
                                    Label_1958: {
                                        Label_1926: {
                                            Label_1902: {
                                                Label_1878: {
                                                    Object o3 = null;
                                                    Label_1850: {
                                                        while (true) {
                                                            Label_1847: {
                                                                Label_1789: {
                                                                    Label_1753: {
                                                                        int n10 = 0;
                                                                        Label_1728: {
                                                                            int n9 = 0;
                                                                            Label_1695: {
                                                                                Label_1663: {
                                                                                    Label_1639: {
                                                                                        int n8 = 0;
                                                                                        Label_1614: {
                                                                                            long n7 = 0L;
                                                                                            Label_1581: {
                                                                                                Label_1536: {
                                                                                                    int n15 = 0;
                                                                                                    switch (n2) {
                                                                                                        default: {
                                                                                                            n6 = n;
                                                                                                            break Label_1761_Outer;
                                                                                                        }
                                                                                                        case 68: {
                                                                                                            n6 = n;
                                                                                                            if (this.C(o, n3, i)) {
                                                                                                                break Label_1536;
                                                                                                            }
                                                                                                            break Label_1761_Outer;
                                                                                                        }
                                                                                                        case 67: {
                                                                                                            n6 = n;
                                                                                                            if (this.C(o, n3, i)) {
                                                                                                                n7 = S(o, n4);
                                                                                                                break Label_1581;
                                                                                                            }
                                                                                                            break Label_1761_Outer;
                                                                                                        }
                                                                                                        case 66: {
                                                                                                            n6 = n;
                                                                                                            if (this.C(o, n3, i)) {
                                                                                                                n8 = Q(o, n4);
                                                                                                                break Label_1614;
                                                                                                            }
                                                                                                            break Label_1761_Outer;
                                                                                                        }
                                                                                                        case 65: {
                                                                                                            n6 = n;
                                                                                                            if (this.C(o, n3, i)) {
                                                                                                                break Label_1639;
                                                                                                            }
                                                                                                            break Label_1761_Outer;
                                                                                                        }
                                                                                                        case 64: {
                                                                                                            n6 = n;
                                                                                                            if (this.C(o, n3, i)) {
                                                                                                                break Label_1663;
                                                                                                            }
                                                                                                            break Label_1761_Outer;
                                                                                                        }
                                                                                                        case 63: {
                                                                                                            n6 = n;
                                                                                                            if (this.C(o, n3, i)) {
                                                                                                                n9 = Q(o, n4);
                                                                                                                break Label_1695;
                                                                                                            }
                                                                                                            break Label_1761_Outer;
                                                                                                        }
                                                                                                        case 62: {
                                                                                                            n6 = n;
                                                                                                            if (this.C(o, n3, i)) {
                                                                                                                n10 = Q(o, n4);
                                                                                                                break Label_1728;
                                                                                                            }
                                                                                                            break Label_1761_Outer;
                                                                                                        }
                                                                                                        case 61: {
                                                                                                            n6 = n;
                                                                                                            if (this.C(o, n3, i)) {
                                                                                                                break Label_1753;
                                                                                                            }
                                                                                                            break Label_1761_Outer;
                                                                                                        }
                                                                                                        case 60: {
                                                                                                            n6 = n;
                                                                                                            if (this.C(o, n3, i)) {
                                                                                                                break Label_1789;
                                                                                                            }
                                                                                                            break Label_1761_Outer;
                                                                                                        }
                                                                                                        case 59: {
                                                                                                            n6 = n;
                                                                                                            if (!this.C(o, n3, i)) {
                                                                                                                break Label_1761_Outer;
                                                                                                            }
                                                                                                            final Object o2 = o3 = r9.F(o, n4);
                                                                                                            if (o2 instanceof f5) {
                                                                                                                final Object f = o2;
                                                                                                                break Label_1847;
                                                                                                            }
                                                                                                            break Label_1850;
                                                                                                        }
                                                                                                        case 58: {
                                                                                                            n6 = n;
                                                                                                            if (this.C(o, n3, i)) {
                                                                                                                break Label_1878;
                                                                                                            }
                                                                                                            break Label_1761_Outer;
                                                                                                        }
                                                                                                        case 57: {
                                                                                                            n6 = n;
                                                                                                            if (this.C(o, n3, i)) {
                                                                                                                break Label_1902;
                                                                                                            }
                                                                                                            break Label_1761_Outer;
                                                                                                        }
                                                                                                        case 56: {
                                                                                                            n6 = n;
                                                                                                            if (this.C(o, n3, i)) {
                                                                                                                break Label_1926;
                                                                                                            }
                                                                                                            break Label_1761_Outer;
                                                                                                        }
                                                                                                        case 55: {
                                                                                                            n6 = n;
                                                                                                            if (this.C(o, n3, i)) {
                                                                                                                n11 = Q(o, n4);
                                                                                                                break Label_1958;
                                                                                                            }
                                                                                                            break Label_1761_Outer;
                                                                                                        }
                                                                                                        case 54: {
                                                                                                            n6 = n;
                                                                                                            if (this.C(o, n3, i)) {
                                                                                                                n12 = S(o, n4);
                                                                                                                break Label_1991;
                                                                                                            }
                                                                                                            break Label_1761_Outer;
                                                                                                        }
                                                                                                        case 53: {
                                                                                                            n6 = n;
                                                                                                            if (this.C(o, n3, i)) {
                                                                                                                n13 = S(o, n4);
                                                                                                                break Label_2024;
                                                                                                            }
                                                                                                            break Label_1761_Outer;
                                                                                                        }
                                                                                                        case 52: {
                                                                                                            n6 = n;
                                                                                                            if (this.C(o, n3, i)) {
                                                                                                                break Label_2049;
                                                                                                            }
                                                                                                            break Label_1761_Outer;
                                                                                                        }
                                                                                                        case 51: {
                                                                                                            n6 = n;
                                                                                                            if (this.C(o, n3, i)) {
                                                                                                                break Label_2073;
                                                                                                            }
                                                                                                            break Label_1761_Outer;
                                                                                                        }
                                                                                                        case 50: {
                                                                                                            final int n14 = this.q.h(n3, r9.F(o, n4), this.H(i));
                                                                                                            break Label_1513;
                                                                                                        }
                                                                                                        case 49: {
                                                                                                            final int n14 = u8.s(n3, (List<z7>)v(o, n4), this.r(i));
                                                                                                            break Label_1513;
                                                                                                        }
                                                                                                        case 48: {
                                                                                                            final int a = u8.A((List<Long>)s.getObject(o, n4));
                                                                                                            n6 = n;
                                                                                                            if (a > 0) {
                                                                                                                n15 = a;
                                                                                                                break;
                                                                                                            }
                                                                                                            break Label_1761_Outer;
                                                                                                        }
                                                                                                        case 47: {
                                                                                                            final int p2 = u8.P((List<Integer>)s.getObject(o, n4));
                                                                                                            n6 = n;
                                                                                                            if (p2 > 0) {
                                                                                                                n15 = p2;
                                                                                                                break;
                                                                                                            }
                                                                                                            break Label_1761_Outer;
                                                                                                        }
                                                                                                        case 46: {
                                                                                                            final int v = u8.V((List<?>)s.getObject(o, n4));
                                                                                                            n6 = n;
                                                                                                            if (v > 0) {
                                                                                                                n15 = v;
                                                                                                                break;
                                                                                                            }
                                                                                                            break Label_1761_Outer;
                                                                                                        }
                                                                                                        case 45: {
                                                                                                            final int s2 = u8.S((List<?>)s.getObject(o, n4));
                                                                                                            n6 = n;
                                                                                                            if (s2 > 0) {
                                                                                                                n15 = s2;
                                                                                                                break;
                                                                                                            }
                                                                                                            break Label_1761_Outer;
                                                                                                        }
                                                                                                        case 44: {
                                                                                                            final int e = u8.E((List<Integer>)s.getObject(o, n4));
                                                                                                            n6 = n;
                                                                                                            if (e > 0) {
                                                                                                                n15 = e;
                                                                                                                break;
                                                                                                            }
                                                                                                            break Label_1761_Outer;
                                                                                                        }
                                                                                                        case 43: {
                                                                                                            final int m = u8.M((List<Integer>)s.getObject(o, n4));
                                                                                                            n6 = n;
                                                                                                            if (m > 0) {
                                                                                                                n15 = m;
                                                                                                                break;
                                                                                                            }
                                                                                                            break Label_1761_Outer;
                                                                                                        }
                                                                                                        case 42: {
                                                                                                            final int y = u8.Y((List<?>)s.getObject(o, n4));
                                                                                                            n6 = n;
                                                                                                            if (y > 0) {
                                                                                                                n15 = y;
                                                                                                                break;
                                                                                                            }
                                                                                                            break Label_1761_Outer;
                                                                                                        }
                                                                                                        case 41: {
                                                                                                            final int s3 = u8.S((List<?>)s.getObject(o, n4));
                                                                                                            n6 = n;
                                                                                                            if (s3 > 0) {
                                                                                                                n15 = s3;
                                                                                                                break;
                                                                                                            }
                                                                                                            break Label_1761_Outer;
                                                                                                        }
                                                                                                        case 40: {
                                                                                                            final int v2 = u8.V((List<?>)s.getObject(o, n4));
                                                                                                            n6 = n;
                                                                                                            if (v2 > 0) {
                                                                                                                n15 = v2;
                                                                                                                break;
                                                                                                            }
                                                                                                            break Label_1761_Outer;
                                                                                                        }
                                                                                                        case 39: {
                                                                                                            final int j = u8.I((List<Integer>)s.getObject(o, n4));
                                                                                                            n6 = n;
                                                                                                            if (j > 0) {
                                                                                                                n15 = j;
                                                                                                                break;
                                                                                                            }
                                                                                                            break Label_1761_Outer;
                                                                                                        }
                                                                                                        case 38: {
                                                                                                            final int u = u8.u((List<Long>)s.getObject(o, n4));
                                                                                                            n6 = n;
                                                                                                            if (u > 0) {
                                                                                                                n15 = u;
                                                                                                                break;
                                                                                                            }
                                                                                                            break Label_1761_Outer;
                                                                                                        }
                                                                                                        case 37: {
                                                                                                            final int e2 = u8.e((List<Long>)s.getObject(o, n4));
                                                                                                            n6 = n;
                                                                                                            if (e2 > 0) {
                                                                                                                n15 = e2;
                                                                                                                break;
                                                                                                            }
                                                                                                            break Label_1761_Outer;
                                                                                                        }
                                                                                                        case 36: {
                                                                                                            final int s4 = u8.S((List<?>)s.getObject(o, n4));
                                                                                                            n6 = n;
                                                                                                            if (s4 > 0) {
                                                                                                                n15 = s4;
                                                                                                                break;
                                                                                                            }
                                                                                                            break Label_1761_Outer;
                                                                                                        }
                                                                                                        case 35: {
                                                                                                            final int v3 = u8.V((List<?>)s.getObject(o, n4));
                                                                                                            n6 = n;
                                                                                                            if (v3 > 0) {
                                                                                                                n15 = v3;
                                                                                                                break;
                                                                                                            }
                                                                                                            break Label_1761_Outer;
                                                                                                        }
                                                                                                        case 34: {
                                                                                                            final int n14 = u8.z(n3, (List<Long>)v(o, n4), false);
                                                                                                            break Label_1513;
                                                                                                        }
                                                                                                        case 33: {
                                                                                                            final int n14 = u8.O(n3, (List<Integer>)v(o, n4), false);
                                                                                                            break Label_1513;
                                                                                                        }
                                                                                                        case 30: {
                                                                                                            final int n14 = u8.D(n3, (List<Integer>)v(o, n4), false);
                                                                                                            break Label_1513;
                                                                                                        }
                                                                                                        case 29: {
                                                                                                            final int n14 = u8.L(n3, (List<Integer>)v(o, n4), false);
                                                                                                            break Label_1513;
                                                                                                        }
                                                                                                        case 28: {
                                                                                                            final int n14 = u8.r(n3, (List<f5>)v(o, n4));
                                                                                                            break Label_1513;
                                                                                                        }
                                                                                                        case 27: {
                                                                                                            final int n14 = u8.c(n3, v(o, n4), this.r(i));
                                                                                                            break Label_1513;
                                                                                                        }
                                                                                                        case 26: {
                                                                                                            final int n14 = u8.b(n3, v(o, n4));
                                                                                                            break Label_1513;
                                                                                                        }
                                                                                                        case 25: {
                                                                                                            final int n14 = u8.X(n3, v(o, n4), false);
                                                                                                            break Label_1513;
                                                                                                        }
                                                                                                        case 22: {
                                                                                                            final int n14 = u8.H(n3, (List<Integer>)v(o, n4), false);
                                                                                                            break Label_1513;
                                                                                                        }
                                                                                                        case 21: {
                                                                                                            final int n14 = u8.t(n3, (List<Long>)v(o, n4), false);
                                                                                                            break Label_1513;
                                                                                                        }
                                                                                                        case 20: {
                                                                                                            final int n14 = u8.d(n3, (List<Long>)v(o, n4), false);
                                                                                                            break Label_1513;
                                                                                                        }
                                                                                                        case 19:
                                                                                                        case 24:
                                                                                                        case 31: {
                                                                                                            final int n14 = u8.R(n3, v(o, n4), false);
                                                                                                            break Label_1513;
                                                                                                        }
                                                                                                        case 18:
                                                                                                        case 23:
                                                                                                        case 32: {
                                                                                                            final int n14 = u8.U(n3, v(o, n4), false);
                                                                                                            break Label_1513;
                                                                                                        }
                                                                                                        case 17: {
                                                                                                            n6 = n;
                                                                                                            if (this.B(o, i)) {
                                                                                                                break Label_1536;
                                                                                                            }
                                                                                                            break Label_1761_Outer;
                                                                                                        }
                                                                                                        case 16: {
                                                                                                            n6 = n;
                                                                                                            if (this.B(o, i)) {
                                                                                                                n7 = r9.o(o, n4);
                                                                                                                break Label_1581;
                                                                                                            }
                                                                                                            break Label_1761_Outer;
                                                                                                        }
                                                                                                        case 15: {
                                                                                                            n6 = n;
                                                                                                            if (this.B(o, i)) {
                                                                                                                n8 = r9.b(o, n4);
                                                                                                                break Label_1614;
                                                                                                            }
                                                                                                            break Label_1761_Outer;
                                                                                                        }
                                                                                                        case 14: {
                                                                                                            n6 = n;
                                                                                                            if (this.B(o, i)) {
                                                                                                                break Label_1639;
                                                                                                            }
                                                                                                            break Label_1761_Outer;
                                                                                                        }
                                                                                                        case 13: {
                                                                                                            n6 = n;
                                                                                                            if (this.B(o, i)) {
                                                                                                                break Label_1663;
                                                                                                            }
                                                                                                            break Label_1761_Outer;
                                                                                                        }
                                                                                                        case 12: {
                                                                                                            n6 = n;
                                                                                                            if (this.B(o, i)) {
                                                                                                                n9 = r9.b(o, n4);
                                                                                                                break Label_1695;
                                                                                                            }
                                                                                                            break Label_1761_Outer;
                                                                                                        }
                                                                                                        case 11: {
                                                                                                            n6 = n;
                                                                                                            if (this.B(o, i)) {
                                                                                                                n10 = r9.b(o, n4);
                                                                                                                break Label_1728;
                                                                                                            }
                                                                                                            break Label_1761_Outer;
                                                                                                        }
                                                                                                        case 10: {
                                                                                                            n6 = n;
                                                                                                            if (this.B(o, i)) {
                                                                                                                break Label_1753;
                                                                                                            }
                                                                                                            break Label_1761_Outer;
                                                                                                        }
                                                                                                        case 9: {
                                                                                                            n6 = n;
                                                                                                            if (this.B(o, i)) {
                                                                                                                break Label_1789;
                                                                                                            }
                                                                                                            break Label_1761_Outer;
                                                                                                        }
                                                                                                        case 8: {
                                                                                                            n6 = n;
                                                                                                            if (!this.B(o, i)) {
                                                                                                                break Label_1761_Outer;
                                                                                                            }
                                                                                                            final Object o4 = o3 = r9.F(o, n4);
                                                                                                            if (o4 instanceof f5) {
                                                                                                                final Object f = o4;
                                                                                                                break Label_1847;
                                                                                                            }
                                                                                                            break Label_1850;
                                                                                                        }
                                                                                                        case 7: {
                                                                                                            n6 = n;
                                                                                                            if (this.B(o, i)) {
                                                                                                                break Label_1878;
                                                                                                            }
                                                                                                            break Label_1761_Outer;
                                                                                                        }
                                                                                                        case 6: {
                                                                                                            n6 = n;
                                                                                                            if (this.B(o, i)) {
                                                                                                                break Label_1902;
                                                                                                            }
                                                                                                            break Label_1761_Outer;
                                                                                                        }
                                                                                                        case 5: {
                                                                                                            n6 = n;
                                                                                                            if (this.B(o, i)) {
                                                                                                                break Label_1926;
                                                                                                            }
                                                                                                            break Label_1761_Outer;
                                                                                                        }
                                                                                                        case 4: {
                                                                                                            n6 = n;
                                                                                                            if (this.B(o, i)) {
                                                                                                                n11 = r9.b(o, n4);
                                                                                                                break Label_1958;
                                                                                                            }
                                                                                                            break Label_1761_Outer;
                                                                                                        }
                                                                                                        case 3: {
                                                                                                            n6 = n;
                                                                                                            if (this.B(o, i)) {
                                                                                                                n12 = r9.o(o, n4);
                                                                                                                break Label_1991;
                                                                                                            }
                                                                                                            break Label_1761_Outer;
                                                                                                        }
                                                                                                        case 2: {
                                                                                                            n6 = n;
                                                                                                            if (this.B(o, i)) {
                                                                                                                n13 = r9.o(o, n4);
                                                                                                                break Label_2024;
                                                                                                            }
                                                                                                            break Label_1761_Outer;
                                                                                                        }
                                                                                                        case 1: {
                                                                                                            n6 = n;
                                                                                                            if (this.B(o, i)) {
                                                                                                                break Label_2049;
                                                                                                            }
                                                                                                            break Label_1761_Outer;
                                                                                                        }
                                                                                                        case 0: {
                                                                                                            n6 = n;
                                                                                                            if (this.B(o, i)) {
                                                                                                                break Label_2073;
                                                                                                            }
                                                                                                            break Label_1761_Outer;
                                                                                                        }
                                                                                                    }
                                                                                                    final int n14 = v5.h0(n3) + v5.p0(n15) + n15;
                                                                                                    n6 = n + n14;
                                                                                                    break Label_1761_Outer;
                                                                                                }
                                                                                                final int n14 = v5.V(n3, (z7)r9.F(o, n4), this.r(i));
                                                                                                continue Label_1761_Outer;
                                                                                            }
                                                                                            final int n14 = v5.n0(n3, n7);
                                                                                            continue Label_1761_Outer;
                                                                                        }
                                                                                        final int n14 = v5.u0(n3, n8);
                                                                                        continue Label_1761_Outer;
                                                                                    }
                                                                                    final int n14 = v5.v0(n3, 0L);
                                                                                    continue Label_1761_Outer;
                                                                                }
                                                                                final int n14 = v5.B0(n3, 0);
                                                                                continue Label_1761_Outer;
                                                                            }
                                                                            final int n14 = v5.D0(n3, n9);
                                                                            continue Label_1761_Outer;
                                                                        }
                                                                        final int n14 = v5.q0(n3, n10);
                                                                        continue Label_1761_Outer;
                                                                    }
                                                                    final Object f = r9.F(o, n4);
                                                                    final int n14 = v5.U(n3, (f5)f);
                                                                    continue Label_1761_Outer;
                                                                }
                                                                final int n14 = u8.a(n3, r9.F(o, n4), this.r(i));
                                                                continue Label_1761_Outer;
                                                            }
                                                            continue;
                                                        }
                                                    }
                                                    final int n14 = v5.G(n3, (String)o3);
                                                    continue;
                                                }
                                                final int n14 = v5.H(n3, true);
                                                continue;
                                            }
                                            final int n14 = v5.y0(n3, 0);
                                            continue;
                                        }
                                        final int n14 = v5.r0(n3, 0L);
                                        continue;
                                    }
                                    final int n14 = v5.m0(n3, n11);
                                    continue;
                                }
                                final int n14 = v5.i0(n3, n12);
                                continue;
                            }
                            final int n14 = v5.c0(n3, n13);
                            continue;
                        }
                        final int n14 = v5.C(n3, 0.0f);
                        continue;
                    }
                    final int n14 = v5.B(n3, 0.0);
                    continue;
                }
                i += 3;
                n = n6;
            }
            return n + k(this.o, o);
        }
        final Unsafe s5 = d8.s;
        int k = 0;
        int n16 = 0;
        int n17 = 1048575;
        int int1 = 0;
    Label_3797_Outer:
        while (k < this.a.length) {
            final int p3 = this.P(k);
            final int[] a2 = this.a;
            final int n18 = a2[k];
            final int n19 = (p3 & 0xFF00000) >>> 20;
            int n23;
            int n24;
            if (n19 <= 17) {
                final int n20 = a2[k + 2];
                final int n21 = n20 & 0xFFFFF;
                final int n22 = 1 << (n20 >>> 20);
                n23 = n17;
                n24 = n22;
                if (n21 != n17) {
                    int1 = s5.getInt(o, n21);
                    n23 = n21;
                    n24 = n22;
                }
            }
            else {
                n24 = 0;
                n23 = n17;
            }
            final long n25 = p3 & 0xFFFFF;
            int n26 = 0;
            Label_4325: {
                int n35 = 0;
            Label_3797:
                while (true) {
                    Object o6 = null;
                    Label_4129: {
                        while (true) {
                            Label_4126: {
                                Label_4067: {
                                    Label_4032: {
                                        int n30 = 0;
                                        Label_4009: {
                                            int n29 = 0;
                                        Label_3977:
                                            while (true) {
                                                int n31 = 0;
                                                Label_3948: {
                                                    Label_3940: {
                                                        Label_3918: {
                                                            int n28 = 0;
                                                            Label_3895: {
                                                                long n27 = 0L;
                                                                Label_3863: {
                                                                    Label_3817: {
                                                                        Label_3776: {
                                                                            int n34 = 0;
                                                                            Label_3770: {
                                                                                int n33 = 0;
                                                                                switch (n19) {
                                                                                    default: {
                                                                                        n26 = n16;
                                                                                        break Label_3803;
                                                                                    }
                                                                                    case 68: {
                                                                                        n26 = n16;
                                                                                        if (this.C(o, n18, k)) {
                                                                                            break Label_3817;
                                                                                        }
                                                                                        break Label_3803;
                                                                                    }
                                                                                    case 67: {
                                                                                        n26 = n16;
                                                                                        if (this.C(o, n18, k)) {
                                                                                            n27 = S(o, n25);
                                                                                            break Label_3863;
                                                                                        }
                                                                                        break Label_3803;
                                                                                    }
                                                                                    case 66: {
                                                                                        n26 = n16;
                                                                                        if (this.C(o, n18, k)) {
                                                                                            n28 = Q(o, n25);
                                                                                            break Label_3895;
                                                                                        }
                                                                                        break Label_3803;
                                                                                    }
                                                                                    case 65: {
                                                                                        n26 = n16;
                                                                                        if (this.C(o, n18, k)) {
                                                                                            break Label_3918;
                                                                                        }
                                                                                        break Label_3803;
                                                                                    }
                                                                                    case 64: {
                                                                                        n26 = n16;
                                                                                        if (this.C(o, n18, k)) {
                                                                                            break Label_3940;
                                                                                        }
                                                                                        break Label_3803;
                                                                                    }
                                                                                    case 63: {
                                                                                        n26 = n16;
                                                                                        if (this.C(o, n18, k)) {
                                                                                            n29 = Q(o, n25);
                                                                                            break Label_3977;
                                                                                        }
                                                                                        break Label_3803;
                                                                                    }
                                                                                    case 62: {
                                                                                        n26 = n16;
                                                                                        if (this.C(o, n18, k)) {
                                                                                            n30 = Q(o, n25);
                                                                                            break Label_4009;
                                                                                        }
                                                                                        break Label_3803;
                                                                                    }
                                                                                    case 61: {
                                                                                        n26 = n16;
                                                                                        if (this.C(o, n18, k)) {
                                                                                            break Label_4032;
                                                                                        }
                                                                                        break Label_3803;
                                                                                    }
                                                                                    case 60: {
                                                                                        n26 = n16;
                                                                                        if (this.C(o, n18, k)) {
                                                                                            break Label_4067;
                                                                                        }
                                                                                        break Label_3803;
                                                                                    }
                                                                                    case 59: {
                                                                                        n26 = n16;
                                                                                        if (!this.C(o, n18, k)) {
                                                                                            break Label_3803;
                                                                                        }
                                                                                        final Object o5 = o6 = s5.getObject(o, n25);
                                                                                        if (o5 instanceof f5) {
                                                                                            final Object object = o5;
                                                                                            break Label_4126;
                                                                                        }
                                                                                        break Label_4129;
                                                                                    }
                                                                                    case 58: {
                                                                                        n26 = n16;
                                                                                        if (this.C(o, n18, k)) {
                                                                                            n31 = v5.H(n18, true);
                                                                                            break Label_3948;
                                                                                        }
                                                                                        break Label_3803;
                                                                                    }
                                                                                    case 57: {
                                                                                        n26 = n16;
                                                                                        if (this.C(o, n18, k)) {
                                                                                            n31 = v5.y0(n18, 0);
                                                                                            break Label_3948;
                                                                                        }
                                                                                        break Label_3803;
                                                                                    }
                                                                                    case 56: {
                                                                                        n26 = n16;
                                                                                        if (this.C(o, n18, k)) {
                                                                                            final int n32 = v5.r0(n18, 0L);
                                                                                            break Label_3797;
                                                                                        }
                                                                                        break Label_3803;
                                                                                    }
                                                                                    case 55: {
                                                                                        n26 = n16;
                                                                                        if (this.C(o, n18, k)) {
                                                                                            final int n32 = v5.m0(n18, Q(o, n25));
                                                                                            break Label_3797;
                                                                                        }
                                                                                        break Label_3803;
                                                                                    }
                                                                                    case 54: {
                                                                                        n26 = n16;
                                                                                        if (this.C(o, n18, k)) {
                                                                                            final int n32 = v5.i0(n18, S(o, n25));
                                                                                            break Label_3797;
                                                                                        }
                                                                                        break Label_3803;
                                                                                    }
                                                                                    case 53: {
                                                                                        n26 = n16;
                                                                                        if (this.C(o, n18, k)) {
                                                                                            final int n32 = v5.c0(n18, S(o, n25));
                                                                                            break Label_3797;
                                                                                        }
                                                                                        break Label_3803;
                                                                                    }
                                                                                    case 52: {
                                                                                        n26 = n16;
                                                                                        if (this.C(o, n18, k)) {
                                                                                            n31 = v5.C(n18, 0.0f);
                                                                                            break Label_3948;
                                                                                        }
                                                                                        break Label_3803;
                                                                                    }
                                                                                    case 51: {
                                                                                        n26 = n16;
                                                                                        if (this.C(o, n18, k)) {
                                                                                            final int n32 = v5.B(n18, 0.0);
                                                                                            break Label_3797;
                                                                                        }
                                                                                        break Label_3803;
                                                                                    }
                                                                                    case 50: {
                                                                                        final int n32 = this.q.h(n18, s5.getObject(o, n25), this.H(k));
                                                                                        break Label_3797;
                                                                                    }
                                                                                    case 49: {
                                                                                        final int n32 = u8.s(n18, (List<z7>)s5.getObject(o, n25), this.r(k));
                                                                                        break Label_3797;
                                                                                    }
                                                                                    case 48: {
                                                                                        final int a3 = u8.A((List<Long>)s5.getObject(o, n25));
                                                                                        n26 = n16;
                                                                                        if (a3 > 0) {
                                                                                            n33 = a3;
                                                                                            break;
                                                                                        }
                                                                                        break Label_3803;
                                                                                    }
                                                                                    case 47: {
                                                                                        final int p4 = u8.P((List<Integer>)s5.getObject(o, n25));
                                                                                        n26 = n16;
                                                                                        if (p4 > 0) {
                                                                                            n33 = p4;
                                                                                            break;
                                                                                        }
                                                                                        break Label_3803;
                                                                                    }
                                                                                    case 46: {
                                                                                        final int v4 = u8.V((List<?>)s5.getObject(o, n25));
                                                                                        n26 = n16;
                                                                                        if (v4 > 0) {
                                                                                            n33 = v4;
                                                                                            break;
                                                                                        }
                                                                                        break Label_3803;
                                                                                    }
                                                                                    case 45: {
                                                                                        final int s6 = u8.S((List<?>)s5.getObject(o, n25));
                                                                                        n26 = n16;
                                                                                        if (s6 > 0) {
                                                                                            n33 = s6;
                                                                                            break;
                                                                                        }
                                                                                        break Label_3803;
                                                                                    }
                                                                                    case 44: {
                                                                                        final int e3 = u8.E((List<Integer>)s5.getObject(o, n25));
                                                                                        n26 = n16;
                                                                                        if (e3 > 0) {
                                                                                            n33 = e3;
                                                                                            break;
                                                                                        }
                                                                                        break Label_3803;
                                                                                    }
                                                                                    case 43: {
                                                                                        final int l = u8.M((List<Integer>)s5.getObject(o, n25));
                                                                                        n26 = n16;
                                                                                        if (l > 0) {
                                                                                            n33 = l;
                                                                                            break;
                                                                                        }
                                                                                        break Label_3803;
                                                                                    }
                                                                                    case 42: {
                                                                                        final int y2 = u8.Y((List<?>)s5.getObject(o, n25));
                                                                                        n26 = n16;
                                                                                        if (y2 > 0) {
                                                                                            n33 = y2;
                                                                                            break;
                                                                                        }
                                                                                        break Label_3803;
                                                                                    }
                                                                                    case 41: {
                                                                                        final int s7 = u8.S((List<?>)s5.getObject(o, n25));
                                                                                        n26 = n16;
                                                                                        if (s7 > 0) {
                                                                                            n33 = s7;
                                                                                            break;
                                                                                        }
                                                                                        break Label_3803;
                                                                                    }
                                                                                    case 40: {
                                                                                        final int v5 = u8.V((List<?>)s5.getObject(o, n25));
                                                                                        n26 = n16;
                                                                                        if (v5 > 0) {
                                                                                            n33 = v5;
                                                                                            break;
                                                                                        }
                                                                                        break Label_3803;
                                                                                    }
                                                                                    case 39: {
                                                                                        final int i2 = u8.I((List<Integer>)s5.getObject(o, n25));
                                                                                        n26 = n16;
                                                                                        if (i2 > 0) {
                                                                                            n33 = i2;
                                                                                            break;
                                                                                        }
                                                                                        break Label_3803;
                                                                                    }
                                                                                    case 38: {
                                                                                        final int u2 = u8.u((List<Long>)s5.getObject(o, n25));
                                                                                        n26 = n16;
                                                                                        if (u2 > 0) {
                                                                                            n33 = u2;
                                                                                            break;
                                                                                        }
                                                                                        break Label_3803;
                                                                                    }
                                                                                    case 37: {
                                                                                        final int e4 = u8.e((List<Long>)s5.getObject(o, n25));
                                                                                        n26 = n16;
                                                                                        if (e4 > 0) {
                                                                                            n33 = e4;
                                                                                            break;
                                                                                        }
                                                                                        break Label_3803;
                                                                                    }
                                                                                    case 36: {
                                                                                        final int s8 = u8.S((List<?>)s5.getObject(o, n25));
                                                                                        n26 = n16;
                                                                                        if (s8 > 0) {
                                                                                            n33 = s8;
                                                                                            break;
                                                                                        }
                                                                                        break Label_3803;
                                                                                    }
                                                                                    case 35: {
                                                                                        final int v6 = u8.V((List<?>)s5.getObject(o, n25));
                                                                                        n26 = n16;
                                                                                        if (v6 > 0) {
                                                                                            n33 = v6;
                                                                                            break;
                                                                                        }
                                                                                        break Label_3803;
                                                                                    }
                                                                                    case 34: {
                                                                                        n34 = u8.z(n18, (List<Long>)s5.getObject(o, n25), false);
                                                                                        break Label_3770;
                                                                                    }
                                                                                    case 33: {
                                                                                        n34 = u8.O(n18, (List<Integer>)s5.getObject(o, n25), false);
                                                                                        break Label_3770;
                                                                                    }
                                                                                    case 30: {
                                                                                        n34 = u8.D(n18, (List<Integer>)s5.getObject(o, n25), false);
                                                                                        break Label_3770;
                                                                                    }
                                                                                    case 29: {
                                                                                        final int n32 = u8.L(n18, (List<Integer>)s5.getObject(o, n25), false);
                                                                                        break Label_3797;
                                                                                    }
                                                                                    case 28: {
                                                                                        final int n32 = u8.r(n18, (List<f5>)s5.getObject(o, n25));
                                                                                        break Label_3797;
                                                                                    }
                                                                                    case 27: {
                                                                                        final int n32 = u8.c(n18, (List<?>)s5.getObject(o, n25), this.r(k));
                                                                                        break Label_3797;
                                                                                    }
                                                                                    case 26: {
                                                                                        final int n32 = u8.b(n18, (List<?>)s5.getObject(o, n25));
                                                                                        break Label_3797;
                                                                                    }
                                                                                    case 25: {
                                                                                        n34 = u8.X(n18, (List<?>)s5.getObject(o, n25), false);
                                                                                        break Label_3770;
                                                                                    }
                                                                                    case 23:
                                                                                    case 32: {
                                                                                        n34 = u8.U(n18, (List<?>)s5.getObject(o, n25), false);
                                                                                        break Label_3770;
                                                                                    }
                                                                                    case 22: {
                                                                                        n34 = u8.H(n18, (List<Integer>)s5.getObject(o, n25), false);
                                                                                        break Label_3770;
                                                                                    }
                                                                                    case 21: {
                                                                                        n34 = u8.t(n18, (List<Long>)s5.getObject(o, n25), false);
                                                                                        break Label_3770;
                                                                                    }
                                                                                    case 20: {
                                                                                        n34 = u8.d(n18, (List<Long>)s5.getObject(o, n25), false);
                                                                                        break Label_3770;
                                                                                    }
                                                                                    case 19:
                                                                                    case 24:
                                                                                    case 31: {
                                                                                        n34 = u8.R(n18, (List<?>)s5.getObject(o, n25), false);
                                                                                        break Label_3770;
                                                                                    }
                                                                                    case 18: {
                                                                                        final int n32 = u8.U(n18, (List<?>)s5.getObject(o, n25), false);
                                                                                        break Label_3797;
                                                                                    }
                                                                                    case 17: {
                                                                                        n26 = n16;
                                                                                        if ((int1 & n24) != 0x0) {
                                                                                            break Label_3817;
                                                                                        }
                                                                                        break Label_3803;
                                                                                    }
                                                                                    case 16: {
                                                                                        n26 = n16;
                                                                                        if ((int1 & n24) != 0x0) {
                                                                                            n27 = s5.getLong(o, n25);
                                                                                            break Label_3863;
                                                                                        }
                                                                                        break Label_3803;
                                                                                    }
                                                                                    case 15: {
                                                                                        n26 = n16;
                                                                                        if ((int1 & n24) != 0x0) {
                                                                                            n28 = s5.getInt(o, n25);
                                                                                            break Label_3895;
                                                                                        }
                                                                                        break Label_3803;
                                                                                    }
                                                                                    case 14: {
                                                                                        n26 = n16;
                                                                                        if ((int1 & n24) != 0x0) {
                                                                                            break Label_3918;
                                                                                        }
                                                                                        break Label_3803;
                                                                                    }
                                                                                    case 13: {
                                                                                        n26 = n16;
                                                                                        if ((int1 & n24) != 0x0) {
                                                                                            break Label_3940;
                                                                                        }
                                                                                        break Label_3803;
                                                                                    }
                                                                                    case 12: {
                                                                                        n26 = n16;
                                                                                        if ((int1 & n24) != 0x0) {
                                                                                            n29 = s5.getInt(o, n25);
                                                                                            break Label_3977;
                                                                                        }
                                                                                        break Label_3803;
                                                                                    }
                                                                                    case 11: {
                                                                                        n26 = n16;
                                                                                        if ((int1 & n24) != 0x0) {
                                                                                            n30 = s5.getInt(o, n25);
                                                                                            break Label_4009;
                                                                                        }
                                                                                        break Label_3803;
                                                                                    }
                                                                                    case 10: {
                                                                                        n26 = n16;
                                                                                        if ((int1 & n24) != 0x0) {
                                                                                            break Label_4032;
                                                                                        }
                                                                                        break Label_3803;
                                                                                    }
                                                                                    case 9: {
                                                                                        n26 = n16;
                                                                                        if ((int1 & n24) != 0x0) {
                                                                                            break Label_4067;
                                                                                        }
                                                                                        break Label_3803;
                                                                                    }
                                                                                    case 8: {
                                                                                        n26 = n16;
                                                                                        if ((int1 & n24) == 0x0) {
                                                                                            break Label_3803;
                                                                                        }
                                                                                        final Object o7 = o6 = s5.getObject(o, n25);
                                                                                        if (o7 instanceof f5) {
                                                                                            final Object object = o7;
                                                                                            break Label_4126;
                                                                                        }
                                                                                        break Label_4129;
                                                                                    }
                                                                                    case 7: {
                                                                                        n26 = n16;
                                                                                        if ((int1 & n24) != 0x0) {
                                                                                            n26 = n16 + v5.H(n18, true);
                                                                                        }
                                                                                        break Label_3803;
                                                                                    }
                                                                                    case 6: {
                                                                                        n26 = n16;
                                                                                        if ((int1 & n24) != 0x0) {
                                                                                            n26 = n16 + v5.y0(n18, 0);
                                                                                        }
                                                                                        break Label_3776;
                                                                                    }
                                                                                    case 5: {
                                                                                        n26 = n16;
                                                                                        if ((int1 & n24) != 0x0) {
                                                                                            n35 = v5.r0(n18, 0L);
                                                                                            break Label_3797;
                                                                                        }
                                                                                        break Label_4325;
                                                                                    }
                                                                                    case 4: {
                                                                                        n26 = n16;
                                                                                        if ((n24 & int1) != 0x0) {
                                                                                            n35 = v5.m0(n18, s5.getInt(o, n25));
                                                                                            break Label_3797;
                                                                                        }
                                                                                        break Label_4325;
                                                                                    }
                                                                                    case 3: {
                                                                                        n26 = n16;
                                                                                        if ((n24 & int1) != 0x0) {
                                                                                            n35 = v5.i0(n18, s5.getLong(o, n25));
                                                                                            break Label_3797;
                                                                                        }
                                                                                        break Label_4325;
                                                                                    }
                                                                                    case 2: {
                                                                                        n26 = n16;
                                                                                        if ((n24 & int1) != 0x0) {
                                                                                            n35 = v5.c0(n18, s5.getLong(o, n25));
                                                                                            break Label_3797;
                                                                                        }
                                                                                        break Label_4325;
                                                                                    }
                                                                                    case 1: {
                                                                                        n26 = n16;
                                                                                        if ((int1 & n24) != 0x0) {
                                                                                            n26 = n16 + v5.C(n18, 0.0f);
                                                                                        }
                                                                                        break Label_4325;
                                                                                    }
                                                                                    case 0: {
                                                                                        n26 = n16;
                                                                                        if ((int1 & n24) != 0x0) {
                                                                                            n26 = n16 + v5.B(n18, 0.0);
                                                                                        }
                                                                                        break Label_4325;
                                                                                    }
                                                                                }
                                                                                n31 = v5.h0(n18) + v5.p0(n33) + n33;
                                                                                break Label_3948;
                                                                            }
                                                                            n26 = n16 + n34;
                                                                        }
                                                                        break Label_3803;
                                                                        int n32 = 0;
                                                                        n26 = n16 + n32;
                                                                        break Label_4325;
                                                                    }
                                                                    final int n32 = v5.V(n18, (z7)s5.getObject(o, n25), this.r(k));
                                                                    continue Label_3797;
                                                                }
                                                                final int n32 = v5.n0(n18, n27);
                                                                continue Label_3797;
                                                            }
                                                            final int n32 = v5.u0(n18, n28);
                                                            continue Label_3797;
                                                        }
                                                        final int n32 = v5.v0(n18, 0L);
                                                        continue Label_3797;
                                                    }
                                                    n31 = v5.B0(n18, 0);
                                                }
                                                n26 = n16 + n31;
                                                continue Label_3797_Outer;
                                            }
                                            final int n32 = v5.D0(n18, n29);
                                            continue Label_3797;
                                        }
                                        final int n32 = v5.q0(n18, n30);
                                        continue Label_3797;
                                    }
                                    final Object object = s5.getObject(o, n25);
                                    final int n32 = v5.U(n18, (f5)object);
                                    continue Label_3797;
                                }
                                final int n32 = u8.a(n18, s5.getObject(o, n25), this.r(k));
                                continue Label_3797;
                            }
                            continue;
                        }
                    }
                    final int n32 = v5.G(n18, (String)o6);
                    continue Label_3797;
                }
                n26 = n16 + n35;
            }
            k += 3;
            n16 = n26;
            n17 = n23;
        }
        final int n36 = 0;
        int n37 = n16 + k(this.o, o);
        if (this.f) {
            final h6<?> b = this.p.b(o);
            int n38 = 0;
            int n39 = n36;
            while (n38 < b.a.j()) {
                final Map.Entry<?, Object> h = b.a.h(n38);
                n39 += h6.m((j6<?>)h.getKey(), h.getValue());
                ++n38;
            }
            for (final Map.Entry<j6<?>, V> entry : b.a.o()) {
                n39 += h6.m(entry.getKey(), entry.getValue());
            }
            n37 += n39;
        }
        return n37;
    }
    
    @Override
    public final void d(final T t, final T obj) {
        Objects.requireNonNull(obj);
        for (int i = 0; i < this.a.length; i += 3) {
            final int p2 = this.P(i);
            final long n = 0xFFFFF & p2;
            final int n2 = this.a[i];
            Label_0696: {
                Label_0636: {
                    Label_0600: {
                        Label_0528: {
                            Label_0482: {
                                switch ((p2 & 0xFF00000) >>> 20) {
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
                                        if (this.C(obj, n2, i)) {
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
                                        if (this.C(obj, n2, i)) {
                                            break;
                                        }
                                        continue;
                                    }
                                    case 50: {
                                        u8.n(this.q, t, obj, n);
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
                                        this.n.c(t, obj, n);
                                        continue;
                                    }
                                    case 16: {
                                        if (this.B(obj, i)) {
                                            break Label_0636;
                                        }
                                        continue;
                                    }
                                    case 15: {
                                        if (this.B(obj, i)) {
                                            break Label_0482;
                                        }
                                        continue;
                                    }
                                    case 14: {
                                        if (this.B(obj, i)) {
                                            break Label_0636;
                                        }
                                        continue;
                                    }
                                    case 13: {
                                        if (this.B(obj, i)) {
                                            break Label_0482;
                                        }
                                        continue;
                                    }
                                    case 12: {
                                        if (this.B(obj, i)) {
                                            break Label_0482;
                                        }
                                        continue;
                                    }
                                    case 11: {
                                        if (this.B(obj, i)) {
                                            break Label_0600;
                                        }
                                        continue;
                                    }
                                    case 10: {
                                        if (this.B(obj, i)) {
                                            break Label_0528;
                                        }
                                        continue;
                                    }
                                    case 9:
                                    case 17: {
                                        this.A(t, obj, i);
                                        continue;
                                    }
                                    case 8: {
                                        if (this.B(obj, i)) {
                                            break Label_0528;
                                        }
                                        continue;
                                    }
                                    case 7: {
                                        if (this.B(obj, i)) {
                                            r9.k(t, n, r9.w(obj, n));
                                            break Label_0696;
                                        }
                                        continue;
                                    }
                                    case 6: {
                                        if (this.B(obj, i)) {
                                            break Label_0600;
                                        }
                                        continue;
                                    }
                                    case 5: {
                                        if (this.B(obj, i)) {
                                            break Label_0636;
                                        }
                                        continue;
                                    }
                                    case 4: {
                                        if (this.B(obj, i)) {
                                            break Label_0600;
                                        }
                                        continue;
                                    }
                                    case 3: {
                                        if (this.B(obj, i)) {
                                            break Label_0636;
                                        }
                                        continue;
                                    }
                                    case 2: {
                                        if (this.B(obj, i)) {
                                            break Label_0636;
                                        }
                                        continue;
                                    }
                                    case 1: {
                                        if (this.B(obj, i)) {
                                            r9.g(t, n, r9.x(obj, n));
                                            break Label_0696;
                                        }
                                        continue;
                                    }
                                    case 0: {
                                        if (this.B(obj, i)) {
                                            r9.f(t, n, r9.C(obj, n));
                                            break Label_0696;
                                        }
                                        continue;
                                    }
                                }
                                r9.j(t, n, r9.F(obj, n));
                                this.J(t, n2, i);
                                continue;
                            }
                            break Label_0600;
                        }
                        r9.j(t, n, r9.F(obj, n));
                        break Label_0696;
                    }
                    r9.h(t, n, r9.b(obj, n));
                    break Label_0696;
                }
                r9.i(t, n, r9.o(obj, n));
            }
            this.I(t, i);
        }
        u8.o(this.o, t, obj);
        if (this.f) {
            u8.m(this.p, t, obj);
        }
    }
    
    @Override
    public final boolean e(final T o) {
        int n = 1048575;
        int int1 = 0;
        int n2 = 0;
        while (true) {
            final int k = this.k;
            final boolean b = true;
            final boolean b2 = true;
            if (n2 >= k) {
                return !this.f || this.p.b(o).s();
            }
            final int n3 = this.j[n2];
            final int n4 = this.a[n3];
            final int p = this.P(n3);
            final int n5 = this.a[n3 + 2];
            final int n6 = n5 & 0xFFFFF;
            final int n7 = 1 << (n5 >>> 20);
            if (n6 != n) {
                if (n6 != 1048575) {
                    int1 = d8.s.getInt(o, n6);
                }
                n = n6;
            }
            if ((0x10000000 & p) != 0x0 && !this.D(o, n3, n, int1, n7)) {
                return false;
            }
            final int n8 = (0xFF00000 & p) >>> 20;
            Label_0523: {
                if (n8 != 9 && n8 != 17) {
                    if (n8 != 27) {
                        if (n8 != 60 && n8 != 68) {
                            if (n8 != 49) {
                                if (n8 != 50) {
                                    break Label_0523;
                                }
                                final Map<?, ?> b3 = this.q.b(r9.F(o, p & 0xFFFFF));
                                int n9 = b2 ? 1 : 0;
                                Label_0362: {
                                    if (!b3.isEmpty()) {
                                        final Object h = this.H(n3);
                                        n9 = (b2 ? 1 : 0);
                                        if (this.q.c(h).c.b() == fa.P) {
                                            s8<?> s8 = null;
                                            final Iterator<?> iterator = b3.values().iterator();
                                            s8<?> b4;
                                            Object next;
                                            do {
                                                n9 = (b2 ? 1 : 0);
                                                if (!iterator.hasNext()) {
                                                    break Label_0362;
                                                }
                                                next = iterator.next();
                                                if ((b4 = s8) == null) {
                                                    b4 = com.google.android.gms.internal.vision.n8.a().b(next.getClass());
                                                }
                                                s8 = b4;
                                            } while (b4.e(next));
                                            n9 = 0;
                                        }
                                    }
                                }
                                if (n9 == 0) {
                                    return false;
                                }
                                break Label_0523;
                            }
                        }
                        else {
                            if (this.C(o, n4, n3) && !E(o, p, this.r(n3))) {
                                return false;
                            }
                            break Label_0523;
                        }
                    }
                    final List list = (List)r9.F(o, p & 0xFFFFF);
                    int n10 = b ? 1 : 0;
                    if (!list.isEmpty()) {
                        final s8 r = this.r(n3);
                        int n11 = 0;
                        while (true) {
                            n10 = (b ? 1 : 0);
                            if (n11 >= list.size()) {
                                break;
                            }
                            if (!r.e(list.get(n11))) {
                                n10 = 0;
                                break;
                            }
                            ++n11;
                        }
                    }
                    if (n10 == 0) {
                        return false;
                    }
                }
                else if (this.D(o, n3, n, int1, n7) && !E(o, p, this.r(n3))) {
                    return false;
                }
            }
            ++n2;
        }
    }
    
    @Override
    public final boolean f(final T t, final T t2) {
        final int length = this.a.length;
        int n = 0;
        while (true) {
            boolean q = true;
            if (n >= length) {
                return this.o.k(t).equals(this.o.k(t2)) && (!this.f || this.p.b(t).equals(this.p.b(t2)));
            }
            final int p2 = this.P(n);
            final long n2 = p2 & 0xFFFFF;
            Label_0955: {
                switch ((p2 & 0xFF00000) >>> 20) {
                    default: {
                        break Label_0955;
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
                        final long n3 = this.R(n) & 0xFFFFF;
                        if (r9.b(t, n3) != r9.b(t2, n3)) {
                            break;
                        }
                        if (!u8.q(r9.F(t, n2), r9.F(t2, n2))) {
                            break;
                        }
                        break Label_0955;
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
                        q = u8.q(r9.F(t, n2), r9.F(t2, n2));
                        break Label_0955;
                    }
                    case 17: {
                        if (!this.O(t, t2, n)) {
                            break;
                        }
                        if (!u8.q(r9.F(t, n2), r9.F(t2, n2))) {
                            break;
                        }
                        break Label_0955;
                    }
                    case 16: {
                        if (!this.O(t, t2, n)) {
                            break;
                        }
                        if (r9.o(t, n2) != r9.o(t2, n2)) {
                            break;
                        }
                        break Label_0955;
                    }
                    case 15: {
                        if (!this.O(t, t2, n)) {
                            break;
                        }
                        if (r9.b(t, n2) != r9.b(t2, n2)) {
                            break;
                        }
                        break Label_0955;
                    }
                    case 14: {
                        if (!this.O(t, t2, n)) {
                            break;
                        }
                        if (r9.o(t, n2) != r9.o(t2, n2)) {
                            break;
                        }
                        break Label_0955;
                    }
                    case 13: {
                        if (!this.O(t, t2, n)) {
                            break;
                        }
                        if (r9.b(t, n2) != r9.b(t2, n2)) {
                            break;
                        }
                        break Label_0955;
                    }
                    case 12: {
                        if (!this.O(t, t2, n)) {
                            break;
                        }
                        if (r9.b(t, n2) != r9.b(t2, n2)) {
                            break;
                        }
                        break Label_0955;
                    }
                    case 11: {
                        if (!this.O(t, t2, n)) {
                            break;
                        }
                        if (r9.b(t, n2) != r9.b(t2, n2)) {
                            break;
                        }
                        break Label_0955;
                    }
                    case 10: {
                        if (!this.O(t, t2, n)) {
                            break;
                        }
                        if (!u8.q(r9.F(t, n2), r9.F(t2, n2))) {
                            break;
                        }
                        break Label_0955;
                    }
                    case 9: {
                        if (!this.O(t, t2, n)) {
                            break;
                        }
                        if (!u8.q(r9.F(t, n2), r9.F(t2, n2))) {
                            break;
                        }
                        break Label_0955;
                    }
                    case 8: {
                        if (!this.O(t, t2, n)) {
                            break;
                        }
                        if (!u8.q(r9.F(t, n2), r9.F(t2, n2))) {
                            break;
                        }
                        break Label_0955;
                    }
                    case 7: {
                        if (!this.O(t, t2, n)) {
                            break;
                        }
                        if (r9.w(t, n2) != r9.w(t2, n2)) {
                            break;
                        }
                        break Label_0955;
                    }
                    case 6: {
                        if (!this.O(t, t2, n)) {
                            break;
                        }
                        if (r9.b(t, n2) != r9.b(t2, n2)) {
                            break;
                        }
                        break Label_0955;
                    }
                    case 5: {
                        if (!this.O(t, t2, n)) {
                            break;
                        }
                        if (r9.o(t, n2) != r9.o(t2, n2)) {
                            break;
                        }
                        break Label_0955;
                    }
                    case 4: {
                        if (!this.O(t, t2, n)) {
                            break;
                        }
                        if (r9.b(t, n2) != r9.b(t2, n2)) {
                            break;
                        }
                        break Label_0955;
                    }
                    case 3: {
                        if (!this.O(t, t2, n)) {
                            break;
                        }
                        if (r9.o(t, n2) != r9.o(t2, n2)) {
                            break;
                        }
                        break Label_0955;
                    }
                    case 2: {
                        if (!this.O(t, t2, n)) {
                            break;
                        }
                        if (r9.o(t, n2) != r9.o(t2, n2)) {
                            break;
                        }
                        break Label_0955;
                    }
                    case 1: {
                        if (!this.O(t, t2, n)) {
                            break;
                        }
                        if (Float.floatToIntBits(r9.x(t, n2)) != Float.floatToIntBits(r9.x(t2, n2))) {
                            break;
                        }
                        break Label_0955;
                    }
                    case 0: {
                        if (!this.O(t, t2, n) || Double.doubleToLongBits(r9.C(t, n2)) != Double.doubleToLongBits(r9.C(t2, n2))) {
                            break;
                        }
                        break Label_0955;
                    }
                }
                q = false;
            }
            if (!q) {
                return false;
            }
            n += 3;
        }
    }
    
    @Override
    public final void g(final T t, final ia ia) throws IOException {
        if (ia.zza() == ha.b) {
            x(this.o, t, ia);
            Object r = null;
            Map.Entry<?, ?> entry = null;
            Label_0073: {
                if (this.f) {
                    final h6<?> b = this.p.b(t);
                    if (!b.a.isEmpty()) {
                        r = b.r();
                        entry = ((Iterator<Map.Entry<?, ?>>)r).next();
                        break Label_0073;
                    }
                }
                r = (entry = null);
            }
            int n = this.a.length - 3;
            Object o = entry;
            Object o2;
            while (true) {
                o2 = o;
                if (n < 0) {
                    break;
                }
                final int p2 = this.P(n);
                final int n2 = this.a[n];
                while (o != null && this.p.a((Map.Entry<?, ?>)o) > n2) {
                    this.p.g(ia, (Map.Entry<?, ?>)o);
                    if (((Iterator)r).hasNext()) {
                        o = ((Iterator<Map.Entry<?, ?>>)r).next();
                    }
                    else {
                        o = null;
                    }
                }
                Label_2459: {
                    double n15 = 0.0;
                    Label_2449: {
                        float n14 = 0.0f;
                        Label_2414: {
                            long n13 = 0L;
                            Label_2379: {
                                long n12 = 0L;
                                Label_2344: {
                                    int n11 = 0;
                                    Label_2309: {
                                        long n10 = 0L;
                                        Label_2274: {
                                            int n9 = 0;
                                            Label_2239: {
                                                boolean b2 = false;
                                                Label_2204: {
                                                    Label_2163: {
                                                        Label_2126: {
                                                            Label_2092: {
                                                                int n8 = 0;
                                                                Label_2069: {
                                                                    int n7 = 0;
                                                                    Label_2034: {
                                                                        int n6 = 0;
                                                                        Label_1999: {
                                                                            long n5 = 0L;
                                                                            Label_1964: {
                                                                                int n4 = 0;
                                                                                Label_1929: {
                                                                                    long n3 = 0L;
                                                                                    Label_1894: {
                                                                                        switch ((p2 & 0xFF00000) >>> 20) {
                                                                                            default: {
                                                                                                break Label_2459;
                                                                                            }
                                                                                            case 68: {
                                                                                                if (this.C(t, n2, n)) {
                                                                                                    break;
                                                                                                }
                                                                                                break Label_2459;
                                                                                            }
                                                                                            case 67: {
                                                                                                if (this.C(t, n2, n)) {
                                                                                                    n3 = S(t, p2 & 0xFFFFF);
                                                                                                    break Label_1894;
                                                                                                }
                                                                                                break Label_2459;
                                                                                            }
                                                                                            case 66: {
                                                                                                if (this.C(t, n2, n)) {
                                                                                                    n4 = Q(t, p2 & 0xFFFFF);
                                                                                                    break Label_1929;
                                                                                                }
                                                                                                break Label_2459;
                                                                                            }
                                                                                            case 65: {
                                                                                                if (this.C(t, n2, n)) {
                                                                                                    n5 = S(t, p2 & 0xFFFFF);
                                                                                                    break Label_1964;
                                                                                                }
                                                                                                break Label_2459;
                                                                                            }
                                                                                            case 64: {
                                                                                                if (this.C(t, n2, n)) {
                                                                                                    n6 = Q(t, p2 & 0xFFFFF);
                                                                                                    break Label_1999;
                                                                                                }
                                                                                                break Label_2459;
                                                                                            }
                                                                                            case 63: {
                                                                                                if (this.C(t, n2, n)) {
                                                                                                    n7 = Q(t, p2 & 0xFFFFF);
                                                                                                    break Label_2034;
                                                                                                }
                                                                                                break Label_2459;
                                                                                            }
                                                                                            case 62: {
                                                                                                if (this.C(t, n2, n)) {
                                                                                                    n8 = Q(t, p2 & 0xFFFFF);
                                                                                                    break Label_2069;
                                                                                                }
                                                                                                break Label_2459;
                                                                                            }
                                                                                            case 61: {
                                                                                                if (this.C(t, n2, n)) {
                                                                                                    break Label_2092;
                                                                                                }
                                                                                                break Label_2459;
                                                                                            }
                                                                                            case 60: {
                                                                                                if (this.C(t, n2, n)) {
                                                                                                    break Label_2126;
                                                                                                }
                                                                                                break Label_2459;
                                                                                            }
                                                                                            case 59: {
                                                                                                if (this.C(t, n2, n)) {
                                                                                                    break Label_2163;
                                                                                                }
                                                                                                break Label_2459;
                                                                                            }
                                                                                            case 58: {
                                                                                                if (this.C(t, n2, n)) {
                                                                                                    b2 = V(t, p2 & 0xFFFFF);
                                                                                                    break Label_2204;
                                                                                                }
                                                                                                break Label_2459;
                                                                                            }
                                                                                            case 57: {
                                                                                                if (this.C(t, n2, n)) {
                                                                                                    n9 = Q(t, p2 & 0xFFFFF);
                                                                                                    break Label_2239;
                                                                                                }
                                                                                                break Label_2459;
                                                                                            }
                                                                                            case 56: {
                                                                                                if (this.C(t, n2, n)) {
                                                                                                    n10 = S(t, p2 & 0xFFFFF);
                                                                                                    break Label_2274;
                                                                                                }
                                                                                                break Label_2459;
                                                                                            }
                                                                                            case 55: {
                                                                                                if (this.C(t, n2, n)) {
                                                                                                    n11 = Q(t, p2 & 0xFFFFF);
                                                                                                    break Label_2309;
                                                                                                }
                                                                                                break Label_2459;
                                                                                            }
                                                                                            case 54: {
                                                                                                if (this.C(t, n2, n)) {
                                                                                                    n12 = S(t, p2 & 0xFFFFF);
                                                                                                    break Label_2344;
                                                                                                }
                                                                                                break Label_2459;
                                                                                            }
                                                                                            case 53: {
                                                                                                if (this.C(t, n2, n)) {
                                                                                                    n13 = S(t, p2 & 0xFFFFF);
                                                                                                    break Label_2379;
                                                                                                }
                                                                                                break Label_2459;
                                                                                            }
                                                                                            case 52: {
                                                                                                if (this.C(t, n2, n)) {
                                                                                                    n14 = M(t, p2 & 0xFFFFF);
                                                                                                    break Label_2414;
                                                                                                }
                                                                                                break Label_2459;
                                                                                            }
                                                                                            case 51: {
                                                                                                if (this.C(t, n2, n)) {
                                                                                                    n15 = F(t, p2 & 0xFFFFF);
                                                                                                    break Label_2449;
                                                                                                }
                                                                                                break Label_2459;
                                                                                            }
                                                                                            case 50: {
                                                                                                this.y(ia, n2, r9.F(t, p2 & 0xFFFFF), n);
                                                                                                break Label_2459;
                                                                                            }
                                                                                            case 49: {
                                                                                                u8.x(this.a[n], (List<?>)r9.F(t, p2 & 0xFFFFF), ia, this.r(n));
                                                                                                break Label_2459;
                                                                                            }
                                                                                            case 48: {
                                                                                                u8.K(this.a[n], (List<Long>)r9.F(t, p2 & 0xFFFFF), ia, true);
                                                                                                break Label_2459;
                                                                                            }
                                                                                            case 47: {
                                                                                                u8.Z(this.a[n], (List<Integer>)r9.F(t, p2 & 0xFFFFF), ia, true);
                                                                                                break Label_2459;
                                                                                            }
                                                                                            case 46: {
                                                                                                u8.Q(this.a[n], (List<Long>)r9.F(t, p2 & 0xFFFFF), ia, true);
                                                                                                break Label_2459;
                                                                                            }
                                                                                            case 45: {
                                                                                                u8.b0(this.a[n], (List<Integer>)r9.F(t, p2 & 0xFFFFF), ia, true);
                                                                                                break Label_2459;
                                                                                            }
                                                                                            case 44: {
                                                                                                u8.c0(this.a[n], (List<Integer>)r9.F(t, p2 & 0xFFFFF), ia, true);
                                                                                                break Label_2459;
                                                                                            }
                                                                                            case 43: {
                                                                                                u8.W(this.a[n], (List<Integer>)r9.F(t, p2 & 0xFFFFF), ia, true);
                                                                                                break Label_2459;
                                                                                            }
                                                                                            case 42: {
                                                                                                u8.d0(this.a[n], (List<Boolean>)r9.F(t, p2 & 0xFFFFF), ia, true);
                                                                                                break Label_2459;
                                                                                            }
                                                                                            case 41: {
                                                                                                u8.a0(this.a[n], (List<Integer>)r9.F(t, p2 & 0xFFFFF), ia, true);
                                                                                                break Label_2459;
                                                                                            }
                                                                                            case 40: {
                                                                                                u8.N(this.a[n], (List<Long>)r9.F(t, p2 & 0xFFFFF), ia, true);
                                                                                                break Label_2459;
                                                                                            }
                                                                                            case 39: {
                                                                                                u8.T(this.a[n], (List<Integer>)r9.F(t, p2 & 0xFFFFF), ia, true);
                                                                                                break Label_2459;
                                                                                            }
                                                                                            case 38: {
                                                                                                u8.G(this.a[n], (List<Long>)r9.F(t, p2 & 0xFFFFF), ia, true);
                                                                                                break Label_2459;
                                                                                            }
                                                                                            case 37: {
                                                                                                u8.C(this.a[n], (List<Long>)r9.F(t, p2 & 0xFFFFF), ia, true);
                                                                                                break Label_2459;
                                                                                            }
                                                                                            case 36: {
                                                                                                u8.y(this.a[n], (List<Float>)r9.F(t, p2 & 0xFFFFF), ia, true);
                                                                                                break Label_2459;
                                                                                            }
                                                                                            case 35: {
                                                                                                u8.l(this.a[n], (List<Double>)r9.F(t, p2 & 0xFFFFF), ia, true);
                                                                                                break Label_2459;
                                                                                            }
                                                                                            case 34: {
                                                                                                u8.K(this.a[n], (List<Long>)r9.F(t, p2 & 0xFFFFF), ia, false);
                                                                                                break Label_2459;
                                                                                            }
                                                                                            case 33: {
                                                                                                u8.Z(this.a[n], (List<Integer>)r9.F(t, p2 & 0xFFFFF), ia, false);
                                                                                                break Label_2459;
                                                                                            }
                                                                                            case 32: {
                                                                                                u8.Q(this.a[n], (List<Long>)r9.F(t, p2 & 0xFFFFF), ia, false);
                                                                                                break Label_2459;
                                                                                            }
                                                                                            case 31: {
                                                                                                u8.b0(this.a[n], (List<Integer>)r9.F(t, p2 & 0xFFFFF), ia, false);
                                                                                                break Label_2459;
                                                                                            }
                                                                                            case 30: {
                                                                                                u8.c0(this.a[n], (List<Integer>)r9.F(t, p2 & 0xFFFFF), ia, false);
                                                                                                break Label_2459;
                                                                                            }
                                                                                            case 29: {
                                                                                                u8.W(this.a[n], (List<Integer>)r9.F(t, p2 & 0xFFFFF), ia, false);
                                                                                                break Label_2459;
                                                                                            }
                                                                                            case 28: {
                                                                                                u8.w(this.a[n], (List<f5>)r9.F(t, p2 & 0xFFFFF), ia);
                                                                                                break Label_2459;
                                                                                            }
                                                                                            case 27: {
                                                                                                u8.k(this.a[n], (List<?>)r9.F(t, p2 & 0xFFFFF), ia, this.r(n));
                                                                                                break Label_2459;
                                                                                            }
                                                                                            case 26: {
                                                                                                u8.j(this.a[n], (List<String>)r9.F(t, p2 & 0xFFFFF), ia);
                                                                                                break Label_2459;
                                                                                            }
                                                                                            case 25: {
                                                                                                u8.d0(this.a[n], (List<Boolean>)r9.F(t, p2 & 0xFFFFF), ia, false);
                                                                                                break Label_2459;
                                                                                            }
                                                                                            case 24: {
                                                                                                u8.a0(this.a[n], (List<Integer>)r9.F(t, p2 & 0xFFFFF), ia, false);
                                                                                                break Label_2459;
                                                                                            }
                                                                                            case 23: {
                                                                                                u8.N(this.a[n], (List<Long>)r9.F(t, p2 & 0xFFFFF), ia, false);
                                                                                                break Label_2459;
                                                                                            }
                                                                                            case 22: {
                                                                                                u8.T(this.a[n], (List<Integer>)r9.F(t, p2 & 0xFFFFF), ia, false);
                                                                                                break Label_2459;
                                                                                            }
                                                                                            case 21: {
                                                                                                u8.G(this.a[n], (List<Long>)r9.F(t, p2 & 0xFFFFF), ia, false);
                                                                                                break Label_2459;
                                                                                            }
                                                                                            case 20: {
                                                                                                u8.C(this.a[n], (List<Long>)r9.F(t, p2 & 0xFFFFF), ia, false);
                                                                                                break Label_2459;
                                                                                            }
                                                                                            case 19: {
                                                                                                u8.y(this.a[n], (List<Float>)r9.F(t, p2 & 0xFFFFF), ia, false);
                                                                                                break Label_2459;
                                                                                            }
                                                                                            case 18: {
                                                                                                u8.l(this.a[n], (List<Double>)r9.F(t, p2 & 0xFFFFF), ia, false);
                                                                                                break Label_2459;
                                                                                            }
                                                                                            case 17: {
                                                                                                if (this.B(t, n)) {
                                                                                                    break;
                                                                                                }
                                                                                                break Label_2459;
                                                                                            }
                                                                                            case 16: {
                                                                                                if (this.B(t, n)) {
                                                                                                    n3 = r9.o(t, p2 & 0xFFFFF);
                                                                                                    break Label_1894;
                                                                                                }
                                                                                                break Label_2459;
                                                                                            }
                                                                                            case 15: {
                                                                                                if (this.B(t, n)) {
                                                                                                    n4 = r9.b(t, p2 & 0xFFFFF);
                                                                                                    break Label_1929;
                                                                                                }
                                                                                                break Label_2459;
                                                                                            }
                                                                                            case 14: {
                                                                                                if (this.B(t, n)) {
                                                                                                    n5 = r9.o(t, p2 & 0xFFFFF);
                                                                                                    break Label_1964;
                                                                                                }
                                                                                                break Label_2459;
                                                                                            }
                                                                                            case 13: {
                                                                                                if (this.B(t, n)) {
                                                                                                    n6 = r9.b(t, p2 & 0xFFFFF);
                                                                                                    break Label_1999;
                                                                                                }
                                                                                                break Label_2459;
                                                                                            }
                                                                                            case 12: {
                                                                                                if (this.B(t, n)) {
                                                                                                    n7 = r9.b(t, p2 & 0xFFFFF);
                                                                                                    break Label_2034;
                                                                                                }
                                                                                                break Label_2459;
                                                                                            }
                                                                                            case 11: {
                                                                                                if (this.B(t, n)) {
                                                                                                    n8 = r9.b(t, p2 & 0xFFFFF);
                                                                                                    break Label_2069;
                                                                                                }
                                                                                                break Label_2459;
                                                                                            }
                                                                                            case 10: {
                                                                                                if (this.B(t, n)) {
                                                                                                    break Label_2092;
                                                                                                }
                                                                                                break Label_2459;
                                                                                            }
                                                                                            case 9: {
                                                                                                if (this.B(t, n)) {
                                                                                                    break Label_2126;
                                                                                                }
                                                                                                break Label_2459;
                                                                                            }
                                                                                            case 8: {
                                                                                                if (this.B(t, n)) {
                                                                                                    break Label_2163;
                                                                                                }
                                                                                                break Label_2459;
                                                                                            }
                                                                                            case 7: {
                                                                                                if (this.B(t, n)) {
                                                                                                    b2 = r9.w(t, p2 & 0xFFFFF);
                                                                                                    break Label_2204;
                                                                                                }
                                                                                                break Label_2459;
                                                                                            }
                                                                                            case 6: {
                                                                                                if (this.B(t, n)) {
                                                                                                    n9 = r9.b(t, p2 & 0xFFFFF);
                                                                                                    break Label_2239;
                                                                                                }
                                                                                                break Label_2459;
                                                                                            }
                                                                                            case 5: {
                                                                                                if (this.B(t, n)) {
                                                                                                    n10 = r9.o(t, p2 & 0xFFFFF);
                                                                                                    break Label_2274;
                                                                                                }
                                                                                                break Label_2459;
                                                                                            }
                                                                                            case 4: {
                                                                                                if (this.B(t, n)) {
                                                                                                    n11 = r9.b(t, p2 & 0xFFFFF);
                                                                                                    break Label_2309;
                                                                                                }
                                                                                                break Label_2459;
                                                                                            }
                                                                                            case 3: {
                                                                                                if (this.B(t, n)) {
                                                                                                    n12 = r9.o(t, p2 & 0xFFFFF);
                                                                                                    break Label_2344;
                                                                                                }
                                                                                                break Label_2459;
                                                                                            }
                                                                                            case 2: {
                                                                                                if (this.B(t, n)) {
                                                                                                    n13 = r9.o(t, p2 & 0xFFFFF);
                                                                                                    break Label_2379;
                                                                                                }
                                                                                                break Label_2459;
                                                                                            }
                                                                                            case 1: {
                                                                                                if (this.B(t, n)) {
                                                                                                    n14 = r9.x(t, p2 & 0xFFFFF);
                                                                                                    break Label_2414;
                                                                                                }
                                                                                                break Label_2459;
                                                                                            }
                                                                                            case 0: {
                                                                                                if (this.B(t, n)) {
                                                                                                    n15 = r9.C(t, p2 & 0xFFFFF);
                                                                                                    break Label_2449;
                                                                                                }
                                                                                                break Label_2459;
                                                                                            }
                                                                                        }
                                                                                        ia.M(n2, r9.F(t, p2 & 0xFFFFF), this.r(n));
                                                                                        break Label_2459;
                                                                                    }
                                                                                    ia.L(n2, n3);
                                                                                    break Label_2459;
                                                                                }
                                                                                ia.u(n2, n4);
                                                                                break Label_2459;
                                                                            }
                                                                            ia.c(n2, n5);
                                                                            break Label_2459;
                                                                        }
                                                                        ia.a(n2, n6);
                                                                        break Label_2459;
                                                                    }
                                                                    ia.G(n2, n7);
                                                                    break Label_2459;
                                                                }
                                                                ia.C(n2, n8);
                                                                break Label_2459;
                                                            }
                                                            ia.F(n2, (f5)r9.F(t, p2 & 0xFFFFF));
                                                            break Label_2459;
                                                        }
                                                        ia.J(n2, r9.F(t, p2 & 0xFFFFF), this.r(n));
                                                        break Label_2459;
                                                    }
                                                    w(n2, r9.F(t, p2 & 0xFFFFF), ia);
                                                    break Label_2459;
                                                }
                                                ia.E(n2, b2);
                                                break Label_2459;
                                            }
                                            ia.A(n2, n9);
                                            break Label_2459;
                                        }
                                        ia.K(n2, n10);
                                        break Label_2459;
                                    }
                                    ia.g(n2, n11);
                                    break Label_2459;
                                }
                                ia.h(n2, n12);
                                break Label_2459;
                            }
                            ia.p(n2, n13);
                            break Label_2459;
                        }
                        ia.r(n2, n14);
                        break Label_2459;
                    }
                    ia.q(n2, n15);
                }
                n -= 3;
            }
            while (o2 != null) {
                this.p.g(ia, (Map.Entry<?, ?>)o2);
                if (((Iterator)r).hasNext()) {
                    o2 = ((Iterator<Map.Entry<?, ?>>)r).next();
                }
                else {
                    o2 = null;
                }
            }
            return;
        }
        if (this.h) {
            Object p3 = null;
            Map.Entry<?, ?> entry2 = null;
            Label_2567: {
                if (this.f) {
                    final h6<?> b3 = this.p.b(t);
                    if (!b3.a.isEmpty()) {
                        p3 = b3.p();
                        entry2 = ((Iterator<Map.Entry<?, ?>>)p3).next();
                        break Label_2567;
                    }
                }
                p3 = (entry2 = null);
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
                final int p4 = this.P(n16);
                final int n17 = this.a[n16];
                while (o3 != null && this.p.a((Map.Entry<?, ?>)o3) <= n17) {
                    this.p.g(ia, (Map.Entry<?, ?>)o3);
                    if (((Iterator)p3).hasNext()) {
                        o3 = ((Iterator<Map.Entry<?, ?>>)p3).next();
                    }
                    else {
                        o3 = null;
                    }
                }
                Label_4955: {
                    double n30 = 0.0;
                    Label_4945: {
                        float n29 = 0.0f;
                        Label_4910: {
                            long n28 = 0L;
                            Label_4875: {
                                long n27 = 0L;
                                Label_4840: {
                                    int n26 = 0;
                                    Label_4805: {
                                        long n25 = 0L;
                                        Label_4770: {
                                            int n24 = 0;
                                            Label_4735: {
                                                boolean b4 = false;
                                                Label_4700: {
                                                    Label_4659: {
                                                        Label_4622: {
                                                            Label_4588: {
                                                                int n23 = 0;
                                                                Label_4565: {
                                                                    int n22 = 0;
                                                                    Label_4530: {
                                                                        int n21 = 0;
                                                                        Label_4495: {
                                                                            long n20 = 0L;
                                                                            Label_4460: {
                                                                                int n19 = 0;
                                                                                Label_4425: {
                                                                                    long n18 = 0L;
                                                                                    Label_4390: {
                                                                                        switch ((p4 & 0xFF00000) >>> 20) {
                                                                                            default: {
                                                                                                break Label_4955;
                                                                                            }
                                                                                            case 68: {
                                                                                                if (this.C(t, n17, n16)) {
                                                                                                    break;
                                                                                                }
                                                                                                break Label_4955;
                                                                                            }
                                                                                            case 67: {
                                                                                                if (this.C(t, n17, n16)) {
                                                                                                    n18 = S(t, p4 & 0xFFFFF);
                                                                                                    break Label_4390;
                                                                                                }
                                                                                                break Label_4955;
                                                                                            }
                                                                                            case 66: {
                                                                                                if (this.C(t, n17, n16)) {
                                                                                                    n19 = Q(t, p4 & 0xFFFFF);
                                                                                                    break Label_4425;
                                                                                                }
                                                                                                break Label_4955;
                                                                                            }
                                                                                            case 65: {
                                                                                                if (this.C(t, n17, n16)) {
                                                                                                    n20 = S(t, p4 & 0xFFFFF);
                                                                                                    break Label_4460;
                                                                                                }
                                                                                                break Label_4955;
                                                                                            }
                                                                                            case 64: {
                                                                                                if (this.C(t, n17, n16)) {
                                                                                                    n21 = Q(t, p4 & 0xFFFFF);
                                                                                                    break Label_4495;
                                                                                                }
                                                                                                break Label_4955;
                                                                                            }
                                                                                            case 63: {
                                                                                                if (this.C(t, n17, n16)) {
                                                                                                    n22 = Q(t, p4 & 0xFFFFF);
                                                                                                    break Label_4530;
                                                                                                }
                                                                                                break Label_4955;
                                                                                            }
                                                                                            case 62: {
                                                                                                if (this.C(t, n17, n16)) {
                                                                                                    n23 = Q(t, p4 & 0xFFFFF);
                                                                                                    break Label_4565;
                                                                                                }
                                                                                                break Label_4955;
                                                                                            }
                                                                                            case 61: {
                                                                                                if (this.C(t, n17, n16)) {
                                                                                                    break Label_4588;
                                                                                                }
                                                                                                break Label_4955;
                                                                                            }
                                                                                            case 60: {
                                                                                                if (this.C(t, n17, n16)) {
                                                                                                    break Label_4622;
                                                                                                }
                                                                                                break Label_4955;
                                                                                            }
                                                                                            case 59: {
                                                                                                if (this.C(t, n17, n16)) {
                                                                                                    break Label_4659;
                                                                                                }
                                                                                                break Label_4955;
                                                                                            }
                                                                                            case 58: {
                                                                                                if (this.C(t, n17, n16)) {
                                                                                                    b4 = V(t, p4 & 0xFFFFF);
                                                                                                    break Label_4700;
                                                                                                }
                                                                                                break Label_4955;
                                                                                            }
                                                                                            case 57: {
                                                                                                if (this.C(t, n17, n16)) {
                                                                                                    n24 = Q(t, p4 & 0xFFFFF);
                                                                                                    break Label_4735;
                                                                                                }
                                                                                                break Label_4955;
                                                                                            }
                                                                                            case 56: {
                                                                                                if (this.C(t, n17, n16)) {
                                                                                                    n25 = S(t, p4 & 0xFFFFF);
                                                                                                    break Label_4770;
                                                                                                }
                                                                                                break Label_4955;
                                                                                            }
                                                                                            case 55: {
                                                                                                if (this.C(t, n17, n16)) {
                                                                                                    n26 = Q(t, p4 & 0xFFFFF);
                                                                                                    break Label_4805;
                                                                                                }
                                                                                                break Label_4955;
                                                                                            }
                                                                                            case 54: {
                                                                                                if (this.C(t, n17, n16)) {
                                                                                                    n27 = S(t, p4 & 0xFFFFF);
                                                                                                    break Label_4840;
                                                                                                }
                                                                                                break Label_4955;
                                                                                            }
                                                                                            case 53: {
                                                                                                if (this.C(t, n17, n16)) {
                                                                                                    n28 = S(t, p4 & 0xFFFFF);
                                                                                                    break Label_4875;
                                                                                                }
                                                                                                break Label_4955;
                                                                                            }
                                                                                            case 52: {
                                                                                                if (this.C(t, n17, n16)) {
                                                                                                    n29 = M(t, p4 & 0xFFFFF);
                                                                                                    break Label_4910;
                                                                                                }
                                                                                                break Label_4955;
                                                                                            }
                                                                                            case 51: {
                                                                                                if (this.C(t, n17, n16)) {
                                                                                                    n30 = F(t, p4 & 0xFFFFF);
                                                                                                    break Label_4945;
                                                                                                }
                                                                                                break Label_4955;
                                                                                            }
                                                                                            case 50: {
                                                                                                this.y(ia, n17, r9.F(t, p4 & 0xFFFFF), n16);
                                                                                                break Label_4955;
                                                                                            }
                                                                                            case 49: {
                                                                                                u8.x(this.a[n16], (List<?>)r9.F(t, p4 & 0xFFFFF), ia, this.r(n16));
                                                                                                break Label_4955;
                                                                                            }
                                                                                            case 48: {
                                                                                                u8.K(this.a[n16], (List<Long>)r9.F(t, p4 & 0xFFFFF), ia, true);
                                                                                                break Label_4955;
                                                                                            }
                                                                                            case 47: {
                                                                                                u8.Z(this.a[n16], (List<Integer>)r9.F(t, p4 & 0xFFFFF), ia, true);
                                                                                                break Label_4955;
                                                                                            }
                                                                                            case 46: {
                                                                                                u8.Q(this.a[n16], (List<Long>)r9.F(t, p4 & 0xFFFFF), ia, true);
                                                                                                break Label_4955;
                                                                                            }
                                                                                            case 45: {
                                                                                                u8.b0(this.a[n16], (List<Integer>)r9.F(t, p4 & 0xFFFFF), ia, true);
                                                                                                break Label_4955;
                                                                                            }
                                                                                            case 44: {
                                                                                                u8.c0(this.a[n16], (List<Integer>)r9.F(t, p4 & 0xFFFFF), ia, true);
                                                                                                break Label_4955;
                                                                                            }
                                                                                            case 43: {
                                                                                                u8.W(this.a[n16], (List<Integer>)r9.F(t, p4 & 0xFFFFF), ia, true);
                                                                                                break Label_4955;
                                                                                            }
                                                                                            case 42: {
                                                                                                u8.d0(this.a[n16], (List<Boolean>)r9.F(t, p4 & 0xFFFFF), ia, true);
                                                                                                break Label_4955;
                                                                                            }
                                                                                            case 41: {
                                                                                                u8.a0(this.a[n16], (List<Integer>)r9.F(t, p4 & 0xFFFFF), ia, true);
                                                                                                break Label_4955;
                                                                                            }
                                                                                            case 40: {
                                                                                                u8.N(this.a[n16], (List<Long>)r9.F(t, p4 & 0xFFFFF), ia, true);
                                                                                                break Label_4955;
                                                                                            }
                                                                                            case 39: {
                                                                                                u8.T(this.a[n16], (List<Integer>)r9.F(t, p4 & 0xFFFFF), ia, true);
                                                                                                break Label_4955;
                                                                                            }
                                                                                            case 38: {
                                                                                                u8.G(this.a[n16], (List<Long>)r9.F(t, p4 & 0xFFFFF), ia, true);
                                                                                                break Label_4955;
                                                                                            }
                                                                                            case 37: {
                                                                                                u8.C(this.a[n16], (List<Long>)r9.F(t, p4 & 0xFFFFF), ia, true);
                                                                                                break Label_4955;
                                                                                            }
                                                                                            case 36: {
                                                                                                u8.y(this.a[n16], (List<Float>)r9.F(t, p4 & 0xFFFFF), ia, true);
                                                                                                break Label_4955;
                                                                                            }
                                                                                            case 35: {
                                                                                                u8.l(this.a[n16], (List<Double>)r9.F(t, p4 & 0xFFFFF), ia, true);
                                                                                                break Label_4955;
                                                                                            }
                                                                                            case 34: {
                                                                                                u8.K(this.a[n16], (List<Long>)r9.F(t, p4 & 0xFFFFF), ia, false);
                                                                                                break Label_4955;
                                                                                            }
                                                                                            case 33: {
                                                                                                u8.Z(this.a[n16], (List<Integer>)r9.F(t, p4 & 0xFFFFF), ia, false);
                                                                                                break Label_4955;
                                                                                            }
                                                                                            case 32: {
                                                                                                u8.Q(this.a[n16], (List<Long>)r9.F(t, p4 & 0xFFFFF), ia, false);
                                                                                                break Label_4955;
                                                                                            }
                                                                                            case 31: {
                                                                                                u8.b0(this.a[n16], (List<Integer>)r9.F(t, p4 & 0xFFFFF), ia, false);
                                                                                                break Label_4955;
                                                                                            }
                                                                                            case 30: {
                                                                                                u8.c0(this.a[n16], (List<Integer>)r9.F(t, p4 & 0xFFFFF), ia, false);
                                                                                                break Label_4955;
                                                                                            }
                                                                                            case 29: {
                                                                                                u8.W(this.a[n16], (List<Integer>)r9.F(t, p4 & 0xFFFFF), ia, false);
                                                                                                break Label_4955;
                                                                                            }
                                                                                            case 28: {
                                                                                                u8.w(this.a[n16], (List<f5>)r9.F(t, p4 & 0xFFFFF), ia);
                                                                                                break Label_4955;
                                                                                            }
                                                                                            case 27: {
                                                                                                u8.k(this.a[n16], (List<?>)r9.F(t, p4 & 0xFFFFF), ia, this.r(n16));
                                                                                                break Label_4955;
                                                                                            }
                                                                                            case 26: {
                                                                                                u8.j(this.a[n16], (List<String>)r9.F(t, p4 & 0xFFFFF), ia);
                                                                                                break Label_4955;
                                                                                            }
                                                                                            case 25: {
                                                                                                u8.d0(this.a[n16], (List<Boolean>)r9.F(t, p4 & 0xFFFFF), ia, false);
                                                                                                break Label_4955;
                                                                                            }
                                                                                            case 24: {
                                                                                                u8.a0(this.a[n16], (List<Integer>)r9.F(t, p4 & 0xFFFFF), ia, false);
                                                                                                break Label_4955;
                                                                                            }
                                                                                            case 23: {
                                                                                                u8.N(this.a[n16], (List<Long>)r9.F(t, p4 & 0xFFFFF), ia, false);
                                                                                                break Label_4955;
                                                                                            }
                                                                                            case 22: {
                                                                                                u8.T(this.a[n16], (List<Integer>)r9.F(t, p4 & 0xFFFFF), ia, false);
                                                                                                break Label_4955;
                                                                                            }
                                                                                            case 21: {
                                                                                                u8.G(this.a[n16], (List<Long>)r9.F(t, p4 & 0xFFFFF), ia, false);
                                                                                                break Label_4955;
                                                                                            }
                                                                                            case 20: {
                                                                                                u8.C(this.a[n16], (List<Long>)r9.F(t, p4 & 0xFFFFF), ia, false);
                                                                                                break Label_4955;
                                                                                            }
                                                                                            case 19: {
                                                                                                u8.y(this.a[n16], (List<Float>)r9.F(t, p4 & 0xFFFFF), ia, false);
                                                                                                break Label_4955;
                                                                                            }
                                                                                            case 18: {
                                                                                                u8.l(this.a[n16], (List<Double>)r9.F(t, p4 & 0xFFFFF), ia, false);
                                                                                                break Label_4955;
                                                                                            }
                                                                                            case 17: {
                                                                                                if (this.B(t, n16)) {
                                                                                                    break;
                                                                                                }
                                                                                                break Label_4955;
                                                                                            }
                                                                                            case 16: {
                                                                                                if (this.B(t, n16)) {
                                                                                                    n18 = r9.o(t, p4 & 0xFFFFF);
                                                                                                    break Label_4390;
                                                                                                }
                                                                                                break Label_4955;
                                                                                            }
                                                                                            case 15: {
                                                                                                if (this.B(t, n16)) {
                                                                                                    n19 = r9.b(t, p4 & 0xFFFFF);
                                                                                                    break Label_4425;
                                                                                                }
                                                                                                break Label_4955;
                                                                                            }
                                                                                            case 14: {
                                                                                                if (this.B(t, n16)) {
                                                                                                    n20 = r9.o(t, p4 & 0xFFFFF);
                                                                                                    break Label_4460;
                                                                                                }
                                                                                                break Label_4955;
                                                                                            }
                                                                                            case 13: {
                                                                                                if (this.B(t, n16)) {
                                                                                                    n21 = r9.b(t, p4 & 0xFFFFF);
                                                                                                    break Label_4495;
                                                                                                }
                                                                                                break Label_4955;
                                                                                            }
                                                                                            case 12: {
                                                                                                if (this.B(t, n16)) {
                                                                                                    n22 = r9.b(t, p4 & 0xFFFFF);
                                                                                                    break Label_4530;
                                                                                                }
                                                                                                break Label_4955;
                                                                                            }
                                                                                            case 11: {
                                                                                                if (this.B(t, n16)) {
                                                                                                    n23 = r9.b(t, p4 & 0xFFFFF);
                                                                                                    break Label_4565;
                                                                                                }
                                                                                                break Label_4955;
                                                                                            }
                                                                                            case 10: {
                                                                                                if (this.B(t, n16)) {
                                                                                                    break Label_4588;
                                                                                                }
                                                                                                break Label_4955;
                                                                                            }
                                                                                            case 9: {
                                                                                                if (this.B(t, n16)) {
                                                                                                    break Label_4622;
                                                                                                }
                                                                                                break Label_4955;
                                                                                            }
                                                                                            case 8: {
                                                                                                if (this.B(t, n16)) {
                                                                                                    break Label_4659;
                                                                                                }
                                                                                                break Label_4955;
                                                                                            }
                                                                                            case 7: {
                                                                                                if (this.B(t, n16)) {
                                                                                                    b4 = r9.w(t, p4 & 0xFFFFF);
                                                                                                    break Label_4700;
                                                                                                }
                                                                                                break Label_4955;
                                                                                            }
                                                                                            case 6: {
                                                                                                if (this.B(t, n16)) {
                                                                                                    n24 = r9.b(t, p4 & 0xFFFFF);
                                                                                                    break Label_4735;
                                                                                                }
                                                                                                break Label_4955;
                                                                                            }
                                                                                            case 5: {
                                                                                                if (this.B(t, n16)) {
                                                                                                    n25 = r9.o(t, p4 & 0xFFFFF);
                                                                                                    break Label_4770;
                                                                                                }
                                                                                                break Label_4955;
                                                                                            }
                                                                                            case 4: {
                                                                                                if (this.B(t, n16)) {
                                                                                                    n26 = r9.b(t, p4 & 0xFFFFF);
                                                                                                    break Label_4805;
                                                                                                }
                                                                                                break Label_4955;
                                                                                            }
                                                                                            case 3: {
                                                                                                if (this.B(t, n16)) {
                                                                                                    n27 = r9.o(t, p4 & 0xFFFFF);
                                                                                                    break Label_4840;
                                                                                                }
                                                                                                break Label_4955;
                                                                                            }
                                                                                            case 2: {
                                                                                                if (this.B(t, n16)) {
                                                                                                    n28 = r9.o(t, p4 & 0xFFFFF);
                                                                                                    break Label_4875;
                                                                                                }
                                                                                                break Label_4955;
                                                                                            }
                                                                                            case 1: {
                                                                                                if (this.B(t, n16)) {
                                                                                                    n29 = r9.x(t, p4 & 0xFFFFF);
                                                                                                    break Label_4910;
                                                                                                }
                                                                                                break Label_4955;
                                                                                            }
                                                                                            case 0: {
                                                                                                if (this.B(t, n16)) {
                                                                                                    n30 = r9.C(t, p4 & 0xFFFFF);
                                                                                                    break Label_4945;
                                                                                                }
                                                                                                break Label_4955;
                                                                                            }
                                                                                        }
                                                                                        ia.M(n17, r9.F(t, p4 & 0xFFFFF), this.r(n16));
                                                                                        break Label_4955;
                                                                                    }
                                                                                    ia.L(n17, n18);
                                                                                    break Label_4955;
                                                                                }
                                                                                ia.u(n17, n19);
                                                                                break Label_4955;
                                                                            }
                                                                            ia.c(n17, n20);
                                                                            break Label_4955;
                                                                        }
                                                                        ia.a(n17, n21);
                                                                        break Label_4955;
                                                                    }
                                                                    ia.G(n17, n22);
                                                                    break Label_4955;
                                                                }
                                                                ia.C(n17, n23);
                                                                break Label_4955;
                                                            }
                                                            ia.F(n17, (f5)r9.F(t, p4 & 0xFFFFF));
                                                            break Label_4955;
                                                        }
                                                        ia.J(n17, r9.F(t, p4 & 0xFFFFF), this.r(n16));
                                                        break Label_4955;
                                                    }
                                                    w(n17, r9.F(t, p4 & 0xFFFFF), ia);
                                                    break Label_4955;
                                                }
                                                ia.E(n17, b4);
                                                break Label_4955;
                                            }
                                            ia.A(n17, n24);
                                            break Label_4955;
                                        }
                                        ia.K(n17, n25);
                                        break Label_4955;
                                    }
                                    ia.g(n17, n26);
                                    break Label_4955;
                                }
                                ia.h(n17, n27);
                                break Label_4955;
                            }
                            ia.p(n17, n28);
                            break Label_4955;
                        }
                        ia.r(n17, n29);
                        break Label_4955;
                    }
                    ia.q(n17, n30);
                }
                n16 += 3;
            }
            while (o4 != null) {
                this.p.g(ia, (Map.Entry<?, ?>)o4);
                if (((Iterator)p3).hasNext()) {
                    o4 = ((Iterator<Map.Entry<?, ?>>)p3).next();
                }
                else {
                    o4 = null;
                }
            }
            x(this.o, t, ia);
            return;
        }
        this.K(t, ia);
    }
    
    @Override
    public final void h(final T t, final t8 t2, final b6 obj) throws IOException {
        Objects.requireNonNull(obj);
        final k9<?, ?> o = this.o;
        final d6<?> p3 = this.p;
        b7 b7;
        Object o2 = b7 = null;
        Object t3;
        int zza;
        int w;
        Object c;
        h6<?> i;
        b7 o3;
        boolean j;
        int p4;
        b7 a;
        boolean k;
        List<Object> list;
        List<Object> list2;
        List<Object> list3;
        int n;
        int l;
        u6 n2;
        List<Object> list4;
        long n3;
        s8 r;
        List<Object> list5;
        Object h;
        Object o4;
        Object f;
        long n4;
        long n5;
        Object o5;
        List<Object> list6;
        List<Object> list7;
        List<Object> list8;
        int m;
        u6 n6;
        List<Object> list9;
        List<Object> list10;
        boolean c2;
        int n7;
        List<Object> list11;
        long n8;
        List<Object> list12;
        List<Object> list13;
        u6 u6;
        List<Object> list14;
        s8 r2;
        long n9;
        b7 o6;
        boolean j2;
        Label_0678_Outer:Label_1755_Outer:
        while (true) {
            t3 = b7;
            try {
                zza = t2.zza();
                t3 = b7;
                w = this.W(zza);
                if (w < 0) {
                    if (zza == Integer.MAX_VALUE) {
                        return;
                    }
                    t3 = b7;
                    if (!this.f) {
                        c = null;
                    }
                    else {
                        t3 = b7;
                        c = p3.c(obj, this.e, zza);
                    }
                    if (c != null) {
                        if ((i = (h6<?>)o2) == null) {
                            t3 = b7;
                            i = p3.i(t);
                        }
                        t3 = b7;
                        b7 = p3.d(t2, c, obj, i, b7, o);
                        o2 = i;
                    }
                    else {
                        t3 = b7;
                        o.i(t2);
                        if ((o3 = b7) == null) {
                            t3 = b7;
                            o3 = o.o(t);
                        }
                        t3 = o3;
                        j = o.j(o3, t2);
                        b7 = o3;
                        if (!j) {
                            return;
                        }
                        continue;
                    }
                }
                else {
                    t3 = b7;
                    p4 = this.P(w);
                    Label_3507: {
                        switch ((0xFF00000 & p4) >>> 20) {
                            default: {
                                a = b7;
                                if (b7 == null) {
                                    break Label_3507;
                                }
                                break Label_3507;
                            }
                            case 68: {
                                break Label_3507;
                            }
                            case 67: {
                                break Label_3507;
                            }
                            case 66: {
                                break Label_3507;
                            }
                            case 65: {
                                break Label_3507;
                            }
                            case 64: {
                                break Label_3507;
                            }
                            case 63: {
                                break Label_3507;
                            }
                            case 62: {
                                break Label_3507;
                            }
                            case 61: {
                                break Label_3507;
                            }
                            case 60: {
                                break Label_3507;
                            }
                            case 59: {
                                break Label_3507;
                            }
                            case 58: {
                                break Label_3507;
                            }
                            case 57: {
                                break Label_3507;
                            }
                            case 56: {
                                break Label_3507;
                            }
                            case 55: {
                                break Label_3507;
                            }
                            case 54: {
                                break Label_3507;
                            }
                            case 53: {
                                break Label_3507;
                            }
                            case 52: {
                                break Label_3507;
                            }
                            case 51: {
                                break Label_3507;
                            }
                            case 50: {
                                break Label_3507;
                            }
                            case 49: {
                                break Label_3507;
                            }
                            case 48: {
                                break Label_3507;
                            }
                            case 47: {
                                break Label_3507;
                            }
                            case 46: {
                                break Label_3507;
                            }
                            case 45: {
                                break Label_3507;
                            }
                            case 44: {
                                break Label_3507;
                            }
                            case 43: {
                                break Label_3507;
                            }
                            case 42: {
                                break Label_3507;
                            }
                            case 41: {
                                break Label_3507;
                            }
                            case 40: {
                                break Label_3507;
                            }
                            case 39: {
                                break Label_3507;
                            }
                            case 38: {
                                break Label_3507;
                            }
                            case 37: {
                                break Label_3507;
                            }
                            case 36: {
                                break Label_3507;
                            }
                            case 35: {
                                break Label_3507;
                            }
                            case 34: {
                                break Label_3507;
                            }
                            case 33: {
                                break Label_3507;
                            }
                            case 32: {
                                break Label_3507;
                            }
                            case 31: {
                                break Label_3507;
                            }
                            case 30: {
                                break Label_3507;
                            }
                            case 29: {
                                break Label_3507;
                            }
                            case 28: {
                                break Label_3507;
                            }
                            case 27: {
                                break Label_3507;
                            }
                            case 26: {
                                break Label_3507;
                            }
                            case 25: {
                                break Label_3507;
                            }
                            case 24: {
                                break Label_3507;
                            }
                            case 23: {
                                break Label_3507;
                            }
                            case 22: {
                                break Label_3507;
                            }
                            case 21: {
                                break Label_3507;
                            }
                            case 20: {
                                break Label_3507;
                            }
                            case 19: {
                                break Label_3507;
                            }
                            case 18: {
                                break Label_3507;
                            }
                            case 17: {
                                break Label_3507;
                            }
                            case 16: {
                                break Label_3507;
                            }
                            case 15: {
                                break Label_3507;
                            }
                            case 14: {
                                break Label_3507;
                            }
                            case 13: {
                                break Label_3507;
                            }
                            case 12: {
                                break Label_3507;
                            }
                            case 11: {
                                break Label_3507;
                            }
                            case 10: {
                                break Label_3507;
                            }
                            case 9: {
                                break Label_3507;
                            }
                            case 8: {
                                break Label_3507;
                            }
                            case 7: {
                                break Label_3507;
                            }
                            case 6: {
                                break Label_3507;
                            }
                            case 5: {
                                break Label_3507;
                            }
                            case 4: {
                                break Label_3507;
                            }
                            case 3: {
                                break Label_3507;
                            }
                            case 2: {
                                break Label_3507;
                            }
                            case 1: {
                                break Label_3507;
                            }
                            case 0: {
                                Label_3534: {
                                    break Label_3534;
                                    c = b7;
                                    t3 = b7;
                                    try {
                                        a = o.a();
                                        c = a;
                                        t3 = a;
                                        k = o.j(a, t2);
                                        b7 = a;
                                        if (!k) {
                                            return;
                                        }
                                        continue Label_0678_Outer;
                                        c = b7;
                                        t3 = b7;
                                        r9.j(t, p4 & 0xFFFFF, t2.b());
                                        // iftrue(Label_3292:, !this.B(t, w))
                                        // iftrue(Label_0882:, !n2.d(l))
                                        // iftrue(Label_3154:, n6 == null)
                                        // iftrue(Label_1064:, !c2)
                                        // iftrue(Label_0882:, !n6.d(m))
                                        // iftrue(Label_1551:, !this.q.e(f))
                                        // iftrue(Label_1466:, f != null)
                                        // iftrue(Label_2612:, !U(p4))
                                        // iftrue(Label_0906:, n2 == null)
                                        // iftrue(Label_2936:, !this.B(t, w))
                                    Label_1755:
                                        while (true) {
                                        Label_1798_Outer:
                                            while (true) {
                                                break Label_0678;
                                                c = b7;
                                                t3 = b7;
                                                Label_2967:Block_19_Outer:
                                                while (true) {
                                                    Label_2052: {
                                                    Label_1712_Outer:
                                                        while (true) {
                                                            Label_1551: {
                                                                Label_2009: {
                                                                Label_2095:
                                                                    while (true) {
                                                                    Label_1712:
                                                                        while (true) {
                                                                            while (true) {
                                                                                Block_16: {
                                                                                    Label_0906: {
                                                                                    Label_2181_Outer:
                                                                                        while (true) {
                                                                                        Label_1873_Outer:
                                                                                            while (true) {
                                                                                            Label_1873:
                                                                                                while (true) {
                                                                                                    Label_2917: {
                                                                                                    Label_1669:
                                                                                                        while (true) {
                                                                                                            while (true) {
                                                                                                                Label_2181:Block_17_Outer:
                                                                                                                while (true) {
                                                                                                                    while (true) {
                                                                                                                    Label_2224:
                                                                                                                        while (true) {
                                                                                                                            Block_20: {
                                                                                                                                Block_21: {
                                                                                                                                    break Block_21;
                                                                                                                                    c = b7;
                                                                                                                                    t3 = b7;
                                                                                                                                    list = this.n.b(t, p4 & 0xFFFFF);
                                                                                                                                    Block_15: {
                                                                                                                                        while (true) {
                                                                                                                                            break Label_2267;
                                                                                                                                            c = b7;
                                                                                                                                            t3 = b7;
                                                                                                                                            t2.I((List<Integer>)list2);
                                                                                                                                            continue Label_0678_Outer;
                                                                                                                                            c = b7;
                                                                                                                                            t3 = b7;
                                                                                                                                            r9.j(t, p4 & 0xFFFFF, t2.l());
                                                                                                                                            break Label_0678;
                                                                                                                                            c = b7;
                                                                                                                                            t3 = b7;
                                                                                                                                            r9.j(t, p4 & 0xFFFFF, t2.i());
                                                                                                                                            break Label_0678;
                                                                                                                                            c = b7;
                                                                                                                                            t3 = b7;
                                                                                                                                            t2.O((List<Long>)list3);
                                                                                                                                            continue Label_0678_Outer;
                                                                                                                                            Label_0882: {
                                                                                                                                                c = b7;
                                                                                                                                            }
                                                                                                                                            t3 = b7;
                                                                                                                                            b7 = u8.h(zza, n, b7, o);
                                                                                                                                            continue Label_0678_Outer;
                                                                                                                                            c = b7;
                                                                                                                                            t3 = b7;
                                                                                                                                            r9.h(t, p4 & 0xFFFFF, t2.g());
                                                                                                                                            break Label_2967;
                                                                                                                                            n = l;
                                                                                                                                            c = b7;
                                                                                                                                            t3 = b7;
                                                                                                                                            while (true) {
                                                                                                                                                Block_14: {
                                                                                                                                                    break Block_14;
                                                                                                                                                    c = b7;
                                                                                                                                                    t3 = b7;
                                                                                                                                                    t2.E((List<Long>)list4);
                                                                                                                                                    continue Label_0678_Outer;
                                                                                                                                                    c = b7;
                                                                                                                                                    t3 = b7;
                                                                                                                                                    list3 = (List<Object>)this.n.b(t, p4 & 0xFFFFF);
                                                                                                                                                    continue Label_2181;
                                                                                                                                                    n3 = (p4 & 0xFFFFF);
                                                                                                                                                    c = b7;
                                                                                                                                                    t3 = b7;
                                                                                                                                                    r = this.r(w);
                                                                                                                                                    c = b7;
                                                                                                                                                    t3 = b7;
                                                                                                                                                    t2.x(this.n.b(t, n3), r, obj);
                                                                                                                                                    continue Label_0678_Outer;
                                                                                                                                                    c = b7;
                                                                                                                                                    t3 = b7;
                                                                                                                                                    list5 = this.n.b(t, p4 & 0xFFFFF);
                                                                                                                                                    break Label_1798_Outer;
                                                                                                                                                    c = b7;
                                                                                                                                                    t3 = b7;
                                                                                                                                                    list4 = (List<Object>)this.n.b(t, p4 & 0xFFFFF);
                                                                                                                                                    continue Block_17_Outer;
                                                                                                                                                    c = b7;
                                                                                                                                                    t3 = b7;
                                                                                                                                                    this.z(t, p4, t2);
                                                                                                                                                    break Label_0678;
                                                                                                                                                    c = b7;
                                                                                                                                                    t3 = b7;
                                                                                                                                                    t2.G((List<f5>)this.n.b(t, p4 & 0xFFFFF));
                                                                                                                                                    continue Label_0678_Outer;
                                                                                                                                                    c = b7;
                                                                                                                                                    t3 = b7;
                                                                                                                                                    o4 = this.q.d(h);
                                                                                                                                                    c = b7;
                                                                                                                                                    t3 = b7;
                                                                                                                                                    this.q.f(o4, f);
                                                                                                                                                    c = b7;
                                                                                                                                                    t3 = b7;
                                                                                                                                                    r9.j(t, n4, o4);
                                                                                                                                                    break Label_1551;
                                                                                                                                                    c = b7;
                                                                                                                                                    t3 = b7;
                                                                                                                                                    t2.z((List<Double>)list);
                                                                                                                                                    continue Label_0678_Outer;
                                                                                                                                                    c = b7;
                                                                                                                                                    t3 = b7;
                                                                                                                                                    r9.f(t, p4 & 0xFFFFF, t2.c());
                                                                                                                                                    break Label_2967;
                                                                                                                                                    n5 = (p4 & 0xFFFFF);
                                                                                                                                                    c = b7;
                                                                                                                                                    t3 = b7;
                                                                                                                                                    o5 = t6.e(r9.F(t, n5), t2.L((s8<Object>)this.r(w), obj));
                                                                                                                                                    break Label_2917;
                                                                                                                                                    c = b7;
                                                                                                                                                    t3 = b7;
                                                                                                                                                    t2.y((List<String>)this.n.b(t, p4 & 0xFFFFF));
                                                                                                                                                    continue Label_0678_Outer;
                                                                                                                                                    c = b7;
                                                                                                                                                    t3 = b7;
                                                                                                                                                    list6 = this.n.b(t, p4 & 0xFFFFF);
                                                                                                                                                    break Label_2224;
                                                                                                                                                    c = b7;
                                                                                                                                                    t3 = b7;
                                                                                                                                                    t2.u((List<Integer>)list7);
                                                                                                                                                    continue Label_0678_Outer;
                                                                                                                                                    c = b7;
                                                                                                                                                    t3 = b7;
                                                                                                                                                    list8 = this.n.b(t, p4 & 0xFFFFF);
                                                                                                                                                    break Label_2009;
                                                                                                                                                    c = b7;
                                                                                                                                                    t3 = b7;
                                                                                                                                                    m = t2.j();
                                                                                                                                                    c = b7;
                                                                                                                                                    t3 = b7;
                                                                                                                                                    n6 = this.N(w);
                                                                                                                                                    break Block_20;
                                                                                                                                                    c = b7;
                                                                                                                                                    t3 = b7;
                                                                                                                                                    r9.k(t, p4 & 0xFFFFF, t2.i());
                                                                                                                                                    break Label_2967;
                                                                                                                                                    c = b7;
                                                                                                                                                    t3 = b7;
                                                                                                                                                    t2.C((List<Long>)list9);
                                                                                                                                                    continue Label_0678_Outer;
                                                                                                                                                }
                                                                                                                                                break Label_0906;
                                                                                                                                                c = b7;
                                                                                                                                                t3 = b7;
                                                                                                                                                t2.v((List<Long>)list10);
                                                                                                                                                continue Label_0678_Outer;
                                                                                                                                                c = b7;
                                                                                                                                                t3 = b7;
                                                                                                                                                r9.j(t, p4 & 0xFFFFF, t2.m());
                                                                                                                                                break Label_0678;
                                                                                                                                                c = b7;
                                                                                                                                                t3 = b7;
                                                                                                                                                r9.i(t, p4 & 0xFFFFF, t2.l());
                                                                                                                                                break Label_2967;
                                                                                                                                                c = b7;
                                                                                                                                                t3 = b7;
                                                                                                                                                list8 = this.n.b(t, p4 & 0xFFFFF);
                                                                                                                                                break Label_2009;
                                                                                                                                                c = b7;
                                                                                                                                                t3 = b7;
                                                                                                                                                c2 = this.C(t, zza, w);
                                                                                                                                                n7 = (p4 & 0xFFFFF);
                                                                                                                                                break Block_15;
                                                                                                                                                c = b7;
                                                                                                                                                t3 = b7;
                                                                                                                                                list9 = (List<Object>)this.n.b(t, p4 & 0xFFFFF);
                                                                                                                                                continue Label_1669;
                                                                                                                                                c = b7;
                                                                                                                                                t3 = b7;
                                                                                                                                                list4 = (List<Object>)this.n.b(t, p4 & 0xFFFFF);
                                                                                                                                                continue Block_17_Outer;
                                                                                                                                            }
                                                                                                                                            c = b7;
                                                                                                                                            t3 = b7;
                                                                                                                                            list11 = this.n.b(t, p4 & 0xFFFFF);
                                                                                                                                            break Label_2052;
                                                                                                                                            c = b7;
                                                                                                                                            t3 = b7;
                                                                                                                                            r9.i(t, p4 & 0xFFFFF, t2.d());
                                                                                                                                            break Label_2967;
                                                                                                                                            c = b7;
                                                                                                                                            t3 = b7;
                                                                                                                                            r9.g(t, p4 & 0xFFFFF, t2.e());
                                                                                                                                            break Label_2967;
                                                                                                                                            c = b7;
                                                                                                                                            t3 = b7;
                                                                                                                                            r9.j(t, p4 & 0xFFFFF, t2.g());
                                                                                                                                            break Label_0678;
                                                                                                                                            c = b7;
                                                                                                                                            t3 = b7;
                                                                                                                                            list = (List<Object>)this.n.b(t, p4 & 0xFFFFF);
                                                                                                                                            continue Label_1798_Outer;
                                                                                                                                        }
                                                                                                                                        Label_3292: {
                                                                                                                                            c = b7;
                                                                                                                                        }
                                                                                                                                        t3 = b7;
                                                                                                                                        r9.j(t, p4 & 0xFFFFF, t2.P((s8<Object>)this.r(w), obj));
                                                                                                                                        break Label_2967;
                                                                                                                                        c = b7;
                                                                                                                                        t3 = b7;
                                                                                                                                        this.z(t, p4, t2);
                                                                                                                                        break Label_2967;
                                                                                                                                        c = b7;
                                                                                                                                        t3 = b7;
                                                                                                                                        r9.j(t, p4 & 0xFFFFF, t2.r());
                                                                                                                                        break Label_0678;
                                                                                                                                        c = b7;
                                                                                                                                        t3 = b7;
                                                                                                                                        t2.H((List<Float>)list6);
                                                                                                                                        continue Label_0678_Outer;
                                                                                                                                    }
                                                                                                                                    n8 = n7;
                                                                                                                                    c = b7;
                                                                                                                                    t3 = b7;
                                                                                                                                    r9.j(t, n8, t6.e(r9.F(t, n8), t2.P((s8<Object>)this.r(w), obj)));
                                                                                                                                    break Label_0678;
                                                                                                                                    c = b7;
                                                                                                                                    t3 = b7;
                                                                                                                                    t2.D((List<Integer>)list12);
                                                                                                                                    continue Label_0678_Outer;
                                                                                                                                    c = b7;
                                                                                                                                    t3 = b7;
                                                                                                                                    list13 = this.n.b(t, p4 & 0xFFFFF);
                                                                                                                                    c = b7;
                                                                                                                                    t3 = b7;
                                                                                                                                    t2.M((List<Integer>)list13);
                                                                                                                                    c = b7;
                                                                                                                                    t3 = b7;
                                                                                                                                    u6 = this.N(w);
                                                                                                                                    break Label_1873;
                                                                                                                                    c = b7;
                                                                                                                                    t3 = b7;
                                                                                                                                    this.I(t, w);
                                                                                                                                    continue Label_0678_Outer;
                                                                                                                                }
                                                                                                                                n5 = (p4 & 0xFFFFF);
                                                                                                                                c = b7;
                                                                                                                                t3 = b7;
                                                                                                                                o5 = t6.e(r9.F(t, n5), t2.P((s8<Object>)this.r(w), obj));
                                                                                                                                break Label_2917;
                                                                                                                                c = b7;
                                                                                                                                t3 = b7;
                                                                                                                                b7 = u8.i(zza, (List<Integer>)list13, u6, b7, o);
                                                                                                                                continue Label_0678_Outer;
                                                                                                                            }
                                                                                                                            n = m;
                                                                                                                            c = b7;
                                                                                                                            t3 = b7;
                                                                                                                            break Label_1755;
                                                                                                                            c = b7;
                                                                                                                            t3 = b7;
                                                                                                                            list6 = (List<Object>)this.n.b(t, p4 & 0xFFFFF);
                                                                                                                            continue Label_2224;
                                                                                                                        }
                                                                                                                        c = b7;
                                                                                                                        t3 = b7;
                                                                                                                        r9.i(t, p4 & 0xFFFFF, t2.o());
                                                                                                                        continue Label_2967;
                                                                                                                        Label_1466: {
                                                                                                                            o4 = f;
                                                                                                                        }
                                                                                                                        c = b7;
                                                                                                                        t3 = b7;
                                                                                                                        continue Block_19_Outer;
                                                                                                                    }
                                                                                                                    c = b7;
                                                                                                                    t3 = b7;
                                                                                                                    list3 = (List<Object>)this.n.b(t, p4 & 0xFFFFF);
                                                                                                                    continue Label_2181;
                                                                                                                }
                                                                                                                c = b7;
                                                                                                                t3 = b7;
                                                                                                                h = this.H(w);
                                                                                                                c = b7;
                                                                                                                t3 = b7;
                                                                                                                n4 = (this.P(w) & 0xFFFFF);
                                                                                                                c = b7;
                                                                                                                t3 = b7;
                                                                                                                f = r9.F(t, n4);
                                                                                                                break Block_16;
                                                                                                                Label_1064: {
                                                                                                                    c = b7;
                                                                                                                }
                                                                                                                t3 = b7;
                                                                                                                r9.j(t, n7, t2.P((s8<Object>)this.r(w), obj));
                                                                                                                c = b7;
                                                                                                                t3 = b7;
                                                                                                                this.I(t, w);
                                                                                                                break Label_0678;
                                                                                                                c = b7;
                                                                                                                t3 = b7;
                                                                                                                list12 = (List<Object>)this.n.b(t, p4 & 0xFFFFF);
                                                                                                                continue Label_1873_Outer;
                                                                                                                c = b7;
                                                                                                                t3 = b7;
                                                                                                                list12 = (List<Object>)this.n.b(t, p4 & 0xFFFFF);
                                                                                                                continue Label_1873_Outer;
                                                                                                            }
                                                                                                            c = b7;
                                                                                                            t3 = b7;
                                                                                                            r9.j(t, p4 & 0xFFFFF, t2.c());
                                                                                                            break Label_0678;
                                                                                                            c = b7;
                                                                                                            t3 = b7;
                                                                                                            r9.j(t, p4 & 0xFFFFF, t2.n());
                                                                                                            c = b7;
                                                                                                            t3 = b7;
                                                                                                            this.J(t, zza, w);
                                                                                                            continue Label_0678_Outer;
                                                                                                            c = b7;
                                                                                                            t3 = b7;
                                                                                                            list9 = (List<Object>)this.n.b(t, p4 & 0xFFFFF);
                                                                                                            continue Label_1669;
                                                                                                        }
                                                                                                        c = b7;
                                                                                                        t3 = b7;
                                                                                                        r9.h(t, p4 & 0xFFFFF, t2.n());
                                                                                                        continue Label_2967;
                                                                                                        Label_2612: {
                                                                                                            c = b7;
                                                                                                        }
                                                                                                        t3 = b7;
                                                                                                        t2.B((List<String>)this.n.b(t, p4 & 0xFFFFF));
                                                                                                        continue Label_0678_Outer;
                                                                                                        c = b7;
                                                                                                        t3 = b7;
                                                                                                        r9.j(t, p4 & 0xFFFFF, t2.t());
                                                                                                        continue Label_1798_Outer;
                                                                                                    }
                                                                                                    c = b7;
                                                                                                    t3 = b7;
                                                                                                    r9.j(t, n5, o5);
                                                                                                    continue Label_0678_Outer;
                                                                                                    c = b7;
                                                                                                    t3 = b7;
                                                                                                    r9.j(t, p4 & 0xFFFFF, t2.s());
                                                                                                    continue Label_2967;
                                                                                                    c = b7;
                                                                                                    t3 = b7;
                                                                                                    r9.j(t, p4 & 0xFFFFF, t2.k());
                                                                                                    continue Label_1798_Outer;
                                                                                                    c = b7;
                                                                                                    t3 = b7;
                                                                                                    list2 = (List<Object>)this.n.b(t, p4 & 0xFFFFF);
                                                                                                    continue Label_2181_Outer;
                                                                                                    c = b7;
                                                                                                    t3 = b7;
                                                                                                    list11 = this.n.b(t, p4 & 0xFFFFF);
                                                                                                    break Label_2052;
                                                                                                    c = b7;
                                                                                                    t3 = b7;
                                                                                                    list13 = (List<Object>)this.n.b(t, p4 & 0xFFFFF);
                                                                                                    c = b7;
                                                                                                    t3 = b7;
                                                                                                    t2.M((List<Integer>)list13);
                                                                                                    c = b7;
                                                                                                    t3 = b7;
                                                                                                    u6 = this.N(w);
                                                                                                    continue Label_1873;
                                                                                                }
                                                                                                c = b7;
                                                                                                t3 = b7;
                                                                                                r9.h(t, p4 & 0xFFFFF, t2.t());
                                                                                                continue Label_2967;
                                                                                                c = b7;
                                                                                                t3 = b7;
                                                                                                t2.K((List<Integer>)list14);
                                                                                                continue Label_0678_Outer;
                                                                                                c = b7;
                                                                                                t3 = b7;
                                                                                                continue Label_1712_Outer;
                                                                                            }
                                                                                            c = b7;
                                                                                            t3 = b7;
                                                                                            list5 = this.n.b(t, p4 & 0xFFFFF);
                                                                                            break Label_1798_Outer;
                                                                                            c = b7;
                                                                                            t3 = b7;
                                                                                            list14 = (List<Object>)this.n.b(t, p4 & 0xFFFFF);
                                                                                            continue Label_2095;
                                                                                            c = b7;
                                                                                            t3 = b7;
                                                                                            list2 = (List<Object>)this.n.b(t, p4 & 0xFFFFF);
                                                                                            continue Label_2181_Outer;
                                                                                        }
                                                                                        c = b7;
                                                                                        t3 = b7;
                                                                                        r2 = this.r(w);
                                                                                        n9 = (p4 & 0xFFFFF);
                                                                                        c = b7;
                                                                                        t3 = b7;
                                                                                        t2.F(this.n.b(t, n9), r2, obj);
                                                                                        continue Label_0678_Outer;
                                                                                    }
                                                                                    c = b7;
                                                                                    t3 = b7;
                                                                                    r9.j(t, p4 & 0xFFFFF, l);
                                                                                    continue Label_1798_Outer;
                                                                                    c = b7;
                                                                                    t3 = b7;
                                                                                    r9.j(t, p4 & 0xFFFFF, t2.s());
                                                                                    continue Label_1798_Outer;
                                                                                    c = b7;
                                                                                    t3 = b7;
                                                                                    r9.i(t, p4 & 0xFFFFF, t2.m());
                                                                                    continue Label_2967;
                                                                                }
                                                                                c = b7;
                                                                                t3 = b7;
                                                                                o4 = this.q.d(h);
                                                                                c = b7;
                                                                                t3 = b7;
                                                                                r9.j(t, n4, o4);
                                                                                break Label_1551;
                                                                                c = b7;
                                                                                t3 = b7;
                                                                                r9.j(t, p4 & 0xFFFFF, t2.d());
                                                                                continue Label_1798_Outer;
                                                                                c = b7;
                                                                                t3 = b7;
                                                                                list7 = (List<Object>)this.n.b(t, p4 & 0xFFFFF);
                                                                                continue Label_1712;
                                                                                c = b7;
                                                                                t3 = b7;
                                                                                r9.i(t, p4 & 0xFFFFF, t2.k());
                                                                                continue Label_2967;
                                                                                c = b7;
                                                                                t3 = b7;
                                                                                l = t2.j();
                                                                                c = b7;
                                                                                t3 = b7;
                                                                                n2 = this.N(w);
                                                                                continue Block_19_Outer;
                                                                            }
                                                                            c = b7;
                                                                            t3 = b7;
                                                                            list7 = (List<Object>)this.n.b(t, p4 & 0xFFFFF);
                                                                            continue Label_1712;
                                                                        }
                                                                        c = b7;
                                                                        t3 = b7;
                                                                        list14 = (List<Object>)this.n.b(t, p4 & 0xFFFFF);
                                                                        continue Label_2095;
                                                                    }
                                                                    Label_2936: {
                                                                        c = b7;
                                                                    }
                                                                    t3 = b7;
                                                                    r9.j(t, p4 & 0xFFFFF, t2.L((s8<Object>)this.r(w), obj));
                                                                    continue Label_2967;
                                                                    c = b7;
                                                                    t3 = b7;
                                                                    list10 = (List<Object>)this.n.b(t, p4 & 0xFFFFF);
                                                                    continue Label_1755;
                                                                }
                                                                c = b7;
                                                                t3 = b7;
                                                                t2.h((List<Integer>)list8);
                                                                continue Label_0678_Outer;
                                                            }
                                                            c = b7;
                                                            t3 = b7;
                                                            t2.A(this.q.a(o4), this.q.c(h), obj);
                                                            continue Label_0678_Outer;
                                                            c = b7;
                                                            t3 = b7;
                                                            continue Label_1755_Outer;
                                                        }
                                                        c = b7;
                                                        t3 = b7;
                                                        r9.h(t, p4 & 0xFFFFF, t2.r());
                                                        continue Label_2967;
                                                        c = b7;
                                                        t3 = b7;
                                                        r9.j(t, p4 & 0xFFFFF, t2.o());
                                                        continue Label_1798_Outer;
                                                        c = b7;
                                                        t3 = b7;
                                                        r9.j(t, p4 & 0xFFFFF, t2.e());
                                                        continue Label_1798_Outer;
                                                    }
                                                    c = b7;
                                                    t3 = b7;
                                                    t2.w((List<Long>)list11);
                                                    continue Label_0678_Outer;
                                                    c = b7;
                                                    t3 = b7;
                                                    r9.h(t, p4 & 0xFFFFF, t2.b());
                                                    continue Label_2967;
                                                }
                                                c = b7;
                                                t3 = b7;
                                                r9.j(t, p4 & 0xFFFFF, t2.L((s8<Object>)this.r(w), obj));
                                                continue Label_1798_Outer;
                                            }
                                            c = b7;
                                            t3 = b7;
                                            t2.f((List<Boolean>)list5);
                                            continue Label_0678_Outer;
                                            c = b7;
                                            t3 = b7;
                                            list10 = (List<Object>)this.n.b(t, p4 & 0xFFFFF);
                                            continue Label_1755;
                                        }
                                        c = b7;
                                        t3 = b7;
                                        r9.h(t, p4 & 0xFFFFF, m);
                                    }
                                    catch (b7 b7) {
                                        t3 = c;
                                        o.i(t2);
                                        o6 = (b7)c;
                                        if (c == null) {
                                            t3 = c;
                                            o6 = o.o(t);
                                        }
                                        t3 = o6;
                                        j2 = o.j(o6, t2);
                                        b7 = o6;
                                        if (!j2) {
                                            return;
                                        }
                                        continue;
                                    }
                                }
                                break;
                            }
                        }
                    }
                }
            }
            finally {
                for (int k2 = this.k; k2 < this.l; ++k2) {
                    t3 = this.t(t, this.j[k2], t3, o);
                }
                if (t3 != null) {
                    o.n(t, (b7)t3);
                }
            }
        }
    }
    
    @Override
    public final void i(final T t, final byte[] array, int n, final int n2, final z4 z4) throws IOException {
        d8 d8 = this;
        T t2 = t;
        byte[] array2 = array;
        int n3 = n2;
        z4 z5 = z4;
        if (!d8.h) {
            this.o(t, array, n, n2, 0, z4);
            return;
        }
        Unsafe s = com.google.android.gms.internal.vision.d8.s;
        int i = n;
        n = -1;
        int n4 = 0;
        int int1 = 0;
        int n5 = 1048575;
        while (i < n3) {
            final int n6 = i + 1;
            int a = array2[i];
            int n7;
            if (a < 0) {
                n7 = x4.d(a, array2, n6, z5);
                a = z5.a;
            }
            else {
                n7 = n6;
            }
            final int n8 = a >>> 3;
            final int n9 = a & 0x7;
            if (n8 > n) {
                n = d8.j(n8, n4 / 3);
            }
            else {
                n = d8.W(n8);
            }
            int c = 0;
            int n29 = 0;
            int n30 = 0;
            Label_1295: {
                int n20 = 0;
                Label_1271: {
                    int n27 = 0;
                    int n28 = 0;
                    Label_1243: {
                        int n19 = 0;
                        Label_0158: {
                            if (n != -1) {
                                final int[] a2 = d8.a;
                                final int n10 = a2[n + 1];
                                final int n11 = (n10 & 0xFF00000) >>> 20;
                                final long offset = n10 & 0xFFFFF;
                                int n16 = 0;
                                int n17 = 0;
                                Label_1043: {
                                    if (n11 <= 17) {
                                        final int n12 = a2[n + 2];
                                        final int n13 = 1 << (n12 >>> 20);
                                        final int n14 = n12 & 0xFFFFF;
                                        int n15;
                                        if (n14 != n5) {
                                            if (n5 != 1048575) {
                                                s.putInt(t2, n5, int1);
                                            }
                                            if (n14 != 1048575) {
                                                int1 = s.getInt(t2, n14);
                                            }
                                            n5 = n14;
                                            n15 = int1;
                                        }
                                        else {
                                            n15 = int1;
                                        }
                                        Label_0898: {
                                            Label_0888: {
                                                int x = 0;
                                                Label_0762: {
                                                    Label_0755: {
                                                        Label_0736: {
                                                            Object x2 = null;
                                                            Label_0504: {
                                                                switch (n11) {
                                                                    default: {
                                                                        break Label_0898;
                                                                    }
                                                                    case 16: {
                                                                        if (n9 == 0) {
                                                                            n16 = x4.k(array2, n7, z5);
                                                                            s.putLong(t, offset, s5.b(z5.b));
                                                                            n17 = (n15 | n13);
                                                                            break Label_1043;
                                                                        }
                                                                        break Label_0898;
                                                                    }
                                                                    case 15: {
                                                                        if (n9 == 0) {
                                                                            n16 = x4.i(array2, n7, z5);
                                                                            x = s5.k(z5.a);
                                                                            break Label_0762;
                                                                        }
                                                                        break Label_0736;
                                                                    }
                                                                    case 12: {
                                                                        if (n9 == 0) {
                                                                            n16 = x4.i(array2, n7, z5);
                                                                            break Label_0755;
                                                                        }
                                                                        break Label_0736;
                                                                    }
                                                                    case 10: {
                                                                        if (n9 == 2) {
                                                                            n16 = x4.q(array2, n7, z5);
                                                                            break;
                                                                        }
                                                                        break Label_0736;
                                                                    }
                                                                    case 9: {
                                                                        if (n9 != 2) {
                                                                            break Label_0736;
                                                                        }
                                                                        n16 = x4.g(d8.r(n), array2, n7, n3, z5);
                                                                        final Object object = s.getObject(t2, offset);
                                                                        if (object == null) {
                                                                            x2 = z5.c;
                                                                            break Label_0504;
                                                                        }
                                                                        x2 = t6.e(object, z5.c);
                                                                        break Label_0504;
                                                                    }
                                                                    case 8: {
                                                                        if (n9 != 2) {
                                                                            break Label_0736;
                                                                        }
                                                                        if ((n10 & 0x20000000) == 0x0) {
                                                                            n16 = x4.n(array2, n7, z5);
                                                                            break;
                                                                        }
                                                                        n16 = x4.p(array2, n7, z5);
                                                                        break;
                                                                    }
                                                                    case 7: {
                                                                        if (n9 == 0) {
                                                                            n16 = x4.k(array2, n7, z5);
                                                                            r9.k(t2, offset, z5.b != 0L);
                                                                            break Label_0888;
                                                                        }
                                                                        break Label_0736;
                                                                    }
                                                                    case 6:
                                                                    case 13: {
                                                                        if (n9 == 5) {
                                                                            s.putInt(t2, offset, x4.h(array2, n7));
                                                                            n16 = n7 + 4;
                                                                            break Label_0888;
                                                                        }
                                                                        break Label_0736;
                                                                    }
                                                                    case 5:
                                                                    case 14: {
                                                                        if (n9 == 1) {
                                                                            s.putLong(t, offset, x4.l(array2, n7));
                                                                            n16 = n7 + 8;
                                                                            break Label_0888;
                                                                        }
                                                                        break Label_0736;
                                                                    }
                                                                    case 4:
                                                                    case 11: {
                                                                        if (n9 == 0) {
                                                                            n16 = x4.i(array2, n7, z5);
                                                                            break Label_0755;
                                                                        }
                                                                        break Label_0898;
                                                                    }
                                                                    case 2:
                                                                    case 3: {
                                                                        final int n18 = n5;
                                                                        final Unsafe unsafe = s;
                                                                        if (n9 == 0) {
                                                                            n16 = x4.k(array2, n7, z5);
                                                                            unsafe.putLong(t, offset, z5.b);
                                                                            n17 = (n15 | n13);
                                                                            s = unsafe;
                                                                            n5 = n18;
                                                                            break Label_1043;
                                                                        }
                                                                        break Label_0898;
                                                                    }
                                                                    case 1: {
                                                                        n16 = n7;
                                                                        if (n9 == 5) {
                                                                            r9.g(t2, offset, x4.o(array2, n16));
                                                                            n16 += 4;
                                                                            break Label_0888;
                                                                        }
                                                                        break Label_0898;
                                                                    }
                                                                    case 0: {
                                                                        n16 = n7;
                                                                        if (n9 == 1) {
                                                                            r9.f(t2, offset, x4.m(array2, n16));
                                                                            n16 += 8;
                                                                            break Label_0888;
                                                                        }
                                                                        break Label_0898;
                                                                    }
                                                                }
                                                                x2 = z5.c;
                                                            }
                                                            s.putObject(t2, offset, x2);
                                                            break Label_0888;
                                                        }
                                                        break Label_0898;
                                                    }
                                                    x = z5.a;
                                                }
                                                s.putInt(t2, offset, x);
                                            }
                                            n17 = (n15 | n13);
                                            break Label_1043;
                                        }
                                        n19 = n7;
                                        n20 = n;
                                        n = n15;
                                        break Label_0158;
                                    }
                                    final int n21 = n8;
                                    final int n22 = n5;
                                    Label_1180: {
                                        if (n11 == 27) {
                                            if (n9 == 2) {
                                                z6<?> d9;
                                                final z6 z6 = d9 = (z6<?>)s.getObject(t2, offset);
                                                if (!z6.zza()) {
                                                    final int size = z6.size();
                                                    int n23;
                                                    if (size == 0) {
                                                        n23 = 10;
                                                    }
                                                    else {
                                                        n23 = size << 1;
                                                    }
                                                    d9 = z6.d(n23);
                                                    s.putObject(t2, offset, d9);
                                                }
                                                final int e = x4.e(d8.r(n), a, array, n7, n2, d9, z4);
                                                n5 = n22;
                                                n17 = int1;
                                                n16 = e;
                                                break Label_1043;
                                            }
                                        }
                                        else {
                                            final int n24 = n;
                                            Label_1240: {
                                                if (n11 <= 49) {
                                                    final int m = this.m(t, array, n7, n2, a, n21, n9, n24, n10, n11, offset, z4);
                                                    if ((c = m) == n7) {
                                                        n7 = m;
                                                        break Label_1240;
                                                    }
                                                }
                                                else {
                                                    final int n25 = n7;
                                                    if (n11 == 50) {
                                                        if (n9 != 2) {
                                                            break Label_1180;
                                                        }
                                                        n7 = this.n(t, array, n25, n2, n24, offset, z4);
                                                        if ((c = n7) == n25) {
                                                            break Label_1240;
                                                        }
                                                    }
                                                    else {
                                                        n7 = this.l(t, array, n25, n2, a, n21, n9, n10, n11, offset, n24, z4);
                                                        if ((c = n7) == n25) {
                                                            break Label_1240;
                                                        }
                                                    }
                                                }
                                                n20 = n24;
                                                n = n21;
                                                break Label_1271;
                                            }
                                        }
                                    }
                                    final int n26 = n;
                                    n = int1;
                                    n27 = n5;
                                    n28 = n7;
                                    n20 = n26;
                                    break Label_1243;
                                }
                                c = n16;
                                n29 = n8;
                                n30 = n;
                                int1 = n17;
                                break Label_1295;
                            }
                            final int n31 = n7;
                            n20 = 0;
                            n = int1;
                            n19 = n31;
                        }
                        n28 = n19;
                        n27 = n5;
                    }
                    c = x4.c(a, array, n28, n2, T(t), z4);
                    n5 = n27;
                    int1 = n;
                    n = n8;
                }
                d8 = this;
                t2 = t;
                n3 = n2;
                array2 = array;
                z5 = z4;
                n30 = n20;
                n29 = n;
            }
            i = c;
            n = n29;
            n4 = n30;
        }
        if (n5 != 1048575) {
            s.putInt(t, n5, int1);
        }
        if (i == n2) {
            return;
        }
        throw y6.h();
    }
    
    final int o(T o, final byte[] array, int n, int n2, int n3, final z4 z4) throws IOException {
        T t = o;
        byte[] array2 = array;
        int n4 = n2;
        int n5 = n3;
        z4 z5 = z4;
        final Unsafe s = d8.s;
        int n6 = -1;
        int n7 = 0;
        int n8 = 0;
        int n9 = 0;
        int n10 = 1048575;
        d8 d8;
        while (true) {
            final Object o2 = null;
            if (n >= n4) {
                n3 = n5;
                n2 = n4;
                o = t;
                d8 = this;
                break;
            }
            int d9 = n + 1;
            n = array2[n];
            if (n < 0) {
                d9 = x4.d(n, array2, d9, z5);
                n = z5.a;
            }
            final int n11 = n >>> 3;
            final int n12 = n & 0x7;
            int n13;
            if (n11 > n6) {
                n13 = this.j(n11, n7 / 3);
            }
            else {
                n13 = this.W(n11);
            }
            int n14;
            int n16;
            int n18;
            int int1;
            int n20;
            if (n13 == -1) {
                n14 = n11;
                final int n15 = d9;
                n16 = n;
                final int n17 = n9;
                n18 = n5;
                final int n19 = 0;
                n = n15;
                int1 = n17;
                n20 = n19;
            }
            else {
                final int[] a = this.a;
                final int n21 = a[n13 + 1];
                final int n22 = (n21 & 0xFF00000) >>> 20;
                final long n23 = n21 & 0xFFFFF;
                if (n22 <= 17) {
                    final int n24 = a[n13 + 2];
                    final int n25 = 1 << (n24 >>> 20);
                    final int n26 = n24 & 0xFFFFF;
                    if (n26 != n10) {
                        if (n10 != 1048575) {
                            s.putInt(o, n10, n9);
                        }
                        t = o;
                        int1 = s.getInt(t, n26);
                        n10 = n26;
                    }
                    else {
                        t = o;
                        int1 = n9;
                    }
                    Label_1211: {
                        Label_1192: {
                            int n29 = 0;
                            Label_1188: {
                                int n27 = 0;
                                int n30 = 0;
                                Label_1176: {
                                    int n31 = 0;
                                    int n39 = 0;
                                    int n40 = 0;
                                    Label_1162: {
                                        Label_1147: {
                                            Label_1108: {
                                                int n32 = 0;
                                                Label_1073: {
                                                    while (true) {
                                                        Label_0718: {
                                                            int k = 0;
                                                            Label_0561: {
                                                                switch (n22) {
                                                                    case 17: {
                                                                        if (n12 == 3) {
                                                                            final int f = x4.f(this.r(n13), array, d9, n2, n11 << 3 | 0x4, z4);
                                                                            Object x;
                                                                            if ((int1 & n25) == 0x0) {
                                                                                x = z5.c;
                                                                            }
                                                                            else {
                                                                                x = t6.e(s.getObject(t, n23), z5.c);
                                                                            }
                                                                            s.putObject(t, n23, x);
                                                                            n27 = (int1 | n25);
                                                                            final int n28 = n;
                                                                            n29 = n10;
                                                                            n = f;
                                                                            n30 = n28;
                                                                            break Label_1176;
                                                                        }
                                                                        break;
                                                                    }
                                                                    case 16: {
                                                                        if (n12 == 0) {
                                                                            n31 = x4.k(array2, d9, z5);
                                                                            s.putLong(o, n23, s5.b(z5.b));
                                                                            n32 = (int1 | n25);
                                                                            break Label_1073;
                                                                        }
                                                                        break;
                                                                    }
                                                                    case 15: {
                                                                        if (n12 == 0) {
                                                                            n31 = x4.i(array2, d9, z5);
                                                                            k = s5.k(z5.a);
                                                                            break Label_0561;
                                                                        }
                                                                        break;
                                                                    }
                                                                    case 12: {
                                                                        final int n33 = n13;
                                                                        final int n34 = n;
                                                                        if (n12 != 0) {
                                                                            break;
                                                                        }
                                                                        final int i = x4.i(array2, d9, z5);
                                                                        final int a2 = z5.a;
                                                                        final u6 n35 = this.N(n33);
                                                                        n31 = i;
                                                                        k = a2;
                                                                        if (n35 == null) {
                                                                            break Label_0561;
                                                                        }
                                                                        if (n35.d(a2)) {
                                                                            n31 = i;
                                                                            k = a2;
                                                                            break Label_0561;
                                                                        }
                                                                        T(o).c(n34, (long)a2);
                                                                        n = i;
                                                                        n9 = int1;
                                                                        n8 = n34;
                                                                        n7 = n33;
                                                                        n29 = n10;
                                                                        break Label_1188;
                                                                    }
                                                                    case 10: {
                                                                        if (n12 == 2) {
                                                                            n31 = x4.q(array2, d9, z5);
                                                                            s.putObject(t, n23, z5.c);
                                                                            break Label_0718;
                                                                        }
                                                                        break;
                                                                    }
                                                                    case 9: {
                                                                        final int n36 = n13;
                                                                        if (n12 == 2) {
                                                                            final int g = x4.g(this.r(n36), array2, d9, n2, z5);
                                                                            Object x2;
                                                                            if ((int1 & n25) == 0x0) {
                                                                                x2 = z5.c;
                                                                            }
                                                                            else {
                                                                                x2 = t6.e(s.getObject(t, n23), z5.c);
                                                                            }
                                                                            s.putObject(t, n23, x2);
                                                                            n8 = n;
                                                                            final int n37 = int1 | n25;
                                                                            n = g;
                                                                            n7 = n36;
                                                                            n9 = n37;
                                                                            break Label_1192;
                                                                        }
                                                                        break;
                                                                    }
                                                                    case 8: {
                                                                        if (n12 == 2) {
                                                                            if ((0x20000000 & n21) == 0x0) {
                                                                                n31 = x4.n(array2, d9, z5);
                                                                            }
                                                                            else {
                                                                                n31 = x4.p(array2, d9, z5);
                                                                            }
                                                                            s.putObject(t, n23, z5.c);
                                                                            break Label_1147;
                                                                        }
                                                                        break;
                                                                    }
                                                                    case 7: {
                                                                        if (n12 == 0) {
                                                                            n31 = x4.k(array2, d9, z5);
                                                                            r9.k(t, n23, z5.b != 0L);
                                                                            break Label_1147;
                                                                        }
                                                                        break;
                                                                    }
                                                                    case 6:
                                                                    case 13: {
                                                                        if (n12 == 5) {
                                                                            s.putInt(t, n23, x4.h(array2, d9));
                                                                            break Label_1108;
                                                                        }
                                                                        break;
                                                                    }
                                                                    case 5:
                                                                    case 14: {
                                                                        if (n12 == 1) {
                                                                            s.putLong(o, n23, x4.l(array2, d9));
                                                                            n31 = d9 + 8;
                                                                            break Label_1147;
                                                                        }
                                                                        break;
                                                                    }
                                                                    case 4:
                                                                    case 11: {
                                                                        if (n12 == 0) {
                                                                            n31 = x4.i(array2, d9, z5);
                                                                            s.putInt(t, n23, z5.a);
                                                                            break Label_1147;
                                                                        }
                                                                        break;
                                                                    }
                                                                    case 2:
                                                                    case 3: {
                                                                        if (n12 == 0) {
                                                                            n31 = x4.k(array2, d9, z5);
                                                                            s.putLong(o, n23, z5.b);
                                                                            n32 = (int1 | n25);
                                                                            break Label_1073;
                                                                        }
                                                                        break;
                                                                    }
                                                                    case 1: {
                                                                        if (n12 == 5) {
                                                                            r9.g(t, n23, x4.o(array2, d9));
                                                                            break Label_1108;
                                                                        }
                                                                        break;
                                                                    }
                                                                    case 0: {
                                                                        if (n12 == 1) {
                                                                            r9.f(t, n23, x4.m(array2, d9));
                                                                            n31 = d9 + 8;
                                                                            break Label_1147;
                                                                        }
                                                                        break;
                                                                    }
                                                                }
                                                                break Label_1211;
                                                            }
                                                            s.putInt(t, n23, k);
                                                        }
                                                        final int n38 = int1 | n25;
                                                        n39 = n10;
                                                        n40 = n38;
                                                        break Label_1162;
                                                        continue;
                                                    }
                                                }
                                                final int n41 = n10;
                                                n40 = n32;
                                                n39 = n41;
                                                break Label_1162;
                                            }
                                            n31 = d9 + 4;
                                            break Label_1147;
                                            break Label_1211;
                                        }
                                        final int n42 = int1 | n25;
                                        n39 = n10;
                                        n40 = n42;
                                    }
                                    n29 = n39;
                                    n27 = n40;
                                    n30 = n;
                                    n = n31;
                                }
                                n7 = n13;
                                n9 = n27;
                                n8 = n30;
                            }
                            n10 = n29;
                        }
                        final int n43 = n2;
                        n5 = n3;
                        n6 = n11;
                        n4 = n43;
                        continue;
                    }
                    n18 = n3;
                    final int n44 = d9;
                    final int n45 = n;
                    final int n46 = n11;
                    n = n44;
                    n16 = n45;
                    n20 = n13;
                    n14 = n46;
                }
                else {
                    int1 = n9;
                    t = o;
                    int n49 = 0;
                    Label_1567: {
                        Label_1563: {
                            if (n22 != 27) {
                                final int n47 = n13;
                                Label_1635: {
                                    int n54 = 0;
                                    Label_1470: {
                                        int n48;
                                        if (n22 <= 49) {
                                            final int m = this.m(o, array, d9, n2, n, n11, n12, n47, n21, n22, n23, z4);
                                            if ((n48 = m) == d9) {
                                                n49 = m;
                                                break Label_1635;
                                            }
                                        }
                                        else {
                                            final int n50 = d9;
                                            final int n51 = n;
                                            if (n22 == 50) {
                                                if (n12 != 2) {
                                                    break Label_1563;
                                                }
                                                final int n52 = this.n(o, array, n50, n2, n47, n23, z4);
                                                if ((n48 = n52) == n50) {
                                                    n49 = n52;
                                                    break Label_1635;
                                                }
                                            }
                                            else {
                                                final int l = this.l(o, array, n50, n2, n51, n11, n12, n21, n22, n23, n47, z4);
                                                if (l == n50) {
                                                    n49 = l;
                                                    break Label_1635;
                                                }
                                                n8 = n51;
                                                final int n53 = n3;
                                                n = l;
                                                n54 = n53;
                                                break Label_1470;
                                            }
                                        }
                                        n54 = n3;
                                        n8 = n;
                                        n = n48;
                                    }
                                    t = o;
                                    final int n55 = n2;
                                    array2 = array;
                                    z5 = z4;
                                    n9 = int1;
                                    n7 = n47;
                                    n6 = n11;
                                    n5 = n54;
                                    n4 = n55;
                                    continue;
                                }
                                break Label_1567;
                            }
                            if (n12 == 2) {
                                z6<?> d10;
                                final z6 z6 = d10 = (z6<?>)s.getObject(t, n23);
                                if (!z6.zza()) {
                                    final int size = z6.size();
                                    int n56;
                                    if (size == 0) {
                                        n56 = 10;
                                    }
                                    else {
                                        n56 = size << 1;
                                    }
                                    d10 = z6.d(n56);
                                    s.putObject(t, n23, d10);
                                }
                                final int e = x4.e(this.r(n13), n, array, d9, n2, d10, z4);
                                final int n57 = n3;
                                final int n58 = n;
                                n6 = n11;
                                n4 = n2;
                                n = e;
                                n7 = n13;
                                n8 = n58;
                                n9 = int1;
                                n5 = n57;
                                continue;
                            }
                        }
                        n49 = d9;
                    }
                    final int n59 = n11;
                    final int n60 = n3;
                    n16 = n;
                    n = n49;
                    n18 = n60;
                    n20 = n13;
                    n14 = n59;
                }
            }
            boolean b = true;
            if (n16 == n18 && n18 != 0) {
                d8 = this;
                n8 = n16;
                n3 = n18;
                n9 = int1;
                break;
            }
            if (this.f && z4.d != b6.d()) {
                final p6.e<z7, ?> b2 = z4.d.b(this.e, n14);
                if (b2 == null) {
                    n = x4.c(n16, array, n, n2, T(o), z4);
                }
                else {
                    final p6.c c = (p6.c)o;
                    c.F();
                    final h6<p6.f> zzc = c.zzc;
                    final p6.f d11 = b2.d;
                    final boolean j = d11.J;
                    final ca i2 = d11.I;
                    if (i2 == ca.V) {
                        x4.i(array, n, z4);
                        throw null;
                    }
                    final int[] a3 = w4.a;
                    Object o3 = null;
                    Label_2186: {
                        Label_2180: {
                            while (true) {
                                Label_2164: {
                                    long l2 = 0L;
                                    Label_2144: {
                                        int i3 = 0;
                                        Label_2119: {
                                            Label_1981: {
                                                switch (a3[i2.ordinal()]) {
                                                    default: {
                                                        o3 = o2;
                                                        break;
                                                    }
                                                    case 18: {
                                                        n = x4.g(com.google.android.gms.internal.vision.n8.a().b(b2.c.getClass()), array, n, n2, z4);
                                                        o3 = z4.c;
                                                        break;
                                                    }
                                                    case 17: {
                                                        n = x4.f(com.google.android.gms.internal.vision.n8.a().b(b2.c.getClass()), array, n, n2, n14 << 3 | 0x4, z4);
                                                        break Label_1981;
                                                    }
                                                    case 16: {
                                                        n = x4.n(array, n, z4);
                                                        break Label_1981;
                                                    }
                                                    case 15: {
                                                        n = x4.q(array, n, z4);
                                                        break Label_1981;
                                                    }
                                                    case 14: {
                                                        throw new IllegalStateException("Shouldn't reach here.");
                                                    }
                                                    case 13: {
                                                        n = x4.k(array, n, z4);
                                                        l2 = s5.b(z4.b);
                                                        break Label_2144;
                                                    }
                                                    case 12: {
                                                        n = x4.i(array, n, z4);
                                                        i3 = s5.k(z4.a);
                                                        break Label_2119;
                                                    }
                                                    case 11: {
                                                        n = x4.k(array, n, z4);
                                                        if (z4.b == 0L) {
                                                            b = false;
                                                        }
                                                        o3 = b;
                                                        break;
                                                    }
                                                    case 9:
                                                    case 10: {
                                                        o3 = x4.h(array, n);
                                                        break Label_2164;
                                                    }
                                                    case 7:
                                                    case 8: {
                                                        o3 = x4.l(array, n);
                                                        break Label_2180;
                                                    }
                                                    case 5:
                                                    case 6: {
                                                        n = x4.i(array, n, z4);
                                                        i3 = z4.a;
                                                        break Label_2119;
                                                    }
                                                    case 3:
                                                    case 4: {
                                                        n = x4.k(array, n, z4);
                                                        l2 = z4.b;
                                                        break Label_2144;
                                                    }
                                                    case 2: {
                                                        o3 = x4.o(array, n);
                                                        break Label_2164;
                                                    }
                                                    case 1: {
                                                        o3 = x4.m(array, n);
                                                        break Label_2180;
                                                    }
                                                }
                                                break Label_2186;
                                            }
                                            o3 = z4.c;
                                            break Label_2186;
                                        }
                                        o3 = i3;
                                        continue;
                                    }
                                    o3 = l2;
                                    continue;
                                }
                                n += 4;
                                continue;
                            }
                        }
                        n += 8;
                    }
                    final p6.f d12 = b2.d;
                    if (d12.J) {
                        zzc.k(d12, o3);
                    }
                    else {
                        final int n61 = a3[d12.I.ordinal()];
                        Object e2;
                        if (n61 != 17 && n61 != 18) {
                            e2 = o3;
                        }
                        else {
                            final Object d13 = zzc.d(b2.d);
                            e2 = o3;
                            if (d13 != null) {
                                e2 = t6.e(d13, o3);
                            }
                        }
                        zzc.h(b2.d, e2);
                    }
                }
            }
            else {
                n = x4.c(n16, array, n, n2, T(o), z4);
            }
            final int n62 = n16;
            array2 = array;
            t = o;
            n7 = n20;
            n4 = n2;
            final int n63 = n18;
            z5 = z4;
            n6 = n14;
            n8 = n62;
            n9 = int1;
            n5 = n63;
        }
        if (n10 != 1048575) {
            s.putInt(o, n10, n9);
        }
        int k2 = d8.k;
        Object o4 = null;
        while (k2 < d8.l) {
            o4 = d8.t(o, d8.j[k2], o4, d8.o);
            ++k2;
        }
        if (o4 != null) {
            d8.o.n(o, o4);
        }
        if (n3 == 0) {
            if (n != n2) {
                throw y6.h();
            }
        }
        else if (n > n2 || n8 != n3) {
            throw y6.h();
        }
        return n;
    }
    
    @Override
    public final T zza() {
        return (T)this.m.a(this.e);
    }
}
