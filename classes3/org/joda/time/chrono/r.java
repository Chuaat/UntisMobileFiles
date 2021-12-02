// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.chrono;

import java.util.Locale;
import org.joda.time.g;
import org.joda.time.l;
import org.joda.time.field.p;

final class r extends p
{
    private static final long f = -3857947176719041436L;
    private final org.joda.time.chrono.c e;
    
    r(final org.joda.time.chrono.c e, final l l) {
        super(g.C(), l);
        this.e = e;
    }
    
    private Object c0() {
        return this.e.h();
    }
    
    @Override
    public int D() {
        return 1;
    }
    
    @Override
    public l I() {
        return this.e.N();
    }
    
    @Override
    protected int Z(final String s, final Locale locale) {
        return t.h(locale).c(s);
    }
    
    @Override
    public int g(final long n) {
        return this.e.o0(n);
    }
    
    @Override
    public String h(final int n, final Locale locale) {
        return t.h(locale).d(n);
    }
    
    @Override
    public String m(final int n, final Locale locale) {
        return t.h(locale).e(n);
    }
    
    @Override
    public int w(final Locale locale) {
        return t.h(locale).i();
    }
    
    @Override
    public int x(final Locale locale) {
        return t.h(locale).j();
    }
    
    @Override
    public int y() {
        return 7;
    }
}
