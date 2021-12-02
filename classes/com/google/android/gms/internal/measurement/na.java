// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

final class na
{
    public static final int a(final int n, final Object o, final Object o2) {
        final ma ma = (ma)o;
        final ka ka = (ka)o2;
        if (!ma.isEmpty()) {
            final Iterator iterator = ma.entrySet().iterator();
            if (iterator.hasNext()) {
                final Map.Entry entry = iterator.next();
                entry.getKey();
                entry.getValue();
                throw null;
            }
        }
        return 0;
    }
    
    public static final Object b(final Object o, final Object o2) {
        final ma ma = (ma)o;
        final ma ma2 = (ma)o2;
        ma b = ma;
        if (!ma2.isEmpty()) {
            b = ma;
            if (!ma.f()) {
                b = ma.b();
            }
            b.d(ma2);
        }
        return b;
    }
}
