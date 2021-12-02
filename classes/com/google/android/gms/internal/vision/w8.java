// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.util.Iterator;
import java.util.Map;
import java.util.Collections;
import java.util.List;

final class w8 extends x8<Object, Object>
{
    w8(final int n) {
        super(n, null);
    }
    
    @Override
    public final void e() {
        if (!this.i()) {
            for (int i = 0; i < this.j(); ++i) {
                final Entry<Object, Object> h = (Entry<Object, Object>)((x8<Object, List<Object>>)this).h(i);
                if (h.getKey().c()) {
                    h.setValue(Collections.unmodifiableList((List<?>)h.getValue()));
                }
            }
            for (final Map.Entry<j6, V> entry : this.o()) {
                if (entry.getKey().c()) {
                    entry.setValue((V)Collections.unmodifiableList((List<?>)entry.getValue()));
                }
            }
        }
        super.e();
    }
}
