// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;

final class r8
{
    private final q8 a;
    
    private r8(final q8 a) {
        s9.f(a, "output");
        this.a = a;
        a.a = this;
    }
    
    public static r8 l(final q8 q8) {
        final r8 a = q8.a;
        if (a != null) {
            return a;
        }
        return new r8(q8);
    }
    
    public final void A(int i, final List<Float> list, final boolean b) throws IOException {
        int j = 0;
        final int n = 0;
        if (b) {
            this.a.s(i, 2);
            i = 0;
            int n2 = 0;
            while (i < list.size()) {
                list.get(i);
                n2 += 4;
                ++i;
            }
            this.a.u(n2);
            for (i = n; i < list.size(); ++i) {
                this.a.l(Float.floatToRawIntBits(list.get(i)));
            }
        }
        else {
            while (j < list.size()) {
                this.a.k(i, Float.floatToRawIntBits(list.get(j)));
                ++j;
            }
        }
    }
    
    public final void B(final int n, final Object o, final db db) throws IOException {
        final q8 a = this.a;
        final sa sa = (sa)o;
        a.s(n, 3);
        db.h(sa, a.a);
        a.s(n, 4);
    }
    
    public final void C(final int n, final int n2) throws IOException {
        this.a.o(n, n2);
    }
    
    public final void D(int i, final List<Integer> list, final boolean b) throws IOException {
        int j = 0;
        final int n = 0;
        if (b) {
            this.a.s(i, 2);
            i = 0;
            int n2 = 0;
            while (i < list.size()) {
                n2 += q8.z(list.get(i));
                ++i;
            }
            this.a.u(n2);
            for (i = n; i < list.size(); ++i) {
                this.a.p(list.get(i));
            }
        }
        else {
            while (j < list.size()) {
                this.a.o(i, list.get(j));
                ++j;
            }
        }
    }
    
    public final void E(final int n, final long n2) throws IOException {
        this.a.v(n, n2);
    }
    
    public final void F(int i, final List<Long> list, final boolean b) throws IOException {
        int j = 0;
        final int n = 0;
        if (b) {
            this.a.s(i, 2);
            int k = 0;
            i = 0;
            while (k < list.size()) {
                i += q8.b(list.get(k));
                ++k;
            }
            this.a.u(i);
            for (i = n; i < list.size(); ++i) {
                this.a.w(list.get(i));
            }
        }
        else {
            while (j < list.size()) {
                this.a.v(i, list.get(j));
                ++j;
            }
        }
    }
    
    public final void G(int n, final Object o, final db db) throws IOException {
        final q8 a = this.a;
        final sa sa = (sa)o;
        final n8 n2 = (n8)a;
        n2.u(n << 3 | 0x2);
        final q7 q7 = (q7)sa;
        if ((n = q7.e()) == -1) {
            n = db.a(q7);
            q7.h(n);
        }
        n2.u(n);
        db.h(sa, n2.a);
    }
    
    public final void H(final int n, final int n2) throws IOException {
        this.a.k(n, n2);
    }
    
    public final void I(int i, final List<Integer> list, final boolean b) throws IOException {
        int j = 0;
        final int n = 0;
        if (b) {
            this.a.s(i, 2);
            int k = 0;
            i = 0;
            while (k < list.size()) {
                list.get(k);
                i += 4;
                ++k;
            }
            this.a.u(i);
            for (i = n; i < list.size(); ++i) {
                this.a.l(list.get(i));
            }
        }
        else {
            while (j < list.size()) {
                this.a.k(i, list.get(j));
                ++j;
            }
        }
    }
    
    public final void J(final int n, final long n2) throws IOException {
        this.a.m(n, n2);
    }
    
    public final void K(int i, final List<Long> list, final boolean b) throws IOException {
        int j = 0;
        final int n = 0;
        if (b) {
            this.a.s(i, 2);
            i = 0;
            int n2 = 0;
            while (i < list.size()) {
                list.get(i);
                n2 += 8;
                ++i;
            }
            this.a.u(n2);
            for (i = n; i < list.size(); ++i) {
                this.a.n(list.get(i));
            }
        }
        else {
            while (j < list.size()) {
                this.a.m(i, list.get(j));
                ++j;
            }
        }
    }
    
    public final void a(final int n, final int n2) throws IOException {
        this.a.t(n, n2 >> 31 ^ n2 + n2);
    }
    
    public final void b(int i, final List<Integer> list, final boolean b) throws IOException {
        int j = 0;
        final int n = 0;
        if (b) {
            this.a.s(i, 2);
            int k = 0;
            i = 0;
            while (k < list.size()) {
                final int intValue = list.get(k);
                i += q8.a(intValue >> 31 ^ intValue + intValue);
                ++k;
            }
            this.a.u(i);
            q8 a;
            int intValue2;
            for (i = n; i < list.size(); ++i) {
                a = this.a;
                intValue2 = list.get(i);
                a.u(intValue2 >> 31 ^ intValue2 + intValue2);
            }
        }
        else {
            while (j < list.size()) {
                final q8 a2 = this.a;
                final int intValue3 = list.get(j);
                a2.t(i, intValue3 >> 31 ^ intValue3 + intValue3);
                ++j;
            }
        }
    }
    
    public final void c(final int n, final long n2) throws IOException {
        this.a.v(n, n2 >> 63 ^ n2 + n2);
    }
    
    public final void d(int i, final List<Long> list, final boolean b) throws IOException {
        int j = 0;
        final int n = 0;
        if (b) {
            this.a.s(i, 2);
            i = 0;
            int n2 = 0;
            while (i < list.size()) {
                final long longValue = list.get(i);
                n2 += q8.b(longValue >> 63 ^ longValue + longValue);
                ++i;
            }
            this.a.u(n2);
            q8 a;
            long longValue2;
            for (i = n; i < list.size(); ++i) {
                a = this.a;
                longValue2 = list.get(i);
                a.w(longValue2 >> 63 ^ longValue2 + longValue2);
            }
        }
        else {
            while (j < list.size()) {
                final q8 a2 = this.a;
                final long longValue3 = list.get(j);
                a2.v(i, longValue3 >> 63 ^ longValue3 + longValue3);
                ++j;
            }
        }
    }
    
    public final void e(final int n) throws IOException {
        this.a.s(n, 3);
    }
    
    public final void f(final int n, final String s) throws IOException {
        this.a.r(n, s);
    }
    
    public final void g(final int n, final List<String> list) throws IOException {
        final boolean b = list instanceof z9;
        int i = 0;
        final int n2 = 0;
        if (b) {
            final z9 z9 = (z9)list;
            for (int j = n2; j < list.size(); ++j) {
                final Object j2 = z9.J1(j);
                if (j2 instanceof String) {
                    this.a.r(n, (String)j2);
                }
                else {
                    this.a.j(n, (h8)j2);
                }
            }
        }
        else {
            while (i < list.size()) {
                this.a.r(n, list.get(i));
                ++i;
            }
        }
    }
    
    public final void h(final int n, final int n2) throws IOException {
        this.a.t(n, n2);
    }
    
    public final void i(int i, final List<Integer> list, final boolean b) throws IOException {
        int j = 0;
        final int n = 0;
        if (b) {
            this.a.s(i, 2);
            int k = 0;
            i = 0;
            while (k < list.size()) {
                i += q8.a(list.get(k));
                ++k;
            }
            this.a.u(i);
            for (i = n; i < list.size(); ++i) {
                this.a.u(list.get(i));
            }
        }
        else {
            while (j < list.size()) {
                this.a.t(i, list.get(j));
                ++j;
            }
        }
    }
    
    public final void j(final int n, final long n2) throws IOException {
        this.a.v(n, n2);
    }
    
    public final void k(int i, final List<Long> list, final boolean b) throws IOException {
        int j = 0;
        final int n = 0;
        if (b) {
            this.a.s(i, 2);
            i = 0;
            int n2 = 0;
            while (i < list.size()) {
                n2 += q8.b(list.get(i));
                ++i;
            }
            this.a.u(n2);
            for (i = n; i < list.size(); ++i) {
                this.a.w(list.get(i));
            }
        }
        else {
            while (j < list.size()) {
                this.a.v(i, list.get(j));
                ++j;
            }
        }
    }
    
    public final void m(final int n, final boolean b) throws IOException {
        this.a.i(n, b);
    }
    
    public final void n(int i, final List<Boolean> list, final boolean b) throws IOException {
        int j = 0;
        final int n = 0;
        if (b) {
            this.a.s(i, 2);
            i = 0;
            int n2 = 0;
            while (i < list.size()) {
                list.get(i);
                ++n2;
                ++i;
            }
            this.a.u(n2);
            for (i = n; i < list.size(); ++i) {
                this.a.h((byte)(((boolean)list.get(i)) ? 1 : 0));
            }
        }
        else {
            while (j < list.size()) {
                this.a.i(i, list.get(j));
                ++j;
            }
        }
    }
    
    public final void o(final int n, final h8 h8) throws IOException {
        this.a.j(n, h8);
    }
    
    public final void p(final int n, final List<h8> list) throws IOException {
        for (int i = 0; i < list.size(); ++i) {
            this.a.j(n, list.get(i));
        }
    }
    
    public final void q(final int n, final double n2) throws IOException {
        this.a.m(n, Double.doubleToRawLongBits(n2));
    }
    
    public final void r(int i, final List<Double> list, final boolean b) throws IOException {
        int j = 0;
        final int n = 0;
        if (b) {
            this.a.s(i, 2);
            i = 0;
            int n2 = 0;
            while (i < list.size()) {
                list.get(i);
                n2 += 8;
                ++i;
            }
            this.a.u(n2);
            for (i = n; i < list.size(); ++i) {
                this.a.n(Double.doubleToRawLongBits(list.get(i)));
            }
        }
        else {
            while (j < list.size()) {
                this.a.m(i, Double.doubleToRawLongBits(list.get(j)));
                ++j;
            }
        }
    }
    
    public final void s(final int n) throws IOException {
        this.a.s(n, 4);
    }
    
    public final void t(final int n, final int n2) throws IOException {
        this.a.o(n, n2);
    }
    
    public final void u(int i, final List<Integer> list, final boolean b) throws IOException {
        int j = 0;
        final int n = 0;
        if (b) {
            this.a.s(i, 2);
            i = 0;
            int n2 = 0;
            while (i < list.size()) {
                n2 += q8.z(list.get(i));
                ++i;
            }
            this.a.u(n2);
            for (i = n; i < list.size(); ++i) {
                this.a.p(list.get(i));
            }
        }
        else {
            while (j < list.size()) {
                this.a.o(i, list.get(j));
                ++j;
            }
        }
    }
    
    public final void v(final int n, final int n2) throws IOException {
        this.a.k(n, n2);
    }
    
    public final void w(int i, final List<Integer> list, final boolean b) throws IOException {
        int j = 0;
        final int n = 0;
        if (b) {
            this.a.s(i, 2);
            i = 0;
            int n2 = 0;
            while (i < list.size()) {
                list.get(i);
                n2 += 4;
                ++i;
            }
            this.a.u(n2);
            for (i = n; i < list.size(); ++i) {
                this.a.l(list.get(i));
            }
        }
        else {
            while (j < list.size()) {
                this.a.k(i, list.get(j));
                ++j;
            }
        }
    }
    
    public final void x(final int n, final long n2) throws IOException {
        this.a.m(n, n2);
    }
    
    public final void y(int i, final List<Long> list, final boolean b) throws IOException {
        int j = 0;
        final int n = 0;
        if (b) {
            this.a.s(i, 2);
            i = 0;
            int n2 = 0;
            while (i < list.size()) {
                list.get(i);
                n2 += 8;
                ++i;
            }
            this.a.u(n2);
            for (i = n; i < list.size(); ++i) {
                this.a.n(list.get(i));
            }
        }
        else {
            while (j < list.size()) {
                this.a.m(i, list.get(j));
                ++j;
            }
        }
    }
    
    public final void z(final int n, final float n2) throws IOException {
        this.a.k(n, Float.floatToRawIntBits(n2));
    }
}
