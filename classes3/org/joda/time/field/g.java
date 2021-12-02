// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.field;

import java.util.Locale;
import org.joda.time.n0;
import org.joda.time.l;
import java.io.Serializable;
import org.joda.time.f;

public class g extends f implements Serializable
{
    private static final long J = -4730164440214502503L;
    private final f G;
    private final l H;
    private final org.joda.time.g I;
    
    public g(final f f) {
        this(f, null);
    }
    
    public g(final f f, final org.joda.time.g g) {
        this(f, null, g);
    }
    
    public g(final f g, final l h, final org.joda.time.g g2) {
        if (g != null) {
            this.G = g;
            this.H = h;
            org.joda.time.g j;
            if ((j = g2) == null) {
                j = g.J();
            }
            this.I = j;
            return;
        }
        throw new IllegalArgumentException("The field must not be null");
    }
    
    @Override
    public int B(final n0 n0) {
        return this.G.B(n0);
    }
    
    @Override
    public int C(final n0 n0, final int[] array) {
        return this.G.C(n0, array);
    }
    
    @Override
    public int D() {
        return this.G.D();
    }
    
    @Override
    public int E(final long n) {
        return this.G.E(n);
    }
    
    @Override
    public int F(final n0 n0) {
        return this.G.F(n0);
    }
    
    @Override
    public int G(final n0 n0, final int[] array) {
        return this.G.G(n0, array);
    }
    
    @Override
    public String H() {
        return this.I.H();
    }
    
    @Override
    public l I() {
        final l h = this.H;
        if (h != null) {
            return h;
        }
        return this.G.I();
    }
    
    @Override
    public org.joda.time.g J() {
        return this.I;
    }
    
    @Override
    public boolean K(final long n) {
        return this.G.K(n);
    }
    
    @Override
    public boolean L() {
        return this.G.L();
    }
    
    @Override
    public boolean M() {
        return this.G.M();
    }
    
    @Override
    public long N(final long n) {
        return this.G.N(n);
    }
    
    @Override
    public long O(final long n) {
        return this.G.O(n);
    }
    
    @Override
    public long P(final long n) {
        return this.G.P(n);
    }
    
    @Override
    public long Q(final long n) {
        return this.G.Q(n);
    }
    
    @Override
    public long R(final long n) {
        return this.G.R(n);
    }
    
    @Override
    public long S(final long n) {
        return this.G.S(n);
    }
    
    @Override
    public long T(final long n, final int n2) {
        return this.G.T(n, n2);
    }
    
    @Override
    public long U(final long n, final String s) {
        return this.G.U(n, s);
    }
    
    @Override
    public long V(final long n, final String s, final Locale locale) {
        return this.G.V(n, s, locale);
    }
    
    @Override
    public int[] W(final n0 n0, final int n2, final int[] array, final int n3) {
        return this.G.W(n0, n2, array, n3);
    }
    
    @Override
    public int[] X(final n0 n0, final int n2, final int[] array, final String s, final Locale locale) {
        return this.G.X(n0, n2, array, s, locale);
    }
    
    public final f Z() {
        return this.G;
    }
    
    @Override
    public long a(final long n, final int n2) {
        return this.G.a(n, n2);
    }
    
    @Override
    public long b(final long n, final long n2) {
        return this.G.b(n, n2);
    }
    
    @Override
    public int[] c(final n0 n0, final int n2, final int[] array, final int n3) {
        return this.G.c(n0, n2, array, n3);
    }
    
    @Override
    public long d(final long n, final int n2) {
        return this.G.d(n, n2);
    }
    
    @Override
    public int[] e(final n0 n0, final int n2, final int[] array, final int n3) {
        return this.G.e(n0, n2, array, n3);
    }
    
    @Override
    public int[] f(final n0 n0, final int n2, final int[] array, final int n3) {
        return this.G.f(n0, n2, array, n3);
    }
    
    @Override
    public int g(final long n) {
        return this.G.g(n);
    }
    
    @Override
    public String h(final int n, final Locale locale) {
        return this.G.h(n, locale);
    }
    
    @Override
    public String i(final long n) {
        return this.G.i(n);
    }
    
    @Override
    public String j(final long n, final Locale locale) {
        return this.G.j(n, locale);
    }
    
    @Override
    public String k(final n0 n0, final int n2, final Locale locale) {
        return this.G.k(n0, n2, locale);
    }
    
    @Override
    public String l(final n0 n0, final Locale locale) {
        return this.G.l(n0, locale);
    }
    
    @Override
    public String m(final int n, final Locale locale) {
        return this.G.m(n, locale);
    }
    
    @Override
    public String n(final long n) {
        return this.G.n(n);
    }
    
    @Override
    public String o(final long n, final Locale locale) {
        return this.G.o(n, locale);
    }
    
    @Override
    public String p(final n0 n0, final int n2, final Locale locale) {
        return this.G.p(n0, n2, locale);
    }
    
    @Override
    public String q(final n0 n0, final Locale locale) {
        return this.G.q(n0, locale);
    }
    
    @Override
    public int r(final long n, final long n2) {
        return this.G.r(n, n2);
    }
    
    @Override
    public long s(final long n, final long n2) {
        return this.G.s(n, n2);
    }
    
    @Override
    public l t() {
        return this.G.t();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("DateTimeField[");
        sb.append(this.H());
        sb.append(']');
        return sb.toString();
    }
    
    @Override
    public int u(final long n) {
        return this.G.u(n);
    }
    
    @Override
    public l v() {
        return this.G.v();
    }
    
    @Override
    public int w(final Locale locale) {
        return this.G.w(locale);
    }
    
    @Override
    public int x(final Locale locale) {
        return this.G.x(locale);
    }
    
    @Override
    public int y() {
        return this.G.y();
    }
    
    @Override
    public int z(final long n) {
        return this.G.z(n);
    }
}
