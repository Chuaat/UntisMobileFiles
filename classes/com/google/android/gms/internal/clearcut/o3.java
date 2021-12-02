// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

import java.util.Iterator;
import java.util.Map;
import java.util.Collections;
import java.util.List;

final class o3 extends n3<Object, Object>
{
    o3(final int n) {
        super(n, null);
    }
    
    @Override
    public final void s() {
        if (!this.a()) {
            for (int i = 0; i < this.n(); ++i) {
                final Entry<Object, Object> g = (Entry<Object, Object>)((n3<Object, List<Object>>)this).g(i);
                if (g.getKey().L()) {
                    g.setValue(Collections.unmodifiableList((List<?>)g.getValue()));
                }
            }
            for (final Map.Entry<d1, V> entry : this.o()) {
                if (entry.getKey().L()) {
                    entry.setValue((V)Collections.unmodifiableList((List<?>)entry.getValue()));
                }
            }
        }
        super.s();
    }
}
