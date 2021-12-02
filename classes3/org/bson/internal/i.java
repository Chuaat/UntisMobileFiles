// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.internal;

import java.util.Iterator;
import org.bson.codecs.n0;
import java.util.Collection;
import java.util.ArrayList;
import e7.a;
import java.util.List;
import org.bson.codecs.configuration.b;
import org.bson.codecs.configuration.d;

public final class i implements d, b, e
{
    private final List<b> a;
    private final c b;
    
    public i(final List<? extends b> c) {
        this.b = new c();
        e7.a.d("codecProviders must not be null or empty", c != null && c.size() > 0);
        this.a = new ArrayList<b>(c);
    }
    
    @Override
    public <T> n0<T> a(final Class<T> clazz) {
        return this.c(new org.bson.internal.b<T>(this, clazz));
    }
    
    @Override
    public <T> n0<T> b(final Class<T> clazz, final d d) {
        final Iterator<b> iterator = this.a.iterator();
        while (iterator.hasNext()) {
            final n0<T> b = iterator.next().b(clazz, d);
            if (b != null) {
                return b;
            }
        }
        return null;
    }
    
    @Override
    public <T> n0<T> c(final org.bson.internal.b<T> b) {
        if (!this.b.a(b.b())) {
            final Iterator<b> iterator = this.a.iterator();
            while (iterator.hasNext()) {
                final n0<T> b2 = iterator.next().b(b.b(), b);
                if (b2 != null) {
                    this.b.c(b.b(), b2);
                    return b2;
                }
            }
            this.b.c(b.b(), null);
        }
        return this.b.b(b.b());
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || i.class != o.getClass()) {
            return false;
        }
        final i i = (i)o;
        if (this.a.size() != i.a.size()) {
            return false;
        }
        for (int j = 0; j < this.a.size(); ++j) {
            if (this.a.get(j).getClass() != i.a.get(j).getClass()) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode();
    }
}
