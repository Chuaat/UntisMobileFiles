// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.chrono;

import org.joda.time.field.x;
import org.joda.time.m;
import java.util.Locale;
import org.joda.time.f;
import org.joda.time.field.j;
import org.joda.time.l;
import org.joda.time.g;
import org.joda.time.field.c;

final class s extends c
{
    private static final long c = 4240986525305515528L;
    private final org.joda.time.chrono.c b;
    
    s(final org.joda.time.chrono.c b) {
        super(g.E());
        this.b = b;
    }
    
    private Object a0() {
        return this.b.k();
    }
    
    @Override
    public int D() {
        return 0;
    }
    
    @Override
    public l I() {
        return null;
    }
    
    @Override
    public boolean L() {
        return false;
    }
    
    @Override
    public long O(final long n) {
        if (this.g(n) == 0) {
            return this.b.U0(0L, 1);
        }
        return Long.MAX_VALUE;
    }
    
    @Override
    public long P(final long n) {
        if (this.g(n) == 1) {
            return this.b.U0(0L, 1);
        }
        return Long.MIN_VALUE;
    }
    
    @Override
    public long Q(final long n) {
        return this.P(n);
    }
    
    @Override
    public long R(final long n) {
        return this.P(n);
    }
    
    @Override
    public long S(final long n) {
        return this.P(n);
    }
    
    @Override
    public long T(final long n, int m0) {
        j.p(this, m0, 0, 1);
        long u0 = n;
        if (this.g(n) != m0) {
            m0 = this.b.M0(n);
            u0 = this.b.U0(n, -m0);
        }
        return u0;
    }
    
    @Override
    public long V(final long n, final String s, final Locale locale) {
        return this.T(n, t.h(locale).f(s));
    }
    
    @Override
    public int g(final long n) {
        if (this.b.M0(n) <= 0) {
            return 0;
        }
        return 1;
    }
    
    @Override
    public String m(final int n, final Locale locale) {
        return t.h(locale).g(n);
    }
    
    @Override
    public l t() {
        return x.I(m.c());
    }
    
    @Override
    public int x(final Locale locale) {
        return t.h(locale).k();
    }
    
    @Override
    public int y() {
        return 1;
    }
}
