// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.convert;

import org.joda.time.i;
import org.joda.time.h;
import org.joda.time.n0;

class q extends a implements l
{
    static final q a;
    
    static {
        a = new q();
    }
    
    protected q() {
    }
    
    @Override
    public org.joda.time.a a(final Object o, final org.joda.time.a a) {
        org.joda.time.a e = a;
        if (a == null) {
            e = h.e(((n0)o).t());
        }
        return e;
    }
    
    @Override
    public org.joda.time.a b(final Object o, final i i) {
        return this.a(o, null).S(i);
    }
    
    @Override
    public Class<?> g() {
        return n0.class;
    }
    
    @Override
    public int[] j(final n0 n0, final Object o, final org.joda.time.a a) {
        final n0 n2 = (n0)o;
        final int size = n0.size();
        final int[] array = new int[size];
        for (int i = 0; i < size; ++i) {
            array[i] = n2.j0(n0.N(i));
        }
        a.L(n0, array);
        return array;
    }
}
