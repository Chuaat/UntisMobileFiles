// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.convert;

import org.joda.time.chrono.x;
import org.joda.time.i;
import org.joda.time.l0;

class o extends a implements h, l
{
    static final o a;
    
    static {
        a = new o();
    }
    
    protected o() {
    }
    
    @Override
    public org.joda.time.a a(final Object o, final org.joda.time.a a) {
        org.joda.time.a e = a;
        if (a == null) {
            e = org.joda.time.h.e(((l0)o).t());
        }
        return e;
    }
    
    @Override
    public org.joda.time.a b(final Object o, final i i) {
        final org.joda.time.a t = ((l0)o).t();
        if (t == null) {
            return x.d0(i);
        }
        org.joda.time.a a = t;
        if (t.s() != i && (a = t.S(i)) == null) {
            a = x.d0(i);
        }
        return a;
    }
    
    @Override
    public long d(final Object o, final org.joda.time.a a) {
        return ((l0)o).n();
    }
    
    @Override
    public Class<?> g() {
        return l0.class;
    }
}
