// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.util.Iterator;
import java.util.Map;
import java.util.List;
import java.io.IOException;

final class y5 implements ia
{
    private final v5 a;
    
    private y5(v5 a) {
        a = t6.f(a, "output");
        this.a = a;
        a.a = this;
    }
    
    public static y5 O(final v5 v5) {
        final y5 a = v5.a;
        if (a != null) {
            return a;
        }
        return new y5(v5);
    }
    
    @Override
    public final void A(final int n, final int n2) throws IOException {
        this.a.k0(n, n2);
    }
    
    @Override
    public final void B(int i, final List<Float> list, final boolean b) throws IOException {
        int j = 0;
        final int n = 0;
        if (b) {
            this.a.m(i, 2);
            i = 0;
            int n2 = 0;
            while (i < list.size()) {
                n2 += v5.A(list.get(i));
                ++i;
            }
            this.a.O(n2);
            for (i = n; i < list.size(); ++i) {
                this.a.i(list.get(i));
            }
            return;
        }
        while (j < list.size()) {
            this.a.l(i, list.get(j));
            ++j;
        }
    }
    
    @Override
    public final void C(final int n, final int n2) throws IOException {
        this.a.Y(n, n2);
    }
    
    @Override
    public final void D(final int n, final List<String> list) throws IOException {
        final boolean b = list instanceof j7;
        int i = 0;
        final int n2 = 0;
        if (b) {
            final j7 j7 = (j7)list;
            for (int k = n2; k < list.size(); ++k) {
                final Object s = j7.s(k);
                if (s instanceof String) {
                    this.a.r(n, (String)s);
                }
                else {
                    this.a.o(n, (f5)s);
                }
            }
            return;
        }
        while (i < list.size()) {
            this.a.r(n, list.get(i));
            ++i;
        }
    }
    
    @Override
    public final void E(final int n, final boolean b) throws IOException {
        this.a.s(n, b);
    }
    
    @Override
    public final void F(final int n, final f5 f5) throws IOException {
        this.a.o(n, f5);
    }
    
    @Override
    public final void G(final int n, final int n2) throws IOException {
        this.a.P(n, n2);
    }
    
    @Override
    public final <K, V> void H(final int n, final u7<K, V> u7, final Map<K, V> map) throws IOException {
        for (final Map.Entry<K, V> entry : map.entrySet()) {
            this.a.m(n, 2);
            this.a.O(r7.a(u7, entry.getKey(), entry.getValue()));
            r7.b(this.a, (u7<K, V>)u7, (K)entry.getKey(), (V)entry.getValue());
        }
    }
    
    @Override
    public final void I(final int n, final List<?> list, final s8 s8) throws IOException {
        for (int i = 0; i < list.size(); ++i) {
            this.M(n, list.get(i), s8);
        }
    }
    
    @Override
    public final void J(final int n, final Object o, final s8 s8) throws IOException {
        this.a.q(n, (z7)o, s8);
    }
    
    @Override
    public final void K(final int n, final long n2) throws IOException {
        this.a.Z(n, n2);
    }
    
    @Override
    public final void L(final int n, final long n2) throws IOException {
        this.a.Q(n, n2);
    }
    
    @Override
    public final void M(final int n, final Object o, final s8 s8) throws IOException {
        final v5 a = this.a;
        final z7 z7 = (z7)o;
        a.m(n, 3);
        s8.g(z7, a.a);
        a.m(n, 4);
    }
    
    @Override
    public final void N(final int n, final List<?> list, final s8 s8) throws IOException {
        for (int i = 0; i < list.size(); ++i) {
            this.J(n, list.get(i), s8);
        }
    }
    
    @Override
    public final void a(final int n, final int n2) throws IOException {
        this.a.k0(n, n2);
    }
    
    @Override
    public final void b(int i, final List<Boolean> list, final boolean b) throws IOException {
        int j = 0;
        final int n = 0;
        if (b) {
            this.a.m(i, 2);
            int k = 0;
            i = 0;
            while (k < list.size()) {
                i += v5.L(list.get(k));
                ++k;
            }
            this.a.O(i);
            for (i = n; i < list.size(); ++i) {
                this.a.y(list.get(i));
            }
            return;
        }
        while (j < list.size()) {
            this.a.s(i, list.get(j));
            ++j;
        }
    }
    
    @Override
    public final void c(final int n, final long n2) throws IOException {
        this.a.Z(n, n2);
    }
    
    @Override
    public final void d(final int n) throws IOException {
        this.a.m(n, 3);
    }
    
    @Override
    public final void e(int i, final List<Integer> list, final boolean b) throws IOException {
        int j = 0;
        final int n = 0;
        if (b) {
            this.a.m(i, 2);
            i = 0;
            int n2 = 0;
            while (i < list.size()) {
                n2 += v5.l0(list.get(i));
                ++i;
            }
            this.a.O(n2);
            for (i = n; i < list.size(); ++i) {
                this.a.j(list.get(i));
            }
            return;
        }
        while (j < list.size()) {
            this.a.P(i, list.get(j));
            ++j;
        }
    }
    
    @Override
    public final void f(int i, final List<Integer> list, final boolean b) throws IOException {
        int j = 0;
        final int n = 0;
        if (b) {
            this.a.m(i, 2);
            int k = 0;
            i = 0;
            while (k < list.size()) {
                i += v5.C0(list.get(k));
                ++k;
            }
            this.a.O(i);
            for (i = n; i < list.size(); ++i) {
                this.a.j(list.get(i));
            }
            return;
        }
        while (j < list.size()) {
            this.a.P(i, list.get(j));
            ++j;
        }
    }
    
    @Override
    public final void g(final int n, final int n2) throws IOException {
        this.a.P(n, n2);
    }
    
    @Override
    public final void h(final int n, final long n2) throws IOException {
        this.a.n(n, n2);
    }
    
    @Override
    public final void i(final int n, final Object o) throws IOException {
        if (o instanceof f5) {
            this.a.R(n, (f5)o);
            return;
        }
        this.a.p(n, (z7)o);
    }
    
    @Override
    public final void j(int i, final List<Long> list, final boolean b) throws IOException {
        int j = 0;
        final int n = 0;
        if (b) {
            this.a.m(i, 2);
            i = 0;
            int n2 = 0;
            while (i < list.size()) {
                n2 += v5.e0(list.get(i));
                ++i;
            }
            this.a.O(n2);
            for (i = n; i < list.size(); ++i) {
                this.a.t(list.get(i));
            }
            return;
        }
        while (j < list.size()) {
            this.a.n(i, list.get(j));
            ++j;
        }
    }
    
    @Override
    public final void k(int i, final List<Long> list, final boolean b) throws IOException {
        int j = 0;
        final int n = 0;
        if (b) {
            this.a.m(i, 2);
            int k = 0;
            i = 0;
            while (k < list.size()) {
                i += v5.w0(list.get(k));
                ++k;
            }
            this.a.O(i);
            for (i = n; i < list.size(); ++i) {
                this.a.a0(list.get(i));
            }
            return;
        }
        while (j < list.size()) {
            this.a.Z(i, list.get(j));
            ++j;
        }
    }
    
    @Override
    public final void l(int i, final List<Integer> list, final boolean b) throws IOException {
        int j = 0;
        final int n = 0;
        if (b) {
            this.a.m(i, 2);
            i = 0;
            int n2 = 0;
            while (i < list.size()) {
                n2 += v5.x0(list.get(i));
                ++i;
            }
            this.a.O(n2);
            for (i = n; i < list.size(); ++i) {
                this.a.f0(list.get(i));
            }
            return;
        }
        while (j < list.size()) {
            this.a.k0(i, list.get(j));
            ++j;
        }
    }
    
    @Override
    public final void m(final int n, final String s) throws IOException {
        this.a.r(n, s);
    }
    
    @Override
    public final void n(int i, final List<Integer> list, final boolean b) throws IOException {
        int j = 0;
        final int n = 0;
        if (b) {
            this.a.m(i, 2);
            int k = 0;
            i = 0;
            while (k < list.size()) {
                i += v5.p0(list.get(k));
                ++k;
            }
            this.a.O(i);
            for (i = n; i < list.size(); ++i) {
                this.a.O(list.get(i));
            }
            return;
        }
        while (j < list.size()) {
            this.a.Y(i, list.get(j));
            ++j;
        }
    }
    
    @Override
    public final void o(int i, final List<Integer> list, final boolean b) throws IOException {
        int j = 0;
        final int n = 0;
        if (b) {
            this.a.m(i, 2);
            i = 0;
            int n2 = 0;
            while (i < list.size()) {
                n2 += v5.A0(list.get(i));
                ++i;
            }
            this.a.O(n2);
            for (i = n; i < list.size(); ++i) {
                this.a.f0(list.get(i));
            }
            return;
        }
        while (j < list.size()) {
            this.a.k0(i, list.get(j));
            ++j;
        }
    }
    
    @Override
    public final void p(final int n, final long n2) throws IOException {
        this.a.n(n, n2);
    }
    
    @Override
    public final void q(final int n, final double n2) throws IOException {
        this.a.k(n, n2);
    }
    
    @Override
    public final void r(final int n, final float n2) throws IOException {
        this.a.l(n, n2);
    }
    
    @Override
    public final void s(final int n) throws IOException {
        this.a.m(n, 4);
    }
    
    @Override
    public final void t(int i, final List<Long> list, final boolean b) throws IOException {
        int j = 0;
        final int n = 0;
        if (b) {
            this.a.m(i, 2);
            i = 0;
            int n2 = 0;
            while (i < list.size()) {
                n2 += v5.s0(list.get(i));
                ++i;
            }
            this.a.O(n2);
            for (i = n; i < list.size(); ++i) {
                this.a.a0(list.get(i));
            }
            return;
        }
        while (j < list.size()) {
            this.a.Z(i, list.get(j));
            ++j;
        }
    }
    
    @Override
    public final void u(final int n, final int n2) throws IOException {
        this.a.g0(n, n2);
    }
    
    @Override
    public final void v(int i, final List<Long> list, final boolean b) throws IOException {
        int j = 0;
        final int n = 0;
        if (b) {
            this.a.m(i, 2);
            i = 0;
            int n2 = 0;
            while (i < list.size()) {
                n2 += v5.o0(list.get(i));
                ++i;
            }
            this.a.O(n2);
            for (i = n; i < list.size(); ++i) {
                this.a.S(list.get(i));
            }
            return;
        }
        while (j < list.size()) {
            this.a.Q(i, list.get(j));
            ++j;
        }
    }
    
    @Override
    public final void w(int i, final List<Long> list, final boolean b) throws IOException {
        int j = 0;
        final int n = 0;
        if (b) {
            this.a.m(i, 2);
            i = 0;
            int n2 = 0;
            while (i < list.size()) {
                n2 += v5.j0(list.get(i));
                ++i;
            }
            this.a.O(n2);
            for (i = n; i < list.size(); ++i) {
                this.a.t(list.get(i));
            }
            return;
        }
        while (j < list.size()) {
            this.a.n(i, list.get(j));
            ++j;
        }
    }
    
    @Override
    public final void x(int i, final List<Integer> list, final boolean b) throws IOException {
        int j = 0;
        final int n = 0;
        if (b) {
            this.a.m(i, 2);
            i = 0;
            int n2 = 0;
            while (i < list.size()) {
                n2 += v5.t0(list.get(i));
                ++i;
            }
            this.a.O(n2);
            for (i = n; i < list.size(); ++i) {
                this.a.X(list.get(i));
            }
            return;
        }
        while (j < list.size()) {
            this.a.g0(i, list.get(j));
            ++j;
        }
    }
    
    @Override
    public final void y(int i, final List<Double> list, final boolean b) throws IOException {
        int j = 0;
        final int n = 0;
        if (b) {
            this.a.m(i, 2);
            i = 0;
            int n2 = 0;
            while (i < list.size()) {
                n2 += v5.z(list.get(i));
                ++i;
            }
            this.a.O(n2);
            for (i = n; i < list.size(); ++i) {
                this.a.h(list.get(i));
            }
            return;
        }
        while (j < list.size()) {
            this.a.k(i, list.get(j));
            ++j;
        }
    }
    
    @Override
    public final void z(final int n, final List<f5> list) throws IOException {
        for (int i = 0; i < list.size(); ++i) {
            this.a.o(n, list.get(i));
        }
    }
    
    @Override
    public final int zza() {
        return ha.a;
    }
}
