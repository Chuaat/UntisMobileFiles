// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

import java.util.Iterator;
import java.util.Map;
import java.util.List;
import java.io.IOException;

final class r0 implements x4
{
    private final p0 a;
    
    private r0(p0 a) {
        a = l1.e(a, "output");
        this.a = a;
        a.a = this;
    }
    
    public static r0 a(final p0 p) {
        final r0 a = p.a;
        if (a != null) {
            return a;
        }
        return new r0(p);
    }
    
    @Override
    public final void A(final int n, final int n2) throws IOException {
        this.a.b0(n, n2);
    }
    
    @Override
    public final void B(int i, final List<Float> list, final boolean b) throws IOException {
        int j = 0;
        final int n = 0;
        if (b) {
            this.a.G(i, 2);
            i = 0;
            int n2 = 0;
            while (i < list.size()) {
                n2 += p0.x(list.get(i));
                ++i;
            }
            this.a.z0(n2);
            for (i = n; i < list.size(); ++i) {
                this.a.i(list.get(i));
            }
            return;
        }
        while (j < list.size()) {
            this.a.k(i, list.get(j));
            ++j;
        }
    }
    
    @Override
    public final void C(final int n, final int n2) throws IOException {
        this.a.g0(n, n2);
    }
    
    @Override
    public final void D(final int n, final List<String> list) throws IOException {
        final boolean b = list instanceof a2;
        int i = 0;
        final int n2 = 0;
        if (b) {
            final a2 a2 = (a2)list;
            for (int j = n2; j < list.size(); ++j) {
                final Object q5 = a2.q5(j);
                if (q5 instanceof String) {
                    this.a.p(n, (String)q5);
                }
                else {
                    this.a.m(n, (d0)q5);
                }
            }
            return;
        }
        while (i < list.size()) {
            this.a.p(n, list.get(i));
            ++i;
        }
    }
    
    @Override
    public final void E(final int n, final long n2) throws IOException {
        this.a.U(n, n2);
    }
    
    @Override
    public final void F(final int n, final List<?> list, final k3 k3) throws IOException {
        for (int i = 0; i < list.size(); ++i) {
            this.O(n, list.get(i), k3);
        }
    }
    
    @Override
    public final void G(final int n, final boolean b) throws IOException {
        this.a.K(n, b);
    }
    
    @Override
    public final void H(final int n, final List<?> list, final k3 k3) throws IOException {
        for (int i = 0; i < list.size(); ++i) {
            this.M(n, list.get(i), k3);
        }
    }
    
    @Override
    public final void I(final int n) throws IOException {
        this.a.G(n, 4);
    }
    
    @Override
    public final void J(final int n, final long n2) throws IOException {
        this.a.l(n, n2);
    }
    
    @Override
    public final void K(final int n, final int n2) throws IOException {
        this.a.T(n, n2);
    }
    
    @Override
    public final void L(final int n, final d0 d0) throws IOException {
        this.a.m(n, d0);
    }
    
    @Override
    public final void M(final int n, final Object o, final k3 k3) throws IOException {
        this.a.o(n, (s2)o, k3);
    }
    
    @Override
    public final void N(final int n) throws IOException {
        this.a.G(n, 3);
    }
    
    @Override
    public final void O(final int n, final Object o, final k3 k3) throws IOException {
        final p0 a = this.a;
        final s2 s2 = (s2)o;
        a.G(n, 3);
        k3.c(s2, a.a);
        a.G(n, 4);
    }
    
    @Override
    public final int P() {
        return j1.g.l;
    }
    
    @Override
    public final <K, V> void Q(final int n, final l2<K, V> l2, final Map<K, V> map) throws IOException {
        for (final Map.Entry<K, V> entry : map.entrySet()) {
            this.a.G(n, 2);
            this.a.z0(k2.a(l2, entry.getKey(), entry.getValue()));
            k2.b(this.a, (l2<K, V>)l2, (K)entry.getKey(), (V)entry.getValue());
        }
    }
    
    @Override
    public final void R(final int n, final int n2) throws IOException {
        this.a.j0(n, n2);
    }
    
    @Override
    public final void b(int i, final List<Boolean> list, final boolean b) throws IOException {
        int j = 0;
        final int n = 0;
        if (b) {
            this.a.G(i, 2);
            int k = 0;
            i = 0;
            while (k < list.size()) {
                i += p0.F(list.get(k));
                ++k;
            }
            this.a.z0(i);
            for (i = n; i < list.size(); ++i) {
                this.a.t(list.get(i));
            }
            return;
        }
        while (j < list.size()) {
            this.a.K(i, list.get(j));
            ++j;
        }
    }
    
    @Override
    public final void c(final int n, final long n2) throws IOException {
        this.a.H(n, n2);
    }
    
    @Override
    public final void e(int i, final List<Integer> list, final boolean b) throws IOException {
        int j = 0;
        final int n = 0;
        if (b) {
            this.a.G(i, 2);
            i = 0;
            int n2 = 0;
            while (i < list.size()) {
                n2 += p0.D0(list.get(i));
                ++i;
            }
            this.a.z0(n2);
            for (i = n; i < list.size(); ++i) {
                this.a.y0(list.get(i));
            }
            return;
        }
        while (j < list.size()) {
            this.a.T(i, list.get(j));
            ++j;
        }
    }
    
    @Override
    public final void f(int i, final List<Integer> list, final boolean b) throws IOException {
        int j = 0;
        final int n = 0;
        if (b) {
            this.a.G(i, 2);
            int k = 0;
            i = 0;
            while (k < list.size()) {
                i += p0.I0(list.get(k));
                ++k;
            }
            this.a.z0(i);
            for (i = n; i < list.size(); ++i) {
                this.a.y0(list.get(i));
            }
            return;
        }
        while (j < list.size()) {
            this.a.T(i, list.get(j));
            ++j;
        }
    }
    
    @Override
    public final void g(final int n, final int n2) throws IOException {
        this.a.T(n, n2);
    }
    
    @Override
    public final void h(final int n, final long n2) throws IOException {
        this.a.U(n, n2);
    }
    
    @Override
    public final void i(final int n, final Object o) throws IOException {
        if (o instanceof d0) {
            this.a.I(n, (d0)o);
            return;
        }
        this.a.J(n, (s2)o);
    }
    
    @Override
    public final void j(int i, final List<Long> list, final boolean b) throws IOException {
        int j = 0;
        final int n = 0;
        if (b) {
            this.a.G(i, 2);
            int k = 0;
            i = 0;
            while (k < list.size()) {
                i += p0.f0(list.get(k));
                ++k;
            }
            this.a.z0(i);
            for (i = n; i < list.size(); ++i) {
                this.a.L(list.get(i));
            }
            return;
        }
        while (j < list.size()) {
            this.a.l(i, list.get(j));
            ++j;
        }
    }
    
    @Override
    public final void k(int i, final List<Long> list, final boolean b) throws IOException {
        int j = 0;
        final int n = 0;
        if (b) {
            this.a.G(i, 2);
            i = 0;
            int n2 = 0;
            while (i < list.size()) {
                n2 += p0.t0(list.get(i));
                ++i;
            }
            this.a.z0(n2);
            for (i = n; i < list.size(); ++i) {
                this.a.c0(list.get(i));
            }
            return;
        }
        while (j < list.size()) {
            this.a.U(i, list.get(j));
            ++j;
        }
    }
    
    @Override
    public final void l(int i, final List<Integer> list, final boolean b) throws IOException {
        int j = 0;
        final int n = 0;
        if (b) {
            this.a.G(i, 2);
            i = 0;
            int n2 = 0;
            while (i < list.size()) {
                n2 += p0.G0(list.get(i));
                ++i;
            }
            this.a.z0(n2);
            for (i = n; i < list.size(); ++i) {
                this.a.B0(list.get(i));
            }
            return;
        }
        while (j < list.size()) {
            this.a.j0(i, list.get(j));
            ++j;
        }
    }
    
    @Override
    public final void m(final int n, final String s) throws IOException {
        this.a.p(n, s);
    }
    
    @Override
    public final void n(int i, final List<Integer> list, final boolean b) throws IOException {
        int j = 0;
        final int n = 0;
        if (b) {
            this.a.G(i, 2);
            i = 0;
            int n2 = 0;
            while (i < list.size()) {
                n2 += p0.E0(list.get(i));
                ++i;
            }
            this.a.z0(n2);
            for (i = n; i < list.size(); ++i) {
                this.a.z0(list.get(i));
            }
            return;
        }
        while (j < list.size()) {
            this.a.b0(i, list.get(j));
            ++j;
        }
    }
    
    @Override
    public final void o(int i, final List<Integer> list, final boolean b) throws IOException {
        int j = 0;
        final int n = 0;
        if (b) {
            this.a.G(i, 2);
            i = 0;
            int n2 = 0;
            while (i < list.size()) {
                n2 += p0.H0(list.get(i));
                ++i;
            }
            this.a.z0(n2);
            for (i = n; i < list.size(); ++i) {
                this.a.B0(list.get(i));
            }
            return;
        }
        while (j < list.size()) {
            this.a.j0(i, list.get(j));
            ++j;
        }
    }
    
    @Override
    public final void p(final int n, final long n2) throws IOException {
        this.a.l(n, n2);
    }
    
    @Override
    public final void q(final int n, final double n2) throws IOException {
        this.a.j(n, n2);
    }
    
    @Override
    public final void r(final int n, final float n2) throws IOException {
        this.a.k(n, n2);
    }
    
    @Override
    public final void t(int i, final List<Long> list, final boolean b) throws IOException {
        int j = 0;
        final int n = 0;
        if (b) {
            this.a.G(i, 2);
            int k = 0;
            i = 0;
            while (k < list.size()) {
                i += p0.q0(list.get(k));
                ++k;
            }
            this.a.z0(i);
            for (i = n; i < list.size(); ++i) {
                this.a.c0(list.get(i));
            }
            return;
        }
        while (j < list.size()) {
            this.a.U(i, list.get(j));
            ++j;
        }
    }
    
    @Override
    public final void u(final int n, final int n2) throws IOException {
        this.a.j0(n, n2);
    }
    
    @Override
    public final void v(int i, final List<Long> list, final boolean b) throws IOException {
        int j = 0;
        final int n = 0;
        if (b) {
            this.a.G(i, 2);
            i = 0;
            int n2 = 0;
            while (i < list.size()) {
                n2 += p0.m0(list.get(i));
                ++i;
            }
            this.a.z0(n2);
            for (i = n; i < list.size(); ++i) {
                this.a.V(list.get(i));
            }
            return;
        }
        while (j < list.size()) {
            this.a.H(i, list.get(j));
            ++j;
        }
    }
    
    @Override
    public final void w(int i, final List<Long> list, final boolean b) throws IOException {
        int j = 0;
        final int n = 0;
        if (b) {
            this.a.G(i, 2);
            int k = 0;
            i = 0;
            while (k < list.size()) {
                i += p0.i0(list.get(k));
                ++k;
            }
            this.a.z0(i);
            for (i = n; i < list.size(); ++i) {
                this.a.L(list.get(i));
            }
            return;
        }
        while (j < list.size()) {
            this.a.l(i, list.get(j));
            ++j;
        }
    }
    
    @Override
    public final void x(int i, final List<Integer> list, final boolean b) throws IOException {
        int j = 0;
        final int n = 0;
        if (b) {
            this.a.G(i, 2);
            i = 0;
            int n2 = 0;
            while (i < list.size()) {
                n2 += p0.F0(list.get(i));
                ++i;
            }
            this.a.z0(n2);
            for (i = n; i < list.size(); ++i) {
                this.a.A0(list.get(i));
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
            this.a.G(i, 2);
            i = 0;
            int n2 = 0;
            while (i < list.size()) {
                n2 += p0.w(list.get(i));
                ++i;
            }
            this.a.z0(n2);
            for (i = n; i < list.size(); ++i) {
                this.a.h(list.get(i));
            }
            return;
        }
        while (j < list.size()) {
            this.a.j(i, list.get(j));
            ++j;
        }
    }
    
    @Override
    public final void z(final int n, final List<d0> list) throws IOException {
        for (int i = 0; i < list.size(); ++i) {
            this.a.m(n, list.get(i));
        }
    }
}
