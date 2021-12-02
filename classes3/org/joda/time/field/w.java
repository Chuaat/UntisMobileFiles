// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.field;

import java.util.Locale;
import org.joda.time.n0;
import org.joda.time.l;
import org.joda.time.g;
import java.util.HashMap;
import java.io.Serializable;
import org.joda.time.f;

public final class w extends f implements Serializable
{
    private static final long I = -1934618396111902255L;
    private static HashMap<g, w> J;
    private final g G;
    private final l H;
    
    private w(final g g, final l h) {
        if (g != null && h != null) {
            this.G = g;
            this.H = h;
            return;
        }
        throw new IllegalArgumentException();
    }
    
    public static w Z(final g g, final l l) {
        synchronized (w.class) {
            final HashMap<g, w> j = w.J;
            w w = null;
            if (j == null) {
                org.joda.time.field.w.J = new HashMap<g, w>(7);
            }
            else {
                final w w2 = j.get(g);
                if (w2 == null || w2.t() == l) {
                    w = w2;
                }
            }
            w value = w;
            if (w == null) {
                value = new w(g, l);
                org.joda.time.field.w.J.put(g, value);
            }
            return value;
        }
    }
    
    private Object a0() {
        return Z(this.G, this.H);
    }
    
    private UnsupportedOperationException b0() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.G);
        sb.append(" field is unsupported");
        return new UnsupportedOperationException(sb.toString());
    }
    
    @Override
    public int B(final n0 n0) {
        throw this.b0();
    }
    
    @Override
    public int C(final n0 n0, final int[] array) {
        throw this.b0();
    }
    
    @Override
    public int D() {
        throw this.b0();
    }
    
    @Override
    public int E(final long n) {
        throw this.b0();
    }
    
    @Override
    public int F(final n0 n0) {
        throw this.b0();
    }
    
    @Override
    public int G(final n0 n0, final int[] array) {
        throw this.b0();
    }
    
    @Override
    public String H() {
        return this.G.H();
    }
    
    @Override
    public l I() {
        return null;
    }
    
    @Override
    public g J() {
        return this.G;
    }
    
    @Override
    public boolean K(final long n) {
        throw this.b0();
    }
    
    @Override
    public boolean L() {
        return false;
    }
    
    @Override
    public boolean M() {
        return false;
    }
    
    @Override
    public long N(final long n) {
        throw this.b0();
    }
    
    @Override
    public long O(final long n) {
        throw this.b0();
    }
    
    @Override
    public long P(final long n) {
        throw this.b0();
    }
    
    @Override
    public long Q(final long n) {
        throw this.b0();
    }
    
    @Override
    public long R(final long n) {
        throw this.b0();
    }
    
    @Override
    public long S(final long n) {
        throw this.b0();
    }
    
    @Override
    public long T(final long n, final int n2) {
        throw this.b0();
    }
    
    @Override
    public long U(final long n, final String s) {
        throw this.b0();
    }
    
    @Override
    public long V(final long n, final String s, final Locale locale) {
        throw this.b0();
    }
    
    @Override
    public int[] W(final n0 n0, final int n2, final int[] array, final int n3) {
        throw this.b0();
    }
    
    @Override
    public int[] X(final n0 n0, final int n2, final int[] array, final String s, final Locale locale) {
        throw this.b0();
    }
    
    @Override
    public long a(final long n, final int n2) {
        return this.t().b(n, n2);
    }
    
    @Override
    public long b(final long n, final long n2) {
        return this.t().d(n, n2);
    }
    
    @Override
    public int[] c(final n0 n0, final int n2, final int[] array, final int n3) {
        throw this.b0();
    }
    
    @Override
    public long d(final long n, final int n2) {
        throw this.b0();
    }
    
    @Override
    public int[] e(final n0 n0, final int n2, final int[] array, final int n3) {
        throw this.b0();
    }
    
    @Override
    public int[] f(final n0 n0, final int n2, final int[] array, final int n3) {
        throw this.b0();
    }
    
    @Override
    public int g(final long n) {
        throw this.b0();
    }
    
    @Override
    public String h(final int n, final Locale locale) {
        throw this.b0();
    }
    
    @Override
    public String i(final long n) {
        throw this.b0();
    }
    
    @Override
    public String j(final long n, final Locale locale) {
        throw this.b0();
    }
    
    @Override
    public String k(final n0 n0, final int n2, final Locale locale) {
        throw this.b0();
    }
    
    @Override
    public String l(final n0 n0, final Locale locale) {
        throw this.b0();
    }
    
    @Override
    public String m(final int n, final Locale locale) {
        throw this.b0();
    }
    
    @Override
    public String n(final long n) {
        throw this.b0();
    }
    
    @Override
    public String o(final long n, final Locale locale) {
        throw this.b0();
    }
    
    @Override
    public String p(final n0 n0, final int n2, final Locale locale) {
        throw this.b0();
    }
    
    @Override
    public String q(final n0 n0, final Locale locale) {
        throw this.b0();
    }
    
    @Override
    public int r(final long n, final long n2) {
        return this.t().f(n, n2);
    }
    
    @Override
    public long s(final long n, final long n2) {
        return this.t().g(n, n2);
    }
    
    @Override
    public l t() {
        return this.H;
    }
    
    @Override
    public String toString() {
        return "UnsupportedDateTimeField";
    }
    
    @Override
    public int u(final long n) {
        throw this.b0();
    }
    
    @Override
    public l v() {
        return null;
    }
    
    @Override
    public int w(final Locale locale) {
        throw this.b0();
    }
    
    @Override
    public int x(final Locale locale) {
        throw this.b0();
    }
    
    @Override
    public int y() {
        throw this.b0();
    }
    
    @Override
    public int z(final long n) {
        throw this.b0();
    }
}
