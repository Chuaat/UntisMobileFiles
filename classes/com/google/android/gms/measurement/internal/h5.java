// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import java.util.Collection;
import java.util.ArrayList;
import androidx.annotation.c1;
import com.google.android.gms.common.internal.x;
import java.util.List;
import androidx.annotation.k0;

final class h5
{
    private long A;
    private long B;
    @k0
    private String C;
    private boolean D;
    private long E;
    private long F;
    private final z4 a;
    private final String b;
    @k0
    private String c;
    @k0
    private String d;
    @k0
    private String e;
    @k0
    private String f;
    private long g;
    private long h;
    private long i;
    @k0
    private String j;
    private long k;
    @k0
    private String l;
    private long m;
    private long n;
    private boolean o;
    private long p;
    private boolean q;
    @k0
    private String r;
    @k0
    private Boolean s;
    private long t;
    @k0
    private List<String> u;
    @k0
    private String v;
    private long w;
    private long x;
    private long y;
    private long z;
    
    @c1
    h5(final z4 a, final String b) {
        com.google.android.gms.common.internal.x.k(a);
        com.google.android.gms.common.internal.x.g(b);
        this.a = a;
        this.b = b;
        a.b().e();
    }
    
    @c1
    public final long A() {
        this.a.b().e();
        return this.p;
    }
    
    @c1
    public final void B(@k0 final String c) {
        this.a.b().e();
        this.D |= (ga.Z(this.C, c) ^ true);
        this.C = c;
    }
    
    @c1
    public final void C(final long i) {
        this.a.b().e();
        this.D |= (this.i != i);
        this.i = i;
    }
    
    @c1
    public final void D(final long g) {
        boolean b = true;
        com.google.android.gms.common.internal.x.a(g >= 0L);
        this.a.b().e();
        final boolean d = this.D;
        if (this.g == g) {
            b = false;
        }
        this.D = (b | d);
        this.g = g;
    }
    
    @c1
    public final void E(final long h) {
        this.a.b().e();
        this.D |= (this.h != h);
        this.h = h;
    }
    
    @c1
    public final void F(final boolean o) {
        this.a.b().e();
        this.D |= (this.o != o);
        this.o = o;
    }
    
    @c1
    public final void G(@k0 final Boolean b) {
        this.a.b().e();
        final boolean d = this.D;
        final Boolean s = this.s;
        final int o = ga.o;
        this.D = (d | (((s == null && b == null) || (s != null && s.equals(b))) ^ true));
        this.s = b;
    }
    
    @c1
    public final void H(@k0 final String e) {
        this.a.b().e();
        this.D |= (ga.Z(this.e, e) ^ true);
        this.e = e;
    }
    
    @c1
    public final void I(@k0 final List<String> c) {
        this.a.b().e();
        final List<String> u = this.u;
        final int o = ga.o;
        if (u != null || c != null) {
            if (u != null) {
                if (u.equals(c)) {
                    return;
                }
            }
            this.D = true;
            ArrayList<String> u2;
            if (c != null) {
                u2 = new ArrayList<String>(c);
            }
            else {
                u2 = null;
            }
            this.u = u2;
        }
    }
    
    @c1
    public final boolean J() {
        this.a.b().e();
        return this.q;
    }
    
    @c1
    public final boolean K() {
        this.a.b().e();
        return this.o;
    }
    
    @c1
    public final boolean L() {
        this.a.b().e();
        return this.D;
    }
    
    @c1
    public final long M() {
        this.a.b().e();
        return this.k;
    }
    
    @c1
    public final long N() {
        this.a.b().e();
        return this.E;
    }
    
    @c1
    public final long O() {
        this.a.b().e();
        return this.z;
    }
    
    @c1
    public final long P() {
        this.a.b().e();
        return this.A;
    }
    
    @c1
    public final long Q() {
        this.a.b().e();
        return this.y;
    }
    
    @c1
    public final long R() {
        this.a.b().e();
        return this.x;
    }
    
    @c1
    public final long S() {
        this.a.b().e();
        return this.B;
    }
    
    @c1
    public final long T() {
        this.a.b().e();
        return this.w;
    }
    
    @c1
    public final long U() {
        this.a.b().e();
        return this.n;
    }
    
    @c1
    public final long V() {
        this.a.b().e();
        return this.t;
    }
    
    @c1
    public final long W() {
        this.a.b().e();
        return this.F;
    }
    
    @c1
    public final long X() {
        this.a.b().e();
        return this.m;
    }
    
    @c1
    public final long Y() {
        this.a.b().e();
        return this.i;
    }
    
    @c1
    public final long Z() {
        this.a.b().e();
        return this.g;
    }
    
    @c1
    @k0
    public final String a() {
        this.a.b().e();
        return this.C;
    }
    
    @c1
    public final long a0() {
        this.a.b().e();
        return this.h;
    }
    
    @c1
    @k0
    public final String b() {
        this.a.b().e();
        return this.e;
    }
    
    @c1
    @k0
    public final Boolean b0() {
        this.a.b().e();
        return this.s;
    }
    
    @c1
    @k0
    public final List<String> c() {
        this.a.b().e();
        return this.u;
    }
    
    @c1
    @k0
    public final String c0() {
        this.a.b().e();
        return this.r;
    }
    
    @c1
    public final void d() {
        this.a.b().e();
        this.D = false;
    }
    
    @c1
    @k0
    public final String d0() {
        this.a.b().e();
        final String c = this.C;
        this.B(null);
        return c;
    }
    
    @c1
    public final void e() {
        this.a.b().e();
        long g;
        if ((g = this.g + 1L) > 2147483647L) {
            this.a.c().t().b("Bundle index overflow. appId", n3.w(this.b));
            g = 0L;
        }
        this.D = true;
        this.g = g;
    }
    
    @c1
    public final String e0() {
        this.a.b().e();
        return this.b;
    }
    
    @c1
    public final void f(@k0 final String s) {
        this.a.b().e();
        String r = s;
        if (TextUtils.isEmpty((CharSequence)s)) {
            r = null;
        }
        this.D |= (true ^ ga.Z(this.r, r));
        this.r = r;
    }
    
    @c1
    @k0
    public final String f0() {
        this.a.b().e();
        return this.c;
    }
    
    @c1
    public final void g(final boolean q) {
        this.a.b().e();
        this.D |= (this.q != q);
        this.q = q;
    }
    
    @c1
    @k0
    public final String g0() {
        this.a.b().e();
        return this.l;
    }
    
    @c1
    public final void h(final long p) {
        this.a.b().e();
        this.D |= (this.p != p);
        this.p = p;
    }
    
    @c1
    @k0
    public final String h0() {
        this.a.b().e();
        return this.j;
    }
    
    @c1
    public final void i(@k0 final String c) {
        this.a.b().e();
        this.D |= (ga.Z(this.c, c) ^ true);
        this.c = c;
    }
    
    @c1
    @k0
    public final String i0() {
        this.a.b().e();
        return this.f;
    }
    
    @c1
    public final void j(@k0 final String l) {
        this.a.b().e();
        this.D |= (ga.Z(this.l, l) ^ true);
        this.l = l;
    }
    
    @c1
    @k0
    public final String j0() {
        this.a.b().e();
        return this.v;
    }
    
    @c1
    public final void k(@k0 final String j) {
        this.a.b().e();
        this.D |= (ga.Z(this.j, j) ^ true);
        this.j = j;
    }
    
    @c1
    @k0
    public final String k0() {
        this.a.b().e();
        return this.d;
    }
    
    @c1
    public final void l(final long k) {
        this.a.b().e();
        this.D |= (this.k != k);
        this.k = k;
    }
    
    @c1
    public final void m(final long e) {
        this.a.b().e();
        this.D |= (this.E != e);
        this.E = e;
    }
    
    @c1
    public final void n(final long z) {
        this.a.b().e();
        this.D |= (this.z != z);
        this.z = z;
    }
    
    @c1
    public final void o(final long a) {
        this.a.b().e();
        this.D |= (this.A != a);
        this.A = a;
    }
    
    @c1
    public final void p(final long y) {
        this.a.b().e();
        this.D |= (this.y != y);
        this.y = y;
    }
    
    @c1
    public final void q(final long x) {
        this.a.b().e();
        this.D |= (this.x != x);
        this.x = x;
    }
    
    @c1
    public final void r(final long b) {
        this.a.b().e();
        this.D |= (this.B != b);
        this.B = b;
    }
    
    @c1
    public final void s(final long w) {
        this.a.b().e();
        this.D |= (this.w != w);
        this.w = w;
    }
    
    @c1
    public final void t(final long n) {
        this.a.b().e();
        this.D |= (this.n != n);
        this.n = n;
    }
    
    @c1
    public final void u(final long t) {
        this.a.b().e();
        this.D |= (this.t != t);
        this.t = t;
    }
    
    @c1
    public final void v(final long f) {
        this.a.b().e();
        this.D |= (this.F != f);
        this.F = f;
    }
    
    @c1
    public final void w(@k0 final String f) {
        this.a.b().e();
        this.D |= (ga.Z(this.f, f) ^ true);
        this.f = f;
    }
    
    @c1
    public final void x(@k0 final String s) {
        this.a.b().e();
        String v = s;
        if (TextUtils.isEmpty((CharSequence)s)) {
            v = null;
        }
        this.D |= (true ^ ga.Z(this.v, v));
        this.v = v;
    }
    
    @c1
    public final void y(@k0 final String s) {
        this.a.b().e();
        String d = s;
        if (TextUtils.isEmpty((CharSequence)s)) {
            d = null;
        }
        this.D |= (true ^ ga.Z(this.d, d));
        this.d = d;
    }
    
    @c1
    public final void z(final long m) {
        this.a.b().e();
        this.D |= (this.m != m);
        this.m = m;
    }
}
