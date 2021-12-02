// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

import java.util.Iterator;
import java.util.Map;

final class o2 implements n2
{
    @Override
    public final Object b(final Object o) {
        ((m2)o).i();
        return o;
    }
    
    @Override
    public final Object d(final Object o, final Object o2) {
        final m2 m2 = (m2)o;
        final m2 m3 = (m2)o2;
        m2 d = m2;
        if (!m3.isEmpty()) {
            d = m2;
            if (!m2.a()) {
                d = m2.d();
            }
            d.b(m3);
        }
        return d;
    }
    
    @Override
    public final l2<?, ?> e(final Object o) {
        throw new NoSuchMethodError();
    }
    
    @Override
    public final Object f(final Object o) {
        return m2.c().d();
    }
    
    @Override
    public final int g(final int n, final Object o, final Object o2) {
        final m2 m2 = (m2)o;
        if (m2.isEmpty()) {
            return 0;
        }
        final Iterator iterator = m2.entrySet().iterator();
        if (!iterator.hasNext()) {
            return 0;
        }
        final Map.Entry entry = iterator.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }
    
    @Override
    public final boolean h(final Object o) {
        return !((m2)o).a();
    }
    
    @Override
    public final Map<?, ?> i(final Object o) {
        return (Map<?, ?>)o;
    }
    
    @Override
    public final Map<?, ?> j(final Object o) {
        return (Map<?, ?>)o;
    }
}
