// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.codecs;

import org.bson.codecs.configuration.d;
import e7.a;
import org.bson.p1;
import org.bson.codecs.configuration.b;

public class c1 implements b
{
    private final d0 a;
    private final p1 b;
    
    public c1() {
        this(new d0());
    }
    
    public c1(final d0 d0) {
        this(d0, null);
    }
    
    public c1(final d0 d0, final p1 b) {
        this.a = e7.a.e("bsonTypeClassMap", d0);
        this.b = b;
    }
    
    public c1(final p1 p) {
        this(new d0(), p);
    }
    
    @Override
    public <T> n0<T> b(final Class<T> clazz, final d d) {
        if (Iterable.class.isAssignableFrom(clazz)) {
            return (n0<T>)new b1(d, this.a, this.b);
        }
        return null;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final c1 c1 = (c1)o;
        if (!this.a.equals(c1.a)) {
            return false;
        }
        final p1 b = this.b;
        final p1 b2 = c1.b;
        if (b != null) {
            if (b.equals(b2)) {
                return true;
            }
        }
        else if (b2 == null) {
            return true;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.a.hashCode();
        final p1 b = this.b;
        int hashCode2;
        if (b != null) {
            hashCode2 = b.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        return hashCode * 31 + hashCode2;
    }
}
