// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;
import java.util.Collections;
import java.util.List;

final class gb extends rb
{
    gb(final int n) {
        super(n, null);
    }
    
    @Override
    public final void a() {
        if (!this.j()) {
            for (int i = 0; i < this.b(); ++i) {
                final Entry<Comparable, Object> g = (Entry<Comparable, Object>)this.g(i);
                if (g.getKey().a()) {
                    g.setValue(Collections.unmodifiableList((List<?>)g.getValue()));
                }
            }
            for (final Map.Entry<z8, V> entry : this.c()) {
                if (entry.getKey().a()) {
                    entry.setValue((V)Collections.unmodifiableList((List<?>)entry.getValue()));
                }
            }
        }
        super.a();
    }
}
