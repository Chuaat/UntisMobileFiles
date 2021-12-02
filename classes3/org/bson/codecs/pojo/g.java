// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.codecs.pojo;

import java.util.Iterator;

final class g implements e
{
    @Override
    public void a(final c<?> c) {
        if (c.l() == null) {
            c.g("_t");
        }
        if (c.k() == null && c.s() != null) {
            c.f(c.s().getName());
        }
        for (final k0<?> k0 : c.q()) {
            if (c.n() == null) {
                final String e = k0.e();
                if (!e.equals("_id") && !e.equals("id")) {
                    continue;
                }
                c.u(e);
            }
        }
    }
}
