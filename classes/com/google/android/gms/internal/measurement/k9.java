// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.Map;
import java.util.HashMap;
import java.util.List;

public final class k9 extends j
{
    private final c I;
    
    public k9(final c i) {
        super("internal.eventLogger");
        this.I = i;
    }
    
    @Override
    public final q a(final g5 g5, final List<q> list) {
        h6.h(super.G, 3, list);
        final String k = g5.b(list.get(0)).k();
        final long n = (long)h6.a(g5.b(list.get(1)).g());
        final q b = g5.b(list.get(2));
        Map<String, Object> g6;
        if (b instanceof n) {
            g6 = h6.g((n)b);
        }
        else {
            g6 = new HashMap<String, Object>();
        }
        this.I.e(k, n, g6);
        return q.f;
    }
}
