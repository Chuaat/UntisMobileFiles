// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.convert;

import org.joda.time.h0;
import org.joda.time.o0;
import org.joda.time.h;
import org.joda.time.m0;
import org.joda.time.i0;

class p extends a implements i, g, m
{
    static final p a;
    
    static {
        a = new p();
    }
    
    protected p() {
    }
    
    @Override
    public boolean c(final Object o, final org.joda.time.a a) {
        return true;
    }
    
    @Override
    public void e(final i0 i0, final Object o, org.joda.time.a l) {
        final m0 m0 = (m0)o;
        if (l == null) {
            l = h.l(m0);
        }
        final int[] o2 = l.o(i0, m0.n(), m0.I());
        for (int j = 0; j < o2.length; ++j) {
            i0.b(j, o2[j]);
        }
    }
    
    @Override
    public long f(final Object o) {
        return ((m0)o).d();
    }
    
    @Override
    public Class<?> g() {
        return m0.class;
    }
    
    @Override
    public void k(final h0 h0, final Object o, final org.joda.time.a a) {
        final m0 m0 = (m0)o;
        h0.m(m0);
        if (a != null) {
            h0.J(a);
        }
        else {
            h0.J(m0.t());
        }
    }
}
