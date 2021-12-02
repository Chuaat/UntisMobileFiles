// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.codecs.pojo;

import org.bson.o0;
import org.bson.types.ObjectId;

final class h implements e
{
    @Override
    public void a(final c<?> c) {
        if (c.m() == null && c.n() != null) {
            final k0<?> p = c.p(c.n());
            if (p != null) {
                final Class<?> a = p.j().a();
                Object o;
                if (c.m() == null && a.equals(ObjectId.class)) {
                    o = q.a;
                }
                else {
                    if (c.m() != null || !a.equals(o0.class)) {
                        return;
                    }
                    o = q.b;
                }
                c.t((p<?>)o);
            }
        }
    }
}
