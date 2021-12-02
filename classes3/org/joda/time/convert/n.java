// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.convert;

import org.joda.time.o0;
import org.joda.time.k0;
import org.joda.time.h;
import org.joda.time.i0;

class n extends a implements g, m
{
    static final n a;
    
    static {
        a = new n();
    }
    
    protected n() {
    }
    
    @Override
    public void e(final i0 i0, final Object o, final org.joda.time.a a) {
        final int[] n = h.e(a).n(i0, ((k0)o).n());
        for (int j = 0; j < n.length; ++j) {
            i0.b(j, n[j]);
        }
    }
    
    @Override
    public long f(final Object o) {
        return ((k0)o).n();
    }
    
    @Override
    public Class<?> g() {
        return k0.class;
    }
}
