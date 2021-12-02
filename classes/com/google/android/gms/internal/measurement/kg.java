// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.List;

public final class kg extends j
{
    private final og I;
    
    public kg(final og i) {
        super("internal.registerCallback");
        this.I = i;
    }
    
    @Override
    public final q a(final g5 g5, final List<q> list) {
        h6.h(super.G, 3, list);
        final String k = g5.b(list.get(0)).k();
        final q b = g5.b(list.get(1));
        if (!(b instanceof p)) {
            throw new IllegalArgumentException("Invalid callback type");
        }
        final q b2 = g5.b(list.get(2));
        if (!(b2 instanceof n)) {
            throw new IllegalArgumentException("Invalid callback params");
        }
        final n n = (n)b2;
        if (n.b("type")) {
            final String i = n.h("type").k();
            int b3;
            if (n.b("priority")) {
                b3 = h6.b(n.h("priority").g());
            }
            else {
                b3 = 1000;
            }
            this.I.a(k, b3, (p)b, i);
            return q.f;
        }
        throw new IllegalArgumentException("Undefined rule type");
    }
}
