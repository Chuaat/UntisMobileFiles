// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.Objects;
import java.util.Arrays;
import java.lang.reflect.Field;
import java.io.IOException;
import java.util.List;
import sun.misc.Unsafe;

final class va<T> implements db<T>
{
    private static final int[] p;
    private static final Unsafe q;
    private final int[] a;
    private final Object[] b;
    private final int c;
    private final int d;
    private final sa e;
    private final boolean f;
    private final boolean g;
    private final int[] h;
    private final int i;
    private final int j;
    private final fa k;
    private final vb<?, ?> l;
    private final w8<?> m;
    private final xa n;
    private final na o;
    
    static {
        p = new int[0];
        q = fc.l();
    }
    
    private va(final int[] a, final int[] b, final Object[] c, final int d, final int e, final sa g, final boolean b2, final boolean h, final int[] i, final int j, final int n, final xa k, final fa l, final vb<?, ?> m, final w8<?> o, final na na) {
        this.a = a;
        this.b = (Object[])b;
        this.c = (int)c;
        this.d = d;
        this.g = (boolean)g;
        boolean f = false;
        if (m != null) {
            f = f;
            if (((w8)m).c((sa)e)) {
                f = true;
            }
        }
        this.f = f;
        this.h = (int[])(Object)h;
        this.i = (int)(Object)i;
        this.j = j;
        this.n = (xa)n;
        this.k = (fa)k;
        this.l = (vb<?, ?>)l;
        this.m = (w8<?>)m;
        this.e = (sa)e;
        this.o = (na)o;
    }
    
    private final void A(final T o, final r8 r8) throws IOException {
        if (!this.f) {
            final int length = this.a.length;
            final Unsafe q = va.q;
            int i = 0;
            int n = 0;
            int n2 = 1048575;
            while (i < length) {
                final int k = this.k(i);
                final int n3 = this.a[i];
                final int j = j(k);
                int int1;
                int n7;
                if (j <= 17) {
                    final int n4 = this.a[i + 2];
                    final int n5 = n4 & 0xFFFFF;
                    int1 = n;
                    int n6;
                    if (n5 != (n6 = n2)) {
                        int1 = q.getInt(o, n5);
                        n6 = n5;
                    }
                    n7 = 1 << (n4 >>> 20);
                    n2 = n6;
                }
                else {
                    n7 = 0;
                    int1 = n;
                }
                final long n8 = k & 0xFFFFF;
                switch (j) {
                    case 68: {
                        if (this.y(o, n3, i)) {
                            r8.B(n3, q.getObject(o, n8), this.n(i));
                            break;
                        }
                        break;
                    }
                    case 67: {
                        if (this.y(o, n3, i)) {
                            r8.c(n3, l(o, n8));
                            break;
                        }
                        break;
                    }
                    case 66: {
                        if (this.y(o, n3, i)) {
                            r8.a(n3, L(o, n8));
                            break;
                        }
                        break;
                    }
                    case 65: {
                        if (this.y(o, n3, i)) {
                            r8.J(n3, l(o, n8));
                            break;
                        }
                        break;
                    }
                    case 64: {
                        if (this.y(o, n3, i)) {
                            r8.H(n3, L(o, n8));
                            break;
                        }
                        break;
                    }
                    case 63: {
                        if (this.y(o, n3, i)) {
                            r8.t(n3, L(o, n8));
                            break;
                        }
                        break;
                    }
                    case 62: {
                        if (this.y(o, n3, i)) {
                            r8.h(n3, L(o, n8));
                            break;
                        }
                        break;
                    }
                    case 61: {
                        if (this.y(o, n3, i)) {
                            r8.o(n3, (h8)q.getObject(o, n8));
                            break;
                        }
                        break;
                    }
                    case 60: {
                        if (this.y(o, n3, i)) {
                            r8.G(n3, q.getObject(o, n8), this.n(i));
                            break;
                        }
                        break;
                    }
                    case 59: {
                        if (this.y(o, n3, i)) {
                            C(n3, q.getObject(o, n8), r8);
                            break;
                        }
                        break;
                    }
                    case 58: {
                        if (this.y(o, n3, i)) {
                            r8.m(n3, z(o, n8));
                            break;
                        }
                        break;
                    }
                    case 57: {
                        if (this.y(o, n3, i)) {
                            r8.v(n3, L(o, n8));
                            break;
                        }
                        break;
                    }
                    case 56: {
                        if (this.y(o, n3, i)) {
                            r8.x(n3, l(o, n8));
                            break;
                        }
                        break;
                    }
                    case 55: {
                        if (this.y(o, n3, i)) {
                            r8.C(n3, L(o, n8));
                            break;
                        }
                        break;
                    }
                    case 54: {
                        if (this.y(o, n3, i)) {
                            r8.j(n3, l(o, n8));
                            break;
                        }
                        break;
                    }
                    case 53: {
                        if (this.y(o, n3, i)) {
                            r8.E(n3, l(o, n8));
                            break;
                        }
                        break;
                    }
                    case 52: {
                        if (this.y(o, n3, i)) {
                            r8.z(n3, I(o, n8));
                            break;
                        }
                        break;
                    }
                    case 51: {
                        if (this.y(o, n3, i)) {
                            r8.q(n3, H(o, n8));
                            break;
                        }
                        break;
                    }
                    case 50: {
                        this.B(r8, n3, q.getObject(o, n8), i);
                        break;
                    }
                    case 49: {
                        fb.q(this.a[i], (List<?>)q.getObject(o, n8), r8, this.n(i));
                        break;
                    }
                    case 48: {
                        fb.x(this.a[i], (List<Long>)q.getObject(o, n8), r8, true);
                        break;
                    }
                    case 47: {
                        fb.w(this.a[i], (List<Integer>)q.getObject(o, n8), r8, true);
                        break;
                    }
                    case 46: {
                        fb.v(this.a[i], (List<Long>)q.getObject(o, n8), r8, true);
                        break;
                    }
                    case 45: {
                        fb.u(this.a[i], (List<Integer>)q.getObject(o, n8), r8, true);
                        break;
                    }
                    case 44: {
                        fb.m(this.a[i], (List<Integer>)q.getObject(o, n8), r8, true);
                        break;
                    }
                    case 43: {
                        fb.z(this.a[i], (List<Integer>)q.getObject(o, n8), r8, true);
                        break;
                    }
                    case 42: {
                        fb.j(this.a[i], (List<Boolean>)q.getObject(o, n8), r8, true);
                        break;
                    }
                    case 41: {
                        fb.n(this.a[i], (List<Integer>)q.getObject(o, n8), r8, true);
                        break;
                    }
                    case 40: {
                        fb.o(this.a[i], (List<Long>)q.getObject(o, n8), r8, true);
                        break;
                    }
                    case 39: {
                        fb.r(this.a[i], (List<Integer>)q.getObject(o, n8), r8, true);
                        break;
                    }
                    case 38: {
                        fb.B(this.a[i], (List<Long>)q.getObject(o, n8), r8, true);
                        break;
                    }
                    case 37: {
                        fb.s(this.a[i], (List<Long>)q.getObject(o, n8), r8, true);
                        break;
                    }
                    case 36: {
                        fb.p(this.a[i], (List<Float>)q.getObject(o, n8), r8, true);
                        break;
                    }
                    case 35: {
                        fb.l(this.a[i], (List<Double>)q.getObject(o, n8), r8, true);
                        break;
                    }
                    case 34: {
                        fb.x(this.a[i], (List<Long>)q.getObject(o, n8), r8, false);
                        break;
                    }
                    case 33: {
                        fb.w(this.a[i], (List<Integer>)q.getObject(o, n8), r8, false);
                        break;
                    }
                    case 32: {
                        fb.v(this.a[i], (List<Long>)q.getObject(o, n8), r8, false);
                        break;
                    }
                    case 31: {
                        fb.u(this.a[i], (List<Integer>)q.getObject(o, n8), r8, false);
                        break;
                    }
                    case 30: {
                        fb.m(this.a[i], (List<Integer>)q.getObject(o, n8), r8, false);
                        break;
                    }
                    case 29: {
                        fb.z(this.a[i], (List<Integer>)q.getObject(o, n8), r8, false);
                        break;
                    }
                    case 28: {
                        fb.k(this.a[i], (List<h8>)q.getObject(o, n8), r8);
                        break;
                    }
                    case 27: {
                        fb.t(this.a[i], (List<?>)q.getObject(o, n8), r8, this.n(i));
                        break;
                    }
                    case 26: {
                        fb.y(this.a[i], (List<String>)q.getObject(o, n8), r8);
                        break;
                    }
                    case 25: {
                        fb.j(this.a[i], (List<Boolean>)q.getObject(o, n8), r8, false);
                        break;
                    }
                    case 24: {
                        fb.n(this.a[i], (List<Integer>)q.getObject(o, n8), r8, false);
                        break;
                    }
                    case 23: {
                        fb.o(this.a[i], (List<Long>)q.getObject(o, n8), r8, false);
                        break;
                    }
                    case 22: {
                        fb.r(this.a[i], (List<Integer>)q.getObject(o, n8), r8, false);
                        break;
                    }
                    case 21: {
                        fb.B(this.a[i], (List<Long>)q.getObject(o, n8), r8, false);
                        break;
                    }
                    case 20: {
                        fb.s(this.a[i], (List<Long>)q.getObject(o, n8), r8, false);
                        break;
                    }
                    case 19: {
                        fb.p(this.a[i], (List<Float>)q.getObject(o, n8), r8, false);
                        break;
                    }
                    case 18: {
                        fb.l(this.a[i], (List<Double>)q.getObject(o, n8), r8, false);
                        break;
                    }
                    case 17: {
                        if ((int1 & n7) != 0x0) {
                            r8.B(n3, q.getObject(o, n8), this.n(i));
                            break;
                        }
                        break;
                    }
                    case 16: {
                        if ((int1 & n7) != 0x0) {
                            r8.c(n3, q.getLong(o, n8));
                            break;
                        }
                        break;
                    }
                    case 15: {
                        if ((int1 & n7) != 0x0) {
                            r8.a(n3, q.getInt(o, n8));
                            break;
                        }
                        break;
                    }
                    case 14: {
                        if ((int1 & n7) != 0x0) {
                            r8.J(n3, q.getLong(o, n8));
                            break;
                        }
                        break;
                    }
                    case 13: {
                        if ((int1 & n7) != 0x0) {
                            r8.H(n3, q.getInt(o, n8));
                            break;
                        }
                        break;
                    }
                    case 12: {
                        if ((int1 & n7) != 0x0) {
                            r8.t(n3, q.getInt(o, n8));
                            break;
                        }
                        break;
                    }
                    case 11: {
                        if ((int1 & n7) != 0x0) {
                            r8.h(n3, q.getInt(o, n8));
                            break;
                        }
                        break;
                    }
                    case 10: {
                        if ((int1 & n7) != 0x0) {
                            r8.o(n3, (h8)q.getObject(o, n8));
                            break;
                        }
                        break;
                    }
                    case 9: {
                        if ((int1 & n7) != 0x0) {
                            r8.G(n3, q.getObject(o, n8), this.n(i));
                            break;
                        }
                        break;
                    }
                    case 8: {
                        if ((int1 & n7) != 0x0) {
                            C(n3, q.getObject(o, n8), r8);
                            break;
                        }
                        break;
                    }
                    case 7: {
                        if ((int1 & n7) != 0x0) {
                            r8.m(n3, fc.B(o, n8));
                            break;
                        }
                        break;
                    }
                    case 6: {
                        if ((int1 & n7) != 0x0) {
                            r8.v(n3, q.getInt(o, n8));
                            break;
                        }
                        break;
                    }
                    case 5: {
                        if ((int1 & n7) != 0x0) {
                            r8.x(n3, q.getLong(o, n8));
                            break;
                        }
                        break;
                    }
                    case 4: {
                        if ((int1 & n7) != 0x0) {
                            r8.C(n3, q.getInt(o, n8));
                            break;
                        }
                        break;
                    }
                    case 3: {
                        if ((int1 & n7) != 0x0) {
                            r8.j(n3, q.getLong(o, n8));
                            break;
                        }
                        break;
                    }
                    case 2: {
                        if ((int1 & n7) != 0x0) {
                            r8.E(n3, q.getLong(o, n8));
                            break;
                        }
                        break;
                    }
                    case 1: {
                        if ((int1 & n7) != 0x0) {
                            r8.z(n3, fc.g(o, n8));
                            break;
                        }
                        break;
                    }
                    case 0: {
                        if ((int1 & n7) != 0x0) {
                            r8.q(n3, fc.f(o, n8));
                            break;
                        }
                        break;
                    }
                }
                i += 3;
                n = int1;
            }
            final vb<?, ?> l = this.l;
            l.i(l.c(o), r8);
            return;
        }
        this.m.a(o);
        throw null;
    }
    
    private final <K, V> void B(final r8 r8, final int n, final Object o, final int n2) throws IOException {
        if (o == null) {
            return;
        }
        final ka ka = (ka)this.o(n2);
        throw null;
    }
    
    private static final void C(final int n, final Object o, final r8 r8) throws IOException {
        if (o instanceof String) {
            r8.f(n, (String)o);
            return;
        }
        r8.o(n, (h8)o);
    }
    
    static wb E(final Object o) {
        final j9 j9 = (j9)o;
        wb zzc;
        if ((zzc = j9.zzc) == wb.c()) {
            zzc = wb.e();
            j9.zzc = zzc;
        }
        return zzc;
    }
    
    static <T> va<T> F(final Class<T> clazz, final pa pa, final xa xa, final fa fa, final vb<?, ?> vb, final w8<?> w8, final na na) {
        if (pa instanceof cb) {
            return G((cb)pa, xa, fa, vb, w8, na);
        }
        final sb sb = (sb)pa;
        throw null;
    }
    
    static <T> va<T> G(final cb cb, final xa xa, final fa fa, final vb<?, ?> vb, final w8<?> w8, final na na) {
        final boolean b = cb.a() == 2;
        final String b2 = cb.b();
        final int length = b2.length();
        int index2;
        if (b2.charAt(0) >= '\ud800') {
            int index = 1;
            while (true) {
                final int n = index2 = index + 1;
                if (b2.charAt(index) < '\ud800') {
                    break;
                }
                index = n;
            }
        }
        else {
            index2 = 1;
        }
        final int n2 = index2 + 1;
        final char char1 = b2.charAt(index2);
        int index3 = n2;
        int n3;
        if ((n3 = char1) >= 55296) {
            int n4 = char1 & '\u1fff';
            int n5 = 13;
            int index4 = n2;
            int n6;
            char char2;
            while (true) {
                n6 = index4 + 1;
                char2 = b2.charAt(index4);
                if (char2 < '\ud800') {
                    break;
                }
                n4 |= (char2 & '\u1fff') << n5;
                n5 += 13;
                index4 = n6;
            }
            n3 = (n4 | char2 << n5);
            index3 = n6;
        }
        int[] p6;
        int n7;
        int n8;
        int n9;
        int char3;
        int n10;
        int n11;
        int n12;
        if (n3 == 0) {
            p6 = va.p;
            n7 = 0;
            n8 = 0;
            n9 = 0;
            char3 = 0;
            n10 = 0;
            n11 = 0;
            n12 = 0;
        }
        else {
            final int n13 = index3 + 1;
            int char4;
            final char c = (char)(char4 = b2.charAt(index3));
            int index5 = n13;
            if (c >= '\ud800') {
                final int n14 = c & '\u1fff';
                int n15 = 13;
                int index6 = n13;
                int n16 = n14;
                int n17;
                char char5;
                while (true) {
                    n17 = index6 + 1;
                    char5 = b2.charAt(index6);
                    if (char5 < '\ud800') {
                        break;
                    }
                    n16 |= (char5 & '\u1fff') << n15;
                    n15 += 13;
                    index6 = n17;
                }
                final int n18 = n16 | char5 << n15;
                index5 = n17;
                char4 = n18;
            }
            final int n19 = index5 + 1;
            int char6;
            final char c2 = (char)(char6 = b2.charAt(index5));
            int index7 = n19;
            if (c2 >= '\ud800') {
                int n20 = c2 & '\u1fff';
                int n21 = 13;
                int index8 = n19;
                int n22;
                char char7;
                while (true) {
                    n22 = index8 + 1;
                    char7 = b2.charAt(index8);
                    if (char7 < '\ud800') {
                        break;
                    }
                    n20 |= (char7 & '\u1fff') << n21;
                    n21 += 13;
                    index8 = n22;
                }
                char6 = (n20 | char7 << n21);
                index7 = n22;
            }
            final int n23 = index7 + 1;
            int char8;
            final char c3 = (char)(char8 = b2.charAt(index7));
            int index9 = n23;
            if (c3 >= '\ud800') {
                final int n24 = c3 & '\u1fff';
                int n25 = 13;
                int index10 = n23;
                int n26 = n24;
                int n27;
                char char9;
                while (true) {
                    n27 = index10 + 1;
                    char9 = b2.charAt(index10);
                    if (char9 < '\ud800') {
                        break;
                    }
                    n26 |= (char9 & '\u1fff') << n25;
                    n25 += 13;
                    index10 = n27;
                }
                final int n28 = n26 | char9 << n25;
                index9 = n27;
                char8 = n28;
            }
            final int n29 = index9 + 1;
            int char10;
            final char c4 = (char)(char10 = b2.charAt(index9));
            int index11 = n29;
            if (c4 >= '\ud800') {
                final int n30 = c4 & '\u1fff';
                int n31 = 13;
                int index12 = n29;
                int n32 = n30;
                int n33;
                char char11;
                while (true) {
                    n33 = index12 + 1;
                    char11 = b2.charAt(index12);
                    if (char11 < '\ud800') {
                        break;
                    }
                    n32 |= (char11 & '\u1fff') << n31;
                    n31 += 13;
                    index12 = n33;
                }
                final int n34 = n32 | char11 << n31;
                index11 = n33;
                char10 = n34;
            }
            final int n35 = index11 + 1;
            final char c5 = (char)(char3 = b2.charAt(index11));
            int index13 = n35;
            if (c5 >= '\ud800') {
                int n36 = c5 & '\u1fff';
                int n37 = 13;
                int index14 = n35;
                int n38;
                char char12;
                while (true) {
                    n38 = index14 + 1;
                    char12 = b2.charAt(index14);
                    if (char12 < '\ud800') {
                        break;
                    }
                    n36 |= (char12 & '\u1fff') << n37;
                    n37 += 13;
                    index14 = n38;
                }
                char3 = (n36 | char12 << n37);
                index13 = n38;
            }
            final int n39 = index13 + 1;
            int char13;
            final char c6 = (char)(char13 = b2.charAt(index13));
            int index15 = n39;
            if (c6 >= '\ud800') {
                int n40 = c6 & '\u1fff';
                int n41 = 13;
                int index16 = n39;
                int n42;
                char char14;
                while (true) {
                    n42 = index16 + 1;
                    char14 = b2.charAt(index16);
                    if (char14 < '\ud800') {
                        break;
                    }
                    n40 |= (char14 & '\u1fff') << n41;
                    n41 += 13;
                    index16 = n42;
                }
                char13 = (n40 | char14 << n41);
                index15 = n42;
            }
            final int n43 = index15 + 1;
            int char15;
            final char c7 = (char)(char15 = b2.charAt(index15));
            int index17 = n43;
            if (c7 >= '\ud800') {
                int n44 = c7 & '\u1fff';
                int n45 = 13;
                int index18 = n43;
                int n46;
                char char16;
                while (true) {
                    n46 = index18 + 1;
                    char16 = b2.charAt(index18);
                    if (char16 < '\ud800') {
                        break;
                    }
                    n44 |= (char16 & '\u1fff') << n45;
                    n45 += 13;
                    index18 = n46;
                }
                char15 = (n44 | char16 << n45);
                index17 = n46;
            }
            final int n47 = index17 + 1;
            int char17;
            final char c8 = (char)(char17 = b2.charAt(index17));
            int n48 = n47;
            if (c8 >= '\ud800') {
                final int n49 = c8 & '\u1fff';
                int n50 = 13;
                int index19 = n47;
                int n51 = n49;
                char char18;
                while (true) {
                    n48 = index19 + 1;
                    char18 = b2.charAt(index19);
                    if (char18 < '\ud800') {
                        break;
                    }
                    n51 |= (char18 & '\u1fff') << n50;
                    n50 += 13;
                    index19 = n48;
                }
                char17 = (n51 | char18 << n50);
            }
            p6 = new int[char17 + char13 + char15];
            final int n52 = char4 + char4 + char6;
            n7 = char4;
            final int n53 = n48;
            n10 = char10;
            n9 = char13;
            n12 = n52;
            n11 = char17;
            n8 = char8;
            index3 = n53;
        }
        final Unsafe q = va.q;
        final Object[] c9 = cb.c();
        final Class<? extends sa> class1 = cb.zza().getClass();
        final int[] array = new int[char3 * 3];
        final Object[] array2 = new Object[char3 + char3];
        final int n54 = n11 + n9;
        int n55 = n11;
        int n56 = n54;
        int n57 = 0;
        int n58 = 0;
        final int n59 = n11;
        int n60 = n10;
        final int n61 = n8;
        int n70;
        int n88;
        int n89;
        for (int i = index3; i < length; i = n89, n58 = n70, n56 = n88) {
            int index20 = i + 1;
            int char19 = b2.charAt(i);
            int index21;
            if (char19 >= 55296) {
                int n62 = char19 & 0x1FFF;
                int n63 = 13;
                int n64;
                char char20;
                while (true) {
                    n64 = index20 + 1;
                    char20 = b2.charAt(index20);
                    if (char20 < '\ud800') {
                        break;
                    }
                    n62 |= (char20 & '\u1fff') << n63;
                    n63 += 13;
                    index20 = n64;
                }
                char19 = (n62 | char20 << n63);
                index21 = n64;
            }
            else {
                index21 = index20;
            }
            int n65 = index21 + 1;
            int char21 = b2.charAt(index21);
            if (char21 >= 55296) {
                int n66 = char21 & 0x1FFF;
                int index22 = n65;
                int n67 = 13;
                int n68;
                char char22;
                while (true) {
                    n68 = index22 + 1;
                    char22 = b2.charAt(index22);
                    if (char22 < '\ud800') {
                        break;
                    }
                    n66 |= (char22 & '\u1fff') << n67;
                    n67 += 13;
                    index22 = n68;
                }
                char21 = (n66 | char22 << n67);
                n65 = n68;
            }
            final int n69 = char21 & 0xFF;
            n70 = n58;
            if ((char21 & 0x400) != 0x0) {
                p6[n58] = n57;
                n70 = n58 + 1;
            }
            int n85;
            int n86;
            int n87;
            if (n69 >= 51) {
                final int n71 = n65 + 1;
                int char23 = b2.charAt(n65);
                int n75;
                if (char23 >= 55296) {
                    int n72 = char23 & 0x1FFF;
                    int n73 = 13;
                    int index23 = n71;
                    int n74;
                    char char24;
                    while (true) {
                        n74 = index23 + 1;
                        char24 = b2.charAt(index23);
                        if (char24 < '\ud800') {
                            break;
                        }
                        n72 |= (char24 & '\u1fff') << n73;
                        n73 += 13;
                        index23 = n74;
                    }
                    char23 = (n72 | char24 << n73);
                    n75 = n74;
                }
                else {
                    n75 = n71;
                }
                final int n76 = n69 - 51;
                final int n77 = n75;
                int n78 = 0;
                Label_1719: {
                    int n81;
                    if (n76 != 9 && n76 != 17) {
                        n78 = n12;
                        if (n76 != 12) {
                            break Label_1719;
                        }
                        n78 = n12;
                        if (b) {
                            break Label_1719;
                        }
                        final int n79 = n57 / 3;
                        final int n80 = n12 + 1;
                        array2[n79 + n79 + 1] = c9[n12];
                        n81 = n80;
                    }
                    else {
                        final int n82 = n57 / 3;
                        final int n83 = n12 + 1;
                        array2[n82 + n82 + 1] = c9[n12];
                        n81 = n83;
                    }
                    n78 = n81;
                }
                int n84 = char23 + char23;
                final Object o = c9[n84];
                Field p7;
                if (o instanceof Field) {
                    p7 = (Field)o;
                }
                else {
                    p7 = p(class1, (String)o);
                    c9[n84] = p7;
                }
                n85 = (int)q.objectFieldOffset(p7);
                ++n84;
                final Object o2 = c9[n84];
                Field p8;
                if (o2 instanceof Field) {
                    p8 = (Field)o2;
                }
                else {
                    p8 = p(class1, (String)o2);
                    c9[n84] = p8;
                }
                n86 = (int)q.objectFieldOffset(p8);
                n87 = 0;
                n12 = n78;
                n88 = n56;
                n89 = n77;
            }
            else {
                final int n90 = n60;
                final int n91 = n12 + 1;
                final Field p9 = p(class1, (String)c9[n12]);
                int n97 = 0;
                Label_2146: {
                    int n92 = 0;
                    Label_2142: {
                        if (n69 != 9 && n69 != 17) {
                            Label_2114: {
                                if (n69 != 27 && n69 != 49) {
                                    int n93;
                                    if (n69 != 12 && n69 != 30 && n69 != 44) {
                                        n92 = n91;
                                        n93 = n55;
                                        if (n69 == 50) {
                                            n93 = n55 + 1;
                                            p6[n55] = n57;
                                            final int n94 = n57 / 3;
                                            final int n95 = n94 + n94;
                                            final int n96 = n91 + 1;
                                            array2[n95] = c9[n91];
                                            if ((char21 & 0x800) == 0x0) {
                                                n55 = n93;
                                                n97 = n96;
                                                break Label_2146;
                                            }
                                            final int n98 = n96 + 1;
                                            array2[n95 + 1] = c9[n96];
                                            n92 = n98;
                                        }
                                    }
                                    else {
                                        n92 = n91;
                                        n93 = n55;
                                        if (!b) {
                                            final int n99 = n57 / 3;
                                            n97 = n91 + 1;
                                            array2[n99 + n99 + 1] = c9[n91];
                                            break Label_2114;
                                        }
                                    }
                                    n55 = n93;
                                    break Label_2142;
                                }
                                final int n100 = n57 / 3;
                                n97 = n91 + 1;
                                array2[n100 + n100 + 1] = c9[n91];
                            }
                            break Label_2146;
                        }
                        final int n101 = n57 / 3;
                        array2[n101 + n101 + 1] = p9.getType();
                        n92 = n91;
                    }
                    n97 = n92;
                }
                n85 = (int)q.objectFieldOffset(p9);
                int n102;
                int n107;
                int n108;
                if ((char21 & 0x1000) == 0x1000 && n69 <= 17) {
                    n102 = n65 + 1;
                    int char25 = b2.charAt(n65);
                    if (char25 >= 55296) {
                        int n103 = char25 & 0x1FFF;
                        int n104 = 13;
                        int index24 = n102;
                        char char26;
                        while (true) {
                            n102 = index24 + 1;
                            char26 = b2.charAt(index24);
                            if (char26 < '\ud800') {
                                break;
                            }
                            n103 |= (char26 & '\u1fff') << n104;
                            n104 += 13;
                            index24 = n102;
                        }
                        char25 = (n103 | char26 << n104);
                    }
                    final int n105 = n7 + n7 + char25 / 32;
                    final Object o3 = c9[n105];
                    Field p10;
                    if (o3 instanceof Field) {
                        p10 = (Field)o3;
                    }
                    else {
                        p10 = p(class1, (String)o3);
                        c9[n105] = p10;
                    }
                    final int n106 = (int)q.objectFieldOffset(p10);
                    n107 = char25 % 32;
                    n108 = n106;
                }
                else {
                    n102 = n65;
                    n108 = 1048575;
                    n107 = 0;
                }
                int n109 = n56;
                if (n69 >= 18) {
                    n109 = n56;
                    if (n69 <= 49) {
                        p6[n56] = n85;
                        n109 = n56 + 1;
                    }
                }
                final int n110 = n97;
                n60 = n90;
                n89 = n102;
                n88 = n109;
                n12 = n110;
                n87 = n107;
                n86 = n108;
            }
            final int n111 = n57 + 1;
            array[n57] = char19;
            final int n112 = n111 + 1;
            int n113;
            if ((char21 & 0x200) != 0x0) {
                n113 = 536870912;
            }
            else {
                n113 = 0;
            }
            int n114;
            if ((char21 & 0x100) != 0x0) {
                n114 = 268435456;
            }
            else {
                n114 = 0;
            }
            array[n111] = (n114 | n113 | n69 << 20 | n85);
            n57 = n112 + 1;
            array[n112] = (n87 << 20 | n86);
        }
        return new va<T>(array, array2, n61, n60, cb.zza(), b, false, p6, n59, n54, xa, fa, (vb)vb, (w8)w8, na, (byte[])null);
    }
    
    private static <T> double H(final T t, final long n) {
        return (double)fc.k(t, n);
    }
    
    private static <T> float I(final T t, final long n) {
        return (float)fc.k(t, n);
    }
    
    private final int J(final T t) {
        final Unsafe q = va.q;
        int i = 0;
        int n = 0;
        int int1 = 0;
        int n2 = 1048575;
        while (i < this.a.length) {
            final int k = this.k(i);
            final int n3 = this.a[i];
            final int j = j(k);
            int n7;
            int n8;
            if (j <= 17) {
                final int n4 = this.a[i + 2];
                final int n5 = n4 & 0xFFFFF;
                final int n6 = 1 << (n4 >>> 20);
                n7 = n2;
                n8 = n6;
                if (n5 != n2) {
                    int1 = q.getInt(t, n5);
                    n7 = n5;
                    n8 = n6;
                }
            }
            else {
                n8 = 0;
                n7 = n2;
            }
            final long offset = k & 0xFFFFF;
            int n9 = 0;
        Label_1837_Outer:
            while (true) {
                Label_2178: {
                    Label_2152: {
                        long n17 = 0L;
                        Label_2122: {
                            Label_2113: {
                                int n19 = 0;
                                Label_2076: {
                                    int n14 = 0;
                                    int n18 = 0;
                                    Label_2069: {
                                        int n16 = 0;
                                        Label_2053: {
                                            Label_2044: {
                                                Label_1988: {
                                                    Object o2 = null;
                                                    Label_1950: {
                                                        while (true) {
                                                            Label_1947: {
                                                                Label_1888: {
                                                                    Label_1828: {
                                                                        int n12 = 0;
                                                                        Label_1806: {
                                                                            Label_1797: {
                                                                                int n11 = 0;
                                                                                Label_1706: {
                                                                                    long n10 = 0L;
                                                                                    Label_1657: {
                                                                                        Label_1611: {
                                                                                            Label_1301: {
                                                                                                Label_0773: {
                                                                                                    switch (j) {
                                                                                                        default: {
                                                                                                            n9 = n;
                                                                                                            break Label_1837_Outer;
                                                                                                        }
                                                                                                        case 68: {
                                                                                                            n9 = n;
                                                                                                            if (this.y(t, n3, i)) {
                                                                                                                break Label_1611;
                                                                                                            }
                                                                                                            break Label_1837_Outer;
                                                                                                        }
                                                                                                        case 67: {
                                                                                                            n9 = n;
                                                                                                            if (this.y(t, n3, i)) {
                                                                                                                n10 = l(t, offset);
                                                                                                                break Label_1657;
                                                                                                            }
                                                                                                            break Label_1837_Outer;
                                                                                                        }
                                                                                                        case 66: {
                                                                                                            n9 = n;
                                                                                                            if (this.y(t, n3, i)) {
                                                                                                                n11 = L(t, offset);
                                                                                                                break Label_1706;
                                                                                                            }
                                                                                                            break Label_1837_Outer;
                                                                                                        }
                                                                                                        case 65: {
                                                                                                            n9 = n;
                                                                                                            if (this.y(t, n3, i)) {
                                                                                                                break Label_2178;
                                                                                                            }
                                                                                                            break Label_1837_Outer;
                                                                                                        }
                                                                                                        case 64: {
                                                                                                            n9 = n;
                                                                                                            if (this.y(t, n3, i)) {
                                                                                                                break Label_2152;
                                                                                                            }
                                                                                                            break Label_1837_Outer;
                                                                                                        }
                                                                                                        case 63: {
                                                                                                            n9 = n;
                                                                                                            if (this.y(t, n3, i)) {
                                                                                                                break;
                                                                                                            }
                                                                                                            break Label_1837_Outer;
                                                                                                        }
                                                                                                        case 62: {
                                                                                                            n9 = n;
                                                                                                            if (this.y(t, n3, i)) {
                                                                                                                n12 = L(t, offset);
                                                                                                                break Label_1797;
                                                                                                            }
                                                                                                            break Label_1837_Outer;
                                                                                                        }
                                                                                                        case 61: {
                                                                                                            n9 = n;
                                                                                                            if (this.y(t, n3, i)) {
                                                                                                                break Label_1828;
                                                                                                            }
                                                                                                            break Label_1837_Outer;
                                                                                                        }
                                                                                                        case 60: {
                                                                                                            n9 = n;
                                                                                                            if (this.y(t, n3, i)) {
                                                                                                                break Label_1888;
                                                                                                            }
                                                                                                            break Label_1837_Outer;
                                                                                                        }
                                                                                                        case 59: {
                                                                                                            n9 = n;
                                                                                                            if (!this.y(t, n3, i)) {
                                                                                                                break Label_1837_Outer;
                                                                                                            }
                                                                                                            final Object o = o2 = q.getObject(t, offset);
                                                                                                            if (o instanceof h8) {
                                                                                                                final Object object = o;
                                                                                                                break Label_1947;
                                                                                                            }
                                                                                                            break Label_1950;
                                                                                                        }
                                                                                                        case 58: {
                                                                                                            n9 = n;
                                                                                                            if (this.y(t, n3, i)) {
                                                                                                                break Label_1988;
                                                                                                            }
                                                                                                            break Label_1837_Outer;
                                                                                                        }
                                                                                                        case 57: {
                                                                                                            n9 = n;
                                                                                                            if (this.y(t, n3, i)) {
                                                                                                                break Label_2152;
                                                                                                            }
                                                                                                            break Label_1837_Outer;
                                                                                                        }
                                                                                                        case 56: {
                                                                                                            n9 = n;
                                                                                                            if (this.y(t, n3, i)) {
                                                                                                                break Label_2178;
                                                                                                            }
                                                                                                            break Label_1837_Outer;
                                                                                                        }
                                                                                                        case 55: {
                                                                                                            n9 = n;
                                                                                                            if (this.y(t, n3, i)) {
                                                                                                                break;
                                                                                                            }
                                                                                                            break Label_1837_Outer;
                                                                                                        }
                                                                                                        case 54: {
                                                                                                            n9 = n;
                                                                                                            if (this.y(t, n3, i)) {
                                                                                                                break Label_0773;
                                                                                                            }
                                                                                                            break Label_1837_Outer;
                                                                                                        }
                                                                                                        case 53: {
                                                                                                            n9 = n;
                                                                                                            if (this.y(t, n3, i)) {
                                                                                                                break Label_0773;
                                                                                                            }
                                                                                                            break Label_1837_Outer;
                                                                                                        }
                                                                                                        case 52: {
                                                                                                            n9 = n;
                                                                                                            if (this.y(t, n3, i)) {
                                                                                                                break Label_2152;
                                                                                                            }
                                                                                                            break Label_1837_Outer;
                                                                                                        }
                                                                                                        case 51: {
                                                                                                            n9 = n;
                                                                                                            if (this.y(t, n3, i)) {
                                                                                                                break Label_2178;
                                                                                                            }
                                                                                                            break Label_1837_Outer;
                                                                                                        }
                                                                                                        case 50: {
                                                                                                            na.a(n3, q.getObject(t, offset), this.o(i));
                                                                                                            n9 = n;
                                                                                                            break Label_1837_Outer;
                                                                                                        }
                                                                                                        case 49: {
                                                                                                            final int n13 = fb.L(n3, (List<sa>)q.getObject(t, offset), this.n(i));
                                                                                                            break Label_1589;
                                                                                                        }
                                                                                                        case 48: {
                                                                                                            final int v = fb.V((List<Long>)q.getObject(t, offset));
                                                                                                            n9 = n;
                                                                                                            if (v > 0) {
                                                                                                                n14 = v;
                                                                                                                break Label_1301;
                                                                                                            }
                                                                                                            break Label_1837_Outer;
                                                                                                        }
                                                                                                        case 47: {
                                                                                                            final int t2 = fb.T((List<Integer>)q.getObject(t, offset));
                                                                                                            n9 = n;
                                                                                                            if (t2 > 0) {
                                                                                                                n14 = t2;
                                                                                                                break Label_1301;
                                                                                                            }
                                                                                                            break Label_1837_Outer;
                                                                                                        }
                                                                                                        case 46: {
                                                                                                            final int l = fb.K((List<?>)q.getObject(t, offset));
                                                                                                            n9 = n;
                                                                                                            if (l > 0) {
                                                                                                                n14 = l;
                                                                                                                break Label_1301;
                                                                                                            }
                                                                                                            break Label_1837_Outer;
                                                                                                        }
                                                                                                        case 45: {
                                                                                                            final int m = fb.I((List<?>)q.getObject(t, offset));
                                                                                                            n9 = n;
                                                                                                            if (m > 0) {
                                                                                                                n14 = m;
                                                                                                                break Label_1301;
                                                                                                            }
                                                                                                            break Label_1837_Outer;
                                                                                                        }
                                                                                                        case 44: {
                                                                                                            final int g = fb.G((List<Integer>)q.getObject(t, offset));
                                                                                                            n9 = n;
                                                                                                            if (g > 0) {
                                                                                                                n14 = g;
                                                                                                                break Label_1301;
                                                                                                            }
                                                                                                            break Label_1837_Outer;
                                                                                                        }
                                                                                                        case 43: {
                                                                                                            final int y = fb.Y((List<Integer>)q.getObject(t, offset));
                                                                                                            n9 = n;
                                                                                                            if (y > 0) {
                                                                                                                n14 = y;
                                                                                                                break Label_1301;
                                                                                                            }
                                                                                                            break Label_1837_Outer;
                                                                                                        }
                                                                                                        case 42: {
                                                                                                            final int d = fb.D((List<?>)q.getObject(t, offset));
                                                                                                            n9 = n;
                                                                                                            if (d > 0) {
                                                                                                                n14 = d;
                                                                                                                break Label_1301;
                                                                                                            }
                                                                                                            break Label_1837_Outer;
                                                                                                        }
                                                                                                        case 41: {
                                                                                                            final int i2 = fb.I((List<?>)q.getObject(t, offset));
                                                                                                            n9 = n;
                                                                                                            if (i2 > 0) {
                                                                                                                n14 = i2;
                                                                                                                break Label_1301;
                                                                                                            }
                                                                                                            break Label_1837_Outer;
                                                                                                        }
                                                                                                        case 40: {
                                                                                                            final int k2 = fb.K((List<?>)q.getObject(t, offset));
                                                                                                            n9 = n;
                                                                                                            if (k2 > 0) {
                                                                                                                n14 = k2;
                                                                                                                break Label_1301;
                                                                                                            }
                                                                                                            break Label_1837_Outer;
                                                                                                        }
                                                                                                        case 39: {
                                                                                                            final int n15 = fb.N((List<Integer>)q.getObject(t, offset));
                                                                                                            n9 = n;
                                                                                                            if (n15 > 0) {
                                                                                                                n14 = n15;
                                                                                                                break Label_1301;
                                                                                                            }
                                                                                                            break Label_1837_Outer;
                                                                                                        }
                                                                                                        case 38: {
                                                                                                            final int a0 = fb.a0((List<Long>)q.getObject(t, offset));
                                                                                                            n9 = n;
                                                                                                            if (a0 > 0) {
                                                                                                                n14 = a0;
                                                                                                                break Label_1301;
                                                                                                            }
                                                                                                            break Label_1837_Outer;
                                                                                                        }
                                                                                                        case 37: {
                                                                                                            final int p = fb.P((List<Long>)q.getObject(t, offset));
                                                                                                            n9 = n;
                                                                                                            if (p > 0) {
                                                                                                                n14 = p;
                                                                                                                break Label_1301;
                                                                                                            }
                                                                                                            break Label_1837_Outer;
                                                                                                        }
                                                                                                        case 36: {
                                                                                                            final int i3 = fb.I((List<?>)q.getObject(t, offset));
                                                                                                            n9 = n;
                                                                                                            if (i3 > 0) {
                                                                                                                n14 = i3;
                                                                                                                break Label_1301;
                                                                                                            }
                                                                                                            break Label_1837_Outer;
                                                                                                        }
                                                                                                        case 35: {
                                                                                                            final int k3 = fb.K((List<?>)q.getObject(t, offset));
                                                                                                            n9 = n;
                                                                                                            if (k3 > 0) {
                                                                                                                n14 = k3;
                                                                                                                break Label_1301;
                                                                                                            }
                                                                                                            break Label_1837_Outer;
                                                                                                        }
                                                                                                        case 34: {
                                                                                                            final int n13 = fb.U(n3, (List<Long>)q.getObject(t, offset), false);
                                                                                                            break Label_1589;
                                                                                                        }
                                                                                                        case 33: {
                                                                                                            final int n13 = fb.S(n3, (List<Integer>)q.getObject(t, offset), false);
                                                                                                            break Label_1589;
                                                                                                        }
                                                                                                        case 30: {
                                                                                                            final int n13 = fb.F(n3, (List<Integer>)q.getObject(t, offset), false);
                                                                                                            break Label_1589;
                                                                                                        }
                                                                                                        case 29: {
                                                                                                            final int n13 = fb.X(n3, (List<Integer>)q.getObject(t, offset), false);
                                                                                                            break Label_1589;
                                                                                                        }
                                                                                                        case 28: {
                                                                                                            final int n13 = fb.E(n3, (List<h8>)q.getObject(t, offset));
                                                                                                            break Label_1589;
                                                                                                        }
                                                                                                        case 27: {
                                                                                                            final int n13 = fb.R(n3, (List<?>)q.getObject(t, offset), this.n(i));
                                                                                                            break Label_1589;
                                                                                                        }
                                                                                                        case 26: {
                                                                                                            final int n13 = fb.W(n3, (List<?>)q.getObject(t, offset));
                                                                                                            break Label_1589;
                                                                                                        }
                                                                                                        case 25: {
                                                                                                            final int n13 = fb.A(n3, (List<?>)q.getObject(t, offset), false);
                                                                                                            break Label_1589;
                                                                                                        }
                                                                                                        case 22: {
                                                                                                            final int n13 = fb.M(n3, (List<Integer>)q.getObject(t, offset), false);
                                                                                                            break Label_1589;
                                                                                                        }
                                                                                                        case 21: {
                                                                                                            final int n13 = fb.Z(n3, (List<Long>)q.getObject(t, offset), false);
                                                                                                            break Label_1589;
                                                                                                        }
                                                                                                        case 20: {
                                                                                                            final int n13 = fb.O(n3, (List<Long>)q.getObject(t, offset), false);
                                                                                                            break Label_1589;
                                                                                                        }
                                                                                                        case 19:
                                                                                                        case 24:
                                                                                                        case 31: {
                                                                                                            final int n13 = fb.H(n3, (List<?>)q.getObject(t, offset), false);
                                                                                                            break Label_1589;
                                                                                                        }
                                                                                                        case 18:
                                                                                                        case 23:
                                                                                                        case 32: {
                                                                                                            final int n13 = fb.J(n3, (List<?>)q.getObject(t, offset), false);
                                                                                                            break Label_1589;
                                                                                                        }
                                                                                                        case 17: {
                                                                                                            n9 = n;
                                                                                                            if ((int1 & n8) != 0x0) {
                                                                                                                break Label_1611;
                                                                                                            }
                                                                                                            break Label_1837_Outer;
                                                                                                        }
                                                                                                        case 16: {
                                                                                                            n9 = n;
                                                                                                            if ((int1 & n8) != 0x0) {
                                                                                                                n10 = q.getLong(t, offset);
                                                                                                                break Label_1657;
                                                                                                            }
                                                                                                            break Label_1837_Outer;
                                                                                                        }
                                                                                                        case 15: {
                                                                                                            n9 = n;
                                                                                                            if ((int1 & n8) != 0x0) {
                                                                                                                n11 = q.getInt(t, offset);
                                                                                                                break Label_1706;
                                                                                                            }
                                                                                                            break Label_1837_Outer;
                                                                                                        }
                                                                                                        case 14: {
                                                                                                            n9 = n;
                                                                                                            if ((int1 & n8) != 0x0) {
                                                                                                                break Label_2178;
                                                                                                            }
                                                                                                            break Label_1837_Outer;
                                                                                                        }
                                                                                                        case 13: {
                                                                                                            n9 = n;
                                                                                                            if ((int1 & n8) != 0x0) {
                                                                                                                break Label_2152;
                                                                                                            }
                                                                                                            break Label_1837_Outer;
                                                                                                        }
                                                                                                        case 12: {
                                                                                                            n9 = n;
                                                                                                            if ((int1 & n8) != 0x0) {
                                                                                                                break Label_2044;
                                                                                                            }
                                                                                                            break Label_1837_Outer;
                                                                                                        }
                                                                                                        case 11: {
                                                                                                            n9 = n;
                                                                                                            if ((int1 & n8) != 0x0) {
                                                                                                                n12 = q.getInt(t, offset);
                                                                                                                break Label_1797;
                                                                                                            }
                                                                                                            break Label_1837_Outer;
                                                                                                        }
                                                                                                        case 10: {
                                                                                                            n9 = n;
                                                                                                            if ((int1 & n8) != 0x0) {
                                                                                                                break Label_1828;
                                                                                                            }
                                                                                                            break Label_1837_Outer;
                                                                                                        }
                                                                                                        case 9: {
                                                                                                            n9 = n;
                                                                                                            if ((int1 & n8) != 0x0) {
                                                                                                                break Label_1888;
                                                                                                            }
                                                                                                            break Label_1837_Outer;
                                                                                                        }
                                                                                                        case 8: {
                                                                                                            n9 = n;
                                                                                                            if ((int1 & n8) == 0x0) {
                                                                                                                break Label_1837_Outer;
                                                                                                            }
                                                                                                            final Object o3 = o2 = q.getObject(t, offset);
                                                                                                            if (o3 instanceof h8) {
                                                                                                                final Object object = o3;
                                                                                                                break Label_1947;
                                                                                                            }
                                                                                                            break Label_1950;
                                                                                                        }
                                                                                                        case 7: {
                                                                                                            n9 = n;
                                                                                                            if ((int1 & n8) != 0x0) {
                                                                                                                break Label_1988;
                                                                                                            }
                                                                                                            break Label_1837_Outer;
                                                                                                        }
                                                                                                        case 6: {
                                                                                                            n9 = n;
                                                                                                            if ((int1 & n8) != 0x0) {
                                                                                                                break Label_2152;
                                                                                                            }
                                                                                                            break Label_1837_Outer;
                                                                                                        }
                                                                                                        case 5: {
                                                                                                            n9 = n;
                                                                                                            if ((int1 & n8) != 0x0) {
                                                                                                                break Label_2178;
                                                                                                            }
                                                                                                            break Label_1837_Outer;
                                                                                                        }
                                                                                                        case 4: {
                                                                                                            n9 = n;
                                                                                                            if ((int1 & n8) != 0x0) {
                                                                                                                break Label_2044;
                                                                                                            }
                                                                                                            break Label_1837_Outer;
                                                                                                        }
                                                                                                        case 3: {
                                                                                                            n9 = n;
                                                                                                            if ((int1 & n8) != 0x0) {
                                                                                                                break Label_2113;
                                                                                                            }
                                                                                                            break Label_1837_Outer;
                                                                                                        }
                                                                                                        case 2: {
                                                                                                            n9 = n;
                                                                                                            if ((int1 & n8) != 0x0) {
                                                                                                                break Label_2113;
                                                                                                            }
                                                                                                            break Label_1837_Outer;
                                                                                                        }
                                                                                                        case 1: {
                                                                                                            n9 = n;
                                                                                                            if ((int1 & n8) != 0x0) {
                                                                                                                break Label_2152;
                                                                                                            }
                                                                                                            break Label_1837_Outer;
                                                                                                        }
                                                                                                        case 0: {
                                                                                                            n9 = n;
                                                                                                            if ((int1 & n8) != 0x0) {
                                                                                                                break Label_2178;
                                                                                                            }
                                                                                                            break Label_1837_Outer;
                                                                                                        }
                                                                                                    }
                                                                                                    n16 = L(t, offset);
                                                                                                    break Label_2053;
                                                                                                }
                                                                                                n17 = l(t, offset);
                                                                                                break Label_2122;
                                                                                            }
                                                                                            n18 = q8.D(n3) + q8.a(n14);
                                                                                            break Label_2069;
                                                                                            int n13 = 0;
                                                                                            n9 = n + n13;
                                                                                            break Label_1837_Outer;
                                                                                        }
                                                                                        final int n13 = q8.y(n3, (sa)q.getObject(t, offset), this.n(i));
                                                                                        continue Label_1837_Outer;
                                                                                    }
                                                                                    n18 = q8.a(n3 << 3);
                                                                                    n14 = q8.b(n10 >> 63 ^ n10 + n10);
                                                                                    break Label_2069;
                                                                                }
                                                                                n18 = q8.a(n3 << 3);
                                                                                n12 = (n11 >> 31 ^ n11 + n11);
                                                                                break Label_1806;
                                                                            }
                                                                            n18 = q8.a(n3 << 3);
                                                                        }
                                                                        n14 = q8.a(n12);
                                                                        break Label_2069;
                                                                    }
                                                                    final Object object = q.getObject(t, offset);
                                                                    final h8 h8 = (h8)object;
                                                                    final int a2 = q8.a(n3 << 3);
                                                                    final int h9 = h8.h();
                                                                    n19 = a2 + (q8.a(h9) + h9);
                                                                    break Label_2076;
                                                                }
                                                                final int n13 = fb.Q(n3, q.getObject(t, offset), this.n(i));
                                                                continue Label_1837_Outer;
                                                            }
                                                            continue;
                                                        }
                                                    }
                                                    final String s = (String)o2;
                                                    n18 = q8.a(n3 << 3);
                                                    n14 = q8.C(s);
                                                    break Label_2069;
                                                }
                                                final int n13 = q8.a(n3 << 3) + 1;
                                                continue;
                                            }
                                            n16 = q.getInt(t, offset);
                                        }
                                        n18 = q8.a(n3 << 3);
                                        n14 = q8.z(n16);
                                    }
                                    n19 = n18 + n14;
                                }
                                n9 = n + n19;
                                break Label_1837_Outer;
                            }
                            n17 = q.getLong(t, offset);
                        }
                        final int n13 = q8.a(n3 << 3) + q8.b(n17);
                        continue;
                    }
                    final int n13 = q8.a(n3 << 3) + 4;
                    continue;
                }
                final int n13 = q8.a(n3 << 3) + 8;
                continue;
            }
            i += 3;
            n = n9;
            n2 = n7;
        }
        final vb<?, ?> l2 = this.l;
        final int a3 = l2.a(l2.c(t));
        if (!this.f) {
            return n + a3;
        }
        this.m.a(t);
        throw null;
    }
    
    private final int K(final T t) {
        final Unsafe q = va.q;
        int i = 0;
        int n = 0;
        while (i < this.a.length) {
            final int k = this.k(i);
            final int j = j(k);
            final int n2 = this.a[i];
            final long n3 = k & 0xFFFFF;
            if (j >= b9.s0.zza() && j <= b9.F0.zza()) {
                final int n4 = this.a[i + 2];
            }
            int n5 = 0;
        Label_1772_Outer:
            while (true) {
                Label_2122: {
                    Label_2095: {
                        long n13 = 0L;
                        Label_2061: {
                            Label_2053: {
                                int n15 = 0;
                                Label_2014: {
                                    int n10 = 0;
                                    int n14 = 0;
                                    Label_2007: {
                                        int n12 = 0;
                                        Label_1991: {
                                            Label_1983: {
                                                Label_1924: {
                                                    Object o2 = null;
                                                    Label_1885: {
                                                        while (true) {
                                                            Label_1882: {
                                                                Label_1824: {
                                                                    Label_1764: {
                                                                        int n8 = 0;
                                                                        Label_1741: {
                                                                            Label_1732: {
                                                                                int n7 = 0;
                                                                                Label_1638: {
                                                                                    long n6 = 0L;
                                                                                    Label_1589: {
                                                                                        Label_1544: {
                                                                                            Label_1246: {
                                                                                                Label_0720: {
                                                                                                    switch (j) {
                                                                                                        default: {
                                                                                                            n5 = n;
                                                                                                            break Label_1772_Outer;
                                                                                                        }
                                                                                                        case 68: {
                                                                                                            n5 = n;
                                                                                                            if (this.y(t, n2, i)) {
                                                                                                                break Label_1544;
                                                                                                            }
                                                                                                            break Label_1772_Outer;
                                                                                                        }
                                                                                                        case 67: {
                                                                                                            n5 = n;
                                                                                                            if (this.y(t, n2, i)) {
                                                                                                                n6 = l(t, n3);
                                                                                                                break Label_1589;
                                                                                                            }
                                                                                                            break Label_1772_Outer;
                                                                                                        }
                                                                                                        case 66: {
                                                                                                            n5 = n;
                                                                                                            if (this.y(t, n2, i)) {
                                                                                                                n7 = L(t, n3);
                                                                                                                break Label_1638;
                                                                                                            }
                                                                                                            break Label_1772_Outer;
                                                                                                        }
                                                                                                        case 65: {
                                                                                                            n5 = n;
                                                                                                            if (this.y(t, n2, i)) {
                                                                                                                break Label_2122;
                                                                                                            }
                                                                                                            break Label_1772_Outer;
                                                                                                        }
                                                                                                        case 64: {
                                                                                                            n5 = n;
                                                                                                            if (this.y(t, n2, i)) {
                                                                                                                break Label_2095;
                                                                                                            }
                                                                                                            break Label_1772_Outer;
                                                                                                        }
                                                                                                        case 63: {
                                                                                                            n5 = n;
                                                                                                            if (this.y(t, n2, i)) {
                                                                                                                break;
                                                                                                            }
                                                                                                            break Label_1772_Outer;
                                                                                                        }
                                                                                                        case 62: {
                                                                                                            n5 = n;
                                                                                                            if (this.y(t, n2, i)) {
                                                                                                                n8 = L(t, n3);
                                                                                                                break Label_1732;
                                                                                                            }
                                                                                                            break Label_1772_Outer;
                                                                                                        }
                                                                                                        case 61: {
                                                                                                            n5 = n;
                                                                                                            if (this.y(t, n2, i)) {
                                                                                                                break Label_1764;
                                                                                                            }
                                                                                                            break Label_1772_Outer;
                                                                                                        }
                                                                                                        case 60: {
                                                                                                            n5 = n;
                                                                                                            if (this.y(t, n2, i)) {
                                                                                                                break Label_1824;
                                                                                                            }
                                                                                                            break Label_1772_Outer;
                                                                                                        }
                                                                                                        case 59: {
                                                                                                            n5 = n;
                                                                                                            if (!this.y(t, n2, i)) {
                                                                                                                break Label_1772_Outer;
                                                                                                            }
                                                                                                            final Object o = o2 = fc.k(t, n3);
                                                                                                            if (o instanceof h8) {
                                                                                                                final Object l = o;
                                                                                                                break Label_1882;
                                                                                                            }
                                                                                                            break Label_1885;
                                                                                                        }
                                                                                                        case 58: {
                                                                                                            n5 = n;
                                                                                                            if (this.y(t, n2, i)) {
                                                                                                                break Label_1924;
                                                                                                            }
                                                                                                            break Label_1772_Outer;
                                                                                                        }
                                                                                                        case 57: {
                                                                                                            n5 = n;
                                                                                                            if (this.y(t, n2, i)) {
                                                                                                                break Label_2095;
                                                                                                            }
                                                                                                            break Label_1772_Outer;
                                                                                                        }
                                                                                                        case 56: {
                                                                                                            n5 = n;
                                                                                                            if (this.y(t, n2, i)) {
                                                                                                                break Label_2122;
                                                                                                            }
                                                                                                            break Label_1772_Outer;
                                                                                                        }
                                                                                                        case 55: {
                                                                                                            n5 = n;
                                                                                                            if (this.y(t, n2, i)) {
                                                                                                                break;
                                                                                                            }
                                                                                                            break Label_1772_Outer;
                                                                                                        }
                                                                                                        case 54: {
                                                                                                            n5 = n;
                                                                                                            if (this.y(t, n2, i)) {
                                                                                                                break Label_0720;
                                                                                                            }
                                                                                                            break Label_1772_Outer;
                                                                                                        }
                                                                                                        case 53: {
                                                                                                            n5 = n;
                                                                                                            if (this.y(t, n2, i)) {
                                                                                                                break Label_0720;
                                                                                                            }
                                                                                                            break Label_1772_Outer;
                                                                                                        }
                                                                                                        case 52: {
                                                                                                            n5 = n;
                                                                                                            if (this.y(t, n2, i)) {
                                                                                                                break Label_2095;
                                                                                                            }
                                                                                                            break Label_1772_Outer;
                                                                                                        }
                                                                                                        case 51: {
                                                                                                            n5 = n;
                                                                                                            if (this.y(t, n2, i)) {
                                                                                                                break Label_2122;
                                                                                                            }
                                                                                                            break Label_1772_Outer;
                                                                                                        }
                                                                                                        case 50: {
                                                                                                            na.a(n2, fc.k(t, n3), this.o(i));
                                                                                                            n5 = n;
                                                                                                            break Label_1772_Outer;
                                                                                                        }
                                                                                                        case 49: {
                                                                                                            final int n9 = fb.L(n2, (List<sa>)fc.k(t, n3), this.n(i));
                                                                                                            break Label_1521;
                                                                                                        }
                                                                                                        case 48: {
                                                                                                            final int v = fb.V((List<Long>)q.getObject(t, n3));
                                                                                                            n5 = n;
                                                                                                            if (v > 0) {
                                                                                                                n10 = v;
                                                                                                                break Label_1246;
                                                                                                            }
                                                                                                            break Label_1772_Outer;
                                                                                                        }
                                                                                                        case 47: {
                                                                                                            final int t2 = fb.T((List<Integer>)q.getObject(t, n3));
                                                                                                            n5 = n;
                                                                                                            if (t2 > 0) {
                                                                                                                n10 = t2;
                                                                                                                break Label_1246;
                                                                                                            }
                                                                                                            break Label_1772_Outer;
                                                                                                        }
                                                                                                        case 46: {
                                                                                                            final int m = fb.K((List<?>)q.getObject(t, n3));
                                                                                                            n5 = n;
                                                                                                            if (m > 0) {
                                                                                                                n10 = m;
                                                                                                                break Label_1246;
                                                                                                            }
                                                                                                            break Label_1772_Outer;
                                                                                                        }
                                                                                                        case 45: {
                                                                                                            final int i2 = fb.I((List<?>)q.getObject(t, n3));
                                                                                                            n5 = n;
                                                                                                            if (i2 > 0) {
                                                                                                                n10 = i2;
                                                                                                                break Label_1246;
                                                                                                            }
                                                                                                            break Label_1772_Outer;
                                                                                                        }
                                                                                                        case 44: {
                                                                                                            final int g = fb.G((List<Integer>)q.getObject(t, n3));
                                                                                                            n5 = n;
                                                                                                            if (g > 0) {
                                                                                                                n10 = g;
                                                                                                                break Label_1246;
                                                                                                            }
                                                                                                            break Label_1772_Outer;
                                                                                                        }
                                                                                                        case 43: {
                                                                                                            final int y = fb.Y((List<Integer>)q.getObject(t, n3));
                                                                                                            n5 = n;
                                                                                                            if (y > 0) {
                                                                                                                n10 = y;
                                                                                                                break Label_1246;
                                                                                                            }
                                                                                                            break Label_1772_Outer;
                                                                                                        }
                                                                                                        case 42: {
                                                                                                            final int d = fb.D((List<?>)q.getObject(t, n3));
                                                                                                            n5 = n;
                                                                                                            if (d > 0) {
                                                                                                                n10 = d;
                                                                                                                break Label_1246;
                                                                                                            }
                                                                                                            break Label_1772_Outer;
                                                                                                        }
                                                                                                        case 41: {
                                                                                                            final int i3 = fb.I((List<?>)q.getObject(t, n3));
                                                                                                            n5 = n;
                                                                                                            if (i3 > 0) {
                                                                                                                n10 = i3;
                                                                                                                break Label_1246;
                                                                                                            }
                                                                                                            break Label_1772_Outer;
                                                                                                        }
                                                                                                        case 40: {
                                                                                                            final int k2 = fb.K((List<?>)q.getObject(t, n3));
                                                                                                            n5 = n;
                                                                                                            if (k2 > 0) {
                                                                                                                n10 = k2;
                                                                                                                break Label_1246;
                                                                                                            }
                                                                                                            break Label_1772_Outer;
                                                                                                        }
                                                                                                        case 39: {
                                                                                                            final int n11 = fb.N((List<Integer>)q.getObject(t, n3));
                                                                                                            n5 = n;
                                                                                                            if (n11 > 0) {
                                                                                                                n10 = n11;
                                                                                                                break Label_1246;
                                                                                                            }
                                                                                                            break Label_1772_Outer;
                                                                                                        }
                                                                                                        case 38: {
                                                                                                            final int a0 = fb.a0((List<Long>)q.getObject(t, n3));
                                                                                                            n5 = n;
                                                                                                            if (a0 > 0) {
                                                                                                                n10 = a0;
                                                                                                                break Label_1246;
                                                                                                            }
                                                                                                            break Label_1772_Outer;
                                                                                                        }
                                                                                                        case 37: {
                                                                                                            final int p = fb.P((List<Long>)q.getObject(t, n3));
                                                                                                            n5 = n;
                                                                                                            if (p > 0) {
                                                                                                                n10 = p;
                                                                                                                break Label_1246;
                                                                                                            }
                                                                                                            break Label_1772_Outer;
                                                                                                        }
                                                                                                        case 36: {
                                                                                                            final int i4 = fb.I((List<?>)q.getObject(t, n3));
                                                                                                            n5 = n;
                                                                                                            if (i4 > 0) {
                                                                                                                n10 = i4;
                                                                                                                break Label_1246;
                                                                                                            }
                                                                                                            break Label_1772_Outer;
                                                                                                        }
                                                                                                        case 35: {
                                                                                                            final int k3 = fb.K((List<?>)q.getObject(t, n3));
                                                                                                            n5 = n;
                                                                                                            if (k3 > 0) {
                                                                                                                n10 = k3;
                                                                                                                break Label_1246;
                                                                                                            }
                                                                                                            break Label_1772_Outer;
                                                                                                        }
                                                                                                        case 34: {
                                                                                                            final int n9 = fb.U(n2, (List<Long>)fc.k(t, n3), false);
                                                                                                            break Label_1521;
                                                                                                        }
                                                                                                        case 33: {
                                                                                                            final int n9 = fb.S(n2, (List<Integer>)fc.k(t, n3), false);
                                                                                                            break Label_1521;
                                                                                                        }
                                                                                                        case 30: {
                                                                                                            final int n9 = fb.F(n2, (List<Integer>)fc.k(t, n3), false);
                                                                                                            break Label_1521;
                                                                                                        }
                                                                                                        case 29: {
                                                                                                            final int n9 = fb.X(n2, (List<Integer>)fc.k(t, n3), false);
                                                                                                            break Label_1521;
                                                                                                        }
                                                                                                        case 28: {
                                                                                                            final int n9 = fb.E(n2, (List<h8>)fc.k(t, n3));
                                                                                                            break Label_1521;
                                                                                                        }
                                                                                                        case 27: {
                                                                                                            final int n9 = fb.R(n2, (List<?>)fc.k(t, n3), this.n(i));
                                                                                                            break Label_1521;
                                                                                                        }
                                                                                                        case 26: {
                                                                                                            final int n9 = fb.W(n2, (List<?>)fc.k(t, n3));
                                                                                                            break Label_1521;
                                                                                                        }
                                                                                                        case 25: {
                                                                                                            final int n9 = fb.A(n2, (List<?>)fc.k(t, n3), false);
                                                                                                            break Label_1521;
                                                                                                        }
                                                                                                        case 22: {
                                                                                                            final int n9 = fb.M(n2, (List<Integer>)fc.k(t, n3), false);
                                                                                                            break Label_1521;
                                                                                                        }
                                                                                                        case 21: {
                                                                                                            final int n9 = fb.Z(n2, (List<Long>)fc.k(t, n3), false);
                                                                                                            break Label_1521;
                                                                                                        }
                                                                                                        case 20: {
                                                                                                            final int n9 = fb.O(n2, (List<Long>)fc.k(t, n3), false);
                                                                                                            break Label_1521;
                                                                                                        }
                                                                                                        case 19:
                                                                                                        case 24:
                                                                                                        case 31: {
                                                                                                            final int n9 = fb.H(n2, (List<?>)fc.k(t, n3), false);
                                                                                                            break Label_1521;
                                                                                                        }
                                                                                                        case 18:
                                                                                                        case 23:
                                                                                                        case 32: {
                                                                                                            final int n9 = fb.J(n2, (List<?>)fc.k(t, n3), false);
                                                                                                            break Label_1521;
                                                                                                        }
                                                                                                        case 17: {
                                                                                                            n5 = n;
                                                                                                            if (this.v(t, i)) {
                                                                                                                break Label_1544;
                                                                                                            }
                                                                                                            break Label_1772_Outer;
                                                                                                        }
                                                                                                        case 16: {
                                                                                                            n5 = n;
                                                                                                            if (this.v(t, i)) {
                                                                                                                n6 = fc.i(t, n3);
                                                                                                                break Label_1589;
                                                                                                            }
                                                                                                            break Label_1772_Outer;
                                                                                                        }
                                                                                                        case 15: {
                                                                                                            n5 = n;
                                                                                                            if (this.v(t, i)) {
                                                                                                                n7 = fc.h(t, n3);
                                                                                                                break Label_1638;
                                                                                                            }
                                                                                                            break Label_1772_Outer;
                                                                                                        }
                                                                                                        case 14: {
                                                                                                            n5 = n;
                                                                                                            if (this.v(t, i)) {
                                                                                                                break Label_2122;
                                                                                                            }
                                                                                                            break Label_1772_Outer;
                                                                                                        }
                                                                                                        case 13: {
                                                                                                            n5 = n;
                                                                                                            if (this.v(t, i)) {
                                                                                                                break Label_2095;
                                                                                                            }
                                                                                                            break Label_1772_Outer;
                                                                                                        }
                                                                                                        case 12: {
                                                                                                            n5 = n;
                                                                                                            if (this.v(t, i)) {
                                                                                                                break Label_1983;
                                                                                                            }
                                                                                                            break Label_1772_Outer;
                                                                                                        }
                                                                                                        case 11: {
                                                                                                            n5 = n;
                                                                                                            if (this.v(t, i)) {
                                                                                                                n8 = fc.h(t, n3);
                                                                                                                break Label_1732;
                                                                                                            }
                                                                                                            break Label_1772_Outer;
                                                                                                        }
                                                                                                        case 10: {
                                                                                                            n5 = n;
                                                                                                            if (this.v(t, i)) {
                                                                                                                break Label_1764;
                                                                                                            }
                                                                                                            break Label_1772_Outer;
                                                                                                        }
                                                                                                        case 9: {
                                                                                                            n5 = n;
                                                                                                            if (this.v(t, i)) {
                                                                                                                break Label_1824;
                                                                                                            }
                                                                                                            break Label_1772_Outer;
                                                                                                        }
                                                                                                        case 8: {
                                                                                                            n5 = n;
                                                                                                            if (!this.v(t, i)) {
                                                                                                                break Label_1772_Outer;
                                                                                                            }
                                                                                                            final Object o3 = o2 = fc.k(t, n3);
                                                                                                            if (o3 instanceof h8) {
                                                                                                                final Object l = o3;
                                                                                                                break Label_1882;
                                                                                                            }
                                                                                                            break Label_1885;
                                                                                                        }
                                                                                                        case 7: {
                                                                                                            n5 = n;
                                                                                                            if (this.v(t, i)) {
                                                                                                                break Label_1924;
                                                                                                            }
                                                                                                            break Label_1772_Outer;
                                                                                                        }
                                                                                                        case 6: {
                                                                                                            n5 = n;
                                                                                                            if (this.v(t, i)) {
                                                                                                                break Label_2095;
                                                                                                            }
                                                                                                            break Label_1772_Outer;
                                                                                                        }
                                                                                                        case 5: {
                                                                                                            n5 = n;
                                                                                                            if (this.v(t, i)) {
                                                                                                                break Label_2122;
                                                                                                            }
                                                                                                            break Label_1772_Outer;
                                                                                                        }
                                                                                                        case 4: {
                                                                                                            n5 = n;
                                                                                                            if (this.v(t, i)) {
                                                                                                                break Label_1983;
                                                                                                            }
                                                                                                            break Label_1772_Outer;
                                                                                                        }
                                                                                                        case 3: {
                                                                                                            n5 = n;
                                                                                                            if (this.v(t, i)) {
                                                                                                                break Label_2053;
                                                                                                            }
                                                                                                            break Label_1772_Outer;
                                                                                                        }
                                                                                                        case 2: {
                                                                                                            n5 = n;
                                                                                                            if (this.v(t, i)) {
                                                                                                                break Label_2053;
                                                                                                            }
                                                                                                            break Label_1772_Outer;
                                                                                                        }
                                                                                                        case 1: {
                                                                                                            n5 = n;
                                                                                                            if (this.v(t, i)) {
                                                                                                                break Label_2095;
                                                                                                            }
                                                                                                            break Label_1772_Outer;
                                                                                                        }
                                                                                                        case 0: {
                                                                                                            n5 = n;
                                                                                                            if (this.v(t, i)) {
                                                                                                                break Label_2122;
                                                                                                            }
                                                                                                            break Label_1772_Outer;
                                                                                                        }
                                                                                                    }
                                                                                                    n12 = L(t, n3);
                                                                                                    break Label_1991;
                                                                                                }
                                                                                                n13 = l(t, n3);
                                                                                                break Label_2061;
                                                                                            }
                                                                                            n14 = q8.D(n2) + q8.a(n10);
                                                                                            break Label_2007;
                                                                                            int n9 = 0;
                                                                                            n5 = n + n9;
                                                                                            break Label_1772_Outer;
                                                                                        }
                                                                                        final int n9 = q8.y(n2, (sa)fc.k(t, n3), this.n(i));
                                                                                        continue Label_1772_Outer;
                                                                                    }
                                                                                    n14 = q8.a(n2 << 3);
                                                                                    n10 = q8.b(n6 >> 63 ^ n6 + n6);
                                                                                    break Label_2007;
                                                                                }
                                                                                n14 = q8.a(n2 << 3);
                                                                                n8 = (n7 >> 31 ^ n7 + n7);
                                                                                break Label_1741;
                                                                            }
                                                                            n14 = q8.a(n2 << 3);
                                                                        }
                                                                        n10 = q8.a(n8);
                                                                        break Label_2007;
                                                                    }
                                                                    final Object l = fc.k(t, n3);
                                                                    final h8 h8 = (h8)l;
                                                                    final int a2 = q8.a(n2 << 3);
                                                                    final int h9 = h8.h();
                                                                    n15 = a2 + (q8.a(h9) + h9);
                                                                    break Label_2014;
                                                                }
                                                                final int n9 = fb.Q(n2, fc.k(t, n3), this.n(i));
                                                                continue Label_1772_Outer;
                                                            }
                                                            continue;
                                                        }
                                                    }
                                                    final String s = (String)o2;
                                                    n14 = q8.a(n2 << 3);
                                                    n10 = q8.C(s);
                                                    break Label_2007;
                                                }
                                                final int n9 = q8.a(n2 << 3) + 1;
                                                continue;
                                            }
                                            n12 = fc.h(t, n3);
                                        }
                                        n14 = q8.a(n2 << 3);
                                        n10 = q8.z(n12);
                                    }
                                    n15 = n14 + n10;
                                }
                                n5 = n + n15;
                                break Label_1772_Outer;
                            }
                            n13 = fc.i(t, n3);
                        }
                        n5 = n + (q8.a(n2 << 3) + q8.b(n13));
                        break Label_1772_Outer;
                    }
                    final int n9 = q8.a(n2 << 3) + 4;
                    continue;
                }
                final int n9 = q8.a(n2 << 3) + 8;
                continue;
            }
            i += 3;
            n = n5;
        }
        final vb<?, ?> l2 = this.l;
        return n + l2.a(l2.c(t));
    }
    
    private static <T> int L(final T t, final long n) {
        return (int)fc.k(t, n);
    }
    
    private final <K, V> int M(final T t, final byte[] array, final int n, final int n2, final int n3, final long n4, final t7 t2) throws IOException {
        final Unsafe q = va.q;
        final Object o = this.o(n3);
        final Object object = q.getObject(t, n4);
        if (!((ma)object).f()) {
            final ma<Object, Object> b = ma.a().b();
            na.b(b, object);
            q.putObject(t, n4, b);
        }
        final ka ka = (ka)o;
        throw null;
    }
    
    private final int N(final T o, final byte[] bytes, int offset, int i, final int n, final int x, final int n2, final int n3, final int n4, final long n5, final int n6, final t7 t7) throws IOException {
        final Unsafe q = va.q;
        final long offset2 = this.a[n6 + 2] & 0xFFFFF;
        Label_0570: {
            Object x2 = null;
            Label_0503: {
                while (true) {
                    Label_0273: {
                        long l = 0L;
                        switch (n4) {
                            default: {
                                return offset;
                            }
                            case 68: {
                                if (n2 != 3) {
                                    return offset;
                                }
                                offset = u7.c(this.n(n6), bytes, offset, i, (n & 0xFFFFFFF8) | 0x4, t7);
                                Object object;
                                if (q.getInt(o, offset2) == x) {
                                    object = q.getObject(o, n5);
                                }
                                else {
                                    object = null;
                                }
                                final Object c = t7.c;
                                if (object == null) {
                                    x2 = c;
                                    break Label_0503;
                                }
                                x2 = s9.g(object, c);
                                break Label_0503;
                            }
                            case 67: {
                                if (n2 != 0) {
                                    return offset;
                                }
                                offset = u7.m(bytes, offset, t7);
                                l = m8.b(t7.b);
                                break;
                            }
                            case 66: {
                                if (n2 != 0) {
                                    return offset;
                                }
                                offset = u7.j(bytes, offset, t7);
                                i = m8.a(t7.a);
                                break Label_0273;
                            }
                            case 63: {
                                if (n2 == 0) {
                                    offset = u7.j(bytes, offset, t7);
                                    i = t7.a;
                                    final o9 m = this.m(n6);
                                    if (m != null && !m.d(i)) {
                                        E(o).h(n, (long)i);
                                    }
                                    else {
                                        q.putObject(o, n5, i);
                                        q.putInt(o, offset2, x);
                                    }
                                    return offset;
                                }
                                return offset;
                            }
                            case 61: {
                                if (n2 != 2) {
                                    return offset;
                                }
                                offset = u7.a(bytes, offset, t7);
                                final Object x3 = t7.c;
                                break Label_0226;
                            }
                            case 60: {
                                if (n2 != 2) {
                                    return offset;
                                }
                                offset = u7.d(this.n(n6), bytes, offset, i, t7);
                                Object object2;
                                if (q.getInt(o, offset2) == x) {
                                    object2 = q.getObject(o, n5);
                                }
                                else {
                                    object2 = null;
                                }
                                final Object c2 = t7.c;
                                if (object2 == null) {
                                    x2 = c2;
                                    break Label_0503;
                                }
                                x2 = s9.g(object2, c2);
                                break Label_0503;
                            }
                            case 59: {
                                if (n2 != 2) {
                                    return offset;
                                }
                                offset = u7.j(bytes, offset, t7);
                                i = t7.a;
                                if (i == 0) {
                                    x2 = "";
                                    break Label_0503;
                                }
                                if ((n3 & 0x20000000) != 0x0 && !kc.f(bytes, offset, offset + i)) {
                                    throw u9.c();
                                }
                                q.putObject(o, n5, new String(bytes, offset, i, s9.a));
                                offset += i;
                                break Label_0570;
                            }
                            case 58: {
                                if (n2 == 0) {
                                    offset = u7.m(bytes, offset, t7);
                                    final Object x3 = t7.b != 0L;
                                    break Label_0226;
                                }
                                return offset;
                            }
                            case 57:
                            case 64: {
                                if (n2 != 5) {
                                    return offset;
                                }
                                q.putObject(o, n5, u7.b(bytes, offset));
                                q.putInt(o, offset2, x);
                                return offset + 4;
                            }
                            case 56:
                            case 65: {
                                if (n2 != 1) {
                                    return offset;
                                }
                                q.putObject(o, n5, u7.n(bytes, offset));
                                q.putInt(o, offset2, x);
                                return offset + 8;
                            }
                            case 55:
                            case 62: {
                                if (n2 != 0) {
                                    return offset;
                                }
                                offset = u7.j(bytes, offset, t7);
                                i = t7.a;
                                break Label_0273;
                            }
                            case 53:
                            case 54: {
                                if (n2 != 0) {
                                    return offset;
                                }
                                offset = u7.m(bytes, offset, t7);
                                l = t7.b;
                                break;
                            }
                            case 52: {
                                if (n2 != 5) {
                                    return offset;
                                }
                                q.putObject(o, n5, Float.intBitsToFloat(u7.b(bytes, offset)));
                                q.putInt(o, offset2, x);
                                return offset + 4;
                            }
                            case 51: {
                                if (n2 != 1) {
                                    return offset;
                                }
                                q.putObject(o, n5, Double.longBitsToDouble(u7.n(bytes, offset)));
                                q.putInt(o, offset2, x);
                                return offset + 8;
                            }
                        }
                        final Object x3 = l;
                        q.putObject(o, n5, x3);
                        q.putInt(o, offset2, x);
                        return offset;
                    }
                    final Object x3 = i;
                    continue;
                }
            }
            q.putObject(o, n5, x2);
        }
        q.putInt(o, offset2, x);
        return offset;
    }
    
    private final int O(final T t, final byte[] array, int n, final int n2, final t7 t2) throws IOException {
        int n3 = n2;
        Unsafe q = va.q;
        int i = n;
        int n4 = -1;
        int n5 = 0;
        n = 0;
        int n6 = 1048575;
        while (i < n3) {
            final int n7 = i + 1;
            int a = array[i];
            if (a < 0) {
                i = u7.k(a, array, n7, t2);
                a = t2.a;
            }
            else {
                i = n7;
            }
            final int n8 = a >>> 3;
            final int n9 = a & 0x7;
            int n10;
            if (n8 > n4) {
                n10 = this.R(n8, n5 / 3);
            }
            else {
                n10 = this.Q(n8);
            }
            Label_1223: {
                Label_1197: {
                    if (n10 != -1) {
                        final int n11 = this.a[n10 + 1];
                        final int j = j(n11);
                        final long offset = n11 & 0xFFFFF;
                        Label_1020: {
                            Label_1016: {
                                if (j <= 17) {
                                    final int n12 = this.a[n10 + 2];
                                    boolean b = true;
                                    final int n13 = 1 << (n12 >>> 20);
                                    final int n14 = n12 & 0xFFFFF;
                                    int n15;
                                    if (n14 != n6) {
                                        if (n6 != 1048575) {
                                            q.putInt(t, n6, n);
                                        }
                                        if (n14 != 1048575) {
                                            n = q.getInt(t, n14);
                                        }
                                        n6 = n14;
                                        n15 = n;
                                    }
                                    else {
                                        n15 = n;
                                    }
                                    Label_0880: {
                                        Label_0864: {
                                            long x = 0L;
                                            Label_0774: {
                                                int x2 = 0;
                                                Label_0738: {
                                                    Label_0721: {
                                                        Label_0659: {
                                                            Object x3 = null;
                                                            Label_0573: {
                                                                switch (j) {
                                                                    case 16: {
                                                                        if (n9 == 0) {
                                                                            n = u7.m(array, i, t2);
                                                                            x = m8.b(t2.b);
                                                                            break Label_0774;
                                                                        }
                                                                        break;
                                                                    }
                                                                    case 15: {
                                                                        if (n9 == 0) {
                                                                            n = u7.j(array, i, t2);
                                                                            x2 = m8.a(t2.a);
                                                                            break Label_0738;
                                                                        }
                                                                        break;
                                                                    }
                                                                    case 12: {
                                                                        if (n9 == 0) {
                                                                            break Label_0721;
                                                                        }
                                                                        break;
                                                                    }
                                                                    case 10: {
                                                                        if (n9 == 2) {
                                                                            n = u7.a(array, i, t2);
                                                                            q.putObject(t, offset, t2.c);
                                                                            break Label_0864;
                                                                        }
                                                                        break;
                                                                    }
                                                                    case 9: {
                                                                        if (n9 != 2) {
                                                                            break;
                                                                        }
                                                                        n = u7.d(this.n(n10), array, i, n2, t2);
                                                                        final Object object = q.getObject(t, offset);
                                                                        if (object == null) {
                                                                            x3 = t2.c;
                                                                            break Label_0573;
                                                                        }
                                                                        x3 = s9.g(object, t2.c);
                                                                        break Label_0573;
                                                                    }
                                                                    case 8: {
                                                                        if (n9 == 2) {
                                                                            if ((n11 & 0x20000000) == 0x0) {
                                                                                n = u7.g(array, i, t2);
                                                                            }
                                                                            else {
                                                                                n = u7.h(array, i, t2);
                                                                            }
                                                                            x3 = t2.c;
                                                                            break Label_0573;
                                                                        }
                                                                        break;
                                                                    }
                                                                    case 7: {
                                                                        if (n9 == 0) {
                                                                            i = u7.m(array, i, t2);
                                                                            if (t2.b == 0L) {
                                                                                b = false;
                                                                            }
                                                                            fc.r(t, offset, b);
                                                                            break Label_0659;
                                                                        }
                                                                        break;
                                                                    }
                                                                    case 6:
                                                                    case 13: {
                                                                        if (n9 == 5) {
                                                                            q.putInt(t, offset, u7.b(array, i));
                                                                            i += 4;
                                                                            break Label_0659;
                                                                        }
                                                                        break;
                                                                    }
                                                                    case 5:
                                                                    case 14: {
                                                                        if (n9 == 1) {
                                                                            q.putLong(t, offset, u7.n(array, i));
                                                                            n = i + 8;
                                                                            break Label_0864;
                                                                        }
                                                                        break;
                                                                    }
                                                                    case 4:
                                                                    case 11: {
                                                                        if (n9 == 0) {
                                                                            break Label_0721;
                                                                        }
                                                                        break;
                                                                    }
                                                                    case 2:
                                                                    case 3: {
                                                                        if (n9 == 0) {
                                                                            n = u7.m(array, i, t2);
                                                                            x = t2.b;
                                                                            break Label_0774;
                                                                        }
                                                                        break;
                                                                    }
                                                                    case 1: {
                                                                        if (n9 == 5) {
                                                                            fc.u(t, offset, Float.intBitsToFloat(u7.b(array, i)));
                                                                            n = i + 4;
                                                                            break Label_0864;
                                                                        }
                                                                        break;
                                                                    }
                                                                    case 0: {
                                                                        if (n9 == 1) {
                                                                            fc.t(t, offset, Double.longBitsToDouble(u7.n(array, i)));
                                                                            n = i + 8;
                                                                            break Label_0864;
                                                                        }
                                                                        break;
                                                                    }
                                                                }
                                                                break Label_0880;
                                                            }
                                                            q.putObject(t, offset, x3);
                                                            i = n;
                                                        }
                                                        final int n16 = n15 | n13;
                                                        n = n8;
                                                        n3 = n2;
                                                        n5 = n10;
                                                        n4 = n;
                                                        n = n16;
                                                        continue;
                                                    }
                                                    n = u7.j(array, i, t2);
                                                    x2 = t2.a;
                                                }
                                                q.putInt(t, offset, x2);
                                                break Label_0864;
                                            }
                                            q.putLong(t, offset, x);
                                            final int n17 = n15 | n13;
                                            i = n;
                                            n5 = n10;
                                            n = n17;
                                            break Label_1020;
                                        }
                                        final int n18 = n15 | n13;
                                        i = n;
                                        n = n18;
                                        break Label_1016;
                                    }
                                    n = n15;
                                    break Label_1197;
                                }
                                final int n19 = n8;
                                final int n20 = n10;
                                final Unsafe unsafe = q;
                                Label_1152: {
                                    if (j == 27) {
                                        if (n9 == 2) {
                                            r9<?> s0;
                                            final r9 r9 = s0 = (r9<?>)unsafe.getObject(t, offset);
                                            if (!r9.a()) {
                                                final int size = r9.size();
                                                int n21;
                                                if (size == 0) {
                                                    n21 = 10;
                                                }
                                                else {
                                                    n21 = size + size;
                                                }
                                                s0 = r9.s0(n21);
                                                unsafe.putObject(t, offset, s0);
                                            }
                                            i = u7.e(this.n(n20), a, array, i, n2, s0, t2);
                                            q = unsafe;
                                            break Label_1016;
                                        }
                                    }
                                    else {
                                        int n22 = 0;
                                        Label_1096: {
                                            if (j <= 49) {
                                                final int p5 = this.P(t, array, i, n2, a, n19, n9, n20, n11, j, offset, t2);
                                                if ((n22 = p5) == i) {
                                                    break Label_1096;
                                                }
                                                i = p5;
                                            }
                                            else {
                                                final int n23 = i;
                                                if (j == 50) {
                                                    if (n9 != 2) {
                                                        break Label_1152;
                                                    }
                                                    i = this.M(t, array, n23, n2, n20, offset, t2);
                                                    if ((n22 = i) == n23) {
                                                        break Label_1096;
                                                    }
                                                }
                                                else {
                                                    i = this.N(t, array, n23, n2, a, n19, n9, n11, j, offset, n20, t2);
                                                    if ((n22 = i) == n23) {
                                                        break Label_1096;
                                                    }
                                                }
                                            }
                                            n5 = n10;
                                            n4 = n19;
                                            break Label_1223;
                                        }
                                        i = n22;
                                    }
                                }
                                break Label_1197;
                            }
                            n5 = n10;
                        }
                        n4 = n8;
                        n3 = n2;
                        continue;
                    }
                    n10 = 0;
                }
                i = u7.i(a, array, i, n2, E(t), t2);
                n5 = n10;
                n4 = n8;
            }
            n3 = n2;
        }
        if (n6 != 1048575) {
            q.putInt(t, n6, n);
        }
        if (i == n2) {
            return i;
        }
        throw u9.e();
    }
    
    private final int P(final T t, final byte[] array, int i, int n, final int j, int n2, int n3, int n4, long n5, int n6, final long n7, final t7 t2) throws IOException {
        int n8 = i;
        final Unsafe q = va.q;
        r9<Integer> s0;
        final r9 r9 = s0 = (r9<Integer>)q.getObject(t, n7);
        if (!r9.a()) {
            final int size = r9.size();
            int n9;
            if (size == 0) {
                n9 = 10;
            }
            else {
                n9 = size + size;
            }
            s0 = r9.s0(n9);
            q.putObject(t, n7, s0);
        }
        switch (n6) {
            default: {
                n6 = n8;
                if (n3 == 3) {
                    final db n10 = this.n(n4);
                    n2 = ((j & 0xFFFFFFF8) | 0x4);
                    i = u7.c(n10, array, i, n, n2, t2);
                    while (true) {
                        s0.add((Integer)t2.c);
                        if (i >= n) {
                            break;
                        }
                        n3 = u7.j(array, i, t2);
                        if (j != t2.a) {
                            break;
                        }
                        i = u7.c(n10, array, n3, n, n2, t2);
                    }
                    return i;
                }
                return n6;
            }
            case 34:
            case 48: {
                if (n3 == 2) {
                    final ga ga = (ga)s0;
                    i = u7.j(array, n8, t2);
                    n = t2.a + i;
                    while (i < n) {
                        i = u7.m(array, i, t2);
                        ga.h(m8.b(t2.b));
                    }
                    if (i == n) {
                        break;
                    }
                    throw u9.f();
                }
                else {
                    n6 = n8;
                    if (n3 == 0) {
                        final ga ga2 = (ga)s0;
                        do {
                            i = u7.m(array, n8, t2);
                            ga2.h(m8.b(t2.b));
                            if (i >= n) {
                                break;
                            }
                            n8 = u7.j(array, i, t2);
                        } while (j == t2.a);
                        return i;
                    }
                    return n6;
                }
                break;
            }
            case 33:
            case 47: {
                if (n3 == 2) {
                    final l9 l9 = (l9)s0;
                    i = u7.j(array, n8, t2);
                    n = t2.a + i;
                    while (i < n) {
                        i = u7.j(array, i, t2);
                        l9.i(m8.a(t2.a));
                    }
                    if (i == n) {
                        break;
                    }
                    throw u9.f();
                }
                else {
                    n6 = n8;
                    if (n3 == 0) {
                        final l9 l10 = (l9)s0;
                        do {
                            i = u7.j(array, n8, t2);
                            l10.i(m8.a(t2.a));
                            if (i >= n) {
                                break;
                            }
                            n8 = u7.j(array, i, t2);
                        } while (j == t2.a);
                        return i;
                    }
                    return n6;
                }
                break;
            }
            case 30:
            case 44: {
                if (n3 == 2) {
                    i = u7.f(array, n8, s0, t2);
                }
                else {
                    n6 = n8;
                    if (n3 != 0) {
                        return n6;
                    }
                    i = u7.l(j, array, i, n, s0, t2);
                }
                final j9 j2 = (j9)t;
                wb zzc;
                if ((zzc = j2.zzc) == wb.c()) {
                    zzc = null;
                }
                final wb c = fb.c(n2, s0, this.m(n4), zzc, this.l);
                if (c == null) {
                    break;
                }
                j2.zzc = c;
                return i;
            }
            case 28: {
                n6 = n8;
                if (n3 != 2) {
                    return n6;
                }
                n3 = u7.j(array, n8, t2);
                n4 = t2.a;
                if (n4 < 0) {
                    throw u9.d();
                }
                if (n4 <= array.length - n3) {
                    n2 = n3;
                    i = n4;
                    l9 l11 = (l9)s0;
                Label_0712_Outer:
                    while (true) {
                        if (n4 != 0) {
                            break Label_0726;
                        }
                        i = n3;
                        while (true) {
                            s0.add((Integer)h8.H);
                            Label_0748: {
                                break Label_0748;
                                l11.add((Integer)h8.q(array, n2, i));
                                i += n2;
                                s0 = l11;
                            }
                            if (i < n) {
                                n2 = u7.j(array, i, t2);
                                if (j == t2.a) {
                                    n3 = u7.j(array, n2, t2);
                                    n4 = t2.a;
                                    if (n4 < 0) {
                                        throw u9.d();
                                    }
                                    if (n4 > array.length - n3) {
                                        throw u9.f();
                                    }
                                    n2 = n3;
                                    i = n4;
                                    l11 = (l9)s0;
                                    if (n4 == 0) {
                                        i = n3;
                                        continue;
                                    }
                                    continue Label_0712_Outer;
                                }
                            }
                            break;
                        }
                        break;
                    }
                    return i;
                }
                throw u9.f();
            }
            case 27: {
                if (n3 != 2) {
                    n6 = n8;
                    return n6;
                }
                return u7.e(this.n(n4), j, array, i, n, s0, t2);
            }
            case 26: {
                n6 = n8;
                if (n3 != 2) {
                    return n6;
                }
                i = u7.j(array, n8, t2);
                if ((n5 & 0x20000000L) == 0x0L) {
                    n2 = t2.a;
                    if (n2 < 0) {
                        throw u9.d();
                    }
                Label_0927_Outer:
                    while (true) {
                        if (n2 != 0) {
                            final String s2 = new String(array, i, n2, s9.a);
                            break Label_0956;
                        }
                        while (true) {
                            s0.add((Integer)"");
                            Label_0970: {
                                break Label_0970;
                                final String s2;
                                s0.add((Integer)s2);
                                i += n2;
                            }
                            n6 = i;
                            if (i >= n) {
                                return n6;
                            }
                            n2 = u7.j(array, i, t2);
                            n6 = i;
                            if (j != t2.a) {
                                return n6;
                            }
                            i = u7.j(array, n2, t2);
                            n2 = t2.a;
                            if (n2 < 0) {
                                throw u9.d();
                            }
                            if (n2 == 0) {
                                continue;
                            }
                            break;
                        }
                        final String s2 = new String(array, i, n2, s9.a);
                        continue Label_0927_Outer;
                    }
                }
                else {
                    n3 = t2.a;
                    if (n3 < 0) {
                        throw u9.d();
                    }
                Label_1073_Outer:
                    while (true) {
                        if (n3 != 0) {
                            n2 = i + n3;
                            if (kc.f(array, i, n2)) {
                                final String s3 = new String(array, i, n3, s9.a);
                                i = n2;
                                break Label_1121;
                            }
                            throw u9.c();
                        }
                        while (true) {
                            s0.add((Integer)"");
                            Label_1130: {
                                break Label_1130;
                                final String s3;
                                s0.add((Integer)s3);
                            }
                            n6 = i;
                            if (i >= n) {
                                return n6;
                            }
                            n2 = u7.j(array, i, t2);
                            n6 = i;
                            if (j != t2.a) {
                                return n6;
                            }
                            i = u7.j(array, n2, t2);
                            n3 = t2.a;
                            if (n3 < 0) {
                                throw u9.d();
                            }
                            if (n3 == 0) {
                                continue;
                            }
                            break;
                        }
                        n2 = i + n3;
                        if (kc.f(array, i, n2)) {
                            final String s3 = new String(array, i, n3, s9.a);
                            i = n2;
                            continue Label_1073_Outer;
                        }
                        break;
                    }
                    throw u9.c();
                }
                break;
            }
            case 25:
            case 42: {
                if (n3 == 2) {
                    final v7 v7 = (v7)s0;
                    i = u7.j(array, n8, t2);
                    n = t2.a + i;
                    while (i < n) {
                        i = u7.m(array, i, t2);
                        v7.f(t2.b != 0L);
                    }
                    if (i == n) {
                        break;
                    }
                    throw u9.f();
                }
                else {
                    n6 = n8;
                    if (n3 == 0) {
                        final v7 v8 = (v7)s0;
                        n2 = (i = u7.m(array, n8, t2));
                    Label_1369_Outer:
                        while (true) {
                            if (t2.b == 0L) {
                                break Label_1375;
                            }
                            i = n2;
                            while (true) {
                                boolean b = true;
                                Label_1378: {
                                    break Label_1378;
                                    b = false;
                                }
                                v8.f(b);
                                if (i < n) {
                                    n2 = u7.j(array, i, t2);
                                    if (j == t2.a) {
                                        n2 = (i = u7.m(array, n2, t2));
                                        if (t2.b != 0L) {
                                            i = n2;
                                            continue;
                                        }
                                        continue Label_1369_Outer;
                                    }
                                }
                                break;
                            }
                            break;
                        }
                        return i;
                    }
                    return n6;
                }
                break;
            }
            case 24:
            case 31:
            case 41:
            case 45: {
                if (n3 == 2) {
                    final l9 l12 = (l9)s0;
                    for (i = u7.j(array, n8, t2), n = t2.a + i; i < n; i += 4) {
                        l12.i(u7.b(array, i));
                    }
                    if (i == n) {
                        break;
                    }
                    throw u9.f();
                }
                else {
                    n6 = n8;
                    if (n3 == 5) {
                        final l9 l13 = (l9)s0;
                        i = u7.b(array, i);
                        while (true) {
                            l13.i(i);
                            i = n8 + 4;
                            if (i >= n) {
                                break;
                            }
                            n8 = u7.j(array, i, t2);
                            if (j != t2.a) {
                                break;
                            }
                            i = u7.b(array, n8);
                        }
                        return i;
                    }
                    return n6;
                }
                break;
            }
            case 23:
            case 32:
            case 40:
            case 46: {
                if (n3 == 2) {
                    final ga ga3 = (ga)s0;
                    for (i = u7.j(array, n8, t2), n = t2.a + i; i < n; i += 8) {
                        ga3.h(u7.n(array, i));
                    }
                    if (i == n) {
                        break;
                    }
                    throw u9.f();
                }
                else {
                    n6 = n8;
                    if (n3 == 1) {
                        final ga ga4 = (ga)s0;
                        n5 = u7.n(array, i);
                        while (true) {
                            ga4.h(n5);
                            i = n8 + 8;
                            if (i >= n) {
                                break;
                            }
                            n8 = u7.j(array, i, t2);
                            if (j != t2.a) {
                                break;
                            }
                            n5 = u7.n(array, n8);
                        }
                        return i;
                    }
                    return n6;
                }
                break;
            }
            case 22:
            case 29:
            case 39:
            case 43: {
                if (n3 == 2) {
                    i = u7.f(array, n8, s0, t2);
                    break;
                }
                if (n3 != 0) {
                    n6 = n8;
                    return n6;
                }
                return u7.l(j, array, i, n, s0, t2);
            }
            case 20:
            case 21:
            case 37:
            case 38: {
                if (n3 == 2) {
                    final ga ga5 = (ga)s0;
                    i = u7.j(array, n8, t2);
                    n = t2.a + i;
                    while (i < n) {
                        i = u7.m(array, i, t2);
                        ga5.h(t2.b);
                    }
                    if (i == n) {
                        break;
                    }
                    throw u9.f();
                }
                else {
                    n6 = n8;
                    if (n3 == 0) {
                        final ga ga6 = (ga)s0;
                        do {
                            i = u7.m(array, n8, t2);
                            ga6.h(t2.b);
                            if (i >= n) {
                                break;
                            }
                            n8 = u7.j(array, i, t2);
                        } while (j == t2.a);
                        return i;
                    }
                    return n6;
                }
                break;
            }
            case 19:
            case 36: {
                if (n3 == 2) {
                    final c9 c2 = (c9)s0;
                    for (i = u7.j(array, n8, t2), n = t2.a + i; i < n; i += 4) {
                        c2.f(Float.intBitsToFloat(u7.b(array, i)));
                    }
                    if (i == n) {
                        break;
                    }
                    throw u9.f();
                }
                else {
                    n6 = n8;
                    if (n3 == 5) {
                        final c9 c3 = (c9)s0;
                        i = u7.b(array, i);
                        while (true) {
                            c3.f(Float.intBitsToFloat(i));
                            i = n8 + 4;
                            if (i >= n) {
                                break;
                            }
                            n8 = u7.j(array, i, t2);
                            if (j != t2.a) {
                                break;
                            }
                            i = u7.b(array, n8);
                        }
                        return i;
                    }
                    return n6;
                }
                break;
            }
            case 18:
            case 35: {
                if (n3 == 2) {
                    final s8 s4 = (s8)s0;
                    for (i = u7.j(array, n8, t2), n = t2.a + i; i < n; i += 8) {
                        s4.f(Double.longBitsToDouble(u7.n(array, i)));
                    }
                    if (i == n) {
                        break;
                    }
                    throw u9.f();
                }
                else {
                    n6 = n8;
                    if (n3 == 1) {
                        final s8 s5 = (s8)s0;
                        n5 = u7.n(array, i);
                        while (true) {
                            s5.f(Double.longBitsToDouble(n5));
                            i = n8 + 8;
                            if (i >= n) {
                                break;
                            }
                            n8 = u7.j(array, i, t2);
                            if (j != t2.a) {
                                break;
                            }
                            n5 = u7.n(array, n8);
                        }
                        return i;
                    }
                    return n6;
                }
                break;
            }
        }
        return i;
        i = n6;
        return i;
    }
    
    private final int Q(final int n) {
        if (n >= this.c && n <= this.d) {
            return this.T(n, 0);
        }
        return -1;
    }
    
    private final int R(final int n, final int n2) {
        if (n >= this.c && n <= this.d) {
            return this.T(n, n2);
        }
        return -1;
    }
    
    private final int S(final int n) {
        return this.a[n + 2];
    }
    
    private final int T(final int n, int i) {
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
    
    private static int j(final int n) {
        return n >>> 20 & 0xFF;
    }
    
    private final int k(final int n) {
        return this.a[n + 1];
    }
    
    private static <T> long l(final T t, final long n) {
        return (long)fc.k(t, n);
    }
    
    private final o9 m(int n) {
        n /= 3;
        return (o9)this.b[n + n + 1];
    }
    
    private final db n(int n) {
        n /= 3;
        n += n;
        final db db = (db)this.b[n];
        if (db != null) {
            return db;
        }
        return (db)(this.b[n] = ab.a().b((Class<Object>)this.b[n + 1]));
    }
    
    private final Object o(int n) {
        n /= 3;
        return this.b[n + n];
    }
    
    private static Field p(final Class<?> clazz, final String str) {
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
    
    private final void q(final T t, final T t2, final int n) {
        final long n2 = this.k(n) & 0xFFFFF;
        if (!this.v(t2, n)) {
            return;
        }
        final Object k = fc.k(t, n2);
        Object o = fc.k(t2, n2);
        if (k != null && o != null) {
            o = s9.g(k, o);
        }
        else if (o == null) {
            return;
        }
        fc.x(t, n2, o);
        this.s(t, n);
    }
    
    private final void r(final T t, final T t2, final int n) {
        final int k = this.k(n);
        final int n2 = this.a[n];
        final long n3 = k & 0xFFFFF;
        if (!this.y(t2, n2, n)) {
            return;
        }
        Object i;
        if (this.y(t, n2, n)) {
            i = fc.k(t, n3);
        }
        else {
            i = null;
        }
        Object o = fc.k(t2, n3);
        if (i != null && o != null) {
            o = s9.g(i, o);
        }
        else if (o == null) {
            return;
        }
        fc.x(t, n3, o);
        this.t(t, n2, n);
    }
    
    private final void s(final T t, int s) {
        s = this.S(s);
        final long n = 0xFFFFF & s;
        if (n == 1048575L) {
            return;
        }
        fc.v(t, n, 1 << (s >>> 20) | fc.h(t, n));
    }
    
    private final void t(final T t, final int n, final int n2) {
        fc.v(t, this.S(n2) & 0xFFFFF, n);
    }
    
    private final boolean u(final T t, final T t2, final int n) {
        return this.v(t, n) == this.v(t2, n);
    }
    
    private final boolean v(final T t, int k) {
        final int s = this.S(k);
        final long n = s & 0xFFFFF;
        if (n != 1048575L) {
            return (fc.h(t, n) & 1 << (s >>> 20)) != 0x0;
        }
        k = this.k(k);
        final long n2 = k & 0xFFFFF;
        switch (j(k)) {
            default: {
                throw new IllegalArgumentException();
            }
            case 17: {
                return fc.k(t, n2) != null;
            }
            case 16: {
                return fc.i(t, n2) != 0L;
            }
            case 15: {
                return fc.h(t, n2) != 0;
            }
            case 14: {
                return fc.i(t, n2) != 0L;
            }
            case 13: {
                return fc.h(t, n2) != 0;
            }
            case 12: {
                return fc.h(t, n2) != 0;
            }
            case 11: {
                return fc.h(t, n2) != 0;
            }
            case 10: {
                return !h8.H.equals(fc.k(t, n2));
            }
            case 9: {
                return fc.k(t, n2) != null;
            }
            case 8: {
                final Object i = fc.k(t, n2);
                if (i instanceof String) {
                    return !((String)i).isEmpty();
                }
                if (i instanceof h8) {
                    return !h8.H.equals(i);
                }
                throw new IllegalArgumentException();
            }
            case 7: {
                return fc.B(t, n2);
            }
            case 6: {
                return fc.h(t, n2) != 0;
            }
            case 5: {
                return fc.i(t, n2) != 0L;
            }
            case 4: {
                return fc.h(t, n2) != 0;
            }
            case 3: {
                return fc.i(t, n2) != 0L;
            }
            case 2: {
                return fc.i(t, n2) != 0L;
            }
            case 1: {
                return fc.g(t, n2) != 0.0f;
            }
            case 0: {
                return fc.f(t, n2) != 0.0;
            }
        }
    }
    
    private final boolean w(final T t, final int n, final int n2, final int n3, final int n4) {
        if (n2 == 1048575) {
            return this.v(t, n);
        }
        return (n3 & n4) != 0x0;
    }
    
    private static boolean x(final Object o, final int n, final db db) {
        return db.b(fc.k(o, n & 0xFFFFF));
    }
    
    private final boolean y(final T t, final int n, final int n2) {
        return fc.h(t, this.S(n2) & 0xFFFFF) == n;
    }
    
    private static <T> boolean z(final T t, final long n) {
        return (boolean)fc.k(t, n);
    }
    
    final int D(final T t, final byte[] array, int i, final int n, int n2, final t7 t2) throws IOException {
        T t3 = t;
        int n3 = n;
        int n4 = n2;
        t7 t4 = t2;
        final Unsafe q = va.q;
        int n5 = 0;
        int n6 = -1;
        int n7 = 0;
        int n8 = 0;
        int n9 = 1048575;
        while (true) {
            while (i < n3) {
                int k = i + 1;
                i = array[i];
                if (i < 0) {
                    k = u7.k(i, array, k, t4);
                    i = t4.a;
                }
                final int n10 = i >>> 3;
                final int n11 = i & 0x7;
                int n12;
                if (n10 > n6) {
                    n12 = this.R(n10, n7 / 3);
                }
                else {
                    n12 = this.Q(n10);
                }
                int n26 = 0;
                Label_1414: {
                    if (n12 != -1) {
                        final int n13 = this.a[n12 + 1];
                        final int j = j(n13);
                        final long n14 = n13 & 0xFFFFF;
                        Label_1196: {
                            if (j <= 17) {
                                final int n15 = this.a[n12 + 2];
                                final int n16 = 1 << (n15 >>> 20);
                                final int n17 = n15 & 0xFFFFF;
                                int n18;
                                if (n17 != n9) {
                                    if (n9 != 1048575) {
                                        q.putInt(t3, n9, n8);
                                    }
                                    final int int1 = q.getInt(t3, n17);
                                    n9 = n17;
                                    n18 = int1;
                                }
                                else {
                                    n18 = n8;
                                }
                                Label_1036: {
                                    int n19 = 0;
                                    int n20 = 0;
                                    Label_0975: {
                                        Label_0968: {
                                            long x2 = 0L;
                                            Label_0885: {
                                                int x3 = 0;
                                                Label_0848: {
                                                    Label_0822: {
                                                        Object x4 = null;
                                                        Label_0590: {
                                                            switch (j) {
                                                                default: {
                                                                    if (n11 == 3) {
                                                                        n19 = u7.c(this.n(n12), array, k, n, n10 << 3 | 0x4, t2);
                                                                        Object x;
                                                                        if ((n18 & n16) == 0x0) {
                                                                            x = t4.c;
                                                                        }
                                                                        else {
                                                                            x = s9.g(q.getObject(t3, n14), t4.c);
                                                                        }
                                                                        q.putObject(t3, n14, x);
                                                                        n20 = (n18 | n16);
                                                                        n3 = n;
                                                                        break Label_0975;
                                                                    }
                                                                    break Label_1036;
                                                                }
                                                                case 16: {
                                                                    if (n11 == 0) {
                                                                        n19 = u7.m(array, k, t4);
                                                                        x2 = m8.b(t4.b);
                                                                        break Label_0885;
                                                                    }
                                                                    break Label_0822;
                                                                }
                                                                case 15: {
                                                                    if (n11 == 0) {
                                                                        n19 = u7.j(array, k, t4);
                                                                        x3 = m8.a(t4.a);
                                                                        break Label_0848;
                                                                    }
                                                                    break Label_0822;
                                                                }
                                                                case 12: {
                                                                    final int n21 = n12;
                                                                    final int n22 = i;
                                                                    if (n11 != 0) {
                                                                        break Label_0822;
                                                                    }
                                                                    final int l = u7.j(array, k, t4);
                                                                    final int a = t4.a;
                                                                    final o9 m = this.m(n21);
                                                                    n19 = l;
                                                                    x3 = a;
                                                                    if (m == null) {
                                                                        break Label_0848;
                                                                    }
                                                                    if (m.d(a)) {
                                                                        n19 = l;
                                                                        x3 = a;
                                                                        break Label_0848;
                                                                    }
                                                                    E(t).h(n22, (long)a);
                                                                    n8 = n18;
                                                                    n5 = n22;
                                                                    i = l;
                                                                    n7 = n21;
                                                                    break Label_1196;
                                                                }
                                                                case 10: {
                                                                    if (n11 == 2) {
                                                                        n19 = u7.a(array, k, t4);
                                                                        break;
                                                                    }
                                                                    break Label_0822;
                                                                }
                                                                case 9: {
                                                                    if (n11 != 2) {
                                                                        break Label_0822;
                                                                    }
                                                                    n19 = u7.d(this.n(n12), array, k, n3, t4);
                                                                    if ((n18 & n16) == 0x0) {
                                                                        x4 = t4.c;
                                                                        break Label_0590;
                                                                    }
                                                                    x4 = s9.g(q.getObject(t3, n14), t4.c);
                                                                    break Label_0590;
                                                                }
                                                                case 8: {
                                                                    if (n11 != 2) {
                                                                        break Label_0822;
                                                                    }
                                                                    if ((n13 & 0x20000000) == 0x0) {
                                                                        n19 = u7.g(array, k, t4);
                                                                        break;
                                                                    }
                                                                    n19 = u7.h(array, k, t4);
                                                                    break;
                                                                }
                                                                case 7: {
                                                                    if (n11 == 0) {
                                                                        n19 = u7.m(array, k, t4);
                                                                        fc.r(t3, n14, t4.b != 0L);
                                                                        break Label_0968;
                                                                    }
                                                                    break Label_0822;
                                                                }
                                                                case 6:
                                                                case 13: {
                                                                    if (n11 == 5) {
                                                                        q.putInt(t3, n14, u7.b(array, k));
                                                                        n19 = k + 4;
                                                                        break Label_0968;
                                                                    }
                                                                    break Label_0822;
                                                                }
                                                                case 5:
                                                                case 14: {
                                                                    if (n11 == 1) {
                                                                        q.putLong(t, n14, u7.n(array, k));
                                                                        n19 = k + 8;
                                                                        break Label_0968;
                                                                    }
                                                                    break Label_0822;
                                                                }
                                                                case 4:
                                                                case 11: {
                                                                    if (n11 == 0) {
                                                                        n19 = u7.j(array, k, t4);
                                                                        x3 = t4.a;
                                                                        break Label_0848;
                                                                    }
                                                                    break Label_1036;
                                                                }
                                                                case 2:
                                                                case 3: {
                                                                    if (n11 == 0) {
                                                                        n19 = u7.m(array, k, t4);
                                                                        x2 = t4.b;
                                                                        break Label_0885;
                                                                    }
                                                                    break Label_1036;
                                                                }
                                                                case 1: {
                                                                    n19 = k;
                                                                    if (n11 == 5) {
                                                                        fc.u(t3, n14, Float.intBitsToFloat(u7.b(array, n19)));
                                                                        n19 += 4;
                                                                        break Label_0968;
                                                                    }
                                                                    break Label_1036;
                                                                }
                                                                case 0: {
                                                                    n19 = k;
                                                                    if (n11 == 1) {
                                                                        fc.t(t3, n14, Double.longBitsToDouble(u7.n(array, n19)));
                                                                        n19 += 8;
                                                                        break Label_0968;
                                                                    }
                                                                    break Label_1036;
                                                                }
                                                            }
                                                            x4 = t4.c;
                                                        }
                                                        q.putObject(t3, n14, x4);
                                                        break Label_0968;
                                                    }
                                                    break Label_1036;
                                                }
                                                q.putInt(t3, n14, x3);
                                                break Label_0968;
                                            }
                                            q.putLong(t, n14, x2);
                                            n20 = (n18 | n16);
                                            break Label_0975;
                                        }
                                        n20 = (n18 | n16);
                                    }
                                    n7 = n12;
                                    n5 = i;
                                    i = n19;
                                    n8 = n20;
                                    break Label_1196;
                                }
                                final int n23 = n2;
                                final int n24 = n12;
                                n5 = i;
                                final int n25 = n18;
                                i = n23;
                                n26 = n24;
                                n8 = n25;
                                break Label_1414;
                            }
                            Label_1352: {
                                if (j == 27) {
                                    if (n11 == 2) {
                                        r9<?> s0;
                                        final r9 r9 = s0 = (r9<?>)q.getObject(t3, n14);
                                        if (!r9.a()) {
                                            final int size = r9.size();
                                            int n27;
                                            if (size == 0) {
                                                n27 = 10;
                                            }
                                            else {
                                                n27 = size + size;
                                            }
                                            s0 = r9.s0(n27);
                                            q.putObject(t3, n14, s0);
                                        }
                                        final int e = u7.e(this.n(n12), i, array, k, n, s0, t2);
                                        n3 = n;
                                        n7 = n12;
                                        n5 = i;
                                        i = e;
                                        break Label_1196;
                                    }
                                }
                                else {
                                    int n28 = 0;
                                    Label_1292: {
                                        int n29;
                                        if (j <= 49) {
                                            final int p6 = this.P(t, array, k, n, i, n10, n11, n12, n13, j, n14, t2);
                                            if ((n28 = p6) == k) {
                                                break Label_1292;
                                            }
                                            n29 = p6;
                                        }
                                        else {
                                            final int n30 = k;
                                            final int n31 = n12;
                                            if (j == 50) {
                                                if (n11 != 2) {
                                                    break Label_1352;
                                                }
                                                n29 = this.M(t, array, n30, n, n31, n14, t2);
                                                if ((n28 = n29) == n30) {
                                                    break Label_1292;
                                                }
                                            }
                                            else {
                                                n29 = this.N(t, array, n30, n, i, n10, n11, n13, j, n14, n31, t2);
                                                if ((n28 = n29) == n30) {
                                                    break Label_1292;
                                                }
                                            }
                                        }
                                        t3 = t;
                                        n6 = n10;
                                        n3 = n;
                                        n4 = n2;
                                        t4 = t2;
                                        n7 = n12;
                                        n5 = i;
                                        i = n29;
                                        continue;
                                    }
                                    k = n28;
                                }
                            }
                            n26 = n12;
                            final int n32 = n2;
                            final int n33 = i;
                            i = n32;
                            n5 = n33;
                            break Label_1414;
                        }
                        n6 = n10;
                        n4 = n2;
                        continue;
                    }
                    n5 = i;
                    i = n4;
                    n26 = 0;
                }
                n6 = n10;
                if (n5 == i && i != 0) {
                    final T o = t;
                    n2 = k;
                    final int n34 = i;
                    final va va = this;
                    if (n9 != 1048575) {
                        q.putInt(o, n9, n8);
                    }
                    int n35;
                    int n36;
                    Object k2;
                    ma ma;
                    ka ka;
                    for (i = va.i; i < va.j; ++i) {
                        n35 = va.h[i];
                        n36 = va.a[n35];
                        k2 = fc.k(o, va.k(n35) & 0xFFFFF);
                        if (k2 != null) {
                            if (va.m(n35) != null) {
                                ma = (ma)k2;
                                ka = (ka)va.o(n35);
                                throw null;
                            }
                        }
                    }
                    if (n34 == 0) {
                        if (n2 != n) {
                            throw u9.e();
                        }
                    }
                    else if (n2 > n || n5 != n34) {
                        throw u9.e();
                    }
                    return n2;
                }
                int n37;
                if (this.f && t2.d != v8.a()) {
                    if (t2.d.c(this.e, n6) != null) {
                        final g9 g9 = (g9)t;
                        throw null;
                    }
                    n37 = u7.i(n5, array, k, n, E(t), t2);
                }
                else {
                    n37 = u7.i(n5, array, k, n, E(t), t2);
                }
                n3 = n;
                t4 = t2;
                t3 = t;
                n7 = n26;
                n4 = i;
                i = n37;
            }
            final int n34 = n4;
            final T o = t3;
            final va va = this;
            n2 = i;
            continue;
        }
    }
    
    @Override
    public final int a(final T t) {
        int n;
        if (this.g) {
            n = this.K(t);
        }
        else {
            n = this.J(t);
        }
        return n;
    }
    
    @Override
    public final boolean b(final T o) {
        int n = 1048575;
        int int1 = 0;
        for (int i = 0; i < this.i; ++i) {
            final int n2 = this.h[i];
            final int n3 = this.a[n2];
            final int k = this.k(n2);
            final int n4 = this.a[n2 + 2];
            final int n5 = n4 & 0xFFFFF;
            final int n6 = 1 << (n4 >>> 20);
            if (n5 != n) {
                if (n5 != 1048575) {
                    int1 = va.q.getInt(o, n5);
                }
                n = n5;
            }
            if ((0x10000000 & k) != 0x0 && !this.w(o, n2, n, int1, n6)) {
                return false;
            }
            final int j = j(k);
            if (j != 9 && j != 17) {
                if (j != 27) {
                    if (j != 60 && j != 68) {
                        if (j != 49) {
                            if (j != 50) {
                                continue;
                            }
                            if (((ma)fc.k(o, k & 0xFFFFF)).isEmpty()) {
                                continue;
                            }
                            final ka ka = (ka)this.o(n2);
                            throw null;
                        }
                    }
                    else {
                        if (this.y(o, n3, n2) && !x(o, k, this.n(n2))) {
                            return false;
                        }
                        continue;
                    }
                }
                final List list = (List)fc.k(o, k & 0xFFFFF);
                if (!list.isEmpty()) {
                    final db n7 = this.n(n2);
                    for (int l = 0; l < list.size(); ++l) {
                        if (!n7.b(list.get(l))) {
                            return false;
                        }
                    }
                }
            }
            else if (this.w(o, n2, n, int1, n6) && !x(o, k, this.n(n2))) {
                return false;
            }
        }
        if (!this.f) {
            return true;
        }
        this.m.a(o);
        throw null;
    }
    
    @Override
    public final int c(final T t) {
        final int length = this.a.length;
        int i = 0;
        int n = 0;
        while (i < length) {
            final int k = this.k(i);
            final int n2 = this.a[i];
            final long n3 = 0xFFFFF & k;
            final int j = j(k);
            int hashCode = 37;
            int n4 = 0;
            Label_0966: {
                int n5 = 0;
                int n6 = 0;
                Label_0959: {
                    long n7 = 0L;
                    Label_0952: {
                        double value2 = 0.0;
                        Label_0945: {
                            float value = 0.0f;
                            Label_0920: {
                                boolean b = false;
                                Label_0859: {
                                    Label_0807: {
                                        Object o = null;
                                        Label_0800: {
                                            Label_0666: {
                                                Label_0820: {
                                                    switch (j) {
                                                        default: {
                                                            n4 = n;
                                                            break Label_0966;
                                                        }
                                                        case 68: {
                                                            n4 = n;
                                                            if (this.y(t, n2, i)) {
                                                                break Label_0820;
                                                            }
                                                            break Label_0966;
                                                        }
                                                        case 67: {
                                                            n4 = n;
                                                            if (this.y(t, n2, i)) {
                                                                break Label_0666;
                                                            }
                                                            break Label_0966;
                                                        }
                                                        case 66: {
                                                            n4 = n;
                                                            if (this.y(t, n2, i)) {
                                                                break;
                                                            }
                                                            break Label_0966;
                                                        }
                                                        case 65: {
                                                            n4 = n;
                                                            if (this.y(t, n2, i)) {
                                                                break Label_0666;
                                                            }
                                                            break Label_0966;
                                                        }
                                                        case 64: {
                                                            n4 = n;
                                                            if (this.y(t, n2, i)) {
                                                                break;
                                                            }
                                                            break Label_0966;
                                                        }
                                                        case 63: {
                                                            n4 = n;
                                                            if (this.y(t, n2, i)) {
                                                                break;
                                                            }
                                                            break Label_0966;
                                                        }
                                                        case 62: {
                                                            n4 = n;
                                                            if (this.y(t, n2, i)) {
                                                                break;
                                                            }
                                                            break Label_0966;
                                                        }
                                                        case 61: {
                                                            n4 = n;
                                                            if (this.y(t, n2, i)) {
                                                                break Label_0820;
                                                            }
                                                            break Label_0966;
                                                        }
                                                        case 60: {
                                                            n4 = n;
                                                            if (this.y(t, n2, i)) {
                                                                break Label_0820;
                                                            }
                                                            break Label_0966;
                                                        }
                                                        case 59: {
                                                            n4 = n;
                                                            if (this.y(t, n2, i)) {
                                                                break Label_0820;
                                                            }
                                                            break Label_0966;
                                                        }
                                                        case 58: {
                                                            n4 = n;
                                                            if (this.y(t, n2, i)) {
                                                                n5 = n * 53;
                                                                b = z(t, n3);
                                                                break Label_0859;
                                                            }
                                                            break Label_0966;
                                                        }
                                                        case 57: {
                                                            n4 = n;
                                                            if (this.y(t, n2, i)) {
                                                                break;
                                                            }
                                                            break Label_0966;
                                                        }
                                                        case 56: {
                                                            n4 = n;
                                                            if (this.y(t, n2, i)) {
                                                                break Label_0666;
                                                            }
                                                            break Label_0966;
                                                        }
                                                        case 55: {
                                                            n4 = n;
                                                            if (this.y(t, n2, i)) {
                                                                break;
                                                            }
                                                            break Label_0966;
                                                        }
                                                        case 54: {
                                                            n4 = n;
                                                            if (this.y(t, n2, i)) {
                                                                break Label_0666;
                                                            }
                                                            break Label_0966;
                                                        }
                                                        case 53: {
                                                            n4 = n;
                                                            if (this.y(t, n2, i)) {
                                                                break Label_0666;
                                                            }
                                                            break Label_0966;
                                                        }
                                                        case 52: {
                                                            n4 = n;
                                                            if (this.y(t, n2, i)) {
                                                                n5 = n * 53;
                                                                value = I(t, n3);
                                                                break Label_0920;
                                                            }
                                                            break Label_0966;
                                                        }
                                                        case 51: {
                                                            n4 = n;
                                                            if (this.y(t, n2, i)) {
                                                                n5 = n * 53;
                                                                value2 = H(t, n3);
                                                                break Label_0945;
                                                            }
                                                            break Label_0966;
                                                        }
                                                        case 17: {
                                                            o = fc.k(t, n3);
                                                            if (o != null) {
                                                                break Label_0800;
                                                            }
                                                            break Label_0807;
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
                                                            n6 = fc.k(t, n3).hashCode();
                                                            break Label_0959;
                                                        }
                                                        case 9: {
                                                            o = fc.k(t, n3);
                                                            if (o != null) {
                                                                break Label_0800;
                                                            }
                                                            break Label_0807;
                                                        }
                                                        case 8: {
                                                            n5 = n * 53;
                                                            n6 = ((String)fc.k(t, n3)).hashCode();
                                                            break Label_0959;
                                                        }
                                                        case 7: {
                                                            n5 = n * 53;
                                                            b = fc.B(t, n3);
                                                            break Label_0859;
                                                        }
                                                        case 4:
                                                        case 6:
                                                        case 11:
                                                        case 12:
                                                        case 13:
                                                        case 15: {
                                                            n5 = n * 53;
                                                            n6 = fc.h(t, n3);
                                                            break Label_0959;
                                                        }
                                                        case 2:
                                                        case 3:
                                                        case 5:
                                                        case 14:
                                                        case 16: {
                                                            n5 = n * 53;
                                                            n7 = fc.i(t, n3);
                                                            break Label_0952;
                                                        }
                                                        case 1: {
                                                            n5 = n * 53;
                                                            value = fc.g(t, n3);
                                                            break Label_0920;
                                                        }
                                                        case 0: {
                                                            n5 = n * 53;
                                                            value2 = fc.f(t, n3);
                                                            break Label_0945;
                                                        }
                                                    }
                                                }
                                                n5 = n * 53;
                                                n6 = L(t, n3);
                                                break Label_0959;
                                            }
                                            n5 = n * 53;
                                            n7 = l(t, n3);
                                            break Label_0952;
                                        }
                                        hashCode = o.hashCode();
                                    }
                                    n4 = n * 53 + hashCode;
                                    break Label_0966;
                                }
                                n6 = s9.a(b);
                                break Label_0959;
                            }
                            n6 = Float.floatToIntBits(value);
                            break Label_0959;
                        }
                        n7 = Double.doubleToLongBits(value2);
                    }
                    n6 = s9.c(n7);
                }
                n4 = n5 + n6;
            }
            i += 3;
            n = n4;
        }
        final int hashCode2 = this.l.c(t).hashCode();
        if (!this.f) {
            return n * 53 + hashCode2;
        }
        this.m.a(t);
        throw null;
    }
    
    @Override
    public final void d(final T t) {
        int i = this.i;
        int j;
        while (true) {
            j = this.j;
            if (i >= j) {
                break;
            }
            final long n = this.k(this.h[i]) & 0xFFFFF;
            final Object k = fc.k(t, n);
            if (k != null) {
                ((ma)k).c();
                fc.x(t, n, k);
            }
            ++i;
        }
        for (int length = this.h.length, l = j; l < length; ++l) {
            this.k.a(t, this.h[l]);
        }
        this.l.g(t);
        if (this.f) {
            this.m.b(t);
        }
    }
    
    @Override
    public final T e() {
        return (T)((j9)this.e).u(4, null, null);
    }
    
    @Override
    public final void f(final T t, final byte[] array, final int n, final int n2, final t7 t2) throws IOException {
        if (this.g) {
            this.O(t, array, n, n2, t2);
            return;
        }
        this.D(t, array, n, n2, 0, t2);
    }
    
    @Override
    public final void g(final T t, final T obj) {
        Objects.requireNonNull(obj);
        for (int i = 0; i < this.a.length; i += 3) {
            final int k = this.k(i);
            final long n = 0xFFFFF & k;
            final int n2 = this.a[i];
            Label_0696: {
                Label_0636: {
                    Label_0600: {
                        Label_0528: {
                            Label_0482: {
                                switch (j(k)) {
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
                                        if (this.y(obj, n2, i)) {
                                            break;
                                        }
                                        continue;
                                    }
                                    case 60:
                                    case 68: {
                                        this.r(t, obj, i);
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
                                        if (this.y(obj, n2, i)) {
                                            break;
                                        }
                                        continue;
                                    }
                                    case 50: {
                                        fb.i(this.o, t, obj, n);
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
                                        this.k.b(t, obj, n);
                                        continue;
                                    }
                                    case 16: {
                                        if (this.v(obj, i)) {
                                            break Label_0636;
                                        }
                                        continue;
                                    }
                                    case 15: {
                                        if (this.v(obj, i)) {
                                            break Label_0482;
                                        }
                                        continue;
                                    }
                                    case 14: {
                                        if (this.v(obj, i)) {
                                            break Label_0636;
                                        }
                                        continue;
                                    }
                                    case 13: {
                                        if (this.v(obj, i)) {
                                            break Label_0482;
                                        }
                                        continue;
                                    }
                                    case 12: {
                                        if (this.v(obj, i)) {
                                            break Label_0482;
                                        }
                                        continue;
                                    }
                                    case 11: {
                                        if (this.v(obj, i)) {
                                            break Label_0600;
                                        }
                                        continue;
                                    }
                                    case 10: {
                                        if (this.v(obj, i)) {
                                            break Label_0528;
                                        }
                                        continue;
                                    }
                                    case 9:
                                    case 17: {
                                        this.q(t, obj, i);
                                        continue;
                                    }
                                    case 8: {
                                        if (this.v(obj, i)) {
                                            break Label_0528;
                                        }
                                        continue;
                                    }
                                    case 7: {
                                        if (this.v(obj, i)) {
                                            fc.r(t, n, fc.B(obj, n));
                                            break Label_0696;
                                        }
                                        continue;
                                    }
                                    case 6: {
                                        if (this.v(obj, i)) {
                                            break Label_0600;
                                        }
                                        continue;
                                    }
                                    case 5: {
                                        if (this.v(obj, i)) {
                                            break Label_0636;
                                        }
                                        continue;
                                    }
                                    case 4: {
                                        if (this.v(obj, i)) {
                                            break Label_0600;
                                        }
                                        continue;
                                    }
                                    case 3: {
                                        if (this.v(obj, i)) {
                                            break Label_0636;
                                        }
                                        continue;
                                    }
                                    case 2: {
                                        if (this.v(obj, i)) {
                                            break Label_0636;
                                        }
                                        continue;
                                    }
                                    case 1: {
                                        if (this.v(obj, i)) {
                                            fc.u(t, n, fc.g(obj, n));
                                            break Label_0696;
                                        }
                                        continue;
                                    }
                                    case 0: {
                                        if (this.v(obj, i)) {
                                            fc.t(t, n, fc.f(obj, n));
                                            break Label_0696;
                                        }
                                        continue;
                                    }
                                }
                                fc.x(t, n, fc.k(obj, n));
                                this.t(t, n2, i);
                                continue;
                            }
                            break Label_0600;
                        }
                        fc.x(t, n, fc.k(obj, n));
                        break Label_0696;
                    }
                    fc.v(t, n, fc.h(obj, n));
                    break Label_0696;
                }
                fc.w(t, n, fc.i(obj, n));
            }
            this.s(t, i);
        }
        fb.f(this.l, t, obj);
        if (this.f) {
            fb.e(this.m, t, obj);
        }
    }
    
    @Override
    public final void h(final T t, final r8 r8) throws IOException {
        if (!this.g) {
            this.A(t, r8);
            return;
        }
        if (!this.f) {
            for (int length = this.a.length, i = 0; i < length; i += 3) {
                final int k = this.k(i);
                final int n = this.a[i];
                double n14 = 0.0;
                Label_2289: {
                    float n13 = 0.0f;
                    Label_2256: {
                        long n12 = 0L;
                        Label_2223: {
                            long n11 = 0L;
                            Label_2190: {
                                int n10 = 0;
                                Label_2157: {
                                    long n9 = 0L;
                                    Label_2124: {
                                        int n8 = 0;
                                        Label_2091: {
                                            boolean b = false;
                                            Label_2058: {
                                                Label_2017: {
                                                    Label_1982: {
                                                        Label_1950: {
                                                            int n7 = 0;
                                                            Label_1929: {
                                                                int n6 = 0;
                                                                Label_1896: {
                                                                    int n5 = 0;
                                                                    Label_1863: {
                                                                        long n4 = 0L;
                                                                        Label_1830: {
                                                                            int n3 = 0;
                                                                            Label_1797: {
                                                                                long n2 = 0L;
                                                                                Label_1764: {
                                                                                    switch (j(k)) {
                                                                                        default: {
                                                                                            continue;
                                                                                        }
                                                                                        case 68: {
                                                                                            if (this.y(t, n, i)) {
                                                                                                break;
                                                                                            }
                                                                                            continue;
                                                                                        }
                                                                                        case 67: {
                                                                                            if (this.y(t, n, i)) {
                                                                                                n2 = l(t, k & 0xFFFFF);
                                                                                                break Label_1764;
                                                                                            }
                                                                                            continue;
                                                                                        }
                                                                                        case 66: {
                                                                                            if (this.y(t, n, i)) {
                                                                                                n3 = L(t, k & 0xFFFFF);
                                                                                                break Label_1797;
                                                                                            }
                                                                                            continue;
                                                                                        }
                                                                                        case 65: {
                                                                                            if (this.y(t, n, i)) {
                                                                                                n4 = l(t, k & 0xFFFFF);
                                                                                                break Label_1830;
                                                                                            }
                                                                                            continue;
                                                                                        }
                                                                                        case 64: {
                                                                                            if (this.y(t, n, i)) {
                                                                                                n5 = L(t, k & 0xFFFFF);
                                                                                                break Label_1863;
                                                                                            }
                                                                                            continue;
                                                                                        }
                                                                                        case 63: {
                                                                                            if (this.y(t, n, i)) {
                                                                                                n6 = L(t, k & 0xFFFFF);
                                                                                                break Label_1896;
                                                                                            }
                                                                                            continue;
                                                                                        }
                                                                                        case 62: {
                                                                                            if (this.y(t, n, i)) {
                                                                                                n7 = L(t, k & 0xFFFFF);
                                                                                                break Label_1929;
                                                                                            }
                                                                                            continue;
                                                                                        }
                                                                                        case 61: {
                                                                                            if (this.y(t, n, i)) {
                                                                                                break Label_1950;
                                                                                            }
                                                                                            continue;
                                                                                        }
                                                                                        case 60: {
                                                                                            if (this.y(t, n, i)) {
                                                                                                break Label_1982;
                                                                                            }
                                                                                            continue;
                                                                                        }
                                                                                        case 59: {
                                                                                            if (this.y(t, n, i)) {
                                                                                                break Label_2017;
                                                                                            }
                                                                                            continue;
                                                                                        }
                                                                                        case 58: {
                                                                                            if (this.y(t, n, i)) {
                                                                                                b = z(t, k & 0xFFFFF);
                                                                                                break Label_2058;
                                                                                            }
                                                                                            continue;
                                                                                        }
                                                                                        case 57: {
                                                                                            if (this.y(t, n, i)) {
                                                                                                n8 = L(t, k & 0xFFFFF);
                                                                                                break Label_2091;
                                                                                            }
                                                                                            continue;
                                                                                        }
                                                                                        case 56: {
                                                                                            if (this.y(t, n, i)) {
                                                                                                n9 = l(t, k & 0xFFFFF);
                                                                                                break Label_2124;
                                                                                            }
                                                                                            continue;
                                                                                        }
                                                                                        case 55: {
                                                                                            if (this.y(t, n, i)) {
                                                                                                n10 = L(t, k & 0xFFFFF);
                                                                                                break Label_2157;
                                                                                            }
                                                                                            continue;
                                                                                        }
                                                                                        case 54: {
                                                                                            if (this.y(t, n, i)) {
                                                                                                n11 = l(t, k & 0xFFFFF);
                                                                                                break Label_2190;
                                                                                            }
                                                                                            continue;
                                                                                        }
                                                                                        case 53: {
                                                                                            if (this.y(t, n, i)) {
                                                                                                n12 = l(t, k & 0xFFFFF);
                                                                                                break Label_2223;
                                                                                            }
                                                                                            continue;
                                                                                        }
                                                                                        case 52: {
                                                                                            if (this.y(t, n, i)) {
                                                                                                n13 = I(t, k & 0xFFFFF);
                                                                                                break Label_2256;
                                                                                            }
                                                                                            continue;
                                                                                        }
                                                                                        case 51: {
                                                                                            if (this.y(t, n, i)) {
                                                                                                n14 = H(t, k & 0xFFFFF);
                                                                                                break Label_2289;
                                                                                            }
                                                                                            continue;
                                                                                        }
                                                                                        case 50: {
                                                                                            this.B(r8, n, fc.k(t, k & 0xFFFFF), i);
                                                                                            continue;
                                                                                        }
                                                                                        case 49: {
                                                                                            fb.q(this.a[i], (List<?>)fc.k(t, k & 0xFFFFF), r8, this.n(i));
                                                                                            continue;
                                                                                        }
                                                                                        case 48: {
                                                                                            fb.x(this.a[i], (List<Long>)fc.k(t, k & 0xFFFFF), r8, true);
                                                                                            continue;
                                                                                        }
                                                                                        case 47: {
                                                                                            fb.w(this.a[i], (List<Integer>)fc.k(t, k & 0xFFFFF), r8, true);
                                                                                            continue;
                                                                                        }
                                                                                        case 46: {
                                                                                            fb.v(this.a[i], (List<Long>)fc.k(t, k & 0xFFFFF), r8, true);
                                                                                            continue;
                                                                                        }
                                                                                        case 45: {
                                                                                            fb.u(this.a[i], (List<Integer>)fc.k(t, k & 0xFFFFF), r8, true);
                                                                                            continue;
                                                                                        }
                                                                                        case 44: {
                                                                                            fb.m(this.a[i], (List<Integer>)fc.k(t, k & 0xFFFFF), r8, true);
                                                                                            continue;
                                                                                        }
                                                                                        case 43: {
                                                                                            fb.z(this.a[i], (List<Integer>)fc.k(t, k & 0xFFFFF), r8, true);
                                                                                            continue;
                                                                                        }
                                                                                        case 42: {
                                                                                            fb.j(this.a[i], (List<Boolean>)fc.k(t, k & 0xFFFFF), r8, true);
                                                                                            continue;
                                                                                        }
                                                                                        case 41: {
                                                                                            fb.n(this.a[i], (List<Integer>)fc.k(t, k & 0xFFFFF), r8, true);
                                                                                            continue;
                                                                                        }
                                                                                        case 40: {
                                                                                            fb.o(this.a[i], (List<Long>)fc.k(t, k & 0xFFFFF), r8, true);
                                                                                            continue;
                                                                                        }
                                                                                        case 39: {
                                                                                            fb.r(this.a[i], (List<Integer>)fc.k(t, k & 0xFFFFF), r8, true);
                                                                                            continue;
                                                                                        }
                                                                                        case 38: {
                                                                                            fb.B(this.a[i], (List<Long>)fc.k(t, k & 0xFFFFF), r8, true);
                                                                                            continue;
                                                                                        }
                                                                                        case 37: {
                                                                                            fb.s(this.a[i], (List<Long>)fc.k(t, k & 0xFFFFF), r8, true);
                                                                                            continue;
                                                                                        }
                                                                                        case 36: {
                                                                                            fb.p(this.a[i], (List<Float>)fc.k(t, k & 0xFFFFF), r8, true);
                                                                                            continue;
                                                                                        }
                                                                                        case 35: {
                                                                                            fb.l(this.a[i], (List<Double>)fc.k(t, k & 0xFFFFF), r8, true);
                                                                                            continue;
                                                                                        }
                                                                                        case 34: {
                                                                                            fb.x(this.a[i], (List<Long>)fc.k(t, k & 0xFFFFF), r8, false);
                                                                                            continue;
                                                                                        }
                                                                                        case 33: {
                                                                                            fb.w(this.a[i], (List<Integer>)fc.k(t, k & 0xFFFFF), r8, false);
                                                                                            continue;
                                                                                        }
                                                                                        case 32: {
                                                                                            fb.v(this.a[i], (List<Long>)fc.k(t, k & 0xFFFFF), r8, false);
                                                                                            continue;
                                                                                        }
                                                                                        case 31: {
                                                                                            fb.u(this.a[i], (List<Integer>)fc.k(t, k & 0xFFFFF), r8, false);
                                                                                            continue;
                                                                                        }
                                                                                        case 30: {
                                                                                            fb.m(this.a[i], (List<Integer>)fc.k(t, k & 0xFFFFF), r8, false);
                                                                                            continue;
                                                                                        }
                                                                                        case 29: {
                                                                                            fb.z(this.a[i], (List<Integer>)fc.k(t, k & 0xFFFFF), r8, false);
                                                                                            continue;
                                                                                        }
                                                                                        case 28: {
                                                                                            fb.k(this.a[i], (List<h8>)fc.k(t, k & 0xFFFFF), r8);
                                                                                            continue;
                                                                                        }
                                                                                        case 27: {
                                                                                            fb.t(this.a[i], (List<?>)fc.k(t, k & 0xFFFFF), r8, this.n(i));
                                                                                            continue;
                                                                                        }
                                                                                        case 26: {
                                                                                            fb.y(this.a[i], (List<String>)fc.k(t, k & 0xFFFFF), r8);
                                                                                            continue;
                                                                                        }
                                                                                        case 25: {
                                                                                            fb.j(this.a[i], (List<Boolean>)fc.k(t, k & 0xFFFFF), r8, false);
                                                                                            continue;
                                                                                        }
                                                                                        case 24: {
                                                                                            fb.n(this.a[i], (List<Integer>)fc.k(t, k & 0xFFFFF), r8, false);
                                                                                            continue;
                                                                                        }
                                                                                        case 23: {
                                                                                            fb.o(this.a[i], (List<Long>)fc.k(t, k & 0xFFFFF), r8, false);
                                                                                            continue;
                                                                                        }
                                                                                        case 22: {
                                                                                            fb.r(this.a[i], (List<Integer>)fc.k(t, k & 0xFFFFF), r8, false);
                                                                                            continue;
                                                                                        }
                                                                                        case 21: {
                                                                                            fb.B(this.a[i], (List<Long>)fc.k(t, k & 0xFFFFF), r8, false);
                                                                                            continue;
                                                                                        }
                                                                                        case 20: {
                                                                                            fb.s(this.a[i], (List<Long>)fc.k(t, k & 0xFFFFF), r8, false);
                                                                                            continue;
                                                                                        }
                                                                                        case 19: {
                                                                                            fb.p(this.a[i], (List<Float>)fc.k(t, k & 0xFFFFF), r8, false);
                                                                                            continue;
                                                                                        }
                                                                                        case 18: {
                                                                                            fb.l(this.a[i], (List<Double>)fc.k(t, k & 0xFFFFF), r8, false);
                                                                                            continue;
                                                                                        }
                                                                                        case 17: {
                                                                                            if (this.v(t, i)) {
                                                                                                break;
                                                                                            }
                                                                                            continue;
                                                                                        }
                                                                                        case 16: {
                                                                                            if (this.v(t, i)) {
                                                                                                n2 = fc.i(t, k & 0xFFFFF);
                                                                                                break Label_1764;
                                                                                            }
                                                                                            continue;
                                                                                        }
                                                                                        case 15: {
                                                                                            if (this.v(t, i)) {
                                                                                                n3 = fc.h(t, k & 0xFFFFF);
                                                                                                break Label_1797;
                                                                                            }
                                                                                            continue;
                                                                                        }
                                                                                        case 14: {
                                                                                            if (this.v(t, i)) {
                                                                                                n4 = fc.i(t, k & 0xFFFFF);
                                                                                                break Label_1830;
                                                                                            }
                                                                                            continue;
                                                                                        }
                                                                                        case 13: {
                                                                                            if (this.v(t, i)) {
                                                                                                n5 = fc.h(t, k & 0xFFFFF);
                                                                                                break Label_1863;
                                                                                            }
                                                                                            continue;
                                                                                        }
                                                                                        case 12: {
                                                                                            if (this.v(t, i)) {
                                                                                                n6 = fc.h(t, k & 0xFFFFF);
                                                                                                break Label_1896;
                                                                                            }
                                                                                            continue;
                                                                                        }
                                                                                        case 11: {
                                                                                            if (this.v(t, i)) {
                                                                                                n7 = fc.h(t, k & 0xFFFFF);
                                                                                                break Label_1929;
                                                                                            }
                                                                                            continue;
                                                                                        }
                                                                                        case 10: {
                                                                                            if (this.v(t, i)) {
                                                                                                break Label_1950;
                                                                                            }
                                                                                            continue;
                                                                                        }
                                                                                        case 9: {
                                                                                            if (this.v(t, i)) {
                                                                                                break Label_1982;
                                                                                            }
                                                                                            continue;
                                                                                        }
                                                                                        case 8: {
                                                                                            if (this.v(t, i)) {
                                                                                                break Label_2017;
                                                                                            }
                                                                                            continue;
                                                                                        }
                                                                                        case 7: {
                                                                                            if (this.v(t, i)) {
                                                                                                b = fc.B(t, k & 0xFFFFF);
                                                                                                break Label_2058;
                                                                                            }
                                                                                            continue;
                                                                                        }
                                                                                        case 6: {
                                                                                            if (this.v(t, i)) {
                                                                                                n8 = fc.h(t, k & 0xFFFFF);
                                                                                                break Label_2091;
                                                                                            }
                                                                                            continue;
                                                                                        }
                                                                                        case 5: {
                                                                                            if (this.v(t, i)) {
                                                                                                n9 = fc.i(t, k & 0xFFFFF);
                                                                                                break Label_2124;
                                                                                            }
                                                                                            continue;
                                                                                        }
                                                                                        case 4: {
                                                                                            if (this.v(t, i)) {
                                                                                                n10 = fc.h(t, k & 0xFFFFF);
                                                                                                break Label_2157;
                                                                                            }
                                                                                            continue;
                                                                                        }
                                                                                        case 3: {
                                                                                            if (this.v(t, i)) {
                                                                                                n11 = fc.i(t, k & 0xFFFFF);
                                                                                                break Label_2190;
                                                                                            }
                                                                                            continue;
                                                                                        }
                                                                                        case 2: {
                                                                                            if (this.v(t, i)) {
                                                                                                n12 = fc.i(t, k & 0xFFFFF);
                                                                                                break Label_2223;
                                                                                            }
                                                                                            continue;
                                                                                        }
                                                                                        case 1: {
                                                                                            if (this.v(t, i)) {
                                                                                                n13 = fc.g(t, k & 0xFFFFF);
                                                                                                break Label_2256;
                                                                                            }
                                                                                            continue;
                                                                                        }
                                                                                        case 0: {
                                                                                            if (this.v(t, i)) {
                                                                                                n14 = fc.f(t, k & 0xFFFFF);
                                                                                                break Label_2289;
                                                                                            }
                                                                                            continue;
                                                                                        }
                                                                                    }
                                                                                    r8.B(n, fc.k(t, k & 0xFFFFF), this.n(i));
                                                                                    continue;
                                                                                }
                                                                                r8.c(n, n2);
                                                                                continue;
                                                                            }
                                                                            r8.a(n, n3);
                                                                            continue;
                                                                        }
                                                                        r8.J(n, n4);
                                                                        continue;
                                                                    }
                                                                    r8.H(n, n5);
                                                                    continue;
                                                                }
                                                                r8.t(n, n6);
                                                                continue;
                                                            }
                                                            r8.h(n, n7);
                                                            continue;
                                                        }
                                                        r8.o(n, (h8)fc.k(t, k & 0xFFFFF));
                                                        continue;
                                                    }
                                                    r8.G(n, fc.k(t, k & 0xFFFFF), this.n(i));
                                                    continue;
                                                }
                                                C(n, fc.k(t, k & 0xFFFFF), r8);
                                                continue;
                                            }
                                            r8.m(n, b);
                                            continue;
                                        }
                                        r8.v(n, n8);
                                        continue;
                                    }
                                    r8.x(n, n9);
                                    continue;
                                }
                                r8.C(n, n10);
                                continue;
                            }
                            r8.j(n, n11);
                            continue;
                        }
                        r8.E(n, n12);
                        continue;
                    }
                    r8.z(n, n13);
                    continue;
                }
                r8.q(n, n14);
            }
            final vb<?, ?> l = this.l;
            l.i(l.c(t), r8);
            return;
        }
        this.m.a(t);
        throw null;
    }
    
    @Override
    public final boolean i(final T t, final T t2) {
        for (int length = this.a.length, i = 0; i < length; i += 3) {
            final int k = this.k(i);
            final long n = k & 0xFFFFF;
            switch (j(k)) {
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
                    final long n2 = this.S(i) & 0xFFFFF;
                    if (fc.h(t, n2) != fc.h(t2, n2)) {
                        return false;
                    }
                    if (!fb.h(fc.k(t, n), fc.k(t2, n))) {
                        return false;
                    }
                    break;
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
                    if (!fb.h(fc.k(t, n), fc.k(t2, n))) {
                        return false;
                    }
                    break;
                }
                case 17: {
                    if (this.u(t, t2, i) && fb.h(fc.k(t, n), fc.k(t2, n))) {
                        break;
                    }
                    return false;
                }
                case 16: {
                    if (this.u(t, t2, i) && fc.i(t, n) == fc.i(t2, n)) {
                        break;
                    }
                    return false;
                }
                case 15: {
                    if (this.u(t, t2, i) && fc.h(t, n) == fc.h(t2, n)) {
                        break;
                    }
                    return false;
                }
                case 14: {
                    if (this.u(t, t2, i) && fc.i(t, n) == fc.i(t2, n)) {
                        break;
                    }
                    return false;
                }
                case 13: {
                    if (this.u(t, t2, i) && fc.h(t, n) == fc.h(t2, n)) {
                        break;
                    }
                    return false;
                }
                case 12: {
                    if (this.u(t, t2, i) && fc.h(t, n) == fc.h(t2, n)) {
                        break;
                    }
                    return false;
                }
                case 11: {
                    if (this.u(t, t2, i) && fc.h(t, n) == fc.h(t2, n)) {
                        break;
                    }
                    return false;
                }
                case 10: {
                    if (this.u(t, t2, i) && fb.h(fc.k(t, n), fc.k(t2, n))) {
                        break;
                    }
                    return false;
                }
                case 9: {
                    if (this.u(t, t2, i) && fb.h(fc.k(t, n), fc.k(t2, n))) {
                        break;
                    }
                    return false;
                }
                case 8: {
                    if (this.u(t, t2, i) && fb.h(fc.k(t, n), fc.k(t2, n))) {
                        break;
                    }
                    return false;
                }
                case 7: {
                    if (this.u(t, t2, i) && fc.B(t, n) == fc.B(t2, n)) {
                        break;
                    }
                    return false;
                }
                case 6: {
                    if (this.u(t, t2, i) && fc.h(t, n) == fc.h(t2, n)) {
                        break;
                    }
                    return false;
                }
                case 5: {
                    if (this.u(t, t2, i) && fc.i(t, n) == fc.i(t2, n)) {
                        break;
                    }
                    return false;
                }
                case 4: {
                    if (this.u(t, t2, i) && fc.h(t, n) == fc.h(t2, n)) {
                        break;
                    }
                    return false;
                }
                case 3: {
                    if (this.u(t, t2, i) && fc.i(t, n) == fc.i(t2, n)) {
                        break;
                    }
                    return false;
                }
                case 2: {
                    if (this.u(t, t2, i) && fc.i(t, n) == fc.i(t2, n)) {
                        break;
                    }
                    return false;
                }
                case 1: {
                    if (this.u(t, t2, i) && Float.floatToIntBits(fc.g(t, n)) == Float.floatToIntBits(fc.g(t2, n))) {
                        break;
                    }
                    return false;
                }
                case 0: {
                    if (this.u(t, t2, i) && Double.doubleToLongBits(fc.f(t, n)) == Double.doubleToLongBits(fc.f(t2, n))) {
                        break;
                    }
                    return false;
                }
            }
        }
        if (!this.l.c(t).equals(this.l.c(t2))) {
            return false;
        }
        if (!this.f) {
            return true;
        }
        this.m.a(t);
        this.m.a(t2);
        throw null;
    }
}
