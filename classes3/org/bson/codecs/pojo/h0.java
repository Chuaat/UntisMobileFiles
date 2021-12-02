// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.codecs.pojo;

import java.util.Iterator;
import org.bson.codecs.n0;
import java.util.Collection;
import java.util.ArrayList;
import org.bson.codecs.configuration.d;
import java.util.List;

class h0 implements g0
{
    private final List<f0> a;
    
    h0(final a0<?> a0, final d d, final List<f0> list) {
        final ArrayList<Object> a2 = new ArrayList<Object>();
        if (list != null) {
            a2.addAll(list);
        }
        a2.add(new org.bson.codecs.pojo.d());
        a2.add(new y());
        a2.add(new n(d));
        a2.add(new o(a0, d));
        this.a = (List<f0>)a2;
    }
    
    @Override
    public <S> n0<S> a(final q0<S> q0) {
        final Iterator<f0> iterator = this.a.iterator();
        while (iterator.hasNext()) {
            final n0<S> a = iterator.next().a(q0, this);
            if (a != null) {
                return a;
            }
        }
        return null;
    }
}
