// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.base;

import java.util.Locale;
import org.joda.time.format.b;
import org.joda.time.convert.l;
import org.joda.time.convert.d;
import org.joda.time.h;
import org.joda.time.a;
import java.io.Serializable;
import org.joda.time.n0;

public abstract class k extends e implements n0, Serializable
{
    private static final long I = 2353678632973660L;
    private final a G;
    private final int[] H;
    
    protected k() {
        this(h.c(), null);
    }
    
    protected k(final long n) {
        this(n, null);
    }
    
    protected k(final long n, a e) {
        e = h.e(e);
        this.G = e.R();
        this.H = e.m(this, n);
    }
    
    protected k(final Object o, a e) {
        final l r = d.m().r(o);
        e = h.e(r.a(o, e));
        this.G = e.R();
        this.H = r.j(this, o, e);
    }
    
    protected k(final Object o, a e, final b b) {
        final l r = d.m().r(o);
        e = h.e(r.a(o, e));
        this.G = e.R();
        this.H = r.i(this, o, e, b);
    }
    
    protected k(final a a) {
        this(h.c(), a);
    }
    
    protected k(final k k, final a a) {
        this.G = a.R();
        this.H = k.H;
    }
    
    protected k(final k k, final int[] h) {
        this.G = k.G;
        this.H = h;
    }
    
    protected k(final int[] h, a e) {
        e = h.e(e);
        this.G = e.R();
        e.L(this, h);
        this.H = h;
    }
    
    public String A2(final String s, final Locale locale) throws IllegalArgumentException {
        if (s == null) {
            return this.toString();
        }
        return org.joda.time.format.a.f(s).P(locale).w(this);
    }
    
    @Override
    public int e0(final int n) {
        return this.H[n];
    }
    
    public String g4(final String s) {
        if (s == null) {
            return this.toString();
        }
        return org.joda.time.format.a.f(s).w(this);
    }
    
    @Override
    public int[] h() {
        return this.H.clone();
    }
    
    @Override
    public a t() {
        return this.G;
    }
    
    protected void u(final int n, final int n2) {
        final int[] w = this.Q3(n).W(this, n, this.H, n2);
        final int[] h = this.H;
        System.arraycopy(w, 0, h, 0, h.length);
    }
    
    protected void v(final int[] array) {
        this.t().L(this, array);
        final int[] h = this.H;
        System.arraycopy(array, 0, h, 0, h.length);
    }
}
