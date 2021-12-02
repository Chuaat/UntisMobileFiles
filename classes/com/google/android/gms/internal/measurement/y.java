// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public final class y
{
    final Map<String, x> a;
    final l0 b;
    
    public y() {
        this.a = new HashMap<String, x>();
        this.b = new l0();
        this.b(new w());
        this.b(new z());
        this.b(new a0());
        this.b(new e0());
        this.b(new j0());
        this.b(new k0());
        this.b(new m0());
    }
    
    public final q a(final g5 g5, final q q) {
        h6.c(g5);
        if (q instanceof r) {
            final r r = (r)q;
            final ArrayList<q> b = r.b();
            final String a = r.a();
            x b2;
            if (this.a.containsKey(a)) {
                b2 = this.a.get(a);
            }
            else {
                b2 = this.b;
            }
            return b2.a(a, g5, b);
        }
        return q;
    }
    
    final void b(final x x) {
        final Iterator<n0> iterator = x.a.iterator();
        while (iterator.hasNext()) {
            this.a.put(iterator.next().d().toString(), x);
        }
    }
}
