// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.chrono;

import java.util.Locale;

final class u extends h
{
    private static final long j = -4748157875845286249L;
    
    u(final org.joda.time.chrono.c c) {
        super(c, 2);
    }
    
    @Override
    protected int Z(final String s, final Locale locale) {
        return t.h(locale).r(s);
    }
    
    @Override
    public String h(final int n, final Locale locale) {
        return t.h(locale).s(n);
    }
    
    @Override
    public String m(final int n, final Locale locale) {
        return t.h(locale).t(n);
    }
    
    @Override
    public int w(final Locale locale) {
        return t.h(locale).m();
    }
    
    @Override
    public int x(final Locale locale) {
        return t.h(locale).n();
    }
}
