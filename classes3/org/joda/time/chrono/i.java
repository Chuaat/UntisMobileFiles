// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.chrono;

import org.joda.time.field.x;
import org.joda.time.m;
import org.joda.time.o;
import java.util.Locale;
import org.joda.time.f;
import org.joda.time.field.j;
import org.joda.time.l;
import org.joda.time.g;
import org.joda.time.field.c;

final class i extends c
{
    private static final int c = 1;
    private final String b;
    
    i(final String b) {
        super(g.E());
        this.b = b;
    }
    
    @Override
    public int D() {
        return 1;
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
        return Long.MAX_VALUE;
    }
    
    @Override
    public long P(final long n) {
        return Long.MIN_VALUE;
    }
    
    @Override
    public long Q(final long n) {
        return Long.MIN_VALUE;
    }
    
    @Override
    public long R(final long n) {
        return Long.MIN_VALUE;
    }
    
    @Override
    public long S(final long n) {
        return Long.MIN_VALUE;
    }
    
    @Override
    public long T(final long n, final int n2) {
        j.p(this, n2, 1, 1);
        return n;
    }
    
    @Override
    public long V(final long n, final String s, final Locale locale) {
        if (!this.b.equals(s) && !"1".equals(s)) {
            throw new o(g.E(), s);
        }
        return n;
    }
    
    @Override
    public int g(final long n) {
        return 1;
    }
    
    @Override
    public String m(final int n, final Locale locale) {
        return this.b;
    }
    
    @Override
    public l t() {
        return x.I(m.c());
    }
    
    @Override
    public int x(final Locale locale) {
        return this.b.length();
    }
    
    @Override
    public int y() {
        return 1;
    }
}
