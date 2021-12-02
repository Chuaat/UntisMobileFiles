// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.util.Iterator;
import java.util.Map;

final class v7 implements w7
{
    @Override
    public final Map<?, ?> a(final Object o) {
        return (Map<?, ?>)o;
    }
    
    @Override
    public final Map<?, ?> b(final Object o) {
        return (Map<?, ?>)o;
    }
    
    @Override
    public final u7<?, ?> c(final Object o) {
        final r7 r7 = (r7)o;
        throw new NoSuchMethodError();
    }
    
    @Override
    public final Object d(final Object o) {
        return t7.b().d();
    }
    
    @Override
    public final boolean e(final Object o) {
        return !((t7)o).g();
    }
    
    @Override
    public final Object f(final Object o, final Object o2) {
        final t7 t7 = (t7)o;
        final t7 t8 = (t7)o2;
        t7 d = t7;
        if (!t8.isEmpty()) {
            d = t7;
            if (!t7.g()) {
                d = t7.d();
            }
            d.c(t8);
        }
        return d;
    }
    
    @Override
    public final Object g(final Object o) {
        ((t7)o).f();
        return o;
    }
    
    @Override
    public final int h(final int n, final Object o, final Object o2) {
        final t7 t7 = (t7)o;
        final r7 r7 = (r7)o2;
        if (t7.isEmpty()) {
            return 0;
        }
        final Iterator iterator = t7.entrySet().iterator();
        if (!iterator.hasNext()) {
            return 0;
        }
        final Map.Entry entry = iterator.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }
}
