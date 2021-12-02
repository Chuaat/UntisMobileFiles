// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.internal;

import org.bson.codecs.l1;
import org.bson.codecs.configuration.d;
import org.bson.codecs.n0;
import e7.a;
import org.bson.q1;
import org.bson.codecs.configuration.b;

public class h implements e
{
    private final b a;
    private final c b;
    private final q1 c;
    
    h(final b b, final q1 q1) {
        this.b = new c();
        this.c = e7.a.e("uuidRepresentation", q1);
        this.a = e7.a.e("wrapped", b);
    }
    
    @Override
    public <T> n0<T> a(final Class<T> clazz) {
        return this.c(new org.bson.internal.b<T>(this, clazz));
    }
    
    public q1 b() {
        return this.c;
    }
    
    @Override
    public <T> n0<T> c(final org.bson.internal.b<T> b) {
        if (!this.b.a(b.b())) {
            n0<T> n2;
            final n0<T> n0 = n2 = this.a.b(b.b(), b);
            if (n0 instanceof l1) {
                n2 = ((l1<T>)n0).e(this.c);
            }
            this.b.c(b.b(), n2);
        }
        return this.b.b(b.b());
    }
    
    public b d() {
        return this.a;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final h h = (h)o;
        if (!this.a.equals(h.a)) {
            return false;
        }
        if (this.c != h.c) {
            b = false;
        }
        return b;
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode() * 31 + this.c.hashCode();
    }
}
